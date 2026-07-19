/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bn extends gf {
    private int[][] field_m;
    cb[] field_A;
    private byte[] field_k;
    private byte[] field_E;
    short[] field_x;
    byte[] field_Q;
    private short[] field_L;
    private byte field_t;
    int field_y;
    int[] field_O;
    private byte[] field_z;
    private short[] field_S;
    int[] field_v;
    int[] field_C;
    int[] field_P;
    int field_q;
    int[] field_N;
    short[] field_J;
    cb[] field_o;
    int field_R;
    short[] field_B;
    byte[] field_G;
    byte[] field_l;
    private byte[] field_u;
    private short[] field_s;
    private int[] field_r;
    private short[] field_H;
    private int[][] field_M;
    private byte[] field_i;
    int[] field_K;
    int field_h;
    byte[] field_w;
    byte[] field_D;
    private short[] field_F;
    short[] field_n;
    short[] field_j;
    private int[] field_I;
    fh[] field_p;

    final void d() {
        int[] array$2 = null;
        int[] array$3 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var6 = null;
        L0: {
          if (this.field_I == null) {
            break L0;
          } else {
            var5 = new int[256];
            var2 = 0;
            var3 = 0;
            L1: while (true) {
              if (var3 >= this.field_h) {
                this.field_M = new int[var2 + 1][];
                var3 = 0;
                L2: while (true) {
                  if (var3 > var2) {
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= this.field_h) {
                        this.field_I = null;
                        break L0;
                      } else {
                        var4 = this.field_I[var3];
                        var5[var4] = var5[var4] + 1;
                        this.field_M[var4][var5[var4]] = var3;
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    array$2 = new int[var5[var3]];
                    this.field_M[var3] = array$2;
                    var5[var3] = 0;
                    var3++;
                    continue L2;
                  }
                }
              } else {
                var4 = this.field_I[var3];
                var5[var4] = var5[var4] + 1;
                if (var4 > var2) {
                  var2 = var4;
                  var3++;
                  continue L1;
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
        L4: {
          if (this.field_r == null) {
            break L4;
          } else {
            var6 = new int[256];
            var2 = 0;
            var3 = 0;
            L5: while (true) {
              if (var3 >= this.field_y) {
                this.field_m = new int[var2 + 1][];
                var3 = 0;
                L6: while (true) {
                  if (var3 > var2) {
                    var3 = 0;
                    L7: while (true) {
                      if (var3 >= this.field_y) {
                        this.field_r = null;
                        break L4;
                      } else {
                        var4 = this.field_r[var3];
                        var6[var4] = var6[var4] + 1;
                        this.field_m[var4][var6[var4]] = var3;
                        var3++;
                        continue L7;
                      }
                    }
                  } else {
                    array$3 = new int[var6[var3]];
                    this.field_m[var3] = array$3;
                    var6[var3] = 0;
                    var3++;
                    continue L6;
                  }
                }
              } else {
                var4 = this.field_r[var3];
                var6[var4] = var6[var4] + 1;
                if (var4 > var2) {
                  var2 = var4;
                  var3++;
                  continue L5;
                } else {
                  var3++;
                  continue L5;
                }
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        for (var5 = 0; var5 < this.field_h; var5++) {
            this.field_K[var5] = this.field_K[var5] * param0 / param3;
            this.field_C[var5] = this.field_C[var5] * param1 / param3;
            this.field_v[var5] = this.field_v[var5] * param2 / param3;
        }
        this.a();
    }

    private final void a() {
        this.field_o = null;
        this.field_A = null;
        this.field_p = null;
    }

    final void c() {
        int var1 = 0;
        for (var1 = 0; var1 < this.field_h; var1++) {
            this.field_K[var1] = -this.field_K[var1];
            this.field_v[var1] = -this.field_v[var1];
        }
        this.a();
    }

    private final void a(byte[] param0) {
        int var2 = 0;
        int var3 = 0;
        p var4 = null;
        p var5 = null;
        p var6 = null;
        p var7 = null;
        p var8 = null;
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
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        L0: {
          var2 = 0;
          var3 = 0;
          var4 = new p(param0);
          var5 = new p(param0);
          var6 = new p(param0);
          var7 = new p(param0);
          var8 = new p(param0);
          var4.field_l = param0.length - 18;
          var9 = var4.f(674914976);
          var10 = var4.f(674914976);
          var11 = var4.i(-96);
          var12 = var4.i(-102);
          var13 = var4.i(-97);
          var14 = var4.i(-81);
          var15 = var4.i(-121);
          var16 = var4.i(-100);
          var17 = var4.f(674914976);
          var18 = var4.f(674914976);
          var19 = var4.f(674914976);
          var20 = var4.f(674914976);
          var21 = 0;
          var22 = var21;
          var21 = var21 + var9;
          var23 = var21;
          var21 = var21 + var10;
          var24 = var21;
          if (var13 != 255) {
            break L0;
          } else {
            var21 = var21 + var10;
            break L0;
          }
        }
        L1: {
          var25 = var21;
          if (var15 != 1) {
            break L1;
          } else {
            var21 = var21 + var10;
            break L1;
          }
        }
        L2: {
          var26 = var21;
          if (var12 != 1) {
            break L2;
          } else {
            var21 = var21 + var10;
            break L2;
          }
        }
        L3: {
          var27 = var21;
          if (var16 != 1) {
            break L3;
          } else {
            var21 = var21 + var9;
            break L3;
          }
        }
        L4: {
          var28 = var21;
          if (var14 != 1) {
            break L4;
          } else {
            var21 = var21 + var10;
            break L4;
          }
        }
        L5: {
          var29 = var21;
          var21 = var21 + var20;
          var30 = var21;
          var21 = var21 + var10 * 2;
          var31 = var21;
          var21 = var21 + var11 * 6;
          var32 = var21;
          var21 = var21 + var17;
          var33 = var21;
          var21 = var21 + var18;
          var34 = var21;
          var21 = var21 + var19;
          this.field_h = var9;
          this.field_y = var10;
          this.field_R = var11;
          this.field_K = new int[var9];
          this.field_C = new int[var9];
          this.field_v = new int[var9];
          this.field_P = new int[var10];
          this.field_O = new int[var10];
          this.field_N = new int[var10];
          if (var11 <= 0) {
            break L5;
          } else {
            this.field_l = new byte[var11];
            this.field_J = new short[var11];
            this.field_n = new short[var11];
            this.field_x = new short[var11];
            break L5;
          }
        }
        L6: {
          if (var16 != 1) {
            break L6;
          } else {
            this.field_I = new int[var9];
            break L6;
          }
        }
        L7: {
          if (var12 != 1) {
            break L7;
          } else {
            this.field_G = new byte[var10];
            this.field_Q = new byte[var10];
            this.field_B = new short[var10];
            break L7;
          }
        }
        L8: {
          if (var13 != 255) {
            this.field_t = (byte)var13;
            break L8;
          } else {
            this.field_w = new byte[var10];
            break L8;
          }
        }
        L9: {
          if (var14 != 1) {
            break L9;
          } else {
            this.field_D = new byte[var10];
            break L9;
          }
        }
        L10: {
          if (var15 != 1) {
            break L10;
          } else {
            this.field_r = new int[var10];
            break L10;
          }
        }
        this.field_j = new short[var10];
        var4.field_l = var22;
        var5.field_l = var32;
        var6.field_l = var33;
        var7.field_l = var34;
        var8.field_l = var27;
        var35 = 0;
        var36 = 0;
        var37 = 0;
        var38 = 0;
        L11: while (true) {
          if (var38 >= var9) {
            var4.field_l = var30;
            var5.field_l = var26;
            var6.field_l = var24;
            var7.field_l = var28;
            var8.field_l = var25;
            var38 = 0;
            L12: while (true) {
              if (var38 >= var10) {
                this.field_q = -1;
                var4.field_l = var29;
                var5.field_l = var23;
                var38 = 0;
                var39 = 0;
                var40 = 0;
                var41 = 0;
                var42 = 0;
                L13: while (true) {
                  if (var42 >= var10) {
                    this.field_q = this.field_q + 1;
                    var4.field_l = var31;
                    var42 = 0;
                    L14: while (true) {
                      if (var42 >= var11) {
                        L15: {
                          if (this.field_Q == null) {
                            break L15;
                          } else {
                            var42 = 0;
                            var45 = 0;
                            var43 = var45;
                            L16: while (true) {
                              if (var45 >= var10) {
                                if (var42 != 0) {
                                  break L15;
                                } else {
                                  this.field_Q = null;
                                  break L15;
                                }
                              } else {
                                var44 = this.field_Q[var45] & 255;
                                if (var44 != 255) {
                                  L17: {
                                    if ((this.field_J[var44] & 65535) != this.field_P[var45]) {
                                      break L17;
                                    } else {
                                      if ((this.field_n[var44] & 65535) != this.field_O[var45]) {
                                        break L17;
                                      } else {
                                        if ((this.field_x[var44] & 65535) != this.field_N[var45]) {
                                          break L17;
                                        } else {
                                          this.field_Q[var45] = (byte)-1;
                                          var45++;
                                          continue L16;
                                        }
                                      }
                                    }
                                  }
                                  var42 = 1;
                                  var45++;
                                  continue L16;
                                } else {
                                  var45++;
                                  continue L16;
                                }
                              }
                            }
                          }
                        }
                        L18: {
                          if (var3 != 0) {
                            break L18;
                          } else {
                            this.field_B = null;
                            break L18;
                          }
                        }
                        L19: {
                          if (var2 != 0) {
                            break L19;
                          } else {
                            this.field_G = null;
                            break L19;
                          }
                        }
                        return;
                      } else {
                        this.field_l[var42] = (byte) 0;
                        this.field_J[var42] = (short)var4.f(674914976);
                        this.field_n[var42] = (short)var4.f(674914976);
                        this.field_x[var42] = (short)var4.f(674914976);
                        var42++;
                        continue L14;
                      }
                    }
                  } else {
                    L20: {
                      var43 = var5.i(-99);
                      if (var43 != 1) {
                        break L20;
                      } else {
                        L21: {
                          var38 = var4.a(false) + var41;
                          var41 = var38;
                          var39 = var4.a(false) + var41;
                          var41 = var39;
                          var40 = var4.a(false) + var41;
                          var41 = var40;
                          this.field_P[var42] = var38;
                          this.field_O[var42] = var39;
                          this.field_N[var42] = var40;
                          if (var38 <= this.field_q) {
                            break L21;
                          } else {
                            this.field_q = var38;
                            break L21;
                          }
                        }
                        L22: {
                          if (var39 <= this.field_q) {
                            break L22;
                          } else {
                            this.field_q = var39;
                            break L22;
                          }
                        }
                        if (var40 <= this.field_q) {
                          break L20;
                        } else {
                          this.field_q = var40;
                          break L20;
                        }
                      }
                    }
                    L23: {
                      if (var43 != 2) {
                        break L23;
                      } else {
                        var39 = var40;
                        var40 = var4.a(false) + var41;
                        var41 = var40;
                        this.field_P[var42] = var38;
                        this.field_O[var42] = var39;
                        this.field_N[var42] = var40;
                        if (var40 <= this.field_q) {
                          break L23;
                        } else {
                          this.field_q = var40;
                          break L23;
                        }
                      }
                    }
                    L24: {
                      if (var43 != 3) {
                        break L24;
                      } else {
                        var38 = var40;
                        var40 = var4.a(false) + var41;
                        var41 = var40;
                        this.field_P[var42] = var38;
                        this.field_O[var42] = var39;
                        this.field_N[var42] = var40;
                        if (var40 <= this.field_q) {
                          break L24;
                        } else {
                          this.field_q = var40;
                          break L24;
                        }
                      }
                    }
                    if (var43 == 4) {
                      var44 = var38;
                      var38 = var39;
                      var39 = var44;
                      var40 = var4.a(false) + var41;
                      var41 = var40;
                      this.field_P[var42] = var38;
                      this.field_O[var42] = var39;
                      this.field_N[var42] = var40;
                      if (var40 > this.field_q) {
                        this.field_q = var40;
                        var42++;
                        continue L13;
                      } else {
                        var42++;
                        continue L13;
                      }
                    } else {
                      var42++;
                      continue L13;
                    }
                  }
                }
              } else {
                L25: {
                  this.field_j[var38] = (short)var4.f(674914976);
                  if (var12 != 1) {
                    break L25;
                  } else {
                    L26: {
                      var39 = var5.i(-119);
                      if ((var39 & 1) != 1) {
                        this.field_G[var38] = (byte) 0;
                        break L26;
                      } else {
                        this.field_G[var38] = (byte) 1;
                        var2 = 1;
                        break L26;
                      }
                    }
                    if ((var39 & 2) != 2) {
                      this.field_Q[var38] = (byte)-1;
                      this.field_B[var38] = (short)-1;
                      break L25;
                    } else {
                      this.field_Q[var38] = (byte)(var39 >> 2);
                      this.field_B[var38] = this.field_j[var38];
                      this.field_j[var38] = (short)127;
                      if (this.field_B[var38] == -1) {
                        break L25;
                      } else {
                        var3 = 1;
                        break L25;
                      }
                    }
                  }
                }
                L27: {
                  if (var13 != 255) {
                    break L27;
                  } else {
                    this.field_w[var38] = var6.g(0);
                    break L27;
                  }
                }
                L28: {
                  if (var14 != 1) {
                    break L28;
                  } else {
                    this.field_D[var38] = var7.g(0);
                    break L28;
                  }
                }
                if (var15 == 1) {
                  this.field_r[var38] = var8.i(-110);
                  var38++;
                  continue L12;
                } else {
                  var38++;
                  continue L12;
                }
              }
            }
          } else {
            L29: {
              var39 = var4.i(-79);
              var40 = 0;
              if ((var39 & 1) == 0) {
                break L29;
              } else {
                var40 = var5.a(false);
                break L29;
              }
            }
            L30: {
              var41 = 0;
              if ((var39 & 2) == 0) {
                break L30;
              } else {
                var41 = var6.a(false);
                break L30;
              }
            }
            L31: {
              var42 = 0;
              if ((var39 & 4) == 0) {
                break L31;
              } else {
                var42 = var7.a(false);
                break L31;
              }
            }
            this.field_K[var38] = var35 + var40;
            this.field_C[var38] = var36 + var41;
            this.field_v[var38] = var37 + var42;
            var35 = this.field_K[var38];
            var36 = this.field_C[var38];
            var37 = this.field_v[var38];
            if (var16 == 1) {
              this.field_I[var38] = var8.i(-104);
              var38++;
              continue L11;
            } else {
              var38++;
              continue L11;
            }
          }
        }
    }

    private final int a(bn param0, int param1, short param2) {
        int fieldTemp$1 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var4 = param0.field_K[param1];
        var5 = param0.field_C[param1];
        var6 = param0.field_v[param1];
        var7 = 0;
        L0: while (true) {
          if (var7 >= this.field_h) {
            L1: {
              this.field_K[this.field_h] = var4;
              this.field_C[this.field_h] = var5;
              this.field_v[this.field_h] = var6;
              this.field_L[this.field_h] = (short)param2;
              if (param0.field_I == null) {
                break L1;
              } else {
                this.field_I[this.field_h] = param0.field_I[param1];
                break L1;
              }
            }
            fieldTemp$1 = this.field_h;
            this.field_h = this.field_h + 1;
            return fieldTemp$1;
          } else {
            if (var4 == this.field_K[var7]) {
              if (var5 == this.field_C[var7]) {
                if (var6 == this.field_v[var7]) {
                  this.field_L[var7] = (short)(this.field_L[var7] | param2);
                  return var7;
                } else {
                  var7++;
                  continue L0;
                }
              } else {
                var7++;
                continue L0;
              }
            } else {
              var7++;
              continue L0;
            }
          }
        }
    }

    final void a(int[] param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        for (var2 = 0; var2 < this.field_h; var2++) {
            var3 = this.field_K[var2];
            var4 = this.field_C[var2];
            var5 = this.field_v[var2];
            this.field_K[var2] = param0[0] + (var3 * param0[3] + var4 * param0[6] + var5 * param0[9] >> 16);
            this.field_C[var2] = param0[1] + (var3 * param0[4] + var4 * param0[7] + var5 * param0[10] >> 16);
            this.field_v[var2] = param0[2] + (var3 * param0[5] + var4 * param0[8] + var5 * param0[11] >> 16);
        }
        this.a();
    }

    final static bn a(um param0, String param1, String param2) {
        byte[] var3 = param0.a(param1, 30045, param2);
        if (var3 == null) {
            return null;
        }
        return new bn(var3);
    }

    final kk a(int param0, int param1, int param2, int param3, int param4) {
        return (kk) ((Object) new dd((bn) (this), param0, param1, param2, param3, param4));
    }

    final void b() {
        fh dupTemp$1 = null;
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
        fh var16 = null;
        cb var17 = null;
        cb var18 = null;
        cb var19 = null;
        if (this.field_o == null) {
          this.field_o = new cb[this.field_q];
          var1 = 0;
          L0: while (true) {
            if (var1 >= this.field_q) {
              var1 = 0;
              L1: while (true) {
                if (var1 >= this.field_y) {
                  return;
                } else {
                  var2 = this.field_P[var1];
                  var3 = this.field_O[var1];
                  var4 = this.field_N[var1];
                  var5 = this.field_K[var3] - this.field_K[var2];
                  var6 = this.field_C[var3] - this.field_C[var2];
                  var7 = this.field_v[var3] - this.field_v[var2];
                  var8 = this.field_K[var4] - this.field_K[var2];
                  var9 = this.field_C[var4] - this.field_C[var2];
                  var10 = this.field_v[var4] - this.field_v[var2];
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
                                    if (this.field_G != null) {
                                      var15 = this.field_G[var1];
                                      break L5;
                                    } else {
                                      var15 = 0;
                                      break L5;
                                    }
                                  }
                                  if (var15 != 0) {
                                    if (var15 == 1) {
                                      L6: {
                                        if (this.field_p != null) {
                                          break L6;
                                        } else {
                                          this.field_p = new fh[this.field_y];
                                          break L6;
                                        }
                                      }
                                      dupTemp$1 = new fh();
                                      this.field_p[var1] = dupTemp$1;
                                      var16 = dupTemp$1;
                                      var16.field_f = var11;
                                      var16.field_a = var12;
                                      var16.field_c = var13;
                                      var1++;
                                      continue L1;
                                    } else {
                                      var1++;
                                      continue L1;
                                    }
                                  } else {
                                    var17 = this.field_o[var2];
                                    var17.field_j = var17.field_j + var11;
                                    var17.field_d = var17.field_d + var12;
                                    var17.field_i = var17.field_i + var13;
                                    var17.field_g = var17.field_g + 1;
                                    var18 = this.field_o[var3];
                                    var18.field_j = var18.field_j + var11;
                                    var18.field_d = var18.field_d + var12;
                                    var18.field_i = var18.field_i + var13;
                                    var18.field_g = var18.field_g + 1;
                                    var19 = this.field_o[var4];
                                    var19.field_j = var19.field_j + var11;
                                    var19.field_d = var19.field_d + var12;
                                    var19.field_i = var19.field_i + var13;
                                    var19.field_g = var19.field_g + 1;
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
              this.field_o[var1] = new cb();
              var1++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final int a(int param0, int param1, int param2, byte param3, byte param4, short param5, short param6) {
        this.field_P[this.field_y] = param0;
        this.field_O[this.field_y] = param1;
        this.field_N[this.field_y] = param2;
        this.field_G[this.field_y] = (byte)param3;
        this.field_Q[this.field_y] = (byte)param4;
        this.field_j[this.field_y] = (short)param5;
        this.field_B[this.field_y] = (short)param6;
        int fieldTemp$0 = this.field_y;
        this.field_y = this.field_y + 1;
        return fieldTemp$0;
    }

    final int a(int param0, int param1, int param2) {
        int fieldTemp$1 = 0;
        int var4 = 0;
        var4 = 0;
        L0: while (true) {
          if (var4 >= this.field_h) {
            this.field_K[this.field_h] = param0;
            this.field_C[this.field_h] = param1;
            this.field_v[this.field_h] = param2;
            fieldTemp$1 = this.field_h + 1;
            this.field_h = this.field_h + 1;
            this.field_q = fieldTemp$1;
            return this.field_h - 1;
          } else {
            if (this.field_K[var4] == param0) {
              if (this.field_C[var4] == param1) {
                if (this.field_v[var4] == param2) {
                  return var4;
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                continue L0;
              }
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    private final void b(byte[] param0) {
        byte dupTemp$1 = 0;
        p var2 = null;
        p var3 = null;
        p var4 = null;
        p var5 = null;
        p var6 = null;
        p var7 = null;
        p var8 = null;
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
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        int var57 = 0;
        int var58 = 0;
        int var59 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var2 = new p(param0);
          var3 = new p(param0);
          var4 = new p(param0);
          var5 = new p(param0);
          var6 = new p(param0);
          var7 = new p(param0);
          var8 = new p(param0);
          var2.field_l = param0.length - 23;
          var9 = var2.f(674914976);
          var10 = var2.f(674914976);
          var11 = var2.i(-77);
          var12 = var2.i(-87);
          if ((var12 & 1) != 1) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var13 = stackIn_3_0;
          if ((var12 & 2) != 2) {
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 1;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var14 = stackIn_6_0;
          var15 = var2.i(-82);
          var16 = var2.i(-123);
          var17 = var2.i(-109);
          var18 = var2.i(-90);
          var19 = var2.i(-92);
          var20 = var2.f(674914976);
          var21 = var2.f(674914976);
          var22 = var2.f(674914976);
          var23 = var2.f(674914976);
          var24 = var2.f(674914976);
          var25 = 0;
          var26 = 0;
          var27 = 0;
          if (var11 <= 0) {
            break L2;
          } else {
            this.field_l = new byte[var11];
            var2.field_l = 0;
            var28 = 0;
            L3: while (true) {
              if (var28 >= var11) {
                break L2;
              } else {
                L4: {
                  dupTemp$1 = var2.g(0);
                  this.field_l[var28] = dupTemp$1;
                  var29 = dupTemp$1;
                  if (var29 != 0) {
                    break L4;
                  } else {
                    var25++;
                    break L4;
                  }
                }
                L5: {
                  if (var29 < 1) {
                    break L5;
                  } else {
                    if (var29 > 3) {
                      break L5;
                    } else {
                      var26++;
                      break L5;
                    }
                  }
                }
                if (var29 == 2) {
                  var27++;
                  var28++;
                  continue L3;
                } else {
                  var28++;
                  continue L3;
                }
              }
            }
          }
        }
        L6: {
          var28 = var11;
          var29 = var28;
          var28 = var28 + var9;
          var30 = var28;
          if (var13 == 0) {
            break L6;
          } else {
            var28 = var28 + var10;
            break L6;
          }
        }
        L7: {
          var31 = var28;
          var28 = var28 + var10;
          var32 = var28;
          if (var15 != 255) {
            break L7;
          } else {
            var28 = var28 + var10;
            break L7;
          }
        }
        L8: {
          var33 = var28;
          if (var17 != 1) {
            break L8;
          } else {
            var28 = var28 + var10;
            break L8;
          }
        }
        L9: {
          var34 = var28;
          if (var19 != 1) {
            break L9;
          } else {
            var28 = var28 + var9;
            break L9;
          }
        }
        L10: {
          var35 = var28;
          if (var16 != 1) {
            break L10;
          } else {
            var28 = var28 + var10;
            break L10;
          }
        }
        L11: {
          var36 = var28;
          var28 = var28 + var23;
          var37 = var28;
          if (var18 != 1) {
            break L11;
          } else {
            var28 = var28 + var10 * 2;
            break L11;
          }
        }
        L12: {
          var38 = var28;
          var28 = var28 + var24;
          var39 = var28;
          var28 = var28 + var10 * 2;
          var40 = var28;
          var28 = var28 + var20;
          var41 = var28;
          var28 = var28 + var21;
          var42 = var28;
          var28 = var28 + var22;
          var43 = var28;
          var28 = var28 + var25 * 6;
          var44 = var28;
          var28 = var28 + var26 * 6;
          var45 = var28;
          var28 = var28 + var26 * 6;
          var46 = var28;
          var28 = var28 + var26;
          var47 = var28;
          var28 = var28 + var26;
          var48 = var28;
          var28 = var28 + (var26 + var27 * 2);
          var49 = var28;
          this.field_h = var9;
          this.field_y = var10;
          this.field_R = var11;
          this.field_K = new int[var9];
          this.field_C = new int[var9];
          this.field_v = new int[var9];
          this.field_P = new int[var10];
          this.field_O = new int[var10];
          this.field_N = new int[var10];
          if (var19 != 1) {
            break L12;
          } else {
            this.field_I = new int[var9];
            break L12;
          }
        }
        L13: {
          if (var13 == 0) {
            break L13;
          } else {
            this.field_G = new byte[var10];
            break L13;
          }
        }
        L14: {
          if (var15 != 255) {
            this.field_t = (byte)var15;
            break L14;
          } else {
            this.field_w = new byte[var10];
            break L14;
          }
        }
        L15: {
          if (var16 != 1) {
            break L15;
          } else {
            this.field_D = new byte[var10];
            break L15;
          }
        }
        L16: {
          if (var17 != 1) {
            break L16;
          } else {
            this.field_r = new int[var10];
            break L16;
          }
        }
        L17: {
          if (var18 != 1) {
            break L17;
          } else {
            this.field_B = new short[var10];
            break L17;
          }
        }
        L18: {
          if (var18 != 1) {
            break L18;
          } else {
            if (var11 <= 0) {
              break L18;
            } else {
              this.field_Q = new byte[var10];
              break L18;
            }
          }
        }
        L19: {
          this.field_j = new short[var10];
          if (var11 <= 0) {
            break L19;
          } else {
            L20: {
              this.field_J = new short[var11];
              this.field_n = new short[var11];
              this.field_x = new short[var11];
              if (var26 <= 0) {
                break L20;
              } else {
                this.field_s = new short[var26];
                this.field_S = new short[var26];
                this.field_H = new short[var26];
                this.field_z = new byte[var26];
                this.field_k = new byte[var26];
                this.field_u = new byte[var26];
                break L20;
              }
            }
            if (var27 <= 0) {
              break L19;
            } else {
              this.field_E = new byte[var27];
              this.field_i = new byte[var27];
              break L19;
            }
          }
        }
        var2.field_l = var29;
        var3.field_l = var40;
        var4.field_l = var41;
        var5.field_l = var42;
        var6.field_l = var34;
        var50 = 0;
        var51 = 0;
        var52 = 0;
        var53 = 0;
        L21: while (true) {
          if (var53 >= var9) {
            var2.field_l = var39;
            var3.field_l = var30;
            var4.field_l = var32;
            var5.field_l = var35;
            var6.field_l = var33;
            var7.field_l = var37;
            var8.field_l = var38;
            var53 = 0;
            L22: while (true) {
              if (var53 >= var10) {
                this.field_q = -1;
                var2.field_l = var36;
                var3.field_l = var31;
                var53 = 0;
                var54 = 0;
                var55 = 0;
                var56 = 0;
                var57 = 0;
                L23: while (true) {
                  if (var57 >= var10) {
                    this.field_q = this.field_q + 1;
                    var2.field_l = var43;
                    var3.field_l = var44;
                    var4.field_l = var45;
                    var5.field_l = var46;
                    var6.field_l = var47;
                    var7.field_l = var48;
                    var57 = 0;
                    L24: while (true) {
                      if (var57 >= var11) {
                        L25: {
                          if (var14 == 0) {
                            break L25;
                          } else {
                            L26: {
                              var2.field_l = var49;
                              var57 = var2.i(-90);
                              if (var57 <= 0) {
                                break L26;
                              } else {
                                var2.field_l = var2.field_l + 4 * var57;
                                break L26;
                              }
                            }
                            var58 = var2.i(-80);
                            if (var58 <= 0) {
                              break L25;
                            } else {
                              var2.field_l = var2.field_l + 4 * var58;
                              break L25;
                            }
                          }
                        }
                        return;
                      } else {
                        L27: {
                          var58 = this.field_l[var57] & 255;
                          if (var58 != 0) {
                            break L27;
                          } else {
                            this.field_J[var57] = (short)var2.f(674914976);
                            this.field_n[var57] = (short)var2.f(674914976);
                            this.field_x[var57] = (short)var2.f(674914976);
                            break L27;
                          }
                        }
                        L28: {
                          if (var58 != 1) {
                            break L28;
                          } else {
                            this.field_J[var57] = (short)var3.f(674914976);
                            this.field_n[var57] = (short)var3.f(674914976);
                            this.field_x[var57] = (short)var3.f(674914976);
                            this.field_s[var57] = (short)var4.f(674914976);
                            this.field_S[var57] = (short)var4.f(674914976);
                            this.field_H[var57] = (short)var4.f(674914976);
                            this.field_z[var57] = var5.g(0);
                            this.field_k[var57] = var6.g(0);
                            this.field_u[var57] = var7.g(0);
                            break L28;
                          }
                        }
                        L29: {
                          if (var58 != 2) {
                            break L29;
                          } else {
                            this.field_J[var57] = (short)var3.f(674914976);
                            this.field_n[var57] = (short)var3.f(674914976);
                            this.field_x[var57] = (short)var3.f(674914976);
                            this.field_s[var57] = (short)var4.f(674914976);
                            this.field_S[var57] = (short)var4.f(674914976);
                            this.field_H[var57] = (short)var4.f(674914976);
                            this.field_z[var57] = var5.g(0);
                            this.field_k[var57] = var6.g(0);
                            this.field_u[var57] = var7.g(0);
                            this.field_E[var57] = var7.g(0);
                            this.field_i[var57] = var7.g(0);
                            break L29;
                          }
                        }
                        if (var58 == 3) {
                          this.field_J[var57] = (short)var3.f(674914976);
                          this.field_n[var57] = (short)var3.f(674914976);
                          this.field_x[var57] = (short)var3.f(674914976);
                          this.field_s[var57] = (short)var4.f(674914976);
                          this.field_S[var57] = (short)var4.f(674914976);
                          this.field_H[var57] = (short)var4.f(674914976);
                          this.field_z[var57] = var5.g(0);
                          this.field_k[var57] = var6.g(0);
                          this.field_u[var57] = var7.g(0);
                          var57++;
                          continue L24;
                        } else {
                          var57++;
                          continue L24;
                        }
                      }
                    }
                  } else {
                    L30: {
                      var58 = var3.i(-101);
                      if (var58 != 1) {
                        break L30;
                      } else {
                        L31: {
                          var53 = var2.a(false) + var56;
                          var56 = var53;
                          var54 = var2.a(false) + var56;
                          var56 = var54;
                          var55 = var2.a(false) + var56;
                          var56 = var55;
                          this.field_P[var57] = var53;
                          this.field_O[var57] = var54;
                          this.field_N[var57] = var55;
                          if (var53 <= this.field_q) {
                            break L31;
                          } else {
                            this.field_q = var53;
                            break L31;
                          }
                        }
                        L32: {
                          if (var54 <= this.field_q) {
                            break L32;
                          } else {
                            this.field_q = var54;
                            break L32;
                          }
                        }
                        if (var55 <= this.field_q) {
                          break L30;
                        } else {
                          this.field_q = var55;
                          break L30;
                        }
                      }
                    }
                    L33: {
                      if (var58 != 2) {
                        break L33;
                      } else {
                        var54 = var55;
                        var55 = var2.a(false) + var56;
                        var56 = var55;
                        this.field_P[var57] = var53;
                        this.field_O[var57] = var54;
                        this.field_N[var57] = var55;
                        if (var55 <= this.field_q) {
                          break L33;
                        } else {
                          this.field_q = var55;
                          break L33;
                        }
                      }
                    }
                    L34: {
                      if (var58 != 3) {
                        break L34;
                      } else {
                        var53 = var55;
                        var55 = var2.a(false) + var56;
                        var56 = var55;
                        this.field_P[var57] = var53;
                        this.field_O[var57] = var54;
                        this.field_N[var57] = var55;
                        if (var55 <= this.field_q) {
                          break L34;
                        } else {
                          this.field_q = var55;
                          break L34;
                        }
                      }
                    }
                    if (var58 == 4) {
                      var59 = var53;
                      var53 = var54;
                      var54 = var59;
                      var55 = var2.a(false) + var56;
                      var56 = var55;
                      this.field_P[var57] = var53;
                      this.field_O[var57] = var54;
                      this.field_N[var57] = var55;
                      if (var55 > this.field_q) {
                        this.field_q = var55;
                        var57++;
                        continue L23;
                      } else {
                        var57++;
                        continue L23;
                      }
                    } else {
                      var57++;
                      continue L23;
                    }
                  }
                }
              } else {
                L35: {
                  this.field_j[var53] = (short)var2.f(674914976);
                  if (var13 == 0) {
                    break L35;
                  } else {
                    this.field_G[var53] = var3.g(0);
                    break L35;
                  }
                }
                L36: {
                  if (var15 != 255) {
                    break L36;
                  } else {
                    this.field_w[var53] = var4.g(0);
                    break L36;
                  }
                }
                L37: {
                  if (var16 != 1) {
                    break L37;
                  } else {
                    this.field_D[var53] = var5.g(0);
                    break L37;
                  }
                }
                L38: {
                  if (var17 != 1) {
                    break L38;
                  } else {
                    this.field_r[var53] = var6.i(-111);
                    break L38;
                  }
                }
                L39: {
                  if (var18 != 1) {
                    break L39;
                  } else {
                    this.field_B[var53] = (short)(var7.f(674914976) - 1);
                    break L39;
                  }
                }
                if (this.field_Q != null) {
                  if (this.field_B[var53] == -1) {
                    this.field_Q[var53] = (byte)-1;
                    var53++;
                    continue L22;
                  } else {
                    this.field_Q[var53] = (byte)(var8.i(-125) - 1);
                    var53++;
                    continue L22;
                  }
                } else {
                  var53++;
                  continue L22;
                }
              }
            }
          } else {
            L40: {
              var54 = var2.i(-79);
              var55 = 0;
              if ((var54 & 1) == 0) {
                break L40;
              } else {
                var55 = var3.a(false);
                break L40;
              }
            }
            L41: {
              var56 = 0;
              if ((var54 & 2) == 0) {
                break L41;
              } else {
                var56 = var4.a(false);
                break L41;
              }
            }
            L42: {
              var57 = 0;
              if ((var54 & 4) == 0) {
                break L42;
              } else {
                var57 = var5.a(false);
                break L42;
              }
            }
            this.field_K[var53] = var50 + var55;
            this.field_C[var53] = var51 + var56;
            this.field_v[var53] = var52 + var57;
            var50 = this.field_K[var53];
            var51 = this.field_C[var53];
            var52 = this.field_v[var53];
            if (var19 == 1) {
              this.field_I[var53] = var6.i(-115);
              var53++;
              continue L21;
            } else {
              var53++;
              continue L21;
            }
          }
        }
    }

    private bn(byte[] param0) {
        L0: {
          L1: {
            this.field_t = (byte) 0;
            this.field_y = 0;
            this.field_q = 0;
            this.field_h = 0;
            if (param0[param0.length - 1] != -1) {
              break L1;
            } else {
              if (param0[param0.length - 2] != -1) {
                break L1;
              } else {
                this.b(param0);
                break L0;
              }
            }
          }
          this.a(param0);
          break L0;
        }
    }

    bn(int param0, int param1, int param2) {
        this.field_t = (byte) 0;
        this.field_y = 0;
        this.field_q = 0;
        this.field_h = 0;
        this.field_K = new int[param0];
        this.field_C = new int[param0];
        this.field_v = new int[param0];
        this.field_I = new int[param0];
        this.field_P = new int[param1];
        this.field_O = new int[param1];
        this.field_N = new int[param1];
        this.field_G = new byte[param1];
        this.field_w = new byte[param1];
        this.field_D = new byte[param1];
        this.field_j = new short[param1];
        this.field_B = new short[param1];
        this.field_Q = new byte[param1];
        this.field_r = new int[param1];
        if (param2 > 0) {
            this.field_l = new byte[param2];
            this.field_J = new short[param2];
            this.field_n = new short[param2];
            this.field_x = new short[param2];
            this.field_s = new short[param2];
            this.field_S = new short[param2];
            this.field_H = new short[param2];
            this.field_z = new byte[param2];
            this.field_k = new byte[param2];
            this.field_u = new byte[param2];
            this.field_E = new byte[param2];
            this.field_i = new byte[param2];
        }
    }

    bn(bn[] param0, int param1) {
        int incrementValue$1 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        bn var10_ref_bn = null;
        int var10 = 0;
        bn var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        bn var15 = null;
        bn var16 = null;
        int var17 = 0;
        bn var18 = null;
        bn var19 = null;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        byte[] stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        byte[] stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        byte[] stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        byte[] stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        int stackIn_78_2 = 0;
        byte[] stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        byte[] stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        byte[] stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        int stackOut_76_2 = 0;
        byte[] stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        int stackOut_77_2 = 0;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        this.field_t = (byte) 0;
        this.field_y = 0;
        this.field_q = 0;
        this.field_h = 0;
        var3 = 0;
        var4 = 0;
        var5 = 0;
        var6 = 0;
        var7 = 0;
        var8 = 0;
        this.field_h = 0;
        this.field_y = 0;
        this.field_R = 0;
        this.field_t = (byte) -1;
        var9 = 0;
        L0: while (true) {
          if (var9 >= param1) {
            L1: {
              this.field_K = new int[this.field_h];
              this.field_C = new int[this.field_h];
              this.field_v = new int[this.field_h];
              this.field_I = new int[this.field_h];
              this.field_L = new short[this.field_h];
              this.field_P = new int[this.field_y];
              this.field_O = new int[this.field_y];
              this.field_N = new int[this.field_y];
              if (var3 == 0) {
                break L1;
              } else {
                this.field_G = new byte[this.field_y];
                break L1;
              }
            }
            L2: {
              if (var4 == 0) {
                break L2;
              } else {
                this.field_w = new byte[this.field_y];
                break L2;
              }
            }
            L3: {
              if (var5 == 0) {
                break L3;
              } else {
                this.field_D = new byte[this.field_y];
                break L3;
              }
            }
            L4: {
              if (var6 == 0) {
                break L4;
              } else {
                this.field_r = new int[this.field_y];
                break L4;
              }
            }
            L5: {
              if (var7 == 0) {
                break L5;
              } else {
                this.field_B = new short[this.field_y];
                break L5;
              }
            }
            L6: {
              if (var8 == 0) {
                break L6;
              } else {
                this.field_Q = new byte[this.field_y];
                break L6;
              }
            }
            L7: {
              this.field_j = new short[this.field_y];
              this.field_F = new short[this.field_y];
              if (this.field_R <= 0) {
                break L7;
              } else {
                this.field_l = new byte[this.field_R];
                this.field_J = new short[this.field_R];
                this.field_n = new short[this.field_R];
                this.field_x = new short[this.field_R];
                this.field_s = new short[this.field_R];
                this.field_S = new short[this.field_R];
                this.field_H = new short[this.field_R];
                this.field_z = new byte[this.field_R];
                this.field_k = new byte[this.field_R];
                this.field_u = new byte[this.field_R];
                this.field_E = new byte[this.field_R];
                this.field_i = new byte[this.field_R];
                break L7;
              }
            }
            this.field_h = 0;
            this.field_y = 0;
            this.field_R = 0;
            var9 = 0;
            L8: while (true) {
              if (var9 >= param1) {
                var9 = 0;
                this.field_q = this.field_h;
                var10 = 0;
                L9: while (true) {
                  if (var10 >= param1) {
                    return;
                  } else {
                    var16 = param0[var10];
                    var19 = var16;
                    var11 = var19;
                    var12 = (short)(1 << var10);
                    if (var11 != null) {
                      var13 = 0;
                      L10: while (true) {
                        if (var13 >= var19.field_y) {
                          var17 = 0;
                          var13 = var17;
                          L11: while (true) {
                            if (var17 < var19.field_R) {
                              L12: {
                                this.field_l[this.field_R] = var16.field_l[var17];
                                var14 = var16.field_l[var17];
                                if (var14 != 0) {
                                  break L12;
                                } else {
                                  this.field_J[this.field_R] = (short)this.a(var16, (int) var16.field_J[var17], (short) var12);
                                  this.field_n[this.field_R] = (short)this.a(var16, (int) var16.field_n[var17], (short) var12);
                                  this.field_x[this.field_R] = (short)this.a(var16, (int) var16.field_x[var17], (short) var12);
                                  break L12;
                                }
                              }
                              L13: {
                                if (var14 < 1) {
                                  break L13;
                                } else {
                                  if (var14 > 3) {
                                    break L13;
                                  } else {
                                    this.field_J[this.field_R] = var16.field_J[var17];
                                    this.field_n[this.field_R] = var16.field_n[var17];
                                    this.field_x[this.field_R] = var16.field_x[var17];
                                    this.field_s[this.field_R] = var16.field_s[var17];
                                    this.field_S[this.field_R] = var16.field_S[var17];
                                    this.field_H[this.field_R] = var16.field_H[var17];
                                    this.field_z[this.field_R] = var16.field_z[var17];
                                    this.field_k[this.field_R] = var16.field_k[var17];
                                    this.field_u[this.field_R] = var16.field_u[var17];
                                    break L13;
                                  }
                                }
                              }
                              L14: {
                                if (var14 != 2) {
                                  break L14;
                                } else {
                                  this.field_E[this.field_R] = var16.field_E[var17];
                                  this.field_i[this.field_R] = var16.field_i[var17];
                                  break L14;
                                }
                              }
                              this.field_R = this.field_R + 1;
                              var17++;
                              continue L11;
                            } else {
                              var10++;
                              continue L9;
                            }
                          }
                        } else {
                          if (var8 != 0) {
                            L15: {
                              L16: {
                                incrementValue$1 = var9;
                                var9++;
                                stackOut_74_0 = this.field_Q;
                                stackOut_74_1 = incrementValue$1;
                                stackIn_77_0 = stackOut_74_0;
                                stackIn_77_1 = stackOut_74_1;
                                stackIn_75_0 = stackOut_74_0;
                                stackIn_75_1 = stackOut_74_1;
                                if (var19.field_Q == null) {
                                  break L16;
                                } else {
                                  stackOut_75_0 = (byte[]) ((Object) stackIn_75_0);
                                  stackOut_75_1 = stackIn_75_1;
                                  stackIn_77_0 = stackOut_75_0;
                                  stackIn_77_1 = stackOut_75_1;
                                  stackIn_76_0 = stackOut_75_0;
                                  stackIn_76_1 = stackOut_75_1;
                                  if (var16.field_Q[var13] == -1) {
                                    break L16;
                                  } else {
                                    stackOut_76_0 = (byte[]) ((Object) stackIn_76_0);
                                    stackOut_76_1 = stackIn_76_1;
                                    stackOut_76_2 = var16.field_Q[var13] + this.field_R;
                                    stackIn_78_0 = stackOut_76_0;
                                    stackIn_78_1 = stackOut_76_1;
                                    stackIn_78_2 = stackOut_76_2;
                                    break L15;
                                  }
                                }
                              }
                              stackOut_77_0 = (byte[]) ((Object) stackIn_77_0);
                              stackOut_77_1 = stackIn_77_1;
                              stackOut_77_2 = -1;
                              stackIn_78_0 = stackOut_77_0;
                              stackIn_78_1 = stackOut_77_1;
                              stackIn_78_2 = stackOut_77_2;
                              break L15;
                            }
                            stackIn_78_0[stackIn_78_1] = (byte)stackIn_78_2;
                            var13++;
                            continue L10;
                          } else {
                            var13++;
                            continue L10;
                          }
                        }
                      }
                    } else {
                      var10++;
                      continue L9;
                    }
                  }
                }
              } else {
                var10 = (short)(1 << var9);
                var15 = param0[var9];
                var18 = var15;
                var11 = var18;
                if (var11 != null) {
                  var12 = 0;
                  L17: while (true) {
                    if (var12 < var18.field_y) {
                      L18: {
                        if (var3 == 0) {
                          break L18;
                        } else {
                          if (var18.field_G == null) {
                            break L18;
                          } else {
                            this.field_G[this.field_y] = var15.field_G[var12];
                            break L18;
                          }
                        }
                      }
                      L19: {
                        if (var4 == 0) {
                          break L19;
                        } else {
                          if (var18.field_w == null) {
                            this.field_w[this.field_y] = var15.field_t;
                            break L19;
                          } else {
                            this.field_w[this.field_y] = var15.field_w[var12];
                            break L19;
                          }
                        }
                      }
                      L20: {
                        if (var5 == 0) {
                          break L20;
                        } else {
                          if (var18.field_D == null) {
                            break L20;
                          } else {
                            this.field_D[this.field_y] = var15.field_D[var12];
                            break L20;
                          }
                        }
                      }
                      L21: {
                        if (var6 == 0) {
                          break L21;
                        } else {
                          if (var18.field_r == null) {
                            break L21;
                          } else {
                            this.field_r[this.field_y] = var15.field_r[var12];
                            break L21;
                          }
                        }
                      }
                      L22: {
                        if (var7 == 0) {
                          break L22;
                        } else {
                          if (var18.field_B == null) {
                            this.field_B[this.field_y] = (short)-1;
                            break L22;
                          } else {
                            this.field_B[this.field_y] = var15.field_B[var12];
                            break L22;
                          }
                        }
                      }
                      this.field_j[this.field_y] = var15.field_j[var12];
                      this.field_F[this.field_y] = (short)var10;
                      this.field_P[this.field_y] = this.a(var15, var15.field_P[var12], (short) var10);
                      this.field_O[this.field_y] = this.a(var15, var15.field_O[var12], (short) var10);
                      this.field_N[this.field_y] = this.a(var15, var15.field_N[var12], (short) var10);
                      this.field_y = this.field_y + 1;
                      var12++;
                      continue L17;
                    } else {
                      var9++;
                      continue L8;
                    }
                  }
                } else {
                  var9++;
                  continue L8;
                }
              }
            }
          } else {
            var10_ref_bn = param0[var9];
            if (var10_ref_bn != null) {
              L23: {
                this.field_h = this.field_h + var10_ref_bn.field_h;
                this.field_y = this.field_y + var10_ref_bn.field_y;
                this.field_R = this.field_R + var10_ref_bn.field_R;
                if (var10_ref_bn.field_w == null) {
                  L24: {
                    if (this.field_t != -1) {
                      break L24;
                    } else {
                      this.field_t = var10_ref_bn.field_t;
                      break L24;
                    }
                  }
                  if (this.field_t == var10_ref_bn.field_t) {
                    break L23;
                  } else {
                    var4 = 1;
                    break L23;
                  }
                } else {
                  var4 = 1;
                  break L23;
                }
              }
              L25: {
                stackOut_10_0 = var3;
                stackIn_12_0 = stackOut_10_0;
                stackIn_11_0 = stackOut_10_0;
                if (var10_ref_bn.field_G == null) {
                  stackOut_12_0 = stackIn_12_0;
                  stackOut_12_1 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  break L25;
                } else {
                  stackOut_11_0 = stackIn_11_0;
                  stackOut_11_1 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  break L25;
                }
              }
              L26: {
                var3 = stackIn_13_0 | stackIn_13_1;
                stackOut_13_0 = var5;
                stackIn_15_0 = stackOut_13_0;
                stackIn_14_0 = stackOut_13_0;
                if (var10_ref_bn.field_D == null) {
                  stackOut_15_0 = stackIn_15_0;
                  stackOut_15_1 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  break L26;
                } else {
                  stackOut_14_0 = stackIn_14_0;
                  stackOut_14_1 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  break L26;
                }
              }
              L27: {
                var5 = stackIn_16_0 | stackIn_16_1;
                stackOut_16_0 = var6;
                stackIn_18_0 = stackOut_16_0;
                stackIn_17_0 = stackOut_16_0;
                if (var10_ref_bn.field_r == null) {
                  stackOut_18_0 = stackIn_18_0;
                  stackOut_18_1 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  break L27;
                } else {
                  stackOut_17_0 = stackIn_17_0;
                  stackOut_17_1 = 1;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  break L27;
                }
              }
              L28: {
                var6 = stackIn_19_0 | stackIn_19_1;
                stackOut_19_0 = var7;
                stackIn_21_0 = stackOut_19_0;
                stackIn_20_0 = stackOut_19_0;
                if (var10_ref_bn.field_B == null) {
                  stackOut_21_0 = stackIn_21_0;
                  stackOut_21_1 = 0;
                  stackIn_22_0 = stackOut_21_0;
                  stackIn_22_1 = stackOut_21_1;
                  break L28;
                } else {
                  stackOut_20_0 = stackIn_20_0;
                  stackOut_20_1 = 1;
                  stackIn_22_0 = stackOut_20_0;
                  stackIn_22_1 = stackOut_20_1;
                  break L28;
                }
              }
              L29: {
                var7 = stackIn_22_0 | stackIn_22_1;
                stackOut_22_0 = var8;
                stackIn_24_0 = stackOut_22_0;
                stackIn_23_0 = stackOut_22_0;
                if (var10_ref_bn.field_Q == null) {
                  stackOut_24_0 = stackIn_24_0;
                  stackOut_24_1 = 0;
                  stackIn_25_0 = stackOut_24_0;
                  stackIn_25_1 = stackOut_24_1;
                  break L29;
                } else {
                  stackOut_23_0 = stackIn_23_0;
                  stackOut_23_1 = 1;
                  stackIn_25_0 = stackOut_23_0;
                  stackIn_25_1 = stackOut_23_1;
                  break L29;
                }
              }
              var8 = stackIn_25_0 | stackIn_25_1;
              var9++;
              continue L0;
            } else {
              var9++;
              continue L0;
            }
          }
        }
    }
}
