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
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
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
                                                  incrementValue$0 = var11;
                                                  var11++;
                                                  var12 = var12 + (incrementValue$0 + var11);
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
                                        incrementValue$1 = var11;
                                        var11++;
                                        var12 = var12 + (incrementValue$1 + var11);
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
                                                incrementValue$2 = var11;
                                                var11++;
                                                var12 = var12 + (incrementValue$2 + var11);
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
                                      incrementValue$3 = var11;
                                      var11++;
                                      var12 = var12 + (incrementValue$3 + var11);
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
                                if (param0 + var10 < this.field_A) {
                                  if (param1 - var10 >= this.field_n) {
                                    if (param1 + var10 < this.field_p) {
                                      this.field_k[var6 - var10] = param3;
                                      this.field_k[var6 + var10] = param3;
                                      this.field_k[var8] = param3;
                                      this.field_k[var9] = param3;
                                      L39: while (true) {
                                        L40: {
                                          incrementValue$4 = var11;
                                          var11++;
                                          var12 = var12 + (incrementValue$4 + var11);
                                          var6 = var6 - this.field_i;
                                          var7 = var7 + this.field_i;
                                          if (var12 <= param2) {
                                            break L40;
                                          } else {
                                            var10--;
                                            var12 = var12 - (var10 + var10);
                                            var8 = var8 + this.field_i;
                                            var9 = var9 - this.field_i;
                                            break L40;
                                          }
                                        }
                                        if (var10 >= var11) {
                                          this.field_k[var8 - var11] = param3;
                                          this.field_k[var8 + var11] = param3;
                                          this.field_k[var6 - var10] = param3;
                                          this.field_k[var6 + var10] = param3;
                                          this.field_k[var7 - var10] = param3;
                                          this.field_k[var7 + var10] = param3;
                                          this.field_k[var9 - var11] = param3;
                                          this.field_k[var9 + var11] = param3;
                                          continue L39;
                                        } else {
                                          break L3;
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
                            L41: {
                              if (param0 + var10 < this.field_A) {
                                if (param1 >= this.field_n) {
                                  if (param1 < this.field_p) {
                                    this.field_k[var6 + var10] = param3;
                                    if (param1 - var10 < this.field_n) {
                                      break L41;
                                    } else {
                                      if (param0 < this.field_H) {
                                        break L41;
                                      } else {
                                        if (param0 >= this.field_A) {
                                          break L41;
                                        } else {
                                          this.field_k[var8] = param3;
                                          break L41;
                                        }
                                      }
                                    }
                                  } else {
                                    if (param1 - var10 < this.field_n) {
                                      break L41;
                                    } else {
                                      if (param0 < this.field_H) {
                                        break L41;
                                      } else {
                                        if (param0 >= this.field_A) {
                                          break L41;
                                        } else {
                                          this.field_k[var8] = param3;
                                          break L41;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  if (param1 - var10 < this.field_n) {
                                    break L41;
                                  } else {
                                    if (param0 < this.field_H) {
                                      break L41;
                                    } else {
                                      if (param0 >= this.field_A) {
                                        break L41;
                                      } else {
                                        this.field_k[var8] = param3;
                                        break L41;
                                      }
                                    }
                                  }
                                }
                              } else {
                                if (param1 - var10 < this.field_n) {
                                  break L41;
                                } else {
                                  if (param0 < this.field_H) {
                                    break L41;
                                  } else {
                                    if (param0 >= this.field_A) {
                                      break L41;
                                    } else {
                                      this.field_k[var8] = param3;
                                      break L41;
                                    }
                                  }
                                }
                              }
                            }
                            L42: {
                              if (param1 + var10 >= this.field_p) {
                                break L42;
                              } else {
                                if (param0 < this.field_H) {
                                  break L42;
                                } else {
                                  if (param0 >= this.field_A) {
                                    break L42;
                                  } else {
                                    this.field_k[var9] = param3;
                                    break L42;
                                  }
                                }
                              }
                            }
                            L43: while (true) {
                              L44: {
                                incrementValue$5 = var11;
                                var11++;
                                var12 = var12 + (incrementValue$5 + var11);
                                var6 = var6 - this.field_i;
                                var7 = var7 + this.field_i;
                                if (var12 <= param2) {
                                  break L44;
                                } else {
                                  var10--;
                                  var12 = var12 - (var10 + var10);
                                  var8 = var8 + this.field_i;
                                  var9 = var9 - this.field_i;
                                  break L44;
                                }
                              }
                              if (var10 >= var11) {
                                L45: {
                                  if (param1 - var10 < this.field_n) {
                                    break L45;
                                  } else {
                                    if (param1 - var10 >= this.field_p) {
                                      break L45;
                                    } else {
                                      if (param0 - var11 >= this.field_H) {
                                        if (param0 - var11 < this.field_A) {
                                          this.field_k[var8 - var11] = param3;
                                          if (param0 + var11 < this.field_H) {
                                            break L45;
                                          } else {
                                            if (param0 + var11 >= this.field_A) {
                                              break L45;
                                            } else {
                                              this.field_k[var8 + var11] = param3;
                                              break L45;
                                            }
                                          }
                                        } else {
                                          if (param0 + var11 < this.field_H) {
                                            break L45;
                                          } else {
                                            if (param0 + var11 >= this.field_A) {
                                              break L45;
                                            } else {
                                              this.field_k[var8 + var11] = param3;
                                              break L45;
                                            }
                                          }
                                        }
                                      } else {
                                        if (param0 + var11 < this.field_H) {
                                          break L45;
                                        } else {
                                          if (param0 + var11 >= this.field_A) {
                                            break L45;
                                          } else {
                                            this.field_k[var8 + var11] = param3;
                                            break L45;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                L46: {
                                  if (param1 - var11 < this.field_n) {
                                    break L46;
                                  } else {
                                    if (param1 - var11 >= this.field_p) {
                                      break L46;
                                    } else {
                                      L47: {
                                        if (param0 - var10 < this.field_H) {
                                          break L47;
                                        } else {
                                          if (param0 - var10 >= this.field_A) {
                                            break L47;
                                          } else {
                                            this.field_k[var6 - var10] = param3;
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
                                          this.field_k[var6 + var10] = param3;
                                          break L46;
                                        }
                                      }
                                    }
                                  }
                                }
                                L48: {
                                  if (param1 + var11 < this.field_n) {
                                    break L48;
                                  } else {
                                    if (param1 + var11 >= this.field_p) {
                                      break L48;
                                    } else {
                                      L49: {
                                        if (param0 - var10 < this.field_H) {
                                          break L49;
                                        } else {
                                          if (param0 - var10 >= this.field_A) {
                                            break L49;
                                          } else {
                                            this.field_k[var7 - var10] = param3;
                                            break L49;
                                          }
                                        }
                                      }
                                      if (param0 + var10 < this.field_H) {
                                        break L48;
                                      } else {
                                        if (param0 + var10 >= this.field_A) {
                                          break L48;
                                        } else {
                                          this.field_k[var7 + var10] = param3;
                                          break L48;
                                        }
                                      }
                                    }
                                  }
                                }
                                if (param1 + var10 < this.field_n) {
                                  continue L43;
                                } else {
                                  if (param1 + var10 >= this.field_p) {
                                    continue L43;
                                  } else {
                                    L50: {
                                      if (param0 - var11 < this.field_H) {
                                        break L50;
                                      } else {
                                        if (param0 - var11 >= this.field_A) {
                                          break L50;
                                        } else {
                                          this.field_k[var9 - var11] = param3;
                                          break L50;
                                        }
                                      }
                                    }
                                    if (param0 + var11 < this.field_H) {
                                      continue L43;
                                    } else {
                                      if (param0 + var11 >= this.field_A) {
                                        continue L43;
                                      } else {
                                        this.field_k[var9 + var11] = param3;
                                        continue L43;
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
          L51: {
            if (param0 < this.field_H) {
              break L51;
            } else {
              L52: {
                if (param1 < this.field_n) {
                  break L52;
                } else {
                  if (param0 >= this.field_A) {
                    break L52;
                  } else {
                    if (param1 < this.field_p) {
                      L53: {
                        L54: {
                          var6 = param3 >>> 24;
                          var7 = param0 + param1 * this.field_i;
                          if (param4 == 0) {
                            break L54;
                          } else {
                            L55: {
                              if (param4 != 1) {
                                break L55;
                              } else {
                                if (var6 != 255) {
                                  break L55;
                                } else {
                                  break L54;
                                }
                              }
                            }
                            if (param4 != 1) {
                              if (param4 != 2) {
                                break L51;
                              } else {
                                var8 = var7;
                                var9 = param3;
                                var10 = this.field_k[var8];
                                var11 = var9 + var10;
                                var12 = (var9 & 16711935) + (var10 & 16711935);
                                var10 = (var12 & 16777472) + (var11 - var12 & 65536);
                                this.field_k[var8] = var11 - var10 | var10 - (var10 >>> 8);
                                break L53;
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
                              break L53;
                            }
                          }
                        }
                        this.field_k[var7] = param3;
                        break L53;
                      }
                      return;
                    } else {
                      break L52;
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
        int incrementValue$4 = 0;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
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
                  incrementValue$4 = var8;
                  var8++;
                  var11 = param0[incrementValue$4] >>> 24;
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
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int statePc = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0 >= this.field_H) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    param2 = param2 - (this.field_H - param0);
                    param0 = this.field_H;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (param1 >= this.field_n) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    param3 = param3 - (this.field_n - param1);
                    param1 = this.field_n;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (param0 + param2 <= this.field_A) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    param2 = this.field_A - param0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (param1 + param3 <= this.field_p) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    param3 = this.field_p - param1;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (param2 <= 0) {
                        statePc = 43;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (param3 <= 0) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (param0 > this.field_A) {
                        statePc = 13;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (param1 <= this.field_p) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    return;
                }
                case 14: {
                    var7 = this.field_i - param2;
                    var8 = param0 + param1 * this.field_i;
                    var9 = param4 >>> 24;
                    if (param5 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (param5 != 1) {
                        statePc = 27;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (var9 != 255) {
                        statePc = 27;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var10 = param2 >> 3;
                    var11 = param2 & 7;
                    param2 = var8 - 1;
                    var12 = -param3;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (var12 >= 0) {
                        statePc = 43;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (var10 <= 0) {
                        statePc = 23;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    param0 = var10;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
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
                        statePc = 22;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (var11 <= 0) {
                        statePc = 26;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    param0 = var11;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    param2++;
                    this.field_k[param2] = param4;
                    param0--;
                    if (param0 > 0) {
                        statePc = 25;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    param2 = param2 + var7;
                    var12++;
                    statePc = 19;
                    continue stateLoop;
                }
                case 27: {
                    if (param5 != 1) {
                        statePc = 34;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    param4 = ((param4 & 16711935) * var9 >> 8 & 16711935) + (((param4 & -16711936) >>> 8) * var9 & -16711936);
                    var10 = 256 - var9;
                    var11 = 0;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    if (var11 >= param3) {
                        statePc = 42;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var12 = -param2;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if (var12 >= 0) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var13 = this.field_k[var8];
                    var13 = ((var13 & 16711935) * var10 >> 8 & 16711935) + (((var13 & -16711936) >>> 8) * var10 & -16711936);
                    incrementValue$0 = var8;
                    var8++;
                    this.field_k[incrementValue$0] = param4 + var13;
                    var12++;
                    statePc = 31;
                    continue stateLoop;
                }
                case 33: {
                    var8 = var8 + var7;
                    var11++;
                    statePc = 29;
                    continue stateLoop;
                }
                case 34: {
                    if (param5 != 2) {
                        statePc = 41;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var10 = 0;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    if (var10 >= param3) {
                        statePc = 42;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var11 = -param2;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if (var11 >= 0) {
                        statePc = 40;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var12 = this.field_k[var8];
                    var13 = param4 + var12;
                    var14 = (param4 & 16711935) + (var12 & 16711935);
                    var12 = (var14 & 16777472) + (var13 - var14 & 65536);
                    incrementValue$1 = var8;
                    var8++;
                    this.field_k[incrementValue$1] = var13 - var12 | var12 - (var12 >>> 8);
                    var11++;
                    statePc = 38;
                    continue stateLoop;
                }
                case 40: {
                    var8 = var8 + var7;
                    var10++;
                    statePc = 36;
                    continue stateLoop;
                }
                case 41: {
                    throw new IllegalArgumentException();
                }
                case 42: {
                    return;
                }
                case 43: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void ZA(int param0, float param1, float param2, float param3, float param4, float param5) {
        Math.sqrt((double)(param3 * param3 + param4 * param4 + param5 * param5));
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
        int var2;
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
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
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
        gpb var4;
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
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        daa stackIn_25_0 = null;
        daa stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        daa stackIn_34_0 = null;
        daa stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        co var8;
        daa var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var27;
        int var28;
        L0: {
          var8 = this.a((Runnable) ((Object) Thread.currentThread()));
          var9 = var8.field_e;
          var10 = param2 - param0;
          var11 = param3 - param1;
          if (var10 < 0) {
            stackIn_3_0 = -var10;
            break L0;
          } else {
            stackIn_3_0 = var10;
            break L0;
          }
        }
        L1: {
          var12 = stackIn_3_0;
          if (var11 < 0) {
            stackIn_6_0 = -var11;
            break L1;
          } else {
            stackIn_6_0 = var11;
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
              stackIn_25_0 = (daa) (var9);

              if (var21 < 0) {
                break L6;
              } else {
                stackIn_25_0 = (daa) ((Object) stackIn_25_0);

                if (var21 > var9.field_b) {
                  break L6;
                } else {
                  stackIn_25_0 = (daa) ((Object) stackIn_25_0);

                  if (var22 < 0) {
                    break L6;
                  } else {
                    stackIn_25_0 = (daa) ((Object) stackIn_25_0);

                    if (var22 > var9.field_b) {
                      break L6;
                    } else {
                      stackIn_25_0 = (daa) ((Object) stackIn_25_0);

                      if (var23 < 0) {
                        break L6;
                      } else {


                        if (var23 <= var9.field_b) {
                          stackIn_27_0 = (daa) ((Object) stackIn_25_0);
                          stackIn_27_1 = 0;
                          break L5;
                        } else {
                          stackIn_25_0 = (daa) ((Object) stackIn_25_0);
                          break L6;
                        }
                      }
                    }
                  }
                }
              }
            }
            stackIn_27_0 = (daa) ((Object) stackIn_25_0);
            stackIn_27_1 = 1;
            break L5;
          }
          L7: {
            L8: {
              stackIn_27_0.field_n = stackIn_27_1 != 0;
              var9.a((float)var25, (float)var26, (float)var27, (float)var21, (float)var22, (float)var23, 100.0f, 100.0f, 100.0f, param4);
              stackIn_34_0 = (daa) (var9);

              if (var21 < 0) {
                break L8;
              } else {
                stackIn_34_0 = (daa) ((Object) stackIn_34_0);

                if (var21 > var9.field_b) {
                  break L8;
                } else {
                  stackIn_34_0 = (daa) ((Object) stackIn_34_0);

                  if (var23 < 0) {
                    break L8;
                  } else {
                    stackIn_34_0 = (daa) ((Object) stackIn_34_0);

                    if (var23 > var9.field_b) {
                      break L8;
                    } else {
                      stackIn_34_0 = (daa) ((Object) stackIn_34_0);

                      if (var24 < 0) {
                        break L8;
                      } else {


                        if (var24 <= var9.field_b) {
                          stackIn_36_0 = (daa) ((Object) stackIn_34_0);
                          stackIn_36_1 = 0;
                          break L7;
                        } else {
                          stackIn_34_0 = (daa) ((Object) stackIn_34_0);
                          break L8;
                        }
                      }
                    }
                  }
                }
              }
            }
            stackIn_36_0 = (daa) ((Object) stackIn_34_0);
            stackIn_36_1 = 1;
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
        int[] var4;
        int[] var5;
        int var6;
        int var7;
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
        gpb var7 = null;
        java.awt.Dimension var5 = null;
        float[] array$0 = null;
        gpb var6 = (gpb) ((Object) this.field_t.a((long)param0.hashCode(), 97));
        if (var6 != null) {
            var6.b(-3846);
            var7 = rba.a(param1, true, param0, param2);
            this.field_t.a((long)param0.hashCode(), var7, (byte) -122);
            if (this.field_l == param0 && this.field_c == null) {
                var5 = param0.getSize();
                this.field_z = var5.width;
                this.field_o = var5.height;
                this.field_D = var7;
                this.field_k = var7.field_f;
                this.field_i = var7.field_e;
                this.field_j = var7.field_d;
                if (this.field_i != this.field_F || this.field_j != this.field_q) {
                    this.field_F = this.field_i;
                    this.field_v = this.field_i;
                    this.field_q = this.field_j;
                    this.field_u = this.field_j;
                    array$0 = new float[this.field_F * this.field_q];
                    this.field_r = array$0;
                    this.field_G = array$0;
                }
                this.y();
            }
            return;
        }
    }

    final void a(int param0, int param1) throws jkb {
        java.awt.Graphics var3 = null;
        if (this.field_l == null || this.field_D == null) {
            throw new IllegalStateException(field_K);
        }
        try {
            var3 = this.field_l.getGraphics();
            this.field_D.a(var3, this.field_z, param1, 32255, param0, 0, 0, this.field_o);
        } catch (Exception exception) {
            this.field_l.repaint();
        }
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
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int statePc = 0;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (this.field_H != 0) {
                        statePc = 9;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (this.field_A != this.field_i) {
                        statePc = 9;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (this.field_n != 0) {
                        statePc = 9;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (this.field_p != this.field_j) {
                        statePc = 9;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var1 = this.field_r.length;
                    var2 = var1 - (var1 & 7);
                    var3 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (var3 >= var2) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    incrementValue$0 = var3;
                    var3++;
                    this.field_r[incrementValue$0] = 2147483648.0f;
                    incrementValue$1 = var3;
                    var3++;
                    this.field_r[incrementValue$1] = 2147483648.0f;
                    incrementValue$2 = var3;
                    var3++;
                    this.field_r[incrementValue$2] = 2147483648.0f;
                    incrementValue$3 = var3;
                    var3++;
                    this.field_r[incrementValue$3] = 2147483648.0f;
                    incrementValue$4 = var3;
                    var3++;
                    this.field_r[incrementValue$4] = 2147483648.0f;
                    incrementValue$5 = var3;
                    var3++;
                    this.field_r[incrementValue$5] = 2147483648.0f;
                    incrementValue$6 = var3;
                    var3++;
                    this.field_r[incrementValue$6] = 2147483648.0f;
                    incrementValue$7 = var3;
                    var3++;
                    this.field_r[incrementValue$7] = 2147483648.0f;
                    statePc = 5;
                    continue stateLoop;
                }
                case 7: {
                    if (var3 >= var1) {
                        statePc = 19;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    incrementValue$8 = var3;
                    var3++;
                    this.field_r[incrementValue$8] = 2147483648.0f;
                    statePc = 7;
                    continue stateLoop;
                }
                case 9: {
                    var1 = this.field_A - this.field_H;
                    var2 = this.field_p - this.field_n;
                    var3 = this.field_i - var1;
                    var4 = this.field_H + this.field_n * this.field_i;
                    var5 = var1 >> 3;
                    var6 = var1 & 7;
                    var1 = var4 - 1;
                    var8 = -var2;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (var8 >= 0) {
                        statePc = 18;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (var5 <= 0) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var7 = var5;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
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
                        statePc = 13;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (var6 <= 0) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var7 = var6;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    var1++;
                    this.field_r[var1] = 2147483648.0f;
                    var7--;
                    if (var7 > 0) {
                        statePc = 16;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var1 = var1 + var3;
                    var8++;
                    statePc = 10;
                    continue stateLoop;
                }
                case 18: {
                    return;
                }
                case 19: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
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
        daa stackIn_7_0 = null;
        daa stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        co var11;
        daa var12;
        int var13;
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
            stackIn_7_0 = (daa) (var12);

            if (param0 < 0) {
              break L1;
            } else {
              stackIn_7_0 = (daa) ((Object) stackIn_7_0);

              if (param0 > var12.field_b) {
                break L1;
              } else {
                stackIn_7_0 = (daa) ((Object) stackIn_7_0);

                if (param2 < 0) {
                  break L1;
                } else {
                  stackIn_7_0 = (daa) ((Object) stackIn_7_0);

                  if (param2 > var12.field_b) {
                    break L1;
                  } else {
                    stackIn_7_0 = (daa) ((Object) stackIn_7_0);

                    if (param4 < 0) {
                      break L1;
                    } else {


                      if (param4 <= var12.field_b) {
                        stackIn_9_0 = (daa) ((Object) stackIn_7_0);
                        stackIn_9_1 = 0;
                        break L0;
                      } else {
                        stackIn_7_0 = (daa) ((Object) stackIn_7_0);
                        break L1;
                      }
                    }
                  }
                }
              }
            }
          }
          stackIn_9_0 = (daa) ((Object) stackIn_7_0);
          stackIn_9_1 = 1;
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
        float[] array$1 = null;
        gpb var2;
        java.awt.Dimension var3;
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
              L1: {
                this.field_l = param0;
                var3 = param0.getSize();
                this.field_z = var3.width;
                this.field_o = var3.height;
                this.field_D = var2;
                if (this.field_c != null) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      this.field_k = var2.field_f;
                      this.field_i = var2.field_e;
                      this.field_j = var2.field_d;
                      if (this.field_i != this.field_F) {
                        break L3;
                      } else {
                        if (this.field_j == this.field_q) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    this.field_F = this.field_i;
                    this.field_v = this.field_i;
                    this.field_q = this.field_j;
                    this.field_u = this.field_j;
                    array$1 = new float[this.field_F * this.field_q];
                    this.field_r = array$1;
                    this.field_G = array$1;
                    break L2;
                  }
                  this.y();
                  break L1;
                }
              }
              break L0;
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
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
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
                                  incrementValue$0 = var10;
                                  var10--;
                                  var13 = var13 - (incrementValue$0 + var10);
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
                                incrementValue$1 = var11;
                                var11++;
                                var12 = var12 + (incrementValue$1 + var11);
                                continue L8;
                              } else {
                                var19 = this.field_k[var17];
                                var20 = param3 + var19;
                                var21 = (param3 & 16711935) + (var19 & 16711935);
                                var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                incrementValue$2 = var17;
                                var17++;
                                this.field_k[incrementValue$2] = var20 - var19 | var19 - (var19 >>> 8);
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
                                  incrementValue$3 = var11;
                                  var11--;
                                  var12 = var12 - (incrementValue$3 + var11);
                                  var13 = var13 - (var11 + var11);
                                  continue L7;
                                } else {
                                  var19 = this.field_k[var17];
                                  var20 = param3 + var19;
                                  var21 = (param3 & 16711935) + (var19 & 16711935);
                                  var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                  incrementValue$4 = var17;
                                  var17++;
                                  this.field_k[incrementValue$4] = var20 - var19 | var19 - (var19 >>> 8);
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
                        incrementValue$5 = var10;
                        var10++;
                        var13 = var13 + (incrementValue$5 + var10);
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
                                incrementValue$6 = var10;
                                var10--;
                                var13 = var13 - (incrementValue$6 + var10);
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
                              incrementValue$7 = var11;
                              var11++;
                              var12 = var12 + (incrementValue$7 + var11);
                              continue L20;
                            } else {
                              var20 = this.field_k[var18];
                              var20 = ((var20 & 16711935) * var15 >> 8 & 16711935) + ((var20 & 65280) * var15 >> 8 & 65280);
                              incrementValue$8 = var18;
                              var18++;
                              this.field_k[incrementValue$8] = param3 + var20;
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
                                incrementValue$9 = var11;
                                var11--;
                                var12 = var12 - (incrementValue$9 + var11);
                                var13 = var13 - (var11 + var11);
                                continue L19;
                              } else {
                                var20 = this.field_k[var18];
                                var20 = ((var20 & 16711935) * var15 >> 8 & 16711935) + ((var20 & 65280) * var15 >> 8 & 65280);
                                incrementValue$10 = var18;
                                var18++;
                                this.field_k[incrementValue$10] = param3 + var20;
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
                      incrementValue$11 = var10;
                      var10++;
                      var13 = var13 + (incrementValue$11 + var10);
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
                        incrementValue$12 = var10;
                        var10--;
                        var13 = var13 - (incrementValue$12 + var10);
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
                      incrementValue$13 = var11;
                      var11++;
                      var12 = var12 + (incrementValue$13 + var11);
                      continue L32;
                    } else {
                      incrementValue$14 = var17;
                      var17++;
                      this.field_k[incrementValue$14] = param3;
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
                        incrementValue$15 = var11;
                        var11--;
                        var12 = var12 - (incrementValue$15 + var11);
                        var13 = var13 - (var11 + var11);
                        continue L31;
                      } else {
                        incrementValue$16 = var17;
                        var17++;
                        this.field_k[incrementValue$16] = param3;
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
              incrementValue$17 = var10;
              var10++;
              var13 = var13 + (incrementValue$17 + var10);
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
        int[] stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int[] stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        int[] var3;
        byte[] var4;
        int var5;
        int var6;
        Object var7;
        int[] var8;
        byte[] var9;
        int var10;
        int var11;
        int var12;
        int var13;
        byte[] var14;
        int[] var15;
        int[] var16;
        byte[] var17;
        int[] var18;
        int[] var19;
        int[] var20;
        byte[] var21;
        int[] var22;
        int[] var23;
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
                      stackIn_26_0 = (int[]) (var15);

                      stackIn_26_1 = var11 + var12;

                      if (var13 == 0) {
                        stackIn_27_0 = (int[]) ((Object) stackIn_26_0);
                        stackIn_27_1 = stackIn_26_1;
                        stackIn_27_2 = 0;
                        break L7;
                      } else {
                        stackIn_27_0 = (int[]) ((Object) stackIn_26_0);
                        stackIn_27_1 = stackIn_26_1;
                        stackIn_27_2 = -16777216 | var13;
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
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
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
                    L16: {
                      if (param5 != 1) {
                        if (param5 != 2) {
                          throw new IllegalArgumentException();
                        } else {
                          L17: while (true) {
                            if (param0 > param2) {
                              break L16;
                            } else {
                              L18: {
                                var9 = param1 >> 16;
                                if (var9 < this.field_n) {
                                  break L18;
                                } else {
                                  if (var9 >= this.field_p) {
                                    break L18;
                                  } else {
                                    var10 = param0 + var9 * this.field_i;
                                    var11 = this.field_k[var10];
                                    var12 = param4 + var11;
                                    var13 = (param4 & 16711935) + (var11 & 16711935);
                                    var11 = (var13 & 16777472) + (var12 - var13 & 65536);
                                    this.field_k[var10] = var12 - var11 | var11 - (var11 >>> 8);
                                    break L18;
                                  }
                                }
                              }
                              param1 = param1 + var7;
                              param0++;
                              continue L17;
                            }
                          }
                        }
                      } else {
                        param4 = ((param4 & 16711935) * var8 >> 8 & 16711935) + ((param4 & 65280) * var8 >> 8 & 65280) + (var8 << 24);
                        var9 = 256 - var8;
                        L19: while (true) {
                          if (param0 > param2) {
                            break L16;
                          } else {
                            L20: {
                              var10 = param1 >> 16;
                              if (var10 < this.field_n) {
                                break L20;
                              } else {
                                if (var10 >= this.field_p) {
                                  break L20;
                                } else {
                                  var11 = param0 + var10 * this.field_i;
                                  var12 = this.field_k[var11];
                                  var12 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                                  this.field_k[var11] = param4 + var12;
                                  break L20;
                                }
                              }
                            }
                            param1 = param1 + var7;
                            param0++;
                            continue L19;
                          }
                        }
                      }
                    }
                    break L1;
                  }
                }
                L21: while (true) {
                  if (param0 > param2) {
                    break L1;
                  } else {
                    L22: {
                      var9 = param1 >> 16;
                      if (var9 < this.field_n) {
                        break L22;
                      } else {
                        if (var9 >= this.field_p) {
                          break L22;
                        } else {
                          this.field_k[param0 + var9 * this.field_i] = param4;
                          break L22;
                        }
                      }
                    }
                    param1 = param1 + var7;
                    param0++;
                    continue L21;
                  }
                }
              }
            }
            return;
          } else {
            L23: {
              if (param3 < 0) {
                this.P(param0, param1 + param3, -param3 + 1, param4, param5);
                break L23;
              } else {
                this.P(param0, param1, param3 + 1, param4, param5);
                break L23;
              }
            }
            return;
          }
        } else {
          L24: {
            if (param2 < 0) {
              this.U(param0 + param2, param1, -param2 + 1, param4, param5);
              break L24;
            } else {
              this.U(param0, param1, param2 + 1, param4, param5);
              break L24;
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
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
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
        this.a((Runnable) ((Object) Thread.currentThread()));
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
