/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class jg extends ng implements j {
    ng[] field_L;
    static fp field_F;
    static String field_M;
    static java.awt.Image field_K;
    static tf field_H;
    static char[] field_I;
    static int field_J;

    final boolean b(boolean param0) {
        if (!param0) {
            field_H = null;
        }
        return null != this.m(0) ? true : false;
    }

    final boolean a(ng param0, int param1) {
        ng[] var3 = null;
        int var4 = 0;
        ng var5 = null;
        int var6 = 0;
        ng[] var7 = null;
        var6 = Pixelate.field_H ? 1 : 0;
        if (param1 == 27) {
          var7 = ((jg) this).field_L;
          var3 = var7;
          var4 = 0;
          L0: while (true) {
            if (var7.length <= var4) {
              return false;
            } else {
              var5 = var7[var4];
              if (var5 != null) {
                if (var5.a(param0, 27)) {
                  return true;
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
        } else {
          return true;
        }
    }

    private final void a(StringBuilder param0, Hashtable param1, byte param2, int param3) {
        int var6 = 0;
        ng var7 = null;
        int var8 = 0;
        int var9 = 0;
        ng[] var10 = null;
        var9 = Pixelate.field_H ? 1 : 0;
        if (null == ((jg) this).field_L) {
          return;
        } else {
          L0: {
            var10 = ((jg) this).field_L;
            if (param2 > 126) {
              break L0;
            } else {
              field_J = -27;
              break L0;
            }
          }
          var6 = 0;
          L1: while (true) {
            if (var10.length <= var6) {
              return;
            } else {
              var7 = var10[var6];
              StringBuilder discarded$34 = param0.append(10);
              var8 = 0;
              L2: while (true) {
                if (param3 < var8) {
                  if (var7 != null) {
                    StringBuilder discarded$35 = var7.a(param0, false, param3 - -1, param1);
                    var6++;
                    continue L1;
                  } else {
                    StringBuilder discarded$36 = param0.append("null");
                    var6++;
                    continue L1;
                  }
                } else {
                  StringBuilder discarded$37 = param0.append(32);
                  var8++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final static boolean a(byte param0) {
        if (param0 < 56) {
            field_F = null;
        }
        return lo.field_Nb;
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        super.a(param0, (byte) 75, param2, param3, param4);
        ((jg) this).a(14210);
        if (param1 < 19) {
            field_H = null;
        }
    }

    final static boolean k(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 1) {
          L0: {
            L1: {
              if (null == he.field_f) {
                break L1;
              } else {
                if (!he.field_f.c((byte) -87)) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    private final boolean a(byte param0, ng param1) {
        if (param0 >= -95) {
            ((jg) this).a(-13, (byte) -36, 75, -82, -49);
        }
        return this.a(-18125, 1, param1);
    }

    void a(int param0, int param1, int param2, ng param3) {
        ng[] var5 = null;
        int var6 = 0;
        ng var7 = null;
        int var8 = 0;
        ng[] var9 = null;
        var8 = Pixelate.field_H ? 1 : 0;
        super.a(param0, param1, param2, param3);
        if (((jg) this).field_L != null) {
          var9 = ((jg) this).field_L;
          var5 = var9;
          var6 = 0;
          L0: while (true) {
            if (var9.length <= var6) {
              return;
            } else {
              var7 = var9[var6];
              if (var7 != null) {
                var7.a(param0 + 0, ((jg) this).field_p + param1, param2 - -((jg) this).field_z, param3);
                var6++;
                continue L0;
              } else {
                var6++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final String b(byte param0) {
        ng[] var2 = null;
        int var3 = 0;
        ng var4 = null;
        String var5 = null;
        int var6 = 0;
        ng[] var7 = null;
        var6 = Pixelate.field_H ? 1 : 0;
        if (null != ((jg) this).field_L) {
          var7 = ((jg) this).field_L;
          var2 = var7;
          var3 = 0;
          if (param0 >= 16) {
            L0: while (true) {
              if (var7.length > var3) {
                var4 = var7[var3];
                if (var4 != null) {
                  var5 = var4.b((byte) 36);
                  if (var5 != null) {
                    return var5;
                  } else {
                    var3++;
                    continue L0;
                  }
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, int param1) {
        wn.field_u = param0;
        if (!(null == to.field_q)) {
            to.field_q.c((byte) 30, param0);
        }
        int var2 = -13 % ((52 - param1) / 59);
        if (ri.field_a != null) {
            ri.field_a.a(param0, (byte) 2);
        }
    }

    final boolean a(byte param0, ng param1, int param2, int param3, int param4, int param5, int param6) {
        ng[] var8 = null;
        int var9 = 0;
        ng var10 = null;
        int var11 = 0;
        ng[] var12 = null;
        L0: {
          var11 = Pixelate.field_H ? 1 : 0;
          if (param0 == -58) {
            break L0;
          } else {
            boolean discarded$2 = ((jg) this).b(true);
            break L0;
          }
        }
        if (((jg) this).field_L != null) {
          var12 = ((jg) this).field_L;
          var8 = var12;
          var9 = 0;
          L1: while (true) {
            if (var9 >= var12.length) {
              return false;
            } else {
              var10 = var12[var9];
              if (var10 != null) {
                if (var10.a((byte) -58, param1, param2, param3 + ((jg) this).field_p, param4, ((jg) this).field_z + param5, param6)) {
                  return true;
                } else {
                  var9++;
                  continue L1;
                }
              } else {
                var9++;
                continue L1;
              }
            }
          }
        } else {
          return false;
        }
    }

    final StringBuilder a(StringBuilder param0, boolean param1, int param2, Hashtable param3) {
        if (param1) {
            field_F = null;
        }
        if (((jg) this).a(-90, param2, param0, param3)) {
            ((jg) this).a(param2, (byte) -2, param3, param0);
            this.a(param0, param3, (byte) 127, param2);
        }
        return param0;
    }

    final static int l(int param0) {
        int var1 = 0;
        int var2 = Pixelate.field_H ? 1 : 0;
        boolean discarded$8 = wa.field_c.a(hf.field_w, true, (byte) 99, ph.field_o);
        wa.field_c.d((byte) 112);
        while (bh.b((byte) 120)) {
            boolean discarded$9 = wa.field_c.a(nj.field_f, ke.field_a, false);
        }
        if (!(0 == (u.field_h ^ -1))) {
            var1 = u.field_h;
            te.a(-1, -2671);
            return var1;
        }
        if (param0 <= 51) {
            boolean discarded$10 = jg.a((byte) -82);
        }
        if (dk.field_c) {
            return 3;
        }
        if (!(qo.field_n != rj.field_F)) {
            return 1;
        }
        if (!(an.field_e.d(123))) {
            return 1;
        }
        if (tm.field_X == rj.field_F) {
            return 2;
        }
        return -1;
    }

    final void h(int param0) {
        ng[] var2 = null;
        int var3 = 0;
        ng var4 = null;
        int var5 = 0;
        ng[] var6 = null;
        L0: {
          var5 = Pixelate.field_H ? 1 : 0;
          var6 = ((jg) this).field_L;
          var2 = var6;
          if (param0 == 2) {
            break L0;
          } else {
            field_K = null;
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          if (var3 >= var6.length) {
            return;
          } else {
            var4 = var6[var3];
            if (var4 != null) {
              var4.h(2);
              var3++;
              continue L1;
            } else {
              var3++;
              continue L1;
            }
          }
        }
    }

    final int e(int param0) {
        int var2 = 0;
        ng[] var3 = null;
        int var4 = 0;
        ng var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Pixelate.field_H ? 1 : 0;
          var2 = 0;
          var3 = ((jg) this).field_L;
          if (param0 > 31) {
            break L0;
          } else {
            ((jg) this).field_L = null;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var3.length <= var4) {
            return var2;
          } else {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.e(61);
              if (var6 > var2) {
                var2 = var6;
                var4++;
                continue L1;
              } else {
                var4++;
                continue L1;
              }
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    private final boolean a(ng param0, byte param1, int param2) {
        int var4 = 0;
        ng var5 = null;
        ng var6 = null;
        int var7 = 0;
        var7 = Pixelate.field_H ? 1 : 0;
        if (((jg) this).field_L != null) {
          L0: {
            var4 = 0;
            if (param1 == -44) {
              break L0;
            } else {
              int discarded$2 = ((jg) this).e(-60);
              break L0;
            }
          }
          L1: while (true) {
            if (((jg) this).field_L.length <= var4) {
              return false;
            } else {
              var5 = ((jg) this).field_L[var4];
              if (var5 != null) {
                if (var5.b(true)) {
                  var4 = var4 + param2;
                  L2: while (true) {
                    if (var4 < ((jg) this).field_L.length) {
                      L3: {
                        var6 = ((jg) this).field_L[var4];
                        if (var6 != null) {
                          if (!var6.a(param0, 27)) {
                            break L3;
                          } else {
                            return true;
                          }
                        } else {
                          break L3;
                        }
                      }
                      var4 = var4 + param2;
                      continue L2;
                    } else {
                      var4++;
                      continue L1;
                    }
                  }
                } else {
                  var4++;
                  continue L1;
                }
              } else {
                var4++;
                continue L1;
              }
            }
          }
        } else {
          return false;
        }
    }

    public static void j(int param0) {
        field_I = null;
        field_M = null;
        field_F = null;
        if (param0 > -65) {
            return;
        }
        field_K = null;
        field_H = null;
    }

    final void a(int param0, int param1, ng param2, int param3, int param4, int param5) {
        ng[] var7 = null;
        int var8 = 0;
        ng var9 = null;
        int var10 = 0;
        ng[] var11 = null;
        var10 = Pixelate.field_H ? 1 : 0;
        if (null != ((jg) this).field_L) {
          var11 = ((jg) this).field_L;
          var7 = var11;
          var8 = param3;
          L0: while (true) {
            if (var11.length <= var8) {
              return;
            } else {
              var9 = var11[var8];
              if (var9 != null) {
                var9.a(param0, param1 + ((jg) this).field_z, param2, 0, param4 + ((jg) this).field_p, param5);
                var8++;
                continue L0;
              } else {
                var8++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    private final ng m(int param0) {
        ng[] var2 = null;
        int var3 = 0;
        ng var4 = null;
        int var5 = 0;
        ng[] var6 = null;
        var5 = Pixelate.field_H ? 1 : 0;
        if (null != ((jg) this).field_L) {
          var6 = ((jg) this).field_L;
          var2 = var6;
          var3 = param0;
          L0: while (true) {
            if (var3 < var6.length) {
              var4 = var6[var3];
              if (var4 != null) {
                if (var4.b(true)) {
                  return var4;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    void a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        ng var6 = null;
        int var7 = 0;
        L0: {
          var7 = Pixelate.field_H ? 1 : 0;
          if (param1 != 0) {
            break L0;
          } else {
            if (null == ((jg) this).field_y) {
              break L0;
            } else {
              ((jg) this).field_y.a((ng) this, (byte) -124, param0, param2, true);
              break L0;
            }
          }
        }
        L1: {
          if (null == ((jg) this).field_L) {
            break L1;
          } else {
            var5 = ((jg) this).field_L.length + -1;
            L2: while (true) {
              if (0 > var5) {
                break L1;
              } else {
                var6 = ((jg) this).field_L[var5];
                if (var6 != null) {
                  var6.a(((jg) this).field_p + param0, param1, param2 - -((jg) this).field_z, (byte) -95);
                  var5--;
                  continue L2;
                } else {
                  var5--;
                  continue L2;
                }
              }
            }
          }
        }
        var5 = -65 / ((param3 - 70) / 49);
    }

    jg(int param0, int param1, int param2, int param3, eb param4) {
        super(param0, param1, param2, param3, param4, (fn) null);
    }

    abstract void a(int param0);

    private final boolean b(ng param0, int param1) {
        if (param1 != -17753) {
            return true;
        }
        return this.a(param0, (byte) -44, 1);
    }

    private final boolean a(int param0, int param1, ng param2) {
        int var4 = 0;
        ng var5 = null;
        ng var6 = null;
        ng var6_ref = null;
        int var7 = 0;
        var7 = Pixelate.field_H ? 1 : 0;
        if (null == ((jg) this).field_L) {
          return false;
        } else {
          var4 = -1 + ((jg) this).field_L.length;
          L0: while (true) {
            if ((var4 ^ -1) > -1) {
              if (param0 == -18125) {
                return false;
              } else {
                field_J = -62;
                return false;
              }
            } else {
              var5 = ((jg) this).field_L[var4];
              var6 = var5;
              var6 = var5;
              if (var5 != null) {
                if (var5.b(true)) {
                  var4 = var4 - param1;
                  L1: while (true) {
                    if (-1 >= (var4 ^ -1)) {
                      L2: {
                        var6_ref = ((jg) this).field_L[var4];
                        if (var6_ref != null) {
                          if (var6_ref.a(param2, 27)) {
                            return true;
                          } else {
                            break L2;
                          }
                        } else {
                          break L2;
                        }
                      }
                      var4 = var4 - param1;
                      continue L1;
                    } else {
                      var4--;
                      continue L0;
                    }
                  }
                } else {
                  var4--;
                  continue L0;
                }
              } else {
                var4--;
                continue L0;
              }
            }
          }
        }
    }

    final boolean a(int param0, int param1, ng param2, char param3) {
        ng[] var5_ref_ng__ = null;
        int var5 = 0;
        int var6 = 0;
        ng var7 = null;
        int var8 = 0;
        ng[] var9 = null;
        boolean stackIn_20_0 = false;
        boolean stackOut_19_0 = false;
        boolean stackOut_18_0 = false;
        var8 = Pixelate.field_H ? 1 : 0;
        if (null == ((jg) this).field_L) {
          return false;
        } else {
          L0: {
            var9 = ((jg) this).field_L;
            var5_ref_ng__ = var9;
            if (param1 == 3) {
              break L0;
            } else {
              boolean discarded$2 = jg.a((byte) 125);
              break L0;
            }
          }
          var6 = 0;
          L1: while (true) {
            if (var6 >= var9.length) {
              var5 = param0;
              if ((var5 ^ -1) == -81) {
                L2: {
                  if (!bc.field_m[81]) {
                    stackOut_19_0 = this.b(param2, -17753);
                    stackIn_20_0 = stackOut_19_0;
                    break L2;
                  } else {
                    stackOut_18_0 = this.a((byte) -126, param2);
                    stackIn_20_0 = stackOut_18_0;
                    break L2;
                  }
                }
                return stackIn_20_0;
              } else {
                return false;
              }
            } else {
              var7 = var9[var6];
              if (var7 != null) {
                if (var7.b(true)) {
                  if (var7.a(param0, 3, param2, param3)) {
                    return true;
                  } else {
                    var6++;
                    continue L1;
                  }
                } else {
                  var6++;
                  continue L1;
                }
              } else {
                var6++;
                continue L1;
              }
            }
          }
        }
    }

    final boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, ng param6) {
        ng[] var8 = null;
        int var9 = 0;
        ng var10 = null;
        int var11 = 0;
        ng[] var12 = null;
        var11 = Pixelate.field_H ? 1 : 0;
        if (((jg) this).field_L != null) {
          L0: {
            var12 = ((jg) this).field_L;
            var8 = var12;
            if (param1 >= 61) {
              break L0;
            } else {
              ((jg) this).h(91);
              break L0;
            }
          }
          var9 = 0;
          L1: while (true) {
            if (var12.length <= var9) {
              return false;
            } else {
              var10 = var12[var9];
              if (var10 != null) {
                if (var10.b(true)) {
                  if (var10.a(param0, (byte) 105, param2, param3, param4, param5, param6)) {
                    return true;
                  } else {
                    var9++;
                    continue L1;
                  }
                } else {
                  var9++;
                  continue L1;
                }
              } else {
                var9++;
                continue L1;
              }
            }
          }
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = new fp();
        field_M = "<%0> disconnected.";
        field_I = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}
