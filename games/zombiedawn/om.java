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
            if (null != ((om) this).b((byte) -103)) {
              var2 = ((om) this).field_g.b((byte) 26);
              L0: while (true) {
                if (var2 == null) {
                  return;
                } else {
                  L1: {
                    L2: {
                      var3 = (int)var2.field_f;
                      if (0 > var3) {
                        break L2;
                      } else {
                        if (var3 >= ((om) this).field_h.field_s) {
                          break L2;
                        } else {
                          if (0 != ((om) this).field_h.field_t[var3]) {
                            L3: {
                              if (((om) this).field_j[var3] != 0) {
                                break L3;
                              } else {
                                pj discarded$2 = this.a(1, var3, param0 + 66);
                                break L3;
                              }
                            }
                            L4: {
                              if (((om) this).field_j[var3] == -1) {
                                pj discarded$3 = this.a(2, var3, 19);
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            if (1 != ((om) this).field_j[var3]) {
                              break L1;
                            } else {
                              var2.b(param0 + -27598);
                              break L1;
                            }
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                    var2.b(param0 + -27598);
                    break L1;
                  }
                  var2 = ((om) this).field_g.a(false);
                  continue L0;
                }
              }
            } else {
              return;
            }
          } else {
            return;
          }
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
        RuntimeException decompiledCaughtException = null;
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
              if (bi.field_b < var10) {
                var10 = bi.field_b;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var11 = param1 - (-param6 - param7);
              if (bi.field_l > var9) {
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
            var13 = 1;
            var14 = 0;
            var15 = 0;
            L5: while (true) {
              if (var15 >= 16) {
                L6: {
                  var15 = var10 + -var8_int;
                  var16 = -var9 + var11;
                  if (0 >= var15) {
                    break L6;
                  } else {
                    if (var16 > 0) {
                      var17 = new vn(var15, var16);
                      var18 = param6 * param6;
                      var19 = (param7 + param6) * (param6 - -param7);
                      var20 = 0;
                      var21 = -param1 + var9;
                      var22 = 0;
                      L7: while (true) {
                        if (var22 >= var16) {
                          var17.e(var8_int, var9);
                          break L0;
                        } else {
                          var23 = -param2 + var8_int;
                          var24 = var23 * var23 + var21 * var21;
                          var25 = 0;
                          L8: while (true) {
                            if (var25 >= var15) {
                              var22++;
                              var21++;
                              continue L7;
                            } else {
                              L9: {
                                var26 = var22 + var9;
                                var27 = var25 + var8_int;
                                if (var24 != 0) {
                                  if (var18 > var24) {
                                    L10: {
                                      var28 = uf.a(var24 << 12, 12832);
                                      var29 = -var28 + (param6 << 6);
                                      var30 = -((65536 + -fb.a(1311979239, (var29 << 7) / param6)) * param5 >> 11) + var28;
                                      var30 = var30 - na.field_c[var25 % 256 + var22 % 256 * 256];
                                      var27 = var23 * var30 / var28 + param2;
                                      var26 = param1 - -(var21 * var30 / var28);
                                      if (var27 < bi.field_g) {
                                        var27 = bi.field_g;
                                        break L10;
                                      } else {
                                        break L10;
                                      }
                                    }
                                    L11: {
                                      if (var26 < bi.field_l) {
                                        var26 = bi.field_l;
                                        break L11;
                                      } else {
                                        break L11;
                                      }
                                    }
                                    L12: {
                                      if (var27 < bi.field_b) {
                                        break L12;
                                      } else {
                                        var27 = -1 + bi.field_b;
                                        break L12;
                                      }
                                    }
                                    if (bi.field_d > var26) {
                                      break L9;
                                    } else {
                                      var26 = -1 + bi.field_d;
                                      break L9;
                                    }
                                  } else {
                                    if (var19 > var24) {
                                      L13: {
                                        var28 = uf.a(var24 << 12, 12832);
                                        var29 = -(param6 << 6) + var28;
                                        var30 = -(param5 * (-fb.a(1311979239, (var29 << 7) / param7) + 65536) >> 11) + var28;
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
                                      if (bi.field_d <= var26) {
                                        var26 = bi.field_d - 1;
                                        break L9;
                                      } else {
                                        var17.field_z[var20] = bi.field_c[var27 + bi.field_f * var26];
                                        var20++;
                                        var25++;
                                        var23++;
                                        var24 = var24 + (2 * var23 - 1);
                                        continue L8;
                                      }
                                    } else {
                                      break L9;
                                    }
                                  }
                                } else {
                                  break L9;
                                }
                              }
                              var17.field_z[var20] = bi.field_c[var27 + bi.field_f * var26];
                              var20++;
                              var25++;
                              var23++;
                              var24 = var24 + (2 * var23 - 1);
                              continue L8;
                            }
                          }
                        }
                      }
                    } else {
                      break L6;
                    }
                  }
                }
                return;
              } else {
                var16 = var15 * param4 >> 4;
                var12[var15] = hi.a(eg.a(-16711936, var16 * var13), eg.a(var16 * var14, 16711680)) >>> 8;
                var12[31 + -var15] = hi.a(eg.a(var13 * var16, -16711936), eg.a(var14 * var16, 16711680)) >>> 8;
                var15++;
                continue L5;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var8, "om.G(" + -1 + 44 + param1 + 44 + param2 + 44 + 1 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    final void a(boolean param0) {
        if (!(((om) this).field_l != null)) {
            return;
        }
        if (param0) {
            return;
        }
        ((om) this).field_m = true;
        if (!(((om) this).field_c != null)) {
            ((om) this).field_c = new vo();
        }
    }

    final byte[] a(int param0, byte param1) {
        pj var3 = this.a(0, param0, 118);
        if (param1 != 112) {
            return null;
        }
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.d(0);
        var3.b(-27598);
        return var4;
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
        int var11 = 0;
        Object stackIn_59_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_58_0 = null;
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
              if (param0 == 0) {
                L4: {
                  if (((om) this).field_l == null) {
                    break L4;
                  } else {
                    if (((om) this).field_j[param1] != -1) {
                      var4 = (Object) (Object) ((om) this).field_n.a(param1, ((om) this).field_l, -114);
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                if (!((om) this).field_d.b(111)) {
                  var4 = (Object) (Object) ((om) this).field_d.a((byte) 2, true, ((om) this).field_o, (byte) -128, param1);
                  break L3;
                } else {
                  return null;
                }
              } else {
                if (param0 != 1) {
                  if (param0 == 2) {
                    if (((om) this).field_l == null) {
                      throw new RuntimeException();
                    } else {
                      if (((om) this).field_j[param1] != -1) {
                        throw new RuntimeException();
                      } else {
                        if (!((om) this).field_d.a((byte) 123)) {
                          var4 = (Object) (Object) ((om) this).field_d.a((byte) 2, false, ((om) this).field_o, (byte) -88, param1);
                          break L3;
                        } else {
                          return null;
                        }
                      }
                    }
                  } else {
                    throw new RuntimeException();
                  }
                } else {
                  if (null == ((om) this).field_l) {
                    throw new RuntimeException();
                  } else {
                    var4 = (Object) (Object) ((om) this).field_n.a((byte) -119, ((om) this).field_l, param1);
                    break L3;
                  }
                }
              }
            }
            ((om) this).field_p.a(-110, (long)param1, (le) var4);
            break L2;
          }
        }
        if (!((pj) var4).field_q) {
          var5 = ((pj) var4).d(0);
          if (!(var4 instanceof wd)) {
            try {
              L5: {
                L6: {
                  if (var5 == null) {
                    break L6;
                  } else {
                    if (var5.length <= 2) {
                      break L6;
                    } else {
                      ep.field_h.reset();
                      ep.field_h.update(var5, 0, var5.length + -2);
                      var6_int = (int)ep.field_h.getValue();
                      if (((om) this).field_h.field_j[param1] == var6_int) {
                        L7: {
                          if (((om) this).field_h.field_f == null) {
                            break L7;
                          } else {
                            if (null == ((om) this).field_h.field_f[param1]) {
                              break L7;
                            } else {
                              var7 = ((om) this).field_h.field_f[param1];
                              var8 = nl.a(0, var5.length - 2, -116, var5);
                              var11 = 0;
                              var9 = var11;
                              L8: while (true) {
                                if (var11 >= 64) {
                                  break L7;
                                } else {
                                  if (var7[var11] == var8[var11]) {
                                    var11++;
                                    continue L8;
                                  } else {
                                    throw new RuntimeException();
                                  }
                                }
                              }
                            }
                          }
                        }
                        ((om) this).field_d.field_h = 0;
                        ((om) this).field_d.field_e = 0;
                        break L5;
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
              var6_ref = (RuntimeException) (Object) decompiledCaughtException;
              ((om) this).field_d.a(-90);
              ((pj) var4).b(-27598);
              if (((pj) var4).field_r) {
                if (!((om) this).field_d.b(127)) {
                  var4 = (Object) (Object) ((om) this).field_d.a((byte) 2, true, ((om) this).field_o, (byte) 111, param1);
                  ((om) this).field_p.a(-102, (long)param1, (le) var4);
                  return null;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
            L9: {
              var5[var5.length - 2] = (byte)(((om) this).field_h.field_c[param1] >>> 8);
              var5[-1 + var5.length] = (byte)((om) this).field_h.field_c[param1];
              if (((om) this).field_l == null) {
                break L9;
              } else {
                wd discarded$1 = ((om) this).field_n.a((byte) 63, param1, ((om) this).field_l, var5);
                if (1 != ((om) this).field_j[param1]) {
                  ((om) this).field_j[param1] = (byte) 1;
                  break L9;
                } else {
                  break L9;
                }
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
          } else {
            try {
              L11: {
                L12: {
                  if (var5 == null) {
                    break L12;
                  } else {
                    if (var5.length > 2) {
                      ep.field_h.reset();
                      ep.field_h.update(var5, 0, -2 + var5.length);
                      var6_int = (int)ep.field_h.getValue();
                      if (var6_int == ((om) this).field_h.field_j[param1]) {
                        L13: {
                          if (null == ((om) this).field_h.field_f) {
                            break L13;
                          } else {
                            if (null == ((om) this).field_h.field_f[param1]) {
                              break L13;
                            } else {
                              var7 = ((om) this).field_h.field_f[param1];
                              var8 = nl.a(0, -2 + var5.length, -119, var5);
                              var9 = 0;
                              L14: while (true) {
                                if (64 <= var9) {
                                  break L13;
                                } else {
                                  if (var7[var9] != var8[var9]) {
                                    throw new RuntimeException();
                                  } else {
                                    var9++;
                                    continue L14;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var7_int = (var5[var5.length + -1] & 255) + ((var5[-2 + var5.length] & 255) << 8);
                        if (var7_int == (65535 & ((om) this).field_h.field_c[param1])) {
                          L15: {
                            if (((om) this).field_j[param1] == 1) {
                              break L15;
                            } else {
                              L16: {
                                if (((om) this).field_j[param1] != 0) {
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                              ((om) this).field_j[param1] = (byte) 1;
                              break L15;
                            }
                          }
                          L17: {
                            if (((pj) var4).field_r) {
                              break L17;
                            } else {
                              ((pj) var4).b(-27598);
                              break L17;
                            }
                          }
                          stackOut_58_0 = var4;
                          stackIn_59_0 = stackOut_58_0;
                          break L11;
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      break L12;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L18: {
                var6 = (Exception) (Object) decompiledCaughtException;
                ((om) this).field_j[param1] = (byte) -1;
                ((pj) var4).b(-27598);
                if (((pj) var4).field_r) {
                  if (!((om) this).field_d.b(122)) {
                    var4 = (Object) (Object) ((om) this).field_d.a((byte) 2, true, ((om) this).field_o, (byte) -95, param1);
                    ((om) this).field_p.a(-108, (long)param1, (le) var4);
                    break L18;
                  } else {
                    return null;
                  }
                } else {
                  break L18;
                }
              }
              return null;
            }
            return (pj) (Object) stackIn_59_0;
          }
        } else {
          return null;
        }
    }

    final int a(int param0, int param1) {
        if (param0 > -76) {
            ((om) this).field_d = null;
        }
        pj var3 = (pj) (Object) ((om) this).field_p.a((long)param1, 54);
        if (var3 == null) {
            return 0;
        }
        return var3.e(-31478);
    }

    final void a(int param0) {
        int var2_int = 0;
        pj var2 = null;
        le var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = ZombieDawn.field_J;
        if (param0 > 13) {
          L0: {
            if (((om) this).field_c != null) {
              if (((om) this).b((byte) -23) == null) {
                return;
              } else {
                if (!((om) this).field_e) {
                  if (!((om) this).field_m) {
                    ((om) this).field_c = null;
                    break L0;
                  } else {
                    var2_int = 1;
                    var3 = ((om) this).field_c.b((byte) 26);
                    L1: while (true) {
                      if (var3 == null) {
                        L2: while (true) {
                          L3: {
                            if (((om) this).field_i >= ((om) this).field_h.field_t.length) {
                              break L3;
                            } else {
                              if (((om) this).field_h.field_t[((om) this).field_i] != 0) {
                                if (((om) this).field_d.a((byte) 121)) {
                                  var2_int = 0;
                                  break L3;
                                } else {
                                  L4: {
                                    if (1 != ((om) this).field_j[((om) this).field_i]) {
                                      pj discarded$4 = this.a(2, ((om) this).field_i, 72);
                                      break L4;
                                    } else {
                                      break L4;
                                    }
                                  }
                                  L5: {
                                    if (((om) this).field_j[((om) this).field_i] == 1) {
                                      break L5;
                                    } else {
                                      var3 = new le();
                                      var3.field_f = (long)((om) this).field_i;
                                      var2_int = 0;
                                      ((om) this).field_c.a(0, var3);
                                      break L5;
                                    }
                                  }
                                  ((om) this).field_i = ((om) this).field_i + 1;
                                  continue L2;
                                }
                              } else {
                                ((om) this).field_i = ((om) this).field_i + 1;
                                continue L2;
                              }
                            }
                          }
                          if (var2_int == 0) {
                            break L0;
                          } else {
                            ((om) this).field_m = false;
                            ((om) this).field_i = 0;
                            break L0;
                          }
                        }
                      } else {
                        L6: {
                          var4 = (int)var3.field_f;
                          if (((om) this).field_j[var4] == 1) {
                            break L6;
                          } else {
                            pj discarded$5 = this.a(2, var4, 127);
                            break L6;
                          }
                        }
                        L7: {
                          if (((om) this).field_j[var4] == 1) {
                            var3.b(-27598);
                            break L7;
                          } else {
                            var2_int = 0;
                            break L7;
                          }
                        }
                        var3 = ((om) this).field_c.a(false);
                        continue L1;
                      }
                    }
                  }
                } else {
                  var2_int = 1;
                  var3 = ((om) this).field_c.b((byte) 26);
                  L8: while (true) {
                    if (var3 == null) {
                      L9: while (true) {
                        L10: {
                          if (((om) this).field_h.field_t.length <= ((om) this).field_i) {
                            break L10;
                          } else {
                            L11: {
                              if (((om) this).field_h.field_t[((om) this).field_i] == 0) {
                                break L11;
                              } else {
                                if (((om) this).field_n.field_k >= 250) {
                                  var2_int = 0;
                                  break L10;
                                } else {
                                  L12: {
                                    if (((om) this).field_j[((om) this).field_i] == -1) {
                                      pj discarded$6 = this.a(1, ((om) this).field_i, 68);
                                      break L12;
                                    } else {
                                      break L12;
                                    }
                                  }
                                  if (-1 == ((om) this).field_j[((om) this).field_i]) {
                                    var3 = new le();
                                    var3.field_f = (long)((om) this).field_i;
                                    ((om) this).field_c.a(0, var3);
                                    var2_int = 0;
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                            }
                            ((om) this).field_i = ((om) this).field_i + 1;
                            continue L9;
                          }
                        }
                        if (var2_int == 0) {
                          break L0;
                        } else {
                          ((om) this).field_i = 0;
                          ((om) this).field_e = false;
                          break L0;
                        }
                      }
                    } else {
                      L13: {
                        var4 = (int)var3.field_f;
                        if (((om) this).field_j[var4] == 0) {
                          pj discarded$7 = this.a(1, var4, 106);
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      L14: {
                        if (0 != ((om) this).field_j[var4]) {
                          var3.b(-27598);
                          break L14;
                        } else {
                          var2_int = 0;
                          break L14;
                        }
                      }
                      var3 = ((om) this).field_c.a(false);
                      continue L8;
                    }
                  }
                }
              }
            } else {
              break L0;
            }
          }
          L15: {
            if (!((om) this).field_f) {
              break L15;
            } else {
              if (pd.a(-22826) >= ((om) this).field_u) {
                var2 = (pj) (Object) ((om) this).field_p.a((byte) -113);
                L16: while (true) {
                  if (var2 == null) {
                    ((om) this).field_u = 1000L + pd.a(-22826);
                    break L15;
                  } else {
                    L17: {
                      if (var2.field_q) {
                        break L17;
                      } else {
                        if (!var2.field_t) {
                          var2.field_t = true;
                          break L17;
                        } else {
                          if (!var2.field_r) {
                            throw new RuntimeException();
                          } else {
                            var2.b(-27598);
                            break L17;
                          }
                        }
                      }
                    }
                    var2 = (pj) (Object) ((om) this).field_p.b((byte) -40);
                    continue L16;
                  }
                }
              } else {
                break L15;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final jh b(byte param0) {
        int var2 = 0;
        byte[] var3 = null;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
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
                try {
                  L2: {
                    if (var3 == null) {
                      throw new RuntimeException();
                    } else {
                      ((om) this).field_h = new jh(var3, ((om) this).field_t, ((om) this).field_k);
                      break L2;
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var4 = decompiledCaughtException;
                    ((om) this).field_d.a(-126);
                    ((om) this).field_h = null;
                    if (((om) this).field_d.b(125)) {
                      ((om) this).field_s = null;
                      break L3;
                    } else {
                      ((om) this).field_s = (pj) (Object) ((om) this).field_d.a((byte) 0, true, 255, (byte) 107, ((om) this).field_o);
                      break L3;
                    }
                  }
                  return null;
                }
                if (((om) this).field_q != null) {
                  wd discarded$1 = ((om) this).field_n.a((byte) 95, ((om) this).field_o, ((om) this).field_q, var3);
                  break L1;
                } else {
                  break L1;
                }
              } else {
                try {
                  L4: {
                    if (var3 == null) {
                      throw new RuntimeException();
                    } else {
                      ((om) this).field_h = new jh(var3, ((om) this).field_t, ((om) this).field_k);
                      if (((om) this).field_r != ((om) this).field_h.field_e) {
                        throw new RuntimeException();
                      } else {
                        break L4;
                      }
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L5: {
                    var4 = decompiledCaughtException;
                    ((om) this).field_h = null;
                    if (!((om) this).field_d.b(107)) {
                      ((om) this).field_s = (pj) (Object) ((om) this).field_d.a((byte) 0, true, 255, (byte) 104, ((om) this).field_o);
                      break L5;
                    } else {
                      ((om) this).field_s = null;
                      break L5;
                    }
                  }
                  return null;
                }
                break L1;
              }
            }
            L6: {
              if (((om) this).field_l != null) {
                ((om) this).field_j = new byte[((om) this).field_h.field_s];
                break L6;
              } else {
                break L6;
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
        RuntimeException var10 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        ((om) this).field_p = new dl(16);
        ((om) this).field_i = 0;
        ((om) this).field_g = new vo();
        ((om) this).field_u = 0L;
        try {
          L0: {
            L1: {
              ((om) this).field_l = param1;
              ((om) this).field_o = param0;
              if (null == ((om) this).field_l) {
                ((om) this).field_e = false;
                break L1;
              } else {
                ((om) this).field_e = true;
                ((om) this).field_c = new vo();
                break L1;
              }
            }
            L2: {
              ((om) this).field_d = param3;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param8) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              ((om) this).field_f = stackIn_7_1 != 0;
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var10;
            stackOut_10_1 = new StringBuilder().append("om.<init>(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          L7: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          L8: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44).append(param5).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param6 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param7 + 44 + param8 + 41);
        }
    }

    static {
    }
}
