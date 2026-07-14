/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da {
    private int field_e;
    private ha field_g;
    private Object[] field_c;
    static ff field_i;
    private boolean field_h;
    static ef field_d;
    static int field_f;
    private wd field_j;
    private Object[][] field_b;
    static fa[] field_a;

    final synchronized boolean b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = SolKnight.field_L ? 1 : 0;
        if (!((da) this).c((byte) -121)) {
          return false;
        } else {
          var2 = param0 ? 1 : 0;
          var3 = 0;
          L0: while (true) {
            if (var3 >= ((da) this).field_g.field_f.length) {
              return var2 != 0;
            } else {
              var4 = ((da) this).field_g.field_f[var3];
              if (((da) this).field_c[var4] == null) {
                this.c(var4, 115);
                if (((da) this).field_c[var4] == null) {
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
        }
    }

    final int b(int param0, int param1) {
        if (!this.a((byte) 48, param1)) {
            return 0;
        }
        if (param0 < 5) {
            boolean discarded$0 = this.a(127, (int[]) ((da) this).field_c[0], 89, true);
        }
        return ((da) this).field_g.field_o[param1];
    }

    final int a(byte param0) {
        if (!(((da) this).c((byte) -121))) {
            return -1;
        }
        int var2 = -50 / ((-34 - param0) / 38);
        return ((da) this).field_g.field_o.length;
    }

    private final synchronized boolean a(int param0, boolean param1, int param2) {
        if (!(((da) this).c((byte) -121))) {
            return false;
        }
        if (param1) {
            field_d = null;
        }
        if ((param0 ^ -1) <= -1) {
            if ((param2 ^ -1) <= -1) {
                if (param0 < ((da) this).field_g.field_o.length) {
                    if (((da) this).field_g.field_o[param0] > param2) {
                        return true;
                    }
                }
            }
        }
        if (!ab.field_t) {
            return false;
        }
        throw new IllegalArgumentException(param0 + " " + param2);
    }

    final int a(String param0, int param1, int param2) {
        if (!this.a((byte) -84, param2)) {
            return -1;
        }
        param0 = param0.toLowerCase();
        CharSequence var5 = (CharSequence) (Object) param0;
        int var4 = ((da) this).field_g.field_j[param2].a(0, bk.a(param1 ^ param1, var5));
        if (!(this.a(param2, false, var4))) {
            return -1;
        }
        return var4;
    }

    final int d(int param0, String param1) {
        if (!((da) this).c((byte) -121)) {
            return 0;
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((da) this).field_g.field_e.a(0, bk.a(param0 ^ param0, var4));
        return ((da) this).b((byte) 100, var3);
    }

    final synchronized boolean a(int param0, int param1) {
        if (!(this.a((byte) -117, param0))) {
            return false;
        }
        if (((da) this).field_c[param0] != null) {
            return true;
        }
        if (param1 != -1) {
            return false;
        }
        this.c(param0, 115);
        if (((da) this).field_c[param0] != null) {
            return true;
        }
        return false;
    }

    final boolean a(String param0, String param1, boolean param2) {
        if (!(((da) this).c((byte) -121))) {
            return false;
        }
        param0 = param0.toLowerCase();
        if (!param2) {
            da.a(((boolean[]) ((Object[]) ((da) this).field_c[4])[1])[4]);
        }
        param1 = param1.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param0;
        int var4 = ((da) this).field_g.field_e.a(0, bk.a(0, var6));
        if (!(this.a((byte) 98, var4))) {
            return false;
        }
        CharSequence var7 = (CharSequence) (Object) param1;
        int var5 = ((da) this).field_g.field_j[var4].a(0, bk.a(0, var7));
        return ((da) this).a(100, var4, var5);
    }

    final static void a(boolean param0) {
        if (!lh.field_l) {
            throw new IllegalStateException();
        }
        kk.field_c = param0;
        qa.a(false, -111);
        fj.field_i = 0;
    }

    final synchronized int b(byte param0, int param1) {
        if (!this.a((byte) -114, param1)) {
            return 0;
        }
        if (param0 <= 78) {
            field_f = 108;
        }
        if (null != ((da) this).field_c[param1]) {
            return 100;
        }
        return ((da) this).field_j.a(param1, (byte) 31);
    }

    final synchronized boolean a(int param0, int param1, int param2) {
        if (!this.a(param1, false, param2)) {
            return false;
        }
        if (((da) this).field_b[param1] != null) {
            if (!(null == ((da) this).field_b[param1][param2])) {
                return true;
            }
        }
        if (!(((da) this).field_c[param1] == null)) {
            return true;
        }
        this.c(param1, 107);
        if (((da) this).field_c[param1] != null) {
            return true;
        }
        if (param0 != 100) {
            ((byte[]) ((Object[]) ((da) this).field_c[5])[7])[0] = (byte) 125;
            return false;
        }
        return false;
    }

    final int c(int param0, String param1) {
        if (!(((da) this).c((byte) -121))) {
            return -1;
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((da) this).field_g.field_e.a(0, bk.a(0, var4));
        if (param0 < 69) {
            return ((int[]) ((Object[]) ((da) this).field_c[5])[1])[1];
        }
        if (!(this.a((byte) -76, var3))) {
            return -1;
        }
        return var3;
    }

    private final synchronized boolean a(byte param0, int param1) {
        if (!((da) this).c((byte) -121)) {
            return false;
        }
        int var3 = -119 / ((param0 - -33) / 42);
        if (-1 >= param1) {
            if (param1 < ((da) this).field_g.field_o.length) {
                if (-1 != ((da) this).field_g.field_o[param1]) {
                    return true;
                }
            }
        }
        if (!ab.field_t) {
            return false;
        }
        throw new IllegalArgumentException(Integer.toString(param1));
    }

    public static void b(int param0) {
        if (param0 > -121) {
            da.a(true);
        }
        field_a = null;
        field_d = null;
        field_i = null;
    }

    final synchronized boolean c(byte param0) {
        if (param0 != -121) {
            boolean discarded$0 = this.a((byte) 64, 117);
        }
        if (null != ((da) this).field_g) {
            return true;
        }
        ((da) this).field_g = ((da) this).field_j.c(-68);
        if (null == ((da) this).field_g) {
            return false;
        }
        ((da) this).field_c = new Object[((da) this).field_g.field_l];
        ((da) this).field_b = new Object[((da) this).field_g.field_l][];
        return true;
    }

    final byte[] b(int param0, int param1, int param2) {
        if (param1 != 12257) {
            return null;
        }
        return this.a((int[]) null, param0, -17, param2);
    }

    private final synchronized byte[] a(int[] param0, int param1, int param2, int param3) {
        Object var5 = null;
        byte[] var5_array = null;
        int var6 = 0;
        byte[] var7 = null;
        if (this.a(param1, false, param3)) {
          L0: {
            L1: {
              var5 = null;
              if (null == ((da) this).field_b[param1]) {
                break L1;
              } else {
                if (null != ((da) this).field_b[param1][param3]) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (!this.a(param3, param0, param1, false)) {
              this.c(param1, 119);
              if (this.a(param3, param0, param1, false)) {
                break L0;
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          if (null == ((da) this).field_b[param1]) {
            throw new RuntimeException("");
          } else {
            L2: {
              if (null == ((da) this).field_b[param1][param3]) {
                break L2;
              } else {
                var7 = tk.a((byte) -59, false, ((da) this).field_b[param1][param3]);
                var5_array = var7;
                if (var7 != null) {
                  break L2;
                } else {
                  throw new RuntimeException("");
                }
              }
            }
            L3: {
              if (var5_array == null) {
                break L3;
              } else {
                if (1 == ((da) this).field_e) {
                  ((da) this).field_b[param1][param3] = null;
                  if (1 == ((da) this).field_g.field_o[param1]) {
                    ((da) this).field_b[param1] = null;
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  if (-3 == (((da) this).field_e ^ -1)) {
                    ((da) this).field_b[param1] = null;
                    break L3;
                  } else {
                    var6 = 91 / ((param2 - 50) / 45);
                    return var5_array;
                  }
                }
              }
            }
            var6 = 91 / ((param2 - 50) / 45);
            return var5_array;
          }
        } else {
          return null;
        }
    }

    final synchronized byte[] a(int param0, byte param1) {
        int var3 = -45 % ((5 - param1) / 37);
        if (!((da) this).c((byte) -121)) {
            return null;
        }
        if (!(-2 != (((da) this).field_g.field_o.length ^ -1))) {
            return ((da) this).b(0, 12257, param0);
        }
        if (!this.a((byte) 74, param0)) {
            return null;
        }
        if (!(-2 != (((da) this).field_g.field_o[param0] ^ -1))) {
            return ((da) this).b(param0, 12257, 0);
        }
        throw new RuntimeException();
    }

    private final synchronized void c(int param0, int param1) {
        if (param1 < 93) {
            ((boolean[]) ((da) this).field_c[2])[21] = true;
        }
        if (((da) this).field_h) {
            ((da) this).field_c[param0] = (Object) (Object) ((da) this).field_j.a(param0, 0);
        } else {
            ((da) this).field_c[param0] = w.a(((da) this).field_j.a(param0, 0), (byte) 7, false);
        }
    }

    final synchronized byte[] a(int param0, String param1, String param2) {
        if (!((da) this).c((byte) -121)) {
            return null;
        }
        param1 = param1.toLowerCase();
        if (param0 != 4) {
            ((da) this).field_b = null;
        }
        param2 = param2.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param1;
        int var4 = ((da) this).field_g.field_e.a(0, bk.a(0, var6));
        if (!this.a((byte) 106, var4)) {
            return null;
        }
        CharSequence var7 = (CharSequence) (Object) param2;
        int var5 = ((da) this).field_g.field_j[var4].a(0, bk.a(0, var7));
        return ((da) this).b(var4, 12257, var5);
    }

    final synchronized int b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = SolKnight.field_L ? 1 : 0;
        if (param0 == -66) {
          if (((da) this).c((byte) -121)) {
            var2 = 0;
            var3 = 0;
            var4 = 0;
            L0: while (true) {
              if (var4 >= ((da) this).field_c.length) {
                if (-1 != var2) {
                  var4 = var3 * 100 / var2;
                  return var4;
                } else {
                  return 100;
                }
              } else {
                if (((da) this).field_g.field_r[var4] < -1) {
                  var3 = var3 + ((da) this).b((byte) 94, var4);
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
        } else {
          return 45;
        }
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int[] var17 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = SolKnight.field_L ? 1 : 0;
        while (true) {
            param0--;
            if (-1 < (param0 ^ -1)) {
                break;
            }
            var17 = param2;
            var10 = var17;
            var11 = param7;
            var12 = param9;
            var13 = param6;
            var14 = param8;
            var15 = var17[var11] >> 748628833 & 8355711;
            var10[var11] = (fi.a(var14, 33448895) >> -1326618447) - -fi.a(var12 >> 614827233, 16711680) - (-(fi.a(var13, 33423626) >> 242024841) - var15);
            param8 = param8 + param4;
            param7++;
            param9 = param9 + param5;
            param6 = param6 + param3;
        }
        if (param1 <= 14) {
            da.b(-34);
        }
    }

    final static void a(int param0) {
        sg.field_b[192] = 28;
        sg.field_b[222] = 58;
        sg.field_b[520] = 59;
        if (param0 != 0) {
            da.a(-106);
        }
        sg.field_b[92] = 74;
        sg.field_b[47] = 73;
        sg.field_b[91] = 42;
        sg.field_b[44] = 71;
        sg.field_b[93] = 43;
        sg.field_b[59] = 57;
        sg.field_b[46] = 72;
        sg.field_b[45] = 26;
        sg.field_b[61] = 27;
    }

    final boolean b(int param0, String param1) {
        if (!((da) this).c((byte) -121)) {
            return false;
        }
        int var3 = -60 / ((param0 - -39) / 59);
        param1 = param1.toLowerCase();
        CharSequence var5 = (CharSequence) (Object) param1;
        int var4 = ((da) this).field_g.field_e.a(0, bk.a(0, var5));
        if ((var4 ^ -1) <= -1) {
            return true;
        }
        return false;
    }

    private final synchronized boolean a(int param0, int[] param1, int param2, boolean param3) {
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
        gb var26 = null;
        byte[] var27 = null;
        int[] var29 = null;
        gb var30 = null;
        byte[][] var31 = null;
        gb var32 = null;
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
        int stackIn_45_0 = 0;
        gb stackIn_45_1 = null;
        int stackIn_46_0 = 0;
        gb stackIn_46_1 = null;
        int stackIn_47_0 = 0;
        gb stackIn_47_1 = null;
        int stackIn_47_2 = 0;
        int stackIn_86_0 = 0;
        gb stackIn_86_1 = null;
        int stackIn_87_0 = 0;
        gb stackIn_87_1 = null;
        int stackIn_88_0 = 0;
        gb stackIn_88_1 = null;
        int stackIn_88_2 = 0;
        int stackOut_85_0 = 0;
        gb stackOut_85_1 = null;
        int stackOut_87_0 = 0;
        gb stackOut_87_1 = null;
        int stackOut_87_2 = 0;
        int stackOut_86_0 = 0;
        gb stackOut_86_1 = null;
        int stackOut_86_2 = 0;
        int stackOut_44_0 = 0;
        gb stackOut_44_1 = null;
        int stackOut_46_0 = 0;
        gb stackOut_46_1 = null;
        int stackOut_46_2 = 0;
        int stackOut_45_0 = 0;
        gb stackOut_45_1 = null;
        int stackOut_45_2 = 0;
        var22 = SolKnight.field_L ? 1 : 0;
        if (this.a((byte) 104, param2)) {
          if (null == ((da) this).field_c[param2]) {
            return false;
          } else {
            L0: {
              var5 = ((da) this).field_g.field_r[param2];
              var50 = ((da) this).field_g.field_a[param2];
              var42 = var50;
              var34 = var42;
              var24 = var34;
              var6 = var24;
              if (((da) this).field_b[param2] == null) {
                ((da) this).field_b[param2] = new Object[((da) this).field_g.field_o[param2]];
                break L0;
              } else {
                break L0;
              }
            }
            var7 = ((da) this).field_b[param2];
            var8 = 1;
            var9_int = 0;
            L1: while (true) {
              L2: {
                if (var5 <= var9_int) {
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
                  if (var7[var10] == null) {
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
                  if (!param3) {
                    break L4;
                  } else {
                    ((da) this).field_e = 3;
                    break L4;
                  }
                }
                L5: {
                  L6: {
                    if (param1 == null) {
                      break L6;
                    } else {
                      L7: {
                        if (-1 != param1[0]) {
                          break L7;
                        } else {
                          if (param1[1] != 0) {
                            break L7;
                          } else {
                            if (0 != param1[2]) {
                              break L7;
                            } else {
                              if (-1 == param1[3]) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                      }
                      var51 = tk.a((byte) -76, true, ((da) this).field_c[param2]);
                      var26 = new gb(var51);
                      var26.a(param1, 5, 5838, var26.field_l.length);
                      var52 = var51;
                      break L5;
                    }
                  }
                  var52 = tk.a((byte) -110, false, ((da) this).field_c[param2]);
                  var44 = var52;
                  var36 = var44;
                  var9 = var36;
                  break L5;
                }
                L8: {
                  var53 = jh.a(var52, 6);
                  var45 = var53;
                  var37 = var45;
                  var27 = var37;
                  var23 = var27;
                  var54 = var23;
                  if (((da) this).field_h) {
                    ((da) this).field_c[param2] = null;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if ((var5 ^ -1) < -2) {
                    var53 = var45;
                    if (-3 == (((da) this).field_e ^ -1)) {
                      var53 = var45;
                      var11 = var53.length;
                      var11--;
                      var12 = var23[var11] & 255;
                      var11 = var11 - 4 * var12 * var5;
                      var32 = new gb(var54);
                      var14 = 0;
                      var32.field_m = var11;
                      var15 = 0;
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
                                break L9;
                              } else {
                                var19 = 0;
                                var20 = 0;
                                L12: while (true) {
                                  if (var5 <= var20) {
                                    var18++;
                                    continue L11;
                                  } else {
                                    L13: {
                                      stackOut_85_0 = var19;
                                      stackOut_85_1 = (gb) var32;
                                      stackIn_87_0 = stackOut_85_0;
                                      stackIn_87_1 = stackOut_85_1;
                                      stackIn_86_0 = stackOut_85_0;
                                      stackIn_86_1 = stackOut_85_1;
                                      if (param3) {
                                        stackOut_87_0 = stackIn_87_0;
                                        stackOut_87_1 = (gb) (Object) stackIn_87_1;
                                        stackOut_87_2 = 0;
                                        stackIn_88_0 = stackOut_87_0;
                                        stackIn_88_1 = stackOut_87_1;
                                        stackIn_88_2 = stackOut_87_2;
                                        break L13;
                                      } else {
                                        stackOut_86_0 = stackIn_86_0;
                                        stackOut_86_1 = (gb) (Object) stackIn_86_1;
                                        stackOut_86_2 = 1;
                                        stackIn_88_0 = stackOut_86_0;
                                        stackIn_88_1 = stackOut_86_1;
                                        stackIn_88_2 = stackOut_86_2;
                                        break L13;
                                      }
                                    }
                                    L14: {
                                      var19 = stackIn_88_0 + ((gb) (Object) stackIn_88_1).e(stackIn_88_2 != 0);
                                      if (var6 != null) {
                                        var21 = var50[var20];
                                        break L14;
                                      } else {
                                        var21 = var20;
                                        break L14;
                                      }
                                    }
                                    L15: {
                                      if (param0 != var21) {
                                        break L15;
                                      } else {
                                        fk.a(var54, var17, var57, var14, var19);
                                        var14 = var14 + var19;
                                        break L15;
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
                          L16: while (true) {
                            if (var18 >= var5) {
                              var16++;
                              continue L10;
                            } else {
                              L17: {
                                var17 = var17 + var32.e(true);
                                if (var6 != null) {
                                  var19 = var50[var18];
                                  break L17;
                                } else {
                                  var19 = var18;
                                  break L17;
                                }
                              }
                              if (var19 == param0) {
                                var15 = var19;
                                var14 = var14 + var17;
                                var18++;
                                continue L16;
                              } else {
                                var18++;
                                continue L16;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var11 = var53.length;
                      var11--;
                      var12 = 255 & var23[var11];
                      var11 = var11 - 4 * (var12 * var5);
                      var30 = new gb(var54);
                      var30.field_m = var11;
                      var55 = new int[var5];
                      var47 = var55;
                      var39 = var47;
                      var29 = var39;
                      var14_ref_int__ = var29;
                      var15 = 0;
                      L18: while (true) {
                        if (var12 <= var15) {
                          var56 = new byte[var5][];
                          var48 = var56;
                          var40 = var48;
                          var31 = var40;
                          var15_ref_byte____ = var31;
                          var16 = 0;
                          L19: while (true) {
                            if (var5 <= var16) {
                              var30.field_m = var11;
                              var16 = 0;
                              var17 = 0;
                              L20: while (true) {
                                if (var12 <= var17) {
                                  var17 = 0;
                                  L21: while (true) {
                                    if (var17 >= var5) {
                                      break L9;
                                    } else {
                                      L22: {
                                        if (var6 == null) {
                                          var18 = var17;
                                          break L22;
                                        } else {
                                          var18 = var50[var17];
                                          break L22;
                                        }
                                      }
                                      if (((da) this).field_e == 0) {
                                        var7[var18] = w.a(var56[var17], (byte) 7, false);
                                        var17++;
                                        continue L21;
                                      } else {
                                        var7[var18] = (Object) (Object) var56[var17];
                                        var17++;
                                        continue L21;
                                      }
                                    }
                                  }
                                } else {
                                  var18 = 0;
                                  var19 = 0;
                                  L23: while (true) {
                                    if (var19 >= var5) {
                                      var17++;
                                      continue L20;
                                    } else {
                                      var18 = var18 + var30.e(true);
                                      fk.a(var54, var16, var56[var19], var55[var19], var18);
                                      var16 = var16 + var18;
                                      var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                                      var19++;
                                      continue L23;
                                    }
                                  }
                                }
                              }
                            } else {
                              var15_ref_byte____[var16] = new byte[var55[var16]];
                              var55[var16] = 0;
                              var16++;
                              continue L19;
                            }
                          }
                        } else {
                          var16 = 0;
                          var17 = 0;
                          L24: while (true) {
                            if (var17 >= var5) {
                              var15++;
                              continue L18;
                            } else {
                              L25: {
                                stackOut_44_0 = var16;
                                stackOut_44_1 = (gb) var30;
                                stackIn_46_0 = stackOut_44_0;
                                stackIn_46_1 = stackOut_44_1;
                                stackIn_45_0 = stackOut_44_0;
                                stackIn_45_1 = stackOut_44_1;
                                if (param3) {
                                  stackOut_46_0 = stackIn_46_0;
                                  stackOut_46_1 = (gb) (Object) stackIn_46_1;
                                  stackOut_46_2 = 0;
                                  stackIn_47_0 = stackOut_46_0;
                                  stackIn_47_1 = stackOut_46_1;
                                  stackIn_47_2 = stackOut_46_2;
                                  break L25;
                                } else {
                                  stackOut_45_0 = stackIn_45_0;
                                  stackOut_45_1 = (gb) (Object) stackIn_45_1;
                                  stackOut_45_2 = 1;
                                  stackIn_47_0 = stackOut_45_0;
                                  stackIn_47_1 = stackOut_45_1;
                                  stackIn_47_2 = stackOut_45_2;
                                  break L25;
                                }
                              }
                              var16 = stackIn_47_0 + ((gb) (Object) stackIn_47_1).e(stackIn_47_2 != 0);
                              var14_ref_int__[var17] = var14_ref_int__[var17] + var16;
                              var17++;
                              continue L24;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    L26: {
                      if (var6 == null) {
                        var11 = 0;
                        break L26;
                      } else {
                        var11 = var50[0];
                        break L26;
                      }
                    }
                    if (((da) this).field_e != 0) {
                      var7[var11] = (Object) (Object) var54;
                      break L9;
                    } else {
                      var7[var11] = w.a(var53, (byte) 7, false);
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

    final static String a(boolean param0, byte[] param1) {
        if (!param0) {
            return null;
        }
        return vd.a(param1, 0, param1.length, 160);
    }

    final boolean a(int param0, String param1) {
        if (!((da) this).c((byte) -121)) {
            return false;
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((da) this).field_g.field_e.a(param0 ^ param0, bk.a(0, var4));
        return ((da) this).a(var3, -1);
    }

    da(wd param0, boolean param1, int param2) {
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
          ((da) this).field_g = null;
          if (-1 < (param2 ^ -1)) {
            break L0;
          } else {
            if (param2 <= 2) {
              L1: {
                ((da) this).field_j = param0;
                ((da) this).field_e = param2;
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
              ((da) this).field_h = stackIn_6_1 != 0;
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
        field_i = new ff(6, 0, 4, 2);
        field_d = new ef();
        field_a = new fa[255];
        for (var0 = 0; field_a.length > var0; var0++) {
            field_a[var0] = new fa();
        }
    }
}
