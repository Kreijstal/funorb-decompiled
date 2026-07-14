/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class cn {
    static String field_c;
    static jpa field_h;
    boolean field_g;
    private dla field_i;
    static String field_e;
    static int field_k;
    static int field_b;
    private Object[][] field_l;
    static String field_f;
    int field_j;
    private dr field_d;
    private Object[] field_a;

    final boolean b(String param0, byte param1, String param2) {
        if (!((cn) this).b(param1 ^ -44)) {
            return false;
        }
        param0 = param0.toLowerCase();
        if (param1 != 2) {
            byte[] discarded$0 = ((cn) this).a(((boolean[]) ((Object[]) ((cn) this).field_a[4])[5])[6], 76, -83);
        }
        param2 = param2.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param0;
        int var4 = ((cn) this).field_i.field_b.a(vta.a(var6, -12754), 1);
        if (!(this.b(-1, var4))) {
            return false;
        }
        CharSequence var7 = (CharSequence) (Object) param2;
        int var5 = ((cn) this).field_i.field_e[var4].a(vta.a(var7, -12754), 1);
        return ((cn) this).a(var4, (byte) -126, var5);
    }

    public static void d(int param0) {
        field_h = null;
        field_f = null;
        field_e = null;
        field_c = null;
        if (param0 != 0) {
            cn.e(22);
        }
    }

    final synchronized int a(int param0, byte param1) {
        if (!this.b(-1, param0)) {
            return 0;
        }
        if (!(null == ((cn) this).field_a[param0])) {
            return 100;
        }
        if (param1 <= 108) {
            return -36;
        }
        return ((cn) this).field_d.b(27079, param0);
    }

    final synchronized int a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        if (!((cn) this).b(-90)) {
          return 0;
        } else {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (((cn) this).field_a.length <= var4) {
              if (param0) {
                if (var2 == 0) {
                  return 100;
                } else {
                  var4 = var3 * 100 / var2;
                  return var4;
                }
              } else {
                return -39;
              }
            } else {
              if (0 < ((cn) this).field_i.field_c[var4]) {
                var2 += 100;
                var3 = var3 + ((cn) this).a(var4, (byte) 118);
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

    final boolean a(String param0, int param1) {
        if (!((cn) this).b(-123)) {
            return false;
        }
        param0 = param0.toLowerCase();
        if (param1 <= 80) {
            Object var4 = null;
            int discarded$0 = ((cn) this).a((String) null, true);
        }
        CharSequence var5 = (CharSequence) (Object) param0;
        int var3 = ((cn) this).field_i.field_b.a(vta.a(var5, -12754), 1);
        if (-1 >= (var3 ^ -1)) {
            return true;
        }
        return false;
    }

    final static void e(int param0) {
        sla.b(29585);
        if (param0 != 19470) {
            cn.e(46);
        }
    }

    final synchronized boolean b(int param0) {
        if (param0 > -30) {
            boolean discarded$0 = ((cn) this).a(((int[]) ((cn) this).field_a[0])[3], (byte) -61, 31);
        }
        if (null == ((cn) this).field_i) {
            ((cn) this).field_i = ((cn) this).field_d.a(true);
            if (!(((cn) this).field_i != null)) {
                return false;
            }
            ((cn) this).field_l = new Object[((cn) this).field_i.field_l][];
            ((cn) this).field_a = new Object[((cn) this).field_i.field_l];
        }
        return true;
    }

    final synchronized boolean a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        if (!((cn) this).b(param0 + -86)) {
          return false;
        } else {
          var2 = 1;
          var3 = param0;
          L0: while (true) {
            if (((cn) this).field_i.field_k.length <= var3) {
              return var2 != 0;
            } else {
              var4 = ((cn) this).field_i.field_k[var3];
              if (((cn) this).field_a[var4] == null) {
                this.c(param0 + 22214, var4);
                if (null == ((cn) this).field_a[var4]) {
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

    final static int a(byte param0, int param1, int param2, int param3) {
        int var4 = 26 % ((-23 - param0) / 48);
        return param1 / (param2 / (1 << param3));
    }

    final int a(boolean param0, String param1, int param2) {
        if (!this.b(-1, param2)) {
            return -1;
        }
        if (!param0) {
            ((boolean[]) ((cn) this).field_a[2])[0] = ((boolean[]) ((cn) this).field_a[11])[0];
        }
        param1 = param1.toLowerCase();
        CharSequence var5 = (CharSequence) (Object) param1;
        int var4 = ((cn) this).field_i.field_e[param2].a(vta.a(var5, -12754), 1);
        if (!this.a(param2, var4, (byte) -75)) {
            return -1;
        }
        return var4;
    }

    final synchronized boolean e(int param0, int param1) {
        if (!this.b(-1, param0)) {
            return false;
        }
        if (!(null == ((cn) this).field_a[param0])) {
            return true;
        }
        if (param1 != -2) {
            int discarded$0 = ((cn) this).a(((boolean[]) ((cn) this).field_a[20])[1]);
        }
        this.c(22214, param0);
        if (((cn) this).field_a[param0] != null) {
            return true;
        }
        return false;
    }

    final synchronized boolean a(int param0, int param1) {
        if (!(((cn) this).b(-71))) {
            return false;
        }
        if (!((((cn) this).field_i.field_p.length ^ -1) != -2)) {
            return ((cn) this).a(0, (byte) -127, param1);
        }
        if (!this.b(-1, param1)) {
            return false;
        }
        if (param0 != -15121) {
            return ((boolean[]) ((cn) this).field_a[6])[1];
        }
        if (!(((cn) this).field_i.field_p[param1] != 1)) {
            return ((cn) this).a(param1, (byte) -80, 0);
        }
        throw new RuntimeException();
    }

    private final synchronized void c(int param0, int param1) {
        if (param0 != 22214) {
            return;
        }
        if (((cn) this).field_g) {
            ((cn) this).field_a[param1] = (Object) (Object) ((cn) this).field_d.a(param1, (byte) -39);
        } else {
            ((cn) this).field_a[param1] = bw.a(270, ((cn) this).field_d.a(param1, (byte) -39), false);
        }
    }

    private final synchronized boolean a(int param0, int[] param1, int param2, int param3) {
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
        uia var27 = null;
        byte[] var28 = null;
        uia var30 = null;
        int[] var31 = null;
        byte[][] var32 = null;
        uia var33 = null;
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
        var23 = TombRacer.field_G ? 1 : 0;
        if (!this.b(-1, param0)) {
          return false;
        } else {
          if (null == ((cn) this).field_a[param0]) {
            return false;
          } else {
            L0: {
              var5 = ((cn) this).field_i.field_c[param0];
              var49 = ((cn) this).field_i.field_n[param0];
              var42 = var49;
              var35 = var42;
              var25 = var35;
              var6 = var25;
              if (null == ((cn) this).field_l[param0]) {
                ((cn) this).field_l[param0] = new Object[((cn) this).field_i.field_p[param0]];
                break L0;
              } else {
                break L0;
              }
            }
            var9 = -97 / ((-45 - param3) / 57);
            var7 = ((cn) this).field_l[param0];
            var8 = 1;
            var10_int = 0;
            L1: while (true) {
              L2: {
                if (var10_int >= var5) {
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
                  if (null != var7[var11]) {
                    var10_int++;
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
                      var50 = ir.a(((cn) this).field_a[param0], 13588, true);
                      var43 = var50;
                      var36 = var43;
                      var26 = var36;
                      var10 = var26;
                      var27 = new uia(var50);
                      var27.a(var27.field_g.length, -84984444, param1, 5);
                      break L4;
                    }
                  }
                  var10 = ir.a(((cn) this).field_a[param0], 13588, false);
                  break L4;
                }
                L7: {
                  var51 = sua.a(var10, -101);
                  var44 = var51;
                  var37 = var44;
                  var28 = var37;
                  var24 = var28;
                  var52 = var24;
                  if (((cn) this).field_g) {
                    var51 = var44;
                    ((cn) this).field_a[param0] = null;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  var51 = var44;
                  if (var5 <= 1) {
                    L9: {
                      if (var6 != null) {
                        var12 = var49[0];
                        break L9;
                      } else {
                        var12 = 0;
                        break L9;
                      }
                    }
                    if (((cn) this).field_j != 0) {
                      var7[var12] = (Object) (Object) var52;
                      break L8;
                    } else {
                      var7[var12] = bw.a(270, var51, false);
                      break L8;
                    }
                  } else {
                    if (((cn) this).field_j == 2) {
                      var51 = var44;
                      var12 = var51.length;
                      var12--;
                      var13 = var24[var12] & 255;
                      var12 = var12 - 4 * (var5 * var13);
                      var33 = new uia(var52);
                      var15 = 0;
                      var33.field_h = var12;
                      var16 = 0;
                      var17 = 0;
                      L10: while (true) {
                        if (var17 >= var13) {
                          if (var15 == 0) {
                            return true;
                          } else {
                            var55 = new byte[var15];
                            var33.field_h = var12;
                            var15 = 0;
                            var18 = 0;
                            var19 = 0;
                            L11: while (true) {
                              if (var13 <= var19) {
                                var7[var16] = (Object) (Object) var55;
                                return true;
                              } else {
                                var20 = 0;
                                var21 = 0;
                                L12: while (true) {
                                  if (var5 <= var21) {
                                    var19++;
                                    continue L11;
                                  } else {
                                    L13: {
                                      var20 = var20 + var33.e(-14);
                                      if (var6 != null) {
                                        var22 = var49[var21];
                                        break L13;
                                      } else {
                                        var22 = var21;
                                        break L13;
                                      }
                                    }
                                    L14: {
                                      if (var22 == param2) {
                                        lua.a(var52, var18, var55, var15, var20);
                                        var15 = var15 + var20;
                                        break L14;
                                      } else {
                                        break L14;
                                      }
                                    }
                                    var18 = var18 + var20;
                                    var21++;
                                    continue L12;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var18 = 0;
                          var19 = 0;
                          L15: while (true) {
                            if (var5 <= var19) {
                              var17++;
                              continue L10;
                            } else {
                              L16: {
                                var18 = var18 + var33.e(118);
                                if (var6 == null) {
                                  var20 = var19;
                                  break L16;
                                } else {
                                  var20 = var49[var19];
                                  break L16;
                                }
                              }
                              if (var20 == param2) {
                                var16 = var20;
                                var15 = var15 + var18;
                                var19++;
                                continue L15;
                              } else {
                                var19++;
                                continue L15;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var12 = var51.length;
                      var12--;
                      var13 = var24[var12] & 255;
                      var12 = var12 - var13 * var5 * 4;
                      var30 = new uia(var52);
                      var53 = new int[var5];
                      var46 = var53;
                      var39 = var46;
                      var31 = var39;
                      var15_ref_int__ = var31;
                      var30.field_h = var12;
                      var16 = 0;
                      L17: while (true) {
                        if (var16 >= var13) {
                          var54 = new byte[var5][];
                          var47 = var54;
                          var40 = var47;
                          var32 = var40;
                          var16_ref_byte____ = var32;
                          var17 = 0;
                          L18: while (true) {
                            if (var5 <= var17) {
                              var30.field_h = var12;
                              var17 = 0;
                              var18 = 0;
                              L19: while (true) {
                                if (var13 <= var18) {
                                  var18 = 0;
                                  L20: while (true) {
                                    if (var5 <= var18) {
                                      break L8;
                                    } else {
                                      L21: {
                                        if (var6 != null) {
                                          var19 = var49[var18];
                                          break L21;
                                        } else {
                                          var19 = var18;
                                          break L21;
                                        }
                                      }
                                      if (((cn) this).field_j != 0) {
                                        var7[var19] = (Object) (Object) var54[var18];
                                        var18++;
                                        continue L20;
                                      } else {
                                        var7[var19] = bw.a(270, var54[var18], false);
                                        var18++;
                                        continue L20;
                                      }
                                    }
                                  }
                                } else {
                                  var19 = 0;
                                  var20 = 0;
                                  L22: while (true) {
                                    if (var20 >= var5) {
                                      var18++;
                                      continue L19;
                                    } else {
                                      var19 = var19 + var30.e(-98);
                                      lua.a(var52, var17, var54[var20], var53[var20], var19);
                                      var17 = var17 + var19;
                                      var15_ref_int__[var20] = var15_ref_int__[var20] + var19;
                                      var20++;
                                      continue L22;
                                    }
                                  }
                                }
                              }
                            } else {
                              var16_ref_byte____[var17] = new byte[var53[var17]];
                              var53[var17] = 0;
                              var17++;
                              continue L18;
                            }
                          }
                        } else {
                          var17 = 0;
                          var18 = 0;
                          L23: while (true) {
                            if (var18 >= var5) {
                              var16++;
                              continue L17;
                            } else {
                              var17 = var17 + var30.e(101);
                              var15_ref_int__[var18] = var15_ref_int__[var18] + var17;
                              var18++;
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
          }
        }
    }

    final int c(int param0) {
        if (param0 != 4) {
            ((cn) this).field_a[4] = ((Object[]) ((cn) this).field_a[0])[5];
        }
        if (!(((cn) this).b(-44))) {
            return -1;
        }
        return ((cn) this).field_i.field_p.length;
    }

    private final synchronized boolean a(int param0, int param1, byte param2) {
        if (!((cn) this).b(-74)) {
            return false;
        }
        if (-1 >= (param0 ^ -1)) {
            // iflt L50
            // if_icmpge L50
            // if_icmpge L50
        } else {
            if (!nl.field_b) {
                return false;
            }
            throw new IllegalArgumentException(param0 + " " + param1);
        }
        int var4 = 9 % ((23 - param2) / 61);
        return true;
    }

    final synchronized int[] d(int param0, int param1) {
        int[] var7 = null;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        if (!this.b(-1, param1)) {
            return null;
        }
        int var3 = 121 % ((param0 - -15) / 58);
        int[] var4 = ((cn) this).field_i.field_n[param1];
        if (!(var4 != null)) {
            var7 = new int[((cn) this).field_i.field_c[param1]];
            var4 = var7;
            for (var5 = 0; var5 < var7.length; var5++) {
                var7[var5] = var5;
            }
        }
        return var4;
    }

    final boolean a(String param0, String param1, int param2) {
        if (!(((cn) this).b(-89))) {
            return false;
        }
        param0 = param0.toLowerCase();
        param1 = param1.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param0;
        int var4 = ((cn) this).field_i.field_b.a(vta.a(var6, -12754), 1);
        if (var4 < param2) {
            return false;
        }
        CharSequence var7 = (CharSequence) (Object) param1;
        int var5 = ((cn) this).field_i.field_e[var4].a(vta.a(var7, -12754), 1);
        if (0 <= var5) {
            return true;
        }
        return false;
    }

    final synchronized byte[] f(int param0, int param1) {
        if (!((cn) this).b(-63)) {
            return null;
        }
        if ((((cn) this).field_i.field_p.length ^ -1) == -2) {
            return ((cn) this).a(false, 0, param0);
        }
        if (!this.b(-1, param0)) {
            return null;
        }
        if ((((cn) this).field_i.field_p[param0] ^ -1) == -2) {
            return ((cn) this).a(false, param0, 0);
        }
        int var3 = -8 / ((50 - param1) / 42);
        throw new RuntimeException();
    }

    final static int a(byte param0) {
        if (param0 < 53) {
            return 20;
        }
        return 1900 + new Date().getYear();
    }

    final int b(String param0, int param1) {
        if (!((cn) this).b(-93)) {
            return -1;
        }
        param0 = param0.toLowerCase();
        if (param1 != -7768) {
            return 61;
        }
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((cn) this).field_i.field_b.a(vta.a(var4, -12754), param1 ^ -7767);
        if (!(this.b(param1 ^ 7767, var3))) {
            return -1;
        }
        return var3;
    }

    final boolean c(String param0, int param1) {
        if (!(((cn) this).b(-108))) {
            return false;
        }
        if (param1 >= -121) {
            return false;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((cn) this).field_i.field_b.a(vta.a(var4, -12754), 1);
        return ((cn) this).e(var3, -2);
    }

    final synchronized byte[] a(String param0, byte param1, String param2) {
        if (!((cn) this).b(-31)) {
            return null;
        }
        param0 = param0.toLowerCase();
        param2 = param2.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param0;
        int var4 = ((cn) this).field_i.field_b.a(vta.a(var6, -12754), 1);
        if (!this.b(-1, var4)) {
            return null;
        }
        if (param1 <= 112) {
            boolean discarded$0 = ((cn) this).a(((int[]) ((cn) this).field_a[12])[21]);
        }
        CharSequence var7 = (CharSequence) (Object) param2;
        int var5 = ((cn) this).field_i.field_e[var4].a(vta.a(var7, -12754), 1);
        return ((cn) this).a(false, var4, var5);
    }

    final synchronized boolean a(int param0, byte param1, int param2) {
        if (!(this.a(param0, param2, (byte) -97))) {
            return false;
        }
        if (null != ((cn) this).field_l[param0]) {
            if (((cn) this).field_l[param0][param2] != null) {
                return true;
            }
        }
        if (((cn) this).field_a[param0] != null) {
            return true;
        }
        this.c(22214, param0);
        if (((cn) this).field_a[param0] != null) {
            return true;
        }
        if (param1 >= -70) {
            int discarded$0 = ((cn) this).a(false, (String) ((cn) this).field_a[14], ((int[]) ((Object[]) ((cn) this).field_a[14])[3])[2]);
            return false;
        }
        return false;
    }

    private final synchronized byte[] a(int param0, boolean param1, int[] param2, int param3) {
        Object var5 = null;
        byte[] var5_array = null;
        byte[] var7 = null;
        if (param1) {
          if (this.a(param3, param0, (byte) 92)) {
            L0: {
              L1: {
                var5 = null;
                if (null == ((cn) this).field_l[param3]) {
                  break L1;
                } else {
                  if (((cn) this).field_l[param3][param0] == null) {
                    break L1;
                  } else {
                    break L0;
                  }
                }
              }
              if (!this.a(param3, param2, param0, -122)) {
                this.c(22214, param3);
                if (this.a(param3, param2, param0, 43)) {
                  break L0;
                } else {
                  return null;
                }
              } else {
                break L0;
              }
            }
            if (((cn) this).field_l[param3] == null) {
              throw new RuntimeException("");
            } else {
              L2: {
                if (((cn) this).field_l[param3][param0] != null) {
                  var7 = ir.a(((cn) this).field_l[param3][param0], 13588, false);
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
                  if (((cn) this).field_j == 1) {
                    ((cn) this).field_l[param3][param0] = null;
                    if (1 == ((cn) this).field_i.field_p[param3]) {
                      ((cn) this).field_l[param3] = null;
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    if (((cn) this).field_j != 2) {
                      break L3;
                    } else {
                      ((cn) this).field_l[param3] = null;
                      break L3;
                    }
                  }
                }
              }
              return var5_array;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final int a(byte param0, int param1) {
        if (!(this.b(-1, param1))) {
            return 0;
        }
        int var3 = -70 % ((param0 - 3) / 53);
        return ((cn) this).field_i.field_p[param1];
    }

    final int a(String param0, boolean param1) {
        if (!((cn) this).b(-124)) {
            return 0;
        }
        if (!param1) {
            ((cn) this).field_j = -49;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((cn) this).field_i.field_b.a(vta.a(var4, -12754), 1);
        return ((cn) this).a(var3, (byte) 119);
    }

    private final synchronized boolean b(int param0, int param1) {
        if (!((cn) this).b(-80)) {
          return false;
        } else {
          L0: {
            if ((param1 ^ -1) > param0) {
              break L0;
            } else {
              if (param1 >= ((cn) this).field_i.field_p.length) {
                break L0;
              } else {
                if (((cn) this).field_i.field_p[param1] != 0) {
                  return true;
                } else {
                  break L0;
                }
              }
            }
          }
          if (nl.field_b) {
            throw new IllegalArgumentException(Integer.toString(param1));
          } else {
            return false;
          }
        }
    }

    final byte[] a(boolean param0, int param1, int param2) {
        if (param0) {
            boolean discarded$0 = this.b(((int[]) ((cn) this).field_a[11])[23], 94);
        }
        return this.a(param2, true, (int[]) null, param1);
    }

    cn(dr param0, boolean param1, int param2) {
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
          ((cn) this).field_i = null;
          if (0 > param2) {
            break L0;
          } else {
            if (2 >= param2) {
              L1: {
                ((cn) this).field_j = param2;
                ((cn) this).field_d = param0;
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
              ((cn) this).field_g = stackIn_6_1 != 0;
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
        field_k = -1;
        field_c = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find suitable opponents in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_e = "End Game";
        field_f = "Low";
    }
}
