/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ww extends ka {
    private tw field_z;
    private ww field_Gb;
    private ww field_u;
    private short[] field_M;
    private int[] field_Ab;
    private short[] field_V;
    private ww field_qb;
    private boolean field_zb;
    private ww field_n;
    private float[][] field_l;
    private ww field_N;
    private int[] field_v;
    private ww field_tb;
    private int[] field_mb;
    private int[] field_E;
    private rga[] field_kb;
    private hna[] field_e;
    private pna field_B;
    private boolean field_ab;
    private ava[] field_i;
    private short field_Bb;
    private int[][] field_Cb;
    private oha[] field_lb;
    private oha[] field_D;
    private short[] field_Eb;
    private int[] field_yb;
    private iua field_w;
    private short[] field_ub;
    private ww field_pb;
    private int field_P;
    private int[] field_C;
    private short field_R;
    private short field_U;
    private int field_Db;
    private int field_gb;
    private short field_O;
    private float[][] field_W;
    private int[] field_T;
    private short[] field_bb;
    private int[] field_xb;
    private short field_cb;
    private int field_Y;
    static int field_G;
    private int field_ib;
    private int[] field_hb;
    private tw field_F;
    private int field_H;
    private int field_eb;
    private short[] field_x;
    private int field_m;
    private int[][] field_sb;
    private byte[] field_k;
    private int[] field_rb;
    private int[] field_s;
    private sfa field_d;
    private gna[] field_I;
    private boolean field_A;
    private short[] field_ob;
    private int[][] field_j;
    private int field_Z;
    private int[] field_o;
    private int[] field_jb;
    private boolean field_L;
    private ww field_K;
    private boolean field_r;
    private boolean field_S;
    private short field_f;
    private nsa[] field_db;
    private byte[] field_h;
    static int field_q;
    private int[] field_Fb;
    private short field_vb;
    private int[] field_nb;
    private int field_p;
    private int[] field_J;
    private short[] field_X;
    private ww field_fb;
    private ww field_Q;
    private int[] field_t;
    private int field_g;
    private int[] field_y;
    private byte[] field_wb;
    private static String field_Hb;

    private final void e() {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (this.field_eb != 0) {
          L0: {
            if (this.field_d.field_u <= 1) {
              this.h();
              break L0;
            } else {
              var1 = this;
              synchronized (var1) {
                L1: {
                  this.h();
                  break L1;
                }
              }
              break L0;
            }
          }
          return;
        } else {
          this.a(false);
          return;
        }
    }

    final void wa() {
        int var1 = 0;
        if (this.field_S) {
            for (var1 = 0; var1 < this.field_p; var1++) {
                this.field_xb[var1] = this.field_xb[var1] + 7 >> 4;
                this.field_rb[var1] = this.field_rb[var1] + 7 >> 4;
                this.field_T[var1] = this.field_T[var1] + 7 >> 4;
            }
            this.field_S = false;
        }
        if (this.field_L) {
            this.e();
            this.field_L = false;
        }
        this.field_r = false;
    }

    final void O(int param0, int param1, int param2) {
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param0 == 128) {
            break L0;
          } else {
            if ((this.field_P & 1) == 1) {
              break L0;
            } else {
              throw new IllegalStateException();
            }
          }
        }
        L1: {
          if (param1 == 128) {
            break L1;
          } else {
            if ((this.field_P & 2) == 2) {
              break L1;
            } else {
              throw new IllegalStateException();
            }
          }
        }
        L2: {
          if (param2 == 128) {
            break L2;
          } else {
            if ((this.field_P & 4) == 4) {
              break L2;
            } else {
              throw new IllegalStateException();
            }
          }
        }
        var4 = this;
        synchronized (var4) {
          L3: {
            var5 = 0;
            L4: while (true) {
              if (var5 >= this.field_p) {
                this.field_r = false;
                break L3;
              } else {
                this.field_xb[var5] = this.field_xb[var5] * param0 >> 7;
                this.field_rb[var5] = this.field_rb[var5] * param1 >> 7;
                this.field_T[var5] = this.field_T[var5] * param2 >> 7;
                var5++;
                continue L4;
              }
            }
          }
        }
    }

    private final void c() {
        gna dupTemp$1 = null;
        int var1 = 0;
        int var2 = 0;
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
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        gna var16 = null;
        oha var17 = null;
        oha var18 = null;
        oha var19 = null;
        this.field_lb = new oha[this.field_Z];
        var1 = 0;
        L0: while (true) {
          if (var1 >= this.field_Z) {
            var1 = 0;
            L1: while (true) {
              if (var1 >= this.field_g) {
                return;
              } else {
                var2 = this.field_M[var1];
                var3 = this.field_bb[var1];
                var4 = this.field_x[var1];
                var5 = this.field_xb[var3] - this.field_xb[var2];
                var6 = this.field_rb[var3] - this.field_rb[var2];
                var7 = this.field_T[var3] - this.field_T[var2];
                var8 = this.field_xb[var4] - this.field_xb[var2];
                var9 = this.field_rb[var4] - this.field_rb[var2];
                var10 = this.field_T[var4] - this.field_T[var2];
                var11 = var6 * var10 - var9 * var7;
                var12 = var7 * var8 - var10 * var5;
                var13 = var5 * var9 - var8 * var6;
                L2: while (true) {
                  L3: {
                    if (var11 > 8192) {
                      break L3;
                    } else {
                      if (var12 > 8192) {
                        break L3;
                      } else {
                        if (var13 > 8192) {
                          break L3;
                        } else {
                          if (var11 < -8192) {
                            break L3;
                          } else {
                            if (var12 < -8192) {
                              break L3;
                            } else {
                              if (var13 >= -8192) {
                                L4: {
                                  var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
                                  if (var14 > 0) {
                                    break L4;
                                  } else {
                                    var14 = 1;
                                    break L4;
                                  }
                                }
                                L5: {
                                  var11 = var11 * 256 / var14;
                                  var12 = var12 * 256 / var14;
                                  var13 = var13 * 256 / var14;
                                  if (this.field_k != null) {
                                    var15 = this.field_k[var1];
                                    break L5;
                                  } else {
                                    var15 = 0;
                                    break L5;
                                  }
                                }
                                if (var15 != 0) {
                                  if (var15 == 1) {
                                    L6: {
                                      if (this.field_I != null) {
                                        break L6;
                                      } else {
                                        this.field_I = new gna[this.field_g];
                                        break L6;
                                      }
                                    }
                                    dupTemp$1 = new gna();
                                    this.field_I[var1] = dupTemp$1;
                                    var16 = dupTemp$1;
                                    var16.field_a = var11;
                                    var16.field_c = var12;
                                    var16.field_b = var13;
                                    var1++;
                                    continue L1;
                                  } else {
                                    var1++;
                                    continue L1;
                                  }
                                } else {
                                  var17 = this.field_lb[var2];
                                  var17.field_a = var17.field_a + var11;
                                  var17.field_c = var17.field_c + var12;
                                  var17.field_b = var17.field_b + var13;
                                  var17.field_d = var17.field_d + 1;
                                  var18 = this.field_lb[var3];
                                  var18.field_a = var18.field_a + var11;
                                  var18.field_c = var18.field_c + var12;
                                  var18.field_b = var18.field_b + var13;
                                  var18.field_d = var18.field_d + 1;
                                  var19 = this.field_lb[var4];
                                  var19.field_a = var19.field_a + var11;
                                  var19.field_c = var19.field_c + var12;
                                  var19.field_b = var19.field_b + var13;
                                  var19.field_d = var19.field_d + 1;
                                  var1++;
                                  continue L1;
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  var11 = var11 >> 1;
                  var12 = var12 >> 1;
                  var13 = var13 >> 1;
                  continue L2;
                }
              }
            }
          } else {
            this.field_lb[var1] = new oha();
            var1++;
            continue L0;
          }
        }
    }

    private final int d(int param0) {
        if (param0 < 2) {
            param0 = 2;
        } else {
            if (param0 > 126) {
                param0 = 126;
            }
        }
        return param0;
    }

    final void a() {
        try {
            Object var1 = null;
            InterruptedException var2 = null;
            Throwable var3 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (this.field_d.field_u <= 1) {
                break L0;
              } else {
                var1 = this;
                synchronized (var1) {
                  L1: {
                    L2: while (true) {
                      if (!this.field_a) {
                        this.field_a = true;
                        break L1;
                      } else {
                        try {
                          L3: {
                            this.wait();
                            break L3;
                          }
                        } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          L4: {
                            var2 = (InterruptedException) (Object) decompiledCaughtException;
                            break L4;
                          }
                        }
                        continue L2;
                      }
                    }
                  }
                }
                break L0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void b(int param0) {
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int var2 = 0;
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
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        L0: {
          var2 = 0;
          var3 = this.field_d.field_g;
          var4 = this.field_M[param0];
          var5 = this.field_bb[param0];
          var6 = this.field_x[param0];
          var7 = this.field_Ab[var4];
          var8 = this.field_Ab[var5];
          var9 = this.field_Ab[var6];
          if (this.field_h != null) {
            this.field_w.field_b = this.field_h[param0] & 255;
            break L0;
          } else {
            this.field_w.field_b = 0;
            break L0;
          }
        }
        L1: {
          if (var7 < var3) {
            L2: {
              var10 = this.field_nb[var4];
              var11 = this.field_C[var4];
              var12 = this.field_t[param0] & 65535;
              if (var9 < var3) {
                break L2;
              } else {
                var13 = (var3 - var7) * (65536 / (var9 - var7));
                this.field_y[var2] = this.field_F.field_o + (var10 + ((this.field_nb[var6] - var10) * var13 >> 16)) * this.field_d.field_Q / var3;
                this.field_E[var2] = this.field_F.field_H + (var11 + ((this.field_C[var6] - var11) * var13 >> 16)) * this.field_d.field_C / var3;
                this.field_yb[var2] = var3;
                incrementValue$9 = var2;
                var2++;
                this.field_hb[incrementValue$9] = var12 + (((this.field_Fb[param0] & 65535) - var12) * var13 >> 16);
                break L2;
              }
            }
            if (var8 < var3) {
              break L1;
            } else {
              var13 = (var3 - var7) * (65536 / (var8 - var7));
              this.field_y[var2] = this.field_F.field_o + (var10 + ((this.field_nb[var5] - var10) * var13 >> 16)) * this.field_d.field_Q / var3;
              this.field_E[var2] = this.field_F.field_H + (var11 + ((this.field_C[var5] - var11) * var13 >> 16)) * this.field_d.field_C / var3;
              this.field_yb[var2] = var3;
              incrementValue$10 = var2;
              var2++;
              this.field_hb[incrementValue$10] = var12 + (((this.field_o[param0] & 65535) - var12) * var13 >> 16);
              break L1;
            }
          } else {
            this.field_y[var2] = this.field_v[var4];
            this.field_E[var2] = this.field_J[var4];
            this.field_yb[var2] = this.field_mb[var4];
            incrementValue$11 = var2;
            var2++;
            this.field_hb[incrementValue$11] = this.field_t[param0] & 65535;
            break L1;
          }
        }
        L3: {
          if (var8 < var3) {
            L4: {
              var10 = this.field_nb[var5];
              var11 = this.field_C[var5];
              var12 = this.field_o[param0] & 65535;
              if (var7 < var3) {
                break L4;
              } else {
                var13 = (var3 - var8) * (65536 / (var7 - var8));
                this.field_y[var2] = this.field_F.field_o + (var10 + ((this.field_nb[var4] - var10) * var13 >> 16)) * this.field_d.field_Q / var3;
                this.field_E[var2] = this.field_F.field_H + (var11 + ((this.field_C[var4] - var11) * var13 >> 16)) * this.field_d.field_C / var3;
                this.field_yb[var2] = var3;
                incrementValue$12 = var2;
                var2++;
                this.field_hb[incrementValue$12] = var12 + (((this.field_t[param0] & 65535) - var12) * var13 >> 16);
                break L4;
              }
            }
            if (var9 < var3) {
              break L3;
            } else {
              var13 = (var3 - var8) * (65536 / (var9 - var8));
              this.field_y[var2] = this.field_F.field_o + (var10 + ((this.field_nb[var6] - var10) * var13 >> 16)) * this.field_d.field_Q / var3;
              this.field_E[var2] = this.field_F.field_H + (var11 + ((this.field_C[var6] - var11) * var13 >> 16)) * this.field_d.field_C / var3;
              this.field_yb[var2] = var3;
              incrementValue$13 = var2;
              var2++;
              this.field_hb[incrementValue$13] = var12 + (((this.field_Fb[param0] & 65535) - var12) * var13 >> 16);
              break L3;
            }
          } else {
            this.field_y[var2] = this.field_v[var5];
            this.field_E[var2] = this.field_J[var5];
            this.field_yb[var2] = this.field_mb[var5];
            incrementValue$14 = var2;
            var2++;
            this.field_hb[incrementValue$14] = this.field_o[param0] & 65535;
            break L3;
          }
        }
        L5: {
          if (var9 < var3) {
            L6: {
              var10 = this.field_nb[var6];
              var11 = this.field_C[var6];
              var12 = this.field_Fb[param0] & 65535;
              if (var8 < var3) {
                break L6;
              } else {
                var13 = (var3 - var9) * (65536 / (var8 - var9));
                this.field_y[var2] = this.field_F.field_o + (var10 + ((this.field_nb[var5] - var10) * var13 >> 16)) * this.field_d.field_Q / var3;
                this.field_E[var2] = this.field_F.field_H + (var11 + ((this.field_C[var5] - var11) * var13 >> 16)) * this.field_d.field_C / var3;
                this.field_yb[var2] = var3;
                incrementValue$15 = var2;
                var2++;
                this.field_hb[incrementValue$15] = var12 + (((this.field_o[param0] & 65535) - var12) * var13 >> 16);
                break L6;
              }
            }
            if (var7 < var3) {
              break L5;
            } else {
              var13 = (var3 - var9) * (65536 / (var7 - var9));
              this.field_y[var2] = this.field_F.field_o + (var10 + ((this.field_nb[var4] - var10) * var13 >> 16)) * this.field_d.field_Q / var3;
              this.field_E[var2] = this.field_F.field_H + (var11 + ((this.field_C[var4] - var11) * var13 >> 16)) * this.field_d.field_C / var3;
              this.field_yb[var2] = var3;
              incrementValue$16 = var2;
              var2++;
              this.field_hb[incrementValue$16] = var12 + (((this.field_t[param0] & 65535) - var12) * var13 >> 16);
              break L5;
            }
          } else {
            this.field_y[var2] = this.field_v[var6];
            this.field_E[var2] = this.field_J[var6];
            this.field_yb[var2] = this.field_mb[var6];
            incrementValue$17 = var2;
            var2++;
            this.field_hb[incrementValue$17] = this.field_Fb[param0] & 65535;
            break L5;
          }
        }
        L7: {
          var10 = this.field_y[0];
          var11 = this.field_y[1];
          var12 = this.field_y[2];
          var13 = this.field_E[0];
          var14 = this.field_E[1];
          var15 = this.field_E[2];
          var7 = this.field_yb[0];
          var8 = this.field_yb[1];
          var9 = this.field_yb[2];
          this.field_w.field_q = false;
          if (var2 != 3) {
            break L7;
          } else {
            L8: {
              L9: {
                if (var10 < 0) {
                  break L9;
                } else {
                  if (var11 < 0) {
                    break L9;
                  } else {
                    if (var12 < 0) {
                      break L9;
                    } else {
                      if (var10 > this.field_F.field_y) {
                        break L9;
                      } else {
                        if (var11 > this.field_F.field_y) {
                          break L9;
                        } else {
                          if (var12 <= this.field_F.field_y) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                  }
                }
              }
              this.field_w.field_q = true;
              break L8;
            }
            L10: {
              if (this.field_X == null) {
                break L10;
              } else {
                if (this.field_X[param0] != -1) {
                  L11: {
                    var16 = -16777216;
                    if (this.field_h == null) {
                      break L11;
                    } else {
                      var16 = 255 - (this.field_h[param0] & 255) << 24;
                      break L11;
                    }
                  }
                  var17 = var16 | this.field_t[param0] & 16777215;
                  if (this.field_Fb[param0] != -1) {
                    this.field_w.a((float)var13, (float)var14, (float)var15, (float)var10, (float)var11, (float)var12, (float)var7, (float)var8, (float)var9, this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var17, var17, var17, this.field_F.field_D, 0, 0, 0, (int) this.field_X[param0]);
                    break L7;
                  } else {
                    this.field_w.a((float)var13, (float)var14, (float)var15, (float)var10, (float)var11, (float)var12, (float)var7, (float)var8, (float)var9, this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var17, var17, var17, this.field_F.field_D, 0, 0, 0, (int) this.field_X[param0]);
                    break L7;
                  }
                } else {
                  break L10;
                }
              }
            }
            if (this.field_Fb[param0] != -1) {
              this.field_w.a((float)var13, (float)var14, (float)var15, (float)var10, (float)var11, (float)var12, (float)var7, (float)var8, (float)var9, (float)this.field_hb[0], (float)this.field_hb[1], (float)this.field_hb[2]);
              break L7;
            } else {
              this.field_w.b((float)var13, (float)var14, (float)var15, (float)var10, (float)var11, (float)var12, (float)var7, (float)var8, (float)var9, bt.field_h[this.field_t[param0] & 65535]);
              break L7;
            }
          }
        }
        L12: {
          if (var2 != 4) {
            break L12;
          } else {
            L13: {
              L14: {
                if (var10 < 0) {
                  break L14;
                } else {
                  if (var11 < 0) {
                    break L14;
                  } else {
                    if (var12 < 0) {
                      break L14;
                    } else {
                      if (var10 > this.field_F.field_y) {
                        break L14;
                      } else {
                        if (var11 > this.field_F.field_y) {
                          break L14;
                        } else {
                          if (var12 > this.field_F.field_y) {
                            break L14;
                          } else {
                            if (this.field_y[3] < 0) {
                              break L14;
                            } else {
                              if (this.field_y[3] <= this.field_F.field_y) {
                                break L13;
                              } else {
                                break L14;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              this.field_w.field_q = true;
              break L13;
            }
            L15: {
              if (this.field_X == null) {
                break L15;
              } else {
                if (this.field_X[param0] != -1) {
                  L16: {
                    var16 = -16777216;
                    if (this.field_h == null) {
                      break L16;
                    } else {
                      var16 = 255 - (this.field_h[param0] & 255) << 24;
                      break L16;
                    }
                  }
                  var17 = var16 | this.field_t[param0] & 16777215;
                  if (this.field_Fb[param0] != -1) {
                    this.field_w.a((float)var13, (float)var14, (float)var15, (float)var10, (float)var11, (float)var12, (float)var7, (float)var8, (float)var9, this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var17, var17, var17, this.field_F.field_D, 0, 0, 0, (int) this.field_X[param0]);
                    this.field_w.a((float)var13, (float)var15, (float)this.field_E[3], (float)var10, (float)var12, (float)this.field_y[3], (float)var7, (float)var9, (float)this.field_yb[3], this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var17, var17, var17, this.field_F.field_D, 0, 0, 0, (int) this.field_X[param0]);
                    break L12;
                  } else {
                    this.field_w.a((float)var13, (float)var14, (float)var15, (float)var10, (float)var11, (float)var12, (float)var7, (float)var8, (float)var9, this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var17, var17, var17, this.field_F.field_D, 0, 0, 0, (int) this.field_X[param0]);
                    this.field_w.a((float)var13, (float)var15, (float)this.field_E[3], (float)var10, (float)var12, (float)this.field_y[3], (float)var7, (float)var9, (float)this.field_yb[3], this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var17, var17, var17, this.field_F.field_D, 0, 0, 0, (int) this.field_X[param0]);
                    break L12;
                  }
                } else {
                  break L15;
                }
              }
            }
            if (this.field_Fb[param0] != -1) {
              this.field_w.a((float)var13, (float)var14, (float)var15, (float)var10, (float)var11, (float)var12, (float)var7, (float)var8, (float)var9, (float)this.field_hb[0], (float)this.field_hb[1], (float)this.field_hb[2]);
              this.field_w.a((float)var13, (float)var15, (float)this.field_E[3], (float)var10, (float)var12, (float)this.field_y[3], (float)var7, (float)var8, (float)this.field_yb[3], (float)this.field_hb[0], (float)this.field_hb[2], (float)this.field_hb[3]);
              break L12;
            } else {
              var16 = bt.field_h[this.field_t[param0] & 65535];
              this.field_w.b((float)var13, (float)var14, (float)var15, (float)var10, (float)var11, (float)var12, (float)var7, (float)var8, (float)var9, var16);
              this.field_w.b((float)var13, (float)var15, (float)this.field_E[3], (float)var10, (float)var12, (float)this.field_y[3], (float)var7, (float)var8, (float)this.field_yb[3], var16);
              break L12;
            }
          }
        }
    }

    final void a(gda param0, el param1, int param2) {
        this.b(param0, param1, -1, param2);
    }

    private final void f() {
        this.field_lb = null;
        this.field_D = null;
        this.field_I = null;
        this.field_r = false;
    }

    final void H(int param0, int param1, int param2) {
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            if ((this.field_P & 1) == 1) {
              break L0;
            } else {
              throw new IllegalStateException();
            }
          }
        }
        L1: {
          if (param1 == 0) {
            break L1;
          } else {
            if ((this.field_P & 2) == 2) {
              break L1;
            } else {
              throw new IllegalStateException();
            }
          }
        }
        L2: {
          if (param2 == 0) {
            break L2;
          } else {
            if ((this.field_P & 4) == 4) {
              break L2;
            } else {
              throw new IllegalStateException();
            }
          }
        }
        var4 = this;
        synchronized (var4) {
          L3: {
            var5 = 0;
            L4: while (true) {
              if (var5 >= this.field_p) {
                break L3;
              } else {
                this.field_xb[var5] = this.field_xb[var5] + param0;
                this.field_rb[var5] = this.field_rb[var5] + param1;
                this.field_T[var5] = this.field_T[var5] + param2;
                var5++;
                continue L4;
              }
            }
          }
        }
    }

    private final void b(int param0, boolean param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11_int = 0;
        hna var11 = null;
        int var12_int = 0;
        nsa var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        if (this.field_Fb[param0] != -2) {
          L0: {
            L1: {
              var4 = this.field_M[param0];
              var5 = this.field_bb[param0];
              var6 = this.field_x[param0];
              var7 = this.field_v[var4];
              var8 = this.field_v[var5];
              var9 = this.field_v[var6];
              if (!param1) {
                break L1;
              } else {
                L2: {
                  if (var7 == -5000) {
                    break L2;
                  } else {
                    if (var8 == -5000) {
                      break L2;
                    } else {
                      if (var9 != -5000) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                var10 = this.field_nb[var4];
                var11_int = this.field_nb[var5];
                var12_int = this.field_nb[var6];
                var13 = this.field_C[var4];
                var14 = this.field_C[var5];
                var15 = this.field_C[var6];
                var16 = this.field_Ab[var4];
                var17 = this.field_Ab[var5];
                var18 = this.field_Ab[var6];
                var10 = var10 - var11_int;
                var12_int = var12_int - var11_int;
                var13 = var13 - var14;
                var15 = var15 - var14;
                var16 = var16 - var17;
                var18 = var18 - var17;
                var19 = var13 * var18 - var16 * var15;
                var20 = var16 * var12_int - var10 * var18;
                var21 = var10 * var15 - var13 * var12_int;
                if (var11_int * var19 + var14 * var20 + var17 * var21 <= 0) {
                  break L0;
                } else {
                  this.b(param0);
                  break L0;
                }
              }
            }
            L3: {
              if (this.field_jb[param0] != -1) {
                break L3;
              } else {
                if ((var7 - var8) * (this.field_J[var6] - this.field_J[var5]) - (this.field_J[var4] - this.field_J[var5]) * (var9 - var8) <= 0) {
                  break L0;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              L5: {
                if (var7 < 0) {
                  break L5;
                } else {
                  if (var8 < 0) {
                    break L5;
                  } else {
                    if (var9 < 0) {
                      break L5;
                    } else {
                      if (var7 > this.field_F.field_y) {
                        break L5;
                      } else {
                        if (var8 > this.field_F.field_y) {
                          break L5;
                        } else {
                          if (var9 <= this.field_F.field_y) {
                            this.field_w.field_q = false;
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                }
              }
              this.field_w.field_q = true;
              break L4;
            }
            if (!param2) {
              var10 = this.field_jb[param0];
              if (var10 == -1) {
                this.j(param0);
                break L0;
              } else {
                L6: {
                  var11 = this.field_e[var10];
                  var12 = this.field_db[var10];
                  if (var11.field_d) {
                    break L6;
                  } else {
                    this.j(param0);
                    break L6;
                  }
                }
                this.field_d.b(var12.field_e, var12.field_h, var12.field_n, var12.field_l, var12.field_c, var12.field_j, var11.field_h & 65535, var12.field_k, (int) var11.field_c, (int) var11.field_g);
                break L0;
              }
            } else {
              var10 = this.field_jb[param0];
              if (var10 != -1) {
                if (this.field_e[var10].field_d) {
                  break L0;
                } else {
                  this.g(param0);
                  break L0;
                }
              } else {
                this.g(param0);
                break L0;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void j(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var2 = this.field_M[param0];
            var3 = this.field_bb[param0];
            var4 = this.field_x[param0];
            if (this.field_X == null) {
              break L1;
            } else {
              if (this.field_X[param0] != -1) {
                L2: {
                  var5 = -16777216;
                  if (this.field_h == null) {
                    break L2;
                  } else {
                    var5 = 255 - (this.field_h[param0] & 255) << 24;
                    break L2;
                  }
                }
                if (this.field_Fb[param0] != -1) {
                  this.field_w.a((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var5 | this.field_t[param0] & 16777215, var5 | this.field_o[param0] & 16777215, var5 | this.field_Fb[param0] & 16777215, this.field_F.field_D, 0, 0, 0, (int) this.field_X[param0]);
                  break L0;
                } else {
                  var6 = var5 | this.field_t[param0] & 16777215;
                  this.field_w.a((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var6, var6, var6, this.field_F.field_D, 0, 0, 0, (int) this.field_X[param0]);
                  break L0;
                }
              } else {
                break L1;
              }
            }
          }
          L3: {
            if (this.field_h != null) {
              this.field_w.field_b = this.field_h[param0] & 255;
              break L3;
            } else {
              this.field_w.field_b = 0;
              break L3;
            }
          }
          if (this.field_Fb[param0] != -1) {
            this.field_w.a((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], (float)(this.field_t[param0] & 65535), (float)(this.field_o[param0] & 65535), (float)(this.field_Fb[param0] & 65535));
            break L0;
          } else {
            this.field_w.b((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], bt.field_h[this.field_t[param0] & 65535]);
            break L0;
          }
        }
    }

    private final boolean c(int param0) {
        if (this.field_h == null) {
            return false;
        }
        if (this.field_h[param0] == 0) {
            return false;
        }
        return true;
    }

    private final void a(boolean param0, boolean param1, int param2, int param3) {
        int var5 = 0;
        hna var6_ref_hna = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          if (this.field_e == null) {
            break L0;
          } else {
            var5 = 0;
            L1: while (true) {
              if (var5 >= this.field_m) {
                break L0;
              } else {
                var6_ref_hna = this.field_e[var5];
                this.field_jb[var6_ref_hna.field_j] = var5;
                var5++;
                continue L1;
              }
            }
          }
        }
        L2: {
          L3: {
            if (this.field_ab) {
              break L3;
            } else {
              if (this.field_e == null) {
                var5 = 0;
                L4: while (true) {
                  if (var5 >= this.field_g) {
                    break L2;
                  } else {
                    this.a(var5, param0, param1);
                    var5++;
                    continue L4;
                  }
                }
              } else {
                break L3;
              }
            }
          }
          L5: {
            if ((this.field_P & 256) != 0) {
              break L5;
            } else {
              if (this.field_ub == null) {
                break L5;
              } else {
                var5 = 0;
                L6: while (true) {
                  if (var5 >= this.field_g) {
                    break L2;
                  } else {
                    var6 = this.field_ub[var5];
                    this.a(var6, param0, param1);
                    var5++;
                    continue L6;
                  }
                }
              }
            }
          }
          var5 = 0;
          L7: while (true) {
            if (var5 >= this.field_g) {
              if (this.field_wb != null) {
                var5 = 0;
                L8: while (true) {
                  if (var5 >= 12) {
                    break L2;
                  } else {
                    var7 = 0;
                    var6 = var7;
                    L9: while (true) {
                      if (var7 >= this.field_g) {
                        var5++;
                        continue L8;
                      } else {
                        if (this.field_wb[var7] == var5) {
                          L10: {
                            if (this.c(var7)) {
                              break L10;
                            } else {
                              if (this.h(var7)) {
                                break L10;
                              } else {
                                var7++;
                                continue L9;
                              }
                            }
                          }
                          this.a(var7, param0, param1);
                          var7++;
                          continue L9;
                        } else {
                          var7++;
                          continue L9;
                        }
                      }
                    }
                  }
                }
              } else {
                var5 = 0;
                L11: while (true) {
                  if (var5 >= this.field_g) {
                    break L2;
                  } else {
                    L12: {
                      if (this.c(var5)) {
                        break L12;
                      } else {
                        if (this.h(var5)) {
                          break L12;
                        } else {
                          var5++;
                          continue L11;
                        }
                      }
                    }
                    this.a(var5, param0, param1);
                    var5++;
                    continue L11;
                  }
                }
              }
            } else {
              if (!this.c(var5)) {
                if (!this.h(var5)) {
                  this.a(var5, param0, param1);
                  var5++;
                  continue L7;
                } else {
                  var5++;
                  continue L7;
                }
              } else {
                var5++;
                continue L7;
              }
            }
          }
        }
    }

    private final int a(int param0, short param1, int param2) {
        int var4 = 0;
        dw var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var4 = cla.field_m[this.a(param0, param2)];
          var5 = this.field_d.field_c.a((byte) -52, param1 & 65535);
          var6 = var5.field_c & 255;
          if (var6 == 0) {
            break L0;
          } else {
            var7 = 131586 * param2;
            if (var6 != 256) {
              var8 = var6;
              var9 = 256 - var6;
              var4 = ((var7 & 16711935) * var8 + (var4 & 16711935) * var9 & -16711936) + ((var7 & 65280) * var8 + (var4 & 65280) * var9 & 16711680) >> 8;
              break L0;
            } else {
              var4 = var7;
              break L0;
            }
          }
        }
        L1: {
          var7 = var5.field_i & 255;
          if (var7 == 0) {
            break L1;
          } else {
            L2: {
              var7 += 256;
              var8 = ((var4 & 16711680) >> 16) * var7;
              if (var8 <= 65535) {
                break L2;
              } else {
                var8 = 65535;
                break L2;
              }
            }
            L3: {
              var9 = ((var4 & 65280) >> 8) * var7;
              if (var9 <= 65535) {
                break L3;
              } else {
                var9 = 65535;
                break L3;
              }
            }
            L4: {
              var10 = (var4 & 255) * var7;
              if (var10 <= 65535) {
                break L4;
              } else {
                var10 = 65535;
                break L4;
              }
            }
            var4 = (var8 << 8 & 16711680) + (var9 & 65280) + (var10 >> 8);
            break L1;
          }
        }
        return var4;
    }

    private final void g() {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (this.field_eb != 0) {
            break L0;
          } else {
            if (this.field_lb == null) {
              L1: {
                if (this.field_d.field_u <= 1) {
                  this.c();
                  break L1;
                } else {
                  var1 = this;
                  synchronized (var1) {
                    L2: {
                      this.c();
                      break L2;
                    }
                  }
                  break L1;
                }
              }
              return;
            } else {
              break L0;
            }
          }
        }
    }

    final void b() {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (this.field_d.field_u <= 1) {
            break L0;
          } else {
            var1 = this;
            synchronized (var1) {
              L1: {
                this.field_a = false;
                this.notifyAll();
                break L1;
              }
            }
            break L0;
          }
        }
    }

    private final void a(boolean param0) {
        Object var2 = null;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (this.field_d.field_u <= 1) {
            this.b(param0);
            break L0;
          } else {
            var2 = this;
            synchronized (var2) {
              L1: {
                this.b(param0);
                break L1;
              }
            }
            break L0;
          }
        }
    }

    final void a(int param0, int[] param1, int param2, int param3, int param4, int param5, boolean param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        nsa var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        nsa var23 = null;
        hna var24 = null;
        nsa var26 = null;
        hna var27 = null;
        nsa var29 = null;
        nsa var31 = null;
        nsa var33 = null;
        int[] var52 = null;
        int[] var53 = null;
        int[] var54 = null;
        int[] var55 = null;
        int[] var56 = null;
        int[] var57 = null;
        int[] var58 = null;
        int[] var59 = null;
        int[] var60 = null;
        var8 = param1.length;
        if (param0 != 0) {
          if (param0 != 1) {
            if (param0 != 2) {
              if (param0 != 3) {
                if (param0 != 5) {
                  if (param0 != 7) {
                    if (param0 != 8) {
                      if (param0 != 10) {
                        if (param0 != 9) {
                          return;
                        } else {
                          L0: {
                            if (this.field_j == null) {
                              break L0;
                            } else {
                              var9 = 0;
                              L1: while (true) {
                                if (var9 >= var8) {
                                  break L0;
                                } else {
                                  var10 = param1[var9];
                                  if (var10 < this.field_j.length) {
                                    var60 = this.field_j[var10];
                                    var12 = 0;
                                    L2: while (true) {
                                      if (var12 < var60.length) {
                                        var33 = this.field_db[var60[var12]];
                                        var13 = var33;
                                        var13.field_j = var33.field_j + param2 & 16383;
                                        var12++;
                                        continue L2;
                                      } else {
                                        var9++;
                                        continue L1;
                                      }
                                    }
                                  } else {
                                    var9++;
                                    continue L1;
                                  }
                                }
                              }
                            }
                          }
                          return;
                        }
                      } else {
                        L3: {
                          if (this.field_j == null) {
                            break L3;
                          } else {
                            var9 = 0;
                            L4: while (true) {
                              if (var9 >= var8) {
                                break L3;
                              } else {
                                var10 = param1[var9];
                                if (var10 < this.field_j.length) {
                                  var59 = this.field_j[var10];
                                  var12 = 0;
                                  L5: while (true) {
                                    if (var12 < var59.length) {
                                      var31 = this.field_db[var59[var12]];
                                      var13 = var31;
                                      var13.field_m = var31.field_m * param2 >> 7;
                                      var13.field_g = var31.field_g * param3 >> 7;
                                      var12++;
                                      continue L5;
                                    } else {
                                      var9++;
                                      continue L4;
                                    }
                                  }
                                } else {
                                  var9++;
                                  continue L4;
                                }
                              }
                            }
                          }
                        }
                        return;
                      }
                    } else {
                      L6: {
                        if (this.field_j == null) {
                          break L6;
                        } else {
                          var9 = 0;
                          L7: while (true) {
                            if (var9 >= var8) {
                              break L6;
                            } else {
                              var10 = param1[var9];
                              if (var10 < this.field_j.length) {
                                var58 = this.field_j[var10];
                                var12 = 0;
                                L8: while (true) {
                                  if (var12 < var58.length) {
                                    var29 = this.field_db[var58[var12]];
                                    var29.field_b = var29.field_b + param2;
                                    var29.field_a = var29.field_a + param3;
                                    var12++;
                                    continue L8;
                                  } else {
                                    var9++;
                                    continue L7;
                                  }
                                }
                              } else {
                                var9++;
                                continue L7;
                              }
                            }
                          }
                        }
                      }
                      return;
                    }
                  } else {
                    L9: {
                      if (this.field_Cb == null) {
                        break L9;
                      } else {
                        var9 = 0;
                        L10: while (true) {
                          if (var9 >= var8) {
                            if (this.field_e == null) {
                              break L9;
                            } else {
                              var9 = 0;
                              L11: while (true) {
                                if (var9 >= this.field_m) {
                                  break L9;
                                } else {
                                  var27 = this.field_e[var9];
                                  var26 = this.field_db[var9];
                                  var26.field_k = var26.field_k & -16777216 | bt.field_h[tg.a((byte) -123, this.field_ob[var27.field_j] & 65535) & 65535] & 16777215;
                                  var9++;
                                  continue L11;
                                }
                              }
                            }
                          } else {
                            var10 = param1[var9];
                            if (var10 < this.field_Cb.length) {
                              var57 = this.field_Cb[var10];
                              var12 = 0;
                              L12: while (true) {
                                if (var12 >= var57.length) {
                                  this.field_L = true;
                                  var9++;
                                  continue L10;
                                } else {
                                  L13: {
                                    var13_int = var57[var12];
                                    var14 = this.field_ob[var13_int] & 65535;
                                    var15 = var14 >> 10 & 63;
                                    var16 = var14 >> 7 & 7;
                                    var17 = var14 & 127;
                                    var15 = var15 + param2 & 63;
                                    var16 = var16 + param3;
                                    if (var16 >= 0) {
                                      if (var16 <= 7) {
                                        break L13;
                                      } else {
                                        var16 = 7;
                                        break L13;
                                      }
                                    } else {
                                      var16 = 0;
                                      break L13;
                                    }
                                  }
                                  L14: {
                                    var17 = var17 + param4;
                                    if (var17 >= 0) {
                                      if (var17 <= 127) {
                                        break L14;
                                      } else {
                                        var17 = 127;
                                        break L14;
                                      }
                                    } else {
                                      var17 = 0;
                                      break L14;
                                    }
                                  }
                                  this.field_ob[var13_int] = (short)(var15 << 10 | var16 << 7 | var17);
                                  var12++;
                                  continue L12;
                                }
                              }
                            } else {
                              var9++;
                              continue L10;
                            }
                          }
                        }
                      }
                    }
                    return;
                  }
                } else {
                  L15: {
                    if (this.field_Cb == null) {
                      break L15;
                    } else {
                      if (this.field_h == null) {
                        break L15;
                      } else {
                        var9 = 0;
                        L16: while (true) {
                          if (var9 >= var8) {
                            if (this.field_e == null) {
                              break L15;
                            } else {
                              var9 = 0;
                              L17: while (true) {
                                if (var9 >= this.field_m) {
                                  break L15;
                                } else {
                                  var24 = this.field_e[var9];
                                  var23 = this.field_db[var9];
                                  var23.field_k = var23.field_k & 16777215 | 255 - (this.field_h[var24.field_j] & 255) << 24;
                                  var9++;
                                  continue L17;
                                }
                              }
                            }
                          } else {
                            var10 = param1[var9];
                            if (var10 < this.field_Cb.length) {
                              var56 = this.field_Cb[var10];
                              var12 = 0;
                              L18: while (true) {
                                if (var12 < var56.length) {
                                  L19: {
                                    var13_int = var56[var12];
                                    var14 = (this.field_h[var13_int] & 255) + param2 * 8;
                                    if (var14 >= 0) {
                                      if (var14 <= 255) {
                                        break L19;
                                      } else {
                                        var14 = 255;
                                        break L19;
                                      }
                                    } else {
                                      var14 = 0;
                                      break L19;
                                    }
                                  }
                                  this.field_h[var13_int] = (byte)var14;
                                  var12++;
                                  continue L18;
                                } else {
                                  var9++;
                                  continue L16;
                                }
                              }
                            } else {
                              var9++;
                              continue L16;
                            }
                          }
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                var9 = 0;
                L20: while (true) {
                  if (var9 >= var8) {
                    return;
                  } else {
                    var10 = param1[var9];
                    if (var10 < this.field_sb.length) {
                      var55 = this.field_sb[var10];
                      var12 = 0;
                      L21: while (true) {
                        if (var12 < var55.length) {
                          var13_int = var55[var12];
                          this.field_xb[var13_int] = this.field_xb[var13_int] - this.field_gb;
                          this.field_rb[var13_int] = this.field_rb[var13_int] - this.field_H;
                          this.field_T[var13_int] = this.field_T[var13_int] - this.field_Y;
                          this.field_xb[var13_int] = this.field_xb[var13_int] * param2 / 128;
                          this.field_rb[var13_int] = this.field_rb[var13_int] * param3 / 128;
                          this.field_T[var13_int] = this.field_T[var13_int] * param4 / 128;
                          this.field_xb[var13_int] = this.field_xb[var13_int] + this.field_gb;
                          this.field_rb[var13_int] = this.field_rb[var13_int] + this.field_H;
                          this.field_T[var13_int] = this.field_T[var13_int] + this.field_Y;
                          var12++;
                          continue L21;
                        } else {
                          var9++;
                          continue L20;
                        }
                      }
                    } else {
                      var9++;
                      continue L20;
                    }
                  }
                }
              }
            } else {
              var9 = 0;
              L22: while (true) {
                if (var9 >= var8) {
                  return;
                } else {
                  var10 = param1[var9];
                  if (var10 < this.field_sb.length) {
                    var54 = this.field_sb[var10];
                    if ((param5 & 1) != 0) {
                      var12 = 0;
                      L23: while (true) {
                        if (var12 < var54.length) {
                          L24: {
                            var13_int = var54[var12];
                            this.field_xb[var13_int] = this.field_xb[var13_int] - this.field_gb;
                            this.field_rb[var13_int] = this.field_rb[var13_int] - this.field_H;
                            this.field_T[var13_int] = this.field_T[var13_int] - this.field_Y;
                            if (param2 == 0) {
                              break L24;
                            } else {
                              var14 = qu.field_b[param2];
                              var15 = qu.field_d[param2];
                              var16 = this.field_rb[var13_int] * var15 - this.field_T[var13_int] * var14 + 16383 >> 14;
                              this.field_T[var13_int] = this.field_rb[var13_int] * var14 + this.field_T[var13_int] * var15 + 16383 >> 14;
                              this.field_rb[var13_int] = var16;
                              break L24;
                            }
                          }
                          L25: {
                            if (param4 == 0) {
                              break L25;
                            } else {
                              var14 = qu.field_b[param4];
                              var15 = qu.field_d[param4];
                              var16 = this.field_rb[var13_int] * var14 + this.field_xb[var13_int] * var15 + 16383 >> 14;
                              this.field_rb[var13_int] = this.field_rb[var13_int] * var15 - this.field_xb[var13_int] * var14 + 16383 >> 14;
                              this.field_xb[var13_int] = var16;
                              break L25;
                            }
                          }
                          L26: {
                            if (param3 == 0) {
                              break L26;
                            } else {
                              var14 = qu.field_b[param3];
                              var15 = qu.field_d[param3];
                              var16 = this.field_T[var13_int] * var14 + this.field_xb[var13_int] * var15 + 16383 >> 14;
                              this.field_T[var13_int] = this.field_T[var13_int] * var15 - this.field_xb[var13_int] * var14 + 16383 >> 14;
                              this.field_xb[var13_int] = var16;
                              break L26;
                            }
                          }
                          this.field_xb[var13_int] = this.field_xb[var13_int] + this.field_gb;
                          this.field_rb[var13_int] = this.field_rb[var13_int] + this.field_H;
                          this.field_T[var13_int] = this.field_T[var13_int] + this.field_Y;
                          var12++;
                          continue L23;
                        } else {
                          var9++;
                          continue L22;
                        }
                      }
                    } else {
                      var12 = 0;
                      L27: while (true) {
                        if (var12 < var54.length) {
                          L28: {
                            var13_int = var54[var12];
                            this.field_xb[var13_int] = this.field_xb[var13_int] - this.field_gb;
                            this.field_rb[var13_int] = this.field_rb[var13_int] - this.field_H;
                            this.field_T[var13_int] = this.field_T[var13_int] - this.field_Y;
                            if (param4 == 0) {
                              break L28;
                            } else {
                              var14 = qu.field_b[param4];
                              var15 = qu.field_d[param4];
                              var16 = this.field_rb[var13_int] * var14 + this.field_xb[var13_int] * var15 + 16383 >> 14;
                              this.field_rb[var13_int] = this.field_rb[var13_int] * var15 - this.field_xb[var13_int] * var14 + 16383 >> 14;
                              this.field_xb[var13_int] = var16;
                              break L28;
                            }
                          }
                          L29: {
                            if (param2 == 0) {
                              break L29;
                            } else {
                              var14 = qu.field_b[param2];
                              var15 = qu.field_d[param2];
                              var16 = this.field_rb[var13_int] * var15 - this.field_T[var13_int] * var14 + 16383 >> 14;
                              this.field_T[var13_int] = this.field_rb[var13_int] * var14 + this.field_T[var13_int] * var15 + 16383 >> 14;
                              this.field_rb[var13_int] = var16;
                              break L29;
                            }
                          }
                          L30: {
                            if (param3 == 0) {
                              break L30;
                            } else {
                              var14 = qu.field_b[param3];
                              var15 = qu.field_d[param3];
                              var16 = this.field_T[var13_int] * var14 + this.field_xb[var13_int] * var15 + 16383 >> 14;
                              this.field_T[var13_int] = this.field_T[var13_int] * var15 - this.field_xb[var13_int] * var14 + 16383 >> 14;
                              this.field_xb[var13_int] = var16;
                              break L30;
                            }
                          }
                          this.field_xb[var13_int] = this.field_xb[var13_int] + this.field_gb;
                          this.field_rb[var13_int] = this.field_rb[var13_int] + this.field_H;
                          this.field_T[var13_int] = this.field_T[var13_int] + this.field_Y;
                          var12++;
                          continue L27;
                        } else {
                          var9++;
                          continue L22;
                        }
                      }
                    }
                  } else {
                    var9++;
                    continue L22;
                  }
                }
              }
            }
          } else {
            L31: {
              param2 = param2 << 4;
              param3 = param3 << 4;
              param4 = param4 << 4;
              if (this.field_S) {
                break L31;
              } else {
                var9 = 0;
                L32: while (true) {
                  if (var9 >= this.field_p) {
                    this.field_S = true;
                    break L31;
                  } else {
                    this.field_xb[var9] = this.field_xb[var9] << 4;
                    this.field_rb[var9] = this.field_rb[var9] << 4;
                    this.field_T[var9] = this.field_T[var9] << 4;
                    var9++;
                    continue L32;
                  }
                }
              }
            }
            var9 = 0;
            L33: while (true) {
              if (var9 >= var8) {
                return;
              } else {
                var10 = param1[var9];
                if (var10 < this.field_sb.length) {
                  var53 = this.field_sb[var10];
                  var12 = 0;
                  L34: while (true) {
                    if (var12 < var53.length) {
                      var13_int = var53[var12];
                      this.field_xb[var13_int] = this.field_xb[var13_int] + param2;
                      this.field_rb[var13_int] = this.field_rb[var13_int] + param3;
                      this.field_T[var13_int] = this.field_T[var13_int] + param4;
                      var12++;
                      continue L34;
                    } else {
                      var9++;
                      continue L33;
                    }
                  }
                } else {
                  var9++;
                  continue L33;
                }
              }
            }
          }
        } else {
          L35: {
            param2 = param2 << 4;
            param3 = param3 << 4;
            param4 = param4 << 4;
            if (this.field_S) {
              break L35;
            } else {
              var9 = 0;
              L36: while (true) {
                if (var9 >= this.field_p) {
                  this.field_S = true;
                  break L35;
                } else {
                  this.field_xb[var9] = this.field_xb[var9] << 4;
                  this.field_rb[var9] = this.field_rb[var9] << 4;
                  this.field_T[var9] = this.field_T[var9] << 4;
                  var9++;
                  continue L36;
                }
              }
            }
          }
          var9 = 0;
          this.field_gb = 0;
          this.field_H = 0;
          this.field_Y = 0;
          var10 = 0;
          L37: while (true) {
            if (var10 >= var8) {
              L38: {
                if (var9 <= 0) {
                  this.field_gb = param2;
                  this.field_H = param3;
                  this.field_Y = param4;
                  break L38;
                } else {
                  this.field_gb = this.field_gb / var9 + param2;
                  this.field_H = this.field_H / var9 + param3;
                  this.field_Y = this.field_Y / var9 + param4;
                  break L38;
                }
              }
              return;
            } else {
              var11 = param1[var10];
              if (var11 < this.field_sb.length) {
                var52 = this.field_sb[var11];
                var13_int = 0;
                L39: while (true) {
                  if (var13_int < var52.length) {
                    var14 = var52[var13_int];
                    this.field_gb = this.field_gb + this.field_xb[var14];
                    this.field_H = this.field_H + this.field_rb[var14];
                    this.field_Y = this.field_Y + this.field_T[var14];
                    var9++;
                    var13_int++;
                    continue L39;
                  } else {
                    var10++;
                    continue L37;
                  }
                }
              } else {
                var10++;
                continue L37;
              }
            }
          }
        }
    }

    final ka a(byte param0, int param1, boolean param2) {
        ww dupTemp$0 = null;
        ww var5 = null;
        ww var4 = null;
        this.a(Thread.currentThread());
        if (param0 == 1) {
            var5 = this.field_n;
            var4 = this.field_pb;
        } else {
            if (param0 == 2) {
                var5 = this.field_qb;
                var4 = this.field_u;
            } else {
                if (param0 == 3) {
                    var5 = this.field_K;
                    var4 = this.field_Q;
                } else {
                    if (param0 == 4) {
                        var5 = this.field_tb;
                        var4 = this.field_Gb;
                    } else {
                        if (param0 == 5) {
                            var5 = this.field_fb;
                            var4 = this.field_N;
                        } else {
                            dupTemp$0 = new ww(this.field_d);
                            var5 = dupTemp$0;
                            var4 = dupTemp$0;
                        }
                    }
                }
            }
        }
        return this.a(var4, var5, param1, param0 != 0 ? true : false, param2);
    }

    private final void i(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          if (this.field_F.field_h) {
            L1: {
              var2 = this.field_M[param0];
              var3 = this.field_bb[param0];
              var4 = this.field_x[param0];
              var5 = 0;
              var6 = 0;
              var7 = 0;
              if (this.field_s[var2] <= this.field_F.field_L) {
                if (this.field_s[var2] <= this.field_F.field_M) {
                  break L1;
                } else {
                  var5 = (this.field_F.field_M - this.field_s[var2]) * 255 / (this.field_F.field_M - this.field_F.field_L);
                  break L1;
                }
              } else {
                var5 = 255;
                break L1;
              }
            }
            L2: {
              if (this.field_s[var3] <= this.field_F.field_L) {
                if (this.field_s[var3] <= this.field_F.field_M) {
                  break L2;
                } else {
                  var6 = (this.field_F.field_M - this.field_s[var3]) * 255 / (this.field_F.field_M - this.field_F.field_L);
                  break L2;
                }
              } else {
                var6 = 255;
                break L2;
              }
            }
            L3: {
              if (this.field_s[var4] <= this.field_F.field_L) {
                if (this.field_s[var4] <= this.field_F.field_M) {
                  break L3;
                } else {
                  var7 = (this.field_F.field_M - this.field_s[var4]) * 255 / (this.field_F.field_M - this.field_F.field_L);
                  break L3;
                }
              } else {
                var7 = 255;
                break L3;
              }
            }
            L4: {
              if (this.field_h != null) {
                this.field_w.field_b = this.field_h[param0] & 255;
                break L4;
              } else {
                this.field_w.field_b = 0;
                break L4;
              }
            }
            L5: {
              if (this.field_X == null) {
                break L5;
              } else {
                if (this.field_X[param0] != -1) {
                  L6: {
                    var8 = -16777216;
                    if (this.field_h == null) {
                      break L6;
                    } else {
                      var8 = 255 - (this.field_h[param0] & 255) << 24;
                      break L6;
                    }
                  }
                  if (this.field_Fb[param0] != -1) {
                    this.field_w.b((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var8 | this.field_t[param0] & 16777215, var8 | this.field_o[param0] & 16777215, var8 | this.field_Fb[param0] & 16777215, this.field_F.field_D, var5, var6, var7, (int) this.field_X[param0]);
                    break L0;
                  } else {
                    var9 = var8 | this.field_t[param0] & 16777215;
                    this.field_w.b((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var9, var9, var9, this.field_F.field_D, var5, var6, var7, (int) this.field_X[param0]);
                    break L0;
                  }
                } else {
                  break L5;
                }
              }
            }
            if (this.field_Fb[param0] != -1) {
              this.field_w.b((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], l.a(var5 << 24 | this.field_F.field_D, bt.field_h[this.field_t[param0] & 65535], 20048), l.a(var6 << 24 | this.field_F.field_D, bt.field_h[this.field_o[param0] & 65535], 20048), l.a(var7 << 24 | this.field_F.field_D, bt.field_h[this.field_Fb[param0] & 65535], 20048));
              break L0;
            } else {
              this.field_w.b((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], l.a(var5 << 24 | this.field_F.field_D, bt.field_h[this.field_t[param0] & 65535], 20048), l.a(var6 << 24 | this.field_F.field_D, bt.field_h[this.field_t[param0] & 65535], 20048), l.a(var7 << 24 | this.field_F.field_D, bt.field_h[this.field_t[param0] & 65535], 20048));
              break L0;
            }
          } else {
            L7: {
              var2 = this.field_M[param0];
              var3 = this.field_bb[param0];
              var4 = this.field_x[param0];
              var5 = this.field_mb[var2] - this.field_F.field_B;
              if (var5 <= 255) {
                if (var5 >= 0) {
                  break L7;
                } else {
                  var5 = 0;
                  break L7;
                }
              } else {
                var5 = 255;
                break L7;
              }
            }
            L8: {
              var6 = this.field_mb[var3] - this.field_F.field_B;
              if (var6 <= 255) {
                if (var6 >= 0) {
                  break L8;
                } else {
                  var6 = 0;
                  break L8;
                }
              } else {
                var6 = 255;
                break L8;
              }
            }
            L9: {
              var7 = this.field_mb[var4] - this.field_F.field_B;
              if (var7 <= 255) {
                if (var7 >= 0) {
                  break L9;
                } else {
                  var7 = 0;
                  break L9;
                }
              } else {
                var7 = 255;
                break L9;
              }
            }
            var8 = var5 + var6 + var7;
            if (var8 != 765) {
              if (var8 != 0) {
                L10: {
                  if (this.field_h != null) {
                    this.field_w.field_b = this.field_h[param0] & 255;
                    break L10;
                  } else {
                    this.field_w.field_b = 0;
                    break L10;
                  }
                }
                L11: {
                  if (this.field_X == null) {
                    break L11;
                  } else {
                    if (this.field_X[param0] != -1) {
                      L12: {
                        var9 = -16777216;
                        if (this.field_h == null) {
                          break L12;
                        } else {
                          var9 = 255 - (this.field_h[param0] & 255) << 24;
                          break L12;
                        }
                      }
                      if (this.field_Fb[param0] != -1) {
                        this.field_w.b((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var9 | this.field_t[param0] & 16777215, var9 | this.field_o[param0] & 16777215, var9 | this.field_Fb[param0] & 16777215, this.field_F.field_D, var5, var6, var7, (int) this.field_X[param0]);
                        break L0;
                      } else {
                        var10 = var9 | this.field_t[param0] & 16777215;
                        this.field_w.b((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var10, var10, var10, this.field_F.field_D, var5, var6, var7, (int) this.field_X[param0]);
                        break L0;
                      }
                    } else {
                      break L11;
                    }
                  }
                }
                if (this.field_Fb[param0] != -1) {
                  this.field_w.b((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], l.a(var5 << 24 | this.field_F.field_D, bt.field_h[this.field_t[param0] & 65535], 20048), l.a(var6 << 24 | this.field_F.field_D, bt.field_h[this.field_o[param0] & 65535], 20048), l.a(var7 << 24 | this.field_F.field_D, bt.field_h[this.field_Fb[param0] & 65535], 20048));
                  break L0;
                } else {
                  this.field_w.b((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], l.a(var5 << 24 | this.field_F.field_D, bt.field_h[this.field_t[param0] & 65535], 20048), l.a(var6 << 24 | this.field_F.field_D, bt.field_h[this.field_t[param0] & 65535], 20048), l.a(var7 << 24 | this.field_F.field_D, bt.field_h[this.field_t[param0] & 65535], 20048));
                  break L0;
                }
              } else {
                this.f(param0);
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6_int = 0;
        hna var6 = null;
        int var7_int = 0;
        nsa var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if ((this.field_P & 524288) == 524288) {
          var5 = 0;
          L0: while (true) {
            if (var5 >= this.field_g) {
              L1: {
                if (this.field_e == null) {
                  break L1;
                } else {
                  var10 = 0;
                  var5 = var10;
                  L2: while (true) {
                    if (var10 >= this.field_m) {
                      break L1;
                    } else {
                      var6 = this.field_e[var10];
                      var7 = this.field_db[var10];
                      var7.field_k = var7.field_k & -16777216 | bt.field_h[tg.a((byte) -120, this.field_ob[var6.field_j] & 65535)] & 16777215;
                      var10++;
                      continue L2;
                    }
                  }
                }
              }
              L3: {
                if (this.field_eb != 2) {
                  break L3;
                } else {
                  this.field_eb = 1;
                  break L3;
                }
              }
              return;
            } else {
              L4: {
                var6_int = this.field_ob[var5] & 65535;
                var7_int = var6_int >> 10 & 63;
                var8 = var6_int >> 7 & 7;
                var9 = var6_int & 127;
                if (param0 == -1) {
                  break L4;
                } else {
                  var7_int = var7_int + ((param0 - var7_int) * param3 >> 7);
                  break L4;
                }
              }
              L5: {
                if (param1 == -1) {
                  break L5;
                } else {
                  var8 = var8 + ((param1 - var8) * param3 >> 7);
                  break L5;
                }
              }
              L6: {
                if (param2 == -1) {
                  break L6;
                } else {
                  var9 = var9 + ((param2 - var9) * param3 >> 7);
                  break L6;
                }
              }
              this.field_ob[var5] = (short)(var7_int << 10 | var8 << 7 | var9);
              var5++;
              continue L0;
            }
          }
        } else {
          throw new IllegalStateException(field_Hb);
        }
    }

    private final ka a(ww param0, ww param1, int param2, boolean param3, boolean param4) {
        int[] array$15 = null;
        int[] array$16 = null;
        int[] array$17 = null;
        short[] array$18 = null;
        int[] array$19 = null;
        int[] array$20 = null;
        int[] array$21 = null;
        byte[] array$22 = null;
        oha[] array$23 = null;
        gna[] array$24 = null;
        short[] array$25 = null;
        byte[] array$26 = null;
        nsa[] array$27 = null;
        float[][] dupTemp$28 = null;
        float[][] dupTemp$29 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ww var10_ref_ww = null;
        ww var11_ref_ww = null;
        int var11 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_31_0 = 0;
        gna[] stackIn_130_0 = null;
        int stackIn_130_1 = 0;
        gna[] stackIn_131_0 = null;
        int stackIn_131_1 = 0;
        gna[] stackIn_132_0 = null;
        int stackIn_132_1 = 0;
        gna stackIn_132_2 = null;
        int stackIn_158_0 = 0;
        int stackIn_183_0 = 0;
        int stackIn_197_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_24_0 = 0;
        gna[] stackOut_129_0 = null;
        int stackOut_129_1 = 0;
        gna[] stackOut_131_0 = null;
        int stackOut_131_1 = 0;
        Object stackOut_131_2 = null;
        gna[] stackOut_130_0 = null;
        int stackOut_130_1 = 0;
        gna stackOut_130_2 = null;
        int stackOut_157_0 = 0;
        int stackOut_156_0 = 0;
        int stackOut_182_0 = 0;
        int stackOut_181_0 = 0;
        int stackOut_196_0 = 0;
        int stackOut_195_0 = 0;
        L0: {
          param0.field_r = this.field_r;
          if (!this.field_r) {
            break L0;
          } else {
            param0.field_O = this.field_O;
            param0.field_cb = this.field_cb;
            param0.field_vb = this.field_vb;
            param0.field_R = this.field_R;
            param0.field_f = this.field_f;
            param0.field_Bb = this.field_Bb;
            param0.field_U = this.field_U;
            break L0;
          }
        }
        L1: {
          param0.field_Db = this.field_Db;
          param0.field_ib = this.field_ib;
          param0.field_p = this.field_p;
          param0.field_Z = this.field_Z;
          param0.field_g = this.field_g;
          param0.field_m = this.field_m;
          if ((param2 & 256) == 0) {
            param0.field_ab = this.field_ab;
            break L1;
          } else {
            param0.field_ab = true;
            break L1;
          }
        }
        L2: {
          if ((param2 & 7) != 7) {
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            break L2;
          } else {
            stackOut_6_0 = 1;
            stackIn_8_0 = stackOut_6_0;
            break L2;
          }
        }
        L3: {
          stackOut_8_0 = stackIn_8_0;
          stackIn_10_0 = stackOut_8_0;
          stackIn_9_0 = stackOut_8_0;
          if ((param2 & 32) == 0) {
            stackOut_10_0 = stackIn_10_0;
            stackOut_10_1 = 0;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            break L3;
          } else {
            stackOut_9_0 = stackIn_9_0;
            stackOut_9_1 = 1;
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            break L3;
          }
        }
        L4: {
          var6 = stackIn_11_0 | stackIn_11_1;
          if (var6 == 0) {
            if ((param2 & 1) != 0) {
              stackOut_15_0 = 1;
              stackIn_17_0 = stackOut_15_0;
              break L4;
            } else {
              stackOut_14_0 = 0;
              stackIn_17_0 = stackOut_14_0;
              break L4;
            }
          } else {
            stackOut_12_0 = 1;
            stackIn_17_0 = stackOut_12_0;
            break L4;
          }
        }
        L5: {
          var7 = stackIn_17_0;
          if (var6 == 0) {
            if ((param2 & 2) != 0) {
              stackOut_21_0 = 1;
              stackIn_23_0 = stackOut_21_0;
              break L5;
            } else {
              stackOut_20_0 = 0;
              stackIn_23_0 = stackOut_20_0;
              break L5;
            }
          } else {
            stackOut_18_0 = 1;
            stackIn_23_0 = stackOut_18_0;
            break L5;
          }
        }
        L6: {
          var8 = stackIn_23_0;
          if (var6 == 0) {
            if ((param2 & 4) == 0) {
              if ((param2 & 16) != 0) {
                stackOut_29_0 = 1;
                stackIn_31_0 = stackOut_29_0;
                break L6;
              } else {
                stackOut_28_0 = 0;
                stackIn_31_0 = stackOut_28_0;
                break L6;
              }
            } else {
              stackOut_26_0 = 1;
              stackIn_31_0 = stackOut_26_0;
              break L6;
            }
          } else {
            stackOut_24_0 = 1;
            stackIn_31_0 = stackOut_24_0;
            break L6;
          }
        }
        L7: {
          L8: {
            var9 = stackIn_31_0;
            if (var7 != 0) {
              break L8;
            } else {
              if (var8 != 0) {
                break L8;
              } else {
                if (var9 == 0) {
                  param0.field_xb = this.field_xb;
                  param0.field_rb = this.field_rb;
                  param0.field_T = this.field_T;
                  break L7;
                } else {
                  break L8;
                }
              }
            }
          }
          L9: {
            if (var7 == 0) {
              param0.field_xb = this.field_xb;
              break L9;
            } else {
              L10: {
                L11: {
                  if (param1.field_xb == null) {
                    break L11;
                  } else {
                    if (param1.field_xb.length >= this.field_p) {
                      param0.field_xb = param1.field_xb;
                      break L10;
                    } else {
                      break L11;
                    }
                  }
                }
                array$15 = new int[this.field_p];
                param1.field_xb = array$15;
                param0.field_xb = array$15;
                break L10;
              }
              var10 = 0;
              L12: while (true) {
                if (var10 >= this.field_p) {
                  break L9;
                } else {
                  param0.field_xb[var10] = this.field_xb[var10];
                  var10++;
                  continue L12;
                }
              }
            }
          }
          L13: {
            if (var8 == 0) {
              param0.field_rb = this.field_rb;
              break L13;
            } else {
              L14: {
                L15: {
                  if (param1.field_rb == null) {
                    break L15;
                  } else {
                    if (param1.field_rb.length >= this.field_p) {
                      param0.field_rb = param1.field_rb;
                      break L14;
                    } else {
                      break L15;
                    }
                  }
                }
                array$16 = new int[this.field_p];
                param1.field_rb = array$16;
                param0.field_rb = array$16;
                break L14;
              }
              var10 = 0;
              L16: while (true) {
                if (var10 >= this.field_p) {
                  break L13;
                } else {
                  param0.field_rb[var10] = this.field_rb[var10];
                  var10++;
                  continue L16;
                }
              }
            }
          }
          if (var9 == 0) {
            param0.field_T = this.field_T;
            break L7;
          } else {
            L17: {
              L18: {
                if (param1.field_T == null) {
                  break L18;
                } else {
                  if (param1.field_T.length >= this.field_p) {
                    param0.field_T = param1.field_T;
                    break L17;
                  } else {
                    break L18;
                  }
                }
              }
              array$17 = new int[this.field_p];
              param1.field_T = array$17;
              param0.field_T = array$17;
              break L17;
            }
            var10 = 0;
            L19: while (true) {
              if (var10 >= this.field_p) {
                break L7;
              } else {
                param0.field_T[var10] = this.field_T[var10];
                var10++;
                continue L19;
              }
            }
          }
        }
        L20: {
          if ((param2 & 540800) == 0) {
            param0.field_ob = this.field_ob;
            break L20;
          } else {
            L21: {
              L22: {
                if (param1.field_ob == null) {
                  break L22;
                } else {
                  if (param1.field_ob.length >= this.field_g) {
                    param0.field_ob = param1.field_ob;
                    break L21;
                  } else {
                    break L22;
                  }
                }
              }
              var10 = this.field_g;
              array$18 = new short[var10];
              param1.field_ob = array$18;
              param0.field_ob = array$18;
              break L21;
            }
            var10 = 0;
            L23: while (true) {
              if (var10 >= this.field_g) {
                break L20;
              } else {
                param0.field_ob[var10] = this.field_ob[var10];
                var10++;
                continue L23;
              }
            }
          }
        }
        L24: {
          if ((param2 & 618520) == 0) {
            if ((param2 & 128) == 0) {
              L25: {
                if (!param4) {
                  break L25;
                } else {
                  this.a(false);
                  break L25;
                }
              }
              param0.field_t = this.field_t;
              param0.field_o = this.field_o;
              param0.field_Fb = this.field_Fb;
              param0.field_eb = this.field_eb;
              break L24;
            } else {
              L26: {
                if (!param4) {
                  break L26;
                } else {
                  this.a(false);
                  break L26;
                }
              }
              L27: {
                if (this.field_t == null) {
                  break L27;
                } else {
                  L28: {
                    L29: {
                      if (param1.field_t == null) {
                        break L29;
                      } else {
                        if (param1.field_t.length >= this.field_g) {
                          param0.field_t = param1.field_t;
                          param0.field_o = param1.field_o;
                          param0.field_Fb = param1.field_Fb;
                          break L28;
                        } else {
                          break L29;
                        }
                      }
                    }
                    var10 = this.field_g;
                    array$19 = new int[var10];
                    param1.field_t = array$19;
                    param0.field_t = array$19;
                    array$20 = new int[var10];
                    param1.field_o = array$20;
                    param0.field_o = array$20;
                    array$21 = new int[var10];
                    param1.field_Fb = array$21;
                    param0.field_Fb = array$21;
                    break L28;
                  }
                  var10 = 0;
                  L30: while (true) {
                    if (var10 >= this.field_g) {
                      break L27;
                    } else {
                      param0.field_t[var10] = this.field_t[var10];
                      param0.field_o[var10] = this.field_o[var10];
                      param0.field_Fb[var10] = this.field_Fb[var10];
                      var10++;
                      continue L30;
                    }
                  }
                }
              }
              param0.field_eb = this.field_eb;
              break L24;
            }
          } else {
            param0.field_eb = 0;
            var10_ref_ww = param0;
            var11_ref_ww = param0;
            param0.field_Fb = null;
            var11_ref_ww.field_o = null;
            var10_ref_ww.field_t = null;
            break L24;
          }
        }
        L31: {
          if ((param2 & 256) == 0) {
            param0.field_h = this.field_h;
            break L31;
          } else {
            L32: {
              L33: {
                if (param1.field_h == null) {
                  break L33;
                } else {
                  if (param1.field_h.length >= this.field_g) {
                    param0.field_h = param1.field_h;
                    break L32;
                  } else {
                    break L33;
                  }
                }
              }
              var10 = this.field_g;
              array$22 = new byte[var10];
              param1.field_h = array$22;
              param0.field_h = array$22;
              break L32;
            }
            if (this.field_h == null) {
              var10 = 0;
              L34: while (true) {
                if (var10 >= this.field_g) {
                  break L31;
                } else {
                  param0.field_h[var10] = (byte) 0;
                  var10++;
                  continue L34;
                }
              }
            } else {
              var10 = 0;
              L35: while (true) {
                if (var10 >= this.field_g) {
                  break L31;
                } else {
                  param0.field_h[var10] = this.field_h[var10];
                  var10++;
                  continue L35;
                }
              }
            }
          }
        }
        L36: {
          L37: {
            if ((param2 & 8) != 0) {
              break L37;
            } else {
              if ((param2 & 16) == 0) {
                L38: {
                  if (!param4) {
                    break L38;
                  } else {
                    this.g();
                    break L38;
                  }
                }
                param0.field_lb = this.field_lb;
                param0.field_I = this.field_I;
                break L36;
              } else {
                break L37;
              }
            }
          }
          L39: {
            L40: {
              if (param1.field_lb == null) {
                break L40;
              } else {
                if (param1.field_lb.length >= this.field_Z) {
                  param0.field_lb = param1.field_lb;
                  break L39;
                } else {
                  break L40;
                }
              }
            }
            var10 = this.field_Z;
            array$23 = new oha[var10];
            param1.field_lb = array$23;
            param0.field_lb = array$23;
            break L39;
          }
          L41: {
            if (this.field_lb == null) {
              param0.field_lb = null;
              break L41;
            } else {
              var10 = 0;
              L42: while (true) {
                if (var10 >= this.field_Z) {
                  break L41;
                } else {
                  param0.field_lb[var10] = new oha(this.field_lb[var10]);
                  var10++;
                  continue L42;
                }
              }
            }
          }
          if (this.field_I == null) {
            param0.field_I = null;
            break L36;
          } else {
            L43: {
              L44: {
                if (param1.field_I == null) {
                  break L44;
                } else {
                  if (param1.field_I.length >= this.field_g) {
                    param0.field_I = param1.field_I;
                    break L43;
                  } else {
                    break L44;
                  }
                }
              }
              var10 = this.field_g;
              array$24 = new gna[var10];
              param1.field_I = array$24;
              param0.field_I = array$24;
              break L43;
            }
            var10 = 0;
            L45: while (true) {
              if (var10 >= this.field_g) {
                break L36;
              } else {
                L46: {
                  stackOut_129_0 = param0.field_I;
                  stackOut_129_1 = var10;
                  stackIn_131_0 = stackOut_129_0;
                  stackIn_131_1 = stackOut_129_1;
                  stackIn_130_0 = stackOut_129_0;
                  stackIn_130_1 = stackOut_129_1;
                  if (this.field_I[var10] == null) {
                    stackOut_131_0 = (gna[]) ((Object) stackIn_131_0);
                    stackOut_131_1 = stackIn_131_1;
                    stackOut_131_2 = null;
                    stackIn_132_0 = stackOut_131_0;
                    stackIn_132_1 = stackOut_131_1;
                    stackIn_132_2 = (gna) ((Object) stackOut_131_2);
                    break L46;
                  } else {
                    stackOut_130_0 = (gna[]) ((Object) stackIn_130_0);
                    stackOut_130_1 = stackIn_130_1;
                    stackOut_130_2 = new gna(this.field_I[var10]);
                    stackIn_132_0 = stackOut_130_0;
                    stackIn_132_1 = stackOut_130_1;
                    stackIn_132_2 = stackOut_130_2;
                    break L46;
                  }
                }
                stackIn_132_0[stackIn_132_1] = stackIn_132_2;
                var10++;
                continue L45;
              }
            }
          }
        }
        L47: {
          if ((param2 & 32768) == 0) {
            param0.field_X = this.field_X;
            break L47;
          } else {
            if (this.field_X != null) {
              L48: {
                L49: {
                  if (param1.field_X == null) {
                    break L49;
                  } else {
                    if (param1.field_X.length >= this.field_g) {
                      param0.field_X = param1.field_X;
                      break L48;
                    } else {
                      break L49;
                    }
                  }
                }
                var10 = this.field_g;
                array$25 = new short[var10];
                param1.field_X = array$25;
                param0.field_X = array$25;
                break L48;
              }
              var10 = 0;
              L50: while (true) {
                if (var10 >= this.field_g) {
                  break L47;
                } else {
                  param0.field_X[var10] = this.field_X[var10];
                  var10++;
                  continue L50;
                }
              }
            } else {
              param0.field_X = null;
              break L47;
            }
          }
        }
        L51: {
          if ((param2 & 65536) == 0) {
            param0.field_k = this.field_k;
            break L51;
          } else {
            if (this.field_k != null) {
              L52: {
                L53: {
                  if (param1.field_k == null) {
                    break L53;
                  } else {
                    if (param1.field_k.length >= this.field_g) {
                      param0.field_k = param1.field_k;
                      break L52;
                    } else {
                      break L53;
                    }
                  }
                }
                L54: {
                  if (!param3) {
                    stackOut_157_0 = this.field_g;
                    stackIn_158_0 = stackOut_157_0;
                    break L54;
                  } else {
                    stackOut_156_0 = this.field_g + 100;
                    stackIn_158_0 = stackOut_156_0;
                    break L54;
                  }
                }
                var10 = stackIn_158_0;
                array$26 = new byte[var10];
                param1.field_k = array$26;
                param0.field_k = array$26;
                break L52;
              }
              var10 = 0;
              L55: while (true) {
                if (var10 >= this.field_g) {
                  break L51;
                } else {
                  param0.field_k[var10] = this.field_k[var10];
                  var10++;
                  continue L55;
                }
              }
            } else {
              param0.field_k = null;
              break L51;
            }
          }
        }
        L56: {
          if ((param2 & 50560) == 0) {
            param0.field_db = this.field_db;
            break L56;
          } else {
            L57: {
              if (param1.field_db == null) {
                break L57;
              } else {
                if (param1.field_db.length >= this.field_m) {
                  param0.field_db = param1.field_db;
                  var10 = 0;
                  L58: while (true) {
                    if (var10 >= this.field_m) {
                      break L56;
                    } else {
                      param0.field_db[var10].a(this.field_db[var10], (byte) -6);
                      var10++;
                      continue L58;
                    }
                  }
                } else {
                  break L57;
                }
              }
            }
            var10 = this.field_m;
            array$27 = new nsa[var10];
            param1.field_db = array$27;
            param0.field_db = array$27;
            var11 = 0;
            L59: while (true) {
              if (var11 >= this.field_m) {
                break L56;
              } else {
                param0.field_db[var11] = this.field_db[var11].a(-2707);
                var11++;
                continue L59;
              }
            }
          }
        }
        L60: {
          L61: {
            if (this.field_W == null) {
              break L61;
            } else {
              if ((param2 & 16) == 0) {
                break L61;
              } else {
                L62: {
                  L63: {
                    if (param1.field_W == null) {
                      break L63;
                    } else {
                      if (param1.field_W.length >= this.field_g) {
                        param0.field_W = param1.field_W;
                        break L62;
                      } else {
                        break L63;
                      }
                    }
                  }
                  L64: {
                    if (!param3) {
                      stackOut_182_0 = this.field_g;
                      stackIn_183_0 = stackOut_182_0;
                      break L64;
                    } else {
                      stackOut_181_0 = this.field_g + 100;
                      stackIn_183_0 = stackOut_181_0;
                      break L64;
                    }
                  }
                  var10 = stackIn_183_0;
                  dupTemp$28 = new float[var10][3];
                  param1.field_W = dupTemp$28;
                  param0.field_W = dupTemp$28;
                  break L62;
                }
                var10 = 0;
                L65: while (true) {
                  if (var10 >= this.field_g) {
                    L66: {
                      L67: {
                        if (param1.field_l == null) {
                          break L67;
                        } else {
                          if (param1.field_l.length >= this.field_g) {
                            param0.field_l = param1.field_l;
                            break L66;
                          } else {
                            break L67;
                          }
                        }
                      }
                      L68: {
                        if (!param3) {
                          stackOut_196_0 = this.field_g;
                          stackIn_197_0 = stackOut_196_0;
                          break L68;
                        } else {
                          stackOut_195_0 = this.field_g + 100;
                          stackIn_197_0 = stackOut_195_0;
                          break L68;
                        }
                      }
                      var10 = stackIn_197_0;
                      dupTemp$29 = new float[var10][3];
                      param1.field_l = dupTemp$29;
                      param0.field_l = dupTemp$29;
                      break L66;
                    }
                    var10 = 0;
                    L69: while (true) {
                      if (var10 >= this.field_g) {
                        break L60;
                      } else {
                        if (this.field_l[var10] != null) {
                          param0.field_l[var10][0] = this.field_l[var10][0];
                          param0.field_l[var10][1] = this.field_l[var10][1];
                          param0.field_l[var10][2] = this.field_l[var10][2];
                          var10++;
                          continue L69;
                        } else {
                          var10++;
                          continue L69;
                        }
                      }
                    }
                  } else {
                    if (this.field_W[var10] != null) {
                      param0.field_W[var10][0] = this.field_W[var10][0];
                      param0.field_W[var10][1] = this.field_W[var10][1];
                      param0.field_W[var10][2] = this.field_W[var10][2];
                      var10++;
                      continue L65;
                    } else {
                      var10++;
                      continue L65;
                    }
                  }
                }
              }
            }
          }
          param0.field_W = this.field_W;
          param0.field_l = this.field_l;
          break L60;
        }
        param0.field_sb = this.field_sb;
        param0.field_Cb = this.field_Cb;
        param0.field_j = this.field_j;
        param0.field_Eb = this.field_Eb;
        param0.field_V = this.field_V;
        param0.field_wb = this.field_wb;
        param0.field_M = this.field_M;
        param0.field_bb = this.field_bb;
        param0.field_x = this.field_x;
        param0.field_i = this.field_i;
        param0.field_kb = this.field_kb;
        param0.field_e = this.field_e;
        param0.field_ub = this.field_ub;
        param0.field_P = param2;
        return (ka) ((Object) param0);
    }

    final void I(int param0, int[] param1, int param2, int param3, int param4, boolean param5, int param6, int[] param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14_int = 0;
        nsa var14 = null;
        int var15 = 0;
        int[] var16_ref_int__ = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25_int = 0;
        int[] var25 = null;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29_int = 0;
        int[] var29 = null;
        int var30 = 0;
        int[] var31_ref_int__ = null;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int[] var35 = null;
        int var35_int = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var46 = 0;
        int[] var47 = null;
        int[] var50 = null;
        int[] var52 = null;
        int[] var55 = null;
        nsa var58 = null;
        hna var59 = null;
        nsa var61 = null;
        hna var62 = null;
        nsa var64 = null;
        nsa var66 = null;
        nsa var68 = null;
        int[] var71 = null;
        int[] var73 = null;
        int[] var76 = null;
        int[] var94 = null;
        int[] var95 = null;
        int[] var96 = null;
        int[] var97 = null;
        int[] var98 = null;
        int[] var99 = null;
        int[] var100 = null;
        int[] var101 = null;
        int[] var102 = null;
        int[] var103 = null;
        int[] var104 = null;
        var9 = param1.length;
        if (param0 != 0) {
          if (param0 != 1) {
            if (param0 != 2) {
              if (param0 != 3) {
                if (param0 != 5) {
                  if (param0 != 7) {
                    if (param0 != 8) {
                      if (param0 != 10) {
                        if (param0 != 9) {
                          return;
                        } else {
                          L0: {
                            if (this.field_j == null) {
                              break L0;
                            } else {
                              var10 = 0;
                              L1: while (true) {
                                if (var10 >= var9) {
                                  break L0;
                                } else {
                                  var11 = param1[var10];
                                  if (var11 < this.field_j.length) {
                                    var104 = this.field_j[var11];
                                    var13 = 0;
                                    L2: while (true) {
                                      if (var13 < var104.length) {
                                        var68 = this.field_db[var104[var13]];
                                        var14 = var68;
                                        var14.field_j = var68.field_j + param2 & 16383;
                                        var13++;
                                        continue L2;
                                      } else {
                                        var10++;
                                        continue L1;
                                      }
                                    }
                                  } else {
                                    var10++;
                                    continue L1;
                                  }
                                }
                              }
                            }
                          }
                          return;
                        }
                      } else {
                        L3: {
                          if (this.field_j == null) {
                            break L3;
                          } else {
                            var10 = 0;
                            L4: while (true) {
                              if (var10 >= var9) {
                                break L3;
                              } else {
                                var11 = param1[var10];
                                if (var11 < this.field_j.length) {
                                  var103 = this.field_j[var11];
                                  var13 = 0;
                                  L5: while (true) {
                                    if (var13 < var103.length) {
                                      var66 = this.field_db[var103[var13]];
                                      var14 = var66;
                                      var14.field_m = var66.field_m * param2 >> 7;
                                      var14.field_g = var66.field_g * param3 >> 7;
                                      var13++;
                                      continue L5;
                                    } else {
                                      var10++;
                                      continue L4;
                                    }
                                  }
                                } else {
                                  var10++;
                                  continue L4;
                                }
                              }
                            }
                          }
                        }
                        return;
                      }
                    } else {
                      L6: {
                        if (this.field_j == null) {
                          break L6;
                        } else {
                          var10 = 0;
                          L7: while (true) {
                            if (var10 >= var9) {
                              break L6;
                            } else {
                              var11 = param1[var10];
                              if (var11 < this.field_j.length) {
                                var102 = this.field_j[var11];
                                var13 = 0;
                                L8: while (true) {
                                  if (var13 < var102.length) {
                                    var64 = this.field_db[var102[var13]];
                                    var64.field_b = var64.field_b + param2;
                                    var64.field_a = var64.field_a + param3;
                                    var13++;
                                    continue L8;
                                  } else {
                                    var10++;
                                    continue L7;
                                  }
                                }
                              } else {
                                var10++;
                                continue L7;
                              }
                            }
                          }
                        }
                      }
                      return;
                    }
                  } else {
                    L9: {
                      if (this.field_Cb == null) {
                        break L9;
                      } else {
                        var10 = 0;
                        L10: while (true) {
                          if (var10 >= var9) {
                            if (this.field_e == null) {
                              break L9;
                            } else {
                              var10 = 0;
                              L11: while (true) {
                                if (var10 >= this.field_m) {
                                  break L9;
                                } else {
                                  var62 = this.field_e[var10];
                                  var61 = this.field_db[var10];
                                  var61.field_k = var61.field_k & -16777216 | bt.field_h[tg.a((byte) -114, this.field_ob[var62.field_j] & 65535) & 65535] & 16777215;
                                  var10++;
                                  continue L11;
                                }
                              }
                            }
                          } else {
                            var11 = param1[var10];
                            if (var11 < this.field_Cb.length) {
                              var101 = this.field_Cb[var11];
                              var13 = 0;
                              L12: while (true) {
                                if (var13 >= var101.length) {
                                  this.field_L = true;
                                  var10++;
                                  continue L10;
                                } else {
                                  L13: {
                                    var14_int = var101[var13];
                                    if (this.field_V == null) {
                                      break L13;
                                    } else {
                                      if ((param6 & this.field_V[var14_int]) != 0) {
                                        break L13;
                                      } else {
                                        var13++;
                                        continue L12;
                                      }
                                    }
                                  }
                                  L14: {
                                    var15 = this.field_ob[var14_int] & 65535;
                                    var16 = var15 >> 10 & 63;
                                    var17 = var15 >> 7 & 7;
                                    var18 = var15 & 127;
                                    var16 = var16 + param2 & 63;
                                    var17 = var17 + param3;
                                    if (var17 >= 0) {
                                      if (var17 <= 7) {
                                        break L14;
                                      } else {
                                        var17 = 7;
                                        break L14;
                                      }
                                    } else {
                                      var17 = 0;
                                      break L14;
                                    }
                                  }
                                  L15: {
                                    var18 = var18 + param4;
                                    if (var18 >= 0) {
                                      if (var18 <= 127) {
                                        break L15;
                                      } else {
                                        var18 = 127;
                                        break L15;
                                      }
                                    } else {
                                      var18 = 0;
                                      break L15;
                                    }
                                  }
                                  this.field_ob[var14_int] = (short)(var16 << 10 | var17 << 7 | var18);
                                  var13++;
                                  continue L12;
                                }
                              }
                            } else {
                              var10++;
                              continue L10;
                            }
                          }
                        }
                      }
                    }
                    return;
                  }
                } else {
                  L16: {
                    if (this.field_Cb == null) {
                      break L16;
                    } else {
                      if (this.field_h == null) {
                        break L16;
                      } else {
                        var10 = 0;
                        L17: while (true) {
                          if (var10 >= var9) {
                            if (this.field_e == null) {
                              break L16;
                            } else {
                              var10 = 0;
                              L18: while (true) {
                                if (var10 >= this.field_m) {
                                  break L16;
                                } else {
                                  var59 = this.field_e[var10];
                                  var58 = this.field_db[var10];
                                  var58.field_k = var58.field_k & 16777215 | 255 - (this.field_h[var59.field_j] & 255) << 24;
                                  var10++;
                                  continue L18;
                                }
                              }
                            }
                          } else {
                            var11 = param1[var10];
                            if (var11 < this.field_Cb.length) {
                              var100 = this.field_Cb[var11];
                              var13 = 0;
                              L19: while (true) {
                                if (var13 < var100.length) {
                                  L20: {
                                    var14_int = var100[var13];
                                    if (this.field_V == null) {
                                      break L20;
                                    } else {
                                      if ((param6 & this.field_V[var14_int]) != 0) {
                                        break L20;
                                      } else {
                                        var13++;
                                        continue L19;
                                      }
                                    }
                                  }
                                  L21: {
                                    var15 = (this.field_h[var14_int] & 255) + param2 * 8;
                                    if (var15 >= 0) {
                                      if (var15 <= 255) {
                                        break L21;
                                      } else {
                                        var15 = 255;
                                        break L21;
                                      }
                                    } else {
                                      var15 = 0;
                                      break L21;
                                    }
                                  }
                                  this.field_h[var14_int] = (byte)var15;
                                  var13++;
                                  continue L19;
                                } else {
                                  var10++;
                                  continue L17;
                                }
                              }
                            } else {
                              var10++;
                              continue L17;
                            }
                          }
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                L22: {
                  if (param7 == null) {
                    var10 = 0;
                    L23: while (true) {
                      if (var10 >= var9) {
                        break L22;
                      } else {
                        var11 = param1[var10];
                        if (var11 < this.field_sb.length) {
                          var99 = this.field_sb[var11];
                          var13 = 0;
                          L24: while (true) {
                            if (var13 < var99.length) {
                              L25: {
                                var14_int = var99[var13];
                                if (this.field_Eb == null) {
                                  break L25;
                                } else {
                                  if ((param6 & this.field_Eb[var14_int]) != 0) {
                                    break L25;
                                  } else {
                                    var13++;
                                    continue L24;
                                  }
                                }
                              }
                              this.field_xb[var14_int] = this.field_xb[var14_int] - this.field_gb;
                              this.field_rb[var14_int] = this.field_rb[var14_int] - this.field_H;
                              this.field_T[var14_int] = this.field_T[var14_int] - this.field_Y;
                              this.field_xb[var14_int] = this.field_xb[var14_int] * param2 / 128;
                              this.field_rb[var14_int] = this.field_rb[var14_int] * param3 / 128;
                              this.field_T[var14_int] = this.field_T[var14_int] * param4 / 128;
                              this.field_xb[var14_int] = this.field_xb[var14_int] + this.field_gb;
                              this.field_rb[var14_int] = this.field_rb[var14_int] + this.field_H;
                              this.field_T[var14_int] = this.field_T[var14_int] + this.field_Y;
                              var13++;
                              continue L24;
                            } else {
                              var10++;
                              continue L23;
                            }
                          }
                        } else {
                          var10++;
                          continue L23;
                        }
                      }
                    }
                  } else {
                    L26: {
                      if (this.field_S) {
                        break L26;
                      } else {
                        var10 = 0;
                        L27: while (true) {
                          if (var10 >= this.field_p) {
                            this.field_S = true;
                            break L26;
                          } else {
                            this.field_xb[var10] = this.field_xb[var10] << 4;
                            this.field_rb[var10] = this.field_rb[var10] << 4;
                            this.field_T[var10] = this.field_T[var10] << 4;
                            var10++;
                            continue L27;
                          }
                        }
                      }
                    }
                    L28: {
                      var10 = param7[9] << 4;
                      var11 = param7[10] << 4;
                      var12 = param7[11] << 4;
                      var13 = param7[12] << 4;
                      var14_int = param7[13] << 4;
                      var15 = param7[14] << 4;
                      if (!this.field_A) {
                        break L28;
                      } else {
                        var16 = param7[0] * this.field_gb + param7[3] * this.field_H + param7[6] * this.field_Y + 8192 >> 14;
                        var17 = param7[1] * this.field_gb + param7[4] * this.field_H + param7[7] * this.field_Y + 8192 >> 14;
                        var18 = param7[2] * this.field_gb + param7[5] * this.field_H + param7[8] * this.field_Y + 8192 >> 14;
                        var16 = var16 + var13;
                        var17 = var17 + var14_int;
                        var18 = var18 + var15;
                        this.field_gb = var16;
                        this.field_H = var17;
                        this.field_Y = var18;
                        this.field_A = false;
                        break L28;
                      }
                    }
                    var16 = param2 << 15 >> 7;
                    var17 = param3 << 15 >> 7;
                    var18 = param4 << 15 >> 7;
                    var19 = var16 * -this.field_gb + 8192 >> 14;
                    var20 = var17 * -this.field_H + 8192 >> 14;
                    var21 = var18 * -this.field_Y + 8192 >> 14;
                    var22 = var19 + this.field_gb;
                    var23 = var20 + this.field_H;
                    var24 = var21 + this.field_Y;
                    var25 = new int[9];
                    var25[0] = var16 * param7[0] + 8192 >> 14;
                    var25[1] = var16 * param7[3] + 8192 >> 14;
                    var25[2] = var16 * param7[6] + 8192 >> 14;
                    var25[3] = var17 * param7[1] + 8192 >> 14;
                    var25[4] = var17 * param7[4] + 8192 >> 14;
                    var25[5] = var17 * param7[7] + 8192 >> 14;
                    var25[6] = var18 * param7[2] + 8192 >> 14;
                    var25[7] = var18 * param7[5] + 8192 >> 14;
                    var25[8] = var18 * param7[8] + 8192 >> 14;
                    var26 = var16 * var13 + 8192 >> 14;
                    var27 = var17 * var14_int + 8192 >> 14;
                    var28 = var18 * var15 + 8192 >> 14;
                    var26 = var26 + var22;
                    var27 = var27 + var23;
                    var28 = var28 + var24;
                    var76 = new int[9];
                    var55 = var76;
                    var29 = var55;
                    var30 = 0;
                    L29: while (true) {
                      if (var30 >= 3) {
                        var30 = param7[0] * var26 + param7[1] * var27 + param7[2] * var28 + 8192 >> 14;
                        var31 = param7[3] * var26 + param7[4] * var27 + param7[5] * var28 + 8192 >> 14;
                        var32 = param7[6] * var26 + param7[7] * var27 + param7[8] * var28 + 8192 >> 14;
                        var30 = var30 + var10;
                        var31 = var31 + var11;
                        var32 = var32 + var12;
                        var33 = 0;
                        L30: while (true) {
                          if (var33 >= var9) {
                            break L22;
                          } else {
                            var34 = param1[var33];
                            if (var34 < this.field_sb.length) {
                              var98 = this.field_sb[var34];
                              var36 = 0;
                              L31: while (true) {
                                if (var36 < var98.length) {
                                  L32: {
                                    var37 = var98[var36];
                                    if (this.field_Eb == null) {
                                      break L32;
                                    } else {
                                      if ((param6 & this.field_Eb[var37]) != 0) {
                                        break L32;
                                      } else {
                                        var36++;
                                        continue L31;
                                      }
                                    }
                                  }
                                  var38 = var76[0] * this.field_xb[var37] + var76[1] * this.field_rb[var37] + var76[2] * this.field_T[var37] + 8192 >> 14;
                                  var39 = var76[3] * this.field_xb[var37] + var76[4] * this.field_rb[var37] + var76[5] * this.field_T[var37] + 8192 >> 14;
                                  var40 = var76[6] * this.field_xb[var37] + var76[7] * this.field_rb[var37] + var76[8] * this.field_T[var37] + 8192 >> 14;
                                  var38 = var38 + var30;
                                  var39 = var39 + var31;
                                  var40 = var40 + var32;
                                  this.field_xb[var37] = var38;
                                  this.field_rb[var37] = var39;
                                  this.field_T[var37] = var40;
                                  var36++;
                                  continue L31;
                                } else {
                                  var33++;
                                  continue L30;
                                }
                              }
                            } else {
                              var33++;
                              continue L30;
                            }
                          }
                        }
                      } else {
                        var31 = 0;
                        L33: while (true) {
                          if (var31 >= 3) {
                            var30++;
                            continue L29;
                          } else {
                            var32 = 0;
                            var33 = 0;
                            L34: while (true) {
                              if (var33 >= 3) {
                                var29[var30 * 3 + var31] = var32 + 8192 >> 14;
                                var31++;
                                continue L33;
                              } else {
                                var32 = var32 + param7[var30 * 3 + var33] * var25[var31 + var33 * 3];
                                var33++;
                                continue L34;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                return;
              }
            } else {
              L35: {
                if (param7 == null) {
                  var10 = 0;
                  L36: while (true) {
                    if (var10 >= var9) {
                      break L35;
                    } else {
                      var11 = param1[var10];
                      if (var11 < this.field_sb.length) {
                        var97 = this.field_sb[var11];
                        var13 = 0;
                        L37: while (true) {
                          if (var13 < var97.length) {
                            L38: {
                              var14_int = var97[var13];
                              if (this.field_Eb == null) {
                                break L38;
                              } else {
                                if ((param6 & this.field_Eb[var14_int]) != 0) {
                                  break L38;
                                } else {
                                  var13++;
                                  continue L37;
                                }
                              }
                            }
                            L39: {
                              this.field_xb[var14_int] = this.field_xb[var14_int] - this.field_gb;
                              this.field_rb[var14_int] = this.field_rb[var14_int] - this.field_H;
                              this.field_T[var14_int] = this.field_T[var14_int] - this.field_Y;
                              if (param4 == 0) {
                                break L39;
                              } else {
                                var15 = qu.field_b[param4];
                                var16 = qu.field_d[param4];
                                var17 = this.field_rb[var14_int] * var15 + this.field_xb[var14_int] * var16 + 16383 >> 14;
                                this.field_rb[var14_int] = this.field_rb[var14_int] * var16 - this.field_xb[var14_int] * var15 + 16383 >> 14;
                                this.field_xb[var14_int] = var17;
                                break L39;
                              }
                            }
                            L40: {
                              if (param2 == 0) {
                                break L40;
                              } else {
                                var15 = qu.field_b[param2];
                                var16 = qu.field_d[param2];
                                var17 = this.field_rb[var14_int] * var16 - this.field_T[var14_int] * var15 + 16383 >> 14;
                                this.field_T[var14_int] = this.field_rb[var14_int] * var15 + this.field_T[var14_int] * var16 + 16383 >> 14;
                                this.field_rb[var14_int] = var17;
                                break L40;
                              }
                            }
                            L41: {
                              if (param3 == 0) {
                                break L41;
                              } else {
                                var15 = qu.field_b[param3];
                                var16 = qu.field_d[param3];
                                var17 = this.field_T[var14_int] * var15 + this.field_xb[var14_int] * var16 + 16383 >> 14;
                                this.field_T[var14_int] = this.field_T[var14_int] * var16 - this.field_xb[var14_int] * var15 + 16383 >> 14;
                                this.field_xb[var14_int] = var17;
                                break L41;
                              }
                            }
                            this.field_xb[var14_int] = this.field_xb[var14_int] + this.field_gb;
                            this.field_rb[var14_int] = this.field_rb[var14_int] + this.field_H;
                            this.field_T[var14_int] = this.field_T[var14_int] + this.field_Y;
                            var13++;
                            continue L37;
                          } else {
                            var10++;
                            continue L36;
                          }
                        }
                      } else {
                        var10++;
                        continue L36;
                      }
                    }
                  }
                } else {
                  L42: {
                    if (this.field_S) {
                      break L42;
                    } else {
                      var10 = 0;
                      L43: while (true) {
                        if (var10 >= this.field_p) {
                          this.field_S = true;
                          break L42;
                        } else {
                          this.field_xb[var10] = this.field_xb[var10] << 4;
                          this.field_rb[var10] = this.field_rb[var10] << 4;
                          this.field_T[var10] = this.field_T[var10] << 4;
                          var10++;
                          continue L43;
                        }
                      }
                    }
                  }
                  L44: {
                    var10 = param7[9] << 4;
                    var11 = param7[10] << 4;
                    var12 = param7[11] << 4;
                    var13 = param7[12] << 4;
                    var14_int = param7[13] << 4;
                    var15 = param7[14] << 4;
                    if (!this.field_A) {
                      break L44;
                    } else {
                      var16 = param7[0] * this.field_gb + param7[3] * this.field_H + param7[6] * this.field_Y + 8192 >> 14;
                      var17 = param7[1] * this.field_gb + param7[4] * this.field_H + param7[7] * this.field_Y + 8192 >> 14;
                      var18 = param7[2] * this.field_gb + param7[5] * this.field_H + param7[8] * this.field_Y + 8192 >> 14;
                      var16 = var16 + var13;
                      var17 = var17 + var14_int;
                      var18 = var18 + var15;
                      this.field_gb = var16;
                      this.field_H = var17;
                      this.field_Y = var18;
                      this.field_A = false;
                      break L44;
                    }
                  }
                  var71 = new int[9];
                  var50 = var71;
                  var16_ref_int__ = var50;
                  var17 = qu.field_d[param2];
                  var18 = qu.field_b[param2];
                  var19 = qu.field_d[param3];
                  var20 = qu.field_b[param3];
                  var21 = qu.field_d[param4];
                  var22 = qu.field_b[param4];
                  var23 = var18 * var21 + 8192 >> 14;
                  var24 = var18 * var22 + 8192 >> 14;
                  var16_ref_int__[0] = var19 * var21 + var20 * var24 + 8192 >> 14;
                  var16_ref_int__[1] = -var19 * var22 + var20 * var23 + 8192 >> 14;
                  var16_ref_int__[2] = var20 * var17 + 8192 >> 14;
                  var16_ref_int__[3] = var17 * var22 + 8192 >> 14;
                  var16_ref_int__[4] = var17 * var21 + 8192 >> 14;
                  var16_ref_int__[5] = -var18;
                  var16_ref_int__[6] = -var20 * var21 + var19 * var24 + 8192 >> 14;
                  var16_ref_int__[7] = var20 * var22 + var19 * var23 + 8192 >> 14;
                  var16_ref_int__[8] = var19 * var17 + 8192 >> 14;
                  var25_int = var71[0] * -this.field_gb + var71[1] * -this.field_H + var71[2] * -this.field_Y + 8192 >> 14;
                  var26 = var71[3] * -this.field_gb + var71[4] * -this.field_H + var71[5] * -this.field_Y + 8192 >> 14;
                  var27 = var71[6] * -this.field_gb + var71[7] * -this.field_H + var71[8] * -this.field_Y + 8192 >> 14;
                  var28 = var25_int + this.field_gb;
                  var29_int = var26 + this.field_H;
                  var30 = var27 + this.field_Y;
                  var31_ref_int__ = new int[9];
                  var32 = 0;
                  L45: while (true) {
                    if (var32 >= 3) {
                      var32 = var71[0] * var13 + var71[1] * var14_int + var71[2] * var15 + 8192 >> 14;
                      var33 = var71[3] * var13 + var71[4] * var14_int + var71[5] * var15 + 8192 >> 14;
                      var34 = var71[6] * var13 + var71[7] * var14_int + var71[8] * var15 + 8192 >> 14;
                      var32 = var32 + var28;
                      var33 = var33 + var29_int;
                      var34 = var34 + var30;
                      var73 = new int[9];
                      var52 = var73;
                      var47 = var52;
                      var35 = var47;
                      var36 = 0;
                      L46: while (true) {
                        if (var36 >= 3) {
                          var36 = param7[0] * var32 + param7[1] * var33 + param7[2] * var34 + 8192 >> 14;
                          var37 = param7[3] * var32 + param7[4] * var33 + param7[5] * var34 + 8192 >> 14;
                          var38 = param7[6] * var32 + param7[7] * var33 + param7[8] * var34 + 8192 >> 14;
                          var36 = var36 + var10;
                          var37 = var37 + var11;
                          var38 = var38 + var12;
                          var39 = 0;
                          L47: while (true) {
                            if (var39 >= var9) {
                              break L35;
                            } else {
                              var40 = param1[var39];
                              if (var40 < this.field_sb.length) {
                                var96 = this.field_sb[var40];
                                var42 = 0;
                                L48: while (true) {
                                  if (var42 < var96.length) {
                                    L49: {
                                      var43 = var96[var42];
                                      if (this.field_Eb == null) {
                                        break L49;
                                      } else {
                                        if ((param6 & this.field_Eb[var43]) != 0) {
                                          break L49;
                                        } else {
                                          var42++;
                                          continue L48;
                                        }
                                      }
                                    }
                                    var44 = var73[0] * this.field_xb[var43] + var73[1] * this.field_rb[var43] + var73[2] * this.field_T[var43] + 8192 >> 14;
                                    var45 = var73[3] * this.field_xb[var43] + var73[4] * this.field_rb[var43] + var73[5] * this.field_T[var43] + 8192 >> 14;
                                    var46 = var73[6] * this.field_xb[var43] + var73[7] * this.field_rb[var43] + var73[8] * this.field_T[var43] + 8192 >> 14;
                                    var44 = var44 + var36;
                                    var45 = var45 + var37;
                                    var46 = var46 + var38;
                                    this.field_xb[var43] = var44;
                                    this.field_rb[var43] = var45;
                                    this.field_T[var43] = var46;
                                    var42++;
                                    continue L48;
                                  } else {
                                    var39++;
                                    continue L47;
                                  }
                                }
                              } else {
                                var39++;
                                continue L47;
                              }
                            }
                          }
                        } else {
                          var37 = 0;
                          L50: while (true) {
                            if (var37 >= 3) {
                              var36++;
                              continue L46;
                            } else {
                              var38 = 0;
                              var39 = 0;
                              L51: while (true) {
                                if (var39 >= 3) {
                                  var35[var36 * 3 + var37] = var38 + 8192 >> 14;
                                  var37++;
                                  continue L50;
                                } else {
                                  var38 = var38 + param7[var36 * 3 + var39] * var31_ref_int__[var37 + var39 * 3];
                                  var39++;
                                  continue L51;
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var33 = 0;
                      L52: while (true) {
                        if (var33 >= 3) {
                          var32++;
                          continue L45;
                        } else {
                          var34 = 0;
                          var35_int = 0;
                          L53: while (true) {
                            if (var35_int >= 3) {
                              var31_ref_int__[var32 * 3 + var33] = var34 + 8192 >> 14;
                              var33++;
                              continue L52;
                            } else {
                              var34 = var34 + var16_ref_int__[var32 * 3 + var35_int] * param7[var33 * 3 + var35_int];
                              var35_int++;
                              continue L53;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              return;
            }
          } else {
            L54: {
              if (param7 == null) {
                break L54;
              } else {
                var10 = param7[0] * param2 + param7[1] * param3 + param7[2] * param4 + 8192 >> 14;
                var11 = param7[3] * param2 + param7[4] * param3 + param7[5] * param4 + 8192 >> 14;
                var12 = param7[6] * param2 + param7[7] * param3 + param7[8] * param4 + 8192 >> 14;
                param2 = var10;
                param3 = var11;
                param4 = var12;
                break L54;
              }
            }
            L55: {
              param2 = param2 << 4;
              param3 = param3 << 4;
              param4 = param4 << 4;
              if (this.field_S) {
                break L55;
              } else {
                var10 = 0;
                L56: while (true) {
                  if (var10 >= this.field_p) {
                    this.field_S = true;
                    break L55;
                  } else {
                    this.field_xb[var10] = this.field_xb[var10] << 4;
                    this.field_rb[var10] = this.field_rb[var10] << 4;
                    this.field_T[var10] = this.field_T[var10] << 4;
                    var10++;
                    continue L56;
                  }
                }
              }
            }
            var10 = 0;
            L57: while (true) {
              if (var10 >= var9) {
                return;
              } else {
                var11 = param1[var10];
                if (var11 < this.field_sb.length) {
                  var95 = this.field_sb[var11];
                  var13 = 0;
                  L58: while (true) {
                    if (var13 < var95.length) {
                      L59: {
                        var14_int = var95[var13];
                        if (this.field_Eb == null) {
                          break L59;
                        } else {
                          if ((param6 & this.field_Eb[var14_int]) != 0) {
                            break L59;
                          } else {
                            var13++;
                            continue L58;
                          }
                        }
                      }
                      this.field_xb[var14_int] = this.field_xb[var14_int] + param2;
                      this.field_rb[var14_int] = this.field_rb[var14_int] + param3;
                      this.field_T[var14_int] = this.field_T[var14_int] + param4;
                      var13++;
                      continue L58;
                    } else {
                      var10++;
                      continue L57;
                    }
                  }
                } else {
                  var10++;
                  continue L57;
                }
              }
            }
          }
        } else {
          L60: {
            param2 = param2 << 4;
            param3 = param3 << 4;
            param4 = param4 << 4;
            if (this.field_S) {
              break L60;
            } else {
              var10 = 0;
              L61: while (true) {
                if (var10 >= this.field_p) {
                  this.field_S = true;
                  break L60;
                } else {
                  this.field_xb[var10] = this.field_xb[var10] << 4;
                  this.field_rb[var10] = this.field_rb[var10] << 4;
                  this.field_T[var10] = this.field_T[var10] << 4;
                  var10++;
                  continue L61;
                }
              }
            }
          }
          var10 = 0;
          this.field_gb = 0;
          this.field_H = 0;
          this.field_Y = 0;
          var11 = 0;
          L62: while (true) {
            if (var11 >= var9) {
              L63: {
                if (var10 <= 0) {
                  this.field_gb = param2;
                  this.field_H = param3;
                  this.field_Y = param4;
                  break L63;
                } else {
                  this.field_gb = this.field_gb / var10 + param2;
                  this.field_H = this.field_H / var10 + param3;
                  this.field_Y = this.field_Y / var10 + param4;
                  this.field_A = true;
                  break L63;
                }
              }
              return;
            } else {
              var12 = param1[var11];
              if (var12 < this.field_sb.length) {
                var94 = this.field_sb[var12];
                var14_int = 0;
                L64: while (true) {
                  if (var14_int < var94.length) {
                    L65: {
                      var15 = var94[var14_int];
                      if (this.field_Eb == null) {
                        break L65;
                      } else {
                        if ((param6 & this.field_Eb[var15]) != 0) {
                          break L65;
                        } else {
                          var14_int++;
                          continue L64;
                        }
                      }
                    }
                    this.field_gb = this.field_gb + this.field_xb[var15];
                    this.field_H = this.field_H + this.field_rb[var15];
                    this.field_Y = this.field_Y + this.field_T[var15];
                    var10++;
                    var14_int++;
                    continue L64;
                  } else {
                    var11++;
                    continue L62;
                  }
                }
              } else {
                var11++;
                continue L62;
              }
            }
          }
        }
    }

    private final boolean h(int param0) {
        if (this.field_jb == null) {
            return false;
        }
        if (this.field_jb[param0] == -1) {
            return false;
        }
        return true;
    }

    private final void h() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        short stackOut_3_0 = 0;
        var5 = 0;
        L0: while (true) {
          if (var5 >= this.field_g) {
            this.field_eb = 2;
            return;
          } else {
            L1: {
              if (this.field_X == null) {
                stackOut_4_0 = -1;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = this.field_X[var5];
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            var4 = stackIn_5_0;
            if (var4 == -1) {
              var1 = this.field_ob[var5] & 65535;
              var2 = (var1 & 127) * this.field_Db >> 7;
              var1 = tg.a((byte) -117, var1 & -128 | var2);
              if (this.field_Fb[var5] != -1) {
                if (this.field_Fb[var5] != -2) {
                  var3 = this.field_t[var5] & -131072;
                  this.field_t[var5] = var3 | ds.c(-127, var1, var3 >> 17);
                  var3 = this.field_o[var5] & -131072;
                  this.field_o[var5] = var3 | ds.c(-127, var1, var3 >> 17);
                  var3 = this.field_Fb[var5] & -131072;
                  this.field_Fb[var5] = var3 | ds.c(-127, var1, var3 >> 17);
                  var5++;
                  continue L0;
                } else {
                  var5++;
                  continue L0;
                }
              } else {
                var3 = this.field_t[var5] & -131072;
                this.field_t[var5] = var3 | ds.c(-127, var1, var3 >> 17);
                var5++;
                continue L0;
              }
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    private final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          if (this.field_F.field_h) {
            L1: {
              var2 = this.field_M[param0];
              var3 = this.field_bb[param0];
              var4 = this.field_x[param0];
              var5 = 0;
              var6 = 0;
              var7 = 0;
              if (this.field_s[var2] <= this.field_F.field_L) {
                if (this.field_s[var2] <= this.field_F.field_M) {
                  break L1;
                } else {
                  var5 = (this.field_F.field_M - this.field_s[var2]) * 255 / (this.field_F.field_M - this.field_F.field_L);
                  break L1;
                }
              } else {
                var5 = 255;
                break L1;
              }
            }
            L2: {
              if (this.field_s[var3] <= this.field_F.field_L) {
                if (this.field_s[var3] <= this.field_F.field_M) {
                  break L2;
                } else {
                  var6 = (this.field_F.field_M - this.field_s[var3]) * 255 / (this.field_F.field_M - this.field_F.field_L);
                  break L2;
                }
              } else {
                var6 = 255;
                break L2;
              }
            }
            L3: {
              if (this.field_s[var4] <= this.field_F.field_L) {
                if (this.field_s[var4] <= this.field_F.field_M) {
                  break L3;
                } else {
                  var7 = (this.field_F.field_M - this.field_s[var4]) * 255 / (this.field_F.field_M - this.field_F.field_L);
                  break L3;
                }
              } else {
                var7 = 255;
                break L3;
              }
            }
            L4: {
              if (this.field_h != null) {
                this.field_w.field_b = this.field_h[param0] & 255;
                break L4;
              } else {
                this.field_w.field_b = 0;
                break L4;
              }
            }
            L5: {
              if (this.field_X == null) {
                break L5;
              } else {
                if (this.field_X[param0] != -1) {
                  L6: {
                    var8 = -16777216;
                    if (this.field_h == null) {
                      break L6;
                    } else {
                      var8 = 255 - (this.field_h[param0] & 255) << 24;
                      break L6;
                    }
                  }
                  if (this.field_Fb[param0] != -1) {
                    this.field_w.a((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var8 | this.field_t[param0] & 16777215, var8 | this.field_o[param0] & 16777215, var8 | this.field_Fb[param0] & 16777215, this.field_F.field_D, var5, var6, var7, (int) this.field_X[param0]);
                    break L0;
                  } else {
                    var9 = var8 | this.field_t[param0] & 16777215;
                    this.field_w.a((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var9, var9, var9, this.field_F.field_D, var5, var6, var7, (int) this.field_X[param0]);
                    break L0;
                  }
                } else {
                  break L5;
                }
              }
            }
            if (this.field_Fb[param0] != -1) {
              this.field_w.a((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], l.a(var5 << 24 | this.field_F.field_D, bt.field_h[this.field_t[param0] & 65535], 20048), l.a(var6 << 24 | this.field_F.field_D, bt.field_h[this.field_o[param0] & 65535], 20048), l.a(var7 << 24 | this.field_F.field_D, bt.field_h[this.field_Fb[param0] & 65535], 20048));
              break L0;
            } else {
              this.field_w.a((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], l.a(var5 << 24 | this.field_F.field_D, bt.field_h[this.field_t[param0] & 65535], 20048), l.a(var6 << 24 | this.field_F.field_D, bt.field_h[this.field_t[param0] & 65535], 20048), l.a(var7 << 24 | this.field_F.field_D, bt.field_h[this.field_t[param0] & 65535], 20048));
              break L0;
            }
          } else {
            L7: {
              var2 = this.field_M[param0];
              var3 = this.field_bb[param0];
              var4 = this.field_x[param0];
              var5 = this.field_mb[var2] - this.field_F.field_B;
              if (var5 <= 255) {
                if (var5 >= 0) {
                  break L7;
                } else {
                  var5 = 0;
                  break L7;
                }
              } else {
                var5 = 255;
                break L7;
              }
            }
            L8: {
              var6 = this.field_mb[var3] - this.field_F.field_B;
              if (var6 <= 255) {
                if (var6 >= 0) {
                  break L8;
                } else {
                  var6 = 0;
                  break L8;
                }
              } else {
                var6 = 255;
                break L8;
              }
            }
            L9: {
              var7 = this.field_mb[var4] - this.field_F.field_B;
              if (var7 <= 255) {
                if (var7 >= 0) {
                  break L9;
                } else {
                  var7 = 0;
                  break L9;
                }
              } else {
                var7 = 255;
                break L9;
              }
            }
            var8 = var5 + var6 + var7;
            if (var8 != 765) {
              if (var8 != 0) {
                L10: {
                  if (this.field_h != null) {
                    this.field_w.field_b = this.field_h[param0] & 255;
                    break L10;
                  } else {
                    this.field_w.field_b = 0;
                    break L10;
                  }
                }
                L11: {
                  if (this.field_X == null) {
                    break L11;
                  } else {
                    if (this.field_X[param0] != -1) {
                      L12: {
                        var9 = -16777216;
                        if (this.field_h == null) {
                          break L12;
                        } else {
                          var9 = 255 - (this.field_h[param0] & 255) << 24;
                          break L12;
                        }
                      }
                      if (this.field_Fb[param0] != -1) {
                        this.field_w.a((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var9 | this.field_t[param0] & 16777215, var9 | this.field_o[param0] & 16777215, var9 | this.field_Fb[param0] & 16777215, this.field_F.field_D, var5, var6, var7, (int) this.field_X[param0]);
                        break L0;
                      } else {
                        var10 = var9 | this.field_t[param0] & 16777215;
                        this.field_w.a((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var10, var10, var10, this.field_F.field_D, var5, var6, var7, (int) this.field_X[param0]);
                        break L0;
                      }
                    } else {
                      break L11;
                    }
                  }
                }
                if (this.field_Fb[param0] != -1) {
                  this.field_w.a((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], l.a(var5 << 24 | this.field_F.field_D, bt.field_h[this.field_t[param0] & 65535], 20048), l.a(var6 << 24 | this.field_F.field_D, bt.field_h[this.field_o[param0] & 65535], 20048), l.a(var7 << 24 | this.field_F.field_D, bt.field_h[this.field_Fb[param0] & 65535], 20048));
                  break L0;
                } else {
                  this.field_w.a((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], l.a(var5 << 24 | this.field_F.field_D, bt.field_h[this.field_t[param0] & 65535], 20048), l.a(var6 << 24 | this.field_F.field_D, bt.field_h[this.field_t[param0] & 65535], 20048), l.a(var7 << 24 | this.field_F.field_D, bt.field_h[this.field_t[param0] & 65535], 20048));
                  break L0;
                }
              } else {
                this.j(param0);
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    private final void e(int param0) {
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int var2 = 0;
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
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        L0: {
          var2 = 0;
          var3 = this.field_d.field_g;
          var4 = this.field_M[param0];
          var5 = this.field_bb[param0];
          var6 = this.field_x[param0];
          var7 = this.field_Ab[var4];
          var8 = this.field_Ab[var5];
          var9 = this.field_Ab[var6];
          if (this.field_h != null) {
            this.field_w.field_b = this.field_h[param0] & 255;
            break L0;
          } else {
            this.field_w.field_b = 0;
            break L0;
          }
        }
        L1: {
          if (var7 < var3) {
            L2: {
              var10 = this.field_nb[var4];
              var11 = this.field_C[var4];
              var12 = this.field_t[param0] & 65535;
              if (var9 < var3) {
                break L2;
              } else {
                var13 = (var3 - var7) * (65536 / (var9 - var7));
                this.field_y[var2] = this.field_F.field_o + (var10 + ((this.field_nb[var6] - var10) * var13 >> 16)) * this.field_d.field_Q / var3;
                this.field_E[var2] = this.field_F.field_H + (var11 + ((this.field_C[var6] - var11) * var13 >> 16)) * this.field_d.field_C / var3;
                this.field_yb[var2] = var3;
                incrementValue$9 = var2;
                var2++;
                this.field_hb[incrementValue$9] = var12 + (((this.field_Fb[param0] & 65535) - var12) * var13 >> 16);
                break L2;
              }
            }
            if (var8 < var3) {
              break L1;
            } else {
              var13 = (var3 - var7) * (65536 / (var8 - var7));
              this.field_y[var2] = this.field_F.field_o + (var10 + ((this.field_nb[var5] - var10) * var13 >> 16)) * this.field_d.field_Q / var3;
              this.field_E[var2] = this.field_F.field_H + (var11 + ((this.field_C[var5] - var11) * var13 >> 16)) * this.field_d.field_C / var3;
              this.field_yb[var2] = var3;
              incrementValue$10 = var2;
              var2++;
              this.field_hb[incrementValue$10] = var12 + (((this.field_o[param0] & 65535) - var12) * var13 >> 16);
              break L1;
            }
          } else {
            this.field_y[var2] = this.field_v[var4];
            this.field_E[var2] = this.field_J[var4];
            this.field_yb[var2] = this.field_mb[var4];
            incrementValue$11 = var2;
            var2++;
            this.field_hb[incrementValue$11] = this.field_t[param0] & 65535;
            break L1;
          }
        }
        L3: {
          if (var8 < var3) {
            L4: {
              var10 = this.field_nb[var5];
              var11 = this.field_C[var5];
              var12 = this.field_o[param0] & 65535;
              if (var7 < var3) {
                break L4;
              } else {
                var13 = (var3 - var8) * (65536 / (var7 - var8));
                this.field_y[var2] = this.field_F.field_o + (var10 + ((this.field_nb[var4] - var10) * var13 >> 16)) * this.field_d.field_Q / var3;
                this.field_E[var2] = this.field_F.field_H + (var11 + ((this.field_C[var4] - var11) * var13 >> 16)) * this.field_d.field_C / var3;
                this.field_yb[var2] = var3;
                incrementValue$12 = var2;
                var2++;
                this.field_hb[incrementValue$12] = var12 + (((this.field_t[param0] & 65535) - var12) * var13 >> 16);
                break L4;
              }
            }
            if (var9 < var3) {
              break L3;
            } else {
              var13 = (var3 - var8) * (65536 / (var9 - var8));
              this.field_y[var2] = this.field_F.field_o + (var10 + ((this.field_nb[var6] - var10) * var13 >> 16)) * this.field_d.field_Q / var3;
              this.field_E[var2] = this.field_F.field_H + (var11 + ((this.field_C[var6] - var11) * var13 >> 16)) * this.field_d.field_C / var3;
              this.field_yb[var2] = var3;
              incrementValue$13 = var2;
              var2++;
              this.field_hb[incrementValue$13] = var12 + (((this.field_Fb[param0] & 65535) - var12) * var13 >> 16);
              break L3;
            }
          } else {
            this.field_y[var2] = this.field_v[var5];
            this.field_E[var2] = this.field_J[var5];
            this.field_yb[var2] = this.field_mb[var5];
            incrementValue$14 = var2;
            var2++;
            this.field_hb[incrementValue$14] = this.field_o[param0] & 65535;
            break L3;
          }
        }
        L5: {
          if (var9 < var3) {
            L6: {
              var10 = this.field_nb[var6];
              var11 = this.field_C[var6];
              var12 = this.field_Fb[param0] & 65535;
              if (var8 < var3) {
                break L6;
              } else {
                var13 = (var3 - var9) * (65536 / (var8 - var9));
                this.field_y[var2] = this.field_F.field_o + (var10 + ((this.field_nb[var5] - var10) * var13 >> 16)) * this.field_d.field_Q / var3;
                this.field_E[var2] = this.field_F.field_H + (var11 + ((this.field_C[var5] - var11) * var13 >> 16)) * this.field_d.field_C / var3;
                this.field_yb[var2] = var3;
                incrementValue$15 = var2;
                var2++;
                this.field_hb[incrementValue$15] = var12 + (((this.field_o[param0] & 65535) - var12) * var13 >> 16);
                break L6;
              }
            }
            if (var7 < var3) {
              break L5;
            } else {
              var13 = (var3 - var9) * (65536 / (var7 - var9));
              this.field_y[var2] = this.field_F.field_o + (var10 + ((this.field_nb[var4] - var10) * var13 >> 16)) * this.field_d.field_Q / var3;
              this.field_E[var2] = this.field_F.field_H + (var11 + ((this.field_C[var4] - var11) * var13 >> 16)) * this.field_d.field_C / var3;
              this.field_yb[var2] = var3;
              incrementValue$16 = var2;
              var2++;
              this.field_hb[incrementValue$16] = var12 + (((this.field_t[param0] & 65535) - var12) * var13 >> 16);
              break L5;
            }
          } else {
            this.field_y[var2] = this.field_v[var6];
            this.field_E[var2] = this.field_J[var6];
            this.field_yb[var2] = this.field_mb[var6];
            incrementValue$17 = var2;
            var2++;
            this.field_hb[incrementValue$17] = this.field_Fb[param0] & 65535;
            break L5;
          }
        }
        L7: {
          var10 = this.field_y[0];
          var11 = this.field_y[1];
          var12 = this.field_y[2];
          var13 = this.field_E[0];
          var14 = this.field_E[1];
          var15 = this.field_E[2];
          var7 = this.field_yb[0];
          var8 = this.field_yb[1];
          var9 = this.field_yb[2];
          this.field_w.field_q = false;
          if (var2 != 3) {
            break L7;
          } else {
            L8: {
              L9: {
                if (var10 < 0) {
                  break L9;
                } else {
                  if (var11 < 0) {
                    break L9;
                  } else {
                    if (var12 < 0) {
                      break L9;
                    } else {
                      if (var10 > this.field_F.field_y) {
                        break L9;
                      } else {
                        if (var11 > this.field_F.field_y) {
                          break L9;
                        } else {
                          if (var12 <= this.field_F.field_y) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                  }
                }
              }
              this.field_w.field_q = true;
              break L8;
            }
            L10: {
              if (this.field_X == null) {
                break L10;
              } else {
                if (this.field_X[param0] != -1) {
                  L11: {
                    var16 = -16777216;
                    if (this.field_h == null) {
                      break L11;
                    } else {
                      var16 = 255 - (this.field_h[param0] & 255) << 24;
                      break L11;
                    }
                  }
                  var17 = var16 | this.field_t[param0] & 16777215;
                  if (this.field_Fb[param0] != -1) {
                    this.field_w.b((float)var13, (float)var14, (float)var15, (float)var10, (float)var11, (float)var12, (float)var7, (float)var8, (float)var9, this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var17, var17, var17, this.field_F.field_D, 0, 0, 0, (int) this.field_X[param0]);
                    break L7;
                  } else {
                    this.field_w.b((float)var13, (float)var14, (float)var15, (float)var10, (float)var11, (float)var12, (float)var7, (float)var8, (float)var9, this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var17, var17, var17, this.field_F.field_D, 0, 0, 0, (int) this.field_X[param0]);
                    break L7;
                  }
                } else {
                  break L10;
                }
              }
            }
            if (this.field_Fb[param0] != -1) {
              this.field_w.b((float)var13, (float)var14, (float)var15, (float)var10, (float)var11, (float)var12, (float)var7, (float)var8, (float)var9, (float)this.field_hb[0], (float)this.field_hb[1], (float)this.field_hb[2]);
              break L7;
            } else {
              this.field_w.a((float)var13, (float)var14, (float)var15, (float)var10, (float)var11, (float)var12, (float)var7, (float)var8, (float)var9, bt.field_h[this.field_t[param0] & 65535]);
              break L7;
            }
          }
        }
        L12: {
          if (var2 != 4) {
            break L12;
          } else {
            L13: {
              L14: {
                if (var10 < 0) {
                  break L14;
                } else {
                  if (var11 < 0) {
                    break L14;
                  } else {
                    if (var12 < 0) {
                      break L14;
                    } else {
                      if (var10 > this.field_F.field_y) {
                        break L14;
                      } else {
                        if (var11 > this.field_F.field_y) {
                          break L14;
                        } else {
                          if (var12 > this.field_F.field_y) {
                            break L14;
                          } else {
                            if (this.field_y[3] < 0) {
                              break L14;
                            } else {
                              if (this.field_y[3] <= this.field_F.field_y) {
                                break L13;
                              } else {
                                break L14;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              this.field_w.field_q = true;
              break L13;
            }
            L15: {
              if (this.field_X == null) {
                break L15;
              } else {
                if (this.field_X[param0] != -1) {
                  L16: {
                    var16 = -16777216;
                    if (this.field_h == null) {
                      break L16;
                    } else {
                      var16 = 255 - (this.field_h[param0] & 255) << 24;
                      break L16;
                    }
                  }
                  var17 = var16 | this.field_t[param0] & 16777215;
                  if (this.field_Fb[param0] != -1) {
                    this.field_w.b((float)var13, (float)var14, (float)var15, (float)var10, (float)var11, (float)var12, (float)var7, (float)var8, (float)var9, this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var17, var17, var17, this.field_F.field_D, 0, 0, 0, (int) this.field_X[param0]);
                    this.field_w.b((float)var13, (float)var15, (float)this.field_E[3], (float)var10, (float)var12, (float)this.field_y[3], (float)var7, (float)var9, (float)this.field_yb[3], this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var17, var17, var17, this.field_F.field_D, 0, 0, 0, (int) this.field_X[param0]);
                    break L12;
                  } else {
                    this.field_w.b((float)var13, (float)var14, (float)var15, (float)var10, (float)var11, (float)var12, (float)var7, (float)var8, (float)var9, this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var17, var17, var17, this.field_F.field_D, 0, 0, 0, (int) this.field_X[param0]);
                    this.field_w.b((float)var13, (float)var15, (float)this.field_E[3], (float)var10, (float)var12, (float)this.field_y[3], (float)var7, (float)var9, (float)this.field_yb[3], this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var17, var17, var17, this.field_F.field_D, 0, 0, 0, (int) this.field_X[param0]);
                    break L12;
                  }
                } else {
                  break L15;
                }
              }
            }
            if (this.field_Fb[param0] != -1) {
              this.field_w.b((float)var13, (float)var14, (float)var15, (float)var10, (float)var11, (float)var12, (float)var7, (float)var8, (float)var9, (float)this.field_hb[0], (float)this.field_hb[1], (float)this.field_hb[2]);
              this.field_w.b((float)var13, (float)var15, (float)this.field_E[3], (float)var10, (float)var12, (float)this.field_y[3], (float)var7, (float)var8, (float)this.field_yb[3], (float)this.field_hb[0], (float)this.field_hb[2], (float)this.field_hb[3]);
              break L12;
            } else {
              var16 = bt.field_h[this.field_t[param0] & 65535];
              this.field_w.a((float)var13, (float)var14, (float)var15, (float)var10, (float)var11, (float)var12, (float)var7, (float)var8, (float)var9, var16);
              this.field_w.a((float)var13, (float)var15, (float)this.field_E[3], (float)var10, (float)var12, (float)this.field_y[3], (float)var7, (float)var8, (float)this.field_yb[3], var16);
              break L12;
            }
          }
        }
    }

    private final int a(int param0, int param1) {
        param1 = param1 * (param0 & 127) >> 7;
        if (param1 < 2) {
            param1 = 2;
        } else {
            if (param1 > 126) {
                param1 = 126;
            }
        }
        return (param0 & 65408) + param1;
    }

    private final void f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var2 = this.field_M[param0];
            var3 = this.field_bb[param0];
            var4 = this.field_x[param0];
            if (this.field_X == null) {
              break L1;
            } else {
              if (this.field_X[param0] != -1) {
                L2: {
                  var5 = -16777216;
                  if (this.field_h == null) {
                    break L2;
                  } else {
                    var5 = 255 - (this.field_h[param0] & 255) << 24;
                    break L2;
                  }
                }
                if (this.field_Fb[param0] != -1) {
                  this.field_w.b((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var5 | this.field_t[param0] & 16777215, var5 | this.field_o[param0] & 16777215, var5 | this.field_Fb[param0] & 16777215, this.field_F.field_D, 0, 0, 0, (int) this.field_X[param0]);
                  break L0;
                } else {
                  var6 = var5 | this.field_t[param0] & 16777215;
                  this.field_w.b((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], this.field_W[param0][0], this.field_W[param0][1], this.field_W[param0][2], this.field_l[param0][0], this.field_l[param0][1], this.field_l[param0][2], var6, var6, var6, this.field_F.field_D, 0, 0, 0, (int) this.field_X[param0]);
                  break L0;
                }
              } else {
                break L1;
              }
            }
          }
          L3: {
            if (this.field_h != null) {
              this.field_w.field_b = this.field_h[param0] & 255;
              break L3;
            } else {
              this.field_w.field_b = 0;
              break L3;
            }
          }
          if (this.field_Fb[param0] != -1) {
            this.field_w.b((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], (float)(this.field_t[param0] & 65535), (float)(this.field_o[param0] & 65535), (float)(this.field_Fb[param0] & 65535));
            break L0;
          } else {
            this.field_w.a((float)this.field_J[var2], (float)this.field_J[var3], (float)this.field_J[var4], (float)this.field_v[var2], (float)this.field_v[var3], (float)this.field_v[var4], (float)this.field_mb[var2], (float)this.field_mb[var3], (float)this.field_mb[var4], bt.field_h[this.field_t[param0] & 65535]);
            break L0;
          }
        }
    }

    final void FA(int param0) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        int var5 = 0;
        int var6 = 0;
        Throwable var7 = null;
        Throwable decompiledCaughtException = null;
        if ((this.field_P & 6) == 6) {
          var2 = qu.field_b[param0];
          var3 = qu.field_d[param0];
          var4 = this;
          synchronized (var4) {
            L0: {
              var5 = 0;
              L1: while (true) {
                if (var5 >= this.field_p) {
                  this.f();
                  break L0;
                } else {
                  var6 = this.field_rb[var5] * var3 - this.field_T[var5] * var2 >> 14;
                  this.field_T[var5] = this.field_rb[var5] * var2 + this.field_T[var5] * var3 >> 14;
                  this.field_rb[var5] = var6;
                  var5++;
                  continue L1;
                }
              }
            }
          }
          return;
        } else {
          throw new IllegalStateException();
        }
    }

    final boolean NA() {
        if (this.field_sb == null) {
            return false;
        }
        this.field_gb = 0;
        this.field_H = 0;
        this.field_Y = 0;
        return true;
    }

    private final void b(gda param0, el param1, int param2, int param3) {
        try {
            pna var5 = null;
            int var6 = 0;
            float var7 = 0.0f;
            float var8 = 0.0f;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            int var12 = 0;
            float var13 = 0.0f;
            float var14 = 0.0f;
            int var15 = 0;
            int var16 = 0;
            int var17 = 0;
            int var18 = 0;
            float var19 = 0.0f;
            float var20 = 0.0f;
            int var21 = 0;
            int var22 = 0;
            int var23 = 0;
            int var24 = 0;
            float var25 = 0.0f;
            float var26 = 0.0f;
            float var27 = 0.0f;
            float var28 = 0.0f;
            float var29 = 0.0f;
            float var30 = 0.0f;
            Object var31_ref = null;
            int var31 = 0;
            Object var31_ref_Object = null;
            InterruptedException var32_ref_InterruptedException = null;
            int var32 = 0;
            Throwable var33_ref_Throwable = null;
            int var33 = 0;
            float var34 = 0.0f;
            float var35 = 0.0f;
            float var36 = 0.0f;
            int var37 = 0;
            int var38 = 0;
            int var39 = 0;
            int var40 = 0;
            int var41 = 0;
            int var42 = 0;
            Exception var43 = null;
            int var43_int = 0;
            Object var43_ref = null;
            int var44 = 0;
            int var45 = 0;
            int var46 = 0;
            int var47_int = 0;
            float var47 = 0.0f;
            int var48 = 0;
            nsa var49 = null;
            Throwable var50 = null;
            hna var51 = null;
            hna var52 = null;
            nsa var53 = null;
            hna var54 = null;
            hna var55 = null;
            nsa var56 = null;
            float stackIn_17_0 = 0.0f;
            float stackIn_27_0 = 0.0f;
            float stackIn_42_0 = 0.0f;
            int stackIn_73_0 = 0;
            int stackIn_81_0 = 0;
            iua stackIn_136_0 = null;
            iua stackIn_137_0 = null;
            iua stackIn_138_0 = null;
            int stackIn_138_1 = 0;
            int stackIn_142_0 = 0;
            Object stackIn_144_0 = null;
            int stackIn_144_1 = 0;
            Object stackIn_145_0 = null;
            int stackIn_145_1 = 0;
            Object stackIn_146_0 = null;
            int stackIn_146_1 = 0;
            Object stackIn_147_0 = null;
            int stackIn_147_1 = 0;
            Object stackIn_148_0 = null;
            int stackIn_148_1 = 0;
            Object stackIn_149_0 = null;
            int stackIn_149_1 = 0;
            Object stackIn_150_0 = null;
            int stackIn_150_1 = 0;
            int stackIn_150_2 = 0;
            Object stackIn_152_0 = null;
            int stackIn_152_1 = 0;
            Object stackIn_153_0 = null;
            int stackIn_153_1 = 0;
            Object stackIn_154_0 = null;
            int stackIn_154_1 = 0;
            Object stackIn_155_0 = null;
            int stackIn_155_1 = 0;
            Object stackIn_156_0 = null;
            int stackIn_156_1 = 0;
            Object stackIn_157_0 = null;
            int stackIn_157_1 = 0;
            Object stackIn_158_0 = null;
            int stackIn_158_1 = 0;
            int stackIn_158_2 = 0;
            Throwable caughtException = null;
            Throwable decompiledCaughtException = null;
            float stackOut_16_0 = 0.0f;
            float stackOut_15_0 = 0.0f;
            float stackOut_26_0 = 0.0f;
            float stackOut_25_0 = 0.0f;
            float stackOut_41_0 = 0.0f;
            float stackOut_40_0 = 0.0f;
            int stackOut_72_0 = 0;
            int stackOut_71_0 = 0;
            int stackOut_79_0 = 0;
            int stackOut_78_0 = 0;
            int stackOut_76_0 = 0;
            int stackOut_74_0 = 0;
            iua stackOut_135_0 = null;
            iua stackOut_137_0 = null;
            int stackOut_137_1 = 0;
            iua stackOut_136_0 = null;
            int stackOut_136_1 = 0;
            int stackOut_141_0 = 0;
            int stackOut_140_0 = 0;
            Object stackOut_151_0 = null;
            int stackOut_151_1 = 0;
            Object stackOut_152_0 = null;
            int stackOut_152_1 = 0;
            Object stackOut_153_0 = null;
            int stackOut_153_1 = 0;
            Object stackOut_154_0 = null;
            int stackOut_154_1 = 0;
            Object stackOut_157_0 = null;
            int stackOut_157_1 = 0;
            int stackOut_157_2 = 0;
            Object stackOut_155_0 = null;
            int stackOut_155_1 = 0;
            Object stackOut_156_0 = null;
            int stackOut_156_1 = 0;
            int stackOut_156_2 = 0;
            Object stackOut_143_0 = null;
            int stackOut_143_1 = 0;
            Object stackOut_144_0 = null;
            int stackOut_144_1 = 0;
            Object stackOut_145_0 = null;
            int stackOut_145_1 = 0;
            Object stackOut_146_0 = null;
            int stackOut_146_1 = 0;
            Object stackOut_149_0 = null;
            int stackOut_149_1 = 0;
            int stackOut_149_2 = 0;
            Object stackOut_147_0 = null;
            int stackOut_147_1 = 0;
            Object stackOut_148_0 = null;
            int stackOut_148_1 = 0;
            int stackOut_148_2 = 0;
            if (this.field_Z >= 1) {
              L0: {
                this.field_B = (pna) ((Object) param0);
                var5 = this.field_d.field_A;
                if (this.field_r) {
                  break L0;
                } else {
                  this.d();
                  break L0;
                }
              }
              L1: {
                var6 = 0;
                if (this.field_B.field_g != 16384.0f) {
                  break L1;
                } else {
                  if (this.field_B.field_i != 0.0f) {
                    break L1;
                  } else {
                    if (this.field_B.field_n != 0.0f) {
                      break L1;
                    } else {
                      if (this.field_B.field_h != 0.0f) {
                        break L1;
                      } else {
                        if (this.field_B.field_s != 16384.0f) {
                          break L1;
                        } else {
                          if (this.field_B.field_j != 0.0f) {
                            break L1;
                          } else {
                            if (this.field_B.field_r != 0.0f) {
                              break L1;
                            } else {
                              if (this.field_B.field_o != 0.0f) {
                                break L1;
                              } else {
                                if (this.field_B.field_f != 16384.0f) {
                                  break L1;
                                } else {
                                  var6 = 1;
                                  break L1;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              L2: {
                var7 = var5.field_m + var5.field_r * this.field_B.field_l + var5.field_o * this.field_B.field_e + var5.field_f * this.field_B.field_m;
                if (var6 == 0) {
                  stackOut_16_0 = var5.field_r * this.field_B.field_i + var5.field_o * this.field_B.field_s + var5.field_f * this.field_B.field_o;
                  stackIn_17_0 = stackOut_16_0;
                  break L2;
                } else {
                  stackOut_15_0 = var5.field_o;
                  stackIn_17_0 = stackOut_15_0;
                  break L2;
                }
              }
              L3: {
                var8 = stackIn_17_0;
                var9 = (int)(var7 + (float)this.field_f * var8);
                var10 = (int)(var7 + (float)this.field_cb * var8);
                if (var9 <= var10) {
                  var11 = var9 - this.field_U;
                  var12 = var10 + this.field_U;
                  break L3;
                } else {
                  var11 = var10 - this.field_U;
                  var12 = var9 + this.field_U;
                  break L3;
                }
              }
              if (var11 < this.field_d.field_U) {
                if (var12 > this.field_d.field_g) {
                  L4: {
                    var13 = var5.field_l + var5.field_g * this.field_B.field_l + var5.field_i * this.field_B.field_e + var5.field_n * this.field_B.field_m;
                    if (var6 == 0) {
                      stackOut_26_0 = var5.field_g * this.field_B.field_i + var5.field_i * this.field_B.field_s + var5.field_n * this.field_B.field_o;
                      stackIn_27_0 = stackOut_26_0;
                      break L4;
                    } else {
                      stackOut_25_0 = var5.field_i;
                      stackIn_27_0 = stackOut_25_0;
                      break L4;
                    }
                  }
                  L5: {
                    var14 = stackIn_27_0;
                    var15 = (int)(var13 + (float)this.field_f * var14);
                    var16 = (int)(var13 + (float)this.field_cb * var14);
                    if (var15 <= var16) {
                      var17 = (var15 - this.field_U) * this.field_d.field_Q;
                      var18 = (var16 + this.field_U) * this.field_d.field_Q;
                      break L5;
                    } else {
                      var17 = (var16 - this.field_U) * this.field_d.field_Q;
                      var18 = (var15 + this.field_U) * this.field_d.field_Q;
                      break L5;
                    }
                  }
                  L6: {
                    if (param2 != -1) {
                      if (var17 / param2 < this.field_d.field_l) {
                        if (var18 / param2 > this.field_d.field_p) {
                          break L6;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      if (var17 / var12 < this.field_d.field_l) {
                        if (var18 / var12 > this.field_d.field_p) {
                          break L6;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                  L7: {
                    var19 = var5.field_e + var5.field_h * this.field_B.field_l + var5.field_s * this.field_B.field_e + var5.field_j * this.field_B.field_m;
                    if (var6 == 0) {
                      stackOut_41_0 = var5.field_h * this.field_B.field_i + var5.field_s * this.field_B.field_s + var5.field_j * this.field_B.field_o;
                      stackIn_42_0 = stackOut_41_0;
                      break L7;
                    } else {
                      stackOut_40_0 = var5.field_s;
                      stackIn_42_0 = stackOut_40_0;
                      break L7;
                    }
                  }
                  L8: {
                    var20 = stackIn_42_0;
                    var21 = (int)(var19 + (float)this.field_f * var20);
                    var22 = (int)(var19 + (float)this.field_cb * var20);
                    if (var21 <= var22) {
                      var23 = (var21 - this.field_U) * this.field_d.field_C;
                      var24 = (var22 + this.field_U) * this.field_d.field_C;
                      break L8;
                    } else {
                      var23 = (var22 - this.field_U) * this.field_d.field_C;
                      var24 = (var21 + this.field_U) * this.field_d.field_C;
                      break L8;
                    }
                  }
                  L9: {
                    if (param2 != -1) {
                      if (var23 / param2 < this.field_d.field_o) {
                        if (var24 / param2 > this.field_d.field_k) {
                          break L9;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      if (var23 / var12 < this.field_d.field_o) {
                        if (var24 / var12 > this.field_d.field_k) {
                          break L9;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                  L10: {
                    if (var6 == 0) {
                      var25 = var5.field_g * this.field_B.field_g + var5.field_i * this.field_B.field_h + var5.field_n * this.field_B.field_r;
                      var26 = var5.field_h * this.field_B.field_g + var5.field_s * this.field_B.field_h + var5.field_j * this.field_B.field_r;
                      var27 = var5.field_r * this.field_B.field_g + var5.field_o * this.field_B.field_h + var5.field_f * this.field_B.field_r;
                      var28 = var5.field_g * this.field_B.field_n + var5.field_i * this.field_B.field_j + var5.field_n * this.field_B.field_f;
                      var29 = var5.field_h * this.field_B.field_n + var5.field_s * this.field_B.field_j + var5.field_j * this.field_B.field_f;
                      var30 = var5.field_r * this.field_B.field_n + var5.field_o * this.field_B.field_j + var5.field_f * this.field_B.field_f;
                      break L10;
                    } else {
                      var25 = var5.field_g;
                      var26 = var5.field_h;
                      var27 = var5.field_r;
                      var28 = var5.field_n;
                      var29 = var5.field_j;
                      var30 = var5.field_f;
                      break L10;
                    }
                  }
                  L11: {
                    if (this.field_d.field_u <= 1) {
                      break L11;
                    } else {
                      var31_ref_Object = this;
                      synchronized (var31_ref_Object) {
                        L12: {
                          L13: while (true) {
                            if (!this.field_zb) {
                              this.field_zb = true;
                              break L12;
                            } else {
                              try {
                                L14: {
                                  this.wait();
                                  break L14;
                                }
                              } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                                decompiledCaughtException = decompiledCaughtParameter0;
                                L15: {
                                  var32_ref_InterruptedException = (InterruptedException) (Object) decompiledCaughtException;
                                  break L15;
                                }
                              }
                              continue L13;
                            }
                          }
                        }
                      }
                      break L11;
                    }
                  }
                  L16: {
                    this.b(Thread.currentThread());
                    if ((param3 & 2) == 0) {
                      this.field_w.a(false);
                      break L16;
                    } else {
                      this.field_w.a(true);
                      break L16;
                    }
                  }
                  L17: {
                    var31 = 0;
                    if (var11 > this.field_d.field_g) {
                      stackOut_72_0 = 0;
                      stackIn_73_0 = stackOut_72_0;
                      break L17;
                    } else {
                      stackOut_71_0 = 1;
                      stackIn_73_0 = stackOut_71_0;
                      break L17;
                    }
                  }
                  L18: {
                    var32 = stackIn_73_0;
                    if (var32 == 0) {
                      if (this.field_i == null) {
                        if (this.field_kb != null) {
                          stackOut_79_0 = 1;
                          stackIn_81_0 = stackOut_79_0;
                          break L18;
                        } else {
                          stackOut_78_0 = 0;
                          stackIn_81_0 = stackOut_78_0;
                          break L18;
                        }
                      } else {
                        stackOut_76_0 = 1;
                        stackIn_81_0 = stackOut_76_0;
                        break L18;
                      }
                    } else {
                      stackOut_74_0 = 1;
                      stackIn_81_0 = stackOut_74_0;
                      break L18;
                    }
                  }
                  L19: {
                    var33 = stackIn_81_0;
                    this.field_F.field_y = this.field_w.field_h;
                    this.field_F.field_o = this.field_w.field_e;
                    this.field_F.field_H = this.field_w.field_n;
                    var40 = this.field_d.field_Q;
                    var41 = this.field_d.field_C;
                    var42 = this.field_d.field_g;
                    if (param2 != -1) {
                      var43_int = 0;
                      L20: while (true) {
                        if (var43_int >= this.field_p) {
                          if (this.field_e == null) {
                            break L19;
                          } else {
                            var43_int = 0;
                            L21: while (true) {
                              if (var43_int >= this.field_m) {
                                break L19;
                              } else {
                                var52 = this.field_e[var43_int];
                                var55 = var52;
                                var56 = this.field_db[var43_int];
                                var46 = this.field_M[var52.field_j];
                                var47_int = this.field_bb[var52.field_j];
                                var48 = this.field_x[var52.field_j];
                                var37 = (this.field_xb[var46] + this.field_xb[var47_int] + this.field_xb[var48]) / 3;
                                var38 = (this.field_rb[var46] + this.field_rb[var47_int] + this.field_rb[var48]) / 3;
                                var39 = (this.field_T[var46] + this.field_T[var47_int] + this.field_T[var48]) / 3;
                                var34 = var13 + var25 * (float)var37 + var14 * (float)var38 + var28 * (float)var39;
                                var35 = var19 + var26 * (float)var37 + var20 * (float)var38 + var29 * (float)var39;
                                var36 = var7 + var27 * (float)var37 + var8 * (float)var38 + var30 * (float)var39;
                                var56.field_e = this.field_d.field_L + (int)(var34 * (float)var40 / (float)param2);
                                var56.field_h = this.field_d.field_w + (int)(var35 * (float)var41 / (float)param2);
                                var56.field_n = param2 - var55.field_f;
                                var56.field_l = var56.field_m * var55.field_i * var40 / (param2 << 7);
                                var56.field_c = var56.field_g * var55.field_b * var41 / (param2 << 7);
                                var43_int++;
                                continue L21;
                              }
                            }
                          }
                        } else {
                          L22: {
                            var37 = this.field_xb[var43_int];
                            var38 = this.field_rb[var43_int];
                            var39 = this.field_T[var43_int];
                            var34 = var13 + var25 * (float)var37 + var14 * (float)var38 + var28 * (float)var39;
                            var35 = var19 + var26 * (float)var37 + var20 * (float)var38 + var29 * (float)var39;
                            var36 = var7 + var27 * (float)var37 + var8 * (float)var38 + var30 * (float)var39;
                            this.field_mb[var43_int] = (int)var36;
                            this.field_v[var43_int] = this.field_F.field_o + (int)(var34 * (float)var40 / (float)param2);
                            this.field_J[var43_int] = this.field_F.field_H + (int)(var35 * (float)var41 / (float)param2);
                            if (var33 == 0) {
                              break L22;
                            } else {
                              this.field_nb[var43_int] = (int)var34;
                              this.field_C[var43_int] = (int)var35;
                              this.field_Ab[var43_int] = param2;
                              break L22;
                            }
                          }
                          if (this.field_F.field_h) {
                            this.field_s[var43_int] = (int)(this.field_B.field_e + (this.field_B.field_h * (float)var37 + this.field_B.field_s * (float)var38 + this.field_B.field_j * (float)var39));
                            var43_int++;
                            continue L20;
                          } else {
                            var43_int++;
                            continue L20;
                          }
                        }
                      }
                    } else {
                      var43_int = 0;
                      L23: while (true) {
                        if (var43_int >= this.field_p) {
                          if (this.field_e == null) {
                            break L19;
                          } else {
                            var43_int = 0;
                            L24: while (true) {
                              if (var43_int >= this.field_m) {
                                break L19;
                              } else {
                                var51 = this.field_e[var43_int];
                                var54 = var51;
                                var53 = this.field_db[var43_int];
                                var46 = this.field_M[var51.field_j];
                                var47_int = this.field_bb[var51.field_j];
                                var48 = this.field_x[var51.field_j];
                                var37 = (this.field_xb[var46] + this.field_xb[var47_int] + this.field_xb[var48]) / 3;
                                var38 = (this.field_rb[var46] + this.field_rb[var47_int] + this.field_rb[var48]) / 3;
                                var39 = (this.field_T[var46] + this.field_T[var47_int] + this.field_T[var48]) / 3;
                                var34 = (float)var53.field_b + (var13 + var25 * (float)var37 + var14 * (float)var38 + var28 * (float)var39);
                                var35 = (float)var53.field_a + (var19 + var26 * (float)var37 + var20 * (float)var38 + var29 * (float)var39);
                                var36 = var7 + var27 * (float)var37 + var8 * (float)var38 + var30 * (float)var39;
                                if (var36 <= (float)this.field_d.field_g) {
                                  var49 = var53;
                                  var53.field_c = 0;
                                  var49.field_l = 0;
                                  var43_int++;
                                  continue L24;
                                } else {
                                  var53.field_e = this.field_d.field_L + (int)(var34 * (float)var40 / var36);
                                  var53.field_h = this.field_d.field_w + (int)(var35 * (float)var41 / var36);
                                  var53.field_n = (int)var36 - var54.field_f;
                                  var53.field_l = (int)((float)(var53.field_m * var54.field_i * var40) / (var36 * 128.0f));
                                  var53.field_c = (int)((float)(var53.field_g * var54.field_b * var41) / (var36 * 128.0f));
                                  var43_int++;
                                  continue L24;
                                }
                              }
                            }
                          }
                        } else {
                          L25: {
                            var37 = this.field_xb[var43_int];
                            var38 = this.field_rb[var43_int];
                            var39 = this.field_T[var43_int];
                            var34 = var13 + var25 * (float)var37 + var14 * (float)var38 + var28 * (float)var39;
                            var35 = var19 + var26 * (float)var37 + var20 * (float)var38 + var29 * (float)var39;
                            var36 = var7 + var27 * (float)var37 + var8 * (float)var38 + var30 * (float)var39;
                            this.field_mb[var43_int] = (int)var36;
                            if (var36 < (float)var42) {
                              this.field_v[var43_int] = -5000;
                              var31 = 1;
                              break L25;
                            } else {
                              this.field_v[var43_int] = this.field_F.field_o + (int)(var34 * (float)var40 / var36);
                              this.field_J[var43_int] = this.field_F.field_H + (int)(var35 * (float)var41 / var36);
                              break L25;
                            }
                          }
                          L26: {
                            if (var33 == 0) {
                              break L26;
                            } else {
                              this.field_nb[var43_int] = (int)var34;
                              this.field_C[var43_int] = (int)var35;
                              this.field_Ab[var43_int] = (int)var36;
                              break L26;
                            }
                          }
                          if (this.field_F.field_h) {
                            this.field_s[var43_int] = (int)(this.field_B.field_e + (this.field_B.field_h * (float)var37 + this.field_B.field_s * (float)var38 + this.field_B.field_j * (float)var39));
                            var43_int++;
                            continue L23;
                          } else {
                            var43_int++;
                            continue L23;
                          }
                        }
                      }
                    }
                  }
                  L27: {
                    if (param1 == null) {
                      break L27;
                    } else {
                      L28: {
                        var43_int = 0;
                        var44 = 1;
                        var45 = this.field_R + this.field_O >> 1;
                        var46 = this.field_Bb + this.field_vb >> 1;
                        var37 = var45;
                        var38 = this.field_f;
                        var39 = var46;
                        var34 = var13 + var25 * (float)var37 + var14 * (float)var38 + var28 * (float)var39;
                        var35 = var19 + var26 * (float)var37 + var20 * (float)var38 + var29 * (float)var39;
                        var36 = var7 + var27 * (float)var37 + var8 * (float)var38 + var30 * (float)var39;
                        if (var36 < (float)var42) {
                          var43_int = 1;
                          break L28;
                        } else {
                          if (param2 == -1) {
                            break L28;
                          } else {
                            break L28;
                          }
                        }
                      }
                      L29: {
                        var37 = var45;
                        var38 = this.field_cb;
                        var39 = var46;
                        var47 = var7 + var27 * (float)var37 + var8 * (float)var38 + var30 * (float)var39;
                        if (var47 < (float)var42) {
                          var43_int = 1;
                          break L29;
                        } else {
                          if (param2 == -1) {
                            break L29;
                          } else {
                            break L29;
                          }
                        }
                      }
                      L30: {
                        if (var43_int == 0) {
                          break L30;
                        } else {
                          L31: {
                            if (var36 >= (float)var42) {
                              break L31;
                            } else {
                              if (var47 >= (float)var42) {
                                break L31;
                              } else {
                                var44 = 0;
                                break L30;
                              }
                            }
                          }
                          if (var36 >= (float)var42) {
                            if (var47 >= (float)var42) {
                              break L30;
                            } else {
                              if (param2 == -1) {
                                break L30;
                              } else {
                                break L30;
                              }
                            }
                          } else {
                            if (param2 == -1) {
                              break L30;
                            } else {
                              break L30;
                            }
                          }
                        }
                      }
                      if (var44 == 0) {
                        break L27;
                      } else {
                        if (var36 <= var47) {
                          if (param2 == -1) {
                            break L27;
                          } else {
                            break L27;
                          }
                        } else {
                          if (param2 == -1) {
                            break L27;
                          } else {
                            break L27;
                          }
                        }
                      }
                    }
                  }
                  L32: {
                    this.a(true);
                    stackOut_135_0 = this.field_w;
                    stackIn_137_0 = stackOut_135_0;
                    stackIn_136_0 = stackOut_135_0;
                    if ((param3 & 1) != 0) {
                      stackOut_137_0 = (iua) ((Object) stackIn_137_0);
                      stackOut_137_1 = 0;
                      stackIn_138_0 = stackOut_137_0;
                      stackIn_138_1 = stackOut_137_1;
                      break L32;
                    } else {
                      stackOut_136_0 = (iua) ((Object) stackIn_136_0);
                      stackOut_136_1 = 1;
                      stackIn_138_0 = stackOut_136_0;
                      stackIn_138_1 = stackOut_136_1;
                      break L32;
                    }
                  }
                  stackIn_138_0.field_j = stackIn_138_1 != 0;
                  this.field_w.field_g = false;
                  try {
                    L33: {
                      L34: {
                        if ((param3 & 4) == 0) {
                          stackOut_141_0 = 0;
                          stackIn_142_0 = stackOut_141_0;
                          break L34;
                        } else {
                          stackOut_140_0 = 1;
                          stackIn_142_0 = stackOut_140_0;
                          break L34;
                        }
                      }
                      L35: {
                        var43_int = stackIn_142_0;
                        if (var43_int == 0) {
                          L36: {
                            L37: {
                              L38: {
                                stackOut_151_0 = this;
                                stackOut_151_1 = var31;
                                stackIn_154_0 = stackOut_151_0;
                                stackIn_154_1 = stackOut_151_1;
                                stackIn_152_0 = stackOut_151_0;
                                stackIn_152_1 = stackOut_151_1;
                                if (!this.field_F.field_J) {
                                  break L38;
                                } else {
                                  stackOut_152_0 = this;
                                  stackOut_152_1 = stackIn_152_1;
                                  stackIn_156_0 = stackOut_152_0;
                                  stackIn_156_1 = stackOut_152_1;
                                  stackIn_153_0 = stackOut_152_0;
                                  stackIn_153_1 = stackOut_152_1;
                                  if (var12 > this.field_F.field_B) {
                                    break L37;
                                  } else {
                                    stackOut_153_0 = this;
                                    stackOut_153_1 = stackIn_153_1;
                                    stackIn_154_0 = stackOut_153_0;
                                    stackIn_154_1 = stackOut_153_1;
                                    break L38;
                                  }
                                }
                              }
                              stackOut_154_0 = this;
                              stackOut_154_1 = stackIn_154_1;
                              stackIn_157_0 = stackOut_154_0;
                              stackIn_157_1 = stackOut_154_1;
                              stackIn_155_0 = stackOut_154_0;
                              stackIn_155_1 = stackOut_154_1;
                              if (!this.field_F.field_h) {
                                stackOut_157_0 = this;
                                stackOut_157_1 = stackIn_157_1;
                                stackOut_157_2 = 0;
                                stackIn_158_0 = stackOut_157_0;
                                stackIn_158_1 = stackOut_157_1;
                                stackIn_158_2 = stackOut_157_2;
                                break L36;
                              } else {
                                stackOut_155_0 = this;
                                stackOut_155_1 = stackIn_155_1;
                                stackIn_156_0 = stackOut_155_0;
                                stackIn_156_1 = stackOut_155_1;
                                break L37;
                              }
                            }
                            stackOut_156_0 = this;
                            stackOut_156_1 = stackIn_156_1;
                            stackOut_156_2 = 1;
                            stackIn_158_0 = stackOut_156_0;
                            stackIn_158_1 = stackOut_156_1;
                            stackIn_158_2 = stackOut_156_2;
                            break L36;
                          }
                          this.a(stackIn_158_1 != 0, stackIn_158_2 != 0, var11, var12 - var11);
                          break L35;
                        } else {
                          L39: {
                            L40: {
                              L41: {
                                stackOut_143_0 = this;
                                stackOut_143_1 = var31;
                                stackIn_146_0 = stackOut_143_0;
                                stackIn_146_1 = stackOut_143_1;
                                stackIn_144_0 = stackOut_143_0;
                                stackIn_144_1 = stackOut_143_1;
                                if (!this.field_F.field_J) {
                                  break L41;
                                } else {
                                  stackOut_144_0 = this;
                                  stackOut_144_1 = stackIn_144_1;
                                  stackIn_148_0 = stackOut_144_0;
                                  stackIn_148_1 = stackOut_144_1;
                                  stackIn_145_0 = stackOut_144_0;
                                  stackIn_145_1 = stackOut_144_1;
                                  if (var12 > this.field_F.field_B) {
                                    break L40;
                                  } else {
                                    stackOut_145_0 = this;
                                    stackOut_145_1 = stackIn_145_1;
                                    stackIn_146_0 = stackOut_145_0;
                                    stackIn_146_1 = stackOut_145_1;
                                    break L41;
                                  }
                                }
                              }
                              stackOut_146_0 = this;
                              stackOut_146_1 = stackIn_146_1;
                              stackIn_149_0 = stackOut_146_0;
                              stackIn_149_1 = stackOut_146_1;
                              stackIn_147_0 = stackOut_146_0;
                              stackIn_147_1 = stackOut_146_1;
                              if (!this.field_F.field_h) {
                                stackOut_149_0 = this;
                                stackOut_149_1 = stackIn_149_1;
                                stackOut_149_2 = 0;
                                stackIn_150_0 = stackOut_149_0;
                                stackIn_150_1 = stackOut_149_1;
                                stackIn_150_2 = stackOut_149_2;
                                break L39;
                              } else {
                                stackOut_147_0 = this;
                                stackOut_147_1 = stackIn_147_1;
                                stackIn_148_0 = stackOut_147_0;
                                stackIn_148_1 = stackOut_147_1;
                                break L40;
                              }
                            }
                            stackOut_148_0 = this;
                            stackOut_148_1 = stackIn_148_1;
                            stackOut_148_2 = 1;
                            stackIn_150_0 = stackOut_148_0;
                            stackIn_150_1 = stackOut_148_1;
                            stackIn_150_2 = stackOut_148_2;
                            break L39;
                          }
                          this.b(stackIn_150_1 != 0, stackIn_150_2 != 0, var11, var12 - var11);
                          break L35;
                        }
                      }
                      break L33;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L42: {
                      var43 = (Exception) (Object) decompiledCaughtException;
                      break L42;
                    }
                  }
                  L43: {
                    if (this.field_e == null) {
                      break L43;
                    } else {
                      var43_int = 0;
                      L44: while (true) {
                        if (var43_int >= this.field_g) {
                          break L43;
                        } else {
                          this.field_jb[var43_int] = -1;
                          var43_int++;
                          continue L44;
                        }
                      }
                    }
                  }
                  L45: {
                    this.field_w = null;
                    if (this.field_d.field_u <= 1) {
                      break L45;
                    } else {
                      var43_ref = this;
                      synchronized (var43_ref) {
                        L46: {
                          this.field_zb = false;
                          this.notifyAll();
                          break L46;
                        }
                      }
                      break L45;
                    }
                  }
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
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void d() {
        int var1 = 0;
        int var2 = 0;
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
        int var13 = 0;
        if (!this.field_r) {
          var1 = 0;
          var2 = 0;
          var3 = 32767;
          var4 = 32767;
          var5 = 32767;
          var6 = -32768;
          var7 = -32768;
          var8 = -32768;
          var9 = 0;
          L0: while (true) {
            if (var9 >= this.field_Z) {
              this.field_R = (short)var3;
              this.field_O = (short)var6;
              this.field_f = (short)var4;
              this.field_cb = (short)var7;
              this.field_Bb = (short)var5;
              this.field_vb = (short)var8;
              this.field_U = (short)(int)(Math.sqrt((double)var1) + 0.99);
              this.field_r = true;
              return;
            } else {
              L1: {
                var10 = this.field_xb[var9];
                var11 = this.field_rb[var9];
                var12 = this.field_T[var9];
                if (var10 >= var3) {
                  break L1;
                } else {
                  var3 = var10;
                  break L1;
                }
              }
              L2: {
                if (var10 <= var6) {
                  break L2;
                } else {
                  var6 = var10;
                  break L2;
                }
              }
              L3: {
                if (var11 >= var4) {
                  break L3;
                } else {
                  var4 = var11;
                  break L3;
                }
              }
              L4: {
                if (var11 <= var7) {
                  break L4;
                } else {
                  var7 = var11;
                  break L4;
                }
              }
              L5: {
                if (var12 >= var5) {
                  break L5;
                } else {
                  var5 = var12;
                  break L5;
                }
              }
              L6: {
                if (var12 <= var8) {
                  break L6;
                } else {
                  var8 = var12;
                  break L6;
                }
              }
              L7: {
                var13 = var10 * var10 + var12 * var12;
                if (var13 <= var1) {
                  break L7;
                } else {
                  var1 = var13;
                  break L7;
                }
              }
              var13 = var13 + var11 * var11;
              if (var13 > var2) {
                var2 = var13;
                var9++;
                continue L0;
              } else {
                var9++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    private final void b(Thread param0) {
        tw var2 = this.field_d.a((Runnable) ((Object) param0));
        this.field_w = var2.field_v;
        if (var2 == this.field_F) {
            return;
        }
        this.field_F = var2;
        this.field_s = this.field_F.field_A;
        this.field_nb = this.field_F.field_c;
        this.field_C = this.field_F.field_k;
        this.field_Ab = this.field_F.field_G;
        this.field_v = this.field_F.field_j;
        this.field_J = this.field_F.field_a;
        this.field_mb = this.field_F.field_p;
        this.field_y = this.field_F.field_i;
        this.field_E = this.field_F.field_I;
        this.field_yb = this.field_F.field_q;
        this.field_hb = this.field_F.field_s;
        this.field_jb = this.field_F.field_l;
    }

    private final void b(boolean param0, boolean param1, int param2, int param3) {
        int var5 = 0;
        hna var6_ref_hna = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          if (this.field_e == null) {
            break L0;
          } else {
            var5 = 0;
            L1: while (true) {
              if (var5 >= this.field_m) {
                break L0;
              } else {
                var6_ref_hna = this.field_e[var5];
                this.field_jb[var6_ref_hna.field_j] = var5;
                var5++;
                continue L1;
              }
            }
          }
        }
        L2: {
          L3: {
            if (this.field_ab) {
              break L3;
            } else {
              if (this.field_e == null) {
                var5 = 0;
                L4: while (true) {
                  if (var5 >= this.field_g) {
                    break L2;
                  } else {
                    this.b(var5, param0, param1);
                    var5++;
                    continue L4;
                  }
                }
              } else {
                break L3;
              }
            }
          }
          L5: {
            if ((this.field_P & 256) != 0) {
              break L5;
            } else {
              if (this.field_ub == null) {
                break L5;
              } else {
                var5 = 0;
                L6: while (true) {
                  if (var5 >= this.field_g) {
                    break L2;
                  } else {
                    var6 = this.field_ub[var5];
                    this.b(var6, param0, param1);
                    var5++;
                    continue L6;
                  }
                }
              }
            }
          }
          var5 = 0;
          L7: while (true) {
            if (var5 >= this.field_g) {
              if (this.field_wb != null) {
                var5 = 0;
                L8: while (true) {
                  if (var5 >= 12) {
                    break L2;
                  } else {
                    var7 = 0;
                    var6 = var7;
                    L9: while (true) {
                      if (var7 >= this.field_g) {
                        var5++;
                        continue L8;
                      } else {
                        if (this.field_wb[var7] == var5) {
                          L10: {
                            if (this.c(var7)) {
                              break L10;
                            } else {
                              if (this.h(var7)) {
                                break L10;
                              } else {
                                var7++;
                                continue L9;
                              }
                            }
                          }
                          this.b(var7, param0, param1);
                          var7++;
                          continue L9;
                        } else {
                          var7++;
                          continue L9;
                        }
                      }
                    }
                  }
                }
              } else {
                var5 = 0;
                L11: while (true) {
                  if (var5 >= this.field_g) {
                    break L2;
                  } else {
                    L12: {
                      if (this.c(var5)) {
                        break L12;
                      } else {
                        if (this.h(var5)) {
                          break L12;
                        } else {
                          var5++;
                          continue L11;
                        }
                      }
                    }
                    this.b(var5, param0, param1);
                    var5++;
                    continue L11;
                  }
                }
              }
            } else {
              if (!this.c(var5)) {
                if (!this.h(var5)) {
                  this.b(var5, param0, param1);
                  var5++;
                  continue L7;
                } else {
                  var5++;
                  continue L7;
                }
              } else {
                var5++;
                continue L7;
              }
            }
          }
        }
    }

    private final void b(boolean param0) {
        int var2 = 0;
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
        int var13_int = 0;
        oha var13 = null;
        int var14 = 0;
        oha var15_ref_oha = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        gna var19 = null;
        gna var20 = null;
        int stackIn_35_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_85_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        if (this.field_eb != 1) {
          if (this.field_eb != 2) {
            L0: {
              this.g();
              var2 = this.field_d.field_x;
              var3 = this.field_d.field_V;
              var4 = this.field_d.field_S;
              var5 = this.field_d.field_f >> 8;
              var6 = this.field_d.field_q * 768 / this.field_ib;
              var7 = this.field_d.field_M * 768 / this.field_ib;
              if (this.field_t != null) {
                break L0;
              } else {
                this.field_t = new int[this.field_g];
                this.field_o = new int[this.field_g];
                this.field_Fb = new int[this.field_g];
                break L0;
              }
            }
            var8 = 0;
            L1: while (true) {
              if (var8 >= this.field_g) {
                L2: {
                  this.field_lb = null;
                  this.field_D = null;
                  this.field_I = null;
                  if ((this.field_P & 618648) != 0) {
                    break L2;
                  } else {
                    if (this.field_W != null) {
                      break L2;
                    } else {
                      this.field_ob = null;
                      break L2;
                    }
                  }
                }
                L3: {
                  if (!param0) {
                    break L3;
                  } else {
                    this.field_k = null;
                    break L3;
                  }
                }
                this.field_eb = 2;
                return;
              } else {
                L4: {
                  if (this.field_k != null) {
                    var9 = this.field_k[var8];
                    break L4;
                  } else {
                    var9 = 0;
                    break L4;
                  }
                }
                L5: {
                  if (this.field_h != null) {
                    var10 = this.field_h[var8];
                    break L5;
                  } else {
                    var10 = 0;
                    break L5;
                  }
                }
                L6: {
                  if (this.field_X != null) {
                    var11 = this.field_X[var8];
                    break L6;
                  } else {
                    var11 = -1;
                    break L6;
                  }
                }
                L7: {
                  if (var10 != -2) {
                    break L7;
                  } else {
                    var9 = 3;
                    break L7;
                  }
                }
                L8: {
                  if (var10 != -1) {
                    break L8;
                  } else {
                    var9 = 2;
                    break L8;
                  }
                }
                L9: {
                  if (var11 != -1) {
                    var12 = this.field_ob[var8] & 65535;
                    if (var9 != 0) {
                      if (var9 != 1) {
                        break L9;
                      } else {
                        L10: {
                          var20 = this.field_I[var8];
                          var14 = var2 * var20.field_a + var3 * var20.field_c + var4 * var20.field_b >> 16;
                          if (var14 <= 256) {
                            stackOut_84_0 = var7;
                            stackIn_85_0 = stackOut_84_0;
                            break L10;
                          } else {
                            stackOut_83_0 = var6;
                            stackIn_85_0 = stackOut_83_0;
                            break L10;
                          }
                        }
                        var15 = stackIn_85_0;
                        var16 = this.d((var5 >> 2) + (var15 * var14 >> 18));
                        this.field_t[var8] = var16 << 24 | this.a(var12, (short) var11, var16);
                        this.field_Fb[var8] = -1;
                        var8++;
                        continue L1;
                      }
                    } else {
                      L11: {
                        L12: {
                          if (this.field_D == null) {
                            break L12;
                          } else {
                            if (this.field_D[this.field_M[var8]] == null) {
                              break L12;
                            } else {
                              var13 = this.field_D[this.field_M[var8]];
                              break L11;
                            }
                          }
                        }
                        var13 = this.field_lb[this.field_M[var8]];
                        break L11;
                      }
                      L13: {
                        var15 = (var2 * var13.field_a + var3 * var13.field_c + var4 * var13.field_b) / var13.field_d >> 16;
                        if (var15 <= 256) {
                          stackOut_65_0 = var7;
                          stackIn_66_0 = stackOut_65_0;
                          break L13;
                        } else {
                          stackOut_64_0 = var6;
                          stackIn_66_0 = stackOut_64_0;
                          break L13;
                        }
                      }
                      L14: {
                        L15: {
                          var16 = stackIn_66_0;
                          var14 = this.d((var5 >> 2) + (var16 * var15 >> 18));
                          this.field_t[var8] = var14 << 24 | this.a(var12, (short) var11, var14);
                          if (this.field_D == null) {
                            break L15;
                          } else {
                            if (this.field_D[this.field_bb[var8]] == null) {
                              break L15;
                            } else {
                              var13 = this.field_D[this.field_bb[var8]];
                              break L14;
                            }
                          }
                        }
                        var13 = this.field_lb[this.field_bb[var8]];
                        break L14;
                      }
                      L16: {
                        var15 = (var2 * var13.field_a + var3 * var13.field_c + var4 * var13.field_b) / var13.field_d >> 16;
                        if (var15 <= 256) {
                          stackOut_72_0 = var7;
                          stackIn_73_0 = stackOut_72_0;
                          break L16;
                        } else {
                          stackOut_71_0 = var6;
                          stackIn_73_0 = stackOut_71_0;
                          break L16;
                        }
                      }
                      L17: {
                        L18: {
                          var16 = stackIn_73_0;
                          var14 = this.d((var5 >> 2) + (var16 * var15 >> 18));
                          this.field_o[var8] = var14 << 24 | this.a(var12, (short) var11, var14);
                          if (this.field_D == null) {
                            break L18;
                          } else {
                            if (this.field_D[this.field_x[var8]] == null) {
                              break L18;
                            } else {
                              var13 = this.field_D[this.field_x[var8]];
                              break L17;
                            }
                          }
                        }
                        var13 = this.field_lb[this.field_x[var8]];
                        break L17;
                      }
                      L19: {
                        var15 = (var2 * var13.field_a + var3 * var13.field_c + var4 * var13.field_b) / var13.field_d >> 16;
                        if (var15 <= 256) {
                          stackOut_79_0 = var7;
                          stackIn_80_0 = stackOut_79_0;
                          break L19;
                        } else {
                          stackOut_78_0 = var6;
                          stackIn_80_0 = stackOut_78_0;
                          break L19;
                        }
                      }
                      var16 = stackIn_80_0;
                      var14 = this.d((var5 >> 2) + (var16 * var15 >> 18));
                      this.field_Fb[var8] = var14 << 24 | this.a(var12, (short) var11, var14);
                      var8++;
                      continue L1;
                    }
                  } else {
                    if (var9 != 0) {
                      if (var9 != 1) {
                        if (var9 != 3) {
                          break L9;
                        } else {
                          this.field_t[var8] = 128;
                          this.field_Fb[var8] = -1;
                          var8++;
                          continue L1;
                        }
                      } else {
                        L20: {
                          var12 = this.field_ob[var8] & 65535;
                          var13_int = (var12 & 127) * this.field_Db >> 7;
                          var14 = tg.a((byte) -105, var12 & -128 | var13_int);
                          var19 = this.field_I[var8];
                          var16 = var2 * var19.field_a + var3 * var19.field_c + var4 * var19.field_b >> 16;
                          if (var16 <= 256) {
                            stackOut_53_0 = var7;
                            stackIn_54_0 = stackOut_53_0;
                            break L20;
                          } else {
                            stackOut_52_0 = var6;
                            stackIn_54_0 = stackOut_52_0;
                            break L20;
                          }
                        }
                        var17 = stackIn_54_0;
                        var18 = (var5 >> 1) + (var17 * var16 >> 17);
                        this.field_t[var8] = var18 << 17 | ds.c(-127, var14, var18);
                        this.field_Fb[var8] = -1;
                        var8++;
                        continue L1;
                      }
                    } else {
                      L21: {
                        L22: {
                          var12 = this.field_ob[var8] & 65535;
                          var13_int = (var12 & 127) * this.field_Db >> 7;
                          var14 = tg.a((byte) -128, var12 & -128 | var13_int);
                          if (this.field_D == null) {
                            break L22;
                          } else {
                            if (this.field_D[this.field_M[var8]] == null) {
                              break L22;
                            } else {
                              var15_ref_oha = this.field_D[this.field_M[var8]];
                              break L21;
                            }
                          }
                        }
                        var15_ref_oha = this.field_lb[this.field_M[var8]];
                        break L21;
                      }
                      L23: {
                        var17 = (var2 * var15_ref_oha.field_a + var3 * var15_ref_oha.field_c + var4 * var15_ref_oha.field_b) / var15_ref_oha.field_d >> 16;
                        if (var17 <= 256) {
                          stackOut_34_0 = var7;
                          stackIn_35_0 = stackOut_34_0;
                          break L23;
                        } else {
                          stackOut_33_0 = var6;
                          stackIn_35_0 = stackOut_33_0;
                          break L23;
                        }
                      }
                      L24: {
                        L25: {
                          var18 = stackIn_35_0;
                          var16 = (var5 >> 1) + (var18 * var17 >> 17);
                          this.field_t[var8] = var16 << 17 | ds.c(-127, var14, var16);
                          if (this.field_D == null) {
                            break L25;
                          } else {
                            if (this.field_D[this.field_bb[var8]] == null) {
                              break L25;
                            } else {
                              var15_ref_oha = this.field_D[this.field_bb[var8]];
                              break L24;
                            }
                          }
                        }
                        var15_ref_oha = this.field_lb[this.field_bb[var8]];
                        break L24;
                      }
                      L26: {
                        var17 = (var2 * var15_ref_oha.field_a + var3 * var15_ref_oha.field_c + var4 * var15_ref_oha.field_b) / var15_ref_oha.field_d >> 16;
                        if (var17 <= 256) {
                          stackOut_41_0 = var7;
                          stackIn_42_0 = stackOut_41_0;
                          break L26;
                        } else {
                          stackOut_40_0 = var6;
                          stackIn_42_0 = stackOut_40_0;
                          break L26;
                        }
                      }
                      L27: {
                        L28: {
                          var18 = stackIn_42_0;
                          var16 = (var5 >> 1) + (var18 * var17 >> 17);
                          this.field_o[var8] = var16 << 17 | ds.c(-127, var14, var16);
                          if (this.field_D == null) {
                            break L28;
                          } else {
                            if (this.field_D[this.field_x[var8]] == null) {
                              break L28;
                            } else {
                              var15_ref_oha = this.field_D[this.field_x[var8]];
                              break L27;
                            }
                          }
                        }
                        var15_ref_oha = this.field_lb[this.field_x[var8]];
                        break L27;
                      }
                      L29: {
                        var17 = (var2 * var15_ref_oha.field_a + var3 * var15_ref_oha.field_c + var4 * var15_ref_oha.field_b) / var15_ref_oha.field_d >> 16;
                        if (var17 <= 256) {
                          stackOut_48_0 = var7;
                          stackIn_49_0 = stackOut_48_0;
                          break L29;
                        } else {
                          stackOut_47_0 = var6;
                          stackIn_49_0 = stackOut_47_0;
                          break L29;
                        }
                      }
                      var18 = stackIn_49_0;
                      var16 = (var5 >> 1) + (var18 * var17 >> 17);
                      this.field_Fb[var8] = var16 << 17 | ds.c(-127, var14, var16);
                      var8++;
                      continue L1;
                    }
                  }
                }
                this.field_Fb[var8] = -2;
                var8++;
                continue L1;
              }
            }
          } else {
            L30: {
              if ((this.field_P & 618648) != 0) {
                break L30;
              } else {
                if (this.field_W != null) {
                  break L30;
                } else {
                  this.field_ob = null;
                  break L30;
                }
              }
            }
            L31: {
              if (!param0) {
                break L31;
              } else {
                this.field_k = null;
                break L31;
              }
            }
            return;
          }
        } else {
          this.e();
          return;
        }
    }

    final void a(gda param0, el param1, int param2, int param3) {
        this.b(param0, param1, param2, param3);
    }

    private final void a(Thread param0) {
        tw var2 = this.field_d.a((Runnable) ((Object) param0));
        if (var2 == this.field_z) {
            return;
        }
        this.field_z = var2;
        this.field_pb = this.field_z.field_C;
        this.field_u = this.field_z.field_t;
        this.field_Q = this.field_z.field_m;
        this.field_Gb = this.field_z.field_K;
        this.field_N = this.field_z.field_x;
        this.field_n = this.field_z.field_E;
        this.field_qb = this.field_z.field_w;
        this.field_K = this.field_z.field_F;
        this.field_tb = this.field_z.field_e;
        this.field_fb = this.field_z.field_r;
    }

    private final void a(int param0, boolean param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11_int = 0;
        hna var11 = null;
        int var12_int = 0;
        nsa var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        if (this.field_Fb[param0] != -2) {
          L0: {
            L1: {
              var4 = this.field_M[param0];
              var5 = this.field_bb[param0];
              var6 = this.field_x[param0];
              var7 = this.field_v[var4];
              var8 = this.field_v[var5];
              var9 = this.field_v[var6];
              if (!param1) {
                break L1;
              } else {
                L2: {
                  if (var7 == -5000) {
                    break L2;
                  } else {
                    if (var8 == -5000) {
                      break L2;
                    } else {
                      if (var9 != -5000) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                var10 = this.field_nb[var4];
                var11_int = this.field_nb[var5];
                var12_int = this.field_nb[var6];
                var13 = this.field_C[var4];
                var14 = this.field_C[var5];
                var15 = this.field_C[var6];
                var16 = this.field_Ab[var4];
                var17 = this.field_Ab[var5];
                var18 = this.field_Ab[var6];
                var10 = var10 - var11_int;
                var12_int = var12_int - var11_int;
                var13 = var13 - var14;
                var15 = var15 - var14;
                var16 = var16 - var17;
                var18 = var18 - var17;
                var19 = var13 * var18 - var16 * var15;
                var20 = var16 * var12_int - var10 * var18;
                var21 = var10 * var15 - var13 * var12_int;
                if (var11_int * var19 + var14 * var20 + var17 * var21 <= 0) {
                  break L0;
                } else {
                  this.e(param0);
                  break L0;
                }
              }
            }
            L3: {
              if (this.field_jb[param0] != -1) {
                break L3;
              } else {
                if ((var7 - var8) * (this.field_J[var6] - this.field_J[var5]) - (this.field_J[var4] - this.field_J[var5]) * (var9 - var8) <= 0) {
                  break L0;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              L5: {
                if (var7 < 0) {
                  break L5;
                } else {
                  if (var8 < 0) {
                    break L5;
                  } else {
                    if (var9 < 0) {
                      break L5;
                    } else {
                      if (var7 > this.field_F.field_y) {
                        break L5;
                      } else {
                        if (var8 > this.field_F.field_y) {
                          break L5;
                        } else {
                          if (var9 <= this.field_F.field_y) {
                            this.field_w.field_q = false;
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                }
              }
              this.field_w.field_q = true;
              break L4;
            }
            if (!param2) {
              var10 = this.field_jb[param0];
              if (var10 == -1) {
                this.f(param0);
                break L0;
              } else {
                L6: {
                  var11 = this.field_e[var10];
                  var12 = this.field_db[var10];
                  if (var11.field_d) {
                    break L6;
                  } else {
                    this.f(param0);
                    break L6;
                  }
                }
                this.field_d.c(var12.field_e, var12.field_h, var12.field_n, var12.field_l, var12.field_c, var12.field_j, var11.field_h & 65535, var12.field_k, (int) var11.field_c, (int) var11.field_g);
                break L0;
              }
            } else {
              var10 = this.field_jb[param0];
              if (var10 != -1) {
                if (this.field_e[var10].field_d) {
                  break L0;
                } else {
                  this.i(param0);
                  break L0;
                }
              } else {
                this.i(param0);
                break L0;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    ww(sfa param0) {
        this.field_zb = false;
        this.field_Z = 0;
        this.field_r = false;
        this.field_ab = false;
        this.field_eb = 0;
        this.field_S = false;
        this.field_A = false;
        this.field_g = 0;
        this.field_p = 0;
        this.field_d = param0;
    }

    ww(sfa param0, oc param1, int param2, int param3, int param4, int param5) {
        d var7 = null;
        int var9_int = 0;
        long[] var9 = null;
        int var10 = 0;
        int var11_int = 0;
        ima var11 = null;
        int var12 = 0;
        Object var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18_int = 0;
        dw var18 = null;
        int var19_int = 0;
        float[] var19 = null;
        float[] var20 = null;
        lp var21_ref_lp = null;
        int var21 = 0;
        dw var22_ref_dw = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        float var29 = 0.0f;
        int var30 = 0;
        float var30_float = 0.0f;
        float var31 = 0.0f;
        float var32 = 0.0f;
        float var33 = 0.0f;
        float var34_float = 0.0f;
        int var34 = 0;
        float var35_float = 0.0f;
        int var35 = 0;
        float var36_float = 0.0f;
        int var36 = 0;
        float var37_float = 0.0f;
        int var37 = 0;
        float var38_float = 0.0f;
        int var38 = 0;
        float var39_float = 0.0f;
        int var39 = 0;
        float var40_float = 0.0f;
        int var40 = 0;
        float var41_float = 0.0f;
        int var41 = 0;
        float var42_float = 0.0f;
        int var42 = 0;
        float var43 = 0.0f;
        float var44 = 0.0f;
        float var45 = 0.0f;
        float var46 = 0.0f;
        float var47 = 0.0f;
        float var48 = 0.0f;
        float var49 = 0.0f;
        float var50 = 0.0f;
        float var51 = 0.0f;
        float var52 = 0.0f;
        float var53 = 0.0f;
        int var54 = 0;
        jt var56 = null;
        dw var57 = null;
        long[] var58 = null;
        jt var59 = null;
        lp var60 = null;
        tw var61 = null;
        dw var62 = null;
        float[] var65 = null;
        float[] var66 = null;
        long[] var68 = null;
        int[] var74 = null;
        float[] var75 = null;
        float[] var76 = null;
        int stackIn_6_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_52_2 = 0;
        int stackIn_61_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        int stackOut_51_2 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int stackOut_50_2 = 0;
        short stackOut_60_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_32_0 = 0;
        this.field_zb = false;
        this.field_Z = 0;
        this.field_r = false;
        this.field_ab = false;
        this.field_eb = 0;
        this.field_S = false;
        this.field_A = false;
        this.field_g = 0;
        this.field_p = 0;
        this.field_d = param0;
        this.field_P = param2;
        this.field_Db = param3;
        this.field_ib = param4;
        var7 = this.field_d.field_c;
        this.field_p = param1.field_E;
        this.field_Z = param1.field_L;
        this.field_xb = param1.field_b;
        this.field_rb = param1.field_I;
        this.field_T = param1.field_p;
        this.field_g = param1.field_o;
        this.field_M = param1.field_a;
        this.field_bb = param1.field_t;
        this.field_x = param1.field_J;
        this.field_wb = param1.field_C;
        this.field_ob = param1.field_A;
        this.field_h = param1.field_n;
        this.field_V = param1.field_h;
        this.field_k = param1.field_G;
        this.field_i = param1.field_B;
        this.field_kb = param1.field_e;
        this.field_Eb = param1.field_y;
        var74 = new int[this.field_g];
        var9_int = 0;
        L0: while (true) {
          if (var9_int >= this.field_g) {
            L1: {
              var68 = new long[this.field_g];
              var58 = var68;
              var9 = var58;
              if ((this.field_P & 256) == 0) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            var10 = stackIn_6_0;
            var11_int = 0;
            L2: while (true) {
              if (var11_int >= this.field_g) {
                L3: {
                  ofa.a(var74, var68, 89);
                  if (param1.field_m == null) {
                    break L3;
                  } else {
                    this.field_m = param1.field_m.length;
                    this.field_e = new hna[this.field_m];
                    this.field_db = new nsa[this.field_m];
                    var54 = 0;
                    var11_int = var54;
                    L4: while (true) {
                      if (var54 >= param1.field_m.length) {
                        break L3;
                      } else {
                        L5: {
                          var59 = param1.field_m[var54];
                          var60 = fw.a(var59.field_d, false);
                          var14 = bt.field_h[param1.field_A[var59.field_a] & 65535] & 16777215;
                          stackOut_49_0 = var14;
                          stackOut_49_1 = 255;
                          stackIn_51_0 = stackOut_49_0;
                          stackIn_51_1 = stackOut_49_1;
                          stackIn_50_0 = stackOut_49_0;
                          stackIn_50_1 = stackOut_49_1;
                          if (param1.field_n == null) {
                            stackOut_51_0 = stackIn_51_0;
                            stackOut_51_1 = stackIn_51_1;
                            stackOut_51_2 = 0;
                            stackIn_52_0 = stackOut_51_0;
                            stackIn_52_1 = stackOut_51_1;
                            stackIn_52_2 = stackOut_51_2;
                            break L5;
                          } else {
                            stackOut_50_0 = stackIn_50_0;
                            stackOut_50_1 = stackIn_50_1;
                            stackOut_50_2 = param1.field_n[var59.field_a] & 255;
                            stackIn_52_0 = stackOut_50_0;
                            stackIn_52_1 = stackOut_50_1;
                            stackIn_52_2 = stackOut_50_2;
                            break L5;
                          }
                        }
                        var14 = stackIn_52_0 | stackIn_52_1 - stackIn_52_2 << 24;
                        this.field_e[var54] = new hna(var59.field_a, (int) param1.field_a[var59.field_a], (int) param1.field_t[var59.field_a], (int) param1.field_J[var59.field_a], var60.field_d, var60.field_b, var60.field_f, var60.field_c, var60.field_e, var60.field_i, var59.field_c);
                        this.field_db[var54] = new nsa(var14);
                        var54++;
                        continue L4;
                      }
                    }
                  }
                }
                this.field_W = new float[this.field_g][];
                this.field_l = new float[this.field_g][];
                var11 = qqa.a(var74, param1, this.field_g, (byte) -6);
                var61 = this.field_d.a((Runnable) ((Object) Thread.currentThread()));
                var75 = var61.field_d;
                var14 = 0;
                var15 = 0;
                L6: while (true) {
                  if (var15 >= this.field_g) {
                    L7: {
                      if (var14 != 0) {
                        break L7;
                      } else {
                        this.field_l = (float[][]) null;
                        this.field_W = (float[][]) null;
                        break L7;
                      }
                    }
                    L8: {
                      if (param1.field_l == null) {
                        break L8;
                      } else {
                        if ((this.field_P & 32) == 0) {
                          break L8;
                        } else {
                          this.field_sb = param1.a(true, (byte) 64);
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (param1.field_D == null) {
                        break L9;
                      } else {
                        if ((this.field_P & 384) == 0) {
                          break L9;
                        } else {
                          this.field_Cb = param1.c((byte) -61);
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (param1.field_m == null) {
                        break L10;
                      } else {
                        if ((this.field_P & 1024) == 0) {
                          break L10;
                        } else {
                          this.field_j = param1.b((byte) -119);
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (param1.field_r == null) {
                        this.field_X = null;
                        break L11;
                      } else {
                        this.field_X = new short[this.field_g];
                        var15 = 0;
                        var16 = 0;
                        L12: while (true) {
                          if (var16 >= this.field_g) {
                            if (var15 != 0) {
                              break L11;
                            } else {
                              this.field_X = null;
                              break L11;
                            }
                          } else {
                            var17 = param1.field_r[var16];
                            if (var17 == -1) {
                              this.field_X[var16] = (short)-1;
                              var16++;
                              continue L12;
                            } else {
                              L13: {
                                var18 = this.field_d.field_c.a((byte) -2, var17);
                                if ((param5 & 64) == 0) {
                                  break L13;
                                } else {
                                  if (var18.field_p) {
                                    this.field_X[var16] = (short)-1;
                                    var16++;
                                    continue L12;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              L14: {
                                this.field_X[var16] = (short)var17;
                                var15 = 1;
                                if (var18.field_d != 2) {
                                  break L14;
                                } else {
                                  this.field_ab = true;
                                  break L14;
                                }
                              }
                              if (var18.field_s == 0) {
                                if (var18.field_o != 0) {
                                  var16++;
                                  continue L12;
                                } else {
                                  var16++;
                                  continue L12;
                                }
                              } else {
                                var16++;
                                continue L12;
                              }
                            }
                          }
                        }
                      }
                    }
                    L15: {
                      if (this.field_ab) {
                        this.field_ub = new short[this.field_g];
                        var15 = 0;
                        L16: while (true) {
                          if (var15 >= this.field_g) {
                            break L15;
                          } else {
                            this.field_ub[var15] = (short)var74[var15];
                            var15++;
                            continue L16;
                          }
                        }
                      } else {
                        if (this.field_e == null) {
                          break L15;
                        } else {
                          this.field_ub = new short[this.field_g];
                          var15 = 0;
                          L17: while (true) {
                            if (var15 >= this.field_g) {
                              break L15;
                            } else {
                              this.field_ub[var15] = (short)var74[var15];
                              var15++;
                              continue L17;
                            }
                          }
                        }
                      }
                    }
                    return;
                  } else {
                    L18: {
                      var16 = var74[var15];
                      if (param1.field_g != null) {
                        var17 = param1.field_g[var16];
                        break L18;
                      } else {
                        var17 = -1;
                        break L18;
                      }
                    }
                    L19: {
                      if (param1.field_r != null) {
                        stackOut_60_0 = param1.field_r[var16];
                        stackIn_61_0 = stackOut_60_0;
                        break L19;
                      } else {
                        stackOut_59_0 = -1;
                        stackIn_61_0 = stackOut_59_0;
                        break L19;
                      }
                    }
                    L20: {
                      var18_int = stackIn_61_0;
                      if (var18_int == -1) {
                        break L20;
                      } else {
                        if ((param5 & 64) == 0) {
                          break L20;
                        } else {
                          var62 = var7.a((byte) 110, var18_int & 65535);
                          if (!var62.field_p) {
                            break L20;
                          } else {
                            var18_int = -1;
                            break L20;
                          }
                        }
                      }
                    }
                    L21: {
                      if (var18_int == -1) {
                        break L21;
                      } else {
                        var14 = 1;
                        this.field_W[var16] = new float[3];
                        var65 = new float[3];
                        var19 = var65;
                        this.field_l[var16] = new float[3];
                        var66 = new float[3];
                        var20 = var66;
                        var21 = 0;
                        if (var17 != -1) {
                          var17 = var17 & 255;
                          var22 = param1.field_u[var17];
                          if (var22 != 0) {
                            var23 = this.field_M[var16];
                            var24 = this.field_bb[var16];
                            var25 = this.field_x[var16];
                            var26 = var11.field_a[var17];
                            var27 = var11.field_c[var17];
                            var28 = var11.field_d[var17];
                            var76 = var11.field_b[var17];
                            var30 = param1.field_z[var17];
                            var31 = (float)param1.field_d[var17] / 256.0f;
                            if (var22 != 1) {
                              if (var22 != 2) {
                                if (var22 != 3) {
                                  break L21;
                                } else {
                                  ifa.a(this.field_T[var23], this.field_xb[var23], var27, var28, var75, var31, var30, var26, var76, (byte) -44, this.field_rb[var23]);
                                  var19[0] = var75[0];
                                  var20[0] = var75[1];
                                  ifa.a(this.field_T[var24], this.field_xb[var24], var27, var28, var75, var31, var30, var26, var76, (byte) -44, this.field_rb[var24]);
                                  var19[1] = var75[0];
                                  var20[1] = var75[1];
                                  ifa.a(this.field_T[var25], this.field_xb[var25], var27, var28, var75, var31, var30, var26, var76, (byte) -44, this.field_rb[var25]);
                                  var19[2] = var75[0];
                                  var20[2] = var75[1];
                                  if ((var30 & 1) != 0) {
                                    L22: {
                                      if (var66[1] - var66[0] <= 0.5f) {
                                        if (var66[0] - var66[1] <= 0.5f) {
                                          break L22;
                                        } else {
                                          var20[1] = var20[1] + 1.0f;
                                          break L22;
                                        }
                                      } else {
                                        var20[1] = var20[1] - 1.0f;
                                        break L22;
                                      }
                                    }
                                    if (var66[2] - var66[0] <= 0.5f) {
                                      if (var66[0] - var66[2] <= 0.5f) {
                                        break L21;
                                      } else {
                                        var20[2] = var20[2] + 1.0f;
                                        break L21;
                                      }
                                    } else {
                                      var20[2] = var20[2] - 1.0f;
                                      break L21;
                                    }
                                  } else {
                                    L23: {
                                      if (var65[1] - var65[0] <= 0.5f) {
                                        if (var65[0] - var65[1] <= 0.5f) {
                                          break L23;
                                        } else {
                                          var19[1] = var19[1] + 1.0f;
                                          break L23;
                                        }
                                      } else {
                                        var19[1] = var19[1] - 1.0f;
                                        break L23;
                                      }
                                    }
                                    if (var65[2] - var65[0] <= 0.5f) {
                                      if (var65[0] - var65[2] <= 0.5f) {
                                        break L21;
                                      } else {
                                        var19[2] = var19[2] + 1.0f;
                                        break L21;
                                      }
                                    } else {
                                      var19[2] = var19[2] - 1.0f;
                                      break L21;
                                    }
                                  }
                                }
                              } else {
                                var32 = (float)param1.field_v[var17] / 256.0f;
                                var33 = (float)param1.field_c[var17] / 256.0f;
                                var34 = this.field_xb[var24] - this.field_xb[var23];
                                var35 = this.field_rb[var24] - this.field_rb[var23];
                                var36 = this.field_T[var24] - this.field_T[var23];
                                var37 = this.field_xb[var25] - this.field_xb[var23];
                                var38 = this.field_rb[var25] - this.field_rb[var23];
                                var39 = this.field_T[var25] - this.field_T[var23];
                                var40 = var35 * var39 - var38 * var36;
                                var41 = var36 * var37 - var39 * var34;
                                var42 = var34 * var38 - var37 * var35;
                                var43 = 64.0f / (float)param1.field_j[var17];
                                var44 = 64.0f / (float)param1.field_f[var17];
                                var45 = 64.0f / (float)param1.field_x[var17];
                                var46 = ((float)var40 * var76[0] + (float)var41 * var76[1] + (float)var42 * var76[2]) / var43;
                                var47 = ((float)var40 * var76[3] + (float)var41 * var76[4] + (float)var42 * var76[5]) / var44;
                                var48 = ((float)var40 * var76[6] + (float)var41 * var76[7] + (float)var42 * var76[8]) / var45;
                                var21 = mr.a(var48, var47, false, var46);
                                as.a(var27, var75, this.field_rb[var23], var26, var33, var28, var32, this.field_xb[var23], var21, this.field_T[var23], -94, var31, var30, var76);
                                var19[0] = var75[0];
                                var20[0] = var75[1];
                                as.a(var27, var75, this.field_rb[var24], var26, var33, var28, var32, this.field_xb[var24], var21, this.field_T[var24], -125, var31, var30, var76);
                                var19[1] = var75[0];
                                var20[1] = var75[1];
                                as.a(var27, var75, this.field_rb[var25], var26, var33, var28, var32, this.field_xb[var25], var21, this.field_T[var25], 73, var31, var30, var76);
                                var19[2] = var75[0];
                                var20[2] = var75[1];
                                break L21;
                              }
                            } else {
                              var32 = (float)param1.field_x[var17] / 1024.0f;
                              loa.a(var30, var75, var32, this.field_T[var23], this.field_rb[var23], 65, var76, var31, var27, var28, this.field_xb[var23], var26);
                              var19[0] = var75[0];
                              var20[0] = var75[1];
                              loa.a(var30, var75, var32, this.field_T[var24], this.field_rb[var24], 64, var76, var31, var27, var28, this.field_xb[var24], var26);
                              var19[1] = var75[0];
                              var20[1] = var75[1];
                              loa.a(var30, var75, var32, this.field_T[var25], this.field_rb[var25], 76, var76, var31, var27, var28, this.field_xb[var25], var26);
                              var19[2] = var75[0];
                              var20[2] = var75[1];
                              var33 = var32 / 2.0f;
                              if ((var30 & 1) != 0) {
                                L24: {
                                  if (var66[1] - var66[0] <= var33) {
                                    if (var66[0] - var66[1] <= var33) {
                                      break L24;
                                    } else {
                                      var20[1] = var20[1] + var32;
                                      break L24;
                                    }
                                  } else {
                                    var20[1] = var20[1] - var32;
                                    break L24;
                                  }
                                }
                                if (var66[2] - var66[0] <= var33) {
                                  if (var66[0] - var66[2] <= var33) {
                                    break L21;
                                  } else {
                                    var20[2] = var20[2] + var32;
                                    break L21;
                                  }
                                } else {
                                  var20[2] = var20[2] - var32;
                                  break L21;
                                }
                              } else {
                                L25: {
                                  if (var65[1] - var65[0] <= var33) {
                                    if (var65[0] - var65[1] <= var33) {
                                      break L25;
                                    } else {
                                      var19[1] = var19[1] + var32;
                                      break L25;
                                    }
                                  } else {
                                    var19[1] = var19[1] - var32;
                                    break L25;
                                  }
                                }
                                if (var65[2] - var65[0] <= var33) {
                                  if (var65[0] - var65[2] <= var33) {
                                    break L21;
                                  } else {
                                    var19[2] = var19[2] + var32;
                                    break L21;
                                  }
                                } else {
                                  var19[2] = var19[2] - var32;
                                  break L21;
                                }
                              }
                            }
                          } else {
                            var23 = this.field_M[var16];
                            var24 = this.field_bb[var16];
                            var25 = this.field_x[var16];
                            var26 = param1.field_s[var17];
                            var27 = param1.field_q[var17];
                            var28 = param1.field_K[var17];
                            var29 = (float)this.field_xb[var26];
                            var30_float = (float)this.field_rb[var26];
                            var31 = (float)this.field_T[var26];
                            var32 = (float)this.field_xb[var27] - var29;
                            var33 = (float)this.field_rb[var27] - var30_float;
                            var34_float = (float)this.field_T[var27] - var31;
                            var35_float = (float)this.field_xb[var28] - var29;
                            var36_float = (float)this.field_rb[var28] - var30_float;
                            var37_float = (float)this.field_T[var28] - var31;
                            var38_float = (float)this.field_xb[var23] - var29;
                            var39_float = (float)this.field_rb[var23] - var30_float;
                            var40_float = (float)this.field_T[var23] - var31;
                            var41_float = (float)this.field_xb[var24] - var29;
                            var42_float = (float)this.field_rb[var24] - var30_float;
                            var43 = (float)this.field_T[var24] - var31;
                            var44 = (float)this.field_xb[var25] - var29;
                            var45 = (float)this.field_rb[var25] - var30_float;
                            var46 = (float)this.field_T[var25] - var31;
                            var47 = var33 * var37_float - var34_float * var36_float;
                            var48 = var34_float * var35_float - var32 * var37_float;
                            var49 = var32 * var36_float - var33 * var35_float;
                            var50 = var36_float * var49 - var37_float * var48;
                            var51 = var37_float * var47 - var35_float * var49;
                            var52 = var35_float * var48 - var36_float * var47;
                            var53 = 1.0f / (var50 * var32 + var51 * var33 + var52 * var34_float);
                            var19[0] = (var50 * var38_float + var51 * var39_float + var52 * var40_float) * var53;
                            var19[1] = (var50 * var41_float + var51 * var42_float + var52 * var43) * var53;
                            var19[2] = (var50 * var44 + var51 * var45 + var52 * var46) * var53;
                            var50 = var33 * var49 - var34_float * var48;
                            var51 = var34_float * var47 - var32 * var49;
                            var52 = var32 * var48 - var33 * var47;
                            var53 = 1.0f / (var50 * var35_float + var51 * var36_float + var52 * var37_float);
                            var20[0] = (var50 * var38_float + var51 * var39_float + var52 * var40_float) * var53;
                            var20[1] = (var50 * var41_float + var51 * var42_float + var52 * var43) * var53;
                            var20[2] = (var50 * var44 + var51 * var45 + var52 * var46) * var53;
                            break L21;
                          }
                        } else {
                          var19[0] = 0.0f;
                          var20[0] = 1.0f;
                          var19[1] = 1.0f;
                          var20[1] = 1.0f;
                          var19[2] = 0.0f;
                          var20[2] = 0.0f;
                          break L21;
                        }
                      }
                    }
                    var15++;
                    continue L6;
                  }
                }
              } else {
                L26: {
                  var12 = var74[var11_int];
                  var13 = null;
                  var14 = 0;
                  var15 = 0;
                  var16 = 0;
                  var17 = 0;
                  if (param1.field_m == null) {
                    break L26;
                  } else {
                    var18_int = 0;
                    var19_int = 0;
                    L27: while (true) {
                      if (var19_int >= param1.field_m.length) {
                        if (var18_int == 0) {
                          break L26;
                        } else {
                          var9[var11_int] = 9223372036854775807L;
                          break L26;
                        }
                      } else {
                        var56 = param1.field_m[var19_int];
                        if (var12 == var56.field_a) {
                          L28: {
                            var21_ref_lp = fw.a(var56.field_d, false);
                            if (!var21_ref_lp.field_i) {
                              break L28;
                            } else {
                              var18_int = 1;
                              break L28;
                            }
                          }
                          if (var21_ref_lp.field_f != -1) {
                            var22_ref_dw = var7.a((byte) -71, var21_ref_lp.field_f);
                            if (var22_ref_dw.field_d == 2) {
                              this.field_ab = true;
                              var19_int++;
                              continue L27;
                            } else {
                              var19_int++;
                              continue L27;
                            }
                          } else {
                            var19_int++;
                            continue L27;
                          }
                        } else {
                          var19_int++;
                          continue L27;
                        }
                      }
                    }
                  }
                }
                L29: {
                  var18_int = -1;
                  if (param1.field_r == null) {
                    break L29;
                  } else {
                    var18_int = param1.field_r[var12];
                    if (var18_int == -1) {
                      break L29;
                    } else {
                      L30: {
                        var57 = var7.a((byte) -126, var18_int & 65535);
                        var13 = var57;
                        if ((param5 & 64) == 0) {
                          break L30;
                        } else {
                          if (var57.field_p) {
                            var18_int = -1;
                            break L29;
                          } else {
                            break L30;
                          }
                        }
                      }
                      var16 = var57.field_h;
                      var17 = var57.field_a;
                      break L29;
                    }
                  }
                }
                L31: {
                  L32: {
                    if (this.field_h == null) {
                      break L32;
                    } else {
                      if (this.field_h[var12] == 0) {
                        break L32;
                      } else {
                        stackOut_30_0 = 1;
                        stackIn_37_0 = stackOut_30_0;
                        break L31;
                      }
                    }
                  }
                  if (var13 != null) {
                    if (((dw) (var13)).field_d == 2) {
                      stackOut_35_0 = 1;
                      stackIn_37_0 = stackOut_35_0;
                      break L31;
                    } else {
                      stackOut_34_0 = 0;
                      stackIn_37_0 = stackOut_34_0;
                      break L31;
                    }
                  } else {
                    stackOut_32_0 = 0;
                    stackIn_37_0 = stackOut_32_0;
                    break L31;
                  }
                }
                L33: {
                  L34: {
                    var19_int = stackIn_37_0;
                    if (var10 != 0) {
                      break L34;
                    } else {
                      if (var19_int == 0) {
                        break L33;
                      } else {
                        break L34;
                      }
                    }
                  }
                  if (this.field_wb == null) {
                    break L33;
                  } else {
                    var14 = var14 + (this.field_wb[var12] << 17);
                    break L33;
                  }
                }
                L35: {
                  if (var19_int == 0) {
                    break L35;
                  } else {
                    var14 = var14 + 65536;
                    break L35;
                  }
                }
                var14 = var14 + ((var16 & 255) << 8);
                var14 = var14 + (var17 & 255);
                var15 = var15 + ((var18_int & 65535) << 16);
                var15 = var15 + (var11_int & 65535);
                var9[var11_int] = ((long)var14 << 32) + (long)var15;
                if (var19_int != 0) {
                  this.field_ab = true;
                  var11_int++;
                  continue L2;
                } else {
                  var11_int++;
                  continue L2;
                }
              }
            }
          } else {
            var74[var9_int] = var9_int;
            var9_int++;
            continue L0;
          }
        }
    }

    static {
        field_Hb = "FMT";
        field_G = 4096;
        field_q = 4096;
    }
}
