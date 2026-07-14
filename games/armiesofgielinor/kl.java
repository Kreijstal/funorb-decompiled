/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl {
    private Object[][] field_c;
    private ew field_g;
    private jm field_j;
    int field_e;
    boolean field_b;
    static sa field_k;
    private Object[] field_h;
    static String field_d;
    static String field_f;
    static v field_a;
    static volatile int field_i;

    final synchronized int a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        if (((kl) this).a((byte) 82)) {
          var2 = param0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (var4 >= ((kl) this).field_h.length) {
              if (-1 == (var2 ^ -1)) {
                return 100;
              } else {
                var4 = var3 * 100 / var2;
                return var4;
              }
            } else {
              if (((kl) this).field_j.field_p[var4] > 0) {
                var3 = var3 + ((kl) this).b(var4, (byte) 73);
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

    private final synchronized byte[] a(int[] param0, int param1, int param2, int param3) {
        Object var5 = null;
        byte[] var5_array = null;
        Object var7 = null;
        byte[] var8 = null;
        if (this.b(param3, 0, param2)) {
          L0: {
            if (param1 >= 113) {
              break L0;
            } else {
              var7 = null;
              boolean discarded$1 = ((kl) this).a(((byte[]) ((kl) this).field_h[1])[1], (String) null);
              break L0;
            }
          }
          L1: {
            L2: {
              var5 = null;
              if (null == ((kl) this).field_c[param3]) {
                break L2;
              } else {
                if (((kl) this).field_c[param3][param2] != null) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            if (this.a(param2, 0, param0, param3)) {
              break L1;
            } else {
              this.a(true, param3);
              if (this.a(param2, 0, param0, param3)) {
                break L1;
              } else {
                return null;
              }
            }
          }
          if (null != ((kl) this).field_c[param3]) {
            L3: {
              if (null != ((kl) this).field_c[param3][param2]) {
                var8 = ko.a(false, 80, ((kl) this).field_c[param3][param2]);
                var5_array = var8;
                if (var8 == null) {
                  throw new RuntimeException("");
                } else {
                  break L3;
                }
              } else {
                break L3;
              }
            }
            L4: {
              if (var5_array != null) {
                if (((kl) this).field_e == 1) {
                  ((kl) this).field_c[param3][param2] = null;
                  if (((kl) this).field_j.field_h[param3] == 1) {
                    ((kl) this).field_c[param3] = null;
                    break L4;
                  } else {
                    break L4;
                  }
                } else {
                  if (((kl) this).field_e == 2) {
                    ((kl) this).field_c[param3] = null;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              } else {
                break L4;
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

    final boolean a(int param0, String param1) {
        if (!((kl) this).a((byte) 82)) {
            return false;
        }
        if (param0 != 28979) {
            field_a = (v) ((kl) this).field_h[6];
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((kl) this).field_j.field_l.a(rs.a((byte) -116, var4), 1);
        return ((kl) this).a(param0 + -17085, var3);
    }

    public static void b(int param0) {
        field_k = null;
        if (param0 != -1) {
            return;
        }
        field_a = null;
        field_f = null;
        field_d = null;
    }

    final boolean a(int param0, String param1, String param2) {
        if (!(((kl) this).a((byte) 82))) {
            return false;
        }
        param2 = param2.toLowerCase();
        param1 = param1.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param2;
        int var4 = ((kl) this).field_j.field_l.a(rs.a((byte) -116, var6), 1);
        if (!(this.c(var4, -24876))) {
            return false;
        }
        if (param0 > -51) {
            return ((boolean[]) ((kl) this).field_h[13])[11];
        }
        CharSequence var7 = (CharSequence) (Object) param1;
        int var5 = ((kl) this).field_j.field_f[var4].a(rs.a((byte) -116, var7), 1);
        return ((kl) this).a(var4, var5, 0);
    }

    final synchronized byte[] c(int param0, byte param1) {
        if (!((kl) this).a((byte) 82)) {
            return null;
        }
        if (param1 != 81) {
            boolean discarded$0 = ((kl) this).a(21, 79);
        }
        if (!(((kl) this).field_j.field_h.length != 1)) {
            return ((kl) this).a((byte) 99, param0, 0);
        }
        if (!this.c(param0, param1 ^ -24955)) {
            return null;
        }
        if (!(1 != ((kl) this).field_j.field_h[param0])) {
            return ((kl) this).a((byte) 94, 0, param0);
        }
        throw new RuntimeException();
    }

    final int e(int param0) {
        if (!(((kl) this).a((byte) 82))) {
            return -1;
        }
        if (param0 >= -96) {
            kl.b(52);
        }
        return ((kl) this).field_j.field_h.length;
    }

    final synchronized int[] b(int param0, int param1) {
        int[] var6 = null;
        int var4 = 0;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 > -24) {
            ((int[]) ((kl) this).field_h[0])[43] = ((int[]) ((Object[]) ((Object[]) ((kl) this).field_h[0])[13])[2])[6];
        }
        if (!this.c(param1, -24876)) {
            return null;
        }
        int[] var3 = ((kl) this).field_j.field_a[param1];
        if (!(var3 != null)) {
            var6 = new int[((kl) this).field_j.field_p[param1]];
            var3 = var6;
            for (var4 = 0; var4 < var6.length; var4++) {
                var6[var4] = var4;
            }
        }
        return var3;
    }

    private final synchronized boolean b(int param0, int param1, int param2) {
        if (!(((kl) this).a((byte) 82))) {
            return false;
        }
        if (param1 != 0) {
            ((kl) this).field_e = -128;
        }
        if (param0 <= -1) {
            if (-1 <= param2) {
                if (((kl) this).field_j.field_h.length > param0) {
                    if (((kl) this).field_j.field_h[param0] > param2) {
                        return true;
                    }
                }
            }
        }
        if (wh.field_f) {
            throw new IllegalArgumentException(param0 + " " + param2);
        }
        return false;
    }

    final static int c(int param0, int param1, int param2) {
        int var3 = -33 % ((param1 - 33) / 62);
        if (2 > param2) {
            if (5 > param0) {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    final int a(String param0, int param1) {
        if (!(((kl) this).a((byte) 82))) {
            return -1;
        }
        param0 = param0.toLowerCase();
        if (param1 < 89) {
            field_f = (String) ((Object[]) ((kl) this).field_h[9])[6];
        }
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((kl) this).field_j.field_l.a(rs.a((byte) -116, var4), 1);
        if (!(this.c(var3, -24876))) {
            return -1;
        }
        return var3;
    }

    final synchronized boolean a(int param0, int param1) {
        if (!this.c(param1, param0 + -36770)) {
            return false;
        }
        if (((kl) this).field_h[param1] != null) {
            return true;
        }
        if (param0 != 11894) {
            field_d = (String) ((Object[]) ((Object[]) ((kl) this).field_h[8])[7])[5];
        }
        this.a(true, param1);
        if (((kl) this).field_h[param1] != null) {
            return true;
        }
        return false;
    }

    final synchronized boolean a(int param0, int param1, int param2) {
        if (!this.b(param0, param2, param1)) {
            return false;
        }
        if (null != ((kl) this).field_c[param0]) {
            if (((kl) this).field_c[param0][param1] != null) {
                return true;
            }
        }
        if (null != ((kl) this).field_h[param0]) {
            return true;
        }
        this.a(true, param0);
        if (null != ((kl) this).field_h[param0]) {
            return true;
        }
        return false;
    }

    final synchronized boolean d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (((kl) this).a((byte) 82)) {
          L0: {
            var2 = 1;
            if (param0 == -27927) {
              break L0;
            } else {
              int discarded$2 = kl.c(((int[]) ((kl) this).field_h[1])[2], 24, 50);
              break L0;
            }
          }
          var3 = 0;
          L1: while (true) {
            if (((kl) this).field_j.field_q.length <= var3) {
              return var2 != 0;
            } else {
              var4 = ((kl) this).field_j.field_q[var3];
              if (((kl) this).field_h[var4] == null) {
                this.a(true, var4);
                if (null == ((kl) this).field_h[var4]) {
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

    private final synchronized boolean c(int param0, int param1) {
        if (param1 != -24876) {
            return true;
        }
        if (!((kl) this).a((byte) 82)) {
            return false;
        }
        if ((param0 ^ -1) <= -1) {
            if (param0 < ((kl) this).field_j.field_h.length) {
                if (((kl) this).field_j.field_h[param0] != 0) {
                    return true;
                }
            }
        }
        if (!wh.field_f) {
            return false;
        }
        throw new IllegalArgumentException(Integer.toString(param0));
    }

    final synchronized boolean a(byte param0) {
        if (param0 != 82) {
            int discarded$0 = ((kl) this).a(-110);
        }
        if (null != ((kl) this).field_j) {
            return true;
        }
        ((kl) this).field_j = ((kl) this).field_g.a(param0 ^ 20097);
        if (!(null != ((kl) this).field_j)) {
            return false;
        }
        ((kl) this).field_c = new Object[((kl) this).field_j.field_i][];
        ((kl) this).field_h = new Object[((kl) this).field_j.field_i];
        return true;
    }

    final boolean a(byte param0, String param1) {
        if (!(((kl) this).a((byte) 82))) {
            return false;
        }
        param1 = param1.toLowerCase();
        if (param0 > -127) {
            return true;
        }
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((kl) this).field_j.field_l.a(rs.a((byte) -116, var4), 1);
        if (0 > var3) {
            return false;
        }
        return true;
    }

    final int a(byte param0, int param1, String param2) {
        int var4 = -107 % ((76 - param0) / 40);
        if (!(this.c(param1, -24876))) {
            return -1;
        }
        param2 = param2.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param2;
        int var5 = ((kl) this).field_j.field_f[param1].a(rs.a((byte) -116, var6), 1);
        if (!this.b(param1, 0, var5)) {
            return -1;
        }
        return var5;
    }

    final static void c(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_24_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        L0: {
          var1 = sm.field_d;
          var2 = ko.field_b;
          if (param0 == -20193) {
            break L0;
          } else {
            field_d = null;
            break L0;
          }
        }
        L1: {
          if (-2 != (tr.field_A ^ -1)) {
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        L2: {
          var3 = stackIn_5_0;
          if (ro.field_ub != 1) {
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            break L2;
          } else {
            stackOut_6_0 = 1;
            stackIn_8_0 = stackOut_6_0;
            break L2;
          }
        }
        var4 = stackIn_8_0;
        st.field_z.a(87, var4 != 0, var3 != 0, var1, var2, el.field_d);
        L3: while (true) {
          if (!jd.i((byte) -61)) {
            return;
          } else {
            L4: {
              if (13 != rs.field_q) {
                break L4;
              } else {
                bv.a(true, 0, param0 + 20194, jt.field_a);
                break L4;
              }
            }
            L5: {
              if (12 == rs.field_q) {
                L6: {
                  if (ln.field_e) {
                    stackOut_16_0 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    break L6;
                  } else {
                    stackOut_15_0 = 1;
                    stackIn_17_0 = stackOut_15_0;
                    break L6;
                  }
                }
                ln.field_e = stackIn_17_0 != 0;
                break L5;
              } else {
                break L5;
              }
            }
            if (rs.field_q != 11) {
              continue L3;
            } else {
              if (hi.field_j >= 2) {
                L7: {
                  if (jv.field_a) {
                    stackOut_23_0 = 0;
                    stackIn_24_0 = stackOut_23_0;
                    break L7;
                  } else {
                    stackOut_22_0 = 1;
                    stackIn_24_0 = stackOut_22_0;
                    break L7;
                  }
                }
                jv.field_a = stackIn_24_0 != 0;
                return;
              } else {
                continue L3;
              }
            }
          }
        }
    }

    final synchronized byte[] a(String param0, int param1, String param2) {
        if (!((kl) this).a((byte) 82)) {
            return null;
        }
        param2 = param2.toLowerCase();
        param0 = param0.toLowerCase();
        int var4 = 119 % ((param1 - -36) / 44);
        CharSequence var7 = (CharSequence) (Object) param2;
        int var5 = ((kl) this).field_j.field_l.a(rs.a((byte) -116, var7), 1);
        if (!this.c(var5, -24876)) {
            return null;
        }
        CharSequence var8 = (CharSequence) (Object) param0;
        int var6 = ((kl) this).field_j.field_f[var5].a(rs.a((byte) -116, var8), 1);
        return ((kl) this).a((byte) 119, var6, var5);
    }

    final synchronized boolean a(int param0, byte param1) {
        if (!((kl) this).a((byte) 82)) {
            return false;
        }
        if (param1 != -56) {
            field_d = null;
        }
        if (1 == ((kl) this).field_j.field_h.length) {
            return ((kl) this).a(0, param0, 0);
        }
        if (!this.c(param0, param1 ^ 24860)) {
            return false;
        }
        if (!(-2 != (((kl) this).field_j.field_h[param0] ^ -1))) {
            return ((kl) this).a(param0, 0, param1 + 56);
        }
        throw new RuntimeException();
    }

    final int d(int param0, int param1) {
        if (param1 != -2) {
            return -27;
        }
        if (!this.c(param0, -24876)) {
            return 0;
        }
        return ((kl) this).field_j.field_h[param0];
    }

    final byte[] a(byte param0, int param1, int param2) {
        if (param0 <= 42) {
            return null;
        }
        return this.a((int[]) null, 116, param1, param2);
    }

    private final synchronized boolean a(int param0, int param1, int[] param2, int param3) {
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
        vh var26 = null;
        byte[] var27 = null;
        vh var29 = null;
        vh var31 = null;
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
        var22 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (this.c(param3, -24876)) {
          if (null == ((kl) this).field_h[param3]) {
            return false;
          } else {
            L0: {
              var5 = ((kl) this).field_j.field_p[param3];
              var48 = ((kl) this).field_j.field_a[param3];
              var41 = var48;
              var34 = var41;
              var24 = var34;
              var6 = var24;
              if (((kl) this).field_c[param3] != null) {
                break L0;
              } else {
                ((kl) this).field_c[param3] = new Object[((kl) this).field_j.field_h[param3]];
                break L0;
              }
            }
            var7 = ((kl) this).field_c[param3];
            var8 = 1;
            var9_int = param1;
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
                    if (param2 == null) {
                      break L5;
                    } else {
                      L6: {
                        if (param2[0] != 0) {
                          break L6;
                        } else {
                          if (0 != param2[1]) {
                            break L6;
                          } else {
                            if (param2[2] != 0) {
                              break L6;
                            } else {
                              if (param2[3] != 0) {
                                break L6;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      var49 = ko.a(true, 42, ((kl) this).field_h[param3]);
                      var42 = var49;
                      var35 = var42;
                      var25 = var35;
                      var9 = var25;
                      var26 = new vh(var49);
                      var26.a(param2, var26.field_o.length, 5, -12366);
                      break L4;
                    }
                  }
                  var9 = ko.a(false, 87, ((kl) this).field_h[param3]);
                  break L4;
                }
                L7: {
                  var50 = el.a(false, var9);
                  var43 = var50;
                  var36 = var43;
                  var27 = var36;
                  var23 = var27;
                  var51 = var23;
                  if (((kl) this).field_b) {
                    ((kl) this).field_h[param3] = null;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (-2 > var5) {
                    var50 = var43;
                    if (-3 != (((kl) this).field_e ^ -1)) {
                      var11 = var50.length;
                      var11--;
                      var12 = 255 & var23[var11];
                      var11 = var11 - 4 * (var12 * var5);
                      var31 = new vh(var51);
                      var53 = new int[var5];
                      var46 = var53;
                      var39 = var46;
                      var32 = var39;
                      var14 = var32;
                      var31.field_q = var11;
                      var15_int = 0;
                      L9: while (true) {
                        if (var12 <= var15_int) {
                          var54 = new byte[var5][];
                          var47 = var54;
                          var40 = var47;
                          var33 = var40;
                          var15 = var33;
                          var16 = 0;
                          L10: while (true) {
                            if (var16 >= var5) {
                              var31.field_q = var11;
                              var16 = 0;
                              var17 = 0;
                              L11: while (true) {
                                if (var12 <= var17) {
                                  var17 = 0;
                                  L12: while (true) {
                                    if (var17 >= var5) {
                                      break L8;
                                    } else {
                                      L13: {
                                        if (var6 != null) {
                                          var18 = var48[var17];
                                          break L13;
                                        } else {
                                          var18 = var17;
                                          break L13;
                                        }
                                      }
                                      if (0 != ((kl) this).field_e) {
                                        var7[var18] = (Object) (Object) var54[var17];
                                        var17++;
                                        continue L12;
                                      } else {
                                        var7[var18] = pf.a(param1 + 0, var54[var17], false);
                                        var17++;
                                        continue L12;
                                      }
                                    }
                                  }
                                } else {
                                  var18 = 0;
                                  var19 = 0;
                                  L14: while (true) {
                                    if (var19 >= var5) {
                                      var17++;
                                      continue L11;
                                    } else {
                                      var18 = var18 + var31.i(1);
                                      vm.a(var51, var16, var54[var19], var53[var19], var18);
                                      var16 = var16 + var18;
                                      var14[var19] = var14[var19] + var18;
                                      var19++;
                                      continue L14;
                                    }
                                  }
                                }
                              }
                            } else {
                              var15[var16] = new byte[var53[var16]];
                              var53[var16] = 0;
                              var16++;
                              continue L10;
                            }
                          }
                        } else {
                          var16 = 0;
                          var17 = 0;
                          L15: while (true) {
                            if (var17 >= var5) {
                              var15_int++;
                              continue L9;
                            } else {
                              var16 = var16 + var31.i(param1 + 1);
                              var14[var17] = var14[var17] + var16;
                              var17++;
                              continue L15;
                            }
                          }
                        }
                      }
                    } else {
                      var11 = var50.length;
                      var11--;
                      var12 = var23[var11] & 255;
                      var11 = var11 - var12 * var5 * 4;
                      var29 = new vh(var51);
                      var14_int = 0;
                      var15_int = 0;
                      var29.field_q = var11;
                      var16 = 0;
                      L16: while (true) {
                        if (var16 >= var12) {
                          if (0 == var14_int) {
                            return true;
                          } else {
                            var52 = new byte[var14_int];
                            var29.field_q = var11;
                            var14_int = 0;
                            var17 = 0;
                            var18 = 0;
                            L17: while (true) {
                              if (var18 >= var12) {
                                var7[var15_int] = (Object) (Object) var52;
                                break L8;
                              } else {
                                var19 = 0;
                                var20 = 0;
                                L18: while (true) {
                                  if (var5 <= var20) {
                                    var18++;
                                    continue L17;
                                  } else {
                                    L19: {
                                      var19 = var19 + var29.i(param1 ^ 1);
                                      if (var6 != null) {
                                        var21 = var48[var20];
                                        break L19;
                                      } else {
                                        var21 = var20;
                                        break L19;
                                      }
                                    }
                                    L20: {
                                      if (var21 == param0) {
                                        vm.a(var51, var17, var52, var14_int, var19);
                                        var14_int = var14_int + var19;
                                        break L20;
                                      } else {
                                        break L20;
                                      }
                                    }
                                    var17 = var17 + var19;
                                    var20++;
                                    continue L18;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var17 = 0;
                          var18 = 0;
                          L21: while (true) {
                            if (var18 >= var5) {
                              var16++;
                              continue L16;
                            } else {
                              L22: {
                                var17 = var17 + var29.i(1);
                                if (var6 != null) {
                                  var19 = var48[var18];
                                  break L22;
                                } else {
                                  var19 = var18;
                                  break L22;
                                }
                              }
                              if (param0 == var19) {
                                var14_int = var14_int + var17;
                                var15_int = var19;
                                var18++;
                                continue L21;
                              } else {
                                var18++;
                                continue L21;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    L23: {
                      if (var6 == null) {
                        var50 = var43;
                        var11 = 0;
                        break L23;
                      } else {
                        var11 = var48[0];
                        break L23;
                      }
                    }
                    var50 = var43;
                    if (-1 == ((kl) this).field_e) {
                      var7[var11] = pf.a(0, var51, false);
                      break L8;
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
          }
        } else {
          return false;
        }
    }

    final int a(String param0, byte param1) {
        int var3 = 98 % ((param1 - 39) / 43);
        if (!((kl) this).a((byte) 82)) {
            return 0;
        }
        param0 = param0.toLowerCase();
        CharSequence var5 = (CharSequence) (Object) param0;
        int var4 = ((kl) this).field_j.field_l.a(rs.a((byte) -116, var5), 1);
        return ((kl) this).b(var4, (byte) 73);
    }

    kl(ew param0, boolean param1, int param2) {
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
          ((kl) this).field_j = null;
          if ((param2 ^ -1) > -1) {
            break L0;
          } else {
            if ((param2 ^ -1) >= -3) {
              L1: {
                ((kl) this).field_g = param0;
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
              ((kl) this).field_b = stackIn_6_1 != 0;
              ((kl) this).field_e = param2;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("");
    }

    final synchronized int b(int param0, byte param1) {
        if (!(this.c(param0, -24876))) {
            return 0;
        }
        if (((kl) this).field_h[param0] != null) {
            return 100;
        }
        if (param1 != 73) {
            kl.b(-64);
        }
        return ((kl) this).field_g.b(5926, param0);
    }

    private final synchronized void a(boolean param0, int param1) {
        if (!param0) {
            ((kl) this).field_h = (Object[]) ((kl) this).field_h[2];
        }
        if (!((kl) this).field_b) {
            ((kl) this).field_h[param1] = pf.a(0, ((kl) this).field_g.a(param1, 4), false);
        } else {
            ((kl) this).field_h[param1] = (Object) (Object) ((kl) this).field_g.a(param1, 4);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new sa();
        field_d = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_f = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
        field_i = -1;
    }
}
