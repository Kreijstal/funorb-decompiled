/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi extends ic {
    static int[] field_G;
    int field_H;
    static ka[] field_F;

    public static void h(int param0) {
        if (param0 != -1) {
            qe discarded$0 = hi.a(-17, -69, -84, 52, -66, 71);
        }
        field_F = null;
        field_G = null;
    }

    hi(ee param0) {
        super(param0.field_m, param0.field_i, param0.field_p, param0.field_l, (j) null, (gg) null);
        try {
            param0.a((byte) 112, 0, ((hi) this).field_l, ((hi) this).field_p, 0);
            ((hi) this).field_H = 256;
            ((hi) this).field_A = param0;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "hi.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
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
        int var32 = 0;
        int stackIn_46_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_95_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_93_0 = 0;
        var32 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = 5;
            var7 = 0;
            L1: while (true) {
              if (var7 >= var6) {
                L2: {
                  if (var5_int >= 3) {
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  var7 = vb.field_a[param3][param0];
                  var8 = 1 + var7;
                  var9 = -1 + var7;
                  var10 = gl.field_l[param3][param0][1][0];
                  var11 = gl.field_l[param3][param0][1][1];
                  if (param1 == 5446) {
                    break L3;
                  } else {
                    hi.h(-76);
                    break L3;
                  }
                }
                var12 = var11 - var10;
                if (0 >= var12) {
                  return;
                } else {
                  if (null != vk.field_i) {
                    L4: {
                      var13 = vk.field_i.field_o;
                      var14 = vk.field_i.field_H;
                      var15 = 1 + var13;
                      var16 = var13 + 2;
                      var17 = 0;
                      var18 = 0;
                      var19 = 0;
                      var20 = 0;
                      if (!pl.a(var14, -4346, var15)) {
                        var22 = ic.field_E[var15][var14];
                        if ((var22 & 1) >= -1) {
                          if (-1 < (var22 & 2)) {
                            var20 = 16;
                            break L4;
                          } else {
                            if ((4 & var22) > 0) {
                              var20 = 32;
                              break L4;
                            } else {
                              if (0 < (var22 & 8)) {
                                var20 = 48;
                                break L4;
                              } else {
                                var20 = 64;
                                break L4;
                              }
                            }
                          }
                        } else {
                          var20 = 0;
                          break L4;
                        }
                      } else {
                        var20 = 64;
                        break L4;
                      }
                    }
                    L5: {
                      var22 = var14 - -1;
                      var21 = pl.a(var22, -4346, var15) ? 1 : 0;
                      var23 = 0;
                      if (var21 != 0) {
                        break L5;
                      } else {
                        if (var20 != 64) {
                          break L5;
                        } else {
                          if (var22 >= ba.field_i.field_a) {
                            break L5;
                          } else {
                            var24 = ic.field_E[var15][var22];
                            if ((var24 & 1) > 0) {
                              var23 = 0;
                              break L5;
                            } else {
                              if (0 < (var24 & 2)) {
                                var23 = 16;
                                break L5;
                              } else {
                                if (0 >= (4 & var24)) {
                                  if (0 < (8 & var24)) {
                                    var23 = 48;
                                    break L5;
                                  } else {
                                    var23 = 64;
                                    break L5;
                                  }
                                } else {
                                  var23 = 32;
                                  break L5;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    L6: {
                      if (var14 != param4) {
                        if (var23 > 0) {
                          if (var22 == param4) {
                            stackOut_44_0 = 1;
                            stackIn_46_0 = stackOut_44_0;
                            break L6;
                          } else {
                            stackOut_43_0 = 0;
                            stackIn_46_0 = stackOut_43_0;
                            break L6;
                          }
                        } else {
                          stackOut_41_0 = 0;
                          stackIn_46_0 = stackOut_41_0;
                          break L6;
                        }
                      } else {
                        stackOut_39_0 = 1;
                        stackIn_46_0 = stackOut_39_0;
                        break L6;
                      }
                    }
                    var24 = stackIn_46_0;
                    if (var24 == 0) {
                      return;
                    } else {
                      L7: {
                        var25 = kj.field_C[0].field_v;
                        var26 = var23 + var20 + param2 - var25;
                        if (param4 == var22) {
                          var26 = var26 - var20;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      L8: {
                        var27 = 0;
                        var28 = 0;
                        if (param4 != var14) {
                          break L8;
                        } else {
                          var28 = 64 + param2;
                          var27 = var26;
                          break L8;
                        }
                      }
                      L9: {
                        if (param4 == var22) {
                          var28 = param2 + 64;
                          var27 = param2;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        if (64 <= var8) {
                          var8 -= 64;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        if (var9 < 0) {
                          var9 += 64;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      L12: {
                        if (64 > var15) {
                          break L12;
                        } else {
                          var16 -= 64;
                          break L12;
                        }
                      }
                      L13: {
                        if (64 > var16) {
                          break L13;
                        } else {
                          var16 -= 64;
                          break L13;
                        }
                      }
                      L14: {
                        L15: {
                          var24 = 0;
                          if (var15 == var9) {
                            break L15;
                          } else {
                            if (var16 != var9) {
                              break L14;
                            } else {
                              break L15;
                            }
                          }
                        }
                        var19 = 1;
                        break L14;
                      }
                      L16: {
                        L17: {
                          if (var15 == var7) {
                            break L17;
                          } else {
                            if (var7 != var16) {
                              break L16;
                            } else {
                              break L17;
                            }
                          }
                        }
                        var17 = 1;
                        break L16;
                      }
                      L18: {
                        L19: {
                          if (var15 == var8) {
                            break L19;
                          } else {
                            if (var8 != var16) {
                              break L18;
                            } else {
                              break L19;
                            }
                          }
                        }
                        var18 = 1;
                        break L18;
                      }
                      L20: {
                        if (var19 == 0) {
                          if (var17 == 0) {
                            if (var18 != 0) {
                              stackOut_85_0 = 1;
                              stackIn_87_0 = stackOut_85_0;
                              break L20;
                            } else {
                              stackOut_84_0 = 0;
                              stackIn_87_0 = stackOut_84_0;
                              break L20;
                            }
                          } else {
                            stackOut_82_0 = 1;
                            stackIn_87_0 = stackOut_82_0;
                            break L20;
                          }
                        } else {
                          stackOut_80_0 = 1;
                          stackIn_87_0 = stackOut_80_0;
                          break L20;
                        }
                      }
                      var24 = stackIn_87_0;
                      if (var24 != 0) {
                        L21: {
                          var29 = -1;
                          var30 = 1;
                          if (var5_int < 3) {
                            break L21;
                          } else {
                            if (!ol.field_a) {
                              L22: {
                                var29 = -(ef.field_k >> 8 << 8) + ef.field_k;
                                var30 = 2;
                                var29 = var29 + -128;
                                if (0 <= var29) {
                                  stackOut_94_0 = 1;
                                  stackIn_95_0 = stackOut_94_0;
                                  break L22;
                                } else {
                                  stackOut_93_0 = -1;
                                  stackIn_95_0 = stackOut_93_0;
                                  break L22;
                                }
                              }
                              L23: {
                                var31 = stackIn_95_0;
                                var29 = var29 * var31;
                                var29 = 2 * var29;
                                if (0 < var29) {
                                  var29--;
                                  break L23;
                                } else {
                                  break L23;
                                }
                              }
                              L24: {
                                if (var29 <= 1) {
                                  var29 = 2;
                                  break L24;
                                } else {
                                  break L24;
                                }
                              }
                              if (255 >= var29) {
                                break L21;
                              } else {
                                var29 = 255;
                                break L21;
                              }
                            } else {
                              ll.a(var27, var30, var10, var7, var19 != 0, var18 != 0, var17 != 0, var26, var29, var28, true, var11);
                              return;
                            }
                          }
                        }
                        ll.a(var27, var30, var10, var7, var19 != 0, var18 != 0, var17 != 0, var26, var29, var28, true, var11);
                        break L0;
                      } else {
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                }
              } else {
                L25: {
                  if ((1 << var7 & vi.field_a) > 0) {
                    var5_int++;
                    break L25;
                  } else {
                    break L25;
                  }
                }
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var5, "hi.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public hi() {
        super(0, 0, 0, 0, (j) null, (gg) null);
        ((hi) this).field_H = 256;
    }

    final static qe a(int param0, int param1, int param2, int param3, int param4, int param5) {
        Object var6 = null;
        qe var6_ref = null;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        qe var14 = null;
        int stackIn_26_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_43_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        L0: {
          var13 = TorChallenge.field_F ? 1 : 0;
          var6 = null;
          if (param4 > 90) {
            break L0;
          } else {
            hi.h(-111);
            break L0;
          }
        }
        var7 = null;
        var8 = 0;
        if (bi.field_g[param1][param5][param3] != null) {
          var8 = bi.field_g[param1][param5][param3][0];
          if (0 < var8) {
            if (8 >= var8) {
              var12 = 0;
              L1: while (true) {
                if (var12 >= var8) {
                  return (qe) var7;
                } else {
                  if (bi.field_g[param1][param5][param3][1 + var12] >= 0) {
                    if (ea.field_g.length > bi.field_g[param1][param5][param3][var12 - -1]) {
                      var14 = ea.field_g[bi.field_g[param1][param5][param3][var12 - -1]];
                      var6_ref = var14;
                      if (var6_ref != null) {
                        if (var14.field_o == param1) {
                          if (param5 == var14.field_H) {
                            L2: {
                              if (8 <= var14.field_F) {
                                if (21 >= var14.field_F) {
                                  stackOut_24_0 = 1;
                                  stackIn_26_0 = stackOut_24_0;
                                  break L2;
                                } else {
                                  stackOut_23_0 = 0;
                                  stackIn_26_0 = stackOut_23_0;
                                  break L2;
                                }
                              } else {
                                stackOut_21_0 = 0;
                                stackIn_26_0 = stackOut_21_0;
                                break L2;
                              }
                            }
                            L3: {
                              var9 = stackIn_26_0;
                              if (-14 != var14.field_L) {
                                if (var9 == 0) {
                                  if (-23 != var14.field_F) {
                                    stackOut_32_0 = 1;
                                    stackIn_34_0 = stackOut_32_0;
                                    break L3;
                                  } else {
                                    stackOut_31_0 = 0;
                                    stackIn_34_0 = stackOut_31_0;
                                    break L3;
                                  }
                                } else {
                                  stackOut_29_0 = 0;
                                  stackIn_34_0 = stackOut_29_0;
                                  break L3;
                                }
                              } else {
                                stackOut_27_0 = 0;
                                stackIn_34_0 = stackOut_27_0;
                                break L3;
                              }
                            }
                            L4: {
                              L5: {
                                var10 = stackIn_34_0;
                                if (13 == var14.field_L) {
                                  break L5;
                                } else {
                                  if (var14.field_db < 0) {
                                    break L5;
                                  } else {
                                    if (var14.field_F == 22) {
                                      break L5;
                                    } else {
                                      stackOut_37_0 = 0;
                                      stackIn_43_0 = stackOut_37_0;
                                      break L4;
                                    }
                                  }
                                }
                              }
                              if (var9 == 0) {
                                stackOut_41_0 = 1;
                                stackIn_43_0 = stackOut_41_0;
                                break L4;
                              } else {
                                stackOut_40_0 = 0;
                                stackIn_43_0 = stackOut_40_0;
                                break L4;
                              }
                            }
                            L6: {
                              L7: {
                                var11 = stackIn_43_0;
                                if (0 != param3) {
                                  break L7;
                                } else {
                                  if (var9 != 0) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              L8: {
                                if (param3 != 1) {
                                  break L8;
                                } else {
                                  if (var10 != 0) {
                                    break L6;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              if (param3 == 2) {
                                if (var11 != 0) {
                                  break L6;
                                } else {
                                  var12++;
                                  continue L1;
                                }
                              } else {
                                var12++;
                                continue L1;
                              }
                            }
                            var14.a(param0, param2, var14.field_B, var14.field_H, var14.field_o, var14.field_F, 2657, var14.field_u);
                            var14.a((byte) -117, param2, param0);
                            var7 = (Object) (Object) var6_ref;
                            var12++;
                            continue L1;
                          } else {
                            return null;
                          }
                        } else {
                          return null;
                        }
                      } else {
                        return null;
                      }
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        if (param3 != 0) {
            return;
        }
        if (null == ((hi) this).field_A) {
            return;
        }
        if (!(((hi) this).field_H != 0)) {
            return;
        }
        if (((hi) this).field_H == 256) {
            ((hi) this).field_A.a(((hi) this).field_i + param0, ((hi) this).field_m + param1, param2, param3);
            return;
        }
        ka var6 = new ka(((hi) this).field_A.field_p, ((hi) this).field_A.field_l);
        ad.a(-13, var6);
        ((hi) this).field_A.a(0, 0, param2, param3);
        int discarded$0 = -9;
        ie.b();
        var6.d(param1 + ((hi) this).field_m, param0 + ((hi) this).field_i, ((hi) this).field_H);
    }

    static {
    }
}
