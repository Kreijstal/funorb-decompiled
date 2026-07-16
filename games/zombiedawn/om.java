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
        le var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = ZombieDawn.field_J;
        if (((om) this).field_c == null) {
          return;
        } else {
          if (param0 == 0) {
            if (null == ((om) this).b((byte) -103)) {
              return;
            } else {
              var2 = ((om) this).field_g.b((byte) 26);
              L0: while (true) {
                L1: {
                  if (var2 == null) {
                    break L1;
                  } else {
                    var3 = (int)var2.field_f;
                    if (var4 != 0) {
                      break L1;
                    } else {
                      L2: {
                        L3: {
                          L4: {
                            if (0 > var3) {
                              break L4;
                            } else {
                              if (var3 >= ((om) this).field_h.field_s) {
                                break L4;
                              } else {
                                if (0 != ((om) this).field_h.field_t[var3]) {
                                  break L3;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          var2.b(param0 + -27598);
                          if (var4 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                        L5: {
                          if (-1 != (((om) this).field_j[var3] ^ -1)) {
                            break L5;
                          } else {
                            pj discarded$2 = this.a(1, var3, param0 + 66);
                            break L5;
                          }
                        }
                        L6: {
                          if ((((om) this).field_j[var3] ^ -1) == 0) {
                            pj discarded$3 = this.a(2, var3, 19);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        if (1 != ((om) this).field_j[var3]) {
                          break L2;
                        } else {
                          var2.b(param0 + -27598);
                          break L2;
                        }
                      }
                      var2 = ((om) this).field_g.a(false);
                      if (var4 == 0) {
                        continue L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
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
        L0: {
          var31 = ZombieDawn.field_J;
          param5 = param5 << 1;
          var8 = param2 + -param6 + -param7;
          var9 = -param6 + (param1 + -param7);
          var10 = param6 + (param2 - -param7);
          if (var8 >= bi.field_g) {
            break L0;
          } else {
            var8 = bi.field_g;
            break L0;
          }
        }
        L1: {
          if (bi.field_b < var10) {
            var10 = bi.field_b;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var11 = param1 - (-param6 - param7);
          if (bi.field_l > var9) {
            var9 = bi.field_l;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (bi.field_d >= var11) {
            break L3;
          } else {
            var11 = bi.field_d;
            break L3;
          }
        }
        var12 = new int[32];
        var13 = 16711935 & param3;
        var14 = 65280 & param3;
        var15 = 0;
        L4: while (true) {
          L5: {
            if (var15 >= 16) {
              var15 = var10 + -var8;
              var16 = -var9 + var11;
              break L5;
            } else {
              var16 = var15 * param4 >> 1769613060;
              var12[var15] = hi.a(eg.a(-16711936, var16 * var13), eg.a(var16 * var14, 16711680)) >>> -490182104;
              var12[31 + -var15] = hi.a(eg.a(var13 * var16, -16711936), eg.a(var14 * var16, 16711680)) >>> -970951096;
              var15++;
              if (var31 != 0) {
                break L5;
              } else {
                continue L4;
              }
            }
          }
          if (0 < var15) {
            if (var16 > 0) {
              var17 = new vn(var15, var16);
              var18 = param6 * param6;
              var19 = (param7 + param6) * (param6 - -param7);
              var20 = 0;
              var21 = -param1 + var9;
              if (param0 == -1) {
                var22 = 0;
                L6: while (true) {
                  L7: {
                    L8: {
                      if (var22 >= var16) {
                        break L8;
                      } else {
                        var23 = -param2 + var8;
                        var24 = var23 * var23 + var21 * var21;
                        if (var31 != 0) {
                          break L7;
                        } else {
                          var25 = 0;
                          L9: while (true) {
                            L10: {
                              if (var25 >= var15) {
                                break L10;
                              } else {
                                L11: {
                                  var26 = var22 + var9;
                                  var27 = var25 + var8;
                                  if ((var24 ^ -1) != -1) {
                                    L12: {
                                      if (var18 > var24) {
                                        break L12;
                                      } else {
                                        if (var19 > var24) {
                                          L13: {
                                            var28 = uf.a(var24 << -1068723956, 12832);
                                            var29 = -(param6 << 244116038) + var28;
                                            var30 = -(param5 * (-fb.a(1311979239, (var29 << 692082087) / param7) + 65536) >> 1130402539) + var28;
                                            var26 = param1 - -(var30 * var21 / var28);
                                            var27 = param2 - -(var23 * var30 / var28);
                                            if (bi.field_l <= var26) {
                                              break L13;
                                            } else {
                                              var26 = bi.field_l;
                                              break L13;
                                            }
                                          }
                                          L14: {
                                            if (bi.field_g > var27) {
                                              var27 = bi.field_g;
                                              break L14;
                                            } else {
                                              break L14;
                                            }
                                          }
                                          L15: {
                                            if (var27 >= bi.field_b) {
                                              var27 = -1 + bi.field_b;
                                              break L15;
                                            } else {
                                              break L15;
                                            }
                                          }
                                          L16: {
                                            if (bi.field_d <= var26) {
                                              var26 = bi.field_d - 1;
                                              break L16;
                                            } else {
                                              break L16;
                                            }
                                          }
                                          if (var31 == 0) {
                                            break L11;
                                          } else {
                                            break L12;
                                          }
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    L17: {
                                      var28 = uf.a(var24 << 877470188, 12832);
                                      var29 = -var28 + (param6 << 933090758);
                                      var30 = -((65536 + -fb.a(1311979239, (var29 << 2021227623) / param6)) * param5 >> -600975317) + var28;
                                      var30 = var30 - na.field_c[var25 % 256 + var22 % 256 * 256];
                                      var27 = var23 * var30 / var28 + param2;
                                      var26 = param1 - -(var21 * var30 / var28);
                                      if (var27 < bi.field_g) {
                                        var27 = bi.field_g;
                                        break L17;
                                      } else {
                                        break L17;
                                      }
                                    }
                                    L18: {
                                      if (var26 < bi.field_l) {
                                        var26 = bi.field_l;
                                        break L18;
                                      } else {
                                        break L18;
                                      }
                                    }
                                    L19: {
                                      if (var27 < bi.field_b) {
                                        break L19;
                                      } else {
                                        var27 = -1 + bi.field_b;
                                        break L19;
                                      }
                                    }
                                    if (bi.field_d > var26) {
                                      break L11;
                                    } else {
                                      var26 = -1 + bi.field_d;
                                      break L11;
                                    }
                                  } else {
                                    break L11;
                                  }
                                }
                                var17.field_z[var20] = bi.field_c[var27 + bi.field_f * var26];
                                var20++;
                                var25++;
                                var23++;
                                var24 = var24 + (2 * var23 - 1);
                                if (var31 == 0) {
                                  continue L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            var22++;
                            var21++;
                            if (var31 == 0) {
                              continue L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                    }
                    var17.e(var8, var9);
                    break L7;
                  }
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final void a(boolean param0) {
        if (((om) this).field_l == null) {
          return;
        } else {
          if (param0) {
            return;
          } else {
            L0: {
              ((om) this).field_m = true;
              if (((om) this).field_c == null) {
                ((om) this).field_c = new vo();
                break L0;
              } else {
                break L0;
              }
            }
            return;
          }
        }
    }

    final byte[] a(int param0, byte param1) {
        pj var3 = null;
        byte[] var4 = null;
        var3 = this.a(0, param0, 118);
        if (param1 == 112) {
          if (var3 == null) {
            return null;
          } else {
            var4 = var3.d(0);
            var3.b(-27598);
            return var4;
          }
        } else {
          return null;
        }
    }

    private final pj a(int param0, int param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        Exception var6_ref_Exception = null;
        int var6 = 0;
        int var7_int = 0;
        byte[] var7 = null;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        Object stackIn_62_0 = null;
        int stackIn_79_0 = 0;
        byte stackIn_79_1 = 0;
        int stackIn_88_0 = 0;
        byte stackIn_88_1 = 0;
        int stackIn_98_0 = 0;
        byte stackIn_98_1 = 0;
        byte stackIn_105_0 = 0;
        byte stackIn_105_1 = 0;
        byte stackIn_111_0 = 0;
        byte stackIn_111_1 = 0;
        Throwable decompiledCaughtException = null;
        byte stackOut_104_0 = 0;
        byte stackOut_104_1 = 0;
        int stackOut_97_0 = 0;
        byte stackOut_97_1 = 0;
        int stackOut_87_0 = 0;
        byte stackOut_87_1 = 0;
        int stackOut_78_0 = 0;
        byte stackOut_78_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        Object stackOut_61_0 = null;
        L0: {
          var10 = ZombieDawn.field_J;
          if (param2 >= 10) {
            break L0;
          } else {
            ((om) this).field_l = null;
            break L0;
          }
        }
        L1: {
          var4 = (Object) (Object) (pj) (Object) ((om) this).field_p.a((long)param1, 56);
          if (var4 == null) {
            break L1;
          } else {
            if (param0 != 0) {
              break L1;
            } else {
              if (((pj) var4).field_r) {
                break L1;
              } else {
                if (!((pj) var4).field_q) {
                  break L1;
                } else {
                  ((pj) var4).b(-27598);
                  var4 = null;
                  break L1;
                }
              }
            }
          }
        }
        L2: {
          if (var4 != null) {
            break L2;
          } else {
            L3: {
              L4: {
                if (param0 == 0) {
                  break L4;
                } else {
                  L5: {
                    if ((param0 ^ -1) != -2) {
                      break L5;
                    } else {
                      if (null == ((om) this).field_l) {
                        throw new RuntimeException();
                      } else {
                        var4 = (Object) (Object) ((om) this).field_n.a((byte) -119, ((om) this).field_l, param1);
                        if (var10 == 0) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  if (-3 == (param0 ^ -1)) {
                    if (((om) this).field_l == null) {
                      throw new RuntimeException();
                    } else {
                      if (0 != (((om) this).field_j[param1] ^ -1)) {
                        throw new RuntimeException();
                      } else {
                        if (!((om) this).field_d.a((byte) 123)) {
                          var4 = (Object) (Object) ((om) this).field_d.a((byte) 2, false, ((om) this).field_o, (byte) -88, param1);
                          break L4;
                        } else {
                          return null;
                        }
                      }
                    }
                  } else {
                    throw new RuntimeException();
                  }
                }
              }
              L6: {
                if (((om) this).field_l == null) {
                  break L6;
                } else {
                  if ((((om) this).field_j[param1] ^ -1) != 0) {
                    var4 = (Object) (Object) ((om) this).field_n.a(param1, ((om) this).field_l, -114);
                    break L3;
                  } else {
                    break L6;
                  }
                }
              }
              if (((om) this).field_d.b(111)) {
                return null;
              } else {
                var4 = (Object) (Object) ((om) this).field_d.a((byte) 2, true, ((om) this).field_o, (byte) -128, param1);
                return null;
              }
            }
            ((om) this).field_p.a(-110, (long)param1, (le) var4);
            break L2;
          }
        }
        if (!((pj) var4).field_q) {
          var5 = ((pj) var4).d(0);
          if (!(var4 instanceof wd)) {
            L7: {
              if (var5 == null) {
                break L7;
              } else {
                if (-3 <= (var5.length ^ -1)) {
                  break L7;
                } else {
                  ep.field_h.reset();
                  ep.field_h.update(var5, 0, var5.length + -2);
                  var6 = (int)ep.field_h.getValue();
                  if (((om) this).field_h.field_j[param1] == var6) {
                    if (((om) this).field_h.field_f != null) {
                      if (null != ((om) this).field_h.field_f[param1]) {
                        var7 = ((om) this).field_h.field_f[param1];
                        var8 = nl.a(0, var5.length - 2, -116, var5);
                        var9 = 0;
                        L8: while (true) {
                          if ((var9 ^ -1) > -65) {
                            stackOut_104_0 = var7[var9];
                            stackOut_104_1 = var8[var9];
                            stackIn_111_0 = stackOut_104_0;
                            stackIn_111_1 = stackOut_104_1;
                            stackIn_105_0 = stackOut_104_0;
                            stackIn_105_1 = stackOut_104_1;
                            if (var10 == 0) {
                              if (stackIn_111_0 == stackIn_111_1) {
                                var9++;
                                continue L8;
                              } else {
                                throw new RuntimeException();
                              }
                            } else {
                              L9: {
                                if (stackIn_105_0 != stackIn_105_1) {
                                  ((om) this).field_j[param1] = (byte) 1;
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              L10: {
                                if (((pj) var4).field_r) {
                                  break L10;
                                } else {
                                  ((pj) var4).b(-27598);
                                  break L10;
                                }
                              }
                              return (pj) var4;
                            }
                          } else {
                            L11: {
                              ((om) this).field_d.field_h = 0;
                              ((om) this).field_d.field_e = 0;
                              var5[var5.length - 2] = (byte)(((om) this).field_h.field_c[param1] >>> 868980712);
                              var5[-1 + var5.length] = (byte)((om) this).field_h.field_c[param1];
                              if (((om) this).field_l == null) {
                                break L11;
                              } else {
                                wd discarded$3 = ((om) this).field_n.a((byte) 63, param1, ((om) this).field_l, var5);
                                stackOut_97_0 = 1;
                                stackOut_97_1 = ((om) this).field_j[param1];
                                stackIn_98_0 = stackOut_97_0;
                                stackIn_98_1 = stackOut_97_1;
                                if (stackIn_98_0 != stackIn_98_1) {
                                  ((om) this).field_j[param1] = (byte) 1;
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            L12: {
                              if (((pj) var4).field_r) {
                                break L12;
                              } else {
                                ((pj) var4).b(-27598);
                                break L12;
                              }
                            }
                            return (pj) var4;
                          }
                        }
                      } else {
                        L13: {
                          ((om) this).field_d.field_h = 0;
                          ((om) this).field_d.field_e = 0;
                          var5[var5.length - 2] = (byte)(((om) this).field_h.field_c[param1] >>> 868980712);
                          var5[-1 + var5.length] = (byte)((om) this).field_h.field_c[param1];
                          if (((om) this).field_l == null) {
                            break L13;
                          } else {
                            wd discarded$4 = ((om) this).field_n.a((byte) 63, param1, ((om) this).field_l, var5);
                            stackOut_87_0 = 1;
                            stackOut_87_1 = ((om) this).field_j[param1];
                            stackIn_88_0 = stackOut_87_0;
                            stackIn_88_1 = stackOut_87_1;
                            if (stackIn_88_0 != stackIn_88_1) {
                              ((om) this).field_j[param1] = (byte) 1;
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                        }
                        L14: {
                          if (((pj) var4).field_r) {
                            break L14;
                          } else {
                            ((pj) var4).b(-27598);
                            break L14;
                          }
                        }
                        return (pj) var4;
                      }
                    } else {
                      L15: {
                        ((om) this).field_d.field_h = 0;
                        ((om) this).field_d.field_e = 0;
                        var5[var5.length - 2] = (byte)(((om) this).field_h.field_c[param1] >>> 868980712);
                        var5[-1 + var5.length] = (byte)((om) this).field_h.field_c[param1];
                        if (((om) this).field_l == null) {
                          break L15;
                        } else {
                          wd discarded$5 = ((om) this).field_n.a((byte) 63, param1, ((om) this).field_l, var5);
                          stackOut_78_0 = 1;
                          stackOut_78_1 = ((om) this).field_j[param1];
                          stackIn_79_0 = stackOut_78_0;
                          stackIn_79_1 = stackOut_78_1;
                          if (stackIn_79_0 != stackIn_79_1) {
                            ((om) this).field_j[param1] = (byte) 1;
                            break L15;
                          } else {
                            break L15;
                          }
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
                      return (pj) var4;
                    }
                  } else {
                    throw new RuntimeException();
                  }
                }
              }
            }
            throw new RuntimeException();
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
                      var6 = (int)ep.field_h.getValue();
                      if (var6 == ((om) this).field_h.field_j[param1]) {
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
                                    stackOut_47_0 = var7[var9] ^ -1;
                                    stackOut_47_1 = var8[var9] ^ -1;
                                    stackIn_53_0 = stackOut_47_0;
                                    stackIn_53_1 = stackOut_47_1;
                                    stackIn_48_0 = stackOut_47_0;
                                    stackIn_48_1 = stackOut_47_1;
                                    if (var10 != 0) {
                                      break L19;
                                    } else {
                                      if (stackIn_48_0 != stackIn_48_1) {
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
                          stackOut_52_0 = var5[var5.length + -1] & 255;
                          stackOut_52_1 = (var5[-2 + var5.length] & 255) << 1765208200;
                          stackIn_53_0 = stackOut_52_0;
                          stackIn_53_1 = stackOut_52_1;
                          break L19;
                        }
                        var7_int = stackIn_53_0 + stackIn_53_1;
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
                          stackOut_61_0 = var4;
                          stackIn_62_0 = stackOut_61_0;
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
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6_ref_Exception = (Exception) (Object) decompiledCaughtException;
              ((om) this).field_j[param1] = (byte)-1;
              ((pj) var4).b(-27598);
              if (((pj) var4).field_r) {
                if (((om) this).field_d.b(122)) {
                  return null;
                } else {
                  var4 = (Object) (Object) ((om) this).field_d.a((byte) 2, true, ((om) this).field_o, (byte) -95, param1);
                  ((om) this).field_p.a(-108, (long)param1, (le) var4);
                  return null;
                }
              } else {
                return null;
              }
            }
            return (pj) (Object) stackIn_62_0;
          }
        } else {
          return null;
        }
    }

    final int a(int param0, int param1) {
        pj var3 = null;
        L0: {
          if (param0 <= -76) {
            break L0;
          } else {
            ((om) this).field_d = null;
            break L0;
          }
        }
        var3 = (pj) (Object) ((om) this).field_p.a((long)param1, 54);
        if (var3 == null) {
          return 0;
        } else {
          return var3.e(-31478);
        }
    }

    final void a(int param0) {
        int var2_int = 0;
        pj var2 = null;
        le var3 = null;
        int var4 = 0;
        int var5 = 0;
        byte stackIn_11_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_94_1 = 0;
        int stackIn_99_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_103_0 = 0;
        byte stackOut_10_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_92_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_96_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_63_0 = 0;
        var5 = ZombieDawn.field_J;
        if (param0 > 13) {
          L0: {
            if (((om) this).field_c != null) {
              if (((om) this).b((byte) -23) == null) {
                return;
              } else {
                L1: {
                  if (!((om) this).field_e) {
                    break L1;
                  } else {
                    var2_int = 1;
                    var3 = ((om) this).field_c.b((byte) 26);
                    L2: while (true) {
                      L3: {
                        L4: {
                          L5: {
                            L6: {
                              L7: {
                                if (var3 == null) {
                                  break L7;
                                } else {
                                  var4 = (int)var3.field_f;
                                  stackOut_10_0 = ((om) this).field_j[var4];
                                  stackIn_103_0 = stackOut_10_0;
                                  stackIn_11_0 = stackOut_10_0;
                                  if (var5 != 0) {
                                    L8: while (true) {
                                      if (stackIn_103_0 <= ((om) this).field_i) {
                                        break L4;
                                      } else {
                                        stackOut_101_0 = ((om) this).field_h.field_t[((om) this).field_i];
                                        stackIn_35_0 = stackOut_101_0;
                                        stackIn_102_0 = stackOut_101_0;
                                        if (var5 != 0) {
                                          break L3;
                                        } else {
                                          stackOut_102_0 = stackIn_102_0;
                                          stackIn_99_0 = stackOut_102_0;
                                          if (stackIn_99_0 == 0) {
                                            ((om) this).field_i = ((om) this).field_i + 1;
                                            if (var5 == 0) {
                                              stackOut_105_0 = ((om) this).field_h.field_t.length;
                                              stackIn_103_0 = stackOut_105_0;
                                              continue L8;
                                            } else {
                                              break L5;
                                            }
                                          } else {
                                            break L6;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    L9: {
                                      if (stackIn_11_0 == 0) {
                                        pj discarded$4 = this.a(1, var4, 106);
                                        break L9;
                                      } else {
                                        break L9;
                                      }
                                    }
                                    L10: {
                                      L11: {
                                        if (0 != ((om) this).field_j[var4]) {
                                          break L11;
                                        } else {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L10;
                                          } else {
                                            break L11;
                                          }
                                        }
                                      }
                                      var3.b(-27598);
                                      break L10;
                                    }
                                    var3 = ((om) this).field_c.a(false);
                                    if (var5 == 0) {
                                      continue L2;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              L12: while (true) {
                                if (((om) this).field_h.field_t.length <= ((om) this).field_i) {
                                  break L4;
                                } else {
                                  stackOut_20_0 = ((om) this).field_h.field_t[((om) this).field_i];
                                  stackIn_35_0 = stackOut_20_0;
                                  stackIn_21_0 = stackOut_20_0;
                                  if (var5 != 0) {
                                    break L3;
                                  } else {
                                    if (stackIn_21_0 == 0) {
                                      ((om) this).field_i = ((om) this).field_i + 1;
                                      if (var5 == 0) {
                                        continue L12;
                                      } else {
                                        break L5;
                                      }
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                            }
                            break L5;
                          }
                          L13: {
                            if ((((om) this).field_n.field_k ^ -1) <= -251) {
                              var2_int = 0;
                              if (var5 == 0) {
                                break L4;
                              } else {
                                break L13;
                              }
                            } else {
                              break L13;
                            }
                          }
                          L14: {
                            if (((om) this).field_j[((om) this).field_i] == -1) {
                              pj discarded$5 = this.a(1, ((om) this).field_i, 68);
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                          L15: {
                            if (-1 == ((om) this).field_j[((om) this).field_i]) {
                              var3 = new le();
                              var3.field_f = (long)((om) this).field_i;
                              ((om) this).field_c.a(0, var3);
                              var2_int = 0;
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          ((om) this).field_i = ((om) this).field_i + 1;
                          break L4;
                        }
                        stackOut_34_0 = var2_int;
                        stackIn_35_0 = stackOut_34_0;
                        break L3;
                      }
                      L16: {
                        if (stackIn_35_0 == 0) {
                          break L16;
                        } else {
                          ((om) this).field_i = 0;
                          ((om) this).field_e = false;
                          break L16;
                        }
                      }
                      if (var5 == 0) {
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                L17: {
                  if (!((om) this).field_m) {
                    break L17;
                  } else {
                    var2_int = 1;
                    var3 = ((om) this).field_c.b((byte) 26);
                    L18: while (true) {
                      L19: {
                        L20: {
                          L21: {
                            L22: {
                              L23: {
                                if (var3 == null) {
                                  break L23;
                                } else {
                                  var4 = (int)var3.field_f;
                                  stackOut_41_0 = -2;
                                  stackOut_41_1 = ((om) this).field_j[var4] ^ -1;
                                  stackIn_94_0 = stackOut_41_0;
                                  stackIn_94_1 = stackOut_41_1;
                                  stackIn_42_0 = stackOut_41_0;
                                  stackIn_42_1 = stackOut_41_1;
                                  if (var5 != 0) {
                                    L24: while (true) {
                                      if (stackIn_94_0 >= stackIn_94_1) {
                                        break L20;
                                      } else {
                                        stackOut_92_0 = ((om) this).field_h.field_t[((om) this).field_i];
                                        stackIn_64_0 = stackOut_92_0;
                                        stackIn_93_0 = stackOut_92_0;
                                        if (var5 != 0) {
                                          break L19;
                                        } else {
                                          stackOut_93_0 = stackIn_93_0;
                                          stackIn_90_0 = stackOut_93_0;
                                          if (stackIn_90_0 != 0) {
                                            break L21;
                                          } else {
                                            ((om) this).field_i = ((om) this).field_i + 1;
                                            if (var5 == 0) {
                                              stackOut_96_0 = ((om) this).field_i;
                                              stackOut_96_1 = ((om) this).field_h.field_t.length;
                                              stackIn_94_0 = stackOut_96_0;
                                              stackIn_94_1 = stackOut_96_1;
                                              continue L24;
                                            } else {
                                              break L22;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    L25: {
                                      if (stackIn_42_0 == stackIn_42_1) {
                                        break L25;
                                      } else {
                                        pj discarded$6 = this.a(2, var4, 127);
                                        break L25;
                                      }
                                    }
                                    L26: {
                                      L27: {
                                        if ((((om) this).field_j[var4] ^ -1) == -2) {
                                          break L27;
                                        } else {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L26;
                                          } else {
                                            break L27;
                                          }
                                        }
                                      }
                                      var3.b(-27598);
                                      break L26;
                                    }
                                    var3 = ((om) this).field_c.a(false);
                                    if (var5 == 0) {
                                      continue L18;
                                    } else {
                                      break L23;
                                    }
                                  }
                                }
                              }
                              L28: while (true) {
                                if (((om) this).field_i >= ((om) this).field_h.field_t.length) {
                                  break L20;
                                } else {
                                  stackOut_50_0 = ((om) this).field_h.field_t[((om) this).field_i];
                                  stackIn_64_0 = stackOut_50_0;
                                  stackIn_51_0 = stackOut_50_0;
                                  if (var5 != 0) {
                                    break L19;
                                  } else {
                                    if (stackIn_51_0 != 0) {
                                      break L21;
                                    } else {
                                      ((om) this).field_i = ((om) this).field_i + 1;
                                      if (var5 == 0) {
                                        continue L28;
                                      } else {
                                        break L22;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            break L21;
                          }
                          L29: {
                            if (((om) this).field_d.a((byte) 121)) {
                              var2_int = 0;
                              if (var5 == 0) {
                                break L20;
                              } else {
                                break L29;
                              }
                            } else {
                              break L29;
                            }
                          }
                          L30: {
                            if (1 != ((om) this).field_j[((om) this).field_i]) {
                              pj discarded$7 = this.a(2, ((om) this).field_i, 72);
                              break L30;
                            } else {
                              break L30;
                            }
                          }
                          L31: {
                            if (((om) this).field_j[((om) this).field_i] == 1) {
                              break L31;
                            } else {
                              var3 = new le();
                              var3.field_f = (long)((om) this).field_i;
                              var2_int = 0;
                              ((om) this).field_c.a(0, var3);
                              break L31;
                            }
                          }
                          ((om) this).field_i = ((om) this).field_i + 1;
                          break L20;
                        }
                        stackOut_63_0 = var2_int;
                        stackIn_64_0 = stackOut_63_0;
                        break L19;
                      }
                      L32: {
                        if (stackIn_64_0 == 0) {
                          break L32;
                        } else {
                          ((om) this).field_m = false;
                          ((om) this).field_i = 0;
                          break L32;
                        }
                      }
                      if (var5 == 0) {
                        break L0;
                      } else {
                        break L17;
                      }
                    }
                  }
                }
                ((om) this).field_c = null;
                break L0;
              }
            } else {
              break L0;
            }
          }
          if (((om) this).field_f) {
            if (pd.a(-22826) >= ((om) this).field_u) {
              var2 = (pj) (Object) ((om) this).field_p.a((byte) -113);
              L33: while (true) {
                if (var2 != null) {
                  if (var5 == 0) {
                    L34: {
                      if (var2.field_q) {
                        break L34;
                      } else {
                        L35: {
                          if (!var2.field_t) {
                            break L35;
                          } else {
                            if (!var2.field_r) {
                              throw new RuntimeException();
                            } else {
                              var2.b(-27598);
                              if (var5 == 0) {
                                break L34;
                              } else {
                                break L35;
                              }
                            }
                          }
                        }
                        var2.field_t = true;
                        break L34;
                      }
                    }
                    var2 = (pj) (Object) ((om) this).field_p.b((byte) -40);
                    continue L33;
                  } else {
                    return;
                  }
                } else {
                  ((om) this).field_u = 1000L + pd.a(-22826);
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final jh b(byte param0) {
        int var2 = 0;
        byte[] var3 = null;
        int var5 = 0;
        var5 = ZombieDawn.field_J;
        if (((om) this).field_h == null) {
          L0: {
            var2 = -95 % ((47 - param0) / 49);
            if (null != ((om) this).field_s) {
              break L0;
            } else {
              if (!((om) this).field_d.b(120)) {
                ((om) this).field_s = (pj) (Object) ((om) this).field_d.a((byte) 0, true, 255, (byte) 70, ((om) this).field_o);
                break L0;
              } else {
                return null;
              }
            }
          }
          if (!((om) this).field_s.field_q) {
            L1: {
              var3 = ((om) this).field_s.d(0);
              if (!(((om) this).field_s instanceof wd)) {
                if (var3 == null) {
                  throw new RuntimeException();
                } else {
                  ((om) this).field_h = new jh(var3, ((om) this).field_t, ((om) this).field_k);
                  if (((om) this).field_q != null) {
                    wd discarded$1 = ((om) this).field_n.a((byte) 95, ((om) this).field_o, ((om) this).field_q, var3);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                if (var3 == null) {
                  throw new RuntimeException();
                } else {
                  ((om) this).field_h = new jh(var3, ((om) this).field_t, ((om) this).field_k);
                  if (((om) this).field_r != ((om) this).field_h.field_e) {
                    throw new RuntimeException();
                  } else {
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (((om) this).field_l != null) {
                ((om) this).field_j = new byte[((om) this).field_h.field_s];
                break L2;
              } else {
                break L2;
              }
            }
            ((om) this).field_s = null;
            return ((om) this).field_h;
          } else {
            return null;
          }
        } else {
          return ((om) this).field_h;
        }
    }

    om(int param0, na param1, na param2, pc param3, sh param4, int param5, byte[] param6, int param7, boolean param8) {
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        L0: {
          L1: {
            ((om) this).field_p = new dl(16);
            ((om) this).field_i = 0;
            ((om) this).field_g = new vo();
            ((om) this).field_u = 0L;
            ((om) this).field_l = param1;
            ((om) this).field_o = param0;
            if (null == ((om) this).field_l) {
              break L1;
            } else {
              ((om) this).field_e = true;
              ((om) this).field_c = new vo();
              if (ZombieDawn.field_J == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          ((om) this).field_e = false;
          break L0;
        }
        L2: {
          ((om) this).field_d = param3;
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (!param8) {
            stackOut_5_0 = this;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L2;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L2;
          }
        }
        L3: {
          ((om) this).field_f = stackIn_6_1 != 0;
          ((om) this).field_k = param6;
          ((om) this).field_t = param5;
          ((om) this).field_n = param4;
          ((om) this).field_q = param2;
          ((om) this).field_r = param7;
          if (((om) this).field_q == null) {
            break L3;
          } else {
            ((om) this).field_s = (pj) (Object) ((om) this).field_n.a(((om) this).field_o, ((om) this).field_q, -105);
            break L3;
          }
        }
    }

    static {
    }
}
