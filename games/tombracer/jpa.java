/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jpa {
    int field_c;
    byte[] field_h;
    int field_a;
    int field_d;
    int[] field_g;
    byte[] field_f;
    int field_b;
    int field_e;
    int field_i;

    final int[] e() {
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
          if (this.field_h == null) {
            var3 = 0;
            L1: while (true) {
              if (var3 >= this.field_a) {
                break L0;
              } else {
                var4 = var3 * this.field_i;
                var5 = this.field_d + (var3 + this.field_c) * var1;
                var6 = 0;
                L2: while (true) {
                  if (var6 >= this.field_i) {
                    var3++;
                    continue L1;
                  } else {
                    incrementValue$12 = var4;
                    var4++;
                    var7 = this.field_g[this.field_f[incrementValue$12] & 255];
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
              if (var3 >= this.field_a) {
                break L0;
              } else {
                var4 = var3 * this.field_i;
                var5 = this.field_d + (var3 + this.field_c) * var1;
                var6 = 0;
                L4: while (true) {
                  if (var6 >= this.field_i) {
                    var3++;
                    continue L3;
                  } else {
                    incrementValue$15 = var5;
                    var5++;
                    var2[incrementValue$15] = this.field_h[var4] << 24 | this.field_g[this.field_f[var4] & 255];
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

    private final int a() {
        return this.field_i + this.field_d + this.field_b;
    }

    final static jpa[] b(cn param0, String param1, String param2) {
        byte[] var3 = param0.a(param1, (byte) 127, param2);
        if (var3 == null) {
            return null;
        }
        return jpa.a(var3);
    }

    final static jpa a(cn param0, int param1) {
        byte[] var2 = param0.f(param1, -105);
        if (var2 == null) {
            return null;
        }
        return jpa.a(var2)[0];
    }

    final static jpa a(cn param0, String param1, String param2) {
        byte[] var3 = param0.a(param1, (byte) 127, param2);
        if (var3 == null) {
            return null;
        }
        return jpa.a(var3)[0];
    }

    final static jpa a(cn param0, int param1, int param2) {
        byte[] var3 = param0.a(false, param1, param2);
        if (var3 == null) {
            return null;
        }
        return jpa.a(var3)[0];
    }

    private final static jpa[] a(byte[] param0) {
        byte dupTemp$2 = 0;
        byte dupTemp$3 = 0;
        uia var1 = null;
        int var2 = 0;
        jpa[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        int[] var7 = null;
        int var8 = 0;
        jpa var8_ref_jpa = null;
        jpa var9 = null;
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
        var1 = new uia(param0);
        var1.field_h = param0.length - 2;
        var2 = var1.d(127);
        var3 = new jpa[var2];
        var4 = 0;
        L0: while (true) {
          if (var4 >= var2) {
            var1.field_h = param0.length - 7 - var2 * 8;
            var4 = var1.d(125);
            var5 = var1.d(125);
            var6 = (var1.h(255) & 255) + 1;
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
                                var1.field_h = param0.length - 7 - var2 * 8 - (var6 - 1) * 3;
                                var17 = new int[var6];
                                var16 = var17;
                                var7 = var16;
                                var8 = 1;
                                L6: while (true) {
                                  if (var8 >= var6) {
                                    var8 = 0;
                                    L7: while (true) {
                                      if (var8 >= var2) {
                                        var1.field_h = 0;
                                        var8 = 0;
                                        L8: while (true) {
                                          if (var8 >= var2) {
                                            return var3;
                                          } else {
                                            var9 = var3[var8];
                                            var10 = var9.field_i * var9.field_a;
                                            var9.field_f = new byte[var10];
                                            var11 = var1.h(255);
                                            if ((var11 & 2) != 0) {
                                              L9: {
                                                var12 = 0;
                                                var9.field_h = new byte[var10];
                                                if ((var11 & 1) != 0) {
                                                  var13 = 0;
                                                  L10: while (true) {
                                                    if (var13 >= var9.field_i) {
                                                      var13 = 0;
                                                      L11: while (true) {
                                                        if (var13 >= var9.field_i) {
                                                          break L9;
                                                        } else {
                                                          var14 = 0;
                                                          L12: while (true) {
                                                            if (var14 >= var9.field_a) {
                                                              var13++;
                                                              continue L11;
                                                            } else {
                                                              L13: {
                                                                dupTemp$2 = var1.c((byte) 106);
                                                                var9.field_h[var13 + var14 * var9.field_i] = dupTemp$2;
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
                                                        if (var14 >= var9.field_a) {
                                                          var13++;
                                                          continue L10;
                                                        } else {
                                                          var9.field_f[var13 + var14 * var9.field_i] = var1.c((byte) 110);
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
                                                            dupTemp$3 = var1.c((byte) 46);
                                                            var9.field_h[var13] = dupTemp$3;
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
                                                      var9.field_f[var13] = var1.c((byte) 62);
                                                      var13++;
                                                      continue L15;
                                                    }
                                                  }
                                                }
                                              }
                                              if (var12 == 0) {
                                                var9.field_h = null;
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
                                                  if (var12 < var9.field_i) {
                                                    var13 = 0;
                                                    L19: while (true) {
                                                      if (var13 >= var9.field_a) {
                                                        var12++;
                                                        continue L18;
                                                      } else {
                                                        var9.field_f[var12 + var13 * var9.field_i] = var1.c((byte) 62);
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
                                                    var9.field_f[var12] = var1.c((byte) 81);
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
                                        var3[var8].field_g = var7;
                                        var8++;
                                        continue L7;
                                      }
                                    }
                                  } else {
                                    var7[var8] = var1.a(-32768);
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
                                var8_ref_jpa = var3[var7_int];
                                var8_ref_jpa.field_b = var4 - var8_ref_jpa.field_i - var8_ref_jpa.field_d;
                                var8_ref_jpa.field_e = var5 - var8_ref_jpa.field_a - var8_ref_jpa.field_c;
                                var7_int++;
                                continue L5;
                              }
                            }
                          } else {
                            var3[var7_int].field_a = var1.d(126);
                            var7_int++;
                            continue L4;
                          }
                        }
                      } else {
                        var3[var7_int].field_i = var1.d(126);
                        var7_int++;
                        continue L3;
                      }
                    }
                  } else {
                    var3[var7_int].field_c = var1.d(123);
                    var7_int++;
                    continue L2;
                  }
                }
              } else {
                var3[var7_int].field_d = var1.d(122);
                var7_int++;
                continue L1;
              }
            }
          } else {
            var3[var4] = new jpa();
            var4++;
            continue L0;
          }
        }
    }

    final void b() {
        int var1 = 0;
        byte[] var2 = null;
        int var3 = 0;
        byte[] var3_ref_byte__ = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        byte[] var8 = null;
        byte[] var9 = null;
        byte[] var10 = null;
        L0: {
          var9 = this.field_f;
          var7 = var9;
          var2 = var7;
          if (this.field_h != null) {
            var10 = this.field_h;
            var8 = var10;
            var3_ref_byte__ = var8;
            var4 = this.field_a - 1;
            L1: while (true) {
              if (var4 < 0) {
                break L0;
              } else {
                var5 = var4 * this.field_i;
                var6 = (var4 + 1) * this.field_i;
                L2: while (true) {
                  if (var5 >= var6) {
                    var4--;
                    continue L1;
                  } else {
                    var6--;
                    var1 = var9[var5];
                    var2[var5] = var9[var6];
                    var2[var6] = (byte)var1;
                    var1 = var10[var5];
                    var3_ref_byte__[var5] = var10[var6];
                    var3_ref_byte__[var6] = (byte)var1;
                    var5++;
                    continue L2;
                  }
                }
              }
            }
          } else {
            var3 = this.field_a - 1;
            L3: while (true) {
              if (var3 < 0) {
                break L0;
              } else {
                var4 = var3 * this.field_i;
                var5 = (var3 + 1) * this.field_i;
                L4: while (true) {
                  if (var4 >= var5) {
                    var3--;
                    continue L3;
                  } else {
                    var5--;
                    var1 = var9[var4];
                    var2[var4] = var9[var5];
                    var2[var5] = (byte)var1;
                    var4++;
                    continue L4;
                  }
                }
              }
            }
          }
        }
        var3 = this.field_d;
        this.field_d = this.field_b;
        this.field_b = var3;
    }

    private final int c() {
        return this.field_a + this.field_c + this.field_e;
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
          if (this.field_i != var1) {
            break L0;
          } else {
            if (this.field_a != var2) {
              break L0;
            } else {
              return;
            }
          }
        }
        L1: {
          var3 = new byte[var1 * var2];
          if (this.field_h == null) {
            var4 = 0;
            L2: while (true) {
              if (var4 >= this.field_a) {
                break L1;
              } else {
                var5 = var4 * this.field_i;
                var6 = (var4 + this.field_c) * var1 + this.field_d;
                var7 = 0;
                L3: while (true) {
                  if (var7 >= this.field_i) {
                    var4++;
                    continue L2;
                  } else {
                    incrementValue$4 = var6;
                    var6++;
                    incrementValue$5 = var5;
                    var5++;
                    var3[incrementValue$4] = this.field_f[incrementValue$5];
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
              if (var5 >= this.field_a) {
                this.field_h = var4_ref_byte__;
                break L1;
              } else {
                var6 = var5 * this.field_i;
                var7 = (var5 + this.field_c) * var1 + this.field_d;
                var8 = 0;
                L5: while (true) {
                  if (var8 >= this.field_i) {
                    var5++;
                    continue L4;
                  } else {
                    var3[var7] = this.field_f[var6];
                    incrementValue$6 = var7;
                    var7++;
                    incrementValue$7 = var6;
                    var6++;
                    var4_ref_byte__[incrementValue$6] = this.field_h[incrementValue$7];
                    var8++;
                    continue L5;
                  }
                }
              }
            }
          }
        }
        this.field_e = 0;
        this.field_c = 0;
        this.field_b = 0;
        this.field_d = 0;
        this.field_i = var1;
        this.field_a = var2;
        this.field_f = var3;
    }
}
