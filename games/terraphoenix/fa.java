/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa {
    static ci field_d;
    private Object[][] field_g;
    private boolean field_j;
    private int field_h;
    static int field_a;
    static String field_e;
    private uj field_b;
    static pk field_i;
    private Object[] field_k;
    static String field_c;
    private km field_f;

    final boolean a(int param0, String param1) {
        if (!(((fa) this).a(param0 ^ param0))) {
            return false;
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((fa) this).field_f.field_g.b(1, lb.a(var4, -2964));
        return ((fa) this).e(var3, 4);
    }

    final synchronized byte[] a(String param0, String param1, int param2) {
        if (!((fa) this).a(param2 ^ param2)) {
            return null;
        }
        param0 = param0.toLowerCase();
        param1 = param1.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param0;
        int var4 = ((fa) this).field_f.field_g.b(1, lb.a(var6, -2964));
        if (!this.d(var4, 121)) {
            return null;
        }
        CharSequence var7 = (CharSequence) (Object) param1;
        int var5 = ((fa) this).field_f.field_f[var4].b(1, lb.a(var7, -2964));
        return ((fa) this).b(var4, param2 + 21565, var5);
    }

    private final synchronized void a(int param0, int param1) {
        if (!((fa) this).field_j) {
            ((fa) this).field_k[param0] = pl.a(((fa) this).field_b.a(param0, param1 + -3979), false, false);
        } else {
            ((fa) this).field_k[param0] = (Object) (Object) ((fa) this).field_b.a(param0, -126);
        }
        if (param1 != 3864) {
            ((fa) this).field_g = null;
        }
    }

    final int c(int param0) {
        if (!(((fa) this).a(0))) {
            return -1;
        }
        if (param0 != -1) {
            int discarded$0 = ((fa) this).c(((int[]) ((Object[]) ((fa) this).field_k[1])[0])[2]);
        }
        return ((fa) this).field_f.field_k.length;
    }

    final synchronized byte[] b(int param0, int param1) {
        if (!((fa) this).a(param1)) {
            return null;
        }
        if (!((((fa) this).field_f.field_k.length ^ -1) != -2)) {
            return ((fa) this).b(0, param1 + -117, param0);
        }
        if (!this.d(param0, param1 + -11)) {
            return null;
        }
        if (!(-2 != (((fa) this).field_f.field_k[param0] ^ -1))) {
            return ((fa) this).b(param0, param1 + 124, 0);
        }
        throw new RuntimeException();
    }

    final int b(int param0, String param1) {
        if (!((fa) this).a(0)) {
            return 0;
        }
        param1 = param1.toLowerCase();
        CharSequence var5 = (CharSequence) (Object) param1;
        int var3 = ((fa) this).field_f.field_g.b(1, lb.a(var5, -2964));
        int var4 = 88 % ((44 - param0) / 46);
        return ((fa) this).a((byte) -91, var3);
    }

    final byte[] b(int param0, int param1, int param2) {
        int var4 = 5 / ((param1 - 84) / 32);
        return this.a((int[]) null, (byte) 110, param2, param0);
    }

    final synchronized boolean a(int param0) {
        if (param0 != 0) {
            ((boolean[]) ((Object[]) ((fa) this).field_k[8])[13])[0] = true;
        }
        if (null == ((fa) this).field_f) {
            ((fa) this).field_f = ((fa) this).field_b.a((byte) 68);
            if (!(((fa) this).field_f != null)) {
                return false;
            }
            ((fa) this).field_g = new Object[((fa) this).field_f.field_j][];
            ((fa) this).field_k = new Object[((fa) this).field_f.field_j];
        }
        return true;
    }

    private final synchronized boolean a(int param0, boolean param1, int[] param2, int param3) {
        int var5 = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        int var9_int = 0;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int[] var14_ref_int__ = null;
        int var15 = 0;
        byte[][] var15_ref_byte____ = null;
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
        dh var26 = null;
        byte[] var27 = null;
        dh var29 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        dh var32 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var38 = null;
        byte[][] var39 = null;
        int[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        int[] var45 = null;
        byte[][] var46 = null;
        int[] var48 = null;
        byte[] var49 = null;
        byte[] var50 = null;
        byte[] var51 = null;
        int[] var52 = null;
        byte[][] var53 = null;
        byte[] var54 = null;
        var22 = Terraphoenix.field_V;
        if (!this.d(param3, -45)) {
          return false;
        } else {
          if (null == ((fa) this).field_k[param3]) {
            return false;
          } else {
            L0: {
              var5 = ((fa) this).field_f.field_d[param3];
              var48 = ((fa) this).field_f.field_r[param3];
              var41 = var48;
              var34 = var41;
              var24 = var34;
              var6 = var24;
              if (!param1) {
                break L0;
              } else {
                ((fa) this).field_g = null;
                break L0;
              }
            }
            L1: {
              if (null != ((fa) this).field_g[param3]) {
                break L1;
              } else {
                ((fa) this).field_g[param3] = new Object[((fa) this).field_f.field_k[param3]];
                break L1;
              }
            }
            var7 = ((fa) this).field_g[param3];
            var8 = 1;
            var9_int = 0;
            L2: while (true) {
              L3: {
                if (var9_int >= var5) {
                  break L3;
                } else {
                  L4: {
                    if (var6 != null) {
                      var10 = var48[var9_int];
                      break L4;
                    } else {
                      var10 = var9_int;
                      break L4;
                    }
                  }
                  if (null == var7[var10]) {
                    var8 = 0;
                    break L3;
                  } else {
                    var9_int++;
                    continue L2;
                  }
                }
              }
              if (var8 != 0) {
                return true;
              } else {
                L5: {
                  L6: {
                    if (param2 == null) {
                      break L6;
                    } else {
                      L7: {
                        if (param2[0] != 0) {
                          break L7;
                        } else {
                          if (param2[1] != 0) {
                            break L7;
                          } else {
                            if (-1 != param2[2]) {
                              break L7;
                            } else {
                              if (-1 != param2[3]) {
                                break L7;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                      }
                      var49 = ei.a(((fa) this).field_k[param3], true, false);
                      var42 = var49;
                      var35 = var42;
                      var25 = var35;
                      var9 = var25;
                      var26 = new dh(var49);
                      var26.a(-14328, param2, 5, var26.field_i.length);
                      break L5;
                    }
                  }
                  var9 = ei.a(((fa) this).field_k[param3], false, false);
                  break L5;
                }
                L8: {
                  var50 = qg.a(-1, var9);
                  var43 = var50;
                  var36 = var43;
                  var27 = var36;
                  var23 = var27;
                  var51 = var23;
                  if (!((fa) this).field_j) {
                    break L8;
                  } else {
                    ((fa) this).field_k[param3] = null;
                    break L8;
                  }
                }
                L9: {
                  if (var5 > 1) {
                    var50 = var43;
                    if (-3 == (((fa) this).field_h ^ -1)) {
                      var50 = var43;
                      var11 = var50.length;
                      var11--;
                      var12 = var23[var11] & 255;
                      var11 = var11 - 4 * var12 * var5;
                      var32 = new dh(var51);
                      var14 = 0;
                      var15 = 0;
                      var32.field_k = var11;
                      var16 = 0;
                      L10: while (true) {
                        if (var12 <= var16) {
                          if (-1 != (var14 ^ -1)) {
                            var54 = new byte[var14];
                            var32.field_k = var11;
                            var14 = 0;
                            var17 = 0;
                            var18 = 0;
                            L11: while (true) {
                              if (var12 <= var18) {
                                var7[var15] = (Object) (Object) var54;
                                break L9;
                              } else {
                                var19 = 0;
                                var20 = 0;
                                L12: while (true) {
                                  if (var5 <= var20) {
                                    var18++;
                                    continue L11;
                                  } else {
                                    L13: {
                                      var19 = var19 + var32.f((byte) -107);
                                      if (var6 == null) {
                                        var21 = var20;
                                        break L13;
                                      } else {
                                        var21 = var48[var20];
                                        break L13;
                                      }
                                    }
                                    L14: {
                                      if (var21 != param0) {
                                        break L14;
                                      } else {
                                        ka.a(var51, var17, var54, var14, var19);
                                        var14 = var14 + var19;
                                        break L14;
                                      }
                                    }
                                    var17 = var17 + var19;
                                    var20++;
                                    continue L12;
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
                          L15: while (true) {
                            if (var18 >= var5) {
                              var16++;
                              continue L10;
                            } else {
                              L16: {
                                var17 = var17 + var32.f((byte) -107);
                                if (var6 == null) {
                                  var19 = var18;
                                  break L16;
                                } else {
                                  var19 = var48[var18];
                                  break L16;
                                }
                              }
                              if (param0 == var19) {
                                var15 = var19;
                                var14 = var14 + var17;
                                var18++;
                                continue L15;
                              } else {
                                var18++;
                                continue L15;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var11 = var50.length;
                      var11--;
                      var12 = var23[var11] & 255;
                      var11 = var11 - 4 * var12 * var5;
                      var29 = new dh(var51);
                      var52 = new int[var5];
                      var45 = var52;
                      var38 = var45;
                      var30 = var38;
                      var14_ref_int__ = var30;
                      var29.field_k = var11;
                      var15 = 0;
                      L17: while (true) {
                        if (var15 >= var12) {
                          var53 = new byte[var5][];
                          var46 = var53;
                          var39 = var46;
                          var31 = var39;
                          var15_ref_byte____ = var31;
                          var16 = 0;
                          L18: while (true) {
                            if (var5 <= var16) {
                              var29.field_k = var11;
                              var16 = 0;
                              var17 = 0;
                              L19: while (true) {
                                if (var12 <= var17) {
                                  var17 = 0;
                                  L20: while (true) {
                                    if (var5 <= var17) {
                                      break L9;
                                    } else {
                                      L21: {
                                        if (var6 != null) {
                                          var18 = var48[var17];
                                          break L21;
                                        } else {
                                          var18 = var17;
                                          break L21;
                                        }
                                      }
                                      if (0 != ((fa) this).field_h) {
                                        var7[var18] = (Object) (Object) var53[var17];
                                        var17++;
                                        continue L20;
                                      } else {
                                        var7[var18] = pl.a(var53[var17], false, param1);
                                        var17++;
                                        continue L20;
                                      }
                                    }
                                  }
                                } else {
                                  var18 = 0;
                                  var19 = 0;
                                  L22: while (true) {
                                    if (var5 <= var19) {
                                      var17++;
                                      continue L19;
                                    } else {
                                      var18 = var18 + var29.f((byte) -107);
                                      ka.a(var51, var16, var53[var19], var52[var19], var18);
                                      var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                                      var16 = var16 + var18;
                                      var19++;
                                      continue L22;
                                    }
                                  }
                                }
                              }
                            } else {
                              var15_ref_byte____[var16] = new byte[var52[var16]];
                              var52[var16] = 0;
                              var16++;
                              continue L18;
                            }
                          }
                        } else {
                          var16 = 0;
                          var17 = 0;
                          L23: while (true) {
                            if (var5 <= var17) {
                              var15++;
                              continue L17;
                            } else {
                              var16 = var16 + var29.f((byte) -107);
                              var14_ref_int__[var17] = var14_ref_int__[var17] + var16;
                              var17++;
                              continue L23;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    L24: {
                      if (var6 == null) {
                        var11 = 0;
                        break L24;
                      } else {
                        var11 = var48[0];
                        break L24;
                      }
                    }
                    if (((fa) this).field_h != 0) {
                      var7[var11] = (Object) (Object) var51;
                      break L9;
                    } else {
                      var7[var11] = pl.a(var50, false, false);
                      return true;
                    }
                  }
                }
                return true;
              }
            }
          }
        }
    }

    final boolean d(int param0, String param1) {
        if (!((fa) this).a(0)) {
            return false;
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((fa) this).field_f.field_g.b(1, lb.a(var4, param0 + -2963));
        if (param0 < (var3 ^ -1)) {
            return false;
        }
        return true;
    }

    public static void b(int param0) {
        field_d = null;
        field_e = null;
        field_c = null;
        if (param0 < 34) {
            fa.b(29);
        }
        field_i = null;
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        L0: {
          if (param0 == -12432) {
            break L0;
          } else {
            ((long[]) ((fa) this).field_k[0])[0] = 43L;
            break L0;
          }
        }
        if (!((fa) this).a(0)) {
          return false;
        } else {
          L1: {
            if ((param2 ^ -1) > -1) {
              break L1;
            } else {
              if (0 > param1) {
                break L1;
              } else {
                if (((fa) this).field_f.field_k.length <= param2) {
                  break L1;
                } else {
                  if (((fa) this).field_f.field_k[param2] > param1) {
                    return true;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          if (!rd.field_o) {
            return false;
          } else {
            throw new IllegalArgumentException(param2 + " " + param1);
          }
        }
    }

    final synchronized boolean a(boolean param0, int param1, int param2) {
        if (!(this.a(-12432, param1, param2))) {
            return false;
        }
        if (((fa) this).field_g[param2] != null) {
            if (!(((fa) this).field_g[param2][param1] == null)) {
                return true;
            }
        }
        if (param0) {
            boolean discarded$0 = ((fa) this).a(((int[]) ((fa) this).field_k[1])[0]);
        }
        if (!(((fa) this).field_k[param2] == null)) {
            return true;
        }
        this.a(param2, 3864);
        if (((fa) this).field_k[param2] != null) {
            return true;
        }
        return false;
    }

    private final synchronized boolean d(int param0, int param1) {
        int var3 = 0;
        if (!((fa) this).a(0)) {
          return false;
        } else {
          L0: {
            if (0 > param0) {
              break L0;
            } else {
              if (((fa) this).field_f.field_k.length <= param0) {
                break L0;
              } else {
                if (-1 != (((fa) this).field_f.field_k[param0] ^ -1)) {
                  var3 = -115 / ((53 - param1) / 32);
                  return true;
                } else {
                  break L0;
                }
              }
            }
          }
          if (!rd.field_o) {
            return false;
          } else {
            throw new IllegalArgumentException(Integer.toString(param0));
          }
        }
    }

    final boolean a(String param0, byte param1, String param2) {
        if (!(((fa) this).a(0))) {
            return false;
        }
        param2 = param2.toLowerCase();
        param0 = param0.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param2;
        int var4 = ((fa) this).field_f.field_g.b(1, lb.a(var6, param1 ^ -3068));
        if (!this.d(var4, -50)) {
            return false;
        }
        if (param1 != 104) {
            ((boolean[]) ((fa) this).field_k[0])[5] = false;
        }
        CharSequence var7 = (CharSequence) (Object) param0;
        int var5 = ((fa) this).field_f.field_f[var4].b(param1 ^ 105, lb.a(var7, -2964));
        return ((fa) this).a(false, var5, var4);
    }

    final synchronized int a(byte param0, int param1) {
        if (!(this.d(param1, 106))) {
            return 0;
        }
        int var3 = 71 % ((param0 - 17) / 61);
        if (!(null == ((fa) this).field_k[param1])) {
            return 100;
        }
        return ((fa) this).field_b.b(0, param1);
    }

    private final synchronized byte[] a(int[] param0, byte param1, int param2, int param3) {
        Object var5 = null;
        byte[] var5_array = null;
        byte[] var7 = null;
        if (this.a(-12432, param2, param3)) {
          L0: {
            L1: {
              var5 = null;
              if (null == ((fa) this).field_g[param3]) {
                break L1;
              } else {
                if (null != ((fa) this).field_g[param3][param2]) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (this.a(param2, false, param0, param3)) {
              break L0;
            } else {
              this.a(param3, 3864);
              if (this.a(param2, false, param0, param3)) {
                break L0;
              } else {
                return null;
              }
            }
          }
          if (null == ((fa) this).field_g[param3]) {
            throw new RuntimeException("");
          } else {
            L2: {
              if (((fa) this).field_g[param3][param2] == null) {
                break L2;
              } else {
                var7 = ei.a(((fa) this).field_g[param3][param2], false, false);
                var5_array = var7;
                if (var7 == null) {
                  throw new RuntimeException("");
                } else {
                  break L2;
                }
              }
            }
            if (param1 >= 75) {
              L3: {
                if (var5_array != null) {
                  if (((fa) this).field_h == 1) {
                    ((fa) this).field_g[param3][param2] = null;
                    if (((fa) this).field_f.field_k[param3] == 1) {
                      ((fa) this).field_g[param3] = null;
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    if (((fa) this).field_h != 2) {
                      break L3;
                    } else {
                      ((fa) this).field_g[param3] = null;
                      break L3;
                    }
                  }
                } else {
                  break L3;
                }
              }
              return var5_array;
            } else {
              return (byte[]) ((fa) this).field_k[10];
            }
          }
        } else {
          return null;
        }
    }

    final int c(int param0, int param1) {
        if (!this.d(param1, 101)) {
            return 0;
        }
        if (param0 != -540) {
            return -24;
        }
        return ((fa) this).field_f.field_k[param1];
    }

    final int c(int param0, String param1) {
        if (!((fa) this).a(param0 + 1)) {
            return -1;
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((fa) this).field_f.field_g.b(1, lb.a(var4, -2964));
        if (!this.d(var3, param0 ^ 101)) {
            return -1;
        }
        if (param0 != -1) {
            boolean discarded$0 = this.a(127, 122, 13);
        }
        return var3;
    }

    final int a(int param0, int param1, String param2) {
        if (!this.d(param1, -71)) {
            return -1;
        }
        param2 = param2.toLowerCase();
        CharSequence var5 = (CharSequence) (Object) param2;
        int var4 = ((fa) this).field_f.field_f[param1].b(1, lb.a(var5, -2964));
        if (!this.a(-12432, var4, param1)) {
            return -1;
        }
        if (param0 >= -75) {
            ((long[]) ((fa) this).field_k[0])[4] = -101L;
        }
        return var4;
    }

    final synchronized int a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Terraphoenix.field_V;
        if (!((fa) this).a(0)) {
          return 0;
        } else {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (var4 >= ((fa) this).field_k.length) {
              L1: {
                if (param0 == 127) {
                  break L1;
                } else {
                  int discarded$1 = ((fa) this).a((byte) -72);
                  break L1;
                }
              }
              if (var2 != 0) {
                var4 = 100 * var3 / var2;
                return var4;
              } else {
                return 100;
              }
            } else {
              if (-1 > (((fa) this).field_f.field_d[var4] ^ -1)) {
                var3 = var3 + ((fa) this).a((byte) -91, var4);
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
    }

    final synchronized boolean b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Terraphoenix.field_V;
        if (!((fa) this).a(0)) {
          return false;
        } else {
          L0: {
            var2 = 1;
            var3 = 0;
            if (param0 < -127) {
              break L0;
            } else {
              ((fa) this).field_g = null;
              break L0;
            }
          }
          L1: while (true) {
            if (((fa) this).field_f.field_b.length <= var3) {
              return var2 != 0;
            } else {
              var4 = ((fa) this).field_f.field_b[var3];
              if (null == ((fa) this).field_k[var4]) {
                this.a(var4, 3864);
                if (null == ((fa) this).field_k[var4]) {
                  var2 = 0;
                  var3++;
                  continue L1;
                } else {
                  var3++;
                  continue L1;
                }
              } else {
                var3++;
                continue L1;
              }
            }
          }
        }
    }

    final synchronized boolean e(int param0, int param1) {
        if (!(this.d(param0, 110))) {
            return false;
        }
        if (!(((fa) this).field_k[param0] == null)) {
            return true;
        }
        this.a(param0, 3864);
        if (null != ((fa) this).field_k[param0]) {
            return true;
        }
        if (param1 != 4) {
            Object var4 = null;
            boolean discarded$0 = ((fa) this).d(-3, (String) null);
            return false;
        }
        return false;
    }

    final static ci[] f(int param0, int param1) {
        ci[] var3 = new ci[9];
        ci[] var2 = var3;
        var3[param1] = nb.a(64, param0, 119);
        return var2;
    }

    fa(uj param0, boolean param1, int param2) {
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
          ((fa) this).field_f = null;
          if (-1 < (param2 ^ -1)) {
            break L0;
          } else {
            if (2 >= param2) {
              L1: {
                ((fa) this).field_b = param0;
                ((fa) this).field_h = param2;
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
              ((fa) this).field_j = stackIn_6_1 != 0;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("");
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_c = "Squiddy with shielded armour";
        field_e = "Select 'ready' mode";
    }
}
