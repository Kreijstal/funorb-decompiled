/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sp extends im {
    private int[] field_Pb;
    static ut[] field_Hb;
    int field_Fb;
    int field_Qb;
    up field_Sb;
    private pu[] field_Ib;
    static String field_Db;
    private boolean field_Lb;
    static int field_Ob;
    static String field_Kb;
    hd field_Mb;
    static np field_Jb;
    static String field_Rb;
    int field_Gb;
    static String field_Eb;
    static String field_Cb;
    String field_Nb;

    final static void a(int param0, fa param1, int param2) {
        ml var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              var3 = or.field_d;
              var3.b(param0, (byte) -117);
              var3.a(113, param1.field_i);
              var3.g(-1207444472, param1.field_f);
              if (param2 == -51265247) {
                break L1;
              } else {
                field_Db = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var3_ref);

            stackIn_5_1 = new StringBuilder().append("sp.JA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ')');
        }
    }

    final static wh c(int param0, int param1) {
        int var2 = 62 % ((-55 - param1) / 32);
        return gt.a(false, 128, (byte) 126, param0);
    }

    final static void a(String param0, byte param1) {
        try {
            pq.a(16, param0, true);
            if (param1 != 74) {
                fa var3 = (fa) null;
                sp.a(40, (fa) null, -96);
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "sp.KA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void b(int param0, int param1) {
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0;
        int stackIn_24_1;
        int stackIn_24_2;
        int stackIn_24_3;
        int stackIn_26_0;
        int stackIn_26_1;
        int stackIn_26_2;
        int stackIn_26_3;
        int stackIn_26_4;
        int var3;
        ot var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        L0: {
          var10 = Kickabout.field_G;
          if (on.field_h < this.field_T) {
            break L0;
          } else {
            if (on.field_e > this.field_T - -this.field_mb) {
              break L0;
            } else {
              L1: {
                if (!this.field_Lb) {
                  break L1;
                } else {
                  uv.a(56 + this.field_F, (byte) 95, 39 + this.field_T);
                  var3 = q.field_d.a(eq.field_b);
                  q.field_d.a(eq.field_b, 70 + this.field_F, this.field_T - -44, 16763955, 5583616);
                  c.a(31, 28 + (this.field_F + 56 + var3), this.field_T - -39, 8000);
                  break L1;
                }
              }
              L2: {
                var3 = this.field_F;
                var4 = kk.a(this.field_Sb, param0 + 0, false);
                if (var4 != null) {
                  var4.c(1 + var3, 4 + this.field_T);
                  break L2;
                } else {
                  jr.a(19 + (1 + var3), -92, 23 + (this.field_T + 4));
                  break L2;
                }
              }
              this.field_X.a(this.field_Sb.d(100), var3 + 40, 4 + (this.field_mb >> 701551777) + this.field_T, this.field_y, -1);
              var3 = var3 + this.field_Pb[param0];
              this.field_X.a(uf.field_e[this.field_Sb.field_q], 8 + var3, this.field_T - -(this.field_mb >> -1261060767) - -4, this.field_y, -1);
              var3 = var3 + this.field_Pb[1];
              var5 = 6 + var3;
              var6 = 0;
              L3: while (true) {
                if (3 <= var6) {
                  L4: {
                    var3 = var3 + this.field_Pb[2];
                    if (this.field_Sb.field_h.length == 0) {
                      pb.field_C.d(hi.field_w, var3 - -(this.field_Pb[3] >> -1117758815), (this.field_mb >> -332979999) + this.field_T - -4, 16777215, -1);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    var3 = var3 + this.field_Pb[3];
                    var3 = var3 + (this.field_Pb[4] - -pb.field_C.a(this.field_Nb) >> -33157919);
                    var6 = -5 + (this.field_q + this.field_F);
                    if (var6 >= var3) {
                      break L5;
                    } else {
                      var3 = var6;
                      break L5;
                    }
                  }
                  pb.field_C.c(this.field_Nb, var3, 17 + this.field_T, 16777215, -1);
                  return;
                } else {
                  L6: {
                    var7 = this.field_T + 5 + 15 * var6;
                    if (var6 != 0) {
                      if (1 == var6) {
                        stackIn_16_0 = this.field_Sb.field_g;
                        break L6;
                      } else {
                        stackIn_16_0 = this.field_Sb.field_o;
                        break L6;
                      }
                    } else {
                      stackIn_16_0 = this.field_Sb.field_n;
                      break L6;
                    }
                  }
                  L7: {
                    var8 = stackIn_16_0;
                    if (0 == var6) {
                      stackIn_21_0 = this.field_Sb.c(true, oi.b(-91));
                      break L7;
                    } else {
                      if (-2 != (var6 ^ -1)) {
                        stackIn_21_0 = this.field_Sb.b((byte) 84, oi.b(99));
                        break L7;
                      } else {
                        stackIn_21_0 = this.field_Sb.a(5205, oi.b(param0 + 118));
                        break L7;
                      }
                    }
                  }
                  L8: {
                    L9: {
                      var9 = stackIn_21_0;
                      stackIn_24_0 = var5;

                      stackIn_24_1 = var7;

                      stackIn_24_2 = var8;

                      stackIn_24_3 = var6;

                      if (this.field_gb) {
                        break L9;
                      } else {








                        if ((param1 ^ -1) != -3) {
                          stackIn_26_0 = stackIn_24_0;
                          stackIn_26_1 = stackIn_24_1;
                          stackIn_26_2 = stackIn_24_2;
                          stackIn_26_3 = stackIn_24_3;
                          stackIn_26_4 = 0;
                          break L8;
                        } else {




                          break L9;
                        }
                      }
                    }
                    stackIn_26_0 = stackIn_24_0;
                    stackIn_26_1 = stackIn_24_1;
                    stackIn_26_2 = stackIn_24_2;
                    stackIn_26_3 = stackIn_24_3;
                    stackIn_26_4 = 1;
                    break L8;
                  }
                  eo.a(stackIn_26_0, stackIn_26_1, stackIn_26_2, stackIn_26_3, stackIn_26_4 != 0, var9);
                  var6++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    final static ut[] a(byte param0, int param1) {
        if (param0 != 26) {
            return (ut[]) null;
        }
        ut[] var3 = new ut[9];
        ut[] var2 = var3;
        var3[4] = lh.a(param1, (byte) -96, 64);
        return var2;
    }

    final void c(int param0, boolean param1) {
        int var3 = 0;
        int var4 = Kickabout.field_G;
        if (!(!param1)) {
            for (var3 = 0; this.field_Ib.length > var3; var3++) {
                this.field_Ib[var3].h((byte) 30);
            }
        }
        if (param0 != 0) {
            this.c(-44, true);
        }
    }

    final static void i(int param0) {
        if (!(!pb.field_B)) {
            return;
        }
        int var1 = param0 + 81920 / hw.field_i;
        int var2 = 61440 / hw.field_i + -240;
        int var3 = -var1 + 896;
        if (!((double)var2 <= jr.field_Gb)) {
            jr.field_Gb = (double)var2;
        }
        if (hd.field_K < (double)var1) {
            hd.field_K = (double)var1;
        }
        int var4 = 1344 - var2;
        if (848.0 > hw.field_f) {
            hw.field_f = 848.0;
        }
        if ((double)var3 < hd.field_K) {
            hd.field_K = (double)var3;
        }
        if (!(jr.field_Gb <= (double)var4)) {
            jr.field_Gb = (double)var4;
        }
        if (!(2048.0 >= hw.field_f)) {
            hw.field_f = 2048.0;
        }
    }

    final static boolean a(byte[] param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        String var5 = null;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -3) {
                break L1;
              } else {
                var5 = (String) null;
                sp.a((String) null, (byte) -105);
                break L1;
              }
            }
            L2: {
              L3: {
                if (-3 < (param3 ^ -1)) {
                  break L3;
                } else {
                  if (param3 > param2) {
                    break L3;
                  } else {
                    if (vi.a(param3, 127, da.field_k, param0)) {
                      break L3;
                    } else {
                      L4: {
                        if (-1 == (param0[3] ^ -1)) {
                          break L4;
                        } else {
                          if ((param0[3] ^ -1) != -2) {
                            break L3;
                          } else {
                            if ((param3 ^ -1) > -5) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      stackIn_11_0 = 1;
                      break L2;
                    }
                  }
                }
              }
              stackIn_11_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("sp.L(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_11_0 != 0;
    }

    public static void j(int param0) {
        field_Jb = null;
        field_Cb = null;
        field_Kb = null;
        field_Hb = null;
        if (param0 != -240) {
            field_Hb = (ut[]) null;
        }
        field_Eb = null;
        field_Rb = null;
        field_Db = null;
    }

    sp(up param0, int[] param1, int param2, int param3, boolean param4) {
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        fn var9 = null;
        pu var10 = null;
        int var11 = 0;
        int var12 = 0;
        try {
          L0: {
            L1: {
              this.field_y = 16777215;
              stackIn_3_0 = this;

              if (!param4) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            ((sp) (this)).field_Lb = stackIn_4_1 != 0;
            this.field_Sb = param0;
            this.field_mb = 50;
            this.field_Fb = param2;
            this.field_X = (hu) ((Object) pb.field_C);
            this.field_Pb = param1;
            this.field_Qb = param3;
            this.field_Mb = eo.b();
            this.a((byte) -121, this.field_Mb);
            this.field_Mb.field_s = this.field_Pb[-1 + this.field_Pb.length] - this.field_Mb.field_q >> -512648991;
            var6_int = 0;
            L2: while (true) {
              if (var6_int >= this.field_Pb.length - 1) {
                L3: {
                  this.field_Mb.field_J = 21;
                  this.field_Gb = gp.a(this.field_Sb, -576054046);
                  if (0 != (this.field_Fb ^ -1)) {
                    break L3;
                  } else {
                    this.field_Gb = 0;
                    break L3;
                  }
                }
                this.field_Nb = ad.a(this.field_Gb, 26300);
                var6_int = this.field_Pb[0] - -this.field_Pb[1] + (this.field_Pb[2] - -(this.field_Pb[3] >> 1056367841));
                var7 = this.field_mb >> -823969215;
                this.field_Ib = new pu[this.field_Sb.field_h.length];
                var8 = 0;
                L4: while (true) {
                  if (var8 >= this.field_Ib.length) {
                    break L0;
                  } else {
                    L5: {
                      var9 = pa.field_g[this.field_Sb.field_h[var8]];
                      var10 = new pu(var9, true);
                      var11 = var6_int;
                      var12 = var7;
                      if ((this.field_Sb.field_h.length ^ -1) != -3) {
                        if (3 != this.field_Sb.field_h.length) {
                          break L5;
                        } else {
                          if (var8 != 1) {
                            var12 += 10;
                            var11 = var8 / 2 * 20 + -10 + var11;
                            break L5;
                          } else {
                            var12 -= 10;
                            break L5;
                          }
                        }
                      } else {
                        var11 = -10 + var11 - -(var8 * 20);
                        break L5;
                      }
                    }
                    var10.field_J = var12 - (var10.field_mb >> -51265247);
                    var10.field_s = -(var10.field_q >> 909332097) + var11;
                    this.a((byte) -105, (hd) (var10));
                    this.field_Ib[var8] = var10;
                    var8++;
                    continue L4;
                  }
                }
              } else {
                this.field_Mb.field_s = this.field_Mb.field_s + this.field_Pb[var6_int];
                var6_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var6);

            stackIn_21_1 = new StringBuilder().append("sp.<init>(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L7;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_Db = "Unable to delete name - system busy";
        field_Ob = 0;
        field_Kb = "<%0> has entered a game.";
        field_Rb = "No Buyout";
        field_Cb = "Message lobby";
        field_Eb = "Scamming";
    }
}
