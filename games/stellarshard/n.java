/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n {
    short[] field_E;
    short[] field_l;
    int field_k;
    short[] field_r;
    short field_n;
    int[] field_A;
    short[] field_P;
    private boolean field_p;
    short[] field_z;
    int[] field_j;
    short[] field_a;
    short[] field_c;
    int field_G;
    int[] field_J;
    short[] field_e;
    int[] field_B;
    static int field_d;
    int[] field_o;
    short[] field_b;
    int field_t;
    int field_u;
    short[] field_m;
    int[] field_O;
    int field_x;
    short[] field_I;
    short[] field_s;
    int[] field_y;
    int field_F;
    static hc field_i;
    int[] field_q;
    static int field_L;
    short[] field_f;
    short[] field_H;
    short field_D;
    byte field_N;
    short field_C;
    short[] field_v;
    short[] field_K;
    byte[] field_g;
    int[] field_w;
    short[] field_M;
    short[] field_h;

    final static void a(int param0, byte param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = stellarshard.field_B;
        try {
          L0: {
            if (ni.field_d < 0) {
              return;
            } else {
              L1: {
                var3_int = -135 + param2;
                var4 = -35 + param0;
                var5 = 256;
                if (ni.field_d < 75) {
                  var5 = (ni.field_d << 8) / 75;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (200 < ni.field_d) {
                  var5 = (250 + -ni.field_d << 8) / 50;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                hj.a(u.field_m, 1);
                cc.a();
                ti.d();
                ja.a(param1 + 45);
                if (var5 >= 256) {
                  break L3;
                } else {
                  ti.b(0, 0, ti.field_i, ti.field_b, 0, -var5 + 256);
                  break L3;
                }
              }
              if (param1 == -41) {
                L4: {
                  L5: {
                    id.b((byte) -58);
                    if (ni.field_d >= 150) {
                      break L5;
                    } else {
                      u.field_m.b(var3_int, var4);
                      if (var8 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  wh.field_a.e(var3_int - -15, var4 - -10, var5);
                  break L4;
                }
                L6: {
                  var6 = ni.field_d - 125;
                  if (0 >= var6) {
                    break L6;
                  } else {
                    if (var6 >= 50) {
                      break L6;
                    } else {
                      L7: {
                        if (var6 < 20) {
                          break L7;
                        } else {
                          L8: {
                            if (30 > var6) {
                              break L8;
                            } else {
                              var7 = (-var6 + 50) * 256 / 20;
                              pd.field_s.d(var3_int, var4, var7);
                              if (var8 == 0) {
                                break L6;
                              } else {
                                break L8;
                              }
                            }
                          }
                          pd.field_s.d(var3_int, var4, 256);
                          if (var8 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var7 = 256 * var6 / 20;
                      pd.field_s.d(var3_int, var4, var7);
                      break L6;
                    }
                  }
                }
                L9: {
                  var6 = ni.field_d - 140;
                  if (var6 <= 0) {
                    break L9;
                  } else {
                    L10: {
                      var7 = 256;
                      if (var6 >= 20) {
                        break L10;
                      } else {
                        var7 = 256 * var6 / 20;
                        break L10;
                      }
                    }
                    fb.field_h.e(15 + var3_int, var4 - -10, var7 * var5 >> 8);
                    break L9;
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
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var3, "n.G(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void b(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException decompiledCaughtException = null;
        var12 = stellarshard.field_B;
        try {
          L0: {
            if (((n) this).field_p) {
              return;
            } else {
              L1: {
                ((n) this).field_p = true;
                var2_int = 32767;
                var3 = 32767;
                var4 = 32767;
                var5 = -32768;
                var6 = -32768;
                var7 = -32768;
                if (param0 == -53) {
                  break L1;
                } else {
                  ((n) this).field_s = null;
                  break L1;
                }
              }
              var8 = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (var8 >= ((n) this).field_n) {
                      break L4;
                    } else {
                      var9 = ((n) this).field_f[var8];
                      var10 = ((n) this).field_b[var8];
                      var11 = ((n) this).field_a[var8];
                      if (var12 != 0) {
                        break L3;
                      } else {
                        L5: {
                          if (~var9 >= ~var5) {
                            break L5;
                          } else {
                            var5 = var9;
                            break L5;
                          }
                        }
                        L6: {
                          if (~var2_int >= ~var9) {
                            break L6;
                          } else {
                            var2_int = var9;
                            break L6;
                          }
                        }
                        L7: {
                          if (var3 > var10) {
                            var3 = var10;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        L8: {
                          if (~var6 <= ~var10) {
                            break L8;
                          } else {
                            var6 = var10;
                            break L8;
                          }
                        }
                        L9: {
                          if (~var11 < ~var7) {
                            var7 = var11;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          if (~var4 >= ~var11) {
                            break L10;
                          } else {
                            var4 = var11;
                            break L10;
                          }
                        }
                        var8++;
                        if (var12 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  ((n) this).field_k = var7;
                  ((n) this).field_x = var3;
                  ((n) this).field_u = var4;
                  ((n) this).field_t = var5;
                  ((n) this).field_F = var2_int;
                  ((n) this).field_G = var6;
                  break L3;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var2, "n.D(" + param0 + ')');
        }
    }

    private final void a(byte param0) {
        try {
            int var2_int = -17 / ((param0 - -40) / 34);
            ((n) this).field_p = false;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "n.F(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = stellarshard.field_B;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~((n) this).field_n >= ~var6_int) {
                    break L3;
                  } else {
                    ((n) this).field_f[var6_int] = (short)(param4 * ((n) this).field_f[var6_int] / param2);
                    ((n) this).field_b[var6_int] = (short)(((n) this).field_b[var6_int] * param3 / param2);
                    ((n) this).field_a[var6_int] = (short)(((n) this).field_a[var6_int] * param1 / param2);
                    var6_int++;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      if (var7 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L4: {
                  if (param0 == -12966) {
                    break L4;
                  } else {
                    ((n) this).field_A = null;
                    break L4;
                  }
                }
                this.a((byte) -93);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ma.a((Throwable) (Object) runtimeException, "n.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static pb a(pb param0, byte param1, boolean param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        pb var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        Object stackIn_6_0 = null;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_29_0 = 0;
        pb stackIn_40_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_28_0 = 0;
        pb stackOut_39_0 = null;
        Object stackOut_5_0 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var20 = stellarshard.field_B;
        try {
          L0: {
            param0.b();
            var3_int = rc.a((byte) -61, param0.field_z[0]);
            var4 = var3_int >> 2 & 63;
            if (var4 <= 0) {
              var5 = 3 & var3_int;
              var6 = 1;
              var7 = 1;
              if (param1 <= -30) {
                var8_int = 0;
                var9 = 1;
                L1: while (true) {
                  L2: {
                    L3: {
                      if (var8_int > var5) {
                        break L3;
                      } else {
                        int incrementValue$3 = var6;
                        var6++;
                        var7 = var7 - -(var9 * rc.a((byte) -61, param0.field_z[incrementValue$3]));
                        stackOut_9_0 = var9 * 255;
                        stackIn_12_0 = stackOut_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var20 != 0) {
                          break L2;
                        } else {
                          var9 = stackIn_10_0;
                          var8_int++;
                          if (var20 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    stackOut_11_0 = var7;
                    stackIn_12_0 = stackOut_11_0;
                    break L2;
                  }
                  var8 = new int[stackIn_12_0];
                  var9 = 0;
                  L4: while (true) {
                    L5: {
                      L6: {
                        if (var7 <= var9) {
                          break L6;
                        } else {
                          var10 = 0;
                          var11 = 0;
                          stackOut_14_0 = 1;
                          stackIn_29_0 = stackOut_14_0;
                          stackIn_15_0 = stackOut_14_0;
                          if (var20 != 0) {
                            break L5;
                          } else {
                            var12 = stackIn_15_0;
                            L7: while (true) {
                              L8: {
                                L9: {
                                  if (var11 >= 4) {
                                    break L9;
                                  } else {
                                    int incrementValue$4 = var6;
                                    var6++;
                                    var10 = var10 - -(rc.a((byte) -61, param0.field_z[incrementValue$4]) * var12);
                                    var12 = var12 * 255;
                                    var11++;
                                    if (var20 != 0) {
                                      break L8;
                                    } else {
                                      if (var20 == 0) {
                                        continue L7;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                }
                                L10: {
                                  if (!param2) {
                                    break L10;
                                  } else {
                                    if (0 != var10) {
                                      break L10;
                                    } else {
                                      var10 = 16711935;
                                      break L10;
                                    }
                                  }
                                }
                                var8[var9] = var10;
                                var9++;
                                break L8;
                              }
                              if (var20 == 0) {
                                continue L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                      }
                      var9 = 255 * rc.a((byte) -61, param0.field_z[var6]) - -rc.a((byte) -61, param0.field_z[var6 - -1]);
                      var6 += 2;
                      var10 = 255 * rc.a((byte) -61, param0.field_z[var6]) - -rc.a((byte) -61, param0.field_z[var6 - -1]);
                      var6 += 2;
                      var11 = 255 * rc.a((byte) -61, param0.field_z[var6]) + rc.a((byte) -61, param0.field_z[1 + var6]);
                      var6 += 2;
                      stackOut_28_0 = rc.a((byte) -61, param0.field_z[var6]) * 255 + rc.a((byte) -61, param0.field_z[1 + var6]);
                      stackIn_29_0 = stackOut_28_0;
                      break L5;
                    }
                    var12 = stackIn_29_0;
                    var6 += 2;
                    var13 = rc.a((byte) -61, param0.field_z[var6]) * 255 - -rc.a((byte) -61, param0.field_z[1 + var6]);
                    var6 += 2;
                    var14 = rc.a((byte) -61, param0.field_z[var6]) * 255 - -rc.a((byte) -61, param0.field_z[var6 - -1]);
                    var6 += 2;
                    var15 = new pb(var13, var14);
                    var15.field_t = var9;
                    var15.field_s = var10;
                    var15.field_w = var11;
                    var15.field_x = var12;
                    var16 = 0;
                    L11: while (true) {
                      L12: {
                        if (var16 >= var15.field_z.length) {
                          break L12;
                        } else {
                          var17 = 0;
                          var18 = 0;
                          var19 = 1;
                          L13: while (true) {
                            L14: {
                              L15: {
                                if (var5 < var18) {
                                  break L15;
                                } else {
                                  int incrementValue$5 = var6;
                                  var6++;
                                  var17 = var17 - -(var19 * rc.a((byte) -61, param0.field_z[incrementValue$5]));
                                  var19 = var19 * 255;
                                  var18++;
                                  if (var20 != 0) {
                                    break L14;
                                  } else {
                                    if (var20 == 0) {
                                      continue L13;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                              }
                              var15.field_z[var16] = var8[var17];
                              var16++;
                              break L14;
                            }
                            if (var20 == 0) {
                              continue L11;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                      stackOut_39_0 = (pb) var15;
                      stackIn_40_0 = stackOut_39_0;
                      break L0;
                    }
                  }
                }
              } else {
                stackOut_5_0 = null;
                stackIn_6_0 = stackOut_5_0;
                return (pb) (Object) stackIn_6_0;
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var3 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var3;
            stackOut_41_1 = new StringBuilder().append("n.E(");
            stackIn_44_0 = stackOut_41_0;
            stackIn_44_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param0 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L16;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_45_0 = stackOut_42_0;
              stackIn_45_1 = stackOut_42_1;
              stackIn_45_2 = stackOut_42_2;
              break L16;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_45_0, stackIn_45_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_40_0;
    }

    final static void d(byte param0) {
        RuntimeException var1 = null;
        ha var1_ref = null;
        int var2 = 0;
        String var3 = null;
        int var3_int = 0;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        fd var5_ref = null;
        fd var6 = null;
        String var6_ref = null;
        String var7 = null;
        fd var7_ref = null;
        int var8 = 0;
        int stackIn_12_0 = 0;
        boolean stackIn_54_0 = false;
        int stackIn_61_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_53_0 = false;
        int stackOut_59_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        var8 = stellarshard.field_B;
        try {
          L0: {
            var1_ref = ae.field_N;
            var2 = var1_ref.f(4);
            if (var2 != 0) {
              if (var2 == 1) {
                L1: {
                  if (ac.field_k == null) {
                    ac.field_k = new sb(128);
                    bc.field_i = 0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  var3 = var1_ref.e((byte) 83);
                  if (!var3.equals((Object) (Object) "")) {
                    break L2;
                  } else {
                    var3 = null;
                    break L2;
                  }
                }
                L3: {
                  var4_ref_String = var1_ref.e((byte) 93);
                  var5 = var1_ref.e((byte) 98);
                  var6 = ck.a(true, var4_ref_String);
                  if (var6 != null) {
                    break L3;
                  } else {
                    var6 = ck.a(true, var5);
                    if (var6 != null) {
                      ac.field_k.a((ah) (Object) var6, (long)nh.a((CharSequence) (Object) var4_ref_String, false).hashCode(), 1);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (null == var6) {
                    var6 = new fd();
                    ac.field_k.a((ah) (Object) var6, (long)nh.a((CharSequence) (Object) var4_ref_String, false).hashCode(), 1);
                    int fieldTemp$3 = bc.field_i;
                    bc.field_i = bc.field_i + 1;
                    var6.field_ob = fieldTemp$3;
                    cm.field_c.b(-99, (gg) (Object) var6);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (null == var3) {
                    break L5;
                  } else {
                    var3 = var3.intern();
                    break L5;
                  }
                }
                var6.field_pb = var3;
                var6.field_rb = var4_ref_String;
                var6.c(param0 ^ 16);
                var7_ref = (fd) (Object) cm.field_c.b(param0 + -95);
                L6: while (true) {
                  L7: {
                    L8: {
                      L9: {
                        L10: {
                          if (var7_ref == null) {
                            break L10;
                          } else {
                            stackOut_53_0 = uh.a(var7_ref, 200, var6);
                            stackIn_61_0 = stackOut_53_0 ? 1 : 0;
                            stackIn_54_0 = stackOut_53_0;
                            if (var8 != 0) {
                              break L9;
                            } else {
                              if (!stackIn_54_0) {
                                break L10;
                              } else {
                                var7_ref = (fd) (Object) cm.field_c.b((byte) -35);
                                if (var8 == 0) {
                                  continue L6;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                        }
                        if (null == var7_ref) {
                          break L8;
                        } else {
                          stackOut_59_0 = param0 + 108;
                          stackIn_61_0 = stackOut_59_0;
                          break L9;
                        }
                      }
                      kk.a(stackIn_61_0, (gg) (Object) var6, (gg) (Object) var7_ref);
                      if (var8 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                    cm.field_c.b(param0 + -85, (gg) (Object) var6);
                    break L7;
                  }
                  return;
                }
              } else {
                L11: {
                  if (param0 == 4) {
                    break L11;
                  } else {
                    field_L = 19;
                    break L11;
                  }
                }
                if (var2 == 2) {
                  L12: {
                    if (bi.field_r != 1) {
                      break L12;
                    } else {
                      bi.field_r = 2;
                      break L12;
                    }
                  }
                  return;
                } else {
                  if (var2 != 3) {
                    if (var2 == 4) {
                      bi.field_r = 1;
                      var3 = var1_ref.e((byte) 117);
                      uf.field_f = var3.intern();
                      var4 = var1_ref.f(4);
                      pl.b((byte) 105, var4);
                      return;
                    } else {
                      qe.a(106, "F1: " + bh.b((byte) -108), (Throwable) null);
                      oj.c(-2290);
                      break L0;
                    }
                  } else {
                    L13: {
                      if (2 != bi.field_r) {
                        break L13;
                      } else {
                        bi.field_r = 1;
                        break L13;
                      }
                    }
                    return;
                  }
                }
              }
            } else {
              L14: {
                if (ac.field_n == null) {
                  ac.field_n = new sb(128);
                  stellarshard.field_T = 0;
                  break L14;
                } else {
                  break L14;
                }
              }
              L15: {
                if (var1_ref.f(4) != 1) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L15;
                } else {
                  stackOut_9_0 = 1;
                  stackIn_12_0 = stackOut_9_0;
                  break L15;
                }
              }
              L16: {
                var3_int = stackIn_12_0;
                var4_ref_String = var1_ref.e((byte) 121);
                if (var3_int == 0) {
                  break L16;
                } else {
                  String discarded$4 = var1_ref.e((byte) 106);
                  break L16;
                }
              }
              L17: {
                var5_ref = ee.a(var4_ref_String, (byte) -98);
                var6_ref = var1_ref.e((byte) 83);
                var7 = nh.a((CharSequence) (Object) var4_ref_String, false);
                if (null == var7) {
                  var7 = var4_ref_String;
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if (var5_ref == null) {
                  var5_ref = ee.a(var6_ref, (byte) -98);
                  if (var5_ref == null) {
                    break L18;
                  } else {
                    ac.field_n.a((ah) (Object) var5_ref, (long)var7.hashCode(), 1);
                    break L18;
                  }
                } else {
                  break L18;
                }
              }
              L19: {
                if (null == var5_ref) {
                  var5_ref = new fd();
                  ac.field_n.a((ah) (Object) var5_ref, (long)var7.hashCode(), 1);
                  int fieldTemp$5 = stellarshard.field_T;
                  stellarshard.field_T = stellarshard.field_T + 1;
                  var5_ref.field_ob = fieldTemp$5;
                  la.field_I.b(-51, (gg) (Object) var5_ref);
                  break L19;
                } else {
                  break L19;
                }
              }
              var5_ref.field_rb = var4_ref_String;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1, "n.I(" + param0 + ')');
        }
    }

    public static void c(byte param0) {
        if (param0 > -1) {
            return;
        }
        try {
            field_i = null;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "n.C(" + param0 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              if (param0 == 108) {
                break L1;
              } else {
                ((n) this).field_s = null;
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (~((n) this).field_n >= ~var5_int) {
                    break L4;
                  } else {
                    ((n) this).field_f[var5_int] = (short)(((n) this).field_f[var5_int] + param3);
                    ((n) this).field_b[var5_int] = (short)(((n) this).field_b[var5_int] + param1);
                    ((n) this).field_a[var5_int] = (short)(((n) this).field_a[var5_int] + param2);
                    var5_int++;
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
                this.a((byte) -94);
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var5, "n.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static am a(int param0) {
        String var1 = null;
        RuntimeException var1_ref = null;
        am stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        am stackOut_8_0 = null;
        try {
          L0: {
            L1: {
              if (param0 == 20) {
                break L1;
              } else {
                field_d = 56;
                break L1;
              }
            }
            L2: {
              var1 = tc.c(-5);
              if (null == var1) {
                break L2;
              } else {
                if (var1.indexOf('@') < 0) {
                  break L2;
                } else {
                  var1 = "";
                  break L2;
                }
              }
            }
            stackOut_8_0 = new am(tc.c(-5), sa.a((byte) 105));
            stackIn_9_0 = stackOut_8_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1_ref, "n.A(" + param0 + ')');
        }
        return stackIn_9_0;
    }

    n() {
        ((n) this).field_N = (byte) 0;
        ((n) this).field_p = false;
    }

    static {
    }
}
