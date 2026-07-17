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
        return (-mj.field_b + so.field_b.field_g >> 1) + param1;
    }

    private final wk b(int param0, int param1) {
        if (param0 >= -15) {
            ((ep) this).a(29);
        }
        return new wk(ql.field_j.a("intro" + (param1 - -1) + ".jpg", -125, ""), (java.awt.Component) (Object) ll.p(0));
    }

    final void a(boolean param0) {
        int var3 = 0;
        L0: {
          var3 = ArmiesOfGielinor.field_M ? 1 : 0;
          ((ep) this).field_l = ((ep) this).field_l + 1;
          if (0 < ((ep) this).field_m) {
            int fieldTemp$1 = ((ep) this).field_m - 1;
            ((ep) this).field_m = ((ep) this).field_m - 1;
            if (0 == fieldTemp$1) {
              ((ep) this).field_j = ((ep) this).field_j + 1;
              if (((ep) this).field_j == 1) {
                ((ep) this).field_m = 200;
                break L0;
              } else {
                if (2 == ((ep) this).field_j) {
                  ((ep) this).field_m = 50;
                  break L0;
                } else {
                  break L0;
                }
              }
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
        if (((ep) this).field_j == 3) {
          L1: {
            if (((ep) this).field_n <= 0) {
              L2: {
                if (((ep) this).field_i.length <= ((ep) this).field_c) {
                  bv.a(false, 0, 1, jt.field_a);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (((ep) this).field_g != 0) {
                  if (1 == ((ep) this).field_g) {
                    ((ep) this).field_e = ((ep) this).field_e - 0.256;
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  ((ep) this).field_e = ((ep) this).field_e + 0.256;
                  break L3;
                }
              }
              ((ep) this).field_l = ((ep) this).field_l + 1;
              if (((ep) this).field_e >= 11.904) {
                L4: {
                  if (((ep) this).field_k <= 2521.0) {
                    break L4;
                  } else {
                    if (2552.0 <= ((ep) this).field_k) {
                      break L4;
                    } else {
                      ((ep) this).field_e = ((ep) this).field_e - 0.256;
                      break L1;
                    }
                  }
                }
                ((ep) this).field_e = 11.904;
                ((ep) this).field_g = 1;
                break L1;
              } else {
                if (0.0 >= ((ep) this).field_e) {
                  ((ep) this).field_g = 0;
                  ((ep) this).field_e = 0.0;
                  ((ep) this).field_n = ((ep) this).field_i[((ep) this).field_c];
                  ((ep) this).field_c = ((ep) this).field_c + 1;
                  break L1;
                } else {
                  break L1;
                }
              }
            } else {
              ((ep) this).field_n = ((ep) this).field_n - 1;
              break L1;
            }
          }
          L5: {
            if (0.0 != ((ep) this).field_e) {
              break L5;
            } else {
              ((ep) this).field_e = 0.175;
              break L5;
            }
          }
          L6: {
            ((ep) this).field_k = ((ep) this).field_k + ((ep) this).field_e;
            if (((ep) this).field_k >= 2835.0) {
              ((ep) this).field_k = 2835.0;
              ((ep) this).field_q = ((ep) this).field_q + 1;
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (!param0) {
              break L7;
            } else {
              field_f = false;
              break L7;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(int param0) {
        OutOfMemoryError var2_ref_OutOfMemoryError = null;
        int var2 = 0;
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
        String[] var12 = null;
        String[] var13 = null;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        int stackIn_42_3 = 0;
        int stackIn_42_4 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_43_2 = 0;
        int stackIn_43_3 = 0;
        int stackIn_43_4 = 0;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        int stackIn_44_2 = 0;
        int stackIn_44_3 = 0;
        int stackIn_44_4 = 0;
        int stackIn_44_5 = 0;
        int stackIn_48_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        int stackOut_41_3 = 0;
        int stackOut_41_4 = 0;
        int stackOut_43_0 = 0;
        int stackOut_43_1 = 0;
        int stackOut_43_2 = 0;
        int stackOut_43_3 = 0;
        int stackOut_43_4 = 0;
        int stackOut_43_5 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        int stackOut_42_2 = 0;
        int stackOut_42_3 = 0;
        int stackOut_42_4 = 0;
        int stackOut_42_5 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        L0: {
          var11 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 == 256) {
            break L0;
          } else {
            int discarded$1 = this.a(53, -105);
            break L0;
          }
        }
        L1: {
          if (((ep) this).field_j == 3) {
            L2: {
              if (ck.field_c == null) {
                ck.field_c = new wk[16];
                try {
                  L3: {
                    var2 = 0;
                    L4: while (true) {
                      if (var2 >= 16) {
                        break L3;
                      } else {
                        ck.field_c[var2] = this.b(kf.b(param0, -383), var2);
                        var2++;
                        continue L4;
                      }
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var2_ref_OutOfMemoryError = (OutOfMemoryError) (Object) decompiledCaughtException;
                    break L5;
                  }
                }
                break L2;
              } else {
                break L2;
              }
            }
            L6: {
              var2 = -(int)(256.0 * (((ep) this).field_k - ((ep) this).field_d) / 8.75) + 256;
              var3 = ((ep) this).field_k;
              var5 = (int)(16.0 * ((ep) this).field_k);
              if (var2 > 0) {
                var3 = (double)this.a(-320, 4592);
                this.a(var5, (byte) -79);
                qn.b(0, 0, so.field_b.field_a, so.field_b.field_g, 65793, var2);
                break L6;
              } else {
                this.a(var5, (byte) -79);
                break L6;
              }
            }
            L7: {
              if (((ep) this).field_c < 5) {
                L8: {
                  var6 = -1 + ((ep) this).field_c;
                  if (((ep) this).field_g == 1) {
                    var6++;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                if (var6 < 0) {
                  break L7;
                } else {
                  if (md.field_A.length <= var6) {
                    break L7;
                  } else {
                    var7_ref_String__ = new String[10];
                    var8 = hh.field_i.a(md.field_A[var6], new int[1], var7_ref_String__);
                    var9 = 0;
                    L9: while (true) {
                      if (var9 >= var8) {
                        break L7;
                      } else {
                        var10 = 435 + 16 * var9;
                        hh.field_i.a(var7_ref_String__[var9], this.a(320, 4592), this.a((byte) -104, var10), 16777215, 65793, 256 - (int)(((ep) this).field_e * 256.0 / 11.904));
                        var9++;
                        continue L9;
                      }
                    }
                  }
                }
              } else {
                break L7;
              }
            }
            var6 = ((ep) this).field_l * 200;
            if (((ep) this).field_q > 0) {
              L10: {
                var7 = ((ep) this).field_q + -100;
                if (0 >= var7) {
                  break L10;
                } else {
                  L11: {
                    var7 = (int)Math.pow(1.1, (double)var7);
                    stackOut_41_0 = 0;
                    stackOut_41_1 = 0;
                    stackOut_41_2 = so.field_b.field_a;
                    stackOut_41_3 = so.field_b.field_g;
                    stackOut_41_4 = 65793;
                    stackIn_43_0 = stackOut_41_0;
                    stackIn_43_1 = stackOut_41_1;
                    stackIn_43_2 = stackOut_41_2;
                    stackIn_43_3 = stackOut_41_3;
                    stackIn_43_4 = stackOut_41_4;
                    stackIn_42_0 = stackOut_41_0;
                    stackIn_42_1 = stackOut_41_1;
                    stackIn_42_2 = stackOut_41_2;
                    stackIn_42_3 = stackOut_41_3;
                    stackIn_42_4 = stackOut_41_4;
                    if (var7 <= 256) {
                      stackOut_43_0 = stackIn_43_0;
                      stackOut_43_1 = stackIn_43_1;
                      stackOut_43_2 = stackIn_43_2;
                      stackOut_43_3 = stackIn_43_3;
                      stackOut_43_4 = stackIn_43_4;
                      stackOut_43_5 = var7;
                      stackIn_44_0 = stackOut_43_0;
                      stackIn_44_1 = stackOut_43_1;
                      stackIn_44_2 = stackOut_43_2;
                      stackIn_44_3 = stackOut_43_3;
                      stackIn_44_4 = stackOut_43_4;
                      stackIn_44_5 = stackOut_43_5;
                      break L11;
                    } else {
                      stackOut_42_0 = stackIn_42_0;
                      stackOut_42_1 = stackIn_42_1;
                      stackOut_42_2 = stackIn_42_2;
                      stackOut_42_3 = stackIn_42_3;
                      stackOut_42_4 = stackIn_42_4;
                      stackOut_42_5 = 256;
                      stackIn_44_0 = stackOut_42_0;
                      stackIn_44_1 = stackOut_42_1;
                      stackIn_44_2 = stackOut_42_2;
                      stackIn_44_3 = stackOut_42_3;
                      stackIn_44_4 = stackOut_42_4;
                      stackIn_44_5 = stackOut_42_5;
                      break L11;
                    }
                  }
                  qn.b(stackIn_44_0, stackIn_44_1, stackIn_44_2, stackIn_44_3, stackIn_44_4, stackIn_44_5);
                  break L10;
                }
              }
              L12: {
                var8 = ((ep) this).field_q << 2;
                if (var8 <= 256) {
                  stackOut_47_0 = var8;
                  stackIn_48_0 = stackOut_47_0;
                  break L12;
                } else {
                  stackOut_46_0 = 256;
                  stackIn_48_0 = stackOut_46_0;
                  break L12;
                }
              }
              var8 = stackIn_48_0;
              ol.field_y.e(this.a(-(int)((ep) this).field_k + 3002, 4592), this.a((byte) -81, 90), var8);
              if (var7 < 160000) {
                break L1;
              } else {
                bv.a(false, 0, 1, jt.field_a);
                break L1;
              }
            } else {
              L13: {
                qn.a((int)(16.0 * (-var3 + (double)this.a(1105, param0 + 4336))), this.a((byte) -73, 119) << 4, 480, (ae.b(var6, 100) >> 13) + 32, fe.field_o[1]);
                qn.a((int)(16.0 * (-var3 + (double)this.a(1068, 4592))), this.a((byte) -42, 219) << 4, 480, 32 - -(ae.b(800 + var6, 100) >> 13), fe.field_o[2]);
                qn.a((int)(16.0 * ((double)this.a(1105, 4592) - var3)), this.a((byte) -39, 286) << 4, 480, (ae.b(var6 - -1600, param0 + -156) >> 13) + 32, fe.field_o[3]);
                qn.a((int)(16.0 * (-var3 + (double)this.a(1443, 4592))), this.a((byte) -89, 116) << 4, 480, 32 + (ae.b(2400 + var6, 100) >> 13), fe.field_o[4]);
                qn.a((int)((-var3 + (double)this.a(1478, 4592)) * 16.0), this.a((byte) -62, 207) << 4, 480, 32 + (ae.b(var6 - -3200, param0 ^ 356) >> 13), fe.field_o[5]);
                qn.a((int)(16.0 * (-var3 + (double)this.a(1446, 4592))), this.a((byte) -103, 295) << 4, 480, 32 + (ae.b(4000 + var6, 100) >> 13), fe.field_o[6]);
                qn.b((int)(this.a(1890.0 - ((ep) this).field_k, 16) * 16.0), this.a((byte) -78, 160) << 4, 1600, 32 + (ae.b(150 + (var6 >> 1), 100) >> 14), fe.field_o[0]);
                qn.a((int)(16.0 * (-var3 + (double)this.a(2614, 4592))), this.a((byte) -74, 219) << 4, 80, (ae.b(var6, 100) >> 13) + 32 >> 2, fe.field_o[1]);
                var7 = 256 + (ae.b(var6 / 4, 100) + -65536);
                if (var7 > 0) {
                  ih.field_H.e((int)(-var3 + (double)this.a(2568, 4592)), this.a((byte) -29, 141), var7);
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                var7 = 256 + (ae.b(var6 / 2, 100) - 65536);
                if (var7 <= 0) {
                  break L14;
                } else {
                  ih.field_H.e((int)((double)this.a(2516, 4592) - var3), this.a((byte) -119, 206), var7);
                  break L14;
                }
              }
              var7 = -65536 + ae.b(var6 / 3, 100) - -256;
              if (var7 <= 0) {
                break L1;
              } else {
                ih.field_H.e((int)((double)this.a(2665, param0 + 4336) - var3), this.a((byte) -53, 168), var7);
                break L1;
              }
            }
          } else {
            qn.b();
            var12 = new String[10];
            var13 = var12;
            var3_int = nr.field_e.a(ts.field_b, new int[1], var13);
            var4 = 0;
            L15: while (true) {
              if (var4 >= var3_int) {
                if (((ep) this).field_j != 1) {
                  L16: {
                    var4 = (((ep) this).field_m << 8) / 50;
                    if (((ep) this).field_j != 2) {
                      break L16;
                    } else {
                      var4 = 256 - var4;
                      break L16;
                    }
                  }
                  qn.b(this.a(0, param0 ^ 4336), this.a((byte) -56, 0), so.field_b.field_a, so.field_b.field_g, 65793, var4);
                  break L1;
                } else {
                  break L1;
                }
              } else {
                var5 = this.a((byte) -90, var4 * 20 + 200);
                fe.c(var12[var4], this.a(320, 4592), var5, nd.field_b, true);
                var4++;
                continue L15;
              }
            }
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
            throw ig.a((Throwable) (Object) runtimeException, "ep.E(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    private final void a(int param0, byte param1) {
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
        int[] var17 = null;
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        var17 = new int[qn.field_g];
        var4 = -param0;
        var4 = var4 + kv.field_F;
        var5 = -1;
        var6 = us.field_a;
        L0: while (true) {
          L1: {
            if (var6 >= 16) {
              break L1;
            } else {
              var7 = var4;
              var8 = (var7 >> 4) - -this.a(0, 4592);
              if (qn.field_l <= var8) {
                break L1;
              } else {
                L2: {
                  if (null == ck.field_c[var6]) {
                    ck.field_c[var6] = this.b(-99, var6);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var9 = ck.field_c[var6].field_y;
                var4 = var4 + (var9 << 4);
                var10 = var8 + var9;
                if (var10 >= 0) {
                  L3: {
                    var11 = -(var7 & 15) + 15;
                    if (var8 >= 0) {
                      break L3;
                    } else {
                      var9 = var9 + var8;
                      var11 = var11 - (var8 << 4);
                      var8 = 0;
                      break L3;
                    }
                  }
                  L4: {
                    if (qn.field_l >= var10) {
                      break L4;
                    } else {
                      var9 = var9 - (var10 - qn.field_l);
                      break L4;
                    }
                  }
                  L5: {
                    var12 = this.a((byte) -34, 0);
                    if (var5 < 0) {
                      var5 = var8;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (0 <= var12) {
                      break L6;
                    } else {
                      var12 = 0;
                      break L6;
                    }
                  }
                  fe.a(ck.field_c[var6], var11, 0, var8, var12, var9, var17);
                  var6++;
                  continue L0;
                } else {
                  us.field_a = 1 + var6;
                  kv.field_F = kv.field_F + (var9 << 4);
                  ck.field_c[var6] = null;
                  var6++;
                  continue L0;
                }
              }
            }
          }
          var6 = 0;
          L7: while (true) {
            if (var6 >= 64) {
              return;
            } else {
              qn.d(var6 + var5, this.a((byte) -45, 0), qn.field_g, 0, 255 - (var6 << 2));
              var6++;
              continue L7;
            }
          }
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
            Throwable decompiledCaughtException = null;
            int stackOut_12_0 = 0;
            int stackOut_29_0 = 0;
            int stackOut_24_0 = 0;
            int stackOut_33_0 = 0;
            if (ai.field_T.field_q >= 4) {
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
                      stackOut_12_0 = as.a(-1, (byte) 101);
                      stackIn_13_0 = stackOut_12_0;
                      return stackIn_13_0;
                    }
                  }
                }
                L2: {
                  if (ta.field_N != 2) {
                    break L2;
                  } else {
                    jj.field_g = new hi((java.net.Socket) kd.field_R.field_f, vq.field_c);
                    var2 = new vh(13);
                    it.a(hq.field_e, false, am.field_x, var2, ek.field_e);
                    var2.b(1, 15);
                    var2.a((byte) -124, vq.field_d);
                    jj.field_g.a(var2.field_o, (byte) 20, 0, 13);
                    ta.field_N = ta.field_N + 1;
                    fi.field_s = 30000L + vi.b(103);
                    break L2;
                  }
                }
                L3: {
                  if (3 == ta.field_N) {
                    if (jj.field_g.d((byte) 43) <= 0) {
                      if (vi.b(97) > fi.field_s) {
                        stackOut_29_0 = as.a(-2, (byte) 101);
                        stackIn_30_0 = stackOut_29_0;
                        return stackIn_30_0;
                      } else {
                        break L3;
                      }
                    } else {
                      var1_int = jj.field_g.a(70);
                      if (var1_int != 0) {
                        stackOut_24_0 = as.a(var1_int, (byte) 101);
                        stackIn_25_0 = stackOut_24_0;
                        return stackIn_25_0;
                      } else {
                        ta.field_N = ta.field_N + 1;
                        break L3;
                      }
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
                  stackOut_33_0 = 0;
                  stackIn_34_0 = stackOut_33_0;
                  return stackIn_34_0;
                } else {
                  return -1;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return as.a(-3, (byte) 101);
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
                field_p = null;
            }
            var4 = sb.field_i.field_X;
            String var3 = var4;
            sb.field_i.field_X = param1;
            eu.field_g.b(param2, 20);
            sb.field_i.field_X = var4;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ep.H(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    private final int a(int param0, int param1) {
        if (param1 != 4592) {
            ((ep) this).field_m = -45;
        }
        return (so.field_b.field_a - ce.field_Q >> 1) - -param0;
    }

    public static void a(byte param0) {
        field_b = null;
        field_h = null;
        field_p = null;
        field_a = null;
    }

    ep(kl param0) {
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
            kv.field_F = 0;
            ql.field_j = param0;
            us.field_a = 0;
            ((ep) this).field_d = 301.25;
            ((ep) this).field_k = ((ep) this).field_d;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ep.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    private final double a(double param0, int param1) {
        return (double)(-ce.field_Q + so.field_b.field_a >> 1) + param0;
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
