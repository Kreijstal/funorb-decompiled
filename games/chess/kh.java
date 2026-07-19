/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh extends gm {
    private int field_g;
    static ij field_k;
    private long field_h;
    private long field_j;
    static ci field_l;
    static String field_p;
    private int field_n;
    static String field_m;
    private long field_i;
    private long[] field_q;
    static boolean field_o;

    final int a(long param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Chess.field_G;
        var4 = 108 % ((param1 - 64) / 54);
        if ((this.field_j ^ -1L) < (this.field_i ^ -1L)) {
          this.field_h = this.field_h + (-this.field_i + this.field_j);
          this.field_i = this.field_i + (-this.field_i + this.field_j);
          this.field_j = this.field_j + param0;
          return 1;
        } else {
          var5 = 0;
          L0: while (true) {
            L1: {
              var5++;
              this.field_j = this.field_j + param0;
              if ((var5 ^ -1) <= -11) {
                break L1;
              } else {
                if ((this.field_i ^ -1L) < (this.field_j ^ -1L)) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (this.field_j >= this.field_i) {
                break L2;
              } else {
                this.field_j = this.field_i;
                break L2;
              }
            }
            return var5;
          }
        }
    }

    final static byte[] a(int param0, int param1, byte param2, byte[] param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5_int = 0;
        df var5 = null;
        int var6 = 0;
        byte[] var7 = null;
        int var8 = 0;
        byte[] var9 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var8 = Chess.field_G;
        try {
          L0: {
            L1: {
              if (0 >= param0) {
                var4 = param3;
                break L1;
              } else {
                var9 = new byte[param1];
                var4 = var9;
                var5_int = 0;
                L2: while (true) {
                  if (var5_int >= param1) {
                    break L1;
                  } else {
                    var9[var5_int] = param3[param0 + var5_int];
                    var5_int++;
                    continue L2;
                  }
                }
              }
            }
            var6 = -88 / ((param2 - 55) / 51);
            var5 = new df();
            var5.a(94);
            var5.a((byte) -122, var4, (long)(8 * param1));
            var7 = new byte[64];
            var5.a(-115, 0, var7);
            stackOut_6_0 = (byte[]) (var7);
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4_ref);
            stackOut_8_1 = new StringBuilder().append("kh.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    final static void c(int param0) {
        RuntimeException var1 = null;
        nk var1_ref = null;
        int var2 = 0;
        r var3_ref_r = null;
        long var3_long = 0L;
        int var3 = 0;
        ln var4_ref_ln = null;
        int var4 = 0;
        int var5 = 0;
        ln var6 = null;
        r var7 = null;
        r var8_ref_r = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ln var12 = null;
        ln var13 = null;
        ln var14 = null;
        r var15 = null;
        Object var16 = null;
        String var17 = null;
        r var18 = null;
        String var19 = null;
        String var20 = null;
        ln var21 = null;
        r var22 = null;
        r var23 = null;
        String var24 = null;
        String var25 = null;
        r var26 = null;
        Object var27 = null;
        ln var27_ref = null;
        ln var28 = null;
        r var29 = null;
        ln var30 = null;
        int stackIn_12_0 = 0;
        r stackIn_17_0 = null;
        r stackIn_18_0 = null;
        r stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        r stackIn_78_0 = null;
        r stackIn_79_0 = null;
        r stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        RuntimeException decompiledCaughtException = null;
        r stackOut_77_0 = null;
        r stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        r stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        r stackOut_16_0 = null;
        r stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        r stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        var16 = null;
        var27 = null;
        var11 = Chess.field_G;
        try {
          L0: {
            L1: {
              var1_ref = tk.field_h;
              if (param0 == 17) {
                break L1;
              } else {
                kh.c(1);
                break L1;
              }
            }
            L2: {
              L3: {
                var2 = ((p) ((Object) var1_ref)).i(param0 ^ -100);
                if (-1 == (var2 ^ -1)) {
                  break L3;
                } else {
                  if (1 == var2) {
                    break L3;
                  } else {
                    if ((var2 ^ -1) == -3) {
                      break L3;
                    } else {
                      if (var2 == 3) {
                        break L3;
                      } else {
                        if ((var2 ^ -1) == -5) {
                          break L3;
                        } else {
                          if (5 != var2) {
                            if ((var2 ^ -1) == -7) {
                              var3_long = ((p) ((Object) var1_ref)).d((byte) -127);
                              var5 = ((p) ((Object) var1_ref)).i(-77);
                              var29 = ug.a((byte) -92, var3_long);
                              if (var29 == null) {
                                break L2;
                              } else {
                                L4: {
                                  if (!var29.field_Qb) {
                                    break L4;
                                  } else {
                                    cb.field_f = cb.field_f - 1;
                                    var29.field_Qb = false;
                                    break L4;
                                  }
                                }
                                L5: {
                                  if (0 == var5) {
                                    var29.c(-2193);
                                    break L5;
                                  } else {
                                    var29.field_Mb = var5;
                                    var29.field_Sb = ig.field_g;
                                    break L5;
                                  }
                                }
                                var29.d(-1);
                                break L2;
                              }
                            } else {
                              if ((var2 ^ -1) != -8) {
                                if (var2 != 8) {
                                  if (var2 != 9) {
                                    if ((var2 ^ -1) != -11) {
                                      L6: {
                                        if ((var2 ^ -1) == -12) {
                                          break L6;
                                        } else {
                                          if (-13 == (var2 ^ -1)) {
                                            break L6;
                                          } else {
                                            if (var2 == 13) {
                                              var3 = ((p) ((Object) var1_ref)).f(674914976);
                                              var4 = ((p) ((Object) var1_ref)).i(-97);
                                              var27_ref = (ln) ((Object) ae.field_f.a((long)var3, 3000));
                                              if (var27_ref != null) {
                                                L7: {
                                                  var13 = var27_ref;
                                                  var6 = var13;
                                                  var27_ref.field_Tb = false;
                                                  var13.field_dc = false;
                                                  if (var4 != 0) {
                                                    var27_ref.field_jc = var4;
                                                    var27_ref.field_Hb = ig.field_g;
                                                    break L7;
                                                  } else {
                                                    break L7;
                                                  }
                                                }
                                                fh.a((byte) -127, var27_ref);
                                                break L2;
                                              } else {
                                                break L2;
                                              }
                                            } else {
                                              L8: {
                                                if (var2 == 14) {
                                                  break L8;
                                                } else {
                                                  if (-17 != (var2 ^ -1)) {
                                                    L9: {
                                                      if (15 == var2) {
                                                        break L9;
                                                      } else {
                                                        if (var2 == 17) {
                                                          break L9;
                                                        } else {
                                                          if ((var2 ^ -1) == -19) {
                                                            L10: {
                                                              var3_long = ((p) ((Object) var1_ref)).d((byte) 116);
                                                              var24 = ((p) ((Object) var1_ref)).d(0);
                                                              var25 = ((p) ((Object) var1_ref)).d(0);
                                                              var7 = mi.a(param0 ^ 134217710, var3_long);
                                                              if (var7 != null) {
                                                                break L10;
                                                              } else {
                                                                var7 = new r(var24, var25, var3_long);
                                                                cm.field_v.a(true, var7, var3_long);
                                                                pd.field_Rb.field_Xb = pd.field_Rb.field_Xb + 1;
                                                                break L10;
                                                              }
                                                            }
                                                            L11: {
                                                              var7.field_Pb = ((p) ((Object) var1_ref)).f(param0 ^ 674914993);
                                                              var8 = ((p) ((Object) var1_ref)).c((byte) -59);
                                                              var7.field_Jb = var8 >> 1772151457;
                                                              stackOut_77_0 = (r) (var7);
                                                              stackIn_79_0 = stackOut_77_0;
                                                              stackIn_78_0 = stackOut_77_0;
                                                              if (0 == (1 & var8)) {
                                                                stackOut_79_0 = (r) ((Object) stackIn_79_0);
                                                                stackOut_79_1 = 0;
                                                                stackIn_80_0 = stackOut_79_0;
                                                                stackIn_80_1 = stackOut_79_1;
                                                                break L11;
                                                              } else {
                                                                stackOut_78_0 = (r) ((Object) stackIn_78_0);
                                                                stackOut_78_1 = 1;
                                                                stackIn_80_0 = stackOut_78_0;
                                                                stackIn_80_1 = stackOut_78_1;
                                                                break L11;
                                                              }
                                                            }
                                                            stackIn_80_0.field_Hb = stackIn_80_1 != 0;
                                                            var7.field_Vb = ((p) ((Object) var1_ref)).i(param0 + -142);
                                                            var7.field_Wb = ((p) ((Object) var1_ref)).i(-106);
                                                            pd.field_Sb.a((o) (var7), (byte) 109);
                                                            break L2;
                                                          } else {
                                                            if (var2 == 19) {
                                                              var3_long = ((p) ((Object) var1_ref)).d((byte) -60);
                                                              var5 = ((p) ((Object) var1_ref)).i(param0 + -144);
                                                              var23 = mi.a(134217727, var3_long);
                                                              if (var23 != null) {
                                                                L12: {
                                                                  if (var5 != 0) {
                                                                    var23.field_Mb = var5;
                                                                    var23.field_Sb = ig.field_g;
                                                                    break L12;
                                                                  } else {
                                                                    var23.c(param0 ^ -2178);
                                                                    break L12;
                                                                  }
                                                                }
                                                                var23.d(-1);
                                                                pd.field_Rb.field_Xb = pd.field_Rb.field_Xb - 1;
                                                                break L2;
                                                              } else {
                                                                break L2;
                                                              }
                                                            } else {
                                                              if (var2 != 20) {
                                                                if (-22 != (var2 ^ -1)) {
                                                                  if ((var2 ^ -1) != -23) {
                                                                    if ((var2 ^ -1) != -24) {
                                                                      fg.a((Throwable) null, (byte) -77, "L1: " + tm.b((byte) -123));
                                                                      si.d(param0 ^ 65297);
                                                                      break L2;
                                                                    } else {
                                                                      gb.field_t = ((p) ((Object) var1_ref)).d((byte) 116);
                                                                      break L2;
                                                                    }
                                                                  } else {
                                                                    fm.field_W = ((p) ((Object) var1_ref)).f(674914976);
                                                                    jf.field_b = ((p) ((Object) var1_ref)).c((byte) 75);
                                                                    break L2;
                                                                  }
                                                                } else {
                                                                  var3 = ((p) ((Object) var1_ref)).f(param0 ^ 674914993);
                                                                  if (var3 == 0) {
                                                                    eg.field_e = 0L;
                                                                    break L2;
                                                                  } else {
                                                                    eg.field_e = (long)var3 + ud.a(2);
                                                                    break L2;
                                                                  }
                                                                }
                                                              } else {
                                                                vl.a(var1_ref, pd.field_Rb, false, param0 ^ 127);
                                                                break L2;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                    var3_long = ((p) ((Object) var1_ref)).d((byte) -84);
                                                    var5 = ((p) ((Object) var1_ref)).i(-125);
                                                    var26 = ug.a((byte) -87, var3_long);
                                                    if (var26 != null) {
                                                      L13: {
                                                        if (15 == var2) {
                                                          var26.field_ac = false;
                                                          break L13;
                                                        } else {
                                                          if (var26.field_Qb) {
                                                            cb.field_f = cb.field_f - 1;
                                                            var26.field_Qb = false;
                                                            break L13;
                                                          } else {
                                                            break L13;
                                                          }
                                                        }
                                                      }
                                                      L14: {
                                                        if (var5 == 0) {
                                                          break L14;
                                                        } else {
                                                          var26.field_Mb = var5;
                                                          var26.field_Sb = ig.field_g;
                                                          break L14;
                                                        }
                                                      }
                                                      ta.a(var26, -122);
                                                      break L2;
                                                    } else {
                                                      break L2;
                                                    }
                                                  } else {
                                                    break L8;
                                                  }
                                                }
                                              }
                                              var3_long = ((p) ((Object) var1_ref)).d((byte) -74);
                                              var22 = ug.a((byte) -107, var3_long);
                                              if (var22 == null) {
                                                break L2;
                                              } else {
                                                L15: {
                                                  if (var2 != 14) {
                                                    if (var22.field_Qb) {
                                                      break L15;
                                                    } else {
                                                      var22.field_Qb = true;
                                                      cb.field_f = cb.field_f + 1;
                                                      break L15;
                                                    }
                                                  } else {
                                                    var22.field_ac = true;
                                                    break L15;
                                                  }
                                                }
                                                ta.a(var22, param0 ^ -116);
                                                break L2;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var3 = ((p) ((Object) var1_ref)).f(674914976);
                                      var14 = (ln) ((Object) ae.field_f.a((long)var3, 3000));
                                      var28 = var14;
                                      if (var14 == null) {
                                        break L2;
                                      } else {
                                        L16: {
                                          if (11 != var2) {
                                            var28.field_Tb = true;
                                            break L16;
                                          } else {
                                            var14.field_dc = true;
                                            break L16;
                                          }
                                        }
                                        fh.a((byte) -124, var28);
                                        break L2;
                                      }
                                    } else {
                                      var30 = (ln) ((Object) nk.field_t.g(param0 ^ -18093));
                                      L17: while (true) {
                                        if (var30 == null) {
                                          break L2;
                                        } else {
                                          var30.c(-2193);
                                          var30.d(-1);
                                          var30 = (ln) ((Object) nk.field_t.a((byte) -115));
                                          continue L17;
                                        }
                                      }
                                    }
                                  } else {
                                    var3 = ((p) ((Object) var1_ref)).f(param0 + 674914959);
                                    var4 = ((p) ((Object) var1_ref)).i(-96);
                                    var12 = (ln) ((Object) ae.field_f.a((long)var3, 3000));
                                    var21 = var12;
                                    if (var12 != null) {
                                      L18: {
                                        if (0 == var4) {
                                          var21.c(param0 ^ -2178);
                                          break L18;
                                        } else {
                                          var12.field_Hb = ig.field_g;
                                          var12.field_jc = var4;
                                          break L18;
                                        }
                                      }
                                      var21.d(-1);
                                      break L2;
                                    } else {
                                      break L2;
                                    }
                                  }
                                } else {
                                  L19: {
                                    var3 = ((p) ((Object) var1_ref)).f(674914976);
                                    var4_ref_ln = (ln) ((Object) ae.field_f.a((long)var3, param0 + 2983));
                                    if (var4_ref_ln == null) {
                                      var4_ref_ln = new ln(qa.field_e);
                                      ae.field_f.a(true, var4_ref_ln, (long)var3);
                                      break L19;
                                    } else {
                                      break L19;
                                    }
                                  }
                                  vl.a(var1_ref, var4_ref_ln, true, param0 ^ 101);
                                  fh.a((byte) -119, var4_ref_ln);
                                  break L2;
                                }
                              } else {
                                var15 = (r) ((Object) bb.field_d.g(-18110));
                                L20: while (true) {
                                  if (var15 == null) {
                                    cb.field_f = 0;
                                    break L2;
                                  } else {
                                    var15.c(-2193);
                                    var15.d(-1);
                                    var15 = (r) ((Object) bb.field_d.a((byte) -122));
                                    continue L20;
                                  }
                                }
                              }
                            }
                          } else {
                            L21: {
                              var3_long = ((p) ((Object) var1_ref)).d((byte) -124);
                              var20 = ((p) ((Object) var1_ref)).d(0);
                              var17 = ((p) ((Object) var1_ref)).d(0);
                              var19 = ((p) ((Object) var1_ref)).d(0);
                              var18 = ug.a((byte) -104, var3_long);
                              var8_ref_r = var18;
                              if (var17.equals("")) {
                                stackOut_11_0 = 0;
                                stackIn_12_0 = stackOut_11_0;
                                break L21;
                              } else {
                                stackOut_10_0 = 1;
                                stackIn_12_0 = stackOut_10_0;
                                break L21;
                              }
                            }
                            L22: {
                              var9 = stackIn_12_0;
                              if (var18 == null) {
                                var8_ref_r = new r(var20, var19, var3_long);
                                d.field_Mb.a(true, var8_ref_r, var3_long);
                                break L22;
                              } else {
                                if (var9 == 0) {
                                  break L22;
                                } else {
                                  var18.a(1, var19, var20);
                                  break L22;
                                }
                              }
                            }
                            L23: {
                              var8_ref_r.field_Nb = ud.a(2) + -(long)((p) ((Object) var1_ref)).e((byte) -112);
                              var8_ref_r.field_Pb = ((p) ((Object) var1_ref)).f(674914976);
                              var10 = ((p) ((Object) var1_ref)).c((byte) 112);
                              stackOut_16_0 = (r) (var8_ref_r);
                              stackIn_18_0 = stackOut_16_0;
                              stackIn_17_0 = stackOut_16_0;
                              if (-1 == (var10 & 1 ^ -1)) {
                                stackOut_18_0 = (r) ((Object) stackIn_18_0);
                                stackOut_18_1 = 0;
                                stackIn_19_0 = stackOut_18_0;
                                stackIn_19_1 = stackOut_18_1;
                                break L23;
                              } else {
                                stackOut_17_0 = (r) ((Object) stackIn_17_0);
                                stackOut_17_1 = 1;
                                stackIn_19_0 = stackOut_17_0;
                                stackIn_19_1 = stackOut_17_1;
                                break L23;
                              }
                            }
                            stackIn_19_0.field_Hb = stackIn_19_1 != 0;
                            var8_ref_r.field_Jb = var10 >> 1028370977;
                            var8_ref_r.field_Vb = ((p) ((Object) var1_ref)).i(-99);
                            var8_ref_r.field_Wb = ((p) ((Object) var1_ref)).i(param0 + -112);
                            ta.a(var8_ref_r, param0 ^ -66);
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
              }
              var3_ref_r = (r) ((Object) pd.field_Sb.g(-18110));
              L24: while (true) {
                if (var3_ref_r == null) {
                  var3_ref_r = (r) ((Object) d.field_Mb.a(false));
                  L25: while (true) {
                    if (var3_ref_r == null) {
                      L26: {
                        if ((var2 ^ -1) != -2) {
                          break L26;
                        } else {
                          if (pd.field_Rb == null) {
                            break L26;
                          } else {
                            i.field_c = pd.field_Rb.field_Gb;
                            break L26;
                          }
                        }
                      }
                      L27: {
                        if (4 != var2) {
                          pd.field_Rb = null;
                          break L27;
                        } else {
                          var3 = ((p) ((Object) var1_ref)).f(674914976);
                          pd.field_Rb = new ln(qa.field_e);
                          pd.field_Rb.a((long)var3, (byte) 71);
                          vl.a(var1_ref, pd.field_Rb, false, 120);
                          eg.field_e = 0L;
                          break L27;
                        }
                      }
                      L28: {
                        L29: {
                          if (-3 == (var2 ^ -1)) {
                            break L29;
                          } else {
                            if (3 != var2) {
                              ib.field_d = null;
                              break L28;
                            } else {
                              break L29;
                            }
                          }
                        }
                        if (null != ib.field_d) {
                          break L28;
                        } else {
                          ib.field_d = new ln(qa.field_e);
                          break L28;
                        }
                      }
                      if (-4 != (var2 ^ -1)) {
                        ud.field_b = false;
                        break L2;
                      } else {
                        ud.field_b = true;
                        var3 = 0;
                        L30: while (true) {
                          if (g.field_f.length <= var3) {
                            qd.field_u = ((p) ((Object) var1_ref)).i(param0 ^ -105);
                            p.field_n = ((p) ((Object) var1_ref)).i(-107);
                            var3 = 0;
                            L31: while (true) {
                              if (var3 >= fe.field_d.length) {
                                break L2;
                              } else {
                                fe.field_d[var3] = ((p) ((Object) var1_ref)).g(0);
                                var3++;
                                continue L31;
                              }
                            }
                          } else {
                            g.field_f[var3] = ((p) ((Object) var1_ref)).g(0);
                            var3++;
                            continue L30;
                          }
                        }
                      }
                    } else {
                      L32: {
                        L33: {
                          if (var3_ref_r.field_ac) {
                            break L33;
                          } else {
                            if (var3_ref_r.field_Qb) {
                              break L33;
                            } else {
                              break L32;
                            }
                          }
                        }
                        L34: {
                          var3_ref_r.field_ac = false;
                          if (!var3_ref_r.field_Qb) {
                            break L34;
                          } else {
                            var3_ref_r.field_Qb = false;
                            cb.field_f = cb.field_f - 1;
                            break L34;
                          }
                        }
                        ta.a(var3_ref_r, -98);
                        break L32;
                      }
                      var3_ref_r = (r) ((Object) d.field_Mb.a(0));
                      continue L25;
                    }
                  }
                } else {
                  var3_ref_r.c(-2193);
                  var3_ref_r.d(param0 ^ -18);
                  var3_ref_r = (r) ((Object) pd.field_Sb.a((byte) -107));
                  continue L24;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var1), "kh.B(" + param0 + ')');
        }
    }

    private final long c(byte param0) {
        int var9 = 0;
        int var10 = Chess.field_G;
        int var6 = -119 / ((21 - param0) / 41);
        long var2 = System.nanoTime();
        long var4 = -this.field_h + var2;
        this.field_h = var2;
        if ((var4 ^ -1L) < 4999999999L) {
            if (-5000000001L < (var4 ^ -1L)) {
                this.field_q[this.field_n] = var4;
                this.field_n = (this.field_n - -1) % 10;
                if (1 > this.field_g) {
                    this.field_g = this.field_g + 1;
                }
            }
        }
        long var7 = 0L;
        for (var9 = 1; this.field_g >= var9; var9++) {
            var7 = var7 + this.field_q[(10 + (this.field_n - var9)) % 10];
        }
        return var7 / (long)this.field_g;
    }

    final void b(byte param0) {
        if (param0 != 40) {
            return;
        }
        this.field_h = 0L;
        if (!((this.field_j ^ -1L) >= (this.field_i ^ -1L))) {
            this.field_i = this.field_i + (-this.field_i + this.field_j);
        }
    }

    final long a(byte param0) {
        this.field_i = this.field_i + this.c((byte) 126);
        if (param0 != -84) {
            field_p = (String) null;
        }
        if (!((this.field_i ^ -1L) <= (this.field_j ^ -1L))) {
            return (-this.field_i + this.field_j) / 1000000L;
        }
        return 0L;
    }

    final static void a(byte param0, lb param1, int param2, um param3) {
        try {
            eg.field_i = param2 * qd.d(-31137) / 1000;
            fd.a((byte) -103, param3);
            aa.a(-8428, param3);
            cd.a((byte) 127, param3);
            tl.a(false);
            ie.b(540);
            if (param0 > -121) {
                kh.b(115);
            }
            sl.field_a = 0 - eg.field_i;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "kh.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        field_k = null;
        if (param0 != 64) {
            return;
        }
        field_l = null;
        field_m = null;
        field_p = null;
    }

    kh() {
        this.field_j = 0L;
        this.field_h = 0L;
        this.field_g = 1;
        this.field_i = 0L;
        this.field_n = 0;
        this.field_q = new long[10];
        this.field_i = System.nanoTime();
        this.field_j = System.nanoTime();
    }

    static {
        field_p = "Decline invitation to <%0>'s game";
        field_m = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_k = new ij();
    }
}
