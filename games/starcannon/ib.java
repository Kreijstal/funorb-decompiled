/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib {
    private int[] field_b;
    private int[] field_e;
    private int field_f;
    private float[][] field_a;
    int field_d;
    private int[] field_c;

    final float[] c() {
        return ((ib) this).field_a[((ib) this).b()];
    }

    private final void a() {
        int[] var2_ref_int__ = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var14 = null;
        int[] var16 = null;
        int[] var18 = null;
        int[] var19 = null;
        var19 = new int[((ib) this).field_f];
        var18 = new int[33];
        var16 = var18;
        var14 = var16;
        var12 = var14;
        var2_ref_int__ = var12;
        var3 = 0;
        L0: while (true) {
          if (var3 >= ((ib) this).field_f) {
            ((ib) this).field_b = new int[8];
            var2 = 0;
            var3 = 0;
            L1: while (true) {
              if (var3 >= ((ib) this).field_f) {
                return;
              } else {
                var4 = ((ib) this).field_c[var3];
                if (var4 != 0) {
                  var5 = var19[var3];
                  var6 = 0;
                  var7 = 0;
                  L2: while (true) {
                    if (var7 >= var4) {
                      ((ib) this).field_b[var6] = ~var3;
                      if (var6 >= var2) {
                        var2 = var6 + 1;
                        var3++;
                        continue L1;
                      } else {
                        var3++;
                        continue L1;
                      }
                    } else {
                      L3: {
                        var8 = -2147483648 >>> var7;
                        if ((var5 & var8) == 0) {
                          var6++;
                          break L3;
                        } else {
                          L4: {
                            if (((ib) this).field_b[var6] != 0) {
                              break L4;
                            } else {
                              ((ib) this).field_b[var6] = var2;
                              break L4;
                            }
                          }
                          var6 = ((ib) this).field_b[var6];
                          break L3;
                        }
                      }
                      L5: {
                        if (var6 < ((ib) this).field_b.length) {
                          break L5;
                        } else {
                          var9 = new int[((ib) this).field_b.length * 2];
                          var11 = 0;
                          var10 = var11;
                          L6: while (true) {
                            if (var11 >= ((ib) this).field_b.length) {
                              ((ib) this).field_b = var9;
                              break L5;
                            } else {
                              var9[var11] = ((ib) this).field_b[var11];
                              var11++;
                              continue L6;
                            }
                          }
                        }
                      }
                      var8 = var8 >>> 1;
                      var7++;
                      continue L2;
                    }
                  }
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
          } else {
            var4 = ((ib) this).field_c[var3];
            if (var4 != 0) {
              L7: {
                var5 = 1 << 32 - var4;
                var6 = var18[var4];
                var19[var3] = var6;
                if ((var6 & var5) == 0) {
                  var7 = var6 | var5;
                  var8 = var4 - 1;
                  L8: while (true) {
                    if (var8 < 1) {
                      break L7;
                    } else {
                      var9_int = var18[var8];
                      if (var9_int != var6) {
                        break L7;
                      } else {
                        var10 = 1 << 32 - var8;
                        if ((var9_int & var10) == 0) {
                          var2_ref_int__[var8] = var9_int | var10;
                          var8--;
                          continue L8;
                        } else {
                          var2_ref_int__[var8] = var2_ref_int__[var8 - 1];
                          break L7;
                        }
                      }
                    }
                  }
                } else {
                  var7 = var2_ref_int__[var4 - 1];
                  break L7;
                }
              }
              var18[var4] = var7;
              var8 = var4 + 1;
              L9: while (true) {
                if (var8 <= 32) {
                  var9_int = var18[var8];
                  if (var9_int == var6) {
                    var18[var8] = var7;
                    var8++;
                    continue L9;
                  } else {
                    var8++;
                    continue L9;
                  }
                } else {
                  var3++;
                  continue L0;
                }
              }
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    final int b() {
        int var1 = 0;
        while (((ib) this).field_b[var1] >= 0) {
            var1 = nj.b() != 0 ? ((ib) this).field_b[var1] : var1 + 1;
        }
        return ~((ib) this).field_b[var1];
    }

    private final static int a(int param0, int param1) {
        int var2 = 0;
        for (var2 = (int)Math.pow((double)param0, 1.0 / (double)param1) + 1; te.a(param1, var2, 1) > param0; var2--) {
        }
        return var2;
    }

    ib() {
        int var1 = 0;
        int var2 = 0;
        int var3_int = 0;
        float var3 = 0.0f;
        int var4_int = 0;
        float var4 = 0.0f;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        float var9 = 0.0f;
        int var10 = 0;
        int var11 = 0;
        float var12 = 0.0f;
        int var12_int = 0;
        float var13 = 0.0f;
        int var14 = 0;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_23_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        L0: {
          int discarded$2 = nj.a(24);
          ((ib) this).field_d = nj.a(16);
          ((ib) this).field_f = nj.a(24);
          ((ib) this).field_c = new int[((ib) this).field_f];
          if (nj.b() == 0) {
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
          var1 = stackIn_3_0;
          if (var1 == 0) {
            L2: {
              if (nj.b() == 0) {
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                break L2;
              } else {
                stackOut_11_0 = 1;
                stackIn_13_0 = stackOut_11_0;
                break L2;
              }
            }
            var2 = stackIn_13_0;
            var14 = 0;
            var3_int = var14;
            L3: while (true) {
              if (var14 >= ((ib) this).field_f) {
                break L1;
              } else {
                L4: {
                  if (var2 == 0) {
                    break L4;
                  } else {
                    if (nj.b() != 0) {
                      break L4;
                    } else {
                      ((ib) this).field_c[var14] = 0;
                      var14++;
                      continue L3;
                    }
                  }
                }
                ((ib) this).field_c[var14] = nj.a(5) + 1;
                var14++;
                continue L3;
              }
            }
          } else {
            var2 = 0;
            var3_int = nj.a(5) + 1;
            L5: while (true) {
              if (var2 >= ((ib) this).field_f) {
                break L1;
              } else {
                var4_int = nj.a(td.a(((ib) this).field_f - var2, (byte) 110));
                var5 = 0;
                L6: while (true) {
                  if (var5 >= var4_int) {
                    var3_int++;
                    continue L5;
                  } else {
                    int incrementValue$3 = var2;
                    var2++;
                    ((ib) this).field_c[incrementValue$3] = var3_int;
                    var5++;
                    continue L6;
                  }
                }
              }
            }
          }
        }
        L7: {
          this.a();
          var2 = nj.a(4);
          if (var2 <= 0) {
            break L7;
          } else {
            L8: {
              var3 = nj.d(nj.a(32));
              var4 = nj.d(nj.a(32));
              var5 = nj.a(4) + 1;
              if (nj.b() == 0) {
                stackOut_22_0 = 0;
                stackIn_23_0 = stackOut_22_0;
                break L8;
              } else {
                stackOut_21_0 = 1;
                stackIn_23_0 = stackOut_21_0;
                break L8;
              }
            }
            L9: {
              var6 = stackIn_23_0;
              if (var2 != 1) {
                var7 = ((ib) this).field_f * ((ib) this).field_d;
                break L9;
              } else {
                var7 = ib.a(((ib) this).field_f, ((ib) this).field_d);
                break L9;
              }
            }
            ((ib) this).field_e = new int[var7];
            var8 = 0;
            L10: while (true) {
              if (var8 >= var7) {
                ((ib) this).field_a = new float[((ib) this).field_f][((ib) this).field_d];
                if (var2 != 1) {
                  var8 = 0;
                  L11: while (true) {
                    if (var8 >= ((ib) this).field_f) {
                      break L7;
                    } else {
                      var9 = 0.0f;
                      var10 = var8 * ((ib) this).field_d;
                      var11 = 0;
                      L12: while (true) {
                        if (var11 >= ((ib) this).field_d) {
                          var8++;
                          continue L11;
                        } else {
                          var12 = (float)((ib) this).field_e[var10] * var4 + var3 + var9;
                          ((ib) this).field_a[var8][var11] = var12;
                          if (var6 != 0) {
                            var9 = var12;
                            var10++;
                            var11++;
                            continue L12;
                          } else {
                            var10++;
                            var11++;
                            continue L12;
                          }
                        }
                      }
                    }
                  }
                } else {
                  var8 = 0;
                  L13: while (true) {
                    if (var8 >= ((ib) this).field_f) {
                      break L7;
                    } else {
                      var9 = 0.0f;
                      var10 = 1;
                      var11 = 0;
                      L14: while (true) {
                        if (var11 >= ((ib) this).field_d) {
                          var8++;
                          continue L13;
                        } else {
                          L15: {
                            var12_int = var8 / var10 % var7;
                            var13 = (float)((ib) this).field_e[var12_int] * var4 + var3 + var9;
                            ((ib) this).field_a[var8][var11] = var13;
                            if (var6 == 0) {
                              break L15;
                            } else {
                              var9 = var13;
                              break L15;
                            }
                          }
                          var10 = var10 * var7;
                          var11++;
                          continue L14;
                        }
                      }
                    }
                  }
                }
              } else {
                ((ib) this).field_e[var8] = nj.a(var5);
                var8++;
                continue L10;
              }
            }
          }
        }
    }
}
