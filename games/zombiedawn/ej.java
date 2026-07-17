/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej {
    private int[][] field_B;
    private int field_z;
    private int field_g;
    private int[][] field_k;
    private int field_l;
    private int field_c;
    private boolean field_t;
    private int[][] field_D;
    int field_u;
    on field_A;
    private int[][] field_v;
    boolean[][] field_b;
    private int[][] field_E;
    static int field_s;
    private int field_y;
    int field_p;
    private kk[] field_i;
    private kk[] field_C;
    private int[][] field_h;
    private int[][] field_w;
    private int field_j;
    private int field_n;
    private boolean field_q;
    private int[] field_e;
    static int field_d;
    private int field_f;
    static int field_x;
    private int field_r;
    static vn field_a;
    private int[] field_m;
    static vn[] field_o;

    final int[][] a(int param0) {
        int var4 = 0;
        int var5 = ZombieDawn.field_J;
        int[][] var6 = new int[((ej) this).field_A.field_r][((ej) this).field_A.field_k];
        int[][] var2 = var6;
        int var3 = 0;
        if (param0 != 8728) {
            return null;
        }
        while (((ej) this).field_A.field_r > var3) {
            for (var4 = 0; var4 < ((ej) this).field_A.field_k; var4++) {
                var6[var3][var4] = !this.b(param0 + -8728, var4, var3) ? -1 : 0;
            }
            var3++;
        }
        return var2;
    }

    final boolean a(boolean param0, int param1, int param2, boolean param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        L0: {
          var5 = param2 / 24;
          var6 = param1 / 24;
          if (var5 < 0) {
            break L0;
          } else {
            if (var6 < 0) {
              break L0;
            } else {
              if (((ej) this).field_A.field_r <= var6) {
                break L0;
              } else {
                if (((ej) this).field_A.field_k <= var5) {
                  break L0;
                } else {
                  L1: {
                    var7 = param2 % 24;
                    if (!param0) {
                      break L1;
                    } else {
                      int discarded$2 = ((ej) this).c(126, 21, -100);
                      break L1;
                    }
                  }
                  L2: {
                    var8 = 1;
                    if (param3) {
                      L3: {
                        if (var7 <= 8) {
                          break L3;
                        } else {
                          var8 = (byte)(var8 | 4);
                          break L3;
                        }
                      }
                      if (var7 < 16) {
                        var8 = (byte)(var8 | 2);
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                  L4: {
                    var9 = (byte)(7 & ((ej) this).field_A.field_p[var6][var5]);
                    if ((var8 & var9) != var8) {
                      stackOut_17_0 = 0;
                      stackIn_18_0 = stackOut_17_0;
                      break L4;
                    } else {
                      stackOut_16_0 = 1;
                      stackIn_18_0 = stackOut_16_0;
                      break L4;
                    }
                  }
                  return stackIn_18_0 != 0;
                }
              }
            }
          }
        }
        return false;
    }

    public static void b(byte param0) {
        field_o = null;
        field_a = null;
    }

    private final void b(int param0) {
        ((ej) this).field_u = 24 * ((ej) this).field_A.field_k;
        ((ej) this).field_p = ((ej) this).field_A.field_r * 24;
    }

    final void a(wk param0, int param1, boolean param2, boolean param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        vn var12_ref_vn = null;
        vn var13 = null;
        int var13_int = 0;
        int var14 = 0;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_89_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        String stackOut_88_2 = null;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        String stackOut_87_2 = null;
        var14 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              var5_int = bd.field_d - param0.field_u;
              var6 = nh.field_G - param0.field_c;
              if (-24 > var5_int) {
                var5_int = var5_int % 24;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (var6 < -24) {
                var6 = var6 % 24;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                if (((ej) this).field_v.length < nh.field_I) {
                  break L4;
                } else {
                  if (bd.field_a > ((ej) this).field_v[0].length) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              ((ej) this).field_v = new int[nh.field_I][bd.field_a];
              break L3;
            }
            var7 = var5_int;
            if (param2) {
              var8 = 0;
              L5: while (true) {
                if (var8 >= nh.field_I) {
                  break L0;
                } else {
                  var9 = 0;
                  L6: while (true) {
                    if (~var9 <= ~bd.field_a) {
                      var5_int = var7;
                      var6 += 24;
                      var8++;
                      continue L5;
                    } else {
                      L7: {
                        if (~((ej) this).field_b[0].length >= ~(var9 + ((ej) this).field_f)) {
                          break L7;
                        } else {
                          if (~((ej) this).field_b.length >= ~(var8 - -((ej) this).field_j)) {
                            break L7;
                          } else {
                            L8: {
                              var10 = ((ej) this).field_v[var8][var9];
                              if (param1 == 1) {
                                if (!((ej) this).field_b[((ej) this).field_j + var8][var9 + ((ej) this).field_f]) {
                                  L9: {
                                    var11 = -1 + (var10 >> 7 & 511);
                                    var12 = -2 + tm.field_h.length;
                                    if (!ng.field_e) {
                                      break L9;
                                    } else {
                                      if (!bo.field_p[86]) {
                                        var12 += 3;
                                        break L9;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  if (var11 < 0) {
                                    break L8;
                                  } else {
                                    if (~var12 < ~var11) {
                                      var13 = tm.field_h[var11];
                                      if ((1073741824 & var10) > 0) {
                                        var13.c(var5_int, var6);
                                        break L8;
                                      } else {
                                        if ((536870912 & var10) <= 0) {
                                          var13.b(var5_int, var6);
                                          break L8;
                                        } else {
                                          var13.f(var5_int, var6);
                                          break L8;
                                        }
                                      }
                                    } else {
                                      break L8;
                                    }
                                  }
                                } else {
                                  var5_int += 24;
                                  break L7;
                                }
                              } else {
                                if (param1 != 2) {
                                  if (3 == param1) {
                                    L10: {
                                      if ((-2147483648 & var10) == 0) {
                                        break L10;
                                      } else {
                                        if (param3) {
                                          if ((var10 & 67108864) != 0) {
                                            bi.a(var5_int, var6, 24, 24, 65280, 128);
                                            break L10;
                                          } else {
                                            bi.a(var5_int, var6, 24, 24, 16711935, 128);
                                            break L10;
                                          }
                                        } else {
                                          if ((var10 & 67108864) == 0) {
                                            bi.a(var5_int, var6, 24, 24, 0, 128);
                                            break L10;
                                          } else {
                                            L11: {
                                              var11 = -1;
                                              var12 = var10 >> 7 & 511;
                                              var13_int = (var10 & 33488896) >> 16;
                                              if (var13_int < 9) {
                                                break L11;
                                              } else {
                                                if (var13_int <= 32) {
                                                  var11 = -9 + var13_int;
                                                  break L11;
                                                } else {
                                                  break L11;
                                                }
                                              }
                                            }
                                            L12: {
                                              if (var12 < 9) {
                                                break L12;
                                              } else {
                                                if (var12 <= 32) {
                                                  var11 = var12 + -9;
                                                  break L12;
                                                } else {
                                                  break L12;
                                                }
                                              }
                                            }
                                            L13: {
                                              if (var13_int == 29) {
                                                var11 = 9;
                                                break L13;
                                              } else {
                                                break L13;
                                              }
                                            }
                                            L14: {
                                              if (var11 < 0) {
                                                break L14;
                                              } else {
                                                if (~la.field_c.length >= ~var11) {
                                                  break L14;
                                                } else {
                                                  la.field_c[var11].e(var5_int, var6, 128);
                                                  break L10;
                                                }
                                              }
                                            }
                                            bi.a(var5_int, var6, 24, 24, 0, 128);
                                            la.field_c[21].e(var5_int, 24 + var6, 128);
                                            break L10;
                                          }
                                        }
                                      }
                                    }
                                    if (kc.field_Q) {
                                      bi.c(var5_int, var6, 25, 25, 7864183);
                                      break L8;
                                    } else {
                                      break L8;
                                    }
                                  } else {
                                    break L8;
                                  }
                                } else {
                                  if (((ej) this).field_b[((ej) this).field_j + var8][var9 + ((ej) this).field_f]) {
                                    var5_int += 24;
                                    break L7;
                                  } else {
                                    L15: {
                                      var11 = ((var10 & 33488896) >> 16) - 1;
                                      if (var11 < 0) {
                                        break L15;
                                      } else {
                                        if (~var11 <= ~tm.field_h.length) {
                                          break L15;
                                        } else {
                                          var12_ref_vn = tm.field_h[var11];
                                          var13 = var12_ref_vn;
                                          var13 = var12_ref_vn;
                                          if ((var10 & 268435456) <= 0) {
                                            if ((134217728 & var10) <= 0) {
                                              var12_ref_vn.b(var5_int, var6);
                                              break L15;
                                            } else {
                                              var12_ref_vn.f(var5_int, var6);
                                              break L15;
                                            }
                                          } else {
                                            var12_ref_vn.c(var5_int, var6);
                                            break L15;
                                          }
                                        }
                                      }
                                    }
                                    L16: {
                                      if (!dg.field_a) {
                                        break L16;
                                      } else {
                                        L17: {
                                          if (0 == (33554432 & var10)) {
                                            break L17;
                                          } else {
                                            bi.a(var5_int, var6, 24, 24, 16744448, 128);
                                            break L17;
                                          }
                                        }
                                        if (var11 < 0) {
                                          break L16;
                                        } else {
                                          if (var11 >= tm.field_h.length) {
                                            break L16;
                                          } else {
                                            L18: {
                                              var12 = ((ej) this).field_f + var9;
                                              var13_int = var8 + ((ej) this).field_j;
                                              if (this.b(0, var12, 1 + var13_int)) {
                                                break L18;
                                              } else {
                                                if (!this.b(0, var12, var13_int - -2)) {
                                                  break L16;
                                                } else {
                                                  break L18;
                                                }
                                              }
                                            }
                                            bi.c(var5_int, var6, 24, 24, 16711808);
                                            break L8;
                                          }
                                        }
                                      }
                                    }
                                    break L8;
                                  }
                                }
                              }
                            }
                            var5_int += 24;
                            break L7;
                          }
                        }
                      }
                      var9++;
                      continue L6;
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var5 = decompiledCaughtException;
            stackOut_86_0 = (RuntimeException) var5;
            stackOut_86_1 = new StringBuilder().append("ej.Q(");
            stackIn_88_0 = stackOut_86_0;
            stackIn_88_1 = stackOut_86_1;
            stackIn_87_0 = stackOut_86_0;
            stackIn_87_1 = stackOut_86_1;
            if (param0 == null) {
              stackOut_88_0 = (RuntimeException) (Object) stackIn_88_0;
              stackOut_88_1 = (StringBuilder) (Object) stackIn_88_1;
              stackOut_88_2 = "null";
              stackIn_89_0 = stackOut_88_0;
              stackIn_89_1 = stackOut_88_1;
              stackIn_89_2 = stackOut_88_2;
              break L19;
            } else {
              stackOut_87_0 = (RuntimeException) (Object) stackIn_87_0;
              stackOut_87_1 = (StringBuilder) (Object) stackIn_87_1;
              stackOut_87_2 = "{...}";
              stackIn_89_0 = stackOut_87_0;
              stackIn_89_1 = stackOut_87_1;
              stackIn_89_2 = stackOut_87_2;
              break L19;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_89_0, stackIn_89_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        jc var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        rc var6_ref_rc = null;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        am var27 = null;
        RuntimeException decompiledCaughtException = null;
        var26 = ZombieDawn.field_J;
        try {
          L0: {
            var27 = fj.field_g;
            if (param0 < -71) {
              L1: {
                var2 = var27.d((byte) -128);
                if (var2 == 0) {
                  var3 = var27.f(2);
                  var4 = (jc) (Object) on.field_g.b((byte) 26);
                  L2: while (true) {
                    L3: {
                      if (var4 == null) {
                        break L3;
                      } else {
                        if (var4.field_s != var3) {
                          var4 = (jc) (Object) on.field_g.a(false);
                          continue L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (var4 == null) {
                      p.a(1);
                      return;
                    } else {
                      L4: {
                        var5 = var27.d((byte) -122);
                        if (var5 != 0) {
                          var6 = var4.field_u;
                          cm.field_b[0].field_d = null;
                          cm.field_b[0].field_a = false;
                          cm.field_b[0].field_c = ce.field_r;
                          var7 = var4.field_o;
                          var8_int = 1;
                          L5: while (true) {
                            if (var5 <= var8_int) {
                              String[][] dupTemp$6 = new String[3][var6];
                              var4.field_m = dupTemp$6;
                              var8 = dupTemp$6;
                              var9 = new String[3][var6];
                              long[][] dupTemp$7 = new long[3][var6];
                              var4.field_i = dupTemp$7;
                              var10 = dupTemp$7;
                              int[][] dupTemp$8 = new int[3][var7 * var6];
                              var4.field_k = dupTemp$8;
                              var11 = dupTemp$8;
                              var12 = 0;
                              var13 = 0;
                              var14 = 0;
                              var15 = 0;
                              var16 = 0;
                              var17 = 0;
                              var18 = var27.d((byte) -120);
                              if (0 < var18) {
                                var19 = 0;
                                L6: while (true) {
                                  if (var18 <= var19) {
                                    break L4;
                                  } else {
                                    L7: {
                                      var20 = var27.d((byte) -127);
                                      var21 = cm.field_b[var20].field_c;
                                      var22 = var27.c(true);
                                      var24 = var27.field_j;
                                      if (var19 >= var6) {
                                        break L7;
                                      } else {
                                        var8[0][var12] = var21;
                                        var9[0][var12] = cm.field_b[var20].field_d;
                                        var10[0][var12] = var22;
                                        var12++;
                                        var25 = 0;
                                        L8: while (true) {
                                          if (var25 >= var7) {
                                            break L7;
                                          } else {
                                            int incrementValue$9 = var15;
                                            var15++;
                                            var11[0][incrementValue$9] = var27.c(126);
                                            var25++;
                                            continue L8;
                                          }
                                        }
                                      }
                                    }
                                    L9: {
                                      if (var21 == null) {
                                        break L9;
                                      } else {
                                        if (!l.a(89, var21)) {
                                          break L9;
                                        } else {
                                          var8[1][var13] = ce.field_r;
                                          var9[1][var13] = null;
                                          var10[1][var13] = var22;
                                          var27.field_j = var24;
                                          var13++;
                                          var25 = 0;
                                          L10: while (true) {
                                            if (var7 <= var25) {
                                              break L9;
                                            } else {
                                              int incrementValue$10 = var16;
                                              var16++;
                                              var11[1][incrementValue$10] = var27.c(-43);
                                              var25++;
                                              continue L10;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L11: {
                                      if (var6 <= var14) {
                                        break L11;
                                      } else {
                                        if (cm.field_b[var20].field_a) {
                                          break L11;
                                        } else {
                                          cm.field_b[var20].field_a = true;
                                          var8[2][var14] = var21;
                                          var9[2][var14] = cm.field_b[var20].field_d;
                                          var10[2][var14] = var22;
                                          var14++;
                                          var27.field_j = var24;
                                          var25 = 0;
                                          L12: while (true) {
                                            if (var25 >= var7) {
                                              break L11;
                                            } else {
                                              int incrementValue$11 = var17;
                                              var17++;
                                              var11[2][incrementValue$11] = var27.c(-89);
                                              var25++;
                                              continue L12;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var19++;
                                    continue L6;
                                  }
                                }
                              } else {
                                break L4;
                              }
                            } else {
                              L13: {
                                cm.field_b[var8_int].field_c = var27.a(true);
                                cm.field_b[var8_int].field_a = false;
                                if (1 != var27.d((byte) -128)) {
                                  cm.field_b[var8_int].field_d = null;
                                  break L13;
                                } else {
                                  cm.field_b[var8_int].field_d = var27.a(true);
                                  break L13;
                                }
                              }
                              var8_int++;
                              continue L5;
                            }
                          }
                        } else {
                          break L4;
                        }
                      }
                      var4.field_j = true;
                      var4.b(-27598);
                      break L1;
                    }
                  }
                } else {
                  if (1 != var2) {
                    ae.a((Throwable) null, 10331, "HS1: " + cb.f(3));
                    p.a(1);
                    break L1;
                  } else {
                    var3 = var27.f(2);
                    var4_long = var27.c(true);
                    var6_ref_rc = (rc) (Object) hk.field_F.b((byte) 26);
                    L14: while (true) {
                      L15: {
                        if (var6_ref_rc == null) {
                          break L15;
                        } else {
                          if (var3 == var6_ref_rc.field_i) {
                            break L15;
                          } else {
                            var6_ref_rc = (rc) (Object) hk.field_F.a(false);
                            continue L14;
                          }
                        }
                      }
                      if (var6_ref_rc != null) {
                        var6_ref_rc.field_s = var4_long;
                        var6_ref_rc.b(-27598);
                        break L1;
                      } else {
                        p.a(1);
                        return;
                      }
                    }
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var1, "ej.B(" + param0 + 41);
        }
    }

    private final void c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = ZombieDawn.field_J;
          ((ej) this).field_l = ((ej) this).field_l + 1;
          if (((ej) this).field_l != -4) {
            if (((ej) this).field_l == -3) {
              ((ej) this).field_E = new int[((ej) this).field_C.length][((ej) this).field_C.length];
              var2 = 1;
              L1: while (true) {
                if (((ej) this).field_C.length / 2 <= var2) {
                  break L0;
                } else {
                  var3 = 0;
                  L2: while (true) {
                    if (var2 <= var3) {
                      var2++;
                      continue L1;
                    } else {
                      int dupTemp$2 = this.a((byte) -128, ((ej) this).field_C[var2], ((ej) this).field_C[var3]);
                      ((ej) this).field_E[var2][var3] = dupTemp$2;
                      ((ej) this).field_E[var3][var2] = dupTemp$2;
                      var3++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              if (((ej) this).field_l != -2) {
                if (((ej) this).field_l != -1) {
                  var2 = ((ej) this).field_C.length;
                  var3 = ((ej) this).field_l * 3;
                  var4 = var3;
                  L3: while (true) {
                    if (var4 >= var3 - -3) {
                      break L0;
                    } else {
                      if (var2 <= var4) {
                        ((ej) this).field_t = false;
                        ((ej) this).field_h = ((ej) this).field_D;
                        ((ej) this).field_i = ((ej) this).field_C;
                        ((ej) this).field_w = ((ej) this).field_E;
                        ((ej) this).field_k = ((ej) this).field_B;
                        ((ej) this).field_e = new int[((ej) this).field_C.length];
                        ((ej) this).field_m = new int[((ej) this).field_C.length];
                        return;
                      } else {
                        var5 = 0;
                        L4: while (true) {
                          if (var5 >= var2) {
                            var4++;
                            continue L3;
                          } else {
                            var6 = 0;
                            L5: while (true) {
                              if (var2 <= var6) {
                                var5++;
                                continue L4;
                              } else {
                                L6: {
                                  var7 = ((ej) this).field_D[var5][var6];
                                  var8 = ((ej) this).field_D[var5][var4] - -((ej) this).field_D[var4][var6];
                                  if (var7 == -1) {
                                    break L6;
                                  } else {
                                    if (var7 > var8) {
                                      break L6;
                                    } else {
                                      var6++;
                                      continue L5;
                                    }
                                  }
                                }
                                if (0 <= ((ej) this).field_D[var5][var4]) {
                                  if (((ej) this).field_D[var4][var6] >= 0) {
                                    ((ej) this).field_D[var5][var6] = var8;
                                    ((ej) this).field_B[var5][var6] = ((ej) this).field_B[var5][var4];
                                    var6++;
                                    continue L5;
                                  } else {
                                    var6++;
                                    continue L5;
                                  }
                                } else {
                                  var6++;
                                  continue L5;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  var2 = ((ej) this).field_C.length;
                  ((ej) this).field_B = new int[var2][var2];
                  ((ej) this).field_D = new int[var2][var2];
                  var3 = 0;
                  L7: while (true) {
                    if (var2 <= var3) {
                      break L0;
                    } else {
                      var4 = 0;
                      L8: while (true) {
                        if (((ej) this).field_C.length <= var4) {
                          var3++;
                          continue L7;
                        } else {
                          var5 = ((ej) this).field_E[var3][var4];
                          ((ej) this).field_D[var3][var4] = var5;
                          ((ej) this).field_B[var3][var4] = var4;
                          var4++;
                          continue L8;
                        }
                      }
                    }
                  }
                }
              } else {
                var2 = ((ej) this).field_C.length / 2;
                L9: while (true) {
                  if (((ej) this).field_C.length <= var2) {
                    break L0;
                  } else {
                    var3 = 0;
                    L10: while (true) {
                      if (var2 <= var3) {
                        var2++;
                        continue L9;
                      } else {
                        int dupTemp$3 = this.a((byte) -128, ((ej) this).field_C[var2], ((ej) this).field_C[var3]);
                        ((ej) this).field_E[var2][var3] = dupTemp$3;
                        ((ej) this).field_E[var3][var2] = dupTemp$3;
                        var3++;
                        continue L10;
                      }
                    }
                  }
                }
              }
            }
          } else {
            ((ej) this).field_C = new kk[]{};
            var2 = 0;
            L11: while (true) {
              if (var2 >= ((ej) this).field_A.field_r) {
                break L0;
              } else {
                var3 = 0;
                L12: while (true) {
                  if (var3 >= ((ej) this).field_A.field_k) {
                    var2++;
                    continue L11;
                  } else {
                    L13: {
                      if (!this.b(0, var3, var2)) {
                        break L13;
                      } else {
                        if (!this.b(0, 1 + var3, var2)) {
                          break L13;
                        } else {
                          if (!this.b(0, var3, 1 + var2)) {
                            break L13;
                          } else {
                            if (this.b(0, 1 + var3, 1 + var2)) {
                              break L13;
                            } else {
                              ((ej) this).field_C = this.a(((ej) this).field_C, (byte) -97, new kk(24 * var3 - -1, 12 + var2 * 24));
                              break L13;
                            }
                          }
                        }
                      }
                    }
                    L14: {
                      if (!this.b(0, var3, var2)) {
                        break L14;
                      } else {
                        if (!this.b(0, var3 + 1, var2)) {
                          break L14;
                        } else {
                          if (this.b(0, var3, 1 + var2)) {
                            break L14;
                          } else {
                            if (!this.b(0, 1 + var3, 1 + var2)) {
                              break L14;
                            } else {
                              ((ej) this).field_C = this.a(((ej) this).field_C, (byte) -87, new kk((var3 + 2) * 24 + -1, 12 + 24 * var2));
                              break L14;
                            }
                          }
                        }
                      }
                    }
                    L15: {
                      if (!this.b(0, var3, var2)) {
                        break L15;
                      } else {
                        if (!this.b(0, 1 + var3, var2)) {
                          break L15;
                        } else {
                          if (!this.b(0, var3, var2 + -1)) {
                            break L15;
                          } else {
                            if (!this.b(0, var3 + 1, -1 + var2)) {
                              ((ej) this).field_C = this.a(((ej) this).field_C, (byte) -111, new kk(var3 * 24 - -1, (var2 + 1) * 24 - 12));
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                        }
                      }
                    }
                    if (this.b(0, var3, var2)) {
                      if (this.b(0, 1 + var3, var2)) {
                        if (!this.b(0, var3, var2 + -1)) {
                          if (this.b(0, 1 + var3, var2 - 1)) {
                            ((ej) this).field_C = this.a(((ej) this).field_C, (byte) -105, new kk(24 * var3 + 47, 12 + 24 * var2));
                            var3++;
                            continue L12;
                          } else {
                            var3++;
                            continue L12;
                          }
                        } else {
                          var3++;
                          continue L12;
                        }
                      } else {
                        var3++;
                        continue L12;
                      }
                    } else {
                      var3++;
                      continue L12;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final int a(int param0, int param1, int param2, byte param3, boolean param4, int param5) {
        int var17 = ZombieDawn.field_J;
        if (!(((ej) this).a(false, param0, param5, param4))) {
            return -1;
        }
        float var7 = 12.0f;
        int var8 = -param1 + param5;
        int var9 = param0 - param2;
        int var10 = so.b(var9 * var9 + var8 * var8);
        if (var10 == 0) {
            return 0;
        }
        float var11 = var7 / (float)var10;
        float var12 = var11 * (float)var8;
        float var13 = var11 * (float)var9;
        if (param3 > -90) {
            int discarded$0 = ((ej) this).a(80, -57, 113, (byte) -23, true, 59);
        }
        float var14 = (float)param1;
        float var15 = (float)param2;
        int var16 = var10;
        while (var7 < (float)var16) {
            var15 = var15 + var13;
            var14 = var14 + var12;
            if (!((ej) this).a(false, (int)var15, (int)var14, param4)) {
                return -1;
            }
            var16 = (int)((float)var16 - var7);
        }
        return var10;
    }

    final int c(int param0, int param1, int param2) {
        if (!(0 <= param2)) {
            return 0;
        }
        int var4 = -61 % ((param1 - 23) / 44);
        if (0 > param0) {
            return 0;
        }
        if (param0 >= ((ej) this).field_A.field_r) {
            return 0;
        }
        if (param2 >= ((ej) this).field_A.field_k) {
            return 0;
        }
        return ((ej) this).field_A.field_h[param0][param2];
    }

    final void a(boolean param0, int param1) {
        int var4 = ZombieDawn.field_J;
        int var3 = 46 % ((param1 - -45) / 52);
        if (((ej) this).field_t) {
            ((ej) this).field_q = true;
        } else {
            ((ej) this).field_t = true;
            ((ej) this).field_l = -5;
        }
        if (!param0) {
            while (((ej) this).field_t) {
                this.c((byte) -88);
            }
        }
    }

    private final kk[] a(kk[] param0, byte param1, kk param2) {
        kk[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        kk[] var7 = null;
        kk[] stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        kk[] stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              var7 = new kk[1 + param0.length];
              var4 = var7;
              if (param1 <= -86) {
                break L1;
              } else {
                ((ej) this).field_m = null;
                break L1;
              }
            }
            var5 = 0;
            L2: while (true) {
              if (param0.length <= var5) {
                var4[param0.length] = (kk) (Object) param0;
                stackOut_6_0 = (kk[]) var4;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var7[var5] = param0[var5];
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4_ref;
            stackOut_8_1 = new StringBuilder().append("ej.N(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_7_0;
    }

    final void a(boolean param0) {
        if (!(!((ej) this).field_t)) {
            this.c((byte) -88);
            if (!(((ej) this).field_t)) {
                dj.field_e.a(true);
                if (!(!((ej) this).field_q)) {
                    ((ej) this).field_q = false;
                    ((ej) this).a(true, 108);
                }
            }
        }
        if (param0) {
            qh discarded$0 = ((ej) this).a(true, -110, 79, -29, -111);
        }
    }

    private final void a(int param0, wk param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
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
        int var15_int = 0;
        le var15 = null;
        int var16 = 0;
        int var17 = 0;
        Object var18 = null;
        Object var19 = null;
        oo var20 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        var19 = null;
        var17 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              ((ej) this).field_r = 1;
              ((ej) this).field_n = 1;
              ((ej) this).field_g = 0;
              ((ej) this).field_z = 0;
              var3_int = bd.field_d - param1.field_u;
              var4 = -param1.field_c + nh.field_G;
              var5 = 0;
              var6 = 0;
              if (var4 < -24) {
                var6 = -(var4 / 24);
                var4 = var4 % 24;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (var3_int >= -24) {
                break L2;
              } else {
                var5 = -(var3_int / 24);
                var3_int = var3_int % 24;
                break L2;
              }
            }
            L3: {
              L4: {
                var7 = 0;
                if (((ej) this).field_v.length < nh.field_I) {
                  break L4;
                } else {
                  if (bd.field_a <= ((ej) this).field_v[0].length) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              ((ej) this).field_v = new int[nh.field_I][bd.field_a];
              break L3;
            }
            L5: {
              var8 = var5 + bd.field_a;
              if (((ej) this).field_A.field_k >= var8) {
                break L5;
              } else {
                var8 = ((ej) this).field_A.field_k;
                break L5;
              }
            }
            L6: {
              var9 = nh.field_I + var6;
              if (((ej) this).field_A.field_r >= var9) {
                break L6;
              } else {
                var9 = ((ej) this).field_A.field_r;
                break L6;
              }
            }
            L7: {
              var10 = var5;
              if (param0 == -19795) {
                break L7;
              } else {
                var18 = null;
                int discarded$1 = this.a((byte) 93, (kk) null, (kk) null);
                break L7;
              }
            }
            L8: {
              L9: {
                var11 = 0;
                ((ej) this).field_f = var5;
                var12 = 0;
                ((ej) this).field_j = var6;
                if (24 + bd.field_e != m.field_A.field_r) {
                  break L9;
                } else {
                  if (m.field_A.field_q != nh.field_P - -24) {
                    break L9;
                  } else {
                    if (0 <= ((ej) this).field_y) {
                      break L8;
                    } else {
                      gp.a(m.field_A.field_z, 0, m.field_A.field_z.length, 0);
                      break L8;
                    }
                  }
                }
              }
              m.field_A = null;
              m.field_A = new vn(24 + bd.field_e, nh.field_P - -24);
              ((ej) this).field_y = -1;
              break L8;
            }
            L10: {
              if (((ej) this).field_y >= 0) {
                L11: {
                  var13 = var5 + -((ej) this).field_y;
                  var14 = var6 - ((ej) this).field_c;
                  if (var13 != 0) {
                    break L11;
                  } else {
                    if (var14 != 0) {
                      break L11;
                    } else {
                      break L10;
                    }
                  }
                }
                ((ej) this).field_r = var5;
                ((ej) this).field_n = var6;
                var7 = 1;
                ((ej) this).field_g = var6 - -(m.field_A.field_t / 24);
                ((ej) this).field_z = var5 + m.field_A.field_w / 24;
                break L10;
              } else {
                var7 = 1;
                ((ej) this).field_n = var6;
                ((ej) this).field_z = m.field_A.field_w / 24 + var5;
                ((ej) this).field_r = var5;
                ((ej) this).field_g = m.field_A.field_t / 24 + var6;
                break L10;
              }
            }
            L12: {
              ((ej) this).field_y = var5;
              ((ej) this).field_c = var6;
              if (var7 != 0) {
                ki.a((byte) -121, m.field_A);
                var13 = 0;
                var14 = 0;
                L13: while (true) {
                  if (var9 <= var6) {
                    L14: {
                      param1.field_u = param1.field_u + var3_int;
                      param1.field_c = param1.field_c + var4;
                      if (6 != ((ej) this).field_A.field_a) {
                        break L14;
                      } else {
                        L15: {
                          if (((ej) this).field_n <= ((ej) this).field_g) {
                            break L15;
                          } else {
                            if (((ej) this).field_z >= ((ej) this).field_r) {
                              break L15;
                            } else {
                              break L14;
                            }
                          }
                        }
                        var15 = dj.field_e.field_R.b((byte) 26);
                        L16: while (true) {
                          if (var15 == null) {
                            break L14;
                          } else {
                            L17: {
                              if (!(var15 instanceof oo)) {
                                break L17;
                              } else {
                                var20 = (oo) (Object) var15;
                                var20.a(param1, (byte) 65);
                                break L17;
                              }
                            }
                            var15 = dj.field_e.field_R.a(false);
                            continue L16;
                          }
                        }
                      }
                    }
                    param1.field_c = param1.field_c - var4;
                    param1.field_u = param1.field_u - var3_int;
                    pa.a(-21189);
                    m.field_A.e(var3_int, var4);
                    break L12;
                  } else {
                    L18: while (true) {
                      if (var5 >= var8) {
                        var13 = 0;
                        var11 = 0;
                        var14 += 24;
                        var12++;
                        var5 = var10;
                        var6++;
                        continue L13;
                      } else {
                        L19: {
                          L20: {
                            var15_int = ((ej) this).c(var6, -39, var5);
                            if (ub.a(127, ((ej) this).field_A.field_f[var6][var5]) != null) {
                              break L20;
                            } else {
                              L21: {
                                if (((ej) this).field_r > var5) {
                                  break L21;
                                } else {
                                  if (((ej) this).field_z >= var5) {
                                    break L20;
                                  } else {
                                    break L21;
                                  }
                                }
                              }
                              if (((ej) this).field_n > var6) {
                                break L19;
                              } else {
                                if (((ej) this).field_g < var6) {
                                  break L19;
                                } else {
                                  break L20;
                                }
                              }
                            }
                          }
                          L22: {
                            var16 = 127 & var15_int;
                            if (var16 < 0) {
                              break L22;
                            } else {
                              if (var16 >= field_o.length) {
                                break L22;
                              } else {
                                field_o[var16].e(var13, var14);
                                break L19;
                              }
                            }
                          }
                          bi.b(var13, var14, 24, 24, 7631988);
                          break L19;
                        }
                        ((ej) this).field_v[var12][var11] = var15_int;
                        var13 += 24;
                        var11++;
                        var5++;
                        continue L18;
                      }
                    }
                  }
                }
              } else {
                m.field_A.e(var3_int, var4);
                break L12;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var3 = decompiledCaughtException;
            stackOut_56_0 = (RuntimeException) var3;
            stackOut_56_1 = new StringBuilder().append("ej.L(").append(param0).append(44);
            stackIn_58_0 = stackOut_56_0;
            stackIn_58_1 = stackOut_56_1;
            stackIn_57_0 = stackOut_56_0;
            stackIn_57_1 = stackOut_56_1;
            if (param1 == null) {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "null";
              stackIn_59_0 = stackOut_58_0;
              stackIn_59_1 = stackOut_58_1;
              stackIn_59_2 = stackOut_58_2;
              break L23;
            } else {
              stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "{...}";
              stackIn_59_0 = stackOut_57_0;
              stackIn_59_1 = stackOut_57_1;
              stackIn_59_2 = stackOut_57_2;
              break L23;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_59_0, stackIn_59_2 + 41);
        }
    }

    final qh a(boolean param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        kk var8 = null;
        kk var9 = null;
        qh var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int[] stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int[] stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int[] stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackIn_31_2 = 0;
        Object stackOut_14_0 = null;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int[] stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int[] stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        int stackOut_30_2 = 0;
        int[] stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int stackOut_29_2 = 0;
        L0: {
          var16 = ZombieDawn.field_J;
          var6 = param3 / 24;
          var7 = param2 / 24;
          if (!this.b(0, var6, var7)) {
            if (this.b(0, var6, -1 + var7)) {
              param2 -= 24;
              break L0;
            } else {
              if (!this.b(0, var6, 1 + var7)) {
                if (!this.b(0, var6, 2 + var7)) {
                  if (this.b(0, 1 + var6, var7)) {
                    param3 += 24;
                    break L0;
                  } else {
                    if (!this.b(0, -1 + var6, var7)) {
                      break L0;
                    } else {
                      param3 -= 24;
                      break L0;
                    }
                  }
                } else {
                  param2 += 48;
                  break L0;
                }
              } else {
                param2 += 24;
                break L0;
              }
            }
          } else {
            break L0;
          }
        }
        var6 = param3 / 24;
        var7 = param2 / 24;
        if (this.b(0, var6, var7)) {
          L1: {
            stackOut_14_0 = this;
            stackIn_16_0 = stackOut_14_0;
            stackIn_15_0 = stackOut_14_0;
            if (param0) {
              stackOut_16_0 = this;
              stackOut_16_1 = 0;
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              break L1;
            } else {
              stackOut_15_0 = this;
              stackOut_15_1 = 1;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              break L1;
            }
          }
          L2: {
            if (((ej) this).a(stackIn_17_1 != 0, param2, param3, param0)) {
              break L2;
            } else {
              if (this.b(0, var6 + -1, var7)) {
                if (!this.b(0, 1 + var6, var7)) {
                  param3 = var6 * 24;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                param3 = var6 * 24 + 23;
                break L2;
              }
            }
          }
          var8 = new kk(param1, param4);
          var9 = new kk(param3, param2);
          var10 = new qh();
          var10.a(0, (le) (Object) var9);
          var11 = this.a((byte) -128, var9, var8);
          var10.field_g = var11;
          if (0 <= var11) {
            return var10;
          } else {
            var12 = 0;
            L3: while (true) {
              if (~((ej) this).field_e.length >= ~var12) {
                var12 = 0;
                L4: while (true) {
                  if (((ej) this).field_e.length <= var12) {
                    var12 = -1;
                    var13 = -1;
                    var14 = 0;
                    L5: while (true) {
                      if (var14 >= ((ej) this).field_e.length) {
                        if (var13 != -1) {
                          var10.field_g = var13;
                          L6: while (true) {
                            if (var12 == -1) {
                              return var10;
                            } else {
                              if (~((ej) this).field_m[var12] != ~var12) {
                                var10.a((le) (Object) ((ej) this).field_i[var12].c(49), -112);
                                var12 = ((ej) this).field_m[var12];
                                continue L6;
                              } else {
                                return null;
                              }
                            }
                          }
                        } else {
                          return null;
                        }
                      } else {
                        L7: {
                          var15 = this.a((byte) -128, var9, ((ej) this).field_i[var14]);
                          if (var15 < 0) {
                            break L7;
                          } else {
                            if (((ej) this).field_e[var14] == -1) {
                              break L7;
                            } else {
                              L8: {
                                if (var13 == -1) {
                                  break L8;
                                } else {
                                  if (var13 <= var15 + ((ej) this).field_e[var14]) {
                                    break L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              var13 = var15 - -((ej) this).field_e[var14];
                              var12 = var14;
                              break L7;
                            }
                          }
                        }
                        var14++;
                        continue L5;
                      }
                    }
                  } else {
                    L9: {
                      if (((ej) this).field_e[var12] >= 0) {
                        var13 = 0;
                        L10: while (true) {
                          if (var13 >= ((ej) this).field_e.length) {
                            break L9;
                          } else {
                            L11: {
                              if (var13 != var12) {
                                if (-1 == ((ej) this).field_h[var12][var13]) {
                                  break L11;
                                } else {
                                  L12: {
                                    if (((ej) this).field_e[var13] == -1) {
                                      break L12;
                                    } else {
                                      if (~((ej) this).field_e[var13] < ~(((ej) this).field_h[var12][var13] + ((ej) this).field_e[var12])) {
                                        break L12;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  ((ej) this).field_e[var13] = ((ej) this).field_e[var12] - -((ej) this).field_h[var12][var13];
                                  ((ej) this).field_m[var13] = ((ej) this).field_k[var13][var12];
                                  break L11;
                                }
                              } else {
                                break L11;
                              }
                            }
                            var13++;
                            continue L10;
                          }
                        }
                      } else {
                        break L9;
                      }
                    }
                    var12++;
                    continue L4;
                  }
                }
              } else {
                L13: {
                  var13 = this.a((byte) -128, var8, ((ej) this).field_i[var12]);
                  ((ej) this).field_e[var12] = var13;
                  stackOut_28_0 = ((ej) this).field_m;
                  stackOut_28_1 = var12;
                  stackIn_30_0 = stackOut_28_0;
                  stackIn_30_1 = stackOut_28_1;
                  stackIn_29_0 = stackOut_28_0;
                  stackIn_29_1 = stackOut_28_1;
                  if (var13 < 0) {
                    stackOut_30_0 = (int[]) (Object) stackIn_30_0;
                    stackOut_30_1 = stackIn_30_1;
                    stackOut_30_2 = -2;
                    stackIn_31_0 = stackOut_30_0;
                    stackIn_31_1 = stackOut_30_1;
                    stackIn_31_2 = stackOut_30_2;
                    break L13;
                  } else {
                    stackOut_29_0 = (int[]) (Object) stackIn_29_0;
                    stackOut_29_1 = stackIn_29_1;
                    stackOut_29_2 = -1;
                    stackIn_31_0 = stackOut_29_0;
                    stackIn_31_1 = stackOut_29_1;
                    stackIn_31_2 = stackOut_29_2;
                    break L13;
                  }
                }
                stackIn_31_0[stackIn_31_1] = stackIn_31_2;
                var12++;
                continue L3;
              }
            }
          }
        } else {
          return null;
        }
    }

    private final boolean b(int param0, int param1, int param2) {
        if (param1 <= 0) {
            return false;
        }
        if (param2 <= param0) {
            return false;
        }
        if (param2 >= ((ej) this).field_A.field_r - 1) {
            return false;
        }
        if (param1 >= ((ej) this).field_A.field_k + -1) {
            return false;
        }
        return (1 & ((ej) this).field_A.field_p[param2][param1]) != 0 ? true : false;
    }

    private final int a(byte param0, kk param1, kk param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param0 == -128) {
              stackOut_3_0 = ((ej) this).a(param1.field_h, param2.field_h, param1.field_l, param2.field_l, 117);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = -108;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("ej.E(").append(param0).append(44);
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
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_4_0;
    }

    final boolean a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        boolean stackOut_4_0 = false;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        boolean stackOut_6_0 = false;
        boolean stackOut_12_0 = false;
        int stackOut_11_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        var4 = param0 / 24;
        var5 = param1 / 24;
        var6 = 4;
        if (this.b(0, var4, var5)) {
          L0: {
            var7 = param0 % 24;
            var8 = param1 % 24;
            if (var4 != 0) {
              stackOut_4_0 = this.b(0, -1 + var4, var5);
              stackIn_5_0 = stackOut_4_0 ? 1 : 0;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var9 = stackIn_5_0;
            if (((ej) this).field_A.field_k + -1 == var4) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            } else {
              stackOut_6_0 = this.b(0, var4 - -1, var5);
              stackIn_8_0 = stackOut_6_0 ? 1 : 0;
              break L1;
            }
          }
          L2: {
            var10 = stackIn_8_0;
            if (param2 > 8) {
              break L2;
            } else {
              int discarded$1 = ((ej) this).a(-111, -117, 12, 52, 71);
              break L2;
            }
          }
          L3: {
            if (var5 != -1 + ((ej) this).field_A.field_r) {
              stackOut_12_0 = this.b(0, var4, 1 + var5);
              stackIn_13_0 = stackOut_12_0 ? 1 : 0;
              break L3;
            } else {
              stackOut_11_0 = 0;
              stackIn_13_0 = stackOut_11_0;
              break L3;
            }
          }
          L4: {
            var11 = stackIn_13_0;
            if (var10 == 0) {
              break L4;
            } else {
              L5: {
                L6: {
                  stackOut_14_0 = var10;
                  stackIn_17_0 = stackOut_14_0;
                  stackIn_15_0 = stackOut_14_0;
                  if (var6 > var8) {
                    break L6;
                  } else {
                    stackOut_15_0 = stackIn_15_0;
                    stackIn_18_0 = stackOut_15_0;
                    stackIn_16_0 = stackOut_15_0;
                    if (!this.b(0, 1 + var4, var5 - -1)) {
                      stackOut_18_0 = stackIn_18_0;
                      stackOut_18_1 = 0;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      break L5;
                    } else {
                      stackOut_16_0 = stackIn_16_0;
                      stackIn_17_0 = stackOut_16_0;
                      break L6;
                    }
                  }
                }
                stackOut_17_0 = stackIn_17_0;
                stackOut_17_1 = 1;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                break L5;
              }
              var10 = stackIn_19_0 & stackIn_19_1;
              break L4;
            }
          }
          L7: {
            if (var9 == 0) {
              break L7;
            } else {
              L8: {
                L9: {
                  stackOut_21_0 = var9;
                  stackIn_24_0 = stackOut_21_0;
                  stackIn_22_0 = stackOut_21_0;
                  if (var6 > var8) {
                    break L9;
                  } else {
                    stackOut_22_0 = stackIn_22_0;
                    stackIn_25_0 = stackOut_22_0;
                    stackIn_23_0 = stackOut_22_0;
                    if (!this.b(0, -1 + var4, var5 - -1)) {
                      stackOut_25_0 = stackIn_25_0;
                      stackOut_25_1 = 0;
                      stackIn_26_0 = stackOut_25_0;
                      stackIn_26_1 = stackOut_25_1;
                      break L8;
                    } else {
                      stackOut_23_0 = stackIn_23_0;
                      stackIn_24_0 = stackOut_23_0;
                      break L9;
                    }
                  }
                }
                stackOut_24_0 = stackIn_24_0;
                stackOut_24_1 = 1;
                stackIn_26_0 = stackOut_24_0;
                stackIn_26_1 = stackOut_24_1;
                break L8;
              }
              var9 = stackIn_26_0 & stackIn_26_1;
              break L7;
            }
          }
          L10: {
            if (var9 != 0) {
              break L10;
            } else {
              if (var7 >= 6) {
                break L10;
              } else {
                return false;
              }
            }
          }
          L11: {
            if (var10 != 0) {
              break L11;
            } else {
              if (var7 <= 8) {
                break L11;
              } else {
                return false;
              }
            }
          }
          if (var11 != 0) {
            return true;
          } else {
            if (var6 < var8) {
              return false;
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    final void a(wk param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
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
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        var15 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              L2: {
                if (ng.field_e) {
                  break L2;
                } else {
                  if (!((ej) this).field_A.field_e) {
                    this.a(-19795, param0);
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                var3_int = -param0.field_u + bd.field_d;
                var4 = -param0.field_c + nh.field_G;
                var5 = 0;
                var6 = 0;
                if (var3_int >= -24) {
                  break L3;
                } else {
                  var5 = -(var3_int / 24);
                  var3_int = var3_int % 24;
                  break L3;
                }
              }
              L4: {
                if (var4 < -24) {
                  var6 = -(var4 / 24);
                  var4 = var4 % 24;
                  break L4;
                } else {
                  break L4;
                }
              }
              var7 = var5 + bd.field_a;
              var8 = var6 - -nh.field_I;
              var9 = var3_int;
              var10 = var5;
              var11 = 0;
              var12 = 0;
              var13 = 0;
              L5: while (true) {
                if (~var13 <= ~nh.field_I) {
                  ((ej) this).field_j = var6;
                  ((ej) this).field_f = var5;
                  L6: while (true) {
                    L7: {
                      if (~var8 >= ~var6) {
                        break L7;
                      } else {
                        if (~var6 <= ~((ej) this).field_A.field_r) {
                          break L7;
                        } else {
                          L8: while (true) {
                            L9: {
                              if (var7 <= var5) {
                                break L9;
                              } else {
                                if (~((ej) this).field_A.field_k >= ~var5) {
                                  break L9;
                                } else {
                                  L10: {
                                    L11: {
                                      var13 = ((ej) this).c(var6, 123, var5);
                                      var14 = var13 & 127;
                                      if (var14 < 0) {
                                        break L11;
                                      } else {
                                        if (~var14 > ~field_o.length) {
                                          field_o[var14].e(var3_int, var4);
                                          break L10;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    bi.b(var3_int, var4, 24, 24, 7631988);
                                    break L10;
                                  }
                                  ((ej) this).field_v[var12][var11] = var13;
                                  var3_int += 24;
                                  var11++;
                                  var5++;
                                  continue L8;
                                }
                              }
                            }
                            var11 = 0;
                            var3_int = var9;
                            var5 = var10;
                            var12++;
                            var4 += 24;
                            var6++;
                            continue L6;
                          }
                        }
                      }
                    }
                    break L1;
                  }
                } else {
                  var14 = 0;
                  L12: while (true) {
                    if (~var14 <= ~bd.field_a) {
                      var13++;
                      continue L5;
                    } else {
                      ((ej) this).field_v[var13][var14] = 0;
                      var14++;
                      continue L12;
                    }
                  }
                }
              }
            }
            if (!param1) {
              L13: {
                if (!ga.field_w) {
                  break L13;
                } else {
                  var3_int = param0.a(ha.field_b, false);
                  var4 = param0.b(ei.field_K, true);
                  var5 = 0;
                  L14: while (true) {
                    if (~((ej) this).field_i.length >= ~var5) {
                      var5 = 0;
                      L15: while (true) {
                        if (~var5 <= ~((ej) this).field_i.length) {
                          if (!((ej) this).field_t) {
                            break L13;
                          } else {
                            if (((ej) this).field_l <= 0) {
                              break L13;
                            } else {
                              var5 = 0;
                              L16: while (true) {
                                if (~var5 <= ~((ej) this).field_C.length) {
                                  var5 = 0;
                                  L17: while (true) {
                                    if (var5 >= ((ej) this).field_C.length) {
                                      break L13;
                                    } else {
                                      var6 = bd.field_d + (-param0.field_u + ((ej) this).field_C[var5].field_l);
                                      var7 = ((ej) this).field_C[var5].field_h + (-param0.field_c - -nh.field_G);
                                      bi.d(var6, var7, 2, 34952, 256);
                                      pc.field_k.a(Integer.toString(var5), var6, var7, 2285021, 0, 64);
                                      var5++;
                                      continue L17;
                                    }
                                  }
                                } else {
                                  var6 = param0.a(((ej) this).field_C[var5].field_l, (byte) -99);
                                  var7 = param0.a(((ej) this).field_C[var5].field_h, 0);
                                  var8 = 0;
                                  L18: while (true) {
                                    if (var8 >= ((ej) this).field_C.length) {
                                      var5++;
                                      continue L16;
                                    } else {
                                      L19: {
                                        var9 = param0.a(((ej) this).field_C[var8].field_l, (byte) -75);
                                        var10 = param0.a(((ej) this).field_C[var8].field_h, 0);
                                        if (((ej) this).field_E[var5][var8] > 0) {
                                          bi.d(var6, var7, var9, var10, 16711680, 48);
                                          break L19;
                                        } else {
                                          break L19;
                                        }
                                      }
                                      var8++;
                                      continue L18;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var6 = bd.field_d + -param0.field_u + ((ej) this).field_i[var5].field_l;
                          var7 = -param0.field_c + ((ej) this).field_i[var5].field_h + nh.field_G;
                          bi.d(var6, var7, 2, 16711680, 256);
                          pc.field_k.a(Integer.toString(var5), var6, var7, 16777215, 0, 64);
                          var5++;
                          continue L15;
                        }
                      }
                    } else {
                      var6 = param0.a(((ej) this).field_i[var5].field_l, (byte) -104);
                      var7 = param0.a(((ej) this).field_i[var5].field_h, 0);
                      var8 = 0;
                      L20: while (true) {
                        if (~((ej) this).field_i.length >= ~var8) {
                          L21: {
                            if (((ej) this).a(var4, ((ej) this).field_i[var5].field_h, var3_int, ((ej) this).field_i[var5].field_l, 112) != -1) {
                              var8 = param0.a(var3_int, (byte) -64);
                              var9 = param0.a(var4, 0);
                              bi.e(var6, var7, var8, var9, 16711680);
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                          var5++;
                          continue L14;
                        } else {
                          L22: {
                            var9 = param0.a(((ej) this).field_i[var8].field_l, (byte) -82);
                            var10 = param0.a(((ej) this).field_i[var8].field_h, 0);
                            if (((ej) this).field_w[var5][var8] <= 0) {
                              break L22;
                            } else {
                              bi.d(var6, var7, var9, var10, 65280, 48);
                              break L22;
                            }
                          }
                          var8++;
                          continue L20;
                        }
                      }
                    }
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var3 = decompiledCaughtException;
            stackOut_62_0 = (RuntimeException) var3;
            stackOut_62_1 = new StringBuilder().append("ej.M(");
            stackIn_64_0 = stackOut_62_0;
            stackIn_64_1 = stackOut_62_1;
            stackIn_63_0 = stackOut_62_0;
            stackIn_63_1 = stackOut_62_1;
            if (param0 == null) {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "null";
              stackIn_65_0 = stackOut_64_0;
              stackIn_65_1 = stackOut_64_1;
              stackIn_65_2 = stackOut_64_2;
              break L23;
            } else {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "{...}";
              stackIn_65_0 = stackOut_63_0;
              stackIn_65_1 = stackOut_63_1;
              stackIn_65_2 = stackOut_63_2;
              break L23;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_65_0, stackIn_65_2 + 44 + param1 + 41);
        }
    }

    final int a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 <= 102) {
            field_d = -128;
        }
        return ((ej) this).a(param0, param3, param1, (byte) -126, true, param2);
    }

    ej(on param0) {
        ((ej) this).field_v = new int[nh.field_I][bd.field_a];
        ((ej) this).field_c = -1;
        ((ej) this).field_y = -1;
        try {
            ((ej) this).field_A = param0;
            ((ej) this).a(false, 11);
            this.b(-1);
            ((ej) this).field_c = -1;
            ((ej) this).field_b = new boolean[((ej) this).field_A.field_r][((ej) this).field_A.field_k];
            ((ej) this).field_y = -1;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "ej.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
