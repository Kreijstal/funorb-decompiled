/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lra extends fh {
    private le field_m;
    static String field_o;
    private int[] field_n;
    private int[] field_l;
    private le[] field_q;
    private le field_k;
    private le field_p;

    final float[] a(int param0, int param1, d param2, boolean param3, asb param4, int param5) {
        int var7_int = 0;
        float[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15_ref_int__ = null;
        int[][] var15_ref_int____ = null;
        int var15 = 0;
        float var16 = 0.0f;
        float var17 = 0.0f;
        int var18 = 0;
        int[][] var19 = null;
        float[] var20 = null;
        int var21 = 0;
        int[][] var22 = null;
        int[][] var23 = null;
        int[][] var24 = null;
        int[][] var25 = null;
        var18 = VoidHunters.field_G;
        qnb.field_o = param4;
        nl.field_e = param2;
        var7_int = 0;
        L0: while (true) {
          if (((lra) this).field_q.length <= var7_int) {
            hr.a(param5, param1, -116);
            var20 = new float[4 * (param1 * param5)];
            var7 = var20;
            var8 = 0;
            var9 = 0;
            L1: while (true) {
              if (var9 >= param5) {
                var21 = 0;
                var9 = var21;
                L2: while (true) {
                  if (var21 >= ((lra) this).field_q.length) {
                    L3: {
                      if (param0 == 2) {
                        break L3;
                      } else {
                        lra.a(false);
                        break L3;
                      }
                    }
                    return var7;
                  } else {
                    ((lra) this).field_q[var21].c(-36);
                    var21++;
                    continue L2;
                  }
                }
              } else {
                L4: {
                  if (((lra) this).field_m.field_g) {
                    var15_ref_int__ = ((lra) this).field_m.a(var9, true);
                    var12 = var15_ref_int__;
                    var11 = var15_ref_int__;
                    var10 = var15_ref_int__;
                    break L4;
                  } else {
                    var25 = ((lra) this).field_m.a(255, var9);
                    var24 = var25;
                    var23 = var24;
                    var22 = var23;
                    var19 = var22;
                    var15_ref_int____ = var19;
                    var11 = var25[1];
                    var10 = var25[0];
                    var12 = var25[2];
                    break L4;
                  }
                }
                L5: {
                  if (((lra) this).field_p.field_g) {
                    var13 = ((lra) this).field_p.a(var9, true);
                    break L5;
                  } else {
                    var13 = ((lra) this).field_p.a(255, var9)[0];
                    break L5;
                  }
                }
                L6: {
                  if (!param3) {
                    break L6;
                  } else {
                    var8 = var9 << -300082078;
                    break L6;
                  }
                }
                L7: {
                  if (((lra) this).field_k.field_g) {
                    var14 = ((lra) this).field_k.a(var9, true);
                    break L7;
                  } else {
                    var14 = ((lra) this).field_k.a(255, var9)[0];
                    break L7;
                  }
                }
                var15 = param1 - 1;
                L8: while (true) {
                  if (0 > var15) {
                    var9++;
                    continue L1;
                  } else {
                    L9: {
                      var16 = (float)var13[var15] / 4096.0f;
                      var17 = (31.0f * (float)var14[var15] / 4096.0f + 1.0f) / 4096.0f;
                      if (0.0f > var16) {
                        var16 = 0.0f;
                        break L9;
                      } else {
                        if (1.0f >= var16) {
                          break L9;
                        } else {
                          var16 = 1.0f;
                          break L9;
                        }
                      }
                    }
                    var8++;
                    var20[var8] = var17 * (float)var10[var15];
                    var8++;
                    var20[var8] = (float)var11[var15] * var17;
                    var8++;
                    var20[var8] = (float)var12[var15] * var17;
                    var8++;
                    var20[var8] = var16;
                    if (param3) {
                      var8 = var8 + (-4 + (param1 << -341523294));
                      var15--;
                      continue L8;
                    } else {
                      var15--;
                      continue L8;
                    }
                  }
                }
              }
            }
          } else {
            ((lra) this).field_q[var7_int].b(-9163, param1, param5);
            var7_int++;
            continue L0;
          }
        }
    }

    final boolean a(int param0, asb param1, d param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = VoidHunters.field_G;
          if (dbb.field_o >= 0) {
            var4 = 0;
            L1: while (true) {
              if (var4 >= ((lra) this).field_n.length) {
                break L0;
              } else {
                if (!param1.a((byte) 67, ((lra) this).field_n[var4], dbb.field_o)) {
                  return false;
                } else {
                  var4++;
                  continue L1;
                }
              }
            }
          } else {
            var4 = 0;
            L2: while (true) {
              if (var4 >= ((lra) this).field_n.length) {
                break L0;
              } else {
                if (param1.a(((lra) this).field_n[var4], true)) {
                  var4++;
                  continue L2;
                } else {
                  return false;
                }
              }
            }
          }
        }
        var4 = param0;
        L3: while (true) {
          if (var4 >= ((lra) this).field_l.length) {
            return true;
          } else {
            if (param2.a(((lra) this).field_l[var4], (byte) -84)) {
              var4++;
              continue L3;
            } else {
              return false;
            }
          }
        }
    }

    final int[] a(int param0, boolean param1, int param2, boolean param3, asb param4, d param5, double param6) {
        int var9_int = 0;
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[][] var15_array = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        Object var22 = null;
        int[][] var23 = null;
        int[] var24 = null;
        int var25 = 0;
        int[][] var26 = null;
        int[][] var27 = null;
        int[][] var28 = null;
        int[][] var29 = null;
        L0: {
          var21 = VoidHunters.field_G;
          if (!param1) {
            break L0;
          } else {
            var22 = null;
            boolean discarded$1 = ((lra) this).a(45, (asb) null, (d) null);
            break L0;
          }
        }
        nl.field_e = param5;
        qnb.field_o = param4;
        var9_int = 0;
        L1: while (true) {
          if (((lra) this).field_q.length <= var9_int) {
            igb.a(true, param6);
            hr.a(param2, param0, -99);
            var9 = new int[param2 * param0];
            var10 = 0;
            var11 = 0;
            L2: while (true) {
              if (param2 <= var11) {
                var25 = 0;
                var11 = var25;
                L3: while (true) {
                  if (((lra) this).field_q.length <= var25) {
                    return var9;
                  } else {
                    ((lra) this).field_q[var25].c(-72);
                    var25++;
                    continue L3;
                  }
                }
              } else {
                L4: {
                  if (((lra) this).field_m.field_g) {
                    var24 = ((lra) this).field_m.a(var11, true);
                    var15 = var24;
                    var14 = var24;
                    var13 = var24;
                    var12 = var24;
                    break L4;
                  } else {
                    var29 = ((lra) this).field_m.a(255, var11);
                    var28 = var29;
                    var27 = var28;
                    var26 = var27;
                    var23 = var26;
                    var15_array = var23;
                    var12 = var29[0];
                    var14 = var29[2];
                    var13 = var29[1];
                    break L4;
                  }
                }
                L5: {
                  if (!param3) {
                    break L5;
                  } else {
                    var10 = var11;
                    break L5;
                  }
                }
                L6: {
                  if (((lra) this).field_p.field_g) {
                    var15 = ((lra) this).field_p.a(var11, true);
                    break L6;
                  } else {
                    var15 = ((lra) this).field_p.a(255, var11)[0];
                    break L6;
                  }
                }
                var16 = -1 + param0;
                L7: while (true) {
                  if (var16 < 0) {
                    var11++;
                    continue L2;
                  } else {
                    L8: {
                      var17 = var12[var16] >> 759779108;
                      if (255 >= var17) {
                        break L8;
                      } else {
                        var17 = 255;
                        break L8;
                      }
                    }
                    L9: {
                      if ((var17 ^ -1) > -1) {
                        var17 = 0;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      var18 = var13[var16] >> 1494761604;
                      if (255 < var18) {
                        var18 = 255;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if ((var18 ^ -1) <= -1) {
                        break L11;
                      } else {
                        var18 = 0;
                        break L11;
                      }
                    }
                    L12: {
                      var19 = var14[var16] >> -1941117884;
                      if (255 >= var19) {
                        break L12;
                      } else {
                        var19 = 255;
                        break L12;
                      }
                    }
                    L13: {
                      var17 = pp.field_o[var17];
                      var18 = pp.field_o[var18];
                      if ((var19 ^ -1) > -1) {
                        var19 = 0;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    L14: {
                      L15: {
                        var19 = pp.field_o[var19];
                        if (var17 != 0) {
                          break L15;
                        } else {
                          if (var18 != -1) {
                            break L15;
                          } else {
                            if (-1 == var19) {
                              var20 = 0;
                              break L14;
                            } else {
                              break L15;
                            }
                          }
                        }
                      }
                      L16: {
                        var20 = var15[var16] >> -646953148;
                        if ((var20 ^ -1) >= -256) {
                          break L16;
                        } else {
                          var20 = 255;
                          break L16;
                        }
                      }
                      if (var20 >= 0) {
                        break L14;
                      } else {
                        var20 = 0;
                        break L14;
                      }
                    }
                    var10++;
                    var9[var10] = (var17 << 1784557616) + (var20 << 786413304) - -(var18 << 81684200) + var19;
                    if (param3) {
                      var10 = var10 + (param0 - 1);
                      var16--;
                      continue L7;
                    } else {
                      var16--;
                      continue L7;
                    }
                  }
                }
              }
            }
          } else {
            ((lra) this).field_q[var9_int].b(-9163, param0, param2);
            var9_int++;
            continue L1;
          }
        }
    }

    final int[] a(boolean param0, d param1, asb param2, int param3, boolean param4, int param5, double param6, int param7) {
        int var10_int = 0;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[][] var19_ref_int____ = null;
        int[] var19_ref_int__ = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int[][] var25 = null;
        int[] var26 = null;
        int var27 = 0;
        var24 = VoidHunters.field_G;
        qnb.field_o = param2;
        nl.field_e = param1;
        var10_int = 0;
        L0: while (true) {
          if (((lra) this).field_q.length <= var10_int) {
            L1: {
              igb.a(true, param6);
              hr.a(param7, param5, -128);
              var26 = new int[param5 * param7];
              var10 = var26;
              if (!param0) {
                var12 = param5;
                var13 = 1;
                var11 = 0;
                break L1;
              } else {
                var13 = -1;
                var12 = -1;
                var11 = -1 + param5;
                break L1;
              }
            }
            var14 = 0;
            var15 = 0;
            L2: while (true) {
              if (var15 >= param7) {
                var27 = param3;
                var15 = var27;
                L3: while (true) {
                  if (((lra) this).field_q.length <= var27) {
                    return var10;
                  } else {
                    ((lra) this).field_q[var27].c(-91);
                    var27++;
                    continue L3;
                  }
                }
              } else {
                L4: {
                  if (param4) {
                    var14 = var15;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (!((lra) this).field_m.field_g) {
                    var25 = ((lra) this).field_m.a(255, var15);
                    var19_ref_int____ = ((lra) this).field_m.a(255, var15);
                    var17 = var25[1];
                    var16 = var25[0];
                    var18 = var25[2];
                    break L5;
                  } else {
                    var19_ref_int__ = ((lra) this).field_m.a(var15, true);
                    var16 = var19_ref_int__;
                    var17 = var19_ref_int__;
                    var18 = var19_ref_int__;
                    break L5;
                  }
                }
                var19 = var11;
                L6: while (true) {
                  if (var19 == var12) {
                    var15++;
                    continue L2;
                  } else {
                    L7: {
                      var20 = var16[var19] >> 2109647748;
                      if (var20 < -256) {
                        var20 = 255;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (-1 > var20) {
                        var20 = 0;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      var21 = var17[var19] >> 727160068;
                      if (-256 > (var21 ^ -1)) {
                        var21 = 255;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (0 <= var21) {
                        break L10;
                      } else {
                        var21 = 0;
                        break L10;
                      }
                    }
                    L11: {
                      var22 = var18[var19] >> 1734755364;
                      if (var22 > 255) {
                        var22 = 255;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (0 <= var22) {
                        break L12;
                      } else {
                        var22 = 0;
                        break L12;
                      }
                    }
                    L13: {
                      var20 = pp.field_o[var20];
                      var21 = pp.field_o[var21];
                      var22 = pp.field_o[var22];
                      var23 = var22 + (var20 << 1092891696) - -(var21 << 1184712264);
                      if (-1 == (var23 ^ -1)) {
                        break L13;
                      } else {
                        var23 = var23 | -16777216;
                        break L13;
                      }
                    }
                    L14: {
                      var14++;
                      var26[var14] = var23;
                      if (!param4) {
                        break L14;
                      } else {
                        var14 = var14 + (param5 - 1);
                        break L14;
                      }
                    }
                    var19 = var19 + var13;
                    continue L6;
                  }
                }
              }
            }
          } else {
            ((lra) this).field_q[var10_int].b(-9163, param5, param7);
            var10_int++;
            continue L0;
          }
        }
    }

    lra(ds param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[][] var12 = null;
        le var13 = null;
        le var14 = null;
        int[][] var15 = null;
        le var16 = null;
        int[][] var17 = null;
        int[][] var18 = null;
        int[][] var19 = null;
        int[][] var20 = null;
        int[][] var21 = null;
        int[][] var22 = null;
        int[][] var23 = null;
        var2 = param0.e((byte) -120);
        var3 = 0;
        var4 = 0;
        var22 = new int[var2][];
        var20 = var22;
        var18 = var20;
        var15 = var18;
        var12 = var15;
        var23 = var12;
        var21 = var23;
        var19 = var21;
        var17 = var19;
        var5 = var17;
        ((lra) this).field_q = new le[var2];
        var6 = 0;
        L0: while (true) {
          if (var2 <= var6) {
            ((lra) this).field_n = new int[var3];
            var3 = 0;
            ((lra) this).field_l = new int[var4];
            var4 = 0;
            var6 = 0;
            L1: while (true) {
              if (var2 <= var6) {
                ((lra) this).field_m = ((lra) this).field_q[param0.e((byte) -114)];
                ((lra) this).field_p = ((lra) this).field_q[param0.e((byte) -90)];
                var5 = null;
                ((lra) this).field_k = ((lra) this).field_q[param0.e((byte) -108)];
              } else {
                var16 = ((lra) this).field_q[var6];
                var8 = var16.field_e.length;
                var9 = 0;
                L2: while (true) {
                  if (var8 <= var9) {
                    L3: {
                      var9 = var16.a(-1);
                      var10 = var16.d((byte) 77);
                      if (0 >= var9) {
                        break L3;
                      } else {
                        var3++;
                        ((lra) this).field_n[var3] = var9;
                        break L3;
                      }
                    }
                    L4: {
                      if ((var10 ^ -1) >= -1) {
                        break L4;
                      } else {
                        var4++;
                        ((lra) this).field_l[var4] = var10;
                        break L4;
                      }
                    }
                    var5[var6] = null;
                    var6++;
                    continue L1;
                  } else {
                    var16.field_e[var9] = ((lra) this).field_q[var23[var6][var9]];
                    var9++;
                    continue L2;
                  }
                }
              }
            }
          } else {
            L5: {
              var13 = sk.a(param0, (byte) 55);
              var14 = var13;
              if (-1 < (var14.a(-1) ^ -1)) {
                break L5;
              } else {
                var3++;
                break L5;
              }
            }
            L6: {
              if (var14.d((byte) 81) < 0) {
                break L6;
              } else {
                var4++;
                break L6;
              }
            }
            var8 = var14.field_e.length;
            var12[var6] = new int[var8];
            var9 = 0;
            L7: while (true) {
              if (var8 <= var9) {
                ((lra) this).field_q[var6] = var13;
                var6++;
                continue L0;
              } else {
                var22[var6][var9] = param0.e((byte) -125);
                var9++;
                continue L7;
              }
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_o = null;
        if (!param0) {
            lra.a(false);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "This game has started.";
    }
}
