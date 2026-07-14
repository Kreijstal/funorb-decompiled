/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf {
    private wf field_e;
    private lh field_h;
    static oj field_b;
    static boolean field_c;
    private int field_g;
    private Object[] field_f;
    private Object[][] field_d;
    private boolean field_a;

    final static int a(CharSequence param0, byte param1) {
        if (param1 != 125) {
            return -69;
        }
        return uj.a(param0, (byte) 98, 10, true);
    }

    public static void a(int param0) {
        if (param0 != 30300) {
            Object var2 = null;
            pf.a(-33, (String) null);
        }
        field_b = null;
    }

    final static pb[] a(String param0, byte param1, String param2, pf param3) {
        int var5 = -50 / ((19 - param1) / 61);
        int var4 = param3.b(param0, (byte) -118);
        int var6 = param3.a(var4, param2, (byte) -11);
        return vf.a(param3, (byte) -78, var6, var4);
    }

    final synchronized boolean a(byte param0) {
        if (param0 != -36) {
            boolean discarded$0 = this.c(((int[]) ((Object[]) ((pf) this).field_f[2])[41])[5], 113, 73);
        }
        if (((pf) this).field_h != null) {
            return true;
        }
        ((pf) this).field_h = ((pf) this).field_e.a(-107);
        if (!(((pf) this).field_h != null)) {
            return false;
        }
        ((pf) this).field_d = new Object[((pf) this).field_h.field_e][];
        ((pf) this).field_f = new Object[((pf) this).field_h.field_e];
        return true;
    }

    final boolean b(String param0, String param1, byte param2) {
        if (!((pf) this).a((byte) -36)) {
            return false;
        }
        param0 = param0.toLowerCase();
        if (param2 != 42) {
            return ((boolean[]) ((pf) this).field_f[5])[1];
        }
        param1 = param1.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param0;
        int var4 = ((pf) this).field_h.field_q.a(rl.a(var6, (byte) 58), param2 + 85);
        if (!this.b(var4, param2 ^ -7256)) {
            return false;
        }
        CharSequence var7 = (CharSequence) (Object) param1;
        int var5 = ((pf) this).field_h.field_c[var4].a(rl.a(var7, (byte) 115), 65);
        return ((pf) this).b(0, var4, var5);
    }

    private final synchronized byte[] a(int param0, int param1, byte param2, int[] param3) {
        Object var5 = null;
        byte[] var5_array = null;
        int var6 = 0;
        byte[] var7 = null;
        if (this.c(param1, param0, -21293)) {
          L0: {
            L1: {
              var5 = null;
              if (((pf) this).field_d[param1] == null) {
                break L1;
              } else {
                if (((pf) this).field_d[param1][param0] == null) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            if (this.a(0, param1, param0, param3)) {
              break L0;
            } else {
              this.a((byte) -78, param1);
              if (this.a(0, param1, param0, param3)) {
                break L0;
              } else {
                return null;
              }
            }
          }
          if (((pf) this).field_d[param1] == null) {
            throw new RuntimeException("");
          } else {
            L2: {
              if (null != ((pf) this).field_d[param1][param0]) {
                var7 = tf.a(2, false, ((pf) this).field_d[param1][param0]);
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
              var6 = -32 % ((param2 - -60) / 38);
              if (var5_array == null) {
                break L3;
              } else {
                if ((((pf) this).field_g ^ -1) == -2) {
                  ((pf) this).field_d[param1][param0] = null;
                  if (-2 == (((pf) this).field_h.field_g[param1] ^ -1)) {
                    ((pf) this).field_d[param1] = null;
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  if (((pf) this).field_g == 2) {
                    ((pf) this).field_d[param1] = null;
                    break L3;
                  } else {
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
    }

    final static n a(int param0, ha param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        n var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = stellarshard.field_B;
        var2 = param1.e(8, 8);
        if (0 >= var2) {
          L0: {
            var3 = mh.a(param1, (byte) -124) ? 1 : 0;
            var4 = mh.a(param1, (byte) -44) ? 1 : 0;
            var5 = new n();
            var5.field_n = (short)param1.e(16, 8);
            var5.field_f = vh.a((byte) 87, var5.field_f, param0, param1);
            var5.field_b = vh.a((byte) 120, var5.field_b, 16, param1);
            var5.field_a = vh.a((byte) 91, var5.field_a, 16, param1);
            var5.field_C = (short)param1.e(16, 8);
            var5.field_l = vh.a((byte) 99, var5.field_l, 16, param1);
            var5.field_z = vh.a((byte) 96, var5.field_z, 16, param1);
            var5.field_m = vh.a((byte) 82, var5.field_m, 16, param1);
            if (var3 != 0) {
              var5.field_D = (short)param1.e(16, 8);
              var5.field_r = vh.a((byte) 106, var5.field_r, 16, param1);
              var5.field_e = vh.a((byte) 54, var5.field_e, 16, param1);
              var5.field_K = vh.a((byte) 34, var5.field_K, 16, param1);
              var5.field_M = vh.a((byte) 110, var5.field_M, 16, param1);
              var5.field_h = vh.a((byte) 84, var5.field_h, 16, param1);
              var5.field_v = vh.a((byte) 65, var5.field_v, 16, param1);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (var4 != 0) {
              int discarded$1 = param1.e(16, 8);
              var5.field_H = vh.a((byte) 23, var5.field_H, 16, param1);
              var5.field_E = vh.a((byte) 88, var5.field_E, 16, param1);
              var5.field_P = vh.a((byte) 48, var5.field_P, 16, param1);
              var5.field_s = vh.a((byte) 84, var5.field_s, 16, param1);
              var5.field_I = vh.a((byte) 116, var5.field_I, 16, param1);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (!mh.a(param1, (byte) -79)) {
              break L2;
            } else {
              var5.field_c = vh.a((byte) 22, var5.field_c, 16, param1);
              break L2;
            }
          }
          L3: {
            if (!mh.a(param1, (byte) -126)) {
              break L3;
            } else {
              var5.field_g = wh.a(16, param1, var5.field_g, (byte) 50);
              var6 = 0;
              var7 = 0;
              L4: while (true) {
                if (var5.field_g.length <= var7) {
                  if (-1 == (var6 ^ -1)) {
                    var5.field_g = null;
                    break L3;
                  } else {
                    var5.field_N = (byte)(1 + var6);
                    break L3;
                  }
                } else {
                  if ((255 & var5.field_g[var7]) > var6) {
                    var6 = var5.field_g[var7] & 255;
                    var7++;
                    continue L4;
                  } else {
                    var7++;
                    continue L4;
                  }
                }
              }
            }
          }
          return var5;
        } else {
          throw new IllegalStateException("" + var2);
        }
    }

    final int b(int param0, String param1) {
        if (!((pf) this).a((byte) -36)) {
            return 0;
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((pf) this).field_h.field_q.a(rl.a(var4, (byte) 80), 111);
        if (param0 != 0) {
            ((byte[]) ((pf) this).field_f[3])[0] = (byte) 66;
        }
        return ((pf) this).a(var3, 0);
    }

    private final synchronized boolean c(int param0, int param1, int param2) {
        if (param2 == -21293) {
          if (!((pf) this).a((byte) -36)) {
            return false;
          } else {
            L0: {
              if (param0 < 0) {
                break L0;
              } else {
                if (-1 < (param1 ^ -1)) {
                  break L0;
                } else {
                  if (((pf) this).field_h.field_g.length <= param0) {
                    break L0;
                  } else {
                    if (((pf) this).field_h.field_g[param0] > param1) {
                      return true;
                    } else {
                      break L0;
                    }
                  }
                }
              }
            }
            if (fe.field_b) {
              throw new IllegalArgumentException(param0 + " " + param1);
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    final synchronized int a(int param0, int param1) {
        if (param1 != 0) {
            return 20;
        }
        if (!this.b(param0, -7294)) {
            return 0;
        }
        if (!(null == ((pf) this).field_f[param0])) {
            return 100;
        }
        return ((pf) this).field_e.a(0, param0);
    }

    final synchronized boolean c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        var5 = stellarshard.field_B;
        if (((pf) this).a((byte) -36)) {
          var2 = 1;
          var3 = 0;
          L0: while (true) {
            if (var3 >= ((pf) this).field_h.field_k.length) {
              L1: {
                if (param0 == -111) {
                  break L1;
                } else {
                  var6 = null;
                  byte[] discarded$1 = this.a(((int[]) ((pf) this).field_f[0])[4], ((int[]) ((pf) this).field_f[0])[6], (byte) 73, (int[]) null);
                  break L1;
                }
              }
              return var2 != 0;
            } else {
              var4 = ((pf) this).field_h.field_k[var3];
              if (((pf) this).field_f[var4] == null) {
                this.a((byte) -85, var4);
                if (((pf) this).field_f[var4] == null) {
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

    final int a(int param0, String param1, byte param2) {
        if (!this.b(param0, -7294)) {
            return -1;
        }
        param1 = param1.toLowerCase();
        if (param2 != -11) {
            this.a((byte) -32, -9);
        }
        CharSequence var5 = (CharSequence) (Object) param1;
        int var4 = ((pf) this).field_h.field_c[param0].a(rl.a(var5, (byte) 88), param2 ^ 117);
        if (!this.c(param0, var4, param2 ^ 21286)) {
            return -1;
        }
        return var4;
    }

    final synchronized int b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = stellarshard.field_B;
        if (((pf) this).a((byte) -36)) {
          L0: {
            var2 = 0;
            if (param0 == 1) {
              break L0;
            } else {
              this.a((byte) 33, -59);
              break L0;
            }
          }
          var3 = 0;
          var4 = 0;
          L1: while (true) {
            if (var4 >= ((pf) this).field_f.length) {
              if (-1 == var2) {
                return 100;
              } else {
                var4 = 100 * var3 / var2;
                return var4;
              }
            } else {
              if (((pf) this).field_h.field_p[var4] < -1) {
                var3 = var3 + ((pf) this).a(var4, param0 ^ 1);
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

    final static void a(int param0, String param1) {
        System.out.println("Error: " + gg.a(param1, "\n", "%0a", 97));
        if (param0 != 17651) {
            pf.a(20);
        }
    }

    final synchronized byte[] a(String param0, String param1, byte param2) {
        if (!((pf) this).a((byte) -36)) {
            return null;
        }
        param0 = param0.toLowerCase();
        param1 = param1.toLowerCase();
        CharSequence var7 = (CharSequence) (Object) param0;
        int var4 = ((pf) this).field_h.field_q.a(rl.a(var7, (byte) 72), 0);
        if (param2 != -12) {
            Object var6 = null;
            boolean discarded$0 = ((pf) this).b((String) null, (String) null, (byte) 114);
        }
        if (!this.b(var4, -7294)) {
            return null;
        }
        CharSequence var8 = (CharSequence) (Object) param1;
        int var5 = ((pf) this).field_h.field_c[var4].a(rl.a(var8, (byte) 97), -125);
        return ((pf) this).a(var5, 16, var4);
    }

    final synchronized boolean b(int param0, int param1, int param2) {
        if (!this.c(param1, param2, -21293)) {
            return false;
        }
        if (param0 != 0) {
            ((pf) this).field_e = null;
        }
        if (((pf) this).field_d[param1] != null) {
            if (!(null == ((pf) this).field_d[param1][param2])) {
                return true;
            }
        }
        if (!(null == ((pf) this).field_f[param1])) {
            return true;
        }
        this.a((byte) 118, param1);
        if (null != ((pf) this).field_f[param1]) {
            return true;
        }
        return false;
    }

    final synchronized boolean a(int param0, byte param1) {
        int var3 = 48 / ((param1 - 72) / 51);
        if (!this.b(param0, -7294)) {
            return false;
        }
        if (!(((pf) this).field_f[param0] == null)) {
            return true;
        }
        this.a((byte) -103, param0);
        if (null == ((pf) this).field_f[param0]) {
            return false;
        }
        return true;
    }

    private final synchronized boolean b(int param0, int param1) {
        if (!((pf) this).a((byte) -36)) {
            return false;
        }
        if (param1 != -7294) {
            boolean discarded$0 = this.b(((int[]) ((Object[]) ((pf) this).field_f[2])[11])[5], -36);
        }
        if ((param0 ^ -1) <= -1) {
            if (param0 < ((pf) this).field_h.field_g.length) {
                if (0 != ((pf) this).field_h.field_g[param0]) {
                    return true;
                }
            }
        }
        if (!fe.field_b) {
            return false;
        }
        throw new IllegalArgumentException(Integer.toString(param0));
    }

    final boolean c(String param0, byte param1) {
        if (!(((pf) this).a((byte) -36))) {
            return false;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((pf) this).field_h.field_q.a(rl.a(var4, (byte) 95), 122);
        if (!(0 <= var3)) {
            return false;
        }
        if (param1 != -116) {
            boolean discarded$0 = ((pf) this).a((byte) 95);
            return true;
        }
        return true;
    }

    final boolean a(String param0, byte param1) {
        if (!((pf) this).a((byte) -36)) {
            return false;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((pf) this).field_h.field_q.a(rl.a(var4, (byte) 124), param1 + -17);
        if (param1 != -109) {
            ((pf) this).field_h = null;
        }
        return ((pf) this).a(var3, (byte) -121);
    }

    private final synchronized void a(byte param0, int param1) {
        int var3 = -23 / ((param0 - 7) / 54);
        if (((pf) this).field_a) {
            ((pf) this).field_f[param1] = (Object) (Object) ((pf) this).field_e.a((byte) 35, param1);
        } else {
            ((pf) this).field_f[param1] = ch.a(136, false, ((pf) this).field_e.a((byte) 35, param1));
        }
    }

    final byte[] a(int param0, int param1, int param2) {
        if (param1 != 16) {
            ((pf) this).field_a = false;
        }
        return this.a(param0, param2, (byte) -98, (int[]) null);
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
        ka var26 = null;
        byte[] var27 = null;
        ka var29 = null;
        ka var31 = null;
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
        var22 = stellarshard.field_B;
        if (!this.b(param1, -7294)) {
          return false;
        } else {
          if (null == ((pf) this).field_f[param1]) {
            return false;
          } else {
            L0: {
              var5 = ((pf) this).field_h.field_p[param1];
              var48 = ((pf) this).field_h.field_b[param1];
              var41 = var48;
              var34 = var41;
              var24 = var34;
              var6 = var24;
              if (((pf) this).field_d[param1] == null) {
                ((pf) this).field_d[param1] = new Object[((pf) this).field_h.field_g[param1]];
                break L0;
              } else {
                break L0;
              }
            }
            var7 = ((pf) this).field_d[param1];
            var8 = 1;
            var9_int = param0;
            L1: while (true) {
              L2: {
                if (var9_int >= var5) {
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
                            if (param3[2] != 0) {
                              break L6;
                            } else {
                              if (0 != param3[3]) {
                                break L6;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      var49 = tf.a(2, true, ((pf) this).field_f[param1]);
                      var42 = var49;
                      var35 = var42;
                      var25 = var35;
                      var9 = var25;
                      var26 = new ka(var49);
                      var26.a(99, param3, 5, var26.field_r.length);
                      break L4;
                    }
                  }
                  var9 = tf.a(2, false, ((pf) this).field_f[param1]);
                  break L4;
                }
                L7: {
                  var50 = sl.a((byte) -76, var9);
                  var43 = var50;
                  var36 = var43;
                  var27 = var36;
                  var23 = var27;
                  var51 = var23;
                  if (((pf) this).field_a) {
                    ((pf) this).field_f[param1] = null;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (var5 < -2) {
                    var50 = var43;
                    if (2 != ((pf) this).field_g) {
                      var50 = var43;
                      var11 = var50.length;
                      var11--;
                      var12 = 255 & var23[var11];
                      var11 = var11 - var5 * (var12 * 4);
                      var31 = new ka(var51);
                      var53 = new int[var5];
                      var46 = var53;
                      var39 = var46;
                      var32 = var39;
                      var14 = var32;
                      var31.field_k = var11;
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
                            if (var5 <= var16) {
                              var31.field_k = var11;
                              var16 = 0;
                              var17 = 0;
                              L11: while (true) {
                                if (var12 <= var17) {
                                  var17 = 0;
                                  L12: while (true) {
                                    if (var5 <= var17) {
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
                                      if (-1 != (((pf) this).field_g ^ -1)) {
                                        var7[var18] = (Object) (Object) var54[var17];
                                        var17++;
                                        continue L12;
                                      } else {
                                        var7[var18] = ch.a(136, false, var54[var17]);
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
                                      var18 = var18 + var31.b(false);
                                      ri.a(var51, var16, var54[var19], var53[var19], var18);
                                      var14[var19] = var14[var19] + var18;
                                      var16 = var16 + var18;
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
                              var16 = var16 + var31.b(false);
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
                      var11 = var11 - var5 * (var12 * 4);
                      var29 = new ka(var51);
                      var14_int = 0;
                      var29.field_k = var11;
                      var15_int = 0;
                      var16 = 0;
                      L16: while (true) {
                        if (var12 <= var16) {
                          if (var14_int == 0) {
                            return true;
                          } else {
                            var52 = new byte[var14_int];
                            var14_int = 0;
                            var29.field_k = var11;
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
                                      var19 = var19 + var29.b(false);
                                      if (var6 == null) {
                                        var21 = var20;
                                        break L19;
                                      } else {
                                        var21 = var48[var20];
                                        break L19;
                                      }
                                    }
                                    L20: {
                                      if (var21 != param2) {
                                        break L20;
                                      } else {
                                        ri.a(var51, var17, var52, var14_int, var19);
                                        var14_int = var14_int + var19;
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
                            if (var5 <= var18) {
                              var16++;
                              continue L16;
                            } else {
                              L22: {
                                var17 = var17 + var29.b(false);
                                if (var6 != null) {
                                  var19 = var48[var18];
                                  break L22;
                                } else {
                                  var19 = var18;
                                  break L22;
                                }
                              }
                              if (var19 == param2) {
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
                      if (var6 != null) {
                        var11 = var48[0];
                        break L23;
                      } else {
                        var11 = 0;
                        break L23;
                      }
                    }
                    if (-1 != ((pf) this).field_g) {
                      var7[var11] = (Object) (Object) var51;
                      break L8;
                    } else {
                      var7[var11] = ch.a(ih.a(param0, 136), false, var50);
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
        }
    }

    final int b(String param0, byte param1) {
        if (!((pf) this).a((byte) -36)) {
            return -1;
        }
        if (param1 != -118) {
            Object var4 = null;
            byte[] discarded$0 = ((pf) this).a((String) null, (String) null, (byte) 45);
        }
        param0 = param0.toLowerCase();
        CharSequence var5 = (CharSequence) (Object) param0;
        int var3 = ((pf) this).field_h.field_q.a(rl.a(var5, (byte) 79), -128);
        if (!this.b(var3, -7294)) {
            return -1;
        }
        return var3;
    }

    final static void a(java.applet.Applet param0, byte param1) {
        if (param1 != 123) {
            Object var3 = null;
            int discarded$0 = pf.a((CharSequence) null, (byte) 96);
        }
        be.a(param0, "", (byte) 110);
        wf.a(63, param0);
    }

    pf(wf param0, boolean param1, int param2) {
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
          ((pf) this).field_h = null;
          if ((param2 ^ -1) > -1) {
            break L0;
          } else {
            if (2 >= param2) {
              L1: {
                ((pf) this).field_e = param0;
                ((pf) this).field_g = param2;
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
              ((pf) this).field_a = stackIn_6_1 != 0;
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
        field_b = new oj();
    }
}
