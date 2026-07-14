/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db {
    private qg field_b;
    static int field_i;
    private int field_d;
    private Object[][] field_e;
    private Object[] field_h;
    private boolean field_c;
    static String field_f;
    private lk field_g;
    static dl[] field_j;
    static wj[] field_a;

    private final synchronized boolean a(byte param0, int param1) {
        if (!(((db) this).a((byte) 102))) {
            return false;
        }
        if (param1 >= 0) {
            // if_icmple L45
            // ifeq L45
        } else {
            if (!aq.field_r) {
                return false;
            }
            throw new IllegalArgumentException(Integer.toString(param1));
        }
        if (param0 != 4) {
            ((long[]) ((db) this).field_h[6])[10] = 74L;
            return true;
        }
        return true;
    }

    final synchronized boolean a(int param0, byte param1, int param2) {
        if (!(this.a(param2, 0, param0))) {
            return false;
        }
        if (((db) this).field_e[param0] != null) {
            if (((db) this).field_e[param0][param2] != null) {
                return true;
            }
        }
        if (null != ((db) this).field_h[param0]) {
            return true;
        }
        if (param1 <= 126) {
            field_f = null;
        }
        this.c(param0, 24634);
        if (((db) this).field_h[param0] != null) {
            return true;
        }
        return false;
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        if (((db) this).a((byte) 102)) {
          if (param1 == 0) {
            L0: {
              if ((param2 ^ -1) > -1) {
                break L0;
              } else {
                if (param0 < 0) {
                  break L0;
                } else {
                  if (((db) this).field_b.field_l.length <= param2) {
                    break L0;
                  } else {
                    if (param0 < ((db) this).field_b.field_l[param2]) {
                      return true;
                    } else {
                      break L0;
                    }
                  }
                }
              }
            }
            if (!aq.field_r) {
              return false;
            } else {
              throw new IllegalArgumentException(param2 + " " + param0);
            }
          } else {
            return ((boolean[]) ((db) this).field_h[2])[0];
          }
        } else {
          return false;
        }
    }

    final boolean c(String param0, int param1) {
        if (!((db) this).a((byte) 102)) {
            return false;
        }
        param0 = param0.toLowerCase();
        if (param1 >= -42) {
            return ((boolean[]) ((db) this).field_h[8])[2];
        }
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((db) this).field_b.field_t.a(0, v.a(-2057727803, var4));
        if ((var3 ^ -1) > -1) {
            return false;
        }
        return true;
    }

    final byte[] a(boolean param0, int[] param1, String param2, String param3) {
        if (!((db) this).a((byte) 102)) {
            return null;
        }
        param3 = param3.toLowerCase();
        param2 = param2.toLowerCase();
        if (param0) {
            boolean discarded$0 = this.a((byte) -107, ((int[]) ((db) this).field_h[3])[1]);
        }
        CharSequence var7 = (CharSequence) (Object) param3;
        int var5 = ((db) this).field_b.field_t.a(0, v.a(-2057727803, var7));
        if (!this.a((byte) 4, var5)) {
            return null;
        }
        CharSequence var8 = (CharSequence) (Object) param2;
        int var6 = ((db) this).field_b.field_i[var5].a(0, v.a(-2057727803, var8));
        return this.a(var5, !param0 ? true : false, param1, var6);
    }

    final synchronized byte[] d(int param0, int param1) {
        if (!((db) this).a((byte) 102)) {
            return null;
        }
        if (!(((db) this).field_b.field_l.length != 1)) {
            return ((db) this).b(param1, 0, 0);
        }
        if (!this.a((byte) 4, param1)) {
            return null;
        }
        if (((db) this).field_b.field_l[param1] == 1) {
            return ((db) this).b(0, 0, param1);
        }
        if (param0 >= -47) {
            return (byte[]) ((db) this).field_h[9];
        }
        throw new RuntimeException();
    }

    final synchronized int b(int param0, int param1) {
        if (!(this.a((byte) 4, param1))) {
            return 0;
        }
        if (null != ((db) this).field_h[param1]) {
            return 100;
        }
        if (param0 != 25030) {
            field_j = null;
        }
        return ((db) this).field_g.a(param1, 486289953);
    }

    final byte[] b(int param0, int param1, int param2) {
        if (param1 != 0) {
            return (byte[]) ((db) this).field_h[19];
        }
        return this.a(param2, true, (int[]) null, param0);
    }

    final boolean a(int param0, String param1) {
        if (!(((db) this).a((byte) 102))) {
            return false;
        }
        if (param0 != -20402) {
            db.b((byte) -19);
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((db) this).field_b.field_t.a(0, v.a(param0 + -2057707401, var4));
        return ((db) this).e(var3, 83);
    }

    public static void b(byte param0) {
        field_a = null;
        if (param0 != 127) {
            db.b((byte) -99);
        }
        field_j = null;
        field_f = null;
    }

    final static String a(byte param0, byte[] param1) {
        if (param0 < 87) {
            field_a = null;
        }
        return uh.a(param1, 192, 0, param1.length);
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
        byte[] var25 = null;
        ng var26 = null;
        byte[] var27 = null;
        ng var29 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        ng var32 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var38 = null;
        byte[][] var39 = null;
        int[] var41 = null;
        byte[] var42 = null;
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
        L0: {
          var22 = CrazyCrystals.field_B;
          if (param3 == 30511) {
            break L0;
          } else {
            ((boolean[]) ((db) this).field_h[32])[0] = true;
            break L0;
          }
        }
        if (!this.a((byte) 4, param0)) {
          return false;
        } else {
          if (null != ((db) this).field_h[param0]) {
            L1: {
              var5 = ((db) this).field_b.field_f[param0];
              var48 = ((db) this).field_b.field_h[param0];
              var41 = var48;
              var34 = var41;
              var24 = var34;
              var6 = var24;
              if (null != ((db) this).field_e[param0]) {
                break L1;
              } else {
                ((db) this).field_e[param0] = new Object[((db) this).field_b.field_l[param0]];
                break L1;
              }
            }
            var7 = ((db) this).field_e[param0];
            var8 = 1;
            var9_int = 0;
            L2: while (true) {
              L3: {
                if (var5 <= var9_int) {
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
              if (var8 != 0) {
                return true;
              } else {
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
                            if (param1[2] != 0) {
                              break L7;
                            } else {
                              if (-1 != param1[3]) {
                                break L7;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                      }
                      var49 = l.a((byte) 110, true, ((db) this).field_h[param0]);
                      var42 = var49;
                      var35 = var42;
                      var25 = var35;
                      var9 = var25;
                      var26 = new ng(var49);
                      var26.a(8, 5, var26.field_h.length, param1);
                      break L5;
                    }
                  }
                  var9 = l.a((byte) 110, false, ((db) this).field_h[param0]);
                  break L5;
                }
                L8: {
                  var50 = b.a(var9, -1);
                  var43 = var50;
                  var36 = var43;
                  var27 = var36;
                  var23 = var27;
                  var51 = var23;
                  if (((db) this).field_c) {
                    var50 = var43;
                    ((db) this).field_h[param0] = null;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  var50 = var43;
                  if (-2 <= (var5 ^ -1)) {
                    L10: {
                      if (var6 != null) {
                        var11 = var48[0];
                        break L10;
                      } else {
                        var11 = 0;
                        break L10;
                      }
                    }
                    if (((db) this).field_d == 0) {
                      var7[var11] = fj.a(false, true, var51);
                      break L9;
                    } else {
                      var7[var11] = (Object) (Object) var50;
                      break L9;
                    }
                  } else {
                    if (2 == ((db) this).field_d) {
                      var50 = var43;
                      var11 = var50.length;
                      var11--;
                      var12 = 255 & var23[var11];
                      var11 = var11 - 4 * var5 * var12;
                      var32 = new ng(var51);
                      var14 = 0;
                      var15 = 0;
                      var32.field_f = var11;
                      var16 = 0;
                      L11: while (true) {
                        if (var16 >= var12) {
                          if (-1 != (var14 ^ -1)) {
                            var54 = new byte[var14];
                            var32.field_f = var11;
                            var14 = 0;
                            var17 = 0;
                            var18 = 0;
                            L12: while (true) {
                              if (var18 >= var12) {
                                var7[var15] = (Object) (Object) var54;
                                return true;
                              } else {
                                var19 = 0;
                                var20 = 0;
                                L13: while (true) {
                                  if (var20 >= var5) {
                                    var18++;
                                    continue L12;
                                  } else {
                                    L14: {
                                      var19 = var19 + var32.b((byte) 127);
                                      if (var6 == null) {
                                        var21 = var20;
                                        break L14;
                                      } else {
                                        var21 = var48[var20];
                                        break L14;
                                      }
                                    }
                                    L15: {
                                      if (var21 == param2) {
                                        eg.a(var51, var17, var54, var14, var19);
                                        var14 = var14 + var19;
                                        break L15;
                                      } else {
                                        break L15;
                                      }
                                    }
                                    var17 = var17 + var19;
                                    var20++;
                                    continue L13;
                                  }
                                }
                              }
                            }
                          } else {
                            return true;
                          }
                        } else {
                          var17 = 0;
                          var18 = 0;
                          L16: while (true) {
                            if (var18 >= var5) {
                              var16++;
                              continue L11;
                            } else {
                              L17: {
                                var17 = var17 + var32.b((byte) -32);
                                if (var6 != null) {
                                  var19 = var48[var18];
                                  break L17;
                                } else {
                                  var19 = var18;
                                  break L17;
                                }
                              }
                              if (param2 == var19) {
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
                      var11 = var50.length;
                      var11--;
                      var12 = var23[var11] & 255;
                      var11 = var11 - var12 * (var5 * 4);
                      var29 = new ng(var51);
                      var52 = new int[var5];
                      var45 = var52;
                      var38 = var45;
                      var30 = var38;
                      var14_ref_int__ = var30;
                      var29.field_f = var11;
                      var15 = 0;
                      L18: while (true) {
                        if (var12 <= var15) {
                          var53 = new byte[var5][];
                          var46 = var53;
                          var39 = var46;
                          var31 = var39;
                          var15_ref_byte____ = var31;
                          var16 = 0;
                          L19: while (true) {
                            if (var16 >= var5) {
                              var29.field_f = var11;
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
                                          var18 = var48[var17];
                                          break L22;
                                        }
                                      }
                                      if (0 != ((db) this).field_d) {
                                        var7[var18] = (Object) (Object) var53[var17];
                                        var17++;
                                        continue L21;
                                      } else {
                                        var7[var18] = fj.a(false, true, var53[var17]);
                                        var17++;
                                        continue L21;
                                      }
                                    }
                                  }
                                } else {
                                  var18 = 0;
                                  var19 = 0;
                                  L23: while (true) {
                                    if (var5 <= var19) {
                                      var17++;
                                      continue L20;
                                    } else {
                                      var18 = var18 + var29.b((byte) 127);
                                      eg.a(var51, var16, var53[var19], var52[var19], var18);
                                      var16 = var16 + var18;
                                      var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                                      var19++;
                                      continue L23;
                                    }
                                  }
                                }
                              }
                            } else {
                              var15_ref_byte____[var16] = new byte[var52[var16]];
                              var52[var16] = 0;
                              var16++;
                              continue L19;
                            }
                          }
                        } else {
                          var16 = 0;
                          var17 = 0;
                          L24: while (true) {
                            if (var5 <= var17) {
                              var15++;
                              continue L18;
                            } else {
                              var16 = var16 + var29.b((byte) -65);
                              var14_ref_int__[var17] = var14_ref_int__[var17] + var16;
                              var17++;
                              continue L24;
                            }
                          }
                        }
                      }
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

    private final synchronized void c(int param0, int param1) {
        if (((db) this).field_c) {
            ((db) this).field_h[param0] = (Object) (Object) ((db) this).field_g.a(param0, false);
        } else {
            ((db) this).field_h[param0] = fj.a(false, true, ((db) this).field_g.a(param0, false));
        }
        if (param1 != 24634) {
            field_a = (wj[]) ((db) this).field_h[2];
        }
    }

    final int b(String param0, int param1) {
        if (!((db) this).a((byte) 102)) {
            return 0;
        }
        param0 = param0.toLowerCase();
        if (param1 >= -27) {
            int discarded$0 = ((db) this).a((String) ((db) this).field_h[4], 25);
        }
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((db) this).field_b.field_t.a(0, v.a(-2057727803, var4));
        return ((db) this).b(25030, var3);
    }

    final int a(String param0, int param1) {
        if (!((db) this).a((byte) 102)) {
            return -1;
        }
        if (param1 != -1) {
            ((db) this).field_d = ((int[]) ((db) this).field_h[7])[20];
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((db) this).field_b.field_t.a(0, v.a(-2057727803, var4));
        if (!this.a((byte) 4, var3)) {
            return -1;
        }
        return var3;
    }

    final synchronized boolean a(byte param0) {
        if (param0 != 102) {
            return false;
        }
        if (null != ((db) this).field_b) {
            return true;
        }
        ((db) this).field_b = ((db) this).field_g.a(630779105);
        if (null == ((db) this).field_b) {
            return false;
        }
        ((db) this).field_h = new Object[((db) this).field_b.field_a];
        ((db) this).field_e = new Object[((db) this).field_b.field_a][];
        return true;
    }

    final synchronized byte[] a(int param0, String param1, String param2) {
        if (!((db) this).a((byte) 102)) {
            return null;
        }
        param2 = param2.toLowerCase();
        if (param0 != 7693) {
            ((db) this).field_d = -38;
        }
        param1 = param1.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param2;
        int var4 = ((db) this).field_b.field_t.a(0, v.a(-2057727803, var6));
        if (!this.a((byte) 4, var4)) {
            return null;
        }
        CharSequence var7 = (CharSequence) (Object) param1;
        int var5 = ((db) this).field_b.field_i[var4].a(0, v.a(-2057727803, var7));
        return ((db) this).b(var5, 0, var4);
    }

    final synchronized boolean a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = CrazyCrystals.field_B;
        if (((db) this).a((byte) 102)) {
          var2 = 1;
          var3 = 0;
          L0: while (true) {
            if (var3 >= ((db) this).field_b.field_e.length) {
              if (!param0) {
                return var2 != 0;
              } else {
                return true;
              }
            } else {
              var4 = ((db) this).field_b.field_e[var3];
              if (null == ((db) this).field_h[var4]) {
                this.c(var4, 24634);
                if (((db) this).field_h[var4] == null) {
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

    final synchronized int b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = CrazyCrystals.field_B;
        if (((db) this).a((byte) 102)) {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (var4 >= ((db) this).field_h.length) {
              if (var2 != 0) {
                L1: {
                  if (param0 == 3492) {
                    break L1;
                  } else {
                    ((byte[]) ((db) this).field_h[4])[1] = (byte) -15;
                    break L1;
                  }
                }
                var4 = var3 * 100 / var2;
                return var4;
              } else {
                return 100;
              }
            } else {
              if ((((db) this).field_b.field_f[var4] ^ -1) < -1) {
                var3 = var3 + ((db) this).b(25030, var4);
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

    final int a(int param0, int param1) {
        if (!(this.a((byte) 4, param0))) {
            return 0;
        }
        if (param1 != 0) {
            return 32;
        }
        return ((db) this).field_b.field_l[param0];
    }

    final synchronized boolean e(int param0, int param1) {
        if (param1 <= 46) {
            int discarded$0 = ((db) this).b(102, 116);
        }
        if (!this.a((byte) 4, param0)) {
            return false;
        }
        if (((db) this).field_h[param0] != null) {
            return true;
        }
        this.c(param0, 24634);
        if (((db) this).field_h[param0] == null) {
            return false;
        }
        return true;
    }

    final int a(int param0) {
        if (param0 < 17) {
            Object var3 = null;
            int discarded$0 = ((db) this).a((String) null, 104);
        }
        if (!((db) this).a((byte) 102)) {
            return -1;
        }
        return ((db) this).field_b.field_l.length;
    }

    final int a(int param0, String param1, int param2) {
        if (!(this.a((byte) 4, param2))) {
            return -1;
        }
        if (param0 != -2862) {
            ((db) this).field_e = null;
        }
        param1 = param1.toLowerCase();
        CharSequence var5 = (CharSequence) (Object) param1;
        int var4 = ((db) this).field_b.field_i[param2].a(0, v.a(-2057727803, var5));
        if (!this.a(var4, 0, param2)) {
            return -1;
        }
        return var4;
    }

    private final synchronized byte[] a(int param0, boolean param1, int[] param2, int param3) {
        Object var5 = null;
        byte[] var5_array = null;
        byte[] var7 = null;
        if (this.a(param3, 0, param0)) {
          L0: {
            L1: {
              var5 = null;
              if (((db) this).field_e[param0] == null) {
                break L1;
              } else {
                if (((db) this).field_e[param0][param3] == null) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            if (this.a(param0, param2, param3, 30511)) {
              break L0;
            } else {
              this.c(param0, 24634);
              if (this.a(param0, param2, param3, 30511)) {
                break L0;
              } else {
                return null;
              }
            }
          }
          if (((db) this).field_e[param0] != null) {
            if (param1) {
              L2: {
                if (((db) this).field_e[param0][param3] != null) {
                  var7 = l.a((byte) 110, false, ((db) this).field_e[param0][param3]);
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
              L3: {
                if (var5_array == null) {
                  break L3;
                } else {
                  if (1 == ((db) this).field_d) {
                    ((db) this).field_e[param0][param3] = null;
                    if (((db) this).field_b.field_l[param0] != 1) {
                      break L3;
                    } else {
                      ((db) this).field_e[param0] = null;
                      break L3;
                    }
                  } else {
                    if (-3 == (((db) this).field_d ^ -1)) {
                      ((db) this).field_e[param0] = null;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              return var5_array;
            } else {
              return null;
            }
          } else {
            throw new RuntimeException("");
          }
        } else {
          return null;
        }
    }

    db(lk param0, boolean param1, int param2) {
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
          ((db) this).field_b = null;
          if (0 > param2) {
            break L0;
          } else {
            if (2 >= param2) {
              L1: {
                ((db) this).field_g = param0;
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
              ((db) this).field_c = stackIn_6_1 != 0;
              ((db) this).field_d = param2;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("");
    }

    final boolean a(byte param0, String param1, String param2) {
        if (!(((db) this).a((byte) 102))) {
            return false;
        }
        param1 = param1.toLowerCase();
        param2 = param2.toLowerCase();
        if (param0 != 43) {
            return true;
        }
        CharSequence var6 = (CharSequence) (Object) param1;
        int var4 = ((db) this).field_b.field_t.a(param0 ^ 43, v.a(-2057727803, var6));
        if (!(this.a((byte) 4, var4))) {
            return false;
        }
        CharSequence var7 = (CharSequence) (Object) param2;
        int var5 = ((db) this).field_b.field_i[var4].a(0, v.a(param0 + -2057727846, var7));
        return ((db) this).a(var4, (byte) 127, var5);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "That name is not available";
    }
}
