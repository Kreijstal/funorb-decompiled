/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ki {
    private sg field_h;
    private boolean field_a;
    static volatile boolean field_i;
    private int field_c;
    static String field_j;
    private rb field_e;
    static Random field_b;
    private Object[][] field_g;
    private Object[] field_d;
    static int field_f;

    final synchronized byte[] a(String param0, String param1, int param2) {
        if (!((ki) this).b((byte) 127)) {
            return null;
        }
        param1 = param1.toLowerCase();
        param0 = param0.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param1;
        int var4 = ((ki) this).field_h.field_e.a(l.a(var6, param2 + -44), (byte) -113);
        if (!this.a(var4, true)) {
            return null;
        }
        if (param2 != -1) {
            return null;
        }
        CharSequence var7 = (CharSequence) (Object) param0;
        int var5 = ((ki) this).field_h.field_q[var4].a(l.a(var7, -84), (byte) 90);
        return ((ki) this).a((byte) 118, var5, var4);
    }

    final static an c(byte param0) {
        if (param0 <= 80) {
            boolean discarded$0 = ki.b(62);
        }
        if (!(nw.field_e != hm.field_a)) {
            throw new IllegalStateException();
        }
        if (!(st.field_z != nw.field_e)) {
            nw.field_e = hm.field_a;
            return eg.field_l;
        }
        return null;
    }

    final byte[] a(byte param0, int param1, int param2) {
        if (param0 <= 84) {
            byte[] discarded$0 = ((ki) this).c(-101, 72);
        }
        return this.a(param2, 104, (int[]) null, param1);
    }

    final int a(int param0, String param1) {
        if (!((ki) this).b((byte) 127)) {
            return -1;
        }
        if (param0 != 0) {
            an discarded$0 = ki.c(((byte[]) ((ki) this).field_d[9])[0]);
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((ki) this).field_h.field_e.a(l.a(var4, param0 ^ -66), (byte) 109);
        if (!this.a(var3, true)) {
            return -1;
        }
        return var3;
    }

    final synchronized boolean b(byte param0) {
        if (param0 != 127) {
            return true;
        }
        if (((ki) this).field_h == null) {
            ((ki) this).field_h = ((ki) this).field_e.b((byte) -111);
            if (!(null != ((ki) this).field_h)) {
                return false;
            }
            ((ki) this).field_g = new Object[((ki) this).field_h.field_d][];
            ((ki) this).field_d = new Object[((ki) this).field_h.field_d];
        }
        return true;
    }

    final int a(int param0, String param1, byte param2) {
        if (param2 < 125) {
            Object var5 = null;
            int discarded$0 = ((ki) this).a(-98, (String) null, (byte) -65);
        }
        if (!this.a(param0, true)) {
            return -1;
        }
        param1 = param1.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param1;
        int var4 = ((ki) this).field_h.field_q[param0].a(l.a(var6, -115), (byte) 105);
        if (!this.a(param0, var4, (byte) -79)) {
            return -1;
        }
        return var4;
    }

    final boolean b(byte param0, String param1) {
        if (!((ki) this).b((byte) 127)) {
            return false;
        }
        param1 = param1.toLowerCase();
        int var3 = -43 / ((-28 - param0) / 53);
        CharSequence var5 = (CharSequence) (Object) param1;
        int var4 = ((ki) this).field_h.field_e.a(l.a(var5, -108), (byte) -72);
        if (var4 >= 0) {
            return true;
        }
        return false;
    }

    final synchronized boolean b(byte param0, int param1) {
        if (!this.a(param1, true)) {
            return false;
        }
        if (!(null == ((ki) this).field_d[param1])) {
            return true;
        }
        this.b(param1, 89);
        if (param0 != -110) {
            byte[] discarded$0 = ((ki) this).a((String) null, (String) ((ki) this).field_d[6], -2);
        }
        if (((ki) this).field_d[param1] == null) {
            return false;
        }
        return true;
    }

    final synchronized byte[] c(int param0, int param1) {
        if (param0 != -14296) {
            ((ki) this).field_d = null;
        }
        if (!((ki) this).b((byte) 127)) {
            return null;
        }
        if (((ki) this).field_h.field_r.length == 1) {
            return ((ki) this).a((byte) 108, param1, 0);
        }
        if (!this.a(param1, true)) {
            return null;
        }
        if (!(1 != ((ki) this).field_h.field_r[param1])) {
            return ((ki) this).a((byte) 111, 0, param1);
        }
        throw new RuntimeException();
    }

    final synchronized int a(int param0, byte param1) {
        if (!(this.a(param0, true))) {
            return 0;
        }
        if (null != ((ki) this).field_d[param0]) {
            return 100;
        }
        int var3 = 81 % ((param1 - -11) / 36);
        return ((ki) this).field_e.a(param0, 0);
    }

    final byte[] a(byte param0, String param1) {
        if (param0 <= 108) {
            return null;
        }
        int var3 = ((ki) this).a(0, "");
        if (!(-1 == var3)) {
            return ((ki) this).a(param1, "", -1);
        }
        return ((ki) this).a("", param1, -1);
    }

    final static boolean b(int param0) {
        if (param0 != 6) {
            an discarded$0 = ki.c((byte) 84);
        }
        if (null == km.field_o) {
            km.field_o = gd.a((byte) -82, 6);
        }
        if (km.field_o.field_o) {
            ah.field_g = km.field_o.field_m;
            km.field_o = null;
            if (ah.field_g == null) {
                return true;
            }
            kf.a((byte) 111);
            return true;
        }
        return false;
    }

    final boolean a(String param0, int param1) {
        if (!((ki) this).b((byte) 127)) {
            return false;
        }
        param0 = param0.toLowerCase();
        if (param1 != 100) {
            return true;
        }
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((ki) this).field_h.field_e.a(l.a(var4, -116), (byte) 124);
        return ((ki) this).b((byte) -110, var3);
    }

    final synchronized boolean a(int param0, boolean param1, int param2) {
        if (!(this.a(param0, param2, (byte) -79))) {
            return false;
        }
        if (((ki) this).field_g[param0] != null) {
            if (null != ((ki) this).field_g[param0][param2]) {
                return true;
            }
        }
        if (null != ((ki) this).field_d[param0]) {
            return true;
        }
        if (param1) {
            Object var5 = null;
            boolean discarded$0 = ((ki) this).b((byte) 11, (String) null);
        }
        this.b(param0, 84);
        if (null != ((ki) this).field_d[param0]) {
            return true;
        }
        return false;
    }

    final int a(byte param0, int param1) {
        if (!(this.a(param1, true))) {
            return 0;
        }
        if (param0 != -65) {
            boolean discarded$0 = ((ki) this).b((byte) 97, -83);
        }
        return ((ki) this).field_h.field_r[param1];
    }

    final int b(boolean param0) {
        if (!((ki) this).b((byte) 127)) {
            return -1;
        }
        if (!param0) {
            int discarded$0 = ((ki) this).a((String) ((ki) this).field_d[2], ((byte[]) ((ki) this).field_d[4])[1]);
        }
        return ((ki) this).field_h.field_r.length;
    }

    private final synchronized void b(int param0, int param1) {
        if (param1 <= 19) {
            ((ki) this).field_d = null;
        }
        if (((ki) this).field_a) {
            ((ki) this).field_d[param0] = (Object) (Object) ((ki) this).field_e.a(param0, false);
        } else {
            ((ki) this).field_d[param0] = aj.a((byte) -121, ((ki) this).field_e.a(param0, false), false);
        }
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
        fs var26 = null;
        byte[] var27 = null;
        fs var29 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        fs var32 = null;
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
        var22 = Sumoblitz.field_L ? 1 : 0;
        if (!this.a(param3, true)) {
          return false;
        } else {
          if (((ki) this).field_d[param3] == null) {
            return false;
          } else {
            L0: {
              var5 = ((ki) this).field_h.field_m[param3];
              var48 = ((ki) this).field_h.field_s[param3];
              var41 = var48;
              var34 = var41;
              var24 = var34;
              var6 = var24;
              if (null == ((ki) this).field_g[param3]) {
                ((ki) this).field_g[param3] = new Object[((ki) this).field_h.field_r[param3]];
                break L0;
              } else {
                break L0;
              }
            }
            var7 = ((ki) this).field_g[param3];
            var8 = 1;
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
                    if (param1 == null) {
                      break L5;
                    } else {
                      L6: {
                        if (param1[0] != 0) {
                          break L6;
                        } else {
                          if (0 != param1[1]) {
                            break L6;
                          } else {
                            if (param1[2] != 0) {
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
                      var49 = ab.a(true, ((ki) this).field_d[param3], 0);
                      var42 = var49;
                      var35 = var42;
                      var25 = var35;
                      var9 = var25;
                      var26 = new fs(var49);
                      var26.a(var26.field_n.length, (byte) 127, 5, param1);
                      break L4;
                    }
                  }
                  var9 = ab.a(false, ((ki) this).field_d[param3], 0);
                  break L4;
                }
                L7: {
                  var50 = nd.a(-1, var9);
                  var43 = var50;
                  var36 = var43;
                  var27 = var36;
                  var23 = var27;
                  var51 = var23;
                  if (param0 <= -76) {
                    break L7;
                  } else {
                    ((ki) this).field_g = (Object[][]) ((ki) this).field_d[33];
                    break L7;
                  }
                }
                L8: {
                  if (((ki) this).field_a) {
                    ((ki) this).field_d[param3] = null;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if ((var5 ^ -1) < -2) {
                    var50 = var43;
                    if (2 == ((ki) this).field_c) {
                      var11 = var50.length;
                      var11--;
                      var12 = var23[var11] & 255;
                      var11 = var11 - 4 * (var12 * var5);
                      var32 = new fs(var51);
                      var14 = 0;
                      var32.field_p = var11;
                      var15 = 0;
                      var16 = 0;
                      L10: while (true) {
                        if (var12 <= var16) {
                          if (-1 == (var14 ^ -1)) {
                            return true;
                          } else {
                            var54 = new byte[var14];
                            var14 = 0;
                            var32.field_p = var11;
                            var17 = 0;
                            var18 = 0;
                            L11: while (true) {
                              if (var18 >= var12) {
                                var7[var15] = (Object) (Object) var54;
                                break L9;
                              } else {
                                var19 = 0;
                                var20 = 0;
                                L12: while (true) {
                                  if (var20 >= var5) {
                                    var18++;
                                    continue L11;
                                  } else {
                                    L13: {
                                      var19 = var19 + var32.c(true);
                                      if (var6 != null) {
                                        var21 = var48[var20];
                                        break L13;
                                      } else {
                                        var21 = var20;
                                        break L13;
                                      }
                                    }
                                    L14: {
                                      if (param2 != var21) {
                                        break L14;
                                      } else {
                                        la.a(var51, var17, var54, var14, var19);
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
                          }
                        } else {
                          var17 = 0;
                          var18 = 0;
                          L15: while (true) {
                            if (var5 <= var18) {
                              var16++;
                              continue L10;
                            } else {
                              L16: {
                                var17 = var17 + var32.c(true);
                                if (var6 == null) {
                                  var19 = var18;
                                  break L16;
                                } else {
                                  var19 = var48[var18];
                                  break L16;
                                }
                              }
                              if (param2 == var19) {
                                var14 = var14 + var17;
                                var15 = var19;
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
                      var11 = var50.length;
                      var11--;
                      var12 = 255 & var23[var11];
                      var11 = var11 - 4 * (var12 * var5);
                      var29 = new fs(var51);
                      var52 = new int[var5];
                      var45 = var52;
                      var38 = var45;
                      var30 = var38;
                      var14_ref_int__ = var30;
                      var29.field_p = var11;
                      var15 = 0;
                      L17: while (true) {
                        if (var15 >= var12) {
                          var53 = new byte[var5][];
                          var46 = var53;
                          var39 = var46;
                          var31 = var39;
                          var15_ref_byte____ = var31;
                          var16 = 0;
                          L18: while (true) {
                            if (var5 <= var16) {
                              var29.field_p = var11;
                              var16 = 0;
                              var17 = 0;
                              L19: while (true) {
                                if (var17 >= var12) {
                                  var17 = 0;
                                  L20: while (true) {
                                    if (var17 >= var5) {
                                      break L9;
                                    } else {
                                      L21: {
                                        if (var6 == null) {
                                          var18 = var17;
                                          break L21;
                                        } else {
                                          var18 = var48[var17];
                                          break L21;
                                        }
                                      }
                                      if (((ki) this).field_c == 0) {
                                        var7[var18] = aj.a((byte) -119, var53[var17], false);
                                        var17++;
                                        continue L20;
                                      } else {
                                        var7[var18] = (Object) (Object) var53[var17];
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
                                      var18 = var18 + var29.c(true);
                                      la.a(var51, var16, var53[var19], var52[var19], var18);
                                      var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                                      var16 = var16 + var18;
                                      var19++;
                                      continue L22;
                                    }
                                  }
                                }
                              }
                            } else {
                              var15_ref_byte____[var16] = new byte[var52[var16]];
                              var52[var16] = 0;
                              var16++;
                              continue L18;
                            }
                          }
                        } else {
                          var16 = 0;
                          var17 = 0;
                          L23: while (true) {
                            if (var17 >= var5) {
                              var15++;
                              continue L17;
                            } else {
                              var16 = var16 + var29.c(true);
                              var14_ref_int__[var17] = var14_ref_int__[var17] + var16;
                              var17++;
                              continue L23;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    L24: {
                      if (var6 != null) {
                        var50 = var43;
                        var11 = var48[0];
                        break L24;
                      } else {
                        var11 = 0;
                        break L24;
                      }
                    }
                    var50 = var43;
                    if (0 == ((ki) this).field_c) {
                      var7[var11] = aj.a((byte) -119, var51, false);
                      break L9;
                    } else {
                      var7[var11] = (Object) (Object) var50;
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

    private final synchronized boolean a(int param0, int param1, byte param2) {
        L0: {
          if (param2 == -79) {
            break L0;
          } else {
            field_i = true;
            break L0;
          }
        }
        if (((ki) this).b((byte) 127)) {
          L1: {
            if ((param0 ^ -1) > -1) {
              break L1;
            } else {
              if ((param1 ^ -1) > -1) {
                break L1;
              } else {
                if (param0 >= ((ki) this).field_h.field_r.length) {
                  break L1;
                } else {
                  if (param1 < ((ki) this).field_h.field_r[param0]) {
                    return true;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          if (jg.field_a) {
            throw new IllegalArgumentException(param0 + " " + param1);
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final int a(String param0, byte param1) {
        if (!((ki) this).b((byte) 127)) {
            return 0;
        }
        param0 = param0.toLowerCase();
        if (param1 != 33) {
            return 123;
        }
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((ki) this).field_h.field_e.a(l.a(var4, param1 ^ -101), (byte) 103);
        return ((ki) this).a(var3, (byte) 79);
    }

    private final synchronized byte[] a(int param0, int param1, int[] param2, int param3) {
        int var5 = 0;
        Object var6 = null;
        byte[] var6_array = null;
        byte[] var8 = null;
        var5 = 83 / ((param1 - 45) / 38);
        if (this.a(param0, param3, (byte) -79)) {
          L0: {
            L1: {
              var6 = null;
              if (null == ((ki) this).field_g[param0]) {
                break L1;
              } else {
                if (((ki) this).field_g[param0][param3] != null) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (this.a(-126, param2, param3, param0)) {
              break L0;
            } else {
              this.b(param0, 124);
              if (this.a(-93, param2, param3, param0)) {
                break L0;
              } else {
                return null;
              }
            }
          }
          if (((ki) this).field_g[param0] != null) {
            L2: {
              if (null != ((ki) this).field_g[param0][param3]) {
                var8 = ab.a(false, ((ki) this).field_g[param0][param3], 0);
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
              if (var6_array != null) {
                if (-2 == ((ki) this).field_c) {
                  ((ki) this).field_g[param0][param3] = null;
                  if ((((ki) this).field_h.field_r[param0] ^ -1) == -2) {
                    ((ki) this).field_g[param0] = null;
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  if (-3 == ((ki) this).field_c) {
                    ((ki) this).field_g[param0] = null;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              } else {
                break L3;
              }
            }
            return var6_array;
          } else {
            throw new RuntimeException("");
          }
        } else {
          return null;
        }
    }

    final synchronized int[] a(int param0, int param1) {
        int[] var6 = null;
        int var4 = 0;
        int var5 = Sumoblitz.field_L ? 1 : 0;
        if (!this.a(param0, true)) {
            return null;
        }
        int[] var3 = ((ki) this).field_h.field_s[param0];
        if (param1 != -25915) {
            an discarded$0 = ki.c((byte) 102);
        }
        if (!(var3 != null)) {
            var6 = new int[((ki) this).field_h.field_m[param0]];
            var3 = var6;
            for (var4 = 0; var4 < var6.length; var4++) {
                var6[var4] = var4;
            }
        }
        return var3;
    }

    final synchronized boolean a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (((ki) this).b((byte) 127)) {
          var2 = param0 ? 1 : 0;
          var3 = 0;
          L0: while (true) {
            if (var3 >= ((ki) this).field_h.field_f.length) {
              return var2 != 0;
            } else {
              var4 = ((ki) this).field_h.field_f[var3];
              if (null == ((ki) this).field_d[var4]) {
                this.b(var4, 99);
                if (null == ((ki) this).field_d[var4]) {
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

    final synchronized int a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (!((ki) this).b((byte) 127)) {
          return 0;
        } else {
          var2 = param0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (var4 >= ((ki) this).field_d.length) {
              if (0 != var2) {
                var4 = var3 * 100 / var2;
                return var4;
              } else {
                return 100;
              }
            } else {
              if (((ki) this).field_h.field_m[var4] > 0) {
                var2 += 100;
                var3 = var3 + ((ki) this).a(var4, (byte) 50);
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

    final boolean b(String param0, String param1, int param2) {
        if (!((ki) this).b((byte) 127)) {
            return false;
        }
        param1 = param1.toLowerCase();
        param0 = param0.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param1;
        int var4 = ((ki) this).field_h.field_e.a(l.a(var6, -124), (byte) 100);
        if (var4 < 0) {
            return false;
        }
        CharSequence var7 = (CharSequence) (Object) param0;
        int var5 = ((ki) this).field_h.field_q[var4].a(l.a(var7, -115), (byte) -83);
        if (param2 >= (var5 ^ -1)) {
            return true;
        }
        return false;
    }

    public static void a(byte param0) {
        if (param0 != 35) {
            boolean discarded$0 = ki.b(91);
        }
        field_b = null;
        field_j = null;
    }

    ki(rb param0, boolean param1, int param2) {
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
          ((ki) this).field_h = null;
          if ((param2 ^ -1) > -1) {
            break L0;
          } else {
            if ((param2 ^ -1) >= -3) {
              L1: {
                ((ki) this).field_c = param2;
                ((ki) this).field_e = param0;
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
              ((ki) this).field_a = stackIn_6_1 != 0;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("");
    }

    private final synchronized boolean a(int param0, boolean param1) {
        if (!(((ki) this).b((byte) 127))) {
            return false;
        }
        if (!param1) {
            field_j = (String) ((ki) this).field_d[5];
        }
        if (param0 >= 0) {
            if (((ki) this).field_h.field_r.length > param0) {
                if (((ki) this).field_h.field_r[param0] != 0) {
                    return true;
                }
            }
        }
        if (!jg.field_a) {
            return false;
        }
        throw new IllegalArgumentException(Integer.toString(param0));
    }

    final boolean a(String param0, int param1, String param2) {
        if (!((ki) this).b((byte) 127)) {
            return false;
        }
        param0 = param0.toLowerCase();
        param2 = param2.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param0;
        int var4 = ((ki) this).field_h.field_e.a(l.a(var6, -103), (byte) -78);
        if (!(this.a(var4, true))) {
            return false;
        }
        if (param1 != -1158) {
            return false;
        }
        CharSequence var7 = (CharSequence) (Object) param2;
        int var5 = ((ki) this).field_h.field_q[var4].a(l.a(var7, -41), (byte) -25);
        return ((ki) this).a(var4, false, var5);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = false;
        field_j = "Fullscreen";
        field_b = new Random();
        field_f = 1;
    }
}
