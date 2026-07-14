/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mi {
    static int field_g;
    static int field_f;
    int field_k;
    private tk field_i;
    private Object[][] field_h;
    private boolean field_e;
    private we field_j;
    static nf field_a;
    private Object[] field_d;
    static int[] field_c;
    static bi[] field_b;

    private final synchronized boolean b(int param0, byte param1) {
        L0: {
          if (param1 == 23) {
            break L0;
          } else {
            ((mi) this).field_j = null;
            break L0;
          }
        }
        if (!((mi) this).b(0)) {
          return false;
        } else {
          L1: {
            if (-1 < param0) {
              break L1;
            } else {
              if (param0 >= ((mi) this).field_j.field_q.length) {
                break L1;
              } else {
                if (-1 != ((mi) this).field_j.field_q[param0]) {
                  return true;
                } else {
                  break L1;
                }
              }
            }
          }
          if (oe.field_P) {
            throw new IllegalArgumentException(Integer.toString(param0));
          } else {
            return false;
          }
        }
    }

    final synchronized boolean a(int param0, int param1) {
        if (!(this.b(param0, (byte) 23))) {
            return false;
        }
        if (param1 != 0) {
            return ((boolean[]) ((mi) this).field_d[0])[21];
        }
        if (((mi) this).field_d[param0] != null) {
            return true;
        }
        this.c(param0, param1 ^ 124);
        if (null != ((mi) this).field_d[param0]) {
            return true;
        }
        return false;
    }

    private final synchronized boolean a(int param0, int[] param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        Object[] var8 = null;
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
        kg var27 = null;
        byte[] var28 = null;
        kg var30 = null;
        int[] var31 = null;
        byte[][] var32 = null;
        kg var33 = null;
        int[] var35 = null;
        byte[] var37 = null;
        byte[] var38 = null;
        int[] var40 = null;
        byte[][] var41 = null;
        int[] var43 = null;
        byte[] var45 = null;
        byte[] var46 = null;
        int[] var48 = null;
        byte[][] var49 = null;
        int[] var51 = null;
        byte[] var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        int[] var56 = null;
        byte[][] var57 = null;
        byte[] var58 = null;
        var23 = Confined.field_J ? 1 : 0;
        if (!this.b(param0, (byte) 23)) {
          return false;
        } else {
          if (((mi) this).field_d[param0] == null) {
            return false;
          } else {
            L0: {
              var5 = ((mi) this).field_j.field_t[param0];
              var6 = 74 % ((param2 - 41) / 46);
              var51 = ((mi) this).field_j.field_r[param0];
              var43 = var51;
              var35 = var43;
              var25 = var35;
              var7 = var25;
              if (((mi) this).field_h[param0] != null) {
                break L0;
              } else {
                ((mi) this).field_h[param0] = new Object[((mi) this).field_j.field_q[param0]];
                break L0;
              }
            }
            var8 = ((mi) this).field_h[param0];
            var9 = 1;
            var10_int = 0;
            L1: while (true) {
              L2: {
                if (var5 <= var10_int) {
                  break L2;
                } else {
                  L3: {
                    if (var7 == null) {
                      var11 = var10_int;
                      break L3;
                    } else {
                      var11 = var51[var10_int];
                      break L3;
                    }
                  }
                  if (null != var8[var11]) {
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
                    if (param1 == null) {
                      break L5;
                    } else {
                      L6: {
                        if (param1[0] != 0) {
                          break L6;
                        } else {
                          if (param1[1] != 0) {
                            break L6;
                          } else {
                            if (0 != param1[2]) {
                              break L6;
                            } else {
                              if (param1[3] == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                      }
                      var52 = vb.a(true, 6, ((mi) this).field_d[param0]);
                      var27 = new kg(var52);
                      var27.a(5, param1, var27.field_m.length, (byte) 72);
                      var53 = var52;
                      break L4;
                    }
                  }
                  var53 = vb.a(false, 6, ((mi) this).field_d[param0]);
                  var45 = var53;
                  var37 = var45;
                  var10 = var37;
                  break L4;
                }
                L7: {
                  var54 = tm.a(119, var53);
                  var46 = var54;
                  var38 = var46;
                  var28 = var38;
                  var24 = var28;
                  var55 = var24;
                  if (!((mi) this).field_e) {
                    break L7;
                  } else {
                    ((mi) this).field_d[param0] = null;
                    break L7;
                  }
                }
                L8: {
                  if (-2 > var5) {
                    var54 = var46;
                    if ((((mi) this).field_k ^ -1) == -3) {
                      var12 = var54.length;
                      var12--;
                      var13 = var24[var12] & 255;
                      var12 = var12 - var5 * (var13 * 4);
                      var33 = new kg(var55);
                      var15 = 0;
                      var16 = 0;
                      var33.field_n = var12;
                      var17 = 0;
                      L9: while (true) {
                        if (var17 >= var13) {
                          if (-1 != (var15 ^ -1)) {
                            var58 = new byte[var15];
                            var33.field_n = var12;
                            var15 = 0;
                            var18 = 0;
                            var19 = 0;
                            L10: while (true) {
                              if (var19 >= var13) {
                                var8[var16] = (Object) (Object) var58;
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
                                      var20 = var20 + var33.f((byte) 51);
                                      if (var7 == null) {
                                        var22 = var21;
                                        break L12;
                                      } else {
                                        var22 = var51[var21];
                                        break L12;
                                      }
                                    }
                                    L13: {
                                      if (param3 == var22) {
                                        lj.a(var55, var18, var58, var15, var20);
                                        var15 = var15 + var20;
                                        break L13;
                                      } else {
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
                          } else {
                            return true;
                          }
                        } else {
                          var18 = 0;
                          var19 = 0;
                          L14: while (true) {
                            if (var19 >= var5) {
                              var17++;
                              continue L9;
                            } else {
                              L15: {
                                var18 = var18 + var33.f((byte) 92);
                                if (var7 == null) {
                                  var20 = var19;
                                  break L15;
                                } else {
                                  var20 = var51[var19];
                                  break L15;
                                }
                              }
                              if (param3 == var20) {
                                var15 = var15 + var18;
                                var16 = var20;
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
                      var12 = var54.length;
                      var12--;
                      var13 = 255 & var24[var12];
                      var12 = var12 - var5 * (var13 * 4);
                      var30 = new kg(var55);
                      var56 = new int[var5];
                      var48 = var56;
                      var40 = var48;
                      var31 = var40;
                      var15_ref_int__ = var31;
                      var30.field_n = var12;
                      var16 = 0;
                      L16: while (true) {
                        if (var13 <= var16) {
                          var57 = new byte[var5][];
                          var49 = var57;
                          var41 = var49;
                          var32 = var41;
                          var16_ref_byte____ = var32;
                          var17 = 0;
                          L17: while (true) {
                            if (var5 <= var17) {
                              var30.field_n = var12;
                              var17 = 0;
                              var18 = 0;
                              L18: while (true) {
                                if (var13 <= var18) {
                                  var18 = 0;
                                  L19: while (true) {
                                    if (var5 <= var18) {
                                      break L8;
                                    } else {
                                      L20: {
                                        if (var7 != null) {
                                          var19 = var51[var18];
                                          break L20;
                                        } else {
                                          var19 = var18;
                                          break L20;
                                        }
                                      }
                                      if (((mi) this).field_k != 0) {
                                        var8[var19] = (Object) (Object) var57[var18];
                                        var18++;
                                        continue L19;
                                      } else {
                                        var8[var19] = ug.a(127, false, var57[var18]);
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
                                      var19 = var19 + var30.f((byte) 59);
                                      lj.a(var55, var17, var57[var20], var56[var20], var19);
                                      var15_ref_int__[var20] = var15_ref_int__[var20] + var19;
                                      var17 = var17 + var19;
                                      var20++;
                                      continue L21;
                                    }
                                  }
                                }
                              }
                            } else {
                              var16_ref_byte____[var17] = new byte[var56[var17]];
                              var56[var17] = 0;
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
                              var17 = var17 + var30.f((byte) 81);
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
                      if (var7 == null) {
                        var54 = var46;
                        var12 = 0;
                        break L23;
                      } else {
                        var12 = var51[0];
                        break L23;
                      }
                    }
                    var54 = var46;
                    if (-1 == ((mi) this).field_k) {
                      var8[var12] = ug.a(125, false, var55);
                      break L8;
                    } else {
                      var8[var12] = (Object) (Object) var54;
                      return true;
                    }
                  }
                }
                return true;
              }
            }
          }
        }
    }

    final int a(int param0, String param1) {
        if (!(((mi) this).b(0))) {
            return -1;
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((mi) this).field_j.field_h.a((byte) 76, mg.a(var4, (byte) -95));
        if (!this.b(var3, (byte) 23)) {
            return -1;
        }
        if (param0 >= -25) {
            return ((int[]) ((Object[]) ((Object[]) ((mi) this).field_d[2])[4])[0])[0];
        }
        return var3;
    }

    final synchronized int[] a(byte param0, int param1) {
        int[] var6 = null;
        int var4 = 0;
        int var5 = Confined.field_J ? 1 : 0;
        if (param0 >= -39) {
            return null;
        }
        if (!this.b(param1, (byte) 23)) {
            return null;
        }
        int[] var3 = ((mi) this).field_j.field_r[param1];
        if (var3 == null) {
            var6 = new int[((mi) this).field_j.field_t[param1]];
            var3 = var6;
            for (var4 = 0; var6.length > var4; var4++) {
                var6[var4] = var4;
            }
        }
        return var3;
    }

    final synchronized boolean a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        var5 = Confined.field_J ? 1 : 0;
        if (((mi) this).b(0)) {
          L0: {
            var2 = 1;
            if (param0 == 25057) {
              break L0;
            } else {
              var6 = null;
              int discarded$2 = ((mi) this).a(((int[]) ((mi) this).field_d[9])[36], (String) null, -11);
              break L0;
            }
          }
          var3 = 0;
          L1: while (true) {
            if (((mi) this).field_j.field_u.length <= var3) {
              return var2 != 0;
            } else {
              var4 = ((mi) this).field_j.field_u[var3];
              if (((mi) this).field_d[var4] == null) {
                this.c(var4, param0 + -24987);
                if (((mi) this).field_d[var4] == null) {
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

    final boolean b(String param0, int param1) {
        if (!((mi) this).b(0)) {
            return false;
        }
        if (param1 != -4308) {
            int discarded$0 = ((mi) this).a(((int[]) ((mi) this).field_d[7])[0], (String) null, ((int[]) ((mi) this).field_d[0])[8]);
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((mi) this).field_j.field_h.a((byte) 76, mg.a(var4, (byte) -100));
        if (-1 < (var3 ^ -1)) {
            return false;
        }
        return true;
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0 > -61) {
            field_b = null;
        }
    }

    final byte[] a(byte param0, int param1, int param2) {
        if (param0 != -2) {
            field_a = null;
        }
        return this.a(param0 ^ -60, param2, param1, (int[]) null);
    }

    private final synchronized boolean b(int param0, int param1, int param2) {
        if (!((mi) this).b(param2 + 0)) {
            return false;
        }
        if (param1 >= param2) {
            if (param0 >= 0) {
                if (((mi) this).field_j.field_q.length > param1) {
                    if (((mi) this).field_j.field_q[param1] > param0) {
                        return true;
                    }
                }
            }
        }
        if (oe.field_P) {
            throw new IllegalArgumentException(param1 + " " + param0);
        }
        return false;
    }

    private final synchronized void c(int param0, int param1) {
        if (!((mi) this).field_e) {
            ((mi) this).field_d[param0] = ug.a(126, false, ((mi) this).field_i.a(param0, 0));
        } else {
            ((mi) this).field_d[param0] = (Object) (Object) ((mi) this).field_i.a(param0, 0);
        }
        int var3 = -45 % ((-19 - param1) / 57);
    }

    final synchronized boolean b(int param0) {
        if (param0 != 0) {
            return false;
        }
        if (null != ((mi) this).field_j) {
            return true;
        }
        ((mi) this).field_j = ((mi) this).field_i.a((byte) -55);
        if (!(null != ((mi) this).field_j)) {
            return false;
        }
        ((mi) this).field_h = new Object[((mi) this).field_j.field_i][];
        ((mi) this).field_d = new Object[((mi) this).field_j.field_i];
        return true;
    }

    final boolean a(String param0, String param1, int param2) {
        if (!((mi) this).b(param2 ^ param2)) {
            return false;
        }
        param0 = param0.toLowerCase();
        param1 = param1.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param0;
        int var4 = ((mi) this).field_j.field_h.a((byte) 76, mg.a(var6, (byte) 71));
        if (!(this.b(var4, (byte) 23))) {
            return false;
        }
        CharSequence var7 = (CharSequence) (Object) param1;
        int var5 = ((mi) this).field_j.field_j[var4].a((byte) 76, mg.a(var7, (byte) 94));
        return ((mi) this).a(var4, var5, 0);
    }

    final synchronized byte[] c(int param0, byte param1) {
        if (!((mi) this).b(0)) {
            return null;
        }
        if (param1 < 24) {
            ((int[]) ((Object[]) ((mi) this).field_d[36])[4])[10] = -56;
        }
        if (!((((mi) this).field_j.field_q.length ^ -1) != -2)) {
            return ((mi) this).a((byte) -2, 0, param0);
        }
        if (!this.b(param0, (byte) 23)) {
            return null;
        }
        if (!(1 != ((mi) this).field_j.field_q[param0])) {
            return ((mi) this).a((byte) -2, param0, 0);
        }
        throw new RuntimeException();
    }

    private final synchronized byte[] a(int param0, int param1, int param2, int[] param3) {
        Object var5 = null;
        byte[] var5_array = null;
        byte[] var7 = null;
        if (this.b(param1, param2, 0)) {
          L0: {
            L1: {
              var5 = null;
              if (null == ((mi) this).field_h[param2]) {
                break L1;
              } else {
                if (null != ((mi) this).field_h[param2][param1]) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (!this.a(param2, param3, (byte) 87, param1)) {
              this.c(param2, 95);
              if (this.a(param2, param3, (byte) 98, param1)) {
                break L0;
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          if (((mi) this).field_h[param2] != null) {
            L2: {
              if (((mi) this).field_h[param2][param1] != null) {
                var7 = vb.a(false, 6, ((mi) this).field_h[param2][param1]);
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
              if (var5_array != null) {
                if (-2 == (((mi) this).field_k ^ -1)) {
                  ((mi) this).field_h[param2][param1] = null;
                  if (-2 != (((mi) this).field_j.field_q[param2] ^ -1)) {
                    break L3;
                  } else {
                    ((mi) this).field_h[param2] = null;
                    break L3;
                  }
                } else {
                  if (((mi) this).field_k != 2) {
                    break L3;
                  } else {
                    ((mi) this).field_h[param2] = null;
                    break L3;
                  }
                }
              } else {
                break L3;
              }
            }
            if (param0 >= 47) {
              return var5_array;
            } else {
              return (byte[]) ((mi) this).field_d[0];
            }
          } else {
            throw new RuntimeException("");
          }
        } else {
          return null;
        }
    }

    final synchronized boolean a(int param0, int param1, int param2) {
        if (!this.b(param1, param0, param2)) {
            return false;
        }
        if (((mi) this).field_h[param0] != null) {
            if (((mi) this).field_h[param0][param1] != null) {
                return true;
            }
        }
        if (!(null == ((mi) this).field_d[param0])) {
            return true;
        }
        this.c(param0, 62);
        if (null != ((mi) this).field_d[param0]) {
            return true;
        }
        return false;
    }

    final synchronized byte[] a(int param0, String param1, String param2) {
        if (!((mi) this).b(0)) {
            return null;
        }
        param1 = param1.toLowerCase();
        param2 = param2.toLowerCase();
        int var5 = -25 % ((param0 - 19) / 55);
        CharSequence var7 = (CharSequence) (Object) param1;
        int var4 = ((mi) this).field_j.field_h.a((byte) 76, mg.a(var7, (byte) 65));
        if (!this.b(var4, (byte) 23)) {
            return null;
        }
        CharSequence var8 = (CharSequence) (Object) param2;
        int var6 = ((mi) this).field_j.field_j[var4].a((byte) 76, mg.a(var8, (byte) -87));
        return ((mi) this).a((byte) -2, var4, var6);
    }

    final int d(int param0, byte param1) {
        if (param1 > -70) {
            int discarded$0 = ((mi) this).a(-88, (String) ((mi) this).field_d[0]);
        }
        if (!(this.b(param0, (byte) 23))) {
            return 0;
        }
        return ((mi) this).field_j.field_q[param0];
    }

    final int b(int param0, String param1) {
        if (!((mi) this).b(0)) {
            return 0;
        }
        if (param0 != -8087) {
            return ((int[]) ((Object[]) ((mi) this).field_d[10])[4])[1];
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((mi) this).field_j.field_h.a((byte) 76, mg.a(var4, (byte) 88));
        return ((mi) this).b(var3, -102);
    }

    final int a(int param0, String param1, int param2) {
        if (!(this.b(param0, (byte) 23))) {
            return -1;
        }
        param1 = param1.toLowerCase();
        if (param2 >= -23) {
            int discarded$0 = ((mi) this).a(25, (String) ((mi) this).field_d[5]);
        }
        CharSequence var5 = (CharSequence) (Object) param1;
        int var4 = ((mi) this).field_j.field_j[param0].a((byte) 76, mg.a(var5, (byte) -107));
        if (!this.b(var4, param0, 0)) {
            return -1;
        }
        return var4;
    }

    final synchronized int c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Confined.field_J ? 1 : 0;
        if (!((mi) this).b(0)) {
          return 0;
        } else {
          L0: {
            if (param0 <= -121) {
              break L0;
            } else {
              ((Object[]) ((mi) this).field_d[8])[2] = null;
              break L0;
            }
          }
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L1: while (true) {
            if (((mi) this).field_d.length <= var4) {
              if (var2 != 0) {
                var4 = 100 * var3 / var2;
                return var4;
              } else {
                return 100;
              }
            } else {
              if (-1 > (((mi) this).field_j.field_t[var4] ^ -1)) {
                var3 = var3 + ((mi) this).b(var4, -109);
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

    final boolean a(String param0, int param1) {
        if (!((mi) this).b(param1)) {
            return false;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((mi) this).field_j.field_h.a((byte) 76, mg.a(var4, (byte) 65));
        return ((mi) this).a(var3, 0);
    }

    final synchronized boolean a(int param0, byte param1) {
        if (!((mi) this).b(param1 + 37)) {
            return false;
        }
        if (((mi) this).field_j.field_q.length == 1) {
            return ((mi) this).a(0, param0, param1 ^ -37);
        }
        if (!(this.b(param0, (byte) 23))) {
            return false;
        }
        if (param1 != -37) {
            int discarded$0 = ((mi) this).b(-115, -51);
        }
        if (!((((mi) this).field_j.field_q[param0] ^ -1) != -2)) {
            return ((mi) this).a(param0, 0, 0);
        }
        throw new RuntimeException();
    }

    final synchronized int b(int param0, int param1) {
        if (param1 > -18) {
            return 67;
        }
        if (!this.b(param0, (byte) 23)) {
            return 0;
        }
        if (!(null == ((mi) this).field_d[param0])) {
            return 100;
        }
        return ((mi) this).field_i.a(param0, true);
    }

    mi(tk param0, boolean param1, int param2) {
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
          ((mi) this).field_j = null;
          if (-1 < param2) {
            break L0;
          } else {
            if (-3 >= param2) {
              L1: {
                ((mi) this).field_i = param0;
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
              ((mi) this).field_e = stackIn_6_1 != 0;
              ((mi) this).field_k = param2;
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
        field_g = 0;
        field_a = new nf(540, 140);
        field_c = new int[8192];
        field_b = new bi[4];
    }
}
