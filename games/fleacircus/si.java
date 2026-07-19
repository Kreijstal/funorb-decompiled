/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si {
    short[] field_M;
    short[] field_s;
    static String field_o;
    static dd field_C;
    short field_w;
    short[] field_t;
    int field_m;
    short[] field_F;
    int field_b;
    short[] field_P;
    short[] field_Q;
    int[] field_d;
    int[] field_G;
    short[] field_n;
    short[] field_q;
    int[] field_v;
    short[] field_D;
    int[] field_O;
    static vg field_y;
    short[] field_i;
    private boolean field_a;
    int[] field_z;
    int field_k;
    short field_p;
    short[] field_K;
    byte field_h;
    int[] field_g;
    short[] field_f;
    static int[] field_R;
    int[] field_c;
    short[] field_l;
    int[] field_L;
    int field_A;
    int[] field_I;
    int field_B;
    short[] field_N;
    short[] field_E;
    short[] field_u;
    short[] field_x;
    int field_e;
    short field_j;
    byte[] field_J;
    static String field_H;
    short[] field_r;

    public static void c(int param0) {
        int var1 = 55 % ((param0 - 9) / 40);
        field_H = null;
        field_C = null;
        field_R = null;
        field_o = null;
        field_y = null;
    }

    final void b(int param0) {
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
        var12 = fleas.field_A ? 1 : 0;
        if (this.field_a) {
          return;
        } else {
          this.field_a = true;
          var2 = 32767;
          var3 = 32767;
          var4 = 32767;
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          var8 = 0;
          L0: while (true) {
            L1: {
              if (var8 >= this.field_w) {
                break L1;
              } else {
                var9 = this.field_n[var8];
                var10 = this.field_f[var8];
                var14 = var9;
                var13 = var5;
                if (var12 != 0) {
                  if (var13 != var14) {
                    this.field_K = (short[]) null;
                    this.field_A = var4;
                    this.field_e = var3;
                    this.field_k = var6;
                    this.field_B = var5;
                    this.field_b = var7;
                    this.field_m = var2;
                    return;
                  } else {
                    this.field_A = var4;
                    this.field_e = var3;
                    this.field_k = var6;
                    this.field_B = var5;
                    this.field_b = var7;
                    this.field_m = var2;
                    return;
                  }
                } else {
                  L2: {
                    if (var13 >= var14) {
                      break L2;
                    } else {
                      var5 = var9;
                      break L2;
                    }
                  }
                  L3: {
                    if (var10 >= var3) {
                      break L3;
                    } else {
                      var3 = var10;
                      break L3;
                    }
                  }
                  L4: {
                    if (var6 >= var10) {
                      break L4;
                    } else {
                      var6 = var10;
                      break L4;
                    }
                  }
                  L5: {
                    if (var2 <= var9) {
                      break L5;
                    } else {
                      var2 = var9;
                      break L5;
                    }
                  }
                  L6: {
                    var11 = this.field_P[var8];
                    if (var11 > var7) {
                      var7 = var11;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (var11 >= var4) {
                      break L7;
                    } else {
                      var4 = var11;
                      break L7;
                    }
                  }
                  var8++;
                  if (var12 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            if (param0 != -23443) {
              this.field_K = (short[]) null;
              this.field_A = var4;
              this.field_e = var3;
              this.field_k = var6;
              this.field_B = var5;
              this.field_b = var7;
              this.field_m = var2;
              return;
            } else {
              this.field_A = var4;
              this.field_e = var3;
              this.field_k = var6;
              this.field_B = var5;
              this.field_b = var7;
              this.field_m = var2;
              return;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        var7 = fleas.field_A ? 1 : 0;
        var6 = param4;
        L0: while (true) {
          if (var6 < this.field_w) {
            this.field_n[var6] = (short)(this.field_n[var6] * param0 / param1);
            this.field_f[var6] = (short)(param3 * this.field_f[var6] / param1);
            this.field_P[var6] = (short)(this.field_P[var6] * param2 / param1);
            var6++;
            if (var7 == 0) {
              continue L0;
            } else {
              return;
            }
          } else {
            this.a(78);
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = fleas.field_A ? 1 : 0;
        var5 = 0;
        var6 = 15 % ((param3 - -11) / 63);
        L0: while (true) {
          if (var5 < this.field_w) {
            this.field_n[var5] = (short)(this.field_n[var5] + param1);
            this.field_f[var5] = (short)(this.field_f[var5] + param0);
            this.field_P[var5] = (short)(this.field_P[var5] + param2);
            var5++;
            if (var7 == 0) {
              continue L0;
            } else {
              return;
            }
          } else {
            this.a(87);
            return;
          }
        }
    }

    private final void a(int param0) {
        if (param0 <= 27) {
            this.field_q = (short[]) null;
            this.field_a = false;
            return;
        }
        this.field_a = false;
    }

    final static int a(int param0, boolean param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_87_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_84_0 = 0;
        var5 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            ib.field_g = ib.field_g + 65536;
            L1: while (true) {
              L2: {
                L3: {
                  if (a.a(hd.field_b, ib.field_g, (byte) -17) < 65536) {
                    break L3;
                  } else {
                    ib.field_g = ib.field_g - hd.field_b;
                    stackOut_3_0 = bf.field_b + 1;
                    stackIn_7_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      bf.field_b = stackIn_4_0;
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_6_0 = -1;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              }
              L4: {
                L5: {
                  var2_int = stackIn_7_0;
                  if (wa.field_k == null) {
                    break L5;
                  } else {
                    var2_int = wa.field_k.length;
                    if (var5 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                if (of.field_h == null) {
                  break L4;
                } else {
                  var2_int = of.field_h.length;
                  break L4;
                }
              }
              L6: {
                if (0 != (var2_int ^ -1)) {
                  L7: {
                    if (td.field_i >= hd.field_g) {
                      break L7;
                    } else {
                      L8: {
                        L9: {
                          td.field_i = td.field_i + 1;
                          if (td.field_i <= hd.field_c) {
                            break L9;
                          } else {
                            if (null == wa.field_k) {
                              break L8;
                            } else {
                              if (null == wa.field_k[ql.field_o]) {
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                        if (td.field_i < hd.field_g) {
                          break L7;
                        } else {
                          if (null == wa.field_k[(1 + ql.field_o) % var2_int]) {
                            td.field_i = td.field_i - 1;
                            if (var5 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          } else {
                            break L7;
                          }
                        }
                      }
                      td.field_i = td.field_i - 1;
                      break L7;
                    }
                  }
                  L10: {
                    if (td.field_i >= hd.field_g) {
                      L11: {
                        L12: {
                          t.field_a = ql.field_o;
                          if (rc.field_i) {
                            break L12;
                          } else {
                            ql.field_o = ql.field_o - 1;
                            if ((ql.field_o ^ -1) <= -1) {
                              break L11;
                            } else {
                              ql.field_o = ql.field_o + var2_int;
                              if (var5 == 0) {
                                break L11;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                        ql.field_o = ql.field_o + 1;
                        if (var2_int <= ql.field_o) {
                          ql.field_o = ql.field_o - var2_int;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      td.field_i = td.field_i - hd.field_g;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  if (td.field_i > hd.field_c) {
                    rc.field_i = true;
                    break L6;
                  } else {
                    break L6;
                  }
                } else {
                  break L6;
                }
              }
              L13: {
                if (null != jg.field_f) {
                  L14: {
                    var3 = -(jg.field_f.field_r / 2) + 357;
                    var4 = 0;
                    if (-1 == (jk.field_r ^ -1)) {
                      break L14;
                    } else {
                      if (var3 >= ob.field_e) {
                        break L14;
                      } else {
                        if (var3 + jg.field_f.field_t > ob.field_e) {
                          L15: {
                            if (269 + -jg.field_f.field_w >= pb.field_d) {
                              break L15;
                            } else {
                              if (-270 < (pb.field_d ^ -1)) {
                                td.field_i = hd.field_g;
                                var4 = 1;
                                rc.field_i = false;
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                          }
                          if ((pb.field_d ^ -1) >= -587) {
                            break L14;
                          } else {
                            if (pb.field_d < jg.field_f.field_w + 586) {
                              rc.field_i = true;
                              var4 = 1;
                              td.field_i = hd.field_g;
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                        } else {
                          break L14;
                        }
                      }
                    }
                  }
                  if (var4 != 0) {
                    break L13;
                  } else {
                    if (hd.field_c >= td.field_i) {
                      break L13;
                    } else {
                      if (var3 >= kc.field_b) {
                        break L13;
                      } else {
                        if (kc.field_b < jg.field_f.field_t + var3) {
                          L16: {
                            if (ag.field_f <= 269 + -jg.field_f.field_w) {
                              break L16;
                            } else {
                              if ((ag.field_f ^ -1) <= -270) {
                                break L16;
                              } else {
                                td.field_i = hd.field_c;
                                break L16;
                              }
                            }
                          }
                          if ((ag.field_f ^ -1) >= -587) {
                            break L13;
                          } else {
                            if (ag.field_f >= jg.field_f.field_w + 586) {
                              break L13;
                            } else {
                              td.field_i = hd.field_c;
                              break L13;
                            }
                          }
                        } else {
                          break L13;
                        }
                      }
                    }
                  }
                } else {
                  break L13;
                }
              }
              if (param0 > 3) {
                L17: {
                  if (!param1) {
                    break L17;
                  } else {
                    L18: {
                      ul.field_G.b(109, em.a(ob.field_e, false, pb.field_d), em.a(kc.field_b, false, ag.field_f));
                      if (!ul.field_G.b(-78)) {
                        break L18;
                      } else {
                        if (ul.field_G.field_k != 0) {
                          if (1 != ul.field_G.field_k) {
                            break L18;
                          } else {
                            stackOut_70_0 = 2;
                            stackIn_71_0 = stackOut_70_0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
                        } else {
                          stackOut_67_0 = 3;
                          stackIn_68_0 = stackOut_67_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                    stackOut_72_0 = -97;
                    stackIn_74_0 = stackOut_72_0;
                    L19: while (true) {
                      if (!wf.b(stackIn_74_0)) {
                        break L17;
                      } else {
                        L20: {
                          ul.field_G.a(0, true);
                          if (!ul.field_G.b(107)) {
                            break L20;
                          } else {
                            if (ul.field_G.field_k != 0) {
                              if ((ul.field_G.field_k ^ -1) != -2) {
                                break L20;
                              } else {
                                stackOut_80_0 = 1;
                                stackIn_81_0 = stackOut_80_0;
                                decompiledRegionSelector0 = 4;
                                break L0;
                              }
                            } else {
                              stackOut_77_0 = 3;
                              stackIn_78_0 = stackOut_77_0;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            }
                          }
                        }
                        if (ji.field_a != 13) {
                          stackOut_73_0 = -97;
                          stackIn_74_0 = stackOut_73_0;
                          continue L19;
                        } else {
                          stackOut_83_0 = 1;
                          stackIn_84_0 = stackOut_83_0;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        }
                      }
                    }
                  }
                }
                stackOut_86_0 = 0;
                stackIn_87_0 = stackOut_86_0;
                decompiledRegionSelector0 = 6;
                break L0;
              } else {
                stackOut_62_0 = 107;
                stackIn_63_0 = stackOut_62_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var2), "si.E(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_63_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_68_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_71_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_78_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_81_0;
                } else {
                  L21: {
                    if (decompiledRegionSelector0 == 5) {
                      stackOut_84_0 = stackIn_84_0;
                      stackIn_87_0 = stackOut_84_0;
                      stackIn_85_0 = stackOut_84_0;
                      if (var5 != 0) {
                        break L21;
                      } else {
                        return stackIn_85_0;
                      }
                    } else {
                      break L21;
                    }
                  }
                  return stackIn_87_0;
                }
              }
            }
          }
        }
    }

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        var5 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var4 = -14 / ((param1 - 2) / 51);
            var3_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (0 >= param0) {
                    break L3;
                  } else {
                    var3_int = 1 & param2 | var3_int << 590365569;
                    param0--;
                    stackOut_3_0 = param2 >>> 1;
                    stackIn_6_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      param2 = stackIn_4_0;
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_5_0 = var3_int;
                stackIn_6_0 = stackOut_5_0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var3), "si.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_6_0;
    }

    si() {
        this.field_a = false;
        this.field_h = (byte) 0;
    }

    static {
        field_R = new int[4];
        field_H = "<%0>Spring:<%1> Fleas standing on these are bounced up until they hit something.";
        field_o = "<%0>Blocks:<%1> fleas can walk on these, but can't climb up the sides.";
    }
}
