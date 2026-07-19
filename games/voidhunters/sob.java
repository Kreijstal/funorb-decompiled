/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sob extends ha {
    private int field_E;
    private int field_z;
    private gnb field_t;
    private boolean field_B;
    private int field_o;
    private gpb field_D;
    private boolean field_w;
    private java.awt.Canvas field_l;
    int field_i;
    private int field_C;
    int[] field_k;
    private int field_m;
    private al field_c;
    private int field_J;
    private int field_q;
    int field_n;
    private pfb field_d;
    private float[] field_G;
    private int field_I;
    private int field_u;
    private int field_F;
    int field_A;
    private int field_v;
    private pfb field_f;
    private co[] field_x;
    private int field_s;
    private int field_j;
    int field_p;
    int field_H;
    private int field_h;
    private int field_g;
    private int field_e;
    float[] field_r;
    private int field_y;
    private static String field_K;

    final boolean m() {
        return true;
    }

    final boolean r() {
        return false;
    }

    final pw d() {
        return (pw) ((Object) new lia());
    }

    final void GA(int param0) {
        this.aa(0, 0, this.field_i, this.field_j, param0, 0);
    }

    final void s(int param0, int param1, int param2, int param3, int param4) {
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
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
        int var18 = 0;
        if (param2 != 0) {
          L0: {
            if (param2 >= 0) {
              break L0;
            } else {
              param2 = -param2;
              break L0;
            }
          }
          L1: {
            if (this.field_A <= this.field_H) {
              break L1;
            } else {
              if (this.field_p > this.field_n) {
                if (param0 + param2 < this.field_H) {
                  break L1;
                } else {
                  L2: {
                    if (param0 - param2 >= this.field_A) {
                      break L2;
                    } else {
                      if (param1 + param2 < this.field_n) {
                        break L2;
                      } else {
                        if (param1 - param2 < this.field_p) {
                          L3: {
                            L4: {
                              var6 = param0 + param1 * this.field_i;
                              var7 = var6;
                              var8 = var6 - param2 * this.field_i;
                              var9 = var6 + param2 * this.field_i;
                              var10 = param2;
                              var11 = 0;
                              param2 = param2 * param2;
                              var12 = param2 - var10;
                              var13 = param3 >>> 24;
                              if (param4 == 0) {
                                break L4;
                              } else {
                                L5: {
                                  if (param4 != 1) {
                                    break L5;
                                  } else {
                                    if (var13 != 255) {
                                      break L5;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                                if (param4 != 1) {
                                  if (param4 != 2) {
                                    return;
                                  } else {
                                    L6: {
                                      if (param0 - var10 < this.field_H) {
                                        break L6;
                                      } else {
                                        if (param0 + var10 >= this.field_A) {
                                          break L6;
                                        } else {
                                          if (param1 - var10 < this.field_n) {
                                            break L6;
                                          } else {
                                            if (param1 + var10 < this.field_p) {
                                              var14 = var6 - var10;
                                              var15 = param3;
                                              var16 = this.field_k[var14];
                                              var17 = var15 + var16;
                                              var18 = (var15 & 16711935) + (var16 & 16711935);
                                              var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                              this.field_k[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                              var14 = var6 + var10;
                                              var15 = param3;
                                              var16 = this.field_k[var14];
                                              var17 = var15 + var16;
                                              var18 = (var15 & 16711935) + (var16 & 16711935);
                                              var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                              this.field_k[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                              var14 = var8;
                                              var15 = param3;
                                              var16 = this.field_k[var14];
                                              var17 = var15 + var16;
                                              var18 = (var15 & 16711935) + (var16 & 16711935);
                                              var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                              this.field_k[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                              var14 = var9;
                                              var15 = param3;
                                              var16 = this.field_k[var14];
                                              var17 = var15 + var16;
                                              var18 = (var15 & 16711935) + (var16 & 16711935);
                                              var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                              this.field_k[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                              L7: while (true) {
                                                L8: {
                                                  incrementValue$5 = var11;
                                                  var11++;
                                                  var12 = var12 + (incrementValue$5 + var11);
                                                  var6 = var6 - this.field_i;
                                                  var7 = var7 + this.field_i;
                                                  if (var12 <= param2) {
                                                    break L8;
                                                  } else {
                                                    var10--;
                                                    var12 = var12 - (var10 + var10);
                                                    var8 = var8 + this.field_i;
                                                    var9 = var9 - this.field_i;
                                                    break L8;
                                                  }
                                                }
                                                if (var10 >= var11) {
                                                  var14 = var8 - var11;
                                                  var15 = param3;
                                                  var16 = this.field_k[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  this.field_k[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  var14 = var8 + var11;
                                                  var15 = param3;
                                                  var16 = this.field_k[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  this.field_k[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  var14 = var6 - var10;
                                                  var15 = param3;
                                                  var16 = this.field_k[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  this.field_k[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  var14 = var6 + var10;
                                                  var15 = param3;
                                                  var16 = this.field_k[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  this.field_k[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  var14 = var7 - var10;
                                                  var15 = param3;
                                                  var16 = this.field_k[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  this.field_k[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  var14 = var7 + var10;
                                                  var15 = param3;
                                                  var16 = this.field_k[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  this.field_k[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  var14 = var9 - var11;
                                                  var15 = param3;
                                                  var16 = this.field_k[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  this.field_k[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  var14 = var9 + var11;
                                                  var15 = param3;
                                                  var16 = this.field_k[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  this.field_k[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  continue L7;
                                                } else {
                                                  break L3;
                                                }
                                              }
                                            } else {
                                              break L6;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L9: {
                                      if (param0 - var10 < this.field_H) {
                                        break L9;
                                      } else {
                                        if (param1 < this.field_n) {
                                          break L9;
                                        } else {
                                          if (param1 >= this.field_p) {
                                            break L9;
                                          } else {
                                            var14 = var6 - var10;
                                            var15 = param3;
                                            var16 = this.field_k[var14];
                                            var17 = var15 + var16;
                                            var18 = (var15 & 16711935) + (var16 & 16711935);
                                            var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                            this.field_k[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                            break L9;
                                          }
                                        }
                                      }
                                    }
                                    L10: {
                                      if (param0 + var10 >= this.field_A) {
                                        break L10;
                                      } else {
                                        if (param1 < this.field_n) {
                                          break L10;
                                        } else {
                                          if (param1 >= this.field_p) {
                                            break L10;
                                          } else {
                                            var14 = var6 + var10;
                                            var15 = param3;
                                            var16 = this.field_k[var14];
                                            var17 = var15 + var16;
                                            var18 = (var15 & 16711935) + (var16 & 16711935);
                                            var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                            this.field_k[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                            break L10;
                                          }
                                        }
                                      }
                                    }
                                    L11: {
                                      if (param1 - var10 < this.field_n) {
                                        break L11;
                                      } else {
                                        if (param0 < this.field_H) {
                                          break L11;
                                        } else {
                                          if (param0 >= this.field_A) {
                                            break L11;
                                          } else {
                                            var14 = var8;
                                            var15 = param3;
                                            var16 = this.field_k[var14];
                                            var17 = var15 + var16;
                                            var18 = (var15 & 16711935) + (var16 & 16711935);
                                            var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                            this.field_k[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                            break L11;
                                          }
                                        }
                                      }
                                    }
                                    L12: {
                                      if (param1 + var10 >= this.field_p) {
                                        break L12;
                                      } else {
                                        if (param0 < this.field_H) {
                                          break L12;
                                        } else {
                                          if (param0 >= this.field_A) {
                                            break L12;
                                          } else {
                                            var14 = var9;
                                            var15 = param3;
                                            var16 = this.field_k[var14];
                                            var17 = var15 + var16;
                                            var18 = (var15 & 16711935) + (var16 & 16711935);
                                            var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                            this.field_k[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                            break L12;
                                          }
                                        }
                                      }
                                    }
                                    L13: while (true) {
                                      L14: {
                                        incrementValue$6 = var11;
                                        var11++;
                                        var12 = var12 + (incrementValue$6 + var11);
                                        var6 = var6 - this.field_i;
                                        var7 = var7 + this.field_i;
                                        if (var12 <= param2) {
                                          break L14;
                                        } else {
                                          var10--;
                                          var12 = var12 - (var10 + var10);
                                          var8 = var8 + this.field_i;
                                          var9 = var9 - this.field_i;
                                          break L14;
                                        }
                                      }
                                      if (var10 >= var11) {
                                        L15: {
                                          if (param1 - var10 < this.field_n) {
                                            break L15;
                                          } else {
                                            if (param1 - var10 >= this.field_p) {
                                              break L15;
                                            } else {
                                              L16: {
                                                if (param0 - var11 < this.field_H) {
                                                  break L16;
                                                } else {
                                                  if (param0 - var11 >= this.field_A) {
                                                    break L16;
                                                  } else {
                                                    var14 = var8 - var11;
                                                    var15 = param3;
                                                    var16 = this.field_k[var14];
                                                    var17 = var15 + var16;
                                                    var18 = (var15 & 16711935) + (var16 & 16711935);
                                                    var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                    this.field_k[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                    break L16;
                                                  }
                                                }
                                              }
                                              if (param0 + var11 < this.field_H) {
                                                break L15;
                                              } else {
                                                if (param0 + var11 >= this.field_A) {
                                                  break L15;
                                                } else {
                                                  var14 = var8 + var11;
                                                  var15 = param3;
                                                  var16 = this.field_k[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  this.field_k[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  break L15;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        L17: {
                                          if (param1 - var11 < this.field_n) {
                                            break L17;
                                          } else {
                                            if (param1 - var11 >= this.field_p) {
                                              break L17;
                                            } else {
                                              L18: {
                                                if (param0 - var10 < this.field_H) {
                                                  break L18;
                                                } else {
                                                  if (param0 - var10 >= this.field_A) {
                                                    break L18;
                                                  } else {
                                                    var14 = var6 - var10;
                                                    var15 = param3;
                                                    var16 = this.field_k[var14];
                                                    var17 = var15 + var16;
                                                    var18 = (var15 & 16711935) + (var16 & 16711935);
                                                    var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                    this.field_k[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                    break L18;
                                                  }
                                                }
                                              }
                                              if (param0 + var10 < this.field_H) {
                                                break L17;
                                              } else {
                                                if (param0 + var10 >= this.field_A) {
                                                  break L17;
                                                } else {
                                                  var14 = var6 + var10;
                                                  var15 = param3;
                                                  var16 = this.field_k[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  this.field_k[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  break L17;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        L19: {
                                          if (param1 + var11 < this.field_n) {
                                            break L19;
                                          } else {
                                            if (param1 + var11 >= this.field_p) {
                                              break L19;
                                            } else {
                                              L20: {
                                                if (param0 - var10 < this.field_H) {
                                                  break L20;
                                                } else {
                                                  if (param0 - var10 >= this.field_A) {
                                                    break L20;
                                                  } else {
                                                    var14 = var7 - var10;
                                                    var15 = param3;
                                                    var16 = this.field_k[var14];
                                                    var17 = var15 + var16;
                                                    var18 = (var15 & 16711935) + (var16 & 16711935);
                                                    var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                    this.field_k[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                    break L20;
                                                  }
                                                }
                                              }
                                              if (param0 + var10 < this.field_H) {
                                                break L19;
                                              } else {
                                                if (param0 + var10 >= this.field_A) {
                                                  break L19;
                                                } else {
                                                  var14 = var7 + var10;
                                                  var15 = param3;
                                                  var16 = this.field_k[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  this.field_k[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  break L19;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        if (param1 + var10 < this.field_n) {
                                          continue L13;
                                        } else {
                                          if (param1 + var10 >= this.field_p) {
                                            continue L13;
                                          } else {
                                            L21: {
                                              if (param0 - var11 < this.field_H) {
                                                break L21;
                                              } else {
                                                if (param0 - var11 >= this.field_A) {
                                                  break L21;
                                                } else {
                                                  var14 = var9 - var11;
                                                  var15 = param3;
                                                  var16 = this.field_k[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  this.field_k[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  break L21;
                                                }
                                              }
                                            }
                                            if (param0 + var11 < this.field_H) {
                                              continue L13;
                                            } else {
                                              if (param0 + var11 >= this.field_A) {
                                                continue L13;
                                              } else {
                                                var14 = var9 + var11;
                                                var15 = param3;
                                                var16 = this.field_k[var14];
                                                var17 = var15 + var16;
                                                var18 = (var15 & 16711935) + (var16 & 16711935);
                                                var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                this.field_k[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                continue L13;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        break L3;
                                      }
                                    }
                                  }
                                } else {
                                  L22: {
                                    if (param0 - var10 < this.field_H) {
                                      break L22;
                                    } else {
                                      if (param0 + var10 >= this.field_A) {
                                        break L22;
                                      } else {
                                        if (param1 - var10 < this.field_n) {
                                          break L22;
                                        } else {
                                          if (param1 + var10 < this.field_p) {
                                            var14 = var6 - var10;
                                            var15 = param3;
                                            var16 = var13;
                                            var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                            var17 = 256 - var16;
                                            var18 = this.field_k[var14];
                                            var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                            this.field_k[var14] = var15 + var18;
                                            var14 = var6 + var10;
                                            var15 = param3;
                                            var16 = var13;
                                            var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                            var17 = 256 - var16;
                                            var18 = this.field_k[var14];
                                            var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                            this.field_k[var14] = var15 + var18;
                                            var14 = var8;
                                            var15 = param3;
                                            var16 = var13;
                                            var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                            var17 = 256 - var16;
                                            var18 = this.field_k[var14];
                                            var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                            this.field_k[var14] = var15 + var18;
                                            var14 = var9;
                                            var15 = param3;
                                            var16 = var13;
                                            var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                            var17 = 256 - var16;
                                            var18 = this.field_k[var14];
                                            var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                            this.field_k[var14] = var15 + var18;
                                            L23: while (true) {
                                              L24: {
                                                incrementValue$7 = var11;
                                                var11++;
                                                var12 = var12 + (incrementValue$7 + var11);
                                                var6 = var6 - this.field_i;
                                                var7 = var7 + this.field_i;
                                                if (var12 <= param2) {
                                                  break L24;
                                                } else {
                                                  var10--;
                                                  var12 = var12 - (var10 + var10);
                                                  var8 = var8 + this.field_i;
                                                  var9 = var9 - this.field_i;
                                                  break L24;
                                                }
                                              }
                                              if (var10 >= var11) {
                                                var14 = var8 - var11;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = this.field_k[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                this.field_k[var14] = var15 + var18;
                                                var14 = var8 + var11;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = this.field_k[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                this.field_k[var14] = var15 + var18;
                                                var14 = var6 - var10;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = this.field_k[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                this.field_k[var14] = var15 + var18;
                                                var14 = var6 + var10;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = this.field_k[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                this.field_k[var14] = var15 + var18;
                                                var14 = var7 - var10;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = this.field_k[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                this.field_k[var14] = var15 + var18;
                                                var14 = var7 + var10;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = this.field_k[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                this.field_k[var14] = var15 + var18;
                                                var14 = var9 - var11;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = this.field_k[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                this.field_k[var14] = var15 + var18;
                                                var14 = var9 + var11;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = this.field_k[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                this.field_k[var14] = var15 + var18;
                                                continue L23;
                                              } else {
                                                break L3;
                                              }
                                            }
                                          } else {
                                            break L22;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L25: {
                                    if (param0 - var10 < this.field_H) {
                                      break L25;
                                    } else {
                                      if (param1 < this.field_n) {
                                        break L25;
                                      } else {
                                        if (param1 >= this.field_p) {
                                          break L25;
                                        } else {
                                          var14 = var6 - var10;
                                          var15 = param3;
                                          var16 = var13;
                                          var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                          var17 = 256 - var16;
                                          var18 = this.field_k[var14];
                                          var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                          this.field_k[var14] = var15 + var18;
                                          break L25;
                                        }
                                      }
                                    }
                                  }
                                  L26: {
                                    if (param0 + var10 >= this.field_A) {
                                      break L26;
                                    } else {
                                      if (param1 < this.field_n) {
                                        break L26;
                                      } else {
                                        if (param1 >= this.field_p) {
                                          break L26;
                                        } else {
                                          var14 = var6 + var10;
                                          var15 = param3;
                                          var16 = var13;
                                          var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                          var17 = 256 - var16;
                                          var18 = this.field_k[var14];
                                          var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                          this.field_k[var14] = var15 + var18;
                                          break L26;
                                        }
                                      }
                                    }
                                  }
                                  L27: {
                                    if (param1 - var10 < this.field_n) {
                                      break L27;
                                    } else {
                                      if (param0 < this.field_H) {
                                        break L27;
                                      } else {
                                        if (param0 >= this.field_A) {
                                          break L27;
                                        } else {
                                          var14 = var8;
                                          var15 = param3;
                                          var16 = var13;
                                          var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                          var17 = 256 - var16;
                                          var18 = this.field_k[var14];
                                          var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                          this.field_k[var14] = var15 + var18;
                                          break L27;
                                        }
                                      }
                                    }
                                  }
                                  L28: {
                                    if (param1 + var10 >= this.field_p) {
                                      break L28;
                                    } else {
                                      if (param0 < this.field_H) {
                                        break L28;
                                      } else {
                                        if (param0 >= this.field_A) {
                                          break L28;
                                        } else {
                                          var14 = var9;
                                          var15 = param3;
                                          var16 = var13;
                                          var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                          var17 = 256 - var16;
                                          var18 = this.field_k[var14];
                                          var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                          this.field_k[var14] = var15 + var18;
                                          break L28;
                                        }
                                      }
                                    }
                                  }
                                  L29: while (true) {
                                    L30: {
                                      incrementValue$8 = var11;
                                      var11++;
                                      var12 = var12 + (incrementValue$8 + var11);
                                      var6 = var6 - this.field_i;
                                      var7 = var7 + this.field_i;
                                      if (var12 <= param2) {
                                        break L30;
                                      } else {
                                        var10--;
                                        var12 = var12 - (var10 + var10);
                                        var8 = var8 + this.field_i;
                                        var9 = var9 - this.field_i;
                                        break L30;
                                      }
                                    }
                                    if (var10 >= var11) {
                                      L31: {
                                        if (param1 - var10 < this.field_n) {
                                          break L31;
                                        } else {
                                          if (param1 - var10 >= this.field_p) {
                                            break L31;
                                          } else {
                                            L32: {
                                              if (param0 - var11 < this.field_H) {
                                                break L32;
                                              } else {
                                                if (param0 - var11 >= this.field_A) {
                                                  break L32;
                                                } else {
                                                  var14 = var8 - var11;
                                                  var15 = param3;
                                                  var16 = var13;
                                                  var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                  var17 = 256 - var16;
                                                  var18 = this.field_k[var14];
                                                  var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                  this.field_k[var14] = var15 + var18;
                                                  break L32;
                                                }
                                              }
                                            }
                                            if (param0 + var11 < this.field_H) {
                                              break L31;
                                            } else {
                                              if (param0 + var11 >= this.field_A) {
                                                break L31;
                                              } else {
                                                var14 = var8 + var11;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = this.field_k[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                this.field_k[var14] = var15 + var18;
                                                break L31;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      L33: {
                                        if (param1 - var11 < this.field_n) {
                                          break L33;
                                        } else {
                                          if (param1 - var11 >= this.field_p) {
                                            break L33;
                                          } else {
                                            L34: {
                                              if (param0 - var10 < this.field_H) {
                                                break L34;
                                              } else {
                                                if (param0 - var10 >= this.field_A) {
                                                  break L34;
                                                } else {
                                                  var14 = var6 - var10;
                                                  var15 = param3;
                                                  var16 = var13;
                                                  var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                  var17 = 256 - var16;
                                                  var18 = this.field_k[var14];
                                                  var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                  this.field_k[var14] = var15 + var18;
                                                  break L34;
                                                }
                                              }
                                            }
                                            if (param0 + var10 < this.field_H) {
                                              break L33;
                                            } else {
                                              if (param0 + var10 >= this.field_A) {
                                                break L33;
                                              } else {
                                                var14 = var6 + var10;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = this.field_k[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                this.field_k[var14] = var15 + var18;
                                                break L33;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      L35: {
                                        if (param1 + var11 < this.field_n) {
                                          break L35;
                                        } else {
                                          if (param1 + var11 >= this.field_p) {
                                            break L35;
                                          } else {
                                            L36: {
                                              if (param0 - var10 < this.field_H) {
                                                break L36;
                                              } else {
                                                if (param0 - var10 >= this.field_A) {
                                                  break L36;
                                                } else {
                                                  var14 = var7 - var10;
                                                  var15 = param3;
                                                  var16 = var13;
                                                  var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                  var17 = 256 - var16;
                                                  var18 = this.field_k[var14];
                                                  var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                  this.field_k[var14] = var15 + var18;
                                                  break L36;
                                                }
                                              }
                                            }
                                            if (param0 + var10 < this.field_H) {
                                              break L35;
                                            } else {
                                              if (param0 + var10 >= this.field_A) {
                                                break L35;
                                              } else {
                                                var14 = var7 + var10;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = this.field_k[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                this.field_k[var14] = var15 + var18;
                                                break L35;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      if (param1 + var10 < this.field_n) {
                                        continue L29;
                                      } else {
                                        if (param1 + var10 >= this.field_p) {
                                          continue L29;
                                        } else {
                                          L37: {
                                            if (param0 - var11 < this.field_H) {
                                              break L37;
                                            } else {
                                              if (param0 - var11 >= this.field_A) {
                                                break L37;
                                              } else {
                                                var14 = var9 - var11;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = this.field_k[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                this.field_k[var14] = var15 + var18;
                                                break L37;
                                              }
                                            }
                                          }
                                          if (param0 + var11 < this.field_H) {
                                            continue L29;
                                          } else {
                                            if (param0 + var11 >= this.field_A) {
                                              continue L29;
                                            } else {
                                              var14 = var9 + var11;
                                              var15 = param3;
                                              var16 = var13;
                                              var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                              var17 = 256 - var16;
                                              var18 = this.field_k[var14];
                                              var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                              this.field_k[var14] = var15 + var18;
                                              continue L29;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      break L3;
                                    }
                                  }
                                }
                              }
                            }
                            L38: {
                              if (param0 - var10 >= this.field_H) {
                                if (param0 - var10 >= this.field_H) {
                                  if (param1 < this.field_n) {
                                    break L38;
                                  } else {
                                    if (param1 >= this.field_p) {
                                      break L38;
                                    } else {
                                      this.field_k[var6 - var10] = param3;
                                      break L38;
                                    }
                                  }
                                } else {
                                  if (param0 - var10 < this.field_H) {
                                    break L38;
                                  } else {
                                    if (param1 < this.field_n) {
                                      break L38;
                                    } else {
                                      if (param1 >= this.field_p) {
                                        break L38;
                                      } else {
                                        this.field_k[var6 - var10] = param3;
                                        break L38;
                                      }
                                    }
                                  }
                                }
                              } else {
                                if (param0 - var10 >= this.field_H) {
                                  if (param1 < this.field_n) {
                                    break L38;
                                  } else {
                                    if (param1 >= this.field_p) {
                                      break L38;
                                    } else {
                                      this.field_k[var6 - var10] = param3;
                                      break L38;
                                    }
                                  }
                                } else {
                                  if (param0 - var10 < this.field_H) {
                                    break L38;
                                  } else {
                                    if (param1 < this.field_n) {
                                      break L38;
                                    } else {
                                      if (param1 >= this.field_p) {
                                        break L38;
                                      } else {
                                        this.field_k[var6 - var10] = param3;
                                        break L38;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            L39: {
                              if (param0 + var10 < this.field_A) {
                                if (param1 >= this.field_n) {
                                  if (param1 < this.field_p) {
                                    this.field_k[var6 + var10] = param3;
                                    if (param1 - var10 < this.field_n) {
                                      break L39;
                                    } else {
                                      if (param0 < this.field_H) {
                                        break L39;
                                      } else {
                                        if (param0 >= this.field_A) {
                                          break L39;
                                        } else {
                                          this.field_k[var8] = param3;
                                          break L39;
                                        }
                                      }
                                    }
                                  } else {
                                    if (param1 - var10 < this.field_n) {
                                      break L39;
                                    } else {
                                      if (param0 < this.field_H) {
                                        break L39;
                                      } else {
                                        if (param0 >= this.field_A) {
                                          break L39;
                                        } else {
                                          this.field_k[var8] = param3;
                                          break L39;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  if (param1 - var10 < this.field_n) {
                                    break L39;
                                  } else {
                                    if (param0 < this.field_H) {
                                      break L39;
                                    } else {
                                      if (param0 >= this.field_A) {
                                        break L39;
                                      } else {
                                        this.field_k[var8] = param3;
                                        break L39;
                                      }
                                    }
                                  }
                                }
                              } else {
                                if (param1 - var10 < this.field_n) {
                                  break L39;
                                } else {
                                  if (param0 < this.field_H) {
                                    break L39;
                                  } else {
                                    if (param0 >= this.field_A) {
                                      break L39;
                                    } else {
                                      this.field_k[var8] = param3;
                                      break L39;
                                    }
                                  }
                                }
                              }
                            }
                            L40: {
                              if (param1 + var10 >= this.field_p) {
                                break L40;
                              } else {
                                if (param0 < this.field_H) {
                                  break L40;
                                } else {
                                  if (param0 >= this.field_A) {
                                    break L40;
                                  } else {
                                    this.field_k[var9] = param3;
                                    break L40;
                                  }
                                }
                              }
                            }
                            L41: while (true) {
                              L42: {
                                incrementValue$9 = var11;
                                var11++;
                                var12 = var12 + (incrementValue$9 + var11);
                                var6 = var6 - this.field_i;
                                var7 = var7 + this.field_i;
                                if (var12 <= param2) {
                                  break L42;
                                } else {
                                  var10--;
                                  var12 = var12 - (var10 + var10);
                                  var8 = var8 + this.field_i;
                                  var9 = var9 - this.field_i;
                                  break L42;
                                }
                              }
                              if (var10 >= var11) {
                                L43: {
                                  if (param1 - var10 < this.field_n) {
                                    break L43;
                                  } else {
                                    if (param1 - var10 >= this.field_p) {
                                      break L43;
                                    } else {
                                      if (param0 - var11 < this.field_H) {
                                        if (param0 + var11 >= this.field_H) {
                                          if (param0 + var11 >= this.field_A) {
                                            break L43;
                                          } else {
                                            this.field_k[var8 + var11] = param3;
                                            break L43;
                                          }
                                        } else {
                                          if (param0 + var11 < this.field_H) {
                                            break L43;
                                          } else {
                                            if (param0 + var11 >= this.field_A) {
                                              break L43;
                                            } else {
                                              this.field_k[var8 + var11] = param3;
                                              break L43;
                                            }
                                          }
                                        }
                                      } else {
                                        if (param0 + var11 < this.field_H) {
                                          break L43;
                                        } else {
                                          if (param0 + var11 >= this.field_A) {
                                            break L43;
                                          } else {
                                            this.field_k[var8 + var11] = param3;
                                            break L43;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                L44: {
                                  if (param1 - var11 < this.field_n) {
                                    break L44;
                                  } else {
                                    if (param1 - var11 >= this.field_p) {
                                      break L44;
                                    } else {
                                      L45: {
                                        if (param0 - var10 < this.field_H) {
                                          break L45;
                                        } else {
                                          if (param0 - var10 >= this.field_A) {
                                            break L45;
                                          } else {
                                            this.field_k[var6 - var10] = param3;
                                            break L45;
                                          }
                                        }
                                      }
                                      if (param0 + var10 < this.field_H) {
                                        break L44;
                                      } else {
                                        if (param0 + var10 >= this.field_A) {
                                          break L44;
                                        } else {
                                          this.field_k[var6 + var10] = param3;
                                          break L44;
                                        }
                                      }
                                    }
                                  }
                                }
                                L46: {
                                  if (param1 + var11 < this.field_n) {
                                    break L46;
                                  } else {
                                    if (param1 + var11 >= this.field_p) {
                                      break L46;
                                    } else {
                                      L47: {
                                        if (param0 - var10 < this.field_H) {
                                          break L47;
                                        } else {
                                          if (param0 - var10 >= this.field_A) {
                                            break L47;
                                          } else {
                                            this.field_k[var7 - var10] = param3;
                                            break L47;
                                          }
                                        }
                                      }
                                      if (param0 + var10 < this.field_H) {
                                        break L46;
                                      } else {
                                        if (param0 + var10 >= this.field_A) {
                                          break L46;
                                        } else {
                                          this.field_k[var7 + var10] = param3;
                                          break L46;
                                        }
                                      }
                                    }
                                  }
                                }
                                if (param1 + var10 < this.field_n) {
                                  continue L41;
                                } else {
                                  if (param1 + var10 >= this.field_p) {
                                    continue L41;
                                  } else {
                                    L48: {
                                      if (param0 - var11 < this.field_H) {
                                        break L48;
                                      } else {
                                        if (param0 - var11 >= this.field_A) {
                                          break L48;
                                        } else {
                                          this.field_k[var9 - var11] = param3;
                                          break L48;
                                        }
                                      }
                                    }
                                    if (param0 + var11 < this.field_H) {
                                      continue L41;
                                    } else {
                                      if (param0 + var11 >= this.field_A) {
                                        continue L41;
                                      } else {
                                        this.field_k[var9 + var11] = param3;
                                        continue L41;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          return;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                return;
              }
            }
          }
          return;
        } else {
          L49: {
            if (param0 < this.field_H) {
              break L49;
            } else {
              L50: {
                if (param1 < this.field_n) {
                  break L50;
                } else {
                  if (param0 >= this.field_A) {
                    break L50;
                  } else {
                    if (param1 < this.field_p) {
                      L51: {
                        L52: {
                          var6 = param3 >>> 24;
                          var7 = param0 + param1 * this.field_i;
                          if (param4 == 0) {
                            break L52;
                          } else {
                            L53: {
                              if (param4 != 1) {
                                break L53;
                              } else {
                                if (var6 != 255) {
                                  break L53;
                                } else {
                                  break L52;
                                }
                              }
                            }
                            if (param4 != 1) {
                              if (param4 != 2) {
                                break L49;
                              } else {
                                var8 = var7;
                                var9 = param3;
                                var10 = this.field_k[var8];
                                var11 = var9 + var10;
                                var12 = (var9 & 16711935) + (var10 & 16711935);
                                var10 = (var12 & 16777472) + (var11 - var12 & 65536);
                                this.field_k[var8] = var11 - var10 | var10 - (var10 >>> 8);
                                break L51;
                              }
                            } else {
                              var8 = var7;
                              var9 = param3;
                              var10 = var6;
                              var9 = ((var9 & 16711935) * var10 >> 8 & 16711935) + ((var9 & 65280) * var10 >> 8 & 65280) + (var10 << 24);
                              var11 = 256 - var10;
                              var12 = this.field_k[var8];
                              var12 = ((var12 & 16711935) * var11 >> 8 & 16711935) + ((var12 & 65280) * var11 >> 8 & 65280);
                              this.field_k[var8] = var9 + var12;
                              break L51;
                            }
                          }
                        }
                        this.field_k[var7] = param3;
                        break L51;
                      }
                      return;
                    } else {
                      break L50;
                    }
                  }
                }
              }
              return;
            }
          }
          return;
        }
    }

    final boolean w() {
        return false;
    }

    private final void a(boolean param0) {
        co var2 = this.a((Runnable) ((Object) Thread.currentThread()));
        var2.field_f = param0 ? true : false;
    }

    final aja a(int[] param0, int param1, int param2, int param3, int param4, boolean param5) {
        int incrementValue$21 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var7 = 0;
        var8 = param1;
        var9 = 0;
        L0: while (true) {
          L1: {
            if (var9 >= param4) {
              break L1;
            } else {
              var10 = 0;
              L2: while (true) {
                if (var10 >= param3) {
                  var9++;
                  continue L0;
                } else {
                  incrementValue$21 = var8;
                  var8++;
                  var11 = param0[incrementValue$21] >>> 24;
                  if (var11 != 0) {
                    if (var11 != 255) {
                      var7 = 1;
                      break L1;
                    } else {
                      var10++;
                      continue L2;
                    }
                  } else {
                    var10++;
                    continue L2;
                  }
                }
              }
            }
          }
          if (var7 == 0) {
            return (aja) ((Object) new sda((sob) (this), param0, param1, param2, param3, param4, param5));
          } else {
            return (aja) ((Object) new wfa((sob) (this), param0, param1, param2, param3, param4, param5));
          }
        }
    }

    final void aa(int param0, int param1, int param2, int param3, int param4, int param5) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        L0: {
          if (param0 >= this.field_H) {
            break L0;
          } else {
            param2 = param2 - (this.field_H - param0);
            param0 = this.field_H;
            break L0;
          }
        }
        L1: {
          if (param1 >= this.field_n) {
            break L1;
          } else {
            param3 = param3 - (this.field_n - param1);
            param1 = this.field_n;
            break L1;
          }
        }
        L2: {
          if (param0 + param2 <= this.field_A) {
            break L2;
          } else {
            param2 = this.field_A - param0;
            break L2;
          }
        }
        L3: {
          if (param1 + param3 <= this.field_p) {
            break L3;
          } else {
            param3 = this.field_p - param1;
            break L3;
          }
        }
        L4: {
          if (param2 <= 0) {
            break L4;
          } else {
            L5: {
              if (param3 <= 0) {
                break L5;
              } else {
                if (param0 > this.field_A) {
                  break L5;
                } else {
                  if (param1 <= this.field_p) {
                    L6: {
                      var7 = this.field_i - param2;
                      var8 = param0 + param1 * this.field_i;
                      var9 = param4 >>> 24;
                      if (param5 == 0) {
                        break L6;
                      } else {
                        L7: {
                          if (param5 != 1) {
                            break L7;
                          } else {
                            if (var9 != 255) {
                              break L7;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L8: {
                          if (param5 != 1) {
                            if (param5 != 2) {
                              throw new IllegalArgumentException();
                            } else {
                              var10 = 0;
                              L9: while (true) {
                                if (var10 >= param3) {
                                  break L8;
                                } else {
                                  var11 = -param2;
                                  L10: while (true) {
                                    if (var11 >= 0) {
                                      var8 = var8 + var7;
                                      var10++;
                                      continue L9;
                                    } else {
                                      var12 = this.field_k[var8];
                                      var13 = param4 + var12;
                                      var14 = (param4 & 16711935) + (var12 & 16711935);
                                      var12 = (var14 & 16777472) + (var13 - var14 & 65536);
                                      incrementValue$2 = var8;
                                      var8++;
                                      this.field_k[incrementValue$2] = var13 - var12 | var12 - (var12 >>> 8);
                                      var11++;
                                      continue L10;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            param4 = ((param4 & 16711935) * var9 >> 8 & 16711935) + (((param4 & -16711936) >>> 8) * var9 & -16711936);
                            var10 = 256 - var9;
                            var11 = 0;
                            L11: while (true) {
                              if (var11 >= param3) {
                                break L8;
                              } else {
                                var12 = -param2;
                                L12: while (true) {
                                  if (var12 >= 0) {
                                    var8 = var8 + var7;
                                    var11++;
                                    continue L11;
                                  } else {
                                    var13 = this.field_k[var8];
                                    var13 = ((var13 & 16711935) * var10 >> 8 & 16711935) + (((var13 & -16711936) >>> 8) * var10 & -16711936);
                                    incrementValue$3 = var8;
                                    var8++;
                                    this.field_k[incrementValue$3] = param4 + var13;
                                    var12++;
                                    continue L12;
                                  }
                                }
                              }
                            }
                          }
                        }
                        return;
                      }
                    }
                    var10 = param2 >> 3;
                    var11 = param2 & 7;
                    param2 = var8 - 1;
                    var12 = -param3;
                    L13: while (true) {
                      if (var12 >= 0) {
                        break L4;
                      } else {
                        L14: {
                          if (var10 <= 0) {
                            break L14;
                          } else {
                            param0 = var10;
                            L15: while (true) {
                              param2++;
                              this.field_k[param2] = param4;
                              param2++;
                              this.field_k[param2] = param4;
                              param2++;
                              this.field_k[param2] = param4;
                              param2++;
                              this.field_k[param2] = param4;
                              param2++;
                              this.field_k[param2] = param4;
                              param2++;
                              this.field_k[param2] = param4;
                              param2++;
                              this.field_k[param2] = param4;
                              param2++;
                              this.field_k[param2] = param4;
                              param0--;
                              if (param0 > 0) {
                                continue L15;
                              } else {
                                break L14;
                              }
                            }
                          }
                        }
                        L16: {
                          if (var11 <= 0) {
                            break L16;
                          } else {
                            param0 = var11;
                            L17: while (true) {
                              param2++;
                              this.field_k[param2] = param4;
                              param0--;
                              if (param0 > 0) {
                                continue L17;
                              } else {
                                break L16;
                              }
                            }
                          }
                        }
                        param2 = param2 + var7;
                        var12++;
                        continue L13;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
              }
            }
            return;
          }
        }
    }

    final void ZA(int param0, float param1, float param2, float param3, float param4, float param5) {
    }

    final boolean c() {
        return false;
    }

    final boolean n() {
        return true;
    }

    final void v() {
    }

    final void j() {
        if (this.field_l != null) {
            this.field_k = this.field_D.field_f;
            this.field_i = this.field_D.field_e;
            this.field_j = this.field_D.field_d;
            this.field_r = this.field_G;
            this.field_F = this.field_v;
            this.field_q = this.field_u;
        } else {
            this.field_i = 1;
            this.field_j = 1;
            this.field_k = null;
            this.field_F = 1;
            this.field_q = 1;
            this.field_r = null;
        }
        this.field_c = null;
        this.y();
    }

    final void xa(float param0) {
    }

    final boolean k() {
        return false;
    }

    final void a(float param0, float param1, float param2) {
    }

    final co a(Runnable param0) {
        int var2 = 0;
        var2 = 0;
        L0: while (true) {
          if (var2 < this.field_g) {
            if (this.field_x[var2].field_c != param0) {
              var2++;
              continue L0;
            } else {
              return this.field_x[var2];
            }
          } else {
            return null;
          }
        }
    }

    final void a(hf param0) {
        al var2 = (al) ((Object) param0);
        this.field_i = var2.field_d;
        this.field_j = var2.field_g;
        this.field_k = var2.field_e;
        this.field_c = var2;
        this.field_F = var2.field_d;
        this.field_q = var2.field_g;
        this.field_r = var2.field_b;
        this.y();
    }

    final void c(int param0) {
        uva var4 = null;
        int var5 = 0;
        opa var6 = null;
        int var2 = param0 - this.field_E;
        Object var3 = this.field_f.a((byte) 67);
        while (var3 != null) {
            var4 = (uva) (var3);
            if (var4.field_h) {
                var4.field_g = var4.field_g + var2;
                var5 = var4.field_g / 20;
                if (var5 > 0) {
                    var6 = this.field_a.a(-20292, var4.field_d);
                    var4.a(var6.field_p * var2 * 50 / 1000, var6.field_d * var2 * 50 / 1000);
                    var4.field_g = var4.field_g - var5 * 20;
                }
                var4.field_h = false;
            }
            var3 = this.field_f.a(false);
        }
        this.field_E = param0;
        this.field_d.a(true, 5);
        this.field_f.a(true, 5);
    }

    private final void d(int param0) {
        this.field_x[param0].a((Runnable) ((Object) Thread.currentThread()), 0);
    }

    final void P(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          if (param0 < this.field_H) {
            break L0;
          } else {
            if (param0 < this.field_A) {
              L1: {
                if (param1 >= this.field_n) {
                  break L1;
                } else {
                  param2 = param2 - (this.field_n - param1);
                  param1 = this.field_n;
                  break L1;
                }
              }
              L2: {
                if (param1 + param2 <= this.field_p) {
                  break L2;
                } else {
                  param2 = this.field_p - param1;
                  break L2;
                }
              }
              L3: {
                var6 = param0 + param1 * this.field_i;
                var7 = param3 >>> 24;
                if (param4 == 0) {
                  break L3;
                } else {
                  L4: {
                    if (param4 != 1) {
                      break L4;
                    } else {
                      if (var7 != 255) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L5: {
                    if (param4 != 1) {
                      if (param4 != 2) {
                        throw new IllegalArgumentException();
                      } else {
                        var8 = 0;
                        L6: while (true) {
                          if (var8 >= param2) {
                            break L5;
                          } else {
                            var9 = var6 + var8 * this.field_i;
                            var10 = this.field_k[var9];
                            var11 = param3 + var10;
                            var12 = (param3 & 16711935) + (var10 & 16711935);
                            var10 = (var12 & 16777472) + (var11 - var12 & 65536);
                            this.field_k[var9] = var11 - var10 | var10 - (var10 >>> 8);
                            var8++;
                            continue L6;
                          }
                        }
                      }
                    } else {
                      param3 = ((param3 & 16711935) * var7 >> 8 & 16711935) + ((param3 & 65280) * var7 >> 8 & 65280) + (var7 << 24);
                      var8 = 256 - var7;
                      var9 = 0;
                      L7: while (true) {
                        if (var9 >= param2) {
                          break L5;
                        } else {
                          var10 = var6 + var9 * this.field_i;
                          var11 = this.field_k[var10];
                          var11 = ((var11 & 16711935) * var8 >> 8 & 16711935) + ((var11 & 65280) * var8 >> 8 & 65280);
                          this.field_k[var10] = param3 + var11;
                          var9++;
                          continue L7;
                        }
                      }
                    }
                  }
                  return;
                }
              }
              var8 = 0;
              L8: while (true) {
                if (var8 >= param2) {
                  break L0;
                } else {
                  this.field_k[var6 + var8 * this.field_i] = param3;
                  var8++;
                  continue L8;
                }
              }
            } else {
              return;
            }
          }
        }
    }

    final aja a(int param0, int param1, boolean param2) {
        if (param2) {
            return (aja) ((Object) new wfa((sob) (this), param0, param1));
        }
        return (aja) ((Object) new sda((sob) (this), param0, param1));
    }

    private final void y() {
        int var1 = 0;
        for (var1 = 0; var1 < this.field_g; var1++) {
            this.field_x[var1].a((byte) 3);
        }
        this.A();
    }

    private final void b(java.awt.Canvas param0, int param1, int param2) {
        gpb var4 = null;
        L0: {
          var4 = (gpb) ((Object) this.field_t.a((long)param0.hashCode(), 119));
          if (var4 != null) {
            L1: {
              if (var4.field_e != param1) {
                break L1;
              } else {
                if (var4.field_d == param2) {
                  return;
                } else {
                  break L1;
                }
              }
            }
            this.a(param0, param1, param2);
            break L0;
          } else {
            var4 = rba.a(param1, true, param0, param2);
            this.field_t.a((long)param0.hashCode(), var4, (byte) -124);
            break L0;
          }
        }
    }

    final boolean x() {
        return true;
    }

    final boolean f() {
        return false;
    }

    final boolean e() {
        return true;
    }

    final int i() {
        return this.field_y;
    }

    final boolean h() {
        return true;
    }

    final void a(int param0, int param1, int param2, int param3) {
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        co var8 = null;
        daa var9 = null;
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
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        daa stackIn_19_0 = null;
        daa stackIn_20_0 = null;
        daa stackIn_21_0 = null;
        daa stackIn_22_0 = null;
        daa stackIn_23_0 = null;
        daa stackIn_24_0 = null;
        daa stackIn_25_0 = null;
        daa stackIn_26_0 = null;
        daa stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        daa stackIn_28_0 = null;
        daa stackIn_29_0 = null;
        daa stackIn_30_0 = null;
        daa stackIn_31_0 = null;
        daa stackIn_32_0 = null;
        daa stackIn_33_0 = null;
        daa stackIn_34_0 = null;
        daa stackIn_35_0 = null;
        daa stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        daa stackOut_18_0 = null;
        daa stackOut_19_0 = null;
        daa stackOut_20_0 = null;
        daa stackOut_21_0 = null;
        daa stackOut_22_0 = null;
        daa stackOut_23_0 = null;
        daa stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        daa stackOut_24_0 = null;
        daa stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        daa stackOut_27_0 = null;
        daa stackOut_28_0 = null;
        daa stackOut_29_0 = null;
        daa stackOut_30_0 = null;
        daa stackOut_31_0 = null;
        daa stackOut_32_0 = null;
        daa stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        daa stackOut_33_0 = null;
        daa stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        L0: {
          var8 = this.a((Runnable) ((Object) Thread.currentThread()));
          var9 = var8.field_e;
          var10 = param2 - param0;
          var11 = param3 - param1;
          if (var10 < 0) {
            stackOut_2_0 = -var10;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = var10;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var12 = stackIn_3_0;
          if (var11 < 0) {
            stackOut_5_0 = -var11;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = var11;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var13 = stackIn_6_0;
          var14 = var12;
          if (var14 >= var13) {
            break L2;
          } else {
            var14 = var13;
            break L2;
          }
        }
        if (var14 != 0) {
          L3: {
            var15 = (var10 << 16) / var14;
            var16 = (var11 << 16) / var14;
            var10 = var10 + (var15 >> 16);
            var11 = var11 + (var16 >> 16);
            if (var16 > var15) {
              var16 = -var16;
              break L3;
            } else {
              var15 = -var15;
              break L3;
            }
          }
          L4: {
            var17 = param5 * var16 >> 17;
            var18 = param5 * var16 + 1 >> 17;
            var19 = param5 * var15 >> 17;
            var20 = param5 * var15 + 1 >> 17;
            param0 = param0 - var9.a();
            param1 = param1 - var9.b();
            var21 = param0 + var17;
            var22 = param0 - var18;
            var23 = param0 + var10 - var18;
            var24 = param0 + var10 + var17;
            var25 = param1 + var19;
            var26 = param1 - var20;
            var27 = param1 + var11 - var20;
            var28 = param1 + var11 + var19;
            if (param6 != 0) {
              if (param6 != 1) {
                throw new IllegalArgumentException();
              } else {
                var9.field_a = 255 - (param4 >>> 24);
                break L4;
              }
            } else {
              var9.field_a = 0;
              break L4;
            }
          }
          L5: {
            L6: {
              this.a(false);
              stackOut_18_0 = (daa) (var9);
              stackIn_25_0 = stackOut_18_0;
              stackIn_19_0 = stackOut_18_0;
              if (var21 < 0) {
                break L6;
              } else {
                stackOut_19_0 = (daa) ((Object) stackIn_19_0);
                stackIn_25_0 = stackOut_19_0;
                stackIn_20_0 = stackOut_19_0;
                if (var21 > var9.field_b) {
                  break L6;
                } else {
                  stackOut_20_0 = (daa) ((Object) stackIn_20_0);
                  stackIn_25_0 = stackOut_20_0;
                  stackIn_21_0 = stackOut_20_0;
                  if (var22 < 0) {
                    break L6;
                  } else {
                    stackOut_21_0 = (daa) ((Object) stackIn_21_0);
                    stackIn_25_0 = stackOut_21_0;
                    stackIn_22_0 = stackOut_21_0;
                    if (var22 > var9.field_b) {
                      break L6;
                    } else {
                      stackOut_22_0 = (daa) ((Object) stackIn_22_0);
                      stackIn_25_0 = stackOut_22_0;
                      stackIn_23_0 = stackOut_22_0;
                      if (var23 < 0) {
                        break L6;
                      } else {
                        stackOut_23_0 = (daa) ((Object) stackIn_23_0);
                        stackIn_26_0 = stackOut_23_0;
                        stackIn_24_0 = stackOut_23_0;
                        if (var23 <= var9.field_b) {
                          stackOut_26_0 = (daa) ((Object) stackIn_26_0);
                          stackOut_26_1 = 0;
                          stackIn_27_0 = stackOut_26_0;
                          stackIn_27_1 = stackOut_26_1;
                          break L5;
                        } else {
                          stackOut_24_0 = (daa) ((Object) stackIn_24_0);
                          stackIn_25_0 = stackOut_24_0;
                          break L6;
                        }
                      }
                    }
                  }
                }
              }
            }
            stackOut_25_0 = (daa) ((Object) stackIn_25_0);
            stackOut_25_1 = 1;
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            break L5;
          }
          L7: {
            L8: {
              stackIn_27_0.field_n = stackIn_27_1 != 0;
              var9.a((float)var25, (float)var26, (float)var27, (float)var21, (float)var22, (float)var23, 100.0f, 100.0f, 100.0f, param4);
              stackOut_27_0 = (daa) (var9);
              stackIn_34_0 = stackOut_27_0;
              stackIn_28_0 = stackOut_27_0;
              if (var21 < 0) {
                break L8;
              } else {
                stackOut_28_0 = (daa) ((Object) stackIn_28_0);
                stackIn_34_0 = stackOut_28_0;
                stackIn_29_0 = stackOut_28_0;
                if (var21 > var9.field_b) {
                  break L8;
                } else {
                  stackOut_29_0 = (daa) ((Object) stackIn_29_0);
                  stackIn_34_0 = stackOut_29_0;
                  stackIn_30_0 = stackOut_29_0;
                  if (var23 < 0) {
                    break L8;
                  } else {
                    stackOut_30_0 = (daa) ((Object) stackIn_30_0);
                    stackIn_34_0 = stackOut_30_0;
                    stackIn_31_0 = stackOut_30_0;
                    if (var23 > var9.field_b) {
                      break L8;
                    } else {
                      stackOut_31_0 = (daa) ((Object) stackIn_31_0);
                      stackIn_34_0 = stackOut_31_0;
                      stackIn_32_0 = stackOut_31_0;
                      if (var24 < 0) {
                        break L8;
                      } else {
                        stackOut_32_0 = (daa) ((Object) stackIn_32_0);
                        stackIn_35_0 = stackOut_32_0;
                        stackIn_33_0 = stackOut_32_0;
                        if (var24 <= var9.field_b) {
                          stackOut_35_0 = (daa) ((Object) stackIn_35_0);
                          stackOut_35_1 = 0;
                          stackIn_36_0 = stackOut_35_0;
                          stackIn_36_1 = stackOut_35_1;
                          break L7;
                        } else {
                          stackOut_33_0 = (daa) ((Object) stackIn_33_0);
                          stackIn_34_0 = stackOut_33_0;
                          break L8;
                        }
                      }
                    }
                  }
                }
              }
            }
            stackOut_34_0 = (daa) ((Object) stackIn_34_0);
            stackOut_34_1 = 1;
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            break L7;
          }
          stackIn_36_0.field_n = stackIn_36_1 != 0;
          var9.a((float)var25, (float)var27, (float)var28, (float)var21, (float)var23, (float)var24, 100.0f, 100.0f, 100.0f, param4);
          this.a(true);
          return;
        } else {
          return;
        }
    }

    final da a(sw param0, ima[] param1, boolean param2) {
        int[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        var4 = new int[param1.length];
        var5 = new int[param1.length];
        var6 = 0;
        var7 = 0;
        L0: while (true) {
          if (var7 >= param1.length) {
            if (!param2) {
              if (var6 == 0) {
                return (da) ((Object) new jfa((sob) (this), param0, param1, var4, var5));
              } else {
                throw new IllegalArgumentException("");
              }
            } else {
              if (var6 == 0) {
                return (da) ((Object) new sf((sob) (this), param0, param1, var4, var5));
              } else {
                return (da) ((Object) new ctb((sob) (this), param0, param1, var4, var5));
              }
            }
          } else {
            var4[var7] = param1[var7].field_f;
            var5[var7] = param1[var7].field_e;
            if (param1[var7].field_a != null) {
              var6 = 1;
              var7++;
              continue L0;
            } else {
              var7++;
              continue L0;
            }
          }
        }
    }

    final boolean b() {
        return false;
    }

    final hf a(ekb param0, wib param1) {
        return (hf) ((Object) new al((sob) (this), (aja) ((Object) param0), (woa) ((Object) param1)));
    }

    private final void a(java.awt.Canvas param0, int param1, int param2) {
        float[] array$2 = null;
        java.awt.Dimension var5 = null;
        gpb var6 = null;
        gpb var7 = null;
        var6 = (gpb) ((Object) this.field_t.a((long)param0.hashCode(), 97));
        if (var6 == null) {
          return;
        } else {
          L0: {
            var6.b(-3846);
            var7 = rba.a(param1, true, param0, param2);
            this.field_t.a((long)param0.hashCode(), var7, (byte) -122);
            if (this.field_l != param0) {
              break L0;
            } else {
              if (this.field_c != null) {
                break L0;
              } else {
                L1: {
                  L2: {
                    var5 = param0.getSize();
                    this.field_z = var5.width;
                    this.field_o = var5.height;
                    this.field_D = var7;
                    this.field_k = var7.field_f;
                    this.field_i = var7.field_e;
                    this.field_j = var7.field_d;
                    if (this.field_i != this.field_F) {
                      break L2;
                    } else {
                      if (this.field_j == this.field_q) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  this.field_F = this.field_i;
                  this.field_v = this.field_i;
                  this.field_q = this.field_j;
                  this.field_u = this.field_j;
                  array$2 = new float[this.field_F * this.field_q];
                  this.field_r = array$2;
                  this.field_G = array$2;
                  break L1;
                }
                this.y();
                break L0;
              }
            }
          }
          return;
        }
    }

    final void a(int param0, int param1) throws jkb {
        Exception exception = null;
        java.awt.Graphics var3 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (this.field_l == null) {
            break L0;
          } else {
            if (this.field_D != null) {
              try {
                L1: {
                  var3 = this.field_l.getGraphics();
                  this.field_D.a(var3, this.field_z, param1, 32255, param0, 0, 0, this.field_o);
                  break L1;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  exception = (Exception) (Object) decompiledCaughtException;
                  this.field_l.repaint();
                  break L2;
                }
              }
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalStateException(field_K);
    }

    private sob(d param0) {
        super(param0);
        lia discarded$0 = null;
        this.field_B = false;
        this.field_w = false;
        this.field_t = new gnb(4);
        this.field_I = 512;
        this.field_p = 0;
        this.field_m = 512;
        this.field_H = 0;
        this.field_n = 0;
        this.field_A = 0;
        this.field_e = 3500;
        this.field_y = 50;
        this.field_d = new pfb(16);
        try {
            this.field_f = new pfb(256);
            discarded$0 = new lia();
            this.f(1);
            this.d(0);
            ocb.a(true, (byte) 33, true);
            this.field_B = true;
            this.field_E = (int)wt.a(false);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            this.a((byte) 30);
            throw new RuntimeException("");
        }
    }

    final void ya() {
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          if (this.field_H != 0) {
            break L0;
          } else {
            if (this.field_A != this.field_i) {
              break L0;
            } else {
              if (this.field_n != 0) {
                break L0;
              } else {
                if (this.field_p != this.field_j) {
                  break L0;
                } else {
                  var1 = this.field_r.length;
                  var2 = var1 - (var1 & 7);
                  var3 = 0;
                  L1: while (true) {
                    if (var3 >= var2) {
                      L2: while (true) {
                        if (var3 >= var1) {
                          return;
                        } else {
                          incrementValue$9 = var3;
                          var3++;
                          this.field_r[incrementValue$9] = 2147483648.0f;
                          continue L2;
                        }
                      }
                    } else {
                      incrementValue$10 = var3;
                      var3++;
                      this.field_r[incrementValue$10] = 2147483648.0f;
                      incrementValue$11 = var3;
                      var3++;
                      this.field_r[incrementValue$11] = 2147483648.0f;
                      incrementValue$12 = var3;
                      var3++;
                      this.field_r[incrementValue$12] = 2147483648.0f;
                      incrementValue$13 = var3;
                      var3++;
                      this.field_r[incrementValue$13] = 2147483648.0f;
                      incrementValue$14 = var3;
                      var3++;
                      this.field_r[incrementValue$14] = 2147483648.0f;
                      incrementValue$15 = var3;
                      var3++;
                      this.field_r[incrementValue$15] = 2147483648.0f;
                      incrementValue$16 = var3;
                      var3++;
                      this.field_r[incrementValue$16] = 2147483648.0f;
                      incrementValue$17 = var3;
                      var3++;
                      this.field_r[incrementValue$17] = 2147483648.0f;
                      continue L1;
                    }
                  }
                }
              }
            }
          }
        }
        var1 = this.field_A - this.field_H;
        var2 = this.field_p - this.field_n;
        var3 = this.field_i - var1;
        var4 = this.field_H + this.field_n * this.field_i;
        var5 = var1 >> 3;
        var6 = var1 & 7;
        var1 = var4 - 1;
        var8 = -var2;
        L3: while (true) {
          if (var8 >= 0) {
            return;
          } else {
            L4: {
              if (var5 <= 0) {
                break L4;
              } else {
                var7 = var5;
                L5: while (true) {
                  var1++;
                  this.field_r[var1] = 2147483648.0f;
                  var1++;
                  this.field_r[var1] = 2147483648.0f;
                  var1++;
                  this.field_r[var1] = 2147483648.0f;
                  var1++;
                  this.field_r[var1] = 2147483648.0f;
                  var1++;
                  this.field_r[var1] = 2147483648.0f;
                  var1++;
                  this.field_r[var1] = 2147483648.0f;
                  var1++;
                  this.field_r[var1] = 2147483648.0f;
                  var1++;
                  this.field_r[var1] = 2147483648.0f;
                  var7--;
                  if (var7 > 0) {
                    continue L5;
                  } else {
                    break L4;
                  }
                }
              }
            }
            L6: {
              if (var6 <= 0) {
                break L6;
              } else {
                var7 = var6;
                L7: while (true) {
                  var1++;
                  this.field_r[var1] = 2147483648.0f;
                  var7--;
                  if (var7 > 0) {
                    continue L7;
                  } else {
                    break L6;
                  }
                }
              }
            }
            var1 = var1 + var3;
            var8++;
            continue L3;
          }
        }
    }

    final int[] Y() {
        return new int[]{this.field_J, this.field_s, this.field_I, this.field_m};
    }

    private final void f(int param0) {
        int var2 = 0;
        this.field_g = param0;
        this.field_x = new co[this.field_g];
        for (var2 = 0; var2 < this.field_g; var2++) {
            this.field_x[var2] = new co((sob) (this));
        }
    }

    final boolean p() {
        return false;
    }

    final boolean g() {
        return this.field_w;
    }

    final void u() {
    }

    final za e(int param0) {
        return null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        co var11 = null;
        daa var12 = null;
        int var13 = 0;
        daa stackIn_1_0 = null;
        daa stackIn_2_0 = null;
        daa stackIn_3_0 = null;
        daa stackIn_4_0 = null;
        daa stackIn_5_0 = null;
        daa stackIn_6_0 = null;
        daa stackIn_7_0 = null;
        daa stackIn_8_0 = null;
        daa stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        daa stackOut_0_0 = null;
        daa stackOut_1_0 = null;
        daa stackOut_2_0 = null;
        daa stackOut_3_0 = null;
        daa stackOut_4_0 = null;
        daa stackOut_5_0 = null;
        daa stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        daa stackOut_6_0 = null;
        daa stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        L0: {
          L1: {
            var11 = this.a((Runnable) ((Object) Thread.currentThread()));
            var12 = var11.field_e;
            var12.field_j = false;
            param0 = param0 - this.field_C;
            param2 = param2 - this.field_C;
            param4 = param4 - this.field_C;
            param1 = param1 - this.field_h;
            param3 = param3 - this.field_h;
            param5 = param5 - this.field_h;
            stackOut_0_0 = (daa) (var12);
            stackIn_7_0 = stackOut_0_0;
            stackIn_1_0 = stackOut_0_0;
            if (param0 < 0) {
              break L1;
            } else {
              stackOut_1_0 = (daa) ((Object) stackIn_1_0);
              stackIn_7_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (param0 > var12.field_b) {
                break L1;
              } else {
                stackOut_2_0 = (daa) ((Object) stackIn_2_0);
                stackIn_7_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (param2 < 0) {
                  break L1;
                } else {
                  stackOut_3_0 = (daa) ((Object) stackIn_3_0);
                  stackIn_7_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (param2 > var12.field_b) {
                    break L1;
                  } else {
                    stackOut_4_0 = (daa) ((Object) stackIn_4_0);
                    stackIn_7_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (param4 < 0) {
                      break L1;
                    } else {
                      stackOut_5_0 = (daa) ((Object) stackIn_5_0);
                      stackIn_8_0 = stackOut_5_0;
                      stackIn_6_0 = stackOut_5_0;
                      if (param4 <= var12.field_b) {
                        stackOut_8_0 = (daa) ((Object) stackIn_8_0);
                        stackOut_8_1 = 0;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        break L0;
                      } else {
                        stackOut_6_0 = (daa) ((Object) stackIn_6_0);
                        stackIn_7_0 = stackOut_6_0;
                        break L1;
                      }
                    }
                  }
                }
              }
            }
          }
          stackOut_7_0 = (daa) ((Object) stackIn_7_0);
          stackOut_7_1 = 1;
          stackIn_9_0 = stackOut_7_0;
          stackIn_9_1 = stackOut_7_1;
          break L0;
        }
        L2: {
          L3: {
            stackIn_9_0.field_n = stackIn_9_1 != 0;
            var12.field_i = true;
            var13 = param6 >>> 24;
            if (param9 == 0) {
              break L3;
            } else {
              L4: {
                if (param9 != 1) {
                  break L4;
                } else {
                  if (var13 != 255) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              if (param9 != 1) {
                if (param9 != 2) {
                  throw new IllegalArgumentException();
                } else {
                  var12.field_a = 128;
                  var12.field_d = true;
                  var12.a((float)param1, (float)param3, (float)param5, (float)param0, (float)param2, (float)param4, 0.0f, 0.0f, 0.0f, param6, param7, param8);
                  break L2;
                }
              } else {
                var12.field_a = 255 - var13;
                var12.field_d = false;
                var12.a((float)param1, (float)param3, (float)param5, (float)param0, (float)param2, (float)param4, 0.0f, 0.0f, 0.0f, param6, param7, param8);
                break L2;
              }
            }
          }
          var12.field_a = 0;
          var12.field_d = false;
          var12.a((float)param1, (float)param3, (float)param5, (float)param0, (float)param2, (float)param4, 0.0f, 0.0f, 0.0f, param6, param7, param8);
          break L2;
        }
        var12.field_j = true;
        var12.field_i = false;
    }

    sob(java.awt.Canvas param0, d param1, int param2, int param3) {
        this(param1);
        try {
            this.b(param0, param2, param3);
            this.a(param0);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            this.a((byte) 30);
            throw new RuntimeException("");
        }
    }

    private final void a(java.awt.Canvas param0) {
        float[] array$2 = null;
        gpb var2 = null;
        java.awt.Dimension var3 = null;
        L0: {
          if (param0 == null) {
            this.field_l = null;
            this.field_D = null;
            if (this.field_c != null) {
              break L0;
            } else {
              this.field_k = null;
              this.field_j = 1;
              this.field_i = 1;
              this.field_q = 1;
              this.field_F = 1;
              this.y();
              break L0;
            }
          } else {
            var2 = (gpb) ((Object) this.field_t.a((long)param0.hashCode(), 125));
            if (var2 == null) {
              break L0;
            } else {
              this.field_l = param0;
              var3 = param0.getSize();
              this.field_z = var3.width;
              this.field_o = var3.height;
              this.field_D = var2;
              if (this.field_c != null) {
                break L0;
              } else {
                L1: {
                  L2: {
                    this.field_k = var2.field_f;
                    this.field_i = var2.field_e;
                    this.field_j = var2.field_d;
                    if (this.field_i != this.field_F) {
                      break L2;
                    } else {
                      if (this.field_j == this.field_q) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  this.field_F = this.field_i;
                  this.field_v = this.field_i;
                  this.field_q = this.field_j;
                  this.field_u = this.field_j;
                  array$2 = new float[this.field_F * this.field_q];
                  this.field_r = array$2;
                  this.field_G = array$2;
                  break L1;
                }
                this.y();
                break L0;
              }
            }
          }
        }
    }

    final boolean q() {
        return false;
    }

    final void KA(int param0, int param1, int param2, int param3) {
        if (param0 < 0) {
            param0 = 0;
        }
        if (param1 < 0) {
            param1 = 0;
        }
        if (param2 > this.field_i) {
            param2 = this.field_i;
        }
        if (param3 > this.field_j) {
            param3 = this.field_j;
        }
        this.field_H = param0;
        this.field_A = param2;
        this.field_n = param1;
        this.field_p = param3;
        this.z();
    }

    final void za(int param0, int param1, int param2, int param3, int param4) {
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int incrementValue$24 = 0;
        int incrementValue$25 = 0;
        int incrementValue$26 = 0;
        int incrementValue$27 = 0;
        int incrementValue$28 = 0;
        int incrementValue$29 = 0;
        int incrementValue$30 = 0;
        int incrementValue$31 = 0;
        int incrementValue$32 = 0;
        int incrementValue$33 = 0;
        int incrementValue$34 = 0;
        int incrementValue$35 = 0;
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
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        L0: {
          if (param2 >= 0) {
            break L0;
          } else {
            param2 = -param2;
            break L0;
          }
        }
        L1: {
          var6 = param1 - param2;
          if (var6 >= this.field_n) {
            break L1;
          } else {
            var6 = this.field_n;
            break L1;
          }
        }
        L2: {
          var7 = param1 + param2 + 1;
          if (var7 <= this.field_p) {
            break L2;
          } else {
            var7 = this.field_p;
            break L2;
          }
        }
        L3: {
          var8 = var6;
          var9 = param2 * param2;
          var10 = 0;
          var11 = param1 - var8;
          var12 = var11 * var11;
          var13 = var12 - var11;
          if (param1 <= var7) {
            break L3;
          } else {
            param1 = var7;
            break L3;
          }
        }
        L4: {
          var14 = param3 >>> 24;
          if (param4 == 0) {
            break L4;
          } else {
            L5: {
              if (param4 != 1) {
                break L5;
              } else {
                if (var14 != 255) {
                  break L5;
                } else {
                  break L4;
                }
              }
            }
            L6: {
              if (param4 != 1) {
                if (param4 != 2) {
                  throw new IllegalArgumentException();
                } else {
                  L7: while (true) {
                    if (var8 >= param1) {
                      var10 = param2;
                      var11 = -var11;
                      var13 = var11 * var11 + var9;
                      var12 = var13 - var10;
                      var13 = var13 - var11;
                      L8: while (true) {
                        if (var8 >= var7) {
                          break L6;
                        } else {
                          L9: while (true) {
                            L10: {
                              if (var13 <= var9) {
                                break L10;
                              } else {
                                if (var12 <= var9) {
                                  break L10;
                                } else {
                                  incrementValue$18 = var10;
                                  var10--;
                                  var13 = var13 - (incrementValue$18 + var10);
                                  var12 = var12 - (var10 + var10);
                                  continue L9;
                                }
                              }
                            }
                            L11: {
                              var15 = param0 - var10;
                              if (var15 >= this.field_H) {
                                break L11;
                              } else {
                                var15 = this.field_H;
                                break L11;
                              }
                            }
                            L12: {
                              var16 = param0 + var10;
                              if (var16 <= this.field_A - 1) {
                                break L12;
                              } else {
                                var16 = this.field_A - 1;
                                break L12;
                              }
                            }
                            var17 = var15 + var8 * this.field_i;
                            var18 = var15;
                            L13: while (true) {
                              if (var18 > var16) {
                                var8++;
                                var13 = var13 + (var11 + var11);
                                incrementValue$19 = var11;
                                var11++;
                                var12 = var12 + (incrementValue$19 + var11);
                                continue L8;
                              } else {
                                var19 = this.field_k[var17];
                                var20 = param3 + var19;
                                var21 = (param3 & 16711935) + (var19 & 16711935);
                                var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                incrementValue$20 = var17;
                                var17++;
                                this.field_k[incrementValue$20] = var20 - var19 | var19 - (var19 >>> 8);
                                var18++;
                                continue L13;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      L14: while (true) {
                        L15: {
                          if (var13 <= var9) {
                            break L15;
                          } else {
                            if (var12 > var9) {
                              L16: {
                                var15 = param0 - var10 + 1;
                                if (var15 >= this.field_H) {
                                  break L16;
                                } else {
                                  var15 = this.field_H;
                                  break L16;
                                }
                              }
                              L17: {
                                var16 = param0 + var10;
                                if (var16 <= this.field_A) {
                                  break L17;
                                } else {
                                  var16 = this.field_A;
                                  break L17;
                                }
                              }
                              var17 = var15 + var8 * this.field_i;
                              var18 = var15;
                              L18: while (true) {
                                if (var18 >= var16) {
                                  var8++;
                                  incrementValue$21 = var11;
                                  var11--;
                                  var12 = var12 - (incrementValue$21 + var11);
                                  var13 = var13 - (var11 + var11);
                                  continue L7;
                                } else {
                                  var19 = this.field_k[var17];
                                  var20 = param3 + var19;
                                  var21 = (param3 & 16711935) + (var19 & 16711935);
                                  var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                  incrementValue$22 = var17;
                                  var17++;
                                  this.field_k[incrementValue$22] = var20 - var19 | var19 - (var19 >>> 8);
                                  var18++;
                                  continue L18;
                                }
                              }
                            } else {
                              break L15;
                            }
                          }
                        }
                        var12 = var12 + (var10 + var10);
                        incrementValue$23 = var10;
                        var10++;
                        var13 = var13 + (incrementValue$23 + var10);
                        continue L14;
                      }
                    }
                  }
                }
              } else {
                param3 = ((param3 & 16711935) * var14 >> 8 & 16711935) + ((param3 & 65280) * var14 >> 8 & 65280) + (var14 << 24);
                var15 = 256 - var14;
                L19: while (true) {
                  if (var8 >= param1) {
                    var10 = param2;
                    var11 = -var11;
                    var13 = var11 * var11 + var9;
                    var12 = var13 - var10;
                    var13 = var13 - var11;
                    L20: while (true) {
                      if (var8 >= var7) {
                        break L6;
                      } else {
                        L21: while (true) {
                          L22: {
                            if (var13 <= var9) {
                              break L22;
                            } else {
                              if (var12 <= var9) {
                                break L22;
                              } else {
                                incrementValue$24 = var10;
                                var10--;
                                var13 = var13 - (incrementValue$24 + var10);
                                var12 = var12 - (var10 + var10);
                                continue L21;
                              }
                            }
                          }
                          L23: {
                            var16 = param0 - var10;
                            if (var16 >= this.field_H) {
                              break L23;
                            } else {
                              var16 = this.field_H;
                              break L23;
                            }
                          }
                          L24: {
                            var17 = param0 + var10;
                            if (var17 <= this.field_A - 1) {
                              break L24;
                            } else {
                              var17 = this.field_A - 1;
                              break L24;
                            }
                          }
                          var18 = var16 + var8 * this.field_i;
                          var19 = var16;
                          L25: while (true) {
                            if (var19 > var17) {
                              var8++;
                              var13 = var13 + (var11 + var11);
                              incrementValue$25 = var11;
                              var11++;
                              var12 = var12 + (incrementValue$25 + var11);
                              continue L20;
                            } else {
                              var20 = this.field_k[var18];
                              var20 = ((var20 & 16711935) * var15 >> 8 & 16711935) + ((var20 & 65280) * var15 >> 8 & 65280);
                              incrementValue$26 = var18;
                              var18++;
                              this.field_k[incrementValue$26] = param3 + var20;
                              var19++;
                              continue L25;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    L26: while (true) {
                      L27: {
                        if (var13 <= var9) {
                          break L27;
                        } else {
                          if (var12 > var9) {
                            L28: {
                              var16 = param0 - var10 + 1;
                              if (var16 >= this.field_H) {
                                break L28;
                              } else {
                                var16 = this.field_H;
                                break L28;
                              }
                            }
                            L29: {
                              var17 = param0 + var10;
                              if (var17 <= this.field_A) {
                                break L29;
                              } else {
                                var17 = this.field_A;
                                break L29;
                              }
                            }
                            var18 = var16 + var8 * this.field_i;
                            var19 = var16;
                            L30: while (true) {
                              if (var19 >= var17) {
                                var8++;
                                incrementValue$27 = var11;
                                var11--;
                                var12 = var12 - (incrementValue$27 + var11);
                                var13 = var13 - (var11 + var11);
                                continue L19;
                              } else {
                                var20 = this.field_k[var18];
                                var20 = ((var20 & 16711935) * var15 >> 8 & 16711935) + ((var20 & 65280) * var15 >> 8 & 65280);
                                incrementValue$28 = var18;
                                var18++;
                                this.field_k[incrementValue$28] = param3 + var20;
                                var19++;
                                continue L30;
                              }
                            }
                          } else {
                            break L27;
                          }
                        }
                      }
                      var12 = var12 + (var10 + var10);
                      incrementValue$29 = var10;
                      var10++;
                      var13 = var13 + (incrementValue$29 + var10);
                      continue L26;
                    }
                  }
                }
              }
            }
            return;
          }
        }
        L31: while (true) {
          if (var8 >= param1) {
            var10 = param2;
            var11 = var8 - param1;
            var13 = var11 * var11 + var9;
            var12 = var13 - var10;
            var13 = var13 - var11;
            L32: while (true) {
              if (var8 >= var7) {
                return;
              } else {
                L33: while (true) {
                  L34: {
                    if (var13 <= var9) {
                      break L34;
                    } else {
                      if (var12 <= var9) {
                        break L34;
                      } else {
                        incrementValue$30 = var10;
                        var10--;
                        var13 = var13 - (incrementValue$30 + var10);
                        var12 = var12 - (var10 + var10);
                        continue L33;
                      }
                    }
                  }
                  L35: {
                    var15 = param0 - var10;
                    if (var15 >= this.field_H) {
                      break L35;
                    } else {
                      var15 = this.field_H;
                      break L35;
                    }
                  }
                  L36: {
                    var16 = param0 + var10;
                    if (var16 <= this.field_A - 1) {
                      break L36;
                    } else {
                      var16 = this.field_A - 1;
                      break L36;
                    }
                  }
                  var17 = var15 + var8 * this.field_i;
                  var18 = var15;
                  L37: while (true) {
                    if (var18 > var16) {
                      var8++;
                      var13 = var13 + (var11 + var11);
                      incrementValue$31 = var11;
                      var11++;
                      var12 = var12 + (incrementValue$31 + var11);
                      continue L32;
                    } else {
                      incrementValue$32 = var17;
                      var17++;
                      this.field_k[incrementValue$32] = param3;
                      var18++;
                      continue L37;
                    }
                  }
                }
              }
            }
          } else {
            L38: while (true) {
              L39: {
                if (var13 <= var9) {
                  break L39;
                } else {
                  if (var12 > var9) {
                    L40: {
                      var15 = param0 - var10 + 1;
                      if (var15 >= this.field_H) {
                        break L40;
                      } else {
                        var15 = this.field_H;
                        break L40;
                      }
                    }
                    L41: {
                      var16 = param0 + var10;
                      if (var16 <= this.field_A) {
                        break L41;
                      } else {
                        var16 = this.field_A;
                        break L41;
                      }
                    }
                    var17 = var15 + var8 * this.field_i;
                    var18 = var15;
                    L42: while (true) {
                      if (var18 >= var16) {
                        var8++;
                        incrementValue$33 = var11;
                        var11--;
                        var12 = var12 - (incrementValue$33 + var11);
                        var13 = var13 - (var11 + var11);
                        continue L31;
                      } else {
                        incrementValue$34 = var17;
                        var17++;
                        this.field_k[incrementValue$34] = param3;
                        var18++;
                        continue L42;
                      }
                    }
                  } else {
                    break L39;
                  }
                }
              }
              var12 = var12 + (var10 + var10);
              incrementValue$35 = var10;
              var10++;
              var13 = var13 + (incrementValue$35 + var10);
              continue L38;
            }
          }
        }
    }

    final boolean s() {
        return false;
    }

    final int XA() {
        return this.field_e;
    }

    final void o() {
        if (this.field_B) {
            uhb.a((byte) -101, false, true);
            this.field_B = false;
        }
        this.field_D = null;
        this.field_l = null;
        this.field_z = 0;
        this.field_o = 0;
        this.field_t = null;
        this.field_w = true;
    }

    final void a(pw param0) {
    }

    final aja a(ima param0, boolean param1) {
        int[] var3 = null;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        byte[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        byte[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        byte[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int[] stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int[] stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        int[] stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int[] stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        int[] stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        L0: {
          L1: {
            var20 = param0.field_b;
            var16 = var20;
            var3 = var16;
            var4 = param0.field_h;
            var5 = param0.field_f;
            var6 = param0.field_e;
            if (!param1) {
              break L1;
            } else {
              if (param0.field_a != null) {
                break L1;
              } else {
                var22 = new int[var20.length];
                var18 = var22;
                var8 = var18;
                var21 = new byte[var5 * var6];
                var17 = var21;
                var14 = var17;
                var9 = var14;
                var10 = 0;
                L2: while (true) {
                  if (var10 >= var6) {
                    var10 = 0;
                    L3: while (true) {
                      if (var10 >= var20.length) {
                        var7 = new hfa((sob) (this), var21, var22, var5, var6);
                        break L0;
                      } else {
                        var8[var10] = var20[var10];
                        var10++;
                        continue L3;
                      }
                    }
                  } else {
                    var11 = var10 * var5;
                    var12 = 0;
                    L4: while (true) {
                      if (var12 >= var5) {
                        var10++;
                        continue L2;
                      } else {
                        var14[var11 + var12] = var4[var11 + var12];
                        var12++;
                        continue L4;
                      }
                    }
                  }
                }
              }
            }
          }
          var23 = new int[var5 * var6];
          var19 = var23;
          var15 = var19;
          var9 = param0.field_a;
          if (var9 == null) {
            var10 = 0;
            L5: while (true) {
              if (var10 >= var6) {
                var7 = new sda((sob) (this), var23, var5, var6);
                break L0;
              } else {
                var11 = var10 * var5;
                var12 = 0;
                L6: while (true) {
                  if (var12 >= var5) {
                    var10++;
                    continue L5;
                  } else {
                    L7: {
                      var13 = var3[var4[var11 + var12] & 255];
                      stackOut_24_0 = (int[]) (var15);
                      stackOut_24_1 = var11 + var12;
                      stackIn_26_0 = stackOut_24_0;
                      stackIn_26_1 = stackOut_24_1;
                      stackIn_25_0 = stackOut_24_0;
                      stackIn_25_1 = stackOut_24_1;
                      if (var13 == 0) {
                        stackOut_26_0 = (int[]) ((Object) stackIn_26_0);
                        stackOut_26_1 = stackIn_26_1;
                        stackOut_26_2 = 0;
                        stackIn_27_0 = stackOut_26_0;
                        stackIn_27_1 = stackOut_26_1;
                        stackIn_27_2 = stackOut_26_2;
                        break L7;
                      } else {
                        stackOut_25_0 = (int[]) ((Object) stackIn_25_0);
                        stackOut_25_1 = stackIn_25_1;
                        stackOut_25_2 = -16777216 | var13;
                        stackIn_27_0 = stackOut_25_0;
                        stackIn_27_1 = stackOut_25_1;
                        stackIn_27_2 = stackOut_25_2;
                        break L7;
                      }
                    }
                    stackIn_27_0[stackIn_27_1] = stackIn_27_2;
                    var12++;
                    continue L6;
                  }
                }
              }
            }
          } else {
            var10 = 0;
            L8: while (true) {
              if (var10 >= var6) {
                var7 = new wfa((sob) (this), var23, var5, var6);
                break L0;
              } else {
                var11 = var10 * var5;
                var12 = 0;
                L9: while (true) {
                  if (var12 >= var5) {
                    var10++;
                    continue L8;
                  } else {
                    var15[var11 + var12] = var3[var4[var11 + var12] & 255] | var9[var11 + var12] << 24;
                    var12++;
                    continue L9;
                  }
                }
              }
            }
          }
        }
        ((aja) (var7)).a(param0.field_c, param0.field_g, param0.field_i, param0.field_d);
        return (aja) (var7);
    }

    final boolean a() {
        return false;
    }

    final void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int incrementValue$0 = 0;
        param6 = param6 - param2;
        for (var8 = 0; var8 < param3; var8++) {
            var9 = (param1 + var8) * this.field_i + param0;
            for (var10 = 0; var10 < param2; var10++) {
                incrementValue$0 = param5;
                param5++;
                this.field_k[var9 + var10] = param4[incrementValue$0];
            }
            param5 = param5 + param6;
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        param2 = param2 - param0;
        param3 = param3 - param1;
        if (param3 != 0) {
          if (param2 != 0) {
            L0: {
              if (param2 + param3 >= 0) {
                break L0;
              } else {
                param0 = param0 + param2;
                param2 = -param2;
                param1 = param1 + param3;
                param3 = -param3;
                break L0;
              }
            }
            L1: {
              if (param2 <= param3) {
                L2: {
                  param0 = param0 << 16;
                  param0 = param0 + 32768;
                  param2 = param2 << 16;
                  var7 = (int)Math.floor((double)param2 / (double)param3 + 0.5);
                  param3 = param3 + param1;
                  if (param1 >= this.field_n) {
                    break L2;
                  } else {
                    param0 = param0 + var7 * (this.field_n - param1);
                    param1 = this.field_n;
                    break L2;
                  }
                }
                L3: {
                  if (param3 < this.field_p) {
                    break L3;
                  } else {
                    param3 = this.field_p - 1;
                    break L3;
                  }
                }
                L4: {
                  var8 = param4 >>> 24;
                  if (param5 == 0) {
                    break L4;
                  } else {
                    L5: {
                      if (param5 != 1) {
                        break L5;
                      } else {
                        if (var8 != 255) {
                          break L5;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (param5 != 1) {
                      if (param5 != 2) {
                        throw new IllegalArgumentException();
                      } else {
                        L6: while (true) {
                          if (param1 > param3) {
                            break L1;
                          } else {
                            L7: {
                              var9 = param0 >> 16;
                              if (var9 < this.field_H) {
                                break L7;
                              } else {
                                if (var9 >= this.field_A) {
                                  break L7;
                                } else {
                                  var10 = var9 + param1 * this.field_i;
                                  var11 = this.field_k[var10];
                                  var12 = param4 + var11;
                                  var13 = (param4 & 16711935) + (var11 & 16711935);
                                  var11 = (var13 & 16777472) + (var12 - var13 & 65536);
                                  this.field_k[var10] = var12 - var11 | var11 - (var11 >>> 8);
                                  break L7;
                                }
                              }
                            }
                            param0 = param0 + var7;
                            param1++;
                            continue L6;
                          }
                        }
                      }
                    } else {
                      param4 = ((param4 & 16711935) * var8 >> 8 & 16711935) + ((param4 & 65280) * var8 >> 8 & 65280) + (var8 << 24);
                      var9 = 256 - var8;
                      L8: while (true) {
                        if (param1 > param3) {
                          break L1;
                        } else {
                          L9: {
                            var10 = param0 >> 16;
                            if (var10 < this.field_H) {
                              break L9;
                            } else {
                              if (var10 >= this.field_A) {
                                break L9;
                              } else {
                                var11 = var10 + param1 * this.field_i;
                                var12 = this.field_k[var11];
                                var12 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                                this.field_k[var10 + param1 * this.field_i] = param4 + var12;
                                break L9;
                              }
                            }
                          }
                          param0 = param0 + var7;
                          param1++;
                          continue L8;
                        }
                      }
                    }
                  }
                }
                L10: while (true) {
                  if (param1 > param3) {
                    break L1;
                  } else {
                    L11: {
                      var9 = param0 >> 16;
                      if (var9 < this.field_H) {
                        break L11;
                      } else {
                        if (var9 >= this.field_A) {
                          break L11;
                        } else {
                          this.field_k[var9 + param1 * this.field_i] = param4;
                          break L11;
                        }
                      }
                    }
                    param0 = param0 + var7;
                    param1++;
                    continue L10;
                  }
                }
              } else {
                L12: {
                  param1 = param1 << 16;
                  param1 = param1 + 32768;
                  param3 = param3 << 16;
                  var7 = (int)Math.floor((double)param3 / (double)param2 + 0.5);
                  param2 = param2 + param0;
                  if (param0 >= this.field_H) {
                    break L12;
                  } else {
                    param1 = param1 + var7 * (this.field_H - param0);
                    param0 = this.field_H;
                    break L12;
                  }
                }
                L13: {
                  if (param2 < this.field_A) {
                    break L13;
                  } else {
                    param2 = this.field_A - 1;
                    break L13;
                  }
                }
                L14: {
                  var8 = param4 >>> 24;
                  if (param5 == 0) {
                    break L14;
                  } else {
                    L15: {
                      if (param5 != 1) {
                        break L15;
                      } else {
                        if (var8 != 255) {
                          break L15;
                        } else {
                          break L14;
                        }
                      }
                    }
                    if (param5 != 1) {
                      if (param5 != 2) {
                        throw new IllegalArgumentException();
                      } else {
                        L16: while (true) {
                          if (param0 > param2) {
                            break L1;
                          } else {
                            L17: {
                              var9 = param1 >> 16;
                              if (var9 < this.field_n) {
                                break L17;
                              } else {
                                if (var9 >= this.field_p) {
                                  break L17;
                                } else {
                                  var10 = param0 + var9 * this.field_i;
                                  var11 = this.field_k[var10];
                                  var12 = param4 + var11;
                                  var13 = (param4 & 16711935) + (var11 & 16711935);
                                  var11 = (var13 & 16777472) + (var12 - var13 & 65536);
                                  this.field_k[var10] = var12 - var11 | var11 - (var11 >>> 8);
                                  break L17;
                                }
                              }
                            }
                            param1 = param1 + var7;
                            param0++;
                            continue L16;
                          }
                        }
                      }
                    } else {
                      param4 = ((param4 & 16711935) * var8 >> 8 & 16711935) + ((param4 & 65280) * var8 >> 8 & 65280) + (var8 << 24);
                      var9 = 256 - var8;
                      L18: while (true) {
                        if (param0 > param2) {
                          break L1;
                        } else {
                          L19: {
                            var10 = param1 >> 16;
                            if (var10 < this.field_n) {
                              break L19;
                            } else {
                              if (var10 >= this.field_p) {
                                break L19;
                              } else {
                                var11 = param0 + var10 * this.field_i;
                                var12 = this.field_k[var11];
                                var12 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                                this.field_k[var11] = param4 + var12;
                                break L19;
                              }
                            }
                          }
                          param1 = param1 + var7;
                          param0++;
                          continue L18;
                        }
                      }
                    }
                  }
                }
                L20: while (true) {
                  if (param0 > param2) {
                    break L1;
                  } else {
                    L21: {
                      var9 = param1 >> 16;
                      if (var9 < this.field_n) {
                        break L21;
                      } else {
                        if (var9 >= this.field_p) {
                          break L21;
                        } else {
                          this.field_k[param0 + var9 * this.field_i] = param4;
                          break L21;
                        }
                      }
                    }
                    param1 = param1 + var7;
                    param0++;
                    continue L20;
                  }
                }
              }
            }
            return;
          } else {
            L22: {
              if (param3 < 0) {
                this.P(param0, param1 + param3, -param3 + 1, param4, param5);
                break L22;
              } else {
                this.P(param0, param1, param3 + 1, param4, param5);
                break L22;
              }
            }
            return;
          }
        } else {
          L23: {
            if (param2 < 0) {
              this.U(param0 + param2, param1, -param2 + 1, param4, param5);
              break L23;
            } else {
              this.U(param0, param1, param2 + 1, param4, param5);
              break L23;
            }
          }
          return;
        }
    }

    final void a(za param0) {
    }

    final void T(int param0, int param1, int param2, int param3) {
        if (this.field_H < param0) {
            this.field_H = param0;
        }
        if (this.field_n < param1) {
            this.field_n = param1;
        }
        if (this.field_A > param2) {
            this.field_A = param2;
        }
        if (this.field_p > param3) {
            this.field_p = param3;
        }
        this.z();
    }

    final ka a(cbb param0, int param1, int param2, int param3, int param4) {
        return (ka) ((Object) new b((sob) (this), param0, param1, param3, param4, param2));
    }

    final int t() {
        return 0;
    }

    final wib b(int param0, int param1) {
        return (wib) ((Object) new woa(param0, param1));
    }

    private final void z() {
        daa var2_ref_daa = null;
        int var2 = 0;
        int var3 = 0;
        int var1 = 0;
        this.field_C = this.field_H - this.field_J;
        this.field_h = this.field_n - this.field_s;
        for (var1 = 0; var1 < this.field_g; var1++) {
            var2_ref_daa = this.field_x[var1].field_e;
            var2_ref_daa.field_b = this.field_A - this.field_H;
            var2_ref_daa.field_g = this.field_p - this.field_n;
        }
        var1 = this.field_n * this.field_i + this.field_H;
        for (var2 = this.field_n; var2 < this.field_p; var2++) {
            for (var3 = 0; var3 < this.field_g; var3++) {
                this.field_x[var3].field_e.field_k[var2 - this.field_n] = var1;
            }
            var1 = var1 + this.field_i;
        }
    }

    final int[] na(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int incrementValue$0 = 0;
        int[] var5 = new int[param2 * param3];
        int var6 = 0;
        for (var7 = 0; var7 < param3; var7++) {
            var8 = (param1 + var7) * this.field_i + param0;
            for (var9 = 0; var9 < param2; var9++) {
                incrementValue$0 = var6;
                var6++;
                var5[incrementValue$0] = this.field_k[var8 + var9];
            }
        }
        return var5;
    }

    final void DA(int param0, int param1, int param2, int param3) {
        this.field_J = param0;
        this.field_s = param1;
        this.field_I = param2;
        this.field_m = param3;
        this.z();
    }

    final void U(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          if (param1 < this.field_n) {
            break L0;
          } else {
            if (param1 < this.field_p) {
              L1: {
                if (param0 >= this.field_H) {
                  break L1;
                } else {
                  param2 = param2 - (this.field_H - param0);
                  param0 = this.field_H;
                  break L1;
                }
              }
              L2: {
                if (param0 + param2 <= this.field_A) {
                  break L2;
                } else {
                  param2 = this.field_A - param0;
                  break L2;
                }
              }
              L3: {
                var6 = param0 + param1 * this.field_i;
                var7 = param3 >>> 24;
                if (param4 == 0) {
                  break L3;
                } else {
                  L4: {
                    if (param4 != 1) {
                      break L4;
                    } else {
                      if (var7 != 255) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L5: {
                    if (param4 != 1) {
                      if (param4 != 2) {
                        throw new IllegalArgumentException();
                      } else {
                        var8 = 0;
                        L6: while (true) {
                          if (var8 >= param2) {
                            break L5;
                          } else {
                            var9 = this.field_k[var6 + var8];
                            var10 = param3 + var9;
                            var11 = (param3 & 16711935) + (var9 & 16711935);
                            var9 = (var11 & 16777472) + (var10 - var11 & 65536);
                            this.field_k[var6 + var8] = var10 - var9 | var9 - (var9 >>> 8);
                            var8++;
                            continue L6;
                          }
                        }
                      }
                    } else {
                      param3 = ((param3 & 16711935) * var7 >> 8 & 16711935) + ((param3 & 65280) * var7 >> 8 & 65280) + (var7 << 24);
                      var8 = 256 - var7;
                      var9 = 0;
                      L7: while (true) {
                        if (var9 >= param2) {
                          break L5;
                        } else {
                          var10 = this.field_k[var6 + var9];
                          var10 = ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & 65280) * var8 >> 8 & 65280);
                          this.field_k[var6 + var9] = param3 + var10;
                          var9++;
                          continue L7;
                        }
                      }
                    }
                  }
                  return;
                }
              }
              var8 = 0;
              L8: while (true) {
                if (var8 >= param2) {
                  break L0;
                } else {
                  this.field_k[var6 + var8] = param3;
                  var8++;
                  continue L8;
                }
              }
            } else {
              return;
            }
          }
        }
    }

    final void f(int param0, int param1) {
        co discarded$0 = this.a((Runnable) ((Object) Thread.currentThread()));
        this.field_y = param0;
        this.field_e = param1;
    }

    final boolean l() {
        return false;
    }

    private final void A() {
        this.field_H = 0;
        this.field_n = 0;
        this.field_A = this.field_i;
        this.field_p = this.field_j;
        this.z();
    }

    final void d(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.U(param0, param1, param2, param4, param5);
        this.U(param0, param1 + param3 - 1, param2, param4, param5);
        this.P(param0, param1 + 1, param3 - 2, param4, param5);
        this.P(param0 + param2 - 1, param1 + 1, param3 - 2, param4, param5);
    }

    final void K(int[] param0) {
        param0[0] = this.field_H;
        param0[1] = this.field_n;
        param0[2] = this.field_A;
        param0[3] = this.field_p;
    }

    static {
        field_K = "off";
    }
}
