/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj {
    static gj field_h;
    private vb field_g;
    private int field_j;
    private g field_f;
    static long field_a;
    static ci field_e;
    private Object[][] field_b;
    static String field_c;
    private Object[] field_i;
    private boolean field_d;

    final synchronized boolean a(byte param0) {
        if (((bj) this).field_f == null) {
            ((bj) this).field_f = ((bj) this).field_g.a((byte) 53);
            if (null == ((bj) this).field_f) {
                return false;
            }
            ((bj) this).field_i = new Object[((bj) this).field_f.field_c];
            ((bj) this).field_b = new Object[((bj) this).field_f.field_c][];
        }
        if (param0 < 81) {
            ((bj) this).field_j = -108;
            return true;
        }
        return true;
    }

    private final synchronized void c(int param0, int param1) {
        if (param0 != -31132) {
            return;
        }
        if (((bj) this).field_d) {
            ((bj) this).field_i[param1] = (Object) (Object) ((bj) this).field_g.a(113, param1);
        } else {
            ((bj) this).field_i[param1] = qh.a((byte) 112, false, ((bj) this).field_g.a(-125, param1));
        }
    }

    private final synchronized boolean a(int param0, int param1) {
        if (!((bj) this).a((byte) 124)) {
            return false;
        }
        if (param1 <= param0) {
            if (param0 < ((bj) this).field_f.field_f.length) {
                if (0 != ((bj) this).field_f.field_f[param0]) {
                    return true;
                }
            }
        }
        if (!em.field_x) {
            return false;
        }
        throw new IllegalArgumentException(Integer.toString(param0));
    }

    final int a(int param0, String param1) {
        if (!((bj) this).a((byte) 84)) {
            return -1;
        }
        int var4 = -47 % ((param0 - 66) / 59);
        param1 = param1.toLowerCase();
        CharSequence var5 = (CharSequence) (Object) param1;
        int var3 = ((bj) this).field_f.field_s.a((byte) -71, jh.a(var5, 0));
        if (!(this.a(var3, 0))) {
            return -1;
        }
        return var3;
    }

    final static int a(int param0, int param1, boolean param2, int param3) {
        int var4 = -107 / ((6 - param3) / 48);
        return s.a(-27911);
    }

    final synchronized byte[] e(int param0, int param1) {
        if (!((bj) this).a((byte) 106)) {
            return null;
        }
        if (1 == ((bj) this).field_f.field_f.length) {
            return ((bj) this).a(false, 0, param0);
        }
        if (!this.a(param0, 0)) {
            return null;
        }
        if (param1 == ((bj) this).field_f.field_f[param0]) {
            return ((bj) this).a(false, param0, 0);
        }
        throw new RuntimeException();
    }

    final synchronized boolean a(int param0, int param1, int param2) {
        if (!this.b(param2, param0, param1 + -4397)) {
            return false;
        }
        if (((bj) this).field_b[param0] != null) {
            if (!(null == ((bj) this).field_b[param0][param2])) {
                return true;
            }
        }
        if (param1 != 4397) {
            field_c = null;
        }
        if (!(((bj) this).field_i[param0] == null)) {
            return true;
        }
        this.c(-31132, param0);
        if (null == ((bj) this).field_i[param0]) {
            return false;
        }
        return true;
    }

    final boolean b(boolean param0, String param1) {
        if (!(((bj) this).a((byte) 99))) {
            return false;
        }
        param1 = param1.toLowerCase();
        CharSequence var5 = (CharSequence) (Object) param1;
        int var3 = ((bj) this).field_f.field_s.a((byte) -71, jh.a(var5, 0));
        if (param0) {
            Object var4 = null;
            int discarded$0 = ((bj) this).a(-56, (String) null);
        }
        if (-1 < (var3 ^ -1)) {
            return false;
        }
        return true;
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
        sb var26 = null;
        byte[] var27 = null;
        sb var29 = null;
        sb var31 = null;
        int[] var32 = null;
        byte[][] var33 = null;
        int[] var34 = null;
        byte[] var36 = null;
        byte[] var37 = null;
        int[] var40 = null;
        byte[][] var41 = null;
        int[] var42 = null;
        byte[] var44 = null;
        byte[] var45 = null;
        int[] var48 = null;
        byte[][] var49 = null;
        int[] var50 = null;
        byte[] var51 = null;
        byte[] var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        int[] var56 = null;
        byte[][] var57 = null;
        var22 = MinerDisturbance.field_ab;
        if (!this.a(param0, 0)) {
          return false;
        } else {
          if (null != ((bj) this).field_i[param0]) {
            L0: {
              var5 = ((bj) this).field_f.field_d[param0];
              var50 = ((bj) this).field_f.field_p[param0];
              var42 = var50;
              var34 = var42;
              var24 = var34;
              var6 = var24;
              if (null != ((bj) this).field_b[param0]) {
                break L0;
              } else {
                ((bj) this).field_b[param0] = new Object[((bj) this).field_f.field_f[param0]];
                break L0;
              }
            }
            var7 = ((bj) this).field_b[param0];
            if (param2 <= -118) {
              var8 = 1;
              var9_int = 0;
              L1: while (true) {
                L2: {
                  if (var9_int >= var5) {
                    break L2;
                  } else {
                    L3: {
                      if (var6 != null) {
                        var50 = var42;
                        var10 = var50[var9_int];
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
                      if (param3 == null) {
                        break L5;
                      } else {
                        L6: {
                          if (-1 != (param3[0] ^ -1)) {
                            break L6;
                          } else {
                            if (param3[1] != -1) {
                              break L6;
                            } else {
                              if (0 != param3[2]) {
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
                        var51 = sc.a(true, true, ((bj) this).field_i[param0]);
                        var26 = new sb(var51);
                        var26.a(5, var26.field_u.length, param3, true);
                        var52 = var51;
                        break L4;
                      }
                    }
                    var52 = sc.a(false, true, ((bj) this).field_i[param0]);
                    var44 = var52;
                    var36 = var44;
                    var9 = var36;
                    break L4;
                  }
                  L7: {
                    var53 = in.a(var52, 0);
                    var45 = var53;
                    var37 = var45;
                    var27 = var37;
                    var23 = var27;
                    var54 = var23;
                    if (!((bj) this).field_d) {
                      break L7;
                    } else {
                      ((bj) this).field_i[param0] = null;
                      break L7;
                    }
                  }
                  L8: {
                    if (-2 <= (var5 ^ -1)) {
                      L9: {
                        if (var6 == null) {
                          var11 = 0;
                          break L9;
                        } else {
                          var11 = param3[0];
                          break L9;
                        }
                      }
                      if (((bj) this).field_j == 0) {
                        var7[var11] = qh.a((byte) 112, false, var54);
                        break L8;
                      } else {
                        var7[var11] = (Object) (Object) var53;
                        break L8;
                      }
                    } else {
                      if (((bj) this).field_j != 2) {
                        var11 = var53.length;
                        var11--;
                        var12 = var23[var11] & 255;
                        var11 = var11 - 4 * (var12 * var5);
                        var31 = new sb(var54);
                        var56 = new int[var5];
                        var48 = var56;
                        var40 = var48;
                        var32 = var40;
                        var14 = var32;
                        var31.field_o = var11;
                        var15_int = 0;
                        L10: while (true) {
                          if (var12 <= var15_int) {
                            var57 = new byte[var5][];
                            var49 = var57;
                            var41 = var49;
                            var33 = var41;
                            var15 = var33;
                            var16 = 0;
                            L11: while (true) {
                              if (var5 <= var16) {
                                var31.field_o = var11;
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
                                          if (var6 != null) {
                                            var18 = param3[var17];
                                            break L14;
                                          } else {
                                            var18 = var17;
                                            break L14;
                                          }
                                        }
                                        if (-1 != (((bj) this).field_j ^ -1)) {
                                          var7[var18] = (Object) (Object) var57[var17];
                                          var17++;
                                          continue L13;
                                        } else {
                                          var7[var18] = qh.a((byte) 112, false, var57[var17]);
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
                                        var18 = var18 + var31.b((byte) 61);
                                        ai.a(var54, var16, var57[var19], var56[var19], var18);
                                        var14[var19] = var14[var19] + var18;
                                        var16 = var16 + var18;
                                        var19++;
                                        continue L15;
                                      }
                                    }
                                  }
                                }
                              } else {
                                var15[var16] = new byte[var56[var16]];
                                var56[var16] = 0;
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
                                var16 = var16 + var31.b((byte) 47);
                                var14[var17] = var14[var17] + var16;
                                var17++;
                                continue L16;
                              }
                            }
                          }
                        }
                      } else {
                        var11 = var53.length;
                        var11--;
                        var12 = var23[var11] & 255;
                        var11 = var11 - 4 * var5 * var12;
                        var29 = new sb(var54);
                        var14_int = 0;
                        var29.field_o = var11;
                        var15_int = 0;
                        var16 = 0;
                        L17: while (true) {
                          if (var12 <= var16) {
                            if (var14_int == 0) {
                              return true;
                            } else {
                              var55 = new byte[var14_int];
                              var14_int = 0;
                              var29.field_o = var11;
                              var17 = 0;
                              var18 = 0;
                              L18: while (true) {
                                if (var18 >= var12) {
                                  var7[var15_int] = (Object) (Object) var55;
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
                                        var19 = var19 + var29.b((byte) 97);
                                        if (var6 != null) {
                                          var21 = param3[var20];
                                          break L20;
                                        } else {
                                          var21 = var20;
                                          break L20;
                                        }
                                      }
                                      L21: {
                                        if (param1 == var21) {
                                          ai.a(var54, var17, var55, var14_int, var19);
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
                                  var17 = var17 + var29.b((byte) 81);
                                  if (var6 != null) {
                                    var19 = param3[var18];
                                    break L23;
                                  } else {
                                    var19 = var18;
                                    break L23;
                                  }
                                }
                                if (param1 == var19) {
                                  var14_int = var14_int + var17;
                                  var15_int = var19;
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
                } else {
                  return true;
                }
              }
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    private final synchronized byte[] a(int[] param0, int param1, int param2, int param3) {
        Object var5 = null;
        byte[] var5_array = null;
        Object var7 = null;
        byte[] var8 = null;
        if (this.b(param2, param1, 0)) {
          L0: {
            L1: {
              var5 = null;
              if (((bj) this).field_b[param1] == null) {
                break L1;
              } else {
                if (null != ((bj) this).field_b[param1][param2]) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (this.a(param1, param2, param3 + 21211, param0)) {
              break L0;
            } else {
              this.c(-31132, param1);
              if (this.a(param1, param2, -119, param0)) {
                break L0;
              } else {
                return null;
              }
            }
          }
          L2: {
            if (param3 == -21331) {
              break L2;
            } else {
              var7 = null;
              int discarded$1 = ((bj) this).a(-106, (String) null);
              break L2;
            }
          }
          if (((bj) this).field_b[param1] == null) {
            throw new RuntimeException("");
          } else {
            L3: {
              if (((bj) this).field_b[param1][param2] == null) {
                break L3;
              } else {
                var8 = sc.a(false, true, ((bj) this).field_b[param1][param2]);
                var5_array = var8;
                if (var8 != null) {
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
                if (((bj) this).field_j == 1) {
                  ((bj) this).field_b[param1][param2] = null;
                  if (1 != ((bj) this).field_f.field_f[param1]) {
                    break L4;
                  } else {
                    ((bj) this).field_b[param1] = null;
                    break L4;
                  }
                } else {
                  if (((bj) this).field_j == 2) {
                    ((bj) this).field_b[param1] = null;
                    break L4;
                  } else {
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

    final int a(String param0, int param1, int param2) {
        if (!this.a(param1, 0)) {
            return -1;
        }
        if (param2 > -46) {
            ((bj) this).field_d = false;
        }
        param0 = param0.toLowerCase();
        CharSequence var5 = (CharSequence) (Object) param0;
        int var4 = ((bj) this).field_f.field_n[param1].a((byte) -71, jh.a(var5, 0));
        if (!this.b(var4, param1, 0)) {
            return -1;
        }
        return var4;
    }

    final synchronized boolean d(int param0, int param1) {
        if (!(this.a(param0, param1))) {
            return false;
        }
        if (!(((bj) this).field_i[param0] == null)) {
            return true;
        }
        this.c(-31132, param0);
        if (((bj) this).field_i[param0] != null) {
            return true;
        }
        return false;
    }

    final byte[] a(boolean param0, int param1, int param2) {
        if (param0) {
            byte[] discarded$0 = ((bj) this).e(-122, 54);
        }
        return this.a((int[]) null, param1, param2, -21331);
    }

    final boolean a(String param0, String param1, int param2) {
        if (!((bj) this).a((byte) 127)) {
            return false;
        }
        param0 = param0.toLowerCase();
        param1 = param1.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param0;
        int var4 = ((bj) this).field_f.field_s.a((byte) -71, jh.a(var6, param2 ^ param2));
        if (!this.a(var4, param2 + 16675)) {
            return false;
        }
        CharSequence var7 = (CharSequence) (Object) param1;
        int var5 = ((bj) this).field_f.field_n[var4].a((byte) -71, jh.a(var7, param2 + 16675));
        return ((bj) this).a(var4, 4397, var5);
    }

    final int b(byte param0) {
        if (!((bj) this).a((byte) 124)) {
            return -1;
        }
        if (param0 != -71) {
            bj.a(111);
        }
        return ((bj) this).field_f.field_f.length;
    }

    private final synchronized boolean b(int param0, int param1, int param2) {
        if (!((bj) this).a((byte) 101)) {
            return false;
        }
        if (param1 >= param2) {
            if (param0 >= 0) {
                if (param1 < ((bj) this).field_f.field_f.length) {
                    if (param0 < ((bj) this).field_f.field_f[param1]) {
                        return true;
                    }
                }
            }
        }
        if (em.field_x) {
            throw new IllegalArgumentException(param1 + " " + param0);
        }
        return false;
    }

    final synchronized boolean b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        L0: {
          var5 = MinerDisturbance.field_ab;
          if (param0 == -1) {
            break L0;
          } else {
            var6 = null;
            int discarded$2 = ((bj) this).a(122, (String) null);
            break L0;
          }
        }
        if (!((bj) this).a((byte) 98)) {
          return false;
        } else {
          var2 = 1;
          var3 = 0;
          L1: while (true) {
            if (((bj) this).field_f.field_t.length <= var3) {
              return var2 != 0;
            } else {
              var4 = ((bj) this).field_f.field_t[var3];
              if (((bj) this).field_i[var4] == null) {
                this.c(-31132, var4);
                if (null == ((bj) this).field_i[var4]) {
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

    final boolean a(boolean param0, String param1) {
        if (!(((bj) this).a((byte) 121))) {
            return false;
        }
        param1 = param1.toLowerCase();
        if (param0) {
            Object var4 = null;
            bj.a(22, (wh) null);
        }
        CharSequence var5 = (CharSequence) (Object) param1;
        int var3 = ((bj) this).field_f.field_s.a((byte) -71, jh.a(var5, 0));
        return ((bj) this).d(var3, 0);
    }

    final int a(String param0, int param1) {
        if (param1 >= -117) {
            ((long[]) ((Object[]) ((bj) this).field_i[18])[9])[0] = 121L;
        }
        if (!((bj) this).a((byte) 94)) {
            return 0;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((bj) this).field_f.field_s.a((byte) -71, jh.a(var4, 0));
        return ((bj) this).a(var3, true);
    }

    final synchronized byte[] a(String param0, int param1, String param2) {
        if (!((bj) this).a((byte) 121)) {
            return null;
        }
        param2 = param2.toLowerCase();
        param0 = param0.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param2;
        int var4 = ((bj) this).field_f.field_s.a((byte) -71, jh.a(var6, 0));
        if (!this.a(var4, param1 ^ 0)) {
            return null;
        }
        CharSequence var7 = (CharSequence) (Object) param0;
        int var5 = ((bj) this).field_f.field_n[var4].a((byte) -71, jh.a(var7, param1));
        return ((bj) this).a(false, var4, var5);
    }

    bj(vb param0, boolean param1, int param2) {
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
          ((bj) this).field_f = null;
          if (param2 < 0) {
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
              ((bj) this).field_d = stackIn_6_1 != 0;
              ((bj) this).field_g = param0;
              ((bj) this).field_j = param2;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("");
    }

    final synchronized int a(int param0, boolean param1) {
        if (!(this.a(param0, 0))) {
            return 0;
        }
        if (((bj) this).field_i[param0] != null) {
            return 100;
        }
        if (!param1) {
            return -119;
        }
        return ((bj) this).field_g.a((byte) 125, param0);
    }

    public static void c(byte param0) {
        field_c = null;
        int var1 = 30 % ((param0 - 18) / 38);
        field_e = null;
        field_h = null;
    }

    final static void a(int param0) {
        if (!(sj.field_h == null)) {
            sj.field_h.s(2121792);
        }
        bh.field_Z = new lm();
        if (param0 != 0) {
            return;
        }
        de.field_a.a((byte) -103, (fe) (Object) bh.field_Z);
    }

    final int b(int param0, int param1) {
        if (!this.a(param0, param1 ^ param1)) {
            return 0;
        }
        return ((bj) this).field_f.field_f[param0];
    }

    final static void a(int param0, wh param1) {
        mk.a(true, param1, 0);
        if (param0 != -6358) {
            field_c = null;
        }
    }

    final synchronized int c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = MinerDisturbance.field_ab;
        if (((bj) this).a((byte) 107)) {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (var4 >= ((bj) this).field_i.length) {
              L1: {
                if (param0 == -14858) {
                  break L1;
                } else {
                  ((bj) this).field_f = null;
                  break L1;
                }
              }
              if (var2 != 0) {
                var4 = var3 * 100 / var2;
                return var4;
              } else {
                return 100;
              }
            } else {
              if ((((bj) this).field_f.field_d[var4] ^ -1) < -1) {
                var3 = var3 + ((bj) this).a(var4, true);
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new gj();
    }
}
