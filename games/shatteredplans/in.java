/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class in {
    private df[] field_b;
    private df field_h;
    private int field_k;
    private int field_c;
    private df field_j;
    private long field_d;
    static bi field_i;
    static String field_l;
    static String field_e;
    static String field_a;
    static km field_g;
    static bi field_f;

    final df b(byte param0) {
        df var2 = null;
        int var3 = 0;
        Object var4 = null;
        df var4_ref = null;
        L0: {
          var3 = ShatteredPlansClient.field_F ? 1 : 0;
          if (((in) this).field_c <= 0) {
            break L0;
          } else {
            if (((in) this).field_b[((in) this).field_c - 1] != ((in) this).field_h) {
              var2 = ((in) this).field_h;
              ((in) this).field_h = var2.field_h;
              return var2;
            } else {
              break L0;
            }
          }
        }
        L1: while (true) {
          if (((in) this).field_k <= ((in) this).field_c) {
            if (param0 == -107) {
              return null;
            } else {
              return null;
            }
          } else {
            int fieldTemp$2 = ((in) this).field_c;
            ((in) this).field_c = ((in) this).field_c + 1;
            var4_ref = ((in) this).field_b[fieldTemp$2].field_h;
            var2 = var4_ref;
            if (var4_ref == ((in) this).field_b[((in) this).field_c - 1]) {
              continue L1;
            } else {
              ((in) this).field_h = var2.field_h;
              return var2;
            }
          }
        }
    }

    final static th a(int param0, byte[] param1) {
        th var2 = null;
        RuntimeException var2_ref = null;
        th stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        th stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 != null) {
              var2 = new th(param1, cf.field_H, sj.field_a, mc.field_s, cm.field_g, eo.field_fb, hd.field_q);
              pd.a(0);
              stackOut_3_0 = (th) var2;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("in.D(").append(15).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw r.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6_int = 0;
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
        L0: {
          var24 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param1 > param3) {
            var6_int = param3;
            param3 = param1;
            param1 = var6_int;
            var6_int = param5;
            param5 = param4;
            param4 = var6_int;
            break L0;
          } else {
            break L0;
          }
        }
        var6_int = -param4 + param5;
        var7 = -param1 + param3;
        if (0 == var7) {
          L1: {
            if (16 <= var6_int) {
              L2: {
                var8 = param4 >> 4;
                var9 = param1 >> 4;
                var10 = param0;
                var11 = (16 - (15 & param4)) * (16 - (param1 & 15));
                if (var8 < gf.field_i) {
                  break L2;
                } else {
                  if (var8 >= gf.field_l) {
                    break L2;
                  } else {
                    if (var9 >= gf.field_a) {
                      if (var9 >= gf.field_f) {
                        break L2;
                      } else {
                        var11 = (int)(256.0 * Math.pow((double)var11 / 256.0, 0.55));
                        var12 = var10 & 65280;
                        var12 = var12 * var11;
                        var10 = var10 & 16711935;
                        var12 = var12 & 16711680;
                        var10 = var10 * var11;
                        var10 = var10 & -16711936;
                        var13 = 640 * var9 + var8;
                        var14 = gf.field_h[var13];
                        var10 = var10 + (-16711936 & (16711935 & var14) * (-var11 + 256));
                        var12 = var12 + (16711680 & (var14 & 65280) * (256 - var11));
                        gf.field_h[var13] = ee.a(var12, var10) >>> 8;
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                var8 = param5 >> 4;
                var9 = param1 >> 4;
                var10 = param0;
                var11 = (param5 & 15) * (16 - (15 & param1));
                if (gf.field_i <= var8) {
                  if (var8 < gf.field_l) {
                    if (var9 >= gf.field_a) {
                      if (gf.field_f > var9) {
                        var11 = (int)(Math.pow((double)var11 / 256.0, 0.55) * 256.0);
                        var12 = 65280 & var10;
                        var12 = var12 * var11;
                        var10 = var10 & 16711935;
                        var10 = var10 * var11;
                        var12 = var12 & 16711680;
                        var10 = var10 & -16711936;
                        var13 = var8 + 640 * var9;
                        var14 = gf.field_h[var13];
                        var10 = var10 + (-16711936 & (16711935 & var14) * (256 + -var11));
                        var12 = var12 + (16711680 & (var14 & 65280) * (-var11 + 256));
                        gf.field_h[var13] = ee.a(var10, var12) >>> 8;
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              L4: {
                gf.f((param4 >> 4) + 1, param1 >> 4, (var6_int >> 4) + -2, param0, (16 + -(15 & param1)) * 16);
                var8 = param4 >> 4;
                var9 = (param1 >> 4) + 1;
                var10 = param0;
                var11 = (param4 & 15) * (16 + -(15 & param1));
                if (gf.field_i > var8) {
                  break L4;
                } else {
                  if (gf.field_l <= var8) {
                    break L4;
                  } else {
                    if (gf.field_a <= var9) {
                      if (gf.field_f > var9) {
                        var11 = (int)(256.0 * Math.pow((double)var11 / 256.0, 0.55));
                        var12 = 65280 & var10;
                        var10 = var10 & 16711935;
                        var12 = var12 * var11;
                        var12 = var12 & 16711680;
                        var10 = var10 * var11;
                        var10 = var10 & -16711936;
                        var13 = var9 * 640 - -var8;
                        var14 = gf.field_h[var13];
                        var10 = var10 + ((var14 & 16711935) * (-var11 + 256) & -16711936);
                        var12 = var12 + (16711680 & (-var11 + 256) * (65280 & var14));
                        gf.field_h[var13] = ee.a(var10, var12) >>> 8;
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                }
              }
              L5: {
                var8 = param5 >> 4;
                var9 = 1 + (param1 >> 4);
                var10 = param0;
                var11 = (15 & param4) * (15 & param3);
                if (var8 >= gf.field_i) {
                  if (gf.field_l <= var8) {
                    break L5;
                  } else {
                    if (gf.field_a <= var9) {
                      if (gf.field_f <= var9) {
                        break L5;
                      } else {
                        var11 = (int)(256.0 * Math.pow((double)var11 / 256.0, 0.55));
                        var12 = 65280 & var10;
                        var10 = var10 & 16711935;
                        var12 = var12 * var11;
                        var10 = var10 * var11;
                        var12 = var12 & 16711680;
                        var10 = var10 & -16711936;
                        var13 = var9 * 640 - -var8;
                        var14 = gf.field_h[var13];
                        var10 = var10 + ((256 - var11) * (var14 & 16711935) & -16711936);
                        var12 = var12 + ((-var11 + 256) * (var14 & 65280) & 16711680);
                        gf.field_h[var13] = ee.a(var12, var10) >>> 8;
                        break L5;
                      }
                    } else {
                      break L5;
                    }
                  }
                } else {
                  break L5;
                }
              }
              gf.f((param4 >> 4) + 1, (param1 >> 4) + 1, -2 + (var6_int >> 4), param0, 16 * (15 & param1));
              break L1;
            } else {
              L6: {
                var8 = param4 >> 4;
                var9 = param1 >> 4;
                var10 = param0;
                var11 = (16 - (param1 & 15)) * var6_int;
                if (var8 < gf.field_i) {
                  break L6;
                } else {
                  if (var8 < gf.field_l) {
                    if (gf.field_a <= var9) {
                      if (gf.field_f > var9) {
                        var11 = (int)(Math.pow((double)var11 / 256.0, 0.55) * 256.0);
                        var12 = 65280 & var10;
                        var10 = var10 & 16711935;
                        var12 = var12 * var11;
                        var10 = var10 * var11;
                        var12 = var12 & 16711680;
                        var10 = var10 & -16711936;
                        var13 = 640 * var9 - -var8;
                        var14 = gf.field_h[var13];
                        var12 = var12 + (16711680 & (65280 & var14) * (256 - var11));
                        var10 = var10 + ((16711935 & var14) * (-var11 + 256) & -16711936);
                        gf.field_h[var13] = ee.a(var12, var10) >>> 8;
                        break L6;
                      } else {
                        break L6;
                      }
                    } else {
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
              }
              var8 = param4 >> 4;
              var9 = (param1 >> 4) - -1;
              var10 = param0;
              var11 = var6_int * (param1 & 15);
              if (var8 < gf.field_i) {
                break L1;
              } else {
                if (var8 >= gf.field_l) {
                  break L1;
                } else {
                  if (var9 < gf.field_a) {
                    break L1;
                  } else {
                    if (var9 < gf.field_f) {
                      var11 = (int)(Math.pow((double)var11 / 256.0, 0.55) * 256.0);
                      var12 = 65280 & var10;
                      var10 = var10 & 16711935;
                      var12 = var12 * var11;
                      var12 = var12 & 16711680;
                      var10 = var10 * var11;
                      var10 = var10 & -16711936;
                      var13 = var8 + 640 * var9;
                      var14 = gf.field_h[var13];
                      var12 = var12 + ((var14 & 65280) * (-var11 + 256) & 16711680);
                      var10 = var10 + ((16711935 & var14) * (-var11 + 256) & -16711936);
                      gf.field_h[var13] = ee.a(var10, var12) >>> 8;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
          }
          return;
        } else {
          L7: {
            var8 = (var6_int << 12) / var7;
            var9 = param1 + 7 >> 4;
            var10 = ((var9 << 4) + -param1) * var8 + (param4 << 12);
            var11 = -(7 + param1 & 15) + 16;
            var12 = var9;
            var13 = var10 >> 16;
            var14 = var13;
            var15 = var12;
            var16 = param0;
            var17 = (-((var10 & 65015) >> 12) + 16) * var11;
            if (var14 < gf.field_i) {
              break L7;
            } else {
              if (gf.field_l <= var14) {
                break L7;
              } else {
                if (gf.field_a <= var15) {
                  if (var15 >= gf.field_f) {
                    break L7;
                  } else {
                    var17 = (int)(256.0 * Math.pow((double)var17 / 256.0, 0.55));
                    var18 = var16 & 65280;
                    var16 = var16 & 16711935;
                    var18 = var18 * var17;
                    var16 = var16 * var17;
                    var18 = var18 & 16711680;
                    var16 = var16 & -16711936;
                    var19 = var15 * 640 + var14;
                    var20 = gf.field_h[var19];
                    var16 = var16 + ((16711935 & var20) * (-var17 + 256) & -16711936);
                    var18 = var18 + ((-var17 + 256) * (65280 & var20) & 16711680);
                    gf.field_h[var19] = ee.a(var16, var18) >>> 8;
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
            }
          }
          L8: {
            var14 = 1 + var13;
            var16 = 57 / ((param2 - 20) / 42);
            var15 = var12;
            var17 = param0;
            var18 = var11 * (15 & var10 >> 12);
            if (var14 < gf.field_i) {
              break L8;
            } else {
              if (var14 >= gf.field_l) {
                break L8;
              } else {
                if (gf.field_a <= var15) {
                  if (gf.field_f > var15) {
                    var18 = (int)(Math.pow((double)var18 / 256.0, 0.55) * 256.0);
                    var19 = var17 & 65280;
                    var19 = var19 * var18;
                    var17 = var17 & 16711935;
                    var17 = var17 * var18;
                    var19 = var19 & 16711680;
                    var17 = var17 & -16711936;
                    var20 = var15 * 640 - -var14;
                    var21 = gf.field_h[var20];
                    var17 = var17 + (-16711936 & (var21 & 16711935) * (256 + -var18));
                    var19 = var19 + ((-var18 + 256) * (65280 & var21) & 16711680);
                    gf.field_h[var20] = ee.a(var19, var17) >>> 8;
                    break L8;
                  } else {
                    break L8;
                  }
                } else {
                  break L8;
                }
              }
            }
          }
          L9: {
            var9 = param3 - -7 >> 4;
            var14 = var10 + var8;
            var10 = (param5 << 12) - -((-param3 + (var9 << 4)) * var8);
            var11 = -(param3 - -7 & 15) + 16;
            var15 = var10 >> 16;
            var16 = var9;
            var17 = var15;
            var18 = var16;
            var19 = param0;
            var20 = (16 + -((63052 & var10) >> 12)) * var11;
            if (var17 >= gf.field_i) {
              if (gf.field_l <= var17) {
                break L9;
              } else {
                if (var18 < gf.field_a) {
                  break L9;
                } else {
                  if (gf.field_f > var18) {
                    var20 = (int)(256.0 * Math.pow((double)var20 / 256.0, 0.55));
                    var21 = var19 & 65280;
                    var21 = var21 * var20;
                    var19 = var19 & 16711935;
                    var21 = var21 & 16711680;
                    var19 = var19 * var20;
                    var19 = var19 & -16711936;
                    var22 = 640 * var18 + var17;
                    var23 = gf.field_h[var22];
                    var19 = var19 + ((var23 & 16711935) * (256 + -var20) & -16711936);
                    var21 = var21 + ((-var20 + 256) * (var23 & 65280) & 16711680);
                    gf.field_h[var22] = ee.a(var19, var21) >>> 8;
                    break L9;
                  } else {
                    break L9;
                  }
                }
              }
            } else {
              break L9;
            }
          }
          L10: {
            var17 = 1 + var15;
            var18 = var16;
            var19 = param0;
            var20 = var11 * (15 & var10 >> 12);
            if (var17 >= gf.field_i) {
              if (gf.field_l > var17) {
                if (gf.field_a <= var18) {
                  if (gf.field_f > var18) {
                    var20 = (int)(Math.pow((double)var20 / 256.0, 0.55) * 256.0);
                    var21 = var19 & 65280;
                    var21 = var21 * var20;
                    var19 = var19 & 16711935;
                    var19 = var19 * var20;
                    var21 = var21 & 16711680;
                    var19 = var19 & -16711936;
                    var22 = var17 + 640 * var18;
                    var23 = gf.field_h[var22];
                    var19 = var19 + ((-var20 + 256) * (var23 & 16711935) & -16711936);
                    var21 = var21 + ((var23 & 65280) * (256 + -var20) & 16711680);
                    gf.field_h[var22] = ee.a(var21, var19) >>> 8;
                    break L10;
                  } else {
                    break L10;
                  }
                } else {
                  break L10;
                }
              } else {
                break L10;
              }
            } else {
              break L10;
            }
          }
          var8 = var8 << 4;
          var12++;
          L11: while (true) {
            if (var16 <= var12) {
              return;
            } else {
              L12: {
                var17 = var14 >> 16;
                var18 = var12;
                var19 = param0;
                var20 = 256 - (var14 >> 8 & 255);
                if (var17 >= gf.field_i) {
                  if (gf.field_l > var17) {
                    if (var18 >= gf.field_a) {
                      if (gf.field_f > var18) {
                        var20 = (int)(256.0 * Math.pow((double)var20 / 256.0, 0.55));
                        var21 = 65280 & var19;
                        var19 = var19 & 16711935;
                        var21 = var21 * var20;
                        var19 = var19 * var20;
                        var21 = var21 & 16711680;
                        var19 = var19 & -16711936;
                        var22 = var17 + 640 * var18;
                        var23 = gf.field_h[var22];
                        var19 = var19 + (-16711936 & (16711935 & var23) * (256 + -var20));
                        var21 = var21 + ((65280 & var23) * (256 + -var20) & 16711680);
                        gf.field_h[var22] = ee.a(var19, var21) >>> 8;
                        break L12;
                      } else {
                        break L12;
                      }
                    } else {
                      break L12;
                    }
                  } else {
                    break L12;
                  }
                } else {
                  break L12;
                }
              }
              L13: {
                var17 = (var14 >> 16) + 1;
                var18 = var12;
                var19 = param0;
                var20 = 255 & var14 >> 8;
                if (gf.field_i > var17) {
                  break L13;
                } else {
                  if (var17 >= gf.field_l) {
                    break L13;
                  } else {
                    if (gf.field_a <= var18) {
                      if (var18 >= gf.field_f) {
                        break L13;
                      } else {
                        var20 = (int)(256.0 * Math.pow((double)var20 / 256.0, 0.55));
                        var21 = 65280 & var19;
                        var21 = var21 * var20;
                        var19 = var19 & 16711935;
                        var19 = var19 * var20;
                        var21 = var21 & 16711680;
                        var19 = var19 & -16711936;
                        var22 = var18 * 640 + var17;
                        var23 = gf.field_h[var22];
                        var21 = var21 + (16711680 & (-var20 + 256) * (var23 & 65280));
                        var19 = var19 + ((var23 & 16711935) * (-var20 + 256) & -16711936);
                        gf.field_h[var22] = ee.a(var21, var19) >>> 8;
                        break L13;
                      }
                    } else {
                      break L13;
                    }
                  }
                }
              }
              var14 = var14 + var8;
              var12++;
              continue L11;
            }
          }
        }
    }

    final static qh a(int param0) {
        tq.field_j = new qh(320, -param0 + 451, 200, param0 - -28, ih.field_a.toUpperCase());
        fe var2 = new fe(tq.field_j.field_k + 184, 2 + tq.field_j.field_t, 11, 11, -1, (bi) null, "X", 16711680);
        var2.field_h = (Object) (Object) tq.field_j;
        tq.field_j.a((vd) (Object) var2, 8);
        lp var3 = new lp(tq.field_j.field_k - -9, tq.field_j.field_t + 20, 182, param0);
        tq.field_j.a((vd) (Object) var3, 8);
        tq.field_j.field_z = var3;
        return tq.field_j;
    }

    final void a(long param0, df param1, boolean param2) {
        df var5 = null;
        RuntimeException var5_ref = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (null != param1.field_j) {
                param1.a(16);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var5 = ((in) this).field_b[(int)((long)(((in) this).field_k - 1) & param0)];
              param1.field_j = var5.field_j;
              param1.field_h = var5;
              param1.field_j.field_h = param1;
              param1.field_h.field_j = param1;
              param1.field_l = param0;
              if (param2) {
                break L2;
              } else {
                ((in) this).field_j = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5_ref;
            stackOut_6_1 = new StringBuilder().append("in.I(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param2 + ')');
        }
    }

    final static qd a(java.awt.Component param0, int param1, int param2, int param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            RuntimeException var4_ref2 = null;
            qd var5 = null;
            ge var5_ref = null;
            qd stackIn_3_0 = null;
            ge stackIn_5_0 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            qd stackOut_2_0 = null;
            ge stackOut_4_0 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              try {
                var4 = Class.forName("bl");
                var5 = (qd) var4.newInstance();
                var5.a(param3, param0, (byte) -111, param2);
                stackOut_2_0 = (qd) var5;
                stackIn_3_0 = stackOut_2_0;
                return stackIn_3_0;
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4_ref = decompiledCaughtException;
                var5_ref = new ge();
                ((qd) (Object) var5_ref).a(param3, param0, (byte) -99, param2);
                stackOut_4_0 = (ge) var5_ref;
                stackIn_5_0 = stackOut_4_0;
                return (qd) (Object) stackIn_5_0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L0: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var4_ref2;
                stackOut_6_1 = new StringBuilder().append("in.K(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L0;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L0;
                }
              }
              throw r.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + 16 + ',' + param2 + ',' + param3 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final df d(byte param0) {
        int var2 = 0;
        df var3 = null;
        df var4 = null;
        int var5 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = 24 / ((-73 - param0) / 35);
        if (((in) this).field_j != null) {
          var3 = ((in) this).field_b[(int)((long)(((in) this).field_k + -1) & ((in) this).field_d)];
          L0: while (true) {
            if (((in) this).field_j != var3) {
              if (((in) this).field_j.field_l == ((in) this).field_d) {
                var4 = ((in) this).field_j;
                ((in) this).field_j = ((in) this).field_j.field_h;
                return var4;
              } else {
                ((in) this).field_j = ((in) this).field_j.field_h;
                continue L0;
              }
            } else {
              ((in) this).field_j = null;
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final static void a() {
        cp.field_a = new qr(0L, (qr) null);
        if (ns.field_pb) {
            cp.field_a.a(4, nm.field_c);
        }
        cp.field_a.a(4, lp.field_v);
        bc.field_g = new wh(ds.field_a, cp.field_a);
        ia.field_j = new qr(0L, (qr) null);
        ia.field_j.a(4, (qr) (Object) bc.field_g.field_d);
        ia.field_j.a(4, vm.field_Ab);
        tc.j(96);
    }

    final df c(byte param0) {
        if (param0 > -66) {
            ((in) this).field_c = -75;
        }
        ((in) this).field_c = 0;
        return ((in) this).b((byte) -107);
    }

    final df a(int param0, long param1) {
        df var4 = null;
        df var5 = null;
        int var6 = 0;
        L0: {
          var6 = ShatteredPlansClient.field_F ? 1 : 0;
          ((in) this).field_d = param1;
          if (param0 == 65280) {
            break L0;
          } else {
            in.a(20, 67, -77, 2, 1, -87);
            break L0;
          }
        }
        var4 = ((in) this).field_b[(int)(param1 & (long)(-1 + ((in) this).field_k))];
        ((in) this).field_j = var4.field_h;
        L1: while (true) {
          if (var4 != ((in) this).field_j) {
            if (((in) this).field_j.field_l == param1) {
              var5 = ((in) this).field_j;
              ((in) this).field_j = ((in) this).field_j.field_h;
              return var5;
            } else {
              ((in) this).field_j = ((in) this).field_j.field_h;
              continue L1;
            }
          } else {
            ((in) this).field_j = null;
            return null;
          }
        }
    }

    public static void a(boolean param0) {
        field_i = null;
        field_e = null;
        field_l = null;
        field_g = null;
        field_a = null;
        field_f = null;
    }

    in(int param0) {
        int var2 = 0;
        df var3 = null;
        ((in) this).field_c = 0;
        ((in) this).field_k = param0;
        ((in) this).field_b = new df[param0];
        for (var2 = 0; param0 > var2; var2++) {
            df dupTemp$0 = new df();
            var3 = dupTemp$0;
            ((in) this).field_b[var2] = dupTemp$0;
            var3.field_h = var3;
            var3.field_j = var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new bi(540, 140);
        field_l = "Connection lost. <%0>";
        field_e = "Capture all the systems on the map";
        field_a = "Failed attacks";
    }
}
