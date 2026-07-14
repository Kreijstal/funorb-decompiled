/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh {
    private boolean field_d;
    private gi field_i;
    static vb field_p;
    private int field_h;
    static ik field_c;
    static mj field_f;
    static String field_b;
    private Object[][] field_l;
    private rf field_m;
    static int field_a;
    private Object[] field_g;
    static String field_o;
    static ed field_k;
    static boolean[] field_j;
    static String field_e;
    static sf field_n;

    private final synchronized boolean a(int[] param0, int param1, int param2, int param3) {
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
        ni var26 = null;
        byte[] var27 = null;
        ni var29 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        ni var32 = null;
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
        var22 = fleas.field_A ? 1 : 0;
        if (!this.a(true, param1)) {
          return false;
        } else {
          if (null != ((rh) this).field_g[param1]) {
            L0: {
              var5 = ((rh) this).field_m.field_f[param1];
              var50 = ((rh) this).field_m.field_h[param1];
              var42 = var50;
              var34 = var42;
              var24 = var34;
              var6 = var24;
              if (null == ((rh) this).field_l[param1]) {
                ((rh) this).field_l[param1] = new Object[((rh) this).field_m.field_v[param1]];
                break L0;
              } else {
                break L0;
              }
            }
            var7 = ((rh) this).field_l[param1];
            var8 = 1;
            var9_int = param2;
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
                  if (var7[var10] != null) {
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
                    if (param0 == null) {
                      break L5;
                    } else {
                      L6: {
                        if (0 != param0[0]) {
                          break L6;
                        } else {
                          if (-1 != param0[1]) {
                            break L6;
                          } else {
                            if (-1 != param0[2]) {
                              break L6;
                            } else {
                              if (-1 == (param0[3] ^ -1)) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                      }
                      var51 = jg.a(false, ((rh) this).field_g[param1], true);
                      var26 = new ni(var51);
                      var26.a(param0, 5, -1, var26.field_k.length);
                      var52 = var51;
                      break L4;
                    }
                  }
                  var52 = jg.a(false, ((rh) this).field_g[param1], false);
                  var44 = var52;
                  var36 = var44;
                  var9 = var36;
                  break L4;
                }
                L7: {
                  var53 = qi.a(var52, -22518);
                  var45 = var53;
                  var37 = var45;
                  var27 = var37;
                  var23 = var27;
                  var54 = var23;
                  if (((rh) this).field_d) {
                    ((rh) this).field_g[param1] = null;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (-2 > (var5 ^ -1)) {
                    var53 = var45;
                    if (((rh) this).field_h == 2) {
                      var53 = var45;
                      var11 = var53.length;
                      var11--;
                      var12 = 255 & var23[var11];
                      var11 = var11 - var12 * var5 * 4;
                      var32 = new ni(var54);
                      var14 = 0;
                      var15 = 0;
                      var32.field_i = var11;
                      var16 = 0;
                      L9: while (true) {
                        if (var16 >= var12) {
                          if (var14 == 0) {
                            return true;
                          } else {
                            var57 = new byte[var14];
                            var14 = 0;
                            var32.field_i = var11;
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
                                      var19 = var19 + var32.c((byte) -70);
                                      if (var6 != null) {
                                        var21 = var50[var20];
                                        break L12;
                                      } else {
                                        var21 = var20;
                                        break L12;
                                      }
                                    }
                                    L13: {
                                      if (param3 != var21) {
                                        break L13;
                                      } else {
                                        dm.a(var54, var17, var57, var14, var19);
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
                            if (var18 >= var5) {
                              var16++;
                              continue L9;
                            } else {
                              L15: {
                                var17 = var17 + var32.c((byte) -91);
                                if (var6 != null) {
                                  var19 = var50[var18];
                                  break L15;
                                } else {
                                  var19 = var18;
                                  break L15;
                                }
                              }
                              if (var19 == param3) {
                                var14 = var14 + var17;
                                var15 = var19;
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
                      var12 = var23[var11] & 255;
                      var11 = var11 - 4 * (var5 * var12);
                      var29 = new ni(var54);
                      var55 = new int[var5];
                      var47 = var55;
                      var39 = var47;
                      var30 = var39;
                      var14_ref_int__ = var30;
                      var29.field_i = var11;
                      var15 = 0;
                      L16: while (true) {
                        if (var12 <= var15) {
                          var56 = new byte[var5][];
                          var48 = var56;
                          var40 = var48;
                          var31 = var40;
                          var15_ref_byte____ = var31;
                          var16 = 0;
                          L17: while (true) {
                            if (var16 >= var5) {
                              var29.field_i = var11;
                              var16 = 0;
                              var17 = 0;
                              L18: while (true) {
                                if (var17 >= var12) {
                                  var17 = 0;
                                  L19: while (true) {
                                    if (var17 >= var5) {
                                      break L8;
                                    } else {
                                      L20: {
                                        if (var6 != null) {
                                          var18 = var50[var17];
                                          break L20;
                                        } else {
                                          var18 = var17;
                                          break L20;
                                        }
                                      }
                                      if (((rh) this).field_h == 0) {
                                        var7[var18] = kh.a(false, var56[var17], -137);
                                        var17++;
                                        continue L19;
                                      } else {
                                        var7[var18] = (Object) (Object) var56[var17];
                                        var17++;
                                        continue L19;
                                      }
                                    }
                                  }
                                } else {
                                  var18 = 0;
                                  var19 = 0;
                                  L21: while (true) {
                                    if (var19 >= var5) {
                                      var17++;
                                      continue L18;
                                    } else {
                                      var18 = var18 + var29.c((byte) -35);
                                      dm.a(var54, var16, var56[var19], var55[var19], var18);
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
                            if (var17 >= var5) {
                              var15++;
                              continue L16;
                            } else {
                              var16 = var16 + var29.c((byte) -123);
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
                      if (var6 == null) {
                        var11 = 0;
                        break L23;
                      } else {
                        var11 = var50[0];
                        break L23;
                      }
                    }
                    if (((rh) this).field_h != 0) {
                      var7[var11] = (Object) (Object) var54;
                      break L8;
                    } else {
                      var7[var11] = kh.a(false, var53, -137);
                      return true;
                    }
                  }
                }
                return true;
              }
            }
          } else {
            return false;
          }
        }
    }

    final synchronized boolean a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = fleas.field_A ? 1 : 0;
        if (!((rh) this).b((byte) -126)) {
          return false;
        } else {
          L0: {
            var2 = 1;
            if (param0 <= -12) {
              break L0;
            } else {
              ((long[]) ((rh) this).field_g[3])[7] = ((long[]) ((rh) this).field_g[3])[8];
              break L0;
            }
          }
          var3 = 0;
          L1: while (true) {
            if (((rh) this).field_m.field_r.length <= var3) {
              return var2 != 0;
            } else {
              var4 = ((rh) this).field_m.field_r[var3];
              if (null == ((rh) this).field_g[var4]) {
                this.a((byte) 101, var4);
                if (((rh) this).field_g[var4] == null) {
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

    final int a(String param0, byte param1) {
        if (!(((rh) this).b((byte) -126))) {
            return -1;
        }
        if (param1 != -100) {
            ((rh) this).field_g = null;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((rh) this).field_m.field_j.a(tb.a(var4, false), (byte) 123);
        if (!(this.a(true, var3))) {
            return -1;
        }
        return var3;
    }

    final static void a(int param0, int param1, int param2, int[] param3, byte param4) {
        int[] var9 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = fleas.field_A ? 1 : 0;
        while (true) {
            param1--;
            if (0 > param1) {
                break;
            }
            var9 = param3;
            int[] var5 = var9;
            var6 = param2;
            var7 = param0;
            var9[var6] = (sc.a(16711422, var9[var6]) >> 2080550305) + var7;
            param2++;
        }
        if (param4 > -65) {
            rh.c((byte) -61);
        }
    }

    final synchronized boolean b(byte param0) {
        if (((rh) this).field_m == null) {
            ((rh) this).field_m = ((rh) this).field_i.a(-1712);
            if (!(((rh) this).field_m != null)) {
                return false;
            }
            ((rh) this).field_l = new Object[((rh) this).field_m.field_i][];
            ((rh) this).field_g = new Object[((rh) this).field_m.field_i];
        }
        if (param0 > -97) {
            Object var3 = null;
            int discarded$0 = ((rh) this).a((String) null, (byte) 76);
            return true;
        }
        return true;
    }

    final boolean a(String param0, int param1) {
        if (param1 > -91) {
            boolean discarded$0 = this.a(((boolean[]) ((rh) this).field_g[0])[1], ((int[]) ((rh) this).field_g[3])[4]);
        }
        if (!(((rh) this).b((byte) -110))) {
            return false;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((rh) this).field_m.field_j.a(tb.a(var4, false), (byte) 125);
        return ((rh) this).c(var3, 14969);
    }

    final boolean a(String param0, String param1, int param2) {
        if (!((rh) this).b((byte) -102)) {
            return false;
        }
        param1 = param1.toLowerCase();
        param0 = param0.toLowerCase();
        CharSequence var7 = (CharSequence) (Object) param1;
        int var4 = ((rh) this).field_m.field_j.a(tb.a(var7, false), (byte) 121);
        if (!(this.a(true, var4))) {
            return false;
        }
        int var5 = -70 / ((-21 - param2) / 33);
        CharSequence var8 = (CharSequence) (Object) param0;
        int var6 = ((rh) this).field_m.field_k[var4].a(tb.a(var8, false), (byte) 116);
        return ((rh) this).a((byte) -29, var4, var6);
    }

    final synchronized boolean a(byte param0, int param1, int param2) {
        if (!this.a(-10, param1, param2)) {
            return false;
        }
        if (param0 != -29) {
            return ((boolean[]) ((rh) this).field_g[11])[1];
        }
        if (((rh) this).field_l[param1] != null) {
            if (!(((rh) this).field_l[param1][param2] == null)) {
                return true;
            }
        }
        if (((rh) this).field_g[param1] != null) {
            return true;
        }
        this.a((byte) 101, param1);
        if (null != ((rh) this).field_g[param1]) {
            return true;
        }
        return false;
    }

    final boolean b(String param0, int param1) {
        if (param1 != 37) {
            field_n = null;
        }
        if (!((rh) this).b((byte) -111)) {
            return false;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((rh) this).field_m.field_j.a(tb.a(var4, false), (byte) 126);
        if ((var3 ^ -1) > -1) {
            return false;
        }
        return true;
    }

    public static void c(byte param0) {
        field_o = null;
        if (param0 != -110) {
            return;
        }
        field_f = null;
        field_c = null;
        field_k = null;
        field_p = null;
        field_b = null;
        field_n = null;
        field_j = null;
        field_e = null;
    }

    final int a(int param0, String param1) {
        if (!((rh) this).b((byte) -101)) {
            return 0;
        }
        if (param0 >= -37) {
            return ((int[]) ((rh) this).field_g[13])[2];
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((rh) this).field_m.field_j.a(tb.a(var4, false), (byte) 125);
        return ((rh) this).b(var3, -2);
    }

    final int d(byte param0) {
        if (!((rh) this).b((byte) -99)) {
            return -1;
        }
        int var2 = -22 % ((-8 - param0) / 41);
        return ((rh) this).field_m.field_v.length;
    }

    final static String a(byte param0, long param1) {
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = fleas.field_A ? 1 : 0;
        if (param1 <= 0L) {
            return null;
        }
        if (6582952005840035281L <= param1) {
            return null;
        }
        if (0L == param1 % 37L) {
            return null;
        }
        int var3 = 0;
        long var4 = param1;
        while (var4 != 0L) {
            var3++;
            var4 = var4 / 37L;
        }
        StringBuilder var6 = new StringBuilder(var3);
        while (-1L != (param1 ^ -1L)) {
            var7 = param1;
            param1 = param1 / 37L;
            var9 = ic.field_db[(int)(-(param1 * 37L) + var7)];
            if (!(95 != var9)) {
                var10 = -1 + var6.length();
                var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                var9 = 160;
            }
            StringBuilder discarded$0 = var6.append(var9);
        }
        if (param0 != -70) {
            field_e = null;
        }
        StringBuilder discarded$1 = var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    final int a(String param0, byte param1, int param2) {
        if (!(this.a(true, param2))) {
            return -1;
        }
        if (param1 != -15) {
            field_b = null;
        }
        param0 = param0.toLowerCase();
        CharSequence var5 = (CharSequence) (Object) param0;
        int var4 = ((rh) this).field_m.field_k[param2].a(tb.a(var5, false), (byte) 118);
        if (!(this.a(-51, param2, var4))) {
            return -1;
        }
        return var4;
    }

    final synchronized int b(int param0, int param1) {
        if (param1 != -2) {
            return -13;
        }
        if (!this.a(true, param0)) {
            return 0;
        }
        if (null != ((rh) this).field_g[param0]) {
            return 100;
        }
        return ((rh) this).field_i.a(param0, (byte) -5);
    }

    private final synchronized boolean a(boolean param0, int param1) {
        if (param0) {
          if (((rh) this).b((byte) -124)) {
            L0: {
              if (param1 > -1) {
                break L0;
              } else {
                if (param1 >= ((rh) this).field_m.field_v.length) {
                  break L0;
                } else {
                  if (-1 != ((rh) this).field_m.field_v[param1]) {
                    return true;
                  } else {
                    break L0;
                  }
                }
              }
            }
            if (!rj.field_n) {
              return false;
            } else {
              throw new IllegalArgumentException(Integer.toString(param1));
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, String param5, int param6, int param7, ce param8) {
        fh.field_g = param5;
        wj.field_d = param1;
        il.field_g = param4;
        of.field_b = param3;
        pg.field_c = param6;
        if (param2 != 8737) {
            field_p = null;
        }
        b.field_a = param0;
        mh.field_x = param8;
        tj.field_c = param7;
        td.field_k = (w) (Object) new g();
        vg.field_r = new af(param8);
        gf.field_e = new uf(td.field_k, vg.field_r);
    }

    private final synchronized byte[] a(int param0, boolean param1, int[] param2, int param3) {
        Object var5 = null;
        byte[] var5_array = null;
        byte[] var7 = null;
        if (this.a(-63, param3, param0)) {
          var5 = null;
          if (param1) {
            L0: {
              L1: {
                if (null == ((rh) this).field_l[param3]) {
                  break L1;
                } else {
                  if (((rh) this).field_l[param3][param0] == null) {
                    break L1;
                  } else {
                    break L0;
                  }
                }
              }
              if (this.a(param2, param3, 0, param0)) {
                break L0;
              } else {
                this.a((byte) 101, param3);
                if (this.a(param2, param3, 0, param0)) {
                  break L0;
                } else {
                  return null;
                }
              }
            }
            if (((rh) this).field_l[param3] != null) {
              L2: {
                if (((rh) this).field_l[param3][param0] != null) {
                  var7 = jg.a(false, ((rh) this).field_l[param3][param0], false);
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
                  if (-2 == (((rh) this).field_h ^ -1)) {
                    ((rh) this).field_l[param3][param0] = null;
                    if (1 == ((rh) this).field_m.field_v[param3]) {
                      ((rh) this).field_l[param3] = null;
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    if ((((rh) this).field_h ^ -1) == -3) {
                      ((rh) this).field_l[param3] = null;
                      break L3;
                    } else {
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
            return (byte[]) ((rh) this).field_g[0];
          }
        } else {
          return null;
        }
    }

    final byte[] a(int param0, byte param1, int param2) {
        if (param1 < 113) {
            field_j = null;
        }
        return this.a(param2, true, (int[]) null, param0);
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        int var4 = -7 / ((param0 - 68) / 34);
        if (!(((rh) this).b((byte) -110))) {
            return false;
        }
        if (param1 >= 0) {
            if (-1 >= (param2 ^ -1)) {
                if (((rh) this).field_m.field_v.length > param1) {
                    if (param2 < ((rh) this).field_m.field_v[param1]) {
                        return true;
                    }
                }
            }
        }
        if (!rj.field_n) {
            return false;
        }
        throw new IllegalArgumentException(param1 + " " + param2);
    }

    final synchronized byte[] a(int param0, int param1) {
        if (!((rh) this).b((byte) -115)) {
            return null;
        }
        if (1 == ((rh) this).field_m.field_v.length) {
            return ((rh) this).a(0, (byte) 117, param0);
        }
        if (!this.a(true, param0)) {
            return null;
        }
        if (!((((rh) this).field_m.field_v[param0] ^ -1) != -2)) {
            return ((rh) this).a(param0, (byte) 116, 0);
        }
        if (param1 != 0) {
            ((rh) this).field_l = null;
        }
        throw new RuntimeException();
    }

    final int a(int param0, byte param1) {
        if (!(this.a(true, param0))) {
            return 0;
        }
        if (param1 > -91) {
            boolean discarded$0 = ((rh) this).c(-123, 42);
        }
        return ((rh) this).field_m.field_v[param0];
    }

    final synchronized byte[] a(int param0, String param1, String param2) {
        if (!((rh) this).b((byte) -128)) {
            return null;
        }
        param2 = param2.toLowerCase();
        param1 = param1.toLowerCase();
        if (param0 != 0) {
            field_k = null;
        }
        CharSequence var6 = (CharSequence) (Object) param2;
        int var4 = ((rh) this).field_m.field_j.a(tb.a(var6, false), (byte) 118);
        if (!this.a(true, var4)) {
            return null;
        }
        CharSequence var7 = (CharSequence) (Object) param1;
        int var5 = ((rh) this).field_m.field_k[var4].a(tb.a(var7, false), (byte) 117);
        return ((rh) this).a(var4, (byte) 115, var5);
    }

    private final synchronized void a(byte param0, int param1) {
        if (param0 != 101) {
            boolean discarded$0 = ((rh) this).b((String) null, ((int[]) ((Object[]) ((rh) this).field_g[3])[7])[1]);
        }
        if (!((rh) this).field_d) {
            ((rh) this).field_g[param1] = kh.a(false, ((rh) this).field_i.b(param1, false), -137);
        } else {
            ((rh) this).field_g[param1] = (Object) (Object) ((rh) this).field_i.b(param1, false);
        }
    }

    final synchronized int a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = fleas.field_A ? 1 : 0;
        if (!((rh) this).b((byte) -113)) {
          return 0;
        } else {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          if (param0 < -38) {
            L0: while (true) {
              if (var4 >= ((rh) this).field_g.length) {
                if (var2 != 0) {
                  var4 = var3 * 100 / var2;
                  return var4;
                } else {
                  return 100;
                }
              } else {
                if ((((rh) this).field_m.field_f[var4] ^ -1) < -1) {
                  var2 += 100;
                  var3 = var3 + ((rh) this).b(var4, -2);
                  var4++;
                  continue L0;
                } else {
                  var4++;
                  continue L0;
                }
              }
            }
          } else {
            return -101;
          }
        }
    }

    final synchronized boolean c(int param0, int param1) {
        if (!this.a(true, param0)) {
            return false;
        }
        if (!(null == ((rh) this).field_g[param0])) {
            return true;
        }
        this.a((byte) 101, param0);
        if (param1 != 14969) {
            return false;
        }
        if (((rh) this).field_g[param0] == null) {
            return false;
        }
        return true;
    }

    rh(gi param0, boolean param1, int param2) {
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
          ((rh) this).field_m = null;
          if ((param2 ^ -1) > -1) {
            break L0;
          } else {
            if ((param2 ^ -1) >= -3) {
              L1: {
                ((rh) this).field_h = param2;
                ((rh) this).field_i = param0;
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
              ((rh) this).field_d = stackIn_6_1 != 0;
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
        field_b = "Previous";
        field_o = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_a = 20;
        field_f = new mj();
        field_e = null;
        field_j = new boolean[]{false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false};
    }
}
