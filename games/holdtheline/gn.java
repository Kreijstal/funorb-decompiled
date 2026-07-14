/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gn {
    private Object[][] field_b;
    private Object[] field_c;
    static boolean field_g;
    static go field_f;
    private boolean field_d;
    private kn field_a;
    static String field_h;
    static int[] field_j;
    private ff field_i;
    private int field_e;

    final static void a(boolean param0, vi param1, byte param2, int param3) {
        ai.field_a.a(param3, 1000000, param1, (byte) -114, !param0 ? true : false, 256);
        if (param2 != 69) {
            field_h = null;
        }
    }

    final int b(int param0) {
        if (param0 != -1) {
            this.e(-20, -90);
        }
        if (!((gn) this).b((byte) -95)) {
            return -1;
        }
        return ((gn) this).field_a.field_k.length;
    }

    final synchronized int a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = HoldTheLine.field_D;
        if (((gn) this).b((byte) -85)) {
          var2 = param0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (var4 >= ((gn) this).field_c.length) {
              if (var2 != 0) {
                var4 = 100 * var3 / var2;
                return var4;
              } else {
                return 100;
              }
            } else {
              if (((gn) this).field_a.field_u[var4] > 0) {
                var3 = var3 + ((gn) this).a(96, var4);
                var2 += 100;
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

    final int a(int param0, String param1, boolean param2) {
        if (param2) {
            byte[] discarded$0 = ((gn) this).a((byte) -110, (String) ((gn) this).field_c[6]);
        }
        if (!(this.c(-1, param0))) {
            return -1;
        }
        param1 = param1.toLowerCase();
        CharSequence var5 = (CharSequence) (Object) param1;
        int var4 = ((gn) this).field_a.field_c[param0].a(an.a(var5, 0), (byte) 24);
        if (!(this.a(var4, param0, 877))) {
            return -1;
        }
        return var4;
    }

    private final synchronized boolean b(int[] param0, int param1, int param2, int param3) {
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
        th var26 = null;
        byte[] var27 = null;
        th var29 = null;
        th var31 = null;
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
        var22 = HoldTheLine.field_D;
        if (this.c(-1, param3)) {
          if (null == ((gn) this).field_c[param3]) {
            return false;
          } else {
            L0: {
              var5 = ((gn) this).field_a.field_u[param3];
              var48 = ((gn) this).field_a.field_m[param3];
              var41 = var48;
              var34 = var41;
              var24 = var34;
              var6 = var24;
              if (null == ((gn) this).field_b[param3]) {
                ((gn) this).field_b[param3] = new Object[((gn) this).field_a.field_k[param3]];
                break L0;
              } else {
                break L0;
              }
            }
            var7 = ((gn) this).field_b[param3];
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
                    if (param0 == null) {
                      break L5;
                    } else {
                      L6: {
                        if (param0[0] != 0) {
                          break L6;
                        } else {
                          if (0 != param0[1]) {
                            break L6;
                          } else {
                            if (param0[2] != -1) {
                              break L6;
                            } else {
                              if (-1 != param0[3]) {
                                break L6;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      var49 = ne.a(90, ((gn) this).field_c[param3], true);
                      var42 = var49;
                      var35 = var42;
                      var25 = var35;
                      var9 = var25;
                      var26 = new th(var49);
                      var26.a(5, var26.field_i.length, param1 ^ 12875, param0);
                      break L4;
                    }
                  }
                  var9 = ne.a(90, ((gn) this).field_c[param3], false);
                  break L4;
                }
                L7: {
                  var50 = ph.a((byte) -1, var9);
                  var43 = var50;
                  var36 = var43;
                  var27 = var36;
                  var23 = var27;
                  var51 = var23;
                  if (((gn) this).field_d) {
                    var50 = var43;
                    ((gn) this).field_c[param3] = null;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  var50 = var43;
                  if (param1 <= (var5 ^ -1)) {
                    L9: {
                      if (var6 == null) {
                        var11 = 0;
                        break L9;
                      } else {
                        var11 = var48[0];
                        break L9;
                      }
                    }
                    if (-1 == (((gn) this).field_e ^ -1)) {
                      var7[var11] = mg.a((byte) 95, var51, false);
                      break L8;
                    } else {
                      var7[var11] = (Object) (Object) var50;
                      break L8;
                    }
                  } else {
                    if (2 != ((gn) this).field_e) {
                      var50 = var43;
                      var11 = var50.length;
                      var11--;
                      var12 = var23[var11] & 255;
                      var11 = var11 - 4 * var5 * var12;
                      var31 = new th(var51);
                      var53 = new int[var5];
                      var46 = var53;
                      var39 = var46;
                      var32 = var39;
                      var14 = var32;
                      var31.field_l = var11;
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
                              var31.field_l = var11;
                              var16 = 0;
                              var17 = 0;
                              L12: while (true) {
                                if (var12 <= var17) {
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
                                      if (0 != ((gn) this).field_e) {
                                        var7[var18] = (Object) (Object) var54[var17];
                                        var17++;
                                        continue L13;
                                      } else {
                                        var7[var18] = mg.a((byte) 112, var54[var17], false);
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
                                      var18 = var18 + var31.a(-107);
                                      bc.a(var51, var16, var54[var19], var53[var19], var18);
                                      var14[var19] = var14[var19] + var18;
                                      var16 = var16 + var18;
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
                              var16 = var16 + var31.a(-83);
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
                      var29 = new th(var51);
                      var14_int = 0;
                      var29.field_l = var11;
                      var15_int = 0;
                      var16 = 0;
                      L17: while (true) {
                        if (var12 <= var16) {
                          if (var14_int == 0) {
                            return true;
                          } else {
                            var52 = new byte[var14_int];
                            var14_int = 0;
                            var29.field_l = var11;
                            var17 = 0;
                            var18 = 0;
                            L18: while (true) {
                              if (var18 >= var12) {
                                var7[var15_int] = (Object) (Object) var52;
                                return true;
                              } else {
                                var19 = 0;
                                var20 = 0;
                                L19: while (true) {
                                  if (var20 >= var5) {
                                    var18++;
                                    continue L18;
                                  } else {
                                    L20: {
                                      var19 = var19 + var29.a(91);
                                      if (var6 == null) {
                                        var21 = var20;
                                        break L20;
                                      } else {
                                        var21 = var48[var20];
                                        break L20;
                                      }
                                    }
                                    L21: {
                                      if (param2 != var21) {
                                        break L21;
                                      } else {
                                        bc.a(var51, var17, var52, var14_int, var19);
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
                                var17 = var17 + var29.a(-50);
                                if (var6 == null) {
                                  var19 = var18;
                                  break L23;
                                } else {
                                  var19 = var48[var18];
                                  break L23;
                                }
                              }
                              if (param2 == var19) {
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
                return true;
              }
            }
          }
        } else {
          return false;
        }
    }

    final boolean b(String param0, String param1, int param2) {
        if (!(((gn) this).b((byte) -49))) {
            return false;
        }
        if (param2 <= 0) {
            ((int[]) ((gn) this).field_c[15])[2] = -38;
        }
        param0 = param0.toLowerCase();
        param1 = param1.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param0;
        int var4 = ((gn) this).field_a.field_h.a(an.a(var6, 0), (byte) 24);
        if (!(this.c(-1, var4))) {
            return false;
        }
        CharSequence var7 = (CharSequence) (Object) param1;
        int var5 = ((gn) this).field_a.field_c[var4].a(an.a(var7, 0), (byte) 24);
        return ((gn) this).b(var4, var5, -1);
    }

    final synchronized int a(int param0, int param1) {
        if (param0 <= 63) {
            return -15;
        }
        if (!this.c(-1, param1)) {
            return 0;
        }
        if (!(null == ((gn) this).field_c[param1])) {
            return 100;
        }
        return ((gn) this).field_i.a(false, param1);
    }

    final byte[] a(String param0, int param1, int[] param2, String param3) {
        if (!((gn) this).b((byte) -54)) {
            return null;
        }
        param3 = param3.toLowerCase();
        param0 = param0.toLowerCase();
        CharSequence var7 = (CharSequence) (Object) param3;
        int var5 = ((gn) this).field_a.field_h.a(an.a(var7, 0), (byte) 24);
        if (!this.c(-1, var5)) {
            return null;
        }
        CharSequence var8 = (CharSequence) (Object) param0;
        int var6 = ((gn) this).field_a.field_c[var5].a(an.a(var8, param1), (byte) 24);
        return this.a(param2, var6, var5, -4599);
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        if (!((gn) this).b((byte) -113)) {
          return false;
        } else {
          L0: {
            if (param2 == 877) {
              break L0;
            } else {
              field_f = null;
              break L0;
            }
          }
          L1: {
            if (-1 < (param1 ^ -1)) {
              break L1;
            } else {
              if (0 > param0) {
                break L1;
              } else {
                if (param1 >= ((gn) this).field_a.field_k.length) {
                  break L1;
                } else {
                  if (param0 < ((gn) this).field_a.field_k[param1]) {
                    return true;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          if (!uj.field_e) {
            return false;
          } else {
            throw new IllegalArgumentException(param1 + " " + param0);
          }
        }
    }

    final int a(byte param0, int param1) {
        if (param0 < 109) {
            Object var4 = null;
            int discarded$0 = ((gn) this).a(-3, (String) null, true);
        }
        if (!this.c(-1, param1)) {
            return 0;
        }
        return ((gn) this).field_a.field_k[param1];
    }

    final synchronized byte[] b(int param0, int param1) {
        if (!((gn) this).b((byte) -94)) {
            return null;
        }
        if (param0 != 15950) {
            byte[] discarded$0 = ((gn) this).a(30, true, 45);
        }
        if (!((((gn) this).field_a.field_k.length ^ -1) != -2)) {
            return ((gn) this).a(0, true, param1);
        }
        if (!this.c(param0 + -15951, param1)) {
            return null;
        }
        if (!((((gn) this).field_a.field_k[param1] ^ -1) != -2)) {
            return ((gn) this).a(param1, true, 0);
        }
        throw new RuntimeException();
    }

    final boolean a(String param0, String param1, int param2) {
        if (!(((gn) this).b((byte) -75))) {
            return false;
        }
        param1 = param1.toLowerCase();
        param0 = param0.toLowerCase();
        if (param2 != 23158) {
            ((gn) this).field_d = true;
        }
        CharSequence var6 = (CharSequence) (Object) param1;
        int var4 = ((gn) this).field_a.field_h.a(an.a(var6, 0), (byte) 24);
        if (!(var4 >= 0)) {
            return false;
        }
        CharSequence var7 = (CharSequence) (Object) param0;
        int var5 = ((gn) this).field_a.field_c[var4].a(an.a(var7, 0), (byte) 24);
        if (-1 < (var5 ^ -1)) {
            return false;
        }
        return true;
    }

    private final synchronized void e(int param0, int param1) {
        if (param1 < 68) {
            ((gn) this).field_d = ((boolean[]) ((gn) this).field_c[2])[3];
        }
        if (!((gn) this).field_d) {
            ((gn) this).field_c[param0] = mg.a((byte) 106, ((gn) this).field_i.a((byte) -83, param0), false);
        } else {
            ((gn) this).field_c[param0] = (Object) (Object) ((gn) this).field_i.a((byte) -95, param0);
        }
    }

    final synchronized boolean b(byte param0) {
        if (null == ((gn) this).field_a) {
            ((gn) this).field_a = ((gn) this).field_i.a((byte) 74);
            if (!(null != ((gn) this).field_a)) {
                return false;
            }
            ((gn) this).field_c = new Object[((gn) this).field_a.field_o];
            ((gn) this).field_b = new Object[((gn) this).field_a.field_o][];
        }
        if (param0 > -45) {
            return ((boolean[]) ((Object[]) ((Object[]) ((gn) this).field_c[34])[0])[1])[7];
        }
        return true;
    }

    final int a(String param0, int param1) {
        if (!((gn) this).b((byte) -94)) {
            return 0;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((gn) this).field_a.field_h.a(an.a(var4, param1), (byte) 24);
        return ((gn) this).a(param1 + 77, var3);
    }

    final byte[] a(byte param0, String param1) {
        int var3 = ((gn) this).c("", 3);
        if (-1 != var3) {
            return ((gn) this).a(param1, false, "");
        }
        int var4 = 14 % ((-28 - param0) / 43);
        return ((gn) this).a("", false, param1);
    }

    public static void a(boolean param0) {
        field_h = null;
        field_f = null;
        if (param0) {
            gn.a(false);
        }
        field_j = null;
    }

    private final synchronized boolean c(int param0, int param1) {
        if (!(((gn) this).b((byte) -111))) {
            return false;
        }
        if (param1 >= 0) {
            // if_icmpge L45
            // ifeq L45
        } else {
            if (!uj.field_e) {
                return false;
            }
            throw new IllegalArgumentException(Integer.toString(param1));
        }
        if (param0 != -1) {
            ((long[]) ((Object[]) ((gn) this).field_c[28])[0])[4] = ((long[]) ((gn) this).field_c[0])[1];
            return true;
        }
        return true;
    }

    final boolean a(String param0, boolean param1) {
        if (!(((gn) this).b((byte) -125))) {
            return false;
        }
        if (!param1) {
            ((gn) this).field_a = (kn) ((gn) this).field_c[1];
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((gn) this).field_a.field_h.a(an.a(var4, 0), (byte) 24);
        if (-1 >= (var3 ^ -1)) {
            return true;
        }
        return false;
    }

    final byte[] a(int param0, boolean param1, int param2) {
        if (!param1) {
            ((long[]) ((gn) this).field_c[2])[0] = 92L;
        }
        return this.a((int[]) null, param2, param0, -4599);
    }

    final synchronized byte[] a(String param0, boolean param1, String param2) {
        if (!((gn) this).b((byte) -71)) {
            return null;
        }
        param2 = param2.toLowerCase();
        param0 = param0.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param2;
        int var4 = ((gn) this).field_a.field_h.a(an.a(var6, 0), (byte) 24);
        if (param1) {
            ((gn) this).field_i = (ff) ((Object[]) ((gn) this).field_c[4])[1];
        }
        if (!this.c(-1, var4)) {
            return null;
        }
        CharSequence var7 = (CharSequence) (Object) param0;
        int var5 = ((gn) this).field_a.field_c[var4].a(an.a(var7, 0), (byte) 24);
        return ((gn) this).a(var4, true, var5);
    }

    final synchronized boolean d(int param0, int param1) {
        int var3 = -14 / ((-30 - param1) / 46);
        if (!this.c(-1, param0)) {
            return false;
        }
        if (!(((gn) this).field_c[param0] == null)) {
            return true;
        }
        this.e(param0, 89);
        if (((gn) this).field_c[param0] == null) {
            return false;
        }
        return true;
    }

    final boolean b(String param0, int param1) {
        if (!((gn) this).b((byte) -91)) {
            return false;
        }
        int var3 = -1 % ((param1 - -19) / 59);
        param0 = param0.toLowerCase();
        CharSequence var5 = (CharSequence) (Object) param0;
        int var4 = ((gn) this).field_a.field_h.a(an.a(var5, 0), (byte) 24);
        return ((gn) this).d(var4, 113);
    }

    private final synchronized byte[] a(int[] param0, int param1, int param2, int param3) {
        Object var5 = null;
        byte[] var5_array = null;
        byte[] var7 = null;
        L0: {
          if (param3 == -4599) {
            break L0;
          } else {
            boolean discarded$1 = ((gn) this).a((String) ((gn) this).field_c[1], (String) ((gn) this).field_c[23], ((int[]) ((gn) this).field_c[9])[18]);
            break L0;
          }
        }
        if (this.a(param1, param2, param3 + 5476)) {
          L1: {
            L2: {
              var5 = null;
              if (((gn) this).field_b[param2] == null) {
                break L2;
              } else {
                if (null == ((gn) this).field_b[param2][param1]) {
                  break L2;
                } else {
                  break L1;
                }
              }
            }
            if (!this.b(param0, param3 ^ 4599, param1, param2)) {
              this.e(param2, param3 ^ -4515);
              if (this.b(param0, -2, param1, param2)) {
                break L1;
              } else {
                return null;
              }
            } else {
              break L1;
            }
          }
          if (null == ((gn) this).field_b[param2]) {
            throw new RuntimeException("");
          } else {
            L3: {
              if (null == ((gn) this).field_b[param2][param1]) {
                break L3;
              } else {
                var7 = ne.a(90, ((gn) this).field_b[param2][param1], false);
                var5_array = var7;
                if (var7 != null) {
                  break L3;
                } else {
                  throw new RuntimeException("");
                }
              }
            }
            L4: {
              if (var5_array == null) {
                break L4;
              } else {
                if (((gn) this).field_e != 1) {
                  if (2 == ((gn) this).field_e) {
                    ((gn) this).field_b[param2] = null;
                    break L4;
                  } else {
                    break L4;
                  }
                } else {
                  ((gn) this).field_b[param2][param1] = null;
                  if ((((gn) this).field_a.field_k[param2] ^ -1) != -2) {
                    break L4;
                  } else {
                    ((gn) this).field_b[param2] = null;
                    break L4;
                  }
                }
              }
            }
            return var5_array;
          }
        } else {
          return null;
        }
    }

    final int c(String param0, int param1) {
        if (!(((gn) this).b((byte) -84))) {
            return -1;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((gn) this).field_a.field_h.a(an.a(var4, 0), (byte) 24);
        if (!(this.c(-1, var3))) {
            return -1;
        }
        if (param1 != 3) {
            return -69;
        }
        return var3;
    }

    final synchronized boolean b(int param0, int param1, int param2) {
        if (!this.a(param1, param0, 877)) {
            return false;
        }
        if (null != ((gn) this).field_b[param0]) {
            if (!(((gn) this).field_b[param0][param1] == null)) {
                return true;
            }
        }
        if (!(((gn) this).field_c[param0] == null)) {
            return true;
        }
        this.e(param0, 83);
        if (param2 != -1) {
            int discarded$0 = ((gn) this).a(-30, 89);
        }
        if (null == ((gn) this).field_c[param0]) {
            return false;
        }
        return true;
    }

    final synchronized boolean a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = HoldTheLine.field_D;
        if (((gn) this).b((byte) -100)) {
          var3 = -65 % ((8 - param0) / 57);
          var2 = 1;
          var4 = 0;
          L0: while (true) {
            if (((gn) this).field_a.field_n.length <= var4) {
              return var2 != 0;
            } else {
              var5 = ((gn) this).field_a.field_n[var4];
              if (((gn) this).field_c[var5] == null) {
                this.e(var5, 112);
                if (((gn) this).field_c[var5] == null) {
                  var2 = 0;
                  var4++;
                  continue L0;
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return false;
        }
    }

    gn(ff param0, boolean param1, int param2) {
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
          ((gn) this).field_a = null;
          if (0 > param2) {
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
              ((gn) this).field_d = stackIn_6_1 != 0;
              ((gn) this).field_e = param2;
              ((gn) this).field_i = param0;
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
        field_g = false;
        field_h = "Speed";
        field_j = new int[]{5, 5, 2};
    }
}
