/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ep {
    private double field_d;
    private int field_g;
    private int field_m;
    static kl field_b;
    private int[] field_i;
    static String field_h;
    static int field_o;
    static boolean field_f;
    private int field_j;
    private int field_q;
    private double field_e;
    static String field_a;
    private int field_l;
    private double field_k;
    private int field_n;
    static boolean[][] field_p;
    private int field_c;

    private final int a(byte param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 <= -22) {
              stackOut_3_0 = (-mj.field_b + so.field_b.field_g >> -1971733887) + param1;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 69;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3, "ep.K(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    private final wk b(int param0, int param1) {
        RuntimeException var3 = null;
        wk stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        wk stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param0 < -15) {
                break L1;
              } else {
                ((ep) this).a(29);
                break L1;
              }
            }
            stackOut_3_0 = new wk(ql.field_j.a("intro" + (param1 - -1) + ".jpg", -125, ""), (java.awt.Component) (Object) ll.p(0));
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3, "ep.I(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final void a(boolean param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              ((ep) this).field_l = ((ep) this).field_l + 1;
              if (0 < ((ep) this).field_m) {
                int fieldTemp$1 = ((ep) this).field_m - 1;
                ((ep) this).field_m = ((ep) this).field_m - 1;
                if (0 == fieldTemp$1) {
                  L2: {
                    ((ep) this).field_j = ((ep) this).field_j + 1;
                    if (((ep) this).field_j == 1) {
                      break L2;
                    } else {
                      if (2 == ((ep) this).field_j) {
                        ((ep) this).field_m = 50;
                        if (var3 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                  ((ep) this).field_m = 200;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            if (((ep) this).field_j == 3) {
              L3: {
                L4: {
                  if (((ep) this).field_n <= 0) {
                    break L4;
                  } else {
                    ((ep) this).field_n = ((ep) this).field_n - 1;
                    if (var3 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (((ep) this).field_i.length <= ((ep) this).field_c) {
                    bv.a(false, 0, 1, jt.field_a);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  L7: {
                    if (((ep) this).field_g != 0) {
                      break L7;
                    } else {
                      ((ep) this).field_e = ((ep) this).field_e + 0.256;
                      if (var3 == 0) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (1 == ((ep) this).field_g) {
                    ((ep) this).field_e = ((ep) this).field_e - 0.256;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L8: {
                  ((ep) this).field_l = ((ep) this).field_l + 1;
                  if (((ep) this).field_e >= 11.904) {
                    break L8;
                  } else {
                    if (0.0 >= ((ep) this).field_e) {
                      ((ep) this).field_g = 0;
                      ((ep) this).field_e = 0.0;
                      ((ep) this).field_n = ((ep) this).field_i[((ep) this).field_c];
                      ((ep) this).field_c = ((ep) this).field_c + 1;
                      if (var3 == 0) {
                        break L3;
                      } else {
                        break L8;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                L9: {
                  if (((ep) this).field_k <= 2521.0) {
                    break L9;
                  } else {
                    if (2552.0 <= ((ep) this).field_k) {
                      break L9;
                    } else {
                      ((ep) this).field_e = ((ep) this).field_e - 0.256;
                      if (var3 == 0) {
                        break L3;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
                ((ep) this).field_e = 11.904;
                ((ep) this).field_g = 1;
                break L3;
              }
              L10: {
                if (0.0 != ((ep) this).field_e) {
                  break L10;
                } else {
                  ((ep) this).field_e = 0.175;
                  break L10;
                }
              }
              L11: {
                ((ep) this).field_k = ((ep) this).field_k + ((ep) this).field_e;
                if (((ep) this).field_k >= 2835.0) {
                  ((ep) this).field_k = 2835.0;
                  ((ep) this).field_q = ((ep) this).field_q + 1;
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (!param0) {
                  break L12;
                } else {
                  field_f = false;
                  break L12;
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
          throw ig.a((Throwable) (Object) var2, "ep.D(" + param0 + ')');
        }
    }

    final void a(int param0) {
        OutOfMemoryError var2 = null;
        RuntimeException var2_ref = null;
        int var2_int = 0;
        String[] var2_array = null;
        double var3 = 0.0;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[] var7_ref_String__ = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_71_2 = 0;
        int stackIn_71_3 = 0;
        int stackIn_71_4 = 0;
        int stackIn_73_0 = 0;
        int stackIn_73_1 = 0;
        int stackIn_73_2 = 0;
        int stackIn_73_3 = 0;
        int stackIn_73_4 = 0;
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        int stackIn_74_2 = 0;
        int stackIn_74_3 = 0;
        int stackIn_74_4 = 0;
        int stackIn_74_5 = 0;
        int stackIn_79_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_70_0 = 0;
        int stackOut_70_1 = 0;
        int stackOut_70_2 = 0;
        int stackOut_70_3 = 0;
        int stackOut_70_4 = 0;
        int stackOut_73_0 = 0;
        int stackOut_73_1 = 0;
        int stackOut_73_2 = 0;
        int stackOut_73_3 = 0;
        int stackOut_73_4 = 0;
        int stackOut_73_5 = 0;
        int stackOut_71_0 = 0;
        int stackOut_71_1 = 0;
        int stackOut_71_2 = 0;
        int stackOut_71_3 = 0;
        int stackOut_71_4 = 0;
        int stackOut_71_5 = 0;
        int stackOut_78_0 = 0;
        int stackOut_76_0 = 0;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 256) {
                break L1;
              } else {
                int discarded$1 = this.a(53, -105);
                break L1;
              }
            }
            L2: {
              L3: {
                if (((ep) this).field_j == 3) {
                  break L3;
                } else {
                  qn.b();
                  var2_array = new String[10];
                  var3_int = nr.field_e.a(ts.field_b, new int[1], var2_array);
                  var4 = 0;
                  L4: while (true) {
                    L5: {
                      L6: {
                        L7: {
                          if (~var4 <= ~var3_int) {
                            break L7;
                          } else {
                            var5 = this.a((byte) -90, var4 * 20 + 200);
                            fe.c(var2_array[var4], this.a(320, 4592), var5, nd.field_b, true);
                            var4++;
                            if (var11 != 0) {
                              break L6;
                            } else {
                              if (var11 == 0) {
                                continue L4;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        if (((ep) this).field_j != 1) {
                          var4 = (((ep) this).field_m << -994389688) / 50;
                          break L6;
                        } else {
                          break L5;
                        }
                      }
                      L8: {
                        if (((ep) this).field_j != 2) {
                          break L8;
                        } else {
                          var4 = 256 - var4;
                          break L8;
                        }
                      }
                      qn.b(this.a(0, param0 ^ 4336), this.a((byte) -56, 0), so.field_b.field_a, so.field_b.field_g, 65793, var4);
                      break L5;
                    }
                    if (var11 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              L9: {
                L10: {
                  if (ck.field_c == null) {
                    ck.field_c = new wk[16];
                    try {
                      L11: {
                        var2_int = 0;
                        L12: while (true) {
                          L13: {
                            if (var2_int >= 16) {
                              break L13;
                            } else {
                              ck.field_c[var2_int] = this.b(kf.b(param0, -383), var2_int);
                              var2_int++;
                              if (var11 != 0) {
                                decompiledRegionSelector0 = 0;
                                break L11;
                              } else {
                                if (var11 == 0) {
                                  continue L12;
                                } else {
                                  break L13;
                                }
                              }
                            }
                          }
                          decompiledRegionSelector0 = 1;
                          break L11;
                        }
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L14: {
                        var2 = (OutOfMemoryError) (Object) decompiledCaughtException;
                        decompiledRegionSelector0 = 1;
                        break L14;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      break L9;
                    } else {
                      break L10;
                    }
                  } else {
                    break L10;
                  }
                }
                var2_int = -(int)(256.0 * (((ep) this).field_k - ((ep) this).field_d) / 8.75) + 256;
                break L9;
              }
              L15: {
                L16: {
                  var3 = ((ep) this).field_k;
                  var5 = (int)(16.0 * ((ep) this).field_k);
                  if (var2_int > 0) {
                    break L16;
                  } else {
                    this.a(var5, (byte) -79);
                    if (var11 == 0) {
                      break L15;
                    } else {
                      break L16;
                    }
                  }
                }
                var3 = (double)this.a(-320, 4592);
                this.a(var5, (byte) -79);
                qn.b(0, 0, so.field_b.field_a, so.field_b.field_g, 65793, var2_int);
                break L15;
              }
              L17: {
                L18: {
                  if (((ep) this).field_c < 5) {
                    L19: {
                      var6 = -1 + ((ep) this).field_c;
                      if (((ep) this).field_g == 1) {
                        var6++;
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    if (var6 < 0) {
                      break L18;
                    } else {
                      if (md.field_A.length <= var6) {
                        break L18;
                      } else {
                        var7_ref_String__ = new String[10];
                        var8 = hh.field_i.a(md.field_A[var6], new int[1], var7_ref_String__);
                        var9 = 0;
                        L20: while (true) {
                          if (var9 >= var8) {
                            break L18;
                          } else {
                            var10 = 435 + 16 * var9;
                            hh.field_i.a(var7_ref_String__[var9], this.a(320, 4592), this.a((byte) -104, var10), 16777215, 65793, 256 - (int)(((ep) this).field_e * 256.0 / 11.904));
                            var9++;
                            if (var11 != 0) {
                              break L17;
                            } else {
                              if (var11 == 0) {
                                continue L20;
                              } else {
                                break L18;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    break L18;
                  }
                }
                var6 = ((ep) this).field_l * 200;
                break L17;
              }
              L21: {
                if (((ep) this).field_q > 0) {
                  break L21;
                } else {
                  L22: {
                    qn.a((int)(16.0 * (-var3 + (double)this.a(1105, param0 + 4336))), this.a((byte) -73, 119) << -4226652, 480, (ae.b(var6, 100) >> -1035977011) + 32, fe.field_o[1]);
                    qn.a((int)(16.0 * (-var3 + (double)this.a(1068, 4592))), this.a((byte) -42, 219) << -1786951932, 480, 32 - -(ae.b(800 + var6, 100) >> -1187960499), fe.field_o[2]);
                    qn.a((int)(16.0 * ((double)this.a(1105, 4592) - var3)), this.a((byte) -39, 286) << -226524732, 480, (ae.b(var6 - -1600, param0 + -156) >> -351788051) + 32, fe.field_o[3]);
                    qn.a((int)(16.0 * (-var3 + (double)this.a(1443, 4592))), this.a((byte) -89, 116) << -398380348, 480, 32 + (ae.b(2400 + var6, 100) >> 1570866317), fe.field_o[4]);
                    qn.a((int)((-var3 + (double)this.a(1478, 4592)) * 16.0), this.a((byte) -62, 207) << 232812356, 480, 32 + (ae.b(var6 - -3200, param0 ^ 356) >> -125562899), fe.field_o[5]);
                    qn.a((int)(16.0 * (-var3 + (double)this.a(1446, 4592))), this.a((byte) -103, 295) << -1045443932, 480, 32 + (ae.b(4000 + var6, 100) >> 218500717), fe.field_o[6]);
                    qn.b((int)(this.a(1890.0 - ((ep) this).field_k, 16) * 16.0), this.a((byte) -78, 160) << 1599485508, 1600, 32 + (ae.b(150 + (var6 >> 1478145921), 100) >> -174297682), fe.field_o[0]);
                    qn.a((int)(16.0 * (-var3 + (double)this.a(2614, 4592))), this.a((byte) -74, 219) << -321967356, 80, (ae.b(var6, 100) >> 664475597) + 32 >> -2021440766, fe.field_o[1]);
                    var7 = 256 + (ae.b(var6 / 4, 100) + -65536);
                    if (var7 > 0) {
                      ih.field_H.e((int)(-var3 + (double)this.a(2568, 4592)), this.a((byte) -29, 141), var7);
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                  L23: {
                    var7 = 256 + (ae.b(var6 / 2, 100) - 65536);
                    if (var7 <= 0) {
                      break L23;
                    } else {
                      ih.field_H.e((int)((double)this.a(2516, 4592) - var3), this.a((byte) -119, 206), var7);
                      break L23;
                    }
                  }
                  L24: {
                    var7 = -65536 + ae.b(var6 / 3, 100) - -256;
                    if (var7 <= 0) {
                      break L24;
                    } else {
                      ih.field_H.e((int)((double)this.a(2665, param0 + 4336) - var3), this.a((byte) -53, 168), var7);
                      break L24;
                    }
                  }
                  if (var11 == 0) {
                    break L2;
                  } else {
                    break L21;
                  }
                }
              }
              L25: {
                var7 = ((ep) this).field_q + -100;
                if (0 >= var7) {
                  break L25;
                } else {
                  L26: {
                    var7 = (int)Math.pow(1.1, (double)var7);
                    stackOut_70_0 = 0;
                    stackOut_70_1 = 0;
                    stackOut_70_2 = so.field_b.field_a;
                    stackOut_70_3 = so.field_b.field_g;
                    stackOut_70_4 = 65793;
                    stackIn_73_0 = stackOut_70_0;
                    stackIn_73_1 = stackOut_70_1;
                    stackIn_73_2 = stackOut_70_2;
                    stackIn_73_3 = stackOut_70_3;
                    stackIn_73_4 = stackOut_70_4;
                    stackIn_71_0 = stackOut_70_0;
                    stackIn_71_1 = stackOut_70_1;
                    stackIn_71_2 = stackOut_70_2;
                    stackIn_71_3 = stackOut_70_3;
                    stackIn_71_4 = stackOut_70_4;
                    if (var7 <= 256) {
                      stackOut_73_0 = stackIn_73_0;
                      stackOut_73_1 = stackIn_73_1;
                      stackOut_73_2 = stackIn_73_2;
                      stackOut_73_3 = stackIn_73_3;
                      stackOut_73_4 = stackIn_73_4;
                      stackOut_73_5 = var7;
                      stackIn_74_0 = stackOut_73_0;
                      stackIn_74_1 = stackOut_73_1;
                      stackIn_74_2 = stackOut_73_2;
                      stackIn_74_3 = stackOut_73_3;
                      stackIn_74_4 = stackOut_73_4;
                      stackIn_74_5 = stackOut_73_5;
                      break L26;
                    } else {
                      stackOut_71_0 = stackIn_71_0;
                      stackOut_71_1 = stackIn_71_1;
                      stackOut_71_2 = stackIn_71_2;
                      stackOut_71_3 = stackIn_71_3;
                      stackOut_71_4 = stackIn_71_4;
                      stackOut_71_5 = 256;
                      stackIn_74_0 = stackOut_71_0;
                      stackIn_74_1 = stackOut_71_1;
                      stackIn_74_2 = stackOut_71_2;
                      stackIn_74_3 = stackOut_71_3;
                      stackIn_74_4 = stackOut_71_4;
                      stackIn_74_5 = stackOut_71_5;
                      break L26;
                    }
                  }
                  qn.b(stackIn_74_0, stackIn_74_1, stackIn_74_2, stackIn_74_3, stackIn_74_4, stackIn_74_5);
                  break L25;
                }
              }
              L27: {
                var8 = ((ep) this).field_q << -1922739486;
                if (var8 <= 256) {
                  stackOut_78_0 = var8;
                  stackIn_79_0 = stackOut_78_0;
                  break L27;
                } else {
                  stackOut_76_0 = 256;
                  stackIn_79_0 = stackOut_76_0;
                  break L27;
                }
              }
              var8 = stackIn_79_0;
              ol.field_y.e(this.a(-(int)((ep) this).field_k + 3002, 4592), this.a((byte) -81, 90), var8);
              if (var7 < 160000) {
                break L2;
              } else {
                bv.a(false, 0, 1, jt.field_a);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2_ref, "ep.G(" + param0 + ')');
        }
    }

    final static void a(je param0, int param1, je param2) {
        RuntimeException var3 = null;
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
        RuntimeException decompiledCaughtException = null;
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
        try {
          L0: {
            L1: {
              if (null != param2.field_fb) {
                break L1;
              } else {
                param2.field_fb = new at();
                break L1;
              }
            }
            L2: {
              if (null != param0.field_fb) {
                break L2;
              } else {
                param0.field_fb = new at();
                break L2;
              }
            }
            L3: {
              if (null != nh.field_K) {
                break L3;
              } else {
                nh.field_K = new tp(64);
                break L3;
              }
            }
            L4: {
              if (param1 <= -20) {
                break L4;
              } else {
                field_o = -46;
                break L4;
              }
            }
            L5: {
              if (bk.field_a == null) {
                bk.field_a = new tp(64);
                break L5;
              } else {
                break L5;
              }
            }
            ot.field_E = param0.field_fb;
            wh.field_c = param2.field_fb;
            da.c(-123);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3;
            stackOut_18_1 = new StringBuilder().append("ep.E(");
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
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
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(',');
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
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
          throw ig.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
    }

    private final void a(int param0, byte param1) {
        RuntimeException var3 = null;
        int[] var3_array = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param1 == -79) {
              var3_array = new int[qn.field_g];
              var4 = -param0;
              var4 = var4 + kv.field_F;
              var5 = -1;
              var6 = us.field_a;
              L1: while (true) {
                L2: {
                  L3: {
                    L4: {
                      L5: {
                        if (var6 >= 16) {
                          break L5;
                        } else {
                          var7 = var4;
                          var8 = (var7 >> 1506571332) - -this.a(0, 4592);
                          stackOut_5_0 = qn.field_l;
                          stackOut_5_1 = var8;
                          stackIn_33_0 = stackOut_5_0;
                          stackIn_33_1 = stackOut_5_1;
                          stackIn_6_0 = stackOut_5_0;
                          stackIn_6_1 = stackOut_5_1;
                          if (var13 != 0) {
                            L6: while (true) {
                              if (stackIn_33_0 >= stackIn_33_1) {
                                break L3;
                              } else {
                                qn.d(var6 + var5, this.a((byte) -45, 0), qn.field_g, 0, 255 - (var6 << 1081987330));
                                var6++;
                                if (var13 != 0) {
                                  break L2;
                                } else {
                                  if (var13 == 0) {
                                    stackOut_32_0 = -65;
                                    stackOut_32_1 = ~var6;
                                    stackIn_33_0 = stackOut_32_0;
                                    stackIn_33_1 = stackOut_32_1;
                                    continue L6;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                            }
                          } else {
                            if (stackIn_6_0 <= stackIn_6_1) {
                              break L5;
                            } else {
                              L7: {
                                if (null == ck.field_c[var6]) {
                                  ck.field_c[var6] = this.b(-99, var6);
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                              L8: {
                                L9: {
                                  var9 = ck.field_c[var6].field_y;
                                  var4 = var4 + (var9 << 424220836);
                                  var10 = var8 + var9;
                                  if (var10 >= 0) {
                                    break L9;
                                  } else {
                                    us.field_a = 1 + var6;
                                    kv.field_F = kv.field_F + (var9 << -1073755484);
                                    ck.field_c[var6] = null;
                                    if (var13 == 0) {
                                      break L8;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                L10: {
                                  var11 = -(var7 & 15) + 15;
                                  if (var8 >= 0) {
                                    break L10;
                                  } else {
                                    var9 = var9 + var8;
                                    var11 = var11 - (var8 << 686199812);
                                    var8 = 0;
                                    break L10;
                                  }
                                }
                                L11: {
                                  if (qn.field_l >= var10) {
                                    break L11;
                                  } else {
                                    var9 = var9 - (var10 - qn.field_l);
                                    break L11;
                                  }
                                }
                                L12: {
                                  var12 = this.a((byte) -34, 0);
                                  if (var5 < 0) {
                                    var5 = var8;
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                                L13: {
                                  if (0 <= var12) {
                                    break L13;
                                  } else {
                                    var12 = 0;
                                    break L13;
                                  }
                                }
                                fe.a(ck.field_c[var6], var11, 0, var8, var12, var9, var3_array);
                                break L8;
                              }
                              var6++;
                              if (var13 == 0) {
                                continue L1;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      var6 = 0;
                      L14: while (true) {
                        stackOut_32_0 = -65;
                        stackOut_32_1 = ~var6;
                        stackIn_33_0 = stackOut_32_0;
                        stackIn_33_1 = stackOut_32_1;
                        if (stackIn_33_0 >= stackIn_33_1) {
                          break L3;
                        } else {
                          qn.d(var6 + var5, this.a((byte) -45, 0), qn.field_g, 0, 255 - (var6 << 1081987330));
                          var6++;
                          if (var13 != 0) {
                            break L2;
                          } else {
                            if (var13 == 0) {
                              continue L14;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    break L3;
                  }
                  break L2;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3, "ep.J(" + param0 + ',' + param1 + ')');
        }
    }

    final static int b(byte param0) {
        try {
            IOException var1 = null;
            RuntimeException var1_ref = null;
            vh var1_ref2 = null;
            int var1_int = 0;
            int stackIn_7_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_14_0 = 0;
            int stackIn_23_0 = 0;
            int stackIn_38_0 = 0;
            int stackIn_46_0 = 0;
            int stackIn_51_0 = 0;
            int stackIn_54_0 = 0;
            int stackIn_56_0 = 0;
            int stackIn_58_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_6_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_13_0 = 0;
            int stackOut_22_0 = 0;
            int stackOut_37_0 = 0;
            int stackOut_45_0 = 0;
            int stackOut_50_0 = 0;
            int stackOut_55_0 = 0;
            int stackOut_53_0 = 0;
            int stackOut_57_0 = 0;
            try {
              if (ai.field_T.field_q >= 4) {
                if (-1 == ai.field_T.field_p) {
                  stackOut_6_0 = 3;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                } else {
                  if (ai.field_T.field_p == -2) {
                    stackOut_11_0 = 4;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  } else {
                    stackOut_13_0 = 1;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  }
                }
              } else {
                L0: {
                  if (ta.field_N != 0) {
                    break L0;
                  } else {
                    kd.field_R = vq.field_c.a(gm.field_i, (byte) 114, db.field_c);
                    ta.field_N = ta.field_N + 1;
                    break L0;
                  }
                }
                L1: {
                  if (ta.field_N != 1) {
                    break L1;
                  } else {
                    if (2 != kd.field_R.field_g) {
                      if (1 == kd.field_R.field_g) {
                        ta.field_N = ta.field_N + 1;
                        break L1;
                      } else {
                        break L1;
                      }
                    } else {
                      stackOut_22_0 = as.a(-1, (byte) 101);
                      stackIn_23_0 = stackOut_22_0;
                      return stackIn_23_0;
                    }
                  }
                }
                L2: {
                  if (ta.field_N != 2) {
                    break L2;
                  } else {
                    jj.field_g = new hi((java.net.Socket) kd.field_R.field_f, vq.field_c);
                    var1_ref2 = new vh(13);
                    it.a(hq.field_e, false, am.field_x, var1_ref2, ek.field_e);
                    var1_ref2.b(1, 15);
                    var1_ref2.a((byte) -124, vq.field_d);
                    jj.field_g.a(var1_ref2.field_o, (byte) 20, 0, 13);
                    ta.field_N = ta.field_N + 1;
                    fi.field_s = 30000L + vi.b(103);
                    break L2;
                  }
                }
                L3: {
                  if (3 == ta.field_N) {
                    L4: {
                      if (jj.field_g.d((byte) 43) <= 0) {
                        break L4;
                      } else {
                        var1_int = jj.field_g.a(70);
                        if (var1_int != 0) {
                          stackOut_37_0 = as.a(var1_int, (byte) 101);
                          stackIn_38_0 = stackOut_37_0;
                          return stackIn_38_0;
                        } else {
                          ta.field_N = ta.field_N + 1;
                          if (!ArmiesOfGielinor.field_M) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    if (vi.b(97) > fi.field_s) {
                      stackOut_45_0 = as.a(-2, (byte) 101);
                      stackIn_46_0 = stackOut_45_0;
                      return stackIn_46_0;
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                if (4 == ta.field_N) {
                  ai.field_T.a((Object) (Object) jj.field_g, ts.field_m, -68);
                  kd.field_R = null;
                  ta.field_N = 0;
                  jj.field_g = null;
                  stackOut_50_0 = 0;
                  stackIn_51_0 = stackOut_50_0;
                  return stackIn_51_0;
                } else {
                  if (param0 < -117) {
                    stackOut_55_0 = -1;
                    stackIn_56_0 = stackOut_55_0;
                    return stackIn_56_0;
                  } else {
                    stackOut_53_0 = 37;
                    stackIn_54_0 = stackOut_53_0;
                    return stackIn_54_0;
                  }
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (IOException) (Object) decompiledCaughtException;
              stackOut_57_0 = as.a(-3, (byte) 101);
              stackIn_58_0 = stackOut_57_0;
              return stackIn_58_0;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw ig.a((Throwable) (Object) var1_ref, "ep.B(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, String param1, boolean param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_p = null;
                break L1;
              }
            }
            var3 = sb.field_i.field_X;
            sb.field_i.field_X = param1;
            eu.field_g.b(param2, 20);
            sb.field_i.field_X = var3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3_ref;
            stackOut_5_1 = new StringBuilder().append("ep.H(").append(param0).append(',');
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
          throw ig.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param2 + ')');
        }
    }

    private final int a(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 == 4592) {
                break L1;
              } else {
                ((ep) this).field_m = -45;
                break L1;
              }
            }
            stackOut_3_0 = (so.field_b.field_a - ce.field_Q >> 1917635617) - -param0;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3, "ep.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    public static void a(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_b = null;
              field_h = null;
              field_p = null;
              if (param0 == 11) {
                break L1;
              } else {
                field_o = 9;
                break L1;
              }
            }
            field_a = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "ep.F(" + param0 + ')');
        }
    }

    ep(kl param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        ((ep) this).field_m = 50;
        ((ep) this).field_i = new int[]{350, 350, 450, 450, 3500};
        ((ep) this).field_q = 0;
        ((ep) this).field_e = 0.0;
        ((ep) this).field_j = 0;
        ((ep) this).field_g = 1;
        ((ep) this).field_n = 0;
        ((ep) this).field_c = 0;
        ((ep) this).field_l = 0;
        try {
          L0: {
            kv.field_F = 0;
            ql.field_j = param0;
            us.field_a = 0;
            ((ep) this).field_d = 301.25;
            ((ep) this).field_k = ((ep) this).field_d;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ep.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    private final double a(double param0, int param1) {
        RuntimeException var4 = null;
        double stackIn_4_0 = 0.0;
        RuntimeException decompiledCaughtException = null;
        double stackOut_3_0 = 0.0;
        try {
          L0: {
            L1: {
              if (param1 == 16) {
                break L1;
              } else {
                wk discarded$2 = this.b(-62, 105);
                break L1;
              }
            }
            stackOut_3_0 = (double)(-ce.field_Q + so.field_b.field_a >> -2033038271) + param0;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var4, "ep.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 0;
        field_f = true;
        field_h = "Players";
        field_a = "Toggle map";
    }
}
