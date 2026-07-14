/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci {
    private ih field_c;
    static boolean[] field_g;
    private Object[][] field_d;
    static da field_f;
    private int field_e;
    private boolean field_a;
    private el field_b;
    private Object[] field_h;

    final int a(int param0, byte param1) {
        if (!this.b(14555, param0)) {
            return 0;
        }
        if (param1 < 71) {
            return 34;
        }
        return ((ci) this).field_b.field_i[param0];
    }

    private final synchronized void a(int param0, int param1) {
        if (((ci) this).field_a) {
            ((ci) this).field_h[param0] = (Object) (Object) ((ci) this).field_c.a(param0, 119);
        } else {
            ((ci) this).field_h[param0] = lf.a((byte) -43, false, ((ci) this).field_c.a(param0, 57));
        }
        int var3 = 62 / ((-6 - param1) / 62);
    }

    final synchronized int b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        var5 = Transmogrify.field_A ? 1 : 0;
        if (!((ci) this).a((byte) -123)) {
          return 0;
        } else {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (((ci) this).field_h.length <= var4) {
              L1: {
                if (param0 == -22884) {
                  break L1;
                } else {
                  var6 = null;
                  boolean discarded$1 = ((ci) this).a(((byte[]) ((Object[]) ((ci) this).field_h[1])[1])[1], (String) null);
                  break L1;
                }
              }
              if (var2 == 0) {
                return 100;
              } else {
                var4 = var3 * 100 / var2;
                return var4;
              }
            } else {
              if (-1 > (((ci) this).field_b.field_s[var4] ^ -1)) {
                var3 = var3 + ((ci) this).a(true, var4);
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

    final synchronized boolean a(byte param0) {
        if (param0 > -112) {
            int discarded$0 = ((ci) this).a(5, (String) ((ci) this).field_h[3]);
        }
        if (null != ((ci) this).field_b) {
            return true;
        }
        ((ci) this).field_b = ((ci) this).field_c.a(-110);
        if (((ci) this).field_b == null) {
            return false;
        }
        ((ci) this).field_d = new Object[((ci) this).field_b.field_l][];
        ((ci) this).field_h = new Object[((ci) this).field_b.field_l];
        return true;
    }

    final synchronized byte[] b(byte param0, int param1) {
        if (!((ci) this).a((byte) -118)) {
            return null;
        }
        if (!(1 != ((ci) this).field_b.field_i.length)) {
            return ((ci) this).a((byte) -93, param1, 0);
        }
        if (!this.b(14555, param1)) {
            return null;
        }
        if (!(((ci) this).field_b.field_i[param1] != 1)) {
            return ((ci) this).a((byte) -93, 0, param1);
        }
        int var3 = 42 % ((param0 - -22) / 63);
        throw new RuntimeException();
    }

    final synchronized byte[] a(String param0, byte param1, String param2) {
        if (!((ci) this).a((byte) -128)) {
            return null;
        }
        param2 = param2.toLowerCase();
        param0 = param0.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param2;
        int var4 = ((ci) this).field_b.field_h.a(gb.a(-14741, var6), false);
        if (!this.b(14555, var4)) {
            return null;
        }
        if (param1 <= 66) {
            field_f = (da) ((ci) this).field_h[3];
        }
        CharSequence var7 = (CharSequence) (Object) param0;
        int var5 = ((ci) this).field_b.field_t[var4].a(gb.a(-14741, var7), false);
        return ((ci) this).a((byte) -93, var5, var4);
    }

    final synchronized boolean c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Transmogrify.field_A ? 1 : 0;
        if (((ci) this).a((byte) -117)) {
          var2 = 1;
          if (param0 == 32031) {
            var3 = 0;
            L0: while (true) {
              if (((ci) this).field_b.field_c.length <= var3) {
                return var2 != 0;
              } else {
                var4 = ((ci) this).field_b.field_c[var3];
                if (((ci) this).field_h[var4] == null) {
                  this.a(var4, param0 + -31917);
                  if (null == ((ci) this).field_h[var4]) {
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
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final int a(int param0, String param1, int param2) {
        if (!this.b(param0 + 14556, param2)) {
            return -1;
        }
        param1 = param1.toLowerCase();
        CharSequence var5 = (CharSequence) (Object) param1;
        int var4 = ((ci) this).field_b.field_t[param2].a(gb.a(-14741, var5), false);
        if (param0 != -1) {
            return -93;
        }
        if (!(this.a(var4, (byte) 87, param2))) {
            return -1;
        }
        return var4;
    }

    final synchronized int a(boolean param0, int param1) {
        if (!param0) {
            int[] discarded$0 = ((ci) this).a(((boolean[]) ((ci) this).field_h[0])[12]);
        }
        if (!this.b(14555, param1)) {
            return 0;
        }
        if (!(((ci) this).field_h[param1] == null)) {
            return 100;
        }
        return ((ci) this).field_c.b(-42, param1);
    }

    final static boolean a(char param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = Transmogrify.field_A ? 1 : 0;
        if (!(!Character.isISOControl(param0))) {
            return false;
        }
        if (qk.a(param0, (byte) -110)) {
            return true;
        }
        char[] var6 = h.field_l;
        char[] var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
            var4 = var6[var3];
            if (!(param0 != var4)) {
                return true;
            }
        }
        char[] var7 = hf.field_k;
        var2 = var7;
        int var8 = param1;
        var3 = var8;
        while (var8 < var7.length) {
            var4 = var7[var8];
            if (param0 == var4) {
                return true;
            }
            var8++;
        }
        return false;
    }

    private final synchronized boolean b(int param0, int param1) {
        if (((ci) this).a((byte) -123)) {
          L0: {
            if (0 > param1) {
              break L0;
            } else {
              if (((ci) this).field_b.field_i.length <= param1) {
                break L0;
              } else {
                if (-1 != (((ci) this).field_b.field_i[param1] ^ -1)) {
                  if (param0 == 14555) {
                    return true;
                  } else {
                    ((ci) this).field_a = false;
                    return true;
                  }
                } else {
                  break L0;
                }
              }
            }
          }
          if (uk.field_gb) {
            throw new IllegalArgumentException(Integer.toString(param1));
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    private final synchronized boolean a(int param0, int[] param1, int param2, int param3) {
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
        oa var26 = null;
        byte[] var27 = null;
        oa var29 = null;
        oa var31 = null;
        int[] var32 = null;
        byte[][] var33 = null;
        int[] var34 = null;
        byte[] var36 = null;
        byte[] var37 = null;
        int[] var40 = null;
        byte[][] var41 = null;
        int[] var42 = null;
        byte[] var44 = null;
        byte[] var45 = null;
        int[] var48 = null;
        byte[][] var49 = null;
        int[] var50 = null;
        byte[] var51 = null;
        byte[] var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        int[] var56 = null;
        byte[][] var57 = null;
        var22 = Transmogrify.field_A ? 1 : 0;
        if (!this.b(14555, param2)) {
          return false;
        } else {
          if (null == ((ci) this).field_h[param2]) {
            return false;
          } else {
            L0: {
              var5 = ((ci) this).field_b.field_s[param2];
              var50 = ((ci) this).field_b.field_f[param2];
              var42 = var50;
              var34 = var42;
              var24 = var34;
              var6 = var24;
              if (((ci) this).field_d[param2] != null) {
                break L0;
              } else {
                ((ci) this).field_d[param2] = new Object[((ci) this).field_b.field_i[param2]];
                break L0;
              }
            }
            var7 = ((ci) this).field_d[param2];
            var8 = 1;
            var9_int = param3;
            L1: while (true) {
              L2: {
                if (var9_int >= var5) {
                  break L2;
                } else {
                  L3: {
                    if (var6 != null) {
                      var10 = var50[var9_int];
                      break L3;
                    } else {
                      var10 = var9_int;
                      break L3;
                    }
                  }
                  if (var7[var10] == null) {
                    var8 = 0;
                    break L2;
                  } else {
                    var9_int++;
                    continue L1;
                  }
                }
              }
              if (var8 == 0) {
                L4: {
                  L5: {
                    if (param1 == null) {
                      break L5;
                    } else {
                      L6: {
                        if (param1[0] != 0) {
                          break L6;
                        } else {
                          if (param1[1] != 0) {
                            break L6;
                          } else {
                            if (param1[2] != 0) {
                              break L6;
                            } else {
                              if (param1[3] == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                      }
                      var51 = cf.a(((ci) this).field_h[param2], true, (byte) 16);
                      var26 = new oa(var51);
                      var26.a(param1, false, 5, var26.field_g.length);
                      var52 = var51;
                      break L4;
                    }
                  }
                  var52 = cf.a(((ci) this).field_h[param2], false, (byte) 16);
                  var44 = var52;
                  var36 = var44;
                  var9 = var36;
                  break L4;
                }
                L7: {
                  var53 = lk.a(70, var52);
                  var45 = var53;
                  var37 = var45;
                  var27 = var37;
                  var23 = var27;
                  var54 = var23;
                  if (((ci) this).field_a) {
                    ((ci) this).field_h[param2] = null;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (var5 > 1) {
                    var53 = var45;
                    if (2 != ((ci) this).field_e) {
                      var11 = var53.length;
                      var11--;
                      var12 = 255 & var23[var11];
                      var11 = var11 - 4 * (var12 * var5);
                      var31 = new oa(var54);
                      var31.field_h = var11;
                      var56 = new int[var5];
                      var48 = var56;
                      var40 = var48;
                      var32 = var40;
                      var14 = var32;
                      var15_int = 0;
                      L9: while (true) {
                        if (var15_int >= var12) {
                          var57 = new byte[var5][];
                          var49 = var57;
                          var41 = var49;
                          var33 = var41;
                          var15 = var33;
                          var16 = 0;
                          L10: while (true) {
                            if (var16 >= var5) {
                              var31.field_h = var11;
                              var16 = 0;
                              var17 = 0;
                              L11: while (true) {
                                if (var17 >= var12) {
                                  var17 = 0;
                                  L12: while (true) {
                                    if (var17 >= var5) {
                                      break L8;
                                    } else {
                                      L13: {
                                        if (var6 != null) {
                                          var18 = var50[var17];
                                          break L13;
                                        } else {
                                          var18 = var17;
                                          break L13;
                                        }
                                      }
                                      if (0 != ((ci) this).field_e) {
                                        var7[var18] = (Object) (Object) var57[var17];
                                        var17++;
                                        continue L12;
                                      } else {
                                        var7[var18] = lf.a((byte) -43, false, var57[var17]);
                                        var17++;
                                        continue L12;
                                      }
                                    }
                                  }
                                } else {
                                  var18 = 0;
                                  var19 = 0;
                                  L14: while (true) {
                                    if (var19 >= var5) {
                                      var17++;
                                      continue L11;
                                    } else {
                                      var18 = var18 + var31.c((byte) -119);
                                      ji.a(var54, var16, var57[var19], var56[var19], var18);
                                      var16 = var16 + var18;
                                      var14[var19] = var14[var19] + var18;
                                      var19++;
                                      continue L14;
                                    }
                                  }
                                }
                              }
                            } else {
                              var15[var16] = new byte[var56[var16]];
                              var56[var16] = 0;
                              var16++;
                              continue L10;
                            }
                          }
                        } else {
                          var16 = 0;
                          var17 = 0;
                          L15: while (true) {
                            if (var5 <= var17) {
                              var15_int++;
                              continue L9;
                            } else {
                              var16 = var16 + var31.c((byte) -106);
                              var14[var17] = var14[var17] + var16;
                              var17++;
                              continue L15;
                            }
                          }
                        }
                      }
                    } else {
                      var11 = var53.length;
                      var11--;
                      var12 = 255 & var23[var11];
                      var11 = var11 - 4 * var12 * var5;
                      var29 = new oa(var54);
                      var14_int = 0;
                      var15_int = 0;
                      var29.field_h = var11;
                      var16 = 0;
                      L16: while (true) {
                        if (var12 <= var16) {
                          if (var14_int != 0) {
                            var55 = new byte[var14_int];
                            var14_int = 0;
                            var29.field_h = var11;
                            var17 = 0;
                            var18 = 0;
                            L17: while (true) {
                              if (var12 <= var18) {
                                var7[var15_int] = (Object) (Object) var55;
                                break L8;
                              } else {
                                var19 = 0;
                                var20 = 0;
                                L18: while (true) {
                                  if (var5 <= var20) {
                                    var18++;
                                    continue L17;
                                  } else {
                                    L19: {
                                      var19 = var19 + var29.c((byte) -110);
                                      if (var6 != null) {
                                        var21 = var50[var20];
                                        break L19;
                                      } else {
                                        var21 = var20;
                                        break L19;
                                      }
                                    }
                                    L20: {
                                      if (param0 != var21) {
                                        break L20;
                                      } else {
                                        ji.a(var54, var17, var55, var14_int, var19);
                                        var14_int = var14_int + var19;
                                        break L20;
                                      }
                                    }
                                    var17 = var17 + var19;
                                    var20++;
                                    continue L18;
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
                          L21: while (true) {
                            if (var18 >= var5) {
                              var16++;
                              continue L16;
                            } else {
                              L22: {
                                var17 = var17 + var29.c((byte) -107);
                                if (var6 != null) {
                                  var19 = var50[var18];
                                  break L22;
                                } else {
                                  var19 = var18;
                                  break L22;
                                }
                              }
                              if (var19 == param0) {
                                var15_int = var19;
                                var14_int = var14_int + var17;
                                var18++;
                                continue L21;
                              } else {
                                var18++;
                                continue L21;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    L23: {
                      if (var6 != null) {
                        var53 = var45;
                        var11 = var50[0];
                        break L23;
                      } else {
                        var11 = 0;
                        break L23;
                      }
                    }
                    var53 = var45;
                    if (-1 == (((ci) this).field_e ^ -1)) {
                      var7[var11] = lf.a((byte) -43, false, var54);
                      break L8;
                    } else {
                      var7[var11] = (Object) (Object) var53;
                      return true;
                    }
                  }
                }
                return true;
              } else {
                return true;
              }
            }
          }
        }
    }

    private final synchronized boolean a(int param0, byte param1, int param2) {
        Object var5 = null;
        if (!((ci) this).a((byte) -118)) {
          return false;
        } else {
          L0: {
            if (param1 > 72) {
              break L0;
            } else {
              var5 = null;
              boolean discarded$2 = ((ci) this).a((byte) -97, (String) ((ci) this).field_h[2], (String) null);
              break L0;
            }
          }
          L1: {
            if (param2 < 0) {
              break L1;
            } else {
              if (0 > param0) {
                break L1;
              } else {
                if (((ci) this).field_b.field_i.length <= param2) {
                  break L1;
                } else {
                  if (((ci) this).field_b.field_i[param2] > param0) {
                    return true;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          if (!uk.field_gb) {
            return false;
          } else {
            throw new IllegalArgumentException(param2 + " " + param0);
          }
        }
    }

    final byte[] a(byte param0, int param1, int param2) {
        if (param0 != -93) {
            return null;
        }
        return this.a(param1, param2, (int[]) null, param0 ^ 20);
    }

    final boolean a(byte param0, String param1) {
        int var3 = 88 / ((62 - param0) / 48);
        if (!(((ci) this).a((byte) -117))) {
            return false;
        }
        param1 = param1.toLowerCase();
        CharSequence var5 = (CharSequence) (Object) param1;
        int var4 = ((ci) this).field_b.field_h.a(gb.a(-14741, var5), false);
        return ((ci) this).a((byte) 107, var4);
    }

    private final synchronized byte[] a(int param0, int param1, int[] param2, int param3) {
        Object var5 = null;
        byte[] var5_array = null;
        byte[] var7 = null;
        if (param3 <= -46) {
          if (this.a(param0, (byte) 88, param1)) {
            L0: {
              L1: {
                var5 = null;
                if (null == ((ci) this).field_d[param1]) {
                  break L1;
                } else {
                  if (((ci) this).field_d[param1][param0] == null) {
                    break L1;
                  } else {
                    break L0;
                  }
                }
              }
              if (this.a(param0, param2, param1, 0)) {
                break L0;
              } else {
                this.a(param1, -69);
                if (this.a(param0, param2, param1, 0)) {
                  break L0;
                } else {
                  return null;
                }
              }
            }
            if (((ci) this).field_d[param1] != null) {
              L2: {
                if (((ci) this).field_d[param1][param0] == null) {
                  break L2;
                } else {
                  var7 = cf.a(((ci) this).field_d[param1][param0], false, (byte) 16);
                  var5_array = var7;
                  if (var7 != null) {
                    break L2;
                  } else {
                    throw new RuntimeException("");
                  }
                }
              }
              L3: {
                if (var5_array != null) {
                  if (-2 != (((ci) this).field_e ^ -1)) {
                    if (((ci) this).field_e == 2) {
                      ((ci) this).field_d[param1] = null;
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    ((ci) this).field_d[param1][param0] = null;
                    if ((((ci) this).field_b.field_i[param1] ^ -1) != -2) {
                      break L3;
                    } else {
                      ((ci) this).field_d[param1] = null;
                      break L3;
                    }
                  }
                } else {
                  break L3;
                }
              }
              return var5_array;
            } else {
              throw new RuntimeException("");
            }
          } else {
            return null;
          }
        } else {
          return (byte[]) ((ci) this).field_h[2];
        }
    }

    final int[] a(boolean param0) {
        if (!((ci) this).a((byte) -114)) {
            return null;
        }
        if (param0) {
            return null;
        }
        return ((ci) this).field_b.field_c;
    }

    final int a(int param0, String param1) {
        if (!(((ci) this).a((byte) -119))) {
            return 0;
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((ci) this).field_b.field_h.a(gb.a(-14741, var4), false);
        if (param0 != 0) {
            int discarded$0 = ((ci) this).a(((int[]) ((ci) this).field_h[1])[1], (String) ((ci) this).field_h[4], -26);
        }
        return ((ci) this).a(true, var3);
    }

    final int a(int param0) {
        int var2 = 53 % ((52 - param0) / 32);
        if (!(((ci) this).a((byte) -123))) {
            return -1;
        }
        return ((ci) this).field_b.field_i.length;
    }

    final synchronized boolean a(byte param0, int param1) {
        if (!this.b(14555, param1)) {
            return false;
        }
        int var3 = 114 % ((param0 - 40) / 56);
        if (!(((ci) this).field_h[param1] == null)) {
            return true;
        }
        this.a(param1, -124);
        if (null != ((ci) this).field_h[param1]) {
            return true;
        }
        return false;
    }

    public static void d(int param0) {
        field_g = null;
        if (param0 > -74) {
            ci.d(-75);
        }
        field_f = null;
    }

    final boolean b(byte param0, String param1) {
        if (!((ci) this).a((byte) -115)) {
            return false;
        }
        param1 = param1.toLowerCase();
        if (param0 != -120) {
            return ((boolean[]) ((Object[]) ((ci) this).field_h[10])[0])[4];
        }
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((ci) this).field_b.field_h.a(gb.a(-14741, var4), false);
        if ((var3 ^ -1) <= -1) {
            return true;
        }
        return false;
    }

    final boolean a(byte param0, String param1, String param2) {
        if (param0 < 17) {
            return ((boolean[]) ((ci) this).field_h[0])[3];
        }
        if (!(((ci) this).a((byte) -116))) {
            return false;
        }
        param2 = param2.toLowerCase();
        param1 = param1.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param2;
        int var4 = ((ci) this).field_b.field_h.a(gb.a(-14741, var6), false);
        if (!this.b(14555, var4)) {
            return false;
        }
        CharSequence var7 = (CharSequence) (Object) param1;
        int var5 = ((ci) this).field_b.field_t[var4].a(gb.a(-14741, var7), false);
        return ((ci) this).a(var5, 0, var4);
    }

    final synchronized boolean a(int param0, int param1, int param2) {
        if (!this.a(param0, (byte) 77, param2)) {
            return false;
        }
        if (null != ((ci) this).field_d[param2]) {
            if (!(null == ((ci) this).field_d[param2][param0])) {
                return true;
            }
        }
        if (param1 != 0) {
            ((int[]) ((Object[]) ((ci) this).field_h[5])[22])[8] = ((int[]) ((ci) this).field_h[2])[5];
        }
        if (!(null == ((ci) this).field_h[param2])) {
            return true;
        }
        this.a(param2, -102);
        if (null != ((ci) this).field_h[param2]) {
            return true;
        }
        return false;
    }

    final int b(int param0, String param1) {
        if (!((ci) this).a((byte) -113)) {
            return -1;
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((ci) this).field_b.field_h.a(gb.a(-14741, var4), false);
        if (!this.b(14555, var3)) {
            return -1;
        }
        if (param0 < 39) {
            return 17;
        }
        return var3;
    }

    ci(ih param0, boolean param1, int param2) {
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
          ((ci) this).field_b = null;
          if (param2 < 0) {
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
              ((ci) this).field_a = stackIn_6_1 != 0;
              ((ci) this).field_c = param0;
              ((ci) this).field_e = param2;
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
        field_g = new boolean[8];
        field_g[4] = true;
        field_g[3] = true;
        field_g[2] = true;
        field_g[5] = true;
        field_g[6] = true;
    }
}
