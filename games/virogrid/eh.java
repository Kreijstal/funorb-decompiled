/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh {
    boolean field_b;
    private sj field_c;
    private ba field_i;
    static String[] field_j;
    private Object[][] field_f;
    static String field_m;
    static int field_n;
    int field_k;
    static boolean field_e;
    static int field_d;
    static String field_g;
    static String field_h;
    static rm field_l;
    private Object[] field_a;

    final boolean a(String param0, String param1, int param2) {
        if (!((eh) this).c(param2 ^ param2)) {
            return false;
        }
        param0 = param0.toLowerCase();
        param1 = param1.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param0;
        int var4 = ((eh) this).field_c.field_h.b(true, nf.a(6, var6));
        if (!(this.a((byte) 94, var4))) {
            return false;
        }
        CharSequence var7 = (CharSequence) (Object) param1;
        int var5 = ((eh) this).field_c.field_u[var4].b(true, nf.a(6, var7));
        return ((eh) this).a(var4, (byte) 125, var5);
    }

    final int d(byte param0, int param1) {
        if (param0 <= 33) {
            boolean discarded$0 = ((eh) this).a(((byte[]) ((eh) this).field_a[2])[1], (String) ((eh) this).field_a[12]);
        }
        if (!this.a((byte) 101, param1)) {
            return 0;
        }
        return ((eh) this).field_c.field_i[param1];
    }

    final synchronized boolean c(int param0) {
        if (!(((eh) this).field_c != null)) {
            ((eh) this).field_c = ((eh) this).field_i.a((byte) 64);
            if (!(null != ((eh) this).field_c)) {
                return false;
            }
            ((eh) this).field_f = new Object[((eh) this).field_c.field_v][];
            ((eh) this).field_a = new Object[((eh) this).field_c.field_v];
        }
        if (param0 != 0) {
            boolean discarded$0 = ((eh) this).c((byte) 63, -6);
            return true;
        }
        return true;
    }

    final boolean a(byte param0, String param1) {
        if (param0 != -102) {
            field_j = (String[]) ((eh) this).field_a[0];
        }
        if (!((eh) this).c(0)) {
            return false;
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((eh) this).field_c.field_h.b(true, nf.a(6, var4));
        return ((eh) this).c((byte) -127, var3);
    }

    final static void a(String param0, java.applet.Applet param1, byte param2, boolean param3) {
        try {
            if (param2 != -25) {
                return;
            }
            if (!(!pd.field_x.startsWith("win"))) {
                if (!(!ne.a(10448, param0))) {
                    return;
                }
            }
            try {
                param1.getAppletContext().showDocument(new java.net.URL(param0), "_blank");
            } catch (java.net.MalformedURLException malformedURLException) {
                en.a("MGR1: " + param0, (Throwable) null, 1);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int e(int param0) {
        if (param0 <= 11) {
            eh.a((String) ((Object[]) ((eh) this).field_a[7])[1], (java.applet.Applet) ((eh) this).field_a[35], (byte) -84, false);
        }
        if (!(((eh) this).c(0))) {
            return -1;
        }
        return ((eh) this).field_c.field_i.length;
    }

    private final synchronized boolean a(byte param0, int param1) {
        if (!(((eh) this).c(0))) {
            return false;
        }
        if (param0 <= 92) {
            Object var4 = null;
            boolean discarded$0 = ((eh) this).a((byte) -128, (String) null);
        }
        if (-1 >= (param1 ^ -1)) {
            if (((eh) this).field_c.field_i.length > param1) {
                if (((eh) this).field_c.field_i[param1] != 0) {
                    return true;
                }
            }
        }
        if (!bk.field_a) {
            return false;
        }
        throw new IllegalArgumentException(Integer.toString(param1));
    }

    final static String d(int param0) {
        int var1 = -42 % ((param0 - -47) / 43);
        if (!(pa.field_l != ao.field_Kb)) {
            return de.field_sb;
        }
        if (!w.field_I.b(-73)) {
            return w.field_I.a(32);
        }
        if (ao.field_Kb == cb.field_c) {
            return w.field_I.a(32);
        }
        return pm.field_g;
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
        jc var26 = null;
        byte[] var27 = null;
        jc var29 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        jc var32 = null;
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
        var22 = Virogrid.field_F ? 1 : 0;
        if (!this.a((byte) 112, param1)) {
          return false;
        } else {
          if (((eh) this).field_a[param1] != null) {
            L0: {
              var5 = ((eh) this).field_c.field_n[param1];
              var48 = ((eh) this).field_c.field_r[param1];
              var41 = var48;
              var34 = var41;
              var24 = var34;
              var6 = var24;
              if (null == ((eh) this).field_f[param1]) {
                ((eh) this).field_f[param1] = new Object[((eh) this).field_c.field_i[param1]];
                break L0;
              } else {
                break L0;
              }
            }
            var7 = ((eh) this).field_f[param1];
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
                  if (null != var7[var10]) {
                    var9_int++;
                    continue L1;
                  } else {
                    var8 = 0;
                    break L2;
                  }
                }
              }
              var10 = -7 / ((17 - param2) / 44);
              if (var8 == 0) {
                L4: {
                  L5: {
                    if (param3 == null) {
                      break L5;
                    } else {
                      L6: {
                        if (param3[0] != 0) {
                          break L6;
                        } else {
                          if (0 != param3[1]) {
                            break L6;
                          } else {
                            if (0 != param3[2]) {
                              break L6;
                            } else {
                              if (param3[3] != 0) {
                                break L6;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      var49 = gi.a(((eh) this).field_a[param1], true, (byte) -128);
                      var42 = var49;
                      var35 = var42;
                      var25 = var35;
                      var9 = var25;
                      var26 = new jc(var49);
                      var26.a(var26.field_g.length, param3, 9843, 5);
                      break L4;
                    }
                  }
                  var9 = gi.a(((eh) this).field_a[param1], false, (byte) -125);
                  break L4;
                }
                L7: {
                  var50 = mc.a(var9, 117);
                  var43 = var50;
                  var36 = var43;
                  var27 = var36;
                  var23 = var27;
                  var51 = var23;
                  if (((eh) this).field_b) {
                    var50 = var43;
                    ((eh) this).field_a[param1] = null;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  var50 = var43;
                  if ((var5 ^ -1) >= -2) {
                    L9: {
                      if (var6 == null) {
                        var11 = 0;
                        break L9;
                      } else {
                        var11 = var48[0];
                        break L9;
                      }
                    }
                    if (((eh) this).field_k == 0) {
                      var7[var11] = th.a(-3, var51, false);
                      break L8;
                    } else {
                      var7[var11] = (Object) (Object) var50;
                      break L8;
                    }
                  } else {
                    if (((eh) this).field_k == 2) {
                      var50 = var43;
                      var11 = var50.length;
                      var11--;
                      var12 = 255 & var23[var11];
                      var11 = var11 - 4 * (var5 * var12);
                      var32 = new jc(var51);
                      var14 = 0;
                      var32.field_l = var11;
                      var15 = 0;
                      var16 = 0;
                      L10: while (true) {
                        if (var16 >= var12) {
                          if (var14 == 0) {
                            return true;
                          } else {
                            var54 = new byte[var14];
                            var14 = 0;
                            var32.field_l = var11;
                            var17 = 0;
                            var18 = 0;
                            L11: while (true) {
                              if (var18 >= var12) {
                                var7[var15] = (Object) (Object) var54;
                                return true;
                              } else {
                                var19 = 0;
                                var20 = 0;
                                L12: while (true) {
                                  if (var5 <= var20) {
                                    var18++;
                                    continue L11;
                                  } else {
                                    L13: {
                                      var19 = var19 + var32.d((byte) 96);
                                      if (var6 != null) {
                                        var21 = var48[var20];
                                        break L13;
                                      } else {
                                        var21 = var20;
                                        break L13;
                                      }
                                    }
                                    L14: {
                                      if (param0 != var21) {
                                        break L14;
                                      } else {
                                        ek.a(var51, var17, var54, var14, var19);
                                        var14 = var14 + var19;
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
                          }
                        } else {
                          var17 = 0;
                          var18 = 0;
                          L15: while (true) {
                            if (var5 <= var18) {
                              var16++;
                              continue L10;
                            } else {
                              L16: {
                                var17 = var17 + var32.d((byte) 123);
                                if (var6 != null) {
                                  var19 = var48[var18];
                                  break L16;
                                } else {
                                  var19 = var18;
                                  break L16;
                                }
                              }
                              if (param0 == var19) {
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
                      var11 = var11 - var12 * var5 * 4;
                      var29 = new jc(var51);
                      var52 = new int[var5];
                      var45 = var52;
                      var38 = var45;
                      var30 = var38;
                      var14_ref_int__ = var30;
                      var29.field_l = var11;
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
                              var29.field_l = var11;
                              var16 = 0;
                              var17 = 0;
                              L19: while (true) {
                                if (var17 >= var12) {
                                  var17 = 0;
                                  L20: while (true) {
                                    if (var5 <= var17) {
                                      break L8;
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
                                      if (((eh) this).field_k == 0) {
                                        var7[var18] = th.a(-3, var53[var17], false);
                                        var17++;
                                        continue L20;
                                      } else {
                                        var7[var18] = (Object) (Object) var53[var17];
                                        var17++;
                                        continue L20;
                                      }
                                    }
                                  }
                                } else {
                                  var18 = 0;
                                  var19 = 0;
                                  L22: while (true) {
                                    if (var5 <= var19) {
                                      var17++;
                                      continue L19;
                                    } else {
                                      var18 = var18 + var29.d((byte) 122);
                                      ek.a(var51, var16, var53[var19], var52[var19], var18);
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
                            if (var17 >= var5) {
                              var15++;
                              continue L17;
                            } else {
                              var16 = var16 + var29.d((byte) 126);
                              var14_ref_int__[var17] = var14_ref_int__[var17] + var16;
                              var17++;
                              continue L23;
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

    final synchronized int[] e(byte param0, int param1) {
        int[] var6 = null;
        int var4 = 0;
        int var5 = Virogrid.field_F ? 1 : 0;
        if (!this.a((byte) 103, param1)) {
            return null;
        }
        if (param0 < 124) {
            ((long[]) ((Object[]) ((eh) this).field_a[5])[2])[5] = ((long[]) ((eh) this).field_a[3])[14];
        }
        int[] var3 = ((eh) this).field_c.field_r[param1];
        if (var3 == null) {
            var6 = new int[((eh) this).field_c.field_n[param1]];
            var3 = var6;
            for (var4 = 0; var4 < var6.length; var4++) {
                var6[var4] = var4;
            }
        }
        return var3;
    }

    final int a(int param0, String param1) {
        if (!(((eh) this).c(0))) {
            return -1;
        }
        if (param0 != -1) {
            return 53;
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((eh) this).field_c.field_h.b(true, nf.a(param0 + 7, var4));
        if (!this.a((byte) 103, var3)) {
            return -1;
        }
        return var3;
    }

    final int a(int param0, int param1, String param2) {
        if (!(this.a((byte) 95, param1))) {
            return -1;
        }
        param2 = param2.toLowerCase();
        if (param0 >= -46) {
            Object var5 = null;
            boolean discarded$0 = ((eh) this).a((byte) 121, (String) null);
        }
        CharSequence var6 = (CharSequence) (Object) param2;
        int var4 = ((eh) this).field_c.field_u[param1].b(true, nf.a(6, var6));
        if (!this.b(var4, param1, 0)) {
            return -1;
        }
        return var4;
    }

    final synchronized boolean c(byte param0, int param1) {
        if (!(this.a((byte) 110, param1))) {
            return false;
        }
        if (!(((eh) this).field_a[param1] == null)) {
            return true;
        }
        int var3 = -43 / ((-32 - param0) / 52);
        this.a(-8003, param1);
        if (null == ((eh) this).field_a[param1]) {
            return false;
        }
        return true;
    }

    final synchronized boolean a(boolean param0, int param1) {
        if (!(((eh) this).c(0))) {
            return false;
        }
        if (!(1 != ((eh) this).field_c.field_i.length)) {
            return ((eh) this).a(0, (byte) -10, param1);
        }
        if (!this.a((byte) 105, param1)) {
            return false;
        }
        if ((((eh) this).field_c.field_i[param1] ^ -1) == -2) {
            return ((eh) this).a(param1, (byte) 127, 0);
        }
        if (!param0) {
            boolean discarded$0 = ((eh) this).a(true, -82);
        }
        throw new RuntimeException();
    }

    private final synchronized void a(int param0, int param1) {
        if (param0 != -8003) {
            int discarded$0 = ((eh) this).e(-98);
        }
        if (((eh) this).field_b) {
            ((eh) this).field_a[param1] = (Object) (Object) ((eh) this).field_i.b(param1, 122);
        } else {
            ((eh) this).field_a[param1] = th.a(param0 + 8000, ((eh) this).field_i.b(param1, 120), false);
        }
    }

    final synchronized byte[] a(String param0, int param1, String param2) {
        if (!((eh) this).c(0)) {
            return null;
        }
        param0 = param0.toLowerCase();
        param2 = param2.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param0;
        int var4 = ((eh) this).field_c.field_h.b(true, nf.a(6, var6));
        if (!this.a((byte) 97, var4)) {
            return null;
        }
        if (param1 != 100) {
            byte[] discarded$0 = ((eh) this).b(-105, 124);
        }
        CharSequence var7 = (CharSequence) (Object) param2;
        int var5 = ((eh) this).field_c.field_u[var4].b(true, nf.a(6, var7));
        return ((eh) this).a(var4, var5, 0);
    }

    final synchronized byte[] b(int param0, int param1) {
        if (!((eh) this).c(0)) {
            return null;
        }
        if ((((eh) this).field_c.field_i.length ^ -1) == -2) {
            return ((eh) this).a(0, param0, 0);
        }
        if (!this.a((byte) 124, param0)) {
            return null;
        }
        if (1 == ((eh) this).field_c.field_i[param0]) {
            return ((eh) this).a(param0, 0, param1 ^ 27034);
        }
        if (param1 != 27034) {
            return null;
        }
        throw new RuntimeException();
    }

    final synchronized int a(int param0) {
        int var4 = 0;
        int var5 = Virogrid.field_F ? 1 : 0;
        if (param0 != -2677) {
            return -66;
        }
        if (!(((eh) this).c(0))) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (var4 = 0; (((eh) this).field_a.length ^ -1) < (var4 ^ -1); var4++) {
            if (!(-1 <= (((eh) this).field_c.field_n[var4] ^ -1))) {
                var2 += 100;
                var3 = var3 + ((eh) this).b((byte) 106, var4);
            }
        }
        if (!(-1 != (var2 ^ -1))) {
            return 100;
        }
        var4 = 100 * var3 / var2;
        return var4;
    }

    public static void a(byte param0) {
        if (param0 != -104) {
            Object var2 = null;
            eh.a((String) null, (java.applet.Applet) null, (byte) -81, true);
        }
        field_j = null;
        field_g = null;
        field_m = null;
        field_h = null;
        field_l = null;
    }

    final synchronized boolean b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Virogrid.field_F ? 1 : 0;
        if (((eh) this).c(param0 ^ param0)) {
          var2 = 1;
          var3 = 0;
          L0: while (true) {
            if (((eh) this).field_c.field_c.length <= var3) {
              return var2 != 0;
            } else {
              var4 = ((eh) this).field_c.field_c[var3];
              if (((eh) this).field_a[var4] == null) {
                this.a(-8003, var4);
                if (null == ((eh) this).field_a[var4]) {
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

    final synchronized int b(byte param0, int param1) {
        if (!this.a((byte) 119, param1)) {
            return 0;
        }
        if (param0 <= 73) {
            return -79;
        }
        if (!(((eh) this).field_a[param1] == null)) {
            return 100;
        }
        return ((eh) this).field_i.a(-7, param1);
    }

    final static ch[] a(int param0, pd param1) {
        int var5 = 0;
        ch var6 = null;
        int var7 = Virogrid.field_F ? 1 : 0;
        if (!param1.b(-121)) {
            return new ch[]{};
        }
        if (param0 <= 30) {
            field_l = null;
        }
        un var8 = param1.a((byte) -125);
        while ((var8.field_a ^ -1) == -1) {
            mm.a(-27, 10L);
        }
        if (!(-3 != (var8.field_a ^ -1))) {
            return new ch[]{};
        }
        int[] var12 = (int[]) var8.field_f;
        int[] var11 = var12;
        int[] var10 = var11;
        int[] var9 = var10;
        int[] var3 = var9;
        ch[] var4 = new ch[var12.length >> 1720683810];
        for (var5 = 0; var5 < var4.length; var5++) {
            var6 = new ch();
            var4[var5] = var6;
            var6.field_c = var3[var5 << 1683881474];
            var6.field_k = var3[1 + (var5 << -531982590)];
            var6.field_g = var3[(var5 << 1315220450) + 2];
            var6.field_d = var3[(var5 << -1126362654) - -3];
        }
        return var4;
    }

    final boolean a(String param0, boolean param1) {
        if (!(((eh) this).c(0))) {
            return false;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((eh) this).field_c.field_h.b(param1, nf.a(6, var4));
        if (0 > var3) {
            return false;
        }
        return true;
    }

    final int a(String param0, int param1) {
        if (!(((eh) this).c(0))) {
            return 0;
        }
        param0 = param0.toLowerCase();
        if (param1 < 71) {
            int discarded$0 = ((eh) this).e(-48);
        }
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((eh) this).field_c.field_h.b(true, nf.a(6, var4));
        return ((eh) this).b((byte) 85, var3);
    }

    private final synchronized boolean b(int param0, int param1, int param2) {
        if (!((eh) this).c(param2 ^ 0)) {
            return false;
        }
        if (param2 <= param1) {
            if (-1 >= (param0 ^ -1)) {
                if (((eh) this).field_c.field_i.length > param1) {
                    if (param0 < ((eh) this).field_c.field_i[param1]) {
                        return true;
                    }
                }
            }
        }
        if (!bk.field_a) {
            return false;
        }
        throw new IllegalArgumentException(param1 + " " + param0);
    }

    final byte[] a(int param0, int param1, int param2) {
        if (param2 != 0) {
            return (byte[]) ((eh) this).field_a[14];
        }
        return this.a(125, param0, (int[]) null, param1);
    }

    private final synchronized byte[] a(int param0, int param1, int[] param2, int param3) {
        Object var5 = null;
        byte[] var7 = null;
        if (this.b(param3, param1, 0)) {
          L0: {
            L1: {
              var5 = null;
              if (((eh) this).field_f[param1] == null) {
                break L1;
              } else {
                if (null != ((eh) this).field_f[param1][param3]) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (!this.a(param3, param1, 63, param2)) {
              this.a(-8003, param1);
              if (this.a(param3, param1, 108, param2)) {
                break L0;
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          if (null == ((eh) this).field_f[param1]) {
            throw new RuntimeException("");
          } else {
            if (param0 > 107) {
              L2: {
                if (((eh) this).field_f[param1][param3] != null) {
                  var7 = gi.a(((eh) this).field_f[param1][param3], false, (byte) -126);
                  var5 = (Object) (Object) var7;
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
                if (var5 != null) {
                  if (1 != ((eh) this).field_k) {
                    if (2 == ((eh) this).field_k) {
                      ((eh) this).field_f[param1] = null;
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    ((eh) this).field_f[param1][param3] = null;
                    if (((eh) this).field_c.field_i[param1] == 1) {
                      ((eh) this).field_f[param1] = null;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                } else {
                  break L3;
                }
              }
              return (byte[]) var5;
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final synchronized boolean a(int param0, byte param1, int param2) {
        if (!(this.b(param2, param0, 0))) {
            return false;
        }
        if (((eh) this).field_f[param0] != null) {
            if (((eh) this).field_f[param0][param2] != null) {
                return true;
            }
        }
        if (!(((eh) this).field_a[param0] == null)) {
            return true;
        }
        this.a(-8003, param0);
        int var4 = 119 / ((74 - param1) / 50);
        if (null != ((eh) this).field_a[param0]) {
            return true;
        }
        return false;
    }

    eh(ba param0, boolean param1, int param2) {
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
          ((eh) this).field_c = null;
          if (-1 < (param2 ^ -1)) {
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
              ((eh) this).field_b = stackIn_6_1 != 0;
              ((eh) this).field_k = param2;
              ((eh) this).field_i = param0;
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
        field_g = "On";
        field_n = 0;
        field_m = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_h = "Unfortunately your configuration doesn't support fullscreen mode.";
    }
}
