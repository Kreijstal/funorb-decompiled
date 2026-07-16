/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk {
    private pc field_b;
    private wi field_c;
    private Object[] field_d;
    private int field_i;
    private boolean field_e;
    private Object[][] field_f;
    static String field_a;
    static int field_h;
    static int[] field_g;

    private final synchronized byte[] a(int[] param0, boolean param1, int param2, int param3) {
        Object var5 = null;
        byte[] var7 = null;
        if (this.a(param1, param3, param2)) {
          L0: {
            L1: {
              var5 = null;
              if (((kk) this).field_f[param3] == null) {
                break L1;
              } else {
                if (((kk) this).field_f[param3][param2] == null) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            if (this.a(4, param3, param2, param0)) {
              break L0;
            } else {
              this.d(118, param3);
              if (this.a(4, param3, param2, param0)) {
                break L0;
              } else {
                return null;
              }
            }
          }
          if (((kk) this).field_f[param3] == null) {
            throw new RuntimeException("");
          } else {
            L2: {
              if (null == ((kk) this).field_f[param3][param2]) {
                break L2;
              } else {
                var7 = me.a(false, 22692, ((kk) this).field_f[param3][param2]);
                var5 = (Object) (Object) var7;
                if (var7 == null) {
                  throw new RuntimeException("");
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (var5 != null) {
                if (((kk) this).field_i != 1) {
                  if (2 == ((kk) this).field_i) {
                    ((kk) this).field_f[param3] = null;
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  ((kk) this).field_f[param3][param2] = null;
                  if (((kk) this).field_b.field_a[param3] != 1) {
                    break L3;
                  } else {
                    ((kk) this).field_f[param3] = null;
                    break L3;
                  }
                }
              } else {
                break L3;
              }
            }
            return (byte[]) var5;
          }
        } else {
          return null;
        }
    }

    final synchronized boolean a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = TrackController.field_F ? 1 : 0;
        if (((kk) this).c(-69)) {
          var2 = 1;
          if (param0 == 48) {
            var3 = 0;
            L0: while (true) {
              if (((kk) this).field_b.field_f.length <= var3) {
                return var2 != 0;
              } else {
                var4 = ((kk) this).field_b.field_f[var3];
                if (null == ((kk) this).field_d[var4]) {
                  this.d(127, var4);
                  if (((kk) this).field_d[var4] == null) {
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
            return ((boolean[]) ((Object[]) ((kk) this).field_d[3])[3])[6];
          }
        } else {
          return false;
        }
    }

    final synchronized boolean a(byte param0, int param1) {
        if (param0 != -40) {
            byte[] discarded$0 = ((kk) this).b(-100, ((int[]) ((kk) this).field_d[2])[0]);
        }
        if (!this.c(71, param1)) {
            return false;
        }
        if (null != ((kk) this).field_d[param1]) {
            return true;
        }
        this.d(param0 + -80, param1);
        if (null != ((kk) this).field_d[param1]) {
            return true;
        }
        return false;
    }

    final synchronized byte[] b(int param0, int param1) {
        if (!((kk) this).c(-101)) {
            return null;
        }
        if (!(1 != ((kk) this).field_b.field_a.length)) {
            return ((kk) this).a(0, param0, (byte) -39);
        }
        if (!this.c(-116, param0)) {
            return null;
        }
        if (param1 != 20095) {
            return null;
        }
        if ((((kk) this).field_b.field_a[param0] ^ -1) == -2) {
            return ((kk) this).a(param0, 0, (byte) -82);
        }
        throw new RuntimeException();
    }

    final byte[] a(int param0, int param1, byte param2) {
        if (param2 >= -21) {
            field_a = (String) ((kk) this).field_d[13];
        }
        return this.a((int[]) null, true, param1, param0);
    }

    final int b(int param0) {
        if (param0 != 0) {
            field_g = null;
        }
        if (!(((kk) this).c(-23))) {
            return -1;
        }
        return ((kk) this).field_b.field_a.length;
    }

    final int a(String param0, int param1, int param2) {
        if (!(this.c(param2 ^ 66, param1))) {
            return -1;
        }
        param0 = param0.toLowerCase();
        if (param2 != -1) {
            ((kk) this).field_d[6] = null;
        }
        CharSequence var5 = (CharSequence) (Object) param0;
        int var4 = ((kk) this).field_b.field_e[param1].a(hk.a(var5, 0), param2 ^ 26555);
        if (!(this.a(true, param1, var4))) {
            return -1;
        }
        return var4;
    }

    final synchronized int a(boolean param0) {
        int var4 = 0;
        int var5 = TrackController.field_F ? 1 : 0;
        if (!(((kk) this).c(100))) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        if (!param0) {
            field_a = (String) ((kk) this).field_d[2];
        }
        for (var4 = 0; (((kk) this).field_d.length ^ -1) < (var4 ^ -1); var4++) {
            if (!(-1 <= (((kk) this).field_b.field_l[var4] ^ -1))) {
                var2 += 100;
                var3 = var3 + ((kk) this).a(var4, -24214);
            }
        }
        if (!(-1 != (var2 ^ -1))) {
            return 100;
        }
        var4 = 100 * var3 / var2;
        return var4;
    }

    final boolean a(String param0, String param1, byte param2) {
        if (!((kk) this).c(102)) {
            return false;
        }
        param0 = param0.toLowerCase();
        param1 = param1.toLowerCase();
        if (param2 != -45) {
            ((long[]) ((kk) this).field_d[16])[11] = -121L;
        }
        CharSequence var6 = (CharSequence) (Object) param0;
        int var4 = ((kk) this).field_b.field_q.a(hk.a(var6, 0), param2 + -26511);
        if (!(this.c(param2 ^ -110, var4))) {
            return false;
        }
        CharSequence var7 = (CharSequence) (Object) param1;
        int var5 = ((kk) this).field_b.field_e[var4].a(hk.a(var7, param2 + 45), param2 + -26511);
        return ((kk) this).a(var4, var5, param2 ^ 44);
    }

    final boolean b(String param0, byte param1) {
        if (!((kk) this).c(119)) {
            return false;
        }
        if (param1 != -3) {
            byte[] discarded$0 = this.a((int[]) ((Object[]) ((kk) this).field_d[43])[6], ((boolean[]) ((Object[]) ((kk) this).field_d[3])[3])[2], -64, -39);
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((kk) this).field_b.field_q.a(hk.a(var4, 0), -26556);
        return ((kk) this).a((byte) -40, var3);
    }

    final static boolean b(byte param0) {
        if (param0 >= -50) {
            kk.a(-33);
        }
        return vg.field_o;
    }

    final int a(int param0, byte param1) {
        if (!(this.c(67, param0))) {
            return 0;
        }
        if (param1 != -91) {
            return 56;
        }
        return ((kk) this).field_b.field_a[param0];
    }

    final int a(boolean param0, String param1) {
        if (!((kk) this).c(92)) {
            return -1;
        }
        if (!param0) {
            Object var4 = null;
            int discarded$0 = ((kk) this).a(true, (String) null);
        }
        param1 = param1.toLowerCase();
        CharSequence var5 = (CharSequence) (Object) param1;
        int var3 = ((kk) this).field_b.field_q.a(hk.a(var5, 0), -26556);
        if (!this.c(74, var3)) {
            return -1;
        }
        return var3;
    }

    final synchronized boolean a(int param0, int param1, int param2) {
        if (!(this.a(true, param0, param1))) {
            return false;
        }
        if (null != ((kk) this).field_f[param0]) {
            if (!(((kk) this).field_f[param0][param1] == null)) {
                return true;
            }
        }
        if (param2 != -1) {
            ((byte[]) ((kk) this).field_d[6])[2] = ((byte[]) ((kk) this).field_d[9])[0];
        }
        if (!(null == ((kk) this).field_d[param0])) {
            return true;
        }
        this.d(73, param0);
        if (((kk) this).field_d[param0] == null) {
            return false;
        }
        return true;
    }

    private final synchronized boolean a(boolean param0, int param1, int param2) {
        if (!((kk) this).c(-115)) {
          return false;
        } else {
          L0: {
            if (-1 < (param1 ^ -1)) {
              break L0;
            } else {
              if (0 > param2) {
                break L0;
              } else {
                if (((kk) this).field_b.field_a.length <= param1) {
                  break L0;
                } else {
                  if (param2 < ((kk) this).field_b.field_a[param1]) {
                    if (param0) {
                      return true;
                    } else {
                      ((kk) this).field_b = null;
                      return true;
                    }
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
          if (!sk.field_b) {
            return false;
          } else {
            throw new IllegalArgumentException(param1 + " " + param2);
          }
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
            return;
        }
        field_g = null;
        field_a = null;
    }

    private final synchronized void d(int param0, int param1) {
        int var3 = 83 / ((param0 - 2) / 61);
        if (((kk) this).field_e) {
            ((kk) this).field_d[param1] = (Object) (Object) ((kk) this).field_c.a(-1, param1);
        } else {
            ((kk) this).field_d[param1] = qk.a(((kk) this).field_c.a(-1, param1), false, (byte) -88);
        }
    }

    final synchronized int a(int param0, int param1) {
        if (param1 != -24214) {
            return 22;
        }
        if (!this.c(-42, param0)) {
            return 0;
        }
        if (!(null == ((kk) this).field_d[param0])) {
            return 100;
        }
        return ((kk) this).field_c.b(param0, param1 ^ 2972);
    }

    private final synchronized boolean c(int param0, int param1) {
        int var3 = 0;
        if (((kk) this).c(-79)) {
          L0: {
            if (0 > param1) {
              break L0;
            } else {
              if (param1 >= ((kk) this).field_b.field_a.length) {
                break L0;
              } else {
                if (((kk) this).field_b.field_a[param1] == 0) {
                  break L0;
                } else {
                  var3 = 91 % ((13 - param0) / 52);
                  return true;
                }
              }
            }
          }
          if (!sk.field_b) {
            return false;
          } else {
            throw new IllegalArgumentException(Integer.toString(param1));
          }
        } else {
          return false;
        }
    }

    final synchronized byte[] a(String param0, int param1, String param2) {
        if (!((kk) this).c(-79)) {
            return null;
        }
        param0 = param0.toLowerCase();
        param2 = param2.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param0;
        int var4 = ((kk) this).field_b.field_q.a(hk.a(var6, param1 ^ param1), param1 + -26555);
        if (!this.c(93, var4)) {
            return null;
        }
        CharSequence var7 = (CharSequence) (Object) param2;
        int var5 = ((kk) this).field_b.field_e[var4].a(hk.a(var7, 0), -26556);
        return ((kk) this).a(var4, var5, (byte) -64);
    }

    final boolean a(String param0, byte param1) {
        if (!(((kk) this).c(110))) {
            return false;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((kk) this).field_b.field_q.a(hk.a(var4, 0), -26556);
        if (param1 > -85) {
            ((kk) this).field_b = null;
        }
        if (-1 < (var3 ^ -1)) {
            return false;
        }
        return true;
    }

    final synchronized boolean c(int param0) {
        int var2 = 122 % ((param0 - 33) / 55);
        if (null == ((kk) this).field_b) {
            ((kk) this).field_b = ((kk) this).field_c.a(9);
            if (!(((kk) this).field_b != null)) {
                return false;
            }
            ((kk) this).field_d = new Object[((kk) this).field_b.field_n];
            ((kk) this).field_f = new Object[((kk) this).field_b.field_n][];
        }
        return true;
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
        be var26 = null;
        byte[] var27 = null;
        be var29 = null;
        be var31 = null;
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
        var22 = TrackController.field_F ? 1 : 0;
        if (this.c(90, param1)) {
          if (null != ((kk) this).field_d[param1]) {
            var5 = ((kk) this).field_b.field_l[param1];
            var50 = ((kk) this).field_b.field_r[param1];
            var42 = var50;
            var34 = var42;
            var24 = var34;
            var6 = var24;
            if (param0 == 4) {
              L0: {
                if (((kk) this).field_f[param1] != null) {
                  break L0;
                } else {
                  ((kk) this).field_f[param1] = new Object[((kk) this).field_b.field_a[param1]];
                  break L0;
                }
              }
              var7 = ((kk) this).field_f[param1];
              var8 = 1;
              var9_int = 0;
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
                    if (null == var7[var10]) {
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
                      if (param3 == null) {
                        break L5;
                      } else {
                        L6: {
                          if (-1 != param3[0]) {
                            break L6;
                          } else {
                            if (-1 != param3[1]) {
                              break L6;
                            } else {
                              if (-1 != (param3[2] ^ -1)) {
                                break L6;
                              } else {
                                if (param3[3] == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                        }
                        var51 = me.a(true, 22692, ((kk) this).field_d[param1]);
                        var26 = new be(var51);
                        var26.a(5, param3, var26.field_j.length, false);
                        var52 = var51;
                        break L4;
                      }
                    }
                    var52 = me.a(false, param0 ^ 22688, ((kk) this).field_d[param1]);
                    var44 = var52;
                    var36 = var44;
                    var9 = var36;
                    break L4;
                  }
                  L7: {
                    var53 = al.a(-127, var52);
                    var45 = var53;
                    var37 = var45;
                    var27 = var37;
                    var23 = var27;
                    var54 = var23;
                    if (((kk) this).field_e) {
                      var53 = var45;
                      ((kk) this).field_d[param1] = null;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    var53 = var45;
                    if (1 >= var5) {
                      L9: {
                        if (var6 == null) {
                          var11 = 0;
                          break L9;
                        } else {
                          var11 = var50[0];
                          break L9;
                        }
                      }
                      if (((kk) this).field_i == 0) {
                        var7[var11] = qk.a(var54, false, (byte) 8);
                        break L8;
                      } else {
                        var7[var11] = (Object) (Object) var53;
                        break L8;
                      }
                    } else {
                      if ((((kk) this).field_i ^ -1) != -3) {
                        var53 = var45;
                        var11 = var53.length;
                        var11--;
                        var12 = 255 & var23[var11];
                        var11 = var11 - 4 * var5 * var12;
                        var31 = new be(var54);
                        var31.field_k = var11;
                        var56 = new int[var5];
                        var48 = var56;
                        var40 = var48;
                        var32 = var40;
                        var14 = var32;
                        var15_int = 0;
                        L10: while (true) {
                          if (var15_int >= var12) {
                            var57 = new byte[var5][];
                            var49 = var57;
                            var41 = var49;
                            var33 = var41;
                            var15 = var33;
                            var16 = 0;
                            L11: while (true) {
                              if (var5 <= var16) {
                                var31.field_k = var11;
                                var16 = 0;
                                var17 = 0;
                                L12: while (true) {
                                  if (var17 >= var12) {
                                    var17 = 0;
                                    L13: while (true) {
                                      if (var17 >= var5) {
                                        break L8;
                                      } else {
                                        L14: {
                                          if (var6 != null) {
                                            var18 = var50[var17];
                                            break L14;
                                          } else {
                                            var18 = var17;
                                            break L14;
                                          }
                                        }
                                        if (((kk) this).field_i == 0) {
                                          var7[var18] = qk.a(var57[var17], false, (byte) -19);
                                          var17++;
                                          continue L13;
                                        } else {
                                          var7[var18] = (Object) (Object) var57[var17];
                                          var17++;
                                          continue L13;
                                        }
                                      }
                                    }
                                  } else {
                                    var18 = 0;
                                    var19 = 0;
                                    L15: while (true) {
                                      if (var19 >= var5) {
                                        var17++;
                                        continue L12;
                                      } else {
                                        var18 = var18 + var31.e((byte) 113);
                                        pd.a(var54, var16, var57[var19], var56[var19], var18);
                                        var14[var19] = var14[var19] + var18;
                                        var16 = var16 + var18;
                                        var19++;
                                        continue L15;
                                      }
                                    }
                                  }
                                }
                              } else {
                                var15[var16] = new byte[var56[var16]];
                                var56[var16] = 0;
                                var16++;
                                continue L11;
                              }
                            }
                          } else {
                            var16 = 0;
                            var17 = 0;
                            L16: while (true) {
                              if (var17 >= var5) {
                                var15_int++;
                                continue L10;
                              } else {
                                var16 = var16 + var31.e((byte) 113);
                                var14[var17] = var14[var17] + var16;
                                var17++;
                                continue L16;
                              }
                            }
                          }
                        }
                      } else {
                        var11 = var53.length;
                        var11--;
                        var12 = 255 & var23[var11];
                        var11 = var11 - 4 * (var12 * var5);
                        var29 = new be(var54);
                        var14_int = 0;
                        var29.field_k = var11;
                        var15_int = 0;
                        var16 = 0;
                        L17: while (true) {
                          if (var16 >= var12) {
                            if (var14_int == 0) {
                              return true;
                            } else {
                              var55 = new byte[var14_int];
                              var14_int = 0;
                              var29.field_k = var11;
                              var17 = 0;
                              var18 = 0;
                              L18: while (true) {
                                if (var18 >= var12) {
                                  var7[var15_int] = (Object) (Object) var55;
                                  return true;
                                } else {
                                  var19 = 0;
                                  var20 = 0;
                                  L19: while (true) {
                                    if (var5 <= var20) {
                                      var18++;
                                      continue L18;
                                    } else {
                                      L20: {
                                        var19 = var19 + var29.e((byte) 113);
                                        if (var6 == null) {
                                          var21 = var20;
                                          break L20;
                                        } else {
                                          var21 = var50[var20];
                                          break L20;
                                        }
                                      }
                                      L21: {
                                        if (param2 != var21) {
                                          break L21;
                                        } else {
                                          pd.a(var54, var17, var55, var14_int, var19);
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
                                  var17 = var17 + var29.e((byte) 113);
                                  if (var6 == null) {
                                    var19 = var18;
                                    break L23;
                                  } else {
                                    var19 = var50[var18];
                                    break L23;
                                  }
                                }
                                if (var19 == param2) {
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
                  return true;
                } else {
                  return true;
                }
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final int a(String param0, int param1) {
        if (!((kk) this).c(-82)) {
            return 0;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((kk) this).field_b.field_q.a(hk.a(var4, param1), -26556);
        return ((kk) this).a(var3, -24214);
    }

    kk(wi param0, boolean param1, int param2) {
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
          ((kk) this).field_b = null;
          if ((param2 ^ -1) > -1) {
            break L0;
          } else {
            if ((param2 ^ -1) >= -3) {
              L1: {
                ((kk) this).field_i = param2;
                ((kk) this).field_c = param0;
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
              ((kk) this).field_e = stackIn_6_1 != 0;
              return;
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
        field_a = "You are unable to access this level yet.";
        field_g = new int[4];
    }
}
