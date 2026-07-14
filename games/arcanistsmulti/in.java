/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class in extends kc {
    private kc field_Ib;
    static kc field_Jb;
    private kc field_Cb;
    private kc field_Mb;
    static co field_Gb;
    private int field_Bb;
    static java.awt.Frame field_Eb;
    private kc field_Lb;
    static byte[] field_Nb;
    static int[] field_Fb;
    private kc field_Hb;
    static String field_Kb;
    private kc field_Db;

    final boolean e(int param0) {
        int var2 = 0;
        if (-1 != (((in) this).field_Hb.field_U ^ -1)) {
          ((in) this).field_Bb = 20;
          return true;
        } else {
          if (0 != ((in) this).field_Hb.field_P) {
            L0: {
              if (0 < ((in) this).field_Bb) {
                ((in) this).field_Bb = ((in) this).field_Bb - 1;
                break L0;
              } else {
                break L0;
              }
            }
            if (-1 == (((in) this).field_Bb ^ -1)) {
              if (me.field_I >= ((in) this).field_Cb.field_nb - -((in) this).field_Cb.field_bb) {
                var2 = 83 % ((param0 - -69) / 52);
                return false;
              } else {
                ((in) this).field_Bb = 3;
                return true;
              }
            } else {
              var2 = 83 % ((param0 - -69) / 52);
              return false;
            }
          } else {
            var2 = 83 % ((param0 - -69) / 52);
            return false;
          }
        }
    }

    final boolean f(byte param0) {
        if (-1 != (((in) this).field_Mb.field_U ^ -1)) {
          ((in) this).field_Bb = 20;
          return true;
        } else {
          if (0 != ((in) this).field_Mb.field_P) {
            if (-1 <= ((in) this).field_Bb) {
              if (-1 != (((in) this).field_Bb ^ -1)) {
                if (param0 != 59) {
                  field_Jb = null;
                  return false;
                } else {
                  return false;
                }
              } else {
                ((in) this).field_Bb = 3;
                return true;
              }
            } else {
              ((in) this).field_Bb = ((in) this).field_Bb - 1;
              if (-1 != ((in) this).field_Bb) {
                if (param0 == 59) {
                  return false;
                } else {
                  field_Jb = null;
                  return false;
                }
              } else {
                ((in) this).field_Bb = 3;
                return true;
              }
            }
          } else {
            if (param0 != 59) {
              field_Jb = null;
              return false;
            } else {
              return false;
            }
          }
        }
    }

    final boolean f(int param0) {
        int var2 = -50 / ((param0 - 44) / 41);
        return ((in) this).field_Cb.field_P != 0 ? true : false;
    }

    in(long param0, in param1) {
        this(param0, param1.field_Mb, param1.field_Ib, param1.field_Hb, param1.field_Cb);
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
        kc var14 = null;
        kc var15 = null;
        kc var16 = null;
        kc var17 = null;
        kc var18 = null;
        kc var19 = null;
        kc stackIn_10_0 = null;
        kc stackIn_10_1 = null;
        kc stackIn_10_2 = null;
        kc stackIn_11_0 = null;
        kc stackIn_11_1 = null;
        kc stackIn_11_2 = null;
        kc stackIn_12_0 = null;
        kc stackIn_12_1 = null;
        kc stackIn_12_2 = null;
        int stackIn_12_3 = 0;
        kc stackIn_24_0 = null;
        kc stackIn_24_1 = null;
        kc stackIn_24_2 = null;
        kc stackIn_25_0 = null;
        kc stackIn_25_1 = null;
        kc stackIn_25_2 = null;
        kc stackIn_26_0 = null;
        kc stackIn_26_1 = null;
        kc stackIn_26_2 = null;
        int stackIn_26_3 = 0;
        kc stackOut_23_0 = null;
        kc stackOut_23_1 = null;
        kc stackOut_23_2 = null;
        kc stackOut_25_0 = null;
        kc stackOut_25_1 = null;
        kc stackOut_25_2 = null;
        int stackOut_25_3 = 0;
        kc stackOut_24_0 = null;
        kc stackOut_24_1 = null;
        kc stackOut_24_2 = null;
        int stackOut_24_3 = 0;
        kc stackOut_9_0 = null;
        kc stackOut_9_1 = null;
        kc stackOut_9_2 = null;
        kc stackOut_11_0 = null;
        kc stackOut_11_1 = null;
        kc stackOut_11_2 = null;
        int stackOut_11_3 = 0;
        kc stackOut_10_0 = null;
        kc stackOut_10_1 = null;
        kc stackOut_10_2 = null;
        int stackOut_10_3 = 0;
        L0: {
          if (((in) this).field_x * 2 <= ((in) this).field_I) {
            var6 = -((in) this).field_x + ((in) this).field_I;
            var5 = ((in) this).field_x;
            break L0;
          } else {
            var6 = ((in) this).field_I / 2;
            var5 = ((in) this).field_I / 2;
            break L0;
          }
        }
        var7 = -var5 + var6;
        var8 = var7;
        if (0 < param3) {
          L1: {
            var8 = var8 * param1 / param3;
            if (var8 < ((in) this).field_x) {
              var8 = ((in) this).field_x;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (var7 >= var8) {
              break L2;
            } else {
              var8 = var7;
              break L2;
            }
          }
          L3: {
            var9 = param3 - param1;
            var10 = -var8 + var7;
            var11 = 0;
            if (-1 > (var9 ^ -1)) {
              var11 = (var9 / 2 + param2 * var10) / var9;
              break L3;
            } else {
              break L3;
            }
          }
          var12 = var11 - -(var8 / 2);
          var14 = ((in) this).field_Mb;
          var14.field_db = 0;
          var14.field_T = 0;
          var14.field_I = var5;
          var14.field_x = ((in) this).field_x;
          var15 = ((in) this).field_Ib;
          var15.field_x = ((in) this).field_x;
          var15.field_I = ((in) this).field_I - var6;
          var15.field_db = var6;
          var15.field_T = 0;
          var16 = ((in) this).field_Lb;
          var16.field_x = ((in) this).field_x;
          var16.field_I = var7;
          var16.field_db = var5;
          var16.field_T = 0;
          var17 = ((in) this).field_Hb;
          var17.field_I = var12;
          var17.field_T = 0;
          var17.field_db = 0;
          var17.field_x = ((in) this).field_x;
          var18 = ((in) this).field_Db;
          var18.field_T = 0;
          var18.field_db = var12;
          if (param0 > 87) {
            L4: {
              var18.field_x = ((in) this).field_x;
              var18.field_I = var7 + -var12;
              var19 = ((in) this).field_Cb;
              var19.field_x = ((in) this).field_x;
              var19.field_T = 0;
              stackOut_23_0 = ((in) this).field_Mb;
              stackOut_23_1 = ((in) this).field_Ib;
              stackOut_23_2 = ((in) this).field_Lb;
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              if (param1 >= param3) {
                stackOut_25_0 = (kc) (Object) stackIn_25_0;
                stackOut_25_1 = (kc) (Object) stackIn_25_1;
                stackOut_25_2 = (kc) (Object) stackIn_25_2;
                stackOut_25_3 = 0;
                stackIn_26_0 = stackOut_25_0;
                stackIn_26_1 = stackOut_25_1;
                stackIn_26_2 = stackOut_25_2;
                stackIn_26_3 = stackOut_25_3;
                break L4;
              } else {
                stackOut_24_0 = (kc) (Object) stackIn_24_0;
                stackOut_24_1 = (kc) (Object) stackIn_24_1;
                stackOut_24_2 = (kc) (Object) stackIn_24_2;
                stackOut_24_3 = 1;
                stackIn_26_0 = stackOut_24_0;
                stackIn_26_1 = stackOut_24_1;
                stackIn_26_2 = stackOut_24_2;
                stackIn_26_3 = stackOut_24_3;
                break L4;
              }
            }
            ((kc) (Object) stackIn_26_2).field_ub = stackIn_26_3 != 0;
            ((kc) (Object) stackIn_26_1).field_ub = stackIn_26_3 != 0;
            ((kc) (Object) stackIn_26_0).field_ub = stackIn_26_3 != 0;
            var19.field_db = var11;
            var19.field_I = var8;
            return;
          } else {
            return;
          }
        } else {
          L5: {
            var9 = param3 - param1;
            var10 = -var8 + var7;
            var11 = 0;
            if (-1 > (var9 ^ -1)) {
              var11 = (var9 / 2 + param2 * var10) / var9;
              break L5;
            } else {
              break L5;
            }
          }
          var12 = var11 - -(var8 / 2);
          var14 = ((in) this).field_Mb;
          var14.field_db = 0;
          var14.field_T = 0;
          var14.field_I = var5;
          var14.field_x = ((in) this).field_x;
          var15 = ((in) this).field_Ib;
          var15.field_x = ((in) this).field_x;
          var15.field_I = ((in) this).field_I - var6;
          var15.field_db = var6;
          var15.field_T = 0;
          var16 = ((in) this).field_Lb;
          var16.field_x = ((in) this).field_x;
          var16.field_I = var7;
          var16.field_db = var5;
          var16.field_T = 0;
          var17 = ((in) this).field_Hb;
          var17.field_I = var12;
          var17.field_T = 0;
          var17.field_db = 0;
          var17.field_x = ((in) this).field_x;
          var18 = ((in) this).field_Db;
          var18.field_T = 0;
          var18.field_db = var12;
          if (param0 > 87) {
            L6: {
              var18.field_x = ((in) this).field_x;
              var18.field_I = var7 + -var12;
              var19 = ((in) this).field_Cb;
              var19.field_x = ((in) this).field_x;
              var19.field_T = 0;
              stackOut_9_0 = ((in) this).field_Mb;
              stackOut_9_1 = ((in) this).field_Ib;
              stackOut_9_2 = ((in) this).field_Lb;
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              if (param1 >= param3) {
                stackOut_11_0 = (kc) (Object) stackIn_11_0;
                stackOut_11_1 = (kc) (Object) stackIn_11_1;
                stackOut_11_2 = (kc) (Object) stackIn_11_2;
                stackOut_11_3 = 0;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                stackIn_12_2 = stackOut_11_2;
                stackIn_12_3 = stackOut_11_3;
                break L6;
              } else {
                stackOut_10_0 = (kc) (Object) stackIn_10_0;
                stackOut_10_1 = (kc) (Object) stackIn_10_1;
                stackOut_10_2 = (kc) (Object) stackIn_10_2;
                stackOut_10_3 = 1;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                stackIn_12_2 = stackOut_10_2;
                stackIn_12_3 = stackOut_10_3;
                break L6;
              }
            }
            ((kc) (Object) stackIn_12_2).field_ub = stackIn_12_3 != 0;
            ((kc) (Object) stackIn_12_1).field_ub = stackIn_12_3 != 0;
            ((kc) (Object) stackIn_12_0).field_ub = stackIn_12_3 != 0;
            var19.field_db = var11;
            var19.field_I = var8;
            return;
          } else {
            return;
          }
        }
    }

    public static void g(byte param0) {
        field_Jb = null;
        field_Nb = null;
        field_Kb = null;
        field_Fb = null;
        if (param0 != -120) {
            return;
        }
        field_Gb = null;
        field_Eb = null;
    }

    in(long param0, kc param1, kc param2, kc param3, kc param4) {
        super(param0, (kc) null);
        ((in) this).field_Mb = new kc(0L, param1);
        ((in) this).field_Ib = new kc(0L, param2);
        ((in) this).a(((in) this).field_Mb, 116);
        ((in) this).a(((in) this).field_Ib, 105);
        ((in) this).field_Lb = new kc(0L, (kc) null);
        ((in) this).a(((in) this).field_Lb, 107);
        ((in) this).field_Hb = new kc(0L, param3);
        ((in) this).field_Db = new kc(0L, param3);
        kc var9 = ((in) this).field_Hb;
        kc var10 = var9;
        ((in) this).field_Db.field_yb = true;
        var10.field_yb = true;
        ((in) this).field_Lb.a(((in) this).field_Hb, 72);
        ((in) this).field_Lb.a(((in) this).field_Db, 83);
        ((in) this).field_Cb = new kc(0L, param4);
        ((in) this).field_Cb.field_H = true;
        ((in) this).field_Lb.a(((in) this).field_Cb, 89);
    }

    final int a(int param0, int param1, boolean param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var5 = 0;
        var6 = -((in) this).field_Cb.field_I + ((in) this).field_Lb.field_I;
        if (param3 == -55) {
          L0: {
            if (var6 > 0) {
              var7 = ((in) this).field_Cb.field_db;
              var8 = -param0 + param1;
              var5 = (var8 * var7 + var6 / 2) / var6;
              break L0;
            } else {
              break L0;
            }
          }
          if (param2) {
            L1: {
              if ((var5 ^ -1) <= -1) {
                break L1;
              } else {
                var5 = 0;
                break L1;
              }
            }
            if (param1 + -param0 >= var5) {
              return var5;
            } else {
              var5 = param1 - param0;
              return var5;
            }
          } else {
            L2: {
              if (var5 <= param1 + -param0) {
                break L2;
              } else {
                var5 = -param0 + param1;
                break L2;
              }
            }
            if ((var5 ^ -1) > -1) {
              var5 = 0;
              return var5;
            } else {
              return var5;
            }
          }
        } else {
          L3: {
            ((in) this).a(-125, 112, -79, 37);
            if (var6 > 0) {
              var7 = ((in) this).field_Cb.field_db;
              var8 = -param0 + param1;
              var5 = (var8 * var7 + var6 / 2) / var6;
              break L3;
            } else {
              break L3;
            }
          }
          if (param2) {
            L4: {
              if ((var5 ^ -1) <= -1) {
                break L4;
              } else {
                var5 = 0;
                break L4;
              }
            }
            if (param1 + -param0 >= var5) {
              return var5;
            } else {
              var5 = param1 - param0;
              return var5;
            }
          } else {
            L5: {
              if (var5 <= param1 + -param0) {
                break L5;
              } else {
                var5 = -param0 + param1;
                break L5;
              }
            }
            if ((var5 ^ -1) <= -1) {
              return var5;
            } else {
              var5 = 0;
              return var5;
            }
          }
        }
    }

    final void a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        if (param1) {
          return;
        } else {
          ((in) this).field_T = param7;
          ((in) this).field_x = param5;
          ((in) this).field_db = param0;
          ((in) this).field_I = param2;
          ((in) this).a(89, param6, param4, param3);
          return;
        }
    }

    final boolean e(boolean param0) {
        if (param0) {
          if (((in) this).field_Ib.field_U == 0) {
            if (0 != ((in) this).field_Ib.field_P) {
              if (((in) this).field_Bb >= -1) {
                if (-1 != (((in) this).field_Bb ^ -1)) {
                  return false;
                } else {
                  ((in) this).field_Bb = 3;
                  return true;
                }
              } else {
                ((in) this).field_Bb = ((in) this).field_Bb - 1;
                if (-1 == ((in) this).field_Bb) {
                  ((in) this).field_Bb = 3;
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          } else {
            ((in) this).field_Bb = 20;
            return true;
          }
        } else {
          boolean discarded$1 = ((in) this).f(116);
          if (((in) this).field_Ib.field_U == 0) {
            if (0 != ((in) this).field_Ib.field_P) {
              if (((in) this).field_Bb < -1) {
                ((in) this).field_Bb = ((in) this).field_Bb - 1;
                if (-1 == (((in) this).field_Bb ^ -1)) {
                  ((in) this).field_Bb = 3;
                  return true;
                } else {
                  return false;
                }
              } else {
                if (-1 != ((in) this).field_Bb) {
                  return false;
                } else {
                  ((in) this).field_Bb = 3;
                  return true;
                }
              }
            } else {
              return false;
            }
          } else {
            ((in) this).field_Bb = 20;
            return true;
          }
        }
    }

    final boolean f(boolean param0) {
        if (((in) this).field_Db.field_U != 0) {
          ((in) this).field_Bb = 20;
          return true;
        } else {
          if (((in) this).field_Db.field_P != 0) {
            L0: {
              if (0 < ((in) this).field_Bb) {
                ((in) this).field_Bb = ((in) this).field_Bb - 1;
                break L0;
              } else {
                break L0;
              }
            }
            if (-1 == (((in) this).field_Bb ^ -1)) {
              if (me.field_I < ((in) this).field_Cb.field_B + ((in) this).field_Cb.field_bb + ((in) this).field_Cb.field_nb - -((in) this).field_Cb.field_I) {
                if (!param0) {
                  field_Gb = null;
                  return false;
                } else {
                  return false;
                }
              } else {
                ((in) this).field_Bb = 3;
                return true;
              }
            } else {
              if (!param0) {
                field_Gb = null;
                return false;
              } else {
                return false;
              }
            }
          } else {
            if (!param0) {
              field_Gb = null;
              return false;
            } else {
              return false;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Fb = new int[]{33, 34, 35};
        field_Kb = "You have fallen into the water! Choose a location to teleport to. Since you don't have Arcane Gate available you will lose a third of your health (<%1>). If you fail to do this within the time limit you will lose half of your health! (<%0>)";
    }
}
