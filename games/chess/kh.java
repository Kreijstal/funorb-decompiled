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
        if (~((kh) this).field_j >= ~((kh) this).field_i) {
          var5 = 0;
          L0: while (true) {
            var5++;
            ((kh) this).field_j = ((kh) this).field_j + param0;
            stackOut_3_0 = ~var5;
            stackIn_4_0 = stackOut_3_0;
            L1: while (true) {
              L2: {
                if (stackIn_4_0 <= -11) {
                  break L2;
                } else {
                  if (~((kh) this).field_i < ~((kh) this).field_j) {
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
        RuntimeException var4_ref = null;
        int var5_int = 0;
        df var5 = null;
        int var6 = 0;
        byte[] var7 = null;
        int var8 = 0;
        byte[] var9 = null;
        byte[] stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var8 = Chess.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (0 >= param0) {
                  break L2;
                } else {
                  var9 = new byte[param1];
                  var4 = var9;
                  var5_int = 0;
                  L3: while (true) {
                    if (var5_int >= param1) {
                      if (var8 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    } else {
                      var9[var5_int] = param3[param0 + var5_int];
                      var5_int++;
                      if (var8 != 0) {
                        break L1;
                      } else {
                        continue L3;
                      }
                    }
                  }
                }
              }
              var4 = param3;
              break L1;
            }
            var6 = -88 / ((param2 - 55) / 51);
            var5 = new df();
            var5.a(94);
            var5.a((byte) -122, var4, (long)(8 * param1));
            var7 = new byte[64];
            var5.a(-115, 0, var7);
            stackOut_9_0 = (byte[]) var7;
            stackIn_10_0 = stackOut_9_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4_ref;
            stackOut_11_1 = new StringBuilder().append("kh.H(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
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
          throw fk.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0;
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
        Object var17 = null;
        ln var18 = null;
        ln var19 = null;
        int stackIn_10_0 = 0;
        r stackIn_16_0 = null;
        r stackIn_17_0 = null;
        r stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        r stackIn_95_0 = null;
        r stackIn_96_0 = null;
        r stackIn_97_0 = null;
        int stackIn_97_1 = 0;
        boolean stackIn_141_0 = false;
        int stackIn_149_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        r stackOut_15_0 = null;
        r stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        r stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        r stackOut_94_0 = null;
        r stackOut_96_0 = null;
        int stackOut_96_1 = 0;
        r stackOut_95_0 = null;
        int stackOut_95_1 = 0;
        boolean stackOut_140_0 = false;
        int stackOut_148_0 = 0;
        var16 = null;
        var17 = null;
        var11 = Chess.field_G;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  var12 = tk.field_h;
                  var1_ref = var12;
                  kh.c(1);
                  var2 = ((p) (Object) var1_ref).i(-99);
                  if (var2 == 0) {
                    break L3;
                  } else {
                    if (1 == var2) {
                      break L3;
                    } else {
                      if (var2 == 2) {
                        break L3;
                      } else {
                        if (var2 == 3) {
                          break L3;
                        } else {
                          if (var2 == 4) {
                            break L3;
                          } else {
                            L4: {
                              if (5 != var2) {
                                break L4;
                              } else {
                                L5: {
                                  var3_long = ((p) (Object) var1_ref).d((byte) -124);
                                  var5_ref_String = ((p) (Object) var1_ref).d(0);
                                  var6 = ((p) (Object) var1_ref).d(0);
                                  var7 = ((p) (Object) var1_ref).d(0);
                                  var8_ref_r = ug.a((byte) -104, var3_long);
                                  if (var6.equals((Object) (Object) "")) {
                                    stackOut_9_0 = 0;
                                    stackIn_10_0 = stackOut_9_0;
                                    break L5;
                                  } else {
                                    stackOut_8_0 = 1;
                                    stackIn_10_0 = stackOut_8_0;
                                    break L5;
                                  }
                                }
                                L6: {
                                  L7: {
                                    var9 = stackIn_10_0;
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
                                  var8_ref_r.field_Nb = ud.a(2) + -(long)((p) (Object) var1_ref).e((byte) -112);
                                  var8_ref_r.field_Pb = ((p) (Object) var1_ref).f(674914976);
                                  var10 = ((p) (Object) var1_ref).c((byte) 112);
                                  stackOut_15_0 = (r) var8_ref_r;
                                  stackIn_17_0 = stackOut_15_0;
                                  stackIn_16_0 = stackOut_15_0;
                                  if ((var10 & 1) == 0) {
                                    stackOut_17_0 = (r) (Object) stackIn_17_0;
                                    stackOut_17_1 = 0;
                                    stackIn_18_0 = stackOut_17_0;
                                    stackIn_18_1 = stackOut_17_1;
                                    break L8;
                                  } else {
                                    stackOut_16_0 = (r) (Object) stackIn_16_0;
                                    stackOut_16_1 = 1;
                                    stackIn_18_0 = stackOut_16_0;
                                    stackIn_18_1 = stackOut_16_1;
                                    break L8;
                                  }
                                }
                                stackIn_18_0.field_Hb = stackIn_18_1 != 0;
                                var8_ref_r.field_Jb = var10 >> 1;
                                var8_ref_r.field_Vb = ((p) (Object) var1_ref).i(-99);
                                var8_ref_r.field_Wb = ((p) (Object) var1_ref).i(-111);
                                ta.a(var8_ref_r, -65);
                                if (var11 == 0) {
                                  break L2;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            L9: {
                              if (var2 == 6) {
                                break L9;
                              } else {
                                L10: {
                                  if (var2 != 7) {
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
                                      var3 = ((p) (Object) var1_ref).f(674914976);
                                      var4_ref_ln = (ln) (Object) ae.field_f.a((long)var3, 2984);
                                      if (var4_ref_ln == null) {
                                        var4_ref_ln = new ln(qa.field_e);
                                        ae.field_f.a(true, (l) (Object) var4_ref_ln, (long)var3);
                                        break L15;
                                      } else {
                                        break L15;
                                      }
                                    }
                                    vl.a((p) (Object) var1_ref, var4_ref_ln, true, 100);
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
                                      var3 = ((p) (Object) var1_ref).f(674914960);
                                      var4 = ((p) (Object) var1_ref).i(-96);
                                      var15 = (ln) (Object) ae.field_f.a((long)var3, 3000);
                                      if (var15 != null) {
                                        L18: {
                                          L19: {
                                            if (0 == var4) {
                                              break L19;
                                            } else {
                                              var15.field_Hb = ig.field_g;
                                              var15.field_jc = var4;
                                              if (var11 == 0) {
                                                break L18;
                                              } else {
                                                break L19;
                                              }
                                            }
                                          }
                                          var15.c(-2177);
                                          break L18;
                                        }
                                        var15.d(-1);
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
                                  if (var2 != 10) {
                                    break L20;
                                  } else {
                                    var18 = (ln) (Object) nk.field_t.g(-18094);
                                    L21: while (true) {
                                      L22: {
                                        if (var18 == null) {
                                          break L22;
                                        } else {
                                          var18.c(-2193);
                                          var18.d(-1);
                                          var18 = (ln) (Object) nk.field_t.a((byte) -115);
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
                                  if (var2 == 11) {
                                    break L23;
                                  } else {
                                    if (var2 == 12) {
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
                                                if (var2 != 16) {
                                                  break L25;
                                                } else {
                                                  break L26;
                                                }
                                              }
                                            }
                                            L27: {
                                              var3_long = ((p) (Object) var1_ref).d((byte) -74);
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
                                                ta.a(var5_ref_r, -115);
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
                                                  if (var2 == 18) {
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
                                                            vl.a((p) (Object) var1_ref, pd.field_Rb, false, 126);
                                                            if (var11 == 0) {
                                                              break L2;
                                                            } else {
                                                              break L33;
                                                            }
                                                          }
                                                        }
                                                        L34: {
                                                          if (var2 != 21) {
                                                            break L34;
                                                          } else {
                                                            L35: {
                                                              L36: {
                                                                var3 = ((p) (Object) var1_ref).f(674914992);
                                                                if (var3 == 0) {
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
                                                          if (var2 != 22) {
                                                            break L37;
                                                          } else {
                                                            fm.field_W = ((p) (Object) var1_ref).f(674914976);
                                                            jf.field_b = ((p) (Object) var1_ref).c((byte) 75);
                                                            if (var11 == 0) {
                                                              break L2;
                                                            } else {
                                                              break L37;
                                                            }
                                                          }
                                                        }
                                                        L38: {
                                                          if (var2 != 23) {
                                                            break L38;
                                                          } else {
                                                            gb.field_t = ((p) (Object) var1_ref).d((byte) 116);
                                                            if (var11 == 0) {
                                                              break L2;
                                                            } else {
                                                              break L38;
                                                            }
                                                          }
                                                        }
                                                        fg.a((Throwable) null, (byte) -77, "L1: " + tm.b((byte) -123));
                                                        si.d(65296);
                                                        if (var11 == 0) {
                                                          break L2;
                                                        } else {
                                                          break L32;
                                                        }
                                                      }
                                                    }
                                                    L39: {
                                                      var3_long = ((p) (Object) var1_ref).d((byte) -60);
                                                      var5 = ((p) (Object) var1_ref).i(-143);
                                                      var6_ref = mi.a(134217727, var3_long);
                                                      if (var6_ref != null) {
                                                        L40: {
                                                          L41: {
                                                            if (var5 != 0) {
                                                              break L41;
                                                            } else {
                                                              var6_ref.c(-2177);
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
                                                  var3_long = ((p) (Object) var1_ref).d((byte) 116);
                                                  var5_ref_String = ((p) (Object) var1_ref).d(0);
                                                  var6 = ((p) (Object) var1_ref).d(0);
                                                  var7_ref = mi.a(134217711, var3_long);
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
                                                  var7_ref.field_Pb = ((p) (Object) var1_ref).f(674914992);
                                                  var8 = ((p) (Object) var1_ref).c((byte) -59);
                                                  var7_ref.field_Jb = var8 >> 1;
                                                  stackOut_94_0 = (r) var7_ref;
                                                  stackIn_96_0 = stackOut_94_0;
                                                  stackIn_95_0 = stackOut_94_0;
                                                  if (0 == (1 & var8)) {
                                                    stackOut_96_0 = (r) (Object) stackIn_96_0;
                                                    stackOut_96_1 = 0;
                                                    stackIn_97_0 = stackOut_96_0;
                                                    stackIn_97_1 = stackOut_96_1;
                                                    break L43;
                                                  } else {
                                                    stackOut_95_0 = (r) (Object) stackIn_95_0;
                                                    stackOut_95_1 = 1;
                                                    stackIn_97_0 = stackOut_95_0;
                                                    stackIn_97_1 = stackOut_95_1;
                                                    break L43;
                                                  }
                                                }
                                                stackIn_97_0.field_Hb = stackIn_97_1 != 0;
                                                var7_ref.field_Vb = ((p) (Object) var1_ref).i(-141);
                                                var7_ref.field_Wb = ((p) (Object) var1_ref).i(-106);
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
                                            var3_long = ((p) (Object) var1_ref).d((byte) -84);
                                            var5 = ((p) (Object) var1_ref).i(-125);
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
                                        var3 = ((p) (Object) var1_ref).f(674914976);
                                        var4 = ((p) (Object) var1_ref).i(-97);
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
                                  var3 = ((p) (Object) var1_ref).f(674914976);
                                  var19 = (ln) (Object) ae.field_f.a((long)var3, 3000);
                                  if (var19 == null) {
                                    break L50;
                                  } else {
                                    L51: {
                                      L52: {
                                        if (11 != var2) {
                                          break L52;
                                        } else {
                                          var19.field_dc = true;
                                          if (var11 == 0) {
                                            break L51;
                                          } else {
                                            break L52;
                                          }
                                        }
                                      }
                                      var19.field_Tb = true;
                                      break L51;
                                    }
                                    fh.a((byte) -124, var19);
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
                              var3_long = ((p) (Object) var1_ref).d((byte) -127);
                              var5 = ((p) (Object) var1_ref).i(-77);
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
                        var3_ref_r.d(-17);
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
                          stackOut_140_0 = var3_ref_r.field_ac;
                          stackIn_149_0 = stackOut_140_0 ? 1 : 0;
                          stackIn_141_0 = stackOut_140_0;
                          if (var11 != 0) {
                            break L61;
                          } else {
                            L63: {
                              L64: {
                                if (stackIn_141_0) {
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
                      stackOut_148_0 = ~var2;
                      stackIn_149_0 = stackOut_148_0;
                      break L61;
                    }
                    L66: {
                      if (stackIn_149_0 != -2) {
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
                        var3 = ((p) (Object) var1_ref).f(674914976);
                        pd.field_Rb = new ln(qa.field_e);
                        pd.field_Rb.a((long)var3, (byte) 71);
                        vl.a((p) (Object) var1_ref, pd.field_Rb, false, 120);
                        eg.field_e = 0L;
                        break L67;
                      }
                    }
                    L68: {
                      L69: {
                        L70: {
                          if (var2 == 2) {
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
                      if (var2 != 3) {
                        break L71;
                      } else {
                        ud.field_b = true;
                        var3 = 0;
                        L72: while (true) {
                          L73: {
                            L74: {
                              if (~g.field_f.length >= ~var3) {
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
                            qd.field_u = ((p) (Object) var1_ref).i(-106);
                            p.field_n = ((p) (Object) var1_ref).i(-107);
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var1, "kh.B(" + 1 + 41);
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
          var6 = 59;
          var2 = System.nanoTime();
          var4 = -((kh) this).field_h + var2;
          ((kh) this).field_h = var2;
          if (var4 <= -5000000000L) {
            break L0;
          } else {
            if (var4 >= 5000000000L) {
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
            if (~((kh) this).field_j < ~((kh) this).field_i) {
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
        if (!(~((kh) this).field_i <= ~((kh) this).field_j)) {
            return (-((kh) this).field_i + ((kh) this).field_j) / 1000000L;
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
            throw fk.a((Throwable) (Object) runtimeException, "kh.E(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    public static void b(int param0) {
        field_k = null;
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
