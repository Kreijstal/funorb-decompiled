/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class om extends w {
    private int field_o;
    private pj field_s;
    private sh field_n;
    private na field_l;
    private dl field_p;
    private na field_q;
    private int field_r;
    private pc field_d;
    private jh field_h;
    private byte[] field_j;
    private byte[] field_k;
    private int field_t;
    private boolean field_m;
    private int field_i;
    private boolean field_e;
    private vo field_c;
    private vo field_g;
    private long field_u;
    private boolean field_f;

    final void b(int param0) {
        RuntimeException var2 = null;
        le var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawn.field_J;
        try {
          L0: {
            if (((om) this).field_c == null) {
              return;
            } else {
              if (param0 == 0) {
                if (null != ((om) this).b((byte) -103)) {
                  var2_ref = ((om) this).field_g.b((byte) 26);
                  L1: while (true) {
                    L2: {
                      L3: {
                        if (null == var2_ref) {
                          break L3;
                        } else {
                          var3 = (int)var2_ref.field_f;
                          if (var4 != 0) {
                            break L2;
                          } else {
                            L4: {
                              L5: {
                                L6: {
                                  if (0 > var3) {
                                    break L6;
                                  } else {
                                    if (var3 >= ((om) this).field_h.field_s) {
                                      break L6;
                                    } else {
                                      if (0 != ((om) this).field_h.field_t[var3]) {
                                        break L5;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                }
                                var2_ref.b(param0 + -27598);
                                if (var4 == 0) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                              L7: {
                                if (((om) this).field_j[var3] != 0) {
                                  break L7;
                                } else {
                                  pj discarded$2 = this.a(1, var3, param0 + 66);
                                  break L7;
                                }
                              }
                              L8: {
                                if (((om) this).field_j[var3] == -1) {
                                  pj discarded$3 = this.a(2, var3, 19);
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                              if (1 != ((om) this).field_j[var3]) {
                                break L4;
                              } else {
                                var2_ref.b(param0 + -27598);
                                break L4;
                              }
                            }
                            var2_ref = ((om) this).field_g.a(false);
                            if (var4 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      break L2;
                    }
                    break L0;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var2, "om.I(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        vn var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        var31 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              param5 = param5 << 1;
              var8_int = param2 + -param6 + -param7;
              var9 = -param6 + (param1 + -param7);
              var10 = param6 + (param2 - -param7);
              if (var8_int >= bi.field_g) {
                break L1;
              } else {
                var8_int = bi.field_g;
                break L1;
              }
            }
            L2: {
              if (~bi.field_b > ~var10) {
                var10 = bi.field_b;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var11 = param1 - (-param6 - param7);
              if (~bi.field_l < ~var9) {
                var9 = bi.field_l;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (bi.field_d >= var11) {
                break L4;
              } else {
                var11 = bi.field_d;
                break L4;
              }
            }
            var12 = new int[32];
            var13 = 16711935 & param3;
            var14 = 65280 & param3;
            var15 = 0;
            L5: while (true) {
              L6: {
                L7: {
                  if (var15 >= 16) {
                    break L7;
                  } else {
                    var16 = var15 * param4 >> 1769613060;
                    var12[var15] = hi.a(eg.a(-16711936, var16 * var13), eg.a(var16 * var14, 16711680)) >>> -490182104;
                    var12[31 + -var15] = hi.a(eg.a(var13 * var16, -16711936), eg.a(var14 * var16, 16711680)) >>> -970951096;
                    var15++;
                    if (var31 != 0) {
                      break L6;
                    } else {
                      if (var31 == 0) {
                        continue L5;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                var15 = var10 + -var8_int;
                var16 = -var9 + var11;
                break L6;
              }
              L8: {
                if (0 >= var15) {
                  break L8;
                } else {
                  if (var16 > 0) {
                    var17 = new vn(var15, var16);
                    var18 = param6 * param6;
                    var19 = (param7 + param6) * (param6 - -param7);
                    var20 = 0;
                    var21 = -param1 + var9;
                    if (param0 == -1) {
                      var22 = 0;
                      L9: while (true) {
                        stackOut_28_0 = ~var22;
                        stackOut_28_1 = ~var16;
                        stackIn_29_0 = stackOut_28_0;
                        stackIn_29_1 = stackOut_28_1;
                        L10: while (true) {
                          L11: {
                            L12: {
                              if (stackIn_29_0 <= stackIn_29_1) {
                                break L12;
                              } else {
                                var23 = -param2 + var8_int;
                                var24 = var23 * var23 + var21 * var21;
                                if (var31 != 0) {
                                  break L11;
                                } else {
                                  var25 = 0;
                                  L13: while (true) {
                                    L14: {
                                      if (var25 >= var15) {
                                        break L14;
                                      } else {
                                        var26 = var22 + var9;
                                        var27 = var25 + var8_int;
                                        stackOut_33_0 = ~var24;
                                        stackOut_33_1 = -1;
                                        stackIn_29_0 = stackOut_33_0;
                                        stackIn_29_1 = stackOut_33_1;
                                        stackIn_34_0 = stackOut_33_0;
                                        stackIn_34_1 = stackOut_33_1;
                                        if (var31 != 0) {
                                          continue L10;
                                        } else {
                                          L15: {
                                            if (stackIn_34_0 != stackIn_34_1) {
                                              L16: {
                                                if (var18 > var24) {
                                                  break L16;
                                                } else {
                                                  if (~var19 < ~var24) {
                                                    L17: {
                                                      var28 = uf.a(var24 << -1068723956, 12832);
                                                      var29 = -(param6 << 244116038) + var28;
                                                      var30 = -(param5 * (-fb.a(1311979239, (var29 << 692082087) / param7) + 65536) >> 1130402539) + var28;
                                                      var26 = param1 - -(var30 * var21 / var28);
                                                      var27 = param2 - -(var23 * var30 / var28);
                                                      if (bi.field_l <= var26) {
                                                        break L17;
                                                      } else {
                                                        var26 = bi.field_l;
                                                        break L17;
                                                      }
                                                    }
                                                    L18: {
                                                      if (bi.field_g > var27) {
                                                        var27 = bi.field_g;
                                                        break L18;
                                                      } else {
                                                        break L18;
                                                      }
                                                    }
                                                    L19: {
                                                      if (~var27 <= ~bi.field_b) {
                                                        var27 = -1 + bi.field_b;
                                                        break L19;
                                                      } else {
                                                        break L19;
                                                      }
                                                    }
                                                    L20: {
                                                      if (~bi.field_d >= ~var26) {
                                                        var26 = bi.field_d - 1;
                                                        break L20;
                                                      } else {
                                                        break L20;
                                                      }
                                                    }
                                                    if (var31 == 0) {
                                                      break L15;
                                                    } else {
                                                      break L16;
                                                    }
                                                  } else {
                                                    break L15;
                                                  }
                                                }
                                              }
                                              L21: {
                                                var28 = uf.a(var24 << 877470188, 12832);
                                                var29 = -var28 + (param6 << 933090758);
                                                var30 = -((65536 + -fb.a(1311979239, (var29 << 2021227623) / param6)) * param5 >> -600975317) + var28;
                                                var30 = var30 - na.field_c[var25 % 256 + var22 % 256 * 256];
                                                var27 = var23 * var30 / var28 + param2;
                                                var26 = param1 - -(var21 * var30 / var28);
                                                if (var27 < bi.field_g) {
                                                  var27 = bi.field_g;
                                                  break L21;
                                                } else {
                                                  break L21;
                                                }
                                              }
                                              L22: {
                                                if (var26 < bi.field_l) {
                                                  var26 = bi.field_l;
                                                  break L22;
                                                } else {
                                                  break L22;
                                                }
                                              }
                                              L23: {
                                                if (var27 < bi.field_b) {
                                                  break L23;
                                                } else {
                                                  var27 = -1 + bi.field_b;
                                                  break L23;
                                                }
                                              }
                                              if (bi.field_d > var26) {
                                                break L15;
                                              } else {
                                                var26 = -1 + bi.field_d;
                                                break L15;
                                              }
                                            } else {
                                              break L15;
                                            }
                                          }
                                          var17.field_z[var20] = bi.field_c[var27 + bi.field_f * var26];
                                          var20++;
                                          var25++;
                                          var23++;
                                          var24 = var24 + (2 * var23 - 1);
                                          if (var31 == 0) {
                                            continue L13;
                                          } else {
                                            break L14;
                                          }
                                        }
                                      }
                                    }
                                    var22++;
                                    var21++;
                                    if (var31 == 0) {
                                      continue L9;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                            }
                            var17.e(var8_int, var9);
                            break L11;
                          }
                          break L0;
                        }
                      }
                    } else {
                      return;
                    }
                  } else {
                    break L8;
                  }
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var8, "om.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final void a(boolean param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((om) this).field_l == null) {
              return;
            } else {
              if (!param0) {
                L1: {
                  ((om) this).field_m = true;
                  if (((om) this).field_c == null) {
                    ((om) this).field_c = new vo();
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
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var2, "om.J(" + param0 + ')');
        }
    }

    final byte[] a(int param0, byte param1) {
        pj var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_2_0 = null;
        Object stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        byte[] stackOut_8_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            var3 = this.a(0, param0, 118);
            if (param1 == 112) {
              if (null == var3) {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (byte[]) (Object) stackIn_7_0;
              } else {
                var4 = var3.d(0);
                var3.b(-27598);
                stackOut_8_0 = (byte[]) var4;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var3_ref, "om.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    private final pj a(int param0, int param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var6_int = 0;
        int var7_int = 0;
        byte[] var7 = null;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_44_0 = null;
        Object stackIn_57_0 = null;
        Object stackIn_62_0 = null;
        int stackIn_80_0 = 0;
        int stackIn_80_1 = 0;
        int stackIn_87_0 = 0;
        int stackIn_87_1 = 0;
        Object stackIn_99_0 = null;
        Object stackIn_106_0 = null;
        byte stackIn_124_0 = 0;
        byte stackIn_124_1 = 0;
        Object stackIn_138_0 = null;
        int stackIn_142_0 = 0;
        byte stackIn_142_1 = 0;
        Object stackIn_149_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_43_0 = null;
        Object stackOut_56_0 = null;
        byte stackOut_123_0 = 0;
        byte stackOut_123_1 = 0;
        Object stackOut_137_0 = null;
        int stackOut_140_0 = 0;
        byte stackOut_140_1 = 0;
        Object stackOut_148_0 = null;
        int stackOut_79_0 = 0;
        int stackOut_79_1 = 0;
        int stackOut_86_0 = 0;
        int stackOut_86_1 = 0;
        Object stackOut_98_0 = null;
        Object stackOut_105_0 = null;
        Object stackOut_61_0 = null;
        var10 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (param2 >= 10) {
                break L1;
              } else {
                ((om) this).field_l = null;
                break L1;
              }
            }
            L2: {
              var4 = (Object) (Object) (pj) (Object) ((om) this).field_p.a((long)param1, 56);
              if (null == var4) {
                break L2;
              } else {
                if (param0 != 0) {
                  break L2;
                } else {
                  if (((pj) var4).field_r) {
                    break L2;
                  } else {
                    if (!((pj) var4).field_q) {
                      break L2;
                    } else {
                      ((pj) var4).b(-27598);
                      var4 = null;
                      break L2;
                    }
                  }
                }
              }
            }
            L3: {
              if (var4 != null) {
                break L3;
              } else {
                L4: {
                  L5: {
                    if (param0 == 0) {
                      break L5;
                    } else {
                      L6: {
                        if (param0 != 1) {
                          break L6;
                        } else {
                          if (null == ((om) this).field_l) {
                            throw new RuntimeException();
                          } else {
                            var4 = (Object) (Object) ((om) this).field_n.a((byte) -119, ((om) this).field_l, param1);
                            if (var10 == 0) {
                              break L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      if (param0 == 2) {
                        if (((om) this).field_l == null) {
                          throw new RuntimeException();
                        } else {
                          if (((om) this).field_j[param1] != -1) {
                            throw new RuntimeException();
                          } else {
                            if (!((om) this).field_d.a((byte) 123)) {
                              var4 = (Object) (Object) ((om) this).field_d.a((byte) 2, false, ((om) this).field_o, (byte) -88, param1);
                              if (var10 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            } else {
                              stackOut_43_0 = null;
                              stackIn_44_0 = stackOut_43_0;
                              return (pj) (Object) stackIn_44_0;
                            }
                          }
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                  L7: {
                    if (((om) this).field_l == null) {
                      break L7;
                    } else {
                      if (((om) this).field_j[param1] != -1) {
                        var4 = (Object) (Object) ((om) this).field_n.a(param1, ((om) this).field_l, -114);
                        break L4;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if (((om) this).field_d.b(111)) {
                      break L8;
                    } else {
                      var4 = (Object) (Object) ((om) this).field_d.a((byte) 2, true, ((om) this).field_o, (byte) -128, param1);
                      if (var10 == 0) {
                        break L4;
                      } else {
                        break L8;
                      }
                    }
                  }
                  stackOut_56_0 = null;
                  stackIn_57_0 = stackOut_56_0;
                  return (pj) (Object) stackIn_57_0;
                }
                ((om) this).field_p.a(-110, (long)param1, (le) var4);
                break L3;
              }
            }
            if (!((pj) var4).field_q) {
              var5 = ((pj) var4).d(0);
              if (!(var4 instanceof wd)) {
                try {
                  L9: {
                    L10: {
                      if (var5 == null) {
                        break L10;
                      } else {
                        if (var5.length <= 2) {
                          break L10;
                        } else {
                          ep.field_h.reset();
                          ep.field_h.update(var5, 0, var5.length + -2);
                          var6_int = (int)ep.field_h.getValue();
                          if (~((om) this).field_h.field_j[param1] == ~var6_int) {
                            L11: {
                              if (((om) this).field_h.field_f == null) {
                                break L11;
                              } else {
                                if (null == ((om) this).field_h.field_f[param1]) {
                                  break L11;
                                } else {
                                  var7 = ((om) this).field_h.field_f[param1];
                                  var8 = nl.a(0, var5.length - 2, -116, var5);
                                  var9 = 0;
                                  L12: while (true) {
                                    if (var9 >= 64) {
                                      break L11;
                                    } else {
                                      stackOut_123_0 = var7[var9];
                                      stackOut_123_1 = var8[var9];
                                      stackIn_142_0 = stackOut_123_0;
                                      stackIn_142_1 = stackOut_123_1;
                                      stackIn_124_0 = stackOut_123_0;
                                      stackIn_124_1 = stackOut_123_1;
                                      if (var10 != 0) {
                                        decompiledRegionSelector0 = 0;
                                        break L9;
                                      } else {
                                        if (stackIn_124_0 == stackIn_124_1) {
                                          var9++;
                                          if (var10 == 0) {
                                            continue L12;
                                          } else {
                                            break L11;
                                          }
                                        } else {
                                          throw new RuntimeException();
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            ((om) this).field_d.field_h = 0;
                            ((om) this).field_d.field_e = 0;
                            decompiledRegionSelector0 = 1;
                            break L9;
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L13: {
                    var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                    ((om) this).field_d.a(-90);
                    ((pj) var4).b(-27598);
                    if (!((pj) var4).field_r) {
                      break L13;
                    } else {
                      if (((om) this).field_d.b(127)) {
                        break L13;
                      } else {
                        var4 = (Object) (Object) ((om) this).field_d.a((byte) 2, true, ((om) this).field_o, (byte) 111, param1);
                        ((om) this).field_p.a(-102, (long)param1, (le) var4);
                        break L13;
                      }
                    }
                  }
                  stackOut_137_0 = null;
                  stackIn_138_0 = stackOut_137_0;
                  return (pj) (Object) stackIn_138_0;
                }
                L14: {
                  L15: {
                    if (decompiledRegionSelector0 == 0) {
                      break L15;
                    } else {
                      var5[var5.length - 2] = (byte)(((om) this).field_h.field_c[param1] >>> 868980712);
                      var5[-1 + var5.length] = (byte)((om) this).field_h.field_c[param1];
                      if (((om) this).field_l == null) {
                        break L14;
                      } else {
                        wd discarded$1 = ((om) this).field_n.a((byte) 63, param1, ((om) this).field_l, var5);
                        stackOut_140_0 = 1;
                        stackOut_140_1 = ((om) this).field_j[param1];
                        stackIn_142_0 = stackOut_140_0;
                        stackIn_142_1 = stackOut_140_1;
                        break L15;
                      }
                    }
                  }
                  if (stackIn_142_0 != stackIn_142_1) {
                    ((om) this).field_j[param1] = (byte) 1;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L16: {
                  if (((pj) var4).field_r) {
                    break L16;
                  } else {
                    ((pj) var4).b(-27598);
                    break L16;
                  }
                }
                stackOut_148_0 = var4;
                stackIn_149_0 = stackOut_148_0;
                break L0;
              } else {
                try {
                  L17: {
                    L18: {
                      if (var5 == null) {
                        break L18;
                      } else {
                        if (var5.length > 2) {
                          ep.field_h.reset();
                          ep.field_h.update(var5, 0, -2 + var5.length);
                          var6_int = (int)ep.field_h.getValue();
                          if (~var6_int == ~((om) this).field_h.field_j[param1]) {
                            L19: {
                              L20: {
                                if (null == ((om) this).field_h.field_f) {
                                  break L20;
                                } else {
                                  if (null == ((om) this).field_h.field_f[param1]) {
                                    break L20;
                                  } else {
                                    var7 = ((om) this).field_h.field_f[param1];
                                    var8 = nl.a(0, -2 + var5.length, -119, var5);
                                    var9 = 0;
                                    L21: while (true) {
                                      if (64 <= var9) {
                                        break L20;
                                      } else {
                                        stackOut_79_0 = ~var7[var9];
                                        stackOut_79_1 = ~var8[var9];
                                        stackIn_87_0 = stackOut_79_0;
                                        stackIn_87_1 = stackOut_79_1;
                                        stackIn_80_0 = stackOut_79_0;
                                        stackIn_80_1 = stackOut_79_1;
                                        if (var10 != 0) {
                                          break L19;
                                        } else {
                                          if (stackIn_80_0 != stackIn_80_1) {
                                            throw new RuntimeException();
                                          } else {
                                            var9++;
                                            if (var10 == 0) {
                                              continue L21;
                                            } else {
                                              break L20;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_86_0 = var5[var5.length + -1] & 255;
                              stackOut_86_1 = (var5[-2 + var5.length] & 255) << 1765208200;
                              stackIn_87_0 = stackOut_86_0;
                              stackIn_87_1 = stackOut_86_1;
                              break L19;
                            }
                            var7_int = stackIn_87_0 + stackIn_87_1;
                            if (var7_int == (65535 & ((om) this).field_h.field_c[param1])) {
                              L22: {
                                if (((om) this).field_j[param1] == 1) {
                                  break L22;
                                } else {
                                  L23: {
                                    if (((om) this).field_j[param1] != 0) {
                                      break L23;
                                    } else {
                                      break L23;
                                    }
                                  }
                                  ((om) this).field_j[param1] = (byte) 1;
                                  break L22;
                                }
                              }
                              L24: {
                                if (((pj) var4).field_r) {
                                  break L24;
                                } else {
                                  ((pj) var4).b(-27598);
                                  break L24;
                                }
                              }
                              stackOut_98_0 = var4;
                              stackIn_99_0 = stackOut_98_0;
                              break L17;
                            } else {
                              throw new RuntimeException();
                            }
                          } else {
                            throw new RuntimeException();
                          }
                        } else {
                          break L18;
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L25: {
                    var6 = (Exception) (Object) decompiledCaughtException;
                    ((om) this).field_j[param1] = (byte) -1;
                    ((pj) var4).b(-27598);
                    if (((pj) var4).field_r) {
                      if (((om) this).field_d.b(122)) {
                        break L25;
                      } else {
                        var4 = (Object) (Object) ((om) this).field_d.a((byte) 2, true, ((om) this).field_o, (byte) -95, param1);
                        ((om) this).field_p.a(-108, (long)param1, (le) var4);
                        break L25;
                      }
                    } else {
                      break L25;
                    }
                  }
                  stackOut_105_0 = null;
                  stackIn_106_0 = stackOut_105_0;
                  return (pj) (Object) stackIn_106_0;
                }
                return (pj) (Object) stackIn_99_0;
              }
            } else {
              stackOut_61_0 = null;
              stackIn_62_0 = stackOut_61_0;
              return (pj) (Object) stackIn_62_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (Object) (Object) decompiledCaughtException;
          throw sh.a((Throwable) var4, "om.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return (pj) (Object) stackIn_149_0;
    }

    final int a(int param0, int param1) {
        pj var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 <= -76) {
                break L1;
              } else {
                ((om) this).field_d = null;
                break L1;
              }
            }
            var3 = (pj) (Object) ((om) this).field_p.a((long)param1, 54);
            if (var3 != null) {
              stackOut_6_0 = var3.e(-31478);
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var3_ref, "om.B(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final void a(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        pj var2_ref = null;
        le var3 = null;
        int var4 = 0;
        int var5 = 0;
        byte stackIn_14_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_73_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_95_0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte stackOut_13_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_59_1 = 0;
        int stackOut_72_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_70_1 = 0;
        int stackOut_94_0 = 0;
        var5 = ZombieDawn.field_J;
        try {
          L0: {
            if (param0 > 13) {
              L1: {
                if (((om) this).field_c != null) {
                  if (((om) this).b((byte) -23) == null) {
                    return;
                  } else {
                    L2: {
                      if (!((om) this).field_e) {
                        break L2;
                      } else {
                        var2_int = 1;
                        var3 = ((om) this).field_c.b((byte) 26);
                        L3: while (true) {
                          L4: {
                            L5: {
                              L6: {
                                if (var3 == null) {
                                  break L6;
                                } else {
                                  var4 = (int)var3.field_f;
                                  stackOut_13_0 = ((om) this).field_j[var4];
                                  stackIn_25_0 = stackOut_13_0;
                                  stackIn_14_0 = stackOut_13_0;
                                  if (var5 != 0) {
                                    L7: while (true) {
                                      if (stackIn_25_0 >= ~((om) this).field_i) {
                                        break L5;
                                      } else {
                                        stackOut_26_0 = ((om) this).field_h.field_t[((om) this).field_i];
                                        stackIn_50_0 = stackOut_26_0;
                                        stackIn_27_0 = stackOut_26_0;
                                        if (var5 != 0) {
                                          break L4;
                                        } else {
                                          stackOut_27_0 = stackIn_27_0;
                                          stackIn_29_0 = stackOut_27_0;
                                          L8: {
                                            L9: {
                                              if (stackIn_29_0 == 0) {
                                                ((om) this).field_i = ((om) this).field_i + 1;
                                                if (var5 == 0) {
                                                  break L8;
                                                } else {
                                                  break L9;
                                                }
                                              } else {
                                                break L9;
                                              }
                                            }
                                            L10: {
                                              if (((om) this).field_n.field_k >= 250) {
                                                var2_int = 0;
                                                if (var5 == 0) {
                                                  break L5;
                                                } else {
                                                  break L10;
                                                }
                                              } else {
                                                break L10;
                                              }
                                            }
                                            L11: {
                                              if (((om) this).field_j[((om) this).field_i] == 0) {
                                                pj discarded$4 = this.a(1, ((om) this).field_i, 68);
                                                break L11;
                                              } else {
                                                break L11;
                                              }
                                            }
                                            L12: {
                                              if (((om) this).field_j[((om) this).field_i] == 0) {
                                                var3 = new le();
                                                var3.field_f = (long)((om) this).field_i;
                                                ((om) this).field_c.a(0, var3);
                                                var2_int = 0;
                                                break L12;
                                              } else {
                                                break L12;
                                              }
                                            }
                                            ((om) this).field_i = ((om) this).field_i + 1;
                                            if (var5 == 0) {
                                              break L8;
                                            } else {
                                              break L5;
                                            }
                                          }
                                          stackOut_24_0 = ~((om) this).field_h.field_t.length;
                                          stackIn_25_0 = stackOut_24_0;
                                          continue L7;
                                        }
                                      }
                                    }
                                  } else {
                                    L13: {
                                      if (stackIn_14_0 == 0) {
                                        pj discarded$5 = this.a(1, var4, 106);
                                        break L13;
                                      } else {
                                        break L13;
                                      }
                                    }
                                    L14: {
                                      L15: {
                                        if (0 != ((om) this).field_j[var4]) {
                                          break L15;
                                        } else {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L14;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                      var3.b(-27598);
                                      break L14;
                                    }
                                    var3 = ((om) this).field_c.a(false);
                                    if (var5 == 0) {
                                      continue L3;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                              L16: while (true) {
                                stackOut_24_0 = ~((om) this).field_h.field_t.length;
                                stackIn_25_0 = stackOut_24_0;
                                if (stackIn_25_0 >= ~((om) this).field_i) {
                                  break L5;
                                } else {
                                  stackOut_26_0 = ((om) this).field_h.field_t[((om) this).field_i];
                                  stackIn_50_0 = stackOut_26_0;
                                  stackIn_27_0 = stackOut_26_0;
                                  if (var5 != 0) {
                                    break L4;
                                  } else {
                                    stackOut_27_0 = stackIn_27_0;
                                    stackIn_29_0 = stackOut_27_0;
                                    L17: {
                                      if (stackIn_29_0 == 0) {
                                        ((om) this).field_i = ((om) this).field_i + 1;
                                        if (var5 == 0) {
                                          continue L16;
                                        } else {
                                          break L17;
                                        }
                                      } else {
                                        break L17;
                                      }
                                    }
                                    L18: {
                                      if (((om) this).field_n.field_k >= 250) {
                                        var2_int = 0;
                                        if (var5 == 0) {
                                          break L5;
                                        } else {
                                          break L18;
                                        }
                                      } else {
                                        break L18;
                                      }
                                    }
                                    L19: {
                                      if (((om) this).field_j[((om) this).field_i] == 0) {
                                        pj discarded$4 = this.a(1, ((om) this).field_i, 68);
                                        break L19;
                                      } else {
                                        break L19;
                                      }
                                    }
                                    L20: {
                                      if (((om) this).field_j[((om) this).field_i] == 0) {
                                        var3 = new le();
                                        var3.field_f = (long)((om) this).field_i;
                                        ((om) this).field_c.a(0, var3);
                                        var2_int = 0;
                                        break L20;
                                      } else {
                                        break L20;
                                      }
                                    }
                                    ((om) this).field_i = ((om) this).field_i + 1;
                                    if (var5 == 0) {
                                      continue L16;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_49_0 = var2_int;
                            stackIn_50_0 = stackOut_49_0;
                            break L4;
                          }
                          L21: {
                            if (stackIn_50_0 == 0) {
                              break L21;
                            } else {
                              ((om) this).field_i = 0;
                              ((om) this).field_e = false;
                              break L21;
                            }
                          }
                          if (var5 == 0) {
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                    L22: {
                      if (!((om) this).field_m) {
                        break L22;
                      } else {
                        var2_int = 1;
                        var3 = ((om) this).field_c.b((byte) 26);
                        L23: while (true) {
                          L24: {
                            L25: {
                              L26: {
                                if (null == var3) {
                                  break L26;
                                } else {
                                  var4 = (int)var3.field_f;
                                  stackOut_59_0 = -2;
                                  stackOut_59_1 = ~((om) this).field_j[var4];
                                  stackIn_71_0 = stackOut_59_0;
                                  stackIn_71_1 = stackOut_59_1;
                                  stackIn_60_0 = stackOut_59_0;
                                  stackIn_60_1 = stackOut_59_1;
                                  if (var5 != 0) {
                                    L27: while (true) {
                                      if (stackIn_71_0 >= stackIn_71_1) {
                                        break L25;
                                      } else {
                                        stackOut_72_0 = ((om) this).field_h.field_t[((om) this).field_i];
                                        stackIn_95_0 = stackOut_72_0;
                                        stackIn_73_0 = stackOut_72_0;
                                        if (var5 != 0) {
                                          break L24;
                                        } else {
                                          stackOut_73_0 = stackIn_73_0;
                                          stackIn_75_0 = stackOut_73_0;
                                          L28: {
                                            L29: {
                                              if (stackIn_75_0 != 0) {
                                                break L29;
                                              } else {
                                                ((om) this).field_i = ((om) this).field_i + 1;
                                                if (var5 == 0) {
                                                  break L28;
                                                } else {
                                                  break L29;
                                                }
                                              }
                                            }
                                            L30: {
                                              if (((om) this).field_d.a((byte) 121)) {
                                                var2_int = 0;
                                                if (var5 == 0) {
                                                  break L25;
                                                } else {
                                                  break L30;
                                                }
                                              } else {
                                                break L30;
                                              }
                                            }
                                            L31: {
                                              if (1 != ((om) this).field_j[((om) this).field_i]) {
                                                pj discarded$6 = this.a(2, ((om) this).field_i, 72);
                                                break L31;
                                              } else {
                                                break L31;
                                              }
                                            }
                                            L32: {
                                              if (((om) this).field_j[((om) this).field_i] == 1) {
                                                break L32;
                                              } else {
                                                var3 = new le();
                                                var3.field_f = (long)((om) this).field_i;
                                                var2_int = 0;
                                                ((om) this).field_c.a(0, var3);
                                                break L32;
                                              }
                                            }
                                            ((om) this).field_i = ((om) this).field_i + 1;
                                            if (var5 == 0) {
                                              break L28;
                                            } else {
                                              break L25;
                                            }
                                          }
                                          stackOut_70_0 = ((om) this).field_i;
                                          stackOut_70_1 = ((om) this).field_h.field_t.length;
                                          stackIn_71_0 = stackOut_70_0;
                                          stackIn_71_1 = stackOut_70_1;
                                          continue L27;
                                        }
                                      }
                                    }
                                  } else {
                                    L33: {
                                      if (stackIn_60_0 == stackIn_60_1) {
                                        break L33;
                                      } else {
                                        pj discarded$7 = this.a(2, var4, 127);
                                        break L33;
                                      }
                                    }
                                    L34: {
                                      L35: {
                                        if (((om) this).field_j[var4] == 1) {
                                          break L35;
                                        } else {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L34;
                                          } else {
                                            break L35;
                                          }
                                        }
                                      }
                                      var3.b(-27598);
                                      break L34;
                                    }
                                    var3 = ((om) this).field_c.a(false);
                                    if (var5 == 0) {
                                      continue L23;
                                    } else {
                                      break L26;
                                    }
                                  }
                                }
                              }
                              L36: while (true) {
                                stackOut_70_0 = ((om) this).field_i;
                                stackOut_70_1 = ((om) this).field_h.field_t.length;
                                stackIn_71_0 = stackOut_70_0;
                                stackIn_71_1 = stackOut_70_1;
                                if (stackIn_71_0 >= stackIn_71_1) {
                                  break L25;
                                } else {
                                  stackOut_72_0 = ((om) this).field_h.field_t[((om) this).field_i];
                                  stackIn_95_0 = stackOut_72_0;
                                  stackIn_73_0 = stackOut_72_0;
                                  if (var5 != 0) {
                                    break L24;
                                  } else {
                                    stackOut_73_0 = stackIn_73_0;
                                    stackIn_75_0 = stackOut_73_0;
                                    L37: {
                                      if (stackIn_75_0 != 0) {
                                        break L37;
                                      } else {
                                        ((om) this).field_i = ((om) this).field_i + 1;
                                        if (var5 == 0) {
                                          continue L36;
                                        } else {
                                          break L37;
                                        }
                                      }
                                    }
                                    L38: {
                                      if (((om) this).field_d.a((byte) 121)) {
                                        var2_int = 0;
                                        if (var5 == 0) {
                                          break L25;
                                        } else {
                                          break L38;
                                        }
                                      } else {
                                        break L38;
                                      }
                                    }
                                    L39: {
                                      if (1 != ((om) this).field_j[((om) this).field_i]) {
                                        pj discarded$6 = this.a(2, ((om) this).field_i, 72);
                                        break L39;
                                      } else {
                                        break L39;
                                      }
                                    }
                                    L40: {
                                      if (((om) this).field_j[((om) this).field_i] == 1) {
                                        break L40;
                                      } else {
                                        var3 = new le();
                                        var3.field_f = (long)((om) this).field_i;
                                        var2_int = 0;
                                        ((om) this).field_c.a(0, var3);
                                        break L40;
                                      }
                                    }
                                    ((om) this).field_i = ((om) this).field_i + 1;
                                    if (var5 == 0) {
                                      continue L36;
                                    } else {
                                      break L25;
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_94_0 = var2_int;
                            stackIn_95_0 = stackOut_94_0;
                            break L24;
                          }
                          L41: {
                            if (stackIn_95_0 == 0) {
                              break L41;
                            } else {
                              ((om) this).field_m = false;
                              ((om) this).field_i = 0;
                              break L41;
                            }
                          }
                          if (var5 == 0) {
                            break L1;
                          } else {
                            break L22;
                          }
                        }
                      }
                    }
                    ((om) this).field_c = null;
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              L42: {
                if (!((om) this).field_f) {
                  break L42;
                } else {
                  if (pd.a(-22826) >= ((om) this).field_u) {
                    var2_ref = (pj) (Object) ((om) this).field_p.a((byte) -113);
                    L43: while (true) {
                      L44: {
                        if (null == var2_ref) {
                          break L44;
                        } else {
                          if (var5 != 0) {
                            break L42;
                          } else {
                            L45: {
                              if (var2_ref.field_q) {
                                break L45;
                              } else {
                                L46: {
                                  if (!var2_ref.field_t) {
                                    break L46;
                                  } else {
                                    if (!var2_ref.field_r) {
                                      throw new RuntimeException();
                                    } else {
                                      var2_ref.b(-27598);
                                      if (var5 == 0) {
                                        break L45;
                                      } else {
                                        break L46;
                                      }
                                    }
                                  }
                                }
                                var2_ref.field_t = true;
                                break L45;
                              }
                            }
                            var2_ref = (pj) (Object) ((om) this).field_p.b((byte) -40);
                            if (var5 == 0) {
                              continue L43;
                            } else {
                              break L44;
                            }
                          }
                        }
                      }
                      ((om) this).field_u = 1000L + pd.a(-22826);
                      break L42;
                    }
                  } else {
                    break L42;
                  }
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
          throw sh.a((Throwable) (Object) var2, "om.F(" + param0 + ')');
        }
    }

    final jh b(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        byte[] var3 = null;
        RuntimeException var4 = null;
        int var5 = 0;
        jh stackIn_3_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_31_0 = null;
        Object stackIn_45_0 = null;
        jh stackIn_55_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        Object stackOut_44_0 = null;
        Object stackOut_30_0 = null;
        jh stackOut_54_0 = null;
        Object stackOut_12_0 = null;
        jh stackOut_2_0 = null;
        var5 = ZombieDawn.field_J;
        try {
          L0: {
            if (((om) this).field_h == null) {
              L1: {
                var2_int = -95 % ((47 - param0) / 49);
                if (null != ((om) this).field_s) {
                  break L1;
                } else {
                  if (!((om) this).field_d.b(120)) {
                    ((om) this).field_s = (pj) (Object) ((om) this).field_d.a((byte) 0, true, 255, (byte) 70, ((om) this).field_o);
                    break L1;
                  } else {
                    stackOut_8_0 = null;
                    stackIn_9_0 = stackOut_8_0;
                    return (jh) (Object) stackIn_9_0;
                  }
                }
              }
              if (!((om) this).field_s.field_q) {
                L2: {
                  var3 = ((om) this).field_s.d(0);
                  if (!(((om) this).field_s instanceof wd)) {
                    try {
                      L3: {
                        if (var3 == null) {
                          throw new RuntimeException();
                        } else {
                          ((om) this).field_h = new jh(var3, ((om) this).field_t, ((om) this).field_k);
                          break L3;
                        }
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L4: {
                        L5: {
                          var4 = decompiledCaughtException;
                          ((om) this).field_d.a(-126);
                          ((om) this).field_h = null;
                          if (((om) this).field_d.b(125)) {
                            break L5;
                          } else {
                            ((om) this).field_s = (pj) (Object) ((om) this).field_d.a((byte) 0, true, 255, (byte) 107, ((om) this).field_o);
                            if (var5 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        ((om) this).field_s = null;
                        break L4;
                      }
                      stackOut_44_0 = null;
                      stackIn_45_0 = stackOut_44_0;
                      return (jh) (Object) stackIn_45_0;
                    }
                    if (((om) this).field_q != null) {
                      wd discarded$1 = ((om) this).field_n.a((byte) 95, ((om) this).field_o, ((om) this).field_q, var3);
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    try {
                      L6: {
                        if (var3 == null) {
                          throw new RuntimeException();
                        } else {
                          ((om) this).field_h = new jh(var3, ((om) this).field_t, ((om) this).field_k);
                          if (((om) this).field_r != ((om) this).field_h.field_e) {
                            throw new RuntimeException();
                          } else {
                            break L6;
                          }
                        }
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L7: {
                        L8: {
                          var4 = decompiledCaughtException;
                          ((om) this).field_h = null;
                          if (!((om) this).field_d.b(107)) {
                            break L8;
                          } else {
                            ((om) this).field_s = null;
                            if (var5 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        ((om) this).field_s = (pj) (Object) ((om) this).field_d.a((byte) 0, true, 255, (byte) 104, ((om) this).field_o);
                        break L7;
                      }
                      stackOut_30_0 = null;
                      stackIn_31_0 = stackOut_30_0;
                      return (jh) (Object) stackIn_31_0;
                    }
                    break L2;
                  }
                }
                L9: {
                  if (((om) this).field_l != null) {
                    ((om) this).field_j = new byte[((om) this).field_h.field_s];
                    break L9;
                  } else {
                    break L9;
                  }
                }
                ((om) this).field_s = null;
                stackOut_54_0 = ((om) this).field_h;
                stackIn_55_0 = stackOut_54_0;
                break L0;
              } else {
                stackOut_12_0 = null;
                stackIn_13_0 = stackOut_12_0;
                return (jh) (Object) stackIn_13_0;
              }
            } else {
              stackOut_2_0 = ((om) this).field_h;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var2, "om.D(" + param0 + ')');
        }
        return stackIn_55_0;
    }

    om(int param0, na param1, na param2, pc param3, sh param4, int param5, byte[] param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        ((om) this).field_p = new dl(16);
        ((om) this).field_i = 0;
        ((om) this).field_g = new vo();
        ((om) this).field_u = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((om) this).field_l = param1;
                ((om) this).field_o = param0;
                if (null == ((om) this).field_l) {
                  break L2;
                } else {
                  ((om) this).field_e = true;
                  ((om) this).field_c = new vo();
                  if (ZombieDawn.field_J == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((om) this).field_e = false;
              break L1;
            }
            L3: {
              ((om) this).field_d = param3;
              ((om) this).field_f = param8;
              ((om) this).field_k = param6;
              ((om) this).field_t = param5;
              ((om) this).field_n = param4;
              ((om) this).field_q = param2;
              ((om) this).field_r = param7;
              if (((om) this).field_q != null) {
                ((om) this).field_s = (pj) (Object) ((om) this).field_n.a(((om) this).field_o, ((om) this).field_q, -105);
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var10;
            stackOut_10_1 = new StringBuilder().append("om.<init>(").append(param0).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L6;
            }
          }
          L7: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param4 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L7;
            }
          }
          L8: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param5).append(',');
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param6 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L8;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
    }
}
