/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul {
    int field_b;
    static ip field_n;
    static String[][] field_m;
    boolean field_j;
    private Object[][] field_l;
    private Object[] field_g;
    private be field_k;
    static String field_c;
    private ng field_a;
    static String field_i;
    static String field_d;
    static String field_h;
    static boolean field_e;
    static ri field_f;

    final synchronized byte[] a(String param0, String param1, boolean param2) {
        if (!((ul) this).a((byte) -120)) {
            return null;
        }
        param0 = param0.toLowerCase();
        param1 = param1.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param0;
        int var4 = ((ul) this).field_k.field_d.a(1481485697, kd.a(var6, -79));
        if (param2) {
            ul.b(((byte[]) ((ul) this).field_g[3])[9]);
        }
        if (!this.b(var4, -120)) {
            return null;
        }
        CharSequence var7 = (CharSequence) (Object) param1;
        int var5 = ((ul) this).field_k.field_n[var4].a(1481485697, kd.a(var7, -93));
        return ((ul) this).a(var4, true, var5);
    }

    final boolean a(boolean param0, String param1) {
        if (!(((ul) this).a((byte) -110))) {
            return false;
        }
        if (param0) {
            ((ul) this).field_l = null;
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((ul) this).field_k.field_d.a(1481485697, kd.a(var4, -53));
        return ((ul) this).a(-126, var3);
    }

    final synchronized boolean a(int param0, int param1) {
        if (!(this.b(param1, 101))) {
            return false;
        }
        if (((ul) this).field_g[param1] != null) {
            return true;
        }
        this.c(-127, param1);
        if (param0 > -118) {
            return false;
        }
        if (((ul) this).field_g[param1] == null) {
            return false;
        }
        return true;
    }

    final synchronized boolean b(int param0, int param1, int param2) {
        if (!this.a(param0, 6327, param1)) {
            return false;
        }
        if (param2 != 0) {
            return false;
        }
        if (null != ((ul) this).field_l[param1]) {
            if (null != ((ul) this).field_l[param1][param0]) {
                return true;
            }
        }
        if (!(null == ((ul) this).field_g[param1])) {
            return true;
        }
        this.c(-113, param1);
        if (null == ((ul) this).field_g[param1]) {
            return false;
        }
        return true;
    }

    private final synchronized void c(int param0, int param1) {
        if (!((ul) this).field_j) {
            ((ul) this).field_g[param1] = ai.a(-137, false, ((ul) this).field_a.a(-123, param1));
        } else {
            ((ul) this).field_g[param1] = (Object) (Object) ((ul) this).field_a.a(-123, param1);
        }
        if (param0 >= -85) {
            ((ul) this).field_k = null;
        }
    }

    public static void b(byte param0) {
        field_c = null;
        field_h = null;
        if (param0 != -35) {
            ul.b((byte) -55);
        }
        field_m = null;
        field_n = null;
        field_f = null;
        field_d = null;
        field_i = null;
    }

    private final synchronized byte[] a(int param0, int param1, int param2, int[] param3) {
        Object var5 = null;
        byte[] var5_array = null;
        byte[] var7 = null;
        if (this.a(param1, param2 ^ -31366, param0)) {
          L0: {
            L1: {
              var5 = null;
              if (((ul) this).field_l[param0] == null) {
                break L1;
              } else {
                if (null == ((ul) this).field_l[param0][param1]) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            if (this.a(param0, true, param3, param1)) {
              break L0;
            } else {
              this.c(-101, param0);
              if (this.a(param0, true, param3, param1)) {
                break L0;
              } else {
                return null;
              }
            }
          }
          if (((ul) this).field_l[param0] == null) {
            throw new RuntimeException("");
          } else {
            L2: {
              if (null != ((ul) this).field_l[param0][param1]) {
                var7 = h.a(((ul) this).field_l[param0][param1], -110, false);
                var5_array = var7;
                if (var7 == null) {
                  throw new RuntimeException("");
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
            if (param2 == -25139) {
              L3: {
                if (var5_array == null) {
                  break L3;
                } else {
                  if (1 != ((ul) this).field_b) {
                    if (2 != ((ul) this).field_b) {
                      break L3;
                    } else {
                      ((ul) this).field_l[param0] = null;
                      break L3;
                    }
                  } else {
                    ((ul) this).field_l[param0][param1] = null;
                    if ((((ul) this).field_k.field_b[param0] ^ -1) != -2) {
                      break L3;
                    } else {
                      ((ul) this).field_l[param0] = null;
                      break L3;
                    }
                  }
                }
              }
              return var5_array;
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    private final synchronized boolean a(int param0, boolean param1, int[] param2, int param3) {
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
        k var26 = null;
        byte[] var27 = null;
        k var29 = null;
        k var31 = null;
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
        var22 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.b(param0, -116)) {
          if (((ul) this).field_g[param0] != null) {
            L0: {
              var5 = ((ul) this).field_k.field_s[param0];
              var50 = ((ul) this).field_k.field_i[param0];
              var42 = var50;
              var34 = var42;
              var24 = var34;
              var6 = var24;
              if (null == ((ul) this).field_l[param0]) {
                ((ul) this).field_l[param0] = new Object[((ul) this).field_k.field_b[param0]];
                break L0;
              } else {
                break L0;
              }
            }
            var7 = ((ul) this).field_l[param0];
            var8 = param1 ? 1 : 0;
            var9_int = 0;
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
                  if (null != var7[var10]) {
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
                    if (param2 == null) {
                      break L5;
                    } else {
                      L6: {
                        if (0 != param2[0]) {
                          break L6;
                        } else {
                          if (-1 != (param2[1] ^ -1)) {
                            break L6;
                          } else {
                            if (param2[2] != -1) {
                              break L6;
                            } else {
                              if (-1 == param2[3]) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                      }
                      var51 = h.a(((ul) this).field_g[param0], -42, true);
                      var26 = new k(var51);
                      var26.a(var26.field_m.length, param2, -2564, 5);
                      var52 = var51;
                      break L4;
                    }
                  }
                  var52 = h.a(((ul) this).field_g[param0], -124, false);
                  var44 = var52;
                  var36 = var44;
                  var9 = var36;
                  break L4;
                }
                L7: {
                  var53 = hb.a(var52, 0);
                  var45 = var53;
                  var37 = var45;
                  var27 = var37;
                  var23 = var27;
                  var54 = var23;
                  if (((ul) this).field_j) {
                    ((ul) this).field_g[param0] = null;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (-2 > (var5 ^ -1)) {
                    var53 = var45;
                    if (((ul) this).field_b != 2) {
                      var53 = var45;
                      var11 = var53.length;
                      var11--;
                      var12 = 255 & var23[var11];
                      var11 = var11 - 4 * var12 * var5;
                      var31 = new k(var54);
                      var56 = new int[var5];
                      var48 = var56;
                      var40 = var48;
                      var32 = var40;
                      var14 = var32;
                      var31.field_j = var11;
                      var15_int = 0;
                      L9: while (true) {
                        if (var12 <= var15_int) {
                          var57 = new byte[var5][];
                          var49 = var57;
                          var41 = var49;
                          var33 = var41;
                          var15 = var33;
                          var16 = 0;
                          L10: while (true) {
                            if (var16 >= var5) {
                              var31.field_j = var11;
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
                                          var18 = var50[var17];
                                          break L13;
                                        } else {
                                          var18 = var17;
                                          break L13;
                                        }
                                      }
                                      if (((ul) this).field_b != 0) {
                                        var7[var18] = (Object) (Object) var57[var17];
                                        var17++;
                                        continue L12;
                                      } else {
                                        var7[var18] = ai.a(-137, false, var57[var17]);
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
                                      var18 = var18 + var31.i(-1478490344);
                                      d.a(var54, var16, var57[var19], var56[var19], var18);
                                      var16 = var16 + var18;
                                      var14[var19] = var14[var19] + var18;
                                      var19++;
                                      continue L14;
                                    }
                                  }
                                }
                              }
                            } else {
                              var15[var16] = new byte[var56[var16]];
                              var56[var16] = 0;
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
                              var16 = var16 + var31.i(-1478490344);
                              var14[var17] = var14[var17] + var16;
                              var17++;
                              continue L15;
                            }
                          }
                        }
                      }
                    } else {
                      var11 = var53.length;
                      var11--;
                      var12 = 255 & var23[var11];
                      var11 = var11 - var12 * (var5 * 4);
                      var29 = new k(var54);
                      var14_int = 0;
                      var15_int = 0;
                      var29.field_j = var11;
                      var16 = 0;
                      L16: while (true) {
                        if (var16 >= var12) {
                          if (0 == var14_int) {
                            return true;
                          } else {
                            var55 = new byte[var14_int];
                            var29.field_j = var11;
                            var14_int = 0;
                            var17 = 0;
                            var18 = 0;
                            L17: while (true) {
                              if (var18 >= var12) {
                                var7[var15_int] = (Object) (Object) var55;
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
                                      var19 = var19 + var29.i(-1478490344);
                                      if (var6 != null) {
                                        var21 = var50[var20];
                                        break L19;
                                      } else {
                                        var21 = var20;
                                        break L19;
                                      }
                                    }
                                    L20: {
                                      if (var21 == param3) {
                                        d.a(var54, var17, var55, var14_int, var19);
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
                                var17 = var17 + var29.i(-1478490344);
                                if (var6 != null) {
                                  var19 = var50[var18];
                                  break L22;
                                } else {
                                  var19 = var18;
                                  break L22;
                                }
                              }
                              if (var19 == param3) {
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
                        var11 = var50[0];
                        break L23;
                      }
                    }
                    if (((ul) this).field_b != 0) {
                      var7[var11] = (Object) (Object) var54;
                      break L8;
                    } else {
                      var7[var11] = ai.a(-137, false, var53);
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
        } else {
          return false;
        }
    }

    final synchronized int b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (!((ul) this).a((byte) -115)) {
          return 0;
        } else {
          var2 = 0;
          var3 = param0;
          var4 = 0;
          L0: while (true) {
            if (((ul) this).field_g.length <= var4) {
              if (-1 == var2) {
                return 100;
              } else {
                var4 = var3 * 100 / var2;
                return var4;
              }
            } else {
              if (-1 > ((ul) this).field_k.field_s[var4]) {
                var2 += 100;
                var3 = var3 + ((ul) this).a(var4, (byte) 120);
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        }
    }

    final int a(String param0, byte param1) {
        if (!((ul) this).a((byte) -109)) {
            return -1;
        }
        param0 = param0.toLowerCase();
        CharSequence var5 = (CharSequence) (Object) param0;
        int var3 = ((ul) this).field_k.field_d.a(1481485697, kd.a(var5, -37));
        if (!(this.b(var3, -114))) {
            return -1;
        }
        int var4 = 7 % ((54 - param1) / 51);
        return var3;
    }

    final int a(int param0, String param1) {
        if (!(((ul) this).a((byte) -115))) {
            return 0;
        }
        param1 = param1.toLowerCase();
        if (param0 != 0) {
            ((ul) this).field_a = (ng) ((ul) this).field_g[27];
        }
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((ul) this).field_k.field_d.a(1481485697, kd.a(var4, param0 + -17));
        return ((ul) this).a(var3, (byte) 125);
    }

    final int c(int param0) {
        if (param0 != -1) {
            return 115;
        }
        if (!(((ul) this).a((byte) -108))) {
            return -1;
        }
        return ((ul) this).field_k.field_b.length;
    }

    final int d(int param0, int param1) {
        if (!this.b(param0, param1 ^ -16)) {
            return 0;
        }
        if (param1 != -2) {
            this.c(((int[]) ((Object[]) ((ul) this).field_g[7])[9])[0], ((int[]) ((ul) this).field_g[0])[2]);
        }
        return ((ul) this).field_k.field_b[param0];
    }

    final synchronized boolean a(byte param0) {
        if (param0 > -107) {
            return false;
        }
        if (null == ((ul) this).field_k) {
            ((ul) this).field_k = ((ul) this).field_a.a((byte) -106);
            if (((ul) this).field_k == null) {
                return false;
            }
            ((ul) this).field_l = new Object[((ul) this).field_k.field_e][];
            ((ul) this).field_g = new Object[((ul) this).field_k.field_e];
        }
        return true;
    }

    final synchronized boolean a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (((ul) this).a((byte) -109)) {
          var2 = 1;
          var3 = param0;
          L0: while (true) {
            if (var3 >= ((ul) this).field_k.field_l.length) {
              return var2 != 0;
            } else {
              var4 = ((ul) this).field_k.field_l[var3];
              if (null == ((ul) this).field_g[var4]) {
                this.c(-91, var4);
                if (null == ((ul) this).field_g[var4]) {
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

    private final synchronized boolean a(int param0, int param1, int param2) {
        if (!(((ul) this).a((byte) -116))) {
            return false;
        }
        if ((param2 ^ -1) <= -1) {
            // if_icmpgt L56
            // if_icmpge L56
            // if_icmple L56
        } else {
            if (!em.field_P) {
                return false;
            }
            throw new IllegalArgumentException(param2 + " " + param0);
        }
        if (param1 != 6327) {
            return ((boolean[]) ((ul) this).field_g[17])[2];
        }
        return true;
    }

    private final synchronized boolean b(int param0, int param1) {
        if (!(((ul) this).a((byte) -111))) {
            return false;
        }
        if (param0 <= -1) {
            // if_icmpge L47
            // if_icmpeq L47
        } else {
            if (em.field_P) {
                throw new IllegalArgumentException(Integer.toString(param0));
            }
            return false;
        }
        int var3 = -116 / ((param1 - -61) / 53);
        return true;
    }

    final boolean a(byte param0, String param1, String param2) {
        if (!(((ul) this).a((byte) -118))) {
            return false;
        }
        param2 = param2.toLowerCase();
        param1 = param1.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param2;
        int var4 = ((ul) this).field_k.field_d.a(1481485697, kd.a(var6, 121));
        if (!(this.b(var4, 10))) {
            return false;
        }
        if (param0 >= -23) {
            return true;
        }
        CharSequence var7 = (CharSequence) (Object) param1;
        int var5 = ((ul) this).field_k.field_n[var4].a(1481485697, kd.a(var7, 125));
        return ((ul) this).b(var5, var4, 0);
    }

    final boolean a(String param0, int param1) {
        if (!((ul) this).a((byte) -112)) {
            return false;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((ul) this).field_k.field_d.a(1481485697, kd.a(var4, param1 ^ -81));
        if (param1 != 2) {
            ((long[]) ((ul) this).field_g[1])[15] = 4L;
        }
        if ((var3 ^ -1) <= -1) {
            return true;
        }
        return false;
    }

    final synchronized byte[] a(byte param0, int param1) {
        if (param0 != -77) {
            ul.b((byte) -63);
        }
        if (!((ul) this).a((byte) -128)) {
            return null;
        }
        if (!(((ul) this).field_k.field_b.length != 1)) {
            return ((ul) this).a(0, true, param1);
        }
        if (!this.b(param1, -123)) {
            return null;
        }
        if (((ul) this).field_k.field_b[param1] == 1) {
            return ((ul) this).a(param1, true, 0);
        }
        throw new RuntimeException();
    }

    final synchronized int a(int param0, byte param1) {
        if (!(this.b(param0, 55))) {
            return 0;
        }
        if (null != ((ul) this).field_g[param0]) {
            return 100;
        }
        if (param1 < 96) {
            ((ul) this).field_b = ((int[]) ((ul) this).field_g[16])[7];
        }
        return ((ul) this).field_a.b(param0, -3);
    }

    final int a(String param0, int param1, int param2) {
        if (!this.b(param1, param2 + -117)) {
            return -1;
        }
        param0 = param0.toLowerCase();
        if (param2 != -1) {
            ((boolean[]) ((ul) this).field_g[0])[27] = true;
        }
        CharSequence var5 = (CharSequence) (Object) param0;
        int var4 = ((ul) this).field_k.field_n[param1].a(param2 ^ -1481485698, kd.a(var5, param2 + 126));
        if (!(this.a(var4, 6327, param1))) {
            return -1;
        }
        return var4;
    }

    final byte[] a(int param0, boolean param1, int param2) {
        if (!param1) {
            int discarded$0 = ((ul) this).b(((int[]) ((ul) this).field_g[0])[5]);
        }
        return this.a(param0, param2, -25139, (int[]) null);
    }

    ul(ng param0, boolean param1, int param2) {
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
          ((ul) this).field_k = null;
          if (0 > param2) {
            break L0;
          } else {
            if (2 >= param2) {
              L1: {
                ((ul) this).field_a = param0;
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
              ((ul) this).field_j = stackIn_6_1 != 0;
              ((ul) this).field_b = param2;
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
        field_c = "Your zombies won't wander about if you train them to focus.";
        field_i = "Your hordes will move as fast as lightning...especially if you also equip Determined.";
        field_n = new ip();
        field_d = "Detonate";
        field_h = "Starve your zombies before unleashing them on humans! They'll lunge even faster and from further away than with Hungry.";
    }
}
