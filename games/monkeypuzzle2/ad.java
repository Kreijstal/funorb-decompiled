/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad {
    private Object[][] field_i;
    private int field_e;
    private Object[] field_h;
    private boolean field_b;
    private rf field_c;
    static String field_d;
    private wd field_a;
    static String field_j;
    static int[] field_g;
    static String field_k;
    static String field_f;

    public static void a(byte param0) {
        field_j = null;
        field_g = null;
        field_d = null;
        if (param0 != 123) {
            field_j = null;
        }
        field_k = null;
        field_f = null;
    }

    final boolean a(String param0, boolean param1, String param2) {
        if (!((ad) this).a(-22)) {
            return false;
        }
        param2 = param2.toLowerCase();
        param0 = param0.toLowerCase();
        if (!param1) {
            return true;
        }
        CharSequence var6 = (CharSequence) (Object) param2;
        int var4 = ((ad) this).field_a.field_b.a(param1, ra.a((byte) -21, var6));
        if (!this.a((byte) 115, var4)) {
            return false;
        }
        CharSequence var7 = (CharSequence) (Object) param0;
        int var5 = ((ad) this).field_a.field_t[var4].a(param1, ra.a((byte) 99, var7));
        return ((ad) this).c(var4, var5, -119);
    }

    private final synchronized byte[] a(int param0, int[] param1, int param2, byte param3) {
        Object var5 = null;
        byte[] var5_array = null;
        byte[] var7 = null;
        if (this.a(param2, param0, 0)) {
          if (param3 <= -30) {
            L0: {
              L1: {
                var5 = null;
                if (null == ((ad) this).field_i[param2]) {
                  break L1;
                } else {
                  if (((ad) this).field_i[param2][param0] != null) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              if (!this.a((byte) -12, param1, param0, param2)) {
                this.a(3, param2);
                if (this.a((byte) -12, param1, param0, param2)) {
                  break L0;
                } else {
                  return null;
                }
              } else {
                break L0;
              }
            }
            if (null == ((ad) this).field_i[param2]) {
              throw new RuntimeException("");
            } else {
              L2: {
                if (((ad) this).field_i[param2][param0] == null) {
                  break L2;
                } else {
                  var7 = uj.a(43, ((ad) this).field_i[param2][param0], false);
                  var5_array = var7;
                  if (var7 == null) {
                    throw new RuntimeException("");
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (var5_array != null) {
                  if ((((ad) this).field_e ^ -1) == -2) {
                    ((ad) this).field_i[param2][param0] = null;
                    if (((ad) this).field_a.field_r[param2] != 1) {
                      break L3;
                    } else {
                      ((ad) this).field_i[param2] = null;
                      break L3;
                    }
                  } else {
                    if (2 == ((ad) this).field_e) {
                      ((ad) this).field_i[param2] = null;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                } else {
                  break L3;
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

    final synchronized boolean c(int param0, int param1, int param2) {
        int var4 = 43 / ((param2 - 5) / 50);
        if (!(this.a(param0, param1, 0))) {
            return false;
        }
        if (((ad) this).field_i[param0] != null) {
            if (null != ((ad) this).field_i[param0][param1]) {
                return true;
            }
        }
        if (((ad) this).field_h[param0] != null) {
            return true;
        }
        this.a(3, param0);
        if (null != ((ad) this).field_h[param0]) {
            return true;
        }
        return false;
    }

    final boolean a(int param0, String param1) {
        if (param0 != 0) {
            boolean discarded$0 = ((ad) this).b(93);
        }
        if (!((ad) this).a(118)) {
            return false;
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((ad) this).field_a.field_b.a(true, ra.a((byte) 115, var4));
        return ((ad) this).a(false, var3);
    }

    final static void a(String param0, int param1, float param2) {
        pj.field_h = param2;
        be.field_d = param0;
        if (param1 != -24119) {
            field_f = null;
        }
    }

    final int c(String param0, byte param1) {
        if (!((ad) this).a(112)) {
            return -1;
        }
        if (param1 != -105) {
            field_j = null;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((ad) this).field_a.field_b.a(true, ra.a((byte) -14, var4));
        if (!(this.a((byte) 73, var3))) {
            return -1;
        }
        return var3;
    }

    final synchronized boolean a(boolean param0, int param1) {
        if (!this.a((byte) 124, param1)) {
            return false;
        }
        if (!(null == ((ad) this).field_h[param1])) {
            return true;
        }
        this.a(3, param1);
        if (((ad) this).field_h[param1] != null) {
            return true;
        }
        if (param0) {
            return ((boolean[]) ((ad) this).field_h[1])[8];
        }
        return false;
    }

    private final synchronized boolean a(byte param0, int param1) {
        if (!((ad) this).a(-18)) {
            return false;
        }
        if ((param1 ^ -1) <= -1) {
            // if_icmple L45
            // ifeq L45
        } else {
            if (!mg.field_t) {
                return false;
            }
            throw new IllegalArgumentException(Integer.toString(param1));
        }
        if (param0 < 64) {
            int discarded$0 = ((ad) this).b(0, 17);
            return true;
        }
        return true;
    }

    final boolean b(String param0, byte param1) {
        if (!((ad) this).a(-63)) {
            return false;
        }
        int var3 = 20 % ((param1 - -58) / 43);
        param0 = param0.toLowerCase();
        CharSequence var5 = (CharSequence) (Object) param0;
        int var4 = ((ad) this).field_a.field_b.a(true, ra.a((byte) 104, var5));
        if (var4 < 0) {
            return false;
        }
        return true;
    }

    private final synchronized void a(int param0, int param1) {
        if (param0 != 3) {
            return;
        }
        if (((ad) this).field_b) {
            ((ad) this).field_h[param1] = (Object) (Object) ((ad) this).field_c.b(-113, param1);
        } else {
            ((ad) this).field_h[param1] = p.a(((ad) this).field_c.b(-116, param1), (byte) 111, false);
        }
    }

    private final synchronized boolean a(byte param0, int[] param1, int param2, int param3) {
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
        gk var26 = null;
        byte[] var27 = null;
        gk var29 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        gk var32 = null;
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
        var22 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (!this.a((byte) 88, param3)) {
          return false;
        } else {
          if (((ad) this).field_h[param3] != null) {
            L0: {
              var5 = ((ad) this).field_a.field_m[param3];
              var48 = ((ad) this).field_a.field_a[param3];
              var41 = var48;
              var34 = var41;
              var24 = var34;
              var6 = var24;
              if (((ad) this).field_i[param3] != null) {
                break L0;
              } else {
                ((ad) this).field_i[param3] = new Object[((ad) this).field_a.field_r[param3]];
                break L0;
              }
            }
            var7 = ((ad) this).field_i[param3];
            var8 = 1;
            var9_int = 0;
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
                      var10 = var48[var9_int];
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
                              if (0 != param1[3]) {
                                break L6;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      var49 = uj.a(59, ((ad) this).field_h[param3], true);
                      var42 = var49;
                      var35 = var42;
                      var25 = var35;
                      var9 = var25;
                      var26 = new gk(var49);
                      var26.a(5, var26.field_g.length, -84, param1);
                      break L4;
                    }
                  }
                  var9 = uj.a(67, ((ad) this).field_h[param3], false);
                  break L4;
                }
                L7: {
                  var50 = rc.a(var9, 120);
                  var43 = var50;
                  var36 = var43;
                  var27 = var36;
                  var23 = var27;
                  var51 = var23;
                  if (param0 == -12) {
                    break L7;
                  } else {
                    int discarded$1 = ((ad) this).a((String) ((ad) this).field_h[11], (byte) 73);
                    break L7;
                  }
                }
                L8: {
                  if (((ad) this).field_b) {
                    ((ad) this).field_h[param3] = null;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if ((var5 ^ -1) < -2) {
                    var50 = var43;
                    if ((((ad) this).field_e ^ -1) == -3) {
                      var11 = var50.length;
                      var11--;
                      var12 = 255 & var23[var11];
                      var11 = var11 - 4 * var5 * var12;
                      var32 = new gk(var51);
                      var14 = 0;
                      var15 = 0;
                      var32.field_h = var11;
                      var16 = 0;
                      L10: while (true) {
                        if (var16 >= var12) {
                          if (var14 != 0) {
                            var54 = new byte[var14];
                            var14 = 0;
                            var32.field_h = var11;
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
                                  if (var20 >= var5) {
                                    var18++;
                                    continue L11;
                                  } else {
                                    L13: {
                                      var19 = var19 + var32.e(param0 + -102);
                                      if (var6 == null) {
                                        var21 = var20;
                                        break L13;
                                      } else {
                                        var21 = var48[var20];
                                        break L13;
                                      }
                                    }
                                    L14: {
                                      if (param2 == var21) {
                                        gl.a(var51, var17, var54, var14, var19);
                                        var14 = var14 + var19;
                                        break L14;
                                      } else {
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
                                var17 = var17 + var32.e(param0 ^ -118);
                                if (var6 != null) {
                                  var19 = var48[var18];
                                  break L16;
                                } else {
                                  var19 = var18;
                                  break L16;
                                }
                              }
                              if (param2 == var19) {
                                var14 = var14 + var17;
                                var15 = var19;
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
                      var12 = 255 & var23[var11];
                      var11 = var11 - var5 * var12 * 4;
                      var29 = new gk(var51);
                      var29.field_h = var11;
                      var52 = new int[var5];
                      var45 = var52;
                      var38 = var45;
                      var30 = var38;
                      var14_ref_int__ = var30;
                      var15 = 0;
                      L17: while (true) {
                        if (var12 <= var15) {
                          var53 = new byte[var5][];
                          var46 = var53;
                          var39 = var46;
                          var31 = var39;
                          var15_ref_byte____ = var31;
                          var16 = 0;
                          L18: while (true) {
                            if (var5 <= var16) {
                              var29.field_h = var11;
                              var16 = 0;
                              var17 = 0;
                              L19: while (true) {
                                if (var12 <= var17) {
                                  var17 = 0;
                                  L20: while (true) {
                                    if (var17 >= var5) {
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
                                      if (-1 != (((ad) this).field_e ^ -1)) {
                                        var7[var18] = (Object) (Object) var53[var17];
                                        var17++;
                                        continue L20;
                                      } else {
                                        var7[var18] = p.a(var53[var17], (byte) 117, false);
                                        var17++;
                                        continue L20;
                                      }
                                    }
                                  }
                                } else {
                                  var18 = 0;
                                  var19 = 0;
                                  L22: while (true) {
                                    if (var19 >= var5) {
                                      var17++;
                                      continue L19;
                                    } else {
                                      var18 = var18 + var29.e(-95);
                                      gl.a(var51, var16, var53[var19], var52[var19], var18);
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
                              var16 = var16 + var29.e(-30);
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
                      if (var6 != null) {
                        var50 = var43;
                        var11 = var48[0];
                        break L24;
                      } else {
                        var11 = 0;
                        break L24;
                      }
                    }
                    var50 = var43;
                    if (((ad) this).field_e == 0) {
                      var7[var11] = p.a(var51, (byte) 110, false);
                      break L9;
                    } else {
                      var7[var11] = (Object) (Object) var50;
                      return true;
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

    final synchronized int b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (!((ad) this).a(89)) {
          return 0;
        } else {
          L0: {
            if (param0) {
              break L0;
            } else {
              ((ad) this).field_e = 47;
              break L0;
            }
          }
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L1: while (true) {
            if (var4 >= ((ad) this).field_h.length) {
              if (-1 == (var2 ^ -1)) {
                return 100;
              } else {
                var4 = 100 * var3 / var2;
                return var4;
              }
            } else {
              if (0 < ((ad) this).field_a.field_m[var4]) {
                var3 = var3 + ((ad) this).b(var4, 11619);
                var2 += 100;
                var4++;
                continue L1;
              } else {
                var4++;
                continue L1;
              }
            }
          }
        }
    }

    final static boolean c(boolean param0) {
        if (param0) {
            field_g = null;
        }
        return oa.a((byte) -127, ii.a(false));
    }

    final byte[] b(int param0, int param1, int param2) {
        if (param0 != 255) {
            boolean discarded$0 = this.a((byte) 89, -23);
        }
        return this.a(param1, (int[]) null, param2, (byte) -85);
    }

    final synchronized byte[] a(String param0, String param1, int param2) {
        if (!((ad) this).a(85)) {
            return null;
        }
        param1 = param1.toLowerCase();
        param0 = param0.toLowerCase();
        int var5 = 26 / ((-88 - param2) / 36);
        CharSequence var7 = (CharSequence) (Object) param1;
        int var4 = ((ad) this).field_a.field_b.a(true, ra.a((byte) 125, var7));
        if (!this.a((byte) 117, var4)) {
            return null;
        }
        CharSequence var8 = (CharSequence) (Object) param0;
        int var6 = ((ad) this).field_a.field_t[var4].a(true, ra.a((byte) -59, var8));
        return ((ad) this).b(255, var6, var4);
    }

    final static boolean a(boolean param0) {
        if (param0) {
            field_j = null;
        }
        return wd.field_g;
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        if (!((ad) this).a(param2 ^ -42)) {
            return false;
        }
        if (param0 >= param2) {
            if ((param1 ^ -1) <= -1) {
                if (((ad) this).field_a.field_r.length > param0) {
                    if (param1 < ((ad) this).field_a.field_r[param0]) {
                        return true;
                    }
                }
            }
        }
        if (!mg.field_t) {
            return false;
        }
        throw new IllegalArgumentException(param0 + " " + param1);
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        if (!param1) {
            return;
        }
        mk.a("", (byte) -5, param0);
        l.a(param0, -106);
    }

    final synchronized boolean a(int param0) {
        if (((ad) this).field_a == null) {
            ((ad) this).field_a = ((ad) this).field_c.a((byte) 80);
            if (((ad) this).field_a == null) {
                return false;
            }
            ((ad) this).field_h = new Object[((ad) this).field_a.field_e];
            ((ad) this).field_i = new Object[((ad) this).field_a.field_e][];
        }
        int var2 = -110 / ((param0 - 24) / 38);
        return true;
    }

    final synchronized boolean b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (((ad) this).a(-123)) {
          var2 = 1;
          var3 = param0;
          L0: while (true) {
            if (var3 >= ((ad) this).field_a.field_f.length) {
              return var2 != 0;
            } else {
              var4 = ((ad) this).field_a.field_f[var3];
              if (((ad) this).field_h[var4] == null) {
                this.a(3, var4);
                if (null == ((ad) this).field_h[var4]) {
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

    final int a(String param0, int param1, int param2) {
        if (!this.a((byte) 96, param1)) {
            return -1;
        }
        param0 = param0.toLowerCase();
        CharSequence var5 = (CharSequence) (Object) param0;
        int var4 = ((ad) this).field_a.field_t[param1].a(true, ra.a((byte) 3, var5));
        if (param2 != -28459) {
            ((int[]) ((Object[]) ((Object[]) ((ad) this).field_h[1])[14])[2])[0] = -43;
        }
        if (!(this.a(param1, var4, 0))) {
            return -1;
        }
        return var4;
    }

    final synchronized int b(int param0, int param1) {
        if (param1 != 11619) {
            return -123;
        }
        if (!(this.a((byte) 73, param0))) {
            return 0;
        }
        if (null != ((ad) this).field_h[param0]) {
            return 100;
        }
        return ((ad) this).field_c.a(-48, param0);
    }

    ad(rf param0, boolean param1, int param2) {
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
          ((ad) this).field_a = null;
          if (0 > param2) {
            break L0;
          } else {
            if (2 >= param2) {
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
              ((ad) this).field_b = stackIn_6_1 != 0;
              ((ad) this).field_e = param2;
              ((ad) this).field_c = param0;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("");
    }

    final static int a(int param0, int param1, boolean param2, boolean param3, String param4, String param5) {
        try {
            int var6 = 0;
            String var6_ref = null;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            Object var10 = null;
            Object var11 = null;
            CharSequence var12 = null;
            int stackIn_40_0 = 0;
            int stackIn_43_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_39_0 = 0;
            int stackOut_38_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_41_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
                        if (null == ol.field_g) {
                            statePc = 2;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        if (cb.a(param1 ^ 665, param3)) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        return -1;
                    }
                    case 4: {
                        if (dk.field_h == ii.field_r) {
                            statePc = 6;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        if (!param3) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        var11 = null;
                        pj.field_b = sk.a(param4, ia.field_f, false, true, (String) null);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 8: {
                        pj.field_b = h.a(param1 ^ -739, false, param4, param5);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        gf.field_c.field_h = 0;
                        gf.field_c.b(14, -49152);
                        gf.field_c.b(pj.field_b.a(false).field_b, -49152);
                        al.a((byte) -71, -1);
                        dk.field_h = kh.field_a;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (dk.field_h == kh.field_a) {
                            statePc = 12;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        if (hj.a(1, true)) {
                            statePc = 14;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        var6 = MonkeyPuzzle2.field_D.a((byte) 114);
                        if (-1 != (var6 ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        dk.field_h = aa.field_b;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 16: {
                        dk.field_h = dk.field_d;
                        rc.field_f = -1;
                        wk.field_a = var6;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        MonkeyPuzzle2.field_D.field_h = 0;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 18: {
                        if (aa.field_b != dk.field_h) {
                            statePc = 22;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        if (hj.a(8, true)) {
                            statePc = 21;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        ld.field_a = MonkeyPuzzle2.field_D.i(127);
                        MonkeyPuzzle2.field_D.field_h = 0;
                        ki.a(param0, pj.field_b, true, param3, param2);
                        dk.field_h = qk.field_c;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 22: {
                        if (qk.field_c == dk.field_h) {
                            statePc = 24;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        if (hj.a(1, true)) {
                            statePc = 26;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        var6 = MonkeyPuzzle2.field_D.a((byte) 114);
                        df.field_o = null;
                        wk.field_a = var6;
                        MonkeyPuzzle2.field_D.field_h = 0;
                        if (var6 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    }
                    case 27: {
                        if (-2 == var6) {
                            statePc = 31;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 28: {
                        if (-9 != var6) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 29: {
                        gk.a(-1);
                        ck.field_e = false;
                        return var6;
                    }
                    case 30: {
                        dk.field_h = dk.field_d;
                        rc.field_f = -1;
                        statePc = 32;
                        continue stateLoop;
                    }
                    case 31: {
                        dk.field_h = ea.field_a;
                        rc.field_f = -1;
                        statePc = 32;
                        continue stateLoop;
                    }
                    case 32: {
                        if (dk.field_h != ea.field_a) {
                            statePc = 72;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    }
                    case 33: {
                        if (!gb.a(true)) {
                            statePc = 72;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    }
                    case 34: {
                        ia.field_f = MonkeyPuzzle2.field_D.i(103);
                        ec.field_d = MonkeyPuzzle2.field_D.a((byte) 114);
                        int discarded$14 = MonkeyPuzzle2.field_D.a((byte) 114);
                        af.field_c = MonkeyPuzzle2.field_D.j(17277);
                        var6_ref = MonkeyPuzzle2.field_D.g(-1185292952);
                        var7 = MonkeyPuzzle2.field_D.a((byte) 114);
                        if ((1 & var7) == 0) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    }
                    case 35: {
                        gd.b(-594181854);
                        statePc = 36;
                        continue stateLoop;
                    }
                    case 36: {
                        if (param3) {
                            statePc = 44;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    }
                    case 37: {
                        if ((8 & var7) == 0) {
                            statePc = 39;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    }
                    case 38: {
                        stackOut_38_0 = 1;
                        stackIn_40_0 = stackOut_38_0;
                        statePc = 40;
                        continue stateLoop;
                    }
                    case 39: {
                        stackOut_39_0 = 0;
                        stackIn_40_0 = stackOut_39_0;
                        statePc = 40;
                        continue stateLoop;
                    }
                    case 40: {
                        rh.field_B = stackIn_40_0 != 0;
                        if (0 == (var7 & 4)) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    }
                    case 41: {
                        stackOut_41_0 = 1;
                        stackIn_43_0 = stackOut_41_0;
                        statePc = 43;
                        continue stateLoop;
                    }
                    case 42: {
                        stackOut_42_0 = 0;
                        stackIn_43_0 = stackOut_42_0;
                        statePc = 43;
                        continue stateLoop;
                    }
                    case 43: {
                        fj.field_J = stackIn_43_0 != 0;
                        if (rh.field_B) {
                            statePc = 44;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    }
                    case 44: {
                        if (me.field_e) {
                            statePc = 46;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    }
                    case 46: {
                        int discarded$15 = MonkeyPuzzle2.field_D.a((byte) 114);
                        int discarded$16 = MonkeyPuzzle2.field_D.a((byte) 114);
                        int discarded$17 = MonkeyPuzzle2.field_D.e(param1 ^ 756);
                        il.field_h = MonkeyPuzzle2.field_D.j(param1 + 16627);
                        il.field_g = new byte[il.field_h];
                        var8 = 0;
                        statePc = 47;
                        continue stateLoop;
                    }
                    case 47: {
                        if (il.field_h <= var8) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    }
                    case 48: {
                        il.field_g[var8] = MonkeyPuzzle2.field_D.k(-91);
                        var8++;
                        statePc = 47;
                        continue stateLoop;
                    }
                    case 49: {
                        cl.field_e = MonkeyPuzzle2.field_D.f(-1);
                        var12 = (CharSequence) (Object) cl.field_e;
                        uj.field_f = pl.a((byte) 109, var12);
                        ue.field_G = MonkeyPuzzle2.field_D.a((byte) 114);
                        dk.field_h = wh.field_b;
                        if (pj.field_b.a(false) != te.field_a) {
                            statePc = 51;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    }
                    case 50: {
                        oe.field_l.a(false, ii.a(false));
                        statePc = 54;
                        continue stateLoop;
                    }
                    case 51: {
                        if (pj.field_b.a(false) == sj.field_g) {
                            statePc = 53;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    }
                    case 53: {
                        dh.field_d.a(false, ii.a(false));
                        statePc = 54;
                        continue stateLoop;
                    }
                    case 54: {
                        ck.field_e = false;
                        if (var6_ref != null) {
                            statePc = 56;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    }
                    case 56: {
                        pe.a(var6_ref, (byte) -108, ii.a(false));
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 57: {
                        if ((af.field_c ^ -1) < -1) {
                            statePc = 60;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    }
                    case 58: {
                        if (!fj.field_J) {
                            statePc = 63;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    }
                    case 60: {
                        try {
                            Object discarded$18 = mf.a(126, "zap", ii.a(false), new Object[1]);
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        var8_ref_Throwable = caughtException;
                        statePc = 66;
                        continue stateLoop;
                    }
                    case 63: {
                        try {
                            Object discarded$19 = mf.a(-26159, "unzap", ii.a(false));
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 65;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        var8_ref_Throwable = caughtException;
                        statePc = 66;
                        continue stateLoop;
                    }
                    case 66: {
                        if ((af.field_c ^ -1) >= -1) {
                            statePc = 68;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    }
                    case 67: {
                        mb.field_c = true;
                        statePc = 68;
                        continue stateLoop;
                    }
                    case 68: {
                        gf.field_c.a(e.field_b, param1 ^ 650);
                        var8 = 0;
                        statePc = 69;
                        continue stateLoop;
                    }
                    case 69: {
                        if (4 <= var8) {
                            statePc = 71;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    }
                    case 70: {
                        e.field_b[var8] = e.field_b[var8] + 50;
                        var8++;
                        statePc = 69;
                        continue stateLoop;
                    }
                    case 71: {
                        MonkeyPuzzle2.field_D.a(e.field_b, 0);
                        return wk.field_a;
                    }
                    case 72: {
                        if (dk.field_h != dk.field_d) {
                            statePc = 81;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    }
                    case 73: {
                        if (gb.a(true)) {
                            statePc = 75;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    }
                    case 75: {
                        gk.a(param1 + -651);
                        if ((wk.field_a ^ -1) != -8) {
                            statePc = 78;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    }
                    case 76: {
                        if (ck.field_e) {
                            statePc = 78;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    }
                    case 77: {
                        ck.field_e = true;
                        return -1;
                    }
                    case 78: {
                        if (wk.field_a != 7) {
                            statePc = 80;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    }
                    case 79: {
                        wk.field_a = 3;
                        statePc = 80;
                        continue stateLoop;
                    }
                    case 80: {
                        sl.field_n = MonkeyPuzzle2.field_D.f(-1);
                        ck.field_e = false;
                        return wk.field_a;
                    }
                    case 81: {
                        if (param1 == 650) {
                            statePc = 83;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    }
                    case 82: {
                        var10 = null;
                        int discarded$20 = ad.a(-115, 60, false, false, (String) null, (String) null);
                        statePc = 83;
                        continue stateLoop;
                    }
                    case 83: {
                        if (ol.field_g != null) {
                            statePc = 90;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    }
                    case 84: {
                        if (ck.field_e) {
                            statePc = 86;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    }
                    case 85: {
                        var6 = cg.field_g;
                        cg.field_g = id.field_m;
                        id.field_m = var6;
                        ck.field_e = true;
                        statePc = 90;
                        continue stateLoop;
                    }
                    case 86: {
                        if (30000L >= wf.a(84)) {
                            statePc = 88;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    }
                    case 87: {
                        sl.field_n = kj.field_E;
                        statePc = 89;
                        continue stateLoop;
                    }
                    case 88: {
                        sl.field_n = hh.field_p;
                        statePc = 89;
                        continue stateLoop;
                    }
                    case 89: {
                        ck.field_e = false;
                        return 3;
                    }
                    case 90: {
                        return -1;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(String param0, byte param1) {
        if (param1 != -81) {
            int discarded$0 = ((ad) this).c((String) ((ad) this).field_h[13], (byte) 11);
        }
        if (!(((ad) this).a(85))) {
            return 0;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((ad) this).field_a.field_b.a(true, ra.a((byte) -117, var4));
        return ((ad) this).b(var3, 11619);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_d = "This password contains your email address, and would be easy to guess";
        field_k = "This entry doesn't match";
        field_g = new int[5];
        field_j = "Use this alternative as your account name";
        var0 = 0;
        L0: while (true) {
          if (field_g.length <= var0) {
            field_f = "Your email address is used to identify this account";
          } else {
            L1: {
              if (-1 == (var0 ^ -1)) {
                field_g[var0] = 20 * (var0 + 1) << -1088248624;
                break L1;
              } else {
                field_g[var0] = var0 * 51 - -51 << 1319719984;
                break L1;
              }
            }
            if (2 < var0) {
              field_g[var0] = bd.a(field_g[var0], (-2 + var0) * 22 << -1695822616);
              var0++;
              continue L0;
            } else {
              var0++;
              continue L0;
            }
          }
        }
    }
}
