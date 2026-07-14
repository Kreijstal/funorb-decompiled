/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf {
    private Object[][] field_h;
    static vl field_i;
    static int field_c;
    private bc field_g;
    int field_l;
    private ko field_k;
    private Object[] field_j;
    static cp field_f;
    static String field_e;
    boolean field_b;
    static jp[] field_a;
    static int[] field_d;

    public static void a(boolean param0) {
        field_e = null;
        field_f = null;
        field_a = null;
        if (param0) {
            Object var2 = null;
            lo discarded$0 = mf.a((byte) -93, (String) null);
        }
        field_i = null;
        field_d = null;
    }

    final synchronized byte[] a(int param0, String param1, String param2) {
        if (!((mf) this).a((byte) -127)) {
            return null;
        }
        param1 = param1.toLowerCase();
        param2 = param2.toLowerCase();
        int var5 = 110 % ((param0 - 33) / 51);
        CharSequence var7 = (CharSequence) (Object) param1;
        int var4 = ((mf) this).field_k.field_n.a(ni.a(-128, var7), (byte) -94);
        if (!this.b(0, var4)) {
            return null;
        }
        CharSequence var8 = (CharSequence) (Object) param2;
        int var6 = ((mf) this).field_k.field_i[var4].a(ni.a(-110, var8), (byte) -106);
        return ((mf) this).a(var6, var4, 4);
    }

    private final synchronized void a(int param0, byte param1) {
        if (param1 != -78) {
            return;
        }
        if (!((mf) this).field_b) {
            ((mf) this).field_j[param0] = eg.a(param1 + -39, ((mf) this).field_g.a(param0, (byte) -51), false);
        } else {
            ((mf) this).field_j[param0] = (Object) (Object) ((mf) this).field_g.a(param0, (byte) -121);
        }
    }

    final synchronized boolean a(byte param0) {
        if (param0 != -127) {
            return false;
        }
        if (null != ((mf) this).field_k) {
            return true;
        }
        ((mf) this).field_k = ((mf) this).field_g.b((byte) -112);
        if (((mf) this).field_k == null) {
            return false;
        }
        ((mf) this).field_h = new Object[((mf) this).field_k.field_f][];
        ((mf) this).field_j = new Object[((mf) this).field_k.field_f];
        return true;
    }

    final int c(int param0, int param1) {
        if (param0 > -69) {
            ((byte[]) ((mf) this).field_j[0])[0] = (byte) 85;
        }
        if (!(this.b(0, param1))) {
            return 0;
        }
        return ((mf) this).field_k.field_l[param1];
    }

    final boolean a(String param0, int param1) {
        if (!(((mf) this).a((byte) -127))) {
            return false;
        }
        param0 = param0.toLowerCase();
        if (param1 != -28138) {
            field_a = null;
        }
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((mf) this).field_k.field_n.a(ni.a(param1 + 28015, var4), (byte) -85);
        return ((mf) this).a(param1 + 15055, var3);
    }

    final int c(int param0) {
        if (!((mf) this).a((byte) -127)) {
            return -1;
        }
        if (param0 >= -86) {
            field_d = null;
        }
        return ((mf) this).field_k.field_l.length;
    }

    final int a(String param0, boolean param1) {
        if (!(((mf) this).a((byte) -127))) {
            return -1;
        }
        if (param1) {
            Object var4 = null;
            int discarded$0 = ((mf) this).a((String) null, true);
        }
        param0 = param0.toLowerCase();
        CharSequence var5 = (CharSequence) (Object) param0;
        int var3 = ((mf) this).field_k.field_n.a(ni.a(-121, var5), (byte) -86);
        if (!this.b(0, var3)) {
            return -1;
        }
        return var3;
    }

    final boolean a(String param0, String param1, int param2) {
        if (!(((mf) this).a((byte) -127))) {
            return false;
        }
        param1 = param1.toLowerCase();
        param0 = param0.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param1;
        int var4 = ((mf) this).field_k.field_n.a(ni.a(-112, var6), (byte) -91);
        if (!(this.b(param2, var4))) {
            return false;
        }
        CharSequence var7 = (CharSequence) (Object) param0;
        int var5 = ((mf) this).field_k.field_i[var4].a(ni.a(-109, var7), (byte) -114);
        return ((mf) this).a(var5, var4, (byte) 102);
    }

    final synchronized int d(int param0, int param1) {
        if (!this.b(0, param0)) {
            return 0;
        }
        if (param1 != -27509) {
            field_a = null;
        }
        if (null != ((mf) this).field_j[param0]) {
            return 100;
        }
        return ((mf) this).field_g.a((byte) -97, param0);
    }

    final synchronized byte[] b(int param0, byte param1) {
        if (!((mf) this).a((byte) -127)) {
            return null;
        }
        if (1 == ((mf) this).field_k.field_l.length) {
            return ((mf) this).a(param0, 0, 4);
        }
        if (!this.b(0, param0)) {
            return null;
        }
        if (!(-2 != (((mf) this).field_k.field_l[param0] ^ -1))) {
            return ((mf) this).a(0, param0, 4);
        }
        if (param1 < 19) {
            return null;
        }
        throw new RuntimeException();
    }

    final synchronized boolean a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (!((mf) this).a((byte) -127)) {
          return false;
        } else {
          L0: {
            var2 = 1;
            var3 = 0;
            if (param0 > 88) {
              break L0;
            } else {
              var6 = null;
              byte[] discarded$2 = ((mf) this).a(-39, (String) ((mf) this).field_j[1], (String) null);
              break L0;
            }
          }
          L1: while (true) {
            if (var3 >= ((mf) this).field_k.field_g.length) {
              return var2 != 0;
            } else {
              var4 = ((mf) this).field_k.field_g[var3];
              if (null == ((mf) this).field_j[var4]) {
                this.a(var4, (byte) -78);
                if (((mf) this).field_j[var4] == null) {
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

    final int b(int param0, String param1) {
        if (!((mf) this).a((byte) -127)) {
            return 0;
        }
        if (param0 != 0) {
            return 48;
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((mf) this).field_k.field_n.a(ni.a(-120, var4), (byte) -94);
        return ((mf) this).d(var3, -27509);
    }

    final boolean a(int param0, String param1) {
        if (!((mf) this).a((byte) -127)) {
            return false;
        }
        param1 = param1.toLowerCase();
        int var3 = 12 % ((param0 - 59) / 33);
        CharSequence var5 = (CharSequence) (Object) param1;
        int var4 = ((mf) this).field_k.field_n.a(ni.a(-128, var5), (byte) -84);
        if ((var4 ^ -1) <= -1) {
            return true;
        }
        return false;
    }

    private final synchronized byte[] a(int param0, int param1, int param2, int[] param3) {
        Object var5 = null;
        byte[] var5_array = null;
        byte[] var7 = null;
        if (this.a(true, param2, param1)) {
          L0: {
            L1: {
              var5 = null;
              if (null == ((mf) this).field_h[param1]) {
                break L1;
              } else {
                if (null != ((mf) this).field_h[param1][param2]) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (this.a(122, param3, param1, param2)) {
              break L0;
            } else {
              this.a(param1, (byte) -78);
              if (this.a(106, param3, param1, param2)) {
                break L0;
              } else {
                return null;
              }
            }
          }
          if (param0 == 646) {
            if (((mf) this).field_h[param1] == null) {
              throw new RuntimeException("");
            } else {
              L2: {
                if (((mf) this).field_h[param1][param2] == null) {
                  break L2;
                } else {
                  var7 = be.a(false, ((mf) this).field_h[param1][param2], false);
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
                  if (-2 != (((mf) this).field_l ^ -1)) {
                    if (((mf) this).field_l != 2) {
                      break L3;
                    } else {
                      ((mf) this).field_h[param1] = null;
                      break L3;
                    }
                  } else {
                    ((mf) this).field_h[param1][param2] = null;
                    if ((((mf) this).field_k.field_l[param1] ^ -1) != -2) {
                      break L3;
                    } else {
                      ((mf) this).field_h[param1] = null;
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

    final byte[] a(int param0, int param1, int param2) {
        if (param2 != 4) {
            return null;
        }
        return this.a(646, param1, param0, (int[]) null);
    }

    final synchronized boolean a(int param0, int param1, byte param2) {
        if (!this.a(true, param0, param1)) {
            return false;
        }
        if (null != ((mf) this).field_h[param1]) {
            if (!(((mf) this).field_h[param1][param0] == null)) {
                return true;
            }
        }
        if (null != ((mf) this).field_j[param1]) {
            return true;
        }
        this.a(param1, (byte) -78);
        if (null != ((mf) this).field_j[param1]) {
            return true;
        }
        if (param2 != 102) {
            return ((boolean[]) ((mf) this).field_j[3])[5];
        }
        return false;
    }

    final synchronized int b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (((mf) this).a((byte) -127)) {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (((mf) this).field_j.length <= var4) {
              if (0 == var2) {
                return 100;
              } else {
                var4 = var3 * 100 / var2;
                if (param0 == -4126) {
                  return var4;
                } else {
                  return 74;
                }
              }
            } else {
              if (-1 > (((mf) this).field_k.field_m[var4] ^ -1)) {
                var2 += 100;
                var3 = var3 + ((mf) this).d(var4, -27509);
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

    private final synchronized boolean a(boolean param0, int param1, int param2) {
        if (param0) {
          if (!((mf) this).a((byte) -127)) {
            return false;
          } else {
            L0: {
              if ((param2 ^ -1) > -1) {
                break L0;
              } else {
                if (param1 < 0) {
                  break L0;
                } else {
                  if (param2 >= ((mf) this).field_k.field_l.length) {
                    break L0;
                  } else {
                    if (param1 < ((mf) this).field_k.field_l[param2]) {
                      return true;
                    } else {
                      break L0;
                    }
                  }
                }
              }
            }
            if (rn.field_n) {
              throw new IllegalArgumentException(param2 + " " + param1);
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    private final synchronized boolean b(int param0, int param1) {
        if (!(((mf) this).a((byte) -127))) {
            return false;
        }
        if (param0 <= param1) {
            if (((mf) this).field_k.field_l.length > param1) {
                if (0 != ((mf) this).field_k.field_l[param1]) {
                    return true;
                }
            }
        }
        if (rn.field_n) {
            throw new IllegalArgumentException(Integer.toString(param1));
        }
        return false;
    }

    final int a(int param0, int param1, String param2) {
        if (!this.b(0, param0)) {
            return -1;
        }
        param2 = param2.toLowerCase();
        CharSequence var5 = (CharSequence) (Object) param2;
        int var4 = ((mf) this).field_k.field_i[param0].a(ni.a(-115, var5), (byte) -109);
        if (!this.a(true, var4, param0)) {
            return -1;
        }
        if (param1 >= -13) {
            boolean discarded$0 = ((mf) this).a(((int[]) ((Object[]) ((Object[]) ((mf) this).field_j[7])[5])[0])[0]);
        }
        return var4;
    }

    final static lo a(byte param0, String param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = BrickABrac.field_J ? 1 : 0;
        int var2 = param1.length();
        for (var3 = 0; var3 < var2; var3++) {
            var4 = param1.charAt(var3);
            if (var4 < 48) {
                return null;
            }
            if (var4 > 57) {
                return null;
            }
        }
        if (param0 > -58) {
            mf.a(false);
        }
        return wg.field_c;
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
        byte[] var25 = null;
        wq var26 = null;
        byte[] var27 = null;
        wq var29 = null;
        wq var31 = null;
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
        var22 = BrickABrac.field_J ? 1 : 0;
        if (!this.b(0, param2)) {
          return false;
        } else {
          if (null == ((mf) this).field_j[param2]) {
            return false;
          } else {
            L0: {
              var5 = ((mf) this).field_k.field_m[param2];
              var48 = ((mf) this).field_k.field_h[param2];
              var41 = var48;
              var34 = var41;
              var24 = var34;
              var6 = var24;
              if (null != ((mf) this).field_h[param2]) {
                break L0;
              } else {
                ((mf) this).field_h[param2] = new Object[((mf) this).field_k.field_l[param2]];
                break L0;
              }
            }
            var7 = ((mf) this).field_h[param2];
            var8 = 1;
            var9_int = 0;
            L1: while (true) {
              L2: {
                if (var5 <= var9_int) {
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
                    if (param1 == null) {
                      break L5;
                    } else {
                      L6: {
                        if (0 != param1[0]) {
                          break L6;
                        } else {
                          if (-1 != (param1[1] ^ -1)) {
                            break L6;
                          } else {
                            if (0 != param1[2]) {
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
                      var49 = be.a(false, ((mf) this).field_j[param2], true);
                      var42 = var49;
                      var35 = var42;
                      var25 = var35;
                      var9 = var25;
                      var26 = new wq(var49);
                      var26.a(param1, 5, var26.field_k.length, (byte) 85);
                      break L4;
                    }
                  }
                  var9 = be.a(false, ((mf) this).field_j[param2], false);
                  break L4;
                }
                L7: {
                  var50 = i.a(true, var9);
                  var43 = var50;
                  var36 = var43;
                  var27 = var36;
                  var23 = var27;
                  var51 = var23;
                  if (((mf) this).field_b) {
                    var50 = var43;
                    ((mf) this).field_j[param2] = null;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  var50 = var43;
                  if (-2 <= (var5 ^ -1)) {
                    L9: {
                      if (var6 == null) {
                        var11 = 0;
                        break L9;
                      } else {
                        var11 = var48[0];
                        break L9;
                      }
                    }
                    if (0 == ((mf) this).field_l) {
                      var7[var11] = eg.a(-123, var51, false);
                      break L8;
                    } else {
                      var7[var11] = (Object) (Object) var50;
                      break L8;
                    }
                  } else {
                    if (2 != ((mf) this).field_l) {
                      var50 = var43;
                      var11 = var50.length;
                      var11--;
                      var12 = 255 & var23[var11];
                      var11 = var11 - var5 * var12 * 4;
                      var31 = new wq(var51);
                      var31.field_l = var11;
                      var53 = new int[var5];
                      var46 = var53;
                      var39 = var46;
                      var32 = var39;
                      var14 = var32;
                      var15_int = 0;
                      L10: while (true) {
                        if (var15_int >= var12) {
                          var54 = new byte[var5][];
                          var47 = var54;
                          var40 = var47;
                          var33 = var40;
                          var15 = var33;
                          var16 = 0;
                          L11: while (true) {
                            if (var16 >= var5) {
                              var31.field_l = var11;
                              var16 = 0;
                              var17 = 0;
                              L12: while (true) {
                                if (var12 <= var17) {
                                  var17 = 0;
                                  L13: while (true) {
                                    if (var17 >= var5) {
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
                                      if (-1 != (((mf) this).field_l ^ -1)) {
                                        var7[var18] = (Object) (Object) var54[var17];
                                        var17++;
                                        continue L13;
                                      } else {
                                        var7[var18] = eg.a(-128, var54[var17], false);
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
                                      var18 = var18 + var31.e(255);
                                      pm.a(var51, var16, var54[var19], var53[var19], var18);
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
                            if (var17 >= var5) {
                              var15_int++;
                              continue L10;
                            } else {
                              var16 = var16 + var31.e(255);
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
                      var11 = var11 - var12 * (var5 * 4);
                      var29 = new wq(var51);
                      var14_int = 0;
                      var15_int = 0;
                      var29.field_l = var11;
                      var16 = 0;
                      L17: while (true) {
                        if (var16 >= var12) {
                          if (var14_int != 0) {
                            var52 = new byte[var14_int];
                            var29.field_l = var11;
                            var14_int = 0;
                            var17 = 0;
                            var18 = 0;
                            L18: while (true) {
                              if (var12 <= var18) {
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
                                      var19 = var19 + var29.e(255);
                                      if (var6 == null) {
                                        var21 = var20;
                                        break L20;
                                      } else {
                                        var21 = var48[var20];
                                        break L20;
                                      }
                                    }
                                    L21: {
                                      if (param3 == var21) {
                                        pm.a(var51, var17, var52, var14_int, var19);
                                        var14_int = var14_int + var19;
                                        break L21;
                                      } else {
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
                                var17 = var17 + var29.e(255);
                                if (var6 == null) {
                                  var19 = var18;
                                  break L23;
                                } else {
                                  var19 = var48[var18];
                                  break L23;
                                }
                              }
                              if (param3 == var19) {
                                var15_int = var19;
                                var14_int = var14_int + var17;
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
                if (param0 >= 95) {
                  return true;
                } else {
                  field_i = null;
                  return true;
                }
              } else {
                return true;
              }
            }
          }
        }
    }

    final synchronized boolean a(int param0, int param1) {
        if (!this.b(0, param1)) {
            return false;
        }
        if (param0 != -13083) {
            boolean discarded$0 = this.a(-71, (int[]) null, ((int[]) ((Object[]) ((Object[]) ((mf) this).field_j[6])[0])[3])[7], -35);
        }
        if (!(null == ((mf) this).field_j[param1])) {
            return true;
        }
        this.a(param1, (byte) -78);
        if (((mf) this).field_j[param1] == null) {
            return false;
        }
        return true;
    }

    final boolean a(String param0, String param1, byte param2) {
        if (!(((mf) this).a((byte) -127))) {
            return false;
        }
        param1 = param1.toLowerCase();
        param0 = param0.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param1;
        int var4 = ((mf) this).field_k.field_n.a(ni.a(param2 ^ 4, var6), (byte) -114);
        if (!(-1 >= (var4 ^ -1))) {
            return false;
        }
        CharSequence var7 = (CharSequence) (Object) param0;
        int var5 = ((mf) this).field_k.field_i[var4].a(ni.a(-120, var7), (byte) -105);
        if (!(0 <= var5)) {
            return false;
        }
        if (param2 != -121) {
            int discarded$0 = ((mf) this).b(-9);
            return true;
        }
        return true;
    }

    mf(bc param0, boolean param1, int param2) {
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackOut_3_0;
        Object stackOut_5_0;
        int stackOut_5_1;
        Object stackOut_4_0;
        int stackOut_4_1;
        L0: {
          ((mf) this).field_k = null;
          if ((param2 ^ -1) > -1) {
            break L0;
          } else {
            if ((param2 ^ -1) >= -3) {
              L1: {
                ((mf) this).field_g = param0;
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
              ((mf) this).field_b = stackIn_6_1 != 0;
              ((mf) this).field_l = param2;
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
        field_i = new vl();
        field_e = "Type your email address again to make sure it's correct";
    }
}
