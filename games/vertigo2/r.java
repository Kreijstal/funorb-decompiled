/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r {
    static u[] field_k;
    int field_d;
    private Object[][] field_i;
    private Object[] field_e;
    private ab field_a;
    static int field_j;
    static long field_h;
    static int field_f;
    static int[] field_c;
    private ff field_g;
    boolean field_b;

    private final synchronized void d(int param0, byte param1) {
        if (param1 <= 99) {
            ((r) this).field_d = -46;
        }
        if (!((r) this).field_b) {
            ((r) this).field_e[param0] = oh.a(false, true, ((r) this).field_a.a(true, param0));
        } else {
            ((r) this).field_e[param0] = (Object) (Object) ((r) this).field_a.a(true, param0);
        }
    }

    final int c(int param0) {
        if (!(((r) this).b(param0 ^ param0))) {
            return -1;
        }
        return ((r) this).field_g.field_r.length;
    }

    final boolean a(String param0, String param1, boolean param2) {
        if (!((r) this).b(0)) {
            return false;
        }
        param1 = param1.toLowerCase();
        param0 = param0.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param1;
        int var4 = ((r) this).field_g.field_k.a(og.a(var6, (byte) -116), 1);
        if (!(this.c(var4, (byte) -81))) {
            return false;
        }
        if (param2) {
            boolean discarded$0 = ((r) this).a(((byte[]) ((Object[]) ((r) this).field_e[0])[0])[5]);
        }
        CharSequence var7 = (CharSequence) (Object) param0;
        int var5 = ((r) this).field_g.field_t[var4].a(og.a(var7, (byte) -121), 1);
        return ((r) this).b(0, var4, var5);
    }

    final int a(byte param0, String param1) {
        if (!(((r) this).b(0))) {
            return -1;
        }
        if (param0 < 110) {
            int discarded$0 = ((r) this).b(49, (byte) 11);
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((r) this).field_g.field_k.a(og.a(var4, (byte) -121), 1);
        if (!this.c(var3, (byte) -75)) {
            return -1;
        }
        return var3;
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        if (param2 != -20729) {
            this.d(((int[]) ((r) this).field_e[0])[8], (byte) -39);
        }
        if (!((r) this).b(param2 + 20729)) {
            return false;
        }
        if (0 <= param0) {
            if ((param1 ^ -1) <= -1) {
                if (((r) this).field_g.field_r.length > param0) {
                    if (param1 < ((r) this).field_g.field_r[param0]) {
                        return true;
                    }
                }
            }
        }
        if (!rq.field_y) {
            return false;
        }
        throw new IllegalArgumentException(param0 + " " + param1);
    }

    final synchronized byte[] a(boolean param0, int param1) {
        if (!((r) this).b(0)) {
            return null;
        }
        if (((r) this).field_g.field_r.length == 1) {
            return ((r) this).a(0, param1, (byte) -41);
        }
        if (!param0) {
            ((r) this).field_d = -20;
        }
        if (!this.c(param1, (byte) -117)) {
            return null;
        }
        if (!(((r) this).field_g.field_r[param1] != 1)) {
            return ((r) this).a(param1, 0, (byte) -72);
        }
        throw new RuntimeException();
    }

    final synchronized boolean a(int param0, byte param1) {
        if (!((r) this).b(0)) {
            return false;
        }
        if (!(1 != ((r) this).field_g.field_r.length)) {
            return ((r) this).b(0, 0, param0);
        }
        if (!this.c(param0, (byte) -96)) {
            return false;
        }
        if (!(1 != ((r) this).field_g.field_r[param0])) {
            return ((r) this).b(0, param0, 0);
        }
        int var3 = 53 / ((-28 - param1) / 51);
        throw new RuntimeException();
    }

    final synchronized int b(int param0, int param1) {
        if (!(this.c(param0, (byte) -60))) {
            return 0;
        }
        if (((r) this).field_e[param0] != null) {
            return 100;
        }
        if (param1 != 100) {
            return 31;
        }
        return ((r) this).field_a.b(param0, 57);
    }

    final int a(String param0, int param1) {
        if (!(((r) this).b(param1))) {
            return 0;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((r) this).field_g.field_k.a(og.a(var4, (byte) -119), 1);
        return ((r) this).b(var3, 100);
    }

    final byte[] a(int param0, int param1, byte param2) {
        if (param2 > -3) {
            boolean discarded$0 = this.a(7, 10, ((int[]) ((r) this).field_e[1])[6]);
        }
        return this.a(param0, param1, 97, (int[]) null);
    }

    final synchronized boolean a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Vertigo2.field_L ? 1 : 0;
        if (((r) this).b(param0 ^ -112)) {
          var2 = 1;
          if (param0 == -112) {
            var3 = 0;
            L0: while (true) {
              if (var3 >= ((r) this).field_g.field_e.length) {
                return var2 != 0;
              } else {
                var4 = ((r) this).field_g.field_e[var3];
                if (((r) this).field_e[var4] == null) {
                  this.d(var4, (byte) 116);
                  if (((r) this).field_e[var4] == null) {
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
            return ((boolean[]) ((Object[]) ((r) this).field_e[0])[1])[0];
          }
        } else {
          return false;
        }
    }

    final synchronized int[] a(int param0, int param1) {
        int[] var6 = null;
        int var4 = 0;
        int var5 = Vertigo2.field_L ? 1 : 0;
        if (!this.c(param1, (byte) -85)) {
            return null;
        }
        if (param0 != 0) {
            return null;
        }
        int[] var3 = ((r) this).field_g.field_g[param1];
        if (!(var3 != null)) {
            var6 = new int[((r) this).field_g.field_h[param1]];
            var3 = var6;
            for (var4 = 0; var6.length > var4; var4++) {
                var6[var4] = var4;
            }
        }
        return var3;
    }

    final synchronized byte[] a(String param0, String param1, int param2) {
        if (!((r) this).b(param2 + param2)) {
            return null;
        }
        param0 = param0.toLowerCase();
        param1 = param1.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param0;
        int var4 = ((r) this).field_g.field_k.a(og.a(var6, (byte) -94), param2 ^ 1);
        if (!this.c(var4, (byte) -109)) {
            return null;
        }
        CharSequence var7 = (CharSequence) (Object) param1;
        int var5 = ((r) this).field_g.field_t[var4].a(og.a(var7, (byte) -122), 1);
        return ((r) this).a(var4, var5, (byte) -125);
    }

    final int b(int param0, byte param1) {
        if (!(this.c(param0, (byte) -52))) {
            return 0;
        }
        if (param1 >= -27) {
            ((r) this).field_e = null;
        }
        return ((r) this).field_g.field_r[param0];
    }

    private final synchronized boolean b(int param0, int param1, int param2, int[] param3) {
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
        ed var26 = null;
        byte[] var27 = null;
        ed var29 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        ed var32 = null;
        int[] var34 = null;
        byte[] var36 = null;
        byte[] var37 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        int[] var42 = null;
        byte[] var44 = null;
        byte[] var45 = null;
        int[] var47 = null;
        byte[][] var48 = null;
        int[] var50 = null;
        byte[] var51 = null;
        byte[] var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        int[] var55 = null;
        byte[][] var56 = null;
        byte[] var57 = null;
        var22 = Vertigo2.field_L ? 1 : 0;
        if (this.c(param1, (byte) -114)) {
          if (((r) this).field_e[param1] == null) {
            return false;
          } else {
            L0: {
              var5 = ((r) this).field_g.field_h[param1];
              var50 = ((r) this).field_g.field_g[param1];
              var42 = var50;
              var34 = var42;
              var24 = var34;
              var6 = var24;
              if (null == ((r) this).field_i[param1]) {
                ((r) this).field_i[param1] = new Object[((r) this).field_g.field_r[param1]];
                break L0;
              } else {
                break L0;
              }
            }
            var7 = ((r) this).field_i[param1];
            var8 = 1;
            var9_int = param0;
            L1: while (true) {
              L2: {
                if (var5 <= var9_int) {
                  break L2;
                } else {
                  L3: {
                    if (var6 == null) {
                      var10 = var9_int;
                      break L3;
                    } else {
                      var10 = var50[var9_int];
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
              if (var8 != 0) {
                return true;
              } else {
                L4: {
                  L5: {
                    if (param3 == null) {
                      break L5;
                    } else {
                      L6: {
                        if (param3[0] != -1) {
                          break L6;
                        } else {
                          if (-1 != param3[1]) {
                            break L6;
                          } else {
                            if (-1 != param3[2]) {
                              break L6;
                            } else {
                              if (-1 == param3[3]) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                      }
                      var51 = pc.a((byte) 6, true, ((r) this).field_e[param1]);
                      var26 = new ed(var51);
                      var26.a(param3, var26.field_p.length, 5, -123);
                      var52 = var51;
                      break L4;
                    }
                  }
                  var52 = pc.a((byte) 6, false, ((r) this).field_e[param1]);
                  var44 = var52;
                  var36 = var44;
                  var9 = var36;
                  break L4;
                }
                L7: {
                  var53 = hm.a(-20595, var52);
                  var45 = var53;
                  var37 = var45;
                  var27 = var37;
                  var23 = var27;
                  var54 = var23;
                  if (((r) this).field_b) {
                    ((r) this).field_e[param1] = null;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (1 < var5) {
                    var53 = var45;
                    if ((((r) this).field_d ^ -1) == -3) {
                      var11 = var53.length;
                      var11--;
                      var12 = var23[var11] & 255;
                      var11 = var11 - 4 * var5 * var12;
                      var32 = new ed(var54);
                      var14 = 0;
                      var32.field_u = var11;
                      var15 = 0;
                      var16 = 0;
                      L9: while (true) {
                        if (var12 <= var16) {
                          if (var14 == 0) {
                            return true;
                          } else {
                            var57 = new byte[var14];
                            var14 = 0;
                            var32.field_u = var11;
                            var17 = 0;
                            var18 = 0;
                            L10: while (true) {
                              if (var12 <= var18) {
                                var7[var15] = (Object) (Object) var57;
                                break L8;
                              } else {
                                var19 = 0;
                                var20 = 0;
                                L11: while (true) {
                                  if (var5 <= var20) {
                                    var18++;
                                    continue L10;
                                  } else {
                                    L12: {
                                      var19 = var19 + var32.b(true);
                                      if (var6 == null) {
                                        var21 = var20;
                                        break L12;
                                      } else {
                                        var21 = var50[var20];
                                        break L12;
                                      }
                                    }
                                    L13: {
                                      if (var21 != param2) {
                                        break L13;
                                      } else {
                                        qq.a(var54, var17, var57, var14, var19);
                                        var14 = var14 + var19;
                                        break L13;
                                      }
                                    }
                                    var17 = var17 + var19;
                                    var20++;
                                    continue L11;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var17 = 0;
                          var18 = 0;
                          L14: while (true) {
                            if (var5 <= var18) {
                              var16++;
                              continue L9;
                            } else {
                              L15: {
                                var17 = var17 + var32.b(true);
                                if (var6 != null) {
                                  var19 = var50[var18];
                                  break L15;
                                } else {
                                  var19 = var18;
                                  break L15;
                                }
                              }
                              if (var19 == param2) {
                                var15 = var19;
                                var14 = var14 + var17;
                                var18++;
                                continue L14;
                              } else {
                                var18++;
                                continue L14;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var11 = var53.length;
                      var11--;
                      var12 = 255 & var23[var11];
                      var11 = var11 - 4 * var5 * var12;
                      var29 = new ed(var54);
                      var55 = new int[var5];
                      var47 = var55;
                      var39 = var47;
                      var30 = var39;
                      var14_ref_int__ = var30;
                      var29.field_u = var11;
                      var15 = 0;
                      L16: while (true) {
                        if (var15 >= var12) {
                          var56 = new byte[var5][];
                          var48 = var56;
                          var40 = var48;
                          var31 = var40;
                          var15_ref_byte____ = var31;
                          var16 = 0;
                          L17: while (true) {
                            if (var5 <= var16) {
                              var29.field_u = var11;
                              var16 = 0;
                              var17 = 0;
                              L18: while (true) {
                                if (var12 <= var17) {
                                  var17 = 0;
                                  L19: while (true) {
                                    if (var17 >= var5) {
                                      break L8;
                                    } else {
                                      L20: {
                                        if (var6 == null) {
                                          var18 = var17;
                                          break L20;
                                        } else {
                                          var18 = var50[var17];
                                          break L20;
                                        }
                                      }
                                      if (((r) this).field_d != 0) {
                                        var7[var18] = (Object) (Object) var56[var17];
                                        var17++;
                                        continue L19;
                                      } else {
                                        var7[var18] = oh.a(false, true, var56[var17]);
                                        var17++;
                                        continue L19;
                                      }
                                    }
                                  }
                                } else {
                                  var18 = 0;
                                  var19 = 0;
                                  L21: while (true) {
                                    if (var5 <= var19) {
                                      var17++;
                                      continue L18;
                                    } else {
                                      var18 = var18 + var29.b(true);
                                      qq.a(var54, var16, var56[var19], var55[var19], var18);
                                      var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                                      var16 = var16 + var18;
                                      var19++;
                                      continue L21;
                                    }
                                  }
                                }
                              }
                            } else {
                              var15_ref_byte____[var16] = new byte[var55[var16]];
                              var55[var16] = 0;
                              var16++;
                              continue L17;
                            }
                          }
                        } else {
                          var16 = 0;
                          var17 = 0;
                          L22: while (true) {
                            if (var5 <= var17) {
                              var15++;
                              continue L16;
                            } else {
                              var16 = var16 + var29.b(true);
                              var14_ref_int__[var17] = var14_ref_int__[var17] + var16;
                              var17++;
                              continue L22;
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
                    if (((r) this).field_d == 0) {
                      var7[var11] = oh.a(false, true, var54);
                      break L8;
                    } else {
                      var7[var11] = (Object) (Object) var53;
                      return true;
                    }
                  }
                }
                return true;
              }
            }
          }
        } else {
          return false;
        }
    }

    final synchronized boolean b(int param0, int param1, int param2) {
        if (param0 != 0) {
            int discarded$0 = ((r) this).c(-100);
        }
        if (!this.a(param1, param2, param0 + -20729)) {
            return false;
        }
        if (((r) this).field_i[param1] != null) {
            if (null != ((r) this).field_i[param1][param2]) {
                return true;
            }
        }
        if (!(null == ((r) this).field_e[param1])) {
            return true;
        }
        this.d(param1, (byte) 122);
        if (((r) this).field_e[param1] != null) {
            return true;
        }
        return false;
    }

    final int a(int param0, String param1, int param2) {
        if (!this.c(param0, (byte) -43)) {
            return -1;
        }
        param1 = param1.toLowerCase();
        CharSequence var5 = (CharSequence) (Object) param1;
        int var4 = ((r) this).field_g.field_t[param0].a(og.a(var5, (byte) -108), 1);
        if (!(this.a(param0, var4, -20729))) {
            return -1;
        }
        if (param2 < 93) {
            field_c = null;
        }
        return var4;
    }

    public static void a(int param0) {
        if (param0 > -49) {
            return;
        }
        field_c = null;
        field_k = null;
    }

    private final synchronized byte[] a(int param0, int param1, int param2, int[] param3) {
        Object var5 = null;
        byte[] var5_array = null;
        int var6 = 0;
        byte[] var7 = null;
        if (this.a(param0, param1, -20729)) {
          L0: {
            L1: {
              var5 = null;
              if (null == ((r) this).field_i[param0]) {
                break L1;
              } else {
                if (null == ((r) this).field_i[param0][param1]) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            if (this.b(0, param0, param1, param3)) {
              break L0;
            } else {
              this.d(param0, (byte) 107);
              if (this.b(0, param0, param1, param3)) {
                break L0;
              } else {
                return null;
              }
            }
          }
          var6 = -41 % ((37 - param2) / 47);
          if (null != ((r) this).field_i[param0]) {
            L2: {
              if (null == ((r) this).field_i[param0][param1]) {
                break L2;
              } else {
                var7 = pc.a((byte) 6, false, ((r) this).field_i[param0][param1]);
                var5_array = var7;
                if (var7 == null) {
                  throw new RuntimeException("");
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (var5_array == null) {
                break L3;
              } else {
                if (((r) this).field_d != -2) {
                  if ((((r) this).field_d ^ -1) == -3) {
                    ((r) this).field_i[param0] = null;
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  ((r) this).field_i[param0][param1] = null;
                  if (-2 != ((r) this).field_g.field_r[param0]) {
                    break L3;
                  } else {
                    ((r) this).field_i[param0] = null;
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
          return null;
        }
    }

    final boolean c(String param0, int param1) {
        if (!((r) this).b(param1 ^ param1)) {
            return false;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((r) this).field_g.field_k.a(og.a(var4, (byte) -100), param1 + 1);
        return ((r) this).c(param1 + 11321, var3);
    }

    final synchronized boolean b(int param0) {
        if (param0 != 0) {
            r.a(82);
        }
        if (((r) this).field_g == null) {
            ((r) this).field_g = ((r) this).field_a.a(true);
            if (!(null != ((r) this).field_g)) {
                return false;
            }
            ((r) this).field_e = new Object[((r) this).field_g.field_p];
            ((r) this).field_i = new Object[((r) this).field_g.field_p][];
        }
        return true;
    }

    final synchronized boolean c(int param0, int param1) {
        if (!this.c(param1, (byte) -121)) {
            return false;
        }
        if (null != ((r) this).field_e[param1]) {
            return true;
        }
        this.d(param1, (byte) 111);
        if (!(((r) this).field_e[param1] == null)) {
            return true;
        }
        if (param0 != 11321) {
            return ((boolean[]) ((r) this).field_e[7])[0];
        }
        return false;
    }

    final synchronized int d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Vertigo2.field_L ? 1 : 0;
        if (((r) this).b(0)) {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (((r) this).field_e.length <= var4) {
              if (param0 == var2) {
                return 100;
              } else {
                var4 = 100 * var3 / var2;
                return var4;
              }
            } else {
              if (-1 > ((r) this).field_g.field_h[var4]) {
                var2 += 100;
                var3 = var3 + ((r) this).b(var4, 100);
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

    final boolean b(String param0, int param1) {
        if (!((r) this).b(param1 + 1)) {
            return false;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((r) this).field_g.field_k.a(og.a(var4, (byte) -103), 1);
        if ((var3 ^ -1) <= param1) {
            return true;
        }
        return false;
    }

    private final synchronized boolean c(int param0, byte param1) {
        if (((r) this).b(0)) {
          L0: {
            if (param0 < 0) {
              break L0;
            } else {
              if (((r) this).field_g.field_r.length <= param0) {
                break L0;
              } else {
                if (((r) this).field_g.field_r[param0] != 0) {
                  if (param1 < -38) {
                    return true;
                  } else {
                    int discarded$2 = ((r) this).b(91, (byte) 121);
                    return true;
                  }
                } else {
                  break L0;
                }
              }
            }
          }
          if (!rq.field_y) {
            return false;
          } else {
            throw new IllegalArgumentException(Integer.toString(param0));
          }
        } else {
          return false;
        }
    }

    r(ab param0, boolean param1, int param2) {
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
          ((r) this).field_g = null;
          if (param2 < 0) {
            break L0;
          } else {
            if (param2 <= 2) {
              L1: {
                ((r) this).field_a = param0;
                ((r) this).field_d = param2;
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
              ((r) this).field_b = stackIn_6_1 != 0;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("");
    }

    static {
    }
}
