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
        if (param0 > -22) {
            return 69;
        }
        return (-mj.field_b + so.field_b.field_g >> -1971733887) + param1;
    }

    private final wk b(int param0, int param1) {
        if (param0 >= -15) {
            this.a(29);
        }
        return new wk(ql.field_j.a("intro" + (param1 - -1) + ".jpg", -125, ""), (java.awt.Component) ((Object) ll.p(0)));
    }

    final void a(boolean param0) {
        int fieldTemp$1 = 0;
        int var3 = 0;
        L0: {
          var3 = ArmiesOfGielinor.field_M ? 1 : 0;
          this.field_l = this.field_l + 1;
          if (0 < this.field_m) {
            fieldTemp$1 = this.field_m - 1;
            this.field_m = this.field_m - 1;
            if (0 == fieldTemp$1) {
              L1: {
                this.field_j = this.field_j + 1;
                if (this.field_j == 1) {
                  break L1;
                } else {
                  if (2 == this.field_j) {
                    this.field_m = 50;
                    if (var3 == 0) {
                      break L0;
                    } else {
                      break L1;
                    }
                  } else {
                    break L0;
                  }
                }
              }
              this.field_m = 200;
              break L0;
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
        if ((this.field_j ^ -1) == -4) {
          L2: {
            L3: {
              if (this.field_n <= 0) {
                break L3;
              } else {
                this.field_n = this.field_n - 1;
                if (var3 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (this.field_i.length <= this.field_c) {
                bv.a(false, 0, 1, jt.field_a);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              L6: {
                if (this.field_g != 0) {
                  break L6;
                } else {
                  this.field_e = this.field_e + 0.256;
                  if (var3 == 0) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if (1 == this.field_g) {
                this.field_e = this.field_e - 0.256;
                break L5;
              } else {
                break L5;
              }
            }
            L7: {
              this.field_l = this.field_l + 1;
              if (this.field_e >= 11.904) {
                break L7;
              } else {
                if (0.0 >= this.field_e) {
                  this.field_g = 0;
                  this.field_e = 0.0;
                  this.field_n = this.field_i[this.field_c];
                  this.field_c = this.field_c + 1;
                  if (var3 == 0) {
                    break L2;
                  } else {
                    break L7;
                  }
                } else {
                  break L2;
                }
              }
            }
            L8: {
              if (this.field_k <= 2521.0) {
                break L8;
              } else {
                if (2552.0 <= this.field_k) {
                  break L8;
                } else {
                  this.field_e = this.field_e - 0.256;
                  if (var3 == 0) {
                    break L2;
                  } else {
                    break L8;
                  }
                }
              }
            }
            this.field_e = 11.904;
            this.field_g = 1;
            break L2;
          }
          L9: {
            if (0.0 != this.field_e) {
              break L9;
            } else {
              this.field_e = 0.175;
              break L9;
            }
          }
          L10: {
            this.field_k = this.field_k + this.field_e;
            if (this.field_k >= 2835.0) {
              this.field_k = 2835.0;
              this.field_q = this.field_q + 1;
              break L10;
            } else {
              break L10;
            }
          }
          L11: {
            if (!param0) {
              break L11;
            } else {
              field_f = false;
              break L11;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(int param0) {
        int discarded$1 = 0;
        OutOfMemoryError var2_ref_OutOfMemoryError = null;
        int var2 = 0;
        int var3_int = 0;
        double var3 = 0.0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[] var7_ref_String__ = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String[] var12 = null;
        String[] var13 = null;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_54_2 = 0;
        int stackIn_54_3 = 0;
        int stackIn_54_4 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_55_2 = 0;
        int stackIn_55_3 = 0;
        int stackIn_55_4 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_56_2 = 0;
        int stackIn_56_3 = 0;
        int stackIn_56_4 = 0;
        int stackIn_56_5 = 0;
        int stackIn_60_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        int stackOut_53_2 = 0;
        int stackOut_53_3 = 0;
        int stackOut_53_4 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int stackOut_55_2 = 0;
        int stackOut_55_3 = 0;
        int stackOut_55_4 = 0;
        int stackOut_55_5 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_54_2 = 0;
        int stackOut_54_3 = 0;
        int stackOut_54_4 = 0;
        int stackOut_54_5 = 0;
        int stackOut_59_0 = 0;
        int stackOut_58_0 = 0;
        L0: {
          var11 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 == 256) {
            break L0;
          } else {
            discarded$1 = this.a(53, -105);
            break L0;
          }
        }
        L1: {
          L2: {
            if ((this.field_j ^ -1) == -4) {
              break L2;
            } else {
              qn.b();
              var12 = new String[10];
              var13 = var12;
              var3_int = nr.field_e.a(ts.field_b, new int[]{1000}, var13);
              var4 = 0;
              L3: while (true) {
                L4: {
                  L5: {
                    L6: {
                      if ((var4 ^ -1) <= (var3_int ^ -1)) {
                        break L6;
                      } else {
                        var5 = this.a((byte) -90, var4 * 20 + 200);
                        fe.c(var12[var4], this.a(320, 4592), var5, nd.field_b, true);
                        var4++;
                        if (var11 != 0) {
                          break L5;
                        } else {
                          if (var11 == 0) {
                            continue L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    if (this.field_j != 1) {
                      var4 = (this.field_m << -994389688) / 50;
                      break L5;
                    } else {
                      break L4;
                    }
                  }
                  L7: {
                    if ((this.field_j ^ -1) != -3) {
                      break L7;
                    } else {
                      var4 = 256 - var4;
                      break L7;
                    }
                  }
                  qn.b(this.a(0, param0 ^ 4336), this.a((byte) -56, 0), so.field_b.field_a, so.field_b.field_g, 65793, var4);
                  break L4;
                }
                if (var11 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          L8: {
            L9: {
              if (ck.field_c == null) {
                ck.field_c = new wk[16];
                try {
                  L10: {
                    var2 = 0;
                    L11: while (true) {
                      L12: {
                        if (-17 >= (var2 ^ -1)) {
                          break L12;
                        } else {
                          ck.field_c[var2] = this.b(kf.b(param0, -383), var2);
                          var2++;
                          if (var11 != 0) {
                            decompiledRegionSelector0 = 1;
                            break L10;
                          } else {
                            if (var11 == 0) {
                              continue L11;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                      decompiledRegionSelector0 = 0;
                      break L10;
                    }
                  }
                } catch (java.lang.OutOfMemoryError decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L13: {
                    var2_ref_OutOfMemoryError = (OutOfMemoryError) (Object) decompiledCaughtException;
                    decompiledRegionSelector0 = 0;
                    break L13;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  break L9;
                } else {
                  break L8;
                }
              } else {
                break L9;
              }
            }
            var2 = -(int)(256.0 * (this.field_k - this.field_d) / 8.75) + 256;
            break L8;
          }
          L14: {
            L15: {
              var3 = this.field_k;
              var5 = (int)(16.0 * this.field_k);
              if ((var2 ^ -1) < -1) {
                break L15;
              } else {
                this.a(var5, (byte) -79);
                if (var11 == 0) {
                  break L14;
                } else {
                  break L15;
                }
              }
            }
            var3 = (double)this.a(-320, 4592);
            this.a(var5, (byte) -79);
            qn.b(0, 0, so.field_b.field_a, so.field_b.field_g, 65793, var2);
            break L14;
          }
          L16: {
            L17: {
              if ((this.field_c ^ -1) > -6) {
                L18: {
                  var6 = -1 + this.field_c;
                  if (this.field_g == 1) {
                    var6++;
                    break L18;
                  } else {
                    break L18;
                  }
                }
                if ((var6 ^ -1) > -1) {
                  break L17;
                } else {
                  if (md.field_A.length <= var6) {
                    break L17;
                  } else {
                    var7_ref_String__ = new String[10];
                    var8 = hh.field_i.a(md.field_A[var6], new int[]{620}, var7_ref_String__);
                    var9 = 0;
                    L19: while (true) {
                      if (var9 >= var8) {
                        break L17;
                      } else {
                        var10 = 435 + 16 * var9;
                        hh.field_i.a(var7_ref_String__[var9], this.a(320, 4592), this.a((byte) -104, var10), 16777215, 65793, 256 - (int)(this.field_e * 256.0 / 11.904));
                        var9++;
                        if (var11 != 0) {
                          break L16;
                        } else {
                          if (var11 == 0) {
                            continue L19;
                          } else {
                            break L17;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                break L17;
              }
            }
            var6 = this.field_l * 200;
            break L16;
          }
          L20: {
            if (this.field_q > 0) {
              break L20;
            } else {
              L21: {
                qn.a((int)(16.0 * (-var3 + (double)this.a(1105, param0 + 4336))), this.a((byte) -73, 119) << -4226652, 480, (ae.b(var6, 100) >> -1035977011) + 32, fe.field_o[1]);
                qn.a((int)(16.0 * (-var3 + (double)this.a(1068, 4592))), this.a((byte) -42, 219) << -1786951932, 480, 32 - -(ae.b(800 + var6, 100) >> -1187960499), fe.field_o[2]);
                qn.a((int)(16.0 * ((double)this.a(1105, 4592) - var3)), this.a((byte) -39, 286) << -226524732, 480, (ae.b(var6 - -1600, param0 + -156) >> -351788051) + 32, fe.field_o[3]);
                qn.a((int)(16.0 * (-var3 + (double)this.a(1443, 4592))), this.a((byte) -89, 116) << -398380348, 480, 32 + (ae.b(2400 + var6, 100) >> 1570866317), fe.field_o[4]);
                qn.a((int)((-var3 + (double)this.a(1478, 4592)) * 16.0), this.a((byte) -62, 207) << 232812356, 480, 32 + (ae.b(var6 - -3200, param0 ^ 356) >> -125562899), fe.field_o[5]);
                qn.a((int)(16.0 * (-var3 + (double)this.a(1446, 4592))), this.a((byte) -103, 295) << -1045443932, 480, 32 + (ae.b(4000 + var6, 100) >> 218500717), fe.field_o[6]);
                qn.b((int)(this.a(1890.0 - this.field_k, 16) * 16.0), this.a((byte) -78, 160) << 1599485508, 1600, 32 + (ae.b(150 + (var6 >> 1478145921), 100) >> -174297682), fe.field_o[0]);
                qn.a((int)(16.0 * (-var3 + (double)this.a(2614, 4592))), this.a((byte) -74, 219) << -321967356, 80, (ae.b(var6, 100) >> 664475597) + 32 >> -2021440766, fe.field_o[1]);
                var7 = 256 + (ae.b(var6 / 4, 100) + -65536);
                if (-1 > (var7 ^ -1)) {
                  ih.field_H.e((int)(-var3 + (double)this.a(2568, 4592)), this.a((byte) -29, 141), var7);
                  break L21;
                } else {
                  break L21;
                }
              }
              L22: {
                var7 = 256 + (ae.b(var6 / 2, 100) - 65536);
                if ((var7 ^ -1) >= -1) {
                  break L22;
                } else {
                  ih.field_H.e((int)((double)this.a(2516, 4592) - var3), this.a((byte) -119, 206), var7);
                  break L22;
                }
              }
              L23: {
                var7 = -65536 + ae.b(var6 / 3, 100) - -256;
                if (var7 <= 0) {
                  break L23;
                } else {
                  ih.field_H.e((int)((double)this.a(2665, param0 + 4336) - var3), this.a((byte) -53, 168), var7);
                  break L23;
                }
              }
              if (var11 == 0) {
                break L1;
              } else {
                break L20;
              }
            }
          }
          L24: {
            var7 = this.field_q + -100;
            if (0 >= var7) {
              break L24;
            } else {
              L25: {
                var7 = (int)Math.pow(1.1, (double)var7);
                stackOut_53_0 = 0;
                stackOut_53_1 = 0;
                stackOut_53_2 = so.field_b.field_a;
                stackOut_53_3 = so.field_b.field_g;
                stackOut_53_4 = 65793;
                stackIn_55_0 = stackOut_53_0;
                stackIn_55_1 = stackOut_53_1;
                stackIn_55_2 = stackOut_53_2;
                stackIn_55_3 = stackOut_53_3;
                stackIn_55_4 = stackOut_53_4;
                stackIn_54_0 = stackOut_53_0;
                stackIn_54_1 = stackOut_53_1;
                stackIn_54_2 = stackOut_53_2;
                stackIn_54_3 = stackOut_53_3;
                stackIn_54_4 = stackOut_53_4;
                if (-257 <= (var7 ^ -1)) {
                  stackOut_55_0 = stackIn_55_0;
                  stackOut_55_1 = stackIn_55_1;
                  stackOut_55_2 = stackIn_55_2;
                  stackOut_55_3 = stackIn_55_3;
                  stackOut_55_4 = stackIn_55_4;
                  stackOut_55_5 = var7;
                  stackIn_56_0 = stackOut_55_0;
                  stackIn_56_1 = stackOut_55_1;
                  stackIn_56_2 = stackOut_55_2;
                  stackIn_56_3 = stackOut_55_3;
                  stackIn_56_4 = stackOut_55_4;
                  stackIn_56_5 = stackOut_55_5;
                  break L25;
                } else {
                  stackOut_54_0 = stackIn_54_0;
                  stackOut_54_1 = stackIn_54_1;
                  stackOut_54_2 = stackIn_54_2;
                  stackOut_54_3 = stackIn_54_3;
                  stackOut_54_4 = stackIn_54_4;
                  stackOut_54_5 = 256;
                  stackIn_56_0 = stackOut_54_0;
                  stackIn_56_1 = stackOut_54_1;
                  stackIn_56_2 = stackOut_54_2;
                  stackIn_56_3 = stackOut_54_3;
                  stackIn_56_4 = stackOut_54_4;
                  stackIn_56_5 = stackOut_54_5;
                  break L25;
                }
              }
              qn.b(stackIn_56_0, stackIn_56_1, stackIn_56_2, stackIn_56_3, stackIn_56_4, stackIn_56_5);
              break L24;
            }
          }
          L26: {
            var8 = this.field_q << -1922739486;
            if ((var8 ^ -1) >= -257) {
              stackOut_59_0 = var8;
              stackIn_60_0 = stackOut_59_0;
              break L26;
            } else {
              stackOut_58_0 = 256;
              stackIn_60_0 = stackOut_58_0;
              break L26;
            }
          }
          var8 = stackIn_60_0;
          ol.field_y.e(this.a(-(int)this.field_k + 3002, 4592), this.a((byte) -81, 90), var8);
          if ((var7 ^ -1) > -160001) {
            break L1;
          } else {
            bv.a(false, 0, 1, jt.field_a);
            break L1;
          }
        }
    }

    final static void a(je param0, int param1, je param2) {
        try {
            if (null == param2.field_fb) {
                param2.field_fb = new at();
            }
            if (null == param0.field_fb) {
                param0.field_fb = new at();
            }
            if (null == nh.field_K) {
                nh.field_K = new tp(64);
            }
            if (param1 > -20) {
                field_o = -46;
            }
            if (!(bk.field_a != null)) {
                bk.field_a = new tp(64);
            }
            ot.field_E = param0.field_fb;
            wh.field_c = param2.field_fb;
            da.c(-123);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ep.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, byte param1) {
        int[] var3 = null;
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
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param1 == -79) {
          var16 = new int[qn.field_g];
          var15 = var16;
          var14 = var15;
          var3 = var14;
          var4 = -param0;
          var4 = var4 + kv.field_F;
          var5 = -1;
          var6 = us.field_a;
          L0: while (true) {
            L1: {
              L2: {
                L3: {
                  if ((var6 ^ -1) <= -17) {
                    break L3;
                  } else {
                    var7 = var4;
                    var8 = (var7 >> 1506571332) - -this.a(0, 4592);
                    stackOut_4_0 = qn.field_l;
                    stackOut_4_1 = var8;
                    stackIn_33_0 = stackOut_4_0;
                    stackIn_33_1 = stackOut_4_1;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    if (var13 != 0) {
                      L4: while (true) {
                        if (stackIn_33_0 >= stackIn_33_1) {
                          break L1;
                        } else {
                          qn.d(var6 + var5, this.a((byte) -45, 0), qn.field_g, 0, 255 - (var6 << 1081987330));
                          var6++;
                          if (var13 != 0) {
                            break L1;
                          } else {
                            if (var13 == 0) {
                              stackOut_35_0 = -65;
                              stackOut_35_1 = var6 ^ -1;
                              stackIn_33_0 = stackOut_35_0;
                              stackIn_33_1 = stackOut_35_1;
                              continue L4;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                    } else {
                      if (stackIn_5_0 <= stackIn_5_1) {
                        break L3;
                      } else {
                        L5: {
                          if (null == ck.field_c[var6]) {
                            ck.field_c[var6] = this.b(-99, var6);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          L7: {
                            var9 = ck.field_c[var6].field_y;
                            var4 = var4 + (var9 << 424220836);
                            var10 = var8 + var9;
                            if (var10 >= 0) {
                              break L7;
                            } else {
                              us.field_a = 1 + var6;
                              kv.field_F = kv.field_F + (var9 << -1073755484);
                              ck.field_c[var6] = null;
                              if (var13 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            var11 = -(var7 & 15) + 15;
                            if (var8 >= 0) {
                              break L8;
                            } else {
                              var9 = var9 + var8;
                              var11 = var11 - (var8 << 686199812);
                              var8 = 0;
                              break L8;
                            }
                          }
                          L9: {
                            if (qn.field_l >= var10) {
                              break L9;
                            } else {
                              var9 = var9 - (var10 - qn.field_l);
                              break L9;
                            }
                          }
                          L10: {
                            var12 = this.a((byte) -34, 0);
                            if ((var5 ^ -1) > -1) {
                              var5 = var8;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          L11: {
                            if (0 <= var12) {
                              break L11;
                            } else {
                              var12 = 0;
                              break L11;
                            }
                          }
                          fe.a(ck.field_c[var6], var11, 0, var8, var12, var9, var16);
                          break L6;
                        }
                        var6++;
                        if (var13 == 0) {
                          continue L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                var6 = 0;
                L12: while (true) {
                  if (-65 >= (var6 ^ -1)) {
                    break L1;
                  } else {
                    qn.d(var6 + var5, this.a((byte) -45, 0), qn.field_g, 0, 255 - (var6 << 1081987330));
                    var6++;
                    if (var13 != 0) {
                      break L1;
                    } else {
                      if (var13 == 0) {
                        continue L12;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              break L1;
            }
            return;
          }
        } else {
          return;
        }
    }

    final static int b(byte param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            vh var2 = null;
            int stackIn_13_0 = 0;
            int stackIn_25_0 = 0;
            int stackIn_30_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_37_0 = 0;
            int stackIn_39_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_12_0 = 0;
            int stackOut_24_0 = 0;
            int stackOut_29_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_38_0 = 0;
            int stackOut_36_0 = 0;
            if (-5 >= (ai.field_T.field_q ^ -1)) {
              if (-1 == ai.field_T.field_p) {
                return 3;
              } else {
                if (ai.field_T.field_p == -2) {
                  return 4;
                } else {
                  return 1;
                }
              }
            } else {
              try {
                L0: {
                  L1: {
                    if (-1 != (ta.field_N ^ -1)) {
                      break L1;
                    } else {
                      kd.field_R = vq.field_c.a(gm.field_i, (byte) 114, db.field_c);
                      ta.field_N = ta.field_N + 1;
                      break L1;
                    }
                  }
                  L2: {
                    if (-2 != (ta.field_N ^ -1)) {
                      break L2;
                    } else {
                      if (2 != kd.field_R.field_g) {
                        if (1 == kd.field_R.field_g) {
                          ta.field_N = ta.field_N + 1;
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        stackOut_12_0 = as.a(-1, (byte) 101);
                        stackIn_13_0 = stackOut_12_0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                  L3: {
                    if (-3 != (ta.field_N ^ -1)) {
                      break L3;
                    } else {
                      jj.field_g = new hi((java.net.Socket) (kd.field_R.field_f), vq.field_c);
                      var2 = new vh(13);
                      it.a(hq.field_e, false, am.field_x, var2, ek.field_e);
                      var2.b(1, 15);
                      var2.a((byte) -124, vq.field_d);
                      jj.field_g.a(var2.field_o, (byte) 20, 0, 13);
                      ta.field_N = ta.field_N + 1;
                      fi.field_s = 30000L + vi.b(103);
                      break L3;
                    }
                  }
                  L4: {
                    if (3 == ta.field_N) {
                      L5: {
                        if (jj.field_g.d((byte) 43) <= 0) {
                          break L5;
                        } else {
                          var1_int = jj.field_g.a(70);
                          if (-1 != (var1_int ^ -1)) {
                            stackOut_24_0 = as.a(var1_int, (byte) 101);
                            stackIn_25_0 = stackOut_24_0;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            ta.field_N = ta.field_N + 1;
                            if (!ArmiesOfGielinor.field_M) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      if (vi.b(97) > fi.field_s) {
                        stackOut_29_0 = as.a(-2, (byte) 101);
                        stackIn_30_0 = stackOut_29_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  if (4 == ta.field_N) {
                    ai.field_T.a(jj.field_g, ts.field_m, -68);
                    kd.field_R = null;
                    ta.field_N = 0;
                    jj.field_g = null;
                    stackOut_33_0 = 0;
                    stackIn_34_0 = stackOut_33_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (param0 < -117) {
                      stackOut_38_0 = -1;
                      stackIn_39_0 = stackOut_38_0;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      stackOut_36_0 = 37;
                      stackIn_37_0 = stackOut_36_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return as.a(-3, (byte) 101);
              }
              if (decompiledRegionSelector0 == 0) {
                return stackIn_13_0;
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return stackIn_25_0;
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return stackIn_30_0;
                  } else {
                    if (decompiledRegionSelector0 == 3) {
                      return stackIn_34_0;
                    } else {
                      if (decompiledRegionSelector0 == 4) {
                        return stackIn_37_0;
                      } else {
                        return stackIn_39_0;
                      }
                    }
                  }
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, String param1, boolean param2) {
        String var4 = null;
        try {
            if (!param0) {
                field_p = (boolean[][]) null;
            }
            var4 = sb.field_i.field_X;
            String var3 = var4;
            sb.field_i.field_X = param1;
            eu.field_g.b(param2, 20);
            sb.field_i.field_X = var4;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ep.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final int a(int param0, int param1) {
        if (param1 != 4592) {
            this.field_m = -45;
        }
        return (so.field_b.field_a - ce.field_Q >> 1917635617) - -param0;
    }

    public static void a(byte param0) {
        field_b = null;
        field_h = null;
        field_p = (boolean[][]) null;
        if (param0 != 11) {
            field_o = 9;
        }
        field_a = null;
    }

    ep(kl param0) {
        this.field_m = 50;
        this.field_i = new int[]{350, 350, 450, 450, 3500};
        this.field_q = 0;
        this.field_e = 0.0;
        this.field_j = 0;
        this.field_g = 1;
        this.field_n = 0;
        this.field_c = 0;
        this.field_l = 0;
        try {
            kv.field_F = 0;
            ql.field_j = param0;
            us.field_a = 0;
            this.field_d = 301.25;
            this.field_k = this.field_d;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ep.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final double a(double param0, int param1) {
        wk discarded$0 = null;
        if (param1 != 16) {
            discarded$0 = this.b(-62, 105);
        }
        return (double)(-ce.field_Q + so.field_b.field_a >> -2033038271) + param0;
    }

    static {
        field_o = 0;
        field_f = true;
        field_h = "Players";
        field_a = "Toggle map";
    }
}
