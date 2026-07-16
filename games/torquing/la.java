/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la {
    private Object[] field_f;
    private me field_a;
    private fd field_e;
    static t field_j;
    static long field_g;
    static int[] field_h;
    private Object[][] field_d;
    static pi field_c;
    static String field_b;
    private int field_l;
    static wl[] field_k;
    private boolean field_i;

    private final synchronized boolean a(boolean param0, int param1, int param2) {
        L0: {
          if (param0) {
            break L0;
          } else {
            la.d(126);
            break L0;
          }
        }
        if (((la) this).a(-12749)) {
          L1: {
            if (-1 < (param2 ^ -1)) {
              break L1;
            } else {
              if (param1 < 0) {
                break L1;
              } else {
                if (param2 >= ((la) this).field_e.field_h.length) {
                  break L1;
                } else {
                  if (param1 < ((la) this).field_e.field_h[param2]) {
                    return true;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          if (!fa.field_a) {
            return false;
          } else {
            throw new IllegalArgumentException(param2 + " " + param1);
          }
        } else {
          return false;
        }
    }

    final static boolean a(boolean param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0) {
          L0: {
            L1: {
              if ((op.field_i ^ -1) > -11) {
                break L1;
              } else {
                if (-14 < (b.field_x ^ -1)) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    public static void d(int param0) {
        field_k = null;
        field_j = null;
        if (param0 < 98) {
            Object var2 = null;
            la.a(10, 1, (int[]) null, 117, (int[]) null, -51, -19, -100, 65, 28);
        }
        field_h = null;
        field_b = null;
        field_c = null;
    }

    final boolean b(int param0, String param1, String param2) {
        if (!(((la) this).a(-12749))) {
            return false;
        }
        param2 = param2.toLowerCase();
        if (param0 != 0) {
            Object var6 = null;
            byte[] discarded$0 = ((la) this).a((int[]) ((Object[]) ((la) this).field_f[25])[3], ((byte[]) ((la) this).field_f[2])[4], (String) null, (String) null);
        }
        param1 = param1.toLowerCase();
        CharSequence var7 = (CharSequence) (Object) param2;
        int var4 = ((la) this).field_e.field_n.a(wc.a((byte) -56, var7), param0 ^ -485);
        if (!(this.b((byte) -79, var4))) {
            return false;
        }
        CharSequence var8 = (CharSequence) (Object) param1;
        int var5 = ((la) this).field_e.field_j[var4].a(wc.a((byte) 85, var8), -485);
        return ((la) this).a(var4, var5, (byte) -110);
    }

    final synchronized boolean c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Torquing.field_u;
        if (!((la) this).a(-12749)) {
          return false;
        } else {
          L0: {
            if (param0 == -19375) {
              break L0;
            } else {
              field_h = null;
              break L0;
            }
          }
          var2 = 1;
          var3 = 0;
          L1: while (true) {
            if (((la) this).field_e.field_b.length <= var3) {
              return var2 != 0;
            } else {
              var4 = ((la) this).field_e.field_b[var3];
              if (null == ((la) this).field_f[var4]) {
                this.a(var4, (byte) 124);
                if (null == ((la) this).field_f[var4]) {
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

    private final synchronized boolean a(int param0, int param1, int param2, int[] param3) {
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
        fj var26 = null;
        byte[] var27 = null;
        fj var29 = null;
        fj var31 = null;
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
        var22 = Torquing.field_u;
        if (!this.b((byte) -122, param2)) {
          return false;
        } else {
          if (null == ((la) this).field_f[param2]) {
            return false;
          } else {
            L0: {
              var5 = ((la) this).field_e.field_l[param2];
              var48 = ((la) this).field_e.field_m[param2];
              var41 = var48;
              var34 = var41;
              var24 = var34;
              var6 = var24;
              if (null == ((la) this).field_d[param2]) {
                ((la) this).field_d[param2] = new Object[((la) this).field_e.field_h[param2]];
                break L0;
              } else {
                break L0;
              }
            }
            var7 = ((la) this).field_d[param2];
            if (param0 == 2700) {
              var8 = 1;
              var9_int = 0;
              L1: while (true) {
                L2: {
                  if (var9_int >= var5) {
                    break L2;
                  } else {
                    L3: {
                      if (var6 == null) {
                        var10 = var9_int;
                        break L3;
                      } else {
                        var10 = var48[var9_int];
                        break L3;
                      }
                    }
                    if (null != var7[var10]) {
                      var9_int++;
                      continue L1;
                    } else {
                      var8 = 0;
                      break L2;
                    }
                  }
                }
                if (var8 != 0) {
                  return true;
                } else {
                  L4: {
                    L5: {
                      if (param3 == null) {
                        break L5;
                      } else {
                        L6: {
                          if (param3[0] != 0) {
                            break L6;
                          } else {
                            if (param3[1] != 0) {
                              break L6;
                            } else {
                              if (param3[2] != 0) {
                                break L6;
                              } else {
                                if (0 != param3[3]) {
                                  break L6;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                        }
                        var49 = ui.a(true, ((la) this).field_f[param2], (byte) 37);
                        var42 = var49;
                        var35 = var42;
                        var25 = var35;
                        var9 = var25;
                        var26 = new fj(var49);
                        var26.a(5, param3, var26.field_j.length, param0 ^ 30937);
                        break L4;
                      }
                    }
                    var9 = ui.a(false, ((la) this).field_f[param2], (byte) 37);
                    break L4;
                  }
                  L7: {
                    var50 = l.a(param0 + -2700, var9);
                    var43 = var50;
                    var36 = var43;
                    var27 = var36;
                    var23 = var27;
                    var51 = var23;
                    if (!((la) this).field_i) {
                      break L7;
                    } else {
                      ((la) this).field_f[param2] = null;
                      break L7;
                    }
                  }
                  L8: {
                    if (-2 > (var5 ^ -1)) {
                      var50 = var43;
                      if (-3 != (((la) this).field_l ^ -1)) {
                        var11 = var50.length;
                        var11--;
                        var12 = var23[var11] & 255;
                        var11 = var11 - 4 * var5 * var12;
                        var31 = new fj(var51);
                        var53 = new int[var5];
                        var46 = var53;
                        var39 = var46;
                        var32 = var39;
                        var14 = var32;
                        var31.field_n = var11;
                        var15_int = 0;
                        L9: while (true) {
                          if (var15_int >= var12) {
                            var54 = new byte[var5][];
                            var47 = var54;
                            var40 = var47;
                            var33 = var40;
                            var15 = var33;
                            var16 = 0;
                            L10: while (true) {
                              if (var5 <= var16) {
                                var31.field_n = var11;
                                var16 = 0;
                                var17 = 0;
                                L11: while (true) {
                                  if (var17 >= var12) {
                                    var17 = 0;
                                    L12: while (true) {
                                      if (var5 <= var17) {
                                        break L8;
                                      } else {
                                        L13: {
                                          if (var6 != null) {
                                            var18 = var48[var17];
                                            break L13;
                                          } else {
                                            var18 = var17;
                                            break L13;
                                          }
                                        }
                                        if (((la) this).field_l == 0) {
                                          var7[var18] = md.a((byte) -5, var54[var17], false);
                                          var17++;
                                          continue L12;
                                        } else {
                                          var7[var18] = (Object) (Object) var54[var17];
                                          var17++;
                                          continue L12;
                                        }
                                      }
                                    }
                                  } else {
                                    var18 = 0;
                                    var19 = 0;
                                    L14: while (true) {
                                      if (var5 <= var19) {
                                        var17++;
                                        continue L11;
                                      } else {
                                        var18 = var18 + var31.c((byte) -49);
                                        dk.a(var51, var16, var54[var19], var53[var19], var18);
                                        var16 = var16 + var18;
                                        var14[var19] = var14[var19] + var18;
                                        var19++;
                                        continue L14;
                                      }
                                    }
                                  }
                                }
                              } else {
                                var15[var16] = new byte[var53[var16]];
                                var53[var16] = 0;
                                var16++;
                                continue L10;
                              }
                            }
                          } else {
                            var16 = 0;
                            var17 = 0;
                            L15: while (true) {
                              if (var17 >= var5) {
                                var15_int++;
                                continue L9;
                              } else {
                                var16 = var16 + var31.c((byte) -61);
                                var14[var17] = var14[var17] + var16;
                                var17++;
                                continue L15;
                              }
                            }
                          }
                        }
                      } else {
                        var11 = var50.length;
                        var11--;
                        var12 = 255 & var23[var11];
                        var11 = var11 - var5 * var12 * 4;
                        var29 = new fj(var51);
                        var14_int = 0;
                        var15_int = 0;
                        var29.field_n = var11;
                        var16 = 0;
                        L16: while (true) {
                          if (var12 <= var16) {
                            if (var14_int == 0) {
                              return true;
                            } else {
                              var52 = new byte[var14_int];
                              var14_int = 0;
                              var29.field_n = var11;
                              var17 = 0;
                              var18 = 0;
                              L17: while (true) {
                                if (var18 >= var12) {
                                  var7[var15_int] = (Object) (Object) var52;
                                  break L8;
                                } else {
                                  var19 = 0;
                                  var20 = 0;
                                  L18: while (true) {
                                    if (var20 >= var5) {
                                      var18++;
                                      continue L17;
                                    } else {
                                      L19: {
                                        var19 = var19 + var29.c((byte) -108);
                                        if (var6 != null) {
                                          var21 = var48[var20];
                                          break L19;
                                        } else {
                                          var21 = var20;
                                          break L19;
                                        }
                                      }
                                      L20: {
                                        if (param1 != var21) {
                                          break L20;
                                        } else {
                                          dk.a(var51, var17, var52, var14_int, var19);
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
                            }
                          } else {
                            var17 = 0;
                            var18 = 0;
                            L21: while (true) {
                              if (var5 <= var18) {
                                var16++;
                                continue L16;
                              } else {
                                L22: {
                                  var17 = var17 + var29.c((byte) -120);
                                  if (var6 != null) {
                                    var19 = var48[var18];
                                    break L22;
                                  } else {
                                    var19 = var18;
                                    break L22;
                                  }
                                }
                                if (param1 == var19) {
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
                        if (var6 == null) {
                          var50 = var43;
                          var11 = 0;
                          break L23;
                        } else {
                          var11 = var48[0];
                          break L23;
                        }
                      }
                      var50 = var43;
                      if (((la) this).field_l == 0) {
                        var7[var11] = md.a((byte) -5, var51, false);
                        break L8;
                      } else {
                        var7[var11] = (Object) (Object) var50;
                        return true;
                      }
                    }
                  }
                  return true;
                }
              }
            } else {
              return true;
            }
          }
        }
    }

    final synchronized byte[] b(int param0, byte param1) {
        if (!((la) this).a(-12749)) {
            return null;
        }
        if (!(-2 != (((la) this).field_e.field_h.length ^ -1))) {
            return ((la) this).a(0, 100, param0);
        }
        if (!this.b((byte) -65, param0)) {
            return null;
        }
        if (param1 < 68) {
            field_h = null;
        }
        if (!(((la) this).field_e.field_h[param0] != 1)) {
            return ((la) this).a(param0, 100, 0);
        }
        throw new RuntimeException();
    }

    final synchronized int a(boolean param0, int param1) {
        if (!(this.b((byte) -110, param1))) {
            return 0;
        }
        if (!param0) {
            la.d(38);
        }
        if (!(null == ((la) this).field_f[param1])) {
            return 100;
        }
        return ((la) this).field_a.a(param1, -26954);
    }

    final synchronized boolean a(int param0) {
        if (param0 != -12749) {
            ((la) this).field_e = (fd) ((la) this).field_f[10];
        }
        if (((la) this).field_e == null) {
            ((la) this).field_e = ((la) this).field_a.b((byte) -126);
            if (((la) this).field_e == null) {
                return false;
            }
            ((la) this).field_d = new Object[((la) this).field_e.field_c][];
            ((la) this).field_f = new Object[((la) this).field_e.field_c];
        }
        return true;
    }

    private final synchronized byte[] a(int[] param0, int param1, int param2, int param3) {
        Object var5 = null;
        int var6 = 0;
        byte[] var7 = null;
        if (this.a(true, param2, param1)) {
          L0: {
            L1: {
              var5 = null;
              if (((la) this).field_d[param1] == null) {
                break L1;
              } else {
                if (null == ((la) this).field_d[param1][param2]) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            if (this.a(2700, param2, param1, param0)) {
              break L0;
            } else {
              this.a(param1, (byte) -106);
              if (this.a(2700, param2, param1, param0)) {
                break L0;
              } else {
                return null;
              }
            }
          }
          if (((la) this).field_d[param1] != null) {
            L2: {
              if (((la) this).field_d[param1][param2] == null) {
                break L2;
              } else {
                var7 = ui.a(false, ((la) this).field_d[param1][param2], (byte) 37);
                var5 = (Object) (Object) var7;
                if (var7 != null) {
                  break L2;
                } else {
                  throw new RuntimeException("");
                }
              }
            }
            L3: {
              if (var5 != null) {
                if (-2 == ((la) this).field_l) {
                  ((la) this).field_d[param1][param2] = null;
                  if (((la) this).field_e.field_h[param1] != 1) {
                    break L3;
                  } else {
                    ((la) this).field_d[param1] = null;
                    break L3;
                  }
                } else {
                  if (-3 == ((la) this).field_l) {
                    ((la) this).field_d[param1] = null;
                    break L3;
                  } else {
                    var6 = 120 % ((-57 - param3) / 33);
                    return (byte[]) var5;
                  }
                }
              } else {
                break L3;
              }
            }
            var6 = 120 % ((-57 - param3) / 33);
            return (byte[]) var5;
          } else {
            throw new RuntimeException("");
          }
        } else {
          return null;
        }
    }

    final synchronized boolean a(int param0, int param1, byte param2) {
        if (!(this.a(true, param1, param0))) {
            return false;
        }
        if (null != ((la) this).field_d[param0]) {
            if (!(null == ((la) this).field_d[param0][param1])) {
                return true;
            }
        }
        if (param2 > -70) {
            field_j = null;
        }
        if (((la) this).field_f[param0] != null) {
            return true;
        }
        this.a(param0, (byte) -102);
        if (null != ((la) this).field_f[param0]) {
            return true;
        }
        return false;
    }

    final boolean b(byte param0, String param1) {
        if (!(((la) this).a(-12749))) {
            return false;
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((la) this).field_e.field_n.a(wc.a((byte) 114, var4), -485);
        if (param0 >= -7) {
            return ((boolean[]) ((la) this).field_f[0])[10];
        }
        if ((var3 ^ -1) <= -1) {
            return true;
        }
        return false;
    }

    private final synchronized boolean b(byte param0, int param1) {
        if (!((la) this).a(-12749)) {
            return false;
        }
        if (param0 > -62) {
            return true;
        }
        if (0 <= param1) {
            if (param1 < ((la) this).field_e.field_h.length) {
                if (((la) this).field_e.field_h[param1] != 0) {
                    return true;
                }
            }
        }
        if (fa.field_a) {
            throw new IllegalArgumentException(Integer.toString(param1));
        }
        return false;
    }

    final int a(String param0, int param1, int param2) {
        if (!(this.b((byte) -74, param2))) {
            return -1;
        }
        param0 = param0.toLowerCase();
        CharSequence var5 = (CharSequence) (Object) param0;
        int var4 = ((la) this).field_e.field_j[param2].a(wc.a((byte) -107, var5), -485);
        if (!this.a(true, var4, param2)) {
            return -1;
        }
        if (param1 > -98) {
            return 11;
        }
        return var4;
    }

    private final synchronized void a(int param0, byte param1) {
        if (((la) this).field_i) {
            ((la) this).field_f[param0] = (Object) (Object) ((la) this).field_a.a(param0, true);
        } else {
            ((la) this).field_f[param0] = md.a((byte) -5, ((la) this).field_a.a(param0, true), false);
        }
        int var3 = -47 % ((32 - param1) / 62);
    }

    final synchronized int a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Torquing.field_u;
        if (!((la) this).a(-12749)) {
          return 0;
        } else {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (var4 >= ((la) this).field_f.length) {
              if (0 != var2) {
                if (param0 == -32) {
                  var4 = var3 * 100 / var2;
                  return var4;
                } else {
                  return 35;
                }
              } else {
                return 100;
              }
            } else {
              if (0 < ((la) this).field_e.field_l[var4]) {
                var2 += 100;
                var3 = var3 + ((la) this).a(true, var4);
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

    final boolean a(boolean param0, String param1) {
        if (!((la) this).a(-12749)) {
            return false;
        }
        param1 = param1.toLowerCase();
        if (!param0) {
            boolean discarded$0 = ((la) this).a(((int[]) ((Object[]) ((la) this).field_f[12])[26])[0]);
        }
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((la) this).field_e.field_n.a(wc.a((byte) 120, var4), -485);
        return ((la) this).a((byte) 113, var3);
    }

    final int a(byte param0, String param1) {
        if (!((la) this).a(-12749)) {
            return 0;
        }
        if (param0 <= 45) {
            field_k = null;
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((la) this).field_e.field_n.a(wc.a((byte) -120, var4), -485);
        return ((la) this).a(true, var3);
    }

    final byte[] a(int param0, int param1, int param2) {
        if (param1 != 100) {
            field_j = null;
        }
        return this.a((int[]) null, param0, param2, 30);
    }

    final int a(int param0, String param1) {
        if (!((la) this).a(-12749)) {
            return -1;
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((la) this).field_e.field_n.a(wc.a((byte) 99, var4), -485);
        if (param0 != -1) {
            return 11;
        }
        if (!(this.b((byte) -128, var3))) {
            return -1;
        }
        return var3;
    }

    final byte[] a(int[] param0, byte param1, String param2, String param3) {
        if (!((la) this).a(-12749)) {
            return null;
        }
        param2 = param2.toLowerCase();
        param3 = param3.toLowerCase();
        CharSequence var7 = (CharSequence) (Object) param2;
        int var5 = ((la) this).field_e.field_n.a(wc.a((byte) 56, var7), -485);
        if (!this.b((byte) -73, var5)) {
            return null;
        }
        if (param1 >= -52) {
            ((int[]) ((la) this).field_f[3])[18] = ((int[]) ((la) this).field_f[2])[0];
        }
        CharSequence var8 = (CharSequence) (Object) param3;
        int var6 = ((la) this).field_e.field_j[var5].a(wc.a((byte) 59, var8), -485);
        return this.a(param0, var5, var6, 77);
    }

    final synchronized boolean a(int param0, boolean param1) {
        if (!((la) this).a(-12749)) {
            return false;
        }
        if (-2 == (((la) this).field_e.field_h.length ^ -1)) {
            return ((la) this).a(0, param0, (byte) -117);
        }
        if (!(this.b((byte) -109, param0))) {
            return false;
        }
        if (param1) {
            byte[] discarded$0 = ((la) this).a((int[]) null, (byte) -91, (String) null, (String) ((la) this).field_f[11]);
        }
        if (!(-2 != (((la) this).field_e.field_h[param0] ^ -1))) {
            return ((la) this).a(param0, 0, (byte) -79);
        }
        throw new RuntimeException();
    }

    final synchronized boolean a(byte param0, int param1) {
        if (!(this.b((byte) -96, param1))) {
            return false;
        }
        if (param0 < 92) {
            ((la) this).field_i = ((boolean[]) ((la) this).field_f[0])[12];
        }
        if (!(((la) this).field_f[param1] == null)) {
            return true;
        }
        this.a(param1, (byte) 94);
        if (null == ((la) this).field_f[param1]) {
            return false;
        }
        return true;
    }

    la(me param0, boolean param1, int param2) {
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
          ((la) this).field_e = null;
          if ((param2 ^ -1) > -1) {
            break L0;
          } else {
            if (param2 <= 2) {
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
              ((la) this).field_i = stackIn_6_1 != 0;
              ((la) this).field_a = param0;
              ((la) this).field_l = param2;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("");
    }

    final synchronized byte[] a(int param0, String param1, String param2) {
        if (!((la) this).a(-12749)) {
            return null;
        }
        param2 = param2.toLowerCase();
        if (param0 > -105) {
            boolean discarded$0 = ((la) this).a(((byte[]) ((Object[]) ((la) this).field_f[10])[6])[2], 123);
        }
        param1 = param1.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param2;
        int var4 = ((la) this).field_e.field_n.a(wc.a((byte) 79, var6), -485);
        if (!this.b((byte) -70, var4)) {
            return null;
        }
        CharSequence var7 = (CharSequence) (Object) param1;
        int var5 = ((la) this).field_e.field_j[var4].a(wc.a((byte) 77, var7), -485);
        return ((la) this).a(var4, 100, var5);
    }

    final static void a(int param0, int param1, int[] param2, int param3, int[] param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = Torquing.field_u;
        if (param8 != 65280) {
            vc discarded$0 = la.b(123);
        }
        for (var10 = -param6; var10 < 0; var10++) {
            for (var11 = -param5; -1 < (var11 ^ -1); var11++) {
                int incrementValue$1 = param1;
                param1++;
                param0 = param2[incrementValue$1];
                if (-1 == (param0 ^ -1)) {
                    param7++;
                } else {
                    var12 = 255 & param0;
                    var13 = 256 - var12;
                    var14 = param4[param7];
                    var15 = var14 & 16711935;
                    var16 = 65280 & var14;
                    int incrementValue$2 = param7;
                    param7++;
                    param4[incrementValue$2] = gm.a(ie.a(16711855, var13 * var16) >> 1885321640, ie.a(16711935, var13 * var15 >> 748574184));
                }
            }
            param1 = param1 + param9;
            param7 = param7 + param3;
        }
    }

    final static vc b(int param0) {
        try {
            Throwable var1 = null;
            vc stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            vc stackOut_2_0 = null;
            if (param0 > 11) {
              try {
                L0: {
                  stackOut_2_0 = (vc) Class.forName("dl").newInstance();
                  stackIn_3_0 = stackOut_2_0;
                  break L0;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = decompiledCaughtException;
                return null;
              }
              return stackIn_3_0;
            } else {
              return null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Loading extra data";
        field_k = new wl[13];
        field_h = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
