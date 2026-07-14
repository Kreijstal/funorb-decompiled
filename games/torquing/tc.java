/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc {
    private int field_h;
    private int field_c;
    private byte[] field_i;
    int field_e;
    private byte[] field_a;
    int field_d;
    private int field_f;
    private int field_b;
    private int[] field_g;

    private final int a() {
        return ((tc) this).field_e + ((tc) this).field_b + ((tc) this).field_c;
    }

    final void b() {
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
          var2 = this.a();
          if (((tc) this).field_d != var1) {
            break L0;
          } else {
            if (((tc) this).field_e != var2) {
              break L0;
            } else {
              return;
            }
          }
        }
        L1: {
          var3 = new byte[var1 * var2];
          if (((tc) this).field_a == null) {
            var4 = 0;
            L2: while (true) {
              if (var4 >= ((tc) this).field_e) {
                break L1;
              } else {
                var5 = var4 * ((tc) this).field_d;
                var6 = (var4 + ((tc) this).field_b) * var1 + ((tc) this).field_h;
                var7 = 0;
                L3: while (true) {
                  if (var7 >= ((tc) this).field_d) {
                    var4++;
                    continue L2;
                  } else {
                    var6++;
                    var5++;
                    var3[var6] = ((tc) this).field_i[var5];
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
              if (var5 >= ((tc) this).field_e) {
                ((tc) this).field_a = var4_ref_byte__;
                break L1;
              } else {
                var6 = var5 * ((tc) this).field_d;
                var7 = (var5 + ((tc) this).field_b) * var1 + ((tc) this).field_h;
                var8 = 0;
                L5: while (true) {
                  if (var8 >= ((tc) this).field_d) {
                    var5++;
                    continue L4;
                  } else {
                    var3[var7] = ((tc) this).field_i[var6];
                    var7++;
                    var6++;
                    var4_ref_byte__[var7] = ((tc) this).field_a[var6];
                    var8++;
                    continue L5;
                  }
                }
              }
            }
          }
        }
        ((tc) this).field_c = 0;
        ((tc) this).field_b = 0;
        ((tc) this).field_f = 0;
        ((tc) this).field_h = 0;
        ((tc) this).field_d = var1;
        ((tc) this).field_e = var2;
        ((tc) this).field_i = var3;
    }

    private final int d() {
        return ((tc) this).field_d + ((tc) this).field_h + ((tc) this).field_f;
    }

    private final static tc[] a(byte[] param0) {
        fj var1 = null;
        int var2 = 0;
        tc[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        int[] var7 = null;
        int var8 = 0;
        tc var8_ref_tc = null;
        tc var9 = null;
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
        var1 = new fj(param0);
        var1.field_n = param0.length - 2;
        var2 = var1.i(7088);
        var3 = new tc[var2];
        var4 = 0;
        L0: while (true) {
          if (var4 >= var2) {
            var1.field_n = param0.length - 7 - var2 * 8;
            var4 = var1.i(7088);
            var5 = var1.i(7088);
            var6 = (var1.i((byte) -101) & 255) + 1;
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
                                var1.field_n = param0.length - 7 - var2 * 8 - (var6 - 1) * 3;
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
                                        var1.field_n = 0;
                                        var8 = 0;
                                        L8: while (true) {
                                          if (var8 >= var2) {
                                            return var3;
                                          } else {
                                            var9 = var3[var8];
                                            var10 = var9.field_d * var9.field_e;
                                            var9.field_i = new byte[var10];
                                            var11 = var1.i((byte) -101);
                                            if ((var11 & 2) != 0) {
                                              L9: {
                                                var12 = 0;
                                                var9.field_a = new byte[var10];
                                                if ((var11 & 1) != 0) {
                                                  var13 = 0;
                                                  L10: while (true) {
                                                    if (var13 >= var9.field_d) {
                                                      var13 = 0;
                                                      L11: while (true) {
                                                        if (var13 >= var9.field_d) {
                                                          break L9;
                                                        } else {
                                                          var14 = 0;
                                                          L12: while (true) {
                                                            if (var14 >= var9.field_e) {
                                                              var13++;
                                                              continue L11;
                                                            } else {
                                                              L13: {
                                                                var9.field_a[var13 + var14 * var9.field_d] = var1.f((byte) 22);
                                                                var15 = var1.f((byte) 22);
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
                                                          var9.field_i[var13 + var14 * var9.field_d] = var1.f((byte) 23);
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
                                                            var9.field_a[var13] = var1.f((byte) 59);
                                                            var14 = var1.f((byte) 59);
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
                                                      var9.field_i[var13] = var1.f((byte) 93);
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
                                                  if (var12 < var9.field_d) {
                                                    var13 = 0;
                                                    L19: while (true) {
                                                      if (var13 >= var9.field_e) {
                                                        var12++;
                                                        continue L18;
                                                      } else {
                                                        var9.field_i[var12 + var13 * var9.field_d] = var1.f((byte) 54);
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
                                                    var9.field_i[var12] = var1.f((byte) 23);
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
                                    var7[var8] = var1.e((byte) 62);
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
                                var8_ref_tc = var3[var7_int];
                                var8_ref_tc.field_f = var4 - var8_ref_tc.field_d - var8_ref_tc.field_h;
                                var8_ref_tc.field_c = var5 - var8_ref_tc.field_e - var8_ref_tc.field_b;
                                var7_int++;
                                continue L5;
                              }
                            }
                          } else {
                            var3[var7_int].field_e = var1.i(7088);
                            var7_int++;
                            continue L4;
                          }
                        }
                      } else {
                        var3[var7_int].field_d = var1.i(7088);
                        var7_int++;
                        continue L3;
                      }
                    }
                  } else {
                    var3[var7_int].field_b = var1.i(7088);
                    var7_int++;
                    continue L2;
                  }
                }
              } else {
                var3[var7_int].field_h = var1.i(7088);
                var7_int++;
                continue L1;
              }
            }
          } else {
            var3[var4] = new tc();
            var4++;
            continue L0;
          }
        }
    }

    final static tc a(la param0, int param1, int param2) {
        byte[] var3 = param0.a(param1, 100, param2);
        if (var3 == null) {
            return null;
        }
        return tc.a(var3)[0];
    }

    final int[] c() {
        int var1 = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var1 = this.d();
          var2 = new int[var1 * this.a()];
          if (((tc) this).field_a == null) {
            var3 = 0;
            L1: while (true) {
              if (var3 >= ((tc) this).field_e) {
                break L0;
              } else {
                var4 = var3 * ((tc) this).field_d;
                var5 = ((tc) this).field_h + (var3 + ((tc) this).field_b) * var1;
                var6 = 0;
                L2: while (true) {
                  if (var6 >= ((tc) this).field_d) {
                    var3++;
                    continue L1;
                  } else {
                    var4++;
                    var7 = ((tc) this).field_g[((tc) this).field_i[var4] & 255];
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
              if (var3 >= ((tc) this).field_e) {
                break L0;
              } else {
                var4 = var3 * ((tc) this).field_d;
                var5 = ((tc) this).field_h + (var3 + ((tc) this).field_b) * var1;
                var6 = 0;
                L4: while (true) {
                  if (var6 >= ((tc) this).field_d) {
                    var3++;
                    continue L3;
                  } else {
                    var5++;
                    var2[var5] = ((tc) this).field_a[var4] << 24 | ((tc) this).field_g[((tc) this).field_i[var4] & 255];
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

    final static tc a(la param0, int param1) {
        byte[] var2 = param0.b(param1, (byte) 95);
        if (var2 == null) {
            return null;
        }
        return tc.a(var2)[0];
    }
}
