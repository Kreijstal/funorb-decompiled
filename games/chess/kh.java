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
        if (~((kh) this).field_j < ~((kh) this).field_i) {
          ((kh) this).field_h = ((kh) this).field_h + (-((kh) this).field_i + ((kh) this).field_j);
          ((kh) this).field_i = ((kh) this).field_i + (-((kh) this).field_i + ((kh) this).field_j);
          ((kh) this).field_j = ((kh) this).field_j + param0;
          return 1;
        } else {
          var5 = 0;
          L0: while (true) {
            L1: {
              var5++;
              ((kh) this).field_j = ((kh) this).field_j + param0;
              if (var5 >= 10) {
                break L1;
              } else {
                if (~((kh) this).field_i < ~((kh) this).field_j) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (((kh) this).field_j >= ((kh) this).field_i) {
                break L2;
              } else {
                ((kh) this).field_j = ((kh) this).field_i;
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
            stackOut_6_0 = (byte[]) var7;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4_ref;
            stackOut_8_1 = new StringBuilder().append("kh.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
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
          throw fk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
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
        Object var4 = null;
        ln var4_ref = null;
        int var4_int = 0;
        String var5_ref_String = null;
        int var5 = 0;
        ln var5_ref_ln = null;
        r var5_ref_r = null;
        String var6 = null;
        r var6_ref = null;
        ln var6_ref2 = null;
        String var7 = null;
        r var7_ref = null;
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
        ln var17 = null;
        int stackIn_12_0 = 0;
        r stackIn_17_0 = null;
        r stackIn_18_0 = null;
        r stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        r stackIn_79_0 = null;
        r stackIn_80_0 = null;
        r stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        RuntimeException decompiledCaughtException = null;
        r stackOut_78_0 = null;
        r stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        r stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        r stackOut_16_0 = null;
        r stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        r stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        var4 = null;
        var16 = null;
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
                L4: {
                  var2 = ((p) (Object) var1_ref).i(param0 ^ -100);
                  if (var2 == 0) {
                    break L4;
                  } else {
                    if (1 == var2) {
                      break L4;
                    } else {
                      if (var2 == 2) {
                        break L4;
                      } else {
                        if (var2 == 3) {
                          break L4;
                        } else {
                          if (var2 == 4) {
                            break L4;
                          } else {
                            if (5 != var2) {
                              if (var2 == 6) {
                                L5: {
                                  var3_long = ((p) (Object) var1_ref).d((byte) -127);
                                  var5 = ((p) (Object) var1_ref).i(-77);
                                  var6_ref = ug.a((byte) -92, var3_long);
                                  if (var6_ref == null) {
                                    break L5;
                                  } else {
                                    L6: {
                                      if (!var6_ref.field_Qb) {
                                        break L6;
                                      } else {
                                        cb.field_f = cb.field_f - 1;
                                        var6_ref.field_Qb = false;
                                        break L6;
                                      }
                                    }
                                    L7: {
                                      if (0 == var5) {
                                        var6_ref.c(-2193);
                                        break L7;
                                      } else {
                                        var6_ref.field_Mb = var5;
                                        var6_ref.field_Sb = ig.field_g;
                                        break L7;
                                      }
                                    }
                                    var6_ref.d(-1);
                                    break L5;
                                  }
                                }
                                break L2;
                              } else {
                                if (var2 != 7) {
                                  if (var2 != 8) {
                                    if (var2 != 9) {
                                      if (var2 != 10) {
                                        L8: {
                                          if (var2 == 11) {
                                            break L8;
                                          } else {
                                            if (var2 == 12) {
                                              break L8;
                                            } else {
                                              if (var2 == 13) {
                                                var3 = ((p) (Object) var1_ref).f(674914976);
                                                var4_int = ((p) (Object) var1_ref).i(-97);
                                                var5_ref_ln = (ln) (Object) ae.field_f.a((long)var3, 3000);
                                                if (var5_ref_ln != null) {
                                                  L9: {
                                                    var13 = var5_ref_ln;
                                                    var6_ref2 = var13;
                                                    var5_ref_ln.field_Tb = false;
                                                    var13.field_dc = false;
                                                    if (var4_int != 0) {
                                                      var5_ref_ln.field_jc = var4_int;
                                                      var5_ref_ln.field_Hb = ig.field_g;
                                                      break L9;
                                                    } else {
                                                      break L9;
                                                    }
                                                  }
                                                  fh.a((byte) -127, var5_ref_ln);
                                                  break L2;
                                                } else {
                                                  break L2;
                                                }
                                              } else {
                                                L10: {
                                                  if (var2 == 14) {
                                                    break L10;
                                                  } else {
                                                    if (var2 != 16) {
                                                      L11: {
                                                        if (15 == var2) {
                                                          break L11;
                                                        } else {
                                                          if (var2 == 17) {
                                                            break L11;
                                                          } else {
                                                            if (var2 == 18) {
                                                              L12: {
                                                                var3_long = ((p) (Object) var1_ref).d((byte) 116);
                                                                var5_ref_String = ((p) (Object) var1_ref).d(0);
                                                                var6 = ((p) (Object) var1_ref).d(0);
                                                                var7_ref = mi.a(param0 ^ 134217710, var3_long);
                                                                if (var7_ref != null) {
                                                                  break L12;
                                                                } else {
                                                                  var7_ref = new r(var5_ref_String, var6, var3_long);
                                                                  cm.field_v.a(true, (l) (Object) var7_ref, var3_long);
                                                                  pd.field_Rb.field_Xb = pd.field_Rb.field_Xb + 1;
                                                                  break L12;
                                                                }
                                                              }
                                                              L13: {
                                                                var7_ref.field_Pb = ((p) (Object) var1_ref).f(param0 ^ 674914993);
                                                                var8 = ((p) (Object) var1_ref).c((byte) -59);
                                                                var7_ref.field_Jb = var8 >> 1;
                                                                stackOut_78_0 = (r) var7_ref;
                                                                stackIn_80_0 = stackOut_78_0;
                                                                stackIn_79_0 = stackOut_78_0;
                                                                if (0 == (1 & var8)) {
                                                                  stackOut_80_0 = (r) (Object) stackIn_80_0;
                                                                  stackOut_80_1 = 0;
                                                                  stackIn_81_0 = stackOut_80_0;
                                                                  stackIn_81_1 = stackOut_80_1;
                                                                  break L13;
                                                                } else {
                                                                  stackOut_79_0 = (r) (Object) stackIn_79_0;
                                                                  stackOut_79_1 = 1;
                                                                  stackIn_81_0 = stackOut_79_0;
                                                                  stackIn_81_1 = stackOut_79_1;
                                                                  break L13;
                                                                }
                                                              }
                                                              stackIn_81_0.field_Hb = stackIn_81_1 != 0;
                                                              var7_ref.field_Vb = ((p) (Object) var1_ref).i(param0 + -142);
                                                              var7_ref.field_Wb = ((p) (Object) var1_ref).i(-106);
                                                              pd.field_Sb.a((o) (Object) var7_ref, (byte) 109);
                                                              break L2;
                                                            } else {
                                                              if (var2 == 19) {
                                                                var3_long = ((p) (Object) var1_ref).d((byte) -60);
                                                                var5 = ((p) (Object) var1_ref).i(param0 + -144);
                                                                var6_ref = mi.a(134217727, var3_long);
                                                                if (var6_ref != null) {
                                                                  L14: {
                                                                    if (var5 != 0) {
                                                                      var6_ref.field_Mb = var5;
                                                                      var6_ref.field_Sb = ig.field_g;
                                                                      break L14;
                                                                    } else {
                                                                      var6_ref.c(param0 ^ -2178);
                                                                      break L14;
                                                                    }
                                                                  }
                                                                  var6_ref.d(-1);
                                                                  pd.field_Rb.field_Xb = pd.field_Rb.field_Xb - 1;
                                                                  break L2;
                                                                } else {
                                                                  break L2;
                                                                }
                                                              } else {
                                                                if (var2 != 20) {
                                                                  if (var2 != 21) {
                                                                    if (var2 != 22) {
                                                                      if (var2 != 23) {
                                                                        fg.a((Throwable) null, (byte) -77, "L1: " + tm.b((byte) -123));
                                                                        si.d(param0 ^ 65297);
                                                                        break L2;
                                                                      } else {
                                                                        gb.field_t = ((p) (Object) var1_ref).d((byte) 116);
                                                                        break L2;
                                                                      }
                                                                    } else {
                                                                      fm.field_W = ((p) (Object) var1_ref).f(674914976);
                                                                      jf.field_b = ((p) (Object) var1_ref).c((byte) 75);
                                                                      break L2;
                                                                    }
                                                                  } else {
                                                                    var3 = ((p) (Object) var1_ref).f(param0 ^ 674914993);
                                                                    if (var3 == 0) {
                                                                      eg.field_e = 0L;
                                                                      break L2;
                                                                    } else {
                                                                      eg.field_e = (long)var3 + ud.a(2);
                                                                      break L2;
                                                                    }
                                                                  }
                                                                } else {
                                                                  vl.a((p) (Object) var1_ref, pd.field_Rb, false, param0 ^ 127);
                                                                  break L2;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                      var3_long = ((p) (Object) var1_ref).d((byte) -84);
                                                      var5 = ((p) (Object) var1_ref).i(-125);
                                                      var6_ref = ug.a((byte) -87, var3_long);
                                                      if (var6_ref != null) {
                                                        L15: {
                                                          if (15 == var2) {
                                                            var6_ref.field_ac = false;
                                                            break L15;
                                                          } else {
                                                            if (var6_ref.field_Qb) {
                                                              cb.field_f = cb.field_f - 1;
                                                              var6_ref.field_Qb = false;
                                                              break L15;
                                                            } else {
                                                              break L15;
                                                            }
                                                          }
                                                        }
                                                        L16: {
                                                          if (var5 == 0) {
                                                            break L16;
                                                          } else {
                                                            var6_ref.field_Mb = var5;
                                                            var6_ref.field_Sb = ig.field_g;
                                                            break L16;
                                                          }
                                                        }
                                                        ta.a(var6_ref, -122);
                                                        break L2;
                                                      } else {
                                                        break L2;
                                                      }
                                                    } else {
                                                      break L10;
                                                    }
                                                  }
                                                }
                                                L17: {
                                                  var3_long = ((p) (Object) var1_ref).d((byte) -74);
                                                  var5_ref_r = ug.a((byte) -107, var3_long);
                                                  if (var5_ref_r == null) {
                                                    break L17;
                                                  } else {
                                                    L18: {
                                                      if (var2 != 14) {
                                                        if (var5_ref_r.field_Qb) {
                                                          break L18;
                                                        } else {
                                                          var5_ref_r.field_Qb = true;
                                                          cb.field_f = cb.field_f + 1;
                                                          break L18;
                                                        }
                                                      } else {
                                                        var5_ref_r.field_ac = true;
                                                        break L18;
                                                      }
                                                    }
                                                    ta.a(var5_ref_r, param0 ^ -116);
                                                    break L17;
                                                  }
                                                }
                                                break L2;
                                              }
                                            }
                                          }
                                        }
                                        L19: {
                                          var3 = ((p) (Object) var1_ref).f(674914976);
                                          var14 = (ln) (Object) ae.field_f.a((long)var3, 3000);
                                          var4_ref = var14;
                                          if (var14 == null) {
                                            break L19;
                                          } else {
                                            L20: {
                                              if (11 != var2) {
                                                var4_ref.field_Tb = true;
                                                break L20;
                                              } else {
                                                var14.field_dc = true;
                                                break L20;
                                              }
                                            }
                                            fh.a((byte) -124, var4_ref);
                                            break L19;
                                          }
                                        }
                                        break L2;
                                      } else {
                                        var17 = (ln) (Object) nk.field_t.g(param0 ^ -18093);
                                        L21: while (true) {
                                          if (var17 == null) {
                                            break L3;
                                          } else {
                                            var17.c(-2193);
                                            var17.d(-1);
                                            var17 = (ln) (Object) nk.field_t.a((byte) -115);
                                            continue L21;
                                          }
                                        }
                                      }
                                    } else {
                                      var3 = ((p) (Object) var1_ref).f(param0 + 674914959);
                                      var4_int = ((p) (Object) var1_ref).i(-96);
                                      var12 = (ln) (Object) ae.field_f.a((long)var3, 3000);
                                      var5_ref_ln = var12;
                                      if (var12 != null) {
                                        L22: {
                                          if (0 == var4_int) {
                                            var5_ref_ln.c(param0 ^ -2178);
                                            break L22;
                                          } else {
                                            var12.field_Hb = ig.field_g;
                                            var12.field_jc = var4_int;
                                            break L22;
                                          }
                                        }
                                        var5_ref_ln.d(-1);
                                        break L2;
                                      } else {
                                        break L2;
                                      }
                                    }
                                  } else {
                                    L23: {
                                      var3 = ((p) (Object) var1_ref).f(674914976);
                                      var4_ref = (ln) (Object) ae.field_f.a((long)var3, param0 + 2983);
                                      if (var4_ref == null) {
                                        var4_ref = new ln(qa.field_e);
                                        ae.field_f.a(true, (l) (Object) var4_ref, (long)var3);
                                        break L23;
                                      } else {
                                        break L23;
                                      }
                                    }
                                    vl.a((p) (Object) var1_ref, var4_ref, true, param0 ^ 101);
                                    fh.a((byte) -119, var4_ref);
                                    break L2;
                                  }
                                } else {
                                  var15 = (r) (Object) bb.field_d.g(-18110);
                                  L24: while (true) {
                                    if (var15 == null) {
                                      cb.field_f = 0;
                                      break L2;
                                    } else {
                                      var15.c(-2193);
                                      var15.d(-1);
                                      var15 = (r) (Object) bb.field_d.a((byte) -122);
                                      continue L24;
                                    }
                                  }
                                }
                              }
                            } else {
                              L25: {
                                var3_long = ((p) (Object) var1_ref).d((byte) -124);
                                var5_ref_String = ((p) (Object) var1_ref).d(0);
                                var6 = ((p) (Object) var1_ref).d(0);
                                var7 = ((p) (Object) var1_ref).d(0);
                                var8_ref_r = ug.a((byte) -104, var3_long);
                                if (var6.equals((Object) (Object) "")) {
                                  stackOut_11_0 = 0;
                                  stackIn_12_0 = stackOut_11_0;
                                  break L25;
                                } else {
                                  stackOut_10_0 = 1;
                                  stackIn_12_0 = stackOut_10_0;
                                  break L25;
                                }
                              }
                              L26: {
                                var9 = stackIn_12_0;
                                if (var8_ref_r == null) {
                                  var8_ref_r = new r(var5_ref_String, var7, var3_long);
                                  d.field_Mb.a(true, (l) (Object) var8_ref_r, var3_long);
                                  break L26;
                                } else {
                                  if (var9 == 0) {
                                    break L26;
                                  } else {
                                    var8_ref_r.a(1, var7, var5_ref_String);
                                    break L26;
                                  }
                                }
                              }
                              L27: {
                                var8_ref_r.field_Nb = ud.a(2) + -(long)((p) (Object) var1_ref).e((byte) -112);
                                var8_ref_r.field_Pb = ((p) (Object) var1_ref).f(674914976);
                                var10 = ((p) (Object) var1_ref).c((byte) 112);
                                stackOut_16_0 = (r) var8_ref_r;
                                stackIn_18_0 = stackOut_16_0;
                                stackIn_17_0 = stackOut_16_0;
                                if ((var10 & 1) == 0) {
                                  stackOut_18_0 = (r) (Object) stackIn_18_0;
                                  stackOut_18_1 = 0;
                                  stackIn_19_0 = stackOut_18_0;
                                  stackIn_19_1 = stackOut_18_1;
                                  break L27;
                                } else {
                                  stackOut_17_0 = (r) (Object) stackIn_17_0;
                                  stackOut_17_1 = 1;
                                  stackIn_19_0 = stackOut_17_0;
                                  stackIn_19_1 = stackOut_17_1;
                                  break L27;
                                }
                              }
                              stackIn_19_0.field_Hb = stackIn_19_1 != 0;
                              var8_ref_r.field_Jb = var10 >> 1;
                              var8_ref_r.field_Vb = ((p) (Object) var1_ref).i(-99);
                              var8_ref_r.field_Wb = ((p) (Object) var1_ref).i(param0 + -112);
                              ta.a(var8_ref_r, param0 ^ -66);
                              break L2;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                var3_ref_r = (r) (Object) pd.field_Sb.g(-18110);
                L28: while (true) {
                  if (var3_ref_r == null) {
                    var3_ref_r = (r) (Object) d.field_Mb.a(false);
                    L29: while (true) {
                      if (var3_ref_r == null) {
                        L30: {
                          if (var2 != 1) {
                            break L30;
                          } else {
                            if (pd.field_Rb == null) {
                              break L30;
                            } else {
                              i.field_c = pd.field_Rb.field_Gb;
                              break L30;
                            }
                          }
                        }
                        L31: {
                          if (4 != var2) {
                            pd.field_Rb = null;
                            break L31;
                          } else {
                            var3 = ((p) (Object) var1_ref).f(674914976);
                            pd.field_Rb = new ln(qa.field_e);
                            pd.field_Rb.a((long)var3, (byte) 71);
                            vl.a((p) (Object) var1_ref, pd.field_Rb, false, 120);
                            eg.field_e = 0L;
                            break L31;
                          }
                        }
                        L32: {
                          L33: {
                            if (var2 == 2) {
                              break L33;
                            } else {
                              if (3 != var2) {
                                ib.field_d = null;
                                break L32;
                              } else {
                                break L33;
                              }
                            }
                          }
                          if (null != ib.field_d) {
                            break L32;
                          } else {
                            ib.field_d = new ln(qa.field_e);
                            break L32;
                          }
                        }
                        if (var2 != 3) {
                          ud.field_b = false;
                          break L2;
                        } else {
                          ud.field_b = true;
                          var3 = 0;
                          L34: while (true) {
                            if (~g.field_f.length >= ~var3) {
                              qd.field_u = ((p) (Object) var1_ref).i(param0 ^ -105);
                              p.field_n = ((p) (Object) var1_ref).i(-107);
                              var3 = 0;
                              L35: while (true) {
                                if (var3 >= fe.field_d.length) {
                                  break L3;
                                } else {
                                  fe.field_d[var3] = ((p) (Object) var1_ref).g(0);
                                  var3++;
                                  continue L35;
                                }
                              }
                            } else {
                              g.field_f[var3] = ((p) (Object) var1_ref).g(0);
                              var3++;
                              continue L34;
                            }
                          }
                        }
                      } else {
                        L36: {
                          L37: {
                            if (var3_ref_r.field_ac) {
                              break L37;
                            } else {
                              if (var3_ref_r.field_Qb) {
                                break L37;
                              } else {
                                break L36;
                              }
                            }
                          }
                          L38: {
                            var3_ref_r.field_ac = false;
                            if (!var3_ref_r.field_Qb) {
                              break L38;
                            } else {
                              var3_ref_r.field_Qb = false;
                              cb.field_f = cb.field_f - 1;
                              break L38;
                            }
                          }
                          ta.a(var3_ref_r, -98);
                          break L36;
                        }
                        var3_ref_r = (r) (Object) d.field_Mb.a(0);
                        continue L29;
                      }
                    }
                  } else {
                    var3_ref_r.c(-2193);
                    var3_ref_r.d(param0 ^ -18);
                    var3_ref_r = (r) (Object) pd.field_Sb.a((byte) -107);
                    continue L28;
                  }
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var1, "kh.B(" + param0 + ')');
        }
    }

    private final long c() {
        int var9 = 0;
        int var10 = Chess.field_G;
        int var6 = 59;
        long var2 = System.nanoTime();
        long var4 = -((kh) this).field_h + var2;
        ((kh) this).field_h = var2;
        if (var4 > -5000000000L) {
            if (var4 < 5000000000L) {
                ((kh) this).field_q[((kh) this).field_n] = var4;
                ((kh) this).field_n = (((kh) this).field_n - -1) % 10;
                if (1 > ((kh) this).field_g) {
                    ((kh) this).field_g = ((kh) this).field_g + 1;
                }
            }
        }
        long var7 = 0L;
        for (var9 = 1; ((kh) this).field_g >= var9; var9++) {
            var7 = var7 + ((kh) this).field_q[(10 + (((kh) this).field_n - var9)) % 10];
        }
        return var7 / (long)((kh) this).field_g;
    }

    final void b(byte param0) {
        if (param0 != 40) {
            return;
        }
        ((kh) this).field_h = 0L;
        if (!(~((kh) this).field_j >= ~((kh) this).field_i)) {
            ((kh) this).field_i = ((kh) this).field_i + (-((kh) this).field_i + ((kh) this).field_j);
        }
    }

    final long a(byte param0) {
        int discarded$0 = 126;
        ((kh) this).field_i = ((kh) this).field_i + this.c();
        if (param0 != -84) {
            field_p = null;
        }
        if (!(~((kh) this).field_i <= ~((kh) this).field_j)) {
            return (-((kh) this).field_i + ((kh) this).field_j) / 1000000L;
        }
        return 0L;
    }

    final static void a(byte param0, lb param1, int param2, um param3) {
        try {
            int discarded$0 = -31137;
            eg.field_i = param2 * qd.d() / 1000;
            fd.a((byte) -103, param3);
            aa.a(-8428, param3);
            cd.a((byte) 127, param3);
            int discarded$1 = 0;
            tl.a();
            int discarded$2 = 540;
            ie.b();
            sl.field_a = 0 - eg.field_i;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "kh.E(" + -127 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b() {
        field_k = null;
        field_l = null;
        field_m = null;
        field_p = null;
    }

    kh() {
        ((kh) this).field_j = 0L;
        ((kh) this).field_h = 0L;
        ((kh) this).field_g = 1;
        ((kh) this).field_i = 0L;
        ((kh) this).field_n = 0;
        ((kh) this).field_q = new long[10];
        ((kh) this).field_i = System.nanoTime();
        ((kh) this).field_j = System.nanoTime();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Decline invitation to <%0>'s game";
        field_m = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_k = new ij();
    }
}
