/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm {
    private fa field_o;
    boolean field_f;
    int field_d;
    private Object[] field_k;
    private jl field_a;
    private Object[][] field_i;
    static int[] field_l;
    static String field_c;
    static String field_n;
    static int[] field_e;
    static String[] field_m;
    static wk[] field_b;
    static String field_p;
    static tb field_j;
    static int field_g;
    static gh field_h;

    final synchronized boolean a(byte param0, int param1, int param2) {
        if (!(this.b(param2, param1, -17637))) {
            return false;
        }
        if (null != ((cm) this).field_i[param2]) {
            if (!(null == ((cm) this).field_i[param2][param1])) {
                return true;
            }
        }
        if (!(null == ((cm) this).field_k[param2])) {
            return true;
        }
        this.a(-66, param2);
        if (null != ((cm) this).field_k[param2]) {
            return true;
        }
        if (param0 <= 53) {
            boolean discarded$0 = ((cm) this).a(98);
            return false;
        }
        return false;
    }

    private final synchronized boolean b(int param0, int param1, int param2) {
        if (((cm) this).a(true)) {
          if (param2 == -17637) {
            L0: {
              if (-1 < (param0 ^ -1)) {
                break L0;
              } else {
                if ((param1 ^ -1) > -1) {
                  break L0;
                } else {
                  if (((cm) this).field_a.field_g.length <= param0) {
                    break L0;
                  } else {
                    if (param1 < ((cm) this).field_a.field_g[param0]) {
                      return true;
                    } else {
                      break L0;
                    }
                  }
                }
              }
            }
            if (!qi.field_l) {
              return false;
            } else {
              throw new IllegalArgumentException(param0 + " " + param1);
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
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
        gi var26 = null;
        byte[] var27 = null;
        gi var29 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        gi var32 = null;
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
        var22 = SteelSentinels.field_G;
        if (!this.b(param1, true)) {
          return false;
        } else {
          if (null == ((cm) this).field_k[param1]) {
            return false;
          } else {
            L0: {
              var5 = ((cm) this).field_a.field_j[param1];
              var50 = ((cm) this).field_a.field_o[param1];
              var42 = var50;
              var34 = var42;
              var24 = var34;
              var6 = var24;
              if (null != ((cm) this).field_i[param1]) {
                break L0;
              } else {
                ((cm) this).field_i[param1] = new Object[((cm) this).field_a.field_g[param1]];
                break L0;
              }
            }
            var7 = ((cm) this).field_i[param1];
            var8 = 1;
            var9_int = param2;
            L1: while (true) {
              L2: {
                if (var9_int >= var5) {
                  break L2;
                } else {
                  L3: {
                    if (var6 != null) {
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
                        if (param3[0] != 0) {
                          break L6;
                        } else {
                          if (0 != param3[1]) {
                            break L6;
                          } else {
                            if (param3[2] != 0) {
                              break L6;
                            } else {
                              if (param3[3] == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                      }
                      var51 = dk.a(true, ((cm) this).field_k[param1], 0);
                      var26 = new gi(var51);
                      var26.a(5, param2 ^ 32203, var26.field_t.length, param3);
                      var52 = var51;
                      break L4;
                    }
                  }
                  var52 = dk.a(false, ((cm) this).field_k[param1], 0);
                  var44 = var52;
                  var36 = var44;
                  var9 = var36;
                  break L4;
                }
                L7: {
                  var53 = ln.a(var52, (byte) 127);
                  var45 = var53;
                  var37 = var45;
                  var27 = var37;
                  var23 = var27;
                  var54 = var23;
                  if (((cm) this).field_f) {
                    ((cm) this).field_k[param1] = null;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (1 < var5) {
                    var53 = var45;
                    if ((((cm) this).field_d ^ -1) == -3) {
                      var11 = var53.length;
                      var11--;
                      var12 = var23[var11] & 255;
                      var11 = var11 - var5 * var12 * 4;
                      var32 = new gi(var54);
                      var14 = 0;
                      var32.field_p = var11;
                      var15 = 0;
                      var16 = 0;
                      L9: while (true) {
                        if (var12 <= var16) {
                          if (var14 == 0) {
                            return true;
                          } else {
                            var57 = new byte[var14];
                            var14 = 0;
                            var32.field_p = var11;
                            var17 = 0;
                            var18 = 0;
                            L10: while (true) {
                              if (var18 >= var12) {
                                var7[var15] = (Object) (Object) var57;
                                break L8;
                              } else {
                                var19 = 0;
                                var20 = 0;
                                L11: while (true) {
                                  if (var5 <= var20) {
                                    var18++;
                                    continue L10;
                                  } else {
                                    L12: {
                                      var19 = var19 + var32.i(param2 + 0);
                                      if (var6 != null) {
                                        var21 = var50[var20];
                                        break L12;
                                      } else {
                                        var21 = var20;
                                        break L12;
                                      }
                                    }
                                    L13: {
                                      if (var21 == param0) {
                                        ii.a(var54, var17, var57, var14, var19);
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
                          }
                        } else {
                          var17 = 0;
                          var18 = 0;
                          L14: while (true) {
                            if (var18 >= var5) {
                              var16++;
                              continue L9;
                            } else {
                              L15: {
                                var17 = var17 + var32.i(0);
                                if (var6 != null) {
                                  var19 = var50[var18];
                                  break L15;
                                } else {
                                  var19 = var18;
                                  break L15;
                                }
                              }
                              if (param0 == var19) {
                                var15 = var19;
                                var14 = var14 + var17;
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
                      var11 = var53.length;
                      var11--;
                      var12 = var23[var11] & 255;
                      var11 = var11 - var12 * var5 * 4;
                      var29 = new gi(var54);
                      var29.field_p = var11;
                      var55 = new int[var5];
                      var47 = var55;
                      var39 = var47;
                      var30 = var39;
                      var14_ref_int__ = var30;
                      var15 = 0;
                      L16: while (true) {
                        if (var15 >= var12) {
                          var56 = new byte[var5][];
                          var48 = var56;
                          var40 = var48;
                          var31 = var40;
                          var15_ref_byte____ = var31;
                          var16 = 0;
                          L17: while (true) {
                            if (var16 >= var5) {
                              var29.field_p = var11;
                              var16 = 0;
                              var17 = 0;
                              L18: while (true) {
                                if (var17 >= var12) {
                                  var17 = 0;
                                  L19: while (true) {
                                    if (var17 >= var5) {
                                      break L8;
                                    } else {
                                      L20: {
                                        if (var6 == null) {
                                          var18 = var17;
                                          break L20;
                                        } else {
                                          var18 = var50[var17];
                                          break L20;
                                        }
                                      }
                                      if (0 != ((cm) this).field_d) {
                                        var7[var18] = (Object) (Object) var56[var17];
                                        var17++;
                                        continue L19;
                                      } else {
                                        var7[var18] = ah.a(false, var56[var17], 0);
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
                                      var18 = var18 + var29.i(0);
                                      ii.a(var54, var16, var56[var19], var55[var19], var18);
                                      var16 = var16 + var18;
                                      var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                                      var19++;
                                      continue L21;
                                    }
                                  }
                                }
                              }
                            } else {
                              var15_ref_byte____[var16] = new byte[var55[var16]];
                              var55[var16] = 0;
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
                              var16 = var16 + var29.i(0);
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
                        var53 = var45;
                        var11 = 0;
                        break L23;
                      } else {
                        var11 = var50[0];
                        break L23;
                      }
                    }
                    var53 = var45;
                    if (((cm) this).field_d == 0) {
                      var7[var11] = ah.a(false, var54, 0);
                      break L8;
                    } else {
                      var7[var11] = (Object) (Object) var53;
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

    final int a(String param0, int param1) {
        if (param1 < 0) {
            ((byte[]) ((cm) this).field_k[18])[0] = (byte) -10;
        }
        if (!(((cm) this).a(true))) {
            return -1;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((cm) this).field_a.field_n.a(ij.a(var4, false), (byte) 120);
        if (!this.b(var3, true)) {
            return -1;
        }
        return var3;
    }

    final int a(boolean param0, int param1) {
        if (!(this.b(param1, param0))) {
            return 0;
        }
        return ((cm) this).field_a.field_g[param1];
    }

    final synchronized int b(int param0, int param1) {
        if (!this.b(param1, true)) {
            return 0;
        }
        if (param0 != 10407) {
            ((cm) this).field_i = null;
        }
        if (!(((cm) this).field_k[param1] == null)) {
            return 100;
        }
        return ((cm) this).field_o.a(false, param1);
    }

    private final synchronized void a(int param0, int param1) {
        if (((cm) this).field_f) {
            ((cm) this).field_k[param1] = (Object) (Object) ((cm) this).field_o.a(param1, 82);
        } else {
            ((cm) this).field_k[param1] = ah.a(false, ((cm) this).field_o.a(param1, 2), 0);
        }
        if (param0 > -12) {
            cm.b(true);
        }
    }

    final synchronized int a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = SteelSentinels.field_G;
        if (param0 == -33) {
          if (!((cm) this).a(true)) {
            return 0;
          } else {
            var2 = 0;
            var3 = 0;
            var4 = 0;
            L0: while (true) {
              if (((cm) this).field_k.length <= var4) {
                if (-1 == var2) {
                  return 100;
                } else {
                  var4 = var3 * 100 / var2;
                  return var4;
                }
              } else {
                if (((cm) this).field_a.field_j[var4] < -1) {
                  var2 += 100;
                  var3 = var3 + ((cm) this).b(10407, var4);
                  var4++;
                  continue L0;
                } else {
                  var4++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return ((int[]) ((cm) this).field_k[12])[1];
        }
    }

    public static void b(boolean param0) {
        field_l = null;
        field_m = null;
        field_p = null;
        if (param0) {
            Object var2 = null;
            cm.a((String[][]) null, (byte) 89, (cm) null, (int[]) null, (cm) null, (wk[][]) null, false, 80, 61, (String[]) null, (gk[]) null, (int[]) null, (wk[][]) null, (cm) null, (byte[]) null, (String[][]) null, (byte[]) null);
        }
        field_c = null;
        field_b = null;
        field_e = null;
        field_n = null;
        field_j = null;
        field_h = null;
    }

    private final synchronized boolean b(int param0, boolean param1) {
        if (!(((cm) this).a(param1))) {
            return false;
        }
        if (param0 <= -1) {
            if (param0 < ((cm) this).field_a.field_g.length) {
                if (-1 != ((cm) this).field_a.field_g[param0]) {
                    return true;
                }
            }
        }
        if (qi.field_l) {
            throw new IllegalArgumentException(Integer.toString(param0));
        }
        return false;
    }

    final int a(int param0, int param1, String param2) {
        if (!this.b(param0, true)) {
            return -1;
        }
        param2 = param2.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param2;
        int var4 = ((cm) this).field_a.field_d[param0].a(ij.a(var6, false), (byte) 114);
        if (param1 != -32759) {
            Object var5 = null;
            int discarded$0 = ((cm) this).a((byte) -29, (String) null);
        }
        if (!(this.b(param0, var4, -17637))) {
            return -1;
        }
        return var4;
    }

    final boolean a(byte param0, String param1, String param2) {
        if (!(((cm) this).a(true))) {
            return false;
        }
        param2 = param2.toLowerCase();
        param1 = param1.toLowerCase();
        CharSequence var7 = (CharSequence) (Object) param2;
        int var4 = ((cm) this).field_a.field_n.a(ij.a(var7, false), (byte) 116);
        if (!this.b(var4, true)) {
            return false;
        }
        int var6 = -120 % ((param0 - 40) / 43);
        CharSequence var8 = (CharSequence) (Object) param1;
        int var5 = ((cm) this).field_a.field_d[var4].a(ij.a(var8, false), (byte) -77);
        return ((cm) this).a((byte) 97, var5, var4);
    }

    final boolean a(String param0, byte param1) {
        if (param1 != 90) {
            return false;
        }
        if (!(((cm) this).a(true))) {
            return false;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((cm) this).field_a.field_n.a(ij.a(var4, false), (byte) 123);
        return ((cm) this).a(var3, true);
    }

    final boolean a(int param0, String param1) {
        if (param0 != 12145) {
            boolean discarded$0 = this.b(((int[]) ((Object[]) ((cm) this).field_k[29])[8])[0], -80, -37);
        }
        if (!((cm) this).a(true)) {
            return false;
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((cm) this).field_a.field_n.a(ij.a(var4, false), (byte) -121);
        if ((var3 ^ -1) > -1) {
            return false;
        }
        return true;
    }

    final static void a(String[][] param0, byte param1, cm param2, int[] param3, cm param4, wk[][] param5, boolean param6, int param7, int param8, String[] param9, gk[] param10, int[] param11, wk[][] param12, cm param13, byte[] param14, String[][] param15, byte[] param16) {
        if (param1 < 53) {
            cm.b(false);
        }
        Object var18 = null;
        lh.a(param11, param5, 72, param15, param4, param3, param6, param13, param9, param10, param2, param0, param14, param12, param8, (String[]) null, param16, 1, param7);
    }

    final static int a(int param0, int param1, int param2) {
        if (param1 != 200) {
            cm.b(false);
        }
        if (param2 == 0) {
            if (-1 == param0) {
                return 0;
            }
            if (0 > param0) {
                return -2048;
            }
            return 2048;
        }
        if (0 > param2) {
            if (-1 == param0) {
                return 4096;
            }
            if (param0 < 0) {
                return rb.a(-param2, 2048, -param0) + -4096;
            }
            return 4096 - rb.a(-param2, 2048, param0);
        }
        if (0 == param0) {
            return 0;
        }
        if ((param0 ^ -1) > -1) {
            return -rb.a(param2, 2048, -param0);
        }
        return rb.a(param2, 2048, param0);
    }

    final byte[] a(int param0, byte param1, int param2) {
        if (param1 <= 20) {
            return null;
        }
        return this.b(param2, 126, param0, (int[]) null);
    }

    final synchronized boolean a(boolean param0) {
        if (!(null != ((cm) this).field_a)) {
            ((cm) this).field_a = ((cm) this).field_o.b((byte) 114);
            if (!(((cm) this).field_a != null)) {
                return false;
            }
            ((cm) this).field_i = new Object[((cm) this).field_a.field_u][];
            ((cm) this).field_k = new Object[((cm) this).field_a.field_u];
        }
        if (!param0) {
            int discarded$0 = ((cm) this).b(((byte[]) ((cm) this).field_k[0])[10]);
            return true;
        }
        return true;
    }

    final int a(byte param0, String param1) {
        if (!((cm) this).a(true)) {
            return 0;
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((cm) this).field_a.field_n.a(ij.a(var4, false), (byte) -95);
        if (param0 <= 66) {
            boolean discarded$0 = ((cm) this).a((String) ((cm) this).field_k[20], (byte) -91);
        }
        return ((cm) this).b(10407, var3);
    }

    final synchronized boolean a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = SteelSentinels.field_G;
        if (((cm) this).a(true)) {
          L0: {
            var2 = 1;
            if (param0 == 25) {
              break L0;
            } else {
              this.a(((int[]) ((Object[]) ((cm) this).field_k[2])[10])[1], -7);
              break L0;
            }
          }
          var3 = 0;
          L1: while (true) {
            if (((cm) this).field_a.field_h.length <= var3) {
              return var2 != 0;
            } else {
              var4 = ((cm) this).field_a.field_h[var3];
              if (null == ((cm) this).field_k[var4]) {
                this.a(-52, var4);
                if (null == ((cm) this).field_k[var4]) {
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

    final int b(byte param0) {
        int var2 = -38 / ((param0 - 62) / 49);
        if (!(((cm) this).a(true))) {
            return -1;
        }
        return ((cm) this).field_a.field_g.length;
    }

    final synchronized boolean a(int param0, boolean param1) {
        if (!this.b(param0, param1)) {
            return false;
        }
        if (null != ((cm) this).field_k[param0]) {
            return true;
        }
        this.a(-123, param0);
        if (null != ((cm) this).field_k[param0]) {
            return true;
        }
        return false;
    }

    final synchronized byte[] c(int param0, int param1) {
        if (!((cm) this).a(true)) {
            return null;
        }
        if (-2 == (((cm) this).field_a.field_g.length ^ -1)) {
            return ((cm) this).a(0, (byte) 94, param0);
        }
        if (!this.b(param0, true)) {
            return null;
        }
        if (param1 != 28694) {
            int discarded$0 = ((cm) this).b((byte) -24);
        }
        if ((((cm) this).field_a.field_g[param0] ^ -1) == -2) {
            return ((cm) this).a(param0, (byte) 105, 0);
        }
        throw new RuntimeException();
    }

    private final synchronized byte[] b(int param0, int param1, int param2, int[] param3) {
        Object var5 = null;
        byte[] var5_array = null;
        byte[] var7 = null;
        L0: {
          if (param1 > 57) {
            break L0;
          } else {
            ((cm) this).field_d = ((int[]) ((cm) this).field_k[0])[7];
            break L0;
          }
        }
        if (this.b(param2, param0, -17637)) {
          L1: {
            L2: {
              var5 = null;
              if (((cm) this).field_i[param2] == null) {
                break L2;
              } else {
                if (null != ((cm) this).field_i[param2][param0]) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            if (!this.a(param0, param2, 0, param3)) {
              this.a(-70, param2);
              if (this.a(param0, param2, 0, param3)) {
                break L1;
              } else {
                return null;
              }
            } else {
              break L1;
            }
          }
          if (((cm) this).field_i[param2] != null) {
            L3: {
              if (null == ((cm) this).field_i[param2][param0]) {
                break L3;
              } else {
                var7 = dk.a(false, ((cm) this).field_i[param2][param0], 0);
                var5_array = var7;
                if (var7 != null) {
                  break L3;
                } else {
                  throw new RuntimeException("");
                }
              }
            }
            L4: {
              if (var5_array != null) {
                if (1 != ((cm) this).field_d) {
                  if (-3 != ((cm) this).field_d) {
                    break L4;
                  } else {
                    ((cm) this).field_i[param2] = null;
                    break L4;
                  }
                } else {
                  ((cm) this).field_i[param2][param0] = null;
                  if (-2 != ((cm) this).field_a.field_g[param2]) {
                    break L4;
                  } else {
                    ((cm) this).field_i[param2] = null;
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

    final synchronized byte[] a(String param0, int param1, String param2) {
        if (!((cm) this).a(true)) {
            return null;
        }
        param2 = param2.toLowerCase();
        param0 = param0.toLowerCase();
        if (param1 != -742) {
            return null;
        }
        CharSequence var6 = (CharSequence) (Object) param2;
        int var4 = ((cm) this).field_a.field_n.a(ij.a(var6, false), (byte) 117);
        if (!this.b(var4, true)) {
            return null;
        }
        CharSequence var7 = (CharSequence) (Object) param0;
        int var5 = ((cm) this).field_a.field_d[var4].a(ij.a(var7, false), (byte) -17);
        return ((cm) this).a(var4, (byte) 56, var5);
    }

    cm(fa param0, boolean param1, int param2) {
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
          ((cm) this).field_a = null;
          if ((param2 ^ -1) > -1) {
            break L0;
          } else {
            if ((param2 ^ -1) >= -3) {
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
              ((cm) this).field_f = stackIn_6_1 != 0;
              ((cm) this).field_d = param2;
              ((cm) this).field_o = param0;
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
        int var0 = 0;
        field_l = new int[8192];
        field_c = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find a suitable opponent in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_e = new int[105];
        field_n = "Unpacking sound effects";
        field_e[1] = 256;
        field_e[39] = 148;
        field_e[63] = 100;
        field_e[38] = 16;
        field_e[42] = 105;
        field_e[49] = 40;
        field_e[82] = 128;
        field_e[10] = 256;
        field_e[46] = 149;
        field_e[100] = 256;
        field_e[40] = 20;
        field_e[2] = 256;
        field_e[33] = 148;
        field_e[21] = 200;
        field_e[98] = 256;
        field_e[32] = 150;
        field_e[71] = 128;
        field_e[89] = 150;
        field_e[4] = 200;
        field_e[54] = 150;
        field_e[83] = 128;
        field_e[26] = 90;
        field_e[93] = 256;
        field_e[31] = 137;
        field_e[48] = 150;
        field_e[74] = 128;
        field_e[44] = 89;
        field_e[79] = 128;
        field_e[102] = 256;
        field_e[12] = 256;
        field_e[92] = 256;
        field_e[69] = 256;
        field_e[47] = 150;
        field_e[66] = 25;
        field_e[95] = 256;
        field_e[60] = 256;
        field_e[97] = 256;
        field_e[7] = 256;
        field_e[35] = 256;
        field_e[84] = 150;
        field_e[85] = 150;
        field_e[20] = 179;
        field_e[17] = 256;
        field_e[56] = 150;
        field_e[13] = 120;
        field_e[16] = 32;
        field_e[86] = 150;
        field_e[104] = 256;
        field_e[103] = 256;
        field_e[80] = 128;
        field_e[81] = 128;
        field_e[50] = 137;
        field_e[8] = 200;
        field_e[15] = 118;
        field_e[37] = 52;
        field_e[64] = 114;
        field_e[87] = 150;
        field_e[90] = 200;
        field_e[67] = 40;
        field_e[91] = 256;
        field_e[75] = 128;
        field_e[25] = 150;
        field_e[9] = 200;
        field_e[73] = 128;
        field_e[94] = 166;
        field_e[11] = 110;
        field_e[96] = 256;
        field_e[19] = 177;
        field_e[58] = 256;
        field_e[88] = 150;
        field_e[76] = 128;
        field_e[77] = 128;
        field_e[59] = 25;
        field_e[27] = 256;
        field_e[68] = 16;
        field_e[61] = 160;
        field_e[14] = 150;
        field_e[62] = 73;
        field_e[28] = 90;
        field_e[57] = 150;
        field_e[22] = 144;
        field_e[23] = 256;
        field_e[99] = 256;
        field_e[43] = 139;
        field_e[24] = 155;
        field_e[18] = 256;
        field_e[30] = 256;
        field_e[65] = 256;
        field_e[6] = 256;
        field_e[51] = 170;
        field_e[55] = 100;
        field_e[72] = 128;
        field_e[41] = 256;
        field_e[5] = 256;
        field_e[36] = 16;
        field_e[29] = 256;
        field_e[45] = 150;
        field_e[78] = 128;
        field_e[34] = 150;
        field_e[52] = 150;
        field_e[3] = 256;
        field_e[53] = 150;
        field_e[0] = 200;
        for (var0 = 0; var0 < field_e.length; var0++) {
            field_e[var0] = field_e[var0] * 3 / 4;
        }
        field_m = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_p = "FAVOURITES";
    }
}
