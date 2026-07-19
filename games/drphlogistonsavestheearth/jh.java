/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh {
    int field_e;
    private int[] field_a;
    private int[] field_d;
    private float[][] field_c;
    private int field_b;
    private int[] field_f;

    private final void b() {
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
        int[] var17 = null;
        var17 = new int[this.field_b];
        var14 = new int[33];
        var12 = var14;
        var2_ref_int__ = var12;
        var3 = 0;
        L0: while (true) {
          if (var3 >= this.field_b) {
            this.field_a = new int[8];
            var2 = 0;
            var3 = 0;
            L1: while (true) {
              if (var3 >= this.field_b) {
                return;
              } else {
                var4 = this.field_f[var3];
                if (var4 != 0) {
                  var5 = var17[var3];
                  var6 = 0;
                  var7 = 0;
                  L2: while (true) {
                    if (var7 >= var4) {
                      this.field_a[var6] = var3 ^ -1;
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
                            if (this.field_a[var6] != 0) {
                              break L4;
                            } else {
                              this.field_a[var6] = var2;
                              break L4;
                            }
                          }
                          var6 = this.field_a[var6];
                          break L3;
                        }
                      }
                      L5: {
                        if (var6 < this.field_a.length) {
                          break L5;
                        } else {
                          var9 = new int[this.field_a.length * 2];
                          var11 = 0;
                          var10 = var11;
                          L6: while (true) {
                            if (var11 >= this.field_a.length) {
                              this.field_a = var9;
                              break L5;
                            } else {
                              var9[var11] = this.field_a[var11];
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
            var4 = this.field_f[var3];
            if (var4 != 0) {
              L7: {
                var5 = 1 << 32 - var4;
                var6 = var14[var4];
                var17[var3] = var6;
                if ((var6 & var5) == 0) {
                  var7 = var6 | var5;
                  var8 = var4 - 1;
                  L8: while (true) {
                    if (var8 < 1) {
                      break L7;
                    } else {
                      var9_int = var14[var8];
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
              var14[var4] = var7;
              var8 = var4 + 1;
              L9: while (true) {
                if (var8 <= 32) {
                  var9_int = var14[var8];
                  if (var9_int == var6) {
                    var14[var8] = var7;
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

    final int c() {
        int var1 = 0;
        while (this.field_a[var1] >= 0) {
            var1 = tk.a() != 0 ? this.field_a[var1] : var1 + 1;
        }
        return this.field_a[var1] ^ -1;
    }

    final float[] a() {
        return this.field_c[this.c()];
    }

    private final static int a(int param0, int param1) {
        int var2 = 0;
        for (var2 = (int)Math.pow((double)param0, 1.0 / (double)param1) + 1; t.a(param1, (byte) -103, var2) > param0; var2--) {
        }
        return var2;
    }

    jh() {
        int discarded$2 = 0;
        int incrementValue$3 = 0;
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
          discarded$2 = tk.d(24);
          this.field_e = tk.d(16);
          this.field_b = tk.d(24);
          this.field_f = new int[this.field_b];
          if (tk.a() == 0) {
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
              if (tk.a() == 0) {
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
              if (var14 >= this.field_b) {
                break L1;
              } else {
                L4: {
                  if (var2 == 0) {
                    break L4;
                  } else {
                    if (tk.a() != 0) {
                      break L4;
                    } else {
                      this.field_f[var14] = 0;
                      var14++;
                      continue L3;
                    }
                  }
                }
                this.field_f[var14] = tk.d(5) + 1;
                var14++;
                continue L3;
              }
            }
          } else {
            var2 = 0;
            var3_int = tk.d(5) + 1;
            L5: while (true) {
              if (var2 >= this.field_b) {
                break L1;
              } else {
                var4_int = tk.d(oi.a(this.field_b - var2, (byte) 1));
                var5 = 0;
                L6: while (true) {
                  if (var5 >= var4_int) {
                    var3_int++;
                    continue L5;
                  } else {
                    incrementValue$3 = var2;
                    var2++;
                    this.field_f[incrementValue$3] = var3_int;
                    var5++;
                    continue L6;
                  }
                }
              }
            }
          }
        }
        L7: {
          this.b();
          var2 = tk.d(4);
          if (var2 <= 0) {
            break L7;
          } else {
            L8: {
              var3 = tk.e(tk.d(32));
              var4 = tk.e(tk.d(32));
              var5 = tk.d(4) + 1;
              if (tk.a() == 0) {
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
                var7 = this.field_b * this.field_e;
                break L9;
              } else {
                var7 = jh.a(this.field_b, this.field_e);
                break L9;
              }
            }
            this.field_d = new int[var7];
            var8 = 0;
            L10: while (true) {
              if (var8 >= var7) {
                this.field_c = new float[this.field_b][this.field_e];
                if (var2 != 1) {
                  var8 = 0;
                  L11: while (true) {
                    if (var8 >= this.field_b) {
                      break L7;
                    } else {
                      var9 = 0.0f;
                      var10 = var8 * this.field_e;
                      var11 = 0;
                      L12: while (true) {
                        if (var11 >= this.field_e) {
                          var8++;
                          continue L11;
                        } else {
                          var12 = (float)this.field_d[var10] * var4 + var3 + var9;
                          this.field_c[var8][var11] = var12;
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
                    if (var8 >= this.field_b) {
                      break L7;
                    } else {
                      var9 = 0.0f;
                      var10 = 1;
                      var11 = 0;
                      L14: while (true) {
                        if (var11 >= this.field_e) {
                          var8++;
                          continue L13;
                        } else {
                          L15: {
                            var12_int = var8 / var10 % var7;
                            var13 = (float)this.field_d[var12_int] * var4 + var3 + var9;
                            this.field_c[var8][var11] = var13;
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
                this.field_d[var8] = tk.d(var5);
                var8++;
                continue L10;
              }
            }
          }
        }
    }
}
