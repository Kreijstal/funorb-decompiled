/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eq {
    static String field_b;
    private int field_c;
    private byte[] field_h;
    private long[] field_k;
    private long[] field_l;
    private long[] field_e;
    private long[] field_f;
    private byte[] field_d;
    private int field_j;
    private long[] field_a;
    static String field_i;
    static wh field_g;
    static mk field_m;

    final static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              cr.f((byte) -45);
              if (param0 == 7) {
                break L1;
              } else {
                field_g = null;
                break L1;
              }
            }
            lq.d(125);
            no.field_p = null;
            rd.a(param0 + -8);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var1, "eq.F(" + param0 + ')');
        }
    }

    final void b(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (32 <= var2_int) {
                    break L3;
                  } else {
                    ((eq) this).field_d[var2_int] = (byte) 0;
                    var2_int++;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L4: {
                  if (param0 == 99) {
                    break L4;
                  } else {
                    ((eq) this).a((byte[]) null, -112, 22L);
                    break L4;
                  }
                }
                ((eq) this).field_j = 0;
                ((eq) this).field_h[0] = (byte) 0;
                ((eq) this).field_c = 0;
                break L2;
              }
              var2_int = 0;
              L5: while (true) {
                L6: {
                  L7: {
                    if (8 <= var2_int) {
                      break L7;
                    } else {
                      ((eq) this).field_a[var2_int] = 0L;
                      var2_int++;
                      if (var3 != 0) {
                        break L6;
                      } else {
                        if (var3 == 0) {
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
          throw qb.a((Throwable) (Object) runtimeException, "eq.C(" + param0 + ')');
        }
    }

    final static String c(byte param0) {
        RuntimeException var1 = null;
        String var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_10_0 = null;
        String stackIn_24_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_9_0 = null;
        String stackOut_23_0 = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 < -58) {
                break L1;
              } else {
                String discarded$1 = eq.c((byte) -29);
                break L1;
              }
            }
            L2: {
              L3: {
                var1_ref = "(" + r.field_z + " " + we.field_a + " " + mh.field_gb + ") " + si.field_a;
                if (ga.field_j > 0) {
                  var1_ref = var1_ref + ":";
                  var2 = 0;
                  L4: while (true) {
                    if (~var2 <= ~ga.field_j) {
                      break L3;
                    } else {
                      stackOut_9_0 = var1_ref + ' ';
                      stackIn_24_0 = stackOut_9_0;
                      stackIn_10_0 = stackOut_9_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        L5: {
                          L6: {
                            var1_ref = stackIn_10_0;
                            var3 = 255 & jl.field_e.field_k[var2];
                            var4 = var3 >> -563608220;
                            var3 = var3 & 15;
                            if (var4 >= 10) {
                              break L6;
                            } else {
                              var4 += 48;
                              if (var5 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var4 += 55;
                          break L5;
                        }
                        L7: {
                          L8: {
                            if (10 > var3) {
                              break L8;
                            } else {
                              var3 += 55;
                              if (var5 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          var3 += 48;
                          break L7;
                        }
                        var1_ref = var1_ref + (char)var4;
                        var1_ref = var1_ref + (char)var3;
                        var2++;
                        if (var5 == 0) {
                          continue L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
              stackOut_23_0 = (String) var1_ref;
              stackIn_24_0 = stackOut_23_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var1, "eq.B(" + param0 + ')');
        }
        return stackIn_24_0;
    }

    private final void a(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_62_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_61_0 = 0;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = 0;
              var3 = 0;
              if (param0 > 19) {
                break L1;
              } else {
                ((eq) this).field_l = null;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if (var2_int >= 8) {
                    break L4;
                  } else {
                    ((eq) this).field_e[var2_int] = qf.a(qf.a(qf.a(qf.a(qf.a(ch.a(255L, (long)((eq) this).field_h[var3 + 3]) << -1263331040, qf.a(ch.a((long)((eq) this).field_h[2 + var3], 255L) << 1135616744, qf.a(ch.a((long)((eq) this).field_h[1 + var3], 255L) << -1839878480, (long)((eq) this).field_h[var3] << 1037214200))), ch.a((long)((eq) this).field_h[var3 - -4], 255L) << 54275672), ch.a((long)((eq) this).field_h[var3 - -5], 255L) << -1424066864), ch.a(65280L, (long)((eq) this).field_h[6 + var3] << 1385078664)), ch.a((long)((eq) this).field_h[var3 + 7], 255L));
                    var2_int++;
                    var3 += 8;
                    if (var6 != 0) {
                      break L3;
                    } else {
                      if (var6 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var2_int = 0;
                break L3;
              }
              L5: while (true) {
                L6: {
                  L7: {
                    if (var2_int >= 8) {
                      break L7;
                    } else {
                      ((eq) this).field_f[var2_int] = ((eq) this).field_a[var2_int];
                      ((eq) this).field_k[var2_int] = qf.a(((eq) this).field_e[var2_int], ((eq) this).field_a[var2_int]);
                      var2_int++;
                      if (var6 != 0) {
                        break L6;
                      } else {
                        if (var6 == 0) {
                          continue L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  var2_int = 1;
                  break L6;
                }
                L8: while (true) {
                  L9: {
                    L10: {
                      if (var2_int > 10) {
                        break L10;
                      } else {
                        stackOut_19_0 = 0;
                        stackIn_62_0 = stackOut_19_0;
                        stackIn_20_0 = stackOut_19_0;
                        if (var6 != 0) {
                          break L9;
                        } else {
                          stackOut_20_0 = stackIn_20_0;
                          stackIn_22_0 = stackOut_20_0;
                          var3 = stackIn_22_0;
                          L11: while (true) {
                            L12: {
                              L13: {
                                if (var3 >= 8) {
                                  break L13;
                                } else {
                                  ((eq) this).field_l[var3] = 0L;
                                  var4 = 0;
                                  stackOut_24_0 = 56;
                                  stackIn_34_0 = stackOut_24_0;
                                  stackIn_25_0 = stackOut_24_0;
                                  if (var6 != 0) {
                                    break L12;
                                  } else {
                                    var5 = stackIn_25_0;
                                    L14: while (true) {
                                      L15: {
                                        L16: {
                                          if (8 <= var4) {
                                            break L16;
                                          } else {
                                            ((eq) this).field_l[var3] = qf.a(((eq) this).field_l[var3], oa.field_Wb[var4][ik.a((int)(((eq) this).field_f[ik.a(var3 - var4, 7)] >>> var5), 255)]);
                                            var4++;
                                            var5 -= 8;
                                            if (var6 != 0) {
                                              break L15;
                                            } else {
                                              if (var6 == 0) {
                                                continue L14;
                                              } else {
                                                break L16;
                                              }
                                            }
                                          }
                                        }
                                        var3++;
                                        break L15;
                                      }
                                      if (var6 == 0) {
                                        continue L11;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_33_0 = 0;
                              stackIn_34_0 = stackOut_33_0;
                              break L12;
                            }
                            var3 = stackIn_34_0;
                            L17: while (true) {
                              L18: {
                                L19: {
                                  if (8 <= var3) {
                                    break L19;
                                  } else {
                                    ((eq) this).field_f[var3] = ((eq) this).field_l[var3];
                                    var3++;
                                    if (var6 != 0) {
                                      break L18;
                                    } else {
                                      if (var6 == 0) {
                                        continue L17;
                                      } else {
                                        break L19;
                                      }
                                    }
                                  }
                                }
                                ((eq) this).field_f[0] = qf.a(((eq) this).field_f[0], oa.field_Xb[var2_int]);
                                break L18;
                              }
                              var3 = 0;
                              L20: while (true) {
                                L21: {
                                  L22: {
                                    if (var3 >= 8) {
                                      break L22;
                                    } else {
                                      ((eq) this).field_l[var3] = ((eq) this).field_f[var3];
                                      var4 = 0;
                                      stackOut_43_0 = 56;
                                      stackIn_53_0 = stackOut_43_0;
                                      stackIn_44_0 = stackOut_43_0;
                                      if (var6 != 0) {
                                        break L21;
                                      } else {
                                        var5 = stackIn_44_0;
                                        L23: while (true) {
                                          L24: {
                                            L25: {
                                              if (var4 >= 8) {
                                                break L25;
                                              } else {
                                                ((eq) this).field_l[var3] = qf.a(((eq) this).field_l[var3], oa.field_Wb[var4][ik.a(255, (int)(((eq) this).field_k[ik.a(var3 - var4, 7)] >>> var5))]);
                                                var4++;
                                                var5 -= 8;
                                                if (var6 != 0) {
                                                  break L24;
                                                } else {
                                                  if (var6 == 0) {
                                                    continue L23;
                                                  } else {
                                                    break L25;
                                                  }
                                                }
                                              }
                                            }
                                            var3++;
                                            break L24;
                                          }
                                          if (var6 == 0) {
                                            continue L20;
                                          } else {
                                            break L22;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  stackOut_52_0 = 0;
                                  stackIn_53_0 = stackOut_52_0;
                                  break L21;
                                }
                                var3 = stackIn_53_0;
                                L26: while (true) {
                                  L27: {
                                    L28: {
                                      if (var3 >= 8) {
                                        break L28;
                                      } else {
                                        ((eq) this).field_k[var3] = ((eq) this).field_l[var3];
                                        var3++;
                                        if (var6 != 0) {
                                          break L27;
                                        } else {
                                          if (var6 == 0) {
                                            continue L26;
                                          } else {
                                            break L28;
                                          }
                                        }
                                      }
                                    }
                                    var2_int++;
                                    break L27;
                                  }
                                  if (var6 == 0) {
                                    continue L8;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_61_0 = 0;
                    stackIn_62_0 = stackOut_61_0;
                    break L9;
                  }
                  var2_int = stackIn_62_0;
                  L29: while (true) {
                    L30: {
                      L31: {
                        if (var2_int >= 8) {
                          break L31;
                        } else {
                          ((eq) this).field_a[var2_int] = qf.a(((eq) this).field_a[var2_int], qf.a(((eq) this).field_k[var2_int], ((eq) this).field_e[var2_int]));
                          var2_int++;
                          if (var6 != 0) {
                            break L30;
                          } else {
                            if (var6 == 0) {
                              continue L29;
                            } else {
                              break L31;
                            }
                          }
                        }
                      }
                      break L30;
                    }
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var2, "eq.G(" + param0 + ')');
        }
    }

    final void a(byte[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        long var7 = 0L;
        int var9 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              ((eq) this).field_h[((eq) this).field_c] = (byte)ud.d((int) ((eq) this).field_h[((eq) this).field_c], 128 >>> ik.a(7, ((eq) this).field_j));
              var4_int = -48 % ((-28 - param1) / 38);
              ((eq) this).field_c = ((eq) this).field_c + 1;
              if (((eq) this).field_c <= 32) {
                break L1;
              } else {
                L2: while (true) {
                  L3: {
                    L4: {
                      if (((eq) this).field_c >= 64) {
                        break L4;
                      } else {
                        int fieldTemp$2 = ((eq) this).field_c;
                        ((eq) this).field_c = ((eq) this).field_c + 1;
                        ((eq) this).field_h[fieldTemp$2] = (byte) 0;
                        if (var9 != 0) {
                          break L3;
                        } else {
                          if (var9 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    this.a((byte) 109);
                    break L3;
                  }
                  ((eq) this).field_c = 0;
                  break L1;
                }
              }
            }
            L5: while (true) {
              L6: {
                L7: {
                  if (((eq) this).field_c >= 32) {
                    break L7;
                  } else {
                    int fieldTemp$3 = ((eq) this).field_c;
                    ((eq) this).field_c = ((eq) this).field_c + 1;
                    ((eq) this).field_h[fieldTemp$3] = (byte) 0;
                    if (var9 != 0) {
                      break L6;
                    } else {
                      if (var9 == 0) {
                        continue L5;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                pm.a(((eq) this).field_d, 0, ((eq) this).field_h, 32, 32);
                this.a((byte) 47);
                break L6;
              }
              var5 = 0;
              var6 = param2;
              L8: while (true) {
                L9: {
                  L10: {
                    if (var5 >= 8) {
                      break L10;
                    } else {
                      var7 = ((eq) this).field_a[var5];
                      param0[var6] = (byte)(int)(var7 >>> 566537784);
                      param0[var6 + 1] = (byte)(int)(var7 >>> -536603984);
                      param0[2 + var6] = (byte)(int)(var7 >>> -1370981848);
                      param0[3 + var6] = (byte)(int)(var7 >>> -1740851424);
                      param0[var6 + 4] = (byte)(int)(var7 >>> -1122408);
                      param0[5 + var6] = (byte)(int)(var7 >>> 1753603856);
                      param0[var6 - -6] = (byte)(int)(var7 >>> -1581657080);
                      param0[7 + var6] = (byte)(int)var7;
                      var5++;
                      var6 += 8;
                      if (var9 != 0) {
                        break L9;
                      } else {
                        if (var9 == 0) {
                          continue L8;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  break L9;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var4;
            stackOut_24_1 = new StringBuilder().append("eq.E(");
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
              break L11;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_28_0 = stackOut_25_0;
              stackIn_28_1 = stackOut_25_1;
              stackIn_28_2 = stackOut_25_2;
              break L11;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(byte[] param0, int param1, long param2) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var13 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = 8 - ((int)param2 & 7) & 7;
              var7 = ((eq) this).field_j & 7;
              if (param1 == 540) {
                break L1;
              } else {
                this.a((byte) -98);
                break L1;
              }
            }
            var9 = param2;
            var11 = 31;
            var12 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    L6: {
                      if (0 > var11) {
                        break L6;
                      } else {
                        var12 = var12 + ((255 & (int)var9) + (255 & ((eq) this).field_d[var11]));
                        ((eq) this).field_d[var11] = (byte)var12;
                        var12 = var12 >>> 8;
                        var9 = var9 >>> 8;
                        var11--;
                        if (var13 != 0) {
                          break L5;
                        } else {
                          if (var13 == 0) {
                            continue L2;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    L7: while (true) {
                      if (8L >= param2) {
                        break L5;
                      } else {
                        var8 = param0[var5_int] << var6 & 255 | (param0[var5_int - -1] & 255) >>> -var6 + 8;
                        stackOut_11_0 = -1;
                        stackOut_11_1 = ~var8;
                        stackIn_33_0 = stackOut_11_0;
                        stackIn_33_1 = stackOut_11_1;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        if (var13 != 0) {
                          break L4;
                        } else {
                          L8: {
                            if (stackIn_12_0 < stackIn_12_1) {
                              break L8;
                            } else {
                              if (256 > var8) {
                                L9: {
                                  ((eq) this).field_h[((eq) this).field_c] = (byte)ud.d((int) ((eq) this).field_h[((eq) this).field_c], var8 >>> var7);
                                  ((eq) this).field_c = ((eq) this).field_c + 1;
                                  ((eq) this).field_j = ((eq) this).field_j + (-var7 + 8);
                                  if (((eq) this).field_j == 512) {
                                    this.a((byte) 38);
                                    ((eq) this).field_j = 0;
                                    ((eq) this).field_c = 0;
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                                ((eq) this).field_h[((eq) this).field_c] = (byte)ik.a(255, var8 << 8 + -var7);
                                ((eq) this).field_j = ((eq) this).field_j + var7;
                                var5_int++;
                                param2 = param2 - 8L;
                                if (var13 == 0) {
                                  continue L7;
                                } else {
                                  break L5;
                                }
                              } else {
                                break L8;
                              }
                            }
                          }
                          throw new RuntimeException("LOGIC ERROR");
                        }
                      }
                    }
                  }
                  L10: {
                    L11: {
                      if (param2 <= 0L) {
                        break L11;
                      } else {
                        var8 = 255 & param0[var5_int] << var6;
                        ((eq) this).field_h[((eq) this).field_c] = (byte)ud.d((int) ((eq) this).field_h[((eq) this).field_c], var8 >>> var7);
                        if (var13 == 0) {
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                    var8 = 0;
                    break L10;
                  }
                  L12: {
                    if ((long)var7 - -param2 >= 8L) {
                      break L12;
                    } else {
                      ((eq) this).field_j = (int)((long)((eq) this).field_j + param2);
                      if (var13 == 0) {
                        break L3;
                      } else {
                        break L12;
                      }
                    }
                  }
                  param2 = param2 - (long)(8 - var7);
                  ((eq) this).field_c = ((eq) this).field_c + 1;
                  ((eq) this).field_j = ((eq) this).field_j + (8 + -var7);
                  stackOut_32_0 = ((eq) this).field_j;
                  stackOut_32_1 = 512;
                  stackIn_33_0 = stackOut_32_0;
                  stackIn_33_1 = stackOut_32_1;
                  break L4;
                }
                L13: {
                  if (stackIn_33_0 != stackIn_33_1) {
                    break L13;
                  } else {
                    this.a((byte) 41);
                    ((eq) this).field_j = 0;
                    ((eq) this).field_c = 0;
                    break L13;
                  }
                }
                ((eq) this).field_h[((eq) this).field_c] = (byte)ik.a(255, var8 << 8 + -var7);
                ((eq) this).field_j = ((eq) this).field_j + (int)param2;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var5 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var5;
            stackOut_38_1 = new StringBuilder().append("eq.D(");
            stackIn_41_0 = stackOut_38_0;
            stackIn_41_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param0 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L14;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_42_0 = stackOut_39_0;
              stackIn_42_1 = stackOut_39_1;
              stackIn_42_2 = stackOut_39_2;
              break L14;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void b(int param0) {
        try {
            field_m = null;
            field_b = null;
            field_g = null;
            field_i = null;
            if (param0 != -1) {
                field_m = null;
            }
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "eq.A(" + param0 + ')');
        }
    }

    eq() {
        ((eq) this).field_e = new long[8];
        ((eq) this).field_h = new byte[64];
        ((eq) this).field_d = new byte[32];
        ((eq) this).field_f = new long[8];
        ((eq) this).field_l = new long[8];
        ((eq) this).field_k = new long[8];
        ((eq) this).field_c = 0;
        ((eq) this).field_j = 0;
        ((eq) this).field_a = new long[8];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "The game options are not all set.";
        field_i = "This password contains repeated characters, and would be easy to guess";
    }
}
