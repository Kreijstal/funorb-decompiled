/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    int field_i;
    int[] field_f;
    int field_h;
    int field_g;
    int field_b;
    int field_c;
    int field_a;
    byte[] field_e;
    byte[] field_d;

    private final static vd[] a(byte[] param0) {
        byte dupTemp$2 = 0;
        byte dupTemp$3 = 0;
        rb var1 = null;
        int var2 = 0;
        vd[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        int[] var7 = null;
        int var8 = 0;
        vd var8_ref_vd = null;
        vd var9 = null;
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
        var1 = new rb(param0);
        var1.field_g = param0.length - 2;
        var2 = var1.i((byte) 0);
        var3 = new vd[var2];
        var4 = 0;
        L0: while (true) {
          if (var4 >= var2) {
            var1.field_g = param0.length - 7 - var2 * 8;
            var4 = var1.i((byte) 0);
            var5 = var1.i((byte) 0);
            var6 = (var1.g(-52) & 255) + 1;
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
                                var17 = new int[var6];
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
                                            var10 = var9.field_h * var9.field_c;
                                            var9.field_d = new byte[var10];
                                            var11 = var1.g(29);
                                            if ((var11 & 2) != 0) {
                                              L9: {
                                                var12 = 0;
                                                var9.field_e = new byte[var10];
                                                if ((var11 & 1) != 0) {
                                                  var13 = 0;
                                                  L10: while (true) {
                                                    if (var13 >= var9.field_h) {
                                                      var13 = 0;
                                                      L11: while (true) {
                                                        if (var13 >= var9.field_h) {
                                                          break L9;
                                                        } else {
                                                          var14 = 0;
                                                          L12: while (true) {
                                                            if (var14 >= var9.field_c) {
                                                              var13++;
                                                              continue L11;
                                                            } else {
                                                              L13: {
                                                                dupTemp$2 = var1.d(0);
                                                                var9.field_e[var13 + var14 * var9.field_h] = dupTemp$2;
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
                                                        if (var14 >= var9.field_c) {
                                                          var13++;
                                                          continue L10;
                                                        } else {
                                                          var9.field_d[var13 + var14 * var9.field_h] = var1.d(0);
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
                                                            dupTemp$3 = var1.d(0);
                                                            var9.field_e[var13] = dupTemp$3;
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
                                                      var9.field_d[var13] = var1.d(0);
                                                      var13++;
                                                      continue L15;
                                                    }
                                                  }
                                                }
                                              }
                                              if (var12 == 0) {
                                                var9.field_e = null;
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
                                                  if (var12 < var9.field_h) {
                                                    var13 = 0;
                                                    L19: while (true) {
                                                      if (var13 >= var9.field_c) {
                                                        var12++;
                                                        continue L18;
                                                      } else {
                                                        var9.field_d[var12 + var13 * var9.field_h] = var1.d(0);
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
                                                    var9.field_d[var12] = var1.d(0);
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
                                        var3[var8].field_f = var7;
                                        var8++;
                                        continue L7;
                                      }
                                    }
                                  } else {
                                    var7[var8] = var1.g((byte) -84);
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
                                var8_ref_vd = var3[var7_int];
                                var8_ref_vd.field_g = var4 - var8_ref_vd.field_h - var8_ref_vd.field_a;
                                var8_ref_vd.field_b = var5 - var8_ref_vd.field_c - var8_ref_vd.field_i;
                                var7_int++;
                                continue L5;
                              }
                            }
                          } else {
                            var3[var7_int].field_c = var1.i((byte) 0);
                            var7_int++;
                            continue L4;
                          }
                        }
                      } else {
                        var3[var7_int].field_h = var1.i((byte) 0);
                        var7_int++;
                        continue L3;
                      }
                    }
                  } else {
                    var3[var7_int].field_i = var1.i((byte) 0);
                    var7_int++;
                    continue L2;
                  }
                }
              } else {
                var3[var7_int].field_a = var1.i((byte) 0);
                var7_int++;
                continue L1;
              }
            }
          } else {
            var3[var4] = new vd();
            var4++;
            continue L0;
          }
        }
    }

    final static vd[] a(gk param0, String param1, String param2) {
        byte[] var3 = param0.a(param1, (byte) -71, param2);
        if (var3 == null) {
            return null;
        }
        return vd.a(var3);
    }

    final static vd b(gk param0, String param1, String param2) {
        byte[] var3 = param0.a(param1, (byte) -71, param2);
        if (var3 == null) {
            return null;
        }
        return vd.a(var3)[0];
    }
}
