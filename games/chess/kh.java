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
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_6_0 = 0;
        var6 = Chess.field_G;
        var4 = 108 % ((param1 - 64) / 54);
        if ((((kh) this).field_j ^ -1L) >= (((kh) this).field_i ^ -1L)) {
          var5 = 0;
          L0: while (true) {
            var5++;
            ((kh) this).field_j = ((kh) this).field_j + param0;
            stackOut_3_0 = var5 ^ -1;
            stackIn_4_0 = stackOut_3_0;
            L1: while (true) {
              L2: {
                if (stackIn_4_0 <= -11) {
                  break L2;
                } else {
                  if ((((kh) this).field_i ^ -1L) < (((kh) this).field_j ^ -1L)) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_6_0 = (((kh) this).field_j < ((kh) this).field_i ? -1 : (((kh) this).field_j == ((kh) this).field_i ? 0 : 1));
              stackIn_4_0 = stackOut_6_0;
              stackIn_7_0 = stackOut_6_0;
              if (var6 != 0) {
                continue L1;
              } else {
                L3: {
                  if (stackIn_7_0 >= 0) {
                    break L3;
                  } else {
                    ((kh) this).field_j = ((kh) this).field_i;
                    break L3;
                  }
                }
                return var5;
              }
            }
          }
        } else {
          ((kh) this).field_h = ((kh) this).field_h + (-((kh) this).field_i + ((kh) this).field_j);
          ((kh) this).field_i = ((kh) this).field_i + (-((kh) this).field_i + ((kh) this).field_j);
          ((kh) this).field_j = ((kh) this).field_j + param0;
          return 1;
        }
    }

    final static byte[] a(int param0, int param1, byte param2, byte[] param3) {
        byte[] var4 = null;
        int var5_int = 0;
        df var5 = null;
        int var6 = 0;
        byte[] var7 = null;
        int var8 = 0;
        byte[] var9 = null;
        L0: {
          L1: {
            var8 = Chess.field_G;
            if (0 >= param0) {
              break L1;
            } else {
              var9 = new byte[param1];
              var4 = var9;
              var5_int = 0;
              L2: while (true) {
                if (var5_int >= param1) {
                  if (var8 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                } else {
                  var9[var5_int] = param3[param0 + var5_int];
                  var5_int++;
                  if (var8 != 0) {
                    break L0;
                  } else {
                    continue L2;
                  }
                }
              }
            }
          }
          var4 = param3;
          break L0;
        }
        var6 = -88 / ((param2 - 55) / 51);
        var5 = new df();
        var5.a(94);
        var5.a((byte) -122, var4, (long)(8 * param1));
        var7 = new byte[64];
        var5.a(-115, 0, var7);
        return var7;
    }

    final static void c(int param0) {
        nk var1 = null;
        int var2 = 0;
        r var3_ref_r = null;
        long var3_long = 0L;
        int var3 = 0;
        ln var4_ref_ln = null;
        int var4 = 0;
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
        nk var12 = null;
        ln var13 = null;
        r var14 = null;
        ln var15 = null;
        Object var16 = null;
        ln var17 = null;
        int stackIn_11_0 = 0;
        r stackIn_17_0 = null;
        r stackIn_18_0 = null;
        r stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        r stackIn_96_0 = null;
        r stackIn_97_0 = null;
        r stackIn_98_0 = null;
        int stackIn_98_1 = 0;
        boolean stackIn_142_0 = false;
        int stackIn_150_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        r stackOut_16_0 = null;
        r stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        r stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        r stackOut_95_0 = null;
        r stackOut_97_0 = null;
        int stackOut_97_1 = 0;
        r stackOut_96_0 = null;
        int stackOut_96_1 = 0;
        boolean stackOut_141_0 = false;
        int stackOut_149_0 = 0;
        L0: {
          var16 = null;
          var11 = Chess.field_G;
          var12 = tk.field_h;
          var1 = var12;
          if (param0 == 17) {
            break L0;
          } else {
            kh.c(1);
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              var2 = ((p) (Object) var1).i(param0 ^ -100);
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
                        L4: {
                          if (5 != var2) {
                            break L4;
                          } else {
                            L5: {
                              var3_long = ((p) (Object) var1).d((byte) -124);
                              var5_ref_String = ((p) (Object) var1).d(0);
                              var6 = ((p) (Object) var1).d(0);
                              var7 = ((p) (Object) var1).d(0);
                              var8_ref_r = ug.a((byte) -104, var3_long);
                              if (var6.equals((Object) (Object) "")) {
                                stackOut_10_0 = 0;
                                stackIn_11_0 = stackOut_10_0;
                                break L5;
                              } else {
                                stackOut_9_0 = 1;
                                stackIn_11_0 = stackOut_9_0;
                                break L5;
                              }
                            }
                            L6: {
                              L7: {
                                var9 = stackIn_11_0;
                                if (var8_ref_r == null) {
                                  break L7;
                                } else {
                                  if (var9 == 0) {
                                    break L6;
                                  } else {
                                    var8_ref_r.a(1, var7, var5_ref_String);
                                    if (var11 == 0) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              var8_ref_r = new r(var5_ref_String, var7, var3_long);
                              d.field_Mb.a(true, (l) (Object) var8_ref_r, var3_long);
                              break L6;
                            }
                            L8: {
                              var8_ref_r.field_Nb = ud.a(2) + -(long)((p) (Object) var1).e((byte) -112);
                              var8_ref_r.field_Pb = ((p) (Object) var1).f(674914976);
                              var10 = ((p) (Object) var1).c((byte) 112);
                              stackOut_16_0 = (r) var8_ref_r;
                              stackIn_18_0 = stackOut_16_0;
                              stackIn_17_0 = stackOut_16_0;
                              if (-1 == (var10 & 1 ^ -1)) {
                                stackOut_18_0 = (r) (Object) stackIn_18_0;
                                stackOut_18_1 = 0;
                                stackIn_19_0 = stackOut_18_0;
                                stackIn_19_1 = stackOut_18_1;
                                break L8;
                              } else {
                                stackOut_17_0 = (r) (Object) stackIn_17_0;
                                stackOut_17_1 = 1;
                                stackIn_19_0 = stackOut_17_0;
                                stackIn_19_1 = stackOut_17_1;
                                break L8;
                              }
                            }
                            stackIn_19_0.field_Hb = stackIn_19_1 != 0;
                            var8_ref_r.field_Jb = var10 >> 1028370977;
                            var8_ref_r.field_Vb = ((p) (Object) var1).i(-99);
                            var8_ref_r.field_Wb = ((p) (Object) var1).i(param0 + -112);
                            ta.a(var8_ref_r, param0 ^ -66);
                            if (var11 == 0) {
                              break L1;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L9: {
                          if ((var2 ^ -1) == -7) {
                            break L9;
                          } else {
                            L10: {
                              if ((var2 ^ -1) != -8) {
                                break L10;
                              } else {
                                var14 = (r) (Object) bb.field_d.g(-18110);
                                L11: while (true) {
                                  L12: {
                                    L13: {
                                      if (var14 == null) {
                                        break L13;
                                      } else {
                                        var14.c(-2193);
                                        var14.d(-1);
                                        var14 = (r) (Object) bb.field_d.a((byte) -122);
                                        if (var11 != 0) {
                                          break L12;
                                        } else {
                                          if (var11 == 0) {
                                            continue L11;
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                    }
                                    cb.field_f = 0;
                                    break L12;
                                  }
                                  if (var11 == 0) {
                                    break L2;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                            }
                            L14: {
                              if (var2 != 8) {
                                break L14;
                              } else {
                                L15: {
                                  var3 = ((p) (Object) var1).f(674914976);
                                  var4_ref_ln = (ln) (Object) ae.field_f.a((long)var3, param0 + 2983);
                                  if (var4_ref_ln == null) {
                                    var4_ref_ln = new ln(qa.field_e);
                                    ae.field_f.a(true, (l) (Object) var4_ref_ln, (long)var3);
                                    break L15;
                                  } else {
                                    break L15;
                                  }
                                }
                                vl.a((p) (Object) var1, var4_ref_ln, true, param0 ^ 101);
                                fh.a((byte) -119, var4_ref_ln);
                                if (var11 == 0) {
                                  break L2;
                                } else {
                                  break L14;
                                }
                              }
                            }
                            L16: {
                              if (var2 != 9) {
                                break L16;
                              } else {
                                L17: {
                                  var3 = ((p) (Object) var1).f(param0 + 674914959);
                                  var4 = ((p) (Object) var1).i(-96);
                                  var5_ref_ln = (ln) (Object) ae.field_f.a((long)var3, 3000);
                                  if (var5_ref_ln != null) {
                                    L18: {
                                      L19: {
                                        if (0 == var4) {
                                          break L19;
                                        } else {
                                          var5_ref_ln.field_Hb = ig.field_g;
                                          var5_ref_ln.field_jc = var4;
                                          if (var11 == 0) {
                                            break L18;
                                          } else {
                                            break L19;
                                          }
                                        }
                                      }
                                      var5_ref_ln.c(param0 ^ -2178);
                                      break L18;
                                    }
                                    var5_ref_ln.d(-1);
                                    break L17;
                                  } else {
                                    break L17;
                                  }
                                }
                                if (var11 == 0) {
                                  break L2;
                                } else {
                                  break L16;
                                }
                              }
                            }
                            L20: {
                              if ((var2 ^ -1) != -11) {
                                break L20;
                              } else {
                                var15 = (ln) (Object) nk.field_t.g(param0 ^ -18093);
                                L21: while (true) {
                                  L22: {
                                    if (var15 == null) {
                                      break L22;
                                    } else {
                                      var15.c(-2193);
                                      var15.d(-1);
                                      var15 = (ln) (Object) nk.field_t.a((byte) -115);
                                      if (var11 != 0) {
                                        break L2;
                                      } else {
                                        if (var11 == 0) {
                                          continue L21;
                                        } else {
                                          break L22;
                                        }
                                      }
                                    }
                                  }
                                  if (var11 == 0) {
                                    break L2;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                            }
                            L23: {
                              if ((var2 ^ -1) == -12) {
                                break L23;
                              } else {
                                if (-13 == (var2 ^ -1)) {
                                  break L23;
                                } else {
                                  L24: {
                                    if (var2 == 13) {
                                      break L24;
                                    } else {
                                      L25: {
                                        L26: {
                                          if (var2 == 14) {
                                            break L26;
                                          } else {
                                            if (-17 != (var2 ^ -1)) {
                                              break L25;
                                            } else {
                                              break L26;
                                            }
                                          }
                                        }
                                        L27: {
                                          var3_long = ((p) (Object) var1).d((byte) -74);
                                          var5_ref_r = ug.a((byte) -107, var3_long);
                                          if (var5_ref_r == null) {
                                            break L27;
                                          } else {
                                            L28: {
                                              L29: {
                                                if (var2 != 14) {
                                                  break L29;
                                                } else {
                                                  var5_ref_r.field_ac = true;
                                                  if (var11 == 0) {
                                                    break L28;
                                                  } else {
                                                    break L29;
                                                  }
                                                }
                                              }
                                              if (var5_ref_r.field_Qb) {
                                                break L28;
                                              } else {
                                                var5_ref_r.field_Qb = true;
                                                cb.field_f = cb.field_f + 1;
                                                break L28;
                                              }
                                            }
                                            ta.a(var5_ref_r, param0 ^ -116);
                                            break L27;
                                          }
                                        }
                                        if (var11 == 0) {
                                          break L2;
                                        } else {
                                          break L25;
                                        }
                                      }
                                      L30: {
                                        if (15 == var2) {
                                          break L30;
                                        } else {
                                          if (var2 == 17) {
                                            break L30;
                                          } else {
                                            L31: {
                                              if ((var2 ^ -1) == -19) {
                                                break L31;
                                              } else {
                                                L32: {
                                                  if (var2 == 19) {
                                                    break L32;
                                                  } else {
                                                    L33: {
                                                      if (var2 != 20) {
                                                        break L33;
                                                      } else {
                                                        vl.a((p) (Object) var1, pd.field_Rb, false, param0 ^ 127);
                                                        if (var11 == 0) {
                                                          break L2;
                                                        } else {
                                                          break L33;
                                                        }
                                                      }
                                                    }
                                                    L34: {
                                                      if (-22 != (var2 ^ -1)) {
                                                        break L34;
                                                      } else {
                                                        L35: {
                                                          L36: {
                                                            var3 = ((p) (Object) var1).f(param0 ^ 674914993);
                                                            if ((var3 ^ -1) == -1) {
                                                              break L36;
                                                            } else {
                                                              eg.field_e = (long)var3 + ud.a(2);
                                                              if (var11 == 0) {
                                                                break L35;
                                                              } else {
                                                                break L36;
                                                              }
                                                            }
                                                          }
                                                          eg.field_e = 0L;
                                                          break L35;
                                                        }
                                                        if (var11 == 0) {
                                                          break L2;
                                                        } else {
                                                          break L34;
                                                        }
                                                      }
                                                    }
                                                    L37: {
                                                      if ((var2 ^ -1) != -23) {
                                                        break L37;
                                                      } else {
                                                        fm.field_W = ((p) (Object) var1).f(674914976);
                                                        jf.field_b = ((p) (Object) var1).c((byte) 75);
                                                        if (var11 == 0) {
                                                          break L2;
                                                        } else {
                                                          break L37;
                                                        }
                                                      }
                                                    }
                                                    L38: {
                                                      if ((var2 ^ -1) != -24) {
                                                        break L38;
                                                      } else {
                                                        gb.field_t = ((p) (Object) var1).d((byte) 116);
                                                        if (var11 == 0) {
                                                          break L2;
                                                        } else {
                                                          break L38;
                                                        }
                                                      }
                                                    }
                                                    fg.a((Throwable) null, (byte) -77, "L1: " + tm.b((byte) -123));
                                                    si.d(param0 ^ 65297);
                                                    if (var11 == 0) {
                                                      break L2;
                                                    } else {
                                                      break L32;
                                                    }
                                                  }
                                                }
                                                L39: {
                                                  var3_long = ((p) (Object) var1).d((byte) -60);
                                                  var5 = ((p) (Object) var1).i(param0 + -144);
                                                  var6_ref = mi.a(134217727, var3_long);
                                                  if (var6_ref != null) {
                                                    L40: {
                                                      L41: {
                                                        if ((var5 ^ -1) != -1) {
                                                          break L41;
                                                        } else {
                                                          var6_ref.c(param0 ^ -2178);
                                                          if (var11 == 0) {
                                                            break L40;
                                                          } else {
                                                            break L41;
                                                          }
                                                        }
                                                      }
                                                      var6_ref.field_Mb = var5;
                                                      var6_ref.field_Sb = ig.field_g;
                                                      break L40;
                                                    }
                                                    var6_ref.d(-1);
                                                    pd.field_Rb.field_Xb = pd.field_Rb.field_Xb - 1;
                                                    break L39;
                                                  } else {
                                                    break L39;
                                                  }
                                                }
                                                if (var11 == 0) {
                                                  break L2;
                                                } else {
                                                  break L31;
                                                }
                                              }
                                            }
                                            L42: {
                                              var3_long = ((p) (Object) var1).d((byte) 116);
                                              var5_ref_String = ((p) (Object) var1).d(0);
                                              var6 = ((p) (Object) var1).d(0);
                                              var7_ref = mi.a(param0 ^ 134217710, var3_long);
                                              if (var7_ref != null) {
                                                break L42;
                                              } else {
                                                var7_ref = new r(var5_ref_String, var6, var3_long);
                                                cm.field_v.a(true, (l) (Object) var7_ref, var3_long);
                                                pd.field_Rb.field_Xb = pd.field_Rb.field_Xb + 1;
                                                break L42;
                                              }
                                            }
                                            L43: {
                                              var7_ref.field_Pb = ((p) (Object) var1).f(param0 ^ 674914993);
                                              var8 = ((p) (Object) var1).c((byte) -59);
                                              var7_ref.field_Jb = var8 >> 1772151457;
                                              stackOut_95_0 = (r) var7_ref;
                                              stackIn_97_0 = stackOut_95_0;
                                              stackIn_96_0 = stackOut_95_0;
                                              if (0 == (1 & var8)) {
                                                stackOut_97_0 = (r) (Object) stackIn_97_0;
                                                stackOut_97_1 = 0;
                                                stackIn_98_0 = stackOut_97_0;
                                                stackIn_98_1 = stackOut_97_1;
                                                break L43;
                                              } else {
                                                stackOut_96_0 = (r) (Object) stackIn_96_0;
                                                stackOut_96_1 = 1;
                                                stackIn_98_0 = stackOut_96_0;
                                                stackIn_98_1 = stackOut_96_1;
                                                break L43;
                                              }
                                            }
                                            stackIn_98_0.field_Hb = stackIn_98_1 != 0;
                                            var7_ref.field_Vb = ((p) (Object) var1).i(param0 + -142);
                                            var7_ref.field_Wb = ((p) (Object) var1).i(-106);
                                            pd.field_Sb.a((o) (Object) var7_ref, (byte) 109);
                                            if (var11 == 0) {
                                              break L2;
                                            } else {
                                              break L30;
                                            }
                                          }
                                        }
                                      }
                                      L44: {
                                        var3_long = ((p) (Object) var1).d((byte) -84);
                                        var5 = ((p) (Object) var1).i(-125);
                                        var6_ref = ug.a((byte) -87, var3_long);
                                        if (var6_ref != null) {
                                          L45: {
                                            L46: {
                                              if (15 == var2) {
                                                break L46;
                                              } else {
                                                if (var6_ref.field_Qb) {
                                                  cb.field_f = cb.field_f - 1;
                                                  var6_ref.field_Qb = false;
                                                  if (var11 == 0) {
                                                    break L45;
                                                  } else {
                                                    break L46;
                                                  }
                                                } else {
                                                  break L45;
                                                }
                                              }
                                            }
                                            var6_ref.field_ac = false;
                                            break L45;
                                          }
                                          L47: {
                                            if (var5 == 0) {
                                              break L47;
                                            } else {
                                              var6_ref.field_Mb = var5;
                                              var6_ref.field_Sb = ig.field_g;
                                              break L47;
                                            }
                                          }
                                          ta.a(var6_ref, -122);
                                          break L44;
                                        } else {
                                          break L44;
                                        }
                                      }
                                      if (var11 == 0) {
                                        break L2;
                                      } else {
                                        break L24;
                                      }
                                    }
                                  }
                                  L48: {
                                    var3 = ((p) (Object) var1).f(674914976);
                                    var4 = ((p) (Object) var1).i(-97);
                                    var5_ref_ln = (ln) (Object) ae.field_f.a((long)var3, 3000);
                                    if (var5_ref_ln != null) {
                                      L49: {
                                        var13 = var5_ref_ln;
                                        var6_ref2 = var13;
                                        var5_ref_ln.field_Tb = false;
                                        var13.field_dc = false;
                                        if (var4 != 0) {
                                          var5_ref_ln.field_jc = var4;
                                          var5_ref_ln.field_Hb = ig.field_g;
                                          break L49;
                                        } else {
                                          break L49;
                                        }
                                      }
                                      fh.a((byte) -127, var5_ref_ln);
                                      break L48;
                                    } else {
                                      break L48;
                                    }
                                  }
                                  if (var11 == 0) {
                                    break L2;
                                  } else {
                                    break L23;
                                  }
                                }
                              }
                            }
                            L50: {
                              var3 = ((p) (Object) var1).f(674914976);
                              var17 = (ln) (Object) ae.field_f.a((long)var3, 3000);
                              if (var17 == null) {
                                break L50;
                              } else {
                                L51: {
                                  L52: {
                                    if (11 != var2) {
                                      break L52;
                                    } else {
                                      var17.field_dc = true;
                                      if (var11 == 0) {
                                        break L51;
                                      } else {
                                        break L52;
                                      }
                                    }
                                  }
                                  var17.field_Tb = true;
                                  break L51;
                                }
                                fh.a((byte) -124, var17);
                                break L50;
                              }
                            }
                            if (var11 == 0) {
                              break L2;
                            } else {
                              break L9;
                            }
                          }
                        }
                        L53: {
                          var3_long = ((p) (Object) var1).d((byte) -127);
                          var5 = ((p) (Object) var1).i(-77);
                          var6_ref = ug.a((byte) -92, var3_long);
                          if (var6_ref == null) {
                            break L53;
                          } else {
                            L54: {
                              if (!var6_ref.field_Qb) {
                                break L54;
                              } else {
                                cb.field_f = cb.field_f - 1;
                                var6_ref.field_Qb = false;
                                break L54;
                              }
                            }
                            L55: {
                              L56: {
                                if (0 == var5) {
                                  break L56;
                                } else {
                                  var6_ref.field_Mb = var5;
                                  var6_ref.field_Sb = ig.field_g;
                                  if (var11 == 0) {
                                    break L55;
                                  } else {
                                    break L56;
                                  }
                                }
                              }
                              var6_ref.c(-2193);
                              break L55;
                            }
                            var6_ref.d(-1);
                            break L53;
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
            }
            var3_ref_r = (r) (Object) pd.field_Sb.g(-18110);
            L57: while (true) {
              L58: {
                L59: {
                  if (var3_ref_r == null) {
                    break L59;
                  } else {
                    var3_ref_r.c(-2193);
                    var3_ref_r.d(param0 ^ -18);
                    var3_ref_r = (r) (Object) pd.field_Sb.a((byte) -107);
                    if (var11 != 0) {
                      break L58;
                    } else {
                      if (var11 == 0) {
                        continue L57;
                      } else {
                        break L59;
                      }
                    }
                  }
                }
                var3_ref_r = (r) (Object) d.field_Mb.a(false);
                break L58;
              }
              L60: while (true) {
                L61: {
                  L62: {
                    if (var3_ref_r == null) {
                      break L62;
                    } else {
                      stackOut_141_0 = var3_ref_r.field_ac;
                      stackIn_150_0 = stackOut_141_0 ? 1 : 0;
                      stackIn_142_0 = stackOut_141_0;
                      if (var11 != 0) {
                        break L61;
                      } else {
                        L63: {
                          L64: {
                            if (stackIn_142_0) {
                              break L64;
                            } else {
                              if (var3_ref_r.field_Qb) {
                                break L64;
                              } else {
                                break L63;
                              }
                            }
                          }
                          L65: {
                            var3_ref_r.field_ac = false;
                            if (!var3_ref_r.field_Qb) {
                              break L65;
                            } else {
                              var3_ref_r.field_Qb = false;
                              cb.field_f = cb.field_f - 1;
                              break L65;
                            }
                          }
                          ta.a(var3_ref_r, -98);
                          break L63;
                        }
                        var3_ref_r = (r) (Object) d.field_Mb.a(0);
                        if (var11 == 0) {
                          continue L60;
                        } else {
                          break L62;
                        }
                      }
                    }
                  }
                  stackOut_149_0 = var2 ^ -1;
                  stackIn_150_0 = stackOut_149_0;
                  break L61;
                }
                L66: {
                  if (stackIn_150_0 != -2) {
                    break L66;
                  } else {
                    if (pd.field_Rb == null) {
                      break L66;
                    } else {
                      i.field_c = pd.field_Rb.field_Gb;
                      break L66;
                    }
                  }
                }
                L67: {
                  if (4 != var2) {
                    pd.field_Rb = null;
                    break L67;
                  } else {
                    var3 = ((p) (Object) var1).f(674914976);
                    pd.field_Rb = new ln(qa.field_e);
                    pd.field_Rb.a((long)var3, (byte) 71);
                    vl.a((p) (Object) var1, pd.field_Rb, false, 120);
                    eg.field_e = 0L;
                    break L67;
                  }
                }
                L68: {
                  L69: {
                    L70: {
                      if (-3 == (var2 ^ -1)) {
                        break L70;
                      } else {
                        if (3 != var2) {
                          break L69;
                        } else {
                          break L70;
                        }
                      }
                    }
                    if (null != ib.field_d) {
                      break L68;
                    } else {
                      ib.field_d = new ln(qa.field_e);
                      if (var11 == 0) {
                        break L68;
                      } else {
                        break L69;
                      }
                    }
                  }
                  ib.field_d = null;
                  break L68;
                }
                L71: {
                  if (-4 != (var2 ^ -1)) {
                    break L71;
                  } else {
                    ud.field_b = true;
                    var3 = 0;
                    L72: while (true) {
                      L73: {
                        L74: {
                          if ((g.field_f.length ^ -1) >= (var3 ^ -1)) {
                            break L74;
                          } else {
                            g.field_f[var3] = ((p) (Object) var12).g(0);
                            var3++;
                            if (var11 != 0) {
                              break L73;
                            } else {
                              if (var11 == 0) {
                                continue L72;
                              } else {
                                break L74;
                              }
                            }
                          }
                        }
                        qd.field_u = ((p) (Object) var1).i(param0 ^ -105);
                        p.field_n = ((p) (Object) var1).i(-107);
                        break L73;
                      }
                      var3 = 0;
                      L75: while (true) {
                        L76: {
                          if (var3 >= fe.field_d.length) {
                            break L76;
                          } else {
                            fe.field_d[var3] = ((p) (Object) var12).g(0);
                            var3++;
                            if (var11 != 0) {
                              break L2;
                            } else {
                              if (var11 == 0) {
                                continue L75;
                              } else {
                                break L76;
                              }
                            }
                          }
                        }
                        if (var11 == 0) {
                          break L2;
                        } else {
                          break L71;
                        }
                      }
                    }
                  }
                }
                ud.field_b = false;
                break L1;
              }
            }
          }
          break L1;
        }
    }

    private final long c(byte param0) {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        long stackIn_8_0 = 0L;
        long stackIn_9_0 = 0L;
        long stackOut_7_0 = 0L;
        L0: {
          var10 = Chess.field_G;
          var6 = -119 / ((21 - param0) / 41);
          var2 = System.nanoTime();
          var4 = -((kh) this).field_h + var2;
          ((kh) this).field_h = var2;
          if ((var4 ^ -1L) >= 4999999999L) {
            break L0;
          } else {
            if (-5000000001L >= (var4 ^ -1L)) {
              break L0;
            } else {
              ((kh) this).field_q[((kh) this).field_n] = var4;
              ((kh) this).field_n = (((kh) this).field_n - -1) % 10;
              if (1 <= ((kh) this).field_g) {
                break L0;
              } else {
                ((kh) this).field_g = ((kh) this).field_g + 1;
                break L0;
              }
            }
          }
        }
        var7 = 0L;
        var9 = 1;
        L1: while (true) {
          if (((kh) this).field_g >= var9) {
            stackOut_7_0 = var7 + ((kh) this).field_q[(10 + (((kh) this).field_n - var9)) % 10];
            stackIn_9_0 = stackOut_7_0;
            stackIn_8_0 = stackOut_7_0;
            if (var10 == 0) {
              var7 = stackIn_9_0;
              var9++;
              continue L1;
            } else {
              return stackIn_8_0;
            }
          } else {
            return var7 / (long)((kh) this).field_g;
          }
        }
    }

    final void b(byte param0) {
        if (param0 != 40) {
          return;
        } else {
          L0: {
            ((kh) this).field_h = 0L;
            if ((((kh) this).field_j ^ -1L) < (((kh) this).field_i ^ -1L)) {
              ((kh) this).field_i = ((kh) this).field_i + (-((kh) this).field_i + ((kh) this).field_j);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    final long a(byte param0) {
        ((kh) this).field_i = ((kh) this).field_i + this.c((byte) 126);
        if (param0 != -84) {
            field_p = null;
        }
        if (!((((kh) this).field_i ^ -1L) <= (((kh) this).field_j ^ -1L))) {
            return (-((kh) this).field_i + ((kh) this).field_j) / 1000000L;
        }
        return 0L;
    }

    final static void a(byte param0, lb param1, int param2, um param3) {
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
