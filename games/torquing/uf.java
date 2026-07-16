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
        int var3 = 0;
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
        int[] var20 = null;
        int[] var21 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          var17 = Torquing.field_u;
          var3 = ((uf) this).field_u[((uf) this).field_f];
          var4 = 0;
          var5 = this.a(0, var3, param1, 0);
          var6 = var5.length;
          if (!param0) {
            break L0;
          } else {
            ((uf) this).c(96);
            break L0;
          }
        }
        L1: {
          var7 = var6 * ((uf) this).field_s;
          if (var7 <= var4) {
            break L1;
          } else {
            var4 = var7;
            break L1;
          }
        }
        L2: {
          if (((uf) this).field_k < var3 + var4) {
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L2;
          } else {
            stackOut_5_0 = 1;
            stackIn_7_0 = stackOut_5_0;
            break L2;
          }
        }
        L3: {
          var8 = stackIn_7_0;
          if (var8 != 0) {
            ((uf) this).field_h[((uf) this).field_f] = param1;
            var9 = var5;
            var10 = 0;
            L4: while (true) {
              if (var9.length <= var10) {
                break L3;
              } else {
                L5: {
                  var11 = var9[var10];
                  var12 = (this.a(((uf) this).field_u[((uf) this).field_f], ((uf) this).field_b.field_x + 4) + -((uf) this).field_b.a(var11)) / 2;
                  ((uf) this).field_a[((uf) this).field_f] = new t(var12, 0);
                  if (((uf) this).field_h[((uf) this).field_f] == param1) {
                    break L5;
                  } else {
                    ((uf) this).field_h[((uf) this).field_f] = null;
                    break L5;
                  }
                }
                L6: {
                  int fieldTemp$1 = ((uf) this).field_f;
                  ((uf) this).field_f = ((uf) this).field_f + 1;
                  ((uf) this).field_i[fieldTemp$1] = new String[1];
                  if (((uf) this).field_u.length != ((uf) this).field_f) {
                    break L6;
                  } else {
                    var13 = new t[((uf) this).field_f + 4];
                    dk.a((Object[]) (Object) ((uf) this).field_a, 0, (Object[]) (Object) var13, 0, ((uf) this).field_f);
                    ((uf) this).field_a = var13;
                    var14 = new String[((uf) this).field_f + 4][];
                    dk.a((Object[]) (Object) ((uf) this).field_i, 0, (Object[]) (Object) var14, 0, ((uf) this).field_f);
                    ((uf) this).field_i = var14;
                    var15 = new String[((uf) this).field_f - -4];
                    dk.a((Object[]) (Object) ((uf) this).field_h, 0, (Object[]) (Object) var15, 0, ((uf) this).field_f);
                    ((uf) this).field_h = var15;
                    var21 = new int[((uf) this).field_f + 4];
                    var20 = var21;
                    var19 = var20;
                    var18 = var19;
                    var16 = var18;
                    dk.a(((uf) this).field_u, 0, var21, 0, ((uf) this).field_f);
                    ((uf) this).field_u = var16;
                    break L6;
                  }
                }
                ((uf) this).field_u[((uf) this).field_f] = ((uf) this).field_s + var3;
                var3 = ((uf) this).field_u[((uf) this).field_f];
                var10++;
                continue L4;
              }
            }
          } else {
            break L3;
          }
        }
        return var8 != 0;
    }

    final void c(int param0) {
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
        if (((uf) this).field_h != null) {
          var2 = ((uf) this).field_u[((uf) this).field_f];
          var3 = ((uf) this).field_k - var2;
          var4 = param0;
          var5 = 0;
          L0: while (true) {
            if (((uf) this).field_f <= var5) {
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
                        if (var8 >= ((uf) this).field_f) {
                          if (((uf) this).field_k >= var6) {
                            var8 = ((uf) this).field_f;
                            var19 = ((uf) this).field_a;
                            ((uf) this).field_f = 0;
                            ((uf) this).field_a = new t[var8];
                            var10 = ((uf) this).field_h;
                            ((uf) this).field_h = new String[var8];
                            ((uf) this).field_u = new int[var8];
                            ((uf) this).field_i = new String[var8][];
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
                                          boolean discarded$3 = ((uf) this).a(var20, var10[var11], param0 ^ 250);
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
                                        boolean discarded$4 = ((uf) this).a(false, var10[var11]);
                                        var11++;
                                        continue L5;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                  var17 = var20;
                                  boolean discarded$5 = ((uf) this).a(var17, var10[var11], 250);
                                  var11++;
                                  continue L5;
                                } else {
                                  var11++;
                                  continue L5;
                                }
                              }
                            }
                          } else {
                            var3 = -var6 + (((uf) this).field_k + var7);
                            var5++;
                            continue L3;
                          }
                        } else {
                          L8: {
                            var18 = ((uf) this).field_a[var8];
                            if (var18 == null) {
                              break L8;
                            } else {
                              if (0 != var18.field_t) {
                                break L8;
                              } else {
                                if (0 == ((uf) this).field_i[var8].length) {
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
                          if (null != ((uf) this).field_h[var8]) {
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
                              var16 = this.a(param0 + 0, var2, ((uf) this).field_h[var8], var11);
                              var12 = var16;
                              var13 = var16.length;
                              var14 = ((uf) this).field_s * var13;
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
              ((uf) this).d(111);
              return;
            } else {
              if (null != ((uf) this).field_a[var5]) {
                if (-1 == ((uf) this).field_a[var5].field_t) {
                  if (null != ((uf) this).field_h[var5]) {
                    if (-1 == ((uf) this).field_h[var5].length()) {
                      var4 = var4 + ((uf) this).field_a[var5].field_s;
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
        int var6_int = 0;
        int var9 = 0;
        int var10 = Torquing.field_u;
        int[] var11 = new int[16];
        int[] var5 = var11;
        for (var6_int = param0; var6_int < var11.length; var6_int++) {
            var11[var6_int] = -param3 + this.a(param1, ((uf) this).field_b.field_x - -4);
            param1 = param1 + ((uf) this).field_s;
        }
        String[] var6 = new String[16];
        int var7 = ((uf) this).field_b.a(param2, var11, var6);
        String[] var8 = new String[var7];
        for (var9 = 0; var9 < var7; var9++) {
            var8[var9] = var6[var9];
        }
        return var8;
    }

    final void a(byte param0, int param1) {
        boolean discarded$0 = ((uf) this).a(new t(param1, 0), "", 250);
        int var3 = 65 / ((37 - param0) / 44);
    }

    final static void b(int param0) {
        cb var1 = (cb) (Object) ae.field_nb.b(0);
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
          var3 = ((uf) this).field_m;
          if (((uf) this).field_e == null) {
            break L0;
          } else {
            var4 = ((uf) this).field_o + ((uf) this).field_e.field_a;
            var5 = ((uf) this).field_d + ((uf) this).field_e.field_g;
            var6 = ((uf) this).field_e.field_c;
            var7 = 0;
            L1: while (true) {
              if (var7 >= param1) {
                break L0;
              } else {
                if (param0 + var7 >= var5) {
                  if (param0 + var7 < var5 + ((uf) this).field_e.field_d) {
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
                        int incrementValue$1 = var10;
                        var10++;
                        if (((uf) this).field_e.field_l[incrementValue$1] != 0) {
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
        return ((uf) this).field_u[((uf) this).field_f];
    }

    final boolean a(t param0, String param1, int param2) {
        int var4 = 0;
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
        int[] var17 = null;
        int[] var18 = null;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var4 = ((uf) this).field_u[((uf) this).field_f];
          var5 = 0;
          if (param2 == 250) {
            break L0;
          } else {
            field_t = null;
            break L0;
          }
        }
        L1: {
          if (param0 == null) {
            break L1;
          } else {
            var5 = param0.field_u;
            break L1;
          }
        }
        L2: {
          var6 = 0;
          if (param0 != null) {
            var6 = param0.field_w;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          var7 = this.a(0, var4, param1, var6);
          var8 = var7.length;
          var9 = var8 * ((uf) this).field_s;
          if (var5 < var9) {
            var5 = var9;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (((uf) this).field_k < var5 + var4) {
            stackOut_12_0 = 0;
            stackIn_13_0 = stackOut_12_0;
            break L4;
          } else {
            stackOut_11_0 = 1;
            stackIn_13_0 = stackOut_11_0;
            break L4;
          }
        }
        L5: {
          var10 = stackIn_13_0;
          if (var10 != 0) {
            L6: {
              ((uf) this).field_a[((uf) this).field_f] = param0;
              ((uf) this).field_i[((uf) this).field_f] = var7;
              int fieldTemp$1 = ((uf) this).field_f;
              ((uf) this).field_f = ((uf) this).field_f + 1;
              ((uf) this).field_h[fieldTemp$1] = param1;
              if (((uf) this).field_f == ((uf) this).field_u.length) {
                var11 = new t[4 + ((uf) this).field_f];
                dk.a((Object[]) (Object) ((uf) this).field_a, 0, (Object[]) (Object) var11, 0, ((uf) this).field_f);
                ((uf) this).field_a = var11;
                var12 = new String[((uf) this).field_f - -4][];
                dk.a((Object[]) (Object) ((uf) this).field_i, 0, (Object[]) (Object) var12, 0, ((uf) this).field_f);
                ((uf) this).field_i = var12;
                var13 = new String[((uf) this).field_f + 4];
                dk.a((Object[]) (Object) ((uf) this).field_h, 0, (Object[]) (Object) var13, 0, ((uf) this).field_f);
                ((uf) this).field_h = var13;
                var18 = new int[((uf) this).field_f + 4];
                var17 = var18;
                var16 = var17;
                var15 = var16;
                var14 = var15;
                dk.a(((uf) this).field_u, 0, var18, 0, ((uf) this).field_f);
                ((uf) this).field_u = var14;
                break L6;
              } else {
                break L6;
              }
            }
            ((uf) this).field_u[((uf) this).field_f] = var5 + var4;
            break L5;
          } else {
            break L5;
          }
        }
        return var10 != 0;
    }

    final void a(int param0, int param1, int param2) {
        int var5 = -56 % ((param2 - 32) / 52);
        t var4 = new t(param0, 0);
        var4.field_u = param1;
        boolean discarded$0 = ((uf) this).a(var4, "", 250);
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
            if (((uf) this).field_m + param0 < ph.field_k) {
              break L0;
            } else {
              if (ph.field_h <= param2) {
                break L0;
              } else {
                if (ph.field_c > param2 - -((uf) this).field_k) {
                  break L0;
                } else {
                  if (param1 < -59) {
                    var4 = 0;
                    L1: while (true) {
                      if (var4 >= ((uf) this).field_f) {
                        return;
                      } else {
                        L2: {
                          var5 = ((uf) this).field_a[var4];
                          var6 = 0;
                          if (var5 != null) {
                            var5.d(param0, ((uf) this).field_u[var4] + param2);
                            var6 = var5.field_s;
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                        var7 = ((uf) this).field_u[var4] + (param2 + ((uf) this).field_b.field_x);
                        var8 = ((uf) this).field_i[var4];
                        var9 = 0;
                        L3: while (true) {
                          if (var9 >= var8.length) {
                            var4++;
                            continue L1;
                          } else {
                            ((uf) this).field_b.b(var8[var9], param0 + var6, var7, ((uf) this).field_j, -1);
                            var7 = var7 + ((uf) this).field_s;
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
        ((uf) this).field_u[((uf) this).field_f] = ((uf) this).field_k;
        ((uf) this).field_h = null;
        if (param0 < 27) {
            ((uf) this).b(-110, 27, 74);
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
        ((uf) this).field_b = param0;
        ((uf) this).field_k = param3;
        ((uf) this).field_a = new t[8];
        ((uf) this).field_j = param1;
        ((uf) this).field_e = param4;
        ((uf) this).field_d = param6;
        ((uf) this).field_s = param0.field_x + (param0.field_x >> 418080001);
        ((uf) this).field_h = new String[8];
        ((uf) this).field_i = new String[8][];
        ((uf) this).field_u = new int[8];
        ((uf) this).field_m = param2;
        ((uf) this).field_f = 0;
        ((uf) this).field_o = param5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 250;
        field_r = new int[8192];
        field_t = "Not yet achieved";
    }
}
