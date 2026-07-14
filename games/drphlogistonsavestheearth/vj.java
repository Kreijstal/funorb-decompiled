/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vj {
    private int field_i;
    private wd field_e;
    private boolean field_c;
    private Object[] field_h;
    private kh field_b;
    private Object[][] field_a;
    static sa field_d;
    static double[] field_f;
    static he[][] field_g;

    private final synchronized void a(byte param0, int param1) {
        if (param0 != 109) {
            return;
        }
        if (((vj) this).field_c) {
            ((vj) this).field_h[param1] = (Object) (Object) ((vj) this).field_e.b(param1, 60);
        } else {
            ((vj) this).field_h[param1] = jk.a(false, ((vj) this).field_e.b(param1, param0 + -49), (byte) -127);
        }
    }

    final int a(int param0, byte param1) {
        if (param1 <= 125) {
            return 71;
        }
        if (!this.b(param0, (byte) 14)) {
            return 0;
        }
        return ((vj) this).field_b.field_d[param0];
    }

    final synchronized boolean c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (((vj) this).a(0)) {
          L0: {
            var2 = 1;
            var3 = 0;
            if (param0 >= 16) {
              break L0;
            } else {
              ((vj) this).field_e = null;
              break L0;
            }
          }
          L1: while (true) {
            if (var3 >= ((vj) this).field_b.field_r.length) {
              return var2 != 0;
            } else {
              var4 = ((vj) this).field_b.field_r[var3];
              if (((vj) this).field_h[var4] == null) {
                this.a((byte) 109, var4);
                if (null == ((vj) this).field_h[var4]) {
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

    final synchronized boolean b(int param0, int param1, int param2) {
        if (!(this.a(param0, param1, 0))) {
            return false;
        }
        int var4 = 18 % ((param2 - 13) / 42);
        if (((vj) this).field_a[param0] != null) {
            if (!(null == ((vj) this).field_a[param0][param1])) {
                return true;
            }
        }
        if (!(null == ((vj) this).field_h[param0])) {
            return true;
        }
        this.a((byte) 109, param0);
        if (null != ((vj) this).field_h[param0]) {
            return true;
        }
        return false;
    }

    final synchronized boolean c(int param0, int param1) {
        if (!this.b(param0, (byte) 14)) {
            return false;
        }
        if (!(((vj) this).field_h[param0] == null)) {
            return true;
        }
        this.a((byte) 109, param0);
        if (null != ((vj) this).field_h[param0]) {
            return true;
        }
        if (param1 != 29691) {
            return true;
        }
        return false;
    }

    private final synchronized boolean a(boolean param0, int param1, int param2, int[] param3) {
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
        od var26 = null;
        byte[] var27 = null;
        od var29 = null;
        od var31 = null;
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
        var22 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (!this.b(param2, (byte) 14)) {
          return false;
        } else {
          if (((vj) this).field_h[param2] == null) {
            return false;
          } else {
            L0: {
              var5 = ((vj) this).field_b.field_k[param2];
              var48 = ((vj) this).field_b.field_f[param2];
              var41 = var48;
              var34 = var41;
              var24 = var34;
              var6 = var24;
              if (((vj) this).field_a[param2] == null) {
                ((vj) this).field_a[param2] = new Object[((vj) this).field_b.field_d[param2]];
                break L0;
              } else {
                break L0;
              }
            }
            var7 = ((vj) this).field_a[param2];
            var8 = param0 ? 1 : 0;
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
                      var10 = var48[var9_int];
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
                    if (param3 == null) {
                      break L5;
                    } else {
                      L6: {
                        if (param3[0] != 0) {
                          break L6;
                        } else {
                          if (param3[1] != 0) {
                            break L6;
                          } else {
                            if (0 != param3[2]) {
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
                      var49 = ji.a(23436, ((vj) this).field_h[param2], true);
                      var42 = var49;
                      var35 = var42;
                      var25 = var35;
                      var9 = var25;
                      var26 = new od(var49);
                      var26.a(param3, true, 5, var26.field_h.length);
                      break L4;
                    }
                  }
                  var9 = ji.a(23436, ((vj) this).field_h[param2], false);
                  break L4;
                }
                L7: {
                  var50 = ce.a(1, var9);
                  var43 = var50;
                  var36 = var43;
                  var27 = var36;
                  var23 = var27;
                  var51 = var23;
                  if (((vj) this).field_c) {
                    var50 = var43;
                    ((vj) this).field_h[param2] = null;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  var50 = var43;
                  if (-2 <= var5) {
                    L9: {
                      if (var6 == null) {
                        var11 = 0;
                        break L9;
                      } else {
                        var11 = var48[0];
                        break L9;
                      }
                    }
                    if (0 != ((vj) this).field_i) {
                      var7[var11] = (Object) (Object) var51;
                      break L8;
                    } else {
                      var7[var11] = jk.a(false, var50, (byte) -122);
                      break L8;
                    }
                  } else {
                    if (-3 != ((vj) this).field_i) {
                      var50 = var43;
                      var11 = var50.length;
                      var11--;
                      var12 = 255 & var23[var11];
                      var11 = var11 - 4 * var12 * var5;
                      var31 = new od(var51);
                      var31.field_j = var11;
                      var53 = new int[var5];
                      var46 = var53;
                      var39 = var46;
                      var32 = var39;
                      var14 = var32;
                      var15_int = 0;
                      L10: while (true) {
                        if (var12 <= var15_int) {
                          var54 = new byte[var5][];
                          var47 = var54;
                          var40 = var47;
                          var33 = var40;
                          var15 = var33;
                          var16 = 0;
                          L11: while (true) {
                            if (var5 <= var16) {
                              var31.field_j = var11;
                              var16 = 0;
                              var17 = 0;
                              L12: while (true) {
                                if (var12 <= var17) {
                                  var17 = 0;
                                  L13: while (true) {
                                    if (var17 >= var5) {
                                      break L8;
                                    } else {
                                      L14: {
                                        if (var6 == null) {
                                          var18 = var17;
                                          break L14;
                                        } else {
                                          var18 = var48[var17];
                                          break L14;
                                        }
                                      }
                                      if (-1 != (((vj) this).field_i ^ -1)) {
                                        var7[var18] = (Object) (Object) var54[var17];
                                        var17++;
                                        continue L13;
                                      } else {
                                        var7[var18] = jk.a(false, var54[var17], (byte) -124);
                                        var17++;
                                        continue L13;
                                      }
                                    }
                                  }
                                } else {
                                  var18 = 0;
                                  var19 = 0;
                                  L15: while (true) {
                                    if (var19 >= var5) {
                                      var17++;
                                      continue L12;
                                    } else {
                                      var18 = var18 + var31.h(-119);
                                      kg.a(var51, var16, var54[var19], var53[var19], var18);
                                      var16 = var16 + var18;
                                      var14[var19] = var14[var19] + var18;
                                      var19++;
                                      continue L15;
                                    }
                                  }
                                }
                              }
                            } else {
                              var15[var16] = new byte[var53[var16]];
                              var53[var16] = 0;
                              var16++;
                              continue L11;
                            }
                          }
                        } else {
                          var16 = 0;
                          var17 = 0;
                          L16: while (true) {
                            if (var5 <= var17) {
                              var15_int++;
                              continue L10;
                            } else {
                              var16 = var16 + var31.h(-103);
                              var14[var17] = var14[var17] + var16;
                              var17++;
                              continue L16;
                            }
                          }
                        }
                      }
                    } else {
                      var11 = var50.length;
                      var11--;
                      var12 = 255 & var23[var11];
                      var11 = var11 - var12 * (var5 * 4);
                      var29 = new od(var51);
                      var14_int = 0;
                      var29.field_j = var11;
                      var15_int = 0;
                      var16 = 0;
                      L17: while (true) {
                        if (var16 >= var12) {
                          if (0 == var14_int) {
                            return true;
                          } else {
                            var52 = new byte[var14_int];
                            var29.field_j = var11;
                            var14_int = 0;
                            var17 = 0;
                            var18 = 0;
                            L18: while (true) {
                              if (var12 <= var18) {
                                var7[var15_int] = (Object) (Object) var52;
                                return true;
                              } else {
                                var19 = 0;
                                var20 = 0;
                                L19: while (true) {
                                  if (var5 <= var20) {
                                    var18++;
                                    continue L18;
                                  } else {
                                    L20: {
                                      var19 = var19 + var29.h(-90);
                                      if (var6 == null) {
                                        var21 = var20;
                                        break L20;
                                      } else {
                                        var21 = var48[var20];
                                        break L20;
                                      }
                                    }
                                    L21: {
                                      if (param1 == var21) {
                                        kg.a(var51, var17, var52, var14_int, var19);
                                        var14_int = var14_int + var19;
                                        break L21;
                                      } else {
                                        break L21;
                                      }
                                    }
                                    var17 = var17 + var19;
                                    var20++;
                                    continue L19;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var17 = 0;
                          var18 = 0;
                          L22: while (true) {
                            if (var5 <= var18) {
                              var16++;
                              continue L17;
                            } else {
                              L23: {
                                var17 = var17 + var29.h(43);
                                if (var6 == null) {
                                  var19 = var18;
                                  break L23;
                                } else {
                                  var19 = var48[var18];
                                  break L23;
                                }
                              }
                              if (param1 == var19) {
                                var14_int = var14_int + var17;
                                var15_int = var19;
                                var18++;
                                continue L22;
                              } else {
                                var18++;
                                continue L22;
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
          }
        }
    }

    final boolean a(int param0, String param1) {
        if (!((vj) this).a(0)) {
            return false;
        }
        if (param0 != 255) {
            return false;
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((vj) this).field_b.field_s.a(ml.a((byte) -86, var4), param0 + -256);
        return ((vj) this).c(var3, 29691);
    }

    private final synchronized byte[] a(int param0, int param1, int[] param2, int param3) {
        Object var5 = null;
        byte[] var5_array = null;
        byte[] var7 = null;
        if (this.a(param3, param0, param1 + 14080)) {
          L0: {
            L1: {
              var5 = null;
              if (((vj) this).field_a[param3] == null) {
                break L1;
              } else {
                if (null == ((vj) this).field_a[param3][param0]) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            if (this.a(true, param0, param3, param2)) {
              break L0;
            } else {
              this.a((byte) 109, param3);
              if (this.a(true, param0, param3, param2)) {
                break L0;
              } else {
                return null;
              }
            }
          }
          if (null != ((vj) this).field_a[param3]) {
            L2: {
              if (null != ((vj) this).field_a[param3][param0]) {
                var7 = ji.a(param1 ^ -28020, ((vj) this).field_a[param3][param0], false);
                var5_array = var7;
                if (var7 != null) {
                  break L2;
                } else {
                  throw new RuntimeException("");
                }
              } else {
                break L2;
              }
            }
            L3: {
              if (param1 == -14080) {
                break L3;
              } else {
                field_g = null;
                break L3;
              }
            }
            L4: {
              if (var5_array == null) {
                break L4;
              } else {
                if ((((vj) this).field_i ^ -1) == -2) {
                  ((vj) this).field_a[param3][param0] = null;
                  if (-2 != (((vj) this).field_b.field_d[param3] ^ -1)) {
                    break L4;
                  } else {
                    ((vj) this).field_a[param3] = null;
                    break L4;
                  }
                } else {
                  if (2 == ((vj) this).field_i) {
                    ((vj) this).field_a[param3] = null;
                    break L4;
                  } else {
                    break L4;
                  }
                }
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

    final boolean a(byte param0, String param1) {
        if (!(((vj) this).a(0))) {
            return false;
        }
        param1 = param1.toLowerCase();
        if (param0 != 12) {
            int discarded$0 = ((vj) this).a(-107, -32);
        }
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((vj) this).field_b.field_s.a(ml.a((byte) -86, var4), -1);
        if (-1 < (var3 ^ -1)) {
            return false;
        }
        return true;
    }

    private final synchronized boolean b(int param0, byte param1) {
        if (!((vj) this).a(0)) {
            return false;
        }
        if (-1 >= param0) {
            // if_icmple L43
            // if_icmpeq L43
        } else {
            if (hm.field_f) {
                throw new IllegalArgumentException(Integer.toString(param0));
            }
            return false;
        }
        if (param1 != 14) {
            int discarded$0 = ((vj) this).a((byte) 17, (String) null, ((int[]) ((vj) this).field_h[2])[19]);
            return true;
        }
        return true;
    }

    final synchronized int a(int param0, int param1) {
        if (!this.b(param1, (byte) 14)) {
            return 0;
        }
        if (!(null == ((vj) this).field_h[param1])) {
            return 100;
        }
        int var3 = -97 / ((param0 - -44) / 48);
        return ((vj) this).field_e.a(param1, -1);
    }

    final boolean a(int param0, String param1, String param2) {
        if (param0 >= -10) {
            Object var6 = null;
            byte[] discarded$0 = ((vj) this).a((String) null, (String) null, 89);
        }
        if (!((vj) this).a(0)) {
            return false;
        }
        param1 = param1.toLowerCase();
        param2 = param2.toLowerCase();
        CharSequence var7 = (CharSequence) (Object) param1;
        int var4 = ((vj) this).field_b.field_s.a(ml.a((byte) -86, var7), -1);
        if (!(this.b(var4, (byte) 14))) {
            return false;
        }
        CharSequence var8 = (CharSequence) (Object) param2;
        int var5 = ((vj) this).field_b.field_b[var4].a(ml.a((byte) -86, var8), -1);
        return ((vj) this).b(var4, var5, -52);
    }

    public static void c(int param0) {
        field_g = null;
        if (param0 != 0) {
            return;
        }
        field_d = null;
        field_f = null;
    }

    final synchronized int d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (((vj) this).a(0)) {
          L0: {
            var2 = 0;
            if (param0 == 95) {
              break L0;
            } else {
              ((boolean[]) ((vj) this).field_h[1])[3] = ((boolean[]) ((vj) this).field_h[3])[1];
              break L0;
            }
          }
          var3 = 0;
          var4 = 0;
          L1: while (true) {
            if (((vj) this).field_h.length <= var4) {
              if (var2 == 0) {
                return 100;
              } else {
                var4 = 100 * var3 / var2;
                return var4;
              }
            } else {
              if (-1 > (((vj) this).field_b.field_k[var4] ^ -1)) {
                var2 += 100;
                var3 = var3 + ((vj) this).a(-100, var4);
                var4++;
                continue L1;
              } else {
                var4++;
                continue L1;
              }
            }
          }
        } else {
          return 0;
        }
    }

    final byte[] a(int param0, int param1, byte param2) {
        if (param2 != 35) {
            int discarded$0 = vj.e((byte) -62);
        }
        return this.a(param1, param2 + -14115, (int[]) null, param0);
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        if (((vj) this).a(param2 + param2)) {
          L0: {
            if (0 > param0) {
              break L0;
            } else {
              if (-1 < (param1 ^ -1)) {
                break L0;
              } else {
                if (((vj) this).field_b.field_d.length <= param0) {
                  break L0;
                } else {
                  if (((vj) this).field_b.field_d[param0] > param1) {
                    return true;
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
          if (!hm.field_f) {
            return false;
          } else {
            throw new IllegalArgumentException(param0 + " " + param1);
          }
        } else {
          return false;
        }
    }

    final int b(int param0) {
        if (!((vj) this).a(0)) {
            return -1;
        }
        if (param0 != -16032) {
            ((byte[]) ((vj) this).field_h[1])[8] = (byte) -39;
        }
        return ((vj) this).field_b.field_d.length;
    }

    final synchronized byte[] a(String param0, String param1, int param2) {
        if (!((vj) this).a(0)) {
            return null;
        }
        param0 = param0.toLowerCase();
        if (param2 != 24874) {
            Object var6 = null;
            int discarded$0 = ((vj) this).a((byte) -82, (String) null, 10);
        }
        param1 = param1.toLowerCase();
        CharSequence var7 = (CharSequence) (Object) param0;
        int var4 = ((vj) this).field_b.field_s.a(ml.a((byte) -86, var7), -1);
        if (!this.b(var4, (byte) 14)) {
            return null;
        }
        CharSequence var8 = (CharSequence) (Object) param1;
        int var5 = ((vj) this).field_b.field_b[var4].a(ml.a((byte) -86, var8), -1);
        return ((vj) this).a(var4, var5, (byte) 35);
    }

    final static void b(byte param0) {
        if (!pf.a((byte) 97)) {
            return;
        }
        int var1 = 91 % ((param0 - -32) / 61);
        jk.a((byte) 49, false, 4);
    }

    final synchronized byte[] b(int param0, int param1) {
        if (!((vj) this).a(0)) {
            return null;
        }
        if (!((((vj) this).field_b.field_d.length ^ -1) != -2)) {
            return ((vj) this).a(0, param0, (byte) 35);
        }
        if (!this.b(param0, (byte) 14)) {
            return null;
        }
        if (!(param1 != (((vj) this).field_b.field_d[param0] ^ -1))) {
            return ((vj) this).a(param0, 0, (byte) 35);
        }
        throw new RuntimeException();
    }

    final static mk a(byte param0) {
        mk var1 = new mk();
        int var2 = -124 % ((param0 - -13) / 44);
        var1.field_h = new int[1440000];
        return var1;
    }

    final int a(String param0, byte param1) {
        if (!(((vj) this).a(0))) {
            return -1;
        }
        param0 = param0.toLowerCase();
        if (param1 >= -75) {
            return -83;
        }
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((vj) this).field_b.field_s.a(ml.a((byte) -86, var4), -1);
        if (!this.b(var3, (byte) 14)) {
            return -1;
        }
        return var3;
    }

    final static String a(String param0, int param1) {
        int var4 = 0;
        int var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        int var2 = param0.length();
        if (param1 > -110) {
            vj.c(4);
        }
        char[] var3 = new char[var2];
        for (var4 = 0; var4 < var2; var4++) {
            var3[var2 + (-1 + -var4)] = param0.charAt(var4);
        }
        return new String(var3);
    }

    final int b(int param0, String param1) {
        if (param0 != 10461) {
            ((int[]) ((vj) this).field_h[9])[0] = -80;
        }
        if (!((vj) this).a(0)) {
            return 0;
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((vj) this).field_b.field_s.a(ml.a((byte) -86, var4), -1);
        return ((vj) this).a(-100, var3);
    }

    final static String a(boolean param0, CharSequence param1) {
        if (!param0) {
            return null;
        }
        return ge.a((byte) 88, false, param1);
    }

    final synchronized boolean a(int param0) {
        if (!(null != ((vj) this).field_b)) {
            ((vj) this).field_b = ((vj) this).field_e.a((byte) -116);
            if (!(((vj) this).field_b != null)) {
                return false;
            }
            ((vj) this).field_a = new Object[((vj) this).field_b.field_m][];
            ((vj) this).field_h = new Object[((vj) this).field_b.field_m];
        }
        if (param0 != 0) {
            ((long[]) ((vj) this).field_h[6])[10] = ((long[]) ((Object[]) ((vj) this).field_h[16])[3])[2];
            return true;
        }
        return true;
    }

    final int a(byte param0, String param1, int param2) {
        if (!this.b(param2, (byte) 14)) {
            return -1;
        }
        param1 = param1.toLowerCase();
        if (param0 >= -26) {
            return -38;
        }
        CharSequence var5 = (CharSequence) (Object) param1;
        int var4 = ((vj) this).field_b.field_b[param2].a(ml.a((byte) -86, var5), -1);
        if (!(this.a(param2, var4, 0))) {
            return -1;
        }
        return var4;
    }

    final static int e(byte param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            Object var2 = null;
            od var3 = null;
            int stackIn_12_0 = 0;
            int stackIn_24_0 = 0;
            int stackIn_27_0 = 0;
            int stackIn_34_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_11_0 = 0;
            int stackOut_23_0 = 0;
            int stackOut_26_0 = 0;
            int stackOut_33_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (4 > p.field_a.field_c) {
                            statePc = 7;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (p.field_a.field_h == -1) {
                            statePc = 3;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        return 3;
                    }
                    case 4: {
                        if (-2 == p.field_a.field_h) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        return 1;
                    }
                    case 6: {
                        return 4;
                    }
                    case 7: {
                        try {
                            if (hf.field_C != 0) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            tc.field_e = oi.field_e.a(g.field_r, j.field_ib, 35);
                            hf.field_C = hf.field_C + 1;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (hf.field_C != 1) {
                                statePc = 16;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (tc.field_e.field_b != -3) {
                                statePc = 13;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            stackOut_11_0 = uj.a((byte) 85, -1);
                            stackIn_12_0 = stackOut_11_0;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        return stackIn_12_0;
                    }
                    case 13: {
                        try {
                            if (-2 == tc.field_e.field_b) {
                                statePc = 15;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            hf.field_C = hf.field_C + 1;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (-3 != (hf.field_C ^ -1)) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            ea.field_a = new qe((java.net.Socket) tc.field_e.field_g, oi.field_e);
                            var3 = new od(13);
                            q.a(tb.field_a, gi.field_c, 26800, pk.field_q, var3);
                            var3.c(15, (byte) -92);
                            var3.a(mi.field_j, (byte) 107);
                            ea.field_a.a(13, -30537, var3.field_h, 0);
                            hf.field_C = hf.field_C + 1;
                            pf.field_a = la.a(false) - -30000L;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (3 == hf.field_C) {
                                statePc = 20;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (0 < ea.field_a.a((byte) 41)) {
                                statePc = 25;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (pf.field_a < la.a(false)) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            stackOut_23_0 = uj.a((byte) 85, -2);
                            stackIn_24_0 = stackOut_23_0;
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        return stackIn_24_0;
                    }
                    case 25: {
                        try {
                            var1_int = ea.field_a.a(-125);
                            if (var1_int == 0) {
                                statePc = 28;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            stackOut_26_0 = uj.a((byte) 85, var1_int);
                            stackIn_27_0 = stackOut_26_0;
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        return stackIn_27_0;
                    }
                    case 28: {
                        try {
                            hf.field_C = hf.field_C + 1;
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (param0 < -28) {
                                statePc = 31;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var2 = null;
                            String discarded$2 = vj.a(true, (CharSequence) null);
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if ((hf.field_C ^ -1) == -5) {
                                statePc = 33;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            return -1;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            p.field_a.a((Object) (Object) ea.field_a, uf.field_i, (byte) -102);
                            ea.field_a = null;
                            hf.field_C = 0;
                            tc.field_e = null;
                            stackOut_33_0 = 0;
                            stackIn_34_0 = stackOut_33_0;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        return stackIn_34_0;
                    }
                    case 35: {
                        var1 = (IOException) (Object) caughtException;
                        return uj.a((byte) 85, -3);
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    vj(wd param0, boolean param1, int param2) {
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
          ((vj) this).field_b = null;
          if ((param2 ^ -1) > -1) {
            break L0;
          } else {
            if ((param2 ^ -1) >= -3) {
              L1: {
                ((vj) this).field_e = param0;
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
              ((vj) this).field_c = stackIn_6_1 != 0;
              ((vj) this).field_i = param2;
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
        field_d = new sa(15, 0, 1, 0);
        field_f = new double[2];
        field_g = new he[77][];
    }
}
