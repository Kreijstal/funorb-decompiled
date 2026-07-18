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
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        var6 = Chess.field_G;
        try {
          L0: {
            var4_int = 108 % ((param1 - 64) / 54);
            if (~((kh) this).field_j < ~((kh) this).field_i) {
              ((kh) this).field_h = ((kh) this).field_h + (-((kh) this).field_i + ((kh) this).field_j);
              ((kh) this).field_i = ((kh) this).field_i + (-((kh) this).field_i + ((kh) this).field_j);
              ((kh) this).field_j = ((kh) this).field_j + param0;
              stackOut_12_0 = 1;
              stackIn_13_0 = stackOut_12_0;
              break L0;
            } else {
              var5 = 0;
              L1: while (true) {
                var5++;
                ((kh) this).field_j = ((kh) this).field_j + param0;
                stackOut_3_0 = ~var5;
                stackIn_4_0 = stackOut_3_0;
                L2: while (true) {
                  L3: {
                    if (stackIn_4_0 <= -11) {
                      break L3;
                    } else {
                      if (~((kh) this).field_i < ~((kh) this).field_j) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackOut_6_0 = (((kh) this).field_j < ((kh) this).field_i ? -1 : (((kh) this).field_j == ((kh) this).field_i ? 0 : 1));
                  stackIn_4_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (var6 != 0) {
                    continue L2;
                  } else {
                    L4: {
                      if (stackIn_7_0 >= 0) {
                        break L4;
                      } else {
                        ((kh) this).field_j = ((kh) this).field_i;
                        break L4;
                      }
                    }
                    stackOut_10_0 = var5;
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var4, "kh.D(" + param0 + ',' + param1 + ')');
        }
        return stackIn_13_0;
    }

    final static byte[] a(int param0, int param1, byte param2, byte[] param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5_int = 0;
        df var5 = null;
        int var6 = 0;
        byte[] var7 = null;
        int var8 = 0;
        byte[] stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var8 = Chess.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (0 >= param0) {
                  break L2;
                } else {
                  var4 = new byte[param1];
                  var5_int = 0;
                  L3: while (true) {
                    L4: {
                      if (var5_int >= param1) {
                        break L4;
                      } else {
                        var4[var5_int] = param3[param0 + var5_int];
                        var5_int++;
                        if (var8 != 0) {
                          break L1;
                        } else {
                          if (var8 == 0) {
                            continue L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    if (var8 == 0) {
                      break L1;
                    } else {
                      break L2;
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
            stackOut_10_0 = (byte[]) var7;
            stackIn_11_0 = stackOut_10_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4_ref;
            stackOut_12_1 = new StringBuilder().append("kh.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L5;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_11_0;
    }

    final static void c(int param0) {
        nk var1 = null;
        int var2 = 0;
        r var3_ref_r = null;
        int var3 = 0;
        long var3_long = 0L;
        ln var3_ref_ln = null;
        ln var4 = null;
        int var4_int = 0;
        int var5 = 0;
        String var5_ref_String = null;
        ln var5_ref_ln = null;
        r var5_ref_r = null;
        r var6 = null;
        String var6_ref = null;
        ln var6_ref2 = null;
        String var7 = null;
        r var7_ref = null;
        r var8_ref_r = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_16_0 = 0;
        r stackIn_23_0 = null;
        r stackIn_24_0 = null;
        r stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        r stackIn_121_0 = null;
        r stackIn_122_0 = null;
        r stackIn_123_0 = null;
        int stackIn_123_1 = 0;
        boolean stackIn_169_0 = false;
        boolean stackIn_170_0 = false;
        int stackIn_180_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        r stackOut_22_0 = null;
        r stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        r stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        r stackOut_120_0 = null;
        r stackOut_122_0 = null;
        int stackOut_122_1 = 0;
        r stackOut_121_0 = null;
        int stackOut_121_1 = 0;
        boolean stackOut_168_0 = false;
        boolean stackOut_169_0 = false;
        int stackOut_179_0 = 0;
        L0: {
          var11 = Chess.field_G;
          var1 = tk.field_h;
          if (param0 == 17) {
            break L0;
          } else {
            kh.c(1);
            break L0;
          }
        }
        L1: {
          L2: {
            var2 = ((p) (Object) var1).i(param0 ^ -100);
            if (var2 == 0) {
              break L2;
            } else {
              if (1 == var2) {
                break L2;
              } else {
                if (var2 == 2) {
                  break L2;
                } else {
                  if (var2 == 3) {
                    break L2;
                  } else {
                    if (var2 == 4) {
                      break L2;
                    } else {
                      L3: {
                        if (5 != var2) {
                          break L3;
                        } else {
                          L4: {
                            var3_long = ((p) (Object) var1).d((byte) -124);
                            var5_ref_String = ((p) (Object) var1).d(0);
                            var6_ref = ((p) (Object) var1).d(0);
                            var7 = ((p) (Object) var1).d(0);
                            var8_ref_r = ug.a((byte) -104, var3_long);
                            if (var6_ref.equals((Object) (Object) "")) {
                              stackOut_15_0 = 0;
                              stackIn_16_0 = stackOut_15_0;
                              break L4;
                            } else {
                              stackOut_14_0 = 1;
                              stackIn_16_0 = stackOut_14_0;
                              break L4;
                            }
                          }
                          L5: {
                            L6: {
                              var9 = stackIn_16_0;
                              if (null == var8_ref_r) {
                                break L6;
                              } else {
                                if (var9 == 0) {
                                  break L5;
                                } else {
                                  var8_ref_r.a(1, var7, var5_ref_String);
                                  if (var11 == 0) {
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            var8_ref_r = new r(var5_ref_String, var7, var3_long);
                            d.field_Mb.a(true, (l) (Object) var8_ref_r, var3_long);
                            break L5;
                          }
                          L7: {
                            var8_ref_r.field_Nb = ud.a(2) + -(long)((p) (Object) var1).e((byte) -112);
                            var8_ref_r.field_Pb = ((p) (Object) var1).f(674914976);
                            var10 = ((p) (Object) var1).c((byte) 112);
                            stackOut_22_0 = (r) var8_ref_r;
                            stackIn_24_0 = stackOut_22_0;
                            stackIn_23_0 = stackOut_22_0;
                            if ((var10 & 1) == 0) {
                              stackOut_24_0 = (r) (Object) stackIn_24_0;
                              stackOut_24_1 = 0;
                              stackIn_25_0 = stackOut_24_0;
                              stackIn_25_1 = stackOut_24_1;
                              break L7;
                            } else {
                              stackOut_23_0 = (r) (Object) stackIn_23_0;
                              stackOut_23_1 = 1;
                              stackIn_25_0 = stackOut_23_0;
                              stackIn_25_1 = stackOut_23_1;
                              break L7;
                            }
                          }
                          stackIn_25_0.field_Hb = stackIn_25_1 != 0;
                          var8_ref_r.field_Jb = var10 >> 1028370977;
                          var8_ref_r.field_Vb = ((p) (Object) var1).i(-99);
                          var8_ref_r.field_Wb = ((p) (Object) var1).i(param0 + -112);
                          ta.a(var8_ref_r, param0 ^ -66);
                          if (var11 == 0) {
                            break L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L8: {
                        if (var2 == 6) {
                          break L8;
                        } else {
                          L9: {
                            if (var2 != 7) {
                              break L9;
                            } else {
                              var3_ref_r = (r) (Object) bb.field_d.g(-18110);
                              L10: while (true) {
                                L11: {
                                  L12: {
                                    if (null == var3_ref_r) {
                                      break L12;
                                    } else {
                                      var3_ref_r.c(-2193);
                                      var3_ref_r.d(-1);
                                      var3_ref_r = (r) (Object) bb.field_d.a((byte) -122);
                                      if (var11 != 0) {
                                        break L11;
                                      } else {
                                        if (var11 == 0) {
                                          continue L10;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                  }
                                  cb.field_f = 0;
                                  break L11;
                                }
                                if (var11 == 0) {
                                  break L1;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                          L13: {
                            if (var2 != 8) {
                              break L13;
                            } else {
                              L14: {
                                var3 = ((p) (Object) var1).f(674914976);
                                var4 = (ln) (Object) ae.field_f.a((long)var3, param0 + 2983);
                                if (var4 == null) {
                                  var4 = new ln(qa.field_e);
                                  ae.field_f.a(true, (l) (Object) var4, (long)var3);
                                  break L14;
                                } else {
                                  break L14;
                                }
                              }
                              vl.a((p) (Object) var1, var4, true, param0 ^ 101);
                              fh.a((byte) -119, var4);
                              if (var11 == 0) {
                                break L1;
                              } else {
                                break L13;
                              }
                            }
                          }
                          L15: {
                            if (var2 != 9) {
                              break L15;
                            } else {
                              L16: {
                                var3 = ((p) (Object) var1).f(param0 + 674914959);
                                var4_int = ((p) (Object) var1).i(-96);
                                var5_ref_ln = (ln) (Object) ae.field_f.a((long)var3, 3000);
                                if (null != var5_ref_ln) {
                                  L17: {
                                    L18: {
                                      if (0 == var4_int) {
                                        break L18;
                                      } else {
                                        var5_ref_ln.field_Hb = ig.field_g;
                                        var5_ref_ln.field_jc = var4_int;
                                        if (var11 == 0) {
                                          break L17;
                                        } else {
                                          break L18;
                                        }
                                      }
                                    }
                                    var5_ref_ln.c(param0 ^ -2178);
                                    break L17;
                                  }
                                  var5_ref_ln.d(-1);
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                              if (var11 == 0) {
                                break L1;
                              } else {
                                break L15;
                              }
                            }
                          }
                          L19: {
                            if (var2 != 10) {
                              break L19;
                            } else {
                              var3_ref_ln = (ln) (Object) nk.field_t.g(param0 ^ -18093);
                              L20: while (true) {
                                L21: {
                                  if (var3_ref_ln == null) {
                                    break L21;
                                  } else {
                                    var3_ref_ln.c(-2193);
                                    var3_ref_ln.d(-1);
                                    var3_ref_ln = (ln) (Object) nk.field_t.a((byte) -115);
                                    if (var11 != 0) {
                                      break L1;
                                    } else {
                                      if (var11 == 0) {
                                        continue L20;
                                      } else {
                                        break L21;
                                      }
                                    }
                                  }
                                }
                                if (var11 == 0) {
                                  break L1;
                                } else {
                                  break L19;
                                }
                              }
                            }
                          }
                          L22: {
                            if (var2 == 11) {
                              break L22;
                            } else {
                              if (var2 == 12) {
                                break L22;
                              } else {
                                L23: {
                                  if (var2 == 13) {
                                    break L23;
                                  } else {
                                    L24: {
                                      L25: {
                                        if (var2 == 14) {
                                          break L25;
                                        } else {
                                          if (var2 != 16) {
                                            break L24;
                                          } else {
                                            break L25;
                                          }
                                        }
                                      }
                                      L26: {
                                        var3_long = ((p) (Object) var1).d((byte) -74);
                                        var5_ref_r = ug.a((byte) -107, var3_long);
                                        if (var5_ref_r == null) {
                                          break L26;
                                        } else {
                                          L27: {
                                            L28: {
                                              if (var2 != 14) {
                                                break L28;
                                              } else {
                                                var5_ref_r.field_ac = true;
                                                if (var11 == 0) {
                                                  break L27;
                                                } else {
                                                  break L28;
                                                }
                                              }
                                            }
                                            if (var5_ref_r.field_Qb) {
                                              break L27;
                                            } else {
                                              var5_ref_r.field_Qb = true;
                                              cb.field_f = cb.field_f + 1;
                                              break L27;
                                            }
                                          }
                                          ta.a(var5_ref_r, param0 ^ -116);
                                          break L26;
                                        }
                                      }
                                      if (var11 == 0) {
                                        break L1;
                                      } else {
                                        break L24;
                                      }
                                    }
                                    L29: {
                                      if (15 == var2) {
                                        break L29;
                                      } else {
                                        if (var2 == 17) {
                                          break L29;
                                        } else {
                                          L30: {
                                            if (var2 == 18) {
                                              break L30;
                                            } else {
                                              L31: {
                                                if (var2 == 19) {
                                                  break L31;
                                                } else {
                                                  L32: {
                                                    if (var2 != 20) {
                                                      break L32;
                                                    } else {
                                                      vl.a((p) (Object) var1, pd.field_Rb, false, param0 ^ 127);
                                                      if (var11 == 0) {
                                                        break L1;
                                                      } else {
                                                        break L32;
                                                      }
                                                    }
                                                  }
                                                  L33: {
                                                    if (var2 != 21) {
                                                      break L33;
                                                    } else {
                                                      L34: {
                                                        L35: {
                                                          var3 = ((p) (Object) var1).f(param0 ^ 674914993);
                                                          if (var3 == 0) {
                                                            break L35;
                                                          } else {
                                                            eg.field_e = (long)var3 + ud.a(2);
                                                            if (var11 == 0) {
                                                              break L34;
                                                            } else {
                                                              break L35;
                                                            }
                                                          }
                                                        }
                                                        eg.field_e = 0L;
                                                        break L34;
                                                      }
                                                      if (var11 == 0) {
                                                        break L1;
                                                      } else {
                                                        break L33;
                                                      }
                                                    }
                                                  }
                                                  L36: {
                                                    if (var2 != 22) {
                                                      break L36;
                                                    } else {
                                                      fm.field_W = ((p) (Object) var1).f(674914976);
                                                      jf.field_b = ((p) (Object) var1).c((byte) 75);
                                                      if (var11 == 0) {
                                                        break L1;
                                                      } else {
                                                        break L36;
                                                      }
                                                    }
                                                  }
                                                  L37: {
                                                    if (var2 != 23) {
                                                      break L37;
                                                    } else {
                                                      gb.field_t = ((p) (Object) var1).d((byte) 116);
                                                      if (var11 == 0) {
                                                        break L1;
                                                      } else {
                                                        break L37;
                                                      }
                                                    }
                                                  }
                                                  fg.a((Throwable) null, (byte) -77, "L1: " + tm.b((byte) -123));
                                                  si.d(param0 ^ 65297);
                                                  if (var11 == 0) {
                                                    break L1;
                                                  } else {
                                                    break L31;
                                                  }
                                                }
                                              }
                                              L38: {
                                                var3_long = ((p) (Object) var1).d((byte) -60);
                                                var5 = ((p) (Object) var1).i(param0 + -144);
                                                var6 = mi.a(134217727, var3_long);
                                                if (null != var6) {
                                                  L39: {
                                                    L40: {
                                                      if (var5 != 0) {
                                                        break L40;
                                                      } else {
                                                        var6.c(param0 ^ -2178);
                                                        if (var11 == 0) {
                                                          break L39;
                                                        } else {
                                                          break L40;
                                                        }
                                                      }
                                                    }
                                                    var6.field_Mb = var5;
                                                    var6.field_Sb = ig.field_g;
                                                    break L39;
                                                  }
                                                  var6.d(-1);
                                                  pd.field_Rb.field_Xb = pd.field_Rb.field_Xb - 1;
                                                  break L38;
                                                } else {
                                                  break L38;
                                                }
                                              }
                                              if (var11 == 0) {
                                                break L1;
                                              } else {
                                                break L30;
                                              }
                                            }
                                          }
                                          L41: {
                                            var3_long = ((p) (Object) var1).d((byte) 116);
                                            var5_ref_String = ((p) (Object) var1).d(0);
                                            var6_ref = ((p) (Object) var1).d(0);
                                            var7_ref = mi.a(param0 ^ 134217710, var3_long);
                                            if (var7_ref != null) {
                                              break L41;
                                            } else {
                                              var7_ref = new r(var5_ref_String, var6_ref, var3_long);
                                              cm.field_v.a(true, (l) (Object) var7_ref, var3_long);
                                              pd.field_Rb.field_Xb = pd.field_Rb.field_Xb + 1;
                                              break L41;
                                            }
                                          }
                                          L42: {
                                            var7_ref.field_Pb = ((p) (Object) var1).f(param0 ^ 674914993);
                                            var8 = ((p) (Object) var1).c((byte) -59);
                                            var7_ref.field_Jb = var8 >> 1772151457;
                                            stackOut_120_0 = (r) var7_ref;
                                            stackIn_122_0 = stackOut_120_0;
                                            stackIn_121_0 = stackOut_120_0;
                                            if (0 == (1 & var8)) {
                                              stackOut_122_0 = (r) (Object) stackIn_122_0;
                                              stackOut_122_1 = 0;
                                              stackIn_123_0 = stackOut_122_0;
                                              stackIn_123_1 = stackOut_122_1;
                                              break L42;
                                            } else {
                                              stackOut_121_0 = (r) (Object) stackIn_121_0;
                                              stackOut_121_1 = 1;
                                              stackIn_123_0 = stackOut_121_0;
                                              stackIn_123_1 = stackOut_121_1;
                                              break L42;
                                            }
                                          }
                                          stackIn_123_0.field_Hb = stackIn_123_1 != 0;
                                          var7_ref.field_Vb = ((p) (Object) var1).i(param0 + -142);
                                          var7_ref.field_Wb = ((p) (Object) var1).i(-106);
                                          pd.field_Sb.a((o) (Object) var7_ref, (byte) 109);
                                          if (var11 == 0) {
                                            break L1;
                                          } else {
                                            break L29;
                                          }
                                        }
                                      }
                                    }
                                    L43: {
                                      var3_long = ((p) (Object) var1).d((byte) -84);
                                      var5 = ((p) (Object) var1).i(-125);
                                      var6 = ug.a((byte) -87, var3_long);
                                      if (null != var6) {
                                        L44: {
                                          L45: {
                                            if (15 == var2) {
                                              break L45;
                                            } else {
                                              if (var6.field_Qb) {
                                                cb.field_f = cb.field_f - 1;
                                                var6.field_Qb = false;
                                                if (var11 == 0) {
                                                  break L44;
                                                } else {
                                                  break L45;
                                                }
                                              } else {
                                                break L44;
                                              }
                                            }
                                          }
                                          var6.field_ac = false;
                                          break L44;
                                        }
                                        L46: {
                                          if (var5 == 0) {
                                            break L46;
                                          } else {
                                            var6.field_Mb = var5;
                                            var6.field_Sb = ig.field_g;
                                            break L46;
                                          }
                                        }
                                        ta.a(var6, -122);
                                        break L43;
                                      } else {
                                        break L43;
                                      }
                                    }
                                    if (var11 == 0) {
                                      break L1;
                                    } else {
                                      break L23;
                                    }
                                  }
                                }
                                L47: {
                                  var3 = ((p) (Object) var1).f(674914976);
                                  var4_int = ((p) (Object) var1).i(-97);
                                  var5_ref_ln = (ln) (Object) ae.field_f.a((long)var3, 3000);
                                  if (var5_ref_ln != null) {
                                    L48: {
                                      var6_ref2 = var5_ref_ln;
                                      var5_ref_ln.field_Tb = false;
                                      var6_ref2.field_dc = false;
                                      if (var4_int != 0) {
                                        var5_ref_ln.field_jc = var4_int;
                                        var5_ref_ln.field_Hb = ig.field_g;
                                        break L48;
                                      } else {
                                        break L48;
                                      }
                                    }
                                    fh.a((byte) -127, var5_ref_ln);
                                    break L47;
                                  } else {
                                    break L47;
                                  }
                                }
                                if (var11 == 0) {
                                  break L1;
                                } else {
                                  break L22;
                                }
                              }
                            }
                          }
                          L49: {
                            var3 = ((p) (Object) var1).f(674914976);
                            var4 = (ln) (Object) ae.field_f.a((long)var3, 3000);
                            if (null == var4) {
                              break L49;
                            } else {
                              L50: {
                                L51: {
                                  if (11 != var2) {
                                    break L51;
                                  } else {
                                    var4.field_dc = true;
                                    if (var11 == 0) {
                                      break L50;
                                    } else {
                                      break L51;
                                    }
                                  }
                                }
                                var4.field_Tb = true;
                                break L50;
                              }
                              fh.a((byte) -124, var4);
                              break L49;
                            }
                          }
                          if (var11 == 0) {
                            break L1;
                          } else {
                            break L8;
                          }
                        }
                      }
                      L52: {
                        var3_long = ((p) (Object) var1).d((byte) -127);
                        var5 = ((p) (Object) var1).i(-77);
                        var6 = ug.a((byte) -92, var3_long);
                        if (null == var6) {
                          break L52;
                        } else {
                          L53: {
                            if (!var6.field_Qb) {
                              break L53;
                            } else {
                              cb.field_f = cb.field_f - 1;
                              var6.field_Qb = false;
                              break L53;
                            }
                          }
                          L54: {
                            L55: {
                              if (0 == var5) {
                                break L55;
                              } else {
                                var6.field_Mb = var5;
                                var6.field_Sb = ig.field_g;
                                if (var11 == 0) {
                                  break L54;
                                } else {
                                  break L55;
                                }
                              }
                            }
                            var6.c(-2193);
                            break L54;
                          }
                          var6.d(-1);
                          break L52;
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
          }
          var3_ref_r = (r) (Object) pd.field_Sb.g(-18110);
          L56: while (true) {
            L57: {
              L58: {
                if (var3_ref_r == null) {
                  break L58;
                } else {
                  var3_ref_r.c(-2193);
                  var3_ref_r.d(param0 ^ -18);
                  var3_ref_r = (r) (Object) pd.field_Sb.a((byte) -107);
                  if (var11 != 0) {
                    break L57;
                  } else {
                    if (var11 == 0) {
                      continue L56;
                    } else {
                      break L58;
                    }
                  }
                }
              }
              var3_ref_r = (r) (Object) d.field_Mb.a(false);
              break L57;
            }
            L59: while (true) {
              L60: {
                L61: {
                  if (null == var3_ref_r) {
                    break L61;
                  } else {
                    stackOut_168_0 = var3_ref_r.field_ac;
                    stackIn_180_0 = stackOut_168_0 ? 1 : 0;
                    stackIn_169_0 = stackOut_168_0;
                    if (var11 != 0) {
                      break L60;
                    } else {
                      stackOut_169_0 = stackIn_169_0;
                      stackIn_170_0 = stackOut_169_0;
                      L62: {
                        L63: {
                          if (stackIn_170_0) {
                            break L63;
                          } else {
                            if (var3_ref_r.field_Qb) {
                              break L63;
                            } else {
                              break L62;
                            }
                          }
                        }
                        L64: {
                          var3_ref_r.field_ac = false;
                          if (!var3_ref_r.field_Qb) {
                            break L64;
                          } else {
                            var3_ref_r.field_Qb = false;
                            cb.field_f = cb.field_f - 1;
                            break L64;
                          }
                        }
                        ta.a(var3_ref_r, -98);
                        break L62;
                      }
                      var3_ref_r = (r) (Object) d.field_Mb.a(0);
                      if (var11 == 0) {
                        continue L59;
                      } else {
                        break L61;
                      }
                    }
                  }
                }
                stackOut_179_0 = ~var2;
                stackIn_180_0 = stackOut_179_0;
                break L60;
              }
              L65: {
                if (stackIn_180_0 != -2) {
                  break L65;
                } else {
                  if (pd.field_Rb == null) {
                    break L65;
                  } else {
                    i.field_c = pd.field_Rb.field_Gb;
                    break L65;
                  }
                }
              }
              L66: {
                if (4 != var2) {
                  pd.field_Rb = null;
                  break L66;
                } else {
                  var3 = ((p) (Object) var1).f(674914976);
                  pd.field_Rb = new ln(qa.field_e);
                  pd.field_Rb.a((long)var3, (byte) 71);
                  vl.a((p) (Object) var1, pd.field_Rb, false, 120);
                  eg.field_e = 0L;
                  break L66;
                }
              }
              L67: {
                L68: {
                  L69: {
                    if (var2 == 2) {
                      break L69;
                    } else {
                      if (3 != var2) {
                        break L68;
                      } else {
                        break L69;
                      }
                    }
                  }
                  if (null != ib.field_d) {
                    break L67;
                  } else {
                    ib.field_d = new ln(qa.field_e);
                    if (var11 == 0) {
                      break L67;
                    } else {
                      break L68;
                    }
                  }
                }
                ib.field_d = null;
                break L67;
              }
              L70: {
                if (var2 != 3) {
                  break L70;
                } else {
                  ud.field_b = true;
                  var3 = 0;
                  L71: while (true) {
                    L72: {
                      L73: {
                        if (~g.field_f.length >= ~var3) {
                          break L73;
                        } else {
                          g.field_f[var3] = ((p) (Object) var1).g(0);
                          var3++;
                          if (var11 != 0) {
                            break L72;
                          } else {
                            if (var11 == 0) {
                              continue L71;
                            } else {
                              break L73;
                            }
                          }
                        }
                      }
                      qd.field_u = ((p) (Object) var1).i(param0 ^ -105);
                      p.field_n = ((p) (Object) var1).i(-107);
                      break L72;
                    }
                    var3 = 0;
                    L74: while (true) {
                      L75: {
                        if (var3 >= fe.field_d.length) {
                          break L75;
                        } else {
                          fe.field_d[var3] = ((p) (Object) var1).g(0);
                          var3++;
                          if (var11 != 0) {
                            break L1;
                          } else {
                            if (var11 == 0) {
                              continue L74;
                            } else {
                              break L75;
                            }
                          }
                        }
                      }
                      if (var11 == 0) {
                        break L1;
                      } else {
                        break L70;
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
    }

    private final long c(byte param0) {
        long var2_long = 0L;
        RuntimeException var2 = null;
        long var4 = 0L;
        int var6 = 0;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        long stackIn_13_0 = 0L;
        long stackIn_15_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        long stackOut_12_0 = 0L;
        long stackOut_14_0 = 0L;
        var10 = Chess.field_G;
        try {
          L0: {
            L1: {
              var6 = -119 / ((21 - param0) / 41);
              var2_long = System.nanoTime();
              var4 = -((kh) this).field_h + var2_long;
              ((kh) this).field_h = var2_long;
              if (var4 <= -5000000000L) {
                break L1;
              } else {
                if (var4 >= 5000000000L) {
                  break L1;
                } else {
                  ((kh) this).field_q[((kh) this).field_n] = var4;
                  ((kh) this).field_n = (((kh) this).field_n - -1) % 10;
                  if (1 <= ((kh) this).field_g) {
                    break L1;
                  } else {
                    ((kh) this).field_g = ((kh) this).field_g + 1;
                    break L1;
                  }
                }
              }
            }
            var7 = 0L;
            var9 = 1;
            L2: while (true) {
              L3: {
                L4: {
                  if (~((kh) this).field_g > ~var9) {
                    break L4;
                  } else {
                    stackOut_12_0 = var7 + ((kh) this).field_q[(10 + (((kh) this).field_n - var9)) % 10];
                    stackIn_15_0 = stackOut_12_0;
                    stackIn_13_0 = stackOut_12_0;
                    if (var10 != 0) {
                      break L3;
                    } else {
                      var7 = stackIn_13_0;
                      var9++;
                      if (var10 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_14_0 = var7 / (long)((kh) this).field_g;
                stackIn_15_0 = stackOut_14_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var2, "kh.F(" + param0 + ')');
        }
        return stackIn_15_0;
    }

    final void b(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 40) {
              L1: {
                ((kh) this).field_h = 0L;
                if (~((kh) this).field_j < ~((kh) this).field_i) {
                  ((kh) this).field_i = ((kh) this).field_i + (-((kh) this).field_i + ((kh) this).field_j);
                  break L1;
                } else {
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var2, "kh.C(" + param0 + ')');
        }
    }

    final long a(byte param0) {
        RuntimeException var2 = null;
        long stackIn_7_0 = 0L;
        long stackIn_9_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        long stackOut_6_0 = 0L;
        long stackOut_8_0 = 0L;
        try {
          L0: {
            L1: {
              ((kh) this).field_i = ((kh) this).field_i + this.c((byte) 126);
              if (param0 == -84) {
                break L1;
              } else {
                field_p = null;
                break L1;
              }
            }
            if (~((kh) this).field_i > ~((kh) this).field_j) {
              stackOut_6_0 = (-((kh) this).field_i + ((kh) this).field_j) / 1000000L;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              stackOut_8_0 = 0L;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var2, "kh.G(" + param0 + ')');
        }
        return stackIn_9_0;
    }

    final static void a(byte param0, lb param1, int param2, um param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              eg.field_i = param2 * qd.d(-31137) / 1000;
              fd.a((byte) -103, param3);
              aa.a(-8428, param3);
              cd.a((byte) 127, param3);
              tl.a(false);
              ie.b(540);
              if (param0 <= -121) {
                break L1;
              } else {
                kh.b(115);
                break L1;
              }
            }
            sl.field_a = 0 - eg.field_i;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("kh.E(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    public static void b(int param0) {
        field_k = null;
        if (param0 != 64) {
            return;
        }
        try {
            field_l = null;
            field_m = null;
            field_p = null;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "kh.A(" + param0 + ')');
        }
    }

    kh() {
        ((kh) this).field_j = 0L;
        ((kh) this).field_h = 0L;
        ((kh) this).field_g = 1;
        ((kh) this).field_i = 0L;
        ((kh) this).field_n = 0;
        ((kh) this).field_q = new long[10];
        try {
            ((kh) this).field_i = System.nanoTime();
            ((kh) this).field_j = System.nanoTime();
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "kh.<init>()");
        }
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
