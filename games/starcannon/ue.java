/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue {
    private Object[][] field_g;
    private ti field_a;
    private int field_i;
    private ak field_b;
    static int field_e;
    static int[] field_c;
    static int field_f;
    private boolean field_d;
    private Object[] field_h;

    final int a(String param0, boolean param1) {
        if (param1) {
            return -78;
        }
        if (!(((ue) this).b((byte) 99))) {
            return -1;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((ue) this).field_b.field_l.a((byte) 0, ne.a(param1, var4));
        if (!this.a((byte) -76, var3)) {
            return -1;
        }
        return var3;
    }

    final int a(String param0, boolean param1, int param2) {
        if (!param1) {
            Object var5 = null;
            boolean discarded$0 = ((ue) this).a((String) null, (String) null, (byte) -41);
        }
        if (!(this.a((byte) -76, param2))) {
            return -1;
        }
        param0 = param0.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param0;
        int var4 = ((ue) this).field_b.field_s[param2].a((byte) 127, ne.a(false, var6));
        if (!(this.a(var4, 117, param2))) {
            return -1;
        }
        return var4;
    }

    final synchronized boolean a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = StarCannon.field_A;
        if (!((ue) this).b((byte) 114)) {
          return false;
        } else {
          var2 = 1;
          var3 = 0;
          L0: while (true) {
            if (var3 >= ((ue) this).field_b.field_g.length) {
              L1: {
                if (param0 == 29741) {
                  break L1;
                } else {
                  boolean discarded$1 = ((ue) this).a(53, (String) ((ue) this).field_h[3]);
                  break L1;
                }
              }
              return var2 != 0;
            } else {
              var4 = ((ue) this).field_b.field_g[var3];
              if (((ue) this).field_h[var4] == null) {
                this.d(var4, 0);
                if (((ue) this).field_h[var4] == null) {
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

    final synchronized int a(int param0, int param1) {
        if (!(this.a((byte) -76, param1))) {
            return 0;
        }
        if (null != ((ue) this).field_h[param1]) {
            return 100;
        }
        if (param0 != 100) {
            int discarded$0 = ((ue) this).a((String) ((ue) this).field_h[21], ((boolean[]) ((Object[]) ((ue) this).field_h[12])[31])[0]);
        }
        return ((ue) this).field_a.a(param1, true);
    }

    final static String a(long param0, int param1) {
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        if (0L >= param0) {
            return null;
        }
        if (param0 >= 6582952005840035281L) {
            return null;
        }
        if (-1L == (param0 % 37L ^ -1L)) {
            return null;
        }
        int var3 = 0;
        long var4 = param0;
        while (0L != var4) {
            var4 = var4 / 37L;
            var3++;
        }
        StringBuilder var6 = new StringBuilder(var3);
        while (0L != param0) {
            var7 = param0;
            param0 = param0 / 37L;
            var9 = rh.field_j[(int)(var7 + -(37L * param0))];
            if (var9 == 95) {
                var10 = var6.length() + -1;
                var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                var9 = 160;
            }
            StringBuilder discarded$0 = var6.append(var9);
        }
        if (param1 != 16778) {
            return null;
        }
        StringBuilder discarded$1 = var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    final synchronized byte[] a(String param0, byte param1, String param2) {
        if (!((ue) this).b((byte) 109)) {
            return null;
        }
        param0 = param0.toLowerCase();
        param2 = param2.toLowerCase();
        CharSequence var7 = (CharSequence) (Object) param0;
        int var4 = ((ue) this).field_b.field_l.a((byte) 21, ne.a(false, var7));
        if (!this.a((byte) -76, var4)) {
            return null;
        }
        int var5 = -85 / ((param1 - -35) / 41);
        CharSequence var8 = (CharSequence) (Object) param2;
        int var6 = ((ue) this).field_b.field_s[var4].a((byte) -128, ne.a(false, var8));
        return ((ue) this).a(var4, true, var6);
    }

    final boolean a(int param0, String param1) {
        if (!((ue) this).b((byte) 100)) {
            return false;
        }
        if (param0 != -20955) {
            ((ue) this).field_i = 24;
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((ue) this).field_b.field_l.a((byte) -126, ne.a(false, var4));
        if (-1 >= (var3 ^ -1)) {
            return true;
        }
        return false;
    }

    final int a(String param0, byte param1) {
        if (!(((ue) this).b((byte) 111))) {
            return 0;
        }
        if (param1 < 74) {
            ((byte[]) ((ue) this).field_h[3])[0] = ((byte[]) ((Object[]) ((ue) this).field_h[0])[9])[13];
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((ue) this).field_b.field_l.a((byte) -21, ne.a(false, var4));
        return ((ue) this).a(100, var3);
    }

    final synchronized int a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = StarCannon.field_A;
        if (((ue) this).b((byte) 123)) {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (((ue) this).field_h.length <= var4) {
              if (var2 != 0) {
                L1: {
                  if (param0 > 37) {
                    break L1;
                  } else {
                    ((ue) this).field_i = ((int[]) ((Object[]) ((ue) this).field_h[4])[8])[1];
                    break L1;
                  }
                }
                var4 = 100 * var3 / var2;
                return var4;
              } else {
                return 100;
              }
            } else {
              if (((ue) this).field_b.field_i[var4] > 0) {
                var3 = var3 + ((ue) this).a(100, var4);
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

    final byte[] a(int param0, boolean param1, int param2) {
        if (!param1) {
            return null;
        }
        return this.a((int[]) null, param0, param2, true);
    }

    final synchronized boolean b(byte param0) {
        if (null == ((ue) this).field_b) {
            ((ue) this).field_b = ((ue) this).field_a.b((byte) -84);
            if (((ue) this).field_b == null) {
                return false;
            }
            ((ue) this).field_h = new Object[((ue) this).field_b.field_m];
            ((ue) this).field_g = new Object[((ue) this).field_b.field_m][];
        }
        if (param0 <= 87) {
            ((ue) this).field_a = null;
            return true;
        }
        return true;
    }

    final boolean a(String param0, String param1, byte param2) {
        if (!((ue) this).b((byte) 92)) {
            return false;
        }
        param0 = param0.toLowerCase();
        if (param2 != -17) {
            i discarded$0 = ue.a((ue) null, (byte) 1, -121, ((int[]) ((ue) this).field_h[2])[5], (ue) ((ue) this).field_h[0]);
        }
        param1 = param1.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param0;
        int var4 = ((ue) this).field_b.field_l.a((byte) -125, ne.a(false, var6));
        if (!this.a((byte) -76, var4)) {
            return false;
        }
        CharSequence var7 = (CharSequence) (Object) param1;
        int var5 = ((ue) this).field_b.field_s[var4].a((byte) 9, ne.a(false, var7));
        return ((ue) this).a((byte) -93, var4, var5);
    }

    final synchronized boolean c(int param0, int param1) {
        if (!(this.a((byte) -76, param0))) {
            return false;
        }
        if (((ue) this).field_h[param0] != null) {
            return true;
        }
        this.d(param0, 0);
        if (param1 > -24) {
            return false;
        }
        if (((ue) this).field_h[param0] != null) {
            return true;
        }
        return false;
    }

    public static void b(int param0) {
        if (param0 != 0) {
            field_c = null;
        }
        field_c = null;
    }

    private final synchronized void d(int param0, int param1) {
        if (!((ue) this).field_d) {
            ((ue) this).field_h[param0] = d.a(false, (byte) 119, ((ue) this).field_a.b(param0, false));
        } else {
            ((ue) this).field_h[param0] = (Object) (Object) ((ue) this).field_a.b(param0, false);
        }
        if (param1 != 0) {
            ((int[]) ((ue) this).field_h[1])[5] = 92;
        }
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        if (param1 <= 106) {
            return false;
        }
        if (!(((ue) this).b((byte) 94))) {
            return false;
        }
        if ((param2 ^ -1) <= -1) {
            if (param0 >= 0) {
                if (param2 < ((ue) this).field_b.field_j.length) {
                    if (param0 < ((ue) this).field_b.field_j[param2]) {
                        return true;
                    }
                }
            }
        }
        if (!gf.field_d) {
            return false;
        }
        throw new IllegalArgumentException(param2 + " " + param0);
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
        var22 = StarCannon.field_A;
        if (!this.a((byte) -76, param0)) {
          return false;
        } else {
          if (null != ((ue) this).field_h[param0]) {
            L0: {
              var5 = ((ue) this).field_b.field_i[param0];
              var48 = ((ue) this).field_b.field_k[param0];
              var41 = var48;
              var34 = var41;
              var24 = var34;
              var6 = var24;
              if (null == ((ue) this).field_g[param0]) {
                ((ue) this).field_g[param0] = new Object[((ue) this).field_b.field_j[param0]];
                break L0;
              } else {
                break L0;
              }
            }
            var7 = ((ue) this).field_g[param0];
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
                    if (param3 == null) {
                      break L5;
                    } else {
                      L6: {
                        if (-1 != (param3[0] ^ -1)) {
                          break L6;
                        } else {
                          if (0 != param3[1]) {
                            break L6;
                          } else {
                            if (param3[2] != 0) {
                              break L6;
                            } else {
                              if (param3[3] != 0) {
                                break L6;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      var49 = dk.a((byte) -56, ((ue) this).field_h[param0], true);
                      var42 = var49;
                      var35 = var42;
                      var25 = var35;
                      var9 = var25;
                      var26 = new rb(var49);
                      var26.a(param3, var26.field_f.length, -84, 5);
                      break L4;
                    }
                  }
                  var9 = dk.a((byte) 90, ((ue) this).field_h[param0], false);
                  break L4;
                }
                L7: {
                  var50 = hc.a((byte) 74, var9);
                  var43 = var50;
                  var36 = var43;
                  var27 = var36;
                  var23 = var27;
                  var51 = var23;
                  if (!((ue) this).field_d) {
                    break L7;
                  } else {
                    ((ue) this).field_h[param0] = null;
                    break L7;
                  }
                }
                L8: {
                  if (param2 < -15) {
                    break L8;
                  } else {
                    ((ue) this).field_a = null;
                    break L8;
                  }
                }
                L9: {
                  if (var5 <= 1) {
                    L10: {
                      if (var6 != null) {
                        var11 = var48[0];
                        break L10;
                      } else {
                        var11 = 0;
                        break L10;
                      }
                    }
                    if (-1 == (((ue) this).field_i ^ -1)) {
                      var7[var11] = d.a(false, (byte) 123, var51);
                      break L9;
                    } else {
                      var7[var11] = (Object) (Object) var50;
                      break L9;
                    }
                  } else {
                    if ((((ue) this).field_i ^ -1) != -3) {
                      var11 = var50.length;
                      var11--;
                      var12 = 255 & var23[var11];
                      var11 = var11 - 4 * var12 * var5;
                      var31 = new rb(var51);
                      var31.field_g = var11;
                      var53 = new int[var5];
                      var46 = var53;
                      var39 = var46;
                      var32 = var39;
                      var14 = var32;
                      var15_int = 0;
                      L11: while (true) {
                        if (var15_int >= var12) {
                          var54 = new byte[var5][];
                          var47 = var54;
                          var40 = var47;
                          var33 = var40;
                          var15 = var33;
                          var16 = 0;
                          L12: while (true) {
                            if (var16 >= var5) {
                              var31.field_g = var11;
                              var16 = 0;
                              var17 = 0;
                              L13: while (true) {
                                if (var17 >= var12) {
                                  var17 = 0;
                                  L14: while (true) {
                                    if (var5 <= var17) {
                                      break L9;
                                    } else {
                                      L15: {
                                        if (var6 != null) {
                                          var18 = var48[var17];
                                          break L15;
                                        } else {
                                          var18 = var17;
                                          break L15;
                                        }
                                      }
                                      if (-1 == (((ue) this).field_i ^ -1)) {
                                        var7[var18] = d.a(false, (byte) -21, var54[var17]);
                                        var17++;
                                        continue L14;
                                      } else {
                                        var7[var18] = (Object) (Object) var54[var17];
                                        var17++;
                                        continue L14;
                                      }
                                    }
                                  }
                                } else {
                                  var18 = 0;
                                  var19 = 0;
                                  L16: while (true) {
                                    if (var5 <= var19) {
                                      var17++;
                                      continue L13;
                                    } else {
                                      var18 = var18 + var31.f((byte) -100);
                                      ug.a(var51, var16, var54[var19], var53[var19], var18);
                                      var16 = var16 + var18;
                                      var14[var19] = var14[var19] + var18;
                                      var19++;
                                      continue L16;
                                    }
                                  }
                                }
                              }
                            } else {
                              var15[var16] = new byte[var53[var16]];
                              var53[var16] = 0;
                              var16++;
                              continue L12;
                            }
                          }
                        } else {
                          var16 = 0;
                          var17 = 0;
                          L17: while (true) {
                            if (var17 >= var5) {
                              var15_int++;
                              continue L11;
                            } else {
                              var16 = var16 + var31.f((byte) -79);
                              var14[var17] = var14[var17] + var16;
                              var17++;
                              continue L17;
                            }
                          }
                        }
                      }
                    } else {
                      var11 = var50.length;
                      var11--;
                      var12 = 255 & var23[var11];
                      var11 = var11 - var12 * (var5 * 4);
                      var29 = new rb(var51);
                      var14_int = 0;
                      var15_int = 0;
                      var29.field_g = var11;
                      var16 = 0;
                      L18: while (true) {
                        if (var12 <= var16) {
                          if (var14_int != 0) {
                            var52 = new byte[var14_int];
                            var29.field_g = var11;
                            var14_int = 0;
                            var17 = 0;
                            var18 = 0;
                            L19: while (true) {
                              if (var12 <= var18) {
                                var7[var15_int] = (Object) (Object) var52;
                                return true;
                              } else {
                                var19 = 0;
                                var20 = 0;
                                L20: while (true) {
                                  if (var20 >= var5) {
                                    var18++;
                                    continue L19;
                                  } else {
                                    L21: {
                                      var19 = var19 + var29.f((byte) -87);
                                      if (var6 != null) {
                                        var21 = var48[var20];
                                        break L21;
                                      } else {
                                        var21 = var20;
                                        break L21;
                                      }
                                    }
                                    L22: {
                                      if (var21 == param1) {
                                        ug.a(var51, var17, var52, var14_int, var19);
                                        var14_int = var14_int + var19;
                                        break L22;
                                      } else {
                                        break L22;
                                      }
                                    }
                                    var17 = var17 + var19;
                                    var20++;
                                    continue L20;
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
                          L23: while (true) {
                            if (var5 <= var18) {
                              var16++;
                              continue L18;
                            } else {
                              L24: {
                                var17 = var17 + var29.f((byte) -119);
                                if (var6 == null) {
                                  var19 = var18;
                                  break L24;
                                } else {
                                  var19 = var48[var18];
                                  break L24;
                                }
                              }
                              if (var19 == param1) {
                                var15_int = var19;
                                var14_int = var14_int + var17;
                                var18++;
                                continue L23;
                              } else {
                                var18++;
                                continue L23;
                              }
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
        }
    }

    private final synchronized byte[] a(int[] param0, int param1, int param2, boolean param3) {
        Object var5 = null;
        byte[] var5_array = null;
        byte[] var7 = null;
        if (this.a(param2, 122, param1)) {
          L0: {
            var5 = null;
            if (param3) {
              break L0;
            } else {
              ((ue) this).field_b = null;
              break L0;
            }
          }
          L1: {
            L2: {
              if (((ue) this).field_g[param1] == null) {
                break L2;
              } else {
                if (((ue) this).field_g[param1][param2] == null) {
                  break L2;
                } else {
                  break L1;
                }
              }
            }
            if (!this.a(param1, param2, -65, param0)) {
              this.d(param1, 0);
              if (this.a(param1, param2, -52, param0)) {
                break L1;
              } else {
                return null;
              }
            } else {
              break L1;
            }
          }
          if (((ue) this).field_g[param1] == null) {
            throw new RuntimeException("");
          } else {
            L3: {
              if (((ue) this).field_g[param1][param2] == null) {
                break L3;
              } else {
                var7 = dk.a((byte) -87, ((ue) this).field_g[param1][param2], false);
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
                if (1 == ((ue) this).field_i) {
                  ((ue) this).field_g[param1][param2] = null;
                  if ((((ue) this).field_b.field_j[param1] ^ -1) != -2) {
                    break L4;
                  } else {
                    ((ue) this).field_g[param1] = null;
                    break L4;
                  }
                } else {
                  if ((((ue) this).field_i ^ -1) != -3) {
                    break L4;
                  } else {
                    ((ue) this).field_g[param1] = null;
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

    final static int b(int param0, int param1) {
        if (param1 <= 118) {
            return -2;
        }
        param0 = param0 & 8191;
        if (-4097 >= (param0 ^ -1)) {
            return 6144 > param0 ? -bd.field_c[6144 - param0] : bd.field_c[param0 + -6144];
        }
        return param0 < 2048 ? bd.field_c[-param0 + 2048] : -bd.field_c[-2048 + param0];
    }

    final static i a(ue param0, byte param1, int param2, int param3, ue param4) {
        if (param1 > -57) {
            ue.b(-26);
        }
        if (!qb.a((byte) -106, param3, param2, param4)) {
            return null;
        }
        return oe.a(5, param0.a(param3, true, param2));
    }

    private final synchronized boolean a(byte param0, int param1) {
        L0: {
          if (param0 == -76) {
            break L0;
          } else {
            byte[] discarded$2 = this.a((int[]) null, 34, -53, ((boolean[]) ((ue) this).field_h[16])[11]);
            break L0;
          }
        }
        if (!((ue) this).b((byte) 120)) {
          return false;
        } else {
          L1: {
            if (0 > param1) {
              break L1;
            } else {
              if (((ue) this).field_b.field_j.length <= param1) {
                break L1;
              } else {
                if (0 != ((ue) this).field_b.field_j[param1]) {
                  return true;
                } else {
                  break L1;
                }
              }
            }
          }
          if (gf.field_d) {
            throw new IllegalArgumentException(Integer.toString(param1));
          } else {
            return false;
          }
        }
    }

    ue(ti param0, boolean param1, int param2) {
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
          ((ue) this).field_b = null;
          if (-1 < (param2 ^ -1)) {
            break L0;
          } else {
            if ((param2 ^ -1) >= -3) {
              L1: {
                ((ue) this).field_a = param0;
                ((ue) this).field_i = param2;
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
              ((ue) this).field_d = stackIn_6_1 != 0;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("");
    }

    final boolean a(String param0, int param1) {
        if (param1 != -9883) {
            return true;
        }
        if (!((ue) this).b((byte) 108)) {
            return false;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((ue) this).field_b.field_l.a((byte) -117, ne.a(false, var4));
        return ((ue) this).c(var3, -116);
    }

    final synchronized boolean a(byte param0, int param1, int param2) {
        if (!this.a(param2, 116, param1)) {
            return false;
        }
        if (null != ((ue) this).field_g[param1]) {
            if (!(null == ((ue) this).field_g[param1][param2])) {
                return true;
            }
        }
        if (null != ((ue) this).field_h[param1]) {
            return true;
        }
        this.d(param1, param0 ^ -93);
        if (param0 != -93) {
            boolean discarded$0 = ((ue) this).c(-4, ((int[]) ((ue) this).field_h[0])[9]);
        }
        if (((ue) this).field_h[param1] != null) {
            return true;
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[]{15, 20, 20, 10, 10};
        field_f = 500;
    }
}
