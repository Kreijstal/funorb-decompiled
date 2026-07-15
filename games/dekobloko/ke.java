/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ke {
    boolean field_j;
    static int field_d;
    int field_o;
    private int field_k;
    static String field_n;
    boolean field_p;
    sk field_b;
    int field_c;
    int field_i;
    boolean field_g;
    private int field_t;
    private cl field_a;
    int field_y;
    ec[] field_f;
    boolean field_r;
    boolean field_s;
    private int field_u;
    int field_l;
    int field_m;
    int field_q;
    int[] field_v;
    static int[] field_h;
    private kc field_e;
    private int field_x;
    int field_w;
    int field_z;

    final static void e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        kc var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        kn var6_ref_kn = null;
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
        uf var27 = null;
        kn var28 = null;
        kc var29 = null;
        uf var30 = null;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        byte stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        L0: {
          var26 = client.field_A ? 1 : 0;
          if (param0 == 48) {
            break L0;
          } else {
            field_d = 90;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              var27 = de.field_V;
              var30 = var27;
              var2 = var30.d((byte) -106);
              if ((var2 ^ -1) == -1) {
                break L3;
              } else {
                L4: {
                  if (var2 == 1) {
                    break L4;
                  } else {
                    qb.a((Throwable) null, 16408, "HS1: " + qk.d((byte) 30));
                    si.a(122);
                    if (var26 == 0) {
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                }
                var3 = var30.e(3);
                var4_long = var30.f((byte) -108);
                kn dupTemp$8 = (kn) (Object) pb.field_c.c((byte) 114);
                var28 = dupTemp$8;
                var6_ref_kn = dupTemp$8;
                L5: while (true) {
                  L6: {
                    L7: {
                      if (var28 == null) {
                        break L7;
                      } else {
                        stackOut_8_0 = var28.field_u ^ -1;
                        stackIn_15_0 = stackOut_8_0;
                        stackIn_9_0 = stackOut_8_0;
                        if (var26 != 0) {
                          break L6;
                        } else {
                          L8: {
                            if (stackIn_9_0 != (var3 ^ -1)) {
                              break L8;
                            } else {
                              if (var26 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          var6_ref_kn = (kn) (Object) pb.field_c.d(true);
                          if (var26 == 0) {
                            continue L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    if (var6_ref_kn != null) {
                      var6_ref_kn.field_o = var4_long;
                      var6_ref_kn.b((byte) 101);
                      if (var26 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    } else {
                      stackOut_14_0 = 103;
                      stackIn_15_0 = stackOut_14_0;
                      break L6;
                    }
                  }
                  si.a(stackIn_15_0);
                  return;
                }
              }
            }
            var3 = var30.e(param0 + -45);
            kc dupTemp$9 = (kc) (Object) dg.field_e.c((byte) -104);
            var29 = dupTemp$9;
            var4 = dupTemp$9;
            L9: while (true) {
              L10: {
                L11: {
                  if (var29 == null) {
                    break L11;
                  } else {
                    stackOut_19_0 = var29.field_n ^ -1;
                    stackOut_19_1 = var3 ^ -1;
                    stackIn_26_0 = stackOut_19_0;
                    stackIn_26_1 = stackOut_19_1;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    if (var26 != 0) {
                      break L10;
                    } else {
                      L12: {
                        if (stackIn_20_0 != stackIn_20_1) {
                          break L12;
                        } else {
                          if (var26 == 0) {
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      var4 = (kc) (Object) dg.field_e.d(true);
                      if (var26 == 0) {
                        continue L9;
                      } else {
                        break L11;
                      }
                    }
                  }
                }
                if (var4 != null) {
                  L13: {
                    L14: {
                      var5 = var30.d((byte) -19);
                      if ((var5 ^ -1) != -1) {
                        var6 = var4.field_o;
                        rc.field_c[0].field_c = false;
                        rc.field_c[0].field_i = oa.field_f;
                        var7 = var4.field_v;
                        rc.field_c[0].field_f = null;
                        var8_int = 1;
                        L15: while (true) {
                          L16: {
                            if (var8_int >= var5) {
                              break L16;
                            } else {
                              rc.field_c[var8_int].field_i = var27.c((byte) -38);
                              rc.field_c[var8_int].field_c = false;
                              if (var26 != 0) {
                                break L13;
                              } else {
                                L17: {
                                  L18: {
                                    if ((var30.d((byte) -48) ^ -1) != -2) {
                                      break L18;
                                    } else {
                                      rc.field_c[var8_int].field_f = var30.c((byte) -38);
                                      if (var26 == 0) {
                                        break L17;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                  rc.field_c[var8_int].field_f = null;
                                  break L17;
                                }
                                var8_int++;
                                if (var26 == 0) {
                                  continue L15;
                                } else {
                                  break L16;
                                }
                              }
                            }
                          }
                          String[][] dupTemp$10 = new String[3][var6];
                          var4.field_r = dupTemp$10;
                          var8 = dupTemp$10;
                          var9 = new String[3][var6];
                          long[][] dupTemp$11 = new long[3][var6];
                          var4.field_t = dupTemp$11;
                          var10 = dupTemp$11;
                          int[][] dupTemp$12 = new int[3][var6 * var7];
                          var4.field_u = dupTemp$12;
                          var11 = dupTemp$12;
                          var12 = 0;
                          var13 = 0;
                          var14 = 0;
                          var15 = 0;
                          var16 = 0;
                          var17 = 0;
                          var18 = var30.d((byte) -68);
                          if (0 < var18) {
                            var19 = 0;
                            L19: while (true) {
                              if (var19 >= var18) {
                                break L14;
                              } else {
                                var20 = var27.d((byte) -21);
                                var21 = rc.field_c[var20].field_i;
                                var22 = var30.f((byte) -108);
                                var24 = var30.field_n;
                                if (var26 != 0) {
                                  break L13;
                                } else {
                                  L20: {
                                    if (var6 > var19) {
                                      var8[0][var12] = var21;
                                      var9[0][var12] = rc.field_c[var20].field_f;
                                      var10[0][var12] = var22;
                                      var25 = 0;
                                      L21: while (true) {
                                        L22: {
                                          if (var7 <= var25) {
                                            break L22;
                                          } else {
                                            int incrementValue$13 = var15;
                                            var15++;
                                            var11[0][incrementValue$13] = var27.i(qm.b((int) param0, 7601));
                                            var25++;
                                            if (var26 != 0) {
                                              break L20;
                                            } else {
                                              if (var26 == 0) {
                                                continue L21;
                                              } else {
                                                break L22;
                                              }
                                            }
                                          }
                                        }
                                        var12++;
                                        break L20;
                                      }
                                    } else {
                                      break L20;
                                    }
                                  }
                                  L23: {
                                    L24: {
                                      if (var21 == null) {
                                        break L24;
                                      } else {
                                        if (k.a(var21, true)) {
                                          var8[1][var13] = oa.field_f;
                                          var9[1][var13] = null;
                                          var10[1][var13] = var22;
                                          var13++;
                                          var30.field_n = var24;
                                          var25 = 0;
                                          L25: while (true) {
                                            if ((var25 ^ -1) <= (var7 ^ -1)) {
                                              break L24;
                                            } else {
                                              int incrementValue$14 = var16;
                                              var16++;
                                              var11[1][incrementValue$14] = var27.i(7553);
                                              var25++;
                                              if (var26 != 0) {
                                                break L23;
                                              } else {
                                                if (var26 == 0) {
                                                  continue L25;
                                                } else {
                                                  break L24;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          break L24;
                                        }
                                      }
                                    }
                                    L26: {
                                      if (var14 >= var6) {
                                        break L26;
                                      } else {
                                        if (!rc.field_c[var20].field_c) {
                                          rc.field_c[var20].field_c = true;
                                          var8[2][var14] = var21;
                                          var9[2][var14] = rc.field_c[var20].field_f;
                                          var10[2][var14] = var22;
                                          var14++;
                                          var30.field_n = var24;
                                          var25 = 0;
                                          L27: while (true) {
                                            if ((var7 ^ -1) >= (var25 ^ -1)) {
                                              break L26;
                                            } else {
                                              int incrementValue$15 = var17;
                                              var17++;
                                              var11[2][incrementValue$15] = var27.i(7553);
                                              var25++;
                                              if (var26 != 0) {
                                                break L23;
                                              } else {
                                                if (var26 == 0) {
                                                  continue L27;
                                                } else {
                                                  break L26;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          break L26;
                                        }
                                      }
                                    }
                                    var19++;
                                    break L23;
                                  }
                                  if (var26 == 0) {
                                    continue L19;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                            }
                          } else {
                            var4.field_p = true;
                            var4.b((byte) 107);
                            break L1;
                          }
                        }
                      } else {
                        break L14;
                      }
                    }
                    var4.field_p = true;
                    break L13;
                  }
                  var4.b((byte) 107);
                  break L2;
                } else {
                  stackOut_25_0 = param0;
                  stackOut_25_1 = 121;
                  stackIn_26_0 = stackOut_25_0;
                  stackIn_26_1 = stackOut_25_1;
                  break L10;
                }
              }
              si.a(stackIn_26_0 ^ stackIn_26_1);
              return;
            }
          }
          break L1;
        }
    }

    final void g(int param0) {
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        L0: {
          var3 = client.field_A ? 1 : 0;
          if (20 != ((ke) this).field_o) {
            break L0;
          } else {
            h.a(-109);
            break L0;
          }
        }
        h.a((ke) this, (byte) 95);
        L1: while (true) {
          L2: {
            L3: {
              if (!ab.c((byte) -128)) {
                break L3;
              } else {
                ((ke) this).field_b.d(0);
                stackOut_4_0 = -14;
                stackOut_4_1 = wh.field_c ^ -1;
                stackIn_25_0 = stackOut_4_0;
                stackIn_25_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (var3 != 0) {
                  break L2;
                } else {
                  if (stackIn_5_0 == stackIn_5_1) {
                    nm.f(115);
                    nk.field_k = false;
                    kf.field_G.c(param0 + -2825, false);
                    return;
                  } else {
                    L4: {
                      L5: {
                        if (96 == wh.field_c) {
                          break L5;
                        } else {
                          if (wh.field_c == 98) {
                            break L5;
                          } else {
                            break L4;
                          }
                        }
                      }
                      if (0 < ((ke) this).field_t) {
                        this.m(param0 ^ -8255);
                        ((ke) this).field_b.a(1, (byte) -90);
                        ((ke) this).field_b.field_o = false;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L6: {
                      L7: {
                        if (-98 == (wh.field_c ^ -1)) {
                          break L7;
                        } else {
                          if (wh.field_c != 99) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      if (3 > ((ke) this).field_t) {
                        this.n(87);
                        ((ke) this).field_b.a(1, (byte) -66);
                        ((ke) this).field_b.field_o = false;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    if (this.a(false, (byte) -33)) {
                      return;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
            }
            ((ke) this).field_b.a(this.a(param0 ^ 2712, bh.field_g, pm.field_f), -20563, this.a(400, he.field_S, nf.field_h));
            stackOut_24_0 = param0;
            stackOut_24_1 = 2824;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            break L2;
          }
          L8: {
            if (stackIn_25_0 == stackIn_25_1) {
              break L8;
            } else {
              ((ke) this).field_m = 44;
              break L8;
            }
          }
          boolean discarded$1 = this.a(true, (byte) -33);
          return;
        }
    }

    final void f(byte param0) {
        int var2 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_29_0 = 0;
        int stackOut_2_0 = 0;
        boolean stackOut_28_0 = false;
        var4 = client.field_A ? 1 : 0;
        h.a((ke) this, (byte) 95);
        var2 = 74 / ((71 - param0) / 39);
        L0: while (true) {
          L1: {
            L2: {
              if (!ab.c((byte) -119)) {
                break L2;
              } else {
                stackOut_2_0 = wh.field_c ^ -1;
                stackIn_29_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var4 != 0) {
                  break L1;
                } else {
                  if (stackIn_3_0 != -14) {
                    L3: {
                      L4: {
                        if (ph.n(-30146)) {
                          break L4;
                        } else {
                          L5: {
                            ((ke) this).field_b.d(0);
                            if (wh.field_c != 96) {
                              break L5;
                            } else {
                              fc.field_e = (3 + fc.field_e + -1) % 3;
                              ((ke) this).field_b.a(fc.field_e, (byte) -79);
                              nm.f(124);
                              ((ke) this).field_b.field_o = false;
                              break L5;
                            }
                          }
                          L6: {
                            if (wh.field_c == 97) {
                              fc.field_e = (1 + fc.field_e) % 3;
                              ((ke) this).field_b.a(fc.field_e, (byte) -81);
                              nm.f(117);
                              ((ke) this).field_b.field_o = false;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          L7: {
                            if ((wh.field_c ^ -1) == -99) {
                              L8: {
                                if (3 != ((ke) this).field_b.field_h) {
                                  break L8;
                                } else {
                                  ((ke) this).field_b.a(fc.field_e, (byte) -103);
                                  if (var4 == 0) {
                                    break L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              ((ke) this).field_b.a(3, (byte) -125);
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          if (99 != wh.field_c) {
                            break L3;
                          } else {
                            L9: {
                              if ((((ke) this).field_b.field_h ^ -1) > -1) {
                                break L9;
                              } else {
                                if (-4 >= (((ke) this).field_b.field_h ^ -1)) {
                                  break L9;
                                } else {
                                  ((ke) this).field_b.a(3, (byte) -95);
                                  if (var4 == 0) {
                                    break L3;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                            ((ke) this).field_b.a(fc.field_e, (byte) -110);
                            if (var4 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      ((ke) this).field_b.a(-38);
                      break L3;
                    }
                    if (!this.b(false, 1)) {
                      if (var4 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    } else {
                      return;
                    }
                  } else {
                    nm.f(-26);
                    mg.field_Zb = false;
                    qi.a(false, (byte) -108);
                    return;
                  }
                }
              }
            }
            ((ke) this).field_b.a(this.a(400, bh.field_g, pm.field_f), -20563, this.a(400, he.field_S, nf.field_h));
            stackOut_28_0 = this.b(true, 1);
            stackIn_29_0 = stackOut_28_0 ? 1 : 0;
            break L1;
          }
          return;
        }
    }

    private final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        ec var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_2_0 = 0;
        var7 = client.field_A ? 1 : 0;
        var4 = 640 - (640 * ((ke) this).field_o * ((ke) this).field_o / param0 + (((ke) this).field_u >> 1482415394));
        param1 = param1 - var4;
        var5 = 0;
        L0: while (true) {
          L1: {
            if ((var5 ^ -1) <= (((ke) this).field_b.field_l ^ -1)) {
              break L1;
            } else {
              var6 = ((ke) this).field_f[var5];
              stackOut_2_0 = var6.field_l ^ -1;
              stackIn_11_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (var7 != 0) {
                return stackIn_11_0;
              } else {
                L2: {
                  if (stackIn_3_0 < (param1 ^ -1)) {
                    break L2;
                  } else {
                    if ((var6.field_n + var6.field_l ^ -1) >= (param1 ^ -1)) {
                      break L2;
                    } else {
                      if (var6.field_m > param2) {
                        break L2;
                      } else {
                        if ((param2 ^ -1) > (var6.field_m - -var6.field_r ^ -1)) {
                          return var5;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                var5++;
                if (var7 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
          }
          return -1;
        }
    }

    private final int b(boolean param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int stackIn_12_0 = 0;
        int stackIn_56_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_55_0 = 0;
        var11 = client.field_A ? 1 : 0;
        var3 = -(640 * ((ke) this).field_o * ((ke) this).field_o / 400) + (640 + -(((ke) this).field_u >> -1950206750));
        var4 = -1;
        var26 = rc.a(cm.field_b, (byte) 47, ((ke) this).field_v);
        var27 = rc.a(cm.field_a, (byte) 47, var26);
        var7 = -((jh.a(var27, 120) - 1) * 18) + 304;
        if (param1 == -51) {
          L0: {
            var8 = 80;
            if ((((ke) this).field_i ^ -1) != -1) {
              L1: {
                var28 = eg.a(cm.field_a, ((ke) this).field_v, (byte) 106);
                var7 = 304 - (jh.a(var28, param1 + 146) - 1) * 18;
                if (tf.a((byte) 103, var28)) {
                  break L1;
                } else {
                  var8 -= 20;
                  break L1;
                }
              }
              if (af.a(param1 + 51, var28, ((ke) this).field_v)) {
                var8 += 20;
                break L0;
              } else {
                break L0;
              }
            } else {
              break L0;
            }
          }
          var7 = var7 + var3;
          var9 = 0;
          L2: while (true) {
            L3: {
              L4: {
                if (31 <= var9) {
                  break L4;
                } else {
                  stackOut_11_0 = var9;
                  stackIn_56_0 = stackOut_11_0;
                  stackIn_12_0 = stackOut_11_0;
                  if (var11 != 0) {
                    break L3;
                  } else {
                    L5: {
                      if (stackIn_12_0 == 15) {
                        L6: {
                          var7 = 34;
                          var8 += 40;
                          if (((ke) this).field_i == 0) {
                            break L6;
                          } else {
                            var29 = eg.a(((ke) this).field_v, cm.field_h, (byte) 105);
                            var7 = -(18 * jh.a(var29, 96)) + 18 + 304;
                            break L6;
                          }
                        }
                        var7 = var7 + var3;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L7: {
                      L8: {
                        if (0 == ((ke) this).field_i) {
                          break L8;
                        } else {
                          if (!fb.a(var9, 10040319, ((ke) this).field_v)) {
                            break L8;
                          } else {
                            if (var11 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      if (!rb.a(-23, var9, var26)) {
                        L9: {
                          L10: {
                            if (param0) {
                              break L10;
                            } else {
                              L11: {
                                if (var9 != ((ke) this).field_k) {
                                  break L11;
                                } else {
                                  L12: {
                                    if (rb.a(-112, var9, ((ke) this).field_v)) {
                                      break L12;
                                    } else {
                                      vg.field_h.b(-4 + var7, var8 - 4, 40, 40);
                                      if (var11 == 0) {
                                        break L9;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  uf.field_y[var9].a(var7 - 4, -4 + var8, 40, 40);
                                  if (var11 == 0) {
                                    break L9;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              L13: {
                                if (bh.field_g < var7) {
                                  break L13;
                                } else {
                                  if ((32 + var7 ^ -1) >= (bh.field_g ^ -1)) {
                                    break L13;
                                  } else {
                                    if ((var8 ^ -1) < (pm.field_f ^ -1)) {
                                      break L13;
                                    } else {
                                      if (pm.field_f >= 32 + var8) {
                                        break L13;
                                      } else {
                                        L14: {
                                          L15: {
                                            if (!rb.a(-113, var9, ((ke) this).field_v)) {
                                              break L15;
                                            } else {
                                              uf.field_y[var9].a(var7 - 2, -2 + var8, 36, 36);
                                              if (var11 == 0) {
                                                break L14;
                                              } else {
                                                break L15;
                                              }
                                            }
                                          }
                                          vg.field_h.b(-2 + var7, var8 - 2, 36, 36);
                                          break L14;
                                        }
                                        var4 = var9;
                                        if (var11 == 0) {
                                          break L9;
                                        } else {
                                          break L13;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              L16: {
                                if (!rb.a(param1 + 23, var9, ((ke) this).field_v)) {
                                  break L16;
                                } else {
                                  tl.field_w[var9].c(var7, var8);
                                  if (var11 == 0) {
                                    break L9;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                              vg.field_h.b(var7, var8, 32, 32);
                              if (var11 == 0) {
                                break L9;
                              } else {
                                break L10;
                              }
                            }
                          }
                          if ((var7 ^ -1) < (he.field_S ^ -1)) {
                            break L9;
                          } else {
                            if (he.field_S >= 32 + var7) {
                              break L9;
                            } else {
                              if (nf.field_h < var8) {
                                break L9;
                              } else {
                                if ((nf.field_h ^ -1) > (32 + var8 ^ -1)) {
                                  L17: {
                                    if (var9 != ((ke) this).field_k) {
                                      break L17;
                                    } else {
                                      ((ke) this).field_k = -1;
                                      if (var11 == 0) {
                                        break L9;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                  ((ke) this).field_k = var9;
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                        var7 += 36;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var9++;
                    if (var11 == 0) {
                      continue L2;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              stackOut_55_0 = ((ke) this).field_k;
              stackIn_56_0 = stackOut_55_0;
              break L3;
            }
            L18: {
              if (stackIn_56_0 < 0) {
                break L18;
              } else {
                var4 = ((ke) this).field_k;
                break L18;
              }
            }
            return var4;
          }
        } else {
          return 9;
        }
    }

    final void j(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = client.field_A ? 1 : 0;
        var2 = 2147483647;
        var3 = 2147483647;
        var4 = -2147483648;
        var5 = -2147483648;
        var6 = -99 % ((-41 - param0) / 33);
        var7 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if ((((ke) this).field_b.field_l ^ -1) >= (var7 ^ -1)) {
                break L2;
              } else {
                if (var8 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (var2 > ((ke) this).field_f[var7].field_l) {
                      var2 = ((ke) this).field_f[var7].field_l;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (((ke) this).field_f[var7].field_n + ((ke) this).field_f[var7].field_l > var4) {
                      var4 = ((ke) this).field_f[var7].field_l - -((ke) this).field_f[var7].field_n;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if ((var5 ^ -1) <= (((ke) this).field_f[var7].field_r + ((ke) this).field_f[var7].field_m ^ -1)) {
                      break L5;
                    } else {
                      var5 = ((ke) this).field_f[var7].field_m - -((ke) this).field_f[var7].field_r;
                      break L5;
                    }
                  }
                  L6: {
                    if ((((ke) this).field_f[var7].field_m ^ -1) > (var3 ^ -1)) {
                      var3 = ((ke) this).field_f[var7].field_m;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  var7++;
                  if (var8 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            ((ke) this).field_w = -30 + var2;
            ((ke) this).field_z = -20 + var3;
            ((ke) this).field_y = var4 - -30 + -((ke) this).field_w;
            ((ke) this).field_q = var5 - (-20 - -((ke) this).field_z);
            break L1;
          }
          return;
        }
    }

    final void c(int param0) {
        this.e(16687906);
        this.b(58);
        if (param0 != 2) {
            ((ke) this).k(-125);
        }
    }

    private final boolean a(boolean param0, byte param1) {
        int var3 = 0;
        L0: {
          if (param1 == -33) {
            break L0;
          } else {
            ((ke) this).field_o = -121;
            break L0;
          }
        }
        L1: {
          this.h(param1 + 132);
          var3 = -1;
          if (0 > ((ke) this).field_b.field_h) {
            break L1;
          } else {
            var3 = ((ke) this).field_f[((ke) this).field_b.field_h].field_d;
            break L1;
          }
        }
        L2: {
          if (-27 != (var3 ^ -1)) {
            break L2;
          } else {
            if ((((ke) this).field_t ^ -1) == -4) {
              var3 = -1;
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (-26 != (var3 ^ -1)) {
            break L3;
          } else {
            if (-1 == (((ke) this).field_t ^ -1)) {
              var3 = -1;
              break L3;
            } else {
              break L3;
            }
          }
        }
        L4: {
          L5: {
            if (var3 == 13) {
              break L5;
            } else {
              if (param0) {
                break L4;
              } else {
                break L5;
              }
            }
          }
          if (((ke) this).field_b.b((byte) 114)) {
            nk.field_k = false;
            kf.field_G.c(-1, param0);
            nm.f(123);
            return true;
          } else {
            break L4;
          }
        }
        L6: {
          if (25 != var3) {
            break L6;
          } else {
            if (!((ke) this).field_b.b((byte) 114)) {
              break L6;
            } else {
              this.m(-11063);
              break L6;
            }
          }
        }
        L7: {
          if (var3 != 26) {
            break L7;
          } else {
            if (((ke) this).field_b.b((byte) 114)) {
              this.n(-77);
              break L7;
            } else {
              return false;
            }
          }
        }
        return false;
    }

    final static void o(int param0) {
        pk.field_r = param0;
        jg.field_i = true;
    }

    final void a(ec param0, int param1) {
        if (param1 <= 98) {
            this.b(98);
        }
        int fieldTemp$0 = ((ke) this).field_b.field_l;
        ((ke) this).field_b.field_l = ((ke) this).field_b.field_l + 1;
        ((ke) this).field_f[fieldTemp$0] = param0;
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = client.field_A ? 1 : 0;
          hk.a(param0, param1, 1 + param2, 10000536);
          hk.a(param0, param3 + param1, 1 + param2, 12105912);
          var5 = 1;
          if (param1 - -var5 >= hk.field_h) {
            break L0;
          } else {
            var5 = -param1 + hk.field_h;
            break L0;
          }
        }
        L1: {
          var6 = param3;
          if (param1 + var6 > hk.field_b) {
            var6 = -param1 + hk.field_b;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (param4 >= 98) {
            break L2;
          } else {
            field_n = null;
            break L2;
          }
        }
        var7 = var5;
        L3: while (true) {
          L4: {
            if ((var6 ^ -1) >= (var7 ^ -1)) {
              break L4;
            } else {
              var8 = 152 - -(var7 * 48 / param3);
              var9 = var8 << 943748912 | var8 << 392551496 | var8;
              hk.field_l[(param1 - -var7) * hk.field_j + param0] = var9;
              hk.field_l[param0 + (var7 + param1) * hk.field_j + param2] = var9;
              var7++;
              if (var10 != 0) {
                break L4;
              } else {
                if (var10 == 0) {
                  continue L3;
                } else {
                  break L4;
                }
              }
            }
          }
          return;
        }
    }

    final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var4 = client.field_A ? 1 : 0;
        var3 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if ((var3 ^ -1) <= (((ke) this).field_b.field_l ^ -1)) {
                break L2;
              } else {
                ((ke) this).field_f[var3].field_m = ((ke) this).field_f[var3].field_m + param0;
                var3++;
                if (var4 != 0) {
                  break L1;
                } else {
                  if (var4 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            ((ke) this).field_b.a(this.a(400, bh.field_g, pm.field_f), -20563, this.a(400, he.field_S, nf.field_h));
            break L1;
          }
          var5 = 0;
          var3 = var5;
          L3: while (true) {
            L4: {
              L5: {
                if (((ke) this).field_b.field_l <= var5) {
                  break L5;
                } else {
                  ((ke) this).field_f[var5].field_m = ((ke) this).field_f[var5].field_m - param0;
                  var5++;
                  if (var4 != 0) {
                    break L4;
                  } else {
                    if (var4 == 0) {
                      continue L3;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              L6: {
                if (param1 > 120) {
                  break L6;
                } else {
                  ((ke) this).field_i = 13;
                  break L6;
                }
              }
              boolean discarded$2 = this.p(-1);
              break L4;
            }
            return;
          }
        }
    }

    private final void b(int param0) {
        int var2 = -(((ke) this).field_u >> 952971650) + (640 + -(640 * (((ke) this).field_o * ((ke) this).field_o) / 400));
        if (param0 < 49) {
            ((ke) this).field_r = false;
        }
        ck var3 = ng.field_b;
        var3.c(320 - var3.field_K / 2, -(var2 >> -492469630) + (50 + -(var3.field_C / 2)));
        hk.a(var2 + 4 + ((ke) this).field_w, ((ke) this).field_z + 4, -8 + ((ke) this).field_y, -8 + ((ke) this).field_q, 0, 150);
        vk.a(((ke) this).field_q, (byte) 50, a.field_n, ((ke) this).field_y, ((ke) this).field_z, var2 + ((ke) this).field_w);
        kn.a((mm) (Object) w.field_kb, (byte) -39, 362, ve.c(((ke) this).field_t, 26135), 16777215, 560 + var2);
        wk.a(72, ((ke) this).field_t, var2);
    }

    final void h(byte param0) {
        int var2 = 0;
        ck var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        String stackIn_20_3 = null;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        String stackOut_19_3 = null;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        String stackOut_18_3 = null;
        L0: {
          var10 = client.field_A ? 1 : 0;
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if ((((ke) this).field_b.field_l ^ -1) > -4) {
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
          this.a(stackIn_3_1 != 0, 15764);
          var2 = 640 + (-(640 * (((ke) this).field_o * ((ke) this).field_o) / 400) + -(((ke) this).field_u >> -1169742078));
          var3 = client.field_C[((ke) this).field_i];
          if (param0 >= 23) {
            break L1;
          } else {
            ((ke) this).field_z = -77;
            break L1;
          }
        }
        L2: {
          L3: {
            var3.c(-(var3.field_K / 2) + 320, -(var3.field_C / 2) + 40 - (var2 >> 740753666));
            var4 = this.b(false, (byte) -51);
            if ((var4 ^ -1) > -1) {
              break L3;
            } else {
              L4: {
                L5: {
                  ed.a(16777215, 320 - -var2, qk.field_s[var4], 200, (byte) 75, (mm) (Object) w.field_kb);
                  var5 = rb.a(-35, var4, ((ke) this).field_v) ? 1 : 0;
                  if (var5 != 0) {
                    break L5;
                  } else {
                    if (!rb.a(-28, var4, cm.field_g)) {
                      break L5;
                    } else {
                      stackOut_8_0 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      break L4;
                    }
                  }
                }
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L4;
              }
              L6: {
                L7: {
                  var6 = stackIn_10_0;
                  if (var5 == 0) {
                    break L7;
                  } else {
                    uf.field_y[var4].c(var2 + 256, 210);
                    if (var10 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                vg.field_h.c(256 + var2, 210);
                break L6;
              }
              L8: {
                L9: {
                  if (var6 == 0) {
                    break L9;
                  } else {
                    var7 = sb.field_t;
                    if (var10 == 0) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
                var7 = jh.field_c[var4];
                break L8;
              }
              L10: {
                var8 = se.field_S.a(var7, 171);
                int discarded$1 = ga.a(171, 0, -se.field_S.field_R + 274 + -(var8 * 8), var7, 16, 1000, 16769088, (mm) (Object) se.field_S, (byte) -124, 0, var2 + 80);
                stackOut_17_0 = 8 * var8 + 282;
                stackOut_17_1 = 256;
                stackOut_17_2 = 16777215;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                stackIn_19_2 = stackOut_17_2;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                stackIn_18_2 = stackOut_17_2;
                if (var5 != 0) {
                  stackOut_19_0 = stackIn_19_0;
                  stackOut_19_1 = stackIn_19_1;
                  stackOut_19_2 = stackIn_19_2;
                  stackOut_19_3 = ne.field_b;
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  stackIn_20_2 = stackOut_19_2;
                  stackIn_20_3 = stackOut_19_3;
                  break L10;
                } else {
                  stackOut_18_0 = stackIn_18_0;
                  stackOut_18_1 = stackIn_18_1;
                  stackOut_18_2 = stackIn_18_2;
                  stackOut_18_3 = j.field_a;
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  stackIn_20_2 = stackOut_18_2;
                  stackIn_20_3 = stackOut_18_3;
                  break L10;
                }
              }
              L11: {
                L12: {
                  fl.a(stackIn_20_0, stackIn_20_1, stackIn_20_2, stackIn_20_3, 80 + var2, (mm) (Object) w.field_kb);
                  kn.a((mm) (Object) se.field_S, (byte) -39, 271, jd.field_Xb, 16777215, var2 + 500);
                  kn.a((mm) (Object) se.field_S, (byte) -39, 289, me.field_B, 16777215, 500 - -var2);
                  if (var6 == 0) {
                    break L12;
                  } else {
                    fl.a(271, 256, 16769088, "???", 500 - -var2, (mm) (Object) se.field_S);
                    fl.a(289, 256, 16769088, "???", var2 + 500, (mm) (Object) se.field_S);
                    if (var10 == 0) {
                      break L11;
                    } else {
                      break L12;
                    }
                  }
                }
                fl.a(271, 256, 16769088, Integer.toString(on.field_g[var4]), var2 + 500, (mm) (Object) se.field_S);
                var9 = 0;
                L13: while (true) {
                  if (vb.field_X[var4] <= var9) {
                    break L11;
                  } else {
                    rn.field_c.c(var9 * 5 + (var2 + 500), 274);
                    var9++;
                    if (var10 != 0) {
                      break L2;
                    } else {
                      if (var10 == 0) {
                        continue L13;
                      } else {
                        break L11;
                      }
                    }
                  }
                }
              }
              if (var10 == 0) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          ed.a(16777215, var2 + 320, v.field_e, 200, (byte) 75, (mm) (Object) w.field_kb);
          break L2;
        }
        L14: {
          if (ph.n(-30146)) {
            ed.a(16777215, var2 + 320, lf.field_d, 360, (byte) 75, (mm) (Object) se.field_S);
            break L14;
          } else {
            break L14;
          }
        }
        L15: {
          if (rb.a(-80, 5, ((ke) this).field_v)) {
            ed.a(16777215, 320 - -var2, ph.field_Cb, 360, (byte) 75, (mm) (Object) se.field_S);
            break L15;
          } else {
            break L15;
          }
        }
    }

    private final boolean a(int param0, boolean param1) {
        int var3 = 0;
        L0: {
          this.h(118);
          if (param0 == -14845) {
            break L0;
          } else {
            boolean discarded$2 = this.b(true, 36);
            break L0;
          }
        }
        L1: {
          var3 = -1;
          if ((((ke) this).field_b.field_h ^ -1) <= -1) {
            var3 = ((ke) this).field_f[((ke) this).field_b.field_h].field_d;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (-21 != (var3 ^ -1)) {
            break L2;
          } else {
            if (((ke) this).field_b.b((byte) 114)) {
              og.a(false, 6, true);
              nm.f(124);
              return true;
            } else {
              break L2;
            }
          }
        }
        L3: {
          L4: {
            if (var3 == 13) {
              break L4;
            } else {
              if (param1) {
                break L3;
              } else {
                break L4;
              }
            }
          }
          if (((ke) this).field_b.b((byte) 114)) {
            ve.field_Hc = false;
            qi.a(param1, (byte) -111);
            nm.f(param0 ^ -14836);
            return true;
          } else {
            break L3;
          }
        }
        L5: {
          if (!param1) {
            break L5;
          } else {
            if (-1 == (ig.field_Yb ^ -1)) {
              break L5;
            } else {
              if (((ke) this).field_b.field_h == -1) {
                break L5;
              } else {
                cj.field_c = ((ke) this).field_b.field_h;
                ((ke) this).field_b.a(cj.field_c, (byte) -109);
                nm.f(125);
                return true;
              }
            }
          }
        }
        return false;
    }

    final void b(byte param0) {
        int var2 = 0;
        ck var3 = null;
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        String[] var17 = null;
        String[] var19 = null;
        int[] var21 = null;
        int[] var22 = null;
        L0: {
          var14 = client.field_A ? 1 : 0;
          var2 = -(((ke) this).field_u >> -977993822) + (-(640 * ((ke) this).field_o * ((ke) this).field_o / 400) + 640);
          this.a(false, 15764);
          var3 = ij.field_d;
          var3.c(320 + -(var3.field_K / 2), 45 - var3.field_C / 2 + -(var2 >> 8543042));
          if (null != ((ke) this).field_e) {
            break L0;
          } else {
            if (ph.n(-30146)) {
              break L0;
            } else {
              ((ke) this).field_e = am.a(3, false, 1, 0, 10);
              break L0;
            }
          }
        }
        var4 = bf.a((byte) 107, gh.field_e, fc.field_e, ((ke) this).field_e);
        fl.a(105, 256, 16777215, vm.field_x, var2 + 125, (mm) (Object) w.field_kb);
        fl.a(105, 256, 16777215, a.field_x, 333 + var2, (mm) (Object) w.field_kb);
        kn.a((mm) (Object) w.field_kb, (byte) -39, 105, sl.field_b, 16777215, 545 - -var2);
        if (param0 <= -42) {
          var5_int = 0;
          L1: while (true) {
            L2: {
              if ((var5_int ^ -1) <= -11) {
                break L2;
              } else {
                var6 = 16777215;
                kn.a((mm) (Object) w.field_kb, (byte) -39, 130 + 20 * var5_int, 1 + var5_int + ".", var6, var2 + 115);
                var5_int++;
                if (var14 == 0) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              var5 = le.field_r;
              var6 = 1;
              if (null != ((ke) this).field_e) {
                L4: {
                  if (((ke) this).field_e.field_p) {
                    break L4;
                  } else {
                    var5 = wm.field_k;
                    if (var14 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  L6: {
                    if (null != ((ke) this).field_e.field_r) {
                      var17 = ((ke) this).field_e.field_r[fc.field_e];
                      var21 = ((ke) this).field_e.field_u[fc.field_e];
                      var9 = 0;
                      L7: while (true) {
                        if ((var9 ^ -1) <= -11) {
                          break L5;
                        } else {
                          if (var14 != 0) {
                            break L3;
                          } else {
                            L8: {
                              if (var17[var9] == null) {
                                break L8;
                              } else {
                                L9: {
                                  var5 = null;
                                  var10 = 16769088;
                                  var11 = var21[var9];
                                  var12 = var11 % 8;
                                  var13 = var11 / 8;
                                  if ((var4 ^ -1) == (var9 ^ -1)) {
                                    var10 = 16777215;
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                                fl.a(var9 * 20 + 130, 256, var10, var17[var9], 125 - -var2, (mm) (Object) se.field_S);
                                kn.a((mm) (Object) se.field_S, (byte) -39, 130 + var9 * 20, cm.a((byte) 106, kk.field_q, new String[1]), var10, 350 - -var2);
                                fl.a(130 - -(var9 * 20), 256, var10, md.field_U[var12], var2 + 350, (mm) (Object) se.field_S);
                                kn.a((mm) (Object) se.field_S, (byte) -39, 20 * var9 + 130, Integer.toString(var13), var10, 545 + var2);
                                break L8;
                              }
                            }
                            var9++;
                            if (var14 == 0) {
                              continue L7;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                    } else {
                      var5 = dn.field_s;
                      if (var14 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var19 = ((ke) this).field_e.field_r[fc.field_e];
                  var22 = ((ke) this).field_e.field_u[fc.field_e];
                  var9 = 0;
                  L10: while (true) {
                    if ((var9 ^ -1) <= -11) {
                      break L5;
                    } else {
                      if (var14 != 0) {
                        break L3;
                      } else {
                        L11: {
                          if (var19[var9] == null) {
                            break L11;
                          } else {
                            L12: {
                              var5 = null;
                              var10 = 16769088;
                              var11 = var22[var9];
                              var12 = var11 % 8;
                              var13 = var11 / 8;
                              if ((var4 ^ -1) == (var9 ^ -1)) {
                                var10 = 16777215;
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                            fl.a(var9 * 20 + 130, 256, var10, var19[var9], 125 - -var2, (mm) (Object) se.field_S);
                            kn.a((mm) (Object) se.field_S, (byte) -39, 130 + var9 * 20, cm.a((byte) 106, kk.field_q, new String[1]), var10, 350 - -var2);
                            fl.a(130 - -(var9 * 20), 256, var10, md.field_U[var12], var2 + 350, (mm) (Object) se.field_S);
                            kn.a((mm) (Object) se.field_S, (byte) -39, 20 * var9 + 130, Integer.toString(var13), var10, 545 + var2);
                            break L11;
                          }
                        }
                        var9++;
                        if (var14 == 0) {
                          continue L10;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                }
                if (0 <= var4) {
                  break L3;
                } else {
                  if (gh.field_e == null) {
                    break L3;
                  } else {
                    if (gh.field_e.field_x != 0) {
                      break L3;
                    } else {
                      fl.a(330, 256, 16777215, oa.field_f, 125 + var2, (mm) (Object) se.field_S);
                      var7 = gh.field_e.field_s[0];
                      var8 = var7 % 8;
                      var9 = var7 / 8;
                      kn.a((mm) (Object) se.field_S, (byte) -39, 330, cm.a((byte) 81, kk.field_q, new String[1]), 16777215, var2 + 350);
                      fl.a(330, 256, 16777215, md.field_U[var8], 350 + var2, (mm) (Object) se.field_S);
                      kn.a((mm) (Object) se.field_S, (byte) -39, 330, Integer.toString(var9), 16777215, var2 + 545);
                      var6 = 0;
                      break L3;
                    }
                  }
                }
              } else {
                break L3;
              }
            }
            L13: {
              if (var5 != null) {
                ed.a(16777215, 320 - -var2, var5, 220, (byte) 75, (mm) (Object) w.field_kb);
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              L15: {
                if (ph.n(-30146)) {
                  break L15;
                } else {
                  if (var6 != 0) {
                    ed.a(16777215, var2 + 320, af.field_e, 330, (byte) 75, (mm) (Object) se.field_S);
                    if (var14 == 0) {
                      break L14;
                    } else {
                      break L15;
                    }
                  } else {
                    break L14;
                  }
                }
              }
              ed.a(16777215, 320 - -var2, lf.field_d, 330, (byte) 75, (mm) (Object) se.field_S);
              break L14;
            }
            return;
          }
        } else {
          return;
        }
    }

    final void f(int param0) {
        int var2 = 0;
        ck var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          this.a(true, param0 ^ -23361);
          var2 = -(((ke) this).field_u >> -2029436830) + 640 + -(640 * ((ke) this).field_o * ((ke) this).field_o / 400);
          var3 = l.field_j;
          var3.c(320 - var3.field_K / 2, -(var2 >> -1455322462) + (((ke) this).field_z / 2 - (-2 - -(var3.field_C / 2))));
          if (param0 == -26325) {
            break L0;
          } else {
            ((ke) this).field_q = -96;
            break L0;
          }
        }
        L1: {
          if (((ke) this).field_g) {
            stackOut_4_0 = 23;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = 0;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        var4 = stackIn_5_0;
        hk.a(var2 + (4 + ((ke) this).field_w), -8 + (((ke) this).field_q + ((ke) this).field_z), -8 + ((ke) this).field_y, var4 + 142, 0, 150);
        vk.a(var4 + 150, (byte) 50, a.field_n, ((ke) this).field_y, -13 + ((ke) this).field_z + ((ke) this).field_q, var2 + ((ke) this).field_w);
        fc.a(((ke) this).field_q + ((ke) this).field_z, (byte) 5, ((ke) this).field_g, var2 + 185);
        nf.a(((ke) this).field_l, var2 + 333, (byte) 74, ((ke) this).field_q + ((ke) this).field_z, ((ke) this).field_m);
    }

    final void k(int param0) {
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_3_0 = 0;
        boolean stackOut_10_0 = false;
        L0: {
          var3 = client.field_A ? 1 : 0;
          h.a((ke) this, (byte) 95);
          if (param0 == 128) {
            break L0;
          } else {
            ((ke) this).field_v = null;
            break L0;
          }
        }
        L1: while (true) {
          L2: {
            L3: {
              if (!ab.c((byte) 26)) {
                break L3;
              } else {
                stackOut_3_0 = 13;
                stackIn_11_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (var3 != 0) {
                  break L2;
                } else {
                  L4: {
                    if (stackIn_4_0 != wh.field_c) {
                      break L4;
                    } else {
                      if (!((ke) this).field_p) {
                        break L4;
                      } else {
                        nm.f(27);
                        cd.a(true);
                        return;
                      }
                    }
                  }
                  ((ke) this).field_b.a(-127);
                  if (!this.d(-109, false)) {
                    if (var3 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            ((ke) this).field_b.a(this.a(400, bh.field_g, pm.field_f), -20563, this.a(param0 + 272, he.field_S, nf.field_h));
            stackOut_10_0 = this.d(-108, true);
            stackIn_11_0 = stackOut_10_0 ? 1 : 0;
            break L2;
          }
          return;
        }
    }

    final void d(byte param0) {
        int var2 = 0;
        ck var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        String[] var10_ref_String__ = null;
        int var11 = 0;
        int[] var11_ref_int__ = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        L0: {
          var14 = client.field_A ? 1 : 0;
          var2 = -(((ke) this).field_u >> 685015522) + (-(((ke) this).field_o * (((ke) this).field_o * 640) / 400) + 640);
          this.a(false, 15764);
          var3 = ad.field_g;
          var3.c(-(var3.field_K / 2) + 320, -(var3.field_C / 2) + (45 + -(var2 >> 886031138)));
          if (((ke) this).field_a != null) {
            break L0;
          } else {
            if (ph.n(-30146)) {
              break L0;
            } else {
              ((ke) this).field_a = ai.a(7, 10, (byte) -111, 0);
              break L0;
            }
          }
        }
        L1: {
          if (-4 != (kd.field_p ^ -1)) {
            stackOut_5_0 = 310;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 305;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var4 = stackIn_6_0;
          if (-4 == (kd.field_p ^ -1)) {
            stackOut_8_0 = 372;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 380;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var5 = stackIn_9_0;
          if ((kd.field_p ^ -1) == -4) {
            stackOut_11_0 = 427;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = 435;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        L4: {
          var6 = stackIn_12_0;
          if (-4 == (kd.field_p ^ -1)) {
            stackOut_14_0 = 488;
            stackIn_15_0 = stackOut_14_0;
            break L4;
          } else {
            stackOut_13_0 = 490;
            stackIn_15_0 = stackOut_13_0;
            break L4;
          }
        }
        L5: {
          var7 = stackIn_15_0;
          fl.a(105, 256, 16777215, vm.field_x, 125 + var2, (mm) (Object) w.field_kb);
          kn.a((mm) (Object) w.field_kb, (byte) -39, 105, ga.field_a, 16777215, var4 - -var2);
          if (param0 == 45) {
            break L5;
          } else {
            ((ke) this).field_w = -41;
            break L5;
          }
        }
        L6: {
          kn.a((mm) (Object) w.field_kb, (byte) -39, 105, om.field_c, 16777215, var2 + var5);
          kn.a((mm) (Object) w.field_kb, (byte) -39, 105, hd.field_o, 16777215, var6 - -var2);
          kn.a((mm) (Object) w.field_kb, (byte) -39, 105, vd.field_r, 16777215, var2 + var7);
          kn.a((mm) (Object) w.field_kb, (byte) -39, 105, sh.field_h, 16777215, 545 - -var2);
          var8 = -1;
          var9 = hf.field_g;
          if (((ke) this).field_a == null) {
            break L6;
          } else {
            L7: {
              if (((ke) this).field_a.field_A) {
                break L7;
              } else {
                var9 = wm.field_k;
                if (var14 == 0) {
                  break L6;
                } else {
                  break L7;
                }
              }
            }
            L8: {
              if (((ke) this).field_a.field_x == null) {
                break L8;
              } else {
                var10_ref_String__ = ((ke) this).field_a.field_x[cj.field_c];
                var11_ref_int__ = ((ke) this).field_a.field_u[cj.field_c];
                var12 = 0;
                L9: while (true) {
                  L10: {
                    L11: {
                      if (-11 >= (var12 ^ -1)) {
                        break L11;
                      } else {
                        if (var14 != 0) {
                          break L10;
                        } else {
                          L12: {
                            if (var10_ref_String__[var12] == null) {
                              break L12;
                            } else {
                              L13: {
                                var9 = null;
                                var13 = 16769088;
                                if (k.a(var10_ref_String__[var12], true)) {
                                  var8 = var12;
                                  var13 = 16777215;
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              this.a(se.field_S, var13, var11_ref_int__[4 * var12 + 2], var11_ref_int__[4 * var12 - -3], param0 + -5373, 130 - -(20 * var12), var11_ref_int__[1 + 4 * var12], var10_ref_String__[var12], var11_ref_int__[4 * var12], var2);
                              break L12;
                            }
                          }
                          var12++;
                          if (var14 == 0) {
                            continue L9;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    if (var8 >= 0) {
                      break L10;
                    } else {
                      var12 = 16777215;
                      this.a(se.field_S, var12, ((ke) this).field_a.field_w, ((ke) this).field_a.field_p, -5328, 330, ((ke) this).field_a.field_o, oa.field_f, ((ke) this).field_a.field_t, var2);
                      break L10;
                    }
                  }
                  if (var14 == 0) {
                    break L6;
                  } else {
                    break L8;
                  }
                }
              }
            }
            var9 = dn.field_s;
            break L6;
          }
        }
        var10 = 0;
        L14: while (true) {
          L15: {
            L16: {
              L17: {
                if (10 <= var10) {
                  break L17;
                } else {
                  var11 = 16777215;
                  kn.a((mm) (Object) w.field_kb, (byte) -39, 130 + var10 * 20, var10 + 1 + ".", var11, var2 + 115);
                  var10++;
                  if (var14 != 0) {
                    break L16;
                  } else {
                    if (var14 == 0) {
                      continue L14;
                    } else {
                      break L17;
                    }
                  }
                }
              }
              if (var9 != null) {
                break L16;
              } else {
                break L15;
              }
            }
            ed.a(16777215, 320 + var2, var9, 220, (byte) 75, (mm) (Object) w.field_kb);
            break L15;
          }
          L18: {
            if (!ph.n(-30146)) {
              break L18;
            } else {
              ed.a(16777215, var2 + 320, lf.field_d, 330, (byte) 75, (mm) (Object) se.field_S);
              break L18;
            }
          }
          return;
        }
    }

    private final void m(int param0) {
        if (param0 != -11063) {
            this.a(false, 73);
        }
        if (0 < ((ke) this).field_t) {
            ((ke) this).field_t = ((ke) this).field_t - 1;
            nm.f(-65);
            ac.f((byte) -76);
        }
    }

    private final boolean b(int param0, boolean param1) {
        this.h(94);
        int var3 = param0;
        if (!(-1 < (((ke) this).field_b.field_h ^ -1))) {
            var3 = ((ke) this).field_f[((ke) this).field_b.field_h].field_d;
        }
        if (20 == var3) {
            if (!(!((ke) this).field_b.b((byte) 114))) {
                og.a(false, 4, true);
                nm.f(param0 + 37);
                return true;
            }
        }
        if (var3 == 21) {
            if (((ke) this).field_b.b((byte) 114)) {
                s.b(true);
                ba.field_c = false;
                qi.a(param1, (byte) -104);
                nm.f(param0 ^ -126);
                return true;
            }
        }
        return false;
    }

    final void a(boolean param0) {
        if (param0) {
            ke.e((byte) -98);
        }
        this.a(true, 15764);
        int var2 = -(((ke) this).field_o * ((ke) this).field_o * 640 / 400) + (640 - (((ke) this).field_u >> -2066854142));
        wk.field_l.c(320 + -(wk.field_l.field_I / 2), -(var2 >> -2060126462) + 20);
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ec var9 = null;
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        var11 = client.field_A ? 1 : 0;
        var7 = -41 % ((-31 - param3) / 62);
        var6 = 0;
        var8 = 0;
        L0: while (true) {
          L1: {
            L2: {
              L3: {
                if (((ke) this).field_b.field_l <= var8) {
                  break L3;
                } else {
                  var9 = ((ke) this).field_f[var8];
                  var10 = var9.field_n;
                  stackOut_2_0 = 6;
                  stackOut_2_1 = var9.field_d;
                  stackIn_32_0 = stackOut_2_0;
                  stackIn_32_1 = stackOut_2_1;
                  stackIn_3_0 = stackOut_2_0;
                  stackIn_3_1 = stackOut_2_1;
                  if (var11 != 0) {
                    L4: while (true) {
                      if (stackIn_32_0 <= stackIn_32_1) {
                        break L1;
                      } else {
                        ((ke) this).field_f[var8].field_n = var6;
                        ((ke) this).field_f[var8].field_l = param1 + -(var6 / 2);
                        var8++;
                        if (var11 != 0) {
                          break L1;
                        } else {
                          if (var11 == 0) {
                            stackOut_34_0 = ((ke) this).field_b.field_l;
                            stackOut_34_1 = var8;
                            stackIn_32_0 = stackOut_34_0;
                            stackIn_32_1 = stackOut_34_1;
                            continue L4;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  } else {
                    L5: {
                      L6: {
                        if (stackIn_3_0 == stackIn_3_1) {
                          break L6;
                        } else {
                          if (7 == var9.field_d) {
                            break L6;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var10 += 133;
                      break L5;
                    }
                    L7: {
                      var9.field_m = var8 * param4 + param0;
                      if (var6 < var10) {
                        var6 = var10;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    if (param2) {
                      L8: {
                        if (-1 <= (var8 ^ -1)) {
                          break L8;
                        } else {
                          var9.field_r = var9.field_r - 3;
                          var9.field_m = var9.field_m + 3;
                          break L8;
                        }
                      }
                      L9: {
                        if ((var8 ^ -1) <= (-1 + ((ke) this).field_b.field_l ^ -1)) {
                          break L9;
                        } else {
                          var9.field_r = var9.field_r - 3;
                          break L9;
                        }
                      }
                      var8++;
                      if (var11 == 0) {
                        continue L0;
                      } else {
                        break L3;
                      }
                    } else {
                      var8++;
                      if (var11 == 0) {
                        continue L0;
                      } else {
                        var8 = 0;
                        L10: while (true) {
                          if (((ke) this).field_b.field_l <= var8) {
                            break L1;
                          } else {
                            ((ke) this).field_f[var8].field_n = var6;
                            ((ke) this).field_f[var8].field_l = param1 + -(var6 / 2);
                            var8++;
                            if (var11 != 0) {
                              break L1;
                            } else {
                              if (var11 == 0) {
                                continue L10;
                              } else {
                                break L1;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              var8 = 0;
              L11: while (true) {
                if (((ke) this).field_b.field_l <= var8) {
                  break L1;
                } else {
                  ((ke) this).field_f[var8].field_n = var6;
                  ((ke) this).field_f[var8].field_l = param1 + -(var6 / 2);
                  var8++;
                  if (var11 != 0) {
                    break L1;
                  } else {
                    if (var11 == 0) {
                      continue L11;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            break L1;
          }
          return;
        }
    }

    final void k(byte param0) {
        ((ke) this).field_u = ((ke) this).field_u + ((ke) this).field_c / 2;
        ((ke) this).field_c = 7 * ((ke) this).field_c / 8;
        ((ke) this).field_c = ((ke) this).field_c - ((ke) this).field_u;
        if (param0 <= 107) {
            ke.a(103, -21, -87, 6, (byte) -30);
        }
    }

    final void d(int param0) {
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        var3 = client.field_A ? 1 : 0;
        h.a((ke) this, (byte) 95);
        L0: while (true) {
          L1: {
            L2: {
              if (!ab.c((byte) -18)) {
                break L2;
              } else {
                stackOut_2_0 = wh.field_c;
                stackOut_2_1 = 13;
                stackIn_32_0 = stackOut_2_0;
                stackIn_32_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (var3 != 0) {
                  break L1;
                } else {
                  if (stackIn_3_0 != stackIn_3_1) {
                    L3: {
                      L4: {
                        if (ph.n(-30146)) {
                          break L4;
                        } else {
                          L5: {
                            ((ke) this).field_b.d(param0 ^ -8622);
                            if (-97 == (wh.field_c ^ -1)) {
                              cj.field_c = (cj.field_c + 1) % 2;
                              ((ke) this).field_b.a(cj.field_c, (byte) -91);
                              nm.f(126);
                              ((ke) this).field_b.field_o = false;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          L6: {
                            if (-98 != (wh.field_c ^ -1)) {
                              break L6;
                            } else {
                              cj.field_c = (cj.field_c + 1) % 2;
                              ((ke) this).field_b.a(cj.field_c, (byte) -113);
                              nm.f(param0 + 8601);
                              ((ke) this).field_b.field_o = false;
                              break L6;
                            }
                          }
                          L7: {
                            if ((wh.field_c ^ -1) == -99) {
                              L8: {
                                if (((ke) this).field_b.field_h == 2) {
                                  break L8;
                                } else {
                                  ((ke) this).field_b.a(2, (byte) -98);
                                  if (var3 == 0) {
                                    break L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              ((ke) this).field_b.a(cj.field_c, (byte) -69);
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          if (wh.field_c == 99) {
                            L9: {
                              L10: {
                                if ((((ke) this).field_b.field_h ^ -1) > -1) {
                                  break L10;
                                } else {
                                  if (2 > ((ke) this).field_b.field_h) {
                                    break L9;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              ((ke) this).field_b.a(cj.field_c, (byte) -101);
                              if (var3 == 0) {
                                break L3;
                              } else {
                                break L9;
                              }
                            }
                            ((ke) this).field_b.a(2, (byte) -109);
                            if (var3 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          } else {
                            break L3;
                          }
                        }
                      }
                      ((ke) this).field_b.a(-31);
                      break L3;
                    }
                    if (this.a(-14845, false)) {
                      return;
                    } else {
                      if (var3 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  } else {
                    nm.f(param0 + 8749);
                    ve.field_Hc = false;
                    qi.a(false, (byte) -112);
                    return;
                  }
                }
              }
            }
            stackOut_31_0 = param0;
            stackOut_31_1 = -8622;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            break L1;
          }
          L11: {
            if (stackIn_32_0 == stackIn_32_1) {
              break L11;
            } else {
              ((ke) this).field_w = 87;
              break L11;
            }
          }
          ((ke) this).field_b.a(this.a(400, bh.field_g, pm.field_f), -20563, this.a(400, he.field_S, nf.field_h));
          boolean discarded$1 = this.a(-14845, true);
          return;
        }
    }

    private final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ec var7 = null;
        String var8 = null;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        L0: {
          var9 = client.field_A ? 1 : 0;
          var2 = -(((ke) this).field_u >> -1889653886) + (640 + -(640 * (((ke) this).field_o * ((ke) this).field_o) / 400));
          if (((ke) this).field_t > 0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var3 = stackIn_3_0;
          if (3 > ((ke) this).field_t) {
            stackOut_5_0 = ((ke) this).field_b.field_l;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = ((ke) this).field_b.field_l + -1;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        var4 = stackIn_6_0;
        var5 = var3;
        L2: while (true) {
          L3: {
            L4: {
              if (var5 >= var4) {
                break L4;
              } else {
                vk.a(((ke) this).field_f[var5].field_r, (byte) 50, on.field_e, ((ke) this).field_f[var5].field_n, ((ke) this).field_f[var5].field_m, ((ke) this).field_f[var5].field_l + var2);
                var6 = 16687906;
                stackOut_8_0 = var5;
                stackOut_8_1 = ((ke) this).field_b.field_h;
                stackIn_13_0 = stackOut_8_0;
                stackIn_13_1 = stackOut_8_1;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                if (var9 != 0) {
                  break L3;
                } else {
                  L5: {
                    if (stackIn_9_0 != stackIn_9_1) {
                      break L5;
                    } else {
                      var6 = 16777215;
                      break L5;
                    }
                  }
                  var7 = ((ke) this).field_f[var5];
                  var8 = var7.field_o;
                  int discarded$2 = ga.a(var7.field_n, 1, var7.field_m, var8, 1, var7.field_r, var6, (mm) (Object) a.field_t, (byte) -125, 1, var2 + var7.field_l);
                  var5++;
                  if (var9 == 0) {
                    continue L2;
                  } else {
                    break L4;
                  }
                }
              }
            }
            stackOut_12_0 = param0;
            stackOut_12_1 = 16687906;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            break L3;
          }
          L6: {
            if (stackIn_13_0 == stackIn_13_1) {
              break L6;
            } else {
              ((ke) this).field_c = 100;
              break L6;
            }
          }
          return;
        }
    }

    private final boolean c(boolean param0, int param1) {
        int var3 = 0;
        L0: {
          this.h(118);
          var3 = -1;
          if (-1 < (((ke) this).field_b.field_h ^ -1)) {
            break L0;
          } else {
            var3 = ((ke) this).field_f[((ke) this).field_b.field_h].field_d;
            break L0;
          }
        }
        L1: {
          if (20 != var3) {
            break L1;
          } else {
            if (!((ke) this).field_b.b((byte) 114)) {
              break L1;
            } else {
              og.a(false, 5, true);
              nm.f(-72);
              return true;
            }
          }
        }
        L2: {
          L3: {
            if ((var3 ^ -1) == -20) {
              break L3;
            } else {
              if ((var3 ^ -1) == -11) {
                break L3;
              } else {
                if (3 == var3) {
                  break L3;
                } else {
                  if (13 == var3) {
                    break L3;
                  } else {
                    if (param0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
            }
          }
          if (((ke) this).field_b.b((byte) 114)) {
            L4: {
              if (-14 != (var3 ^ -1)) {
                break L4;
              } else {
                he.field_db = false;
                break L4;
              }
            }
            L5: {
              L6: {
                lk.field_F = false;
                if ((var3 ^ -1) == -4) {
                  break L6;
                } else {
                  if (13 == var3) {
                    break L6;
                  } else {
                    break L5;
                  }
                }
              }
              fm.field_e = false;
              mg.field_Zb = false;
              break L5;
            }
            qi.a(param0, (byte) -102);
            nm.f(115);
            return true;
          } else {
            break L2;
          }
        }
        L7: {
          if (param1 >= 119) {
            break L7;
          } else {
            ((ke) this).b((byte) -109);
            break L7;
          }
        }
        return false;
    }

    final static void a(byte param0) {
        uf var1 = null;
        int var2 = 0;
        tj var3_ref_tj = null;
        long var3 = 0L;
        int var3_int = 0;
        ve var3_ref_ve = null;
        ve var4_ref_ve = null;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        ve var6_ref = null;
        tj var7 = null;
        tj var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        uf var12 = null;
        tj var13 = null;
        ve var14 = null;
        tj var15 = null;
        Object var16 = null;
        Object var17 = null;
        Object var18 = null;
        ve var18_ref = null;
        tj var19 = null;
        tj var20 = null;
        String var21 = null;
        String var22 = null;
        tj var23 = null;
        tj var24 = null;
        String var25 = null;
        String var26 = null;
        ve var27 = null;
        ve var28 = null;
        ve var29 = null;
        boolean stackIn_17_0 = false;
        int stackIn_26_0 = 0;
        tj stackIn_134_0 = null;
        tj stackIn_135_0 = null;
        tj stackIn_136_0 = null;
        int stackIn_136_1 = 0;
        int stackIn_174_0 = 0;
        tj stackIn_180_0 = null;
        tj stackIn_181_0 = null;
        tj stackIn_182_0 = null;
        int stackIn_182_1 = 0;
        boolean stackOut_16_0 = false;
        int stackOut_25_0 = 0;
        tj stackOut_133_0 = null;
        tj stackOut_135_0 = null;
        int stackOut_135_1 = 0;
        tj stackOut_134_0 = null;
        int stackOut_134_1 = 0;
        int stackOut_173_0 = 0;
        int stackOut_172_0 = 0;
        tj stackOut_179_0 = null;
        tj stackOut_181_0 = null;
        int stackOut_181_1 = 0;
        tj stackOut_180_0 = null;
        int stackOut_180_1 = 0;
        L0: {
          var16 = null;
          var17 = null;
          var18 = null;
          var11 = client.field_A ? 1 : 0;
          if (param0 >= 85) {
            break L0;
          } else {
            field_n = null;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              L4: {
                var12 = de.field_V;
                var1 = var12;
                var2 = ((wl) (Object) var1).d((byte) -114);
                if (-1 == (var2 ^ -1)) {
                  break L4;
                } else {
                  if ((var2 ^ -1) == -2) {
                    break L4;
                  } else {
                    if (-3 == (var2 ^ -1)) {
                      break L4;
                    } else {
                      if (var2 == 3) {
                        break L4;
                      } else {
                        if (var2 != 4) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
              }
              tj dupTemp$3 = (tj) (Object) oc.field_b.c((byte) 117);
              var13 = dupTemp$3;
              var3_ref_tj = dupTemp$3;
              L5: while (true) {
                L6: {
                  L7: {
                    if (var13 == null) {
                      break L7;
                    } else {
                      var13.b((byte) 110);
                      var13.e((byte) 73);
                      var3_ref_tj = (tj) (Object) oc.field_b.d(true);
                      if (var11 != 0) {
                        break L6;
                      } else {
                        if (var11 == 0) {
                          continue L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  var3_ref_tj = (tj) (Object) ob.field_i.c(-9443);
                  break L6;
                }
                L8: while (true) {
                  L9: {
                    L10: {
                      if (var3_ref_tj == null) {
                        break L10;
                      } else {
                        stackOut_16_0 = var3_ref_tj.field_bc;
                        stackIn_26_0 = stackOut_16_0 ? 1 : 0;
                        stackIn_17_0 = stackOut_16_0;
                        if (var11 != 0) {
                          break L9;
                        } else {
                          L11: {
                            L12: {
                              if (stackIn_17_0) {
                                break L12;
                              } else {
                                if (!var3_ref_tj.field_fc) {
                                  break L11;
                                } else {
                                  break L12;
                                }
                              }
                            }
                            L13: {
                              if (var3_ref_tj.field_fc) {
                                var3_ref_tj.field_fc = false;
                                cj.field_a = cj.field_a - 1;
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                            var3_ref_tj.field_bc = false;
                            wk.a((byte) 94, var3_ref_tj);
                            break L11;
                          }
                          var3_ref_tj = (tj) (Object) ob.field_i.b(-99);
                          if (var11 == 0) {
                            continue L8;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    stackOut_25_0 = var2;
                    stackIn_26_0 = stackOut_25_0;
                    break L9;
                  }
                  L14: {
                    if (stackIn_26_0 != 1) {
                      break L14;
                    } else {
                      if (cd.field_m != null) {
                        ub.field_c = cd.field_m.field_Vb;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                  }
                  L15: {
                    L16: {
                      if (4 == var2) {
                        break L16;
                      } else {
                        cd.field_m = null;
                        if (var11 == 0) {
                          break L15;
                        } else {
                          break L16;
                        }
                      }
                    }
                    var3_int = ((wl) (Object) var1).e(3);
                    cd.field_m = new ve(j.field_b);
                    cd.field_m.a((long)var3_int, (byte) 111);
                    wg.a(false, (wl) (Object) var1, cd.field_m, (byte) -49);
                    km.field_C = 0L;
                    break L15;
                  }
                  L17: {
                    L18: {
                      if (2 == var2) {
                        break L18;
                      } else {
                        if (3 == var2) {
                          break L18;
                        } else {
                          g.field_N = null;
                          if (var11 == 0) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                    }
                    if (g.field_N == null) {
                      g.field_N = new ve(j.field_b);
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  L19: {
                    if (var2 == 3) {
                      break L19;
                    } else {
                      fj.field_h = false;
                      if (var11 == 0) {
                        break L1;
                      } else {
                        break L19;
                      }
                    }
                  }
                  fj.field_h = true;
                  var3_int = 0;
                  L20: while (true) {
                    L21: {
                      L22: {
                        if (kk.field_l.length <= var3_int) {
                          break L22;
                        } else {
                          kk.field_l[var3_int] = ((wl) (Object) var12).g((byte) -101);
                          var3_int++;
                          if (var11 != 0) {
                            break L21;
                          } else {
                            if (var11 == 0) {
                              continue L20;
                            } else {
                              break L22;
                            }
                          }
                        }
                      }
                      qa.field_x = ((wl) (Object) var1).d((byte) -95);
                      jb.field_c = ((wl) (Object) var1).d((byte) -128);
                      break L21;
                    }
                    var3_int = 0;
                    L23: while (true) {
                      L24: {
                        if ((v.field_a.length ^ -1) >= (var3_int ^ -1)) {
                          break L24;
                        } else {
                          v.field_a[var3_int] = ((wl) (Object) var12).g((byte) -119);
                          var3_int++;
                          if (var11 != 0) {
                            break L2;
                          } else {
                            if (var11 == 0) {
                              continue L23;
                            } else {
                              break L24;
                            }
                          }
                        }
                      }
                      if (var11 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
            }
            L25: {
              if (var2 == 5) {
                break L25;
              } else {
                L26: {
                  if ((var2 ^ -1) == -7) {
                    break L26;
                  } else {
                    L27: {
                      if (-8 == (var2 ^ -1)) {
                        break L27;
                      } else {
                        L28: {
                          if (8 != var2) {
                            break L28;
                          } else {
                            L29: {
                              var3_int = ((wl) (Object) var1).e(3);
                              var4_ref_ve = (ve) (Object) tg.field_b.a(24710, (long)var3_int);
                              if (var4_ref_ve != null) {
                                break L29;
                              } else {
                                var4_ref_ve = new ve(j.field_b);
                                tg.field_b.a((be) (Object) var4_ref_ve, -1, (long)var3_int);
                                break L29;
                              }
                            }
                            wg.a(true, (wl) (Object) var1, var4_ref_ve, (byte) -89);
                            pj.a(var4_ref_ve, (byte) -50);
                            if (var11 == 0) {
                              break L2;
                            } else {
                              break L28;
                            }
                          }
                        }
                        L30: {
                          if (-10 != (var2 ^ -1)) {
                            break L30;
                          } else {
                            L31: {
                              var3_int = ((wl) (Object) var1).e(3);
                              var4 = ((wl) (Object) var1).d((byte) -41);
                              var28 = (ve) (Object) tg.field_b.a(24710, (long)var3_int);
                              if (var28 != null) {
                                L32: {
                                  L33: {
                                    if ((var4 ^ -1) == -1) {
                                      break L33;
                                    } else {
                                      var28.field_Rb = oa.field_a;
                                      var28.field_oc = var4;
                                      if (var11 == 0) {
                                        break L32;
                                      } else {
                                        break L33;
                                      }
                                    }
                                  }
                                  var28.b((byte) 127);
                                  break L32;
                                }
                                var28.e((byte) 98);
                                break L31;
                              } else {
                                break L31;
                              }
                            }
                            if (var11 == 0) {
                              break L2;
                            } else {
                              break L30;
                            }
                          }
                        }
                        L34: {
                          if (-11 == (var2 ^ -1)) {
                            break L34;
                          } else {
                            L35: {
                              L36: {
                                if ((var2 ^ -1) == -12) {
                                  break L36;
                                } else {
                                  if (12 != var2) {
                                    break L35;
                                  } else {
                                    break L36;
                                  }
                                }
                              }
                              L37: {
                                var3_int = ((wl) (Object) var1).e(3);
                                var29 = (ve) (Object) tg.field_b.a(24710, (long)var3_int);
                                if (var29 != null) {
                                  L38: {
                                    L39: {
                                      if ((var2 ^ -1) != -12) {
                                        break L39;
                                      } else {
                                        var29.field_Zb = true;
                                        if (var11 == 0) {
                                          break L38;
                                        } else {
                                          break L39;
                                        }
                                      }
                                    }
                                    var29.field_Ob = true;
                                    break L38;
                                  }
                                  pj.a(var29, (byte) -50);
                                  break L37;
                                } else {
                                  break L37;
                                }
                              }
                              if (var11 == 0) {
                                break L2;
                              } else {
                                break L35;
                              }
                            }
                            L40: {
                              if ((var2 ^ -1) != -14) {
                                break L40;
                              } else {
                                L41: {
                                  var3_int = ((wl) (Object) var1).e(3);
                                  var4 = ((wl) (Object) var1).d((byte) -49);
                                  var18_ref = (ve) (Object) tg.field_b.a(24710, (long)var3_int);
                                  if (var18_ref == null) {
                                    break L41;
                                  } else {
                                    L42: {
                                      var27 = var18_ref;
                                      var6_ref = var27;
                                      var18_ref.field_Ob = false;
                                      var27.field_Zb = false;
                                      if (0 == var4) {
                                        break L42;
                                      } else {
                                        var18_ref.field_Rb = oa.field_a;
                                        var18_ref.field_oc = var4;
                                        break L42;
                                      }
                                    }
                                    pj.a(var18_ref, (byte) -50);
                                    break L41;
                                  }
                                }
                                if (var11 == 0) {
                                  break L2;
                                } else {
                                  break L40;
                                }
                              }
                            }
                            L43: {
                              L44: {
                                if (var2 == 14) {
                                  break L44;
                                } else {
                                  if (var2 != 16) {
                                    break L43;
                                  } else {
                                    break L44;
                                  }
                                }
                              }
                              L45: {
                                var3 = ((wl) (Object) var1).f((byte) -108);
                                var19 = ma.a(-119, var3);
                                if (var19 != null) {
                                  L46: {
                                    L47: {
                                      if (14 == var2) {
                                        break L47;
                                      } else {
                                        if (var19.field_fc) {
                                          break L46;
                                        } else {
                                          var19.field_fc = true;
                                          cj.field_a = cj.field_a + 1;
                                          if (var11 == 0) {
                                            break L46;
                                          } else {
                                            break L47;
                                          }
                                        }
                                      }
                                    }
                                    var19.field_bc = true;
                                    break L46;
                                  }
                                  wk.a((byte) 57, var19);
                                  break L45;
                                } else {
                                  break L45;
                                }
                              }
                              if (var11 == 0) {
                                break L2;
                              } else {
                                break L43;
                              }
                            }
                            L48: {
                              if ((var2 ^ -1) == -16) {
                                break L48;
                              } else {
                                if ((var2 ^ -1) == -18) {
                                  break L48;
                                } else {
                                  L49: {
                                    if (18 == var2) {
                                      break L49;
                                    } else {
                                      L50: {
                                        if (19 == var2) {
                                          break L50;
                                        } else {
                                          L51: {
                                            if (20 != var2) {
                                              break L51;
                                            } else {
                                              wg.a(false, (wl) (Object) var1, cd.field_m, (byte) -103);
                                              if (var11 == 0) {
                                                break L2;
                                              } else {
                                                break L51;
                                              }
                                            }
                                          }
                                          L52: {
                                            if (21 == var2) {
                                              break L52;
                                            } else {
                                              L53: {
                                                if (22 != var2) {
                                                  break L53;
                                                } else {
                                                  de.field_R = ((wl) (Object) var1).e(3);
                                                  rf.field_o = ((wl) (Object) var1).a(-104);
                                                  if (var11 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L53;
                                                  }
                                                }
                                              }
                                              L54: {
                                                if (23 != var2) {
                                                  break L54;
                                                } else {
                                                  uc.field_g = ((wl) (Object) var1).f((byte) -108);
                                                  if (var11 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L54;
                                                  }
                                                }
                                              }
                                              qb.a((Throwable) null, 16408, "L1: " + qk.d((byte) 49));
                                              si.a(117);
                                              if (var11 == 0) {
                                                break L2;
                                              } else {
                                                break L52;
                                              }
                                            }
                                          }
                                          L55: {
                                            L56: {
                                              var3_int = ((wl) (Object) var1).e(3);
                                              if (-1 != (var3_int ^ -1)) {
                                                break L56;
                                              } else {
                                                km.field_C = 0L;
                                                if (var11 == 0) {
                                                  break L55;
                                                } else {
                                                  break L56;
                                                }
                                              }
                                            }
                                            km.field_C = ik.a(4) + (long)var3_int;
                                            break L55;
                                          }
                                          if (var11 == 0) {
                                            break L2;
                                          } else {
                                            break L50;
                                          }
                                        }
                                      }
                                      L57: {
                                        var3 = ((wl) (Object) var1).f((byte) -108);
                                        var5 = ((wl) (Object) var1).d((byte) -41);
                                        var20 = bj.a(var3, (byte) 79);
                                        if (var20 != null) {
                                          L58: {
                                            L59: {
                                              if (var5 == 0) {
                                                break L59;
                                              } else {
                                                var20.field_hc = var5;
                                                var20.field_Qb = oa.field_a;
                                                if (var11 == 0) {
                                                  break L58;
                                                } else {
                                                  break L59;
                                                }
                                              }
                                            }
                                            var20.b((byte) 105);
                                            break L58;
                                          }
                                          var20.e((byte) 84);
                                          cd.field_m.field_rc = cd.field_m.field_rc - 1;
                                          break L57;
                                        } else {
                                          break L57;
                                        }
                                      }
                                      if (var11 == 0) {
                                        break L2;
                                      } else {
                                        break L49;
                                      }
                                    }
                                  }
                                  L60: {
                                    var3 = ((wl) (Object) var1).f((byte) -108);
                                    var21 = ((wl) (Object) var1).c((byte) -38);
                                    var22 = ((wl) (Object) var1).c((byte) -38);
                                    var7 = bj.a(var3, (byte) 63);
                                    if (var7 != null) {
                                      break L60;
                                    } else {
                                      var7 = new tj(var21, var22, var3);
                                      hn.field_h.a((be) (Object) var7, -1, var3);
                                      cd.field_m.field_rc = cd.field_m.field_rc + 1;
                                      break L60;
                                    }
                                  }
                                  L61: {
                                    var7.field_Ub = ((wl) (Object) var1).e(3);
                                    var8_int = ((wl) (Object) var1).a(-69);
                                    var7.field_Xb = var8_int >> 1139399329;
                                    stackOut_133_0 = (tj) var7;
                                    stackIn_135_0 = stackOut_133_0;
                                    stackIn_134_0 = stackOut_133_0;
                                    if ((1 & var8_int ^ -1) == -1) {
                                      stackOut_135_0 = (tj) (Object) stackIn_135_0;
                                      stackOut_135_1 = 0;
                                      stackIn_136_0 = stackOut_135_0;
                                      stackIn_136_1 = stackOut_135_1;
                                      break L61;
                                    } else {
                                      stackOut_134_0 = (tj) (Object) stackIn_134_0;
                                      stackOut_134_1 = 1;
                                      stackIn_136_0 = stackOut_134_0;
                                      stackIn_136_1 = stackOut_134_1;
                                      break L61;
                                    }
                                  }
                                  stackIn_136_0.field_ec = stackIn_136_1 != 0;
                                  var7.field_dc = ((wl) (Object) var1).d((byte) -29);
                                  var7.field_Sb = ((wl) (Object) var1).d((byte) -79);
                                  oc.field_b.a((bh) (Object) var7, 2777);
                                  if (var11 == 0) {
                                    break L2;
                                  } else {
                                    break L48;
                                  }
                                }
                              }
                            }
                            L62: {
                              var3 = ((wl) (Object) var1).f((byte) -108);
                              var5 = ((wl) (Object) var1).d((byte) -87);
                              var23 = ma.a(-119, var3);
                              if (var23 == null) {
                                break L62;
                              } else {
                                L63: {
                                  if (-1 == (var5 ^ -1)) {
                                    break L63;
                                  } else {
                                    var23.field_Qb = oa.field_a;
                                    var23.field_hc = var5;
                                    break L63;
                                  }
                                }
                                L64: {
                                  L65: {
                                    if ((var2 ^ -1) != -16) {
                                      break L65;
                                    } else {
                                      var23.field_bc = false;
                                      if (var11 == 0) {
                                        break L64;
                                      } else {
                                        break L65;
                                      }
                                    }
                                  }
                                  if (var23.field_fc) {
                                    cj.field_a = cj.field_a - 1;
                                    var23.field_fc = false;
                                    break L64;
                                  } else {
                                    break L64;
                                  }
                                }
                                wk.a((byte) 34, var23);
                                break L62;
                              }
                            }
                            if (var11 == 0) {
                              break L2;
                            } else {
                              break L34;
                            }
                          }
                        }
                        ve dupTemp$4 = (ve) (Object) h.field_b.c((byte) 121);
                        var14 = dupTemp$4;
                        var3_ref_ve = dupTemp$4;
                        L66: while (true) {
                          L67: {
                            if (var14 == null) {
                              break L67;
                            } else {
                              var14.b((byte) 115);
                              var14.e((byte) 118);
                              var3_ref_ve = (ve) (Object) h.field_b.d(true);
                              if (var11 != 0) {
                                break L2;
                              } else {
                                if (var11 == 0) {
                                  continue L66;
                                } else {
                                  break L67;
                                }
                              }
                            }
                          }
                          if (var11 == 0) {
                            break L2;
                          } else {
                            break L27;
                          }
                        }
                      }
                    }
                    tj dupTemp$5 = (tj) (Object) i.field_b.c((byte) 43);
                    var15 = dupTemp$5;
                    var3_ref_tj = dupTemp$5;
                    L68: while (true) {
                      L69: {
                        L70: {
                          if (var15 == null) {
                            break L70;
                          } else {
                            var15.b((byte) 108);
                            var15.e((byte) 112);
                            var3_ref_tj = (tj) (Object) i.field_b.d(true);
                            if (var11 != 0) {
                              break L69;
                            } else {
                              if (var11 == 0) {
                                continue L68;
                              } else {
                                break L70;
                              }
                            }
                          }
                        }
                        cj.field_a = 0;
                        break L69;
                      }
                      if (var11 == 0) {
                        break L2;
                      } else {
                        break L26;
                      }
                    }
                  }
                }
                L71: {
                  var3 = ((wl) (Object) var1).f((byte) -108);
                  var5 = ((wl) (Object) var1).d((byte) -89);
                  var24 = ma.a(-122, var3);
                  if (var24 != null) {
                    L72: {
                      if (!var24.field_fc) {
                        break L72;
                      } else {
                        var24.field_fc = false;
                        cj.field_a = cj.field_a - 1;
                        break L72;
                      }
                    }
                    L73: {
                      L74: {
                        if (-1 == (var5 ^ -1)) {
                          break L74;
                        } else {
                          var24.field_hc = var5;
                          var24.field_Qb = oa.field_a;
                          if (var11 == 0) {
                            break L73;
                          } else {
                            break L74;
                          }
                        }
                      }
                      var24.b((byte) 114);
                      break L73;
                    }
                    var24.e((byte) 95);
                    break L71;
                  } else {
                    break L71;
                  }
                }
                if (var11 == 0) {
                  break L2;
                } else {
                  break L25;
                }
              }
            }
            L75: {
              var3 = ((wl) (Object) var1).f((byte) -108);
              var25 = ((wl) (Object) var1).c((byte) -38);
              var6 = ((wl) (Object) var1).c((byte) -38);
              var26 = ((wl) (Object) var1).c((byte) -38);
              var8 = ma.a(-102, var3);
              if (var6.equals((Object) (Object) "")) {
                stackOut_173_0 = 0;
                stackIn_174_0 = stackOut_173_0;
                break L75;
              } else {
                stackOut_172_0 = 1;
                stackIn_174_0 = stackOut_172_0;
                break L75;
              }
            }
            L76: {
              L77: {
                var9 = stackIn_174_0;
                if (var8 != null) {
                  break L77;
                } else {
                  var8 = new tj(var25, var26, var3);
                  ob.field_i.a((be) (Object) var8, -1, var3);
                  if (var11 == 0) {
                    break L76;
                  } else {
                    break L77;
                  }
                }
              }
              if (var9 != 0) {
                var8.a((byte) 19, var26, var25);
                break L76;
              } else {
                break L76;
              }
            }
            L78: {
              var8.field_Nb = ik.a(4) - (long)((wl) (Object) var1).i(7553);
              var8.field_Ub = ((wl) (Object) var1).e(3);
              var10 = ((wl) (Object) var1).a(-28);
              stackOut_179_0 = (tj) var8;
              stackIn_181_0 = stackOut_179_0;
              stackIn_180_0 = stackOut_179_0;
              if ((var10 & 1 ^ -1) == -1) {
                stackOut_181_0 = (tj) (Object) stackIn_181_0;
                stackOut_181_1 = 0;
                stackIn_182_0 = stackOut_181_0;
                stackIn_182_1 = stackOut_181_1;
                break L78;
              } else {
                stackOut_180_0 = (tj) (Object) stackIn_180_0;
                stackOut_180_1 = 1;
                stackIn_182_0 = stackOut_180_0;
                stackIn_182_1 = stackOut_180_1;
                break L78;
              }
            }
            stackIn_182_0.field_ec = stackIn_182_1 != 0;
            var8.field_Xb = var10 >> -125735103;
            var8.field_dc = ((wl) (Object) var1).d((byte) -98);
            var8.field_Sb = ((wl) (Object) var1).d((byte) -128);
            wk.a((byte) 112, var8);
            break L2;
          }
          break L1;
        }
    }

    final static int a(int param0, int param1) {
        if (param0 != 2047) {
            field_h = null;
        }
        return qg.field_b[param1 & 2047];
    }

    final void c(byte param0) {
        if (param0 != -75) {
            ((ke) this).field_r = true;
        }
        this.a(false, 15764);
        int var2 = 640 + (-(((ke) this).field_o * ((ke) this).field_o * 640 / 400) - (((ke) this).field_u >> -1363351294));
        ed.a(16777215, var2 + 320, si.field_g, 120, (byte) 75, (mm) (Object) w.field_kb);
        ed.a(16777215, var2 + 320, gf.a(-125, ((ke) this).field_s, ((ke) this).field_j, ((ke) this).field_r), 140, (byte) 75, (mm) (Object) w.field_kb);
        ed.a(16777215, 320 + var2, ri.a(param0 ^ -75, ((ke) this).field_s, ((ke) this).field_j, ((ke) this).field_r), 240, (byte) 75, (mm) (Object) w.field_kb);
        ed.a(16777215, var2 + 320, kk.a(((ke) this).field_j, ((ke) this).field_s, ((ke) this).field_r, true), 300, (byte) 75, (mm) (Object) w.field_kb);
    }

    final void i(int param0) {
        int var2 = 0;
        ck var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String[] var18 = null;
        String[] var20 = null;
        int[] var22 = null;
        int[] var23 = null;
        Object stackIn_16_0 = null;
        String stackIn_16_1 = null;
        Object stackIn_25_0 = null;
        String stackIn_25_1 = null;
        Object stackIn_36_0 = null;
        String stackIn_36_1 = null;
        Object stackOut_15_0 = null;
        String stackOut_15_1 = null;
        Object stackOut_24_0 = null;
        String stackOut_24_1 = null;
        Object stackOut_35_0 = null;
        String stackOut_35_1 = null;
        L0: {
          var15 = client.field_A ? 1 : 0;
          var2 = -(((ke) this).field_u >> 174174562) + (-(640 * ((ke) this).field_o * ((ke) this).field_o / 400) + 640);
          this.a(false, 15764);
          var3 = wh.field_f;
          var3.c(-(var3.field_K / 2) + 320, 45 + (-(var3.field_C / 2) - (var2 >> -1906814366)));
          if (null != ((ke) this).field_e) {
            break L0;
          } else {
            if (!ph.n(-30146)) {
              ((ke) this).field_e = am.a(3, false, 1, 1, 10);
              break L0;
            } else {
              break L0;
            }
          }
        }
        var4 = -44 / ((63 - param0) / 44);
        var5 = bf.a((byte) 107, gh.field_e, fc.field_e, ((ke) this).field_e);
        fl.a(105, 256, 16777215, vm.field_x, 125 - -var2, (mm) (Object) w.field_kb);
        kn.a((mm) (Object) w.field_kb, (byte) -39, 105, ng.field_g, 16777215, var2 + 400);
        kn.a((mm) (Object) w.field_kb, (byte) -39, 105, sl.field_b, 16777215, 545 + var2);
        var6_int = 0;
        L1: while (true) {
          L2: {
            if (-11 >= (var6_int ^ -1)) {
              break L2;
            } else {
              var7 = 16777215;
              kn.a((mm) (Object) w.field_kb, (byte) -39, 130 + var6_int * 20, 1 + var6_int + ".", var7, var2 + 115);
              var6_int++;
              if (var15 == 0) {
                continue L1;
              } else {
                break L2;
              }
            }
          }
          L3: {
            L4: {
              var6 = le.field_r;
              var7 = 1;
              if (null == ((ke) this).field_e) {
                break L4;
              } else {
                L5: {
                  if (((ke) this).field_e.field_p) {
                    break L5;
                  } else {
                    var6 = wm.field_k;
                    if (var15 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  L7: {
                    if (null != ((ke) this).field_e.field_r) {
                      var18 = ((ke) this).field_e.field_r[fc.field_e];
                      var22 = ((ke) this).field_e.field_u[fc.field_e];
                      var10 = 0;
                      L8: while (true) {
                        if (10 <= var10) {
                          break L6;
                        } else {
                          stackOut_15_0 = null;
                          stackOut_15_1 = var18[var10];
                          stackIn_36_0 = stackOut_15_0;
                          stackIn_36_1 = stackOut_15_1;
                          stackIn_16_0 = stackOut_15_0;
                          stackIn_16_1 = stackOut_15_1;
                          if (var15 != 0) {
                            break L3;
                          } else {
                            L9: {
                              if (stackIn_16_0 == (Object) (Object) stackIn_16_1) {
                                break L9;
                              } else {
                                L10: {
                                  var6 = null;
                                  var11 = 16769088;
                                  var12 = var22[var10];
                                  var13 = var12 >>> 869777032;
                                  if ((var5 ^ -1) == (var10 ^ -1)) {
                                    var11 = 16777215;
                                    break L10;
                                  } else {
                                    break L10;
                                  }
                                }
                                var14 = 1 + var12 % 256;
                                fl.a(130 + 20 * var10, 256, var11, var18[var10], 125 - -var2, (mm) (Object) se.field_S);
                                kn.a((mm) (Object) se.field_S, (byte) -39, 20 * var10 + 130, Integer.toString(var14), var11, var2 + 400);
                                kn.a((mm) (Object) se.field_S, (byte) -39, var10 * 20 + 130, Integer.toString(var13), var11, var2 + 545);
                                break L9;
                              }
                            }
                            var10++;
                            if (var15 == 0) {
                              continue L8;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                    } else {
                      var6 = dn.field_s;
                      if (var15 == 0) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  var20 = ((ke) this).field_e.field_r[fc.field_e];
                  var23 = ((ke) this).field_e.field_u[fc.field_e];
                  var10 = 0;
                  L11: while (true) {
                    if (10 <= var10) {
                      break L6;
                    } else {
                      stackOut_24_0 = null;
                      stackOut_24_1 = var20[var10];
                      stackIn_36_0 = stackOut_24_0;
                      stackIn_36_1 = stackOut_24_1;
                      stackIn_25_0 = stackOut_24_0;
                      stackIn_25_1 = stackOut_24_1;
                      if (var15 != 0) {
                        break L3;
                      } else {
                        L12: {
                          if (stackIn_25_0 == (Object) (Object) stackIn_25_1) {
                            break L12;
                          } else {
                            L13: {
                              var6 = null;
                              var11 = 16769088;
                              var12 = var23[var10];
                              var13 = var12 >>> 869777032;
                              if ((var5 ^ -1) == (var10 ^ -1)) {
                                var11 = 16777215;
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                            var14 = 1 + var12 % 256;
                            fl.a(130 + 20 * var10, 256, var11, var20[var10], 125 - -var2, (mm) (Object) se.field_S);
                            kn.a((mm) (Object) se.field_S, (byte) -39, 20 * var10 + 130, Integer.toString(var14), var11, var2 + 400);
                            kn.a((mm) (Object) se.field_S, (byte) -39, var10 * 20 + 130, Integer.toString(var13), var11, var2 + 545);
                            break L12;
                          }
                        }
                        var10++;
                        if (var15 == 0) {
                          continue L11;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                }
                if (-1 >= (var5 ^ -1)) {
                  break L4;
                } else {
                  if (null == gh.field_e) {
                    break L4;
                  } else {
                    if ((gh.field_e.field_x ^ -1) != -2) {
                      break L4;
                    } else {
                      fl.a(330, 256, 16777215, oa.field_f, var2 + 125, (mm) (Object) se.field_S);
                      var8 = gh.field_e.field_s[0];
                      var9 = var8 % 256 + 1;
                      kn.a((mm) (Object) se.field_S, (byte) -39, 330, Integer.toString(var9), 16777215, 400 + var2);
                      var10 = var8 >>> -1510192632;
                      var7 = 0;
                      kn.a((mm) (Object) se.field_S, (byte) -39, 330, Integer.toString(var10), 16777215, var2 + 545);
                      break L4;
                    }
                  }
                }
              }
            }
            stackOut_35_0 = null;
            stackOut_35_1 = (String) var6;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            break L3;
          }
          L14: {
            if (stackIn_36_0 != (Object) (Object) stackIn_36_1) {
              ed.a(16777215, 320 - -var2, var6, 220, (byte) 75, (mm) (Object) w.field_kb);
              break L14;
            } else {
              break L14;
            }
          }
          L15: {
            L16: {
              if (!ph.n(-30146)) {
                break L16;
              } else {
                ed.a(16777215, 320 + var2, lf.field_d, 330, (byte) 75, (mm) (Object) se.field_S);
                if (var15 == 0) {
                  break L15;
                } else {
                  break L16;
                }
              }
            }
            if (var7 != 0) {
              ed.a(16777215, var2 + 320, af.field_e, 330, (byte) 75, (mm) (Object) se.field_S);
              break L15;
            } else {
              break L15;
            }
          }
          return;
        }
    }

    final void i(byte param0) {
        if (param0 != 39) {
            return;
        }
        ((ke) this).field_b.a(-115);
        boolean discarded$0 = this.p(-1);
    }

    private final void a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        ec var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        qc var10_ref_qc = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        qc stackIn_28_0 = null;
        int stackIn_62_0 = 0;
        int stackIn_65_0 = 0;
        qc stackOut_27_0 = null;
        qc stackOut_26_0 = null;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_63_0 = 0;
        L0: {
          var15 = client.field_A ? 1 : 0;
          var3 = -(((ke) this).field_u >> -134113438) + (640 - ((ke) this).field_o * (((ke) this).field_o * 640) / 400);
          hk.a(4 + ((ke) this).field_w - -var3, ((ke) this).field_z - -4, ((ke) this).field_y - 8, -8 + ((ke) this).field_q, 0, 150);
          vk.a(((ke) this).field_q, (byte) 50, a.field_n, ((ke) this).field_y, ((ke) this).field_z, ((ke) this).field_w + var3);
          if (param1 == 15764) {
            break L0;
          } else {
            ((ke) this).field_r = false;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          L2: {
            L3: {
              if ((var4 ^ -1) <= (((ke) this).field_b.field_l ^ -1)) {
                break L3;
              } else {
                var5 = ((ke) this).field_f[var4];
                var6 = var5.field_o;
                var7 = var5.field_m;
                var8 = var5.field_r;
                if (var15 != 0) {
                  break L2;
                } else {
                  L4: {
                    if (param0) {
                      L5: {
                        var9 = var7;
                        var10 = var8;
                        if (-1 <= (var4 ^ -1)) {
                          break L5;
                        } else {
                          var7 -= 3;
                          var8 += 3;
                          break L5;
                        }
                      }
                      L6: {
                        if (((ke) this).field_b.field_l - 1 > var4) {
                          var8 += 3;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      hk.b(0, var9, 640, var10 + var9);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L7: {
                    L8: {
                      var9 = 16694016;
                      if ((var4 ^ -1) != (((ke) this).field_b.field_h ^ -1)) {
                        break L8;
                      } else {
                        var9 = 16777215;
                        vk.a(var8, (byte) 50, im.field_i, var5.field_n, var7, var3 + var5.field_l);
                        if (var15 == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    vk.a(var8, (byte) 50, on.field_e, var5.field_n, var7, var3 + var5.field_l);
                    break L7;
                  }
                  L9: {
                    if (-16 == (var5.field_d ^ -1)) {
                      L10: {
                        if ((kf.field_I.field_g.field_d & 1 << kf.field_I.field_P) != 0) {
                          break L10;
                        } else {
                          L11: {
                            if ((kf.field_I.field_g.field_d ^ -1) == -1) {
                              break L11;
                            } else {
                              var6 = pg.field_c;
                              if (-1 != (uf.field_A & 16 ^ -1)) {
                                break L9;
                              } else {
                                var9 = 16777215;
                                if (var15 == 0) {
                                  break L9;
                                } else {
                                  break L11;
                                }
                              }
                            }
                          }
                          var6 = kf.field_R;
                          if (var15 == 0) {
                            break L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                      var6 = e.field_a;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L12: {
                    if (var5.field_d != 17) {
                      break L12;
                    } else {
                      L13: {
                        if (kf.field_I == null) {
                          stackOut_27_0 = ce.field_C;
                          stackIn_28_0 = stackOut_27_0;
                          break L13;
                        } else {
                          stackOut_26_0 = kf.field_I;
                          stackIn_28_0 = stackOut_26_0;
                          break L13;
                        }
                      }
                      L14: {
                        var10_ref_qc = stackIn_28_0;
                        if (var10_ref_qc.field_W) {
                          break L14;
                        } else {
                          L15: {
                            if (0 == (1 << var10_ref_qc.field_P & var10_ref_qc.field_g.field_a)) {
                              break L15;
                            } else {
                              var6 = sc.field_h;
                              if (var15 == 0) {
                                break L12;
                              } else {
                                break L15;
                              }
                            }
                          }
                          L16: {
                            if (var10_ref_qc.field_g.field_a == 0) {
                              break L16;
                            } else {
                              L17: {
                                if ((uf.field_A & 16) == 0) {
                                  var9 = 16777215;
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              var6 = k.field_h;
                              if (var15 == 0) {
                                break L12;
                              } else {
                                break L16;
                              }
                            }
                          }
                          L18: {
                            if (((1 << var10_ref_qc.field_g.field_b) + -1 ^ -1) != ((var10_ref_qc.field_yb | 1 << var10_ref_qc.field_P) ^ -1)) {
                              break L18;
                            } else {
                              var6 = ig.field_Xb;
                              if (var15 == 0) {
                                break L12;
                              } else {
                                break L18;
                              }
                            }
                          }
                          var6 = ji.field_c;
                          if (var15 == 0) {
                            break L12;
                          } else {
                            break L14;
                          }
                        }
                      }
                      L19: {
                        if ((var10_ref_qc.field_g.field_a & 1 << var10_ref_qc.field_P) == 0) {
                          break L19;
                        } else {
                          var6 = rc.field_g;
                          if (var15 == 0) {
                            break L12;
                          } else {
                            break L19;
                          }
                        }
                      }
                      L20: {
                        if (-1 == (var10_ref_qc.field_g.field_a ^ -1)) {
                          break L20;
                        } else {
                          var6 = wj.field_Kb;
                          if (0 != (uf.field_A & 16)) {
                            break L12;
                          } else {
                            var9 = 16777215;
                            if (var15 == 0) {
                              break L12;
                            } else {
                              break L20;
                            }
                          }
                        }
                      }
                      L21: {
                        if ((1 << var10_ref_qc.field_g.field_b) - 1 == (1 << var10_ref_qc.field_P | var10_ref_qc.field_yb)) {
                          break L21;
                        } else {
                          var6 = ik.field_g;
                          if (var15 == 0) {
                            break L12;
                          } else {
                            break L21;
                          }
                        }
                      }
                      var6 = di.field_E;
                      break L12;
                    }
                  }
                  L22: {
                    L23: {
                      if (-7 == (var5.field_d ^ -1)) {
                        break L23;
                      } else {
                        if (var5.field_d == 7) {
                          break L23;
                        } else {
                          L24: {
                            if (-23 != (var5.field_d ^ -1)) {
                              break L24;
                            } else {
                              if ((var4 ^ -1) != (fc.field_e ^ -1)) {
                                break L24;
                              } else {
                                var9 = 16777215;
                                break L24;
                              }
                            }
                          }
                          L25: {
                            if ((var5.field_d ^ -1) != -24) {
                              break L25;
                            } else {
                              if (var4 != cj.field_c) {
                                break L25;
                              } else {
                                var9 = 16777215;
                                break L25;
                              }
                            }
                          }
                          int discarded$2 = ga.a(var5.field_n, 1, var7, var6, 20, var8, var9, (mm) (Object) a.field_t, (byte) -128, 1, var5.field_l - -var3);
                          if (var15 == 0) {
                            break L22;
                          } else {
                            break L23;
                          }
                        }
                      }
                    }
                    L26: {
                      var10 = a.field_t.a(pm.field_c);
                      var11 = a.field_t.a(fj.field_f);
                      if (var11 > var10) {
                        var10 = var11;
                        break L26;
                      } else {
                        break L26;
                      }
                    }
                    L27: {
                      var12 = (var10 + 5 + (-128 + var5.field_n)) / 2 + var5.field_l;
                      hk.a(-1 + var12 + var3, var7 + 11, 130, 8, 65793);
                      hk.a(1 + (var12 + var3), 13 + var7, 126, 4, var9);
                      if (-7 != (var5.field_d ^ -1)) {
                        stackOut_61_0 = a.field_g * 128 / 128;
                        stackIn_62_0 = stackOut_61_0;
                        break L27;
                      } else {
                        stackOut_60_0 = pb.field_d * 128 / 128;
                        stackIn_62_0 = stackOut_60_0;
                        break L27;
                      }
                    }
                    L28: {
                      var13 = stackIn_62_0;
                      int discarded$3 = ga.a(-5 + var12 - var5.field_l, 1, var7, var6, 20, var8, var9, (mm) (Object) a.field_t, (byte) -124, 2, var5.field_l - -var3);
                      if (-7 == (var5.field_d ^ -1)) {
                        stackOut_64_0 = 1;
                        stackIn_65_0 = stackOut_64_0;
                        break L28;
                      } else {
                        stackOut_63_0 = 3;
                        stackIn_65_0 = stackOut_63_0;
                        break L28;
                      }
                    }
                    var14 = stackIn_65_0;
                    tg.a(true, var14).c(var3 + (-9 + var12) - -var13, 6 + var7, 18, 18);
                    break L22;
                  }
                  L29: {
                    if ((var5.field_d ^ -1) != -3) {
                      break L29;
                    } else {
                      L30: {
                        if (-4 < (id.field_P ^ -1)) {
                          break L30;
                        } else {
                          if (!h.a(false)) {
                            break L29;
                          } else {
                            break L30;
                          }
                        }
                      }
                      hk.c(8 + (var3 + var5.field_l), var7 + 3, var5.field_n - 16, 2);
                      hk.c(4 + (var3 + var5.field_l), var7 - -5, var5.field_n + -8, -10 + var8);
                      hk.c(8 + (var3 + var5.field_l), -5 + (var8 + var7), -16 + var5.field_n, 2);
                      break L29;
                    }
                  }
                  var4++;
                  if (var15 == 0) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
              }
            }
            hk.d();
            break L2;
          }
          return;
        }
    }

    final void c(int param0, boolean param1) {
        ((ke) this).field_b.a(param1, 117, this.a(400, bh.field_g, pm.field_f));
        if (param0 != -1) {
            ((ke) this).field_z = -92;
        }
    }

    final void l(byte param0) {
        int var2 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_35_0 = 0;
        int stackOut_2_0 = 0;
        boolean stackOut_34_0 = false;
        var4 = client.field_A ? 1 : 0;
        var2 = 39 / ((47 - param0) / 51);
        h.a((ke) this, (byte) 95);
        L0: while (true) {
          L1: {
            L2: {
              if (!ab.c((byte) -124)) {
                break L2;
              } else {
                stackOut_2_0 = wh.field_c ^ -1;
                stackIn_35_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var4 != 0) {
                  break L1;
                } else {
                  if (stackIn_3_0 != -14) {
                    L3: {
                      L4: {
                        if (ph.n(-30146)) {
                          break L4;
                        } else {
                          L5: {
                            ((ke) this).field_b.d(0);
                            if ((wh.field_c ^ -1) != -97) {
                              break L5;
                            } else {
                              fc.field_e = (-1 + (3 + fc.field_e)) % 3;
                              ((ke) this).field_b.a(fc.field_e, (byte) -113);
                              nm.f(4);
                              ((ke) this).field_b.field_o = false;
                              break L5;
                            }
                          }
                          L6: {
                            if ((wh.field_c ^ -1) != -98) {
                              break L6;
                            } else {
                              fc.field_e = (fc.field_e - -1) % 3;
                              ((ke) this).field_b.a(fc.field_e, (byte) -75);
                              nm.f(-117);
                              ((ke) this).field_b.field_o = false;
                              break L6;
                            }
                          }
                          L7: {
                            if (wh.field_c == 98) {
                              L8: {
                                if (((ke) this).field_b.field_h >= 3) {
                                  break L8;
                                } else {
                                  ((ke) this).field_b.a(-1 + ((ke) this).field_b.field_l, (byte) -76);
                                  if (var4 == 0) {
                                    break L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              L9: {
                                if (((ke) this).field_b.field_h == 3) {
                                  break L9;
                                } else {
                                  ((ke) this).field_b.a(((ke) this).field_b.field_h + -1, (byte) -110);
                                  if (var4 == 0) {
                                    break L7;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              ((ke) this).field_b.a(fc.field_e, (byte) -113);
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          if (-100 == (wh.field_c ^ -1)) {
                            L10: {
                              if ((((ke) this).field_b.field_h ^ -1) > -1) {
                                break L10;
                              } else {
                                if (-1 + ((ke) this).field_b.field_l == ((ke) this).field_b.field_h) {
                                  break L10;
                                } else {
                                  L11: {
                                    if (-4 >= (((ke) this).field_b.field_h ^ -1)) {
                                      break L11;
                                    } else {
                                      ((ke) this).field_b.a(3, (byte) -126);
                                      if (var4 == 0) {
                                        break L3;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  ((ke) this).field_b.a(((ke) this).field_b.field_h + 1, (byte) -95);
                                  if (var4 == 0) {
                                    break L3;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                            }
                            ((ke) this).field_b.a(fc.field_e, (byte) -123);
                            if (var4 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          } else {
                            break L3;
                          }
                        }
                      }
                      ((ke) this).field_b.a(-113);
                      break L3;
                    }
                    if (!this.c(false, (byte) -96)) {
                      if (var4 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    } else {
                      return;
                    }
                  } else {
                    nm.f(-77);
                    fm.field_e = false;
                    qi.a(false, (byte) -107);
                    return;
                  }
                }
              }
            }
            ((ke) this).field_b.a(this.a(400, bh.field_g, pm.field_f), -20563, this.a(400, he.field_S, nf.field_h));
            stackOut_34_0 = this.c(true, (byte) -76);
            stackIn_35_0 = stackOut_34_0 ? 1 : 0;
            break L1;
          }
          return;
        }
    }

    final void a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = client.field_A ? 1 : 0;
        var3 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (((ke) this).field_b.field_l <= var3) {
                break L2;
              } else {
                ((ke) this).field_f[var3].field_m = ((ke) this).field_f[var3].field_m + param0;
                var3++;
                if (var4 != 0) {
                  break L1;
                } else {
                  if (var4 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            this.a(false, 15764);
            var3 = 0;
            break L1;
          }
          L3: {
            if (param1 == -54) {
              break L3;
            } else {
              ((ke) this).field_v = null;
              break L3;
            }
          }
          L4: while (true) {
            L5: {
              if ((((ke) this).field_b.field_l ^ -1) >= (var3 ^ -1)) {
                break L5;
              } else {
                ((ke) this).field_f[var3].field_m = ((ke) this).field_f[var3].field_m - param0;
                var3++;
                if (var4 != 0) {
                  break L5;
                } else {
                  if (var4 == 0) {
                    continue L4;
                  } else {
                    break L5;
                  }
                }
              }
            }
            return;
          }
        }
    }

    private final boolean c(boolean param0, byte param1) {
        int var3 = 0;
        L0: {
          this.h(123);
          var3 = -1;
          if ((((ke) this).field_b.field_h ^ -1) <= -1) {
            var3 = ((ke) this).field_f[((ke) this).field_b.field_h].field_d;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (20 != var3) {
            break L1;
          } else {
            if (!((ke) this).field_b.b((byte) 114)) {
              break L1;
            } else {
              og.a(false, 8, true);
              nm.f(-11);
              return true;
            }
          }
        }
        L2: {
          L3: {
            if (var3 == 3) {
              break L3;
            } else {
              if ((var3 ^ -1) == -14) {
                break L3;
              } else {
                if (param0) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
          }
          if (!((ke) this).field_b.b((byte) 114)) {
            break L2;
          } else {
            L4: {
              fm.field_e = false;
              if (var3 == 13) {
                he.field_db = false;
                break L4;
              } else {
                break L4;
              }
            }
            qi.a(param0, (byte) -103);
            nm.f(11);
            return true;
          }
        }
        L5: {
          if (!param0) {
            break L5;
          } else {
            if ((ig.field_Yb ^ -1) == -1) {
              break L5;
            } else {
              if (((ke) this).field_b.field_h == -1) {
                break L5;
              } else {
                fc.field_e = ((ke) this).field_b.field_h;
                ((ke) this).field_b.a(fc.field_e, (byte) -103);
                nm.f(119);
                return true;
              }
            }
          }
        }
        if (param1 <= -41) {
          return false;
        } else {
          field_h = null;
          return false;
        }
    }

    private final void a(lm param0, int param1, int param2, int param3, int param4, int param5, int param6, String param7, int param8, int param9) {
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        L0: {
          var11 = param6 + (param3 - -param2);
          if ((var11 ^ -1) != -1) {
            param6 = (var11 + param6 * 200) / (var11 * 2);
            param3 = (var11 + param3 * 200) / (2 * var11);
            param2 = (var11 + 200 * param2) / (var11 * 2);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if ((kd.field_p ^ -1) != -4) {
            stackOut_5_0 = 310;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 305;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var12 = stackIn_6_0;
          if (3 != kd.field_p) {
            stackOut_8_0 = 380;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 372;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var13 = stackIn_9_0;
          if (kd.field_p == 3) {
            stackOut_11_0 = 427;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = 435;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        L4: {
          var14 = stackIn_12_0;
          if (3 != kd.field_p) {
            stackOut_14_0 = 490;
            stackIn_15_0 = stackOut_14_0;
            break L4;
          } else {
            stackOut_13_0 = 488;
            stackIn_15_0 = stackOut_13_0;
            break L4;
          }
        }
        L5: {
          var15 = stackIn_15_0;
          fl.a(param5, 256, param1, param7, 125 - -param9, (mm) (Object) param0);
          kn.a((mm) (Object) param0, (byte) -39, param5, Integer.toString(param8), param1, var12 - -param9);
          kn.a((mm) (Object) param0, (byte) -39, param5, Integer.toString(var11), param1, var13 - -param9);
          kn.a((mm) (Object) param0, (byte) -39, param5, param6 + "%", param1, var14 + param9);
          kn.a((mm) (Object) param0, (byte) -39, param5, param3 + "%", param1, param9 + var15);
          kn.a((mm) (Object) param0, (byte) -39, param5, param2 + "%", param1, param9 + 545);
          if (param4 == -5328) {
            break L5;
          } else {
            ((ke) this).field_u = 81;
            break L5;
          }
        }
    }

    private final void n(int param0) {
        if (((ke) this).field_t < 3) {
            ((ke) this).field_t = ((ke) this).field_t + 1;
            nm.f(120);
            ac.f((byte) -87);
        }
        int var2 = 116 % ((param0 - 18) / 61);
    }

    private final boolean p(int param0) {
        this.h(115);
        int var2 = param0;
        if (!(0 > ((ke) this).field_b.field_h)) {
            var2 = ((ke) this).field_f[((ke) this).field_b.field_h].field_d;
        }
        if (17 == var2) {
            if (!(!((ke) this).field_b.b((byte) 114))) {
                kf.field_I.c(param0 ^ -77);
                nm.f(-72);
                return true;
            }
        }
        if (-19 == (var2 ^ -1)) {
            if (((ke) this).field_b.b((byte) 114)) {
                if (fm.field_b) {
                    tg.a((byte) -46);
                }
                if (fa.field_n) {
                    ga.a(false, 0, 11);
                }
                nm.f(127);
                return true;
            }
        }
        return false;
    }

    final void j(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_2_0 = 0;
        boolean stackOut_10_0 = false;
        var3 = client.field_A ? 1 : 0;
        h.a((ke) this, (byte) 95);
        L0: while (true) {
          L1: {
            L2: {
              if (!ab.c((byte) 10)) {
                break L2;
              } else {
                stackOut_2_0 = 13;
                stackIn_11_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var3 != 0) {
                  break L1;
                } else {
                  if (stackIn_3_0 == wh.field_c) {
                    nm.f(118);
                    lk.field_F = false;
                    qi.a(false, (byte) -117);
                    return;
                  } else {
                    ((ke) this).field_b.a(-36);
                    if (this.c(false, 121)) {
                      return;
                    } else {
                      if (var3 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
            }
            ((ke) this).field_b.a(this.a(400, bh.field_g, pm.field_f), -20563, this.a(400, he.field_S, nf.field_h));
            stackOut_10_0 = this.c(true, 126);
            stackIn_11_0 = stackOut_10_0 ? 1 : 0;
            break L1;
          }
          L3: {
            var2 = stackIn_11_0;
            if (param0 < -78) {
              break L3;
            } else {
              ((ke) this).j((byte) -93);
              break L3;
            }
          }
          if (var2 == 0) {
            L4: {
              if (ig.field_Yb != 0) {
                int discarded$2 = this.b(true, (byte) -51);
                break L4;
              } else {
                break L4;
              }
            }
            return;
          } else {
            return;
          }
        }
    }

    final void g(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_2_0 = 0;
        boolean stackOut_6_0 = false;
        var3 = client.field_A ? 1 : 0;
        h.a((ke) this, (byte) 95);
        L0: while (true) {
          L1: {
            L2: {
              if (!ab.c((byte) -126)) {
                break L2;
              } else {
                ((ke) this).field_b.a(-118);
                var2 = this.b(-1, false) ? 1 : 0;
                stackOut_2_0 = var2;
                stackIn_7_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var3 != 0) {
                  break L1;
                } else {
                  if (stackIn_3_0 == 0) {
                    if (var3 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            ((ke) this).field_b.a(this.a(400, bh.field_g, pm.field_f), param0 + -20467, this.a(400, he.field_S, nf.field_h));
            stackOut_6_0 = this.b(-1, true);
            stackIn_7_0 = stackOut_6_0 ? 1 : 0;
            break L1;
          }
          if (stackIn_7_0 == 0) {
            L3: {
              if (param0 == -96) {
                break L3;
              } else {
                field_d = 58;
                break L3;
              }
            }
            return;
          } else {
            return;
          }
        }
    }

    private final boolean d(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = client.field_A ? 1 : 0;
          this.h(111);
          var3 = -1;
          if ((((ke) this).field_b.field_h ^ -1) > -1) {
            break L0;
          } else {
            var3 = ((ke) this).field_f[((ke) this).field_b.field_h].field_d;
            break L0;
          }
        }
        L1: {
          if ((var3 ^ -1) != -2) {
            break L1;
          } else {
            if (!((ke) this).field_b.b((byte) 114)) {
              break L1;
            } else {
              nm.f(120);
              pn.a(false, false, true);
              return true;
            }
          }
        }
        L2: {
          if (-3 != (var3 ^ -1)) {
            break L2;
          } else {
            if (!((ke) this).field_b.b((byte) 114)) {
              break L2;
            } else {
              nm.f(40);
              vk.a(param1, (byte) -73);
              return true;
            }
          }
        }
        L3: {
          if (var3 != 3) {
            break L3;
          } else {
            if (!((ke) this).field_b.b((byte) 114)) {
              break L3;
            } else {
              nm.f(-80);
              jm.a(0, param1);
              return true;
            }
          }
        }
        L4: {
          if (var3 != 4) {
            break L4;
          } else {
            if (!((ke) this).field_b.b((byte) 114)) {
              break L4;
            } else {
              nk.field_k = true;
              f.field_s = ek.a(param1, ((ke) this).field_p, 640);
              nm.f(7);
              return true;
            }
          }
        }
        L5: {
          if (var3 != 5) {
            break L5;
          } else {
            if (!((ke) this).field_b.b((byte) 114)) {
              break L5;
            } else {
              kf.field_I.d((byte) -68);
              cd.a(true);
              nm.f(116);
              return true;
            }
          }
        }
        L6: {
          var4 = -97 / ((param0 - -46) / 55);
          if (var3 != 6) {
            break L6;
          } else {
            L7: {
              L8: {
                if (((ke) this).field_b.a(true)) {
                  break L8;
                } else {
                  if (((ke) this).field_b.b((byte) 114)) {
                    ik.c(93);
                    if (var10 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  } else {
                    break L7;
                  }
                }
              }
              L9: {
                var5 = a.field_t.a(pm.field_c);
                var6 = a.field_t.a(fj.field_f);
                if ((var6 ^ -1) < (var5 ^ -1)) {
                  var5 = var6;
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                L11: {
                  var7 = (var5 + -128 + (((ke) this).field_f[((ke) this).field_b.field_h].field_n - -5)) / 2 + ((ke) this).field_f[((ke) this).field_b.field_h].field_l;
                  var8 = bh.field_g + -var7;
                  var9 = 128 * var8 / 128;
                  if (var9 < 0) {
                    break L11;
                  } else {
                    if (var9 <= 128) {
                      break L10;
                    } else {
                      var9 = 128;
                      if (var10 == 0) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                }
                var9 = 0;
                break L10;
              }
              if (pb.field_d == var9) {
                break L7;
              } else {
                pb.field_d = var9;
                if (uf.field_A + -((ke) this).field_x < 5) {
                  break L7;
                } else {
                  ik.c(106);
                  ((ke) this).field_x = uf.field_A;
                  break L7;
                }
              }
            }
            L12: {
              if (((ke) this).field_b.c(114)) {
                pb.field_d = 0;
                ik.c(64);
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              if (((ke) this).field_b.a((byte) -51)) {
                pb.field_d = 128;
                ik.c(111);
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (!((ke) this).field_b.b(true)) {
                break L14;
              } else {
                if (-1 <= (pb.field_d ^ -1)) {
                  break L14;
                } else {
                  pb.field_d = -16 & -1 + pb.field_d;
                  ik.c(98);
                  break L14;
                }
              }
            }
            if (!((ke) this).field_b.b(-20)) {
              break L6;
            } else {
              if ((pb.field_d ^ -1) > -129) {
                pb.field_d = 16 + pb.field_d & -16;
                ik.c(120);
                break L6;
              } else {
                break L6;
              }
            }
          }
        }
        L15: {
          if (7 != var3) {
            break L15;
          } else {
            L16: {
              if (((ke) this).field_b.a(true)) {
                L17: {
                  var5 = a.field_t.a(pm.field_c);
                  var6 = a.field_t.a(fj.field_f);
                  if ((var6 ^ -1) < (var5 ^ -1)) {
                    var5 = var6;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  var7 = (var5 + (-128 + ((ke) this).field_f[((ke) this).field_b.field_h].field_n + 5)) / 2 + ((ke) this).field_f[((ke) this).field_b.field_h].field_l;
                  var8 = bh.field_g - var7;
                  var9 = var8 * 128 / 128;
                  sa.field_x = true;
                  if (var9 >= 0) {
                    break L18;
                  } else {
                    a.field_g = 0;
                    if (var10 == 0) {
                      break L16;
                    } else {
                      break L18;
                    }
                  }
                }
                L19: {
                  if ((var9 ^ -1) >= -129) {
                    break L19;
                  } else {
                    a.field_g = 128;
                    if (var10 == 0) {
                      break L16;
                    } else {
                      break L19;
                    }
                  }
                }
                a.field_g = var9;
                break L16;
              } else {
                break L16;
              }
            }
            L20: {
              if (((ke) this).field_b.c(122)) {
                a.field_g = 0;
                sa.field_x = true;
                break L20;
              } else {
                break L20;
              }
            }
            L21: {
              if (((ke) this).field_b.a((byte) -51)) {
                sa.field_x = true;
                a.field_g = 128;
                break L21;
              } else {
                break L21;
              }
            }
            L22: {
              if (((ke) this).field_b.b(true)) {
                L23: {
                  a.field_g = a.field_g + -1 & -16;
                  if (a.field_g < 0) {
                    a.field_g = 0;
                    break L23;
                  } else {
                    break L23;
                  }
                }
                sa.field_x = true;
                break L22;
              } else {
                break L22;
              }
            }
            if (((ke) this).field_b.b(101)) {
              L24: {
                a.field_g = -16 & 16 + a.field_g;
                if (a.field_g <= 128) {
                  break L24;
                } else {
                  a.field_g = 128;
                  break L24;
                }
              }
              sa.field_x = true;
              break L15;
            } else {
              break L15;
            }
          }
        }
        L25: {
          if (var3 != 8) {
            break L25;
          } else {
            if (!((ke) this).field_b.b((byte) 114)) {
              break L25;
            } else {
              L26: {
                L27: {
                  if (cl.field_v == null) {
                    break L27;
                  } else {
                    sn.a(false);
                    if (var10 == 0) {
                      break L26;
                    } else {
                      break L27;
                    }
                  }
                }
                jk.a(2, param1);
                break L26;
              }
              nm.f(119);
              return true;
            }
          }
        }
        L28: {
          if ((var3 ^ -1) != -10) {
            break L28;
          } else {
            if (((ke) this).field_b.b((byte) 114)) {
              ve.field_Hc = true;
              ca.field_wb = oj.a(param1, 415);
              nm.f(-105);
              return true;
            } else {
              break L28;
            }
          }
        }
        L29: {
          if ((var3 ^ -1) != -11) {
            break L29;
          } else {
            if (((ke) this).field_b.b((byte) 114)) {
              mg.field_Zb = true;
              cl.field_B = qj.a(-108, param1);
              nm.f(127);
              return true;
            } else {
              break L29;
            }
          }
        }
        L30: {
          if (19 != var3) {
            break L30;
          } else {
            if (((ke) this).field_b.b((byte) 114)) {
              fm.field_e = true;
              am.field_a = ib.a((byte) -80, param1);
              nm.f(-14);
              return true;
            } else {
              break L30;
            }
          }
        }
        L31: {
          if (11 != var3) {
            break L31;
          } else {
            if (!((ke) this).field_b.b((byte) 114)) {
              break L31;
            } else {
              lk.field_F = true;
              h.field_d = uh.a(o.field_g, param1, 0, -128);
              nm.f(114);
              return true;
            }
          }
        }
        L32: {
          if (12 != var3) {
            break L32;
          } else {
            if (((ke) this).field_b.b((byte) 114)) {
              nm.f(-38);
              sn.a(false);
              pk.a((byte) -17, se.h(25144));
              break L32;
            } else {
              break L32;
            }
          }
        }
        L33: {
          if (-14 != (var3 ^ -1)) {
            break L33;
          } else {
            if (!((ke) this).field_b.b((byte) 114)) {
              break L33;
            } else {
              nm.f(13);
              cd.a(true);
              return true;
            }
          }
        }
        L34: {
          if (-15 != (var3 ^ -1)) {
            break L34;
          } else {
            if (!((ke) this).field_b.b((byte) 114)) {
              break L34;
            } else {
              kf.field_I.c((byte) 100);
              am.field_c = false;
              kf.field_G = f.a(false, false, 0, false, kf.field_I.field_wb, 32357, false, false);
              un.a((byte) -30);
              dc.a(param1, 95);
              nm.f(126);
              return true;
            }
          }
        }
        L35: {
          if (var3 != 15) {
            break L35;
          } else {
            if (!((ke) this).field_b.b((byte) 114)) {
              break L35;
            } else {
              kf.field_I.b(-62);
              cd.a(true);
              nm.f(124);
              return true;
            }
          }
        }
        L36: {
          if (var3 != 16) {
            break L36;
          } else {
            if (!((ke) this).field_b.b((byte) 114)) {
              break L36;
            } else {
              kf.field_I.f(-49);
              cd.a(true);
              nm.f(-19);
              return true;
            }
          }
        }
        L37: {
          if ((var3 ^ -1) != -18) {
            break L37;
          } else {
            if (!((ke) this).field_b.b((byte) 114)) {
              break L37;
            } else {
              kf.field_I.c(-89);
              cd.a(true);
              nm.f(122);
              return true;
            }
          }
        }
        L38: {
          if (-19 != (var3 ^ -1)) {
            break L38;
          } else {
            if (!((ke) this).field_b.b((byte) 114)) {
              break L38;
            } else {
              L39: {
                if (fm.field_b) {
                  tg.a((byte) -115);
                  break L39;
                } else {
                  break L39;
                }
              }
              L40: {
                if (!fa.field_n) {
                  break L40;
                } else {
                  ga.a(false, 0, 11);
                  break L40;
                }
              }
              cd.a(true);
              nm.f(-42);
              return true;
            }
          }
        }
        return false;
    }

    private final void h(int param0) {
        if (param0 < 93) {
            boolean discarded$0 = this.b(68, true);
        }
        if (!(!((ke) this).field_b.field_o)) {
            fj.a(32, (byte) -89, pg.field_d);
        }
    }

    final int a(int param0) {
        if (param0 != -1) {
            ((ke) this).field_q = -13;
        }
        int var2 = -(((ke) this).field_u >> 1480277474) + 640 - 640 * ((ke) this).field_o * ((ke) this).field_o / 400;
        return var2;
    }

    public static void l(int param0) {
        field_n = null;
        field_h = null;
        if (param0 < 106) {
            ke.e((byte) 27);
        }
    }

    final void a(int param0, boolean param1, int param2) {
        ((ke) this).field_b.a(param0, 0, this.a(400, bh.field_g, pm.field_f), param1);
        if (param2 != -129) {
            this.n(53);
        }
    }

    private final boolean b(boolean param0, int param1) {
        int var3 = 0;
        L0: {
          this.h(95);
          var3 = -1;
          if ((((ke) this).field_b.field_h ^ -1) > -1) {
            break L0;
          } else {
            var3 = ((ke) this).field_f[((ke) this).field_b.field_h].field_d;
            break L0;
          }
        }
        L1: {
          if (20 != var3) {
            break L1;
          } else {
            if (((ke) this).field_b.b((byte) 114)) {
              og.a(false, 6, true);
              return true;
            } else {
              break L1;
            }
          }
        }
        L2: {
          L3: {
            if (-14 == (var3 ^ -1)) {
              break L3;
            } else {
              if (param0) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          if (!((ke) this).field_b.b((byte) 114)) {
            break L2;
          } else {
            mg.field_Zb = false;
            qi.a(param0, (byte) -103);
            nm.f(122);
            return true;
          }
        }
        L4: {
          if (!param0) {
            break L4;
          } else {
            if ((ig.field_Yb ^ -1) == -1) {
              break L4;
            } else {
              if ((((ke) this).field_b.field_h ^ -1) != 0) {
                fc.field_e = ((ke) this).field_b.field_h;
                ((ke) this).field_b.a(fc.field_e, (byte) -112);
                nm.f(param1 + -34);
                return true;
              } else {
                break L4;
              }
            }
          }
        }
        if (param1 == 1) {
          return false;
        } else {
          ((ke) this).field_m = -102;
          return false;
        }
    }

    ke(int param0) {
        ((ke) this).field_k = -1;
        ((ke) this).field_f = new ec[param0];
        ((ke) this).field_b = new sk();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Your rating is <%0>";
        field_h = new int[8192];
    }
}
