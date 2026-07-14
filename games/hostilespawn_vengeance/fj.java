/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fj extends le {
    static long field_Rb;
    private le field_Fb;
    private le field_Gb;
    static rc field_Tb;
    private le field_Qb;
    static String field_Sb;
    static int field_Lb;
    private int field_Hb;
    private le field_Nb;
    static int field_Jb;
    static bd[] field_Kb;
    private le field_Ib;
    static double field_Pb;
    private le field_Mb;
    static int field_Ob;

    fj(long param0, le param1, le param2, le param3, le param4) {
        super(param0, (le) null);
        ((fj) this).field_Fb = new le(0L, param1);
        ((fj) this).field_Gb = new le(0L, param2);
        ((fj) this).a(false, ((fj) this).field_Fb);
        ((fj) this).a(false, ((fj) this).field_Gb);
        ((fj) this).field_Qb = new le(0L, (le) null);
        ((fj) this).a(false, ((fj) this).field_Qb);
        ((fj) this).field_Nb = new le(0L, param3);
        ((fj) this).field_Ib = new le(0L, param3);
        ((fj) this).field_Ib.field_B = true;
        le var9 = ((fj) this).field_Nb;
        le var10 = var9;
        var10.field_B = true;
        ((fj) this).field_Qb.a(false, ((fj) this).field_Nb);
        ((fj) this).field_Qb.a(false, ((fj) this).field_Ib);
        ((fj) this).field_Mb = new le(0L, param4);
        ((fj) this).field_Mb.field_Db = true;
        ((fj) this).field_Qb.a(false, ((fj) this).field_Mb);
    }

    final static Boolean k(int param0) {
        Boolean var1 = ii.field_h;
        if (param0 != -11401) {
            field_Tb = null;
            ii.field_h = null;
            return var1;
        }
        ii.field_h = null;
        return var1;
    }

    public static void i(int param0) {
        field_Sb = null;
        field_Tb = null;
        if (param0 != -24510) {
            field_Pb = -1.0872068835562798;
            field_Kb = null;
            return;
        }
        field_Kb = null;
    }

    final boolean h(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -24467) {
          L0: {
            field_Tb = null;
            if (((fj) this).field_Mb.field_W == 0) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((fj) this).field_Mb.field_W == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        le var14 = null;
        le var15 = null;
        le var16 = null;
        le var17 = null;
        le var18 = null;
        le var19 = null;
        le stackIn_12_0 = null;
        le stackIn_12_1 = null;
        le stackIn_12_2 = null;
        le stackIn_13_0 = null;
        le stackIn_13_1 = null;
        le stackIn_13_2 = null;
        le stackIn_14_0 = null;
        le stackIn_14_1 = null;
        le stackIn_14_2 = null;
        int stackIn_14_3 = 0;
        le stackIn_19_0 = null;
        le stackIn_19_1 = null;
        le stackIn_19_2 = null;
        le stackIn_20_0 = null;
        le stackIn_20_1 = null;
        le stackIn_20_2 = null;
        le stackIn_21_0 = null;
        le stackIn_21_1 = null;
        le stackIn_21_2 = null;
        int stackIn_21_3 = 0;
        le stackOut_18_0 = null;
        le stackOut_18_1 = null;
        le stackOut_18_2 = null;
        le stackOut_20_0 = null;
        le stackOut_20_1 = null;
        le stackOut_20_2 = null;
        int stackOut_20_3 = 0;
        le stackOut_19_0 = null;
        le stackOut_19_1 = null;
        le stackOut_19_2 = null;
        int stackOut_19_3 = 0;
        le stackOut_11_0 = null;
        le stackOut_11_1 = null;
        le stackOut_11_2 = null;
        le stackOut_13_0 = null;
        le stackOut_13_1 = null;
        le stackOut_13_2 = null;
        int stackOut_13_3 = 0;
        le stackOut_12_0 = null;
        le stackOut_12_1 = null;
        le stackOut_12_2 = null;
        int stackOut_12_3 = 0;
        L0: {
          if (((fj) this).field_qb * 2 > ((fj) this).field_sb) {
            var6 = ((fj) this).field_sb / 2;
            var5 = ((fj) this).field_sb / 2;
            break L0;
          } else {
            var5 = ((fj) this).field_qb;
            var6 = -((fj) this).field_qb + ((fj) this).field_sb;
            break L0;
          }
        }
        var7 = var6 + -var5;
        var8 = var7;
        if (param0 <= 0) {
          L1: {
            var9 = param0 + -param2;
            var10 = var7 + -var8;
            var11 = 0;
            if (0 < var9) {
              var11 = (var9 / 2 + param3 * var10) / var9;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            var12 = var11 + var8 / 2;
            var14 = ((fj) this).field_Fb;
            var14.field_sb = var5;
            var14.field_qb = ((fj) this).field_qb;
            var14.field_zb = 0;
            var14.field_tb = 0;
            var15 = ((fj) this).field_Gb;
            var15.field_zb = var6;
            var15.field_qb = ((fj) this).field_qb;
            var15.field_tb = param1;
            var15.field_sb = -var6 + ((fj) this).field_sb;
            var16 = ((fj) this).field_Qb;
            var16.field_qb = ((fj) this).field_qb;
            var16.field_tb = 0;
            var16.field_zb = var5;
            var16.field_sb = var7;
            var17 = ((fj) this).field_Nb;
            var17.field_zb = 0;
            var17.field_sb = var12;
            var17.field_tb = 0;
            var17.field_qb = ((fj) this).field_qb;
            var18 = ((fj) this).field_Ib;
            var18.field_tb = 0;
            var18.field_zb = var12;
            var18.field_qb = ((fj) this).field_qb;
            var18.field_sb = -var12 + var7;
            var19 = ((fj) this).field_Mb;
            var19.field_tb = 0;
            var19.field_sb = var8;
            var19.field_zb = var11;
            stackOut_18_0 = ((fj) this).field_Fb;
            stackOut_18_1 = ((fj) this).field_Gb;
            stackOut_18_2 = ((fj) this).field_Qb;
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_20_2 = stackOut_18_2;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            stackIn_19_2 = stackOut_18_2;
            if (param2 >= param0) {
              stackOut_20_0 = (le) (Object) stackIn_20_0;
              stackOut_20_1 = (le) (Object) stackIn_20_1;
              stackOut_20_2 = (le) (Object) stackIn_20_2;
              stackOut_20_3 = 0;
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              stackIn_21_3 = stackOut_20_3;
              break L2;
            } else {
              stackOut_19_0 = (le) (Object) stackIn_19_0;
              stackOut_19_1 = (le) (Object) stackIn_19_1;
              stackOut_19_2 = (le) (Object) stackIn_19_2;
              stackOut_19_3 = 1;
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              stackIn_21_3 = stackOut_19_3;
              break L2;
            }
          }
          stackIn_21_2.field_jb = stackIn_21_3 != 0;
          stackIn_21_1.field_jb = stackIn_21_3 != 0;
          stackIn_21_0.field_jb = stackIn_21_3 != 0;
          var19.field_qb = ((fj) this).field_qb;
          return;
        } else {
          L3: {
            var8 = var8 * param2 / param0;
            if (var8 >= ((fj) this).field_qb) {
              break L3;
            } else {
              var8 = ((fj) this).field_qb;
              break L3;
            }
          }
          L4: {
            if (var8 <= var7) {
              break L4;
            } else {
              var8 = var7;
              break L4;
            }
          }
          L5: {
            var9 = param0 + -param2;
            var10 = var7 + -var8;
            var11 = 0;
            if (0 < var9) {
              var11 = (var9 / 2 + param3 * var10) / var9;
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            var12 = var11 + var8 / 2;
            var14 = ((fj) this).field_Fb;
            var14.field_sb = var5;
            var14.field_qb = ((fj) this).field_qb;
            var14.field_zb = 0;
            var14.field_tb = 0;
            var15 = ((fj) this).field_Gb;
            var15.field_zb = var6;
            var15.field_qb = ((fj) this).field_qb;
            var15.field_tb = param1;
            var15.field_sb = -var6 + ((fj) this).field_sb;
            var16 = ((fj) this).field_Qb;
            var16.field_qb = ((fj) this).field_qb;
            var16.field_tb = 0;
            var16.field_zb = var5;
            var16.field_sb = var7;
            var17 = ((fj) this).field_Nb;
            var17.field_zb = 0;
            var17.field_sb = var12;
            var17.field_tb = 0;
            var17.field_qb = ((fj) this).field_qb;
            var18 = ((fj) this).field_Ib;
            var18.field_tb = 0;
            var18.field_zb = var12;
            var18.field_qb = ((fj) this).field_qb;
            var18.field_sb = -var12 + var7;
            var19 = ((fj) this).field_Mb;
            var19.field_tb = 0;
            var19.field_sb = var8;
            var19.field_zb = var11;
            stackOut_11_0 = ((fj) this).field_Fb;
            stackOut_11_1 = ((fj) this).field_Gb;
            stackOut_11_2 = ((fj) this).field_Qb;
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_13_2 = stackOut_11_2;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            stackIn_12_2 = stackOut_11_2;
            if (param2 >= param0) {
              stackOut_13_0 = (le) (Object) stackIn_13_0;
              stackOut_13_1 = (le) (Object) stackIn_13_1;
              stackOut_13_2 = (le) (Object) stackIn_13_2;
              stackOut_13_3 = 0;
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              stackIn_14_3 = stackOut_13_3;
              break L6;
            } else {
              stackOut_12_0 = (le) (Object) stackIn_12_0;
              stackOut_12_1 = (le) (Object) stackIn_12_1;
              stackOut_12_2 = (le) (Object) stackIn_12_2;
              stackOut_12_3 = 1;
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              stackIn_14_3 = stackOut_12_3;
              break L6;
            }
          }
          stackIn_14_2.field_jb = stackIn_14_3 != 0;
          stackIn_14_1.field_jb = stackIn_14_3 != 0;
          stackIn_14_0.field_jb = stackIn_14_3 != 0;
          var19.field_qb = ((fj) this).field_qb;
          return;
        }
    }

    final boolean f(int param0) {
        if (param0 == 2) {
          if (0 == ((fj) this).field_Fb.field_Q) {
            if (((fj) this).field_Fb.field_W != 0) {
              L0: {
                if ((((fj) this).field_Hb ^ -1) < -1) {
                  ((fj) this).field_Hb = ((fj) this).field_Hb - 1;
                  break L0;
                } else {
                  break L0;
                }
              }
              if (((fj) this).field_Hb != 0) {
                return false;
              } else {
                ((fj) this).field_Hb = 3;
                return true;
              }
            } else {
              return false;
            }
          } else {
            ((fj) this).field_Hb = 20;
            return true;
          }
        } else {
          ((fj) this).field_Mb = null;
          if (0 == ((fj) this).field_Fb.field_Q) {
            if (((fj) this).field_Fb.field_W != 0) {
              L1: {
                if ((((fj) this).field_Hb ^ -1) < -1) {
                  ((fj) this).field_Hb = ((fj) this).field_Hb - 1;
                  break L1;
                } else {
                  break L1;
                }
              }
              if (((fj) this).field_Hb != 0) {
                return false;
              } else {
                ((fj) this).field_Hb = 3;
                return true;
              }
            } else {
              return false;
            }
          } else {
            ((fj) this).field_Hb = 20;
            return true;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        Object var10 = null;
        ((fj) this).field_qb = param1;
        ((fj) this).field_zb = param4;
        if (param3 != 20) {
          var10 = null;
          int discarded$2 = fj.a((String) null, 31, false, (String) null, -42, (byte) 83, (String) null);
          ((fj) this).field_sb = param5;
          ((fj) this).field_tb = param0;
          ((fj) this).a(param7, 0, param6, param2);
          return;
        } else {
          ((fj) this).field_sb = param5;
          ((fj) this).field_tb = param0;
          ((fj) this).a(param7, 0, param6, param2);
          return;
        }
    }

    final static int a(String param0, int param1, boolean param2, String param3, int param4, byte param5, String param6) {
        s var7 = null;
        s var8 = null;
        var7 = new s(param6);
        if (param5 != -8) {
          field_Kb = null;
          var8 = new s(param0);
          return lb.a(param1, (byte) 124, var7, param2, var8, param3, param4);
        } else {
          var8 = new s(param0);
          return lb.a(param1, (byte) 124, var7, param2, var8, param3, param4);
        }
    }

    final static void a(int param0, m param1, boolean param2) {
        en var3 = null;
        int var4 = 0;
        Object var5 = null;
        en var7 = null;
        en var8 = null;
        if (param2) {
          var8 = s.field_b;
          var3 = var8;
          var8.i(19319, param0);
          var8.field_i = var8.field_i + 1;
          var4 = var8.field_i;
          var8.d(106, 1);
          if (param1.field_i != null) {
            var8.d(114, param1.field_i.length);
            var8.a(param1.field_i.length, param1.field_i, true, 0);
            int discarded$10 = var8.f(var4, -90);
            var8.field_i = var8.field_i - 4;
            param1.field_o = var8.d(8195);
            var8.a(var8.field_i + -var4, -19720);
            return;
          } else {
            var8.d(80, 0);
            int discarded$11 = var8.f(var4, -90);
            var8.field_i = var8.field_i - 4;
            param1.field_o = var8.d(8195);
            var8.a(var8.field_i + -var4, -19720);
            return;
          }
        } else {
          var5 = null;
          int discarded$12 = fj.a((String) null, 7, true, (String) null, 102, (byte) 5, (String) null);
          var7 = s.field_b;
          var3 = var7;
          var7.i(19319, param0);
          var7.field_i = var7.field_i + 1;
          var4 = var7.field_i;
          var7.d(106, 1);
          if (param1.field_i != null) {
            var7.d(114, param1.field_i.length);
            var7.a(param1.field_i.length, param1.field_i, true, 0);
            int discarded$13 = var7.f(var4, -90);
            var7.field_i = var7.field_i - 4;
            param1.field_o = var7.d(8195);
            var7.a(var7.field_i + -var4, -19720);
            return;
          } else {
            var7.d(80, 0);
            int discarded$14 = var7.f(var4, -90);
            var7.field_i = var7.field_i - 4;
            param1.field_o = var7.d(8195);
            var7.a(var7.field_i + -var4, -19720);
            return;
          }
        }
    }

    private final int a(int param0, boolean param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var5 = 0;
        var6 = ((fj) this).field_Qb.field_sb + -((fj) this).field_Mb.field_sb;
        if (param2 <= -22) {
          L0: {
            if (-1 > (var6 ^ -1)) {
              var7 = ((fj) this).field_Mb.field_zb;
              var8 = -param3 + param0;
              var5 = (var8 * var7 + var6 / 2) / var6;
              break L0;
            } else {
              break L0;
            }
          }
          if (!param1) {
            L1: {
              if (var5 <= param0 - param3) {
                break L1;
              } else {
                var5 = param0 + -param3;
                break L1;
              }
            }
            if (var5 >= 0) {
              return var5;
            } else {
              var5 = 0;
              return var5;
            }
          } else {
            L2: {
              if (0 <= var5) {
                break L2;
              } else {
                var5 = 0;
                break L2;
              }
            }
            if (-param3 + param0 >= var5) {
              return var5;
            } else {
              var5 = -param3 + param0;
              return var5;
            }
          }
        } else {
          L3: {
            ((fj) this).a(-95, -63, 115, -27);
            if (-1 > (var6 ^ -1)) {
              var7 = ((fj) this).field_Mb.field_zb;
              var8 = -param3 + param0;
              var5 = (var8 * var7 + var6 / 2) / var6;
              break L3;
            } else {
              break L3;
            }
          }
          if (!param1) {
            L4: {
              if (var5 <= param0 - param3) {
                break L4;
              } else {
                var5 = param0 + -param3;
                break L4;
              }
            }
            if (var5 >= 0) {
              return var5;
            } else {
              var5 = 0;
              return var5;
            }
          } else {
            L5: {
              if (0 <= var5) {
                break L5;
              } else {
                var5 = 0;
                break L5;
              }
            }
            if (-param3 + param0 >= var5) {
              return var5;
            } else {
              var5 = -param3 + param0;
              return var5;
            }
          }
        }
    }

    final boolean j(int param0) {
        if (((fj) this).field_Gb.field_Q == -1) {
          if (param0 == 0) {
            if (-1 != ((fj) this).field_Gb.field_W) {
              if (((fj) this).field_Hb <= 0) {
                if (((fj) this).field_Hb != 0) {
                  return false;
                } else {
                  ((fj) this).field_Hb = 3;
                  return true;
                }
              } else {
                ((fj) this).field_Hb = ((fj) this).field_Hb - 1;
                if (((fj) this).field_Hb == 0) {
                  ((fj) this).field_Hb = 3;
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          } else {
            boolean discarded$1 = ((fj) this).g(-49);
            if (-1 != ((fj) this).field_Gb.field_W) {
              if (((fj) this).field_Hb > 0) {
                ((fj) this).field_Hb = ((fj) this).field_Hb - 1;
                if (((fj) this).field_Hb == -1) {
                  ((fj) this).field_Hb = 3;
                  return true;
                } else {
                  return false;
                }
              } else {
                if (((fj) this).field_Hb == 0) {
                  ((fj) this).field_Hb = 3;
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          }
        } else {
          ((fj) this).field_Hb = 20;
          return true;
        }
    }

    final boolean g(int param0) {
        if (-1 == (((fj) this).field_Nb.field_Q ^ -1)) {
          if ((((fj) this).field_Nb.field_W ^ -1) != param0) {
            L0: {
              if ((((fj) this).field_Hb ^ -1) < -1) {
                ((fj) this).field_Hb = ((fj) this).field_Hb - 1;
                break L0;
              } else {
                break L0;
              }
            }
            if (((fj) this).field_Hb == 0) {
              if (((fj) this).field_Mb.field_mb + ((fj) this).field_Mb.field_z <= rb.field_m) {
                return false;
              } else {
                ((fj) this).field_Hb = 3;
                return true;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          ((fj) this).field_Hb = 20;
          return true;
        }
    }

    final static void a(byte[] param0, int param1, int param2, File param3) throws IOException {
        FileOutputStream var4 = null;
        if (param1 != 15445) {
          field_Ob = 85;
          var4 = new FileOutputStream(param3);
          var4.write(param0, 0, param2);
          var4.close();
          return;
        } else {
          var4 = new FileOutputStream(param3);
          var4.write(param0, 0, param2);
          var4.close();
          return;
        }
    }

    final boolean c(boolean param0) {
        if (((fj) this).field_Ib.field_Q == 0) {
          if (!param0) {
            if (((fj) this).field_Ib.field_W != -1) {
              L0: {
                if (-1 < ((fj) this).field_Hb) {
                  ((fj) this).field_Hb = ((fj) this).field_Hb - 1;
                  break L0;
                } else {
                  break L0;
                }
              }
              if (((fj) this).field_Hb == 0) {
                if (((fj) this).field_Mb.field_N + ((fj) this).field_Mb.field_sb + (((fj) this).field_Mb.field_z + ((fj) this).field_Mb.field_mb) > rb.field_m) {
                  return false;
                } else {
                  ((fj) this).field_Hb = 3;
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          ((fj) this).field_Hb = 20;
          return true;
        }
    }

    final int a(int param0, byte param1, int param2) {
        if (param1 != 126) {
          field_Jb = -105;
          return this.a(param0, false, -110, param2);
        } else {
          return this.a(param0, false, -110, param2);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Pb = 0.0;
    }
}
