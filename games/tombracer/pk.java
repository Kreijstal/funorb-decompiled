/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk extends we {
    static jea field_z;
    private int field_u;
    private int[] field_A;
    private long[][] field_w;
    static String field_v;
    private int[][] field_F;
    private int[] field_B;
    static jea field_s;
    private int field_E;
    private int[] field_D;
    static int field_r;
    private String[][] field_y;
    private int field_x;
    static int field_C;
    private int[] field_t;

    final String b(int param0, byte param1) {
        if (param1 >= 111) {
          if (-1 == (param0 ^ -1)) {
            return fga.field_a;
          } else {
            return super.b(param0, (byte) 113);
          }
        } else {
          this.a(false, true, 79);
          if (-1 == (param0 ^ -1)) {
            return fga.field_a;
          } else {
            return super.b(param0, (byte) 113);
          }
        }
    }

    final void a(boolean param0, boolean param1, int param2) {
        int var4 = 0;
        int var5_int = 0;
        bb var5 = null;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        super.a(param0, param1, param2);
        if (param0) {
          if (vpa.a(8)) {
            this.field_E = 1;
            return;
          } else {
            var4 = cb.field_i.length;
            var5_int = 0;
            L0: while (true) {
              L1: {
                if (var5_int >= var4) {
                  break L1;
                } else {
                  L2: {
                    if (jba.field_j < -(this.field_D[var5_int] >> 1503307809) + this.field_A[var5_int]) {
                      break L2;
                    } else {
                      if (jba.field_j > this.field_A[var5_int] + (this.field_D[var5_int] >> -1780601759)) {
                        break L2;
                      } else {
                        if (-(this.field_t[var5_int] >> -1779214079) + this.field_B[var5_int] > sta.field_B) {
                          break L2;
                        } else {
                          if ((this.field_t[var5_int] >> -1442500191) + this.field_B[var5_int] >= sta.field_B) {
                            if (1 != hf.field_b) {
                              break L2;
                            } else {
                              pt.field_p = null;
                              this.field_u = var5_int;
                              break L2;
                            }
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  var5_int++;
                  if (var6 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
              var5 = pt.field_p;
              if (var5 != null) {
                if (var5.field_h) {
                  if (var5.field_k != null) {
                    this.field_F = var5.field_p;
                    this.field_y = var5.field_k;
                    this.field_E = 2;
                    this.field_w = var5.field_o;
                    if (this.field_y[this.field_x][0] == null) {
                      this.field_E = 3;
                      if (var6 != 0) {
                        this.field_E = 0;
                        if (var6 == 0) {
                          return;
                        } else {
                          pt.field_p = uta.a(3, this.field_u, 0, 10, 1);
                          this.field_E = 0;
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    this.field_E = 1;
                    if (var6 != 0) {
                      this.field_F = var5.field_p;
                      this.field_y = var5.field_k;
                      this.field_E = 2;
                      this.field_w = var5.field_o;
                      if (this.field_y[this.field_x][0] == null) {
                        this.field_E = 3;
                        if (var6 != 0) {
                          this.field_E = 0;
                          if (var6 != 0) {
                            pt.field_p = uta.a(3, this.field_u, 0, 10, 1);
                            this.field_E = 0;
                            return;
                          } else {
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
                } else {
                  this.field_E = 0;
                  if (var6 == 0) {
                    return;
                  } else {
                    pt.field_p = uta.a(3, this.field_u, 0, 10, 1);
                    this.field_E = 0;
                    return;
                  }
                }
              } else {
                pt.field_p = uta.a(3, this.field_u, 0, 10, 1);
                this.field_E = 0;
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final void b(byte param0, int param1) {
        boolean discarded$0 = false;
        if (param0 <= 54) {
            discarded$0 = this.a(-109, (byte) -61, 118);
            this.field_x = param1;
            return;
        }
        this.field_x = param1;
    }

    final int a(byte param0, int param1) {
        if (param0 < 111) {
          return 78;
        } else {
          return 335 + (-(80 * this.field_m.length) - -(param1 * 160));
        }
    }

    final int g(int param0, int param1) {
        int discarded$0 = 0;
        if (param1 != 30) {
            discarded$0 = this.g(-68, -86);
            return koa.b(0) + -30;
        }
        return koa.b(0) + -30;
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, String param5) {
        da var11 = null;
        da var12 = null;
        String var8 = null;
        String var10 = null;
        try {
            var11 = kn.field_p;
            var12 = var11;
            int var9 = 44 % ((param4 - -34) / 41);
            var8 = param1 >= 10 ? Integer.toString(param1) : "0" + (char)(48 - -param1);
            if ((param1 ^ -1) == 0) {
                var8 = "";
            }
            var10 = f.a(2843, true, bg.field_t, (long)param2, 0);
            var11.a(-1, -1, ab.field_t[0], param3 | -16777216, param0, var8);
            var11.a(param0, false, param5, ab.field_t[1], param3 | -16777216, -1);
            var12.a(12199, param0, var10, -1, param3 | -16777216, ab.field_t[2]);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "pk.FA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean a(int param0, byte param1, int param2) {
        String[] var4 = null;
        kb var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        String[] var17 = null;
        int[] var24 = null;
        long[] var25 = null;
        int stackIn_3_0 = 0;
        String stackIn_6_0 = null;
        String stackIn_7_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_18_3 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_19_3 = 0;
        int stackIn_19_4 = 0;
        String stackIn_24_0 = null;
        String stackIn_29_0 = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        String stackOut_28_0 = null;
        String stackOut_23_0 = null;
        String stackOut_5_0 = null;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        int stackOut_18_4 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        int stackOut_17_4 = 0;
        L0: {
          var16 = TombRacer.field_G ? 1 : 0;
          var17 = this.field_y[param0];
          var4 = var17;
          var24 = this.field_F[param0];
          var25 = this.field_w[param0];
          var7 = qv.field_o;
          var8 = 0;
          if (var7 != null) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var9 = stackIn_3_0;
        var10 = param2 + 140;
        var11 = 0;
        var12 = 140 + param2;
        L1: while (true) {
          if (var11 >= 10) {
            if (var9 == 0) {
              if (this.field_u != var7.field_f) {
                L2: {
                  if (param1 < -85) {
                    break L2;
                  } else {
                    field_v = (String) null;
                    break L2;
                  }
                }
                return var8 != 0;
              } else {
                L3: {
                  var8 = 1;
                  this.a(var10 - -20, -1, var7.field_o[0], -5818367, -91, fna.field_k);
                  if (param1 < -85) {
                    break L3;
                  } else {
                    stackOut_28_0 = (String) null;
                    stackIn_29_0 = stackOut_28_0;
                    field_v = stackIn_29_0;
                    break L3;
                  }
                }
                return var8 != 0;
              }
            } else {
              L4: {
                if (param1 < -85) {
                  break L4;
                } else {
                  stackOut_23_0 = (String) null;
                  stackIn_24_0 = stackOut_23_0;
                  field_v = stackIn_24_0;
                  break L4;
                }
              }
              return var8 != 0;
            }
          } else {
            var13 = var17[var11];
            stackOut_5_0 = (String) (var13);
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (var16 == 0) {
              L5: {
                if (stackIn_7_0 == null) {
                  break L5;
                } else {
                  if (var13.length() == 0) {
                    break L5;
                  } else {
                    L6: {
                      var14 = var24[var11];
                      var15 = 0;
                      if (var9 == 0) {
                        if (var25[var11] != var7.field_h) {
                          break L6;
                        } else {
                          if (var7.field_o[0] != var14) {
                            break L6;
                          } else {
                            if (ue.a(var13, 0)) {
                              var9 = 1;
                              var15 = 1;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                        }
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      var10 = var12;
                      stackOut_16_0 = this;
                      stackOut_16_1 = var12;
                      stackOut_16_2 = var11 - -1;
                      stackOut_16_3 = var14;
                      stackIn_18_0 = stackOut_16_0;
                      stackIn_18_1 = stackOut_16_1;
                      stackIn_18_2 = stackOut_16_2;
                      stackIn_18_3 = stackOut_16_3;
                      stackIn_17_0 = stackOut_16_0;
                      stackIn_17_1 = stackOut_16_1;
                      stackIn_17_2 = stackOut_16_2;
                      stackIn_17_3 = stackOut_16_3;
                      if (var15 != 0) {
                        stackOut_18_0 = this;
                        stackOut_18_1 = stackIn_18_1;
                        stackOut_18_2 = stackIn_18_2;
                        stackOut_18_3 = stackIn_18_3;
                        stackOut_18_4 = 10309393;
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        stackIn_19_2 = stackOut_18_2;
                        stackIn_19_3 = stackOut_18_3;
                        stackIn_19_4 = stackOut_18_4;
                        break L7;
                      } else {
                        stackOut_17_0 = this;
                        stackOut_17_1 = stackIn_17_1;
                        stackOut_17_2 = stackIn_17_2;
                        stackOut_17_3 = stackIn_17_3;
                        stackOut_17_4 = 2431750;
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        stackIn_19_2 = stackOut_17_2;
                        stackIn_19_3 = stackOut_17_3;
                        stackIn_19_4 = stackOut_17_4;
                        break L7;
                      }
                    }
                    this.a(stackIn_19_1, stackIn_19_2, stackIn_19_3, stackIn_19_4, -105, var13);
                    var8 = 1;
                    break L5;
                  }
                }
              }
              var11++;
              var12 += 20;
              continue L1;
            } else {
              field_v = stackIn_6_0;
              return var8 != 0;
            }
          }
        }
    }

    final void a(boolean param0, int param1, byte param2) {
        boolean discarded$12 = false;
        boolean discarded$13 = false;
        boolean discarded$14 = false;
        boolean discarded$15 = false;
        int var4 = 0;
        Object var5 = null;
        nh var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        qr.field_v.a(param1 + 63, false, vea.field_a.toUpperCase() + " - " + bi.field_b[this.field_x].toUpperCase(), 65, -14279929, -1);
        if (param2 <= -9) {
          var4 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (var4 >= cb.field_i.length) {
                  break L2;
                } else {
                  var5 = null;
                  var6 = 255;
                  stackOut_4_0 = this.field_u ^ -1;
                  stackOut_4_1 = var4 ^ -1;
                  stackIn_10_0 = stackOut_4_0;
                  stackIn_10_1 = stackOut_4_1;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  if (var7 != 0) {
                    break L1;
                  } else {
                    L3: {
                      if (stackIn_5_0 == stackIn_5_1) {
                        var5_ref = cb.field_i[var4];
                        break L3;
                      } else {
                        var6 = var6 >> 1;
                        var5_ref = qf.field_k[var4];
                        break L3;
                      }
                    }
                    var5_ref.a(this.field_A[var4] + -(this.field_D[var4] >> -1994034495), -(this.field_t[var4] >> 1911868801) + (this.field_B[var4] + param1), this.field_D[var4], this.field_t[var4], 0, 16777215 | var6 << 1231961464, 1);
                    var4++;
                    if (var7 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_9_0 = 120 + param1;
              stackOut_9_1 = -50;
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              break L1;
            }
            var4 = stackIn_10_0 - stackIn_10_1;
            eda.field_f.a(-1, -1, ab.field_t[0], -14671840, var4, hl.field_a);
            eda.field_f.a(var4, false, pta.field_g.toUpperCase(), ab.field_t[1], -14671840, -1);
            eda.field_f.a(12199, var4, lc.field_L.toUpperCase(), -1, -14671840, ab.field_t[2]);
            var5_ref = null;
            var6 = this.field_E;
            if (var6 == 0) {
              var8 = dt.field_n;
              if (var8 == null) {
                discarded$12 = this.a(this.field_x, (byte) -91, 50 + param1);
                if (var7 != 0) {
                  oka.a(var8.toUpperCase(), 65793, eda.field_f, -1, 240 + param1, aaa.a(false) / 2, -1);
                  kn.field_p.a(-1, -1, aaa.a(false) / 2, -14345466, param1 + 405, rpa.field_f);
                  return;
                } else {
                  kn.field_p.a(-1, -1, aaa.a(false) / 2, -14345466, param1 + 405, rpa.field_f);
                  return;
                }
              } else {
                oka.a(var8.toUpperCase(), 65793, eda.field_f, -1, 240 + param1, aaa.a(false) / 2, -1);
                kn.field_p.a(-1, -1, aaa.a(false) / 2, -14345466, param1 + 405, rpa.field_f);
                return;
              }
            } else {
              if (-2 == (var6 ^ -1)) {
                var9 = kt.field_H;
                if (var9 == null) {
                  discarded$13 = this.a(this.field_x, (byte) -91, 50 + param1);
                  if (var7 != 0) {
                    oka.a(var9.toUpperCase(), 65793, eda.field_f, -1, 240 + param1, aaa.a(false) / 2, -1);
                    kn.field_p.a(-1, -1, aaa.a(false) / 2, -14345466, param1 + 405, rpa.field_f);
                    return;
                  } else {
                    kn.field_p.a(-1, -1, aaa.a(false) / 2, -14345466, param1 + 405, rpa.field_f);
                    return;
                  }
                } else {
                  oka.a(var9.toUpperCase(), 65793, eda.field_f, -1, 240 + param1, aaa.a(false) / 2, -1);
                  kn.field_p.a(-1, -1, aaa.a(false) / 2, -14345466, param1 + 405, rpa.field_f);
                  return;
                }
              } else {
                if (3 == var6) {
                  var10 = nm.field_j;
                  if (var10 == null) {
                    discarded$14 = this.a(this.field_x, (byte) -91, 50 + param1);
                    if (var7 != 0) {
                      oka.a(var10.toUpperCase(), 65793, eda.field_f, -1, 240 + param1, aaa.a(false) / 2, -1);
                      kn.field_p.a(-1, -1, aaa.a(false) / 2, -14345466, param1 + 405, rpa.field_f);
                      return;
                    } else {
                      kn.field_p.a(-1, -1, aaa.a(false) / 2, -14345466, param1 + 405, rpa.field_f);
                      return;
                    }
                  } else {
                    oka.a(var10.toUpperCase(), 65793, eda.field_f, -1, 240 + param1, aaa.a(false) / 2, -1);
                    kn.field_p.a(-1, -1, aaa.a(false) / 2, -14345466, param1 + 405, rpa.field_f);
                    return;
                  }
                } else {
                  if (var5_ref == null) {
                    discarded$15 = this.a(this.field_x, (byte) -91, 50 + param1);
                    if (var7 == 0) {
                      kn.field_p.a(-1, -1, aaa.a(false) / 2, -14345466, param1 + 405, rpa.field_f);
                      return;
                    } else {
                      oka.a(((String) ((Object) var5_ref)).toUpperCase(), 65793, eda.field_f, -1, 240 + param1, aaa.a(false) / 2, -1);
                      kn.field_p.a(-1, -1, aaa.a(false) / 2, -14345466, param1 + 405, rpa.field_f);
                      return;
                    }
                  } else {
                    oka.a(((String) ((Object) var5_ref)).toUpperCase(), 65793, eda.field_f, -1, 240 + param1, aaa.a(false) / 2, -1);
                    kn.field_p.a(-1, -1, aaa.a(false) / 2, -14345466, param1 + 405, rpa.field_f);
                    return;
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final int a(int param0, byte param1) {
        if (param1 != -48) {
          field_C = -47;
          return param0 * 160 + 465 + -(80 * this.field_m.length);
        } else {
          return param0 * 160 + 465 + -(80 * this.field_m.length);
        }
    }

    final boolean a(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -13) {
          return true;
        } else {
          L0: {
            if (-1 + param1 != this.field_x) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void b(boolean param0) {
        if (!param0) {
          pk.b(false);
          field_z = null;
          field_s = null;
          field_v = null;
          return;
        } else {
          field_z = null;
          field_s = null;
          field_v = null;
          return;
        }
    }

    pk(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        this.field_u = 0;
        this.field_E = 0;
        this.field_x = 0;
        try {
          L0: {
            var7_int = cb.field_i.length;
            this.field_B = new int[var7_int];
            this.field_D = new int[var7_int];
            this.field_A = new int[var7_int];
            this.field_t = new int[var7_int];
            var8 = 0;
            L1: while (true) {
              L2: {
                if (var7_int <= var8) {
                  this.field_o = false;
                  break L2;
                } else {
                  var9 = cb.field_i[var8].a();
                  var10 = cb.field_i[var8].c();
                  this.field_A[var8] = (aaa.a(false) >> 114881377) + -(32 * (-1 + cb.field_i.length)) + var8 * 65;
                  this.field_B[var8] = 110;
                  this.field_D[var8] = 3 * var9 / 4;
                  this.field_t[var8] = 3 * var10 / 4;
                  if (var11 != 0) {
                    break L2;
                  } else {
                    L3: {
                      if (var8 != 1) {
                        break L3;
                      } else {
                        this.field_A[var8] = this.field_A[var8] - 15;
                        break L3;
                      }
                    }
                    L4: {
                      if (-3 != (var8 ^ -1)) {
                        break L4;
                      } else {
                        this.field_A[var8] = this.field_A[var8] - 20;
                        this.field_D[var8] = var9 >> -2129476991;
                        this.field_t[var8] = var10 >> 1113247521;
                        break L4;
                      }
                    }
                    L5: {
                      if (3 != var8) {
                        break L5;
                      } else {
                        this.field_A[var8] = this.field_A[var8] - 10;
                        this.field_B[var8] = this.field_B[var8] - 5;
                        break L5;
                      }
                    }
                    L6: {
                      if (var8 != 4) {
                        break L6;
                      } else {
                        this.field_A[var8] = this.field_A[var8] - 15;
                        break L6;
                      }
                    }
                    L7: {
                      if (5 != var8) {
                        break L7;
                      } else {
                        this.field_A[var8] = this.field_A[var8] - 15;
                        break L7;
                      }
                    }
                    L8: {
                      if (var8 != 6) {
                        break L8;
                      } else {
                        this.field_A[var8] = this.field_A[var8] - 10;
                        this.field_B[var8] = this.field_B[var8] + 5;
                        break L8;
                      }
                    }
                    L9: {
                      if (7 != var8) {
                        break L9;
                      } else {
                        this.field_A[var8] = this.field_A[var8] - 15;
                        this.field_B[var8] = this.field_B[var8] - 5;
                        break L9;
                      }
                    }
                    L10: {
                      if (var8 != 8) {
                        break L10;
                      } else {
                        this.field_A[var8] = this.field_A[var8] - 10;
                        break L10;
                      }
                    }
                    var8++;
                    continue L1;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var7 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var7);
            stackOut_23_1 = new StringBuilder().append("pk.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param5 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L11;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L11;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
    }

    static {
        field_v = "Invalid name";
        field_C = 0;
    }
}
