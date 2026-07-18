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
        RuntimeException var1 = null;
        uf var1_ref = null;
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
        int stackIn_14_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        byte stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        var26 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 48) {
                break L1;
              } else {
                field_d = 90;
                break L1;
              }
            }
            L2: {
              L3: {
                var1_ref = de.field_V;
                var2 = var1_ref.d((byte) -106);
                if (var2 == 0) {
                  break L3;
                } else {
                  L4: {
                    if (var2 == 1) {
                      break L4;
                    } else {
                      qb.a((Throwable) null, 16408, "HS1: " + qk.d((byte) 30));
                      si.a(122);
                      if (var26 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var3 = var1_ref.e(3);
                  var4_long = var1_ref.f((byte) -108);
                  var6_ref_kn = (kn) (Object) pb.field_c.c((byte) 114);
                  L5: while (true) {
                    L6: {
                      L7: {
                        if (var6_ref_kn == null) {
                          break L7;
                        } else {
                          stackOut_13_0 = ~var6_ref_kn.field_u;
                          stackIn_24_0 = stackOut_13_0;
                          stackIn_14_0 = stackOut_13_0;
                          if (var26 != 0) {
                            break L6;
                          } else {
                            L8: {
                              if (stackIn_14_0 != ~var3) {
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
                      if (null != var6_ref_kn) {
                        var6_ref_kn.field_o = var4_long;
                        var6_ref_kn.b((byte) 101);
                        if (var26 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        stackOut_22_0 = 103;
                        stackIn_24_0 = stackOut_22_0;
                        break L6;
                      }
                    }
                    si.a(stackIn_24_0);
                    return;
                  }
                }
              }
              var3 = var1_ref.e(param0 + -45);
              var4 = (kc) (Object) dg.field_e.c((byte) -104);
              L9: while (true) {
                L10: {
                  L11: {
                    if (null == var4) {
                      break L11;
                    } else {
                      stackOut_29_0 = ~var4.field_n;
                      stackOut_29_1 = ~var3;
                      stackIn_40_0 = stackOut_29_0;
                      stackIn_40_1 = stackOut_29_1;
                      stackIn_30_0 = stackOut_29_0;
                      stackIn_30_1 = stackOut_29_1;
                      if (var26 != 0) {
                        break L10;
                      } else {
                        L12: {
                          if (stackIn_30_0 != stackIn_30_1) {
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
                  if (null != var4) {
                    L13: {
                      L14: {
                        var5 = var1_ref.d((byte) -19);
                        if (var5 != 0) {
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
                                rc.field_c[var8_int].field_i = var1_ref.c((byte) -38);
                                rc.field_c[var8_int].field_c = false;
                                if (var26 != 0) {
                                  break L13;
                                } else {
                                  L17: {
                                    L18: {
                                      if (var1_ref.d((byte) -48) != 1) {
                                        break L18;
                                      } else {
                                        rc.field_c[var8_int].field_f = var1_ref.c((byte) -38);
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
                            String[][] dupTemp$6 = new String[3][var6];
                            var4.field_r = dupTemp$6;
                            var8 = dupTemp$6;
                            var9 = new String[3][var6];
                            long[][] dupTemp$7 = new long[3][var6];
                            var4.field_t = dupTemp$7;
                            var10 = dupTemp$7;
                            int[][] dupTemp$8 = new int[3][var6 * var7];
                            var4.field_u = dupTemp$8;
                            var11 = dupTemp$8;
                            var12 = 0;
                            var13 = 0;
                            var14 = 0;
                            var15 = 0;
                            var16 = 0;
                            var17 = 0;
                            var18 = var1_ref.d((byte) -68);
                            if (0 < var18) {
                              var19 = 0;
                              L19: while (true) {
                                if (var19 >= var18) {
                                  break L14;
                                } else {
                                  var20 = var1_ref.d((byte) -21);
                                  var21 = rc.field_c[var20].field_i;
                                  var22 = var1_ref.f((byte) -108);
                                  var24 = var1_ref.field_n;
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
                                              int incrementValue$9 = var15;
                                              var15++;
                                              var11[0][incrementValue$9] = var1_ref.i(qm.b((int) param0, 7601));
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
                                        if (null == var21) {
                                          break L24;
                                        } else {
                                          if (k.a(var21, true)) {
                                            var8[1][var13] = oa.field_f;
                                            var9[1][var13] = null;
                                            var10[1][var13] = var22;
                                            var13++;
                                            var1_ref.field_n = var24;
                                            var25 = 0;
                                            L25: while (true) {
                                              if (~var25 <= ~var7) {
                                                break L24;
                                              } else {
                                                int incrementValue$10 = var16;
                                                var16++;
                                                var11[1][incrementValue$10] = var1_ref.i(7553);
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
                                            var1_ref.field_n = var24;
                                            var25 = 0;
                                            L27: while (true) {
                                              if (~var7 >= ~var25) {
                                                break L26;
                                              } else {
                                                int incrementValue$11 = var17;
                                                var17++;
                                                var11[2][incrementValue$11] = var1_ref.i(7553);
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
                              break L14;
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
                    stackOut_38_0 = param0;
                    stackOut_38_1 = 121;
                    stackIn_40_0 = stackOut_38_0;
                    stackIn_40_1 = stackOut_38_1;
                    break L10;
                  }
                }
                si.a(stackIn_40_0 ^ stackIn_40_1);
                return;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var1, "ke.JA(" + param0 + ')');
        }
    }

    final void g(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        var3 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (20 != ((ke) this).field_o) {
                break L1;
              } else {
                h.a(-109);
                break L1;
              }
            }
            h.a((ke) this, (byte) 95);
            L2: while (true) {
              L3: {
                L4: {
                  if (!ab.c((byte) -128)) {
                    break L4;
                  } else {
                    ((ke) this).field_b.d(0);
                    stackOut_6_0 = -14;
                    stackOut_6_1 = ~wh.field_c;
                    stackIn_39_0 = stackOut_6_0;
                    stackIn_39_1 = stackOut_6_1;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    if (var3 != 0) {
                      break L3;
                    } else {
                      if (stackIn_7_0 == stackIn_7_1) {
                        nm.f(115);
                        nk.field_k = false;
                        kf.field_G.c(param0 + -2825, false);
                        return;
                      } else {
                        L5: {
                          L6: {
                            if (96 == wh.field_c) {
                              break L6;
                            } else {
                              if (wh.field_c == 98) {
                                break L6;
                              } else {
                                break L5;
                              }
                            }
                          }
                          if (0 < ((ke) this).field_t) {
                            this.m(param0 ^ -8255);
                            ((ke) this).field_b.a(1, (byte) -90);
                            ((ke) this).field_b.field_o = false;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        L7: {
                          L8: {
                            if (wh.field_c == 97) {
                              break L8;
                            } else {
                              if (wh.field_c != 99) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          if (3 > ((ke) this).field_t) {
                            this.n(87);
                            ((ke) this).field_b.a(1, (byte) -66);
                            ((ke) this).field_b.field_o = false;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        var2_int = this.a(false, (byte) -33) ? 1 : 0;
                        if (var2_int != 0) {
                          return;
                        } else {
                          if (var3 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                }
                ((ke) this).field_b.a(this.a(param0 ^ 2712, bh.field_g, pm.field_f), -20563, this.a(400, he.field_S, nf.field_h));
                stackOut_38_0 = param0;
                stackOut_38_1 = 2824;
                stackIn_39_0 = stackOut_38_0;
                stackIn_39_1 = stackOut_38_1;
                break L3;
              }
              L9: {
                if (stackIn_39_0 == stackIn_39_1) {
                  break L9;
                } else {
                  ((ke) this).field_m = 44;
                  break L9;
                }
              }
              boolean discarded$1 = this.a(true, (byte) -33);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "ke.V(" + param0 + ')');
        }
    }

    final void f(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_47_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        boolean stackOut_46_0 = false;
        var4 = client.field_A ? 1 : 0;
        try {
          L0: {
            h.a((ke) this, (byte) 95);
            var2_int = 74 / ((71 - param0) / 39);
            L1: while (true) {
              L2: {
                L3: {
                  if (!ab.c((byte) -119)) {
                    break L3;
                  } else {
                    stackOut_3_0 = ~wh.field_c;
                    stackIn_47_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (stackIn_4_0 != -14) {
                        L4: {
                          L5: {
                            if (ph.n(-30146)) {
                              break L5;
                            } else {
                              L6: {
                                ((ke) this).field_b.d(0);
                                if (wh.field_c != 96) {
                                  break L6;
                                } else {
                                  fc.field_e = (3 + fc.field_e + -1) % 3;
                                  ((ke) this).field_b.a(fc.field_e, (byte) -79);
                                  nm.f(124);
                                  ((ke) this).field_b.field_o = false;
                                  break L6;
                                }
                              }
                              L7: {
                                if (wh.field_c == 97) {
                                  fc.field_e = (1 + fc.field_e) % 3;
                                  ((ke) this).field_b.a(fc.field_e, (byte) -81);
                                  nm.f(117);
                                  ((ke) this).field_b.field_o = false;
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                              L8: {
                                if (wh.field_c == 98) {
                                  L9: {
                                    if (3 != ((ke) this).field_b.field_h) {
                                      break L9;
                                    } else {
                                      ((ke) this).field_b.a(fc.field_e, (byte) -103);
                                      if (var4 == 0) {
                                        break L8;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  ((ke) this).field_b.a(3, (byte) -125);
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                              if (99 != wh.field_c) {
                                break L4;
                              } else {
                                L10: {
                                  if (((ke) this).field_b.field_h < 0) {
                                    break L10;
                                  } else {
                                    if (((ke) this).field_b.field_h >= 3) {
                                      break L10;
                                    } else {
                                      ((ke) this).field_b.a(3, (byte) -95);
                                      if (var4 == 0) {
                                        break L4;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                }
                                ((ke) this).field_b.a(fc.field_e, (byte) -110);
                                if (var4 == 0) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                          ((ke) this).field_b.a(-38);
                          break L4;
                        }
                        var3 = this.b(false, 1) ? 1 : 0;
                        if (var3 == 0) {
                          if (var4 == 0) {
                            continue L1;
                          } else {
                            break L3;
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
                stackOut_46_0 = this.b(true, 1);
                stackIn_47_0 = stackOut_46_0 ? 1 : 0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "ke.WA(" + param0 + ')');
        }
    }

    private final int a(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ec var6 = null;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_21_0 = 0;
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            var4_int = 640 - (640 * ((ke) this).field_o * ((ke) this).field_o / param0 + (((ke) this).field_u >> 1482415394));
            param1 = param1 - var4_int;
            var5 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var5 <= ~((ke) this).field_b.field_l) {
                    break L3;
                  } else {
                    var6 = ((ke) this).field_f[var5];
                    stackOut_3_0 = ~var6.field_l;
                    stackIn_22_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 < ~param1) {
                          break L4;
                        } else {
                          if (~(var6.field_n + var6.field_l) >= ~param1) {
                            break L4;
                          } else {
                            if (var6.field_m > param2) {
                              break L4;
                            } else {
                              if (~param2 > ~(var6.field_m - -var6.field_r)) {
                                stackOut_18_0 = var5;
                                stackIn_19_0 = stackOut_18_0;
                                return stackIn_19_0;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      }
                      var5++;
                      if (var7 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_21_0 = -1;
                stackIn_22_0 = stackOut_21_0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var4, "ke.P(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_22_0;
    }

    private final int b(boolean param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_106_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_2_0 = 0;
        var11 = client.field_A ? 1 : 0;
        try {
          L0: {
            var3_int = -(640 * ((ke) this).field_o * ((ke) this).field_o / 400) + (640 + -(((ke) this).field_u >> -1950206750));
            var4 = -1;
            var5 = rc.a(cm.field_b, (byte) 47, ((ke) this).field_v);
            var6 = rc.a(cm.field_a, (byte) 47, var5);
            var7 = -((jh.a(var6, 120) - 1) * 18) + 304;
            if (param1 == -51) {
              L1: {
                var8 = 80;
                if (((ke) this).field_i != 0) {
                  L2: {
                    var6 = eg.a(cm.field_a, ((ke) this).field_v, (byte) 106);
                    var7 = 304 - (jh.a(var6, param1 + 146) - 1) * 18;
                    if (tf.a((byte) 103, var6)) {
                      break L2;
                    } else {
                      var8 -= 20;
                      break L2;
                    }
                  }
                  if (af.a(param1 + 51, var6, ((ke) this).field_v)) {
                    var8 += 20;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              var7 = var7 + var3_int;
              var9 = 0;
              L3: while (true) {
                L4: {
                  L5: {
                    if (31 <= var9) {
                      break L5;
                    } else {
                      stackOut_16_0 = var9;
                      stackIn_103_0 = stackOut_16_0;
                      stackIn_17_0 = stackOut_16_0;
                      if (var11 != 0) {
                        break L4;
                      } else {
                        L6: {
                          if (stackIn_17_0 == 15) {
                            L7: {
                              var7 = 34;
                              var8 += 40;
                              if (((ke) this).field_i == 0) {
                                break L7;
                              } else {
                                var10 = eg.a(((ke) this).field_v, cm.field_h, (byte) 105);
                                var7 = -(18 * jh.a(var10, 96)) + 18 + 304;
                                break L7;
                              }
                            }
                            var7 = var7 + var3_int;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        L8: {
                          L9: {
                            if (0 == ((ke) this).field_i) {
                              break L9;
                            } else {
                              if (!fb.a(var9, 10040319, ((ke) this).field_v)) {
                                break L9;
                              } else {
                                if (var11 == 0) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                          if (!rb.a(-23, var9, var5)) {
                            L10: {
                              L11: {
                                if (param0) {
                                  break L11;
                                } else {
                                  L12: {
                                    if (var9 != ((ke) this).field_k) {
                                      break L12;
                                    } else {
                                      L13: {
                                        if (rb.a(-112, var9, ((ke) this).field_v)) {
                                          break L13;
                                        } else {
                                          vg.field_h.b(-4 + var7, var8 - 4, 40, 40);
                                          if (var11 == 0) {
                                            break L10;
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                      uf.field_y[var9].a(var7 - 4, -4 + var8, 40, 40);
                                      if (var11 == 0) {
                                        break L10;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  L14: {
                                    if (bh.field_g < var7) {
                                      break L14;
                                    } else {
                                      if (~(32 + var7) >= ~bh.field_g) {
                                        break L14;
                                      } else {
                                        if (~var8 < ~pm.field_f) {
                                          break L14;
                                        } else {
                                          if (pm.field_f >= 32 + var8) {
                                            break L14;
                                          } else {
                                            L15: {
                                              L16: {
                                                if (!rb.a(-113, var9, ((ke) this).field_v)) {
                                                  break L16;
                                                } else {
                                                  uf.field_y[var9].a(var7 - 2, -2 + var8, 36, 36);
                                                  if (var11 == 0) {
                                                    break L15;
                                                  } else {
                                                    break L16;
                                                  }
                                                }
                                              }
                                              vg.field_h.b(-2 + var7, var8 - 2, 36, 36);
                                              break L15;
                                            }
                                            var4 = var9;
                                            if (var11 == 0) {
                                              break L10;
                                            } else {
                                              break L14;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L17: {
                                    if (!rb.a(param1 + 23, var9, ((ke) this).field_v)) {
                                      break L17;
                                    } else {
                                      tl.field_w[var9].c(var7, var8);
                                      if (var11 == 0) {
                                        break L10;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                  vg.field_h.b(var7, var8, 32, 32);
                                  if (var11 == 0) {
                                    break L10;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              if (~var7 < ~he.field_S) {
                                break L10;
                              } else {
                                if (he.field_S >= 32 + var7) {
                                  break L10;
                                } else {
                                  if (nf.field_h < var8) {
                                    break L10;
                                  } else {
                                    if (~nf.field_h > ~(32 + var8)) {
                                      L18: {
                                        if (var9 != ((ke) this).field_k) {
                                          break L18;
                                        } else {
                                          ((ke) this).field_k = -1;
                                          if (var11 == 0) {
                                            break L10;
                                          } else {
                                            break L18;
                                          }
                                        }
                                      }
                                      ((ke) this).field_k = var9;
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                              }
                            }
                            var7 += 36;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var9++;
                        if (var11 == 0) {
                          continue L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  stackOut_102_0 = ((ke) this).field_k;
                  stackIn_103_0 = stackOut_102_0;
                  break L4;
                }
                L19: {
                  if (stackIn_103_0 < 0) {
                    break L19;
                  } else {
                    var4 = ((ke) this).field_k;
                    break L19;
                  }
                }
                stackOut_105_0 = var4;
                stackIn_106_0 = stackOut_105_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 9;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var3, "ke.M(" + param0 + ',' + param1 + ')');
        }
        return stackIn_106_0;
    }

    final void j(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = 2147483647;
            var3 = 2147483647;
            var4 = -2147483648;
            var5 = -2147483648;
            var6 = -99 % ((-41 - param0) / 33);
            var7 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~((ke) this).field_b.field_l >= ~var7) {
                    break L3;
                  } else {
                    if (var8 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (var2_int > ((ke) this).field_f[var7].field_l) {
                          var2_int = ((ke) this).field_f[var7].field_l;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        if (((ke) this).field_f[var7].field_n + ((ke) this).field_f[var7].field_l > var4) {
                          var4 = ((ke) this).field_f[var7].field_l - -((ke) this).field_f[var7].field_n;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        if (~var5 <= ~(((ke) this).field_f[var7].field_r + ((ke) this).field_f[var7].field_m)) {
                          break L6;
                        } else {
                          var5 = ((ke) this).field_f[var7].field_m - -((ke) this).field_f[var7].field_r;
                          break L6;
                        }
                      }
                      L7: {
                        if (~((ke) this).field_f[var7].field_m > ~var3) {
                          var3 = ((ke) this).field_f[var7].field_m;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var7++;
                      if (var8 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                ((ke) this).field_w = -30 + var2_int;
                ((ke) this).field_z = -20 + var3;
                ((ke) this).field_y = var4 - -30 + -((ke) this).field_w;
                ((ke) this).field_q = var5 - (-20 - -((ke) this).field_z);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "ke.TA(" + param0 + ')');
        }
    }

    final void c(int param0) {
        try {
            this.e(16687906);
            this.b(58);
            if (param0 != 2) {
                ((ke) this).k(-125);
            }
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "ke.LA(" + param0 + ')');
        }
    }

    private final boolean a(boolean param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int stackIn_29_0 = 0;
        int stackIn_44_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_28_0 = 0;
        int stackOut_43_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 == -33) {
                break L1;
              } else {
                ((ke) this).field_o = -121;
                break L1;
              }
            }
            L2: {
              this.h(param1 + 132);
              var3_int = -1;
              if (0 > ((ke) this).field_b.field_h) {
                break L2;
              } else {
                var3_int = ((ke) this).field_f[((ke) this).field_b.field_h].field_d;
                break L2;
              }
            }
            L3: {
              if (var3_int != 26) {
                break L3;
              } else {
                if (((ke) this).field_t == 3) {
                  var3_int = -1;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (var3_int != 25) {
                break L4;
              } else {
                if (((ke) this).field_t == 0) {
                  var3_int = -1;
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              L6: {
                if (var3_int == 13) {
                  break L6;
                } else {
                  if (param0) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if (((ke) this).field_b.b((byte) 114)) {
                nk.field_k = false;
                kf.field_G.c(-1, param0);
                nm.f(123);
                stackOut_28_0 = 1;
                stackIn_29_0 = stackOut_28_0;
                return stackIn_29_0 != 0;
              } else {
                break L5;
              }
            }
            L7: {
              if (25 != var3_int) {
                break L7;
              } else {
                if (!((ke) this).field_b.b((byte) 114)) {
                  break L7;
                } else {
                  this.m(-11063);
                  break L7;
                }
              }
            }
            L8: {
              if (var3_int != 26) {
                break L8;
              } else {
                if (((ke) this).field_b.b((byte) 114)) {
                  this.n(-77);
                  break L8;
                } else {
                  break L8;
                }
              }
            }
            stackOut_43_0 = 0;
            stackIn_44_0 = stackOut_43_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var3, "ke.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_44_0 != 0;
    }

    final static void o(int param0) {
        try {
            pk.field_r = param0;
            jg.field_i = true;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "ke.T(" + param0 + ')');
        }
    }

    final void a(ec param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param1 > 98) {
                break L1;
              } else {
                this.b(98);
                break L1;
              }
            }
            int fieldTemp$2 = ((ke) this).field_b.field_l;
            ((ke) this).field_b.field_l = ((ke) this).field_b.field_l + 1;
            ((ke) this).field_f[fieldTemp$2] = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ke.OA(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              hk.a(param0, param1, 1 + param2, 10000536);
              hk.a(param0, param3 + param1, 1 + param2, 12105912);
              var5_int = 1;
              if (param1 - -var5_int >= hk.field_h) {
                break L1;
              } else {
                var5_int = -param1 + hk.field_h;
                break L1;
              }
            }
            L2: {
              var6 = param3;
              if (param1 + var6 > hk.field_b) {
                var6 = -param1 + hk.field_b;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param4 >= 98) {
                break L3;
              } else {
                field_n = null;
                break L3;
              }
            }
            var7 = var5_int;
            L4: while (true) {
              L5: {
                L6: {
                  if (~var6 >= ~var7) {
                    break L6;
                  } else {
                    var8 = 152 - -(var7 * 48 / param3);
                    var9 = var8 << 943748912 | var8 << 392551496 | var8;
                    hk.field_l[(param1 - -var7) * hk.field_j + param0] = var9;
                    hk.field_l[param0 + (var7 + param1) * hk.field_j + param2] = var9;
                    var7++;
                    if (var10 != 0) {
                      break L5;
                    } else {
                      if (var10 == 0) {
                        continue L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                break L5;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var5, "ke.W(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void b(int param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = client.field_A ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var3_int <= ~((ke) this).field_b.field_l) {
                    break L3;
                  } else {
                    ((ke) this).field_f[var3_int].field_m = ((ke) this).field_f[var3_int].field_m + param0;
                    var3_int++;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                ((ke) this).field_b.a(this.a(400, bh.field_g, pm.field_f), -20563, this.a(400, he.field_S, nf.field_h));
                break L2;
              }
              var3_int = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (((ke) this).field_b.field_l <= var3_int) {
                      break L6;
                    } else {
                      ((ke) this).field_f[var3_int].field_m = ((ke) this).field_f[var3_int].field_m - param0;
                      var3_int++;
                      if (var4 != 0) {
                        break L5;
                      } else {
                        if (var4 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  L7: {
                    if (param1 > 120) {
                      break L7;
                    } else {
                      ((ke) this).field_i = 13;
                      break L7;
                    }
                  }
                  boolean discarded$2 = this.p(-1);
                  break L5;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw dh.a((Throwable) (Object) runtimeException, "ke.DA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void b(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        ck var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = -(((ke) this).field_u >> 952971650) + (640 + -(640 * (((ke) this).field_o * ((ke) this).field_o) / 400));
              if (param0 >= 49) {
                break L1;
              } else {
                ((ke) this).field_r = false;
                break L1;
              }
            }
            var3 = ng.field_b;
            var3.c(320 - var3.field_K / 2, -(var2_int >> -492469630) + (50 + -(var3.field_C / 2)));
            hk.a(var2_int + 4 + ((ke) this).field_w, ((ke) this).field_z + 4, -8 + ((ke) this).field_y, -8 + ((ke) this).field_q, 0, 150);
            vk.a(((ke) this).field_q, (byte) 50, a.field_n, ((ke) this).field_y, ((ke) this).field_z, var2_int + ((ke) this).field_w);
            kn.a((mm) (Object) w.field_kb, (byte) -39, 362, ve.c(((ke) this).field_t, 26135), 16777215, 560 + var2_int);
            wk.a(72, ((ke) this).field_t, var2_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw dh.a((Throwable) (Object) runtimeException, "ke.BA(" + param0 + ')');
        }
    }

    final void h(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        ck var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        String stackIn_29_3 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        String stackOut_28_3 = null;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        String stackOut_26_3 = null;
        var10 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              stackOut_1_0 = this;
              stackIn_4_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (((ke) this).field_b.field_l < 3) {
                stackOut_4_0 = this;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_5_0 = stackOut_2_0;
                stackIn_5_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              this.a(stackIn_5_1 != 0, 15764);
              var2_int = 640 + (-(640 * (((ke) this).field_o * ((ke) this).field_o) / 400) + -(((ke) this).field_u >> -1169742078));
              var3 = client.field_C[((ke) this).field_i];
              if (param0 >= 23) {
                break L2;
              } else {
                ((ke) this).field_z = -77;
                break L2;
              }
            }
            L3: {
              L4: {
                var3.c(-(var3.field_K / 2) + 320, -(var3.field_C / 2) + 40 - (var2_int >> 740753666));
                var4 = this.b(false, (byte) -51);
                if (var4 < 0) {
                  break L4;
                } else {
                  L5: {
                    L6: {
                      ed.a(16777215, 320 - -var2_int, qk.field_s[var4], 200, (byte) 75, (mm) (Object) w.field_kb);
                      var5 = rb.a(-35, var4, ((ke) this).field_v) ? 1 : 0;
                      if (var5 != 0) {
                        break L6;
                      } else {
                        if (!rb.a(-28, var4, cm.field_g)) {
                          break L6;
                        } else {
                          stackOut_13_0 = 1;
                          stackIn_16_0 = stackOut_13_0;
                          break L5;
                        }
                      }
                    }
                    stackOut_15_0 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    break L5;
                  }
                  L7: {
                    L8: {
                      var6 = stackIn_16_0;
                      if (var5 == 0) {
                        break L8;
                      } else {
                        uf.field_y[var4].c(var2_int + 256, 210);
                        if (var10 == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    vg.field_h.c(256 + var2_int, 210);
                    break L7;
                  }
                  L9: {
                    L10: {
                      if (var6 == 0) {
                        break L10;
                      } else {
                        var7 = sb.field_t;
                        if (var10 == 0) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    var7 = jh.field_c[var4];
                    break L9;
                  }
                  L11: {
                    var8 = se.field_S.a(var7, 171);
                    int discarded$1 = ga.a(171, 0, -se.field_S.field_R + 274 + -(var8 * 8), var7, 16, 1000, 16769088, (mm) (Object) se.field_S, (byte) -124, 0, var2_int + 80);
                    stackOut_25_0 = 8 * var8 + 282;
                    stackOut_25_1 = 256;
                    stackOut_25_2 = 16777215;
                    stackIn_28_0 = stackOut_25_0;
                    stackIn_28_1 = stackOut_25_1;
                    stackIn_28_2 = stackOut_25_2;
                    stackIn_26_0 = stackOut_25_0;
                    stackIn_26_1 = stackOut_25_1;
                    stackIn_26_2 = stackOut_25_2;
                    if (var5 != 0) {
                      stackOut_28_0 = stackIn_28_0;
                      stackOut_28_1 = stackIn_28_1;
                      stackOut_28_2 = stackIn_28_2;
                      stackOut_28_3 = ne.field_b;
                      stackIn_29_0 = stackOut_28_0;
                      stackIn_29_1 = stackOut_28_1;
                      stackIn_29_2 = stackOut_28_2;
                      stackIn_29_3 = stackOut_28_3;
                      break L11;
                    } else {
                      stackOut_26_0 = stackIn_26_0;
                      stackOut_26_1 = stackIn_26_1;
                      stackOut_26_2 = stackIn_26_2;
                      stackOut_26_3 = j.field_a;
                      stackIn_29_0 = stackOut_26_0;
                      stackIn_29_1 = stackOut_26_1;
                      stackIn_29_2 = stackOut_26_2;
                      stackIn_29_3 = stackOut_26_3;
                      break L11;
                    }
                  }
                  L12: {
                    L13: {
                      fl.a(stackIn_29_0, stackIn_29_1, stackIn_29_2, stackIn_29_3, 80 + var2_int, (mm) (Object) w.field_kb);
                      kn.a((mm) (Object) se.field_S, (byte) -39, 271, jd.field_Xb, 16777215, var2_int + 500);
                      kn.a((mm) (Object) se.field_S, (byte) -39, 289, me.field_B, 16777215, 500 - -var2_int);
                      if (var6 == 0) {
                        break L13;
                      } else {
                        fl.a(271, 256, 16769088, "???", 500 - -var2_int, (mm) (Object) se.field_S);
                        fl.a(289, 256, 16769088, "???", var2_int + 500, (mm) (Object) se.field_S);
                        if (var10 == 0) {
                          break L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    fl.a(271, 256, 16769088, Integer.toString(on.field_g[var4]), var2_int + 500, (mm) (Object) se.field_S);
                    var9 = 0;
                    L14: while (true) {
                      if (vb.field_X[var4] <= var9) {
                        break L12;
                      } else {
                        rn.field_c.c(var9 * 5 + (var2_int + 500), 274);
                        var9++;
                        if (var10 != 0) {
                          break L3;
                        } else {
                          if (var10 == 0) {
                            continue L14;
                          } else {
                            break L12;
                          }
                        }
                      }
                    }
                  }
                  if (var10 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              ed.a(16777215, var2_int + 320, v.field_e, 200, (byte) 75, (mm) (Object) w.field_kb);
              break L3;
            }
            L15: {
              if (ph.n(-30146)) {
                ed.a(16777215, var2_int + 320, lf.field_d, 360, (byte) 75, (mm) (Object) se.field_S);
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              if (rb.a(-80, 5, ((ke) this).field_v)) {
                ed.a(16777215, 320 - -var2_int, ph.field_Cb, 360, (byte) 75, (mm) (Object) se.field_S);
                break L16;
              } else {
                break L16;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "ke.L(" + param0 + ')');
        }
    }

    private final boolean a(int param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int stackIn_14_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_36_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_35_0 = 0;
        try {
          L0: {
            L1: {
              this.h(118);
              if (param0 == -14845) {
                break L1;
              } else {
                boolean discarded$1 = this.b(true, 36);
                break L1;
              }
            }
            L2: {
              var3_int = -1;
              if (((ke) this).field_b.field_h >= 0) {
                var3_int = ((ke) this).field_f[((ke) this).field_b.field_h].field_d;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (var3_int != 20) {
                break L3;
              } else {
                if (((ke) this).field_b.b((byte) 114)) {
                  og.a(false, 6, true);
                  nm.f(124);
                  stackOut_13_0 = 1;
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0 != 0;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              L5: {
                if (var3_int == 13) {
                  break L5;
                } else {
                  if (param1) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              if (((ke) this).field_b.b((byte) 114)) {
                ve.field_Hc = false;
                qi.a(param1, (byte) -111);
                nm.f(param0 ^ -14836);
                stackOut_24_0 = 1;
                stackIn_25_0 = stackOut_24_0;
                return stackIn_25_0 != 0;
              } else {
                break L4;
              }
            }
            L6: {
              if (!param1) {
                break L6;
              } else {
                if (ig.field_Yb == 0) {
                  break L6;
                } else {
                  if (((ke) this).field_b.field_h == -1) {
                    break L6;
                  } else {
                    cj.field_c = ((ke) this).field_b.field_h;
                    ((ke) this).field_b.a(cj.field_c, (byte) -109);
                    nm.f(125);
                    stackOut_33_0 = 1;
                    stackIn_34_0 = stackOut_33_0;
                    return stackIn_34_0 != 0;
                  }
                }
              }
            }
            stackOut_35_0 = 0;
            stackIn_36_0 = stackOut_35_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var3, "ke.K(" + param0 + ',' + param1 + ')');
        }
        return stackIn_36_0 != 0;
    }

    final void b(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        ck var3 = null;
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        String[] var7_ref_String__ = null;
        int var7 = 0;
        int[] var8_ref_int__ = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        RuntimeException decompiledCaughtException = null;
        var14 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = -(((ke) this).field_u >> -977993822) + (-(640 * ((ke) this).field_o * ((ke) this).field_o / 400) + 640);
              this.a(false, 15764);
              var3 = ij.field_d;
              var3.c(320 + -(var3.field_K / 2), 45 - var3.field_C / 2 + -(var2_int >> 8543042));
              if (null != ((ke) this).field_e) {
                break L1;
              } else {
                if (ph.n(-30146)) {
                  break L1;
                } else {
                  ((ke) this).field_e = am.a(3, false, 1, 0, 10);
                  break L1;
                }
              }
            }
            var4 = bf.a((byte) 107, gh.field_e, fc.field_e, ((ke) this).field_e);
            fl.a(105, 256, 16777215, vm.field_x, var2_int + 125, (mm) (Object) w.field_kb);
            fl.a(105, 256, 16777215, a.field_x, 333 + var2_int, (mm) (Object) w.field_kb);
            kn.a((mm) (Object) w.field_kb, (byte) -39, 105, sl.field_b, 16777215, 545 - -var2_int);
            if (param0 <= -42) {
              var5_int = 0;
              L2: while (true) {
                L3: {
                  if (var5_int >= 10) {
                    break L3;
                  } else {
                    var6 = 16777215;
                    kn.a((mm) (Object) w.field_kb, (byte) -39, 130 + 20 * var5_int, 1 + var5_int + ".", var6, var2_int + 115);
                    var5_int++;
                    if (var14 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  var5 = le.field_r;
                  var6 = 1;
                  if (null != ((ke) this).field_e) {
                    L5: {
                      if (((ke) this).field_e.field_p) {
                        break L5;
                      } else {
                        var5 = wm.field_k;
                        if (var14 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      L7: {
                        if (null != ((ke) this).field_e.field_r) {
                          break L7;
                        } else {
                          var5 = dn.field_s;
                          if (var14 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var7_ref_String__ = ((ke) this).field_e.field_r[fc.field_e];
                      var8_ref_int__ = ((ke) this).field_e.field_u[fc.field_e];
                      var9 = 0;
                      L8: while (true) {
                        if (var9 >= 10) {
                          break L6;
                        } else {
                          if (var14 != 0) {
                            break L4;
                          } else {
                            L9: {
                              if (var7_ref_String__[var9] == null) {
                                break L9;
                              } else {
                                L10: {
                                  var5 = null;
                                  var10 = 16769088;
                                  var11 = var8_ref_int__[var9];
                                  var12 = var11 % 8;
                                  var13 = var11 / 8;
                                  if (~var4 == ~var9) {
                                    var10 = 16777215;
                                    break L10;
                                  } else {
                                    break L10;
                                  }
                                }
                                fl.a(var9 * 20 + 130, 256, var10, var7_ref_String__[var9], 125 - -var2_int, (mm) (Object) se.field_S);
                                kn.a((mm) (Object) se.field_S, (byte) -39, 130 + var9 * 20, cm.a((byte) 106, kk.field_q, new String[1]), var10, 350 - -var2_int);
                                fl.a(130 - -(var9 * 20), 256, var10, md.field_U[var12], var2_int + 350, (mm) (Object) se.field_S);
                                kn.a((mm) (Object) se.field_S, (byte) -39, 20 * var9 + 130, Integer.toString(var13), var10, 545 + var2_int);
                                break L9;
                              }
                            }
                            var9++;
                            if (var14 == 0) {
                              continue L8;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                    }
                    if (0 <= var4) {
                      break L4;
                    } else {
                      if (gh.field_e == null) {
                        break L4;
                      } else {
                        if (gh.field_e.field_x != 0) {
                          break L4;
                        } else {
                          fl.a(330, 256, 16777215, oa.field_f, 125 + var2_int, (mm) (Object) se.field_S);
                          var7 = gh.field_e.field_s[0];
                          var8 = var7 % 8;
                          var9 = var7 / 8;
                          kn.a((mm) (Object) se.field_S, (byte) -39, 330, cm.a((byte) 81, kk.field_q, new String[1]), 16777215, var2_int + 350);
                          fl.a(330, 256, 16777215, md.field_U[var8], 350 + var2_int, (mm) (Object) se.field_S);
                          kn.a((mm) (Object) se.field_S, (byte) -39, 330, Integer.toString(var9), 16777215, var2_int + 545);
                          var6 = 0;
                          break L4;
                        }
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                L11: {
                  if (null != var5) {
                    ed.a(16777215, 320 - -var2_int, var5, 220, (byte) 75, (mm) (Object) w.field_kb);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  L13: {
                    if (ph.n(-30146)) {
                      break L13;
                    } else {
                      if (var6 != 0) {
                        ed.a(16777215, var2_int + 320, af.field_e, 330, (byte) 75, (mm) (Object) se.field_S);
                        if (var14 == 0) {
                          break L12;
                        } else {
                          break L13;
                        }
                      } else {
                        break L12;
                      }
                    }
                  }
                  ed.a(16777215, 320 - -var2_int, lf.field_d, 330, (byte) 75, (mm) (Object) se.field_S);
                  break L12;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "ke.E(" + param0 + ')');
        }
    }

    final void f(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        ck var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              this.a(true, param0 ^ -23361);
              var2_int = -(((ke) this).field_u >> -2029436830) + 640 + -(640 * ((ke) this).field_o * ((ke) this).field_o / 400);
              var3 = l.field_j;
              var3.c(320 - var3.field_K / 2, -(var2_int >> -1455322462) + (((ke) this).field_z / 2 - (-2 - -(var3.field_C / 2))));
              if (param0 == -26325) {
                break L1;
              } else {
                ((ke) this).field_q = -96;
                break L1;
              }
            }
            L2: {
              if (((ke) this).field_g) {
                stackOut_6_0 = 23;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_4_0 = 0;
                stackIn_7_0 = stackOut_4_0;
                break L2;
              }
            }
            var4 = stackIn_7_0;
            hk.a(var2_int + (4 + ((ke) this).field_w), -8 + (((ke) this).field_q + ((ke) this).field_z), -8 + ((ke) this).field_y, var4 + 142, 0, 150);
            vk.a(var4 + 150, (byte) 50, a.field_n, ((ke) this).field_y, -13 + ((ke) this).field_z + ((ke) this).field_q, var2_int + ((ke) this).field_w);
            fc.a(((ke) this).field_q + ((ke) this).field_z, (byte) 5, ((ke) this).field_g, var2_int + 185);
            nf.a(((ke) this).field_l, var2_int + 333, (byte) 74, ((ke) this).field_q + ((ke) this).field_z, ((ke) this).field_m);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "ke.SA(" + param0 + ')');
        }
    }

    final void k(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_10_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        boolean stackOut_21_0 = false;
        var3 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              h.a((ke) this, (byte) 95);
              if (param0 == 128) {
                break L1;
              } else {
                ((ke) this).field_v = null;
                break L1;
              }
            }
            if (mn.field_c) {
              return;
            } else {
              L2: while (true) {
                L3: {
                  L4: {
                    if (!ab.c((byte) 26)) {
                      break L4;
                    } else {
                      stackOut_9_0 = 13;
                      stackIn_22_0 = stackOut_9_0;
                      stackIn_10_0 = stackOut_9_0;
                      if (var3 != 0) {
                        break L3;
                      } else {
                        L5: {
                          if (stackIn_10_0 != wh.field_c) {
                            break L5;
                          } else {
                            if (!((ke) this).field_p) {
                              break L5;
                            } else {
                              nm.f(27);
                              cd.a(true);
                              return;
                            }
                          }
                        }
                        ((ke) this).field_b.a(-127);
                        var2_int = this.d(-109, false) ? 1 : 0;
                        if (var2_int == 0) {
                          if (var3 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  ((ke) this).field_b.a(this.a(400, bh.field_g, pm.field_f), -20563, this.a(param0 + 272, he.field_S, nf.field_h));
                  stackOut_21_0 = this.d(-108, true);
                  stackIn_22_0 = stackOut_21_0 ? 1 : 0;
                  break L3;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "ke.IA(" + param0 + ')');
        }
    }

    final void d(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
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
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        var14 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = -(((ke) this).field_u >> 685015522) + (-(((ke) this).field_o * (((ke) this).field_o * 640) / 400) + 640);
              this.a(false, 15764);
              var3 = ad.field_g;
              var3.c(-(var3.field_K / 2) + 320, -(var3.field_C / 2) + (45 + -(var2_int >> 886031138)));
              if (((ke) this).field_a != null) {
                break L1;
              } else {
                if (ph.n(-30146)) {
                  break L1;
                } else {
                  ((ke) this).field_a = ai.a(7, 10, (byte) -111, 0);
                  break L1;
                }
              }
            }
            L2: {
              if (kd.field_p != 3) {
                stackOut_10_0 = 310;
                stackIn_11_0 = stackOut_10_0;
                break L2;
              } else {
                stackOut_8_0 = 305;
                stackIn_11_0 = stackOut_8_0;
                break L2;
              }
            }
            L3: {
              var4 = stackIn_11_0;
              if (kd.field_p == 3) {
                stackOut_14_0 = 372;
                stackIn_15_0 = stackOut_14_0;
                break L3;
              } else {
                stackOut_12_0 = 380;
                stackIn_15_0 = stackOut_12_0;
                break L3;
              }
            }
            L4: {
              var5 = stackIn_15_0;
              if (kd.field_p == 3) {
                stackOut_18_0 = 427;
                stackIn_19_0 = stackOut_18_0;
                break L4;
              } else {
                stackOut_16_0 = 435;
                stackIn_19_0 = stackOut_16_0;
                break L4;
              }
            }
            L5: {
              var6 = stackIn_19_0;
              if (kd.field_p == 3) {
                stackOut_22_0 = 488;
                stackIn_23_0 = stackOut_22_0;
                break L5;
              } else {
                stackOut_20_0 = 490;
                stackIn_23_0 = stackOut_20_0;
                break L5;
              }
            }
            L6: {
              var7 = stackIn_23_0;
              fl.a(105, 256, 16777215, vm.field_x, 125 + var2_int, (mm) (Object) w.field_kb);
              kn.a((mm) (Object) w.field_kb, (byte) -39, 105, ga.field_a, 16777215, var4 - -var2_int);
              if (param0 == 45) {
                break L6;
              } else {
                ((ke) this).field_w = -41;
                break L6;
              }
            }
            L7: {
              kn.a((mm) (Object) w.field_kb, (byte) -39, 105, om.field_c, 16777215, var2_int + var5);
              kn.a((mm) (Object) w.field_kb, (byte) -39, 105, hd.field_o, 16777215, var6 - -var2_int);
              kn.a((mm) (Object) w.field_kb, (byte) -39, 105, vd.field_r, 16777215, var2_int + var7);
              kn.a((mm) (Object) w.field_kb, (byte) -39, 105, sh.field_h, 16777215, 545 - -var2_int);
              var8 = -1;
              var9 = hf.field_g;
              if (((ke) this).field_a == null) {
                break L7;
              } else {
                L8: {
                  if (((ke) this).field_a.field_A) {
                    break L8;
                  } else {
                    var9 = wm.field_k;
                    if (var14 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                L9: {
                  if (((ke) this).field_a.field_x == null) {
                    break L9;
                  } else {
                    var10_ref_String__ = ((ke) this).field_a.field_x[cj.field_c];
                    var11_ref_int__ = ((ke) this).field_a.field_u[cj.field_c];
                    var12 = 0;
                    L10: while (true) {
                      L11: {
                        L12: {
                          if (var12 >= 10) {
                            break L12;
                          } else {
                            if (var14 != 0) {
                              break L11;
                            } else {
                              L13: {
                                if (var10_ref_String__[var12] == null) {
                                  break L13;
                                } else {
                                  L14: {
                                    var9 = null;
                                    var13 = 16769088;
                                    if (k.a(var10_ref_String__[var12], true)) {
                                      var8 = var12;
                                      var13 = 16777215;
                                      break L14;
                                    } else {
                                      break L14;
                                    }
                                  }
                                  this.a(se.field_S, var13, var11_ref_int__[4 * var12 + 2], var11_ref_int__[4 * var12 - -3], param0 + -5373, 130 - -(20 * var12), var11_ref_int__[1 + 4 * var12], var10_ref_String__[var12], var11_ref_int__[4 * var12], var2_int);
                                  break L13;
                                }
                              }
                              var12++;
                              if (var14 == 0) {
                                continue L10;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                        if (var8 >= 0) {
                          break L11;
                        } else {
                          var12 = 16777215;
                          this.a(se.field_S, var12, ((ke) this).field_a.field_w, ((ke) this).field_a.field_p, -5328, 330, ((ke) this).field_a.field_o, oa.field_f, ((ke) this).field_a.field_t, var2_int);
                          break L11;
                        }
                      }
                      if (var14 == 0) {
                        break L7;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
                var9 = dn.field_s;
                break L7;
              }
            }
            var10 = 0;
            L15: while (true) {
              L16: {
                L17: {
                  L18: {
                    if (10 <= var10) {
                      break L18;
                    } else {
                      var11 = 16777215;
                      kn.a((mm) (Object) w.field_kb, (byte) -39, 130 + var10 * 20, var10 + 1 + ".", var11, var2_int + 115);
                      var10++;
                      if (var14 != 0) {
                        break L17;
                      } else {
                        if (var14 == 0) {
                          continue L15;
                        } else {
                          break L18;
                        }
                      }
                    }
                  }
                  if (null != var9) {
                    break L17;
                  } else {
                    break L16;
                  }
                }
                ed.a(16777215, 320 + var2_int, var9, 220, (byte) 75, (mm) (Object) w.field_kb);
                break L16;
              }
              L19: {
                if (!ph.n(-30146)) {
                  break L19;
                } else {
                  ed.a(16777215, var2_int + 320, lf.field_d, 330, (byte) 75, (mm) (Object) se.field_S);
                  break L19;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "ke.G(" + param0 + ')');
        }
    }

    private final void m(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -11063) {
                break L1;
              } else {
                this.a(false, 73);
                break L1;
              }
            }
            L2: {
              if (0 >= ((ke) this).field_t) {
                break L2;
              } else {
                ((ke) this).field_t = ((ke) this).field_t - 1;
                nm.f(-65);
                ac.f((byte) -76);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "ke.D(" + param0 + ')');
        }
    }

    private final boolean b(int param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
        try {
          L0: {
            L1: {
              this.h(94);
              var3_int = param0;
              if (((ke) this).field_b.field_h >= 0) {
                var3_int = ((ke) this).field_f[((ke) this).field_b.field_h].field_d;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (20 != var3_int) {
                break L2;
              } else {
                if (((ke) this).field_b.b((byte) 114)) {
                  og.a(false, 4, true);
                  nm.f(param0 + 37);
                  stackOut_10_0 = 1;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0 != 0;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (var3_int != 21) {
                break L3;
              } else {
                if (!((ke) this).field_b.b((byte) 114)) {
                  break L3;
                } else {
                  s.b(true);
                  ba.field_c = false;
                  qi.a(param1, (byte) -104);
                  nm.f(param0 ^ -126);
                  stackOut_16_0 = 1;
                  stackIn_17_0 = stackOut_16_0;
                  return stackIn_17_0 != 0;
                }
              }
            }
            stackOut_18_0 = 0;
            stackIn_19_0 = stackOut_18_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var3, "ke.GA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_19_0 != 0;
    }

    final void a(boolean param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                ke.e((byte) -98);
                break L1;
              }
            }
            this.a(true, 15764);
            var2_int = -(((ke) this).field_o * ((ke) this).field_o * 640 / 400) + (640 - (((ke) this).field_u >> -2066854142));
            wk.field_l.c(320 + -(wk.field_l.field_I / 2), -(var2_int >> -2060126462) + 20);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "ke.J(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        ec var9 = null;
        int var10 = 0;
        int var11 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        var11 = client.field_A ? 1 : 0;
        try {
          L0: {
            var7 = -41 % ((-31 - param3) / 62);
            var6_int = 0;
            var8 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      if (((ke) this).field_b.field_l <= var8) {
                        break L5;
                      } else {
                        var9 = ((ke) this).field_f[var8];
                        var10 = var9.field_n;
                        stackOut_3_0 = 6;
                        stackOut_3_1 = var9.field_d;
                        stackIn_29_0 = stackOut_3_0;
                        stackIn_29_1 = stackOut_3_1;
                        stackIn_4_0 = stackOut_3_0;
                        stackIn_4_1 = stackOut_3_1;
                        if (var11 != 0) {
                          L6: while (true) {
                            if (stackIn_29_0 <= stackIn_29_1) {
                              break L3;
                            } else {
                              ((ke) this).field_f[var8].field_n = var6_int;
                              ((ke) this).field_f[var8].field_l = param1 + -(var6_int / 2);
                              var8++;
                              if (var11 != 0) {
                                break L2;
                              } else {
                                if (var11 == 0) {
                                  stackOut_28_0 = ((ke) this).field_b.field_l;
                                  stackOut_28_1 = var8;
                                  stackIn_29_0 = stackOut_28_0;
                                  stackIn_29_1 = stackOut_28_1;
                                  continue L6;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                        } else {
                          L7: {
                            L8: {
                              if (stackIn_4_0 == stackIn_4_1) {
                                break L8;
                              } else {
                                if (7 == var9.field_d) {
                                  break L8;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            var10 += 133;
                            break L7;
                          }
                          L9: {
                            var9.field_m = var8 * param4 + param0;
                            if (var6_int < var10) {
                              var6_int = var10;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          L10: {
                            if (param2) {
                              L11: {
                                if (var8 <= 0) {
                                  break L11;
                                } else {
                                  var9.field_r = var9.field_r - 3;
                                  var9.field_m = var9.field_m + 3;
                                  break L11;
                                }
                              }
                              if (~var8 <= ~(-1 + ((ke) this).field_b.field_l)) {
                                break L10;
                              } else {
                                var9.field_r = var9.field_r - 3;
                                break L10;
                              }
                            } else {
                              break L10;
                            }
                          }
                          var8++;
                          if (var11 == 0) {
                            continue L1;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    var8 = 0;
                    L12: while (true) {
                      stackOut_28_0 = ((ke) this).field_b.field_l;
                      stackOut_28_1 = var8;
                      stackIn_29_0 = stackOut_28_0;
                      stackIn_29_1 = stackOut_28_1;
                      if (stackIn_29_0 <= stackIn_29_1) {
                        break L3;
                      } else {
                        ((ke) this).field_f[var8].field_n = var6_int;
                        ((ke) this).field_f[var8].field_l = param1 + -(var6_int / 2);
                        var8++;
                        if (var11 != 0) {
                          break L2;
                        } else {
                          if (var11 == 0) {
                            continue L12;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  break L3;
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var6, "ke.UA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void k(byte param0) {
        try {
            ((ke) this).field_u = ((ke) this).field_u + ((ke) this).field_c / 2;
            ((ke) this).field_c = 7 * ((ke) this).field_c / 8;
            ((ke) this).field_c = ((ke) this).field_c - ((ke) this).field_u;
            if (param0 <= 107) {
                ke.a(103, -21, -87, 6, (byte) -30);
            }
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "ke.R(" + param0 + ')');
        }
    }

    final void d(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        var3 = client.field_A ? 1 : 0;
        try {
          L0: {
            h.a((ke) this, (byte) 95);
            L1: while (true) {
              L2: {
                L3: {
                  if (!ab.c((byte) -18)) {
                    break L3;
                  } else {
                    stackOut_3_0 = wh.field_c;
                    stackOut_3_1 = 13;
                    stackIn_49_0 = stackOut_3_0;
                    stackIn_49_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (stackIn_4_0 != stackIn_4_1) {
                        L4: {
                          L5: {
                            if (ph.n(-30146)) {
                              break L5;
                            } else {
                              L6: {
                                ((ke) this).field_b.d(param0 ^ -8622);
                                if (wh.field_c == 96) {
                                  cj.field_c = (cj.field_c + 1) % 2;
                                  ((ke) this).field_b.a(cj.field_c, (byte) -91);
                                  nm.f(126);
                                  ((ke) this).field_b.field_o = false;
                                  break L6;
                                } else {
                                  break L6;
                                }
                              }
                              L7: {
                                if (wh.field_c != 97) {
                                  break L7;
                                } else {
                                  cj.field_c = (cj.field_c + 1) % 2;
                                  ((ke) this).field_b.a(cj.field_c, (byte) -113);
                                  nm.f(param0 + 8601);
                                  ((ke) this).field_b.field_o = false;
                                  break L7;
                                }
                              }
                              L8: {
                                if (wh.field_c == 98) {
                                  L9: {
                                    if (((ke) this).field_b.field_h == 2) {
                                      break L9;
                                    } else {
                                      ((ke) this).field_b.a(2, (byte) -98);
                                      if (var3 == 0) {
                                        break L8;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  ((ke) this).field_b.a(cj.field_c, (byte) -69);
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                              if (wh.field_c == 99) {
                                L10: {
                                  L11: {
                                    if (((ke) this).field_b.field_h < 0) {
                                      break L11;
                                    } else {
                                      if (2 > ((ke) this).field_b.field_h) {
                                        break L10;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  ((ke) this).field_b.a(cj.field_c, (byte) -101);
                                  if (var3 == 0) {
                                    break L4;
                                  } else {
                                    break L10;
                                  }
                                }
                                ((ke) this).field_b.a(2, (byte) -109);
                                if (var3 == 0) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              } else {
                                break L4;
                              }
                            }
                          }
                          ((ke) this).field_b.a(-31);
                          break L4;
                        }
                        var2_int = this.a(-14845, false) ? 1 : 0;
                        if (var2_int != 0) {
                          return;
                        } else {
                          if (var3 == 0) {
                            continue L1;
                          } else {
                            break L3;
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
                stackOut_48_0 = param0;
                stackOut_48_1 = -8622;
                stackIn_49_0 = stackOut_48_0;
                stackIn_49_1 = stackOut_48_1;
                break L2;
              }
              L12: {
                if (stackIn_49_0 == stackIn_49_1) {
                  break L12;
                } else {
                  ((ke) this).field_w = 87;
                  break L12;
                }
              }
              ((ke) this).field_b.a(this.a(400, bh.field_g, pm.field_f), -20563, this.a(400, he.field_S, nf.field_h));
              boolean discarded$1 = this.a(-14845, true);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "ke.CA(" + param0 + ')');
        }
    }

    private final void e(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ec var7 = null;
        String var8 = null;
        int var9 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        var9 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = -(((ke) this).field_u >> -1889653886) + (640 + -(640 * (((ke) this).field_o * ((ke) this).field_o) / 400));
              if (((ke) this).field_t > 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_5_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var3 = stackIn_5_0;
              if (3 > ((ke) this).field_t) {
                stackOut_8_0 = ((ke) this).field_b.field_l;
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_6_0 = ((ke) this).field_b.field_l + -1;
                stackIn_9_0 = stackOut_6_0;
                break L2;
              }
            }
            var4 = stackIn_9_0;
            var5 = var3;
            L3: while (true) {
              L4: {
                L5: {
                  if (var5 >= var4) {
                    break L5;
                  } else {
                    vk.a(((ke) this).field_f[var5].field_r, (byte) 50, on.field_e, ((ke) this).field_f[var5].field_n, ((ke) this).field_f[var5].field_m, ((ke) this).field_f[var5].field_l + var2_int);
                    var6 = 16687906;
                    stackOut_11_0 = var5;
                    stackOut_11_1 = ((ke) this).field_b.field_h;
                    stackIn_18_0 = stackOut_11_0;
                    stackIn_18_1 = stackOut_11_1;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    if (var9 != 0) {
                      break L4;
                    } else {
                      L6: {
                        if (stackIn_12_0 != stackIn_12_1) {
                          break L6;
                        } else {
                          var6 = 16777215;
                          break L6;
                        }
                      }
                      var7 = ((ke) this).field_f[var5];
                      var8 = var7.field_o;
                      int discarded$1 = ga.a(var7.field_n, 1, var7.field_m, var8, 1, var7.field_r, var6, (mm) (Object) a.field_t, (byte) -125, 1, var2_int + var7.field_l);
                      var5++;
                      if (var9 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                stackOut_17_0 = param0;
                stackOut_17_1 = 16687906;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                break L4;
              }
              L7: {
                if (stackIn_18_0 == stackIn_18_1) {
                  break L7;
                } else {
                  ((ke) this).field_c = 100;
                  break L7;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "ke.N(" + param0 + ')');
        }
    }

    private final boolean c(boolean param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_42_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_41_0 = 0;
        try {
          L0: {
            L1: {
              this.h(118);
              var3_int = -1;
              if (((ke) this).field_b.field_h < 0) {
                break L1;
              } else {
                var3_int = ((ke) this).field_f[((ke) this).field_b.field_h].field_d;
                break L1;
              }
            }
            L2: {
              if (20 != var3_int) {
                break L2;
              } else {
                if (!((ke) this).field_b.b((byte) 114)) {
                  break L2;
                } else {
                  og.a(false, 5, true);
                  nm.f(-72);
                  stackOut_6_0 = 1;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0 != 0;
                }
              }
            }
            L3: {
              L4: {
                if (var3_int == 19) {
                  break L4;
                } else {
                  if (var3_int == 10) {
                    break L4;
                  } else {
                    if (3 == var3_int) {
                      break L4;
                    } else {
                      if (13 == var3_int) {
                        break L4;
                      } else {
                        if (param0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
              }
              if (((ke) this).field_b.b((byte) 114)) {
                L5: {
                  if (var3_int != 13) {
                    break L5;
                  } else {
                    he.field_db = false;
                    break L5;
                  }
                }
                L6: {
                  L7: {
                    lk.field_F = false;
                    if (var3_int == 3) {
                      break L7;
                    } else {
                      if (13 == var3_int) {
                        break L7;
                      } else {
                        break L6;
                      }
                    }
                  }
                  fm.field_e = false;
                  mg.field_Zb = false;
                  break L6;
                }
                qi.a(param0, (byte) -102);
                nm.f(115);
                stackOut_36_0 = 1;
                stackIn_37_0 = stackOut_36_0;
                return stackIn_37_0 != 0;
              } else {
                break L3;
              }
            }
            L8: {
              if (param1 >= 119) {
                break L8;
              } else {
                ((ke) this).b((byte) -109);
                break L8;
              }
            }
            stackOut_41_0 = 0;
            stackIn_42_0 = stackOut_41_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var3, "ke.AB(" + param0 + ',' + param1 + ')');
        }
        return stackIn_42_0 != 0;
    }

    final static void a(byte param0) {
        uf var1 = null;
        int var2 = 0;
        tj var3_ref_tj = null;
        int var3_int = 0;
        long var3 = 0L;
        ve var3_ref_ve = null;
        ve var4_ref_ve = null;
        int var4 = 0;
        String var5 = null;
        int var5_int = 0;
        ve var5_ref = null;
        tj var5_ref2 = null;
        String var6 = null;
        tj var6_ref = null;
        ve var6_ref2 = null;
        String var7 = null;
        tj var7_ref = null;
        tj var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        boolean stackIn_19_0 = false;
        boolean stackIn_20_0 = false;
        int stackIn_31_0 = 0;
        tj stackIn_160_0 = null;
        tj stackIn_161_0 = null;
        tj stackIn_162_0 = null;
        int stackIn_162_1 = 0;
        int stackIn_202_0 = 0;
        tj stackIn_209_0 = null;
        tj stackIn_210_0 = null;
        tj stackIn_211_0 = null;
        int stackIn_211_1 = 0;
        boolean stackOut_18_0 = false;
        boolean stackOut_19_0 = false;
        int stackOut_30_0 = 0;
        tj stackOut_159_0 = null;
        tj stackOut_161_0 = null;
        int stackOut_161_1 = 0;
        tj stackOut_160_0 = null;
        int stackOut_160_1 = 0;
        int stackOut_201_0 = 0;
        int stackOut_200_0 = 0;
        tj stackOut_208_0 = null;
        tj stackOut_210_0 = null;
        int stackOut_210_1 = 0;
        tj stackOut_209_0 = null;
        int stackOut_209_1 = 0;
        L0: {
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
              var1 = de.field_V;
              var2 = ((wl) (Object) var1).d((byte) -114);
              if (var2 == 0) {
                break L3;
              } else {
                if (var2 == 1) {
                  break L3;
                } else {
                  if (var2 == 2) {
                    break L3;
                  } else {
                    if (var2 == 3) {
                      break L3;
                    } else {
                      if (var2 != 4) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
            }
            var3_ref_tj = (tj) (Object) oc.field_b.c((byte) 117);
            L4: while (true) {
              L5: {
                L6: {
                  if (var3_ref_tj == null) {
                    break L6;
                  } else {
                    var3_ref_tj.b((byte) 110);
                    var3_ref_tj.e((byte) 73);
                    var3_ref_tj = (tj) (Object) oc.field_b.d(true);
                    if (var11 != 0) {
                      break L5;
                    } else {
                      if (var11 == 0) {
                        continue L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                var3_ref_tj = (tj) (Object) ob.field_i.c(-9443);
                break L5;
              }
              L7: while (true) {
                L8: {
                  L9: {
                    if (null == var3_ref_tj) {
                      break L9;
                    } else {
                      stackOut_18_0 = var3_ref_tj.field_bc;
                      stackIn_31_0 = stackOut_18_0 ? 1 : 0;
                      stackIn_19_0 = stackOut_18_0;
                      if (var11 != 0) {
                        break L8;
                      } else {
                        stackOut_19_0 = stackIn_19_0;
                        stackIn_20_0 = stackOut_19_0;
                        L10: {
                          L11: {
                            if (stackIn_20_0) {
                              break L11;
                            } else {
                              if (!var3_ref_tj.field_fc) {
                                break L10;
                              } else {
                                break L11;
                              }
                            }
                          }
                          L12: {
                            if (var3_ref_tj.field_fc) {
                              var3_ref_tj.field_fc = false;
                              cj.field_a = cj.field_a - 1;
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          var3_ref_tj.field_bc = false;
                          wk.a((byte) 94, var3_ref_tj);
                          break L10;
                        }
                        var3_ref_tj = (tj) (Object) ob.field_i.b(-99);
                        if (var11 == 0) {
                          continue L7;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  stackOut_30_0 = var2;
                  stackIn_31_0 = stackOut_30_0;
                  break L8;
                }
                L13: {
                  if (stackIn_31_0 != 1) {
                    break L13;
                  } else {
                    if (cd.field_m != null) {
                      ub.field_c = cd.field_m.field_Vb;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                }
                L14: {
                  L15: {
                    if (4 == var2) {
                      break L15;
                    } else {
                      cd.field_m = null;
                      if (var11 == 0) {
                        break L14;
                      } else {
                        break L15;
                      }
                    }
                  }
                  var3_int = ((wl) (Object) var1).e(3);
                  cd.field_m = new ve(j.field_b);
                  cd.field_m.a((long)var3_int, (byte) 111);
                  wg.a(false, (wl) (Object) var1, cd.field_m, (byte) -49);
                  km.field_C = 0L;
                  break L14;
                }
                L16: {
                  L17: {
                    if (2 == var2) {
                      break L17;
                    } else {
                      if (3 == var2) {
                        break L17;
                      } else {
                        g.field_N = null;
                        if (var11 == 0) {
                          break L16;
                        } else {
                          break L17;
                        }
                      }
                    }
                  }
                  if (g.field_N == null) {
                    g.field_N = new ve(j.field_b);
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L18: {
                  if (var2 == 3) {
                    break L18;
                  } else {
                    fj.field_h = false;
                    if (var11 == 0) {
                      break L1;
                    } else {
                      break L18;
                    }
                  }
                }
                fj.field_h = true;
                var3_int = 0;
                L19: while (true) {
                  L20: {
                    L21: {
                      if (kk.field_l.length <= var3_int) {
                        break L21;
                      } else {
                        kk.field_l[var3_int] = ((wl) (Object) var1).g((byte) -101);
                        var3_int++;
                        if (var11 != 0) {
                          break L20;
                        } else {
                          if (var11 == 0) {
                            continue L19;
                          } else {
                            break L21;
                          }
                        }
                      }
                    }
                    qa.field_x = ((wl) (Object) var1).d((byte) -95);
                    jb.field_c = ((wl) (Object) var1).d((byte) -128);
                    break L20;
                  }
                  var3_int = 0;
                  L22: while (true) {
                    L23: {
                      if (~v.field_a.length >= ~var3_int) {
                        break L23;
                      } else {
                        v.field_a[var3_int] = ((wl) (Object) var1).g((byte) -119);
                        var3_int++;
                        if (var11 != 0) {
                          break L1;
                        } else {
                          if (var11 == 0) {
                            continue L22;
                          } else {
                            break L23;
                          }
                        }
                      }
                    }
                    if (var11 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
          }
          L24: {
            if (var2 == 5) {
              break L24;
            } else {
              L25: {
                if (var2 == 6) {
                  break L25;
                } else {
                  L26: {
                    if (var2 == 7) {
                      break L26;
                    } else {
                      L27: {
                        if (8 != var2) {
                          break L27;
                        } else {
                          L28: {
                            var3_int = ((wl) (Object) var1).e(3);
                            var4_ref_ve = (ve) (Object) tg.field_b.a(24710, (long)var3_int);
                            if (var4_ref_ve != null) {
                              break L28;
                            } else {
                              var4_ref_ve = new ve(j.field_b);
                              tg.field_b.a((be) (Object) var4_ref_ve, -1, (long)var3_int);
                              break L28;
                            }
                          }
                          wg.a(true, (wl) (Object) var1, var4_ref_ve, (byte) -89);
                          pj.a(var4_ref_ve, (byte) -50);
                          if (var11 == 0) {
                            break L1;
                          } else {
                            break L27;
                          }
                        }
                      }
                      L29: {
                        if (var2 != 9) {
                          break L29;
                        } else {
                          L30: {
                            var3_int = ((wl) (Object) var1).e(3);
                            var4 = ((wl) (Object) var1).d((byte) -41);
                            var5_ref = (ve) (Object) tg.field_b.a(24710, (long)var3_int);
                            if (var5_ref != null) {
                              L31: {
                                L32: {
                                  if (var4 == 0) {
                                    break L32;
                                  } else {
                                    var5_ref.field_Rb = oa.field_a;
                                    var5_ref.field_oc = var4;
                                    if (var11 == 0) {
                                      break L31;
                                    } else {
                                      break L32;
                                    }
                                  }
                                }
                                var5_ref.b((byte) 127);
                                break L31;
                              }
                              var5_ref.e((byte) 98);
                              break L30;
                            } else {
                              break L30;
                            }
                          }
                          if (var11 == 0) {
                            break L1;
                          } else {
                            break L29;
                          }
                        }
                      }
                      L33: {
                        if (var2 == 10) {
                          break L33;
                        } else {
                          L34: {
                            L35: {
                              if (var2 == 11) {
                                break L35;
                              } else {
                                if (12 != var2) {
                                  break L34;
                                } else {
                                  break L35;
                                }
                              }
                            }
                            L36: {
                              var3_int = ((wl) (Object) var1).e(3);
                              var4_ref_ve = (ve) (Object) tg.field_b.a(24710, (long)var3_int);
                              if (var4_ref_ve != null) {
                                L37: {
                                  L38: {
                                    if (var2 != 11) {
                                      break L38;
                                    } else {
                                      var4_ref_ve.field_Zb = true;
                                      if (var11 == 0) {
                                        break L37;
                                      } else {
                                        break L38;
                                      }
                                    }
                                  }
                                  var4_ref_ve.field_Ob = true;
                                  break L37;
                                }
                                pj.a(var4_ref_ve, (byte) -50);
                                break L36;
                              } else {
                                break L36;
                              }
                            }
                            if (var11 == 0) {
                              break L1;
                            } else {
                              break L34;
                            }
                          }
                          L39: {
                            if (var2 != 13) {
                              break L39;
                            } else {
                              L40: {
                                var3_int = ((wl) (Object) var1).e(3);
                                var4 = ((wl) (Object) var1).d((byte) -49);
                                var5_ref = (ve) (Object) tg.field_b.a(24710, (long)var3_int);
                                if (var5_ref == null) {
                                  break L40;
                                } else {
                                  L41: {
                                    var6_ref2 = var5_ref;
                                    var5_ref.field_Ob = false;
                                    var6_ref2.field_Zb = false;
                                    if (0 == var4) {
                                      break L41;
                                    } else {
                                      var5_ref.field_Rb = oa.field_a;
                                      var5_ref.field_oc = var4;
                                      break L41;
                                    }
                                  }
                                  pj.a(var5_ref, (byte) -50);
                                  break L40;
                                }
                              }
                              if (var11 == 0) {
                                break L1;
                              } else {
                                break L39;
                              }
                            }
                          }
                          L42: {
                            L43: {
                              if (var2 == 14) {
                                break L43;
                              } else {
                                if (var2 != 16) {
                                  break L42;
                                } else {
                                  break L43;
                                }
                              }
                            }
                            L44: {
                              var3 = ((wl) (Object) var1).f((byte) -108);
                              var5_ref2 = ma.a(-119, var3);
                              if (var5_ref2 != null) {
                                L45: {
                                  L46: {
                                    if (14 == var2) {
                                      break L46;
                                    } else {
                                      if (var5_ref2.field_fc) {
                                        break L45;
                                      } else {
                                        var5_ref2.field_fc = true;
                                        cj.field_a = cj.field_a + 1;
                                        if (var11 == 0) {
                                          break L45;
                                        } else {
                                          break L46;
                                        }
                                      }
                                    }
                                  }
                                  var5_ref2.field_bc = true;
                                  break L45;
                                }
                                wk.a((byte) 57, var5_ref2);
                                break L44;
                              } else {
                                break L44;
                              }
                            }
                            if (var11 == 0) {
                              break L1;
                            } else {
                              break L42;
                            }
                          }
                          L47: {
                            if (var2 == 15) {
                              break L47;
                            } else {
                              if (var2 == 17) {
                                break L47;
                              } else {
                                L48: {
                                  if (18 == var2) {
                                    break L48;
                                  } else {
                                    L49: {
                                      if (19 == var2) {
                                        break L49;
                                      } else {
                                        L50: {
                                          if (20 != var2) {
                                            break L50;
                                          } else {
                                            wg.a(false, (wl) (Object) var1, cd.field_m, (byte) -103);
                                            if (var11 == 0) {
                                              break L1;
                                            } else {
                                              break L50;
                                            }
                                          }
                                        }
                                        L51: {
                                          if (21 == var2) {
                                            break L51;
                                          } else {
                                            L52: {
                                              if (22 != var2) {
                                                break L52;
                                              } else {
                                                de.field_R = ((wl) (Object) var1).e(3);
                                                rf.field_o = ((wl) (Object) var1).a(-104);
                                                if (var11 == 0) {
                                                  break L1;
                                                } else {
                                                  break L52;
                                                }
                                              }
                                            }
                                            L53: {
                                              if (23 != var2) {
                                                break L53;
                                              } else {
                                                uc.field_g = ((wl) (Object) var1).f((byte) -108);
                                                if (var11 == 0) {
                                                  break L1;
                                                } else {
                                                  break L53;
                                                }
                                              }
                                            }
                                            qb.a((Throwable) null, 16408, "L1: " + qk.d((byte) 49));
                                            si.a(117);
                                            if (var11 == 0) {
                                              break L1;
                                            } else {
                                              break L51;
                                            }
                                          }
                                        }
                                        L54: {
                                          L55: {
                                            var3_int = ((wl) (Object) var1).e(3);
                                            if (var3_int != 0) {
                                              break L55;
                                            } else {
                                              km.field_C = 0L;
                                              if (var11 == 0) {
                                                break L54;
                                              } else {
                                                break L55;
                                              }
                                            }
                                          }
                                          km.field_C = ik.a(4) + (long)var3_int;
                                          break L54;
                                        }
                                        if (var11 == 0) {
                                          break L1;
                                        } else {
                                          break L49;
                                        }
                                      }
                                    }
                                    L56: {
                                      var3 = ((wl) (Object) var1).f((byte) -108);
                                      var5_int = ((wl) (Object) var1).d((byte) -41);
                                      var6_ref = bj.a(var3, (byte) 79);
                                      if (null != var6_ref) {
                                        L57: {
                                          L58: {
                                            if (var5_int == 0) {
                                              break L58;
                                            } else {
                                              var6_ref.field_hc = var5_int;
                                              var6_ref.field_Qb = oa.field_a;
                                              if (var11 == 0) {
                                                break L57;
                                              } else {
                                                break L58;
                                              }
                                            }
                                          }
                                          var6_ref.b((byte) 105);
                                          break L57;
                                        }
                                        var6_ref.e((byte) 84);
                                        cd.field_m.field_rc = cd.field_m.field_rc - 1;
                                        break L56;
                                      } else {
                                        break L56;
                                      }
                                    }
                                    if (var11 == 0) {
                                      break L1;
                                    } else {
                                      break L48;
                                    }
                                  }
                                }
                                L59: {
                                  var3 = ((wl) (Object) var1).f((byte) -108);
                                  var5 = ((wl) (Object) var1).c((byte) -38);
                                  var6 = ((wl) (Object) var1).c((byte) -38);
                                  var7_ref = bj.a(var3, (byte) 63);
                                  if (var7_ref != null) {
                                    break L59;
                                  } else {
                                    var7_ref = new tj(var5, var6, var3);
                                    hn.field_h.a((be) (Object) var7_ref, -1, var3);
                                    cd.field_m.field_rc = cd.field_m.field_rc + 1;
                                    break L59;
                                  }
                                }
                                L60: {
                                  var7_ref.field_Ub = ((wl) (Object) var1).e(3);
                                  var8_int = ((wl) (Object) var1).a(-69);
                                  var7_ref.field_Xb = var8_int >> 1139399329;
                                  stackOut_159_0 = (tj) var7_ref;
                                  stackIn_161_0 = stackOut_159_0;
                                  stackIn_160_0 = stackOut_159_0;
                                  if ((1 & var8_int) == 0) {
                                    stackOut_161_0 = (tj) (Object) stackIn_161_0;
                                    stackOut_161_1 = 0;
                                    stackIn_162_0 = stackOut_161_0;
                                    stackIn_162_1 = stackOut_161_1;
                                    break L60;
                                  } else {
                                    stackOut_160_0 = (tj) (Object) stackIn_160_0;
                                    stackOut_160_1 = 1;
                                    stackIn_162_0 = stackOut_160_0;
                                    stackIn_162_1 = stackOut_160_1;
                                    break L60;
                                  }
                                }
                                stackIn_162_0.field_ec = stackIn_162_1 != 0;
                                var7_ref.field_dc = ((wl) (Object) var1).d((byte) -29);
                                var7_ref.field_Sb = ((wl) (Object) var1).d((byte) -79);
                                oc.field_b.a((bh) (Object) var7_ref, 2777);
                                if (var11 == 0) {
                                  break L1;
                                } else {
                                  break L47;
                                }
                              }
                            }
                          }
                          L61: {
                            var3 = ((wl) (Object) var1).f((byte) -108);
                            var5_int = ((wl) (Object) var1).d((byte) -87);
                            var6_ref = ma.a(-119, var3);
                            if (var6_ref == null) {
                              break L61;
                            } else {
                              L62: {
                                if (var5_int == 0) {
                                  break L62;
                                } else {
                                  var6_ref.field_Qb = oa.field_a;
                                  var6_ref.field_hc = var5_int;
                                  break L62;
                                }
                              }
                              L63: {
                                L64: {
                                  if (var2 != 15) {
                                    break L64;
                                  } else {
                                    var6_ref.field_bc = false;
                                    if (var11 == 0) {
                                      break L63;
                                    } else {
                                      break L64;
                                    }
                                  }
                                }
                                if (var6_ref.field_fc) {
                                  cj.field_a = cj.field_a - 1;
                                  var6_ref.field_fc = false;
                                  break L63;
                                } else {
                                  break L63;
                                }
                              }
                              wk.a((byte) 34, var6_ref);
                              break L61;
                            }
                          }
                          if (var11 == 0) {
                            break L1;
                          } else {
                            break L33;
                          }
                        }
                      }
                      var3_ref_ve = (ve) (Object) h.field_b.c((byte) 121);
                      L65: while (true) {
                        L66: {
                          if (var3_ref_ve == null) {
                            break L66;
                          } else {
                            var3_ref_ve.b((byte) 115);
                            var3_ref_ve.e((byte) 118);
                            var3_ref_ve = (ve) (Object) h.field_b.d(true);
                            if (var11 != 0) {
                              break L1;
                            } else {
                              if (var11 == 0) {
                                continue L65;
                              } else {
                                break L66;
                              }
                            }
                          }
                        }
                        if (var11 == 0) {
                          break L1;
                        } else {
                          break L26;
                        }
                      }
                    }
                  }
                  var3_ref_tj = (tj) (Object) i.field_b.c((byte) 43);
                  L67: while (true) {
                    L68: {
                      L69: {
                        if (null == var3_ref_tj) {
                          break L69;
                        } else {
                          var3_ref_tj.b((byte) 108);
                          var3_ref_tj.e((byte) 112);
                          var3_ref_tj = (tj) (Object) i.field_b.d(true);
                          if (var11 != 0) {
                            break L68;
                          } else {
                            if (var11 == 0) {
                              continue L67;
                            } else {
                              break L69;
                            }
                          }
                        }
                      }
                      cj.field_a = 0;
                      break L68;
                    }
                    if (var11 == 0) {
                      break L1;
                    } else {
                      break L25;
                    }
                  }
                }
              }
              L70: {
                var3 = ((wl) (Object) var1).f((byte) -108);
                var5_int = ((wl) (Object) var1).d((byte) -89);
                var6_ref = ma.a(-122, var3);
                if (var6_ref != null) {
                  L71: {
                    if (!var6_ref.field_fc) {
                      break L71;
                    } else {
                      var6_ref.field_fc = false;
                      cj.field_a = cj.field_a - 1;
                      break L71;
                    }
                  }
                  L72: {
                    L73: {
                      if (var5_int == 0) {
                        break L73;
                      } else {
                        var6_ref.field_hc = var5_int;
                        var6_ref.field_Qb = oa.field_a;
                        if (var11 == 0) {
                          break L72;
                        } else {
                          break L73;
                        }
                      }
                    }
                    var6_ref.b((byte) 114);
                    break L72;
                  }
                  var6_ref.e((byte) 95);
                  break L70;
                } else {
                  break L70;
                }
              }
              if (var11 == 0) {
                break L1;
              } else {
                break L24;
              }
            }
          }
          L74: {
            var3 = ((wl) (Object) var1).f((byte) -108);
            var5 = ((wl) (Object) var1).c((byte) -38);
            var6 = ((wl) (Object) var1).c((byte) -38);
            var7 = ((wl) (Object) var1).c((byte) -38);
            var8 = ma.a(-102, var3);
            if (var6.equals((Object) (Object) "")) {
              stackOut_201_0 = 0;
              stackIn_202_0 = stackOut_201_0;
              break L74;
            } else {
              stackOut_200_0 = 1;
              stackIn_202_0 = stackOut_200_0;
              break L74;
            }
          }
          L75: {
            L76: {
              var9 = stackIn_202_0;
              if (null != var8) {
                break L76;
              } else {
                var8 = new tj(var5, var7, var3);
                ob.field_i.a((be) (Object) var8, -1, var3);
                if (var11 == 0) {
                  break L75;
                } else {
                  break L76;
                }
              }
            }
            if (var9 != 0) {
              var8.a((byte) 19, var7, var5);
              break L75;
            } else {
              break L75;
            }
          }
          L77: {
            var8.field_Nb = ik.a(4) - (long)((wl) (Object) var1).i(7553);
            var8.field_Ub = ((wl) (Object) var1).e(3);
            var10 = ((wl) (Object) var1).a(-28);
            stackOut_208_0 = (tj) var8;
            stackIn_210_0 = stackOut_208_0;
            stackIn_209_0 = stackOut_208_0;
            if ((var10 & 1) == 0) {
              stackOut_210_0 = (tj) (Object) stackIn_210_0;
              stackOut_210_1 = 0;
              stackIn_211_0 = stackOut_210_0;
              stackIn_211_1 = stackOut_210_1;
              break L77;
            } else {
              stackOut_209_0 = (tj) (Object) stackIn_209_0;
              stackOut_209_1 = 1;
              stackIn_211_0 = stackOut_209_0;
              stackIn_211_1 = stackOut_209_1;
              break L77;
            }
          }
          stackIn_211_0.field_ec = stackIn_211_1 != 0;
          var8.field_Xb = var10 >> -125735103;
          var8.field_dc = ((wl) (Object) var1).d((byte) -98);
          var8.field_Sb = ((wl) (Object) var1).d((byte) -128);
          wk.a((byte) 112, var8);
          break L1;
        }
    }

    final static int a(int param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 2047) {
                break L1;
              } else {
                field_h = null;
                break L1;
              }
            }
            stackOut_3_0 = qg.field_b[param1 & 2047];
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "ke.BB(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final void c(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -75) {
                break L1;
              } else {
                ((ke) this).field_r = true;
                break L1;
              }
            }
            this.a(false, 15764);
            var2_int = 640 + (-(((ke) this).field_o * ((ke) this).field_o * 640 / 400) - (((ke) this).field_u >> -1363351294));
            ed.a(16777215, var2_int + 320, si.field_g, 120, (byte) 75, (mm) (Object) w.field_kb);
            ed.a(16777215, var2_int + 320, gf.a(-125, ((ke) this).field_s, ((ke) this).field_j, ((ke) this).field_r), 140, (byte) 75, (mm) (Object) w.field_kb);
            ed.a(16777215, 320 + var2_int, ri.a(param0 ^ -75, ((ke) this).field_s, ((ke) this).field_j, ((ke) this).field_r), 240, (byte) 75, (mm) (Object) w.field_kb);
            ed.a(16777215, var2_int + 320, kk.a(((ke) this).field_j, ((ke) this).field_s, ((ke) this).field_r, true), 300, (byte) 75, (mm) (Object) w.field_kb);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "ke.B(" + param0 + ')');
        }
    }

    final void i(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        ck var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String var6 = null;
        int var7 = 0;
        String[] var8_ref_String__ = null;
        int var8 = 0;
        int[] var9_ref_int__ = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Object stackIn_23_0 = null;
        String stackIn_23_1 = null;
        Object stackIn_41_0 = null;
        String stackIn_41_1 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_22_0 = null;
        String stackOut_22_1 = null;
        Object stackOut_40_0 = null;
        String stackOut_40_1 = null;
        var15 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = -(((ke) this).field_u >> 174174562) + (-(640 * ((ke) this).field_o * ((ke) this).field_o / 400) + 640);
              this.a(false, 15764);
              var3 = wh.field_f;
              var3.c(-(var3.field_K / 2) + 320, 45 + (-(var3.field_C / 2) - (var2_int >> -1906814366)));
              if (null != ((ke) this).field_e) {
                break L1;
              } else {
                if (!ph.n(-30146)) {
                  ((ke) this).field_e = am.a(3, false, 1, 1, 10);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            var4 = -44 / ((63 - param0) / 44);
            var5 = bf.a((byte) 107, gh.field_e, fc.field_e, ((ke) this).field_e);
            fl.a(105, 256, 16777215, vm.field_x, 125 - -var2_int, (mm) (Object) w.field_kb);
            kn.a((mm) (Object) w.field_kb, (byte) -39, 105, ng.field_g, 16777215, var2_int + 400);
            kn.a((mm) (Object) w.field_kb, (byte) -39, 105, sl.field_b, 16777215, 545 + var2_int);
            var6_int = 0;
            L2: while (true) {
              L3: {
                if (var6_int >= 10) {
                  break L3;
                } else {
                  var7 = 16777215;
                  kn.a((mm) (Object) w.field_kb, (byte) -39, 130 + var6_int * 20, 1 + var6_int + ".", var7, var2_int + 115);
                  var6_int++;
                  if (var15 == 0) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                L5: {
                  var6 = le.field_r;
                  var7 = 1;
                  if (null == ((ke) this).field_e) {
                    break L5;
                  } else {
                    L6: {
                      if (((ke) this).field_e.field_p) {
                        break L6;
                      } else {
                        var6 = wm.field_k;
                        if (var15 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      L8: {
                        if (null != ((ke) this).field_e.field_r) {
                          break L8;
                        } else {
                          var6 = dn.field_s;
                          if (var15 == 0) {
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                      var8_ref_String__ = ((ke) this).field_e.field_r[fc.field_e];
                      var9_ref_int__ = ((ke) this).field_e.field_u[fc.field_e];
                      var10 = 0;
                      L9: while (true) {
                        if (10 <= var10) {
                          break L7;
                        } else {
                          stackOut_22_0 = null;
                          stackOut_22_1 = var8_ref_String__[var10];
                          stackIn_41_0 = stackOut_22_0;
                          stackIn_41_1 = stackOut_22_1;
                          stackIn_23_0 = stackOut_22_0;
                          stackIn_23_1 = stackOut_22_1;
                          if (var15 != 0) {
                            break L4;
                          } else {
                            L10: {
                              if (stackIn_23_0 == (Object) (Object) stackIn_23_1) {
                                break L10;
                              } else {
                                L11: {
                                  var6 = null;
                                  var11 = 16769088;
                                  var12 = var9_ref_int__[var10];
                                  var13 = var12 >>> 869777032;
                                  if (~var5 == ~var10) {
                                    var11 = 16777215;
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                                var14 = 1 + var12 % 256;
                                fl.a(130 + 20 * var10, 256, var11, var8_ref_String__[var10], 125 - -var2_int, (mm) (Object) se.field_S);
                                kn.a((mm) (Object) se.field_S, (byte) -39, 20 * var10 + 130, Integer.toString(var14), var11, var2_int + 400);
                                kn.a((mm) (Object) se.field_S, (byte) -39, var10 * 20 + 130, Integer.toString(var13), var11, var2_int + 545);
                                break L10;
                              }
                            }
                            var10++;
                            if (var15 == 0) {
                              continue L9;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                    }
                    if (var5 >= 0) {
                      break L5;
                    } else {
                      if (null == gh.field_e) {
                        break L5;
                      } else {
                        if (gh.field_e.field_x != 1) {
                          break L5;
                        } else {
                          fl.a(330, 256, 16777215, oa.field_f, var2_int + 125, (mm) (Object) se.field_S);
                          var8 = gh.field_e.field_s[0];
                          var9 = var8 % 256 + 1;
                          kn.a((mm) (Object) se.field_S, (byte) -39, 330, Integer.toString(var9), 16777215, 400 + var2_int);
                          var10 = var8 >>> -1510192632;
                          var7 = 0;
                          kn.a((mm) (Object) se.field_S, (byte) -39, 330, Integer.toString(var10), 16777215, var2_int + 545);
                          break L5;
                        }
                      }
                    }
                  }
                }
                stackOut_40_0 = null;
                stackOut_40_1 = (String) var6;
                stackIn_41_0 = stackOut_40_0;
                stackIn_41_1 = stackOut_40_1;
                break L4;
              }
              L12: {
                if (stackIn_41_0 != (Object) (Object) stackIn_41_1) {
                  ed.a(16777215, 320 - -var2_int, var6, 220, (byte) 75, (mm) (Object) w.field_kb);
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                L14: {
                  if (!ph.n(-30146)) {
                    break L14;
                  } else {
                    ed.a(16777215, 320 + var2_int, lf.field_d, 330, (byte) 75, (mm) (Object) se.field_S);
                    if (var15 == 0) {
                      break L13;
                    } else {
                      break L14;
                    }
                  }
                }
                if (var7 != 0) {
                  ed.a(16777215, var2_int + 320, af.field_e, 330, (byte) 75, (mm) (Object) se.field_S);
                  break L13;
                } else {
                  break L13;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "ke.I(" + param0 + ')');
        }
    }

    final void i(byte param0) {
        if (param0 != 39) {
            return;
        }
        try {
            ((ke) this).field_b.a(-115);
            boolean discarded$0 = this.p(-1);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "ke.Q(" + param0 + ')');
        }
    }

    private final void a(boolean param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
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
        qc stackIn_42_0 = null;
        int stackIn_101_0 = 0;
        int stackIn_105_0 = 0;
        RuntimeException decompiledCaughtException = null;
        qc stackOut_41_0 = null;
        qc stackOut_39_0 = null;
        int stackOut_100_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_102_0 = 0;
        var15 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = -(((ke) this).field_u >> -134113438) + (640 - ((ke) this).field_o * (((ke) this).field_o * 640) / 400);
              hk.a(4 + ((ke) this).field_w - -var3_int, ((ke) this).field_z - -4, ((ke) this).field_y - 8, -8 + ((ke) this).field_q, 0, 150);
              vk.a(((ke) this).field_q, (byte) 50, a.field_n, ((ke) this).field_y, ((ke) this).field_z, ((ke) this).field_w + var3_int);
              if (param1 == 15764) {
                break L1;
              } else {
                ((ke) this).field_r = false;
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (~var4 <= ~((ke) this).field_b.field_l) {
                    break L4;
                  } else {
                    var5 = ((ke) this).field_f[var4];
                    var6 = var5.field_o;
                    var7 = var5.field_m;
                    var8 = var5.field_r;
                    if (var15 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (param0) {
                          L6: {
                            var9 = var7;
                            var10 = var8;
                            if (var4 <= 0) {
                              break L6;
                            } else {
                              var7 -= 3;
                              var8 += 3;
                              break L6;
                            }
                          }
                          L7: {
                            if (((ke) this).field_b.field_l - 1 > var4) {
                              var8 += 3;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          hk.b(0, var9, 640, var10 + var9);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L8: {
                        L9: {
                          var9 = 16694016;
                          if (~var4 != ~((ke) this).field_b.field_h) {
                            break L9;
                          } else {
                            var9 = 16777215;
                            vk.a(var8, (byte) 50, im.field_i, var5.field_n, var7, var3_int + var5.field_l);
                            if (var15 == 0) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        vk.a(var8, (byte) 50, on.field_e, var5.field_n, var7, var3_int + var5.field_l);
                        break L8;
                      }
                      L10: {
                        if (var5.field_d == 15) {
                          L11: {
                            if ((kf.field_I.field_g.field_d & 1 << kf.field_I.field_P) != 0) {
                              break L11;
                            } else {
                              L12: {
                                if (kf.field_I.field_g.field_d == 0) {
                                  break L12;
                                } else {
                                  var6 = pg.field_c;
                                  if ((uf.field_A & 16) != 0) {
                                    break L10;
                                  } else {
                                    var9 = 16777215;
                                    if (var15 == 0) {
                                      break L10;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                              var6 = kf.field_R;
                              if (var15 == 0) {
                                break L10;
                              } else {
                                break L11;
                              }
                            }
                          }
                          var6 = e.field_a;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      L13: {
                        if (var5.field_d != 17) {
                          break L13;
                        } else {
                          L14: {
                            if (kf.field_I == null) {
                              stackOut_41_0 = ce.field_C;
                              stackIn_42_0 = stackOut_41_0;
                              break L14;
                            } else {
                              stackOut_39_0 = kf.field_I;
                              stackIn_42_0 = stackOut_39_0;
                              break L14;
                            }
                          }
                          L15: {
                            var10_ref_qc = stackIn_42_0;
                            if (var10_ref_qc.field_W) {
                              break L15;
                            } else {
                              L16: {
                                if (0 == (1 << var10_ref_qc.field_P & var10_ref_qc.field_g.field_a)) {
                                  break L16;
                                } else {
                                  var6 = sc.field_h;
                                  if (var15 == 0) {
                                    break L13;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                              L17: {
                                if (var10_ref_qc.field_g.field_a == 0) {
                                  break L17;
                                } else {
                                  L18: {
                                    if ((uf.field_A & 16) == 0) {
                                      var9 = 16777215;
                                      break L18;
                                    } else {
                                      break L18;
                                    }
                                  }
                                  var6 = k.field_h;
                                  if (var15 == 0) {
                                    break L13;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                              L19: {
                                if (~((1 << var10_ref_qc.field_g.field_b) + -1) != ~(var10_ref_qc.field_yb | 1 << var10_ref_qc.field_P)) {
                                  break L19;
                                } else {
                                  var6 = ig.field_Xb;
                                  if (var15 == 0) {
                                    break L13;
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                              var6 = ji.field_c;
                              if (var15 == 0) {
                                break L13;
                              } else {
                                break L15;
                              }
                            }
                          }
                          L20: {
                            if ((var10_ref_qc.field_g.field_a & 1 << var10_ref_qc.field_P) == 0) {
                              break L20;
                            } else {
                              var6 = rc.field_g;
                              if (var15 == 0) {
                                break L13;
                              } else {
                                break L20;
                              }
                            }
                          }
                          L21: {
                            if (var10_ref_qc.field_g.field_a == 0) {
                              break L21;
                            } else {
                              var6 = wj.field_Kb;
                              if (0 != (uf.field_A & 16)) {
                                break L13;
                              } else {
                                var9 = 16777215;
                                if (var15 == 0) {
                                  break L13;
                                } else {
                                  break L21;
                                }
                              }
                            }
                          }
                          L22: {
                            if ((1 << var10_ref_qc.field_g.field_b) - 1 == (1 << var10_ref_qc.field_P | var10_ref_qc.field_yb)) {
                              break L22;
                            } else {
                              var6 = ik.field_g;
                              if (var15 == 0) {
                                break L13;
                              } else {
                                break L22;
                              }
                            }
                          }
                          var6 = di.field_E;
                          break L13;
                        }
                      }
                      L23: {
                        L24: {
                          if (var5.field_d == 6) {
                            break L24;
                          } else {
                            if (var5.field_d == 7) {
                              break L24;
                            } else {
                              L25: {
                                if (var5.field_d != 22) {
                                  break L25;
                                } else {
                                  if (~var4 != ~fc.field_e) {
                                    break L25;
                                  } else {
                                    var9 = 16777215;
                                    break L25;
                                  }
                                }
                              }
                              L26: {
                                if (var5.field_d != 23) {
                                  break L26;
                                } else {
                                  if (var4 != cj.field_c) {
                                    break L26;
                                  } else {
                                    var9 = 16777215;
                                    break L26;
                                  }
                                }
                              }
                              int discarded$2 = ga.a(var5.field_n, 1, var7, var6, 20, var8, var9, (mm) (Object) a.field_t, (byte) -128, 1, var5.field_l - -var3_int);
                              if (var15 == 0) {
                                break L23;
                              } else {
                                break L24;
                              }
                            }
                          }
                        }
                        L27: {
                          var10 = a.field_t.a(pm.field_c);
                          var11 = a.field_t.a(fj.field_f);
                          if (var11 > var10) {
                            var10 = var11;
                            break L27;
                          } else {
                            break L27;
                          }
                        }
                        L28: {
                          var12 = (var10 + 5 + (-128 + var5.field_n)) / 2 + var5.field_l;
                          hk.a(-1 + var12 + var3_int, var7 + 11, 130, 8, 65793);
                          hk.a(1 + (var12 + var3_int), 13 + var7, 126, 4, var9);
                          if (var5.field_d != 6) {
                            stackOut_100_0 = a.field_g * 128 / 128;
                            stackIn_101_0 = stackOut_100_0;
                            break L28;
                          } else {
                            stackOut_98_0 = pb.field_d * 128 / 128;
                            stackIn_101_0 = stackOut_98_0;
                            break L28;
                          }
                        }
                        L29: {
                          var13 = stackIn_101_0;
                          int discarded$3 = ga.a(-5 + var12 - var5.field_l, 1, var7, var6, 20, var8, var9, (mm) (Object) a.field_t, (byte) -124, 2, var5.field_l - -var3_int);
                          if (var5.field_d == 6) {
                            stackOut_104_0 = 1;
                            stackIn_105_0 = stackOut_104_0;
                            break L29;
                          } else {
                            stackOut_102_0 = 3;
                            stackIn_105_0 = stackOut_102_0;
                            break L29;
                          }
                        }
                        var14 = stackIn_105_0;
                        tg.a(true, var14).c(var3_int + (-9 + var12) - -var13, 6 + var7, 18, 18);
                        break L23;
                      }
                      L30: {
                        if (var5.field_d != 2) {
                          break L30;
                        } else {
                          L31: {
                            if (id.field_P < 3) {
                              break L31;
                            } else {
                              if (!h.a(false)) {
                                break L30;
                              } else {
                                break L31;
                              }
                            }
                          }
                          hk.c(8 + (var3_int + var5.field_l), var7 + 3, var5.field_n - 16, 2);
                          hk.c(4 + (var3_int + var5.field_l), var7 - -5, var5.field_n + -8, -10 + var8);
                          hk.c(8 + (var3_int + var5.field_l), -5 + (var8 + var7), -16 + var5.field_n, 2);
                          break L30;
                        }
                      }
                      var4++;
                      if (var15 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                hk.d();
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var3, "ke.O(" + param0 + ',' + param1 + ')');
        }
    }

    final void c(int param0, boolean param1) {
        try {
            ((ke) this).field_b.a(param1, 117, this.a(400, bh.field_g, pm.field_f));
            if (param0 != -1) {
                ((ke) this).field_z = -92;
            }
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "ke.C(" + param0 + ',' + param1 + ')');
        }
    }

    final void l(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_58_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        boolean stackOut_57_0 = false;
        var4 = client.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = 39 / ((47 - param0) / 51);
            h.a((ke) this, (byte) 95);
            L1: while (true) {
              L2: {
                L3: {
                  if (!ab.c((byte) -124)) {
                    break L3;
                  } else {
                    stackOut_3_0 = ~wh.field_c;
                    stackIn_58_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (stackIn_4_0 != -14) {
                        L4: {
                          L5: {
                            if (ph.n(-30146)) {
                              break L5;
                            } else {
                              L6: {
                                ((ke) this).field_b.d(0);
                                if (wh.field_c != 96) {
                                  break L6;
                                } else {
                                  fc.field_e = (-1 + (3 + fc.field_e)) % 3;
                                  ((ke) this).field_b.a(fc.field_e, (byte) -113);
                                  nm.f(4);
                                  ((ke) this).field_b.field_o = false;
                                  break L6;
                                }
                              }
                              L7: {
                                if (wh.field_c != 97) {
                                  break L7;
                                } else {
                                  fc.field_e = (fc.field_e - -1) % 3;
                                  ((ke) this).field_b.a(fc.field_e, (byte) -75);
                                  nm.f(-117);
                                  ((ke) this).field_b.field_o = false;
                                  break L7;
                                }
                              }
                              L8: {
                                if (wh.field_c == 98) {
                                  L9: {
                                    if (((ke) this).field_b.field_h >= 3) {
                                      break L9;
                                    } else {
                                      ((ke) this).field_b.a(-1 + ((ke) this).field_b.field_l, (byte) -76);
                                      if (var4 == 0) {
                                        break L8;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  L10: {
                                    if (((ke) this).field_b.field_h == 3) {
                                      break L10;
                                    } else {
                                      ((ke) this).field_b.a(((ke) this).field_b.field_h + -1, (byte) -110);
                                      if (var4 == 0) {
                                        break L8;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                  ((ke) this).field_b.a(fc.field_e, (byte) -113);
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                              if (wh.field_c == 99) {
                                L11: {
                                  if (((ke) this).field_b.field_h < 0) {
                                    break L11;
                                  } else {
                                    if (-1 + ((ke) this).field_b.field_l == ((ke) this).field_b.field_h) {
                                      break L11;
                                    } else {
                                      L12: {
                                        if (((ke) this).field_b.field_h >= 3) {
                                          break L12;
                                        } else {
                                          ((ke) this).field_b.a(3, (byte) -126);
                                          if (var4 == 0) {
                                            break L4;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                      ((ke) this).field_b.a(((ke) this).field_b.field_h + 1, (byte) -95);
                                      if (var4 == 0) {
                                        break L4;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                }
                                ((ke) this).field_b.a(fc.field_e, (byte) -123);
                                if (var4 == 0) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              } else {
                                break L4;
                              }
                            }
                          }
                          ((ke) this).field_b.a(-113);
                          break L4;
                        }
                        var3 = this.c(false, (byte) -96) ? 1 : 0;
                        if (var3 == 0) {
                          if (var4 == 0) {
                            continue L1;
                          } else {
                            break L3;
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
                stackOut_57_0 = this.c(true, (byte) -76);
                stackIn_58_0 = stackOut_57_0 ? 1 : 0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "ke.PA(" + param0 + ')');
        }
    }

    final void a(int param0, byte param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = client.field_A ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (((ke) this).field_b.field_l <= var3_int) {
                    break L3;
                  } else {
                    ((ke) this).field_f[var3_int].field_m = ((ke) this).field_f[var3_int].field_m + param0;
                    var3_int++;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.a(false, 15764);
                var3_int = 0;
                break L2;
              }
              L4: {
                if (param1 == -54) {
                  break L4;
                } else {
                  ((ke) this).field_v = null;
                  break L4;
                }
              }
              L5: while (true) {
                L6: {
                  L7: {
                    if (~((ke) this).field_b.field_l >= ~var3_int) {
                      break L7;
                    } else {
                      ((ke) this).field_f[var3_int].field_m = ((ke) this).field_f[var3_int].field_m - param0;
                      var3_int++;
                      if (var4 != 0) {
                        break L6;
                      } else {
                        if (var4 == 0) {
                          continue L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  break L6;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw dh.a((Throwable) (Object) runtimeException, "ke.MA(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean c(boolean param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_9_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_41_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_40_0 = 0;
        try {
          L0: {
            L1: {
              this.h(123);
              var3_int = -1;
              if (((ke) this).field_b.field_h >= 0) {
                var3_int = ((ke) this).field_f[((ke) this).field_b.field_h].field_d;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (20 != var3_int) {
                break L2;
              } else {
                if (!((ke) this).field_b.b((byte) 114)) {
                  break L2;
                } else {
                  og.a(false, 8, true);
                  nm.f(-11);
                  stackOut_8_0 = 1;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0 != 0;
                }
              }
            }
            L3: {
              L4: {
                if (var3_int == 3) {
                  break L4;
                } else {
                  if (var3_int == 13) {
                    break L4;
                  } else {
                    if (param0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              if (!((ke) this).field_b.b((byte) 114)) {
                break L3;
              } else {
                L5: {
                  fm.field_e = false;
                  if (var3_int == 13) {
                    he.field_db = false;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                qi.a(param0, (byte) -103);
                nm.f(11);
                stackOut_26_0 = 1;
                stackIn_27_0 = stackOut_26_0;
                return stackIn_27_0 != 0;
              }
            }
            L6: {
              if (!param0) {
                break L6;
              } else {
                if (ig.field_Yb == 0) {
                  break L6;
                } else {
                  if (((ke) this).field_b.field_h == -1) {
                    break L6;
                  } else {
                    fc.field_e = ((ke) this).field_b.field_h;
                    ((ke) this).field_b.a(fc.field_e, (byte) -103);
                    nm.f(119);
                    stackOut_35_0 = 1;
                    stackIn_36_0 = stackOut_35_0;
                    return stackIn_36_0 != 0;
                  }
                }
              }
            }
            L7: {
              if (param1 <= -41) {
                break L7;
              } else {
                field_h = null;
                break L7;
              }
            }
            stackOut_40_0 = 0;
            stackIn_41_0 = stackOut_40_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var3, "ke.AA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_41_0 != 0;
    }

    private final void a(lm param0, int param1, int param2, int param3, int param4, int param5, int param6, String param7, int param8, int param9) {
        int var11_int = 0;
        RuntimeException var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            L1: {
              var11_int = param6 + (param3 - -param2);
              if (var11_int != 0) {
                param6 = (var11_int + param6 * 200) / (var11_int * 2);
                param3 = (var11_int + param3 * 200) / (2 * var11_int);
                param2 = (var11_int + 200 * param2) / (var11_int * 2);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (kd.field_p != 3) {
                stackOut_7_0 = 310;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_5_0 = 305;
                stackIn_8_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var12 = stackIn_8_0;
              if (3 != kd.field_p) {
                stackOut_11_0 = 380;
                stackIn_12_0 = stackOut_11_0;
                break L3;
              } else {
                stackOut_9_0 = 372;
                stackIn_12_0 = stackOut_9_0;
                break L3;
              }
            }
            L4: {
              var13 = stackIn_12_0;
              if (kd.field_p == 3) {
                stackOut_15_0 = 427;
                stackIn_16_0 = stackOut_15_0;
                break L4;
              } else {
                stackOut_13_0 = 435;
                stackIn_16_0 = stackOut_13_0;
                break L4;
              }
            }
            L5: {
              var14 = stackIn_16_0;
              if (3 != kd.field_p) {
                stackOut_19_0 = 490;
                stackIn_20_0 = stackOut_19_0;
                break L5;
              } else {
                stackOut_17_0 = 488;
                stackIn_20_0 = stackOut_17_0;
                break L5;
              }
            }
            L6: {
              var15 = stackIn_20_0;
              fl.a(param5, 256, param1, param7, 125 - -param9, (mm) (Object) param0);
              kn.a((mm) (Object) param0, (byte) -39, param5, Integer.toString(param8), param1, var12 - -param9);
              kn.a((mm) (Object) param0, (byte) -39, param5, Integer.toString(var11_int), param1, var13 - -param9);
              kn.a((mm) (Object) param0, (byte) -39, param5, param6 + "%", param1, var14 + param9);
              kn.a((mm) (Object) param0, (byte) -39, param5, param3 + "%", param1, param9 + var15);
              kn.a((mm) (Object) param0, (byte) -39, param5, param2 + "%", param1, param9 + 545);
              if (param4 == -5328) {
                break L6;
              } else {
                ((ke) this).field_u = 81;
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var11 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var11;
            stackOut_24_1 = new StringBuilder().append("ke.NA(");
            stackIn_27_0 = stackOut_24_0;
            stackIn_27_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_28_0 = stackOut_25_0;
              stackIn_28_1 = stackOut_25_1;
              stackIn_28_2 = stackOut_25_2;
              break L7;
            }
          }
          L8: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_31_0 = stackOut_28_0;
            stackIn_31_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param7 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L8;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_32_0 = stackOut_29_0;
              stackIn_32_1 = stackOut_29_1;
              stackIn_32_2 = stackOut_29_2;
              break L8;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ',' + param8 + ',' + param9 + ')');
        }
    }

    private final void n(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((ke) this).field_t >= 3) {
                break L1;
              } else {
                ((ke) this).field_t = ((ke) this).field_t + 1;
                nm.f(120);
                ac.f((byte) -87);
                break L1;
              }
            }
            var2_int = 116 % ((param0 - 18) / 61);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "ke.S(" + param0 + ')');
        }
    }

    private final boolean p(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_11_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_26_0 = 0;
        try {
          L0: {
            L1: {
              this.h(115);
              var2_int = param0;
              if (0 <= ((ke) this).field_b.field_h) {
                var2_int = ((ke) this).field_f[((ke) this).field_b.field_h].field_d;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (17 != var2_int) {
                break L2;
              } else {
                if (((ke) this).field_b.b((byte) 114)) {
                  kf.field_I.c(param0 ^ -77);
                  nm.f(-72);
                  stackOut_10_0 = 1;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0 != 0;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (var2_int != 18) {
                break L3;
              } else {
                if (!((ke) this).field_b.b((byte) 114)) {
                  break L3;
                } else {
                  L4: {
                    if (!fm.field_b) {
                      break L4;
                    } else {
                      tg.a((byte) -46);
                      break L4;
                    }
                  }
                  L5: {
                    if (!fa.field_n) {
                      break L5;
                    } else {
                      ga.a(false, 0, 11);
                      break L5;
                    }
                  }
                  nm.f(127);
                  stackOut_24_0 = 1;
                  stackIn_25_0 = stackOut_24_0;
                  return stackIn_25_0 != 0;
                }
              }
            }
            stackOut_26_0 = 0;
            stackIn_27_0 = stackOut_26_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "ke.VA(" + param0 + ')');
        }
        return stackIn_27_0 != 0;
    }

    final void j(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        boolean stackOut_16_0 = false;
        var3 = client.field_A ? 1 : 0;
        try {
          L0: {
            h.a((ke) this, (byte) 95);
            L1: while (true) {
              L2: {
                L3: {
                  if (!ab.c((byte) 10)) {
                    break L3;
                  } else {
                    stackOut_3_0 = 13;
                    stackIn_17_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (stackIn_4_0 == wh.field_c) {
                        nm.f(118);
                        lk.field_F = false;
                        qi.a(false, (byte) -117);
                        return;
                      } else {
                        ((ke) this).field_b.a(-36);
                        var2_int = this.c(false, 121) ? 1 : 0;
                        if (var2_int != 0) {
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
                ((ke) this).field_b.a(this.a(400, bh.field_g, pm.field_f), -20563, this.a(400, he.field_S, nf.field_h));
                stackOut_16_0 = this.c(true, 126);
                stackIn_17_0 = stackOut_16_0 ? 1 : 0;
                break L2;
              }
              L4: {
                var2_int = stackIn_17_0;
                if (param0 < -78) {
                  break L4;
                } else {
                  ((ke) this).j((byte) -93);
                  break L4;
                }
              }
              if (var2_int == 0) {
                L5: {
                  if (ig.field_Yb != 0) {
                    int discarded$1 = this.b(true, (byte) -51);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                break L0;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "ke.H(" + param0 + ')');
        }
    }

    final void g(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_9_0 = 0;
        var3 = client.field_A ? 1 : 0;
        try {
          L0: {
            h.a((ke) this, (byte) 95);
            L1: while (true) {
              L2: {
                L3: {
                  if (!ab.c((byte) -126)) {
                    break L3;
                  } else {
                    ((ke) this).field_b.a(-118);
                    var2_int = this.b(-1, false) ? 1 : 0;
                    stackOut_3_0 = var2_int;
                    stackIn_10_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (stackIn_4_0 == 0) {
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
                ((ke) this).field_b.a(this.a(400, bh.field_g, pm.field_f), param0 + -20467, this.a(400, he.field_S, nf.field_h));
                var2_int = this.b(-1, true) ? 1 : 0;
                stackOut_9_0 = var2_int;
                stackIn_10_0 = stackOut_9_0;
                break L2;
              }
              if (stackIn_10_0 == 0) {
                L4: {
                  if (param0 == -96) {
                    break L4;
                  } else {
                    field_d = 58;
                    break L4;
                  }
                }
                break L0;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw dh.a((Throwable) (Object) runtimeException, "ke.F(" + param0 + ')');
        }
    }

    private final boolean d(int param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_138_0 = 0;
        int stackIn_146_0 = 0;
        int stackIn_154_0 = 0;
        int stackIn_162_0 = 0;
        int stackIn_168_0 = 0;
        int stackIn_181_0 = 0;
        int stackIn_187_0 = 0;
        int stackIn_193_0 = 0;
        int stackIn_199_0 = 0;
        int stackIn_205_0 = 0;
        int stackIn_220_0 = 0;
        int stackIn_222_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_137_0 = 0;
        int stackOut_145_0 = 0;
        int stackOut_153_0 = 0;
        int stackOut_161_0 = 0;
        int stackOut_167_0 = 0;
        int stackOut_180_0 = 0;
        int stackOut_186_0 = 0;
        int stackOut_192_0 = 0;
        int stackOut_198_0 = 0;
        int stackOut_204_0 = 0;
        int stackOut_219_0 = 0;
        int stackOut_221_0 = 0;
        var10 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              this.h(111);
              var3_int = -1;
              if (((ke) this).field_b.field_h < 0) {
                break L1;
              } else {
                var3_int = ((ke) this).field_f[((ke) this).field_b.field_h].field_d;
                break L1;
              }
            }
            L2: {
              if (var3_int != 1) {
                break L2;
              } else {
                if (!((ke) this).field_b.b((byte) 114)) {
                  break L2;
                } else {
                  nm.f(120);
                  pn.a(false, false, true);
                  stackOut_7_0 = 1;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                }
              }
            }
            L3: {
              if (var3_int != 2) {
                break L3;
              } else {
                if (!((ke) this).field_b.b((byte) 114)) {
                  break L3;
                } else {
                  nm.f(40);
                  vk.a(param1, (byte) -73);
                  stackOut_13_0 = 1;
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0 != 0;
                }
              }
            }
            L4: {
              if (var3_int != 3) {
                break L4;
              } else {
                if (!((ke) this).field_b.b((byte) 114)) {
                  break L4;
                } else {
                  nm.f(-80);
                  jm.a(0, param1);
                  stackOut_19_0 = 1;
                  stackIn_20_0 = stackOut_19_0;
                  return stackIn_20_0 != 0;
                }
              }
            }
            L5: {
              if (var3_int != 4) {
                break L5;
              } else {
                if (!((ke) this).field_b.b((byte) 114)) {
                  break L5;
                } else {
                  nk.field_k = true;
                  f.field_s = ek.a(param1, ((ke) this).field_p, 640);
                  nm.f(7);
                  stackOut_25_0 = 1;
                  stackIn_26_0 = stackOut_25_0;
                  return stackIn_26_0 != 0;
                }
              }
            }
            L6: {
              if (var3_int != 5) {
                break L6;
              } else {
                if (!((ke) this).field_b.b((byte) 114)) {
                  break L6;
                } else {
                  kf.field_I.d((byte) -68);
                  cd.a(true);
                  nm.f(116);
                  stackOut_31_0 = 1;
                  stackIn_32_0 = stackOut_31_0;
                  return stackIn_32_0 != 0;
                }
              }
            }
            L7: {
              var4 = -97 / ((param0 - -46) / 55);
              if (var3_int != 6) {
                break L7;
              } else {
                L8: {
                  L9: {
                    if (((ke) this).field_b.a(true)) {
                      break L9;
                    } else {
                      if (((ke) this).field_b.b((byte) 114)) {
                        ik.c(93);
                        if (var10 == 0) {
                          break L8;
                        } else {
                          break L9;
                        }
                      } else {
                        break L8;
                      }
                    }
                  }
                  L10: {
                    var5 = a.field_t.a(pm.field_c);
                    var6 = a.field_t.a(fj.field_f);
                    if (~var6 < ~var5) {
                      var5 = var6;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    L12: {
                      var7 = (var5 + -128 + (((ke) this).field_f[((ke) this).field_b.field_h].field_n - -5)) / 2 + ((ke) this).field_f[((ke) this).field_b.field_h].field_l;
                      var8 = bh.field_g + -var7;
                      var9 = 128 * var8 / 128;
                      if (var9 < 0) {
                        break L12;
                      } else {
                        if (var9 <= 128) {
                          break L11;
                        } else {
                          var9 = 128;
                          if (var10 == 0) {
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                    }
                    var9 = 0;
                    break L11;
                  }
                  if (pb.field_d == var9) {
                    break L8;
                  } else {
                    pb.field_d = var9;
                    if (uf.field_A + -((ke) this).field_x < 5) {
                      break L8;
                    } else {
                      ik.c(106);
                      ((ke) this).field_x = uf.field_A;
                      break L8;
                    }
                  }
                }
                L13: {
                  if (((ke) this).field_b.c(114)) {
                    pb.field_d = 0;
                    ik.c(64);
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (((ke) this).field_b.a((byte) -51)) {
                    pb.field_d = 128;
                    ik.c(111);
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (!((ke) this).field_b.b(true)) {
                    break L15;
                  } else {
                    if (pb.field_d <= 0) {
                      break L15;
                    } else {
                      pb.field_d = -16 & -1 + pb.field_d;
                      ik.c(98);
                      break L15;
                    }
                  }
                }
                if (!((ke) this).field_b.b(-20)) {
                  break L7;
                } else {
                  if (pb.field_d < 128) {
                    pb.field_d = 16 + pb.field_d & -16;
                    ik.c(120);
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
            }
            L16: {
              if (7 != var3_int) {
                break L16;
              } else {
                L17: {
                  if (((ke) this).field_b.a(true)) {
                    L18: {
                      var5 = a.field_t.a(pm.field_c);
                      var6 = a.field_t.a(fj.field_f);
                      if (~var6 < ~var5) {
                        var5 = var6;
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    L19: {
                      var7 = (var5 + (-128 + ((ke) this).field_f[((ke) this).field_b.field_h].field_n + 5)) / 2 + ((ke) this).field_f[((ke) this).field_b.field_h].field_l;
                      var8 = bh.field_g - var7;
                      var9 = var8 * 128 / 128;
                      sa.field_x = true;
                      if (var9 >= 0) {
                        break L19;
                      } else {
                        a.field_g = 0;
                        if (var10 == 0) {
                          break L17;
                        } else {
                          break L19;
                        }
                      }
                    }
                    L20: {
                      if (var9 <= 128) {
                        break L20;
                      } else {
                        a.field_g = 128;
                        if (var10 == 0) {
                          break L17;
                        } else {
                          break L20;
                        }
                      }
                    }
                    a.field_g = var9;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L21: {
                  if (((ke) this).field_b.c(122)) {
                    a.field_g = 0;
                    sa.field_x = true;
                    break L21;
                  } else {
                    break L21;
                  }
                }
                L22: {
                  if (((ke) this).field_b.a((byte) -51)) {
                    sa.field_x = true;
                    a.field_g = 128;
                    break L22;
                  } else {
                    break L22;
                  }
                }
                L23: {
                  if (((ke) this).field_b.b(true)) {
                    L24: {
                      a.field_g = a.field_g + -1 & -16;
                      if (a.field_g < 0) {
                        a.field_g = 0;
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                    sa.field_x = true;
                    break L23;
                  } else {
                    break L23;
                  }
                }
                if (((ke) this).field_b.b(101)) {
                  L25: {
                    a.field_g = -16 & 16 + a.field_g;
                    if (a.field_g <= 128) {
                      break L25;
                    } else {
                      a.field_g = 128;
                      break L25;
                    }
                  }
                  sa.field_x = true;
                  break L16;
                } else {
                  break L16;
                }
              }
            }
            L26: {
              if (var3_int != 8) {
                break L26;
              } else {
                if (!((ke) this).field_b.b((byte) 114)) {
                  break L26;
                } else {
                  L27: {
                    L28: {
                      if (cl.field_v == null) {
                        break L28;
                      } else {
                        sn.a(false);
                        if (var10 == 0) {
                          break L27;
                        } else {
                          break L28;
                        }
                      }
                    }
                    jk.a(2, param1);
                    break L27;
                  }
                  nm.f(119);
                  stackOut_137_0 = 1;
                  stackIn_138_0 = stackOut_137_0;
                  return stackIn_138_0 != 0;
                }
              }
            }
            L29: {
              if (var3_int != 9) {
                break L29;
              } else {
                if (((ke) this).field_b.b((byte) 114)) {
                  ve.field_Hc = true;
                  ca.field_wb = oj.a(param1, 415);
                  nm.f(-105);
                  stackOut_145_0 = 1;
                  stackIn_146_0 = stackOut_145_0;
                  return stackIn_146_0 != 0;
                } else {
                  break L29;
                }
              }
            }
            L30: {
              if (var3_int != 10) {
                break L30;
              } else {
                if (((ke) this).field_b.b((byte) 114)) {
                  mg.field_Zb = true;
                  cl.field_B = qj.a(-108, param1);
                  nm.f(127);
                  stackOut_153_0 = 1;
                  stackIn_154_0 = stackOut_153_0;
                  return stackIn_154_0 != 0;
                } else {
                  break L30;
                }
              }
            }
            L31: {
              if (19 != var3_int) {
                break L31;
              } else {
                if (((ke) this).field_b.b((byte) 114)) {
                  fm.field_e = true;
                  am.field_a = ib.a((byte) -80, param1);
                  nm.f(-14);
                  stackOut_161_0 = 1;
                  stackIn_162_0 = stackOut_161_0;
                  return stackIn_162_0 != 0;
                } else {
                  break L31;
                }
              }
            }
            L32: {
              if (11 != var3_int) {
                break L32;
              } else {
                if (!((ke) this).field_b.b((byte) 114)) {
                  break L32;
                } else {
                  lk.field_F = true;
                  h.field_d = uh.a(o.field_g, param1, 0, -128);
                  nm.f(114);
                  stackOut_167_0 = 1;
                  stackIn_168_0 = stackOut_167_0;
                  return stackIn_168_0 != 0;
                }
              }
            }
            L33: {
              if (12 != var3_int) {
                break L33;
              } else {
                if (((ke) this).field_b.b((byte) 114)) {
                  nm.f(-38);
                  sn.a(false);
                  pk.a((byte) -17, se.h(25144));
                  break L33;
                } else {
                  break L33;
                }
              }
            }
            L34: {
              if (var3_int != 13) {
                break L34;
              } else {
                if (!((ke) this).field_b.b((byte) 114)) {
                  break L34;
                } else {
                  nm.f(13);
                  cd.a(true);
                  stackOut_180_0 = 1;
                  stackIn_181_0 = stackOut_180_0;
                  return stackIn_181_0 != 0;
                }
              }
            }
            L35: {
              if (var3_int != 14) {
                break L35;
              } else {
                if (!((ke) this).field_b.b((byte) 114)) {
                  break L35;
                } else {
                  kf.field_I.c((byte) 100);
                  am.field_c = false;
                  kf.field_G = f.a(false, false, 0, false, kf.field_I.field_wb, 32357, false, false);
                  un.a((byte) -30);
                  dc.a(param1, 95);
                  nm.f(126);
                  stackOut_186_0 = 1;
                  stackIn_187_0 = stackOut_186_0;
                  return stackIn_187_0 != 0;
                }
              }
            }
            L36: {
              if (var3_int != 15) {
                break L36;
              } else {
                if (!((ke) this).field_b.b((byte) 114)) {
                  break L36;
                } else {
                  kf.field_I.b(-62);
                  cd.a(true);
                  nm.f(124);
                  stackOut_192_0 = 1;
                  stackIn_193_0 = stackOut_192_0;
                  return stackIn_193_0 != 0;
                }
              }
            }
            L37: {
              if (var3_int != 16) {
                break L37;
              } else {
                if (!((ke) this).field_b.b((byte) 114)) {
                  break L37;
                } else {
                  kf.field_I.f(-49);
                  cd.a(true);
                  nm.f(-19);
                  stackOut_198_0 = 1;
                  stackIn_199_0 = stackOut_198_0;
                  return stackIn_199_0 != 0;
                }
              }
            }
            L38: {
              if (var3_int != 17) {
                break L38;
              } else {
                if (!((ke) this).field_b.b((byte) 114)) {
                  break L38;
                } else {
                  kf.field_I.c(-89);
                  cd.a(true);
                  nm.f(122);
                  stackOut_204_0 = 1;
                  stackIn_205_0 = stackOut_204_0;
                  return stackIn_205_0 != 0;
                }
              }
            }
            L39: {
              if (var3_int != 18) {
                break L39;
              } else {
                if (!((ke) this).field_b.b((byte) 114)) {
                  break L39;
                } else {
                  L40: {
                    if (fm.field_b) {
                      tg.a((byte) -115);
                      break L40;
                    } else {
                      break L40;
                    }
                  }
                  L41: {
                    if (!fa.field_n) {
                      break L41;
                    } else {
                      ga.a(false, 0, 11);
                      break L41;
                    }
                  }
                  cd.a(true);
                  nm.f(-42);
                  stackOut_219_0 = 1;
                  stackIn_220_0 = stackOut_219_0;
                  return stackIn_220_0 != 0;
                }
              }
            }
            stackOut_221_0 = 0;
            stackIn_222_0 = stackOut_221_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var3, "ke.FA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_222_0 != 0;
    }

    private final void h(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 93) {
                break L1;
              } else {
                boolean discarded$2 = this.b(68, true);
                break L1;
              }
            }
            L2: {
              if (((ke) this).field_b.field_o) {
                fj.a(32, (byte) -89, pg.field_d);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "ke.KA(" + param0 + ')');
        }
    }

    final int a(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                ((ke) this).field_q = -13;
                break L1;
              }
            }
            var2_int = -(((ke) this).field_u >> 1480277474) + 640 - 640 * ((ke) this).field_o * ((ke) this).field_o / 400;
            stackOut_3_0 = var2_int;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "ke.U(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    public static void l(int param0) {
        try {
            field_n = null;
            field_h = null;
            if (param0 < 106) {
                ke.e((byte) 27);
            }
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "ke.RA(" + param0 + ')');
        }
    }

    final void a(int param0, boolean param1, int param2) {
        try {
            ((ke) this).field_b.a(param0, 0, this.a(400, bh.field_g, pm.field_f), param1);
            if (param2 != -129) {
                this.n(53);
            }
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "ke.HA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final boolean b(boolean param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_9_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_34_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_33_0 = 0;
        try {
          L0: {
            L1: {
              this.h(95);
              var3_int = -1;
              if (((ke) this).field_b.field_h < 0) {
                break L1;
              } else {
                var3_int = ((ke) this).field_f[((ke) this).field_b.field_h].field_d;
                break L1;
              }
            }
            L2: {
              if (20 != var3_int) {
                break L2;
              } else {
                if (((ke) this).field_b.b((byte) 114)) {
                  og.a(false, 6, true);
                  stackOut_8_0 = 1;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0 != 0;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              L4: {
                if (var3_int == 13) {
                  break L4;
                } else {
                  if (param0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if (!((ke) this).field_b.b((byte) 114)) {
                break L3;
              } else {
                mg.field_Zb = false;
                qi.a(param0, (byte) -103);
                nm.f(122);
                stackOut_17_0 = 1;
                stackIn_18_0 = stackOut_17_0;
                return stackIn_18_0 != 0;
              }
            }
            L5: {
              if (!param0) {
                break L5;
              } else {
                if (ig.field_Yb == 0) {
                  break L5;
                } else {
                  if (((ke) this).field_b.field_h != -1) {
                    fc.field_e = ((ke) this).field_b.field_h;
                    ((ke) this).field_b.a(fc.field_e, (byte) -112);
                    nm.f(param1 + -34);
                    stackOut_28_0 = 1;
                    stackIn_29_0 = stackOut_28_0;
                    return stackIn_29_0 != 0;
                  } else {
                    break L5;
                  }
                }
              }
            }
            L6: {
              if (param1 == 1) {
                break L6;
              } else {
                ((ke) this).field_m = -102;
                break L6;
              }
            }
            stackOut_33_0 = 0;
            stackIn_34_0 = stackOut_33_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var3, "ke.QA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_34_0 != 0;
    }

    ke(int param0) {
        ((ke) this).field_k = -1;
        try {
            ((ke) this).field_f = new ec[param0];
            ((ke) this).field_b = new sk();
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "ke.<init>(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Your rating is <%0>";
        field_h = new int[8192];
    }
}
