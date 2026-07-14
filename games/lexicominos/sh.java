/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh {
    static nj[] field_d;
    private e field_g;
    private hf field_h;
    static int field_a;
    private boolean field_i;
    static int field_e;
    static int field_f;
    private int field_c;
    private Object[][] field_b;
    private Object[] field_j;

    final int c(String param0, byte param1) {
        if (!(((sh) this).c(81))) {
            return -1;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((sh) this).field_g.field_b.a(-20075, na.a(1048576, var4));
        if (param1 != -89) {
            return -87;
        }
        if (!(this.b(var3, 127))) {
            return -1;
        }
        return var3;
    }

    final byte[] a(int param0, int param1, int param2) {
        if (param1 != -27493) {
            field_e = -77;
        }
        return this.a((int[]) null, (byte) 101, param0, param2);
    }

    final synchronized boolean c(int param0) {
        if (!(null != ((sh) this).field_g)) {
            ((sh) this).field_g = ((sh) this).field_h.a(false);
            if (!(((sh) this).field_g != null)) {
                return false;
            }
            ((sh) this).field_j = new Object[((sh) this).field_g.field_d];
            ((sh) this).field_b = new Object[((sh) this).field_g.field_d][];
        }
        int var2 = -54 % ((21 - param0) / 52);
        return true;
    }

    final int a(String param0, int param1, int param2) {
        if (!this.b(param2, 127)) {
            return -1;
        }
        param0 = param0.toLowerCase();
        if (param1 != -27964) {
            ((sh) this).field_c = 26;
        }
        CharSequence var5 = (CharSequence) (Object) param0;
        int var4 = ((sh) this).field_g.field_c[param2].a(-20075, na.a(param1 ^ -1076540, var5));
        if (!this.a(true, param2, var4)) {
            return -1;
        }
        return var4;
    }

    final synchronized boolean a(int param0, byte param1, int param2) {
        if (!(this.a(true, param0, param2))) {
            return false;
        }
        if (null != ((sh) this).field_b[param0]) {
            if (null != ((sh) this).field_b[param0][param2]) {
                return true;
            }
        }
        if (!(null == ((sh) this).field_j[param0])) {
            return true;
        }
        this.a(param0, true);
        if (null != ((sh) this).field_j[param0]) {
            return true;
        }
        if (param1 != 78) {
            boolean discarded$0 = sh.d((String) ((sh) this).field_j[7], (byte) -115);
            return false;
        }
        return false;
    }

    final int b(int param0) {
        if (!(((sh) this).c(-54))) {
            return -1;
        }
        int var2 = 30 % ((-72 - param0) / 54);
        return ((sh) this).field_g.field_a.length;
    }

    final int b(String param0, byte param1) {
        if (param1 <= 109) {
            ((sh) this).field_i = false;
        }
        if (!((sh) this).c(-41)) {
            return 0;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((sh) this).field_g.field_b.a(-20075, na.a(1048576, var4));
        return ((sh) this).b((byte) -113, var3);
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != 1) {
            field_d = null;
        }
    }

    private final synchronized byte[] a(int[] param0, byte param1, int param2, int param3) {
        Object var5 = null;
        byte[] var5_array = null;
        Object var7 = null;
        byte[] var8 = null;
        L0: {
          if (param1 == 101) {
            break L0;
          } else {
            var7 = null;
            boolean discarded$1 = this.a(69, ((int[]) ((sh) this).field_j[2])[7], (int[]) null, 35);
            break L0;
          }
        }
        if (this.a(true, param2, param3)) {
          L1: {
            L2: {
              var5 = null;
              if (null == ((sh) this).field_b[param2]) {
                break L2;
              } else {
                if (null != ((sh) this).field_b[param2][param3]) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            if (!this.a(param2, 80, param0, param3)) {
              this.a(param2, true);
              if (this.a(param2, 124, param0, param3)) {
                break L1;
              } else {
                return null;
              }
            } else {
              break L1;
            }
          }
          if (null == ((sh) this).field_b[param2]) {
            throw new RuntimeException("");
          } else {
            L3: {
              if (((sh) this).field_b[param2][param3] != null) {
                var8 = nl.a(((sh) this).field_b[param2][param3], (byte) -74, false);
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
                if (1 != ((sh) this).field_c) {
                  if (-3 != ((sh) this).field_c) {
                    break L4;
                  } else {
                    ((sh) this).field_b[param2] = null;
                    break L4;
                  }
                } else {
                  ((sh) this).field_b[param2][param3] = null;
                  if (-2 != ((sh) this).field_g.field_a[param2]) {
                    break L4;
                  } else {
                    ((sh) this).field_b[param2] = null;
                    break L4;
                  }
                }
              } else {
                break L4;
              }
            }
            return var5_array;
          }
        } else {
          return null;
        }
    }

    final synchronized boolean c(int param0, int param1) {
        if (!(this.b(param1, 126))) {
            return false;
        }
        if (!(null == ((sh) this).field_j[param1])) {
            return true;
        }
        this.a(param1, true);
        if (!(null == ((sh) this).field_j[param1])) {
            return true;
        }
        if (param0 != 5) {
            return ((boolean[]) ((sh) this).field_j[4])[1];
        }
        return false;
    }

    private final synchronized void a(int param0, boolean param1) {
        if (((sh) this).field_i) {
            ((sh) this).field_j[param0] = (Object) (Object) ((sh) this).field_h.a(param0, param1);
        } else {
            ((sh) this).field_j[param0] = ri.a(136, ((sh) this).field_h.a(param0, param1), false);
        }
        if (!param1) {
            field_f = ((int[]) ((Object[]) ((sh) this).field_j[13])[1])[8];
        }
    }

    final boolean a(String param0, int param1) {
        if (!(((sh) this).c(param1 ^ 10842))) {
            return false;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((sh) this).field_g.field_b.a(-20075, na.a(param1 ^ 1059338, var4));
        if (param1 != 10762) {
            return true;
        }
        return ((sh) this).c(5, var3);
    }

    final synchronized int b(byte param0, int param1) {
        if (!this.b(param1, 126)) {
            return 0;
        }
        if (param0 > -79) {
            return ((int[]) ((sh) this).field_j[0])[9];
        }
        if (null != ((sh) this).field_j[param1]) {
            return 100;
        }
        return ((sh) this).field_h.a(param1, 1215);
    }

    final synchronized boolean a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Lexicominos.field_L ? 1 : 0;
        if (!((sh) this).c(121)) {
          return false;
        } else {
          var2 = 1;
          var3 = 39 % ((-47 - param0) / 62);
          var4 = 0;
          L0: while (true) {
            if (var4 >= ((sh) this).field_g.field_f.length) {
              return var2 != 0;
            } else {
              var5 = ((sh) this).field_g.field_f[var4];
              if (((sh) this).field_j[var5] == null) {
                this.a(var5, true);
                if (null == ((sh) this).field_j[var5]) {
                  var2 = 0;
                  var4++;
                  continue L0;
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                continue L0;
              }
            }
          }
        }
    }

    final synchronized byte[] a(byte param0, String param1, String param2) {
        if (!((sh) this).c(param0 + -250)) {
            return null;
        }
        param2 = param2.toLowerCase();
        if (param0 != 127) {
            ((long[]) ((sh) this).field_j[9])[2] = ((long[]) ((sh) this).field_j[0])[1];
        }
        param1 = param1.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param2;
        int var4 = ((sh) this).field_g.field_b.a(-20075, na.a(param0 ^ 1048703, var6));
        if (!this.b(var4, 127)) {
            return null;
        }
        CharSequence var7 = (CharSequence) (Object) param1;
        int var5 = ((sh) this).field_g.field_c[var4].a(-20075, na.a(param0 + 1048449, var7));
        return ((sh) this).a(var4, -27493, var5);
    }

    final synchronized byte[] a(int param0, int param1) {
        if (!((sh) this).c(125)) {
            return null;
        }
        if (-2 == (((sh) this).field_g.field_a.length ^ -1)) {
            return ((sh) this).a(0, -27493, param0);
        }
        if (!this.b(param0, 127)) {
            return null;
        }
        if (!((((sh) this).field_g.field_a[param0] ^ -1) != -2)) {
            return ((sh) this).a(param0, -27493, 0);
        }
        int var3 = 81 / ((param1 - -44) / 43);
        throw new RuntimeException();
    }

    final synchronized int a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Lexicominos.field_L ? 1 : 0;
        if (!((sh) this).c(-98)) {
          return 0;
        } else {
          L0: {
            var2 = 0;
            if (!param0) {
              break L0;
            } else {
              ((sh) this).field_j[1] = null;
              break L0;
            }
          }
          var3 = 0;
          var4 = 0;
          L1: while (true) {
            if (((sh) this).field_j.length <= var4) {
              if (var2 == 0) {
                return 100;
              } else {
                var4 = 100 * var3 / var2;
                return var4;
              }
            } else {
              if (-1 > (((sh) this).field_g.field_m[var4] ^ -1)) {
                var3 = var3 + ((sh) this).b((byte) -98, var4);
                var2 += 100;
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

    final boolean a(String param0, String param1, int param2) {
        if (!(((sh) this).c(-118))) {
            return false;
        }
        param1 = param1.toLowerCase();
        if (param2 != -1) {
            field_a = ((int[]) ((Object[]) ((sh) this).field_j[2])[2])[0];
        }
        param0 = param0.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param1;
        int var4 = ((sh) this).field_g.field_b.a(-20075, na.a(param2 ^ -1048577, var6));
        if (!(this.b(var4, 126))) {
            return false;
        }
        CharSequence var7 = (CharSequence) (Object) param0;
        int var5 = ((sh) this).field_g.field_c[var4].a(-20075, na.a(1048576, var7));
        return ((sh) this).a(var4, (byte) 78, var5);
    }

    final boolean a(String param0, byte param1) {
        if (param1 >= -113) {
            boolean discarded$0 = ((sh) this).c(71, ((int[]) ((sh) this).field_j[23])[0]);
        }
        if (!(((sh) this).c(85))) {
            return false;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((sh) this).field_g.field_b.a(-20075, na.a(1048576, var4));
        if ((var3 ^ -1) > -1) {
            return false;
        }
        return true;
    }

    private final synchronized boolean b(int param0, int param1) {
        if (!(((sh) this).c(101))) {
            return false;
        }
        if (-1 >= (param0 ^ -1)) {
            // if_icmple L48
            // ifeq L48
        } else {
            if (oc.field_b) {
                throw new IllegalArgumentException(Integer.toString(param0));
            }
            return false;
        }
        if (param1 < 125) {
            return false;
        }
        return true;
    }

    private final synchronized boolean a(boolean param0, int param1, int param2) {
        if (!(((sh) this).c(-94))) {
            return false;
        }
        if (0 <= param1) {
            // if_icmpgt L52
            // if_icmple L52
            // if_icmple L52
        } else {
            if (!oc.field_b) {
                return false;
            }
            throw new IllegalArgumentException(param1 + " " + param2);
        }
        if (!param0) {
            return false;
        }
        return true;
    }

    private final synchronized boolean a(int param0, int param1, int[] param2, int param3) {
        int var5 = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        byte[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        int[] var15_ref_int__ = null;
        int var16 = 0;
        byte[][] var16_ref_byte____ = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        byte[] var24 = null;
        int[] var25 = null;
        byte[] var26 = null;
        wf var27 = null;
        byte[] var28 = null;
        wf var30 = null;
        int[] var31 = null;
        byte[][] var32 = null;
        wf var33 = null;
        int[] var35 = null;
        byte[] var36 = null;
        byte[] var37 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        int[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        int[] var46 = null;
        byte[][] var47 = null;
        int[] var49 = null;
        byte[] var50 = null;
        byte[] var51 = null;
        byte[] var52 = null;
        int[] var53 = null;
        byte[][] var54 = null;
        byte[] var55 = null;
        var23 = Lexicominos.field_L ? 1 : 0;
        if (!this.b(param0, 126)) {
          return false;
        } else {
          if (null != ((sh) this).field_j[param0]) {
            L0: {
              var5 = ((sh) this).field_g.field_m[param0];
              var49 = ((sh) this).field_g.field_n[param0];
              var42 = var49;
              var35 = var42;
              var25 = var35;
              var6 = var25;
              if (((sh) this).field_b[param0] != null) {
                break L0;
              } else {
                ((sh) this).field_b[param0] = new Object[((sh) this).field_g.field_a[param0]];
                break L0;
              }
            }
            var7 = ((sh) this).field_b[param0];
            var8 = -4 % ((param1 - 17) / 39);
            var9 = 1;
            var10_int = 0;
            L1: while (true) {
              L2: {
                if (var5 <= var10_int) {
                  break L2;
                } else {
                  L3: {
                    if (var6 == null) {
                      var11 = var10_int;
                      break L3;
                    } else {
                      var11 = var49[var10_int];
                      break L3;
                    }
                  }
                  if (var7[var11] != null) {
                    var10_int++;
                    continue L1;
                  } else {
                    var9 = 0;
                    break L2;
                  }
                }
              }
              if (var9 != 0) {
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
                          if (param2[1] != 0) {
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
                      var50 = nl.a(((sh) this).field_j[param0], (byte) -74, true);
                      var43 = var50;
                      var36 = var43;
                      var26 = var36;
                      var10 = var26;
                      var27 = new wf(var50);
                      var27.a(4, var27.field_j.length, 5, param2);
                      break L4;
                    }
                  }
                  var10 = nl.a(((sh) this).field_j[param0], (byte) -74, false);
                  break L4;
                }
                L7: {
                  var51 = qk.a(65, var10);
                  var44 = var51;
                  var37 = var44;
                  var28 = var37;
                  var24 = var28;
                  var52 = var24;
                  if (((sh) this).field_i) {
                    ((sh) this).field_j[param0] = null;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (1 < var5) {
                    var51 = var44;
                    if (((sh) this).field_c == 2) {
                      var51 = var44;
                      var12 = var51.length;
                      var12--;
                      var13 = var24[var12] & 255;
                      var12 = var12 - var5 * var13 * 4;
                      var33 = new wf(var52);
                      var15 = 0;
                      var16 = 0;
                      var33.field_h = var12;
                      var17 = 0;
                      L9: while (true) {
                        if (var13 <= var17) {
                          if (var15 == 0) {
                            return true;
                          } else {
                            var55 = new byte[var15];
                            var15 = 0;
                            var33.field_h = var12;
                            var18 = 0;
                            var19 = 0;
                            L10: while (true) {
                              if (var19 >= var13) {
                                var7[var16] = (Object) (Object) var55;
                                break L8;
                              } else {
                                var20 = 0;
                                var21 = 0;
                                L11: while (true) {
                                  if (var21 >= var5) {
                                    var19++;
                                    continue L10;
                                  } else {
                                    L12: {
                                      var20 = var20 + var33.d((byte) 19);
                                      if (var6 != null) {
                                        var22 = var49[var21];
                                        break L12;
                                      } else {
                                        var22 = var21;
                                        break L12;
                                      }
                                    }
                                    L13: {
                                      if (param3 != var22) {
                                        break L13;
                                      } else {
                                        o.a(var52, var18, var55, var15, var20);
                                        var15 = var15 + var20;
                                        break L13;
                                      }
                                    }
                                    var18 = var18 + var20;
                                    var21++;
                                    continue L11;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var18 = 0;
                          var19 = 0;
                          L14: while (true) {
                            if (var5 <= var19) {
                              var17++;
                              continue L9;
                            } else {
                              L15: {
                                var18 = var18 + var33.d((byte) 19);
                                if (var6 == null) {
                                  var20 = var19;
                                  break L15;
                                } else {
                                  var20 = var49[var19];
                                  break L15;
                                }
                              }
                              if (var20 == param3) {
                                var16 = var20;
                                var15 = var15 + var18;
                                var19++;
                                continue L14;
                              } else {
                                var19++;
                                continue L14;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var12 = var51.length;
                      var12--;
                      var13 = 255 & var24[var12];
                      var12 = var12 - 4 * (var13 * var5);
                      var30 = new wf(var52);
                      var30.field_h = var12;
                      var53 = new int[var5];
                      var46 = var53;
                      var39 = var46;
                      var31 = var39;
                      var15_ref_int__ = var31;
                      var16 = 0;
                      L16: while (true) {
                        if (var13 <= var16) {
                          var54 = new byte[var5][];
                          var47 = var54;
                          var40 = var47;
                          var32 = var40;
                          var16_ref_byte____ = var32;
                          var17 = 0;
                          L17: while (true) {
                            if (var5 <= var17) {
                              var30.field_h = var12;
                              var17 = 0;
                              var18 = 0;
                              L18: while (true) {
                                if (var18 >= var13) {
                                  var18 = 0;
                                  L19: while (true) {
                                    if (var18 >= var5) {
                                      break L8;
                                    } else {
                                      L20: {
                                        if (var6 != null) {
                                          var19 = var49[var18];
                                          break L20;
                                        } else {
                                          var19 = var18;
                                          break L20;
                                        }
                                      }
                                      if (((sh) this).field_c == 0) {
                                        var7[var19] = ri.a(136, var54[var18], false);
                                        var18++;
                                        continue L19;
                                      } else {
                                        var7[var19] = (Object) (Object) var54[var18];
                                        var18++;
                                        continue L19;
                                      }
                                    }
                                  }
                                } else {
                                  var19 = 0;
                                  var20 = 0;
                                  L21: while (true) {
                                    if (var5 <= var20) {
                                      var18++;
                                      continue L18;
                                    } else {
                                      var19 = var19 + var30.d((byte) 19);
                                      o.a(var52, var17, var54[var20], var53[var20], var19);
                                      var17 = var17 + var19;
                                      var15_ref_int__[var20] = var15_ref_int__[var20] + var19;
                                      var20++;
                                      continue L21;
                                    }
                                  }
                                }
                              }
                            } else {
                              var16_ref_byte____[var17] = new byte[var53[var17]];
                              var53[var17] = 0;
                              var17++;
                              continue L17;
                            }
                          }
                        } else {
                          var17 = 0;
                          var18 = 0;
                          L22: while (true) {
                            if (var18 >= var5) {
                              var16++;
                              continue L16;
                            } else {
                              var17 = var17 + var30.d((byte) 19);
                              var15_ref_int__[var18] = var15_ref_int__[var18] + var17;
                              var18++;
                              continue L22;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    L23: {
                      if (var6 != null) {
                        var12 = var49[0];
                        break L23;
                      } else {
                        var12 = 0;
                        break L23;
                      }
                    }
                    if (((sh) this).field_c != 0) {
                      var7[var12] = (Object) (Object) var52;
                      break L8;
                    } else {
                      var7[var12] = ri.a(136, var51, false);
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

    sh(hf param0, boolean param1, int param2) {
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
          ((sh) this).field_g = null;
          if (-1 < (param2 ^ -1)) {
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
              ((sh) this).field_i = stackIn_6_1 != 0;
              ((sh) this).field_c = param2;
              ((sh) this).field_h = param0;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("");
    }

    final static boolean d(String param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Lexicominos.field_L ? 1 : 0;
          var2 = 0;
          if (param1 == 50) {
            break L0;
          } else {
            field_a = -22;
            break L0;
          }
        }
        L1: while (true) {
          if (var2 >= param0.length()) {
            return false;
          } else {
            var3 = param0.charAt(var2);
            if (!hi.a(18670, (char) var3)) {
              if (!ne.a((byte) 94, (char) var3)) {
                return true;
              } else {
                var2++;
                continue L1;
              }
            } else {
              var2++;
              continue L1;
            }
          }
        }
    }

    final int a(byte param0, int param1) {
        int var3 = 92 % ((70 - param0) / 40);
        if (!this.b(param1, 126)) {
            return 0;
        }
        return ((sh) this).field_g.field_a[param1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
        field_e = 0;
    }
}
