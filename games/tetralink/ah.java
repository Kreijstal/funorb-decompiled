/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah {
    private Object[][] field_h;
    static int field_a;
    private Object[] field_i;
    private hk field_b;
    private t field_e;
    static String[] field_j;
    static String field_c;
    static int[] field_g;
    boolean field_f;
    int field_d;

    final int a(String param0, boolean param1) {
        if (!((ah) this).c(97)) {
            return 0;
        }
        param0 = param0.toLowerCase();
        if (!param1) {
            boolean discarded$0 = this.a(-27, (int[]) null, true, ((int[]) ((Object[]) ((ah) this).field_i[4])[7])[23]);
        }
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((ah) this).field_e.field_r.a(-114, g.a(-1, var4));
        return ((ah) this).e(-11337, var3);
    }

    final synchronized boolean f(int param0, int param1) {
        if (param1 <= 30) {
            return true;
        }
        if (!((ah) this).c(105)) {
            return false;
        }
        if (((ah) this).field_e.field_d.length == 1) {
            return ((ah) this).a((byte) -30, 0, param0);
        }
        if (!this.a((byte) 119, param0)) {
            return false;
        }
        if ((((ah) this).field_e.field_d[param0] ^ -1) == -2) {
            return ((ah) this).a((byte) -30, param0, 0);
        }
        throw new RuntimeException();
    }

    final byte[] a(int param0, int param1, int param2) {
        int var4 = 8 / ((-45 - param0) / 33);
        return this.a(-2, (int[]) null, param2, param1);
    }

    final int a(int param0) {
        if (!((ah) this).c(94)) {
            return -1;
        }
        if (param0 != -1) {
            Object var3 = null;
            boolean discarded$0 = this.a(((int[]) ((Object[]) ((ah) this).field_i[0])[4])[0], (int[]) null, false, 120);
        }
        return ((ah) this).field_e.field_d.length;
    }

    final static oh[] a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        oh var9 = null;
        oh var10 = null;
        oh var11 = null;
        oh var12 = null;
        oh var13 = null;
        Object var14 = null;
        int[] var15 = null;
        oh var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        L0: {
          var20 = ra.field_b;
          var19 = var20;
          var18 = var19;
          var17 = var18;
          var15 = var17;
          var6 = var15;
          var7 = ra.field_f;
          var8 = ra.field_e;
          var9 = new oh(param1, -(param1 * 2) + param5);
          var9.c();
          ra.b(0, 0, param1, param5 - param1 * 2, param4, param2);
          var10 = new oh(param1, param1);
          var10.c();
          ra.c(0, 0, param1, param1, param4);
          var11 = new oh(16, param1);
          var11.c();
          ra.c(0, 0, 16, param1, param4);
          var12 = new oh(param1, param1);
          var12.c();
          ra.c(0, 0, param1, param1, param2);
          var13 = new oh(16, param1);
          var13.c();
          ra.c(0, 0, param3, param1, param2);
          var14 = null;
          if (param0 > 0) {
            var16 = new oh(16, 16);
            var14 = (Object) (Object) var16;
            var16.c();
            ra.c(0, 0, 16, 16, param0);
            break L0;
          } else {
            break L0;
          }
        }
        ra.a(var20, var7, var8);
        return new oh[]{var10, var11, var10, var9, (oh) var14, var9, var12, var13, var12};
    }

    final boolean a(String param0, byte param1) {
        if (!((ah) this).c(111)) {
            return false;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((ah) this).field_e.field_r.a(84, g.a(-1, var4));
        if (param1 > -61) {
            return true;
        }
        return ((ah) this).d(var3, 0);
    }

    final synchronized int e(int param0, int param1) {
        if (!(this.a((byte) 119, param1))) {
            return 0;
        }
        if (null != ((ah) this).field_i[param1]) {
            return 100;
        }
        if (param0 != -11337) {
            ((ah) this).field_e = (t) ((ah) this).field_i[9];
        }
        return ((ah) this).field_b.a(param1, 0);
    }

    private final synchronized void b(byte param0, int param1) {
        if (!((ah) this).field_f) {
            ((ah) this).field_i[param1] = ik.a(((ah) this).field_b.b(20396, param1), false, param0 + -134);
        } else {
            ((ah) this).field_i[param1] = (Object) (Object) ((ah) this).field_b.b(20396, param1);
        }
        if (param0 != -3) {
            boolean discarded$0 = ((ah) this).a(((boolean[]) ((ah) this).field_i[4])[5]);
        }
    }

    private final synchronized byte[] a(int param0, int[] param1, int param2, int param3) {
        Object var5 = null;
        byte[] var7 = null;
        if (this.a(param2, (byte) -72, param3)) {
          L0: {
            L1: {
              var5 = null;
              if (((ah) this).field_h[param2] == null) {
                break L1;
              } else {
                if (null != ((ah) this).field_h[param2][param3]) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (!this.a(param2, param1, false, param3)) {
              this.b((byte) -3, param2);
              if (this.a(param2, param1, false, param3)) {
                break L0;
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          if (param0 == -2) {
            if (((ah) this).field_h[param2] != null) {
              L2: {
                if (((ah) this).field_h[param2][param3] == null) {
                  break L2;
                } else {
                  var7 = vj.a(false, (byte) -28, ((ah) this).field_h[param2][param3]);
                  var5 = (Object) (Object) var7;
                  if (var7 == null) {
                    throw new RuntimeException("");
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (var5 == null) {
                  break L3;
                } else {
                  if ((((ah) this).field_d ^ -1) != -2) {
                    if ((((ah) this).field_d ^ -1) != -3) {
                      break L3;
                    } else {
                      ((ah) this).field_h[param2] = null;
                      break L3;
                    }
                  } else {
                    ((ah) this).field_h[param2][param3] = null;
                    if (-2 == (((ah) this).field_e.field_d[param2] ^ -1)) {
                      ((ah) this).field_h[param2] = null;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              return (byte[]) var5;
            } else {
              throw new RuntimeException("");
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final synchronized boolean c(int param0) {
        if (param0 <= 87) {
            oh[] discarded$0 = ah.a(103, -121, ((int[]) ((ah) this).field_i[4])[43], -50, ((int[]) ((ah) this).field_i[4])[7], 99);
        }
        if (null != ((ah) this).field_e) {
            return true;
        }
        ((ah) this).field_e = ((ah) this).field_b.a(0);
        if (null == ((ah) this).field_e) {
            return false;
        }
        ((ah) this).field_i = new Object[((ah) this).field_e.field_i];
        ((ah) this).field_h = new Object[((ah) this).field_e.field_i][];
        return true;
    }

    private final synchronized boolean a(int param0, byte param1, int param2) {
        if (!((ah) this).c(param1 + 178)) {
            return false;
        }
        if (param1 != -72) {
            ((boolean[]) ((ah) this).field_i[30])[8] = true;
        }
        if (0 <= param0) {
            if (-1 >= (param2 ^ -1)) {
                if (((ah) this).field_e.field_d.length > param0) {
                    if (param2 < ((ah) this).field_e.field_d[param0]) {
                        return true;
                    }
                }
            }
        }
        if (ec.field_k) {
            throw new IllegalArgumentException(param0 + " " + param2);
        }
        return false;
    }

    final boolean a(String param0, int param1) {
        if (!((ah) this).c(88)) {
            return false;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((ah) this).field_e.field_r.a(-115, g.a(param1 + -1, var4));
        if (var3 < param1) {
            return false;
        }
        return true;
    }

    final int b(int param0, int param1) {
        if (param0 != -23126) {
            int discarded$0 = ((ah) this).e(1, 109);
        }
        if (!(this.a((byte) 119, param1))) {
            return 0;
        }
        return ((ah) this).field_e.field_d[param1];
    }

    private final synchronized boolean a(int param0, int[] param1, boolean param2, int param3) {
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
        bh var26 = null;
        byte[] var27 = null;
        bh var29 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        bh var32 = null;
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
        var22 = TetraLink.field_J;
        if (!this.a((byte) 119, param0)) {
          return false;
        } else {
          if (null == ((ah) this).field_i[param0]) {
            return false;
          } else {
            L0: {
              var5 = ((ah) this).field_e.field_m[param0];
              var48 = ((ah) this).field_e.field_a[param0];
              var41 = var48;
              var34 = var41;
              var24 = var34;
              var6 = var24;
              if (null != ((ah) this).field_h[param0]) {
                break L0;
              } else {
                ((ah) this).field_h[param0] = new Object[((ah) this).field_e.field_d[param0]];
                break L0;
              }
            }
            if (!param2) {
              var7 = ((ah) this).field_h[param0];
              var8 = 1;
              var9_int = 0;
              L1: while (true) {
                L2: {
                  if (var9_int >= var5) {
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
                      if (param1 == null) {
                        break L5;
                      } else {
                        L6: {
                          if (-1 != param1[0]) {
                            break L6;
                          } else {
                            if (0 != param1[1]) {
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
                        var49 = vj.a(true, (byte) -28, ((ah) this).field_i[param0]);
                        var42 = var49;
                        var35 = var42;
                        var25 = var35;
                        var9 = var25;
                        var26 = new bh(var49);
                        var26.a(-25351, param1, var26.field_u.length, 5);
                        break L4;
                      }
                    }
                    var9 = vj.a(false, (byte) -28, ((ah) this).field_i[param0]);
                    break L4;
                  }
                  L7: {
                    var50 = pk.a(var9, (byte) 88);
                    var43 = var50;
                    var36 = var43;
                    var27 = var36;
                    var23 = var27;
                    var51 = var23;
                    if (((ah) this).field_f) {
                      ((ah) this).field_i[param0] = null;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if ((var5 ^ -1) < -2) {
                      var50 = var43;
                      if (((ah) this).field_d == 2) {
                        var50 = var43;
                        var11 = var50.length;
                        var11--;
                        var12 = 255 & var23[var11];
                        var11 = var11 - var12 * var5 * 4;
                        var32 = new bh(var51);
                        var14 = 0;
                        var32.field_t = var11;
                        var15 = 0;
                        var16 = 0;
                        L9: while (true) {
                          if (var16 >= var12) {
                            if (var14 != 0) {
                              var54 = new byte[var14];
                              var14 = 0;
                              var32.field_t = var11;
                              var17 = 0;
                              var18 = 0;
                              L10: while (true) {
                                if (var18 >= var12) {
                                  var7[var15] = (Object) (Object) var54;
                                  break L8;
                                } else {
                                  var19 = 0;
                                  var20 = 0;
                                  L11: while (true) {
                                    if (var20 >= var5) {
                                      var18++;
                                      continue L10;
                                    } else {
                                      L12: {
                                        var19 = var19 + var32.f(48);
                                        if (var6 != null) {
                                          var21 = var48[var20];
                                          break L12;
                                        } else {
                                          var21 = var20;
                                          break L12;
                                        }
                                      }
                                      L13: {
                                        if (var21 == param3) {
                                          rd.a(var51, var17, var54, var14, var19);
                                          var14 = var14 + var19;
                                          break L13;
                                        } else {
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
                            } else {
                              return true;
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
                                  var17 = var17 + var32.f(-124);
                                  if (var6 == null) {
                                    var19 = var18;
                                    break L15;
                                  } else {
                                    var19 = var48[var18];
                                    break L15;
                                  }
                                }
                                if (param3 == var19) {
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
                        var11 = var50.length;
                        var11--;
                        var12 = 255 & var23[var11];
                        var11 = var11 - var5 * var12 * 4;
                        var29 = new bh(var51);
                        var29.field_t = var11;
                        var52 = new int[var5];
                        var45 = var52;
                        var38 = var45;
                        var30 = var38;
                        var14_ref_int__ = var30;
                        var15 = 0;
                        L16: while (true) {
                          if (var15 >= var12) {
                            var53 = new byte[var5][];
                            var46 = var53;
                            var39 = var46;
                            var31 = var39;
                            var15_ref_byte____ = var31;
                            var16 = 0;
                            L17: while (true) {
                              if (var16 >= var5) {
                                var29.field_t = var11;
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
                                          if (var6 != null) {
                                            var18 = var48[var17];
                                            break L20;
                                          } else {
                                            var18 = var17;
                                            break L20;
                                          }
                                        }
                                        if (-1 != (((ah) this).field_d ^ -1)) {
                                          var7[var18] = (Object) (Object) var53[var17];
                                          var17++;
                                          continue L19;
                                        } else {
                                          var7[var18] = ik.a(var53[var17], false, -137);
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
                                        var18 = var18 + var29.f(-111);
                                        rd.a(var51, var16, var53[var19], var52[var19], var18);
                                        var16 = var16 + var18;
                                        var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                                        var19++;
                                        continue L21;
                                      }
                                    }
                                  }
                                }
                              } else {
                                var15_ref_byte____[var16] = new byte[var52[var16]];
                                var52[var16] = 0;
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
                                var16 = var16 + var29.f(-112);
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
                          var11 = var48[0];
                          break L23;
                        }
                      }
                      if (0 != ((ah) this).field_d) {
                        var7[var11] = (Object) (Object) var51;
                        break L8;
                      } else {
                        var7[var11] = ik.a(var50, false, -137);
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
    }

    public static void d(int param0) {
        field_g = null;
        field_c = null;
        field_j = null;
        if (param0 != 16) {
            field_j = null;
        }
    }

    final int a(int param0, String param1) {
        if (!(((ah) this).c(121))) {
            return -1;
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((ah) this).field_e.field_r.a(-85, g.a(param0, var4));
        if (!(this.a((byte) 119, var3))) {
            return -1;
        }
        return var3;
    }

    final synchronized boolean a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = TetraLink.field_J;
        if (((ah) this).c(95)) {
          var2 = 1;
          if (!param0) {
            var3 = 0;
            L0: while (true) {
              if (((ah) this).field_e.field_j.length <= var3) {
                return var2 != 0;
              } else {
                var4 = ((ah) this).field_e.field_j[var3];
                if (null == ((ah) this).field_i[var4]) {
                  this.b((byte) -3, var4);
                  if (null == ((ah) this).field_i[var4]) {
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
            return true;
          }
        } else {
          return false;
        }
    }

    final synchronized int[] c(int param0, int param1) {
        int[] var6 = null;
        int var4 = 0;
        int var5 = TetraLink.field_J;
        if (!this.a((byte) 119, param0)) {
            return null;
        }
        int[] var3 = ((ah) this).field_e.field_a[param0];
        if (!(var3 != null)) {
            var6 = new int[((ah) this).field_e.field_m[param0]];
            var3 = var6;
            for (var4 = 0; var6.length > var4; var4++) {
                var6[var4] = var4;
            }
        }
        if (param1 != 0) {
            boolean discarded$0 = ((ah) this).f(((int[]) ((ah) this).field_i[1])[2], -20);
        }
        return var3;
    }

    final boolean a(String param0, int param1, String param2) {
        if (param1 >= -114) {
            return false;
        }
        if (!((ah) this).c(98)) {
            return false;
        }
        param2 = param2.toLowerCase();
        param0 = param0.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param2;
        int var4 = ((ah) this).field_e.field_r.a(60, g.a(-1, var6));
        if (!this.a((byte) 119, var4)) {
            return false;
        }
        CharSequence var7 = (CharSequence) (Object) param0;
        int var5 = ((ah) this).field_e.field_n[var4].a(-81, g.a(-1, var7));
        return ((ah) this).a((byte) -30, var4, var5);
    }

    private final synchronized boolean a(byte param0, int param1) {
        if (param0 != 119) {
            int discarded$0 = ((ah) this).e(-56, -114);
        }
        if (!((ah) this).c(104)) {
            return false;
        }
        if ((param1 ^ -1) <= -1) {
            if (param1 < ((ah) this).field_e.field_d.length) {
                if (-1 != (((ah) this).field_e.field_d[param1] ^ -1)) {
                    return true;
                }
            }
        }
        if (ec.field_k) {
            throw new IllegalArgumentException(Integer.toString(param1));
        }
        return false;
    }

    final int a(int param0, boolean param1, String param2) {
        if (!this.a((byte) 119, param0)) {
            return -1;
        }
        param2 = param2.toLowerCase();
        if (param1) {
            Object var5 = null;
            boolean discarded$0 = ((ah) this).a((String) null, 39);
        }
        CharSequence var6 = (CharSequence) (Object) param2;
        int var4 = ((ah) this).field_e.field_n[param0].a(83, g.a(-1, var6));
        if (!(this.a(param0, (byte) -72, var4))) {
            return -1;
        }
        return var4;
    }

    final synchronized boolean a(byte param0, int param1, int param2) {
        if (!(this.a(param1, (byte) -72, param2))) {
            return false;
        }
        if (null != ((ah) this).field_h[param1]) {
            if (!(null == ((ah) this).field_h[param1][param2])) {
                return true;
            }
        }
        if (!(((ah) this).field_i[param1] == null)) {
            return true;
        }
        this.b((byte) -3, param1);
        if (null != ((ah) this).field_i[param1]) {
            return true;
        }
        if (param0 != -30) {
            return false;
        }
        return false;
    }

    final synchronized boolean d(int param0, int param1) {
        if (!(this.a((byte) 119, param0))) {
            return false;
        }
        if (((ah) this).field_i[param0] != null) {
            return true;
        }
        if (param1 != 0) {
            ah.d(74);
        }
        this.b((byte) -3, param0);
        if (null == ((ah) this).field_i[param0]) {
            return false;
        }
        return true;
    }

    ah(hk param0, boolean param1, int param2) {
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
          ((ah) this).field_e = null;
          if ((param2 ^ -1) > -1) {
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
              ((ah) this).field_f = stackIn_6_1 != 0;
              ((ah) this).field_b = param0;
              ((ah) this).field_d = param2;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("");
    }

    final synchronized int b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = TetraLink.field_J;
        if (!((ah) this).c(89)) {
          return 0;
        } else {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (((ah) this).field_i.length <= var4) {
              if (var2 != 0) {
                if (param0 == 22300) {
                  var4 = 100 * var3 / var2;
                  return var4;
                } else {
                  return ((int[]) ((Object[]) ((ah) this).field_i[0])[1])[7];
                }
              } else {
                return 100;
              }
            } else {
              if (0 < ((ah) this).field_e.field_m[var4]) {
                var3 = var3 + ((ah) this).e(-11337, var4);
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

    final synchronized byte[] a(String param0, String param1, boolean param2) {
        if (!((ah) this).c(97)) {
            return null;
        }
        param0 = param0.toLowerCase();
        param1 = param1.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param0;
        int var4 = ((ah) this).field_e.field_r.a(102, g.a(-1, var6));
        if (!this.a((byte) 119, var4)) {
            return null;
        }
        if (!param2) {
            field_j = null;
        }
        CharSequence var7 = (CharSequence) (Object) param1;
        int var5 = ((ah) this).field_e.field_n[var4].a(-119, g.a(-1, var7));
        return ((ah) this).a(-127, var5, var4);
    }

    final synchronized byte[] a(int param0, int param1) {
        if (!((ah) this).c(113)) {
            return null;
        }
        if (param0 != 0) {
            boolean discarded$0 = ((ah) this).a((byte) -43, 44, -77);
        }
        if (!(-2 != (((ah) this).field_e.field_d.length ^ -1))) {
            return ((ah) this).a(8, param1, 0);
        }
        if (!this.a((byte) 119, param1)) {
            return null;
        }
        if (!((((ah) this).field_e.field_d[param1] ^ -1) != -2)) {
            return ((ah) this).a(103, 0, param1);
        }
        throw new RuntimeException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Owner";
        field_g = new int[128];
    }
}
