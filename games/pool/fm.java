/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class fm extends ei implements lj {
    static dd[] field_G;
    static boolean field_H;
    static jd[][] field_K;
    static String field_I;
    static int field_M;
    ei[] field_L;
    static String field_J;

    final boolean a(char param0, int param1, boolean param2, ei param3) {
        ei[] var5_ref_ei__ = null;
        int var5 = 0;
        int var6 = 0;
        ei var7 = null;
        int var8 = 0;
        ei[] var9 = null;
        boolean stackIn_16_0 = false;
        boolean stackOut_15_0 = false;
        boolean stackOut_14_0 = false;
        var8 = Pool.field_O;
        if (null != ((fm) this).field_L) {
          var9 = ((fm) this).field_L;
          var5_ref_ei__ = var9;
          var6 = 0;
          L0: while (true) {
            if (var9.length <= var6) {
              var5 = param1;
              if ((var5 ^ -1) != -81) {
                if (!param2) {
                  return false;
                } else {
                  return true;
                }
              } else {
                L1: {
                  if (!vj.field_c[81]) {
                    stackOut_15_0 = this.a(param3, -3094);
                    stackIn_16_0 = stackOut_15_0;
                    break L1;
                  } else {
                    stackOut_14_0 = this.b(param3, (byte) 89);
                    stackIn_16_0 = stackOut_14_0;
                    break L1;
                  }
                }
                return stackIn_16_0;
              }
            } else {
              var7 = var9[var6];
              if (var7 != null) {
                if (var7.d(-117)) {
                  if (var7.a(param0, param1, param2, param3)) {
                    return true;
                  } else {
                    var6++;
                    continue L0;
                  }
                } else {
                  var6++;
                  continue L0;
                }
              } else {
                var6++;
                continue L0;
              }
            }
          }
        } else {
          return false;
        }
    }

    private final boolean a(int param0, int param1, ei param2) {
        int var4 = 0;
        ei var5 = null;
        ei var6 = null;
        int var7 = 0;
        var7 = Pool.field_O;
        if (((fm) this).field_L == null) {
          return false;
        } else {
          if (param1 == 2676) {
            var4 = ((fm) this).field_L.length - 1;
            L0: while (true) {
              if (0 > var4) {
                return false;
              } else {
                var5 = ((fm) this).field_L[var4];
                if (var5 != null) {
                  if (var5.d(param1 + -2568)) {
                    var4 = var4 - param0;
                    L1: while (true) {
                      if (var4 >= 0) {
                        L2: {
                          var6 = ((fm) this).field_L[var4];
                          if (var6 != null) {
                            if (!var6.a(param2, (byte) -106)) {
                              break L2;
                            } else {
                              return true;
                            }
                          } else {
                            break L2;
                          }
                        }
                        var4 = var4 - param0;
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
          } else {
            return true;
          }
        }
    }

    final int c(int param0) {
        int var2 = 0;
        ei[] var3 = null;
        int var4 = 0;
        ei var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Pool.field_O;
        if (param0 > 33) {
          var2 = 0;
          var3 = ((fm) this).field_L;
          var4 = 0;
          L0: while (true) {
            if (var3.length <= var4) {
              return var2;
            } else {
              var5 = var3[var4];
              if (var5 != null) {
                var6 = var5.c(73);
                if (var2 < var6) {
                  var2 = var6;
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
        } else {
          return 77;
        }
    }

    public static void g(int param0) {
        field_I = null;
        field_K = null;
        if (param0 != 16) {
            return;
        }
        field_G = null;
        field_J = null;
    }

    private final ei f(int param0) {
        ei[] var2 = null;
        int var3 = 0;
        ei var4 = null;
        int var5 = 0;
        ei[] var6 = null;
        var5 = Pool.field_O;
        if (((fm) this).field_L != null) {
          if (param0 == 15041) {
            var6 = ((fm) this).field_L;
            var2 = var6;
            var3 = 0;
            L0: while (true) {
              if (var3 < var6.length) {
                var4 = var6[var3];
                if (var4 != null) {
                  if (var4.d(124)) {
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
        } else {
          return null;
        }
    }

    private final void a(Hashtable param0, StringBuilder param1, int param2, byte param3) {
        int var6 = 0;
        ei var7 = null;
        int var8 = 0;
        int var9 = 0;
        ei[] var10 = null;
        var9 = Pool.field_O;
        if (((fm) this).field_L == null) {
          return;
        } else {
          L0: {
            var10 = ((fm) this).field_L;
            if (param3 > 96) {
              break L0;
            } else {
              ((fm) this).field_L = null;
              break L0;
            }
          }
          var6 = 0;
          L1: while (true) {
            if (var10.length <= var6) {
              return;
            } else {
              var7 = var10[var6];
              StringBuilder discarded$34 = param1.append(10);
              var8 = 0;
              L2: while (true) {
                if (var8 > param2) {
                  if (var7 == null) {
                    StringBuilder discarded$35 = param1.append("null");
                    var6++;
                    continue L1;
                  } else {
                    StringBuilder discarded$36 = var7.a(param1, 1 + param2, param0, 61);
                    var6++;
                    continue L1;
                  }
                } else {
                  StringBuilder discarded$37 = param1.append(32);
                  var8++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final boolean a(ei param0, byte param1) {
        ei[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        ei var6 = null;
        int var7 = 0;
        ei[] var8 = null;
        var7 = Pool.field_O;
        var8 = ((fm) this).field_L;
        var3 = var8;
        var4 = -24 % ((param1 - -43) / 47);
        var5 = 0;
        L0: while (true) {
          if (var8.length <= var5) {
            return false;
          } else {
            var6 = var8[var5];
            if (var6 != null) {
              if (var6.a(param0, (byte) 32)) {
                return true;
              } else {
                var5++;
                continue L0;
              }
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    final boolean a(ei param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        ei[] var8 = null;
        int var9 = 0;
        ei var10 = null;
        int var11 = 0;
        ei[] var12 = null;
        L0: {
          var11 = Pool.field_O;
          if (param4 < -126) {
            break L0;
          } else {
            field_K = null;
            break L0;
          }
        }
        if (((fm) this).field_L == null) {
          return false;
        } else {
          var12 = ((fm) this).field_L;
          var8 = var12;
          var9 = 0;
          L1: while (true) {
            if (var9 >= var12.length) {
              return false;
            } else {
              var10 = var12[var9];
              if (var10 != null) {
                if (var10.d(-85)) {
                  if (var10.a(param0, param1, param2, param3, (byte) -127, param5, param6)) {
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
        }
    }

    final void d(byte param0) {
        ei[] var2 = null;
        int var3 = 0;
        ei var4 = null;
        int var5 = 0;
        ei[] var6 = null;
        L0: {
          var5 = Pool.field_O;
          var6 = ((fm) this).field_L;
          var2 = var6;
          if (param0 == 99) {
            break L0;
          } else {
            field_I = null;
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          if (var6.length <= var3) {
            return;
          } else {
            var4 = var6[var3];
            if (var4 != null) {
              var4.d((byte) 99);
              var3++;
              continue L1;
            } else {
              var3++;
              continue L1;
            }
          }
        }
    }

    void a(int param0, byte param1, int param2, int param3) {
        int var5 = 0;
        ei var6 = null;
        int var7 = 0;
        L0: {
          var7 = Pool.field_O;
          if (-1 != (param0 ^ -1)) {
            break L0;
          } else {
            if (((fm) this).field_z == null) {
              break L0;
            } else {
              ((fm) this).field_z.a(true, param2, (byte) 51, param3, (ei) this);
              break L0;
            }
          }
        }
        L1: {
          if (null == ((fm) this).field_L) {
            break L1;
          } else {
            var5 = -1 + ((fm) this).field_L.length;
            L2: while (true) {
              if (-1 < (var5 ^ -1)) {
                break L1;
              } else {
                var6 = ((fm) this).field_L[var5];
                if (var6 != null) {
                  var6.a(param0, (byte) -98, ((fm) this).field_C + param2, ((fm) this).field_D + param3);
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
        var5 = 93 / ((param1 - -42) / 53);
    }

    private final boolean b(ei param0, byte param1) {
        int var3 = -98 % ((49 - param1) / 35);
        return this.a(1, 2676, param0);
    }

    final static oc a(int param0, oq param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        oc var5 = null;
        int var6 = 0;
        int var7 = 0;
        var2 = param1.e(8, 74);
        if (var2 > 0) {
          throw new IllegalStateException("" + var2);
        } else {
          L0: {
            if (param0 == -16336) {
              break L0;
            } else {
              fm.g(-31);
              break L0;
            }
          }
          L1: {
            var3 = gk.a((byte) 118, param1) ? 1 : 0;
            var4 = gk.a((byte) 118, param1) ? 1 : 0;
            var5 = new oc();
            var5.field_k = (short)param1.e(16, 98);
            var5.field_m = kh.a(16, var5.field_m, (byte) 127, param1);
            var5.field_s = kh.a(16, var5.field_s, (byte) 99, param1);
            var5.field_l = kh.a(16, var5.field_l, (byte) 123, param1);
            var5.field_d = (short)param1.e(16, 69);
            var5.field_y = kh.a(16, var5.field_y, (byte) 122, param1);
            var5.field_r = kh.a(16, var5.field_r, (byte) 111, param1);
            var5.field_u = kh.a(16, var5.field_u, (byte) 109, param1);
            if (var3 == 0) {
              break L1;
            } else {
              var5.field_o = (short)param1.e(16, param0 + 16375);
              var5.field_Q = kh.a(16, var5.field_Q, (byte) 109, param1);
              var5.field_p = kh.a(16, var5.field_p, (byte) 121, param1);
              var5.field_j = kh.a(16, var5.field_j, (byte) 120, param1);
              var5.field_x = kh.a(16, var5.field_x, (byte) 109, param1);
              var5.field_w = kh.a(16, var5.field_w, (byte) 110, param1);
              var5.field_O = kh.a(16, var5.field_O, (byte) 118, param1);
              break L1;
            }
          }
          L2: {
            if (var4 != 0) {
              int discarded$1 = param1.e(16, param0 ^ -16283);
              var5.field_v = kh.a(16, var5.field_v, (byte) 94, param1);
              var5.field_a = kh.a(16, var5.field_a, (byte) 118, param1);
              var5.field_i = kh.a(16, var5.field_i, (byte) 111, param1);
              var5.field_P = kh.a(16, var5.field_P, (byte) 104, param1);
              var5.field_z = kh.a(16, var5.field_z, (byte) 102, param1);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (gk.a((byte) 118, param1)) {
              var5.field_H = kh.a(16, var5.field_H, (byte) 110, param1);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (!gk.a((byte) 118, param1)) {
              break L4;
            } else {
              var5.field_K = cb.a(50, 16, param1, var5.field_K);
              var6 = 0;
              var7 = 0;
              L5: while (true) {
                if (var7 >= var5.field_K.length) {
                  if (0 != var6) {
                    var5.field_I = (byte)(1 + var6);
                    break L4;
                  } else {
                    var5.field_K = null;
                    break L4;
                  }
                } else {
                  if ((var5.field_K[var7] & 255) > var6) {
                    var6 = 255 & var5.field_K[var7];
                    var7++;
                    continue L5;
                  } else {
                    var7++;
                    continue L5;
                  }
                }
              }
            }
          }
          return var5;
        }
    }

    final StringBuilder a(StringBuilder param0, int param1, Hashtable param2, int param3) {
        if (!(!((fm) this).b(param1, param2, param0, -1))) {
            ((fm) this).a(1, param2, param0, param1);
            this.a(param2, param0, param1, (byte) 108);
        }
        if (param3 < 13) {
            return null;
        }
        return param0;
    }

    final static void a(ge param0, boolean param1, int param2, int param3, int param4) {
        param0.a(12, false);
        param0.a((byte) -81, 17);
        if (!param1) {
            return;
        }
        param0.a((byte) -81, param2);
        param0.a((byte) -81, param4);
        param0.a(param3, false);
    }

    fm(int param0, int param1, int param2, int param3, fp param4) {
        super(param0, param1, param2, param3, param4, (cc) null);
    }

    private final boolean a(int param0, ei param1, int param2) {
        int var4 = 0;
        ei var5 = null;
        ei var6 = null;
        ei var6_ref = null;
        int var7 = 0;
        var7 = Pool.field_O;
        if (null == ((fm) this).field_L) {
          return false;
        } else {
          L0: {
            if (param2 == -9478) {
              break L0;
            } else {
              ((fm) this).field_L = null;
              break L0;
            }
          }
          var4 = 0;
          L1: while (true) {
            if (((fm) this).field_L.length <= var4) {
              return false;
            } else {
              var5 = ((fm) this).field_L[var4];
              var6 = var5;
              var6 = var5;
              if (var5 != null) {
                if (var5.d(103)) {
                  var4 = var4 + param0;
                  L2: while (true) {
                    if (var4 < ((fm) this).field_L.length) {
                      L3: {
                        var6_ref = ((fm) this).field_L[var4];
                        if (var6_ref != null) {
                          if (!var6_ref.a(param1, (byte) -112)) {
                            break L3;
                          } else {
                            return true;
                          }
                        } else {
                          break L3;
                        }
                      }
                      var4 = var4 + param0;
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
        }
    }

    final String e(int param0) {
        ei[] var2 = null;
        int var3 = 0;
        ei var4 = null;
        String var5 = null;
        int var6 = 0;
        Object var7 = null;
        var6 = Pool.field_O;
        if (null != ((fm) this).field_L) {
          L0: {
            if (param0 < -10) {
              break L0;
            } else {
              var7 = null;
              this.a((Hashtable) null, (StringBuilder) null, -53, (byte) -52);
              break L0;
            }
          }
          var2 = ((fm) this).field_L;
          var3 = 0;
          L1: while (true) {
            if (var2.length > var3) {
              var4 = var2[var3];
              if (var4 != null) {
                var5 = var4.e(-47);
                if (var5 != null) {
                  return var5;
                } else {
                  var3++;
                  continue L1;
                }
              } else {
                var3++;
                continue L1;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, ei param5) {
        ei[] var7 = null;
        int var8 = 0;
        ei var9 = null;
        int var10 = 0;
        ei[] var11 = null;
        var10 = Pool.field_O;
        if (((fm) this).field_L != null) {
          var11 = ((fm) this).field_L;
          var7 = var11;
          var8 = 0;
          L0: while (true) {
            if (var11.length <= var8) {
              L1: {
                if (param4 >= 62) {
                  break L1;
                } else {
                  field_I = null;
                  break L1;
                }
              }
              return;
            } else {
              var9 = var11[var8];
              if (var9 != null) {
                var9.a(param0 - -((fm) this).field_C, param1, ((fm) this).field_D + param2, param3, (byte) 86, param5);
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

    final void a(int param0, int param1, int param2, boolean param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        ((fm) this).f((byte) -125);
    }

    private final boolean a(ei param0, int param1) {
        if (param1 != -3094) {
            Object var4 = null;
            boolean discarded$0 = ((fm) this).a((ei) null, 110, true, -117, 91, 109, -124);
        }
        return this.a(1, param0, param1 ^ 10512);
    }

    final boolean a(ei param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        ei[] var8 = null;
        int var9 = 0;
        ei var10 = null;
        int var11 = 0;
        ei[] var12 = null;
        var11 = Pool.field_O;
        if (null == ((fm) this).field_L) {
          return false;
        } else {
          if (param2) {
            var12 = ((fm) this).field_L;
            var8 = var12;
            var9 = 0;
            L0: while (true) {
              if (var12.length <= var9) {
                return false;
              } else {
                var10 = var12[var9];
                if (var10 != null) {
                  if (var10.a(param0, param1 + ((fm) this).field_C, param2, param3, param4, ((fm) this).field_D + param5, param6)) {
                    return true;
                  } else {
                    var9++;
                    continue L0;
                  }
                } else {
                  var9++;
                  continue L0;
                }
              }
            }
          } else {
            return true;
          }
        }
    }

    abstract void f(byte param0);

    final static Class a(boolean param0, String param1) throws ClassNotFoundException {
        if (!(!param1.equals((Object) (Object) "B"))) {
            return Byte.TYPE;
        }
        if (!param0) {
            field_K = null;
        }
        if (param1.equals((Object) (Object) "I")) {
            return Integer.TYPE;
        }
        if (param1.equals((Object) (Object) "S")) {
            return Short.TYPE;
        }
        if (!(!param1.equals((Object) (Object) "J"))) {
            return Long.TYPE;
        }
        if (param1.equals((Object) (Object) "Z")) {
            return Boolean.TYPE;
        }
        if (!(!param1.equals((Object) (Object) "F"))) {
            return Float.TYPE;
        }
        if (!(!param1.equals((Object) (Object) "D"))) {
            return Double.TYPE;
        }
        if (param1.equals((Object) (Object) "C")) {
            return Character.TYPE;
        }
        return Class.forName(param1);
    }

    void a(ei param0, int param1, int param2, int param3) {
        ei[] var5 = null;
        int var6 = 0;
        ei var7 = null;
        int var8 = 0;
        ei[] var9 = null;
        L0: {
          var8 = Pool.field_O;
          if (param1 == 958) {
            break L0;
          } else {
            field_K = null;
            break L0;
          }
        }
        super.a(param0, param1 + 0, param2, param3);
        if (((fm) this).field_L == null) {
          return;
        } else {
          var9 = ((fm) this).field_L;
          var5 = var9;
          var6 = 0;
          L1: while (true) {
            if (var6 >= var9.length) {
              return;
            } else {
              var7 = var9[var6];
              if (var7 != null) {
                var7.a(param0, 958, param2 + ((fm) this).field_C, ((fm) this).field_D + param3);
                var6++;
                continue L1;
              } else {
                var6++;
                continue L1;
              }
            }
          }
        }
    }

    final boolean d(int param0) {
        int var2 = -51 / ((7 - param0) / 48);
        return null != this.f(15041) ? true : false;
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = Pool.field_O;
        pj.field_J.b((byte) 26);
        for (var1 = param0; var1 < 32; var1++) {
            dj.field_l[var1] = 0L;
        }
        for (var1 = 0; 32 > var1; var1++) {
            oa.field_f[var1] = 0L;
        }
        rn.field_b = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = false;
        field_J = "Please select an option in the '<%0>' row.";
    }
}
