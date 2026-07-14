/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ag extends oc implements sd {
    oc[] field_H;
    static int[] field_M;
    static String field_I;
    static mf field_G;
    static String[] field_D;
    static String field_J;
    static int[] field_L;
    static int field_E;
    static ta field_F;
    static String field_C;
    static int[] field_K;

    final static void f(byte param0) {
        int var1 = 0;
        if (-33 > (ul.field_p ^ -1)) {
            var1 = ul.field_p % 32;
            if (!(0 != var1)) {
                var1 = 32;
            }
            wp.a(1, -var1 + ul.field_p);
        } else {
            wp.a(1, 0);
        }
        var1 = -4 % ((73 - param0) / 40);
    }

    private final boolean a(int param0, int param1, oc param2) {
        int var4 = 0;
        oc var5 = null;
        oc var6 = null;
        int var7 = 0;
        var7 = BrickABrac.field_J ? 1 : 0;
        if (((ag) this).field_H == null) {
          return false;
        } else {
          L0: {
            if (param0 > 99) {
              break L0;
            } else {
              boolean discarded$2 = ((ag) this).f(-98);
              break L0;
            }
          }
          var4 = -1 + ((ag) this).field_H.length;
          L1: while (true) {
            if ((var4 ^ -1) > -1) {
              return false;
            } else {
              var5 = ((ag) this).field_H[var4];
              if (var5 != null) {
                if (var5.f(-106)) {
                  var4 = var4 - param1;
                  L2: while (true) {
                    if (0 <= var4) {
                      L3: {
                        var6 = ((ag) this).field_H[var4];
                        if (var6 != null) {
                          if (!var6.a(true, param2)) {
                            break L3;
                          } else {
                            return true;
                          }
                        } else {
                          break L3;
                        }
                      }
                      var4 = var4 - param1;
                      continue L2;
                    } else {
                      var4--;
                      continue L1;
                    }
                  }
                } else {
                  var4--;
                  continue L1;
                }
              } else {
                var4--;
                continue L1;
              }
            }
          }
        }
    }

    void a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        oc var6 = null;
        int var7 = 0;
        var7 = BrickABrac.field_J ? 1 : 0;
        if (param3 == -11) {
          L0: {
            if (param2 != 0) {
              break L0;
            } else {
              if (null != ((ag) this).field_l) {
                ((ag) this).field_l.a(true, param3 + -20607, param1, (oc) this, param0);
                break L0;
              } else {
                break L0;
              }
            }
          }
          L1: {
            if (((ag) this).field_H != null) {
              var5 = -1 + ((ag) this).field_H.length;
              L2: while (true) {
                if ((var5 ^ -1) > -1) {
                  break L1;
                } else {
                  var6 = ((ag) this).field_H[var5];
                  if (var6 != null) {
                    var6.a(param0 - -((ag) this).field_w, ((ag) this).field_o + param1, param2, (byte) -11);
                    var5--;
                    continue L2;
                  } else {
                    var5--;
                    continue L2;
                  }
                }
              }
            } else {
              break L1;
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void c(boolean param0) {
        field_M = null;
        field_I = null;
        field_L = null;
        field_D = null;
        field_J = null;
        field_K = null;
        field_C = null;
        field_F = null;
        if (param0) {
            ag.c(true);
        }
        field_G = null;
    }

    private final boolean a(int param0, oc param1) {
        if (param0 != 1) {
            return true;
        }
        return this.a(param0 ^ 125, 1, param1);
    }

    final boolean a(oc param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        oc[] var8 = null;
        int var9 = 0;
        oc var10 = null;
        int var11 = 0;
        oc[] var12 = null;
        var11 = BrickABrac.field_J ? 1 : 0;
        if (((ag) this).field_H == null) {
          return false;
        } else {
          var12 = ((ag) this).field_H;
          var8 = var12;
          var9 = param6;
          L0: while (true) {
            if (var12.length <= var9) {
              return false;
            } else {
              var10 = var12[var9];
              if (var10 != null) {
                if (var10.a(param0, param1, param2 + ((ag) this).field_o, ((ag) this).field_w + param3, param4, param5, 0)) {
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
        }
    }

    final boolean a(int param0, byte param1, oc param2, char param3) {
        oc[] var5_ref_oc__ = null;
        int var5 = 0;
        int var6 = 0;
        oc var7 = null;
        int var8 = 0;
        Object var9 = null;
        oc[] var10 = null;
        boolean stackIn_19_0 = false;
        boolean stackOut_18_0;
        boolean stackOut_17_0;
        var8 = BrickABrac.field_J ? 1 : 0;
        if (null == ((ag) this).field_H) {
          return false;
        } else {
          L0: {
            var10 = ((ag) this).field_H;
            var5_ref_oc__ = var10;
            if (param1 == 110) {
              break L0;
            } else {
              var9 = null;
              ((ag) this).a(26, 34, 108, (oc) null, -13, -79);
              break L0;
            }
          }
          var6 = 0;
          L1: while (true) {
            if (var6 >= var10.length) {
              var5 = param0;
              if (-81 != (var5 ^ -1)) {
                return false;
              } else {
                L2: {
                  if (pe.field_l[81]) {
                    stackOut_18_0 = this.a(1, param2);
                    stackIn_19_0 = stackOut_18_0;
                    break L2;
                  } else {
                    stackOut_17_0 = this.b(true, param2);
                    stackIn_19_0 = stackOut_17_0;
                    break L2;
                  }
                }
                return stackIn_19_0;
              }
            } else {
              var7 = var10[var6];
              if (var7 != null) {
                if (var7.f(-58)) {
                  if (var7.a(param0, (byte) 110, param2, param3)) {
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

    private final boolean b(boolean param0, oc param1) {
        if (!param0) {
            Object var4 = null;
            boolean discarded$0 = ((ag) this).a(91, (byte) 97, (oc) null, '<');
        }
        return this.a(1, param1, (byte) 116);
    }

    final void a(int param0, int param1, int param2, oc param3, int param4, int param5) {
        oc[] var7 = null;
        int var8 = 0;
        oc var9 = null;
        int var10 = 0;
        Object var11 = null;
        oc[] var12 = null;
        L0: {
          var10 = BrickABrac.field_J ? 1 : 0;
          if (param4 == 19223) {
            break L0;
          } else {
            var11 = null;
            boolean discarded$2 = ((ag) this).a(78, (byte) -22, (oc) null, '￻');
            break L0;
          }
        }
        if (null == ((ag) this).field_H) {
          return;
        } else {
          var12 = ((ag) this).field_H;
          var7 = var12;
          var8 = 0;
          L1: while (true) {
            if (var12.length <= var8) {
              return;
            } else {
              var9 = var12[var8];
              if (var9 != null) {
                var9.a(param0, param1, param2 + ((ag) this).field_w, param3, param4 ^ 0, param5 + ((ag) this).field_o);
                var8++;
                continue L1;
              } else {
                var8++;
                continue L1;
              }
            }
          }
        }
    }

    private final void a(byte param0, int param1, Hashtable param2, StringBuilder param3) {
        int var6 = 0;
        oc var7 = null;
        int var8 = 0;
        int var9 = 0;
        oc[] var10 = null;
        var9 = BrickABrac.field_J ? 1 : 0;
        if (null != ((ag) this).field_H) {
          L0: {
            var10 = ((ag) this).field_H;
            var6 = 0;
            if (param0 > 72) {
              break L0;
            } else {
              ag.c(true);
              break L0;
            }
          }
          L1: while (true) {
            if (var6 >= var10.length) {
              return;
            } else {
              var7 = var10[var6];
              StringBuilder discarded$34 = param3.append(10);
              var8 = 0;
              L2: while (true) {
                if (param1 < var8) {
                  if (var7 == null) {
                    StringBuilder discarded$35 = param3.append("null");
                    var6++;
                    continue L1;
                  } else {
                    StringBuilder discarded$36 = var7.a(param1 - -1, param2, 24, param3);
                    var6++;
                    continue L1;
                  }
                } else {
                  StringBuilder discarded$37 = param3.append(32);
                  var8++;
                  continue L2;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final boolean f(int param0) {
        if (param0 > -49) {
            ((ag) this).field_H = null;
        }
        return null != this.a((byte) -78) ? true : false;
    }

    ag(int param0, int param1, int param2, int param3, ub param4) {
        super(param0, param1, param2, param3, param4, (uh) null);
    }

    final void b(boolean param0) {
        oc[] var2 = null;
        int var3 = 0;
        oc var4 = null;
        int var5 = 0;
        L0: {
          var5 = BrickABrac.field_J ? 1 : 0;
          var2 = ((ag) this).field_H;
          var3 = 0;
          if (!param0) {
            break L0;
          } else {
            oc discarded$2 = this.a((byte) 108);
            break L0;
          }
        }
        L1: while (true) {
          if (var2.length <= var3) {
            return;
          } else {
            var4 = var2[var3];
            if (var4 != null) {
              var4.b(false);
              var3++;
              continue L1;
            } else {
              var3++;
              continue L1;
            }
          }
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, oc param5, int param6) {
        oc[] var8 = null;
        int var9 = 0;
        oc var10 = null;
        int var11 = 0;
        oc[] var12 = null;
        var11 = BrickABrac.field_J ? 1 : 0;
        if (null == ((ag) this).field_H) {
          return false;
        } else {
          if (param3 < -125) {
            var12 = ((ag) this).field_H;
            var8 = var12;
            var9 = 0;
            L0: while (true) {
              if (var12.length <= var9) {
                return false;
              } else {
                var10 = var12[var9];
                if (var10 != null) {
                  if (var10.f(-109)) {
                    if (var10.a(param0, param1, param2, -126, param4, param5, param6)) {
                      return true;
                    } else {
                      var9++;
                      continue L0;
                    }
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
            return false;
          }
        }
    }

    abstract void a(int param0);

    private final oc a(byte param0) {
        oc[] var2 = null;
        int var3 = 0;
        oc var4 = null;
        int var5 = 0;
        oc[] var6 = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (null != ((ag) this).field_H) {
          if (param0 == -78) {
            var6 = ((ag) this).field_H;
            var2 = var6;
            var3 = 0;
            L0: while (true) {
              if (var3 < var6.length) {
                var4 = var6[var3];
                if (var4 != null) {
                  if (var4.f(-88)) {
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

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        ((ag) this).a(param3 ^ -251);
    }

    private final boolean a(int param0, oc param1, byte param2) {
        int var4 = 0;
        oc var5 = null;
        oc var6 = null;
        int var7 = 0;
        var7 = BrickABrac.field_J ? 1 : 0;
        if (null != ((ag) this).field_H) {
          L0: {
            if (param2 == 116) {
              break L0;
            } else {
              field_F = null;
              break L0;
            }
          }
          var4 = 0;
          L1: while (true) {
            if (((ag) this).field_H.length <= var4) {
              return false;
            } else {
              var5 = ((ag) this).field_H[var4];
              if (var5 != null) {
                if (var5.f(-57)) {
                  var4 = var4 + param0;
                  L2: while (true) {
                    if (((ag) this).field_H.length > var4) {
                      L3: {
                        var6 = ((ag) this).field_H[var4];
                        if (var6 == null) {
                          break L3;
                        } else {
                          if (!var6.a(true, param1)) {
                            break L3;
                          } else {
                            return true;
                          }
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
        } else {
          return false;
        }
    }

    final static void a(byte param0, String param1) {
        on.field_A.field_Mb = param1;
        sc.field_c = true;
        int var2 = kc.field_q.field_g;
        if (param0 != -83) {
            return;
        }
        int var3 = kc.field_q.field_f;
        int var4 = on.field_A.field_O.b(param1, 272, on.field_A.field_R);
        int var5 = -(var4 / 2) + var3 / 2 + -103;
        qp.field_f.a(-(2 * var5) + (-120 + var3), var5, (var2 + -320) / 2, 320, (byte) 64);
        qp.field_f.field_Jb = na.a(false, 8421504, 3, 11579568, qp.field_f.field_cb, 2105376);
        on.field_A.a(-24 + (qp.field_f.field_cb + -20), 16, 24, -24 + (-24 + qp.field_f.field_Ib), (byte) 64);
        nh.field_a.a(24, -24 + (-20 + qp.field_f.field_cb), 120, 80, (byte) 64);
    }

    void a(oc param0, byte param1, int param2, int param3) {
        oc[] var5 = null;
        int var6 = 0;
        oc var7 = null;
        int var8 = 0;
        oc[] var9 = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        super.a(param0, param1, param2, param3);
        if (((ag) this).field_H != null) {
          var9 = ((ag) this).field_H;
          var5 = var9;
          var6 = 0;
          L0: while (true) {
            if (var6 >= var9.length) {
              return;
            } else {
              var7 = var9[var6];
              if (var7 != null) {
                var7.a(param0, (byte) 0, ((ag) this).field_o + param2, param3 - -((ag) this).field_w);
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

    final String d(int param0) {
        oc[] var2 = null;
        int var3 = 0;
        oc var4 = null;
        String var5 = null;
        int var6 = 0;
        var6 = BrickABrac.field_J ? 1 : 0;
        if (((ag) this).field_H != null) {
          var2 = ((ag) this).field_H;
          var3 = 0;
          L0: while (true) {
            if (var3 >= var2.length) {
              if (param0 < 6) {
                field_D = null;
                return null;
              } else {
                return null;
              }
            } else {
              var4 = var2[var3];
              if (var4 != null) {
                var5 = var4.d(21);
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
            }
          }
        } else {
          return null;
        }
    }

    final StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        if (!(!((ag) this).a(param3, param2 ^ 1595638000, param0, param1))) {
            ((ag) this).a(param1, param0, param2 ^ 24, param3);
            this.a((byte) 119, param0, param1, param3);
        }
        if (param2 != 24) {
            Object var6 = null;
            boolean discarded$0 = this.a(26, -76, (oc) null);
        }
        return param3;
    }

    final boolean a(boolean param0, oc param1) {
        oc[] var3 = null;
        int var4 = 0;
        oc var5 = null;
        int var6 = 0;
        Object var7 = null;
        oc[] var8 = null;
        L0: {
          var6 = BrickABrac.field_J ? 1 : 0;
          var8 = ((ag) this).field_H;
          var3 = var8;
          if (param0) {
            break L0;
          } else {
            var7 = null;
            boolean discarded$2 = ((ag) this).a(18, 61, 105, -29, 39, (oc) null, -74);
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var4 >= var8.length) {
            return false;
          } else {
            var5 = var8[var4];
            if (var5 != null) {
              if (var5.a(true, param1)) {
                return true;
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

    final int e(byte param0) {
        int var2 = 0;
        oc[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        oc var6 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = BrickABrac.field_J ? 1 : 0;
        var2 = 0;
        var4 = -128 % ((-17 - param0) / 43);
        var3 = ((ag) this).field_H;
        var5 = 0;
        L0: while (true) {
          if (var3.length <= var5) {
            return var2;
          } else {
            var6 = var3[var5];
            if (var6 != null) {
              var7 = var6.e((byte) 117);
              if (var7 > var2) {
                var2 = var7;
                var5++;
                continue L0;
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

    final static void a(byte param0, boolean param1, boolean param2) {
        if (param0 != -16) {
            Object var4 = null;
            ag.a((byte) 10, (String) null);
        }
        Object var5 = null;
        bf.a(param2, param1, -15947, (String) null);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        field_M = new int[256];
        field_I = "Spectate";
        for (var0 = 0; var0 < 256; var0++) {
            var1 = var0;
            field_M[var0] = ud.d(ud.d(var1 << -1036165168, var1 << 442626152), 0 * var1);
        }
        field_J = "Find opponents";
        field_L = new int[]{7, 40, 41};
        field_C = "Oh no!";
    }
}
