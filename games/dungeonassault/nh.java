/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh {
    static String field_i;
    private boolean field_d;
    static String field_a;
    private qa field_f;
    private Object[] field_j;
    private Object[][] field_c;
    private int field_g;
    static boolean field_e;
    private tm field_h;
    static String field_b;
    static int field_k;

    final boolean a(boolean param0, String param1) {
        if (!(((nh) this).a(-14354))) {
            return false;
        }
        if (param0) {
            return true;
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((nh) this).field_h.field_a.a(to.a(123, var4), -117);
        return ((nh) this).a(param0, var3);
    }

    private final synchronized void d(int param0, int param1) {
        if (!((nh) this).field_d) {
            ((nh) this).field_j[param0] = kj.a(false, false, ((nh) this).field_f.a(param0, -7249));
        } else {
            ((nh) this).field_j[param0] = (Object) (Object) ((nh) this).field_f.a(param0, -7249);
        }
        if (param1 != -23889) {
            boolean discarded$0 = ((nh) this).a(false, -26);
        }
    }

    final synchronized boolean a(int param0) {
        if (((nh) this).field_h == null) {
            ((nh) this).field_h = ((nh) this).field_f.a(param0 + 40892);
            if (!(((nh) this).field_h != null)) {
                return false;
            }
            ((nh) this).field_j = new Object[((nh) this).field_h.field_l];
            ((nh) this).field_c = new Object[((nh) this).field_h.field_l][];
        }
        if (param0 != -14354) {
            boolean discarded$0 = ((nh) this).a(((int[]) ((nh) this).field_j[21])[0], 48, -75);
            return true;
        }
        return true;
    }

    final static void c(boolean param0) {
        if (!param0) {
            field_a = null;
        }
        cd.field_f = new rg();
        ta.field_a.b(1, (lm) (Object) cd.field_f);
    }

    final static void a(byte param0, nh param1, mb param2, int param3) {
        hh.field_b = eg.c(1) * param3 / 1000;
        ac.a((byte) -125, param1);
        kd.a(31913, param1);
        ob.a((byte) -53, param1);
        ck.e((byte) 65);
        hn.d((byte) -117);
        if (param0 >= -67) {
            return;
        }
        nl.field_d = -hh.field_b + 0;
    }

    final int b(int param0, int param1) {
        if (!this.e(-1, param0)) {
            return 0;
        }
        if (param1 != 0) {
            ((byte[]) ((Object[]) ((nh) this).field_j[3])[14])[11] = (byte) 119;
        }
        return ((nh) this).field_h.field_i[param0];
    }

    public static void a(boolean param0) {
        field_i = null;
        field_a = null;
        if (param0) {
            return;
        }
        field_b = null;
    }

    final boolean c(String param0, int param1) {
        if (!((nh) this).a(-14354)) {
            return false;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((nh) this).field_h.field_a.a(to.a(param1 ^ 122, var4), -125);
        if (param1 > var3) {
            return false;
        }
        return true;
    }

    final int b(String param0, int param1) {
        if (!((nh) this).a(param1 ^ 14353)) {
            return 0;
        }
        param0 = param0.toLowerCase();
        if (param1 != -1) {
            return ((int[]) ((nh) this).field_j[1])[0];
        }
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((nh) this).field_h.field_a.a(to.a(115, var4), -119);
        return ((nh) this).c(param1 ^ 123, var3);
    }

    private final synchronized byte[] a(int[] param0, int param1, byte param2, int param3) {
        int var5 = 0;
        Object var6 = null;
        byte[] var6_array = null;
        byte[] var8 = null;
        var5 = -116 / ((-47 - param2) / 63);
        if (this.a(param3, param1, (byte) -119)) {
          L0: {
            L1: {
              var6 = null;
              if (((nh) this).field_c[param1] == null) {
                break L1;
              } else {
                if (((nh) this).field_c[param1][param3] != null) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (!this.a(param0, param3, param1, -12028)) {
              this.d(param1, -23889);
              if (this.a(param0, param3, param1, -12028)) {
                break L0;
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          if (((nh) this).field_c[param1] == null) {
            throw new RuntimeException("");
          } else {
            L2: {
              if (null != ((nh) this).field_c[param1][param3]) {
                var8 = dn.a(((nh) this).field_c[param1][param3], false, (byte) 48);
                var6_array = var8;
                if (var8 == null) {
                  throw new RuntimeException("");
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
            L3: {
              if (var6_array == null) {
                break L3;
              } else {
                if (((nh) this).field_g == 1) {
                  ((nh) this).field_c[param1][param3] = null;
                  if ((((nh) this).field_h.field_i[param1] ^ -1) == -2) {
                    ((nh) this).field_c[param1] = null;
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  if (2 == ((nh) this).field_g) {
                    ((nh) this).field_c[param1] = null;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
            }
            return var6_array;
          }
        } else {
          return null;
        }
    }

    final boolean b(String param0, String param1, byte param2) {
        if (!((nh) this).a(param2 + -14272)) {
            return false;
        }
        param1 = param1.toLowerCase();
        if (param2 != -82) {
            Object var6 = null;
            boolean discarded$0 = ((nh) this).b((String) null, (String) null, (byte) 88);
        }
        param0 = param0.toLowerCase();
        CharSequence var7 = (CharSequence) (Object) param1;
        int var4 = ((nh) this).field_h.field_a.a(to.a(121, var7), -120);
        if (!((var4 ^ -1) <= -1)) {
            return false;
        }
        CharSequence var8 = (CharSequence) (Object) param0;
        int var5 = ((nh) this).field_h.field_n[var4].a(to.a(121, var8), -126);
        if (0 > var5) {
            return false;
        }
        return true;
    }

    final synchronized boolean a(int param0, int param1, int param2) {
        if (param1 != 2) {
            field_b = (String) ((nh) this).field_j[5];
        }
        if (!this.a(param0, param2, (byte) -122)) {
            return false;
        }
        if (null != ((nh) this).field_c[param2]) {
            if (!(((nh) this).field_c[param2][param0] == null)) {
                return true;
            }
        }
        if (null != ((nh) this).field_j[param2]) {
            return true;
        }
        this.d(param2, -23889);
        if (null != ((nh) this).field_j[param2]) {
            return true;
        }
        return false;
    }

    final synchronized boolean a(boolean param0, int param1) {
        if (!this.e(-1, param1)) {
            return false;
        }
        if (null != ((nh) this).field_j[param1]) {
            return true;
        }
        this.d(param1, -23889);
        if (param0) {
            return false;
        }
        if (null != ((nh) this).field_j[param1]) {
            return true;
        }
        return false;
    }

    final boolean a(int param0, String param1, String param2) {
        if (!((nh) this).a(param0 ^ 3479)) {
            return false;
        }
        if (param0 != -13703) {
            Object var6 = null;
            int discarded$0 = ((nh) this).a(110, (String) null, 85);
        }
        param2 = param2.toLowerCase();
        param1 = param1.toLowerCase();
        CharSequence var7 = (CharSequence) (Object) param2;
        int var4 = ((nh) this).field_h.field_a.a(to.a(115, var7), -121);
        if (!this.e(param0 + 13702, var4)) {
            return false;
        }
        CharSequence var8 = (CharSequence) (Object) param1;
        int var5 = ((nh) this).field_h.field_n[var4].a(to.a(117, var8), -117);
        return ((nh) this).a(var5, 2, var4);
    }

    final synchronized byte[] a(String param0, String param1, byte param2) {
        if (!((nh) this).a(-14354)) {
            return null;
        }
        param0 = param0.toLowerCase();
        if (param2 >= -106) {
            ((nh) this).field_j = null;
        }
        param1 = param1.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param0;
        int var4 = ((nh) this).field_h.field_a.a(to.a(116, var6), -121);
        if (!this.e(-1, var4)) {
            return null;
        }
        CharSequence var7 = (CharSequence) (Object) param1;
        int var5 = ((nh) this).field_h.field_n[var4].a(to.a(118, var7), -124);
        return ((nh) this).b(5, var4, var5);
    }

    final synchronized int b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = DungeonAssault.field_K;
        if (((nh) this).a(param0 ^ -14454)) {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (var4 >= ((nh) this).field_j.length) {
              if (var2 != 0) {
                var4 = param0 * var3 / var2;
                return var4;
              } else {
                return 100;
              }
            } else {
              if (-1 > (((nh) this).field_h.field_k[var4] ^ -1)) {
                var2 += 100;
                var3 = var3 + ((nh) this).c(-126, var4);
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

    final int a(String param0, int param1) {
        if (!((nh) this).a(-14354)) {
            return -1;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((nh) this).field_h.field_a.a(to.a(118, var4), param1 + -1119);
        if (!(this.e(param1 ^ -1001, var3))) {
            return -1;
        }
        if (param1 != 1000) {
            nh.c(true);
        }
        return var3;
    }

    final synchronized int c(int param0, int param1) {
        int var3 = -122 % ((param0 - -67) / 52);
        if (!this.e(-1, param1)) {
            return 0;
        }
        if (((nh) this).field_j[param1] != null) {
            return 100;
        }
        return ((nh) this).field_f.b(param1, 27318);
    }

    private final synchronized boolean a(int[] param0, int param1, int param2, int param3) {
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
        ec var26 = null;
        byte[] var27 = null;
        ec var29 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        ec var32 = null;
        int[] var34 = null;
        byte[] var36 = null;
        int[] var38 = null;
        byte[][] var39 = null;
        int[] var41 = null;
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
        var22 = DungeonAssault.field_K;
        if (this.e(-1, param2)) {
          if (((nh) this).field_j[param2] != null) {
            L0: {
              var5 = ((nh) this).field_h.field_k[param2];
              var48 = ((nh) this).field_h.field_m[param2];
              var41 = var48;
              var34 = var41;
              var24 = var34;
              var6 = var24;
              if (null != ((nh) this).field_c[param2]) {
                break L0;
              } else {
                ((nh) this).field_c[param2] = new Object[((nh) this).field_h.field_i[param2]];
                break L0;
              }
            }
            var7 = ((nh) this).field_c[param2];
            var8 = 1;
            if (param3 == -12028) {
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
                        var10 = var48[var9_int];
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
                if (var8 != 0) {
                  return true;
                } else {
                  L4: {
                    L5: {
                      if (param0 == null) {
                        break L5;
                      } else {
                        L6: {
                          if (0 != param0[0]) {
                            break L6;
                          } else {
                            if (param0[1] != 0) {
                              break L6;
                            } else {
                              if (0 != param0[2]) {
                                break L6;
                              } else {
                                if (param0[3] == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                        }
                        var49 = dn.a(((nh) this).field_j[param2], true, (byte) 48);
                        var26 = new ec(var49);
                        var26.a(var26.field_m.length, param0, 5, -10708);
                        var9 = var49;
                        break L4;
                      }
                    }
                    var9 = dn.a(((nh) this).field_j[param2], false, (byte) 48);
                    break L4;
                  }
                  L7: {
                    var50 = lc.a(var9, 50166);
                    var43 = var50;
                    var36 = var43;
                    var27 = var36;
                    var23 = var27;
                    var51 = var23;
                    if (!((nh) this).field_d) {
                      break L7;
                    } else {
                      ((nh) this).field_j[param2] = null;
                      break L7;
                    }
                  }
                  L8: {
                    if (var5 > 1) {
                      var50 = var43;
                      if ((((nh) this).field_g ^ -1) == -3) {
                        var50 = var43;
                        var11 = var50.length;
                        var11--;
                        var12 = var23[var11] & 255;
                        var11 = var11 - 4 * (var12 * var5);
                        var32 = new ec(var51);
                        var14 = 0;
                        var32.field_o = var11;
                        var15 = 0;
                        var16 = 0;
                        L9: while (true) {
                          if (var12 <= var16) {
                            if (-1 == (var14 ^ -1)) {
                              return true;
                            } else {
                              var54 = new byte[var14];
                              var32.field_o = var11;
                              var14 = 0;
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
                                        var19 = var19 + var32.h(-35);
                                        if (var6 == null) {
                                          var21 = var20;
                                          break L12;
                                        } else {
                                          var21 = var48[var20];
                                          break L12;
                                        }
                                      }
                                      L13: {
                                        if (param1 == var21) {
                                          cj.a(var51, var17, var54, var14, var19);
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
                              if (var5 <= var18) {
                                var16++;
                                continue L9;
                              } else {
                                L15: {
                                  var17 = var17 + var32.h(param3 ^ 11905);
                                  if (var6 == null) {
                                    var19 = var18;
                                    break L15;
                                  } else {
                                    var19 = var48[var18];
                                    break L15;
                                  }
                                }
                                if (var19 == param1) {
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
                        var11 = var50.length;
                        var11--;
                        var12 = var23[var11] & 255;
                        var11 = var11 - var5 * var12 * 4;
                        var29 = new ec(var51);
                        var52 = new int[var5];
                        var45 = var52;
                        var38 = var45;
                        var30 = var38;
                        var14_ref_int__ = var30;
                        var29.field_o = var11;
                        var15 = 0;
                        L16: while (true) {
                          if (var12 <= var15) {
                            var53 = new byte[var5][];
                            var46 = var53;
                            var39 = var46;
                            var31 = var39;
                            var15_ref_byte____ = var31;
                            var16 = 0;
                            L17: while (true) {
                              if (var5 <= var16) {
                                var29.field_o = var11;
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
                                            var18 = var48[var17];
                                            break L20;
                                          }
                                        }
                                        if (-1 != (((nh) this).field_g ^ -1)) {
                                          var7[var18] = (Object) (Object) var53[var17];
                                          var17++;
                                          continue L19;
                                        } else {
                                          var7[var18] = kj.a(false, false, var53[var17]);
                                          var17++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  } else {
                                    var18 = 0;
                                    var19 = 0;
                                    L21: while (true) {
                                      if (var5 <= var19) {
                                        var17++;
                                        continue L18;
                                      } else {
                                        var18 = var18 + var29.h(-117);
                                        cj.a(var51, var16, var53[var19], var52[var19], var18);
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
                                var16 = var16 + var29.h(-121);
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
                        if (var6 != null) {
                          var11 = var48[0];
                          break L23;
                        } else {
                          var11 = 0;
                          break L23;
                        }
                      }
                      if (0 != ((nh) this).field_g) {
                        var7[var11] = (Object) (Object) var51;
                        break L8;
                      } else {
                        var7[var11] = kj.a(false, false, var50);
                        return true;
                      }
                    }
                  }
                  return true;
                }
              }
            } else {
              return ((boolean[]) ((Object[]) ((Object[]) ((nh) this).field_j[0])[0])[7])[13];
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final byte[] b(int param0, int param1, int param2) {
        if (param0 != 5) {
            field_b = null;
        }
        return this.a((int[]) null, param1, (byte) 76, param2);
    }

    final int b(boolean param0) {
        if (!param0) {
            byte[] discarded$0 = ((nh) this).a(((int[]) ((nh) this).field_j[3])[0], 56);
        }
        if (!(((nh) this).a(-14354))) {
            return -1;
        }
        return ((nh) this).field_h.field_i.length;
    }

    private final synchronized boolean e(int param0, int param1) {
        if (!((nh) this).a(-14354)) {
            return false;
        }
        if ((param1 ^ -1) <= param0) {
            if (param1 < ((nh) this).field_h.field_i.length) {
                if (((nh) this).field_h.field_i[param1] != 0) {
                    return true;
                }
            }
        }
        if (!ro.field_u) {
            return false;
        }
        throw new IllegalArgumentException(Integer.toString(param1));
    }

    final synchronized boolean a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = DungeonAssault.field_K;
        if (((nh) this).a(-14354)) {
          var2 = 1;
          var3 = 0;
          L0: while (true) {
            if (((nh) this).field_h.field_j.length <= var3) {
              L1: {
                if (param0 == 59) {
                  break L1;
                } else {
                  byte[] discarded$1 = ((nh) this).a(((int[]) ((nh) this).field_j[5])[0], -79);
                  break L1;
                }
              }
              return var2 != 0;
            } else {
              var4 = ((nh) this).field_h.field_j[var3];
              if (null == ((nh) this).field_j[var4]) {
                this.d(var4, param0 ^ -23916);
                if (((nh) this).field_j[var4] == null) {
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

    final synchronized byte[] a(int param0, int param1) {
        if (!((nh) this).a(param0 ^ 8699)) {
            return null;
        }
        if (1 == ((nh) this).field_h.field_i.length) {
            return ((nh) this).b(param0 + 6640, 0, param1);
        }
        if (!this.e(-1, param1)) {
            return null;
        }
        if (!(-2 != (((nh) this).field_h.field_i[param1] ^ -1))) {
            return ((nh) this).b(5, param1, 0);
        }
        if (param0 != -6635) {
            ((nh) this).field_j[3] = ((nh) this).field_j[3];
        }
        throw new RuntimeException();
    }

    nh(qa param0, boolean param1, int param2) {
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
          ((nh) this).field_h = null;
          if (-1 < (param2 ^ -1)) {
            break L0;
          } else {
            if (2 >= param2) {
              L1: {
                ((nh) this).field_f = param0;
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
              ((nh) this).field_d = stackIn_6_1 != 0;
              ((nh) this).field_g = param2;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("");
    }

    private final synchronized boolean a(int param0, int param1, byte param2) {
        if (((nh) this).a(-14354)) {
          L0: {
            if (param1 > -1) {
              break L0;
            } else {
              if (-1 > param0) {
                break L0;
              } else {
                if (((nh) this).field_h.field_i.length <= param1) {
                  break L0;
                } else {
                  if (((nh) this).field_h.field_i[param1] > param0) {
                    if (param2 < -100) {
                      return true;
                    } else {
                      int discarded$2 = ((nh) this).a((String) ((nh) this).field_j[1], -34);
                      return true;
                    }
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
          if (ro.field_u) {
            throw new IllegalArgumentException(param1 + " " + param0);
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final int a(int param0, String param1, int param2) {
        if (param0 != 0) {
            return 42;
        }
        if (!this.e(-1, param2)) {
            return -1;
        }
        param1 = param1.toLowerCase();
        CharSequence var5 = (CharSequence) (Object) param1;
        int var4 = ((nh) this).field_h.field_n[param2].a(to.a(121, var5), -125);
        if (!this.a(var4, param2, (byte) -109)) {
            return -1;
        }
        return var4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "<%0> active";
        field_a = "There is nothing in this room to trouble a party of raiders.";
        field_b = "Raider was detected by guardian, which alerted the monsters of the dungeon.";
    }
}
