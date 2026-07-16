/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di {
    static int field_b;
    private Object[][] field_c;
    static int field_h;
    private lh field_d;
    private Object[] field_l;
    boolean field_i;
    static int field_e;
    private ad field_f;
    static String field_a;
    static String field_j;
    static int field_g;
    int field_k;

    private final synchronized boolean b(int param0, byte param1) {
        if (((di) this).d(-38)) {
          if (param1 <= -58) {
            L0: {
              if (param0 < 0) {
                break L0;
              } else {
                if (((di) this).field_f.field_z.length <= param0) {
                  break L0;
                } else {
                  if (((di) this).field_f.field_z[param0] != 0) {
                    return true;
                  } else {
                    break L0;
                  }
                }
              }
            }
            if (uk.field_c) {
              throw new IllegalArgumentException(Integer.toString(param0));
            } else {
              return false;
            }
          } else {
            return ((boolean[]) ((di) this).field_l[1])[10];
          }
        } else {
          return false;
        }
    }

    final synchronized boolean d(int param0) {
        if (null == ((di) this).field_f) {
            ((di) this).field_f = ((di) this).field_d.b((byte) -21);
            if (!(((di) this).field_f != null)) {
                return false;
            }
            ((di) this).field_c = new Object[((di) this).field_f.field_d][];
            ((di) this).field_l = new Object[((di) this).field_f.field_d];
        }
        int var2 = -26 / ((8 - param0) / 39);
        return true;
    }

    private final synchronized boolean c(int param0, int param1, int param2) {
        if (!((di) this).d(param0 ^ -21930)) {
          return false;
        } else {
          L0: {
            if (0 > param2) {
              break L0;
            } else {
              if (-1 < (param1 ^ -1)) {
                break L0;
              } else {
                if (((di) this).field_f.field_z.length <= param2) {
                  break L0;
                } else {
                  if (((di) this).field_f.field_z[param2] > param1) {
                    if (param0 == -21918) {
                      return true;
                    } else {
                      ((di) this).field_f = null;
                      return true;
                    }
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
          if (uk.field_c) {
            throw new IllegalArgumentException(param2 + " " + param1);
          } else {
            return false;
          }
        }
    }

    public static void e(int param0) {
        field_j = null;
        if (param0 != 0) {
            di.a(true, (byte) -103, true);
        }
        field_a = null;
    }

    final synchronized boolean c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Pool.field_O;
        if (!((di) this).d(102)) {
          return false;
        } else {
          L0: {
            if (param0 == -63) {
              break L0;
            } else {
              ((di) this).field_i = ((boolean[]) ((di) this).field_l[0])[0];
              break L0;
            }
          }
          var2 = 1;
          var3 = 0;
          L1: while (true) {
            if (((di) this).field_f.field_m.length <= var3) {
              return var2 != 0;
            } else {
              var4 = ((di) this).field_f.field_m[var3];
              if (null == ((di) this).field_l[var4]) {
                this.c(var4, -1);
                if (null == ((di) this).field_l[var4]) {
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

    final synchronized boolean a(int param0, byte param1) {
        if (!this.b(param0, (byte) -78)) {
            return false;
        }
        if (!(((di) this).field_l[param0] == null)) {
            return true;
        }
        this.c(param0, -1);
        if (!(((di) this).field_l[param0] == null)) {
            return true;
        }
        int var3 = -68 % ((-7 - param1) / 54);
        return false;
    }

    final boolean a(String param0, int param1) {
        if (!((di) this).d(106)) {
            return false;
        }
        param0 = param0.toLowerCase();
        if (param1 != 0) {
            return false;
        }
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((di) this).field_f.field_p.a(t.a(29050, var4), (byte) 126);
        return ((di) this).a(var3, (byte) 53);
    }

    final synchronized boolean b(boolean param0, int param1) {
        if (!((di) this).d(75)) {
            return false;
        }
        if (1 == ((di) this).field_f.field_z.length) {
            return ((di) this).b(param1, 0, 65);
        }
        if (!param0) {
            byte[] discarded$0 = ((di) this).a(-76, -87, 57);
        }
        if (!this.b(param1, (byte) -124)) {
            return false;
        }
        if (((di) this).field_f.field_z[param1] == 1) {
            return ((di) this).b(0, param1, 111);
        }
        throw new RuntimeException();
    }

    final synchronized int[] a(int param0, int param1) {
        int[] var6 = null;
        int var4 = 0;
        int var5 = Pool.field_O;
        if (!this.b(param0, (byte) -63)) {
            return null;
        }
        if (param1 != 0) {
            ((di) this).field_i = ((boolean[]) ((Object[]) ((di) this).field_l[0])[1])[17];
        }
        int[] var3 = ((di) this).field_f.field_k[param0];
        if (!(var3 != null)) {
            var6 = new int[((di) this).field_f.field_s[param0]];
            var3 = var6;
            for (var4 = 0; var4 < var6.length; var4++) {
                var6[var4] = var4;
            }
        }
        return var3;
    }

    final boolean a(String param0, int param1, String param2) {
        if (!((di) this).d(74)) {
            return false;
        }
        param2 = param2.toLowerCase();
        param0 = param0.toLowerCase();
        int var5 = 36 % ((param1 - 40) / 52);
        CharSequence var7 = (CharSequence) (Object) param2;
        int var4 = ((di) this).field_f.field_p.a(t.a(29050, var7), (byte) 120);
        if (!this.b(var4, (byte) -91)) {
            return false;
        }
        CharSequence var8 = (CharSequence) (Object) param0;
        int var6 = ((di) this).field_f.field_n[var4].a(t.a(29050, var8), (byte) 127);
        return ((di) this).b(var6, var4, 32);
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = Pool.field_O;
        for (var1 = 0; var1 < nn.field_b.length; var1++) {
            nn.field_b[var1].i(25879);
        }
        int var3 = param0;
        var1 = var3;
        while (al.field_B.length > var3) {
            al.field_B[var3].a(7096);
            var3++;
        }
    }

    final static String a(long param0, int param1, boolean param2, int param3, int param4, int param5) {
        long var7 = 0L;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        long var13 = 0L;
        long var15 = 0L;
        char[] var17 = null;
        int var18 = 0;
        char[] var19 = null;
        char[] var20 = null;
        char[] var21 = null;
        char[] var22 = null;
        int stackIn_16_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          if (param3 < -90) {
            break L0;
          } else {
            di.a(false, (byte) 98, true);
            break L0;
          }
        }
        L1: {
          if (-1 < (param1 ^ -1)) {
            break L1;
          } else {
            if ((param1 ^ -1) >= -63) {
              L2: {
                if ((param5 ^ -1) > -3) {
                  break L2;
                } else {
                  if (36 < param5) {
                    break L2;
                  } else {
                    L3: {
                      if (param0 >= 0L) {
                        if (!param2) {
                          stackOut_14_0 = 0;
                          stackIn_16_0 = stackOut_14_0;
                          break L3;
                        } else {
                          stackOut_13_0 = 1;
                          stackIn_16_0 = stackOut_13_0;
                          break L3;
                        }
                      } else {
                        stackOut_11_0 = 1;
                        stackIn_16_0 = stackOut_11_0;
                        break L3;
                      }
                    }
                    L4: {
                      var12 = stackIn_16_0;
                      var13 = (long)(1 << param1);
                      var15 = -1L + var13;
                      if (-1L >= (param0 ^ -1L)) {
                        var7 = param0 >> param1;
                        var9 = param0 & var15;
                        break L4;
                      } else {
                        var9 = -(param0 & var15) + var13;
                        var7 = -param0 >> param1;
                        break L4;
                      }
                    }
                    L5: {
                      if (0L != var7) {
                        var11 = var12;
                        L6: while (true) {
                          if (0L == var7) {
                            break L5;
                          } else {
                            var12++;
                            var11++;
                            var7 = var7 / (long)param5;
                            continue L6;
                          }
                        }
                      } else {
                        var12++;
                        var11 = var12;
                        break L5;
                      }
                    }
                    L7: {
                      if (var9 == 0L) {
                        break L7;
                      } else {
                        var11++;
                        L8: while (true) {
                          if (var9 == 0L) {
                            break L7;
                          } else {
                            int incrementValue$1 = param4;
                            param4--;
                            if (0 == incrementValue$1) {
                              break L7;
                            } else {
                              var9 = var9 * (long)param5;
                              var11++;
                              var9 = var9 & var15;
                              continue L8;
                            }
                          }
                        }
                      }
                    }
                    L9: {
                      if ((param0 ^ -1L) <= -1L) {
                        var9 = param0 & var15;
                        var7 = param0 >> param1;
                        break L9;
                      } else {
                        var7 = -param0 >> param1;
                        var9 = param0 & var15;
                        if ((var9 ^ -1L) == -1L) {
                          break L9;
                        } else {
                          var9 = var13 + -(var15 & param0);
                          break L9;
                        }
                      }
                    }
                    L10: {
                      var22 = new char[var11];
                      var21 = var22;
                      var20 = var21;
                      var19 = var20;
                      var17 = var19;
                      if (0L <= param0) {
                        if (!param2) {
                          break L10;
                        } else {
                          var17[0] = (char)43;
                          break L10;
                        }
                      } else {
                        var17[0] = (char)45;
                        break L10;
                      }
                    }
                    L11: {
                      if ((var7 ^ -1L) != -1L) {
                        var18 = -1 + var12;
                        L12: while (true) {
                          if (-1L == (var7 ^ -1L)) {
                            break L11;
                          } else {
                            var17[var18] = wm.field_Wb[(int)(var7 % (long)param5)];
                            var7 = var7 / (long)param5;
                            var18--;
                            continue L12;
                          }
                        }
                      } else {
                        var17[var12 + -1] = wm.field_Wb[0];
                        break L11;
                      }
                    }
                    L13: {
                      if (var9 != 0L) {
                        var17[var12] = (char)46;
                        var18 = 1 + var12;
                        L14: while (true) {
                          if (var22.length <= var18) {
                            break L13;
                          } else {
                            var9 = var9 * (long)param5;
                            var17[var18] = wm.field_Wb[(int)(var9 >> param1)];
                            var9 = var9 & var15;
                            var18++;
                            continue L14;
                          }
                        }
                      } else {
                        break L13;
                      }
                    }
                    return new String(var22);
                  }
                }
              }
              throw new IllegalArgumentException("Invalid radix: " + param5);
            } else {
              break L1;
            }
          }
        }
        throw new IllegalArgumentException("Invalid fp: " + param1);
    }

    final int b(String param0, int param1) {
        if (!((di) this).d(107)) {
            return -1;
        }
        if (param1 != -1) {
            Object var4 = null;
            byte[] discarded$0 = this.a((int[]) null, 23, -125, -21);
        }
        param0 = param0.toLowerCase();
        CharSequence var5 = (CharSequence) (Object) param0;
        int var3 = ((di) this).field_f.field_p.a(t.a(param1 + 29051, var5), (byte) -120);
        if (!this.b(var3, (byte) -71)) {
            return -1;
        }
        return var3;
    }

    final int f(int param0) {
        if (param0 != -1) {
            String discarded$0 = di.a(((long[]) ((Object[]) ((di) this).field_l[2])[6])[12], -60, true, 112, -107, -102);
        }
        if (!((di) this).d(-82)) {
            return -1;
        }
        return ((di) this).field_f.field_z.length;
    }

    final synchronized int d(int param0, int param1) {
        if (param0 != -29867) {
            return -51;
        }
        if (!(this.b(param1, (byte) -114))) {
            return 0;
        }
        if (null != ((di) this).field_l[param1]) {
            return 100;
        }
        return ((di) this).field_d.a(-18600, param1);
    }

    final int a(boolean param0, int param1) {
        if (param0) {
            Object var4 = null;
            boolean discarded$0 = ((di) this).a((byte) 89, (String) null);
        }
        if (!(this.b(param1, (byte) -68))) {
            return 0;
        }
        return ((di) this).field_f.field_z[param1];
    }

    final synchronized boolean b(int param0, int param1, int param2) {
        if (!(this.c(-21918, param0, param1))) {
            return false;
        }
        if (param2 < 2) {
            boolean discarded$0 = ((di) this).a((byte) 97, (String) ((di) this).field_l[1]);
        }
        if (((di) this).field_c[param1] != null) {
            if (((di) this).field_c[param1][param0] != null) {
                return true;
            }
        }
        if (((di) this).field_l[param1] != null) {
            return true;
        }
        this.c(param1, -1);
        if (null != ((di) this).field_l[param1]) {
            return true;
        }
        return false;
    }

    final static void a(boolean param0, byte param1, boolean param2) {
        if (param2) {
            qh.c(0, 0, qh.field_l, qh.field_f, 0, 192);
        } else {
            qh.d();
        }
        to.a((byte) -39, param2);
        if (param1 <= 84) {
            field_j = null;
        }
    }

    final int a(int param0, int param1, String param2) {
        if (!this.b(param0, (byte) -128)) {
            return -1;
        }
        param2 = param2.toLowerCase();
        if (param1 != 0) {
            return ((int[]) ((di) this).field_l[0])[7];
        }
        CharSequence var5 = (CharSequence) (Object) param2;
        int var4 = ((di) this).field_f.field_n[param0].a(t.a(29050, var5), (byte) 118);
        if (!this.c(param1 ^ -21918, var4, param0)) {
            return -1;
        }
        return var4;
    }

    private final synchronized byte[] a(int[] param0, int param1, int param2, int param3) {
        Object var5 = null;
        byte[] var7 = null;
        if (this.c(param1 ^ 21916, param2, param3)) {
          L0: {
            if (param1 == -2) {
              break L0;
            } else {
              boolean discarded$1 = ((di) this).a(40, ((byte[]) ((di) this).field_l[0])[5]);
              break L0;
            }
          }
          L1: {
            L2: {
              var5 = null;
              if (((di) this).field_c[param3] == null) {
                break L2;
              } else {
                if (null != ((di) this).field_c[param3][param2]) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            if (!this.a(param1 + 2, param0, param2, param3)) {
              this.c(param3, -1);
              if (this.a(param1 ^ -2, param0, param2, param3)) {
                break L1;
              } else {
                return null;
              }
            } else {
              break L1;
            }
          }
          if (((di) this).field_c[param3] != null) {
            L3: {
              if (((di) this).field_c[param3][param2] != null) {
                var7 = or.a(((di) this).field_c[param3][param2], param1 ^ 19261, false);
                var5 = (Object) (Object) var7;
                if (var7 != null) {
                  break L3;
                } else {
                  throw new RuntimeException("");
                }
              } else {
                break L3;
              }
            }
            L4: {
              if (var5 == null) {
                break L4;
              } else {
                if ((((di) this).field_k ^ -1) != -2) {
                  if ((((di) this).field_k ^ -1) != -3) {
                    break L4;
                  } else {
                    ((di) this).field_c[param3] = null;
                    break L4;
                  }
                } else {
                  ((di) this).field_c[param3][param2] = null;
                  if (-2 != (((di) this).field_f.field_z[param3] ^ -1)) {
                    break L4;
                  } else {
                    ((di) this).field_c[param3] = null;
                    break L4;
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
    }

    final int a(int param0, String param1) {
        if (!(((di) this).d(84))) {
            return 0;
        }
        param1 = param1.toLowerCase();
        if (param0 != 100) {
            ((di) this).field_d = null;
        }
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((di) this).field_f.field_p.a(t.a(param0 + 28950, var4), (byte) 117);
        return ((di) this).d(-29867, var3);
    }

    final synchronized byte[] a(boolean param0, String param1, String param2) {
        if (!((di) this).d(-80)) {
            return null;
        }
        param2 = param2.toLowerCase();
        if (param0) {
            int discarded$0 = ((di) this).b(((int[]) ((di) this).field_l[7])[28]);
        }
        param1 = param1.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param2;
        int var4 = ((di) this).field_f.field_p.a(t.a(29050, var6), (byte) -63);
        if (!this.b(var4, (byte) -120)) {
            return null;
        }
        CharSequence var7 = (CharSequence) (Object) param1;
        int var5 = ((di) this).field_f.field_n[var4].a(t.a(29050, var7), (byte) -114);
        return ((di) this).a(125, var5, var4);
    }

    final byte[] a(int param0, int param1, int param2) {
        if (param0 <= 79) {
            ((di) this).field_c = null;
        }
        return this.a((int[]) null, -2, param1, param2);
    }

    final synchronized int b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        if (!((di) this).d(-53)) {
          return 0;
        } else {
          L0: {
            var2 = 0;
            var3 = 0;
            if (param0 == 0) {
              break L0;
            } else {
              ((di) this).field_c = null;
              break L0;
            }
          }
          var4 = 0;
          L1: while (true) {
            if (var4 >= ((di) this).field_l.length) {
              if (-1 != (var2 ^ -1)) {
                var4 = var3 * 100 / var2;
                return var4;
              } else {
                return 100;
              }
            } else {
              if (((di) this).field_f.field_s[var4] > 0) {
                var2 += 100;
                var3 = var3 + ((di) this).d(-29867, var4);
                var4++;
                continue L1;
              } else {
                var4++;
                continue L1;
              }
            }
          }
        }
    }

    final boolean a(byte param0, String param1) {
        if (!((di) this).d(-120)) {
            return false;
        }
        param1 = param1.toLowerCase();
        int var3 = 29 / ((param0 - -48) / 57);
        CharSequence var5 = (CharSequence) (Object) param1;
        int var4 = ((di) this).field_f.field_p.a(t.a(29050, var5), (byte) 119);
        if ((var4 ^ -1) > -1) {
            return false;
        }
        return true;
    }

    private final synchronized void c(int param0, int param1) {
        if (!((di) this).field_i) {
            ((di) this).field_l[param0] = pj.a(false, param1 + -29, ((di) this).field_d.a(param0, (byte) 19));
        } else {
            ((di) this).field_l[param0] = (Object) (Object) ((di) this).field_d.a(param0, (byte) 19);
        }
        if (param1 != -1) {
            Object var4 = null;
            boolean discarded$0 = this.a(29, (int[]) null, 14, -109);
        }
    }

    di(lh param0, boolean param1, int param2) {
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
          ((di) this).field_f = null;
          if (0 > param2) {
            break L0;
          } else {
            if (-3 <= (param2 ^ -1)) {
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
              ((di) this).field_i = stackIn_6_1 != 0;
              ((di) this).field_k = param2;
              ((di) this).field_d = param0;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("");
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
        byte[] var22 = null;
        int[] var23 = null;
        byte[] var24 = null;
        ge var25 = null;
        byte[] var26 = null;
        ge var28 = null;
        ge var30 = null;
        int[] var31 = null;
        byte[][] var32 = null;
        int[] var33 = null;
        byte[] var34 = null;
        byte[] var35 = null;
        int[] var38 = null;
        byte[][] var39 = null;
        int[] var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        int[] var45 = null;
        byte[][] var46 = null;
        int[] var47 = null;
        byte[] var48 = null;
        byte[] var49 = null;
        byte[] var50 = null;
        byte[] var51 = null;
        int[] var52 = null;
        byte[][] var53 = null;
        if (!this.b(param3, (byte) -64)) {
          return false;
        } else {
          if (null != ((di) this).field_l[param3]) {
            L0: {
              var5 = ((di) this).field_f.field_s[param3];
              var47 = ((di) this).field_f.field_k[param3];
              var40 = var47;
              var33 = var40;
              var23 = var33;
              var6 = var23;
              if (((di) this).field_c[param3] != null) {
                break L0;
              } else {
                ((di) this).field_c[param3] = new Object[((di) this).field_f.field_z[param3]];
                break L0;
              }
            }
            var7 = ((di) this).field_c[param3];
            var8 = 1;
            var9_int = 0;
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
                      var10 = var47[var9_int];
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
              if (var8 != 0) {
                return true;
              } else {
                L4: {
                  L5: {
                    if (param1 == null) {
                      break L5;
                    } else {
                      L6: {
                        if (0 != param1[0]) {
                          break L6;
                        } else {
                          if (-1 != (param1[1] ^ -1)) {
                            break L6;
                          } else {
                            if (param1[2] != 0) {
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
                      var48 = or.a(((di) this).field_l[param3], -19261, true);
                      var41 = var48;
                      var34 = var41;
                      var24 = var34;
                      var9 = var24;
                      var25 = new ge(var48);
                      var25.a(var25.field_t.length, 5, param1, param0 + -81);
                      break L4;
                    }
                  }
                  var9 = or.a(((di) this).field_l[param3], -19261, false);
                  break L4;
                }
                L7: {
                  var49 = wp.a(param0, var9);
                  var42 = var49;
                  var35 = var42;
                  var26 = var35;
                  var22 = var26;
                  var50 = var22;
                  if (((di) this).field_i) {
                    ((di) this).field_l[param3] = null;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (1 < var5) {
                    if (2 != ((di) this).field_k) {
                      var11 = var49.length;
                      var11--;
                      var12 = var22[var11] & 255;
                      var11 = var11 - var5 * var12 * 4;
                      var30 = new ge(var50);
                      var30.field_v = var11;
                      var52 = new int[var5];
                      var45 = var52;
                      var38 = var45;
                      var31 = var38;
                      var14 = var31;
                      var15_int = 0;
                      L9: while (true) {
                        if (var15_int >= var12) {
                          var53 = new byte[var5][];
                          var46 = var53;
                          var39 = var46;
                          var32 = var39;
                          var15 = var32;
                          var16 = 0;
                          L10: while (true) {
                            if (var5 <= var16) {
                              var30.field_v = var11;
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
                                          var18 = var47[var17];
                                          break L13;
                                        } else {
                                          var18 = var17;
                                          break L13;
                                        }
                                      }
                                      if (((di) this).field_k != 0) {
                                        var7[var18] = (Object) (Object) var53[var17];
                                        var17++;
                                        continue L12;
                                      } else {
                                        var7[var18] = pj.a(false, -54, var53[var17]);
                                        var17++;
                                        continue L12;
                                      }
                                    }
                                  }
                                } else {
                                  var18 = 0;
                                  var19 = 0;
                                  L14: while (true) {
                                    if (var5 <= var19) {
                                      var17++;
                                      continue L11;
                                    } else {
                                      var18 = var18 + var30.b(true);
                                      qn.a(var49, var16, var53[var19], var52[var19], var18);
                                      var16 = var16 + var18;
                                      var14[var19] = var14[var19] + var18;
                                      var19++;
                                      continue L14;
                                    }
                                  }
                                }
                              }
                            } else {
                              var15[var16] = new byte[var52[var16]];
                              var52[var16] = 0;
                              var16++;
                              continue L10;
                            }
                          }
                        } else {
                          var16 = 0;
                          var17 = 0;
                          L15: while (true) {
                            if (var5 <= var17) {
                              var15_int++;
                              continue L9;
                            } else {
                              var16 = var16 + var30.b(true);
                              var14[var17] = var14[var17] + var16;
                              var17++;
                              continue L15;
                            }
                          }
                        }
                      }
                    } else {
                      var11 = var49.length;
                      var11--;
                      var12 = var22[var11] & 255;
                      var11 = var11 - var5 * (var12 * 4);
                      var28 = new ge(var50);
                      var14_int = 0;
                      var15_int = 0;
                      var28.field_v = var11;
                      var16 = 0;
                      L16: while (true) {
                        if (var12 <= var16) {
                          if (var14_int == 0) {
                            return true;
                          } else {
                            var51 = new byte[var14_int];
                            var28.field_v = var11;
                            var14_int = 0;
                            var17 = 0;
                            var18 = 0;
                            L17: while (true) {
                              if (var12 <= var18) {
                                var7[var15_int] = (Object) (Object) var51;
                                break L8;
                              } else {
                                var19 = 0;
                                var20 = 0;
                                L18: while (true) {
                                  if (var20 >= var5) {
                                    var18++;
                                    continue L17;
                                  } else {
                                    L19: {
                                      var19 = var19 + var28.b(true);
                                      if (var6 == null) {
                                        var21 = var20;
                                        break L19;
                                      } else {
                                        var21 = var47[var20];
                                        break L19;
                                      }
                                    }
                                    L20: {
                                      if (param2 == var21) {
                                        qn.a(var50, var17, var51, var14_int, var19);
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
                            if (var5 <= var18) {
                              var16++;
                              continue L16;
                            } else {
                              L22: {
                                var17 = var17 + var28.b(true);
                                if (var6 == null) {
                                  var19 = var18;
                                  break L22;
                                } else {
                                  var19 = var47[var18];
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
                      if (var6 == null) {
                        var11 = 0;
                        break L23;
                      } else {
                        var11 = var47[0];
                        break L23;
                      }
                    }
                    if (((di) this).field_k != 0) {
                      var7[var11] = (Object) (Object) var49;
                      break L8;
                    } else {
                      var7[var11] = pj.a(false, -77, var49);
                      return true;
                    }
                  }
                }
                return true;
              }
            }
          } else {
            return false;
          }
        }
    }

    final synchronized byte[] b(int param0, int param1) {
        if (!((di) this).d(param1 ^ -31482)) {
            return null;
        }
        if (1 == ((di) this).field_f.field_z.length) {
            return ((di) this).a(119, param0, 0);
        }
        if (!this.b(param0, (byte) -125)) {
            return null;
        }
        if (!((((di) this).field_f.field_z[param0] ^ -1) != -2)) {
            return ((di) this).a(113, 0, param0);
        }
        if (param1 != -31413) {
            return (byte[]) ((Object[]) ((di) this).field_l[14])[7];
        }
        throw new RuntimeException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 97;
        field_e = 2;
        field_g = 0;
    }
}
