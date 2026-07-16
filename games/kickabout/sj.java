/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj {
    static boolean field_g;
    private kl field_d;
    int field_c;
    private Object[] field_e;
    private Object[][] field_a;
    static int field_h;
    boolean field_b;
    static sj field_f;
    private ow field_i;

    final static void b(int param0) {
        nv.field_N = new tf();
        if (param0 != -1) {
            int discarded$0 = sj.a(4, 10, (byte) -102);
        }
    }

    final boolean a(String param0, String param1, byte param2) {
        if (!((sj) this).d(-80)) {
            return false;
        }
        param0 = param0.toLowerCase();
        param1 = param1.toLowerCase();
        CharSequence var7 = (CharSequence) (Object) param0;
        int var4 = ((sj) this).field_d.field_q.a(tf.a(true, var7), param2 + -33);
        if (param2 != -10) {
            Object var6 = null;
            int discarded$0 = ((sj) this).a(((byte[]) ((sj) this).field_e[3])[2], (String) null, -100);
        }
        if (!this.a((byte) -58, var4)) {
            return false;
        }
        CharSequence var8 = (CharSequence) (Object) param1;
        int var5 = ((sj) this).field_d.field_s[var4].a(tf.a(true, var8), -67);
        return ((sj) this).a(var5, 125, var4);
    }

    final synchronized boolean a(int param0, int param1, int param2) {
        if (!(this.a(param2, param0, true))) {
            return false;
        }
        if (((sj) this).field_a[param2] != null) {
            if (!(null == ((sj) this).field_a[param2][param0])) {
                return true;
            }
        }
        if (null != ((sj) this).field_e[param2]) {
            return true;
        }
        if (param1 < 36) {
            boolean discarded$0 = ((sj) this).a(false, (String) ((sj) this).field_e[4]);
        }
        this.a(param2, (byte) 41);
        if (((sj) this).field_e[param2] != null) {
            return true;
        }
        return false;
    }

    public static void c(int param0) {
        if (param0 >= -83) {
            sj.a(0.31954155933475825, (byte) 102, 1.241292563355284, 0.9239833289377695);
        }
        field_f = null;
    }

    final synchronized boolean a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Kickabout.field_G;
        if (((sj) this).d(-64)) {
          L0: {
            var2 = 1;
            if (!param0) {
              break L0;
            } else {
              ((sj) this).field_d = null;
              break L0;
            }
          }
          var3 = 0;
          L1: while (true) {
            if (((sj) this).field_d.field_b.length <= var3) {
              return var2 != 0;
            } else {
              var4 = ((sj) this).field_d.field_b[var3];
              if (((sj) this).field_e[var4] == null) {
                this.a(var4, (byte) 38);
                if (null == ((sj) this).field_e[var4]) {
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
        } else {
          return false;
        }
    }

    private final synchronized byte[] a(int param0, int[] param1, boolean param2, int param3) {
        Object var5 = null;
        byte[] var7 = null;
        L0: {
          if (param2) {
            break L0;
          } else {
            ((sj) this).field_d = null;
            break L0;
          }
        }
        if (this.a(param0, param3, param2)) {
          L1: {
            L2: {
              var5 = null;
              if (((sj) this).field_a[param0] == null) {
                break L2;
              } else {
                if (null == ((sj) this).field_a[param0][param3]) {
                  break L2;
                } else {
                  break L1;
                }
              }
            }
            if (this.a(param0, param1, param3, 2)) {
              break L1;
            } else {
              this.a(param0, (byte) 86);
              if (this.a(param0, param1, param3, 2)) {
                break L1;
              } else {
                return null;
              }
            }
          }
          if (((sj) this).field_a[param0] == null) {
            throw new RuntimeException("");
          } else {
            L3: {
              if (((sj) this).field_a[param0][param3] == null) {
                break L3;
              } else {
                var7 = lg.a(((sj) this).field_a[param0][param3], false, 18828);
                var5 = (Object) (Object) var7;
                if (var7 != null) {
                  break L3;
                } else {
                  throw new RuntimeException("");
                }
              }
            }
            L4: {
              if (var5 == null) {
                break L4;
              } else {
                if (-2 != ((sj) this).field_c) {
                  if (-3 != (((sj) this).field_c ^ -1)) {
                    break L4;
                  } else {
                    ((sj) this).field_a[param0] = null;
                    break L4;
                  }
                } else {
                  ((sj) this).field_a[param0][param3] = null;
                  if (-2 != ((sj) this).field_d.field_e[param0]) {
                    break L4;
                  } else {
                    ((sj) this).field_a[param0] = null;
                    break L4;
                  }
                }
              }
            }
            return (byte[]) var5;
          }
        } else {
          return null;
        }
    }

    private final synchronized void a(int param0, byte param1) {
        if (((sj) this).field_b) {
            ((sj) this).field_e[param0] = (Object) (Object) ((sj) this).field_i.b(param0, 4);
        } else {
            ((sj) this).field_e[param0] = cq.a(((sj) this).field_i.b(param0, 4), false, 136);
        }
        if (param1 < 31) {
            boolean discarded$0 = ((sj) this).b(-52, ((int[]) ((sj) this).field_e[5])[1]);
        }
    }

    final synchronized byte[] a(String param0, String param1, int param2) {
        if (param2 <= 2) {
            sj.c(((int[]) ((sj) this).field_e[10])[0]);
        }
        if (!((sj) this).d(-118)) {
            return null;
        }
        param1 = param1.toLowerCase();
        param0 = param0.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param1;
        int var4 = ((sj) this).field_d.field_q.a(tf.a(true, var6), -73);
        if (!this.a((byte) -70, var4)) {
            return null;
        }
        CharSequence var7 = (CharSequence) (Object) param0;
        int var5 = ((sj) this).field_d.field_s[var4].a(tf.a(true, var7), -128);
        return ((sj) this).b(var4, -32669, var5);
    }

    private final synchronized boolean a(int param0, int param1, boolean param2) {
        if (!param2) {
            byte[] discarded$0 = ((sj) this).a((String) ((Object[]) ((sj) this).field_e[6])[2], (String) ((Object[]) ((sj) this).field_e[5])[6], ((int[]) ((Object[]) ((sj) this).field_e[0])[8])[7]);
        }
        if (!((sj) this).d(-88)) {
            return false;
        }
        if (0 <= param0) {
            if (-1 >= (param1 ^ -1)) {
                if (param0 < ((sj) this).field_d.field_e.length) {
                    if (param1 < ((sj) this).field_d.field_e[param0]) {
                        return true;
                    }
                }
            }
        }
        if (rf.field_a) {
            throw new IllegalArgumentException(param0 + " " + param1);
        }
        return false;
    }

    final boolean a(String param0, byte param1) {
        if (!((sj) this).d(-121)) {
            return false;
        }
        if (param1 > -46) {
            ((long[]) ((sj) this).field_e[9])[5] = -51L;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((sj) this).field_d.field_q.a(tf.a(true, var4), -108);
        if (var3 < 0) {
            return false;
        }
        return true;
    }

    final synchronized int[] c(int param0, int param1) {
        int[] var6 = null;
        int var4 = 0;
        int var5 = Kickabout.field_G;
        if (!this.a((byte) -40, param0)) {
            return null;
        }
        if (param1 != 4) {
            return null;
        }
        int[] var3 = ((sj) this).field_d.field_r[param0];
        if (!(var3 != null)) {
            var6 = new int[((sj) this).field_d.field_i[param0]];
            var3 = var6;
            for (var4 = 0; var6.length > var4; var4++) {
                var6[var4] = var4;
            }
        }
        return var3;
    }

    private final synchronized boolean a(byte param0, int param1) {
        if (!(((sj) this).d(-78))) {
            return false;
        }
        int var3 = 38 % ((22 - param0) / 62);
        if (-1 >= (param1 ^ -1)) {
            if ((((sj) this).field_d.field_e.length ^ -1) < (param1 ^ -1)) {
                if (-1 != (((sj) this).field_d.field_e[param1] ^ -1)) {
                    return true;
                }
            }
        }
        if (!rf.field_a) {
            return false;
        }
        throw new IllegalArgumentException(Integer.toString(param1));
    }

    final synchronized byte[] a(int param0, int param1) {
        if (!((sj) this).d(param0 + -56)) {
            return null;
        }
        if (((sj) this).field_d.field_e.length == 1) {
            return ((sj) this).b(0, -32669, param1);
        }
        if (!this.a((byte) 112, param1)) {
            return null;
        }
        if (param0 != 0) {
            return null;
        }
        if (!(((sj) this).field_d.field_e[param1] != 1)) {
            return ((sj) this).b(param1, param0 + -32669, 0);
        }
        throw new RuntimeException();
    }

    final byte[] b(int param0, int param1, int param2) {
        if (param1 != -32669) {
            int discarded$0 = ((sj) this).a(((boolean[]) ((sj) this).field_e[17])[4], -120);
        }
        return this.a(param0, (int[]) null, true, param2);
    }

    final int a(int param0) {
        if (param0 <= 79) {
            ((Object[]) ((sj) this).field_e[5])[0] = null;
        }
        if (!(((sj) this).d(-111))) {
            return -1;
        }
        return ((sj) this).field_d.field_e.length;
    }

    final synchronized boolean d(int param0) {
        if (param0 >= -29) {
            return ((boolean[]) ((sj) this).field_e[1])[1];
        }
        if (null != ((sj) this).field_d) {
            return true;
        }
        ((sj) this).field_d = ((sj) this).field_i.a(-24854);
        if (null == ((sj) this).field_d) {
            return false;
        }
        ((sj) this).field_a = new Object[((sj) this).field_d.field_d][];
        ((sj) this).field_e = new Object[((sj) this).field_d.field_d];
        return true;
    }

    final synchronized boolean b(int param0, int param1) {
        if (!((sj) this).d(-107)) {
            return false;
        }
        if (((sj) this).field_d.field_e.length == 1) {
            return ((sj) this).a(param0, 44, 0);
        }
        if (!(this.a((byte) 107, param0))) {
            return false;
        }
        if (!(1 != ((sj) this).field_d.field_e[param0])) {
            return ((sj) this).a(0, 66, param0);
        }
        if (param1 < 108) {
            int discarded$0 = ((sj) this).a((String) null, ((int[]) ((sj) this).field_e[0])[5]);
        }
        throw new RuntimeException();
    }

    final synchronized int b(int param0, byte param1) {
        if (!(this.a((byte) -104, param0))) {
            return 0;
        }
        if (!(((sj) this).field_e[param0] == null)) {
            return 100;
        }
        if (param1 != 56) {
            return -55;
        }
        return ((sj) this).field_i.a(6999, param0);
    }

    final int a(byte param0, String param1, int param2) {
        if (!(this.a((byte) -108, param2))) {
            return -1;
        }
        param1 = param1.toLowerCase();
        CharSequence var5 = (CharSequence) (Object) param1;
        int var4 = ((sj) this).field_d.field_s[param2].a(tf.a(true, var5), -78);
        if (!(this.a(param2, var4, true))) {
            return -1;
        }
        if (param0 > -63) {
            ((sj) this).field_i = null;
        }
        return var4;
    }

    final boolean a(boolean param0, String param1) {
        if (!((sj) this).d(-56)) {
            return false;
        }
        param1 = param1.toLowerCase();
        if (param0) {
            return true;
        }
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((sj) this).field_d.field_q.a(tf.a(true, var4), -123);
        return ((sj) this).b((byte) 20, var3);
    }

    final int b(String param0, int param1) {
        if (!(((sj) this).d(-100))) {
            return -1;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((sj) this).field_d.field_q.a(tf.a(true, var4), -66);
        if (!this.a((byte) 115, var3)) {
            return -1;
        }
        if (param1 != -1) {
            return ((int[]) ((sj) this).field_e[2])[0];
        }
        return var3;
    }

    final synchronized int e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Kickabout.field_G;
          if (param0 == -8185) {
            break L0;
          } else {
            boolean discarded$2 = ((sj) this).b(-94, -79);
            break L0;
          }
        }
        if (((sj) this).d(param0 + 8092)) {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L1: while (true) {
            if (((sj) this).field_e.length <= var4) {
              if (var2 == 0) {
                return 100;
              } else {
                var4 = 100 * var3 / var2;
                return var4;
              }
            } else {
              if (-1 > (((sj) this).field_d.field_i[var4] ^ -1)) {
                var3 = var3 + ((sj) this).b(var4, (byte) 56);
                var2 += 100;
                var4++;
                continue L1;
              } else {
                var4++;
                continue L1;
              }
            }
          }
        } else {
          return 0;
        }
    }

    final static void a(double param0, byte param1, double param2, double param3) {
        wm.field_C = wm.field_C + param2;
        if (param1 <= 125) {
            field_g = false;
        }
        cq.field_f = cq.field_f + param0;
        la.field_d = la.field_d + 8.0 * param3;
        if (848.0 > la.field_d) {
            la.field_d = 848.0;
        }
        if (2048.0 < la.field_d) {
            la.field_d = 2048.0;
        }
        if (!(!pb.field_B)) {
            return;
        }
        int var7 = 81920 / hw.field_i - 320;
        int var8 = 61440 / hw.field_i - 240;
        int var9 = 896 - var7;
        int var10 = -var8 + 1344;
        if ((double)var8 > cq.field_f) {
            cq.field_f = (double)var8;
        }
        if (wm.field_C < (double)var7) {
            wm.field_C = (double)var7;
        }
        if (!(cq.field_f <= (double)var10)) {
            cq.field_f = (double)var10;
        }
        if (!(wm.field_C <= (double)var9)) {
            wm.field_C = (double)var9;
        }
    }

    final static int a(int param0, int param1, byte param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = Kickabout.field_G;
        if (param2 > -71) {
            field_f = null;
        }
        int var3 = 0;
        int var4 = uq.field_c;
        while (eq.field_c.length > var3) {
            var5 = dk.field_g[var3];
            if (var5 < 0) {
                var4 = var4 + la.field_c;
            } else {
                var6 = ud.a(10, eq.field_c[var3], true);
                var7 = -(var6 >> 758025377) + ta.field_A;
                var4 = var4 + aj.field_a;
                if (ec.a(-eb.field_d + var7, param1, param0, (byte) -124, var4, var6 - -(eb.field_d << 308571105), nr.field_j + (pr.field_d << -497123871))) {
                    return var5;
                }
                var4 = var4 + ((pr.field_d << -678301567) + aj.field_a + nr.field_j);
            }
            var3++;
        }
        return -1;
    }

    final int a(boolean param0, int param1) {
        if (!(this.a((byte) 87, param1))) {
            return 0;
        }
        if (!param0) {
            boolean discarded$0 = ((sj) this).a(-87, ((int[]) ((sj) this).field_e[5])[0], -96);
        }
        return ((sj) this).field_d.field_e[param1];
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
        iw var26 = null;
        byte[] var27 = null;
        iw var29 = null;
        iw var31 = null;
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
        var22 = Kickabout.field_G;
        if (this.a((byte) 91, param0)) {
          if (null != ((sj) this).field_e[param0]) {
            L0: {
              if (param3 == 2) {
                break L0;
              } else {
                field_g = ((boolean[]) ((sj) this).field_e[1])[1];
                break L0;
              }
            }
            L1: {
              var5 = ((sj) this).field_d.field_i[param0];
              var48 = ((sj) this).field_d.field_r[param0];
              var41 = var48;
              var34 = var41;
              var24 = var34;
              var6 = var24;
              if (null == ((sj) this).field_a[param0]) {
                ((sj) this).field_a[param0] = new Object[((sj) this).field_d.field_e[param0]];
                break L1;
              } else {
                break L1;
              }
            }
            var7 = ((sj) this).field_a[param0];
            var8 = 1;
            var9_int = 0;
            L2: while (true) {
              L3: {
                if (var9_int >= var5) {
                  break L3;
                } else {
                  L4: {
                    if (var6 == null) {
                      var10 = var9_int;
                      break L4;
                    } else {
                      var10 = var48[var9_int];
                      break L4;
                    }
                  }
                  if (var7[var10] != null) {
                    var9_int++;
                    continue L2;
                  } else {
                    var8 = 0;
                    break L3;
                  }
                }
              }
              if (var8 == 0) {
                L5: {
                  L6: {
                    if (param1 == null) {
                      break L6;
                    } else {
                      L7: {
                        if (0 != param1[0]) {
                          break L7;
                        } else {
                          if (param1[1] != -1) {
                            break L7;
                          } else {
                            if (-1 != param1[2]) {
                              break L7;
                            } else {
                              if (-1 != (param1[3] ^ -1)) {
                                break L7;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                      }
                      var49 = lg.a(((sj) this).field_e[param0], true, 18828);
                      var42 = var49;
                      var35 = var42;
                      var25 = var35;
                      var9 = var25;
                      var26 = new iw(var49);
                      var26.a(var26.field_f.length, param1, true, 5);
                      break L5;
                    }
                  }
                  var9 = lg.a(((sj) this).field_e[param0], false, param3 + 18826);
                  break L5;
                }
                L8: {
                  var50 = hh.a(var9, (byte) -3);
                  var43 = var50;
                  var36 = var43;
                  var27 = var36;
                  var23 = var27;
                  var51 = var23;
                  if (!((sj) this).field_b) {
                    break L8;
                  } else {
                    ((sj) this).field_e[param0] = null;
                    break L8;
                  }
                }
                L9: {
                  if (var5 > 1) {
                    var50 = var43;
                    if ((((sj) this).field_c ^ -1) != -3) {
                      var11 = var50.length;
                      var11--;
                      var12 = var23[var11] & 255;
                      var11 = var11 - 4 * var12 * var5;
                      var31 = new iw(var51);
                      var31.field_n = var11;
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
                              var31.field_n = var11;
                              var16 = 0;
                              var17 = 0;
                              L12: while (true) {
                                if (var17 >= var12) {
                                  var17 = 0;
                                  L13: while (true) {
                                    if (var5 <= var17) {
                                      break L9;
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
                                      if (((sj) this).field_c != 0) {
                                        var7[var18] = (Object) (Object) var54[var17];
                                        var17++;
                                        continue L13;
                                      } else {
                                        var7[var18] = cq.a(var54[var17], false, ek.b(param3, 138));
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
                                      var18 = var18 + var31.k(4);
                                      dv.a(var51, var16, var54[var19], var53[var19], var18);
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
                              var16 = var16 + var31.k(4);
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
                      var11 = var11 - var5 * var12 * 4;
                      var29 = new iw(var51);
                      var14_int = 0;
                      var15_int = 0;
                      var29.field_n = var11;
                      var16 = 0;
                      L17: while (true) {
                        if (var12 <= var16) {
                          if (-1 == (var14_int ^ -1)) {
                            return true;
                          } else {
                            var52 = new byte[var14_int];
                            var14_int = 0;
                            var29.field_n = var11;
                            var17 = 0;
                            var18 = 0;
                            L18: while (true) {
                              if (var12 <= var18) {
                                var7[var15_int] = (Object) (Object) var52;
                                break L9;
                              } else {
                                var19 = 0;
                                var20 = 0;
                                L19: while (true) {
                                  if (var20 >= var5) {
                                    var18++;
                                    continue L18;
                                  } else {
                                    L20: {
                                      var19 = var19 + var29.k(4);
                                      if (var6 == null) {
                                        var21 = var20;
                                        break L20;
                                      } else {
                                        var21 = var48[var20];
                                        break L20;
                                      }
                                    }
                                    L21: {
                                      if (var21 != param2) {
                                        break L21;
                                      } else {
                                        dv.a(var51, var17, var52, var14_int, var19);
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
                            if (var18 >= var5) {
                              var16++;
                              continue L17;
                            } else {
                              L23: {
                                var17 = var17 + var29.k(4);
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
                    if (((sj) this).field_c == 0) {
                      var7[var11] = cq.a(var51, false, 136);
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
        } else {
          return false;
        }
    }

    final synchronized boolean b(byte param0, int param1) {
        if (!this.a((byte) 97, param1)) {
            return false;
        }
        if (param0 != 20) {
            Object var4 = null;
            boolean discarded$0 = ((sj) this).a((String) null, (String) null, (byte) 110);
        }
        if (((sj) this).field_e[param1] != null) {
            return true;
        }
        this.a(param1, (byte) 35);
        if (((sj) this).field_e[param1] != null) {
            return true;
        }
        return false;
    }

    final int a(String param0, int param1) {
        if (!(((sj) this).d(-124))) {
            return 0;
        }
        param0 = param0.toLowerCase();
        if (param1 != -16248) {
            ((sj) this).field_b = true;
        }
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((sj) this).field_d.field_q.a(tf.a(true, var4), -105);
        return ((sj) this).b(var3, (byte) 56);
    }

    sj(ow param0, boolean param1, int param2) {
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
          ((sj) this).field_d = null;
          if (-1 < (param2 ^ -1)) {
            break L0;
          } else {
            if ((param2 ^ -1) >= -3) {
              L1: {
                ((sj) this).field_c = param2;
                ((sj) this).field_i = param0;
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
              ((sj) this).field_b = stackIn_6_1 != 0;
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
        field_g = false;
        field_h = 4;
    }
}
