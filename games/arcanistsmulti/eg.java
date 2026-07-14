/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg {
    private Object[] field_c;
    private jk field_i;
    static int[] field_g;
    boolean field_h;
    static int[] field_a;
    private tl field_e;
    private Object[][] field_b;
    static String field_d;
    int field_f;

    private final synchronized boolean a(int param0, int[] param1, byte param2, int param3) {
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
        Object var23 = null;
        byte[] var24 = null;
        int[] var25 = null;
        byte[] var26 = null;
        wk var27 = null;
        byte[] var28 = null;
        wk var30 = null;
        wk var32 = null;
        int[] var33 = null;
        byte[][] var34 = null;
        int[] var35 = null;
        byte[] var36 = null;
        byte[] var37 = null;
        int[] var40 = null;
        byte[][] var41 = null;
        int[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        int[] var47 = null;
        byte[][] var48 = null;
        int[] var49 = null;
        byte[] var50 = null;
        byte[] var51 = null;
        byte[] var52 = null;
        byte[] var53 = null;
        int[] var54 = null;
        byte[][] var55 = null;
        var22 = ArcanistsMulti.field_G ? 1 : 0;
        if (!this.b(-127, param3)) {
          return false;
        } else {
          if (((eg) this).field_c[param3] != null) {
            L0: {
              var5 = ((eg) this).field_i.field_b[param3];
              var49 = ((eg) this).field_i.field_e[param3];
              var42 = var49;
              var35 = var42;
              var25 = var35;
              var6 = var25;
              if (((eg) this).field_b[param3] == null) {
                ((eg) this).field_b[param3] = new Object[((eg) this).field_i.field_i[param3]];
                break L0;
              } else {
                break L0;
              }
            }
            var7 = ((eg) this).field_b[param3];
            var8 = 1;
            var9_int = 0;
            L1: while (true) {
              L2: {
                if (var5 <= var9_int) {
                  break L2;
                } else {
                  L3: {
                    if (var6 != null) {
                      var10 = var49[var9_int];
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
                        if (-1 != (param1[0] ^ -1)) {
                          break L6;
                        } else {
                          if (param1[1] != -1) {
                            break L6;
                          } else {
                            if (-1 != param1[2]) {
                              break L6;
                            } else {
                              if (param1[3] != 0) {
                                break L6;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      var50 = td.a(((eg) this).field_c[param3], -128, true);
                      var43 = var50;
                      var36 = var43;
                      var26 = var36;
                      var9 = var26;
                      var27 = new wk(var50);
                      var27.a(param1, 5, var27.field_j.length, 127);
                      break L4;
                    }
                  }
                  var9 = td.a(((eg) this).field_c[param3], -19, false);
                  break L4;
                }
                L7: {
                  if (param2 >= 73) {
                    break L7;
                  } else {
                    var23 = null;
                    boolean discarded$1 = ((eg) this).a(false, (String) null);
                    break L7;
                  }
                }
                L8: {
                  var51 = hb.a(false, var9);
                  var44 = var51;
                  var37 = var44;
                  var28 = var37;
                  var24 = var28;
                  var52 = var24;
                  if (((eg) this).field_h) {
                    var51 = var44;
                    ((eg) this).field_c[param3] = null;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  var51 = var44;
                  if (var5 <= 1) {
                    L10: {
                      if (var6 != null) {
                        var11 = var49[0];
                        break L10;
                      } else {
                        var11 = 0;
                        break L10;
                      }
                    }
                    if (((eg) this).field_f == 0) {
                      var7[var11] = bi.a(false, 0, var52);
                      break L9;
                    } else {
                      var7[var11] = (Object) (Object) var51;
                      break L9;
                    }
                  } else {
                    if (((eg) this).field_f != 2) {
                      var51 = var44;
                      var11 = var51.length;
                      var11--;
                      var12 = 255 & var24[var11];
                      var11 = var11 - var12 * var5 * 4;
                      var32 = new wk(var52);
                      var54 = new int[var5];
                      var47 = var54;
                      var40 = var47;
                      var33 = var40;
                      var14 = var33;
                      var32.field_g = var11;
                      var15_int = 0;
                      L11: while (true) {
                        if (var12 <= var15_int) {
                          var55 = new byte[var5][];
                          var48 = var55;
                          var41 = var48;
                          var34 = var41;
                          var15 = var34;
                          var16 = 0;
                          L12: while (true) {
                            if (var5 <= var16) {
                              var32.field_g = var11;
                              var16 = 0;
                              var17 = 0;
                              L13: while (true) {
                                if (var17 >= var12) {
                                  var17 = 0;
                                  L14: while (true) {
                                    if (var17 >= var5) {
                                      break L9;
                                    } else {
                                      L15: {
                                        if (var6 == null) {
                                          var18 = var17;
                                          break L15;
                                        } else {
                                          var18 = var49[var17];
                                          break L15;
                                        }
                                      }
                                      if (0 != ((eg) this).field_f) {
                                        var7[var18] = (Object) (Object) var55[var17];
                                        var17++;
                                        continue L14;
                                      } else {
                                        var7[var18] = bi.a(false, 0, var55[var17]);
                                        var17++;
                                        continue L14;
                                      }
                                    }
                                  }
                                } else {
                                  var18 = 0;
                                  var19 = 0;
                                  L16: while (true) {
                                    if (var19 >= var5) {
                                      var17++;
                                      continue L13;
                                    } else {
                                      var18 = var18 + var32.d(-10674);
                                      sf.a(var52, var16, var55[var19], var54[var19], var18);
                                      var14[var19] = var14[var19] + var18;
                                      var16 = var16 + var18;
                                      var19++;
                                      continue L16;
                                    }
                                  }
                                }
                              }
                            } else {
                              var15[var16] = new byte[var54[var16]];
                              var54[var16] = 0;
                              var16++;
                              continue L12;
                            }
                          }
                        } else {
                          var16 = 0;
                          var17 = 0;
                          L17: while (true) {
                            if (var17 >= var5) {
                              var15_int++;
                              continue L11;
                            } else {
                              var16 = var16 + var32.d(-10674);
                              var14[var17] = var14[var17] + var16;
                              var17++;
                              continue L17;
                            }
                          }
                        }
                      }
                    } else {
                      var11 = var51.length;
                      var11--;
                      var12 = 255 & var24[var11];
                      var11 = var11 - var5 * (var12 * 4);
                      var30 = new wk(var52);
                      var14_int = 0;
                      var15_int = 0;
                      var30.field_g = var11;
                      var16 = 0;
                      L18: while (true) {
                        if (var16 >= var12) {
                          if (-1 != (var14_int ^ -1)) {
                            var53 = new byte[var14_int];
                            var30.field_g = var11;
                            var14_int = 0;
                            var17 = 0;
                            var18 = 0;
                            L19: while (true) {
                              if (var18 >= var12) {
                                var7[var15_int] = (Object) (Object) var53;
                                return true;
                              } else {
                                var19 = 0;
                                var20 = 0;
                                L20: while (true) {
                                  if (var20 >= var5) {
                                    var18++;
                                    continue L19;
                                  } else {
                                    L21: {
                                      var19 = var19 + var30.d(-10674);
                                      if (var6 == null) {
                                        var21 = var20;
                                        break L21;
                                      } else {
                                        var21 = var49[var20];
                                        break L21;
                                      }
                                    }
                                    L22: {
                                      if (var21 != param0) {
                                        break L22;
                                      } else {
                                        sf.a(var52, var17, var53, var14_int, var19);
                                        var14_int = var14_int + var19;
                                        break L22;
                                      }
                                    }
                                    var17 = var17 + var19;
                                    var20++;
                                    continue L20;
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
                          L23: while (true) {
                            if (var5 <= var18) {
                              var16++;
                              continue L18;
                            } else {
                              L24: {
                                var17 = var17 + var30.d(-10674);
                                if (var6 != null) {
                                  var19 = var49[var18];
                                  break L24;
                                } else {
                                  var19 = var18;
                                  break L24;
                                }
                              }
                              if (param0 == var19) {
                                var14_int = var14_int + var17;
                                var15_int = var19;
                                var18++;
                                continue L23;
                              } else {
                                var18++;
                                continue L23;
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
        }
    }

    final int a(String param0, byte param1, int param2) {
        if (!(this.b(-98, param2))) {
            return -1;
        }
        param0 = param0.toLowerCase();
        if (param1 <= 21) {
            return -17;
        }
        CharSequence var5 = (CharSequence) (Object) param0;
        int var4 = ((eg) this).field_i.field_c[param2].a(ml.a(var5, -76), -140);
        if (!(this.a(var4, 0, param2))) {
            return -1;
        }
        return var4;
    }

    final synchronized boolean a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        if (((eg) this).c(-10923)) {
          var2 = 1;
          var4 = 67 / ((param0 - 46) / 58);
          var3 = 0;
          L0: while (true) {
            if (((eg) this).field_i.field_r.length <= var3) {
              return var2 != 0;
            } else {
              var5 = ((eg) this).field_i.field_r[var3];
              if (((eg) this).field_c[var5] == null) {
                this.c(var5, -126);
                if (null == ((eg) this).field_c[var5]) {
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
    }

    final synchronized int a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        if (((eg) this).c(-10923)) {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (var4 >= ((eg) this).field_c.length) {
              if (0 == var2) {
                return 100;
              } else {
                var4 = var3 * 100 / var2;
                var5 = -67 / ((param0 - 43) / 33);
                return var4;
              }
            } else {
              if (-1 > (((eg) this).field_i.field_b[var4] ^ -1)) {
                var2 += 100;
                var3 = var3 + ((eg) this).a(var4, -23760);
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return 0;
        }
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        if (!((eg) this).c(-10923)) {
            return false;
        }
        if (param2 >= param1) {
            if (param0 >= 0) {
                if (((eg) this).field_i.field_i.length > param2) {
                    if (param0 < ((eg) this).field_i.field_i[param2]) {
                        return true;
                    }
                }
            }
        }
        if (ji.field_d) {
            throw new IllegalArgumentException(param2 + " " + param0);
        }
        return false;
    }

    final synchronized boolean a(boolean param0, int param1) {
        if (!this.b(-69, param1)) {
            return false;
        }
        if (((eg) this).field_c[param1] != null) {
            return true;
        }
        if (!param0) {
            eg.a(((boolean[]) ((eg) this).field_c[0])[14]);
        }
        this.c(param1, -125);
        if (null != ((eg) this).field_c[param1]) {
            return true;
        }
        return false;
    }

    final static void b(int param0) {
        if (param0 != 403300833) {
            field_a = null;
        }
        int var1 = mb.j((byte) 19);
        int var2 = mo.b(25117);
        ol.field_f.a(-mj.field_r + bk.field_I, -tg.field_d + qe.field_o, -98, var1 - -(mj.field_r << -1877115007), (tg.field_d << 403300833) + var2);
        mn.d(-1);
    }

    final int b(byte param0) {
        if (param0 >= -44) {
            ((eg) this).field_c = (Object[]) ((Object[]) ((eg) this).field_c[0])[6];
        }
        if (!(((eg) this).c(-10923))) {
            return -1;
        }
        return ((eg) this).field_i.field_i.length;
    }

    final synchronized int a(int param0, int param1) {
        if (!(this.b(-124, param0))) {
            return 0;
        }
        if (((eg) this).field_c[param0] != null) {
            return 100;
        }
        if (param1 != -23760) {
            ((eg) this).field_i = (jk) ((eg) this).field_c[2];
        }
        return ((eg) this).field_e.a(param0, (byte) 124);
    }

    final synchronized byte[] d(int param0, int param1) {
        if (!((eg) this).c(-10923)) {
            return null;
        }
        if (1 == ((eg) this).field_i.field_i.length) {
            return ((eg) this).b(param0, param1 + -5443, 0);
        }
        if (!this.b(-41, param0)) {
            return null;
        }
        if (param1 != 31662) {
            int discarded$0 = ((eg) this).c((String) null, ((int[]) ((eg) this).field_c[0])[16]);
        }
        if (!(((eg) this).field_i.field_i[param0] != 1)) {
            return ((eg) this).b(0, 26219, param0);
        }
        throw new RuntimeException();
    }

    final int a(int param0, byte param1) {
        if (param1 != -60) {
            ((eg) this).field_c[1] = null;
        }
        if (!(this.b(-35, param0))) {
            return 0;
        }
        return ((eg) this).field_i.field_i[param0];
    }

    private final synchronized boolean b(int param0, int param1) {
        if (!(((eg) this).c(-10923))) {
            return false;
        }
        if (param1 <= -1) {
            // if_icmple L48
            // if_icmpeq L48
        } else {
            if (!ji.field_d) {
                return false;
            }
            throw new IllegalArgumentException(Integer.toString(param1));
        }
        if (param0 > -27) {
            return true;
        }
        return true;
    }

    final int c(String param0, int param1) {
        if (!(((eg) this).c(-10923))) {
            return -1;
        }
        int var3 = 94 % ((23 - param1) / 61);
        param0 = param0.toLowerCase();
        CharSequence var5 = (CharSequence) (Object) param0;
        int var4 = ((eg) this).field_i.field_l.a(ml.a(var5, -83), -140);
        if (!(this.b(-106, var4))) {
            return -1;
        }
        return var4;
    }

    final synchronized boolean c(int param0) {
        if (null == ((eg) this).field_i) {
            ((eg) this).field_i = ((eg) this).field_e.d((byte) 122);
            if (((eg) this).field_i == null) {
                return false;
            }
            ((eg) this).field_c = new Object[((eg) this).field_i.field_f];
            ((eg) this).field_b = new Object[((eg) this).field_i.field_f][];
        }
        if (param0 != -10923) {
            return false;
        }
        return true;
    }

    final int b(String param0, int param1) {
        if (!(((eg) this).c(-10923))) {
            return 0;
        }
        if (param1 <= 79) {
            return 91;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((eg) this).field_i.field_l.a(ml.a(var4, 80), -140);
        return ((eg) this).a(var3, -23760);
    }

    final boolean a(boolean param0, String param1, String param2) {
        if (!(((eg) this).c(-10923))) {
            return false;
        }
        param2 = param2.toLowerCase();
        param1 = param1.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param2;
        int var4 = ((eg) this).field_i.field_l.a(ml.a(var6, 71), -140);
        if (!this.b(-43, var4)) {
            return false;
        }
        CharSequence var7 = (CharSequence) (Object) param1;
        int var5 = ((eg) this).field_i.field_c[var4].a(ml.a(var7, -78), -140);
        if (!param0) {
            return false;
        }
        return ((eg) this).a(var4, var5, !param0 ? true : false);
    }

    final boolean a(String param0, int param1) {
        if (!((eg) this).c(-10923)) {
            return false;
        }
        if (param1 != -24417) {
            ((eg) this).field_e = null;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((eg) this).field_i.field_l.a(ml.a(var4, 82), -140);
        return ((eg) this).a(true, var3);
    }

    public static void a(boolean param0) {
        field_d = null;
        field_g = null;
        if (param0) {
            eg.a(true);
        }
        field_a = null;
    }

    final byte[] b(int param0, int param1, int param2) {
        if (param1 != 26219) {
            int discarded$0 = ((eg) this).a(-55, 23);
        }
        return this.a(param0, param2, -10452, (int[]) null);
    }

    final synchronized boolean a(int param0, int param1, boolean param2) {
        if (!(this.a(param1, 0, param0))) {
            return false;
        }
        if (null != ((eg) this).field_b[param0]) {
            if (((eg) this).field_b[param0][param1] != null) {
                return true;
            }
        }
        if (param2) {
            ((eg) this).field_e = null;
        }
        if (!(((eg) this).field_c[param0] == null)) {
            return true;
        }
        this.c(param0, -125);
        if (null != ((eg) this).field_c[param0]) {
            return true;
        }
        return false;
    }

    private final synchronized void c(int param0, int param1) {
        if (param1 >= -124) {
            return;
        }
        if (((eg) this).field_h) {
            ((eg) this).field_c[param0] = (Object) (Object) ((eg) this).field_e.a(param0, true);
        } else {
            ((eg) this).field_c[param0] = bi.a(false, 0, ((eg) this).field_e.a(param0, true));
        }
    }

    private final synchronized byte[] a(int param0, int param1, int param2, int[] param3) {
        Object var5 = null;
        byte[] var5_array = null;
        byte[] var7 = null;
        if (this.a(param0, 0, param1)) {
          if (param2 == -10452) {
            L0: {
              L1: {
                var5 = null;
                if (((eg) this).field_b[param1] == null) {
                  break L1;
                } else {
                  if (null != ((eg) this).field_b[param1][param0]) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              if (this.a(param0, param3, (byte) 80, param1)) {
                break L0;
              } else {
                this.c(param1, -125);
                if (this.a(param0, param3, (byte) 84, param1)) {
                  break L0;
                } else {
                  return null;
                }
              }
            }
            if (((eg) this).field_b[param1] == null) {
              throw new RuntimeException("");
            } else {
              L2: {
                if (null != ((eg) this).field_b[param1][param0]) {
                  var7 = td.a(((eg) this).field_b[param1][param0], param2 ^ -10399, false);
                  var5_array = var7;
                  if (var7 != null) {
                    break L2;
                  } else {
                    throw new RuntimeException("");
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if (var5_array == null) {
                  break L3;
                } else {
                  if (-2 == (((eg) this).field_f ^ -1)) {
                    ((eg) this).field_b[param1][param0] = null;
                    if (-2 != (((eg) this).field_i.field_i[param1] ^ -1)) {
                      break L3;
                    } else {
                      ((eg) this).field_b[param1] = null;
                      break L3;
                    }
                  } else {
                    if ((((eg) this).field_f ^ -1) != -3) {
                      break L3;
                    } else {
                      ((eg) this).field_b[param1] = null;
                      break L3;
                    }
                  }
                }
              }
              return var5_array;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final synchronized byte[] a(String param0, String param1, int param2) {
        if (!((eg) this).c(param2 + -10922)) {
            return null;
        }
        param1 = param1.toLowerCase();
        param0 = param0.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param1;
        int var4 = ((eg) this).field_i.field_l.a(ml.a(var6, param2 ^ 79), -140);
        if (!this.b(-125, var4)) {
            return null;
        }
        CharSequence var7 = (CharSequence) (Object) param0;
        int var5 = ((eg) this).field_i.field_c[var4].a(ml.a(var7, param2 + -123), -140);
        if (param2 != -1) {
            return null;
        }
        return ((eg) this).b(var5, 26219, var4);
    }

    final boolean a(boolean param0, String param1) {
        if (!((eg) this).c(-10923)) {
            return false;
        }
        param1 = param1.toLowerCase();
        if (!param0) {
            byte[] discarded$0 = ((eg) this).a((String) ((Object[]) ((Object[]) ((eg) this).field_c[6])[19])[0], (String) ((eg) this).field_c[2], -82);
        }
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((eg) this).field_i.field_l.a(ml.a(var4, 116), -140);
        if (-1 < (var3 ^ -1)) {
            return false;
        }
        return true;
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        if (!(11 != fj.field_j)) {
            pe.h(7807);
        }
        gi.a(ii.field_f, kl.field_C, af.field_Hb, (byte) -100);
        kn.a(param0, (byte) -112, 0, 0);
        if (param1 > -15) {
            Object var3 = null;
            eg.a((java.awt.Canvas) null, (byte) -58);
        }
    }

    eg(tl param0, boolean param1, int param2) {
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
          ((eg) this).field_i = null;
          if (0 > param2) {
            break L0;
          } else {
            if ((param2 ^ -1) >= -3) {
              L1: {
                ((eg) this).field_f = param2;
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
              ((eg) this).field_h = stackIn_6_1 != 0;
              ((eg) this).field_e = param0;
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
        field_g = new int[]{2, 20, 21, 6, 5, 13};
        field_a = new int[8192];
        field_d = "Resign";
    }
}
