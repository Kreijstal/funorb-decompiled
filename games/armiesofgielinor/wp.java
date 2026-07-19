/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wp extends ms {
    private byte[][] field_x;
    static int[][] field_H;
    static int[] field_w;
    private int field_C;
    static int[] field_D;
    static int field_E;
    static String field_y;
    static String field_I;
    static nt field_z;
    static String field_u;
    static String[] field_v;
    ht[] field_A;
    static String field_B;
    static String field_F;

    final boolean f(byte param0) {
        int var2 = 0;
        int var3_int = 0;
        at var3 = null;
        int var4 = 0;
        int var6 = 0;
        int var9 = 0;
        Object var10 = null;
        Object var11 = null;
        ig var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        int[] var21 = null;
        vh var25 = null;
        vh var27 = null;
        vh var30 = null;
        int[] var31 = null;
        vh var33 = null;
        at var34 = null;
        vh var45 = null;
        at var46 = null;
        int[] var47 = null;
        vh var49 = null;
        at var50 = null;
        int[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        int[] var56 = null;
        byte[] var57 = null;
        byte[] var58 = null;
        int[] var63 = null;
        byte[] var64 = null;
        byte[] var65 = null;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        int stackIn_80_0 = 0;
        int stackIn_80_1 = 0;
        int stackIn_103_0 = 0;
        int stackIn_103_1 = 0;
        int stackOut_79_0 = 0;
        int stackOut_79_1 = 0;
        int stackOut_83_0 = 0;
        int stackOut_83_1 = 0;
        int stackOut_66_0 = 0;
        int stackOut_66_1 = 0;
        int stackOut_70_0 = 0;
        int stackOut_70_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_105_0 = 0;
        int stackOut_105_1 = 0;
        int stackOut_92_0 = 0;
        int stackOut_92_1 = 0;
        var11 = null;
        var12 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 == -65) {
          if (null == this.field_A) {
            L0: {
              if (this.field_x != null) {
                break L0;
              } else {
                if (!jj.field_c.a(11894, this.field_C)) {
                  return false;
                } else {
                  var56 = jj.field_c.b(-26, this.field_C);
                  this.field_x = new byte[var56.length][];
                  var3_int = 0;
                  L1: while (true) {
                    if (var56.length <= var3_int) {
                      break L0;
                    } else {
                      this.field_x[var3_int] = jj.field_c.a((byte) 114, var56[var3_int], this.field_C);
                      var3_int++;
                      if (var12 == 0) {
                        continue L1;
                      } else {
                        break L0;
                      }
                    }
                  }
                }
              }
            }
            var2 = 1;
            var13 = 0;
            var3_int = var13;
            L2: while (true) {
              if (var13 >= this.field_x.length) {
                if (var2 != 0) {
                  var50 = new at();
                  var3 = var50;
                  var4 = jj.field_c.d(this.field_C, param0 ^ 65);
                  this.field_A = new ht[var4];
                  var47 = jj.field_c.b(-92, this.field_C);
                  var21 = var47;
                  var6 = 0;
                  L3: while (true) {
                    stackOut_79_0 = var6;
                    stackOut_79_1 = var47.length;
                    stackIn_80_0 = stackOut_79_0;
                    stackIn_80_1 = stackOut_79_1;
                    L4: while (true) {
                      L5: {
                        L6: {
                          if (stackIn_80_0 >= stackIn_80_1) {
                            break L6;
                          } else {
                            var65 = this.field_x[var6];
                            var49 = new vh(var65);
                            var49.field_q = 1;
                            var9 = var49.e((byte) -104);
                            var10 = null;
                            if (var12 != 0) {
                              break L5;
                            } else {
                              var11_ref = (ig) ((Object) var50.e((byte) 124));
                              if (var11_ref == null) {
                                L7: {
                                  if (var10 == null) {
                                    var10 = new ig(var9, up.field_e.c(var9, (byte) 81));
                                    var50.a((byte) -119, (tc) (var10));
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                }
                                this.field_A[var47[var6]] = new ht(var65, (ig) (var10));
                                var6++;
                                if (var12 == 0) {
                                  continue L3;
                                } else {
                                  break L6;
                                }
                              } else {
                                stackOut_83_0 = var11_ref.field_k ^ -1;
                                stackOut_83_1 = var9 ^ -1;
                                stackIn_80_0 = stackOut_83_0;
                                stackIn_80_1 = stackOut_83_1;
                                continue L4;
                              }
                            }
                          }
                        }
                        this.field_x = (byte[][]) null;
                        break L5;
                      }
                      return true;
                    }
                  }
                } else {
                  return false;
                }
              } else {
                var57 = this.field_x[var13];
                var30 = new vh(var57);
                var30.field_q = 1;
                var6 = var30.e((byte) -104);
                var2 = var2 != 0 & up.field_e.a(var6, (byte) -56) ? 1 : 0;
                var13++;
                if (var12 != 0) {
                  var46 = new at();
                  var4 = jj.field_c.d(this.field_C, param0 ^ 65);
                  this.field_A = new ht[var4];
                  var63 = jj.field_c.b(-92, this.field_C);
                  var6 = 0;
                  L8: while (true) {
                    stackOut_66_0 = var6;
                    stackOut_66_1 = var63.length;
                    stackIn_67_0 = stackOut_66_0;
                    stackIn_67_1 = stackOut_66_1;
                    L9: while (true) {
                      L10: {
                        L11: {
                          if (stackIn_67_0 >= stackIn_67_1) {
                            break L11;
                          } else {
                            var64 = this.field_x[var6];
                            var45 = new vh(var64);
                            var45.field_q = 1;
                            var9 = var45.e((byte) -104);
                            var10 = null;
                            if (var12 != 0) {
                              break L10;
                            } else {
                              var11_ref = (ig) ((Object) var46.e((byte) 124));
                              if (var11_ref == null) {
                                L12: {
                                  if (var10 == null) {
                                    var10 = new ig(var9, up.field_e.c(var9, (byte) 81));
                                    var46.a((byte) -119, (tc) (var10));
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                                this.field_A[var63[var6]] = new ht(var64, (ig) (var10));
                                var6++;
                                if (var12 == 0) {
                                  continue L8;
                                } else {
                                  break L11;
                                }
                              } else {
                                stackOut_70_0 = var11_ref.field_k ^ -1;
                                stackOut_70_1 = var9 ^ -1;
                                stackIn_67_0 = stackOut_70_0;
                                stackIn_67_1 = stackOut_70_1;
                                continue L9;
                              }
                            }
                          }
                        }
                        this.field_x = (byte[][]) null;
                        break L10;
                      }
                      return true;
                    }
                  }
                } else {
                  if (var12 == 0) {
                    continue L2;
                  } else {
                    if (var2 != 0) {
                      var34 = new at();
                      var3 = var34;
                      var4 = jj.field_c.d(this.field_C, param0 ^ 65);
                      this.field_A = new ht[var4];
                      var31 = jj.field_c.b(-92, this.field_C);
                      var21 = var31;
                      var6 = 0;
                      L13: while (true) {
                        stackOut_47_0 = var6;
                        stackOut_47_1 = var31.length;
                        stackIn_48_0 = stackOut_47_0;
                        stackIn_48_1 = stackOut_47_1;
                        L14: while (true) {
                          L15: {
                            L16: {
                              if (stackIn_48_0 >= stackIn_48_1) {
                                break L16;
                              } else {
                                var58 = this.field_x[var6];
                                var33 = new vh(var58);
                                var33.field_q = 1;
                                var9 = var33.e((byte) -104);
                                var10 = null;
                                if (var12 != 0) {
                                  break L15;
                                } else {
                                  var11_ref = (ig) ((Object) var34.e((byte) 124));
                                  L17: while (true) {
                                    L18: {
                                      if (var11_ref == null) {
                                        break L18;
                                      } else {
                                        stackOut_52_0 = var11_ref.field_k ^ -1;
                                        stackOut_52_1 = var9 ^ -1;
                                        stackIn_48_0 = stackOut_52_0;
                                        stackIn_48_1 = stackOut_52_1;
                                        stackIn_53_0 = stackOut_52_0;
                                        stackIn_53_1 = stackOut_52_1;
                                        if (var12 != 0) {
                                          continue L14;
                                        } else {
                                          if (stackIn_53_0 != stackIn_53_1) {
                                            var11_ref = (ig) ((Object) var34.a((byte) 123));
                                            continue L17;
                                          } else {
                                            var10 = var11_ref;
                                            break L18;
                                          }
                                        }
                                      }
                                    }
                                    L19: {
                                      if (var10 == null) {
                                        var10 = new ig(var9, up.field_e.c(var9, (byte) 81));
                                        var34.a((byte) -119, (tc) (var10));
                                        break L19;
                                      } else {
                                        break L19;
                                      }
                                    }
                                    this.field_A[var31[var6]] = new ht(var58, (ig) (var10));
                                    var6++;
                                    if (var12 == 0) {
                                      continue L13;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                              }
                            }
                            this.field_x = (byte[][]) null;
                            break L15;
                          }
                          return true;
                        }
                      }
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
          } else {
            return true;
          }
        } else {
          field_v = (String[]) null;
          if (null == this.field_A) {
            L20: {
              if (this.field_x != null) {
                break L20;
              } else {
                if (!jj.field_c.a(11894, this.field_C)) {
                  return false;
                } else {
                  var53 = jj.field_c.b(-26, this.field_C);
                  this.field_x = new byte[var53.length][];
                  var3_int = 0;
                  L21: while (true) {
                    if (var53.length <= var3_int) {
                      break L20;
                    } else {
                      this.field_x[var3_int] = jj.field_c.a((byte) 114, var53[var3_int], this.field_C);
                      var3_int++;
                      if (var12 == 0) {
                        continue L21;
                      } else {
                        break L20;
                      }
                    }
                  }
                }
              }
            }
            var2 = 1;
            var13 = 0;
            var3_int = var13;
            L22: while (true) {
              L23: {
                L24: {
                  if (var13 >= this.field_x.length) {
                    break L24;
                  } else {
                    var54 = this.field_x[var13];
                    var25 = new vh(var54);
                    var25.field_q = 1;
                    var6 = var25.e((byte) -104);
                    var2 = var2 != 0 & up.field_e.a(var6, (byte) -56) ? 1 : 0;
                    var13++;
                    if (var12 != 0) {
                      var3 = new at();
                      var4 = jj.field_c.d(this.field_C, param0 ^ 65);
                      this.field_A = new ht[var4];
                      var21 = jj.field_c.b(-92, this.field_C);
                      var6 = 0;
                      break L23;
                    } else {
                      if (var12 == 0) {
                        continue L22;
                      } else {
                        break L24;
                      }
                    }
                  }
                }
                if (var2 != 0) {
                  var3 = new at();
                  var4 = jj.field_c.d(this.field_C, param0 ^ 65);
                  this.field_A = new ht[var4];
                  var21 = jj.field_c.b(-92, this.field_C);
                  var6 = 0;
                  break L23;
                } else {
                  return false;
                }
              }
              L25: while (true) {
                stackOut_105_0 = var6;
                stackOut_105_1 = var21.length;
                stackIn_103_0 = stackOut_105_0;
                stackIn_103_1 = stackOut_105_1;
                L26: while (true) {
                  L27: {
                    L28: {
                      if (stackIn_103_0 >= stackIn_103_1) {
                        break L28;
                      } else {
                        var55 = this.field_x[var6];
                        var27 = new vh(var55);
                        var27.field_q = 1;
                        var9 = var27.e((byte) -104);
                        var10 = null;
                        if (var12 != 0) {
                          break L27;
                        } else {
                          var11_ref = (ig) ((Object) var3.e((byte) 124));
                          if (var11_ref == null) {
                            L29: {
                              if (var10 == null) {
                                var10 = new ig(var9, up.field_e.c(var9, (byte) 81));
                                var3.a((byte) -119, (tc) (var10));
                                break L29;
                              } else {
                                break L29;
                              }
                            }
                            this.field_A[var21[var6]] = new ht(var55, (ig) (var10));
                            var6++;
                            if (var12 == 0) {
                              continue L25;
                            } else {
                              break L28;
                            }
                          } else {
                            stackOut_92_0 = var11_ref.field_k ^ -1;
                            stackOut_92_1 = var9 ^ -1;
                            stackIn_103_0 = stackOut_92_0;
                            stackIn_103_1 = stackOut_92_1;
                            continue L26;
                          }
                        }
                      }
                    }
                    this.field_x = (byte[][]) null;
                    break L27;
                  }
                  return true;
                }
              }
            }
          } else {
            return true;
          }
        }
    }

    wp(int param0) {
        this.field_C = param0;
    }

    final static void d(byte param0) {
        if (param0 != -13) {
            wp.d((byte) 11);
        }
    }

    public static void e(byte param0) {
        field_z = null;
        field_H = (int[][]) null;
        if (param0 >= -54) {
            field_B = (String) null;
            field_F = null;
            field_y = null;
            field_v = null;
            field_B = null;
            field_w = null;
            field_u = null;
            field_D = null;
            field_I = null;
            return;
        }
        field_F = null;
        field_y = null;
        field_v = null;
        field_B = null;
        field_w = null;
        field_u = null;
        field_D = null;
        field_I = null;
    }

    static {
        field_y = "Remove friend";
        field_I = "Full";
        field_E = 4;
        field_H = new int[][]{new int[]{0, 2, 1, 3, 5, 6, 7, 74, 4}, new int[]{10, 8, 9, 16, 12, 11, 15, 13, 14, 17, 18}, new int[]{19, 20, 21, 25, 23, 22, 26, 27, 24, 28, 29}, new int[]{31, 32, 33, 36, 30, 34, 38, 35, 37, 39, 40}, new int[]{42, 41, 47, 48, 46, 44, 43, 45, 49, 50, 51}, new int[]{52, 53, 54, 55, 57, 59, 61, 58, 60, 56, 62}, new int[]{64, 68, 70, 67, 66, 69, 65, 71, 72, 63, 73}};
        field_D = new int[]{2, 17, 18, 36, 37, 38, 6, 5, 13};
        field_z = null;
        field_u = "Match by...";
        field_B = "PER MONTH";
        field_F = "Portal";
    }
}
