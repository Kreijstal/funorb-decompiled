/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk {
    private ps field_e;
    private Object[][] field_d;
    private Object[] field_a;
    static nf field_g;
    private ip field_h;
    private int field_b;
    private boolean field_f;
    static String field_c;

    final synchronized boolean c(int param0, int param1) {
        if (!this.a(param0, (byte) 42)) {
            return false;
        }
        if (((gk) this).field_a[param0] != null) {
            return true;
        }
        this.a(param0, true);
        if (param1 != 0) {
            return false;
        }
        if (null != ((gk) this).field_a[param0]) {
            return true;
        }
        return false;
    }

    private final synchronized boolean a(int param0, byte param1) {
        if (!((gk) this).b((byte) 118)) {
            return false;
        }
        if ((param0 ^ -1) <= -1) {
            // if_icmpge L45
            // ifeq L45
        } else {
            if (!ak.field_e) {
                return false;
            }
            throw new IllegalArgumentException(Integer.toString(param0));
        }
        if (param1 != 42) {
            return false;
        }
        return true;
    }

    final boolean a(String param0, int param1, String param2) {
        if (!(((gk) this).b((byte) -99))) {
            return false;
        }
        param0 = param0.toLowerCase();
        param2 = param2.toLowerCase();
        CharSequence var6 = (CharSequence) param0;
        int var4 = ((gk) this).field_e.field_b.a(false, bg.a(var6, (byte) 120));
        if (param1 >= -76) {
            int discarded$0 = ((gk) this).b(((int[]) (int[]) ((gk) this).field_a[0])[0], -77);
        }
        if (-1 < (var4 ^ -1)) {
            return false;
        }
        CharSequence var7 = (CharSequence) param2;
        int var5 = ((gk) this).field_e.field_r[var4].a(false, bg.a(var7, (byte) 120));
        if (0 <= var5) {
            return true;
        }
        return false;
    }

    private final synchronized boolean b(int param0, int param1, int param2) {
        if (!((gk) this).b((byte) 108)) {
          return false;
        } else {
          L0: {
            if (param1 > 73) {
              break L0;
            } else {
              ((gk) this).field_h = (ip) null;
              break L0;
            }
          }
          L1: {
            if ((param0 ^ -1) > -1) {
              break L1;
            } else {
              if ((param2 ^ -1) > -1) {
                break L1;
              } else {
                if (((gk) this).field_e.field_j.length <= param0) {
                  break L1;
                } else {
                  if (param2 < ((gk) this).field_e.field_j[param0]) {
                    return true;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          if (ak.field_e) {
            throw new IllegalArgumentException(param0 + " " + param2);
          } else {
            return false;
          }
        }
    }

    final synchronized boolean b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = AceOfSkies.field_G ? 1 : 0;
        if (((gk) this).b((byte) -71)) {
          var2 = 1;
          var3 = param0;
          L0: while (true) {
            if (((gk) this).field_e.field_o.length <= var3) {
              return var2 != 0;
            } else {
              var4 = ((gk) this).field_e.field_o[var3];
              if (null == ((gk) this).field_a[var4]) {
                this.a(var4, true);
                if (((gk) this).field_a[var4] == null) {
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

    final int a(String param0, byte param1) {
        if (param1 != -79) {
            gk.c(((byte[]) (byte[]) ((gk) this).field_a[17])[0]);
        }
        if (!(((gk) this).b((byte) 102))) {
            return 0;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) param0;
        int var3 = ((gk) this).field_e.field_b.a(false, bg.a(var4, (byte) 120));
        return ((gk) this).a(var3, 100);
    }

    final synchronized int a(int param0, int param1) {
        if (param1 != 100) {
            return -113;
        }
        if (!(this.a(param0, (byte) 42))) {
            return 0;
        }
        if (!(((gk) this).field_a[param0] == null)) {
            return 100;
        }
        return ((gk) this).field_h.b(1, param0);
    }

    final synchronized byte[] a(String param0, byte param1, String param2) {
        if (!((gk) this).b((byte) -94)) {
            return null;
        }
        param0 = param0.toLowerCase();
        param2 = param2.toLowerCase();
        CharSequence var6 = (CharSequence) param0;
        int var4 = ((gk) this).field_e.field_b.a(false, bg.a(var6, (byte) 120));
        if (!this.a(var4, (byte) 42)) {
            return null;
        }
        if (param1 != -71) {
            return (byte[]) null;
        }
        CharSequence var7 = (CharSequence) param2;
        int var5 = ((gk) this).field_e.field_r[var4].a(false, bg.a(var7, (byte) 120));
        return ((gk) this).a(var4, param1 + -10399, var5);
    }

    final int b(int param0, int param1) {
        if (!(this.a(param0, (byte) 42))) {
            return 0;
        }
        if (param1 != 27912) {
            ((gk) this).field_d = (Object[][]) (Object[][]) ((Object[]) (Object[]) ((gk) this).field_a[4])[2];
        }
        return ((gk) this).field_e.field_j[param0];
    }

    final int a(byte param0) {
        if (!(((gk) this).b((byte) -25))) {
            return -1;
        }
        if (param0 < 56) {
            int discarded$0 = ((gk) this).a(((byte[]) (byte[]) ((gk) this).field_a[0])[2]);
        }
        return ((gk) this).field_e.field_j.length;
    }

    public static void c(byte param0) {
        field_c = null;
        if (param0 != -73) {
            field_g = (nf) null;
        }
        field_g = null;
    }

    private final synchronized byte[] a(int[] param0, int param1, int param2, int param3) {
        Object var5 = null;
        byte[] var5_array = null;
        byte[] var7 = null;
        if (this.b(param2, 100, param1)) {
          L0: {
            var5 = null;
            if (param3 <= -44) {
              break L0;
            } else {
              int discarded$1 = ((gk) this).b(8, 111);
              break L0;
            }
          }
          L1: {
            L2: {
              if (null == ((gk) this).field_d[param2]) {
                break L2;
              } else {
                if (((gk) this).field_d[param2][param1] != null) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            if (this.a(param1, param0, param2, (byte) 40)) {
              break L1;
            } else {
              this.a(param2, true);
              if (this.a(param1, param0, param2, (byte) 65)) {
                break L1;
              } else {
                return null;
              }
            }
          }
          if (null == ((gk) this).field_d[param2]) {
            throw new RuntimeException("");
          } else {
            L3: {
              if (null != ((gk) this).field_d[param2][param1]) {
                var7 = rb.a(false, ((gk) this).field_d[param2][param1], -45);
                var5_array = var7;
                if (var7 == null) {
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
                if ((((gk) this).field_b ^ -1) == -2) {
                  ((gk) this).field_d[param2][param1] = null;
                  if (((gk) this).field_e.field_j[param2] != 1) {
                    break L4;
                  } else {
                    ((gk) this).field_d[param2] = null;
                    break L4;
                  }
                } else {
                  if (((gk) this).field_b != 2) {
                    break L4;
                  } else {
                    ((gk) this).field_d[param2] = null;
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

    final synchronized boolean a(int param0, byte param1, int param2) {
        if (param1 <= 29) {
            byte[] discarded$0 = ((gk) this).d(-108, ((int[]) (int[]) ((Object[]) (Object[]) ((Object[]) (Object[]) ((gk) this).field_a[22])[3])[0])[3]);
        }
        if (!this.b(param2, 113, param0)) {
            return false;
        }
        if (((gk) this).field_d[param2] != null) {
            if (((gk) this).field_d[param2][param0] != null) {
                return true;
            }
        }
        if (null != ((gk) this).field_a[param2]) {
            return true;
        }
        this.a(param2, true);
        if (null == ((gk) this).field_a[param2]) {
            return false;
        }
        return true;
    }

    private final synchronized void a(int param0, boolean param1) {
        if (((gk) this).field_f) {
            ((gk) this).field_a[param0] = (Object) (Object) ((gk) this).field_h.a(param0, 2);
        } else {
            ((gk) this).field_a[param0] = sf.a(false, -137, ((gk) this).field_h.a(param0, 2));
        }
        if (!param1) {
            int[] var4 = (int[]) null;
            byte[] discarded$0 = this.a((int[]) null, -97, -90, -106);
        }
    }

    final synchronized boolean b(byte param0) {
        if (((gk) this).field_e == null) {
            ((gk) this).field_e = ((gk) this).field_h.a(true);
            if (!(null != ((gk) this).field_e)) {
                return false;
            }
            ((gk) this).field_a = new Object[((gk) this).field_e.field_l];
            ((gk) this).field_d = new Object[((gk) this).field_e.field_l][];
        }
        int var2 = -122 % ((param0 - 37) / 44);
        return true;
    }

    final synchronized int a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = AceOfSkies.field_G ? 1 : 0;
        if (!((gk) this).b((byte) -37)) {
          return 0;
        } else {
          var2 = -90 / ((24 - param0) / 63);
          var3 = 0;
          var4 = 0;
          var5 = 0;
          L0: while (true) {
            if (var5 >= ((gk) this).field_a.length) {
              if (-1 != var3) {
                var5 = var4 * 100 / var3;
                return var5;
              } else {
                return 100;
              }
            } else {
              if (((gk) this).field_e.field_k[var5] < -1) {
                var4 = var4 + ((gk) this).a(var5, 100);
                var3 += 100;
                var5++;
                continue L0;
              } else {
                var5++;
                continue L0;
              }
            }
          }
        }
    }

    final int b(String param0, int param1) {
        if (!(((gk) this).b((byte) -42))) {
            return -1;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) param0;
        int var3 = ((gk) this).field_e.field_b.a(false, bg.a(var4, (byte) 120));
        if (param1 != 0) {
            return ((int[]) (int[]) ((gk) this).field_a[5])[9];
        }
        if (!(this.a(var3, (byte) 42))) {
            return -1;
        }
        return var3;
    }

    final boolean a(String param0, int param1) {
        if (!((gk) this).b((byte) -81)) {
            return false;
        }
        param0 = param0.toLowerCase();
        int var3 = 68 / ((param1 - 64) / 52);
        CharSequence var5 = (CharSequence) param0;
        int var4 = ((gk) this).field_e.field_b.a(false, bg.a(var5, (byte) 120));
        if ((var4 ^ -1) <= -1) {
            return true;
        }
        return false;
    }

    private final synchronized boolean a(int param0, int[] param1, int param2, byte param3) {
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
        byte[] var25 = null;
        rb var26 = null;
        byte[] var27 = null;
        rb var29 = null;
        rb var31 = null;
        int[] var32 = null;
        byte[][] var33 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        int[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        int[] var46 = null;
        byte[][] var47 = null;
        int[] var48 = null;
        byte[] var49 = null;
        byte[] var50 = null;
        byte[] var51 = null;
        byte[] var52 = null;
        int[] var53 = null;
        byte[][] var54 = null;
        var22 = AceOfSkies.field_G ? 1 : 0;
        if (this.a(param2, (byte) 42)) {
          if (((gk) this).field_a[param2] == null) {
            return false;
          } else {
            L0: {
              var5 = ((gk) this).field_e.field_k[param2];
              var48 = ((gk) this).field_e.field_q[param2];
              var41 = var48;
              var34 = var41;
              var24 = var34;
              var6 = var24;
              if (null == ((gk) this).field_d[param2]) {
                ((gk) this).field_d[param2] = new Object[((gk) this).field_e.field_j[param2]];
                break L0;
              } else {
                break L0;
              }
            }
            var7 = ((gk) this).field_d[param2];
            var8 = 1;
            var9_int = 0;
            L1: while (true) {
              L2: {
                if (var5 <= var9_int) {
                  break L2;
                } else {
                  L3: {
                    if (var6 != null) {
                      var10 = var48[var9_int];
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
                    if (param1 == null) {
                      break L5;
                    } else {
                      L6: {
                        if (param1[0] != -1) {
                          break L6;
                        } else {
                          if (-1 != param1[1]) {
                            break L6;
                          } else {
                            if (0 != param1[2]) {
                              break L6;
                            } else {
                              if (0 != param1[3]) {
                                break L6;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      var49 = rb.a(true, ((gk) this).field_a[param2], -62);
                      var42 = var49;
                      var35 = var42;
                      var25 = var35;
                      var9 = var25;
                      var26 = new rb(var49);
                      var26.a(5, param1, 1515088773, ((rb) var26).field_f.length);
                      break L4;
                    }
                  }
                  var9 = rb.a(false, ((gk) this).field_a[param2], -84);
                  break L4;
                }
                if (param3 > 3) {
                  L7: {
                    var50 = pn.a(var9, 0);
                    var43 = var50;
                    var36 = var43;
                    var27 = var36;
                    var23 = var27;
                    var51 = var23;
                    if (((gk) this).field_f) {
                      ((gk) this).field_a[param2] = null;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if ((var5 ^ -1) < -2) {
                      var50 = var43;
                      if (-3 != (((gk) this).field_b ^ -1)) {
                        var50 = var43;
                        var11 = var50.length;
                        var11--;
                        var12 = var23[var11] & 255;
                        var11 = var11 - var5 * var12 * 4;
                        var31 = new rb(var51);
                        var53 = new int[var5];
                        var46 = var53;
                        var39 = var46;
                        var32 = var39;
                        var14 = var32;
                        var31.field_g = var11;
                        var15_int = 0;
                        L9: while (true) {
                          if (var12 <= var15_int) {
                            var54 = new byte[var5][];
                            var47 = var54;
                            var40 = var47;
                            var33 = var40;
                            var15 = var33;
                            var16 = 0;
                            L10: while (true) {
                              if (var5 <= var16) {
                                var31.field_g = var11;
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
                                          if (var6 == null) {
                                            var18 = var17;
                                            break L13;
                                          } else {
                                            var18 = var48[var17];
                                            break L13;
                                          }
                                        }
                                        if (-1 == (((gk) this).field_b ^ -1)) {
                                          var7[var18] = sf.a(false, -137, var54[var17]);
                                          var17++;
                                          continue L12;
                                        } else {
                                          var7[var18] = (Object) (Object) var54[var17];
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
                                        var18 = var18 + var31.a((byte) 109);
                                        au.a(var51, var16, var54[var19], var53[var19], var18);
                                        var16 = var16 + var18;
                                        var14[var19] = var14[var19] + var18;
                                        var19++;
                                        continue L14;
                                      }
                                    }
                                  }
                                }
                              } else {
                                var15[var16] = new byte[var53[var16]];
                                var53[var16] = 0;
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
                                var16 = var16 + var31.a((byte) 122);
                                var14[var17] = var14[var17] + var16;
                                var17++;
                                continue L15;
                              }
                            }
                          }
                        }
                      } else {
                        var11 = var50.length;
                        var11--;
                        var12 = var23[var11] & 255;
                        var11 = var11 - var12 * (var5 * 4);
                        var29 = new rb(var51);
                        var14_int = 0;
                        var15_int = 0;
                        var29.field_g = var11;
                        var16 = 0;
                        L16: while (true) {
                          if (var12 <= var16) {
                            if (var14_int == 0) {
                              return true;
                            } else {
                              var52 = new byte[var14_int];
                              var29.field_g = var11;
                              var14_int = 0;
                              var17 = 0;
                              var18 = 0;
                              L17: while (true) {
                                if (var18 >= var12) {
                                  var7[var15_int] = (Object) (Object) var52;
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
                                        var19 = var19 + var29.a((byte) 118);
                                        if (var6 == null) {
                                          var21 = var20;
                                          break L19;
                                        } else {
                                          var21 = var48[var20];
                                          break L19;
                                        }
                                      }
                                      L20: {
                                        if (var21 == param0) {
                                          au.a(var51, var17, var52, var14_int, var19);
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
                              if (var18 >= var5) {
                                var16++;
                                continue L16;
                              } else {
                                L22: {
                                  var17 = var17 + var29.a((byte) 115);
                                  if (var6 != null) {
                                    var19 = var48[var18];
                                    break L22;
                                  } else {
                                    var19 = var18;
                                    break L22;
                                  }
                                }
                                if (param0 == var19) {
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
                        if (var6 != null) {
                          var11 = var48[0];
                          break L23;
                        } else {
                          var11 = 0;
                          break L23;
                        }
                      }
                      if (((gk) this).field_b != 0) {
                        var7[var11] = (Object) (Object) var51;
                        break L8;
                      } else {
                        var7[var11] = sf.a(false, -137, var50);
                        return true;
                      }
                    }
                  }
                  return true;
                } else {
                  return true;
                }
              } else {
                return true;
              }
            }
          }
        } else {
          return false;
        }
    }

    final synchronized byte[] d(int param0, int param1) {
        if (!((gk) this).b((byte) 100)) {
            return null;
        }
        if (!(1 != ((gk) this).field_e.field_j.length)) {
            return ((gk) this).a(0, -10470, param0);
        }
        if (!this.a(param0, (byte) 42)) {
            return null;
        }
        if (!(param1 != (((gk) this).field_e.field_j[param0] ^ -1))) {
            return ((gk) this).a(param0, param1 ^ 10468, 0);
        }
        throw new RuntimeException();
    }

    final boolean a(String param0, boolean param1, String param2) {
        if (!((gk) this).b((byte) 114)) {
            return false;
        }
        param2 = param2.toLowerCase();
        param0 = param0.toLowerCase();
        CharSequence var6 = (CharSequence) param2;
        int var4 = ((gk) this).field_e.field_b.a(false, bg.a(var6, (byte) 120));
        if (!this.a(var4, (byte) 42)) {
            return false;
        }
        CharSequence var7 = (CharSequence) param0;
        int var5 = ((gk) this).field_e.field_r[var4].a(param1, bg.a(var7, (byte) 120));
        return ((gk) this).a(var5, (byte) 40, var4);
    }

    final byte[] a(int param0, int param1, int param2) {
        if (param1 != -10470) {
            return (byte[]) null;
        }
        return this.a((int[]) null, param2, param0, -53);
    }

    final int a(int param0, int param1, String param2) {
        if (!(this.a(param1, (byte) 42))) {
            return -1;
        }
        if (param0 >= -26) {
            ((int[]) (int[]) ((gk) this).field_a[2])[0] = -26;
        }
        param2 = param2.toLowerCase();
        CharSequence var5 = (CharSequence) param2;
        int var4 = ((gk) this).field_e.field_r[param1].a(false, bg.a(var5, (byte) 120));
        if (!(this.b(param1, 91, var4))) {
            return -1;
        }
        return var4;
    }

    gk(ip param0, boolean param1, int param2) {
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
          ((gk) this).field_e = null;
          if (0 > param2) {
            break L0;
          } else {
            if (param2 <= 2) {
              L1: {
                ((gk) this).field_h = param0;
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
              ((gk) this).field_f = stackIn_6_1 != 0;
              ((gk) this).field_b = param2;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("");
    }

    final boolean c(String param0, int param1) {
        if (!(((gk) this).b((byte) 106))) {
            return false;
        }
        param0 = param0.toLowerCase();
        if (param1 != -14012) {
            return false;
        }
        CharSequence var4 = (CharSequence) param0;
        int var3 = ((gk) this).field_e.field_b.a(false, bg.a(var4, (byte) 120));
        return ((gk) this).c(var3, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new nf();
        field_c = "Loading sound effects";
    }
}
