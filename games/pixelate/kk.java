/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk {
    private int field_d;
    int field_u;
    private int field_z;
    private int field_A;
    private int field_h;
    private int field_r;
    private int field_j;
    private hd field_B;
    private int field_o;
    private int field_n;
    int field_t;
    private int field_e;
    private bb field_q;
    private int field_v;
    private int field_x;
    private int[] field_m;
    private tf field_c;
    private int field_i;
    private int field_g;
    private int field_p;
    private int field_w;
    static int field_s;
    static bd field_b;
    static String field_l;
    static int field_y;
    private int field_f;
    static int field_k;
    static int field_a;

    final static void a(int param0, pm param1) {
        int var2 = 0;
        int var3 = Pixelate.field_H ? 1 : 0;
        w.field_v = param1;
        io.a(qj.field_e, (byte) -108);
        jb.field_b = new bi[dn.field_a.length];
        if (param0 != 1) {
            return;
        }
        for (var2 = 0; var2 < dn.field_a.length; var2++) {
            jb.field_b[var2] = new bi(gh.field_w[var2], dn.field_a[var2], (var2 ^ -1) == -6 ? true : false);
        }
        ql.field_m = -1;
        lb.field_D = 15;
        pl.field_S = 0;
        of.field_d = -1;
        le.field_j = 45;
        tn.field_i = -1;
        sd.field_N = true;
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        tk var7 = null;
        var6 = Pixelate.field_H ? 1 : 0;
        var7 = (tk) (Object) ((kk) this).field_q.c(1504642273);
        L0: while (true) {
          if (var7 == null) {
            L1: {
              if (param0 < -18) {
                break L1;
              } else {
                ((kk) this).a(-66, 3, -15, (byte) 3, 14);
                break L1;
              }
            }
            var2 = 1;
            L2: while (true) {
              if (var2 >= -1 + ((kk) this).field_j) {
                L3: {
                  if ((((kk) this).field_z ^ -1) >= -1) {
                    break L3;
                  } else {
                    int fieldTemp$5 = ((kk) this).field_z;
                    ((kk) this).field_z = ((kk) this).field_z + 1;
                    if ((fieldTemp$5 ^ -1) >= -31) {
                      break L3;
                    } else {
                      ((kk) this).field_z = 0;
                      break L3;
                    }
                  }
                }
                L4: {
                  if (0 < ((kk) this).field_i) {
                    int fieldTemp$6 = ((kk) this).field_i;
                    ((kk) this).field_i = ((kk) this).field_i + 1;
                    if (((kk) this).field_n <= fieldTemp$6) {
                      ((kk) this).field_i = 0;
                      break L4;
                    } else {
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (((kk) this).field_i != 0) {
                    break L5;
                  } else {
                    if ((((kk) this).field_v ^ -1) >= -1) {
                      break L5;
                    } else {
                      if (((kk) this).field_r == 0) {
                        L6: {
                          if (((kk) this).field_v == 2) {
                            pp discarded$7 = mc.a(131, -125);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        int fieldTemp$8 = ((kk) this).field_v;
                        ((kk) this).field_v = ((kk) this).field_v + 1;
                        if (fieldTemp$8 >= ((kk) this).field_w) {
                          ((kk) this).field_v = 0;
                          break L5;
                        } else {
                          this.e(2);
                          break L5;
                        }
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                L7: {
                  if (-1 != ((kk) this).field_i) {
                    break L7;
                  } else {
                    if (0 < ((kk) this).field_r) {
                      int fieldTemp$9 = ((kk) this).field_r;
                      ((kk) this).field_r = ((kk) this).field_r + 1;
                      if (-31 < fieldTemp$9) {
                        ((kk) this).field_r = 0;
                        break L7;
                      } else {
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  }
                }
                return;
              } else {
                var3 = 1;
                L8: while (true) {
                  if (var3 >= -1 + ((kk) this).field_h) {
                    var2++;
                    continue L2;
                  } else {
                    var4 = var3 + var2 * ((kk) this).field_h;
                    var5 = ((kk) this).field_m[var4];
                    if (-1 > (var5 ^ -1)) {
                      if ((var5 ^ -1) > -49) {
                        ((kk) this).field_m[var4] = ((kk) this).field_m[var4] + 2;
                        var3++;
                        continue L8;
                      } else {
                        ((kk) this).field_m[var4] = 48;
                        var3++;
                        continue L8;
                      }
                    } else {
                      var3++;
                      continue L8;
                    }
                  }
                }
              }
            }
          } else {
            var7.e(-123);
            var7 = (tk) (Object) ((kk) this).field_q.f(1504642273);
            continue L0;
          }
        }
    }

    final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Pixelate.field_H ? 1 : 0;
        if (param0 == -16) {
          var2 = ((kk) this).field_B.field_h;
          L0: while (true) {
            if (var2 >= ((kk) this).field_B.field_h + 2) {
              return;
            } else {
              var3 = ((kk) this).field_B.field_e;
              L1: while (true) {
                if (var3 >= ((kk) this).field_B.field_e + 2) {
                  var2++;
                  continue L0;
                } else {
                  var4 = var3 + ((kk) this).field_h * var2;
                  ((kk) this).field_m[var4] = 1;
                  if ((((kk) this).field_B.field_r[var4] & 4) != 0) {
                    var5 = -1 + (3 & ((kk) this).field_B.field_r[var4]);
                    ((kk) this).field_q.a(22125, (fa) (Object) new tk(16 + (((kk) this).field_t - -(var3 * 32)), var2 * 32 + (((kk) this).field_u - -16), var5, 0));
                    var3++;
                    continue L1;
                  } else {
                    var3++;
                    continue L1;
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        ((kk) this).field_i = param0;
        ((kk) this).field_z = param2;
        if (param3 >= -59) {
            ((kk) this).field_j = -51;
        }
        ((kk) this).field_v = param1;
        ((kk) this).field_r = param4;
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var5 = Pixelate.field_H ? 1 : 0;
        var2 = 1;
        L0: while (true) {
          if (-1 + ((kk) this).field_j <= var2) {
            if (param0 > 41) {
              ((kk) this).field_c.c();
              t.d();
              this.a(-20, 0, 0);
              qa.field_f.a(19692);
              var2 = 1;
              L1: while (true) {
                if (-1 + ((kk) this).field_h <= var2) {
                  ((kk) this).field_i = 1;
                  ((kk) this).field_n = ((kk) this).field_h * 6;
                  ((kk) this).field_v = 1;
                  return;
                } else {
                  var6 = 1;
                  var3 = var6;
                  L2: while (true) {
                    if (((kk) this).field_j + -1 <= var6) {
                      var2++;
                      continue L1;
                    } else {
                      var4 = ((kk) this).field_B.field_r[((kk) this).field_h * var6 + var2];
                      if (0 != (4 & var4)) {
                        ((kk) this).field_q.a(22125, (fa) (Object) new tk(32 * var2 + (16 + ((kk) this).field_t), 32 * var6 + (16 + ((kk) this).field_u), -1 + (3 & var4), var2 * 6 + -6));
                        var6++;
                        continue L2;
                      } else {
                        var6++;
                        continue L2;
                      }
                    }
                  }
                }
              }
            } else {
              return;
            }
          } else {
            var3 = 1;
            L3: while (true) {
              if (var3 >= ((kk) this).field_h - 1) {
                var2++;
                continue L0;
              } else {
                ((kk) this).field_m[var3 + ((kk) this).field_h * var2] = 48;
                var3++;
                continue L3;
              }
            }
          }
        }
    }

    final boolean a(int param0) {
        if (param0 != 6) {
            field_y = 31;
        }
        return (((kk) this).field_i ^ -1) == -1 ? true : false;
    }

    final static ld a(fm param0, String param1, int param2, String param3, fm param4) {
        if (param2 != 0) {
            field_k = -40;
        }
        int var5 = param0.a(param2 + 123, param1);
        int var6 = param0.a((byte) -112, param3, var5);
        return lh.a(param0, var5, 48077700, param4, var6);
    }

    private final void a(int param0, int param1, int param2) {
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
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        var14 = Pixelate.field_H ? 1 : 0;
        var4 = 0;
        L0: while (true) {
          if (var4 >= ((kk) this).field_j) {
            L1: {
              if (param0 == -20) {
                break L1;
              } else {
                ((kk) this).a(true);
                break L1;
              }
            }
            return;
          } else {
            var5 = 0;
            L2: while (true) {
              if (((kk) this).field_h <= var5) {
                var4++;
                continue L0;
              } else {
                var6 = ((kk) this).field_B.field_r[var5 + var4 * ((kk) this).field_h];
                var7 = var6 & 3;
                if (-1 != var6) {
                  if (var7 != 0) {
                    L3: {
                      if (-1 != var5) {
                        if (-1 != var4) {
                          if (var5 != -1 + ((kk) this).field_h) {
                            if (var4 == ((kk) this).field_j + -1) {
                              stackOut_16_0 = 1;
                              stackIn_18_0 = stackOut_16_0;
                              break L3;
                            } else {
                              stackOut_15_0 = 0;
                              stackIn_18_0 = stackOut_15_0;
                              break L3;
                            }
                          } else {
                            stackOut_13_0 = 1;
                            stackIn_18_0 = stackOut_13_0;
                            break L3;
                          }
                        } else {
                          stackOut_11_0 = 1;
                          stackIn_18_0 = stackOut_11_0;
                          break L3;
                        }
                      } else {
                        stackOut_9_0 = 1;
                        stackIn_18_0 = stackOut_9_0;
                        break L3;
                      }
                    }
                    L4: {
                      var8 = stackIn_18_0;
                      if ((var6 & 4) == 0) {
                        stackOut_20_0 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        break L4;
                      } else {
                        stackOut_19_0 = 1;
                        stackIn_21_0 = stackOut_19_0;
                        break L4;
                      }
                    }
                    var9 = stackIn_21_0;
                    var10 = var5 * 32 + param2;
                    var11 = var4 * 32 + param1;
                    if (var7 != 0) {
                      L5: {
                        if (fq.field_o == null) {
                          stackOut_25_0 = 0;
                          stackIn_26_0 = stackOut_25_0;
                          break L5;
                        } else {
                          stackOut_24_0 = fo.field_t;
                          stackIn_26_0 = stackOut_24_0;
                          break L5;
                        }
                      }
                      L6: {
                        var12 = stackIn_26_0;
                        if (var12 == 0) {
                          rg.field_e.field_k[var7 + -1].f(var10, var11);
                          break L6;
                        } else {
                          if ((var12 ^ -1) != -257) {
                            rg.field_e.field_k[-1 + var7].f(var10, var11);
                            fq.field_o.field_k[var7 + -1].a(var10, var11, var12);
                            break L6;
                          } else {
                            fq.field_o.field_k[var7 + -1].f(var10, var11);
                            break L6;
                          }
                        }
                      }
                      if (var8 == 0) {
                        var13 = ((kk) this).field_m[var4 * ((kk) this).field_h - -var5];
                        if (var9 == 0) {
                          t.a(var10, var11, 32, 32, 0, 64 + var13);
                          var5++;
                          continue L2;
                        } else {
                          if ((var13 ^ -1) > -49) {
                            t.a(var10, var11, 32, 32, 0, -var13 + 48);
                            var5++;
                            continue L2;
                          } else {
                            var5++;
                            continue L2;
                          }
                        }
                      } else {
                        var5++;
                        continue L2;
                      }
                    } else {
                      var5++;
                      continue L2;
                    }
                  } else {
                    var5++;
                    continue L2;
                  }
                } else {
                  var5++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final boolean c(int param0) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 < -103) {
            break L0;
          } else {
            ((kk) this).field_u = -108;
            break L0;
          }
        }
        L1: {
          L2: {
            if (0 < ((kk) this).field_z) {
              break L2;
            } else {
              if (0 < ((kk) this).field_r) {
                break L2;
              } else {
                if ((((kk) this).field_v ^ -1) < -1) {
                  break L2;
                } else {
                  if ((((kk) this).field_i ^ -1) >= -1) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    public static void b(boolean param0) {
        if (!param0) {
            kk.b(true);
        }
        field_l = null;
        field_b = null;
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
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
        Object var16 = null;
        tk var17 = null;
        int stackIn_34_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_47_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        L0: {
          var16 = null;
          var15 = Pixelate.field_H ? 1 : 0;
          var2 = ((kk) this).field_t;
          var3 = ((kk) this).field_u;
          if (((kk) this).field_z <= 0) {
            if (-1 > (((kk) this).field_r ^ -1)) {
              var4 = ((kk) this).field_r;
              var4 = var4 * (var4 * 480) / 900;
              var3 = var3 - var4;
              break L0;
            } else {
              break L0;
            }
          } else {
            var4 = 30 + -((kk) this).field_z;
            var4 = var4 * (var4 * 480) / 900;
            var3 = var3 + var4;
            break L0;
          }
        }
        var4 = -((kk) this).field_f + ((kk) this).field_h;
        var5 = -((kk) this).field_e + ((kk) this).field_j;
        var6 = ((kk) this).field_p;
        L1: while (true) {
          if (var5 < var6) {
            var6 = ((kk) this).field_g;
            L2: while (true) {
              if (var4 < var6) {
                L3: {
                  if (((kk) this).c(-108)) {
                    L4: {
                      t.a(f.field_d);
                      if (-1 != ((kk) this).field_i) {
                        break L4;
                      } else {
                        if (-1 < ((kk) this).field_v) {
                          t.f(-4 + (((kk) this).field_A + ((kk) this).field_t), ((kk) this).field_u - -((kk) this).field_x - 4, 640, 480);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    ((kk) this).field_c.b(var2, var3);
                    t.b(f.field_d);
                    break L3;
                  } else {
                    this.a(-20, var3, var2);
                    break L3;
                  }
                }
                var6 = 0;
                L5: while (true) {
                  if (var6 >= ((kk) this).field_j) {
                    L6: {
                      if (!param0) {
                        break L6;
                      } else {
                        ((kk) this).field_h = 38;
                        break L6;
                      }
                    }
                    var17 = (tk) (Object) ((kk) this).field_q.c(1504642273);
                    L7: while (true) {
                      if (var17 == null) {
                        L8: {
                          if (0 >= ((kk) this).field_v) {
                            break L8;
                          } else {
                            if (-1 != (((kk) this).field_i ^ -1)) {
                              break L8;
                            } else {
                              if (0 == ((kk) this).field_r) {
                                t.a(f.field_d);
                                t.f(var2 + ((kk) this).field_g * 32, ((kk) this).field_p * 32 + var3, (((kk) this).field_h - ((kk) this).field_f) * 32 + var2, var3 + 32 * (-((kk) this).field_e + ((kk) this).field_j));
                                var6 = 0;
                                L9: while (true) {
                                  if (20 <= var6) {
                                    t.b(f.field_d);
                                    break L8;
                                  } else {
                                    fi.a(((kk) this).field_g * 32 + (((kk) this).field_t - (-((kk) this).field_A + -(var6 * 2) + 40)), -20 + var3, ((kk) this).field_A + 32 * ((kk) this).field_g + ((kk) this).field_t + -(2 * (-var6 + 20)), ((kk) this).field_j * 32 + var3 - -20, 4, var6 * 3, sd.field_Q);
                                    fi.a(var2 - 20, -(2 * (-var6 + 20)) + ((kk) this).field_x + (((kk) this).field_u - -(((kk) this).field_p * 32)), ((kk) this).field_h * 32 + (var2 + 20), var6 * 2 - 40 + (((kk) this).field_p * 32 + ((kk) this).field_u) - -((kk) this).field_x, 4, 3 * var6, sd.field_Q);
                                    var6 += 3;
                                    continue L9;
                                  }
                                }
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                        return;
                      } else {
                        var17.a((byte) -127);
                        var17 = (tk) (Object) ((kk) this).field_q.f(1504642273);
                        continue L7;
                      }
                    }
                  } else {
                    var7 = 0;
                    L10: while (true) {
                      if (var7 >= ((kk) this).field_h) {
                        var6++;
                        continue L5;
                      } else {
                        var8 = ((kk) this).field_B.field_r[((kk) this).field_h * var6 + var7];
                        if (var8 != -1) {
                          L11: {
                            if (var7 != -1) {
                              if (-1 != var6) {
                                if (-1 + ((kk) this).field_h != var7) {
                                  if (-1 + ((kk) this).field_j == var6) {
                                    stackOut_32_0 = 1;
                                    stackIn_34_0 = stackOut_32_0;
                                    break L11;
                                  } else {
                                    stackOut_31_0 = 0;
                                    stackIn_34_0 = stackOut_31_0;
                                    break L11;
                                  }
                                } else {
                                  stackOut_29_0 = 1;
                                  stackIn_34_0 = stackOut_29_0;
                                  break L11;
                                }
                              } else {
                                stackOut_27_0 = 1;
                                stackIn_34_0 = stackOut_27_0;
                                break L11;
                              }
                            } else {
                              stackOut_25_0 = 1;
                              stackIn_34_0 = stackOut_25_0;
                              break L11;
                            }
                          }
                          L12: {
                            var9 = stackIn_34_0;
                            if ((3 & var8) == 0) {
                              if (jc.field_d) {
                                stackOut_38_0 = 1;
                                stackIn_40_0 = stackOut_38_0;
                                break L12;
                              } else {
                                stackOut_37_0 = 0;
                                stackIn_40_0 = stackOut_37_0;
                                break L12;
                              }
                            } else {
                              stackOut_35_0 = 0;
                              stackIn_40_0 = stackOut_35_0;
                              break L12;
                            }
                          }
                          L13: {
                            var10 = stackIn_40_0;
                            var11 = var7 * 32 + var2;
                            var12 = var3 + var6 * 32;
                            var13 = 33;
                            if (var9 == 0) {
                              if (var10 == 0) {
                                break L13;
                              } else {
                                fi.a(var11, var12, var13, var13, 16777215, 40);
                                break L13;
                              }
                            } else {
                              t.a(var11, var12, var13, var13, 0, 192);
                              break L13;
                            }
                          }
                          L14: {
                            if (var9 != 0) {
                              stackOut_46_0 = 16777215;
                              stackIn_47_0 = stackOut_46_0;
                              break L14;
                            } else {
                              stackOut_45_0 = 11184810;
                              stackIn_47_0 = stackOut_45_0;
                              break L14;
                            }
                          }
                          var14 = stackIn_47_0;
                          t.e(var11 - -1, var12 + 1, -1 + var13, var14, 100);
                          t.f(var11 - -1, 2 + var12, -2 + var13, var14, 100);
                          t.a(var11, var12, var13, var13, 0);
                          var7++;
                          continue L10;
                        } else {
                          var7++;
                          continue L10;
                        }
                      }
                    }
                  }
                }
              } else {
                t.h(var2 + 32 * var6, ((kk) this).field_p * 32 + -16 + var3, var2 - -(var6 * 32), 32 * var5 + var3 - -16, 0, 100);
                var6++;
                continue L2;
              }
            }
          } else {
            t.h(32 * ((kk) this).field_g + var2 - 16, var3 + 32 * var6, 16 + (var4 * 32 + var2), var3 + var6 * 32, 0, 100);
            var6++;
            continue L1;
          }
        }
    }

    final static void a(byte param0, boolean param1) {
        if (param0 != -61) {
            field_y = -99;
        }
        l.b(19854, param1);
        jk.a(param1, (byte) 83);
    }

    final void a(byte param0) {
        ((kk) this).field_v = 0;
        if (param0 != 71) {
            return;
        }
        ((kk) this).field_r = 1;
    }

    private final void e(int param0) {
        ((kk) this).field_A = -4 - -(((kk) this).field_d * ((kk) this).field_v / ((kk) this).field_w);
        ((kk) this).field_x = ((kk) this).field_o * ((kk) this).field_v / ((kk) this).field_w + -4;
        if (param0 != 2) {
            ((kk) this).a((byte) 112);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = Pixelate.field_H ? 1 : 0;
        t.b(param0, param2, param3 + 1, 10000536);
        t.b(param0, param1 + param2, 1 + param3, 12105912);
        int var5 = 1;
        if (!(param2 + var5 >= t.field_f)) {
            var5 = t.field_f + -param2;
        }
        int var6 = param1;
        if (param4 != -51) {
            field_s = -43;
        }
        if (t.field_a < param2 - -var6) {
            var6 = t.field_a + -param2;
        }
        for (var7 = var5; var7 < var6; var7++) {
            var8 = 152 + var7 * 48 / param1;
            var9 = var8 | (var8 << -1040429304 | var8 << 197771184);
            t.field_k[t.field_j * (param2 + var7) + param0] = var9;
            t.field_k[param0 + (param2 + var7) * t.field_j + param3] = var9;
        }
    }

    kk(hd param0, int param1, int param2) {
        int var4 = 0;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_9_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_12_0 = null;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        L0: {
          ((kk) this).field_r = 0;
          ((kk) this).field_v = 0;
          ((kk) this).field_i = 0;
          ((kk) this).field_B = param0;
          ((kk) this).field_m = new int[((kk) this).field_B.field_r.length];
          ((kk) this).field_t = -(32 * ((kk) this).field_B.field_i >> 1013697409) + param1;
          ((kk) this).field_u = param2 - (((kk) this).field_B.field_a * 32 >> -1796777183);
          ((kk) this).field_j = ((kk) this).field_B.field_a;
          ((kk) this).field_h = ((kk) this).field_B.field_i;
          ((kk) this).field_q = new bb();
          ((kk) this).field_c = new tf(((kk) this).field_h * 32, 32 * ((kk) this).field_j);
          ((kk) this).field_z = 1;
          var4 = ((kk) this).field_B.b((byte) -60);
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if ((2 & var4) == 0) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ((kk) this).field_g = stackIn_3_1;
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (0 != (var4 & 4)) {
            stackOut_5_0 = this;
            stackOut_5_1 = 1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = 0;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          ((kk) this).field_p = stackIn_6_1;
          stackOut_6_0 = this;
          stackIn_8_0 = stackOut_6_0;
          stackIn_7_0 = stackOut_6_0;
          if (-1 == (var4 & 16 ^ -1)) {
            stackOut_8_0 = this;
            stackOut_8_1 = 0;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            break L2;
          } else {
            stackOut_7_0 = this;
            stackOut_7_1 = 1;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            break L2;
          }
        }
        L3: {
          ((kk) this).field_e = stackIn_9_1;
          stackOut_9_0 = this;
          stackIn_11_0 = stackOut_9_0;
          stackIn_10_0 = stackOut_9_0;
          if ((var4 & 8) != 0) {
            stackOut_11_0 = this;
            stackOut_11_1 = 1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            break L3;
          } else {
            stackOut_10_0 = this;
            stackOut_10_1 = 0;
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            break L3;
          }
        }
        L4: {
          ((kk) this).field_f = stackIn_12_1;
          ((kk) this).field_t = ((kk) this).field_t + 16 * (-((kk) this).field_g + ((kk) this).field_f);
          ((kk) this).field_o = 44 + 32 * (((kk) this).field_j - ((kk) this).field_p + -((kk) this).field_e);
          ((kk) this).field_d = 4 + (40 + (((kk) this).field_h + -((kk) this).field_g - ((kk) this).field_f) * 32);
          ((kk) this).field_u = ((kk) this).field_u + (-((kk) this).field_p + ((kk) this).field_e) * 16;
          stackOut_12_0 = this;
          stackIn_14_0 = stackOut_12_0;
          stackIn_13_0 = stackOut_12_0;
          if (((kk) this).field_d <= ((kk) this).field_o) {
            stackOut_14_0 = this;
            stackOut_14_1 = ((kk) this).field_o;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            break L4;
          } else {
            stackOut_13_0 = this;
            stackOut_13_1 = ((kk) this).field_d;
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            break L4;
          }
        }
        ((kk) this).field_w = stackIn_15_1 / 6;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new bd();
        field_l = "achievements to collect";
        field_y = 2;
        field_k = 0;
    }
}
