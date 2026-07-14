/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh {
    private int field_c;
    int field_i;
    private byte[] field_d;
    private int field_b;
    private byte[] field_g;
    int field_a;
    private int field_f;
    private int field_h;
    private int[] field_e;

    final static uh a(vr param0, int param1, int param2) {
        byte[] var3 = param0.b(57, param1, param2);
        if (var3 == null) {
            return null;
        }
        return uh.a(var3)[0];
    }

    final int[] a() {
        int var1 = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var1 = this.d();
          var2 = new int[var1 * this.b()];
          if (((uh) this).field_g == null) {
            var3 = 0;
            L1: while (true) {
              if (var3 >= ((uh) this).field_a) {
                break L0;
              } else {
                var4 = var3 * ((uh) this).field_i;
                var5 = ((uh) this).field_b + (var3 + ((uh) this).field_h) * var1;
                var6 = 0;
                L2: while (true) {
                  if (var6 >= ((uh) this).field_i) {
                    var3++;
                    continue L1;
                  } else {
                    var4++;
                    var7 = ((uh) this).field_e[((uh) this).field_d[var4] & 255];
                    if (var7 == 0) {
                      var5++;
                      var2[var5] = 0;
                      var6++;
                      continue L2;
                    } else {
                      var5++;
                      var2[var5] = -16777216 | var7;
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
              if (var3 >= ((uh) this).field_a) {
                break L0;
              } else {
                var4 = var3 * ((uh) this).field_i;
                var5 = ((uh) this).field_b + (var3 + ((uh) this).field_h) * var1;
                var6 = 0;
                L4: while (true) {
                  if (var6 >= ((uh) this).field_i) {
                    var3++;
                    continue L3;
                  } else {
                    var5++;
                    var2[var5] = ((uh) this).field_g[var4] << 24 | ((uh) this).field_e[((uh) this).field_d[var4] & 255];
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

    private final static uh[] a(byte[] param0) {
        lu var1 = null;
        int var2 = 0;
        uh[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        int[] var7 = null;
        int var8 = 0;
        uh var8_ref_uh = null;
        uh var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
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
        var1 = new lu(param0);
        var1.field_g = param0.length - 2;
        var2 = var1.e((byte) 99);
        var3 = new uh[var2];
        var4 = 0;
        L0: while (true) {
          if (var4 >= var2) {
            var1.field_g = param0.length - 7 - var2 * 8;
            var4 = var1.e((byte) 91);
            var5 = var1.e((byte) 84);
            var6 = (var1.b(16711935) & 255) + 1;
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
                                var1.field_g = param0.length - 7 - var2 * 8 - (var6 - 1) * 3;
                                var19 = new int[var6];
                                var18 = var19;
                                var17 = var18;
                                var16 = var17;
                                var7 = var16;
                                var8 = 1;
                                L6: while (true) {
                                  if (var8 >= var6) {
                                    var8 = 0;
                                    L7: while (true) {
                                      if (var8 >= var2) {
                                        var1.field_g = 0;
                                        var8 = 0;
                                        L8: while (true) {
                                          if (var8 >= var2) {
                                            return var3;
                                          } else {
                                            var9 = var3[var8];
                                            var10 = var9.field_i * var9.field_a;
                                            var9.field_d = new byte[var10];
                                            var11 = var1.b(16711935);
                                            if ((var11 & 2) != 0) {
                                              L9: {
                                                var12 = 0;
                                                var9.field_g = new byte[var10];
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
                                                                var9.field_g[var13 + var14 * var9.field_i] = var1.b(true);
                                                                var15 = var1.b(true);
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
                                                          var9.field_d[var13 + var14 * var9.field_i] = var1.b(true);
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
                                                            var9.field_g[var13] = var1.b(true);
                                                            var14 = var1.b(true);
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
                                                      var9.field_d[var13] = var1.b(true);
                                                      var13++;
                                                      continue L15;
                                                    }
                                                  }
                                                }
                                              }
                                              if (var12 == 0) {
                                                var9.field_g = null;
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
                                                        var9.field_d[var12 + var13 * var9.field_i] = var1.b(true);
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
                                                    var9.field_d[var12] = var1.b(true);
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
                                        var3[var8].field_e = var7;
                                        var8++;
                                        continue L7;
                                      }
                                    }
                                  } else {
                                    var7[var8] = var1.a(3);
                                    if (var19[var8] == 0) {
                                      var19[var8] = 1;
                                      var8++;
                                      continue L6;
                                    } else {
                                      var8++;
                                      continue L6;
                                    }
                                  }
                                }
                              } else {
                                var8_ref_uh = var3[var7_int];
                                var8_ref_uh.field_f = var4 - var8_ref_uh.field_i - var8_ref_uh.field_b;
                                var8_ref_uh.field_c = var5 - var8_ref_uh.field_a - var8_ref_uh.field_h;
                                var7_int++;
                                continue L5;
                              }
                            }
                          } else {
                            var3[var7_int].field_a = var1.e((byte) 107);
                            var7_int++;
                            continue L4;
                          }
                        }
                      } else {
                        var3[var7_int].field_i = var1.e((byte) 67);
                        var7_int++;
                        continue L3;
                      }
                    }
                  } else {
                    var3[var7_int].field_h = var1.e((byte) 107);
                    var7_int++;
                    continue L2;
                  }
                }
              } else {
                var3[var7_int].field_b = var1.e((byte) 127);
                var7_int++;
                continue L1;
              }
            }
          } else {
            var3[var4] = new uh();
            var4++;
            continue L0;
          }
        }
    }

    private final int d() {
        return ((uh) this).field_i + ((uh) this).field_b + ((uh) this).field_f;
    }

    final void c() {
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
          var1 = this.d();
          var2 = this.b();
          if (((uh) this).field_i != var1) {
            break L0;
          } else {
            if (((uh) this).field_a != var2) {
              break L0;
            } else {
              return;
            }
          }
        }
        L1: {
          var3 = new byte[var1 * var2];
          if (((uh) this).field_g == null) {
            var4 = 0;
            L2: while (true) {
              if (var4 >= ((uh) this).field_a) {
                break L1;
              } else {
                var5 = var4 * ((uh) this).field_i;
                var6 = (var4 + ((uh) this).field_h) * var1 + ((uh) this).field_b;
                var7 = 0;
                L3: while (true) {
                  if (var7 >= ((uh) this).field_i) {
                    var4++;
                    continue L2;
                  } else {
                    var6++;
                    var5++;
                    var3[var6] = ((uh) this).field_d[var5];
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
              if (var5 >= ((uh) this).field_a) {
                ((uh) this).field_g = var4_ref_byte__;
                break L1;
              } else {
                var6 = var5 * ((uh) this).field_i;
                var7 = (var5 + ((uh) this).field_h) * var1 + ((uh) this).field_b;
                var8 = 0;
                L5: while (true) {
                  if (var8 >= ((uh) this).field_i) {
                    var5++;
                    continue L4;
                  } else {
                    var3[var7] = ((uh) this).field_d[var6];
                    var7++;
                    var6++;
                    var4_ref_byte__[var7] = ((uh) this).field_g[var6];
                    var8++;
                    continue L5;
                  }
                }
              }
            }
          }
        }
        ((uh) this).field_c = 0;
        ((uh) this).field_h = 0;
        ((uh) this).field_f = 0;
        ((uh) this).field_b = 0;
        ((uh) this).field_i = var1;
        ((uh) this).field_a = var2;
        ((uh) this).field_d = var3;
    }

    private final int b() {
        return ((uh) this).field_a + ((uh) this).field_h + ((uh) this).field_c;
    }

    final static uh a(vr param0, int param1) {
        byte[] var2 = param0.b(param1, 0);
        if (var2 == null) {
            return null;
        }
        return uh.a(var2)[0];
    }
}
