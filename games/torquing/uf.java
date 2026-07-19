/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf {
    int field_o;
    int field_m;
    static int field_g;
    static String[] field_q;
    private int field_f;
    private int[] field_u;
    static int field_c;
    static int field_p;
    static la field_l;
    sm field_e;
    static String field_t;
    uc field_b;
    static int[] field_r;
    private t[] field_a;
    private String[] field_h;
    private String[][] field_i;
    int field_k;
    private int field_s;
    int field_d;
    static byte[] field_n;
    int field_j;

    final boolean a(boolean param0, String param1) {
        int fieldTemp$1 = 0;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        String[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String[] var9 = null;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        t[] var13 = null;
        String[][] var14 = null;
        String[] var15 = null;
        int[] var16 = null;
        int var17 = 0;
        int[] var18 = null;
        int[] var19 = null;
        int stackIn_8_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var17 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var3_int = this.field_u[this.field_f];
              var4 = 0;
              var5 = this.a(0, var3_int, param1, 0);
              var6 = var5.length;
              if (!param0) {
                break L1;
              } else {
                this.c(96);
                break L1;
              }
            }
            L2: {
              var7 = var6 * this.field_s;
              if (var7 <= var4) {
                break L2;
              } else {
                var4 = var7;
                break L2;
              }
            }
            L3: {
              if (this.field_k < var3_int + var4) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L3;
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L3;
              }
            }
            L4: {
              var8 = stackIn_8_0;
              if (var8 != 0) {
                this.field_h[this.field_f] = param1;
                var9 = var5;
                var10 = 0;
                L5: while (true) {
                  if (var9.length <= var10) {
                    break L4;
                  } else {
                    L6: {
                      var11 = var9[var10];
                      var12 = (this.a(this.field_u[this.field_f], this.field_b.field_x + 4) + -this.field_b.a(var11)) / 2;
                      this.field_a[this.field_f] = new t(var12, 0);
                      if (this.field_h[this.field_f] == param1) {
                        break L6;
                      } else {
                        this.field_h[this.field_f] = null;
                        break L6;
                      }
                    }
                    L7: {
                      fieldTemp$1 = this.field_f;
                      this.field_f = this.field_f + 1;
                      this.field_i[fieldTemp$1] = new String[]{var11};
                      if (this.field_u.length != this.field_f) {
                        break L7;
                      } else {
                        var13 = new t[this.field_f + 4];
                        dk.a(this.field_a, 0, var13, 0, this.field_f);
                        this.field_a = var13;
                        var14 = new String[this.field_f + 4][];
                        dk.a(this.field_i, 0, var14, 0, this.field_f);
                        this.field_i = var14;
                        var15 = new String[this.field_f - -4];
                        dk.a(this.field_h, 0, var15, 0, this.field_f);
                        this.field_h = var15;
                        var19 = new int[this.field_f + 4];
                        var18 = var19;
                        var16 = var18;
                        dk.a(this.field_u, 0, var19, 0, this.field_f);
                        this.field_u = var16;
                        break L7;
                      }
                    }
                    this.field_u[this.field_f] = this.field_s + var3_int;
                    var3_int = this.field_u[this.field_f];
                    var10++;
                    continue L5;
                  }
                }
              } else {
                break L4;
              }
            }
            stackOut_17_0 = var8;
            stackIn_18_0 = stackOut_17_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var3);
            stackOut_19_1 = new StringBuilder().append("uf.I(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        return stackIn_18_0 != 0;
    }

    final void c(int param0) {
        boolean discarded$3 = false;
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String[] var10 = null;
        int var10_int = 0;
        int var11 = 0;
        String[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String[] var16 = null;
        t var17 = null;
        t var18 = null;
        t[] var19 = null;
        t var20 = null;
        var15 = Torquing.field_u;
        if (this.field_h != null) {
          var2 = this.field_u[this.field_f];
          var3 = this.field_k - var2;
          var4 = param0;
          var5 = 0;
          L0: while (true) {
            if (this.field_f <= var5) {
              L1: {
                if (var4 == 0) {
                  var4 = 1;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if ((var3 ^ -1) <= -1) {
                  var5 = 0;
                  L3: while (true) {
                    if (var5 >= 3) {
                      break L2;
                    } else {
                      var6 = 0;
                      var7 = 0;
                      var8 = 0;
                      L4: while (true) {
                        if (var8 >= this.field_f) {
                          if (this.field_k >= var6) {
                            var8 = this.field_f;
                            var19 = this.field_a;
                            this.field_f = 0;
                            this.field_a = new t[var8];
                            var10 = this.field_h;
                            this.field_h = new String[var8];
                            this.field_u = new int[var8];
                            this.field_i = new String[var8][];
                            var11 = 0;
                            L5: while (true) {
                              if (var11 >= var8) {
                                break L2;
                              } else {
                                L6: {
                                  var17 = var19[var11];
                                  var20 = var17;
                                  if (var20 == null) {
                                    break L6;
                                  } else {
                                    if (var20.field_t != 0) {
                                      break L6;
                                    } else {
                                      if (var10[var11] == null) {
                                        break L6;
                                      } else {
                                        if (0 == var10[var11].length()) {
                                          var20.field_u = var20.field_u + var20.field_s * var3 / var4;
                                          var20.field_w = 0;
                                          discarded$3 = this.a(var20, var10[var11], param0 ^ 250);
                                          var11++;
                                          continue L5;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                  }
                                }
                                if (var10[var11] != null) {
                                  L7: {
                                    if (var20 == null) {
                                      break L7;
                                    } else {
                                      if (var20.field_u == 0) {
                                        discarded$4 = this.a(false, var10[var11]);
                                        var11++;
                                        continue L5;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                  var17 = var20;
                                  discarded$5 = this.a(var17, var10[var11], 250);
                                  var11++;
                                  continue L5;
                                } else {
                                  var11++;
                                  continue L5;
                                }
                              }
                            }
                          } else {
                            var3 = -var6 + (this.field_k + var7);
                            var5++;
                            continue L3;
                          }
                        } else {
                          L8: {
                            var18 = this.field_a[var8];
                            if (var18 == null) {
                              break L8;
                            } else {
                              if (0 != var18.field_t) {
                                break L8;
                              } else {
                                if (0 == this.field_i[var8].length) {
                                  var7 = var7 + var3 * var18.field_s / var4;
                                  var6 = var6 + (var18.field_s * var3 / var4 + var18.field_u);
                                  var8++;
                                  continue L4;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                          if (null != this.field_h[var8]) {
                            L9: {
                              var10_int = 0;
                              if (var18 != null) {
                                var10_int = var18.field_u;
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            L10: {
                              var11 = 0;
                              if (var18 != null) {
                                var11 = var18.field_s;
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            L11: {
                              var16 = this.a(param0 + 0, var2, this.field_h[var8], var11);
                              var12 = var16;
                              var13 = var16.length;
                              var14 = this.field_s * var13;
                              if (var10_int >= var14) {
                                break L11;
                              } else {
                                var10_int = var14;
                                break L11;
                              }
                            }
                            var6 = var6 + var10_int;
                            var8++;
                            continue L4;
                          } else {
                            var8++;
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              this.d(111);
              return;
            } else {
              if (null != this.field_a[var5]) {
                if (-1 == (this.field_a[var5].field_t ^ -1)) {
                  if (null != this.field_h[var5]) {
                    if (-1 == (this.field_h[var5].length() ^ -1)) {
                      var4 = var4 + this.field_a[var5].field_s;
                      var5++;
                      continue L0;
                    } else {
                      var5++;
                      continue L0;
                    }
                  } else {
                    var5++;
                    continue L0;
                  }
                } else {
                  var5++;
                  continue L0;
                }
              } else {
                var5++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    private final String[] a(int param0, int param1, String param2, int param3) {
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6_int = 0;
        String[] var6 = null;
        int var7 = 0;
        String[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        String[] stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var10 = Torquing.field_u;
        try {
          L0: {
            var11 = new int[16];
            var5 = var11;
            var6_int = param0;
            L1: while (true) {
              if (var6_int >= var11.length) {
                var6 = new String[16];
                var7 = this.field_b.a(param2, var11, var6);
                var8 = new String[var7];
                var9 = 0;
                L2: while (true) {
                  if (var9 >= var7) {
                    stackOut_7_0 = (String[]) (var8);
                    stackIn_8_0 = stackOut_7_0;
                    break L0;
                  } else {
                    var8[var9] = var6[var9];
                    var9++;
                    continue L2;
                  }
                }
              } else {
                var11[var6_int] = -param3 + this.a(param1, this.field_b.field_x - -4);
                param1 = param1 + this.field_s;
                var6_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var5_ref);
            stackOut_9_1 = new StringBuilder().append("uf.F(").append(param0).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param3 + ')');
        }
        return stackIn_8_0;
    }

    final void a(byte param0, int param1) {
        boolean discarded$0 = this.a(new t(param1, 0), "", 250);
        int var3 = 65 / ((37 - param0) / 44);
    }

    final static void b(int param0) {
        cb var1 = (cb) ((Object) ae.field_nb.b(0));
        if (var1 == null) {
            ih.b(true);
            return;
        }
        df var2 = kj.field_d;
        if (param0 >= -104) {
            uf.a(45);
        }
        var1.field_j = new int[]{var2.c((byte) -71), var2.c((byte) -36), var2.c((byte) -100), var2.c((byte) -75)};
        var1.f(0);
    }

    private final int a(int param0, int param1) {
        int incrementValue$1 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var3 = this.field_m;
          if (this.field_e == null) {
            break L0;
          } else {
            var4 = this.field_o + this.field_e.field_a;
            var5 = this.field_d + this.field_e.field_g;
            var6 = this.field_e.field_c;
            var7 = 0;
            L1: while (true) {
              if (var7 >= param1) {
                break L0;
              } else {
                if (param0 + var7 >= var5) {
                  if (param0 + var7 < var5 + this.field_e.field_d) {
                    L2: {
                      var8 = -var4;
                      if (var8 >= 0) {
                        break L2;
                      } else {
                        var8 = 0;
                        break L2;
                      }
                    }
                    L3: {
                      var9 = var3 - var4;
                      if (var9 <= var6) {
                        break L3;
                      } else {
                        var9 = var6;
                        break L3;
                      }
                    }
                    var10 = var8 + var6 * (param0 + var7 - var5);
                    var11 = var8;
                    L4: while (true) {
                      if (var11 < var9) {
                        incrementValue$1 = var10;
                        var10++;
                        if (this.field_e.field_l[incrementValue$1] != 0) {
                          var3 = var4 + var11;
                          var7++;
                          continue L1;
                        } else {
                          var11++;
                          continue L4;
                        }
                      } else {
                        var7++;
                        continue L1;
                      }
                    }
                  } else {
                    var7++;
                    continue L1;
                  }
                } else {
                  var7++;
                  continue L1;
                }
              }
            }
          }
        }
        return var3 - 4;
    }

    final int a(boolean param0) {
        if (param0) {
            field_g = -107;
        }
        return this.field_u[this.field_f];
    }

    final boolean a(t param0, String param1, int param2) {
        int fieldTemp$1 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        t[] var11 = null;
        String[][] var12 = null;
        String[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int stackIn_13_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            L1: {
              var4_int = this.field_u[this.field_f];
              var5 = 0;
              if (param2 == 250) {
                break L1;
              } else {
                field_t = (String) null;
                break L1;
              }
            }
            L2: {
              if (param0 == null) {
                break L2;
              } else {
                var5 = param0.field_u;
                break L2;
              }
            }
            L3: {
              var6 = 0;
              if (param0 != null) {
                var6 = param0.field_w;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var7 = this.a(0, var4_int, param1, var6);
              var8 = var7.length;
              var9 = var8 * this.field_s;
              if (var5 < var9) {
                var5 = var9;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (this.field_k < var5 + var4_int) {
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                break L5;
              } else {
                stackOut_11_0 = 1;
                stackIn_13_0 = stackOut_11_0;
                break L5;
              }
            }
            L6: {
              var10 = stackIn_13_0;
              if (var10 != 0) {
                L7: {
                  this.field_a[this.field_f] = param0;
                  this.field_i[this.field_f] = var7;
                  fieldTemp$1 = this.field_f;
                  this.field_f = this.field_f + 1;
                  this.field_h[fieldTemp$1] = param1;
                  if (this.field_f == this.field_u.length) {
                    var11 = new t[4 + this.field_f];
                    dk.a(this.field_a, 0, var11, 0, this.field_f);
                    this.field_a = var11;
                    var12 = new String[this.field_f - -4][];
                    dk.a(this.field_i, 0, var12, 0, this.field_f);
                    this.field_i = var12;
                    var13 = new String[this.field_f + 4];
                    dk.a(this.field_h, 0, var13, 0, this.field_f);
                    this.field_h = var13;
                    var16 = new int[this.field_f + 4];
                    var15 = var16;
                    var14 = var15;
                    dk.a(this.field_u, 0, var16, 0, this.field_f);
                    this.field_u = var14;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                this.field_u[this.field_f] = var5 + var4_int;
                break L6;
              } else {
                break L6;
              }
            }
            stackOut_19_0 = var10;
            stackIn_20_0 = stackOut_19_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var4);
            stackOut_21_1 = new StringBuilder().append("uf.J(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          L9: {
            stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param2 + ')');
        }
        return stackIn_20_0 != 0;
    }

    final void a(int param0, int param1, int param2) {
        int var5 = -56 % ((param2 - 32) / 52);
        t var4 = new t(param0, 0);
        var4.field_u = param1;
        boolean discarded$0 = this.a(var4, "", 250);
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 0;
        t var5 = null;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = Torquing.field_u;
          if (ph.field_a <= param0) {
            break L0;
          } else {
            if (this.field_m + param0 < ph.field_k) {
              break L0;
            } else {
              if (ph.field_h <= param2) {
                break L0;
              } else {
                if (ph.field_c > param2 - -this.field_k) {
                  break L0;
                } else {
                  if (param1 < -59) {
                    var4 = 0;
                    L1: while (true) {
                      if (var4 >= this.field_f) {
                        return;
                      } else {
                        L2: {
                          var5 = this.field_a[var4];
                          var6 = 0;
                          if (var5 != null) {
                            var5.d(param0, this.field_u[var4] + param2);
                            var6 = var5.field_s;
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                        var7 = this.field_u[var4] + (param2 + this.field_b.field_x);
                        var8 = this.field_i[var4];
                        var9 = 0;
                        L3: while (true) {
                          if (var9 >= var8.length) {
                            var4++;
                            continue L1;
                          } else {
                            this.field_b.b(var8[var9], param0 + var6, var7, this.field_j, -1);
                            var7 = var7 + this.field_s;
                            var9++;
                            continue L3;
                          }
                        }
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
            }
          }
        }
    }

    final void d(int param0) {
        this.field_u[this.field_f] = this.field_k;
        this.field_h = null;
        if (param0 < 27) {
            this.b(-110, 27, 74);
        }
    }

    public static void a(int param0) {
        field_t = null;
        if (param0 != 3) {
            return;
        }
        field_r = null;
        field_n = null;
        field_l = null;
        field_q = null;
    }

    uf(uc param0, int param1, int param2, int param3, sm param4, int param5, int param6) {
        try {
            this.field_b = param0;
            this.field_k = param3;
            this.field_a = new t[8];
            this.field_j = param1;
            this.field_e = param4;
            this.field_d = param6;
            this.field_s = param0.field_x + (param0.field_x >> 418080001);
            this.field_h = new String[8];
            this.field_i = new String[8][];
            this.field_u = new int[8];
            this.field_m = param2;
            this.field_f = 0;
            this.field_o = param5;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "uf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_g = 250;
        field_r = new int[8192];
        field_t = "Not yet achieved";
    }
}
