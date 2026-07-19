/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ima {
    byte[] field_a;
    int field_d;
    int[] field_b;
    int field_f;
    byte[] field_h;
    int field_i;
    int field_e;
    int field_g;
    int field_c;

    final static ima a(asb param0, int param1, int param2) {
        byte[] var3 = param0.a(param1, param2, (byte) 13);
        if (var3 == null) {
            return null;
        }
        return ima.a(var3)[0];
    }

    final static ima b(asb param0, String param1, String param2) {
        byte[] var3 = param0.a(param2, true, param1);
        if (var3 == null) {
            return null;
        }
        return ima.a(var3)[0];
    }

    final void d() {
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int var1 = 0;
        int var2 = 0;
        byte[] var3 = null;
        int var4 = 0;
        byte[] var4_ref_byte__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var1 = this.a();
          var2 = this.c();
          if (this.field_f != var1) {
            break L0;
          } else {
            if (this.field_e != var2) {
              break L0;
            } else {
              return;
            }
          }
        }
        L1: {
          var3 = new byte[var1 * var2];
          if (this.field_a == null) {
            var4 = 0;
            L2: while (true) {
              if (var4 >= this.field_e) {
                break L1;
              } else {
                var5 = var4 * this.field_f;
                var6 = (var4 + this.field_g) * var1 + this.field_c;
                var7 = 0;
                L3: while (true) {
                  if (var7 >= this.field_f) {
                    var4++;
                    continue L2;
                  } else {
                    incrementValue$4 = var6;
                    var6++;
                    incrementValue$5 = var5;
                    var5++;
                    var3[incrementValue$4] = this.field_h[incrementValue$5];
                    var7++;
                    continue L3;
                  }
                }
              }
            }
          } else {
            var4_ref_byte__ = new byte[var1 * var2];
            var5 = 0;
            L4: while (true) {
              if (var5 >= this.field_e) {
                this.field_a = var4_ref_byte__;
                break L1;
              } else {
                var6 = var5 * this.field_f;
                var7 = (var5 + this.field_g) * var1 + this.field_c;
                var8 = 0;
                L5: while (true) {
                  if (var8 >= this.field_f) {
                    var5++;
                    continue L4;
                  } else {
                    var3[var7] = this.field_h[var6];
                    incrementValue$6 = var7;
                    var7++;
                    incrementValue$7 = var6;
                    var6++;
                    var4_ref_byte__[incrementValue$6] = this.field_a[incrementValue$7];
                    var8++;
                    continue L5;
                  }
                }
              }
            }
          }
        }
        this.field_d = 0;
        this.field_g = 0;
        this.field_i = 0;
        this.field_c = 0;
        this.field_f = var1;
        this.field_e = var2;
        this.field_h = var3;
    }

    final int[] b() {
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int var1 = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var1 = this.a();
          var2 = new int[var1 * this.c()];
          if (this.field_a == null) {
            var3 = 0;
            L1: while (true) {
              if (var3 >= this.field_e) {
                break L0;
              } else {
                var4 = var3 * this.field_f;
                var5 = this.field_c + (var3 + this.field_g) * var1;
                var6 = 0;
                L2: while (true) {
                  if (var6 >= this.field_f) {
                    var3++;
                    continue L1;
                  } else {
                    incrementValue$12 = var4;
                    var4++;
                    var7 = this.field_b[this.field_h[incrementValue$12] & 255];
                    if (var7 == 0) {
                      incrementValue$13 = var5;
                      var5++;
                      var2[incrementValue$13] = 0;
                      var6++;
                      continue L2;
                    } else {
                      incrementValue$14 = var5;
                      var5++;
                      var2[incrementValue$14] = -16777216 | var7;
                      var6++;
                      continue L2;
                    }
                  }
                }
              }
            }
          } else {
            var3 = 0;
            L3: while (true) {
              if (var3 >= this.field_e) {
                break L0;
              } else {
                var4 = var3 * this.field_f;
                var5 = this.field_c + (var3 + this.field_g) * var1;
                var6 = 0;
                L4: while (true) {
                  if (var6 >= this.field_f) {
                    var3++;
                    continue L3;
                  } else {
                    incrementValue$15 = var5;
                    var5++;
                    var2[incrementValue$15] = this.field_a[var4] << 24 | this.field_b[this.field_h[var4] & 255];
                    var4++;
                    var6++;
                    continue L4;
                  }
                }
              }
            }
          }
        }
        return var2;
    }

    private final static ima[] a(byte[] param0) {
        byte dupTemp$2 = 0;
        byte dupTemp$3 = 0;
        ds var1 = null;
        int var2 = 0;
        ima[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        int[] var7 = null;
        int var8 = 0;
        ima var8_ref_ima = null;
        ima var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        int[] var17 = null;
        int stackIn_48_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int stackOut_61_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_63_1 = 0;
        int stackOut_62_0 = 0;
        int stackOut_62_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        var1 = new ds(param0);
        var1.field_e = param0.length - 2;
        var2 = var1.e(1869);
        var3 = new ima[var2];
        var4 = 0;
        L0: while (true) {
          if (var4 >= var2) {
            var1.field_e = param0.length - 7 - var2 * 8;
            var4 = var1.e(1869);
            var5 = var1.e(1869);
            var6 = (var1.e((byte) -125) & 255) + 1;
            var7_int = 0;
            L1: while (true) {
              if (var7_int >= var2) {
                var7_int = 0;
                L2: while (true) {
                  if (var7_int >= var2) {
                    var7_int = 0;
                    L3: while (true) {
                      if (var7_int >= var2) {
                        var7_int = 0;
                        L4: while (true) {
                          if (var7_int >= var2) {
                            var7_int = 0;
                            L5: while (true) {
                              if (var7_int >= var2) {
                                var1.field_e = param0.length - 7 - var2 * 8 - (var6 - 1) * 3;
                                var17 = new int[var6];
                                var16 = var17;
                                var7 = var16;
                                var8 = 1;
                                L6: while (true) {
                                  if (var8 >= var6) {
                                    var8 = 0;
                                    L7: while (true) {
                                      if (var8 >= var2) {
                                        var1.field_e = 0;
                                        var8 = 0;
                                        L8: while (true) {
                                          if (var8 >= var2) {
                                            return var3;
                                          } else {
                                            var9 = var3[var8];
                                            var10 = var9.field_f * var9.field_e;
                                            var9.field_h = new byte[var10];
                                            var11 = var1.e((byte) -109);
                                            if ((var11 & 2) != 0) {
                                              L9: {
                                                var12 = 0;
                                                var9.field_a = new byte[var10];
                                                if ((var11 & 1) != 0) {
                                                  var13 = 0;
                                                  L10: while (true) {
                                                    if (var13 >= var9.field_f) {
                                                      var13 = 0;
                                                      L11: while (true) {
                                                        if (var13 >= var9.field_f) {
                                                          break L9;
                                                        } else {
                                                          var14 = 0;
                                                          L12: while (true) {
                                                            if (var14 >= var9.field_e) {
                                                              var13++;
                                                              continue L11;
                                                            } else {
                                                              L13: {
                                                                dupTemp$2 = var1.d((byte) -114);
                                                                var9.field_a[var13 + var14 * var9.field_f] = dupTemp$2;
                                                                var15 = dupTemp$2;
                                                                stackOut_61_0 = var12;
                                                                stackIn_63_0 = stackOut_61_0;
                                                                stackIn_62_0 = stackOut_61_0;
                                                                if (var15 == -1) {
                                                                  stackOut_63_0 = stackIn_63_0;
                                                                  stackOut_63_1 = 0;
                                                                  stackIn_64_0 = stackOut_63_0;
                                                                  stackIn_64_1 = stackOut_63_1;
                                                                  break L13;
                                                                } else {
                                                                  stackOut_62_0 = stackIn_62_0;
                                                                  stackOut_62_1 = 1;
                                                                  stackIn_64_0 = stackOut_62_0;
                                                                  stackIn_64_1 = stackOut_62_1;
                                                                  break L13;
                                                                }
                                                              }
                                                              var12 = stackIn_64_0 | stackIn_64_1;
                                                              var14++;
                                                              continue L12;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      var14 = 0;
                                                      L14: while (true) {
                                                        if (var14 >= var9.field_e) {
                                                          var13++;
                                                          continue L10;
                                                        } else {
                                                          var9.field_h[var13 + var14 * var9.field_f] = var1.d((byte) -114);
                                                          var14++;
                                                          continue L14;
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  var13 = 0;
                                                  L15: while (true) {
                                                    if (var13 >= var10) {
                                                      var13 = 0;
                                                      L16: while (true) {
                                                        if (var13 >= var10) {
                                                          break L9;
                                                        } else {
                                                          L17: {
                                                            dupTemp$3 = var1.d((byte) -114);
                                                            var9.field_a[var13] = dupTemp$3;
                                                            var14 = dupTemp$3;
                                                            stackOut_47_0 = var12;
                                                            stackIn_49_0 = stackOut_47_0;
                                                            stackIn_48_0 = stackOut_47_0;
                                                            if (var14 == -1) {
                                                              stackOut_49_0 = stackIn_49_0;
                                                              stackOut_49_1 = 0;
                                                              stackIn_50_0 = stackOut_49_0;
                                                              stackIn_50_1 = stackOut_49_1;
                                                              break L17;
                                                            } else {
                                                              stackOut_48_0 = stackIn_48_0;
                                                              stackOut_48_1 = 1;
                                                              stackIn_50_0 = stackOut_48_0;
                                                              stackIn_50_1 = stackOut_48_1;
                                                              break L17;
                                                            }
                                                          }
                                                          var12 = stackIn_50_0 | stackIn_50_1;
                                                          var13++;
                                                          continue L16;
                                                        }
                                                      }
                                                    } else {
                                                      var9.field_h[var13] = var1.d((byte) -114);
                                                      var13++;
                                                      continue L15;
                                                    }
                                                  }
                                                }
                                              }
                                              if (var12 == 0) {
                                                var9.field_a = null;
                                                var8++;
                                                continue L8;
                                              } else {
                                                var8++;
                                                continue L8;
                                              }
                                            } else {
                                              if ((var11 & 1) != 0) {
                                                var12 = 0;
                                                L18: while (true) {
                                                  if (var12 < var9.field_f) {
                                                    var13 = 0;
                                                    L19: while (true) {
                                                      if (var13 >= var9.field_e) {
                                                        var12++;
                                                        continue L18;
                                                      } else {
                                                        var9.field_h[var12 + var13 * var9.field_f] = var1.d((byte) -114);
                                                        var13++;
                                                        continue L19;
                                                      }
                                                    }
                                                  } else {
                                                    var8++;
                                                    continue L8;
                                                  }
                                                }
                                              } else {
                                                var12 = 0;
                                                L20: while (true) {
                                                  if (var12 < var10) {
                                                    var9.field_h[var12] = var1.d((byte) -114);
                                                    var12++;
                                                    continue L20;
                                                  } else {
                                                    var8++;
                                                    continue L8;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        var3[var8].field_b = var7;
                                        var8++;
                                        continue L7;
                                      }
                                    }
                                  } else {
                                    var7[var8] = var1.c((byte) -117);
                                    if (var17[var8] == 0) {
                                      var17[var8] = 1;
                                      var8++;
                                      continue L6;
                                    } else {
                                      var8++;
                                      continue L6;
                                    }
                                  }
                                }
                              } else {
                                var8_ref_ima = var3[var7_int];
                                var8_ref_ima.field_i = var4 - var8_ref_ima.field_f - var8_ref_ima.field_c;
                                var8_ref_ima.field_d = var5 - var8_ref_ima.field_e - var8_ref_ima.field_g;
                                var7_int++;
                                continue L5;
                              }
                            }
                          } else {
                            var3[var7_int].field_e = var1.e(1869);
                            var7_int++;
                            continue L4;
                          }
                        }
                      } else {
                        var3[var7_int].field_f = var1.e(1869);
                        var7_int++;
                        continue L3;
                      }
                    }
                  } else {
                    var3[var7_int].field_g = var1.e(1869);
                    var7_int++;
                    continue L2;
                  }
                }
              } else {
                var3[var7_int].field_c = var1.e(1869);
                var7_int++;
                continue L1;
              }
            }
          } else {
            var3[var4] = new ima();
            var4++;
            continue L0;
          }
        }
    }

    final static ima a(asb param0, int param1) {
        byte[] var2 = param0.c((byte) 9, param1);
        if (var2 == null) {
            return null;
        }
        return ima.a(var2)[0];
    }

    private final int c() {
        return this.field_e + this.field_g + this.field_d;
    }

    final static ima[] a(asb param0, String param1, String param2) {
        byte[] var3 = param0.a(param2, true, param1);
        if (var3 == null) {
            return null;
        }
        return ima.a(var3);
    }

    private final int a() {
        return this.field_f + this.field_c + this.field_i;
    }
}
