/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km extends od {
    private ci[] field_l;
    private ci field_r;
    private ci field_k;
    private ci field_m;
    static fta field_p;
    static String field_n;
    private int[] field_o;
    private int[] field_q;

    final boolean a(cn param0, d param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = TombRacer.field_G ? 1 : 0;
          if (param2 <= gla.field_m) {
            var4 = 0;
            L1: while (true) {
              if (var4 >= ((km) this).field_q.length) {
                break L0;
              } else {
                if (!param0.a(gla.field_m, (byte) -106, ((km) this).field_q[var4])) {
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
              if (var4 >= ((km) this).field_q.length) {
                break L0;
              } else {
                if (param0.a(-15121, ((km) this).field_q[var4])) {
                  var4++;
                  continue L2;
                } else {
                  return false;
                }
              }
            }
          }
        }
        var4 = 0;
        L3: while (true) {
          if (var4 >= ((km) this).field_o.length) {
            return true;
          } else {
            if (!param1.a(((km) this).field_o[var4], (byte) 105)) {
              return false;
            } else {
              var4++;
              continue L3;
            }
          }
        }
    }

    public static void a(int param0) {
        field_p = null;
        field_n = null;
        if (param0 > -95) {
            field_p = null;
        }
    }

    final float[] a(d param0, byte param1, int param2, int param3, boolean param4, cn param5) {
        int var7_int = 0;
        float[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var10_ref_int__ = null;
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
        var18 = TombRacer.field_G ? 1 : 0;
        qw.field_j = param0;
        np.field_m = param5;
        var7_int = 0;
        L0: while (true) {
          if (((km) this).field_l.length <= var7_int) {
            uta.a(0, param2, param3);
            var20 = new float[4 * param2 * param3];
            var7 = var20;
            var8 = 0;
            var9 = 0;
            L1: while (true) {
              if (var9 >= param2) {
                var10 = -41 / ((-67 - param1) / 38);
                var21 = 0;
                var9 = var21;
                L2: while (true) {
                  if (var21 >= ((km) this).field_l.length) {
                    return var7;
                  } else {
                    ((km) this).field_l[var21].b(-54);
                    var21++;
                    continue L2;
                  }
                }
              } else {
                L3: {
                  if (((km) this).field_k.field_g) {
                    var15_ref_int__ = ((km) this).field_k.c(1, var9);
                    var10_ref_int__ = var15_ref_int__;
                    var11 = var15_ref_int__;
                    var12 = var15_ref_int__;
                    break L3;
                  } else {
                    var25 = ((km) this).field_k.b(var9, -1);
                    var24 = var25;
                    var23 = var24;
                    var22 = var23;
                    var19 = var22;
                    var15_ref_int____ = var19;
                    var11 = var25[1];
                    var12 = var25[2];
                    var10_ref_int__ = var25[0];
                    break L3;
                  }
                }
                L4: {
                  if (((km) this).field_r.field_g) {
                    var13 = ((km) this).field_r.c(1, var9);
                    break L4;
                  } else {
                    var13 = ((km) this).field_r.b(var9, -1)[0];
                    break L4;
                  }
                }
                L5: {
                  if (!param4) {
                    break L5;
                  } else {
                    var8 = var9 << 170449506;
                    break L5;
                  }
                }
                L6: {
                  if (((km) this).field_m.field_g) {
                    var14 = ((km) this).field_m.c(1, var9);
                    break L6;
                  } else {
                    var14 = ((km) this).field_m.b(var9, -1)[0];
                    break L6;
                  }
                }
                var15 = param3 + -1;
                L7: while (true) {
                  if (var15 < 0) {
                    var9++;
                    continue L1;
                  } else {
                    L8: {
                      var16 = (float)var13[var15] / 4096.0f;
                      if (0.0f <= var16) {
                        if (1.0f < var16) {
                          var16 = 1.0f;
                          break L8;
                        } else {
                          break L8;
                        }
                      } else {
                        var16 = 0.0f;
                        break L8;
                      }
                    }
                    var17 = (1.0f + (float)var14[var15] * 31.0f / 4096.0f) / 4096.0f;
                    var8++;
                    var20[var8] = var17 * (float)var10_ref_int__[var15];
                    var8++;
                    var20[var8] = var17 * (float)var11[var15];
                    var8++;
                    var20[var8] = (float)var12[var15] * var17;
                    var8++;
                    var20[var8] = var16;
                    if (param4) {
                      var8 = var8 + ((param3 << 627931138) - 4);
                      var15--;
                      continue L7;
                    } else {
                      var15--;
                      continue L7;
                    }
                  }
                }
              }
            }
          } else {
            ((km) this).field_l[var7_int].b(param3, param2, -256);
            var7_int++;
            continue L0;
          }
        }
    }

    final int[] a(int param0, cn param1, boolean param2, double param3, d param4, byte param5, int param6, boolean param7) {
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
        int[] var19_ref_int__ = null;
        int[][] var19_ref_int____ = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int[][] var25 = null;
        int[] var26 = null;
        int var27 = 0;
        int[][] var28 = null;
        int[][] var29 = null;
        int[][] var30 = null;
        int[][] var31 = null;
        var24 = TombRacer.field_G ? 1 : 0;
        qw.field_j = param4;
        np.field_m = param1;
        var10_int = 0;
        L0: while (true) {
          if (((km) this).field_l.length <= var10_int) {
            if (param5 >= 17) {
              L1: {
                js.a(param3, -256);
                uta.a(0, param0, param6);
                var26 = new int[param6 * param0];
                var10 = var26;
                if (param2) {
                  var13 = -1;
                  var11 = param6 + -1;
                  var12 = -1;
                  break L1;
                } else {
                  var12 = param6;
                  var11 = 0;
                  var13 = 1;
                  break L1;
                }
              }
              var14 = 0;
              var15 = 0;
              L2: while (true) {
                if (var15 >= param0) {
                  var27 = 0;
                  var15 = var27;
                  L3: while (true) {
                    if (var27 >= ((km) this).field_l.length) {
                      return var10;
                    } else {
                      ((km) this).field_l[var27].b(-50);
                      var27++;
                      continue L3;
                    }
                  }
                } else {
                  L4: {
                    if (((km) this).field_k.field_g) {
                      var19_ref_int__ = ((km) this).field_k.c(1, var15);
                      var16 = var19_ref_int__;
                      var18 = var19_ref_int__;
                      var17 = var19_ref_int__;
                      break L4;
                    } else {
                      var31 = ((km) this).field_k.b(var15, -1);
                      var30 = var31;
                      var29 = var30;
                      var28 = var29;
                      var25 = var28;
                      var19_ref_int____ = var25;
                      var16 = var31[0];
                      var17 = var31[1];
                      var18 = var31[2];
                      break L4;
                    }
                  }
                  L5: {
                    if (!param7) {
                      break L5;
                    } else {
                      var14 = var15;
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
                        var20 = var16[var19] >> 410727716;
                        if (-256 > (var20 ^ -1)) {
                          var20 = 255;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      L8: {
                        if (var20 <= -1) {
                          break L8;
                        } else {
                          var20 = 0;
                          break L8;
                        }
                      }
                      L9: {
                        var21 = var17[var19] >> -1637273468;
                        if (-256 < var21) {
                          var21 = 255;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        if (-1 >= (var21 ^ -1)) {
                          break L10;
                        } else {
                          var21 = 0;
                          break L10;
                        }
                      }
                      L11: {
                        var22 = var18[var19] >> -1660820348;
                        if (255 >= var22) {
                          break L11;
                        } else {
                          var22 = 255;
                          break L11;
                        }
                      }
                      L12: {
                        if ((var22 ^ -1) > -1) {
                          var22 = 0;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      L13: {
                        var20 = sk.field_c[var20];
                        var21 = sk.field_c[var21];
                        var22 = sk.field_c[var22];
                        var23 = var22 + ((var21 << 1281366568) + (var20 << 238148688));
                        if (0 != var23) {
                          var23 = var23 | -16777216;
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      L14: {
                        var14++;
                        var26[var14] = var23;
                        if (param7) {
                          var14 = var14 + (-1 + param6);
                          break L14;
                        } else {
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
              return null;
            }
          } else {
            ((km) this).field_l[var10_int].b(param6, param0, -256);
            var10_int++;
            continue L0;
          }
        }
    }

    km(uia param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[][] var12 = null;
        ci var13 = null;
        ci var14 = null;
        ci var15 = null;
        int[][] var16 = null;
        int[][] var17 = null;
        var2 = param0.h(255);
        var3 = 0;
        var4 = 0;
        ((km) this).field_l = new ci[var2];
        var17 = new int[var2][];
        var16 = var17;
        var12 = var16;
        var6 = 0;
        L0: while (true) {
          if (var6 >= var2) {
            ((km) this).field_q = new int[var3];
            ((km) this).field_o = new int[var4];
            var3 = 0;
            var4 = 0;
            var6 = 0;
            L1: while (true) {
              if (var2 <= var6) {
                ((km) this).field_k = ((km) this).field_l[param0.h(255)];
                ((km) this).field_r = ((km) this).field_l[param0.h(255)];
                var5 = null;
                ((km) this).field_m = ((km) this).field_l[param0.h(255)];
              } else {
                var15 = ((km) this).field_l[var6];
                var8 = var15.field_j.length;
                var9 = 0;
                L2: while (true) {
                  if (var8 <= var9) {
                    L3: {
                      var9 = var15.a(100);
                      var10 = var15.c((byte) -117);
                      if ((var9 ^ -1) >= -1) {
                        break L3;
                      } else {
                        var3++;
                        ((km) this).field_q[var3] = var9;
                        break L3;
                      }
                    }
                    L4: {
                      if (0 >= var10) {
                        break L4;
                      } else {
                        var4++;
                        ((km) this).field_o[var4] = var10;
                        break L4;
                      }
                    }
                    var12[var6] = null;
                    var6++;
                    continue L1;
                  } else {
                    var15.field_j[var9] = ((km) this).field_l[var17[var6][var9]];
                    var9++;
                    continue L2;
                  }
                }
              }
            }
          } else {
            L5: {
              var13 = aw.a(param0, 0);
              var14 = var13;
              if (var14.a(125) < 0) {
                break L5;
              } else {
                var3++;
                break L5;
              }
            }
            L6: {
              if (-1 < (var14.c((byte) -117) ^ -1)) {
                break L6;
              } else {
                var4++;
                break L6;
              }
            }
            var8 = var14.field_j.length;
            var12[var6] = new int[var8];
            var9 = 0;
            L7: while (true) {
              if (var8 <= var9) {
                ((km) this).field_l[var6] = var13;
                var6++;
                continue L0;
              } else {
                var17[var6][var9] = param0.h(255);
                var9++;
                continue L7;
              }
            }
          }
        }
    }

    final int[] a(int param0, boolean param1, int param2, double param3, cn param4, d param5, boolean param6) {
        int var9_int = 0;
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[][] var15 = null;
        int[] var15_array = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int[][] var22 = null;
        int[] var23 = null;
        int var24 = 0;
        int[][] var25 = null;
        int[][] var26 = null;
        int[][] var27 = null;
        int[][] var28 = null;
        var21 = TombRacer.field_G ? 1 : 0;
        qw.field_j = param5;
        np.field_m = param4;
        var9_int = 0;
        L0: while (true) {
          if (((km) this).field_l.length <= var9_int) {
            L1: {
              js.a(param3, -256);
              uta.a(0, param2, param0);
              if (!param6) {
                break L1;
              } else {
                ((km) this).field_m = null;
                break L1;
              }
            }
            var9 = new int[param0 * param2];
            var10 = 0;
            var11 = 0;
            L2: while (true) {
              if (param2 <= var11) {
                var24 = 0;
                var11 = var24;
                L3: while (true) {
                  if (var24 >= ((km) this).field_l.length) {
                    return var9;
                  } else {
                    ((km) this).field_l[var24].b(-126);
                    var24++;
                    continue L3;
                  }
                }
              } else {
                L4: {
                  if (!((km) this).field_k.field_g) {
                    var28 = ((km) this).field_k.b(var11, -1);
                    var27 = var28;
                    var26 = var27;
                    var25 = var26;
                    var22 = var25;
                    var15 = var22;
                    var13 = var28[1];
                    var12 = var28[0];
                    var14 = var28[2];
                    break L4;
                  } else {
                    var23 = ((km) this).field_k.c(1, var11);
                    var15_array = var23;
                    var14 = var23;
                    var12 = var23;
                    var13 = var23;
                    break L4;
                  }
                }
                L5: {
                  if (((km) this).field_r.field_g) {
                    var15_array = ((km) this).field_r.c(1, var11);
                    break L5;
                  } else {
                    var15_array = ((km) this).field_r.b(var11, -1)[0];
                    break L5;
                  }
                }
                L6: {
                  if (!param1) {
                    break L6;
                  } else {
                    var10 = var11;
                    break L6;
                  }
                }
                var16 = -1 + param0;
                L7: while (true) {
                  if (-1 < var16) {
                    var11++;
                    continue L2;
                  } else {
                    L8: {
                      var17 = var12[var16] >> 1855972;
                      if (-256 < var17) {
                        var17 = 255;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (0 > var17) {
                        var17 = 0;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      var18 = var13[var16] >> 103167844;
                      if (var18 >= -256) {
                        break L10;
                      } else {
                        var18 = 255;
                        break L10;
                      }
                    }
                    L11: {
                      if (0 <= var18) {
                        break L11;
                      } else {
                        var18 = 0;
                        break L11;
                      }
                    }
                    L12: {
                      var19 = var14[var16] >> 1420546980;
                      if (-256 >= var19) {
                        break L12;
                      } else {
                        var19 = 255;
                        break L12;
                      }
                    }
                    L13: {
                      var17 = sk.field_c[var17];
                      var18 = sk.field_c[var18];
                      if (var19 >= 0) {
                        break L13;
                      } else {
                        var19 = 0;
                        break L13;
                      }
                    }
                    L14: {
                      L15: {
                        var19 = sk.field_c[var19];
                        if (-1 != (var17 ^ -1)) {
                          break L15;
                        } else {
                          if (var18 != 0) {
                            break L15;
                          } else {
                            if (var19 == 0) {
                              var20 = 0;
                              break L14;
                            } else {
                              break L15;
                            }
                          }
                        }
                      }
                      L16: {
                        var20 = var15_array[var16] >> -1446832988;
                        if (var20 < -256) {
                          var20 = 255;
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                      if (-1 > var20) {
                        var20 = 0;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    var10++;
                    var9[var10] = var19 + ((var18 << 1514685224) + ((var17 << -1006888912) + (var20 << -2094779528)));
                    if (param1) {
                      var10 = var10 + (param0 + -1);
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
            ((km) this).field_l[var9_int].b(param0, param2, -256);
            var9_int++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "LASER stands for Light Amplification by Stimulated Emission of Radiation. Misuse of a LASER can turn a PLAYER into TOAST.";
    }
}
