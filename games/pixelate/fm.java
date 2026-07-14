/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm {
    private kj field_g;
    private Object[] field_c;
    static pl field_b;
    static char[] field_d;
    static ak[] field_f;
    static String field_j;
    boolean field_i;
    private jp field_a;
    int field_e;
    private Object[][] field_k;
    static ak[] field_h;

    final int a(int param0, String param1) {
        if (!((fm) this).b(-3)) {
            return -1;
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((fm) this).field_g.field_g.a(le.a(var4, (byte) 103), (byte) -67);
        if (param0 < 114) {
            return 73;
        }
        if (!this.a(var3, -1)) {
            return -1;
        }
        return var3;
    }

    final int c(int param0, String param1) {
        if (param0 < 100) {
            ((fm) this).field_g = (kj) ((fm) this).field_c[7];
        }
        if (!(((fm) this).b(-3))) {
            return 0;
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((fm) this).field_g.field_g.a(le.a(var4, (byte) 104), (byte) -67);
        return ((fm) this).a(var3, (byte) -78);
    }

    private final synchronized boolean a(int param0, int param1) {
        if (((fm) this).b(param1 + -2)) {
          L0: {
            if (param0 > param1) {
              break L0;
            } else {
              if (param0 >= ((fm) this).field_g.field_i.length) {
                break L0;
              } else {
                if (-1 != ((fm) this).field_g.field_i[param0]) {
                  return true;
                } else {
                  break L0;
                }
              }
            }
          }
          if (!nm.field_d) {
            return false;
          } else {
            throw new IllegalArgumentException(Integer.toString(param0));
          }
        } else {
          return false;
        }
    }

    final int b(int param0, byte param1) {
        if (param1 < 22) {
            byte[] discarded$0 = this.a(((int[]) ((fm) this).field_c[1])[10], (int[]) null, 79, ((int[]) ((fm) this).field_c[0])[1]);
        }
        if (!(this.a(param0, -1))) {
            return 0;
        }
        return ((fm) this).field_g.field_i[param0];
    }

    final boolean b(int param0, String param1) {
        if (!((fm) this).b(-3)) {
            return false;
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((fm) this).field_g.field_g.a(le.a(var4, (byte) -111), (byte) -67);
        if (param0 <= 124) {
            return false;
        }
        if (-1 < (var3 ^ -1)) {
            return false;
        }
        return true;
    }

    final static void a(cb param0, Object param1, byte param2) {
        Exception var3 = null;
        int var3_int = 0;
        int var4 = 0;
        Object var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Pixelate.field_H ? 1 : 0;
                    if (param0.field_w == null) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return;
                }
                case 3: {
                    var3_int = 0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (50 <= var3_int) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (null == param0.field_w.peekEvent()) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    vg.a(1L, (byte) 23);
                    var3_int++;
                    statePc = 4;
                    continue stateLoop;
                }
                case 7: {
                    try {
                        if (param1 == null) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        param0.field_w.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param1, 1001, "dummy"));
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (param2 == -52) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5 = null;
                        boolean discarded$1 = fm.a((byte) 28, (CharSequence) null);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    var3 = (Exception) (Object) caughtException;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(int param0, String param1, String param2) {
        if (!((fm) this).b(-3)) {
            return false;
        }
        if (param0 != 0) {
            field_b = null;
        }
        param1 = param1.toLowerCase();
        param2 = param2.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param1;
        int var4 = ((fm) this).field_g.field_g.a(le.a(var6, (byte) -125), (byte) -67);
        if (!(this.a(var4, -1))) {
            return false;
        }
        CharSequence var7 = (CharSequence) (Object) param2;
        int var5 = ((fm) this).field_g.field_q[var4].a(le.a(var7, (byte) 77), (byte) -67);
        return ((fm) this).a(var4, var5, -2);
    }

    final byte[] a(int param0, int param1, boolean param2) {
        if (!param2) {
            fm.a((cb) null, ((fm) this).field_c[0], ((byte[]) ((Object[]) ((fm) this).field_c[0])[1])[2]);
        }
        return this.a(-1, (int[]) null, param1, param0);
    }

    final synchronized boolean b(int param0) {
        if (!(null != ((fm) this).field_g)) {
            ((fm) this).field_g = ((fm) this).field_a.a((byte) 36);
            if (((fm) this).field_g == null) {
                return false;
            }
            ((fm) this).field_c = new Object[((fm) this).field_g.field_b];
            ((fm) this).field_k = new Object[((fm) this).field_g.field_b][];
        }
        if (param0 != -3) {
            boolean discarded$0 = ((fm) this).a(-35, ((int[]) ((fm) this).field_c[0])[8], 66);
            return true;
        }
        return true;
    }

    final synchronized boolean a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        L0: {
          var5 = Pixelate.field_H ? 1 : 0;
          if (param0 == 92) {
            break L0;
          } else {
            var6 = null;
            int discarded$2 = ((fm) this).a(-33, (String) null);
            break L0;
          }
        }
        if (((fm) this).b(-3)) {
          var2 = 1;
          var3 = 0;
          L1: while (true) {
            if (var3 >= ((fm) this).field_g.field_f.length) {
              return var2 != 0;
            } else {
              var4 = ((fm) this).field_g.field_f[var3];
              if (null == ((fm) this).field_c[var4]) {
                this.b(var4, false);
                if (((fm) this).field_c[var4] == null) {
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
        we var26 = null;
        byte[] var27 = null;
        we var29 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        we var32 = null;
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
        var22 = Pixelate.field_H ? 1 : 0;
        if (this.a(param1, param3 ^ -1)) {
          if (null != ((fm) this).field_c[param1]) {
            L0: {
              var5 = ((fm) this).field_g.field_h[param1];
              var50 = ((fm) this).field_g.field_r[param1];
              var42 = var50;
              var34 = var42;
              var24 = var34;
              var6 = var24;
              if (null != ((fm) this).field_k[param1]) {
                break L0;
              } else {
                ((fm) this).field_k[param1] = new Object[((fm) this).field_g.field_i[param1]];
                break L0;
              }
            }
            var7 = ((fm) this).field_k[param1];
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
                      var10 = var50[var9_int];
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
                    if (param2 == null) {
                      break L5;
                    } else {
                      L6: {
                        if (0 != param2[0]) {
                          break L6;
                        } else {
                          if (param2[1] != 0) {
                            break L6;
                          } else {
                            if (-1 != (param2[2] ^ -1)) {
                              break L6;
                            } else {
                              if (param2[3] == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                      }
                      var51 = tg.a(false, true, ((fm) this).field_c[param1]);
                      var26 = new we(var51);
                      var26.a(param2, 19324, 5, var26.field_k.length);
                      var52 = var51;
                      break L4;
                    }
                  }
                  var52 = tg.a(false, false, ((fm) this).field_c[param1]);
                  var44 = var52;
                  var36 = var44;
                  var9 = var36;
                  break L4;
                }
                L7: {
                  var53 = la.a(var52, param3);
                  var45 = var53;
                  var37 = var45;
                  var27 = var37;
                  var23 = var27;
                  var54 = var23;
                  if (((fm) this).field_i) {
                    var53 = var45;
                    ((fm) this).field_c[param1] = null;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  var53 = var45;
                  if (1 >= var5) {
                    L9: {
                      if (var6 == null) {
                        var11 = 0;
                        break L9;
                      } else {
                        var11 = var50[0];
                        break L9;
                      }
                    }
                    if (((fm) this).field_e == 0) {
                      var7[var11] = aj.a(false, var54, 124);
                      break L8;
                    } else {
                      var7[var11] = (Object) (Object) var53;
                      break L8;
                    }
                  } else {
                    if (((fm) this).field_e == 2) {
                      var53 = var45;
                      var11 = var53.length;
                      var11--;
                      var12 = var23[var11] & 255;
                      var11 = var11 - var5 * var12 * 4;
                      var32 = new we(var54);
                      var14 = 0;
                      var15 = 0;
                      var32.field_m = var11;
                      var16 = 0;
                      L10: while (true) {
                        if (var12 <= var16) {
                          if (var14 == 0) {
                            return true;
                          } else {
                            var57 = new byte[var14];
                            var14 = 0;
                            var32.field_m = var11;
                            var17 = 0;
                            var18 = 0;
                            L11: while (true) {
                              if (var18 >= var12) {
                                var7[var15] = (Object) (Object) var57;
                                return true;
                              } else {
                                var19 = 0;
                                var20 = 0;
                                L12: while (true) {
                                  if (var20 >= var5) {
                                    var18++;
                                    continue L11;
                                  } else {
                                    L13: {
                                      var19 = var19 + var32.k(0);
                                      if (var6 == null) {
                                        var21 = var20;
                                        break L13;
                                      } else {
                                        var21 = var50[var20];
                                        break L13;
                                      }
                                    }
                                    L14: {
                                      if (var21 == param0) {
                                        qb.a(var54, var17, var57, var14, var19);
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
                                var17 = var17 + var32.k(0);
                                if (var6 == null) {
                                  var19 = var18;
                                  break L16;
                                } else {
                                  var19 = var50[var18];
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
                      var11 = var53.length;
                      var11--;
                      var12 = var23[var11] & 255;
                      var11 = var11 - var12 * var5 * 4;
                      var29 = new we(var54);
                      var55 = new int[var5];
                      var47 = var55;
                      var39 = var47;
                      var30 = var39;
                      var14_ref_int__ = var30;
                      var29.field_m = var11;
                      var15 = 0;
                      L17: while (true) {
                        if (var15 >= var12) {
                          var56 = new byte[var5][];
                          var48 = var56;
                          var40 = var48;
                          var31 = var40;
                          var15_ref_byte____ = var31;
                          var16 = 0;
                          L18: while (true) {
                            if (var16 >= var5) {
                              var29.field_m = var11;
                              var16 = 0;
                              var17 = 0;
                              L19: while (true) {
                                if (var12 <= var17) {
                                  var17 = 0;
                                  L20: while (true) {
                                    if (var5 <= var17) {
                                      break L8;
                                    } else {
                                      L21: {
                                        if (var6 == null) {
                                          var18 = var17;
                                          break L21;
                                        } else {
                                          var18 = var50[var17];
                                          break L21;
                                        }
                                      }
                                      if (((fm) this).field_e != 0) {
                                        var7[var18] = (Object) (Object) var56[var17];
                                        var17++;
                                        continue L20;
                                      } else {
                                        var7[var18] = aj.a(false, var56[var17], -123);
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
                                      var18 = var18 + var29.k(0);
                                      qb.a(var54, var16, var56[var19], var55[var19], var18);
                                      var16 = var16 + var18;
                                      var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                                      var19++;
                                      continue L22;
                                    }
                                  }
                                }
                              }
                            } else {
                              var15_ref_byte____[var16] = new byte[var55[var16]];
                              var55[var16] = 0;
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
                              var16 = var16 + var29.k(param3 + 0);
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
        } else {
          return false;
        }
    }

    private final synchronized byte[] a(int param0, int[] param1, int param2, int param3) {
        Object var5 = null;
        byte[] var5_array = null;
        byte[] var7 = null;
        L0: {
          if (param0 == -1) {
            break L0;
          } else {
            boolean discarded$1 = ((fm) this).a((byte) 110);
            break L0;
          }
        }
        if (this.b(param2, 0, param3)) {
          L1: {
            L2: {
              var5 = null;
              if (null == ((fm) this).field_k[param3]) {
                break L2;
              } else {
                if (((fm) this).field_k[param3][param2] != null) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            if (this.a(param2, param3, param1, 0)) {
              break L1;
            } else {
              this.b(param3, false);
              if (this.a(param2, param3, param1, 0)) {
                break L1;
              } else {
                return null;
              }
            }
          }
          if (null == ((fm) this).field_k[param3]) {
            throw new RuntimeException("");
          } else {
            L3: {
              if (((fm) this).field_k[param3][param2] == null) {
                break L3;
              } else {
                var7 = tg.a(false, false, ((fm) this).field_k[param3][param2]);
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
                if (((fm) this).field_e == 1) {
                  ((fm) this).field_k[param3][param2] = null;
                  if (-2 != (((fm) this).field_g.field_i[param3] ^ -1)) {
                    break L4;
                  } else {
                    ((fm) this).field_k[param3] = null;
                    break L4;
                  }
                } else {
                  if (-3 == (((fm) this).field_e ^ -1)) {
                    ((fm) this).field_k[param3] = null;
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

    final static boolean a(byte param0, CharSequence param1) {
        if (param0 != 63) {
            Object var3 = null;
            fm.a((cb) null, (Object) null, (byte) 25);
        }
        return f.a(param1, (byte) -70, false);
    }

    final synchronized int a(int param0, byte param1) {
        if (!(this.a(param0, -1))) {
            return 0;
        }
        if (param1 != -78) {
            fm.a(-74);
        }
        if (!(null == ((fm) this).field_c[param0])) {
            return 100;
        }
        return ((fm) this).field_a.b(param0, param1 ^ -8270);
    }

    final synchronized byte[] b(int param0, int param1) {
        if (!((fm) this).b(-3)) {
            return null;
        }
        if ((((fm) this).field_g.field_i.length ^ -1) == -2) {
            return ((fm) this).a(0, param0, true);
        }
        if (!this.a(param0, -1)) {
            return null;
        }
        if (-2 == (((fm) this).field_g.field_i[param0] ^ -1)) {
            return ((fm) this).a(param0, 0, true);
        }
        int var3 = 10 / ((param1 - -24) / 54);
        throw new RuntimeException();
    }

    final synchronized boolean a(int param0, int param1, int param2) {
        if (!(this.b(param1, param2 ^ param2, param0))) {
            return false;
        }
        if (((fm) this).field_k[param0] != null) {
            if (!(((fm) this).field_k[param0][param1] == null)) {
                return true;
            }
        }
        if (null != ((fm) this).field_c[param0]) {
            return true;
        }
        this.b(param0, false);
        if (((fm) this).field_c[param0] != null) {
            return true;
        }
        return false;
    }

    final boolean a(String param0, int param1) {
        if (!((fm) this).b(param1 + -2)) {
            return false;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((fm) this).field_g.field_g.a(le.a(var4, (byte) -97), (byte) -67);
        if (param1 != -1) {
            return false;
        }
        return ((fm) this).a(var3, false);
    }

    fm(jp param0, boolean param1, int param2) {
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
          ((fm) this).field_g = null;
          if (-1 < (param2 ^ -1)) {
            break L0;
          } else {
            if (param2 <= 2) {
              L1: {
                ((fm) this).field_a = param0;
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
              ((fm) this).field_i = stackIn_6_1 != 0;
              ((fm) this).field_e = param2;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("");
    }

    final int b(byte param0) {
        int var2 = 75 / ((19 - param0) / 58);
        if (!((fm) this).b(-3)) {
            return -1;
        }
        return ((fm) this).field_g.field_i.length;
    }

    private final synchronized boolean b(int param0, int param1, int param2) {
        if (!((fm) this).b(-3)) {
            return false;
        }
        if (param2 >= param1) {
            if (param0 >= 0) {
                if (((fm) this).field_g.field_i.length > param2) {
                    if (((fm) this).field_g.field_i[param2] > param0) {
                        return true;
                    }
                }
            }
        }
        if (nm.field_d) {
            throw new IllegalArgumentException(param2 + " " + param0);
        }
        return false;
    }

    public static void a(int param0) {
        int var1 = -71 % ((44 - param0) / 47);
        field_d = null;
        field_b = null;
        field_h = null;
        field_f = null;
        field_j = null;
    }

    private final synchronized void b(int param0, boolean param1) {
        if (param1) {
            boolean discarded$0 = ((fm) this).a(((byte[]) ((fm) this).field_c[4])[1]);
        }
        if (!((fm) this).field_i) {
            ((fm) this).field_c[param0] = aj.a(false, ((fm) this).field_a.a(param0, 103), -116);
        } else {
            ((fm) this).field_c[param0] = (Object) (Object) ((fm) this).field_a.a(param0, -94);
        }
    }

    final int a(byte param0, String param1, int param2) {
        if (!(this.a(param2, -1))) {
            return -1;
        }
        if (param0 > -94) {
            return -122;
        }
        param1 = param1.toLowerCase();
        CharSequence var5 = (CharSequence) (Object) param1;
        int var4 = ((fm) this).field_g.field_q[param2].a(le.a(var5, (byte) 110), (byte) -67);
        if (!(this.b(var4, 0, param2))) {
            return -1;
        }
        return var4;
    }

    final synchronized boolean a(int param0, boolean param1) {
        if (!(this.a(param0, -1))) {
            return false;
        }
        if (!(null == ((fm) this).field_c[param0])) {
            return true;
        }
        this.b(param0, param1);
        if (((fm) this).field_c[param0] == null) {
            return false;
        }
        return true;
    }

    final synchronized int c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Pixelate.field_H ? 1 : 0;
        if (((fm) this).b(-3)) {
          var2 = param0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (var4 >= ((fm) this).field_c.length) {
              if (var2 == 0) {
                return 100;
              } else {
                var4 = var3 * 100 / var2;
                return var4;
              }
            } else {
              if ((((fm) this).field_g.field_h[var4] ^ -1) < -1) {
                var3 = var3 + ((fm) this).a(var4, (byte) -78);
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

    final synchronized byte[] a(byte param0, String param1, String param2) {
        if (!((fm) this).b(param0 + -27)) {
            return null;
        }
        if (param0 != 24) {
            field_j = null;
        }
        param2 = param2.toLowerCase();
        param1 = param1.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param2;
        int var4 = ((fm) this).field_g.field_g.a(le.a(var6, (byte) 67), (byte) -67);
        if (!this.a(var4, -1)) {
            return null;
        }
        CharSequence var7 = (CharSequence) (Object) param1;
        int var5 = ((fm) this).field_g.field_q[var4].a(le.a(var7, (byte) 61), (byte) -67);
        return ((fm) this).a(var4, var5, true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new char[128];
        field_j = "Withdraw invitation to <%0> to join this game";
    }
}
