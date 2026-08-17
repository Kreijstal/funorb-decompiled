/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg extends mk {
    int[] field_E;

    final void a(int param0, int param1, int param2, int param3, int param4) {
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
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13_int;
        int[] var13;
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
        int[] var26;
        int[] var27;
        if (!this.field_D.h()) {
          L0: {
            var6 = this.field_D.field_f;
            param0 = param0 + this.field_g;
            param1 = param1 + this.field_z;
            var7 = param1 * var6 + param0;
            var8 = 0;
            var9 = this.field_p;
            var10 = this.field_o;
            var11 = var6 - var10;
            var12 = 0;
            if (param1 >= this.field_D.field_w) {
              break L0;
            } else {
              var13_int = this.field_D.field_w - param1;
              var9 = var9 - var13_int;
              param1 = this.field_D.field_w;
              var8 = var8 + var13_int * var10;
              var7 = var7 + var13_int * var6;
              break L0;
            }
          }
          L1: {
            if (param1 + var9 <= this.field_D.field_D) {
              break L1;
            } else {
              var9 = var9 - (param1 + var9 - this.field_D.field_D);
              break L1;
            }
          }
          L2: {
            if (param0 >= this.field_D.field_z) {
              break L2;
            } else {
              var13_int = this.field_D.field_z - param0;
              var10 = var10 - var13_int;
              param0 = this.field_D.field_z;
              var8 = var8 + var13_int;
              var7 = var7 + var13_int;
              var12 = var12 + var13_int;
              var11 = var11 + var13_int;
              break L2;
            }
          }
          L3: {
            if (param0 + var10 <= this.field_D.field_k) {
              break L3;
            } else {
              var13_int = param0 + var10 - this.field_D.field_k;
              var10 = var10 - var13_int;
              var12 = var12 + var13_int;
              var11 = var11 + var13_int;
              break L3;
            }
          }
          L4: {
            if (var10 <= 0) {
              break L4;
            } else {
              if (var9 > 0) {
                L5: {
                  var27 = this.field_D.field_E;
                  var26 = var27;
                  var13 = var26;
                  if (param4 != 0) {
                    if (param4 != 1) {
                      if (param4 != 2) {
                        throw new IllegalArgumentException();
                      } else {
                        if (param2 != 1) {
                          if (param2 != 0) {
                            if (param2 != 3) {
                              if (param2 != 2) {
                                throw new IllegalArgumentException();
                              } else {
                                var14 = param3 >>> 24;
                                var15 = 256 - var14;
                                var16 = (param3 & 16711935) * var15 & -16711936;
                                var17 = (param3 & 65280) * var15 & 16711680;
                                param3 = (var16 | var17) >>> 8;
                                var18 = -var9;
                                L6: while (true) {
                                  if (var18 >= 0) {
                                    break L5;
                                  } else {
                                    var19 = -var10;
                                    L7: while (true) {
                                      if (var19 >= 0) {
                                        var7 = var7 + var11;
                                        var8 = var8 + var12;
                                        var18++;
                                        continue L6;
                                      } else {
                                        incrementValue$0 = var8;
                                        var8++;
                                        var20 = this.field_E[incrementValue$0];
                                        if (var20 == 0) {
                                          var7++;
                                          var19++;
                                          continue L7;
                                        } else {
                                          var16 = (var20 & 16711935) * var14 & -16711936;
                                          var17 = (var20 & 65280) * var14 & 16711680;
                                          var20 = ((var16 | var17) >>> 8) + param3;
                                          var21 = var27[var7];
                                          var22 = var20 + var21;
                                          var23 = (var20 & 16711935) + (var21 & 16711935);
                                          var21 = (var23 & 16777472) + (var22 - var23 & 65536);
                                          incrementValue$1 = var7;
                                          var7++;
                                          var13[incrementValue$1] = var22 - var21 | var21 - (var21 >>> 8);
                                          var19++;
                                          continue L7;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              var14 = -var9;
                              L8: while (true) {
                                if (var14 >= 0) {
                                  break L5;
                                } else {
                                  var15 = -var10;
                                  L9: while (true) {
                                    if (var15 >= 0) {
                                      var7 = var7 + var11;
                                      var8 = var8 + var12;
                                      var14++;
                                      continue L8;
                                    } else {
                                      incrementValue$2 = var8;
                                      var8++;
                                      var16 = this.field_E[incrementValue$2];
                                      var17 = var16 + param3;
                                      var18 = (var16 & 16711935) + (param3 & 16711935);
                                      var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                      var16 = var17 - var19 | var19 - (var19 >>> 8);
                                      var19 = var27[var7];
                                      var17 = var16 + var19;
                                      var18 = (var16 & 16711935) + (var19 & 16711935);
                                      var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                      incrementValue$3 = var7;
                                      var7++;
                                      var13[incrementValue$3] = var17 - var19 | var19 - (var19 >>> 8);
                                      var15++;
                                      continue L9;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            var14 = (param3 & 16711680) >> 16;
                            var15 = (param3 & 65280) >> 8;
                            var16 = param3 & 255;
                            var17 = -var9;
                            L10: while (true) {
                              if (var17 >= 0) {
                                break L5;
                              } else {
                                var18 = -var10;
                                L11: while (true) {
                                  if (var18 >= 0) {
                                    var7 = var7 + var11;
                                    var8 = var8 + var12;
                                    var17++;
                                    continue L10;
                                  } else {
                                    incrementValue$4 = var8;
                                    var8++;
                                    var19 = this.field_E[incrementValue$4];
                                    if (var19 == 0) {
                                      var7++;
                                      var18++;
                                      continue L11;
                                    } else {
                                      var20 = (var19 & 16711680) * var14 & -16777216;
                                      var21 = (var19 & 65280) * var15 & 16711680;
                                      var22 = (var19 & 255) * var16 & 65280;
                                      var19 = (var20 | var21 | var22) >>> 8;
                                      var23 = var27[var7];
                                      var24 = var19 + var23;
                                      var25 = (var19 & 16711935) + (var23 & 16711935);
                                      var23 = (var25 & 16777472) + (var24 - var25 & 65536);
                                      incrementValue$5 = var7;
                                      var7++;
                                      var13[incrementValue$5] = var24 - var23 | var23 - (var23 >>> 8);
                                      var18++;
                                      continue L11;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var14 = -var9;
                          L12: while (true) {
                            if (var14 >= 0) {
                              break L5;
                            } else {
                              var15 = -var10;
                              L13: while (true) {
                                if (var15 >= 0) {
                                  var7 = var7 + var11;
                                  var8 = var8 + var12;
                                  var14++;
                                  continue L12;
                                } else {
                                  incrementValue$6 = var8;
                                  var8++;
                                  var16 = this.field_E[incrementValue$6];
                                  if (var16 == 0) {
                                    var7++;
                                    var15++;
                                    continue L13;
                                  } else {
                                    var17 = var27[var7];
                                    var18 = var16 + var17;
                                    var19 = (var16 & 16711935) + (var17 & 16711935);
                                    var17 = (var19 & 16777472) + (var18 - var19 & 65536);
                                    incrementValue$7 = var7;
                                    var7++;
                                    var13[incrementValue$7] = var18 - var17 | var17 - (var17 >>> 8);
                                    var15++;
                                    continue L13;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      if (param2 != 1) {
                        if (param2 != 0) {
                          if (param2 != 3) {
                            if (param2 != 2) {
                              throw new IllegalArgumentException();
                            } else {
                              var14 = param3 >>> 24;
                              var15 = 256 - var14;
                              var16 = (param3 & 16711935) * var15 & -16711936;
                              var17 = (param3 & 65280) * var15 & 16711680;
                              param3 = (var16 | var17) >>> 8;
                              var18 = -var9;
                              L14: while (true) {
                                if (var18 >= 0) {
                                  break L5;
                                } else {
                                  var19 = -var10;
                                  L15: while (true) {
                                    if (var19 >= 0) {
                                      var7 = var7 + var11;
                                      var8 = var8 + var12;
                                      var18++;
                                      continue L14;
                                    } else {
                                      incrementValue$8 = var8;
                                      var8++;
                                      var20 = this.field_E[incrementValue$8];
                                      var21 = var20 >>> 24;
                                      var22 = 256 - var21;
                                      var16 = (var20 & 16711935) * var14 & -16711936;
                                      var17 = (var20 & 65280) * var14 & 16711680;
                                      var20 = ((var16 | var17) >>> 8) + param3;
                                      var23 = var27[var7];
                                      incrementValue$9 = var7;
                                      var7++;
                                      var13[incrementValue$9] = ((var20 & 16711935) * var21 + (var23 & 16711935) * var22 & -16711936) + ((var20 & 65280) * var21 + (var23 & 65280) * var22 & 16711680) >> 8;
                                      var19++;
                                      continue L15;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            var14 = -var9;
                            L16: while (true) {
                              if (var14 >= 0) {
                                break L5;
                              } else {
                                var15 = -var10;
                                L17: while (true) {
                                  if (var15 >= 0) {
                                    var7 = var7 + var11;
                                    var8 = var8 + var12;
                                    var14++;
                                    continue L16;
                                  } else {
                                    L18: {
                                      incrementValue$10 = var8;
                                      var8++;
                                      var16 = this.field_E[incrementValue$10];
                                      var17 = var16 + param3;
                                      var18 = (var16 & 16711935) + (param3 & 16711935);
                                      var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                      var19 = var17 - var19 | var19 - (var19 >>> 8);
                                      var20 = (var19 >>> 24) * (param3 >>> 24) >> 8;
                                      var21 = 256 - var20;
                                      if (var20 == 255) {
                                        break L18;
                                      } else {
                                        var16 = var19;
                                        var19 = var27[var7];
                                        var19 = ((var16 & 16711935) * var20 + (var19 & 16711935) * var21 & -16711936) + ((var16 & 65280) * var20 + (var19 & 65280) * var21 & 16711680) >> 8;
                                        break L18;
                                      }
                                    }
                                    incrementValue$11 = var7;
                                    var7++;
                                    var13[incrementValue$11] = var19;
                                    var15++;
                                    continue L17;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          if ((param3 & 16777215) != 16777215) {
                            var14 = (param3 & 16711680) >> 16;
                            var15 = (param3 & 65280) >> 8;
                            var16 = param3 & 255;
                            var17 = -var9;
                            L19: while (true) {
                              if (var17 >= 0) {
                                break L5;
                              } else {
                                var18 = -var10;
                                L20: while (true) {
                                  if (var18 >= 0) {
                                    var7 = var7 + var11;
                                    var8 = var8 + var12;
                                    var17++;
                                    continue L19;
                                  } else {
                                    incrementValue$12 = var8;
                                    var8++;
                                    var19 = this.field_E[incrementValue$12];
                                    var20 = (var19 >>> 24) * (param3 >>> 24) >> 8;
                                    var21 = 256 - var20;
                                    if (var20 == 255) {
                                      var22 = (var19 & 16711680) * var14 & -16777216;
                                      var23 = (var19 & 65280) * var15 & 16711680;
                                      var24 = (var19 & 255) * var16 & 65280;
                                      incrementValue$13 = var7;
                                      var7++;
                                      var13[incrementValue$13] = (var22 | var23 | var24) >>> 8;
                                      var18++;
                                      continue L20;
                                    } else {
                                      var22 = (var19 & 16711680) * var14 & -16777216;
                                      var23 = (var19 & 65280) * var15 & 16711680;
                                      var24 = (var19 & 255) * var16 & 65280;
                                      var19 = (var22 | var23 | var24) >>> 8;
                                      var25 = var27[var7];
                                      incrementValue$14 = var7;
                                      var7++;
                                      var13[incrementValue$14] = ((var19 & 16711935) * var20 + (var25 & 16711935) * var21 & -16711936) + ((var19 & 65280) * var20 + (var25 & 65280) * var21 & 16711680) >> 8;
                                      var18++;
                                      continue L20;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            var14 = -var9;
                            L21: while (true) {
                              if (var14 >= 0) {
                                break L5;
                              } else {
                                var15 = -var10;
                                L22: while (true) {
                                  if (var15 >= 0) {
                                    var7 = var7 + var11;
                                    var8 = var8 + var12;
                                    var14++;
                                    continue L21;
                                  } else {
                                    incrementValue$15 = var8;
                                    var8++;
                                    var16 = this.field_E[incrementValue$15];
                                    var17 = (var16 >>> 24) * (param3 >>> 24) >> 8;
                                    var18 = 256 - var17;
                                    var19 = var27[var7];
                                    incrementValue$16 = var7;
                                    var7++;
                                    var13[incrementValue$16] = ((var16 & 16711935) * var17 + (var19 & 16711935) * var18 & -16711936) + ((var16 & 65280) * var17 + (var19 & 65280) * var18 & 16711680) >> 8;
                                    var15++;
                                    continue L22;
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        var14 = -var9;
                        L23: while (true) {
                          if (var14 >= 0) {
                            break L5;
                          } else {
                            var15 = -var10;
                            L24: while (true) {
                              if (var15 >= 0) {
                                var7 = var7 + var11;
                                var8 = var8 + var12;
                                var14++;
                                continue L23;
                              } else {
                                incrementValue$17 = var8;
                                var8++;
                                var16 = this.field_E[incrementValue$17];
                                var17 = var16 >>> 24;
                                var18 = 256 - var17;
                                var19 = var27[var7];
                                incrementValue$18 = var7;
                                var7++;
                                var13[incrementValue$18] = (((var16 & 16711935) * var17 + (var19 & 16711935) * var18 & -16711936) >> 8) + (((var16 & -16711936) >>> 8) * var17 + ((var19 & -16711936) >>> 8) * var18 & -16711936);
                                var15++;
                                continue L24;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    if (param2 != 1) {
                      if (param2 != 0) {
                        if (param2 != 3) {
                          if (param2 != 2) {
                            throw new IllegalArgumentException();
                          } else {
                            var14 = param3 >>> 24;
                            var15 = 256 - var14;
                            var16 = (param3 & 16711935) * var15 & -16711936;
                            var17 = (param3 & 65280) * var15 & 16711680;
                            param3 = (var16 | var17) >>> 8;
                            var18 = -var9;
                            L25: while (true) {
                              if (var18 >= 0) {
                                break L5;
                              } else {
                                var19 = -var10;
                                L26: while (true) {
                                  if (var19 >= 0) {
                                    var7 = var7 + var11;
                                    var8 = var8 + var12;
                                    var18++;
                                    continue L25;
                                  } else {
                                    incrementValue$19 = var8;
                                    var8++;
                                    var20 = this.field_E[incrementValue$19];
                                    var16 = (var20 & 16711935) * var14 & -16711936;
                                    var17 = (var20 & 65280) * var14 & 16711680;
                                    incrementValue$20 = var7;
                                    var7++;
                                    var13[incrementValue$20] = ((var16 | var17) >>> 8) + param3;
                                    var19++;
                                    continue L26;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var14 = -var9;
                          L27: while (true) {
                            if (var14 >= 0) {
                              break L5;
                            } else {
                              var15 = -var10;
                              L28: while (true) {
                                if (var15 >= 0) {
                                  var7 = var7 + var11;
                                  var8 = var8 + var12;
                                  var14++;
                                  continue L27;
                                } else {
                                  incrementValue$21 = var8;
                                  var8++;
                                  var16 = this.field_E[incrementValue$21];
                                  var17 = var16 + param3;
                                  var18 = (var16 & 16711935) + (param3 & 16711935);
                                  var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                  incrementValue$22 = var7;
                                  var7++;
                                  var13[incrementValue$22] = var17 - var19 | var19 - (var19 >>> 8);
                                  var15++;
                                  continue L28;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        var14 = (param3 & 16711680) >> 16;
                        var15 = (param3 & 65280) >> 8;
                        var16 = param3 & 255;
                        var17 = -var9;
                        L29: while (true) {
                          if (var17 >= 0) {
                            break L5;
                          } else {
                            var18 = -var10;
                            L30: while (true) {
                              if (var18 >= 0) {
                                var7 = var7 + var11;
                                var8 = var8 + var12;
                                var17++;
                                continue L29;
                              } else {
                                incrementValue$23 = var8;
                                var8++;
                                var19 = this.field_E[incrementValue$23];
                                var20 = (var19 & 16711680) * var14 & -16777216;
                                var21 = (var19 & 65280) * var15 & 16711680;
                                var22 = (var19 & 255) * var16 & 65280;
                                incrementValue$24 = var7;
                                var7++;
                                var13[incrementValue$24] = (var20 | var21 | var22) >>> 8;
                                var18++;
                                continue L30;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var14 = -var9;
                      L31: while (true) {
                        if (var14 >= 0) {
                          break L4;
                        } else {
                          var15 = var7 + var10 - 3;
                          L32: while (true) {
                            if (var7 >= var15) {
                              var15 += 3;
                              L33: while (true) {
                                if (var7 >= var15) {
                                  var7 = var7 + var11;
                                  var8 = var8 + var12;
                                  var14++;
                                  continue L31;
                                } else {
                                  incrementValue$25 = var7;
                                  var7++;
                                  incrementValue$26 = var8;
                                  var8++;
                                  var13[incrementValue$25] = this.field_E[incrementValue$26];
                                  continue L33;
                                }
                              }
                            } else {
                              incrementValue$27 = var7;
                              var7++;
                              incrementValue$28 = var8;
                              var8++;
                              var13[incrementValue$27] = this.field_E[incrementValue$28];
                              incrementValue$29 = var7;
                              var7++;
                              incrementValue$30 = var8;
                              var8++;
                              var13[incrementValue$29] = this.field_E[incrementValue$30];
                              incrementValue$31 = var7;
                              var7++;
                              incrementValue$32 = var8;
                              var8++;
                              var13[incrementValue$31] = this.field_E[incrementValue$32];
                              incrementValue$33 = var7;
                              var7++;
                              incrementValue$34 = var8;
                              var8++;
                              var13[incrementValue$33] = this.field_E[incrementValue$34];
                              continue L32;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                return;
              } else {
                return;
              }
            }
          }
          return;
        } else {
          throw new IllegalStateException();
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
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
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18_int;
        int[] var18;
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
        int var29;
        int var30;
        int var31;
        int var32;
        int[] var33;
        int[] var34;
        if (!this.field_D.h()) {
          L0: {
            if (param2 <= 0) {
              break L0;
            } else {
              if (param3 > 0) {
                L1: {
                  var9 = 0;
                  var10 = 0;
                  var11 = this.field_D.field_f;
                  var12 = this.field_g + this.field_o + this.field_m;
                  var13 = this.field_z + this.field_p + this.field_l;
                  var14 = (var12 << 16) / param2;
                  var15 = (var13 << 16) / param3;
                  if (this.field_g <= 0) {
                    break L1;
                  } else {
                    var16 = ((this.field_g << 16) + var14 - 1) / var14;
                    param0 = param0 + var16;
                    var9 = var9 + (var16 * var14 - (this.field_g << 16));
                    break L1;
                  }
                }
                L2: {
                  if (this.field_z <= 0) {
                    break L2;
                  } else {
                    var16 = ((this.field_z << 16) + var15 - 1) / var15;
                    param1 = param1 + var16;
                    var10 = var10 + (var16 * var15 - (this.field_z << 16));
                    break L2;
                  }
                }
                L3: {
                  if (this.field_o >= var12) {
                    break L3;
                  } else {
                    param2 = ((this.field_o << 16) - var9 + var14 - 1) / var14;
                    break L3;
                  }
                }
                L4: {
                  if (this.field_p >= var13) {
                    break L4;
                  } else {
                    param3 = ((this.field_p << 16) - var10 + var15 - 1) / var15;
                    break L4;
                  }
                }
                L5: {
                  var16 = param0 + param1 * var11;
                  var17 = var11 - param2;
                  if (param1 + param3 <= this.field_D.field_D) {
                    break L5;
                  } else {
                    param3 = param3 - (param1 + param3 - this.field_D.field_D);
                    break L5;
                  }
                }
                L6: {
                  if (param1 >= this.field_D.field_w) {
                    break L6;
                  } else {
                    var18_int = this.field_D.field_w - param1;
                    param3 = param3 - var18_int;
                    var16 = var16 + var18_int * var11;
                    var10 = var10 + var15 * var18_int;
                    break L6;
                  }
                }
                L7: {
                  if (param0 + param2 <= this.field_D.field_k) {
                    break L7;
                  } else {
                    var18_int = param0 + param2 - this.field_D.field_k;
                    param2 = param2 - var18_int;
                    var17 = var17 + var18_int;
                    break L7;
                  }
                }
                L8: {
                  if (param0 >= this.field_D.field_z) {
                    break L8;
                  } else {
                    var18_int = this.field_D.field_z - param0;
                    param2 = param2 - var18_int;
                    var16 = var16 + var18_int;
                    var9 = var9 + var14 * var18_int;
                    var17 = var17 + var18_int;
                    break L8;
                  }
                }
                L9: {
                  var34 = this.field_D.field_E;
                  var33 = var34;
                  var18 = var33;
                  if (param6 != 0) {
                    if (param6 != 1) {
                      if (param6 != 2) {
                        throw new IllegalArgumentException();
                      } else {
                        if (param4 != 1) {
                          if (param4 != 0) {
                            if (param4 != 3) {
                              if (param4 != 2) {
                                throw new IllegalArgumentException();
                              } else {
                                var19 = param5 >>> 24;
                                var20 = 256 - var19;
                                var21 = (param5 & 16711935) * var20 & -16711936;
                                var22 = (param5 & 65280) * var20 & 16711680;
                                param5 = (var21 | var22) >>> 8;
                                var23 = var9;
                                var24 = -param3;
                                L10: while (true) {
                                  if (var24 >= 0) {
                                    break L9;
                                  } else {
                                    var25 = (var10 >> 16) * this.field_o;
                                    var26 = -param2;
                                    L11: while (true) {
                                      if (var26 >= 0) {
                                        var10 = var10 + var15;
                                        var9 = var23;
                                        var16 = var16 + var17;
                                        var24++;
                                        continue L10;
                                      } else {
                                        L12: {
                                          var27 = this.field_E[(var9 >> 16) + var25];
                                          if (var27 == 0) {
                                            var16++;
                                            break L12;
                                          } else {
                                            var21 = (var27 & 16711935) * var19 & -16711936;
                                            var22 = (var27 & 65280) * var19 & 16711680;
                                            var27 = ((var21 | var22) >>> 8) + param5;
                                            var28 = var34[var16];
                                            var29 = var27 + var28;
                                            var30 = (var27 & 16711935) + (var28 & 16711935);
                                            var28 = (var30 & 16777472) + (var29 - var30 & 65536);
                                            incrementValue$0 = var16;
                                            var16++;
                                            var18[incrementValue$0] = var29 - var28 | var28 - (var28 >>> 8);
                                            break L12;
                                          }
                                        }
                                        var9 = var9 + var14;
                                        var26++;
                                        continue L11;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              var19 = var9;
                              var20 = -param3;
                              L13: while (true) {
                                if (var20 >= 0) {
                                  break L9;
                                } else {
                                  var21 = (var10 >> 16) * this.field_o;
                                  var22 = -param2;
                                  L14: while (true) {
                                    if (var22 >= 0) {
                                      var10 = var10 + var15;
                                      var9 = var19;
                                      var16 = var16 + var17;
                                      var20++;
                                      continue L13;
                                    } else {
                                      var23 = this.field_E[(var9 >> 16) + var21];
                                      var24 = var23 + param5;
                                      var25 = (var23 & 16711935) + (param5 & 16711935);
                                      var26 = (var25 & 16777472) + (var24 - var25 & 65536);
                                      var23 = var24 - var26 | var26 - (var26 >>> 8);
                                      var26 = var34[var16];
                                      var24 = var23 + var26;
                                      var25 = (var23 & 16711935) + (var26 & 16711935);
                                      var26 = (var25 & 16777472) + (var24 - var25 & 65536);
                                      incrementValue$1 = var16;
                                      var16++;
                                      var18[incrementValue$1] = var24 - var26 | var26 - (var26 >>> 8);
                                      var9 = var9 + var14;
                                      var22++;
                                      continue L14;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            var19 = var9;
                            var20 = (param5 & 16711680) >> 16;
                            var21 = (param5 & 65280) >> 8;
                            var22 = param5 & 255;
                            var23 = -param3;
                            L15: while (true) {
                              if (var23 >= 0) {
                                break L9;
                              } else {
                                var24 = (var10 >> 16) * this.field_o;
                                var25 = -param2;
                                L16: while (true) {
                                  if (var25 >= 0) {
                                    var10 = var10 + var15;
                                    var9 = var19;
                                    var16 = var16 + var17;
                                    var23++;
                                    continue L15;
                                  } else {
                                    L17: {
                                      var26 = this.field_E[(var9 >> 16) + var24];
                                      if (var26 == 0) {
                                        var16++;
                                        break L17;
                                      } else {
                                        var27 = (var26 & 16711680) * var20 & -16777216;
                                        var28 = (var26 & 65280) * var21 & 16711680;
                                        var29 = (var26 & 255) * var22 & 65280;
                                        var26 = (var27 | var28 | var29) >>> 8;
                                        var30 = var34[var16];
                                        var31 = var26 + var30;
                                        var32 = (var26 & 16711935) + (var30 & 16711935);
                                        var30 = (var32 & 16777472) + (var31 - var32 & 65536);
                                        incrementValue$2 = var16;
                                        var16++;
                                        var18[incrementValue$2] = var31 - var30 | var30 - (var30 >>> 8);
                                        break L17;
                                      }
                                    }
                                    var9 = var9 + var14;
                                    var25++;
                                    continue L16;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var19 = var9;
                          var20 = -param3;
                          L18: while (true) {
                            if (var20 >= 0) {
                              break L9;
                            } else {
                              var21 = (var10 >> 16) * this.field_o;
                              var22 = -param2;
                              L19: while (true) {
                                if (var22 >= 0) {
                                  var10 = var10 + var15;
                                  var9 = var19;
                                  var16 = var16 + var17;
                                  var20++;
                                  continue L18;
                                } else {
                                  L20: {
                                    var23 = this.field_E[(var9 >> 16) + var21];
                                    if (var23 == 0) {
                                      var16++;
                                      break L20;
                                    } else {
                                      var24 = var34[var16];
                                      var25 = var23 + var24;
                                      var26 = (var23 & 16711935) + (var24 & 16711935);
                                      var24 = (var26 & 16777472) + (var25 - var26 & 65536);
                                      incrementValue$3 = var16;
                                      var16++;
                                      var18[incrementValue$3] = var25 - var24 | var24 - (var24 >>> 8);
                                      break L20;
                                    }
                                  }
                                  var9 = var9 + var14;
                                  var22++;
                                  continue L19;
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      if (param4 != 1) {
                        if (param4 != 0) {
                          if (param4 != 3) {
                            if (param4 != 2) {
                              throw new IllegalArgumentException();
                            } else {
                              var19 = param5 >>> 24;
                              var20 = 256 - var19;
                              var21 = (param5 & 16711935) * var20 & -16711936;
                              var22 = (param5 & 65280) * var20 & 16711680;
                              param5 = (var21 | var22) >>> 8;
                              var23 = var9;
                              var24 = -param3;
                              L21: while (true) {
                                if (var24 >= 0) {
                                  break L9;
                                } else {
                                  var25 = (var10 >> 16) * this.field_o;
                                  var26 = -param2;
                                  L22: while (true) {
                                    if (var26 >= 0) {
                                      var10 = var10 + var15;
                                      var9 = var23;
                                      var16 = var16 + var17;
                                      var24++;
                                      continue L21;
                                    } else {
                                      var27 = this.field_E[(var9 >> 16) + var25];
                                      var28 = var27 >>> 24;
                                      var29 = 256 - var28;
                                      var21 = (var27 & 16711935) * var19 & -16711936;
                                      var22 = (var27 & 65280) * var19 & 16711680;
                                      var27 = ((var21 | var22) >>> 8) + param5;
                                      var30 = var34[var16];
                                      incrementValue$4 = var16;
                                      var16++;
                                      var18[incrementValue$4] = ((var27 & 16711935) * var28 + (var30 & 16711935) * var29 & -16711936) + ((var27 & 65280) * var28 + (var30 & 65280) * var29 & 16711680) >> 8;
                                      var9 = var9 + var14;
                                      var26++;
                                      continue L22;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            var19 = var9;
                            var20 = -param3;
                            L23: while (true) {
                              if (var20 >= 0) {
                                break L9;
                              } else {
                                var21 = (var10 >> 16) * this.field_o;
                                var22 = -param2;
                                L24: while (true) {
                                  if (var22 >= 0) {
                                    var10 = var10 + var15;
                                    var9 = var19;
                                    var16 = var16 + var17;
                                    var20++;
                                    continue L23;
                                  } else {
                                    L25: {
                                      var23 = this.field_E[(var9 >> 16) + var21];
                                      var24 = var23 + param5;
                                      var25 = (var23 & 16711935) + (param5 & 16711935);
                                      var26 = (var25 & 16777472) + (var24 - var25 & 65536);
                                      var26 = var24 - var26 | var26 - (var26 >>> 8);
                                      var27 = (var26 >>> 24) * (param5 >>> 24) >> 8;
                                      var28 = 256 - var27;
                                      if (var27 == 255) {
                                        break L25;
                                      } else {
                                        var23 = var26;
                                        var26 = var34[var16];
                                        var26 = ((var23 & 16711935) * var27 + (var26 & 16711935) * var28 & -16711936) + ((var23 & 65280) * var27 + (var26 & 65280) * var28 & 16711680) >> 8;
                                        break L25;
                                      }
                                    }
                                    incrementValue$5 = var16;
                                    var16++;
                                    var18[incrementValue$5] = var26;
                                    var9 = var9 + var14;
                                    var22++;
                                    continue L24;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var19 = var9;
                          if ((param5 & 16777215) != 16777215) {
                            var20 = (param5 & 16711680) >> 16;
                            var21 = (param5 & 65280) >> 8;
                            var22 = param5 & 255;
                            var23 = -param3;
                            L26: while (true) {
                              if (var23 >= 0) {
                                break L9;
                              } else {
                                var24 = (var10 >> 16) * this.field_o;
                                var25 = -param2;
                                L27: while (true) {
                                  if (var25 >= 0) {
                                    var10 = var10 + var15;
                                    var9 = var19;
                                    var16 = var16 + var17;
                                    var23++;
                                    continue L26;
                                  } else {
                                    L28: {
                                      var26 = this.field_E[(var9 >> 16) + var24];
                                      var27 = (var26 >>> 24) * (param5 >>> 24) >> 8;
                                      var28 = 256 - var27;
                                      if (var27 == 255) {
                                        var29 = (var26 & 16711680) * var20 & -16777216;
                                        var30 = (var26 & 65280) * var21 & 16711680;
                                        var31 = (var26 & 255) * var22 & 65280;
                                        incrementValue$6 = var16;
                                        var16++;
                                        var18[incrementValue$6] = (var29 | var30 | var31) >>> 8;
                                        break L28;
                                      } else {
                                        var29 = (var26 & 16711680) * var20 & -16777216;
                                        var30 = (var26 & 65280) * var21 & 16711680;
                                        var31 = (var26 & 255) * var22 & 65280;
                                        var26 = (var29 | var30 | var31) >>> 8;
                                        var32 = var34[var16];
                                        incrementValue$7 = var16;
                                        var16++;
                                        var18[incrementValue$7] = ((var26 & 16711935) * var27 + (var32 & 16711935) * var28 & -16711936) + ((var26 & 65280) * var27 + (var32 & 65280) * var28 & 16711680) >> 8;
                                        break L28;
                                      }
                                    }
                                    var9 = var9 + var14;
                                    var25++;
                                    continue L27;
                                  }
                                }
                              }
                            }
                          } else {
                            var20 = -param3;
                            L29: while (true) {
                              if (var20 >= 0) {
                                break L9;
                              } else {
                                var21 = (var10 >> 16) * this.field_o;
                                var22 = -param2;
                                L30: while (true) {
                                  if (var22 >= 0) {
                                    var10 = var10 + var15;
                                    var9 = var19;
                                    var16 = var16 + var17;
                                    var20++;
                                    continue L29;
                                  } else {
                                    var23 = this.field_E[(var9 >> 16) + var21];
                                    var24 = (var23 >>> 24) * (param5 >>> 24) >> 8;
                                    var25 = 256 - var24;
                                    var26 = var34[var16];
                                    incrementValue$8 = var16;
                                    var16++;
                                    var18[incrementValue$8] = ((var23 & 16711935) * var24 + (var26 & 16711935) * var25 & -16711936) + ((var23 & 65280) * var24 + (var26 & 65280) * var25 & 16711680) >> 8;
                                    var9 = var9 + var14;
                                    var22++;
                                    continue L30;
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        var19 = var9;
                        var20 = -param3;
                        L31: while (true) {
                          if (var20 >= 0) {
                            break L9;
                          } else {
                            var21 = (var10 >> 16) * this.field_o;
                            var22 = -param2;
                            L32: while (true) {
                              if (var22 >= 0) {
                                var10 = var10 + var15;
                                var9 = var19;
                                var16 = var16 + var17;
                                var20++;
                                continue L31;
                              } else {
                                var23 = this.field_E[(var9 >> 16) + var21];
                                var24 = var23 >>> 24;
                                var25 = 256 - var24;
                                var26 = var34[var16];
                                incrementValue$9 = var16;
                                var16++;
                                var18[incrementValue$9] = (((var23 & 16711935) * var24 + (var26 & 16711935) * var25 & -16711936) >> 8) + (((var23 & -16711936) >>> 8) * var24 + ((var26 & -16711936) >>> 8) * var25 & -16711936);
                                var9 = var9 + var14;
                                var22++;
                                continue L32;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    if (param4 != 1) {
                      if (param4 != 0) {
                        if (param4 != 3) {
                          if (param4 != 2) {
                            throw new IllegalArgumentException();
                          } else {
                            var19 = param5 >>> 24;
                            var20 = 256 - var19;
                            var21 = (param5 & 16711935) * var20 & -16711936;
                            var22 = (param5 & 65280) * var20 & 16711680;
                            param5 = (var21 | var22) >>> 8;
                            var23 = var9;
                            var24 = -param3;
                            L33: while (true) {
                              if (var24 >= 0) {
                                break L9;
                              } else {
                                var25 = (var10 >> 16) * this.field_o;
                                var26 = -param2;
                                L34: while (true) {
                                  if (var26 >= 0) {
                                    var10 = var10 + var15;
                                    var9 = var23;
                                    var16 = var16 + var17;
                                    var24++;
                                    continue L33;
                                  } else {
                                    var27 = this.field_E[(var9 >> 16) + var25];
                                    var21 = (var27 & 16711935) * var19 & -16711936;
                                    var22 = (var27 & 65280) * var19 & 16711680;
                                    incrementValue$10 = var16;
                                    var16++;
                                    var18[incrementValue$10] = ((var21 | var22) >>> 8) + param5;
                                    var9 = var9 + var14;
                                    var26++;
                                    continue L34;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var19 = var9;
                          var20 = -param3;
                          L35: while (true) {
                            if (var20 >= 0) {
                              break L9;
                            } else {
                              var21 = (var10 >> 16) * this.field_o;
                              var22 = -param2;
                              L36: while (true) {
                                if (var22 >= 0) {
                                  var10 = var10 + var15;
                                  var9 = var19;
                                  var16 = var16 + var17;
                                  var20++;
                                  continue L35;
                                } else {
                                  var23 = this.field_E[(var9 >> 16) + var21];
                                  var24 = var23 + param5;
                                  var25 = (var23 & 16711935) + (param5 & 16711935);
                                  var26 = (var25 & 16777472) + (var24 - var25 & 65536);
                                  incrementValue$11 = var16;
                                  var16++;
                                  var18[incrementValue$11] = var24 - var26 | var26 - (var26 >>> 8);
                                  var9 = var9 + var14;
                                  var22++;
                                  continue L36;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        var19 = (param5 & 16711680) >> 16;
                        var20 = (param5 & 65280) >> 8;
                        var21 = param5 & 255;
                        var22 = var9;
                        var23 = -param3;
                        L37: while (true) {
                          if (var23 >= 0) {
                            break L9;
                          } else {
                            var24 = (var10 >> 16) * this.field_o;
                            var25 = -param2;
                            L38: while (true) {
                              if (var25 >= 0) {
                                var10 = var10 + var15;
                                var9 = var22;
                                var16 = var16 + var17;
                                var23++;
                                continue L37;
                              } else {
                                var26 = this.field_E[(var9 >> 16) + var24];
                                var27 = (var26 & 16711680) * var19 & -16777216;
                                var28 = (var26 & 65280) * var20 & 16711680;
                                var29 = (var26 & 255) * var21 & 65280;
                                incrementValue$12 = var16;
                                var16++;
                                var18[incrementValue$12] = (var27 | var28 | var29) >>> 8;
                                var9 = var9 + var14;
                                var25++;
                                continue L38;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var19 = var9;
                      var20 = -param3;
                      L39: while (true) {
                        if (var20 >= 0) {
                          break L0;
                        } else {
                          var21 = (var10 >> 16) * this.field_o;
                          var22 = -param2;
                          L40: while (true) {
                            if (var22 >= 0) {
                              var10 = var10 + var15;
                              var9 = var19;
                              var16 = var16 + var17;
                              var20++;
                              continue L39;
                            } else {
                              incrementValue$13 = var16;
                              var16++;
                              var18[incrementValue$13] = this.field_E[(var9 >> 16) + var21];
                              var9 = var9 + var14;
                              var22++;
                              continue L40;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                return;
              } else {
                return;
              }
            }
          }
          return;
        } else {
          throw new IllegalStateException();
        }
    }

    jg(kj param0, int[] param1, int param2, int param3) {
        super(param0, param2, param3);
        this.field_E = param1;
    }

    final void b(int param0, int param1) {
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
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int incrementValue$24 = 0;
        int incrementValue$25 = 0;
        int incrementValue$26 = 0;
        int[] var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int[] var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int[] var22;
        int[] var23;
        int[] var24;
        int[] var25;
        int[] var26;
        int[] var27;
        int[] var28;
        int[] var29;
        int[] var30;
        int[] var31;
        int[] var32;
        int[] var33;
        int[] var34;
        int[] var35;
        int[] var36;
        int[] var37;
        int[] var38;
        int[] var39;
        L0: {
          var3 = this.field_D.field_E;
          if (field_A != 0) {
            if (field_A >= 0) {
              if (field_f != 0) {
                if (field_f >= 0) {
                  var5 = field_i;
                  L1: while (true) {
                    if (var5 >= 0) {
                      break L0;
                    } else {
                      L2: {
                        var6 = field_w;
                        var7 = field_j + field_x;
                        var8 = field_h + field_c;
                        var9 = field_k;
                        if (var7 >= 0) {
                          break L2;
                        } else {
                          var4 = (field_A - 1 - var7) / field_A;
                          var9 = var9 + var4;
                          var7 = var7 + field_A * var4;
                          var8 = var8 + field_f * var4;
                          var6 = var6 + var4;
                          break L2;
                        }
                      }
                      L3: {
                        var4 = (1 + var7 - (this.field_o << 12) - field_A) / field_A;
                        if ((1 + var7 - (this.field_o << 12) - field_A) / field_A <= var9) {
                          break L3;
                        } else {
                          var9 = var4;
                          break L3;
                        }
                      }
                      L4: {
                        if (var8 >= 0) {
                          break L4;
                        } else {
                          var4 = (field_f - 1 - var8) / field_f;
                          var9 = var9 + var4;
                          var7 = var7 + field_A * var4;
                          var8 = var8 + field_f * var4;
                          var6 = var6 + var4;
                          break L4;
                        }
                      }
                      L5: {
                        var4 = (1 + var8 - (this.field_p << 12) - field_f) / field_f;
                        if ((1 + var8 - (this.field_p << 12) - field_f) / field_f <= var9) {
                          break L5;
                        } else {
                          var9 = var4;
                          break L5;
                        }
                      }
                      L6: while (true) {
                        if (var9 >= 0) {
                          field_j = field_j + field_q;
                          field_h = field_h + field_v;
                          field_w = field_w + field_r;
                          var5++;
                          continue L1;
                        } else {
                          L7: {
                            var10 = (var8 >> 12) * this.field_o + (var7 >> 12);
                            incrementValue$0 = var6;
                            var6++;
                            var11 = incrementValue$0;
                            var39 = var3;
                            var30 = var39;
                            var12 = var30;
                            var13 = param0;
                            var14 = param1;
                            if (var14 != 0) {
                              if (var14 != 1) {
                                if (var14 != 2) {
                                  throw new IllegalArgumentException();
                                } else {
                                  if (var13 != 1) {
                                    if (var13 != 0) {
                                      if (var13 != 3) {
                                        if (var13 != 2) {
                                          break L7;
                                        } else {
                                          var15 = this.field_E[var10];
                                          var16 = (var15 & 16711935) * field_C & -16711936;
                                          var17 = (var15 & 65280) * field_C & 16711680;
                                          var15 = ((var16 | var17) >>> 8) + field_s;
                                          var18 = var39[var11];
                                          var19 = var15 + var18;
                                          var20 = (var15 & 16711935) + (var18 & 16711935);
                                          var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                                          var12[var11] = var19 - var18 | var18 - (var18 >>> 8);
                                          break L7;
                                        }
                                      } else {
                                        var15 = this.field_E[var10];
                                        var16 = field_d;
                                        var17 = var15 + var16;
                                        var18 = (var15 & 16711935) + (var16 & 16711935);
                                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var15 = var17 - var19 | var19 - (var19 >>> 8);
                                        var19 = var39[var11];
                                        var17 = var15 + var19;
                                        var18 = (var15 & 16711935) + (var19 & 16711935);
                                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                        break L7;
                                      }
                                    } else {
                                      var15 = this.field_E[var10];
                                      var16 = (var15 & 16711680) * field_n & -16777216;
                                      var17 = (var15 & 65280) * field_e & 16711680;
                                      var18 = (var15 & 255) * field_b & 65280;
                                      var15 = (var16 | var17 | var18) >>> 8;
                                      var19 = var39[var11];
                                      var20 = var15 + var19;
                                      var21 = (var15 & 16711935) + (var19 & 16711935);
                                      var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                      var12[var11] = var20 - var19 | var19 - (var19 >>> 8);
                                      break L7;
                                    }
                                  } else {
                                    var15 = this.field_E[var10];
                                    var16 = var39[var11];
                                    var17 = var15 + var16;
                                    var18 = (var15 & 16711935) + (var16 & 16711935);
                                    var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                    var12[var11] = var17 - var16 | var16 - (var16 >>> 8);
                                    break L7;
                                  }
                                }
                              } else {
                                if (var13 != 1) {
                                  if (var13 != 0) {
                                    if (var13 != 3) {
                                      if (var13 != 2) {
                                        throw new IllegalArgumentException();
                                      } else {
                                        var15 = this.field_E[var10];
                                        var16 = var15 >>> 24;
                                        var17 = 256 - var16;
                                        var18 = (var15 & 16711935) * field_C & -16711936;
                                        var19 = (var15 & 65280) * field_C & 16711680;
                                        var15 = ((var18 | var19) >>> 8) + field_s;
                                        var20 = var39[var11];
                                        var12[var11] = ((var15 & 16711935) * var16 + (var20 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var20 & 65280) * var17 & 16711680) >> 8;
                                        break L7;
                                      }
                                    } else {
                                      L8: {
                                        var15 = this.field_E[var10];
                                        var16 = field_d;
                                        var17 = var15 + var16;
                                        var18 = (var15 & 16711935) + (var16 & 16711935);
                                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var19 = var17 - var19 | var19 - (var19 >>> 8);
                                        var20 = (var15 >>> 24) * field_C >> 8;
                                        var21 = 256 - var20;
                                        if (var20 == 255) {
                                          break L8;
                                        } else {
                                          var15 = var19;
                                          var19 = var39[var11];
                                          var19 = ((var15 & 16711935) * var20 + (var19 & 16711935) * var21 & -16711936) + ((var15 & 65280) * var20 + (var19 & 65280) * var21 & 16711680) >> 8;
                                          break L8;
                                        }
                                      }
                                      var39[var11] = var19;
                                      break L7;
                                    }
                                  } else {
                                    var15 = this.field_E[var10];
                                    var16 = (var15 >>> 24) * field_C >> 8;
                                    var17 = 256 - var16;
                                    if ((field_d & 16777215) != 16777215) {
                                      if (var16 == 255) {
                                        var18 = (var15 & 16711680) * field_n & -16777216;
                                        var19 = (var15 & 65280) * field_e & 16711680;
                                        var20 = (var15 & 255) * field_b & 65280;
                                        var12[var11] = (var18 | var19 | var20) >>> 8;
                                        break L7;
                                      } else {
                                        var18 = (var15 & 16711680) * field_n & -16777216;
                                        var19 = (var15 & 65280) * field_e & 16711680;
                                        var20 = (var15 & 255) * field_b & 65280;
                                        var15 = (var18 | var19 | var20) >>> 8;
                                        var21 = var39[var11];
                                        var12[var11] = ((var15 & 16711935) * var16 + (var21 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var21 & 65280) * var17 & 16711680) >> 8;
                                        break L7;
                                      }
                                    } else {
                                      var18 = var39[var11];
                                      var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                      break L7;
                                    }
                                  }
                                } else {
                                  var15 = this.field_E[var10];
                                  var16 = var15 >>> 24;
                                  var17 = 256 - var16;
                                  var18 = var39[var11];
                                  var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                  break L7;
                                }
                              }
                            } else {
                              if (var13 != 1) {
                                if (var13 != 0) {
                                  if (var13 != 3) {
                                    if (var13 != 2) {
                                      throw new IllegalArgumentException();
                                    } else {
                                      var15 = this.field_E[var10];
                                      var16 = (var15 & 16711935) * field_C & -16711936;
                                      var17 = (var15 & 65280) * field_C & 16711680;
                                      var12[var11] = ((var16 | var17) >>> 8) + field_s;
                                      break L7;
                                    }
                                  } else {
                                    incrementValue$1 = var10;
                                    var10++;
                                    var15 = this.field_E[incrementValue$1];
                                    var16 = field_d;
                                    var17 = var15 + var16;
                                    var18 = (var15 & 16711935) + (var16 & 16711935);
                                    var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                    var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                    break L7;
                                  }
                                } else {
                                  incrementValue$2 = var10;
                                  var10++;
                                  var15 = this.field_E[incrementValue$2];
                                  var16 = (var15 & 16711680) * field_n & -16777216;
                                  var17 = (var15 & 65280) * field_e & 16711680;
                                  var18 = (var15 & 255) * field_b & 65280;
                                  var12[var11] = (var16 | var17 | var18) >>> 8;
                                  break L7;
                                }
                              } else {
                                var12[var11] = this.field_E[var10];
                                break L7;
                              }
                            }
                          }
                          var7 = var7 + field_A;
                          var8 = var8 + field_f;
                          var9++;
                          continue L6;
                        }
                      }
                    }
                  }
                } else {
                  var5 = field_i;
                  L9: while (true) {
                    if (var5 >= 0) {
                      break L0;
                    } else {
                      L10: {
                        var6 = field_w;
                        var7 = field_j + field_x;
                        var8 = field_h + field_c;
                        var9 = field_k;
                        if (var7 >= 0) {
                          break L10;
                        } else {
                          var4 = (field_A - 1 - var7) / field_A;
                          var9 = var9 + var4;
                          var7 = var7 + field_A * var4;
                          var8 = var8 + field_f * var4;
                          var6 = var6 + var4;
                          break L10;
                        }
                      }
                      L11: {
                        var4 = (1 + var7 - (this.field_o << 12) - field_A) / field_A;
                        if ((1 + var7 - (this.field_o << 12) - field_A) / field_A <= var9) {
                          break L11;
                        } else {
                          var9 = var4;
                          break L11;
                        }
                      }
                      L12: {
                        var4 = var8 - (this.field_p << 12);
                        if (var8 - (this.field_p << 12) < 0) {
                          break L12;
                        } else {
                          var4 = (field_f - var4) / field_f;
                          var9 = var9 + var4;
                          var7 = var7 + field_A * var4;
                          var8 = var8 + field_f * var4;
                          var6 = var6 + var4;
                          break L12;
                        }
                      }
                      L13: {
                        var4 = (var8 - field_f) / field_f;
                        if ((var8 - field_f) / field_f <= var9) {
                          break L13;
                        } else {
                          var9 = var4;
                          break L13;
                        }
                      }
                      L14: while (true) {
                        if (var9 >= 0) {
                          field_j = field_j + field_q;
                          field_h = field_h + field_v;
                          field_w = field_w + field_r;
                          var5++;
                          continue L9;
                        } else {
                          L15: {
                            var10 = (var8 >> 12) * this.field_o + (var7 >> 12);
                            incrementValue$3 = var6;
                            var6++;
                            var11 = incrementValue$3;
                            var38 = var3;
                            var29 = var38;
                            var12 = var29;
                            var13 = param0;
                            var14 = param1;
                            if (var14 != 0) {
                              if (var14 != 1) {
                                if (var14 != 2) {
                                  throw new IllegalArgumentException();
                                } else {
                                  if (var13 != 1) {
                                    if (var13 != 0) {
                                      if (var13 != 3) {
                                        if (var13 != 2) {
                                          break L15;
                                        } else {
                                          var15 = this.field_E[var10];
                                          var16 = (var15 & 16711935) * field_C & -16711936;
                                          var17 = (var15 & 65280) * field_C & 16711680;
                                          var15 = ((var16 | var17) >>> 8) + field_s;
                                          var18 = var38[var11];
                                          var19 = var15 + var18;
                                          var20 = (var15 & 16711935) + (var18 & 16711935);
                                          var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                                          var12[var11] = var19 - var18 | var18 - (var18 >>> 8);
                                          break L15;
                                        }
                                      } else {
                                        var15 = this.field_E[var10];
                                        var16 = field_d;
                                        var17 = var15 + var16;
                                        var18 = (var15 & 16711935) + (var16 & 16711935);
                                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var15 = var17 - var19 | var19 - (var19 >>> 8);
                                        var19 = var38[var11];
                                        var17 = var15 + var19;
                                        var18 = (var15 & 16711935) + (var19 & 16711935);
                                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                        break L15;
                                      }
                                    } else {
                                      var15 = this.field_E[var10];
                                      var16 = (var15 & 16711680) * field_n & -16777216;
                                      var17 = (var15 & 65280) * field_e & 16711680;
                                      var18 = (var15 & 255) * field_b & 65280;
                                      var15 = (var16 | var17 | var18) >>> 8;
                                      var19 = var38[var11];
                                      var20 = var15 + var19;
                                      var21 = (var15 & 16711935) + (var19 & 16711935);
                                      var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                      var12[var11] = var20 - var19 | var19 - (var19 >>> 8);
                                      break L15;
                                    }
                                  } else {
                                    var15 = this.field_E[var10];
                                    var16 = var38[var11];
                                    var17 = var15 + var16;
                                    var18 = (var15 & 16711935) + (var16 & 16711935);
                                    var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                    var12[var11] = var17 - var16 | var16 - (var16 >>> 8);
                                    break L15;
                                  }
                                }
                              } else {
                                if (var13 != 1) {
                                  if (var13 != 0) {
                                    if (var13 != 3) {
                                      if (var13 != 2) {
                                        throw new IllegalArgumentException();
                                      } else {
                                        var15 = this.field_E[var10];
                                        var16 = var15 >>> 24;
                                        var17 = 256 - var16;
                                        var18 = (var15 & 16711935) * field_C & -16711936;
                                        var19 = (var15 & 65280) * field_C & 16711680;
                                        var15 = ((var18 | var19) >>> 8) + field_s;
                                        var20 = var38[var11];
                                        var12[var11] = ((var15 & 16711935) * var16 + (var20 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var20 & 65280) * var17 & 16711680) >> 8;
                                        break L15;
                                      }
                                    } else {
                                      L16: {
                                        var15 = this.field_E[var10];
                                        var16 = field_d;
                                        var17 = var15 + var16;
                                        var18 = (var15 & 16711935) + (var16 & 16711935);
                                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var19 = var17 - var19 | var19 - (var19 >>> 8);
                                        var20 = (var15 >>> 24) * field_C >> 8;
                                        var21 = 256 - var20;
                                        if (var20 == 255) {
                                          break L16;
                                        } else {
                                          var15 = var19;
                                          var19 = var38[var11];
                                          var19 = ((var15 & 16711935) * var20 + (var19 & 16711935) * var21 & -16711936) + ((var15 & 65280) * var20 + (var19 & 65280) * var21 & 16711680) >> 8;
                                          break L16;
                                        }
                                      }
                                      var38[var11] = var19;
                                      break L15;
                                    }
                                  } else {
                                    var15 = this.field_E[var10];
                                    var16 = (var15 >>> 24) * field_C >> 8;
                                    var17 = 256 - var16;
                                    if ((field_d & 16777215) != 16777215) {
                                      if (var16 == 255) {
                                        var18 = (var15 & 16711680) * field_n & -16777216;
                                        var19 = (var15 & 65280) * field_e & 16711680;
                                        var20 = (var15 & 255) * field_b & 65280;
                                        var12[var11] = (var18 | var19 | var20) >>> 8;
                                        break L15;
                                      } else {
                                        var18 = (var15 & 16711680) * field_n & -16777216;
                                        var19 = (var15 & 65280) * field_e & 16711680;
                                        var20 = (var15 & 255) * field_b & 65280;
                                        var15 = (var18 | var19 | var20) >>> 8;
                                        var21 = var38[var11];
                                        var12[var11] = ((var15 & 16711935) * var16 + (var21 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var21 & 65280) * var17 & 16711680) >> 8;
                                        break L15;
                                      }
                                    } else {
                                      var18 = var38[var11];
                                      var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                      break L15;
                                    }
                                  }
                                } else {
                                  var15 = this.field_E[var10];
                                  var16 = var15 >>> 24;
                                  var17 = 256 - var16;
                                  var18 = var38[var11];
                                  var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                  break L15;
                                }
                              }
                            } else {
                              if (var13 != 1) {
                                if (var13 != 0) {
                                  if (var13 != 3) {
                                    if (var13 != 2) {
                                      throw new IllegalArgumentException();
                                    } else {
                                      var15 = this.field_E[var10];
                                      var16 = (var15 & 16711935) * field_C & -16711936;
                                      var17 = (var15 & 65280) * field_C & 16711680;
                                      var12[var11] = ((var16 | var17) >>> 8) + field_s;
                                      break L15;
                                    }
                                  } else {
                                    incrementValue$4 = var10;
                                    var10++;
                                    var15 = this.field_E[incrementValue$4];
                                    var16 = field_d;
                                    var17 = var15 + var16;
                                    var18 = (var15 & 16711935) + (var16 & 16711935);
                                    var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                    var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                    break L15;
                                  }
                                } else {
                                  incrementValue$5 = var10;
                                  var10++;
                                  var15 = this.field_E[incrementValue$5];
                                  var16 = (var15 & 16711680) * field_n & -16777216;
                                  var17 = (var15 & 65280) * field_e & 16711680;
                                  var18 = (var15 & 255) * field_b & 65280;
                                  var12[var11] = (var16 | var17 | var18) >>> 8;
                                  break L15;
                                }
                              } else {
                                var12[var11] = this.field_E[var10];
                                break L15;
                              }
                            }
                          }
                          var7 = var7 + field_A;
                          var8 = var8 + field_f;
                          var9++;
                          continue L14;
                        }
                      }
                    }
                  }
                }
              } else {
                var5 = field_i;
                L17: while (true) {
                  if (var5 >= 0) {
                    break L0;
                  } else {
                    L18: {
                      var6 = field_w;
                      var7 = field_j + field_x;
                      var8 = field_h;
                      var9 = field_k;
                      if (var8 >= 0) {
                        if (var8 - (this.field_p << 12) < 0) {
                          L19: {
                            if (var7 >= 0) {
                              break L19;
                            } else {
                              var4 = (field_A - 1 - var7) / field_A;
                              var9 = var9 + var4;
                              var7 = var7 + field_A * var4;
                              var6 = var6 + var4;
                              break L19;
                            }
                          }
                          L20: {
                            var4 = (1 + var7 - (this.field_o << 12) - field_A) / field_A;
                            if ((1 + var7 - (this.field_o << 12) - field_A) / field_A <= var9) {
                              break L20;
                            } else {
                              var9 = var4;
                              break L20;
                            }
                          }
                          L21: while (true) {
                            if (var9 >= 0) {
                              break L18;
                            } else {
                              L22: {
                                var10 = (var8 >> 12) * this.field_o + (var7 >> 12);
                                incrementValue$6 = var6;
                                var6++;
                                var11 = incrementValue$6;
                                var37 = var3;
                                var28 = var37;
                                var12 = var28;
                                var13 = param0;
                                var14 = param1;
                                if (var14 != 0) {
                                  if (var14 != 1) {
                                    if (var14 != 2) {
                                      throw new IllegalArgumentException();
                                    } else {
                                      if (var13 != 1) {
                                        if (var13 != 0) {
                                          if (var13 != 3) {
                                            if (var13 != 2) {
                                              break L22;
                                            } else {
                                              var15 = this.field_E[var10];
                                              var16 = (var15 & 16711935) * field_C & -16711936;
                                              var17 = (var15 & 65280) * field_C & 16711680;
                                              var15 = ((var16 | var17) >>> 8) + field_s;
                                              var18 = var37[var11];
                                              var19 = var15 + var18;
                                              var20 = (var15 & 16711935) + (var18 & 16711935);
                                              var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                                              var12[var11] = var19 - var18 | var18 - (var18 >>> 8);
                                              break L22;
                                            }
                                          } else {
                                            var15 = this.field_E[var10];
                                            var16 = field_d;
                                            var17 = var15 + var16;
                                            var18 = (var15 & 16711935) + (var16 & 16711935);
                                            var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                            var15 = var17 - var19 | var19 - (var19 >>> 8);
                                            var19 = var37[var11];
                                            var17 = var15 + var19;
                                            var18 = (var15 & 16711935) + (var19 & 16711935);
                                            var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                            var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                            break L22;
                                          }
                                        } else {
                                          var15 = this.field_E[var10];
                                          var16 = (var15 & 16711680) * field_n & -16777216;
                                          var17 = (var15 & 65280) * field_e & 16711680;
                                          var18 = (var15 & 255) * field_b & 65280;
                                          var15 = (var16 | var17 | var18) >>> 8;
                                          var19 = var37[var11];
                                          var20 = var15 + var19;
                                          var21 = (var15 & 16711935) + (var19 & 16711935);
                                          var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                          var12[var11] = var20 - var19 | var19 - (var19 >>> 8);
                                          break L22;
                                        }
                                      } else {
                                        var15 = this.field_E[var10];
                                        var16 = var37[var11];
                                        var17 = var15 + var16;
                                        var18 = (var15 & 16711935) + (var16 & 16711935);
                                        var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var12[var11] = var17 - var16 | var16 - (var16 >>> 8);
                                        break L22;
                                      }
                                    }
                                  } else {
                                    if (var13 != 1) {
                                      if (var13 != 0) {
                                        if (var13 != 3) {
                                          if (var13 != 2) {
                                            throw new IllegalArgumentException();
                                          } else {
                                            var15 = this.field_E[var10];
                                            var16 = var15 >>> 24;
                                            var17 = 256 - var16;
                                            var18 = (var15 & 16711935) * field_C & -16711936;
                                            var19 = (var15 & 65280) * field_C & 16711680;
                                            var15 = ((var18 | var19) >>> 8) + field_s;
                                            var20 = var37[var11];
                                            var12[var11] = ((var15 & 16711935) * var16 + (var20 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var20 & 65280) * var17 & 16711680) >> 8;
                                            break L22;
                                          }
                                        } else {
                                          L23: {
                                            var15 = this.field_E[var10];
                                            var16 = field_d;
                                            var17 = var15 + var16;
                                            var18 = (var15 & 16711935) + (var16 & 16711935);
                                            var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                            var19 = var17 - var19 | var19 - (var19 >>> 8);
                                            var20 = (var15 >>> 24) * field_C >> 8;
                                            var21 = 256 - var20;
                                            if (var20 == 255) {
                                              break L23;
                                            } else {
                                              var15 = var19;
                                              var19 = var37[var11];
                                              var19 = ((var15 & 16711935) * var20 + (var19 & 16711935) * var21 & -16711936) + ((var15 & 65280) * var20 + (var19 & 65280) * var21 & 16711680) >> 8;
                                              break L23;
                                            }
                                          }
                                          var37[var11] = var19;
                                          break L22;
                                        }
                                      } else {
                                        var15 = this.field_E[var10];
                                        var16 = (var15 >>> 24) * field_C >> 8;
                                        var17 = 256 - var16;
                                        if ((field_d & 16777215) != 16777215) {
                                          if (var16 == 255) {
                                            var18 = (var15 & 16711680) * field_n & -16777216;
                                            var19 = (var15 & 65280) * field_e & 16711680;
                                            var20 = (var15 & 255) * field_b & 65280;
                                            var12[var11] = (var18 | var19 | var20) >>> 8;
                                            break L22;
                                          } else {
                                            var18 = (var15 & 16711680) * field_n & -16777216;
                                            var19 = (var15 & 65280) * field_e & 16711680;
                                            var20 = (var15 & 255) * field_b & 65280;
                                            var15 = (var18 | var19 | var20) >>> 8;
                                            var21 = var37[var11];
                                            var12[var11] = ((var15 & 16711935) * var16 + (var21 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var21 & 65280) * var17 & 16711680) >> 8;
                                            break L22;
                                          }
                                        } else {
                                          var18 = var37[var11];
                                          var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                          break L22;
                                        }
                                      }
                                    } else {
                                      var15 = this.field_E[var10];
                                      var16 = var15 >>> 24;
                                      var17 = 256 - var16;
                                      var18 = var37[var11];
                                      var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                      break L22;
                                    }
                                  }
                                } else {
                                  if (var13 != 1) {
                                    if (var13 != 0) {
                                      if (var13 != 3) {
                                        if (var13 != 2) {
                                          throw new IllegalArgumentException();
                                        } else {
                                          var15 = this.field_E[var10];
                                          var16 = (var15 & 16711935) * field_C & -16711936;
                                          var17 = (var15 & 65280) * field_C & 16711680;
                                          var12[var11] = ((var16 | var17) >>> 8) + field_s;
                                          break L22;
                                        }
                                      } else {
                                        incrementValue$7 = var10;
                                        var10++;
                                        var15 = this.field_E[incrementValue$7];
                                        var16 = field_d;
                                        var17 = var15 + var16;
                                        var18 = (var15 & 16711935) + (var16 & 16711935);
                                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                        break L22;
                                      }
                                    } else {
                                      incrementValue$8 = var10;
                                      var10++;
                                      var15 = this.field_E[incrementValue$8];
                                      var16 = (var15 & 16711680) * field_n & -16777216;
                                      var17 = (var15 & 65280) * field_e & 16711680;
                                      var18 = (var15 & 255) * field_b & 65280;
                                      var12[var11] = (var16 | var17 | var18) >>> 8;
                                      break L22;
                                    }
                                  } else {
                                    var12[var11] = this.field_E[var10];
                                    break L22;
                                  }
                                }
                              }
                              var7 = var7 + field_A;
                              var9++;
                              continue L21;
                            }
                          }
                        } else {
                          break L18;
                        }
                      } else {
                        break L18;
                      }
                    }
                    var5++;
                    field_j = field_j + field_q;
                    field_h = field_h + field_v;
                    field_w = field_w + field_r;
                    continue L17;
                  }
                }
              }
            } else {
              if (field_f != 0) {
                if (field_f >= 0) {
                  var5 = field_i;
                  L24: while (true) {
                    if (var5 >= 0) {
                      break L0;
                    } else {
                      L25: {
                        var6 = field_w;
                        var7 = field_j + field_x;
                        var8 = field_h + field_c;
                        var9 = field_k;
                        var4 = var7 - (this.field_o << 12);
                        if (var7 - (this.field_o << 12) < 0) {
                          break L25;
                        } else {
                          var4 = (field_A - var4) / field_A;
                          var9 = var9 + var4;
                          var7 = var7 + field_A * var4;
                          var8 = var8 + field_f * var4;
                          var6 = var6 + var4;
                          break L25;
                        }
                      }
                      L26: {
                        var4 = (var7 - field_A) / field_A;
                        if ((var7 - field_A) / field_A <= var9) {
                          break L26;
                        } else {
                          var9 = var4;
                          break L26;
                        }
                      }
                      L27: {
                        if (var8 >= 0) {
                          break L27;
                        } else {
                          var4 = (field_f - 1 - var8) / field_f;
                          var9 = var9 + var4;
                          var7 = var7 + field_A * var4;
                          var8 = var8 + field_f * var4;
                          var6 = var6 + var4;
                          break L27;
                        }
                      }
                      L28: {
                        var4 = (1 + var8 - (this.field_p << 12) - field_f) / field_f;
                        if ((1 + var8 - (this.field_p << 12) - field_f) / field_f <= var9) {
                          break L28;
                        } else {
                          var9 = var4;
                          break L28;
                        }
                      }
                      L29: while (true) {
                        if (var9 >= 0) {
                          var5++;
                          field_j = field_j + field_q;
                          field_h = field_h + field_v;
                          field_w = field_w + field_r;
                          continue L24;
                        } else {
                          L30: {
                            var10 = (var8 >> 12) * this.field_o + (var7 >> 12);
                            incrementValue$9 = var6;
                            var6++;
                            var11 = incrementValue$9;
                            var36 = var3;
                            var27 = var36;
                            var12 = var27;
                            var13 = param0;
                            var14 = param1;
                            if (var14 != 0) {
                              if (var14 != 1) {
                                if (var14 != 2) {
                                  throw new IllegalArgumentException();
                                } else {
                                  if (var13 != 1) {
                                    if (var13 != 0) {
                                      if (var13 != 3) {
                                        if (var13 != 2) {
                                          break L30;
                                        } else {
                                          var15 = this.field_E[var10];
                                          var16 = (var15 & 16711935) * field_C & -16711936;
                                          var17 = (var15 & 65280) * field_C & 16711680;
                                          var15 = ((var16 | var17) >>> 8) + field_s;
                                          var18 = var36[var11];
                                          var19 = var15 + var18;
                                          var20 = (var15 & 16711935) + (var18 & 16711935);
                                          var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                                          var12[var11] = var19 - var18 | var18 - (var18 >>> 8);
                                          break L30;
                                        }
                                      } else {
                                        var15 = this.field_E[var10];
                                        var16 = field_d;
                                        var17 = var15 + var16;
                                        var18 = (var15 & 16711935) + (var16 & 16711935);
                                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var15 = var17 - var19 | var19 - (var19 >>> 8);
                                        var19 = var36[var11];
                                        var17 = var15 + var19;
                                        var18 = (var15 & 16711935) + (var19 & 16711935);
                                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                        break L30;
                                      }
                                    } else {
                                      var15 = this.field_E[var10];
                                      var16 = (var15 & 16711680) * field_n & -16777216;
                                      var17 = (var15 & 65280) * field_e & 16711680;
                                      var18 = (var15 & 255) * field_b & 65280;
                                      var15 = (var16 | var17 | var18) >>> 8;
                                      var19 = var36[var11];
                                      var20 = var15 + var19;
                                      var21 = (var15 & 16711935) + (var19 & 16711935);
                                      var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                      var12[var11] = var20 - var19 | var19 - (var19 >>> 8);
                                      break L30;
                                    }
                                  } else {
                                    var15 = this.field_E[var10];
                                    var16 = var36[var11];
                                    var17 = var15 + var16;
                                    var18 = (var15 & 16711935) + (var16 & 16711935);
                                    var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                    var12[var11] = var17 - var16 | var16 - (var16 >>> 8);
                                    break L30;
                                  }
                                }
                              } else {
                                if (var13 != 1) {
                                  if (var13 != 0) {
                                    if (var13 != 3) {
                                      if (var13 != 2) {
                                        throw new IllegalArgumentException();
                                      } else {
                                        var15 = this.field_E[var10];
                                        var16 = var15 >>> 24;
                                        var17 = 256 - var16;
                                        var18 = (var15 & 16711935) * field_C & -16711936;
                                        var19 = (var15 & 65280) * field_C & 16711680;
                                        var15 = ((var18 | var19) >>> 8) + field_s;
                                        var20 = var36[var11];
                                        var12[var11] = ((var15 & 16711935) * var16 + (var20 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var20 & 65280) * var17 & 16711680) >> 8;
                                        break L30;
                                      }
                                    } else {
                                      L31: {
                                        var15 = this.field_E[var10];
                                        var16 = field_d;
                                        var17 = var15 + var16;
                                        var18 = (var15 & 16711935) + (var16 & 16711935);
                                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var19 = var17 - var19 | var19 - (var19 >>> 8);
                                        var20 = (var15 >>> 24) * field_C >> 8;
                                        var21 = 256 - var20;
                                        if (var20 == 255) {
                                          break L31;
                                        } else {
                                          var15 = var19;
                                          var19 = var36[var11];
                                          var19 = ((var15 & 16711935) * var20 + (var19 & 16711935) * var21 & -16711936) + ((var15 & 65280) * var20 + (var19 & 65280) * var21 & 16711680) >> 8;
                                          break L31;
                                        }
                                      }
                                      var36[var11] = var19;
                                      break L30;
                                    }
                                  } else {
                                    var15 = this.field_E[var10];
                                    var16 = (var15 >>> 24) * field_C >> 8;
                                    var17 = 256 - var16;
                                    if ((field_d & 16777215) != 16777215) {
                                      if (var16 == 255) {
                                        var18 = (var15 & 16711680) * field_n & -16777216;
                                        var19 = (var15 & 65280) * field_e & 16711680;
                                        var20 = (var15 & 255) * field_b & 65280;
                                        var12[var11] = (var18 | var19 | var20) >>> 8;
                                        break L30;
                                      } else {
                                        var18 = (var15 & 16711680) * field_n & -16777216;
                                        var19 = (var15 & 65280) * field_e & 16711680;
                                        var20 = (var15 & 255) * field_b & 65280;
                                        var15 = (var18 | var19 | var20) >>> 8;
                                        var21 = var36[var11];
                                        var12[var11] = ((var15 & 16711935) * var16 + (var21 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var21 & 65280) * var17 & 16711680) >> 8;
                                        break L30;
                                      }
                                    } else {
                                      var18 = var36[var11];
                                      var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                      break L30;
                                    }
                                  }
                                } else {
                                  var15 = this.field_E[var10];
                                  var16 = var15 >>> 24;
                                  var17 = 256 - var16;
                                  var18 = var36[var11];
                                  var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                  break L30;
                                }
                              }
                            } else {
                              if (var13 != 1) {
                                if (var13 != 0) {
                                  if (var13 != 3) {
                                    if (var13 != 2) {
                                      throw new IllegalArgumentException();
                                    } else {
                                      var15 = this.field_E[var10];
                                      var16 = (var15 & 16711935) * field_C & -16711936;
                                      var17 = (var15 & 65280) * field_C & 16711680;
                                      var12[var11] = ((var16 | var17) >>> 8) + field_s;
                                      break L30;
                                    }
                                  } else {
                                    incrementValue$10 = var10;
                                    var10++;
                                    var15 = this.field_E[incrementValue$10];
                                    var16 = field_d;
                                    var17 = var15 + var16;
                                    var18 = (var15 & 16711935) + (var16 & 16711935);
                                    var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                    var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                    break L30;
                                  }
                                } else {
                                  incrementValue$11 = var10;
                                  var10++;
                                  var15 = this.field_E[incrementValue$11];
                                  var16 = (var15 & 16711680) * field_n & -16777216;
                                  var17 = (var15 & 65280) * field_e & 16711680;
                                  var18 = (var15 & 255) * field_b & 65280;
                                  var12[var11] = (var16 | var17 | var18) >>> 8;
                                  break L30;
                                }
                              } else {
                                var12[var11] = this.field_E[var10];
                                break L30;
                              }
                            }
                          }
                          var7 = var7 + field_A;
                          var8 = var8 + field_f;
                          var9++;
                          continue L29;
                        }
                      }
                    }
                  }
                } else {
                  var5 = field_i;
                  L32: while (true) {
                    if (var5 >= 0) {
                      break L0;
                    } else {
                      L33: {
                        var6 = field_w;
                        var7 = field_j + field_x;
                        var8 = field_h + field_c;
                        var9 = field_k;
                        var4 = var7 - (this.field_o << 12);
                        if (var7 - (this.field_o << 12) < 0) {
                          break L33;
                        } else {
                          var4 = (field_A - var4) / field_A;
                          var9 = var9 + var4;
                          var7 = var7 + field_A * var4;
                          var8 = var8 + field_f * var4;
                          var6 = var6 + var4;
                          break L33;
                        }
                      }
                      L34: {
                        var4 = (var7 - field_A) / field_A;
                        if ((var7 - field_A) / field_A <= var9) {
                          break L34;
                        } else {
                          var9 = var4;
                          break L34;
                        }
                      }
                      L35: {
                        var4 = var8 - (this.field_p << 12);
                        if (var8 - (this.field_p << 12) < 0) {
                          break L35;
                        } else {
                          var4 = (field_f - var4) / field_f;
                          var9 = var9 + var4;
                          var7 = var7 + field_A * var4;
                          var8 = var8 + field_f * var4;
                          var6 = var6 + var4;
                          break L35;
                        }
                      }
                      L36: {
                        var4 = (var8 - field_f) / field_f;
                        if ((var8 - field_f) / field_f <= var9) {
                          break L36;
                        } else {
                          var9 = var4;
                          break L36;
                        }
                      }
                      L37: while (true) {
                        if (var9 >= 0) {
                          var5++;
                          field_j = field_j + field_q;
                          field_h = field_h + field_v;
                          field_w = field_w + field_r;
                          continue L32;
                        } else {
                          L38: {
                            var10 = (var8 >> 12) * this.field_o + (var7 >> 12);
                            incrementValue$12 = var6;
                            var6++;
                            var11 = incrementValue$12;
                            var35 = var3;
                            var26 = var35;
                            var12 = var26;
                            var13 = param0;
                            var14 = param1;
                            if (var14 != 0) {
                              if (var14 != 1) {
                                if (var14 != 2) {
                                  throw new IllegalArgumentException();
                                } else {
                                  if (var13 != 1) {
                                    if (var13 != 0) {
                                      if (var13 != 3) {
                                        if (var13 != 2) {
                                          break L38;
                                        } else {
                                          var15 = this.field_E[var10];
                                          var16 = (var15 & 16711935) * field_C & -16711936;
                                          var17 = (var15 & 65280) * field_C & 16711680;
                                          var15 = ((var16 | var17) >>> 8) + field_s;
                                          var18 = var35[var11];
                                          var19 = var15 + var18;
                                          var20 = (var15 & 16711935) + (var18 & 16711935);
                                          var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                                          var12[var11] = var19 - var18 | var18 - (var18 >>> 8);
                                          break L38;
                                        }
                                      } else {
                                        var15 = this.field_E[var10];
                                        var16 = field_d;
                                        var17 = var15 + var16;
                                        var18 = (var15 & 16711935) + (var16 & 16711935);
                                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var15 = var17 - var19 | var19 - (var19 >>> 8);
                                        var19 = var35[var11];
                                        var17 = var15 + var19;
                                        var18 = (var15 & 16711935) + (var19 & 16711935);
                                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                        break L38;
                                      }
                                    } else {
                                      var15 = this.field_E[var10];
                                      var16 = (var15 & 16711680) * field_n & -16777216;
                                      var17 = (var15 & 65280) * field_e & 16711680;
                                      var18 = (var15 & 255) * field_b & 65280;
                                      var15 = (var16 | var17 | var18) >>> 8;
                                      var19 = var35[var11];
                                      var20 = var15 + var19;
                                      var21 = (var15 & 16711935) + (var19 & 16711935);
                                      var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                      var12[var11] = var20 - var19 | var19 - (var19 >>> 8);
                                      break L38;
                                    }
                                  } else {
                                    var15 = this.field_E[var10];
                                    var16 = var35[var11];
                                    var17 = var15 + var16;
                                    var18 = (var15 & 16711935) + (var16 & 16711935);
                                    var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                    var12[var11] = var17 - var16 | var16 - (var16 >>> 8);
                                    break L38;
                                  }
                                }
                              } else {
                                if (var13 != 1) {
                                  if (var13 != 0) {
                                    if (var13 != 3) {
                                      if (var13 != 2) {
                                        throw new IllegalArgumentException();
                                      } else {
                                        var15 = this.field_E[var10];
                                        var16 = var15 >>> 24;
                                        var17 = 256 - var16;
                                        var18 = (var15 & 16711935) * field_C & -16711936;
                                        var19 = (var15 & 65280) * field_C & 16711680;
                                        var15 = ((var18 | var19) >>> 8) + field_s;
                                        var20 = var35[var11];
                                        var12[var11] = ((var15 & 16711935) * var16 + (var20 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var20 & 65280) * var17 & 16711680) >> 8;
                                        break L38;
                                      }
                                    } else {
                                      L39: {
                                        var15 = this.field_E[var10];
                                        var16 = field_d;
                                        var17 = var15 + var16;
                                        var18 = (var15 & 16711935) + (var16 & 16711935);
                                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var19 = var17 - var19 | var19 - (var19 >>> 8);
                                        var20 = (var15 >>> 24) * field_C >> 8;
                                        var21 = 256 - var20;
                                        if (var20 == 255) {
                                          break L39;
                                        } else {
                                          var15 = var19;
                                          var19 = var35[var11];
                                          var19 = ((var15 & 16711935) * var20 + (var19 & 16711935) * var21 & -16711936) + ((var15 & 65280) * var20 + (var19 & 65280) * var21 & 16711680) >> 8;
                                          break L39;
                                        }
                                      }
                                      var35[var11] = var19;
                                      break L38;
                                    }
                                  } else {
                                    var15 = this.field_E[var10];
                                    var16 = (var15 >>> 24) * field_C >> 8;
                                    var17 = 256 - var16;
                                    if ((field_d & 16777215) != 16777215) {
                                      if (var16 == 255) {
                                        var18 = (var15 & 16711680) * field_n & -16777216;
                                        var19 = (var15 & 65280) * field_e & 16711680;
                                        var20 = (var15 & 255) * field_b & 65280;
                                        var12[var11] = (var18 | var19 | var20) >>> 8;
                                        break L38;
                                      } else {
                                        var18 = (var15 & 16711680) * field_n & -16777216;
                                        var19 = (var15 & 65280) * field_e & 16711680;
                                        var20 = (var15 & 255) * field_b & 65280;
                                        var15 = (var18 | var19 | var20) >>> 8;
                                        var21 = var35[var11];
                                        var12[var11] = ((var15 & 16711935) * var16 + (var21 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var21 & 65280) * var17 & 16711680) >> 8;
                                        break L38;
                                      }
                                    } else {
                                      var18 = var35[var11];
                                      var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                      break L38;
                                    }
                                  }
                                } else {
                                  var15 = this.field_E[var10];
                                  var16 = var15 >>> 24;
                                  var17 = 256 - var16;
                                  var18 = var35[var11];
                                  var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                  break L38;
                                }
                              }
                            } else {
                              if (var13 != 1) {
                                if (var13 != 0) {
                                  if (var13 != 3) {
                                    if (var13 != 2) {
                                      throw new IllegalArgumentException();
                                    } else {
                                      var15 = this.field_E[var10];
                                      var16 = (var15 & 16711935) * field_C & -16711936;
                                      var17 = (var15 & 65280) * field_C & 16711680;
                                      var12[var11] = ((var16 | var17) >>> 8) + field_s;
                                      break L38;
                                    }
                                  } else {
                                    incrementValue$13 = var10;
                                    var10++;
                                    var15 = this.field_E[incrementValue$13];
                                    var16 = field_d;
                                    var17 = var15 + var16;
                                    var18 = (var15 & 16711935) + (var16 & 16711935);
                                    var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                    var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                    break L38;
                                  }
                                } else {
                                  incrementValue$14 = var10;
                                  var10++;
                                  var15 = this.field_E[incrementValue$14];
                                  var16 = (var15 & 16711680) * field_n & -16777216;
                                  var17 = (var15 & 65280) * field_e & 16711680;
                                  var18 = (var15 & 255) * field_b & 65280;
                                  var12[var11] = (var16 | var17 | var18) >>> 8;
                                  break L38;
                                }
                              } else {
                                var12[var11] = this.field_E[var10];
                                break L38;
                              }
                            }
                          }
                          var7 = var7 + field_A;
                          var8 = var8 + field_f;
                          var9++;
                          continue L37;
                        }
                      }
                    }
                  }
                }
              } else {
                var5 = field_i;
                L40: while (true) {
                  if (var5 >= 0) {
                    break L0;
                  } else {
                    L41: {
                      var6 = field_w;
                      var7 = field_j + field_x;
                      var8 = field_h;
                      var9 = field_k;
                      if (var8 >= 0) {
                        if (var8 - (this.field_p << 12) < 0) {
                          L42: {
                            var4 = var7 - (this.field_o << 12);
                            if (var7 - (this.field_o << 12) < 0) {
                              break L42;
                            } else {
                              var4 = (field_A - var4) / field_A;
                              var9 = var9 + var4;
                              var7 = var7 + field_A * var4;
                              var6 = var6 + var4;
                              break L42;
                            }
                          }
                          L43: {
                            var4 = (var7 - field_A) / field_A;
                            if ((var7 - field_A) / field_A <= var9) {
                              break L43;
                            } else {
                              var9 = var4;
                              break L43;
                            }
                          }
                          L44: while (true) {
                            if (var9 >= 0) {
                              break L41;
                            } else {
                              L45: {
                                var10 = (var8 >> 12) * this.field_o + (var7 >> 12);
                                incrementValue$15 = var6;
                                var6++;
                                var11 = incrementValue$15;
                                var34 = var3;
                                var25 = var34;
                                var12 = var25;
                                var13 = param0;
                                var14 = param1;
                                if (var14 != 0) {
                                  if (var14 != 1) {
                                    if (var14 != 2) {
                                      throw new IllegalArgumentException();
                                    } else {
                                      if (var13 != 1) {
                                        if (var13 != 0) {
                                          if (var13 != 3) {
                                            if (var13 != 2) {
                                              break L45;
                                            } else {
                                              var15 = this.field_E[var10];
                                              var16 = (var15 & 16711935) * field_C & -16711936;
                                              var17 = (var15 & 65280) * field_C & 16711680;
                                              var15 = ((var16 | var17) >>> 8) + field_s;
                                              var18 = var34[var11];
                                              var19 = var15 + var18;
                                              var20 = (var15 & 16711935) + (var18 & 16711935);
                                              var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                                              var12[var11] = var19 - var18 | var18 - (var18 >>> 8);
                                              break L45;
                                            }
                                          } else {
                                            var15 = this.field_E[var10];
                                            var16 = field_d;
                                            var17 = var15 + var16;
                                            var18 = (var15 & 16711935) + (var16 & 16711935);
                                            var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                            var15 = var17 - var19 | var19 - (var19 >>> 8);
                                            var19 = var34[var11];
                                            var17 = var15 + var19;
                                            var18 = (var15 & 16711935) + (var19 & 16711935);
                                            var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                            var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                            break L45;
                                          }
                                        } else {
                                          var15 = this.field_E[var10];
                                          var16 = (var15 & 16711680) * field_n & -16777216;
                                          var17 = (var15 & 65280) * field_e & 16711680;
                                          var18 = (var15 & 255) * field_b & 65280;
                                          var15 = (var16 | var17 | var18) >>> 8;
                                          var19 = var34[var11];
                                          var20 = var15 + var19;
                                          var21 = (var15 & 16711935) + (var19 & 16711935);
                                          var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                          var12[var11] = var20 - var19 | var19 - (var19 >>> 8);
                                          break L45;
                                        }
                                      } else {
                                        var15 = this.field_E[var10];
                                        var16 = var34[var11];
                                        var17 = var15 + var16;
                                        var18 = (var15 & 16711935) + (var16 & 16711935);
                                        var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var12[var11] = var17 - var16 | var16 - (var16 >>> 8);
                                        break L45;
                                      }
                                    }
                                  } else {
                                    if (var13 != 1) {
                                      if (var13 != 0) {
                                        if (var13 != 3) {
                                          if (var13 != 2) {
                                            throw new IllegalArgumentException();
                                          } else {
                                            var15 = this.field_E[var10];
                                            var16 = var15 >>> 24;
                                            var17 = 256 - var16;
                                            var18 = (var15 & 16711935) * field_C & -16711936;
                                            var19 = (var15 & 65280) * field_C & 16711680;
                                            var15 = ((var18 | var19) >>> 8) + field_s;
                                            var20 = var34[var11];
                                            var12[var11] = ((var15 & 16711935) * var16 + (var20 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var20 & 65280) * var17 & 16711680) >> 8;
                                            break L45;
                                          }
                                        } else {
                                          L46: {
                                            var15 = this.field_E[var10];
                                            var16 = field_d;
                                            var17 = var15 + var16;
                                            var18 = (var15 & 16711935) + (var16 & 16711935);
                                            var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                            var19 = var17 - var19 | var19 - (var19 >>> 8);
                                            var20 = (var15 >>> 24) * field_C >> 8;
                                            var21 = 256 - var20;
                                            if (var20 == 255) {
                                              break L46;
                                            } else {
                                              var15 = var19;
                                              var19 = var34[var11];
                                              var19 = ((var15 & 16711935) * var20 + (var19 & 16711935) * var21 & -16711936) + ((var15 & 65280) * var20 + (var19 & 65280) * var21 & 16711680) >> 8;
                                              break L46;
                                            }
                                          }
                                          var34[var11] = var19;
                                          break L45;
                                        }
                                      } else {
                                        var15 = this.field_E[var10];
                                        var16 = (var15 >>> 24) * field_C >> 8;
                                        var17 = 256 - var16;
                                        if ((field_d & 16777215) != 16777215) {
                                          if (var16 == 255) {
                                            var18 = (var15 & 16711680) * field_n & -16777216;
                                            var19 = (var15 & 65280) * field_e & 16711680;
                                            var20 = (var15 & 255) * field_b & 65280;
                                            var12[var11] = (var18 | var19 | var20) >>> 8;
                                            break L45;
                                          } else {
                                            var18 = (var15 & 16711680) * field_n & -16777216;
                                            var19 = (var15 & 65280) * field_e & 16711680;
                                            var20 = (var15 & 255) * field_b & 65280;
                                            var15 = (var18 | var19 | var20) >>> 8;
                                            var21 = var34[var11];
                                            var12[var11] = ((var15 & 16711935) * var16 + (var21 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var21 & 65280) * var17 & 16711680) >> 8;
                                            break L45;
                                          }
                                        } else {
                                          var18 = var34[var11];
                                          var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                          break L45;
                                        }
                                      }
                                    } else {
                                      var15 = this.field_E[var10];
                                      var16 = var15 >>> 24;
                                      var17 = 256 - var16;
                                      var18 = var34[var11];
                                      var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                      break L45;
                                    }
                                  }
                                } else {
                                  if (var13 != 1) {
                                    if (var13 != 0) {
                                      if (var13 != 3) {
                                        if (var13 != 2) {
                                          throw new IllegalArgumentException();
                                        } else {
                                          var15 = this.field_E[var10];
                                          var16 = (var15 & 16711935) * field_C & -16711936;
                                          var17 = (var15 & 65280) * field_C & 16711680;
                                          var12[var11] = ((var16 | var17) >>> 8) + field_s;
                                          break L45;
                                        }
                                      } else {
                                        incrementValue$16 = var10;
                                        var10++;
                                        var15 = this.field_E[incrementValue$16];
                                        var16 = field_d;
                                        var17 = var15 + var16;
                                        var18 = (var15 & 16711935) + (var16 & 16711935);
                                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                        break L45;
                                      }
                                    } else {
                                      incrementValue$17 = var10;
                                      var10++;
                                      var15 = this.field_E[incrementValue$17];
                                      var16 = (var15 & 16711680) * field_n & -16777216;
                                      var17 = (var15 & 65280) * field_e & 16711680;
                                      var18 = (var15 & 255) * field_b & 65280;
                                      var12[var11] = (var16 | var17 | var18) >>> 8;
                                      break L45;
                                    }
                                  } else {
                                    var12[var11] = this.field_E[var10];
                                    break L45;
                                  }
                                }
                              }
                              var7 = var7 + field_A;
                              var9++;
                              continue L44;
                            }
                          }
                        } else {
                          break L41;
                        }
                      } else {
                        break L41;
                      }
                    }
                    var5++;
                    field_h = field_h + field_v;
                    field_w = field_w + field_r;
                    continue L40;
                  }
                }
              }
            }
          } else {
            if (field_f != 0) {
              if (field_f >= 0) {
                var5 = field_i;
                L47: while (true) {
                  if (var5 >= 0) {
                    break L0;
                  } else {
                    L48: {
                      var6 = field_w;
                      var7 = field_j;
                      var8 = field_h + field_c;
                      var9 = field_k;
                      if (var7 >= 0) {
                        if (var7 - (this.field_o << 12) < 0) {
                          L49: {
                            if (var8 >= 0) {
                              break L49;
                            } else {
                              var4 = (field_f - 1 - var8) / field_f;
                              var9 = var9 + var4;
                              var8 = var8 + field_f * var4;
                              var6 = var6 + var4;
                              break L49;
                            }
                          }
                          L50: {
                            var4 = (1 + var8 - (this.field_p << 12) - field_f) / field_f;
                            if ((1 + var8 - (this.field_p << 12) - field_f) / field_f <= var9) {
                              break L50;
                            } else {
                              var9 = var4;
                              break L50;
                            }
                          }
                          L51: while (true) {
                            if (var9 >= 0) {
                              break L48;
                            } else {
                              L52: {
                                var10 = (var8 >> 12) * this.field_o + (var7 >> 12);
                                incrementValue$18 = var6;
                                var6++;
                                var11 = incrementValue$18;
                                var33 = var3;
                                var24 = var33;
                                var12 = var24;
                                var13 = param0;
                                var14 = param1;
                                if (var14 != 0) {
                                  if (var14 != 1) {
                                    if (var14 != 2) {
                                      throw new IllegalArgumentException();
                                    } else {
                                      if (var13 != 1) {
                                        if (var13 != 0) {
                                          if (var13 != 3) {
                                            if (var13 != 2) {
                                              break L52;
                                            } else {
                                              var15 = this.field_E[var10];
                                              var16 = (var15 & 16711935) * field_C & -16711936;
                                              var17 = (var15 & 65280) * field_C & 16711680;
                                              var15 = ((var16 | var17) >>> 8) + field_s;
                                              var18 = var33[var11];
                                              var19 = var15 + var18;
                                              var20 = (var15 & 16711935) + (var18 & 16711935);
                                              var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                                              var12[var11] = var19 - var18 | var18 - (var18 >>> 8);
                                              break L52;
                                            }
                                          } else {
                                            var15 = this.field_E[var10];
                                            var16 = field_d;
                                            var17 = var15 + var16;
                                            var18 = (var15 & 16711935) + (var16 & 16711935);
                                            var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                            var15 = var17 - var19 | var19 - (var19 >>> 8);
                                            var19 = var33[var11];
                                            var17 = var15 + var19;
                                            var18 = (var15 & 16711935) + (var19 & 16711935);
                                            var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                            var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                            break L52;
                                          }
                                        } else {
                                          var15 = this.field_E[var10];
                                          var16 = (var15 & 16711680) * field_n & -16777216;
                                          var17 = (var15 & 65280) * field_e & 16711680;
                                          var18 = (var15 & 255) * field_b & 65280;
                                          var15 = (var16 | var17 | var18) >>> 8;
                                          var19 = var33[var11];
                                          var20 = var15 + var19;
                                          var21 = (var15 & 16711935) + (var19 & 16711935);
                                          var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                          var12[var11] = var20 - var19 | var19 - (var19 >>> 8);
                                          break L52;
                                        }
                                      } else {
                                        var15 = this.field_E[var10];
                                        var16 = var33[var11];
                                        var17 = var15 + var16;
                                        var18 = (var15 & 16711935) + (var16 & 16711935);
                                        var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var12[var11] = var17 - var16 | var16 - (var16 >>> 8);
                                        break L52;
                                      }
                                    }
                                  } else {
                                    if (var13 != 1) {
                                      if (var13 != 0) {
                                        if (var13 != 3) {
                                          if (var13 != 2) {
                                            throw new IllegalArgumentException();
                                          } else {
                                            var15 = this.field_E[var10];
                                            var16 = var15 >>> 24;
                                            var17 = 256 - var16;
                                            var18 = (var15 & 16711935) * field_C & -16711936;
                                            var19 = (var15 & 65280) * field_C & 16711680;
                                            var15 = ((var18 | var19) >>> 8) + field_s;
                                            var20 = var33[var11];
                                            var12[var11] = ((var15 & 16711935) * var16 + (var20 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var20 & 65280) * var17 & 16711680) >> 8;
                                            break L52;
                                          }
                                        } else {
                                          L53: {
                                            var15 = this.field_E[var10];
                                            var16 = field_d;
                                            var17 = var15 + var16;
                                            var18 = (var15 & 16711935) + (var16 & 16711935);
                                            var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                            var19 = var17 - var19 | var19 - (var19 >>> 8);
                                            var20 = (var15 >>> 24) * field_C >> 8;
                                            var21 = 256 - var20;
                                            if (var20 == 255) {
                                              break L53;
                                            } else {
                                              var15 = var19;
                                              var19 = var33[var11];
                                              var19 = ((var15 & 16711935) * var20 + (var19 & 16711935) * var21 & -16711936) + ((var15 & 65280) * var20 + (var19 & 65280) * var21 & 16711680) >> 8;
                                              break L53;
                                            }
                                          }
                                          var33[var11] = var19;
                                          break L52;
                                        }
                                      } else {
                                        var15 = this.field_E[var10];
                                        var16 = (var15 >>> 24) * field_C >> 8;
                                        var17 = 256 - var16;
                                        if ((field_d & 16777215) != 16777215) {
                                          if (var16 == 255) {
                                            var18 = (var15 & 16711680) * field_n & -16777216;
                                            var19 = (var15 & 65280) * field_e & 16711680;
                                            var20 = (var15 & 255) * field_b & 65280;
                                            var12[var11] = (var18 | var19 | var20) >>> 8;
                                            break L52;
                                          } else {
                                            var18 = (var15 & 16711680) * field_n & -16777216;
                                            var19 = (var15 & 65280) * field_e & 16711680;
                                            var20 = (var15 & 255) * field_b & 65280;
                                            var15 = (var18 | var19 | var20) >>> 8;
                                            var21 = var33[var11];
                                            var12[var11] = ((var15 & 16711935) * var16 + (var21 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var21 & 65280) * var17 & 16711680) >> 8;
                                            break L52;
                                          }
                                        } else {
                                          var18 = var33[var11];
                                          var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                          break L52;
                                        }
                                      }
                                    } else {
                                      var15 = this.field_E[var10];
                                      var16 = var15 >>> 24;
                                      var17 = 256 - var16;
                                      var18 = var33[var11];
                                      var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                      break L52;
                                    }
                                  }
                                } else {
                                  if (var13 != 1) {
                                    if (var13 != 0) {
                                      if (var13 != 3) {
                                        if (var13 != 2) {
                                          throw new IllegalArgumentException();
                                        } else {
                                          var15 = this.field_E[var10];
                                          var16 = (var15 & 16711935) * field_C & -16711936;
                                          var17 = (var15 & 65280) * field_C & 16711680;
                                          var12[var11] = ((var16 | var17) >>> 8) + field_s;
                                          break L52;
                                        }
                                      } else {
                                        incrementValue$19 = var10;
                                        var10++;
                                        var15 = this.field_E[incrementValue$19];
                                        var16 = field_d;
                                        var17 = var15 + var16;
                                        var18 = (var15 & 16711935) + (var16 & 16711935);
                                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                        break L52;
                                      }
                                    } else {
                                      incrementValue$20 = var10;
                                      var10++;
                                      var15 = this.field_E[incrementValue$20];
                                      var16 = (var15 & 16711680) * field_n & -16777216;
                                      var17 = (var15 & 65280) * field_e & 16711680;
                                      var18 = (var15 & 255) * field_b & 65280;
                                      var12[var11] = (var16 | var17 | var18) >>> 8;
                                      break L52;
                                    }
                                  } else {
                                    var12[var11] = this.field_E[var10];
                                    break L52;
                                  }
                                }
                              }
                              var8 = var8 + field_f;
                              var9++;
                              continue L51;
                            }
                          }
                        } else {
                          break L48;
                        }
                      } else {
                        break L48;
                      }
                    }
                    var5++;
                    field_j = field_j + field_q;
                    field_w = field_w + field_r;
                    continue L47;
                  }
                }
              } else {
                var5 = field_i;
                L54: while (true) {
                  if (var5 >= 0) {
                    break L0;
                  } else {
                    L55: {
                      var6 = field_w;
                      var7 = field_j;
                      var8 = field_h + field_c;
                      var9 = field_k;
                      if (var7 >= 0) {
                        if (var7 - (this.field_o << 12) < 0) {
                          L56: {
                            var4 = var8 - (this.field_p << 12);
                            if (var8 - (this.field_p << 12) < 0) {
                              break L56;
                            } else {
                              var4 = (field_f - var4) / field_f;
                              var9 = var9 + var4;
                              var8 = var8 + field_f * var4;
                              var6 = var6 + var4;
                              break L56;
                            }
                          }
                          L57: {
                            var4 = (var8 - field_f) / field_f;
                            if ((var8 - field_f) / field_f <= var9) {
                              break L57;
                            } else {
                              var9 = var4;
                              break L57;
                            }
                          }
                          L58: while (true) {
                            if (var9 >= 0) {
                              break L55;
                            } else {
                              L59: {
                                var10 = (var8 >> 12) * this.field_o + (var7 >> 12);
                                incrementValue$21 = var6;
                                var6++;
                                var11 = incrementValue$21;
                                var32 = var3;
                                var23 = var32;
                                var12 = var23;
                                var13 = param0;
                                var14 = param1;
                                if (var14 != 0) {
                                  if (var14 != 1) {
                                    if (var14 != 2) {
                                      throw new IllegalArgumentException();
                                    } else {
                                      if (var13 != 1) {
                                        if (var13 != 0) {
                                          if (var13 != 3) {
                                            if (var13 != 2) {
                                              break L59;
                                            } else {
                                              var15 = this.field_E[var10];
                                              var16 = (var15 & 16711935) * field_C & -16711936;
                                              var17 = (var15 & 65280) * field_C & 16711680;
                                              var15 = ((var16 | var17) >>> 8) + field_s;
                                              var18 = var32[var11];
                                              var19 = var15 + var18;
                                              var20 = (var15 & 16711935) + (var18 & 16711935);
                                              var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                                              var12[var11] = var19 - var18 | var18 - (var18 >>> 8);
                                              break L59;
                                            }
                                          } else {
                                            var15 = this.field_E[var10];
                                            var16 = field_d;
                                            var17 = var15 + var16;
                                            var18 = (var15 & 16711935) + (var16 & 16711935);
                                            var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                            var15 = var17 - var19 | var19 - (var19 >>> 8);
                                            var19 = var32[var11];
                                            var17 = var15 + var19;
                                            var18 = (var15 & 16711935) + (var19 & 16711935);
                                            var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                            var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                            break L59;
                                          }
                                        } else {
                                          var15 = this.field_E[var10];
                                          var16 = (var15 & 16711680) * field_n & -16777216;
                                          var17 = (var15 & 65280) * field_e & 16711680;
                                          var18 = (var15 & 255) * field_b & 65280;
                                          var15 = (var16 | var17 | var18) >>> 8;
                                          var19 = var32[var11];
                                          var20 = var15 + var19;
                                          var21 = (var15 & 16711935) + (var19 & 16711935);
                                          var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                          var12[var11] = var20 - var19 | var19 - (var19 >>> 8);
                                          break L59;
                                        }
                                      } else {
                                        var15 = this.field_E[var10];
                                        var16 = var32[var11];
                                        var17 = var15 + var16;
                                        var18 = (var15 & 16711935) + (var16 & 16711935);
                                        var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var12[var11] = var17 - var16 | var16 - (var16 >>> 8);
                                        break L59;
                                      }
                                    }
                                  } else {
                                    if (var13 != 1) {
                                      if (var13 != 0) {
                                        if (var13 != 3) {
                                          if (var13 != 2) {
                                            throw new IllegalArgumentException();
                                          } else {
                                            var15 = this.field_E[var10];
                                            var16 = var15 >>> 24;
                                            var17 = 256 - var16;
                                            var18 = (var15 & 16711935) * field_C & -16711936;
                                            var19 = (var15 & 65280) * field_C & 16711680;
                                            var15 = ((var18 | var19) >>> 8) + field_s;
                                            var20 = var32[var11];
                                            var12[var11] = ((var15 & 16711935) * var16 + (var20 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var20 & 65280) * var17 & 16711680) >> 8;
                                            break L59;
                                          }
                                        } else {
                                          L60: {
                                            var15 = this.field_E[var10];
                                            var16 = field_d;
                                            var17 = var15 + var16;
                                            var18 = (var15 & 16711935) + (var16 & 16711935);
                                            var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                            var19 = var17 - var19 | var19 - (var19 >>> 8);
                                            var20 = (var15 >>> 24) * field_C >> 8;
                                            var21 = 256 - var20;
                                            if (var20 == 255) {
                                              break L60;
                                            } else {
                                              var15 = var19;
                                              var19 = var32[var11];
                                              var19 = ((var15 & 16711935) * var20 + (var19 & 16711935) * var21 & -16711936) + ((var15 & 65280) * var20 + (var19 & 65280) * var21 & 16711680) >> 8;
                                              break L60;
                                            }
                                          }
                                          var32[var11] = var19;
                                          break L59;
                                        }
                                      } else {
                                        var15 = this.field_E[var10];
                                        var16 = (var15 >>> 24) * field_C >> 8;
                                        var17 = 256 - var16;
                                        if ((field_d & 16777215) != 16777215) {
                                          if (var16 == 255) {
                                            var18 = (var15 & 16711680) * field_n & -16777216;
                                            var19 = (var15 & 65280) * field_e & 16711680;
                                            var20 = (var15 & 255) * field_b & 65280;
                                            var12[var11] = (var18 | var19 | var20) >>> 8;
                                            break L59;
                                          } else {
                                            var18 = (var15 & 16711680) * field_n & -16777216;
                                            var19 = (var15 & 65280) * field_e & 16711680;
                                            var20 = (var15 & 255) * field_b & 65280;
                                            var15 = (var18 | var19 | var20) >>> 8;
                                            var21 = var32[var11];
                                            var12[var11] = ((var15 & 16711935) * var16 + (var21 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var21 & 65280) * var17 & 16711680) >> 8;
                                            break L59;
                                          }
                                        } else {
                                          var18 = var32[var11];
                                          var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                          break L59;
                                        }
                                      }
                                    } else {
                                      var15 = this.field_E[var10];
                                      var16 = var15 >>> 24;
                                      var17 = 256 - var16;
                                      var18 = var32[var11];
                                      var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                      break L59;
                                    }
                                  }
                                } else {
                                  if (var13 != 1) {
                                    if (var13 != 0) {
                                      if (var13 != 3) {
                                        if (var13 != 2) {
                                          throw new IllegalArgumentException();
                                        } else {
                                          var15 = this.field_E[var10];
                                          var16 = (var15 & 16711935) * field_C & -16711936;
                                          var17 = (var15 & 65280) * field_C & 16711680;
                                          var12[var11] = ((var16 | var17) >>> 8) + field_s;
                                          break L59;
                                        }
                                      } else {
                                        incrementValue$22 = var10;
                                        var10++;
                                        var15 = this.field_E[incrementValue$22];
                                        var16 = field_d;
                                        var17 = var15 + var16;
                                        var18 = (var15 & 16711935) + (var16 & 16711935);
                                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                        break L59;
                                      }
                                    } else {
                                      incrementValue$23 = var10;
                                      var10++;
                                      var15 = this.field_E[incrementValue$23];
                                      var16 = (var15 & 16711680) * field_n & -16777216;
                                      var17 = (var15 & 65280) * field_e & 16711680;
                                      var18 = (var15 & 255) * field_b & 65280;
                                      var12[var11] = (var16 | var17 | var18) >>> 8;
                                      break L59;
                                    }
                                  } else {
                                    var12[var11] = this.field_E[var10];
                                    break L59;
                                  }
                                }
                              }
                              var8 = var8 + field_f;
                              var9++;
                              continue L58;
                            }
                          }
                        } else {
                          break L55;
                        }
                      } else {
                        break L55;
                      }
                    }
                    var5++;
                    field_j = field_j + field_q;
                    field_w = field_w + field_r;
                    continue L54;
                  }
                }
              }
            } else {
              var5 = field_i;
              L61: while (true) {
                if (var5 >= 0) {
                  return;
                } else {
                  L62: {
                    var6 = field_w;
                    var7 = field_j;
                    var8 = field_h;
                    var9 = field_k;
                    if (var7 >= 0) {
                      if (var8 >= 0) {
                        if (var7 - (this.field_o << 12) < 0) {
                          if (var8 - (this.field_p << 12) < 0) {
                            L63: while (true) {
                              if (var9 >= 0) {
                                break L62;
                              } else {
                                L64: {
                                  var10 = (var8 >> 12) * this.field_o + (var7 >> 12);
                                  incrementValue$24 = var6;
                                  var6++;
                                  var11 = incrementValue$24;
                                  var31 = var3;
                                  var22 = var31;
                                  var12 = var22;
                                  var13 = param0;
                                  var14 = param1;
                                  if (var14 != 0) {
                                    if (var14 != 1) {
                                      if (var14 != 2) {
                                        throw new IllegalArgumentException();
                                      } else {
                                        if (var13 != 1) {
                                          if (var13 != 0) {
                                            if (var13 != 3) {
                                              if (var13 != 2) {
                                                break L64;
                                              } else {
                                                var15 = this.field_E[var10];
                                                var16 = (var15 & 16711935) * field_C & -16711936;
                                                var17 = (var15 & 65280) * field_C & 16711680;
                                                var15 = ((var16 | var17) >>> 8) + field_s;
                                                var18 = var31[var11];
                                                var19 = var15 + var18;
                                                var20 = (var15 & 16711935) + (var18 & 16711935);
                                                var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                                                var12[var11] = var19 - var18 | var18 - (var18 >>> 8);
                                                break L64;
                                              }
                                            } else {
                                              var15 = this.field_E[var10];
                                              var16 = field_d;
                                              var17 = var15 + var16;
                                              var18 = (var15 & 16711935) + (var16 & 16711935);
                                              var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                              var15 = var17 - var19 | var19 - (var19 >>> 8);
                                              var19 = var31[var11];
                                              var17 = var15 + var19;
                                              var18 = (var15 & 16711935) + (var19 & 16711935);
                                              var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                              var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                              break L64;
                                            }
                                          } else {
                                            var15 = this.field_E[var10];
                                            var16 = (var15 & 16711680) * field_n & -16777216;
                                            var17 = (var15 & 65280) * field_e & 16711680;
                                            var18 = (var15 & 255) * field_b & 65280;
                                            var15 = (var16 | var17 | var18) >>> 8;
                                            var19 = var31[var11];
                                            var20 = var15 + var19;
                                            var21 = (var15 & 16711935) + (var19 & 16711935);
                                            var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                            var12[var11] = var20 - var19 | var19 - (var19 >>> 8);
                                            break L64;
                                          }
                                        } else {
                                          var15 = this.field_E[var10];
                                          var16 = var31[var11];
                                          var17 = var15 + var16;
                                          var18 = (var15 & 16711935) + (var16 & 16711935);
                                          var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                          var12[var11] = var17 - var16 | var16 - (var16 >>> 8);
                                          break L64;
                                        }
                                      }
                                    } else {
                                      if (var13 != 1) {
                                        if (var13 != 0) {
                                          if (var13 != 3) {
                                            if (var13 != 2) {
                                              throw new IllegalArgumentException();
                                            } else {
                                              var15 = this.field_E[var10];
                                              var16 = var15 >>> 24;
                                              var17 = 256 - var16;
                                              var18 = (var15 & 16711935) * field_C & -16711936;
                                              var19 = (var15 & 65280) * field_C & 16711680;
                                              var15 = ((var18 | var19) >>> 8) + field_s;
                                              var20 = var31[var11];
                                              var12[var11] = ((var15 & 16711935) * var16 + (var20 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var20 & 65280) * var17 & 16711680) >> 8;
                                              break L64;
                                            }
                                          } else {
                                            L65: {
                                              var15 = this.field_E[var10];
                                              var16 = field_d;
                                              var17 = var15 + var16;
                                              var18 = (var15 & 16711935) + (var16 & 16711935);
                                              var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                              var19 = var17 - var19 | var19 - (var19 >>> 8);
                                              var20 = (var15 >>> 24) * field_C >> 8;
                                              var21 = 256 - var20;
                                              if (var20 == 255) {
                                                break L65;
                                              } else {
                                                var15 = var19;
                                                var19 = var31[var11];
                                                var19 = ((var15 & 16711935) * var20 + (var19 & 16711935) * var21 & -16711936) + ((var15 & 65280) * var20 + (var19 & 65280) * var21 & 16711680) >> 8;
                                                break L65;
                                              }
                                            }
                                            var31[var11] = var19;
                                            break L64;
                                          }
                                        } else {
                                          var15 = this.field_E[var10];
                                          var16 = (var15 >>> 24) * field_C >> 8;
                                          var17 = 256 - var16;
                                          if ((field_d & 16777215) != 16777215) {
                                            if (var16 == 255) {
                                              var18 = (var15 & 16711680) * field_n & -16777216;
                                              var19 = (var15 & 65280) * field_e & 16711680;
                                              var20 = (var15 & 255) * field_b & 65280;
                                              var12[var11] = (var18 | var19 | var20) >>> 8;
                                              break L64;
                                            } else {
                                              var18 = (var15 & 16711680) * field_n & -16777216;
                                              var19 = (var15 & 65280) * field_e & 16711680;
                                              var20 = (var15 & 255) * field_b & 65280;
                                              var15 = (var18 | var19 | var20) >>> 8;
                                              var21 = var31[var11];
                                              var12[var11] = ((var15 & 16711935) * var16 + (var21 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var21 & 65280) * var17 & 16711680) >> 8;
                                              break L64;
                                            }
                                          } else {
                                            var18 = var31[var11];
                                            var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                            break L64;
                                          }
                                        }
                                      } else {
                                        var15 = this.field_E[var10];
                                        var16 = var15 >>> 24;
                                        var17 = 256 - var16;
                                        var18 = var31[var11];
                                        var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                        break L64;
                                      }
                                    }
                                  } else {
                                    if (var13 != 1) {
                                      if (var13 != 0) {
                                        if (var13 != 3) {
                                          if (var13 != 2) {
                                            throw new IllegalArgumentException();
                                          } else {
                                            var15 = this.field_E[var10];
                                            var16 = (var15 & 16711935) * field_C & -16711936;
                                            var17 = (var15 & 65280) * field_C & 16711680;
                                            var12[var11] = ((var16 | var17) >>> 8) + field_s;
                                            break L64;
                                          }
                                        } else {
                                          incrementValue$25 = var10;
                                          var10++;
                                          var15 = this.field_E[incrementValue$25];
                                          var16 = field_d;
                                          var17 = var15 + var16;
                                          var18 = (var15 & 16711935) + (var16 & 16711935);
                                          var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                          var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                          break L64;
                                        }
                                      } else {
                                        incrementValue$26 = var10;
                                        var10++;
                                        var15 = this.field_E[incrementValue$26];
                                        var16 = (var15 & 16711680) * field_n & -16777216;
                                        var17 = (var15 & 65280) * field_e & 16711680;
                                        var18 = (var15 & 255) * field_b & 65280;
                                        var12[var11] = (var16 | var17 | var18) >>> 8;
                                        break L64;
                                      }
                                    } else {
                                      var12[var11] = this.field_E[var10];
                                      break L64;
                                    }
                                  }
                                }
                                var9++;
                                continue L63;
                              }
                            }
                          } else {
                            break L62;
                          }
                        } else {
                          break L62;
                        }
                      } else {
                        break L62;
                      }
                    } else {
                      break L62;
                    }
                  }
                  var5++;
                  field_w = field_w + field_r;
                  continue L61;
                }
              }
            }
          }
        }
    }

    jg(kj param0, int[] param1, int param2, int param3, int param4, int param5, boolean param6) {
        super(param0, param4, param5);
        int var9 = 0;
        int var10 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        if (param6) {
            this.field_E = new int[param4 * param5];
        } else {
            this.field_E = param1;
        }
        param3 = param3 - this.field_o;
        int var8 = 0;
        for (var9 = 0; var9 < param5; var9++) {
            for (var10 = 0; var10 < param4; var10++) {
                incrementValue$0 = var8;
                var8++;
                incrementValue$1 = param2;
                param2++;
                this.field_E[incrementValue$0] = param1[incrementValue$1];
            }
            param2 = param2 + param3;
        }
    }
}
