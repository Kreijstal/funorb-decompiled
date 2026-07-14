/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj {
    private kl field_a;
    static int[] field_j;
    private Object[] field_c;
    static int field_b;
    private tf field_l;
    static int[][][] field_g;
    private boolean field_i;
    static qe[] field_n;
    private int field_m;
    private Object[][] field_p;
    static String field_k;
    static int field_e;
    static cf field_r;
    static ka[] field_h;
    static String field_d;
    static ka[] field_o;
    static ka field_f;
    static boolean field_q;

    final synchronized int a(int param0, byte param1) {
        if (param1 != 12) {
            return -38;
        }
        if (!this.a((byte) 27, param0)) {
            return 0;
        }
        if (((lj) this).field_c[param0] != null) {
            return 100;
        }
        return ((lj) this).field_a.a(0, param0);
    }

    final boolean a(byte param0, String param1) {
        if (!((lj) this).b(-7957)) {
            return false;
        }
        if (param0 != -39) {
            return true;
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((lj) this).field_l.field_p.a((byte) 90, wh.a((byte) 68, var4));
        if (var3 < 0) {
            return false;
        }
        return true;
    }

    final synchronized byte[] c(int param0, int param1) {
        if (!((lj) this).b(-7957)) {
            return null;
        }
        if (!(1 != ((lj) this).field_l.field_g.length)) {
            return ((lj) this).c(0, param0, 0);
        }
        if (!this.a((byte) 27, param0)) {
            return null;
        }
        int var3 = 82 / ((param1 - 82) / 32);
        if (1 == ((lj) this).field_l.field_g[param0]) {
            return ((lj) this).c(param0, 0, 0);
        }
        throw new RuntimeException();
    }

    final synchronized int c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = TorChallenge.field_F ? 1 : 0;
        if (param0 > 31) {
          if (!((lj) this).b(-7957)) {
            return 0;
          } else {
            var2 = 0;
            var3 = 0;
            var4 = 0;
            L0: while (true) {
              if (((lj) this).field_c.length <= var4) {
                if (var2 != 0) {
                  var4 = 100 * var3 / var2;
                  return var4;
                } else {
                  return 100;
                }
              } else {
                if (-1 > (((lj) this).field_l.field_e[var4] ^ -1)) {
                  var3 = var3 + ((lj) this).a(var4, (byte) 12);
                  var2 += 100;
                  var4++;
                  continue L0;
                } else {
                  var4++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return -78;
        }
    }

    final synchronized boolean a(int param0, int param1, int param2) {
        if (!this.b(param2, param0, -122)) {
            return false;
        }
        if (null != ((lj) this).field_p[param2]) {
            if (((lj) this).field_p[param2][param0] != null) {
                return true;
            }
        }
        if (((lj) this).field_c[param2] != null) {
            return true;
        }
        int var4 = -107 % ((param1 - -23) / 56);
        this.b(param2, -124);
        if (((lj) this).field_c[param2] == null) {
            return false;
        }
        return true;
    }

    final boolean b(int param0, String param1) {
        if (!(((lj) this).b(-7957))) {
            return false;
        }
        param1 = param1.toLowerCase();
        if (param0 != 5) {
            Object var4 = null;
            boolean discarded$0 = ((lj) this).b(79, (String) null, (String) null);
        }
        CharSequence var5 = (CharSequence) (Object) param1;
        int var3 = ((lj) this).field_l.field_p.a((byte) 126, wh.a((byte) 68, var5));
        return ((lj) this).a(true, var3);
    }

    private final synchronized boolean a(byte param0, int param1) {
        if (!((lj) this).b(param0 + -7984)) {
          return false;
        } else {
          if (param0 == 27) {
            L0: {
              if (0 > param1) {
                break L0;
              } else {
                if (param1 >= ((lj) this).field_l.field_g.length) {
                  break L0;
                } else {
                  if (((lj) this).field_l.field_g[param1] != 0) {
                    return true;
                  } else {
                    break L0;
                  }
                }
              }
            }
            if (vh.field_a) {
              throw new IllegalArgumentException(Integer.toString(param1));
            } else {
              return false;
            }
          } else {
            return true;
          }
        }
    }

    final int a(String param0, int param1) {
        if (!(((lj) this).b(-7957))) {
            return -1;
        }
        int var3 = -64 % ((param1 - -10) / 36);
        param0 = param0.toLowerCase();
        CharSequence var5 = (CharSequence) (Object) param0;
        int var4 = ((lj) this).field_l.field_p.a((byte) 116, wh.a((byte) 68, var5));
        if (!(this.a((byte) 27, var4))) {
            return -1;
        }
        return var4;
    }

    final synchronized boolean a(boolean param0, int param1) {
        if (!param0) {
            return false;
        }
        if (!this.a((byte) 27, param1)) {
            return false;
        }
        if (null != ((lj) this).field_c[param1]) {
            return true;
        }
        this.b(param1, -108);
        if (((lj) this).field_c[param1] != null) {
            return true;
        }
        return false;
    }

    final static String a(byte param0) {
        if (!(mf.field_a != null)) {
            return "";
        }
        if (param0 > -70) {
            field_r = null;
        }
        return mf.field_a;
    }

    final synchronized byte[] a(int param0, String param1, String param2) {
        if (!((lj) this).b(param0 + -7955)) {
            return null;
        }
        if (param0 != -2) {
            return null;
        }
        param2 = param2.toLowerCase();
        param1 = param1.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param2;
        int var4 = ((lj) this).field_l.field_p.a((byte) -39, wh.a((byte) 68, var6));
        if (!this.a((byte) 27, var4)) {
            return null;
        }
        CharSequence var7 = (CharSequence) (Object) param1;
        int var5 = ((lj) this).field_l.field_s[var4].a((byte) 101, wh.a((byte) 68, var7));
        return ((lj) this).c(var4, var5, 0);
    }

    final synchronized boolean b(int param0) {
        if (param0 != -7957) {
            boolean discarded$0 = ((lj) this).a(((int[]) ((lj) this).field_c[1])[2], -17, ((int[]) ((lj) this).field_c[3])[1]);
        }
        if (null == ((lj) this).field_l) {
            ((lj) this).field_l = ((lj) this).field_a.b(0);
            if (((lj) this).field_l == null) {
                return false;
            }
            ((lj) this).field_p = new Object[((lj) this).field_l.field_r][];
            ((lj) this).field_c = new Object[((lj) this).field_l.field_r];
        }
        return true;
    }

    private final synchronized void b(int param0, int param1) {
        if (((lj) this).field_i) {
            ((lj) this).field_c[param0] = (Object) (Object) ((lj) this).field_a.a(param0, (byte) -72);
        } else {
            ((lj) this).field_c[param0] = ah.a(false, false, ((lj) this).field_a.a(param0, (byte) -72));
        }
        int var3 = -73 / ((-26 - param1) / 43);
    }

    final boolean b(int param0, String param1, String param2) {
        if (!(((lj) this).b(-7957))) {
            return false;
        }
        param1 = param1.toLowerCase();
        param2 = param2.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param1;
        int var4 = ((lj) this).field_l.field_p.a((byte) -57, wh.a((byte) 68, var6));
        if (!(this.a((byte) 27, var4))) {
            return false;
        }
        if (param0 >= -16) {
            int discarded$0 = ((lj) this).a(((int[]) ((lj) this).field_c[4])[6], ((int[]) ((lj) this).field_c[1])[0]);
        }
        CharSequence var7 = (CharSequence) (Object) param2;
        int var5 = ((lj) this).field_l.field_s[var4].a((byte) 87, wh.a((byte) 68, var7));
        return ((lj) this).a(var5, -109, var4);
    }

    final int a(int param0, String param1) {
        if (!((lj) this).b(-7957)) {
            return 0;
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((lj) this).field_l.field_p.a((byte) -120, wh.a((byte) 68, var4));
        if (param0 < 99) {
            lj.a(30);
        }
        return ((lj) this).a(var3, (byte) 12);
    }

    private final synchronized boolean a(int param0, byte param1, int[] param2, int param3) {
        int var5 = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        int var9_int = 0;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var14 = null;
        int var14_int = 0;
        int var15_int = 0;
        byte[][] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        byte[] var23 = null;
        int[] var24 = null;
        byte[] var25 = null;
        uf var26 = null;
        byte[] var27 = null;
        uf var29 = null;
        uf var31 = null;
        int[] var32 = null;
        byte[][] var33 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        int[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        int[] var46 = null;
        byte[][] var47 = null;
        int[] var48 = null;
        byte[] var49 = null;
        byte[] var50 = null;
        byte[] var51 = null;
        byte[] var52 = null;
        int[] var53 = null;
        byte[][] var54 = null;
        var22 = TorChallenge.field_F ? 1 : 0;
        if (this.a((byte) 27, param3)) {
          if (((lj) this).field_c[param3] == null) {
            return false;
          } else {
            L0: {
              var5 = ((lj) this).field_l.field_e[param3];
              var48 = ((lj) this).field_l.field_A[param3];
              var41 = var48;
              var34 = var41;
              var24 = var34;
              var6 = var24;
              if (((lj) this).field_p[param3] == null) {
                ((lj) this).field_p[param3] = new Object[((lj) this).field_l.field_g[param3]];
                break L0;
              } else {
                break L0;
              }
            }
            var7 = ((lj) this).field_p[param3];
            var8 = 1;
            var9_int = 0;
            L1: while (true) {
              L2: {
                if (var9_int >= var5) {
                  break L2;
                } else {
                  L3: {
                    if (var6 != null) {
                      var10 = var48[var9_int];
                      break L3;
                    } else {
                      var10 = var9_int;
                      break L3;
                    }
                  }
                  if (var7[var10] != null) {
                    var9_int++;
                    continue L1;
                  } else {
                    var8 = 0;
                    break L2;
                  }
                }
              }
              if (var8 == 0) {
                L4: {
                  L5: {
                    if (param2 == null) {
                      break L5;
                    } else {
                      L6: {
                        if (param2[0] != -1) {
                          break L6;
                        } else {
                          if (0 != param2[1]) {
                            break L6;
                          } else {
                            if (-1 != param2[2]) {
                              break L6;
                            } else {
                              if (-1 != (param2[3] ^ -1)) {
                                break L6;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      var49 = of.a((byte) 125, true, ((lj) this).field_c[param3]);
                      var42 = var49;
                      var35 = var42;
                      var25 = var35;
                      var9 = var25;
                      var26 = new uf(var49);
                      var26.a(false, param2, var26.field_m.length, 5);
                      break L4;
                    }
                  }
                  var9 = of.a((byte) -109, false, ((lj) this).field_c[param3]);
                  break L4;
                }
                L7: {
                  var50 = pg.a(param1 + -1048551, var9);
                  var43 = var50;
                  var36 = var43;
                  var27 = var36;
                  var23 = var27;
                  var51 = var23;
                  if (!((lj) this).field_i) {
                    break L7;
                  } else {
                    ((lj) this).field_c[param3] = null;
                    break L7;
                  }
                }
                L8: {
                  if ((var5 ^ -1) >= -2) {
                    L9: {
                      if (var6 != null) {
                        var11 = var48[0];
                        break L9;
                      } else {
                        var11 = 0;
                        break L9;
                      }
                    }
                    if (((lj) this).field_m != 0) {
                      var7[var11] = (Object) (Object) var51;
                      break L8;
                    } else {
                      var7[var11] = ah.a(false, false, var50);
                      break L8;
                    }
                  } else {
                    if (((lj) this).field_m != 2) {
                      var11 = var50.length;
                      var11--;
                      var12 = var23[var11] & 255;
                      var11 = var11 - 4 * (var12 * var5);
                      var31 = new uf(var51);
                      var53 = new int[var5];
                      var46 = var53;
                      var39 = var46;
                      var32 = var39;
                      var14 = var32;
                      var31.field_q = var11;
                      var15_int = 0;
                      L10: while (true) {
                        if (var12 <= var15_int) {
                          var54 = new byte[var5][];
                          var47 = var54;
                          var40 = var47;
                          var33 = var40;
                          var15 = var33;
                          var16 = 0;
                          L11: while (true) {
                            if (var16 >= var5) {
                              var31.field_q = var11;
                              var16 = 0;
                              var17 = 0;
                              L12: while (true) {
                                if (var17 >= var12) {
                                  var17 = 0;
                                  L13: while (true) {
                                    if (var5 <= var17) {
                                      break L8;
                                    } else {
                                      L14: {
                                        if (var6 == null) {
                                          var18 = var17;
                                          break L14;
                                        } else {
                                          var18 = var48[var17];
                                          break L14;
                                        }
                                      }
                                      if (-1 == (((lj) this).field_m ^ -1)) {
                                        var7[var18] = ah.a(false, false, var54[var17]);
                                        var17++;
                                        continue L13;
                                      } else {
                                        var7[var18] = (Object) (Object) var54[var17];
                                        var17++;
                                        continue L13;
                                      }
                                    }
                                  }
                                } else {
                                  var18 = 0;
                                  var19 = 0;
                                  L15: while (true) {
                                    if (var5 <= var19) {
                                      var17++;
                                      continue L12;
                                    } else {
                                      var18 = var18 + var31.i(42);
                                      he.a(var51, var16, var54[var19], var53[var19], var18);
                                      var16 = var16 + var18;
                                      var14[var19] = var14[var19] + var18;
                                      var19++;
                                      continue L15;
                                    }
                                  }
                                }
                              }
                            } else {
                              var15[var16] = new byte[var53[var16]];
                              var53[var16] = 0;
                              var16++;
                              continue L11;
                            }
                          }
                        } else {
                          var16 = 0;
                          var17 = 0;
                          L16: while (true) {
                            if (var5 <= var17) {
                              var15_int++;
                              continue L10;
                            } else {
                              var16 = var16 + var31.i(param1 + 69);
                              var14[var17] = var14[var17] + var16;
                              var17++;
                              continue L16;
                            }
                          }
                        }
                      }
                    } else {
                      var11 = var50.length;
                      var11--;
                      var12 = var23[var11] & 255;
                      var11 = var11 - 4 * (var12 * var5);
                      var29 = new uf(var51);
                      var14_int = 0;
                      var29.field_q = var11;
                      var15_int = 0;
                      var16 = 0;
                      L17: while (true) {
                        if (var16 >= var12) {
                          if (var14_int != 0) {
                            var52 = new byte[var14_int];
                            var14_int = 0;
                            var29.field_q = var11;
                            var17 = 0;
                            var18 = 0;
                            L18: while (true) {
                              if (var18 >= var12) {
                                var7[var15_int] = (Object) (Object) var52;
                                break L8;
                              } else {
                                var19 = 0;
                                var20 = 0;
                                L19: while (true) {
                                  if (var5 <= var20) {
                                    var18++;
                                    continue L18;
                                  } else {
                                    L20: {
                                      var19 = var19 + var29.i(28);
                                      if (var6 == null) {
                                        var21 = var20;
                                        break L20;
                                      } else {
                                        var21 = var48[var20];
                                        break L20;
                                      }
                                    }
                                    L21: {
                                      if (param0 != var21) {
                                        break L21;
                                      } else {
                                        he.a(var51, var17, var52, var14_int, var19);
                                        var14_int = var14_int + var19;
                                        break L21;
                                      }
                                    }
                                    var17 = var17 + var19;
                                    var20++;
                                    continue L19;
                                  }
                                }
                              }
                            }
                          } else {
                            return true;
                          }
                        } else {
                          var17 = 0;
                          var18 = 0;
                          L22: while (true) {
                            if (var5 <= var18) {
                              var16++;
                              continue L17;
                            } else {
                              L23: {
                                var17 = var17 + var29.i(param1 ^ -126);
                                if (var6 == null) {
                                  var19 = var18;
                                  break L23;
                                } else {
                                  var19 = var48[var18];
                                  break L23;
                                }
                              }
                              if (param0 == var19) {
                                var14_int = var14_int + var17;
                                var15_int = var19;
                                var18++;
                                continue L22;
                              } else {
                                var18++;
                                continue L22;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                if (param1 == -25) {
                  return true;
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          }
        } else {
          return false;
        }
    }

    final int c(byte param0) {
        if (!((lj) this).b(-7957)) {
            return -1;
        }
        if (param0 != 52) {
            return -128;
        }
        return ((lj) this).field_l.field_g.length;
    }

    final int a(int param0, int param1) {
        if (!this.a((byte) 27, param0)) {
            return 0;
        }
        if (param1 >= -69) {
            Object var4 = null;
            byte[] discarded$0 = this.a((int[]) null, -124, -72, 97);
        }
        return ((lj) this).field_l.field_g[param0];
    }

    final synchronized boolean b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = TorChallenge.field_F ? 1 : 0;
        if (!((lj) this).b(-7957)) {
          return false;
        } else {
          var2 = 1;
          var3 = 0;
          L0: while (true) {
            if (((lj) this).field_l.field_y.length <= var3) {
              L1: {
                if (param0 == 79) {
                  break L1;
                } else {
                  field_r = (cf) ((lj) this).field_c[0];
                  break L1;
                }
              }
              return var2 != 0;
            } else {
              var4 = ((lj) this).field_l.field_y[var3];
              if (((lj) this).field_c[var4] == null) {
                this.b(var4, -92);
                if (null == ((lj) this).field_c[var4]) {
                  var2 = 0;
                  var3++;
                  continue L0;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
        }
    }

    final int a(int param0, String param1, byte param2) {
        if (!(this.a((byte) 27, param0))) {
            return -1;
        }
        param1 = param1.toLowerCase();
        CharSequence var5 = (CharSequence) (Object) param1;
        int var4 = ((lj) this).field_l.field_s[param0].a((byte) 116, wh.a((byte) 68, var5));
        if (param2 < 81) {
            int discarded$0 = ((lj) this).c((byte) 106);
        }
        if (!(this.b(param0, var4, -100))) {
            return -1;
        }
        return var4;
    }

    private final synchronized byte[] a(int[] param0, int param1, int param2, int param3) {
        Object var5 = null;
        byte[] var5_array = null;
        byte[] var7 = null;
        if (this.b(param1, param3, -77)) {
          var5 = null;
          if (param2 <= -22) {
            L0: {
              L1: {
                if (((lj) this).field_p[param1] == null) {
                  break L1;
                } else {
                  if (((lj) this).field_p[param1][param3] != null) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              if (!this.a(param3, (byte) -25, param0, param1)) {
                this.b(param1, 121);
                if (this.a(param3, (byte) -25, param0, param1)) {
                  break L0;
                } else {
                  return null;
                }
              } else {
                break L0;
              }
            }
            if (((lj) this).field_p[param1] != null) {
              L2: {
                if (((lj) this).field_p[param1][param3] != null) {
                  var7 = of.a((byte) -115, false, ((lj) this).field_p[param1][param3]);
                  var5_array = var7;
                  if (var7 == null) {
                    throw new RuntimeException("");
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if (var5_array == null) {
                  break L3;
                } else {
                  if (((lj) this).field_m == 1) {
                    ((lj) this).field_p[param1][param3] = null;
                    if (-2 != (((lj) this).field_l.field_g[param1] ^ -1)) {
                      break L3;
                    } else {
                      ((lj) this).field_p[param1] = null;
                      break L3;
                    }
                  } else {
                    if (((lj) this).field_m != 2) {
                      break L3;
                    } else {
                      ((lj) this).field_p[param1] = null;
                      break L3;
                    }
                  }
                }
              }
              return var5_array;
            } else {
              throw new RuntimeException("");
            }
          } else {
            return (byte[]) ((lj) this).field_c[14];
          }
        } else {
          return null;
        }
    }

    private final synchronized boolean b(int param0, int param1, int param2) {
        if (!((lj) this).b(-7957)) {
          return false;
        } else {
          L0: {
            if (param2 < -68) {
              break L0;
            } else {
              boolean discarded$2 = this.a(((int[]) ((lj) this).field_c[4])[13], ((byte[]) ((Object[]) ((lj) this).field_c[2])[0])[10], (int[]) null, ((int[]) ((lj) this).field_c[4])[0]);
              break L0;
            }
          }
          L1: {
            if (param0 < 0) {
              break L1;
            } else {
              if (0 > param1) {
                break L1;
              } else {
                if (((lj) this).field_l.field_g.length <= param0) {
                  break L1;
                } else {
                  if (param1 < ((lj) this).field_l.field_g[param0]) {
                    return true;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          if (!vh.field_a) {
            return false;
          } else {
            throw new IllegalArgumentException(param0 + " " + param1);
          }
        }
    }

    final byte[] c(int param0, int param1, int param2) {
        if (param2 != 0) {
            boolean discarded$0 = this.a(((byte[]) ((Object[]) ((lj) this).field_c[4])[5])[2], -70);
        }
        return this.a((int[]) null, param0, -62, param1);
    }

    lj(kl param0, boolean param1, int param2) {
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        L0: {
          ((lj) this).field_l = null;
          if (0 > param2) {
            break L0;
          } else {
            if ((param2 ^ -1) >= -3) {
              L1: {
                stackOut_3_0 = this;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (!param1) {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L1;
                } else {
                  stackOut_4_0 = this;
                  stackOut_4_1 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  break L1;
                }
              }
              ((lj) this).field_i = stackIn_6_1 != 0;
              ((lj) this).field_m = param2;
              ((lj) this).field_a = param0;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("");
    }

    public static void a(int param0) {
        field_n = null;
        field_o = null;
        field_f = null;
        field_r = null;
        field_d = null;
        field_k = null;
        field_j = null;
        field_g = null;
        field_h = null;
        if (param0 != 11446) {
            field_g = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_n = null;
        field_k = "Press <img=2> to exit the tower.";
        field_r = new cf();
        field_d = "Quit";
        field_q = true;
    }
}
