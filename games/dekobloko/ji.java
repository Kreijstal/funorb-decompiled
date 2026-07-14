/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji {
    static String field_h;
    int field_g;
    private ad field_f;
    private of field_a;
    static String field_c;
    private Object[][] field_e;
    private Object[] field_d;
    boolean field_b;

    private final synchronized void a(int param0, int param1) {
        if (((ji) this).field_b) {
            ((ji) this).field_d[param1] = (Object) (Object) ((ji) this).field_a.a(param1, (byte) 91);
        } else {
            ((ji) this).field_d[param1] = qk.a(((ji) this).field_a.a(param1, (byte) 91), -1389597532, false);
        }
        if (param0 != 20351) {
            field_c = null;
        }
    }

    final synchronized boolean b(int param0, byte param1) {
        if (!(this.a(param0, (byte) -83))) {
            return false;
        }
        if (((ji) this).field_d[param0] != null) {
            return true;
        }
        if (param1 != -106) {
            return ((boolean[]) ((ji) this).field_d[0])[0];
        }
        this.a(20351, param0);
        if (null != ((ji) this).field_d[param0]) {
            return true;
        }
        return false;
    }

    final int b(int param0, String param1) {
        if (!(((ji) this).a((byte) 121))) {
            return -1;
        }
        if (param0 != -1) {
            field_h = null;
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((ji) this).field_f.field_e.a((byte) -68, ta.a(var4, 90));
        if (!(this.a(var3, (byte) -83))) {
            return -1;
        }
        return var3;
    }

    final boolean a(String param0, boolean param1, String param2) {
        if (!param1) {
            return true;
        }
        if (!(((ji) this).a((byte) 121))) {
            return false;
        }
        param2 = param2.toLowerCase();
        param0 = param0.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param2;
        int var4 = ((ji) this).field_f.field_e.a((byte) -68, ta.a(var6, -10));
        if (!(this.a(var4, (byte) -83))) {
            return false;
        }
        CharSequence var7 = (CharSequence) (Object) param0;
        int var5 = ((ji) this).field_f.field_o[var4].a((byte) -68, ta.a(var7, 11));
        return ((ji) this).a((byte) -84, var5, var4);
    }

    final int b(int param0, int param1) {
        if (param0 != -5228) {
            return -48;
        }
        if (!(this.a(param1, (byte) -83))) {
            return 0;
        }
        return ((ji) this).field_f.field_k[param1];
    }

    public static void a(int param0) {
        field_c = null;
        field_h = null;
        if (param0 < 125) {
            field_c = null;
        }
    }

    final boolean a(String param0, byte param1) {
        if (!(((ji) this).a((byte) 121))) {
            return false;
        }
        param0 = param0.toLowerCase();
        int var3 = -49 / ((param1 - 13) / 42);
        CharSequence var5 = (CharSequence) (Object) param0;
        int var4 = ((ji) this).field_f.field_e.a((byte) -68, ta.a(var5, -112));
        return ((ji) this).b(var4, (byte) -106);
    }

    final boolean a(String param0, int param1) {
        if (!((ji) this).a((byte) 121)) {
            return false;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((ji) this).field_f.field_e.a((byte) -68, ta.a(var4, 86));
        if (var3 >= param1) {
            return true;
        }
        return false;
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
        wl var26 = null;
        byte[] var27 = null;
        wl var29 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        wl var32 = null;
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
        var22 = client.field_A ? 1 : 0;
        if (this.a(param1, (byte) -83)) {
          if (null != ((ji) this).field_d[param1]) {
            L0: {
              var5 = ((ji) this).field_f.field_B[param1];
              var50 = ((ji) this).field_f.field_v[param1];
              var42 = var50;
              var34 = var42;
              var24 = var34;
              var6 = var24;
              if (((ji) this).field_e[param1] == null) {
                ((ji) this).field_e[param1] = new Object[((ji) this).field_f.field_k[param1]];
                break L0;
              } else {
                break L0;
              }
            }
            if (param3 == 26687) {
              var7 = ((ji) this).field_e[param1];
              var8 = 1;
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
                    if (var7[var10] != null) {
                      var9_int++;
                      continue L1;
                    } else {
                      var8 = 0;
                      break L2;
                    }
                  }
                }
                if (var8 == 0) {
                  L4: {
                    L5: {
                      if (param0 == null) {
                        break L5;
                      } else {
                        L6: {
                          if (param0[0] != 0) {
                            break L6;
                          } else {
                            if (param0[1] != 0) {
                              break L6;
                            } else {
                              if (param0[2] != 0) {
                                break L6;
                              } else {
                                if (0 == param0[3]) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                        }
                        var51 = cf.a(true, 78, ((ji) this).field_d[param1]);
                        var26 = new wl(var51);
                        var26.a((byte) 51, 5, param0, var26.field_r.length);
                        var52 = var51;
                        break L4;
                      }
                    }
                    var52 = cf.a(false, param3 ^ 26717, ((ji) this).field_d[param1]);
                    var44 = var52;
                    var36 = var44;
                    var9 = var36;
                    break L4;
                  }
                  L7: {
                    var53 = i.a(var52, -120);
                    var45 = var53;
                    var37 = var45;
                    var27 = var37;
                    var23 = var27;
                    var54 = var23;
                    if (!((ji) this).field_b) {
                      break L7;
                    } else {
                      ((ji) this).field_d[param1] = null;
                      break L7;
                    }
                  }
                  L8: {
                    if (-2 <= var5) {
                      L9: {
                        if (var6 == null) {
                          var11 = 0;
                          break L9;
                        } else {
                          var11 = var50[0];
                          break L9;
                        }
                      }
                      if (-1 != (((ji) this).field_g ^ -1)) {
                        var7[var11] = (Object) (Object) var54;
                        break L8;
                      } else {
                        var7[var11] = qk.a(var53, -1389597532, false);
                        break L8;
                      }
                    } else {
                      if (-3 == ((ji) this).field_g) {
                        var11 = var53.length;
                        var11--;
                        var12 = 255 & var23[var11];
                        var11 = var11 - var12 * var5 * 4;
                        var32 = new wl(var54);
                        var14 = 0;
                        var32.field_n = var11;
                        var15 = 0;
                        var16 = 0;
                        L10: while (true) {
                          if (var12 <= var16) {
                            if (var14 != 0) {
                              var57 = new byte[var14];
                              var32.field_n = var11;
                              var14 = 0;
                              var17 = 0;
                              var18 = 0;
                              L11: while (true) {
                                if (var18 >= var12) {
                                  var7[var15] = (Object) (Object) var57;
                                  return true;
                                } else {
                                  var19 = 0;
                                  var20 = 0;
                                  L12: while (true) {
                                    if (var20 >= var5) {
                                      var18++;
                                      continue L11;
                                    } else {
                                      L13: {
                                        var19 = var19 + var32.i(param3 ^ 30142);
                                        if (var6 != null) {
                                          var21 = var50[var20];
                                          break L13;
                                        } else {
                                          var21 = var20;
                                          break L13;
                                        }
                                      }
                                      L14: {
                                        if (var21 != param2) {
                                          break L14;
                                        } else {
                                          an.a(var54, var17, var57, var14, var19);
                                          var14 = var14 + var19;
                                          break L14;
                                        }
                                      }
                                      var17 = var17 + var19;
                                      var20++;
                                      continue L12;
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
                            L15: while (true) {
                              if (var18 >= var5) {
                                var16++;
                                continue L10;
                              } else {
                                L16: {
                                  var17 = var17 + var32.i(7553);
                                  if (var6 == null) {
                                    var19 = var18;
                                    break L16;
                                  } else {
                                    var19 = var50[var18];
                                    break L16;
                                  }
                                }
                                if (param2 == var19) {
                                  var15 = var19;
                                  var14 = var14 + var17;
                                  var18++;
                                  continue L15;
                                } else {
                                  var18++;
                                  continue L15;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        var11 = var53.length;
                        var11--;
                        var12 = var23[var11] & 255;
                        var11 = var11 - 4 * (var12 * var5);
                        var29 = new wl(var54);
                        var55 = new int[var5];
                        var47 = var55;
                        var39 = var47;
                        var30 = var39;
                        var14_ref_int__ = var30;
                        var29.field_n = var11;
                        var15 = 0;
                        L17: while (true) {
                          if (var15 >= var12) {
                            var56 = new byte[var5][];
                            var48 = var56;
                            var40 = var48;
                            var31 = var40;
                            var15_ref_byte____ = var31;
                            var16 = 0;
                            L18: while (true) {
                              if (var5 <= var16) {
                                var29.field_n = var11;
                                var16 = 0;
                                var17 = 0;
                                L19: while (true) {
                                  if (var17 >= var12) {
                                    var17 = 0;
                                    L20: while (true) {
                                      if (var17 >= var5) {
                                        break L8;
                                      } else {
                                        L21: {
                                          if (var6 != null) {
                                            var18 = var50[var17];
                                            break L21;
                                          } else {
                                            var18 = var17;
                                            break L21;
                                          }
                                        }
                                        if (((ji) this).field_g == 0) {
                                          var7[var18] = qk.a(var56[var17], -1389597532, false);
                                          var17++;
                                          continue L20;
                                        } else {
                                          var7[var18] = (Object) (Object) var56[var17];
                                          var17++;
                                          continue L20;
                                        }
                                      }
                                    }
                                  } else {
                                    var18 = 0;
                                    var19 = 0;
                                    L22: while (true) {
                                      if (var19 >= var5) {
                                        var17++;
                                        continue L19;
                                      } else {
                                        var18 = var18 + var29.i(7553);
                                        an.a(var54, var16, var56[var19], var55[var19], var18);
                                        var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                                        var16 = var16 + var18;
                                        var19++;
                                        continue L22;
                                      }
                                    }
                                  }
                                }
                              } else {
                                var15_ref_byte____[var16] = new byte[var55[var16]];
                                var55[var16] = 0;
                                var16++;
                                continue L18;
                              }
                            }
                          } else {
                            var16 = 0;
                            var17 = 0;
                            L23: while (true) {
                              if (var5 <= var17) {
                                var15++;
                                continue L17;
                              } else {
                                var16 = var16 + var29.i(7553);
                                var14_ref_int__[var17] = var14_ref_int__[var17] + var16;
                                var17++;
                                continue L23;
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
              return ((boolean[]) ((Object[]) ((ji) this).field_d[3])[13])[3];
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final synchronized int b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = client.field_A ? 1 : 0;
        if (!((ji) this).a((byte) 121)) {
          return 0;
        } else {
          L0: {
            if (param0 <= -44) {
              break L0;
            } else {
              this.a(91, ((int[]) ((Object[]) ((ji) this).field_d[2])[0])[0]);
              break L0;
            }
          }
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L1: while (true) {
            if (((ji) this).field_d.length <= var4) {
              if (0 == var2) {
                return 100;
              } else {
                var4 = 100 * var3 / var2;
                return var4;
              }
            } else {
              if (((ji) this).field_f.field_B[var4] > 0) {
                var3 = var3 + ((ji) this).a((byte) 34, var4);
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

    final synchronized boolean a(byte param0) {
        if (((ji) this).field_f == null) {
            ((ji) this).field_f = ((ji) this).field_a.a(true);
            if (!(null != ((ji) this).field_f)) {
                return false;
            }
            ((ji) this).field_e = new Object[((ji) this).field_f.field_n][];
            ((ji) this).field_d = new Object[((ji) this).field_f.field_n];
        }
        if (param0 != 121) {
            return false;
        }
        return true;
    }

    final synchronized byte[] a(int param0, String param1, String param2) {
        if (!((ji) this).a((byte) 121)) {
            return null;
        }
        param2 = param2.toLowerCase();
        param1 = param1.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param2;
        int var4 = ((ji) this).field_f.field_e.a((byte) -68, ta.a(var6, 79));
        if (!this.a(var4, (byte) -83)) {
            return null;
        }
        if (param0 != 0) {
            return null;
        }
        CharSequence var7 = (CharSequence) (Object) param1;
        int var5 = ((ji) this).field_f.field_o[var4].a((byte) -68, ta.a(var7, -112));
        return ((ji) this).a(var5, 32, var4);
    }

    private final synchronized boolean a(int param0, int param1, byte param2) {
        if (!((ji) this).a((byte) 121)) {
            return false;
        }
        if (param2 != -33) {
            int discarded$0 = ((ji) this).a((byte) 6, ((int[]) ((ji) this).field_d[0])[26]);
        }
        if ((param0 ^ -1) <= -1) {
            if ((param1 ^ -1) <= -1) {
                if (param0 < ((ji) this).field_f.field_k.length) {
                    if (((ji) this).field_f.field_k[param0] > param1) {
                        return true;
                    }
                }
            }
        }
        if (cd.field_i) {
            throw new IllegalArgumentException(param0 + " " + param1);
        }
        return false;
    }

    final byte[] a(int param0, int param1, int param2) {
        int var4 = 118 / ((param1 - -44) / 62);
        return this.a(param0, (int[]) null, param2, (byte) -33);
    }

    final static String[] a(char param0, byte param1, String param2) {
        int var7 = 0;
        int var8 = 0;
        int var9 = client.field_A ? 1 : 0;
        if (param1 != 66) {
            return null;
        }
        CharSequence var10 = (CharSequence) (Object) param2;
        int var3 = wg.a(true, var10, param0);
        String[] var4 = new String[1 + var3];
        int var5 = 0;
        int var6 = 0;
        for (var7 = 0; var7 < var3; var7++) {
            for (var8 = var6; param2.charAt(var8) != param0; var8++) {
            }
            var5++;
            var4[var5] = param2.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = param2.substring(var6);
        return var4;
    }

    private final synchronized boolean a(int param0, byte param1) {
        L0: {
          if (param1 == -83) {
            break L0;
          } else {
            ((ji) this).field_a = (of) ((ji) this).field_d[0];
            break L0;
          }
        }
        if (((ji) this).a((byte) 121)) {
          L1: {
            if (-1 < param0) {
              break L1;
            } else {
              if (param0 >= ((ji) this).field_f.field_k.length) {
                break L1;
              } else {
                if (-1 != ((ji) this).field_f.field_k[param0]) {
                  return true;
                } else {
                  break L1;
                }
              }
            }
          }
          if (cd.field_i) {
            throw new IllegalArgumentException(Integer.toString(param0));
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static void a(int param0, int param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        if (null != pd.field_f) {
            var3 = pd.field_f.c(497, param2);
            if (-2 != var3) {
                if (!((var3 ^ -1) == 0)) {
                    var4 = pd.field_f.e(5658) ? 1 : 0;
                    sn.a(pd.field_f.field_Tb, param0, pd.field_f.g((byte) -96), 97, var4 != 0, var3);
                }
                pd.field_f = null;
                tf.i((byte) -76);
            }
        }
        if (param1 != 0) {
            field_c = null;
        }
    }

    final int a(int param0, int param1, String param2) {
        if (!(this.a(param0, (byte) -83))) {
            return -1;
        }
        if (param1 != 13030) {
            ((ji) this).field_d = new Object[6];
        }
        param2 = param2.toLowerCase();
        CharSequence var5 = (CharSequence) (Object) param2;
        int var4 = ((ji) this).field_f.field_o[param0].a((byte) -68, ta.a(var5, -127));
        if (!this.a(param0, var4, (byte) -33)) {
            return -1;
        }
        return var4;
    }

    final static void c(int param0, int param1) {
        uf var2 = we.field_b;
        var2.f(param0, param1 ^ -3);
        var2.a(true, param1);
        var2.a(true, 3);
    }

    final synchronized int a(byte param0, int param1) {
        if (!(this.a(param1, (byte) -83))) {
            return 0;
        }
        if (param0 != 34) {
            field_h = null;
        }
        if (!(((ji) this).field_d[param1] == null)) {
            return 100;
        }
        return ((ji) this).field_a.a(param1, param0 ^ -102);
    }

    final int a(int param0, String param1) {
        if (!((ji) this).a((byte) 121)) {
            return 0;
        }
        param1 = param1.toLowerCase();
        CharSequence var5 = (CharSequence) (Object) param1;
        int var3 = ((ji) this).field_f.field_e.a((byte) -68, ta.a(var5, -128));
        int var4 = 39 / ((param0 - -55) / 53);
        return ((ji) this).a((byte) 34, var3);
    }

    private final synchronized byte[] a(int param0, int[] param1, int param2, byte param3) {
        Object var5 = null;
        byte[] var5_array = null;
        byte[] var7 = null;
        if (this.a(param2, param0, param3)) {
          L0: {
            L1: {
              var5 = null;
              if (((ji) this).field_e[param2] == null) {
                break L1;
              } else {
                if (((ji) this).field_e[param2][param0] == null) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            if (!this.a(param1, param2, param0, 26687)) {
              this.a(20351, param2);
              if (this.a(param1, param2, param0, param3 + 26720)) {
                break L0;
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          if (null != ((ji) this).field_e[param2]) {
            L2: {
              if (((ji) this).field_e[param2][param0] == null) {
                break L2;
              } else {
                var7 = cf.a(false, 95, ((ji) this).field_e[param2][param0]);
                var5_array = var7;
                if (var7 == null) {
                  throw new RuntimeException("");
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (var5_array != null) {
                if (-2 == (((ji) this).field_g ^ -1)) {
                  ((ji) this).field_e[param2][param0] = null;
                  if ((((ji) this).field_f.field_k[param2] ^ -1) == -2) {
                    ((ji) this).field_e[param2] = null;
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  if ((((ji) this).field_g ^ -1) == -3) {
                    ((ji) this).field_e[param2] = null;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              } else {
                break L3;
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

    final synchronized boolean a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = client.field_A ? 1 : 0;
        if (((ji) this).a((byte) 121)) {
          if (!param0) {
            var2 = 1;
            var3 = 0;
            L0: while (true) {
              if (var3 >= ((ji) this).field_f.field_f.length) {
                return var2 != 0;
              } else {
                var4 = ((ji) this).field_f.field_f[var3];
                if (((ji) this).field_d[var4] == null) {
                  this.a(20351, var4);
                  if (null == ((ji) this).field_d[var4]) {
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
            return true;
          }
        } else {
          return false;
        }
    }

    final synchronized boolean a(byte param0, int param1, int param2) {
        if (!this.a(param2, param1, (byte) -33)) {
            return false;
        }
        if (null != ((ji) this).field_e[param2]) {
            if (!(((ji) this).field_e[param2][param1] == null)) {
                return true;
            }
        }
        if (null != ((ji) this).field_d[param2]) {
            return true;
        }
        this.a(20351, param2);
        if (null != ((ji) this).field_d[param2]) {
            return true;
        }
        if (param0 >= -59) {
            boolean discarded$0 = ((ji) this).a(false);
            return false;
        }
        return false;
    }

    ji(of param0, boolean param1, int param2) {
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
          ((ji) this).field_f = null;
          if (-1 < (param2 ^ -1)) {
            break L0;
          } else {
            if (2 >= param2) {
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
              ((ji) this).field_b = stackIn_6_1 != 0;
              ((ji) this).field_a = param0;
              ((ji) this).field_g = param2;
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
        field_c = "Offer rematch";
        field_h = "FINAL!";
    }
}
