/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w extends uc {
    static pm field_v;
    static wm field_w;
    static String field_t;
    static int field_s;
    private lf field_x;
    static il field_y;
    static int[][] field_z;
    private lf[] field_r;
    static String field_u;
    static int field_q;

    w(w param0, boolean param1) {
        this();
        param0.a((w) this, true, param1);
    }

    final lf a(int param0, int param1) {
        if (param1 != 7177) {
            Object var4 = null;
            this.a((w) null, true, true);
        }
        ((w) this).field_r[param0] = new lf();
        return new lf();
    }

    final static void a(byte param0, eq param1) {
        int var3 = Pixelate.field_H ? 1 : 0;
        param1.c(2779);
        if (param0 != -48) {
            return;
        }
        eq var2 = (eq) (Object) nk.field_a.c(1504642273);
        while (var2 != null) {
            // ifeq L59
            var2 = (eq) (Object) nk.field_a.f(1504642273);
        }
        if (var2 != null) {
            jj.a((byte) -4, (fa) (Object) var2, (fa) (Object) param1);
        } else {
            nk.field_a.a(22125, (fa) (Object) param1);
        }
    }

    public static void c(int param0) {
        field_t = null;
        int var1 = 43 % ((param0 - 8) / 48);
        field_u = null;
        field_v = null;
        field_y = null;
        field_z = null;
        field_w = null;
    }

    public w() {
        ((w) this).field_r = new lf[6];
        ((w) this).field_x = new lf();
        ((w) this).field_r[0] = new lf();
        lf var1 = new lf();
        var1.a(true);
    }

    public final void a(ng param0, byte param1, int param2, int param3, boolean param4) {
        lf var7 = null;
        lf var9 = null;
        Object var10 = null;
        qm var11 = null;
        lf var12 = null;
        lf var13 = null;
        lf var14 = null;
        lf var15 = null;
        ng stackIn_3_0 = null;
        ng stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param0 instanceof qm) {
            stackOut_2_0 = (ng) param0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (ng) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var11 = (qm) (Object) stackIn_3_0;
          if (param1 == -124) {
            break L1;
          } else {
            var10 = null;
            w.a((byte) 95, (eq) null);
            break L1;
          }
        }
        L2: {
          hp.a(param3 + param0.field_z, param0.field_p + param2 - -param0.field_C, param0.field_E + param0.field_z + param3, (byte) -120, param0.field_p + param2);
          if (var11 != null) {
            param4 = param4 & var11.field_H;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          var7 = ((w) this).field_r[0];
          ((w) this).field_x.a(true);
          var7.a(((w) this).field_x, param3, (w) this, (byte) 62, param2, param0);
          if (var11 == null) {
            break L3;
          } else {
            L4: {
              if (!var11.field_M) {
                break L4;
              } else {
                var12 = ((w) this).field_r[1];
                if (var12 != null) {
                  var12.a(((w) this).field_x, param3, (w) this, (byte) 71, param2, param0);
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            if (!var11.field_D) {
              break L3;
            } else {
              L5: {
                var13 = ((w) this).field_r[3];
                if (0 == var11.field_k) {
                  break L5;
                } else {
                  if (var13 == null) {
                    break L5;
                  } else {
                    var13.a(((w) this).field_x, param3, (w) this, (byte) -100, param2, param0);
                    break L3;
                  }
                }
              }
              var9 = ((w) this).field_r[2];
              if (var9 == null) {
                break L3;
              } else {
                var9.a(((w) this).field_x, param3, (w) this, (byte) -101, param2, param0);
                break L3;
              }
            }
          }
        }
        L6: {
          if (!param0.b(true)) {
            break L6;
          } else {
            var14 = ((w) this).field_r[5];
            if (var14 != null) {
              var14.a(((w) this).field_x, param3, (w) this, (byte) -67, param2, param0);
              break L6;
            } else {
              break L6;
            }
          }
        }
        L7: {
          if (param4) {
            break L7;
          } else {
            var15 = ((w) this).field_r[4];
            if (var15 != null) {
              var15.a(((w) this).field_x, param3, (w) this, (byte) -118, param2, param0);
              break L7;
            } else {
              break L7;
            }
          }
        }
        ((w) this).field_x.a(param2, param3, param0, (byte) 122, (w) this);
        ia.a((byte) 92);
    }

    final static String a(String param0, byte param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var12 = Pixelate.field_H ? 1 : 0;
          var4 = param0.length();
          var5 = param3.length();
          if (param1 < -35) {
            break L0;
          } else {
            field_w = null;
            break L0;
          }
        }
        var6 = param2.length();
        if (var5 == 0) {
          throw new IllegalArgumentException("Key cannot have zero length");
        } else {
          L1: {
            var7 = var4;
            var8 = var6 + -var5;
            if (var8 == 0) {
              break L1;
            } else {
              var9_int = 0;
              L2: while (true) {
                var9_int = param0.indexOf(param3, var9_int);
                if (0 > var9_int) {
                  break L1;
                } else {
                  var9_int = var9_int + var5;
                  var7 = var7 + var8;
                  continue L2;
                }
              }
            }
          }
          var9 = new StringBuilder(var7);
          var10 = 0;
          L3: while (true) {
            var11 = param0.indexOf(param3, var10);
            if (-1 >= (var11 ^ -1)) {
              StringBuilder discarded$13 = var9.append(param0.substring(var10, var11));
              var10 = var11 - -var5;
              StringBuilder discarded$14 = var9.append(param2);
              continue L3;
            } else {
              StringBuilder discarded$15 = var9.append(param0.substring(var10));
              return var9.toString();
            }
          }
        }
    }

    final static void a(int param0, int param1, ae param2, int param3, ae param4, ae param5, ae param6, int param7, byte param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        var20 = Pixelate.field_H ? 1 : 0;
        var10 = param7 - -(param0 * param2.field_h >> -1719502288);
        var11 = (param2.field_g * param0 >> -1854396368) + param9;
        var12 = param7 - -(param6.field_h * param0 >> -892039728);
        var13 = (param0 * param6.field_g >> 1347629776) + param9;
        var14 = param7 - -(param0 * param5.field_h >> 1296541840);
        var15 = (param5.field_g * param0 >> 789430640) + param9;
        var16 = param7 - -(param0 * param4.field_h >> -1316269552);
        var17 = param9 + (param4.field_g * param0 >> -736210736);
        if (param8 <= -27) {
          var18 = new int[]{var10, var11, var12, var13, var14, var15, var16, var17};
          ta.a(var18, 12632256);
          var19 = 0;
          L0: while (true) {
            if (var19 > param1) {
              var19 = 0;
              L1: while (true) {
                if (param3 < var19) {
                  return;
                } else {
                  el.a(var11 + var19 * (var13 + -var11) / param3, var19 * (var14 - var16) / param3 + var16, 8421504, -79, (-var10 + var12) * var19 / param3 + var10, var19 * (var15 + -var17) / param3 + var17, 3.0f);
                  var19++;
                  continue L1;
                }
              }
            } else {
              el.a((var17 + -var11) * var19 / param1 + var11, var19 * (var14 - var12) / param1 + var12, 8421504, -20, var10 + (-var10 + var16) * var19 / param1, (-var13 + var15) * var19 / param1 + var13, 3.0f);
              var19++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, tf[] param2) {
        if (param0 <= 88) {
            Object var5 = null;
            w.a((byte) 34, (eq) null);
        }
        int var4 = param1;
        if (!(((w) this).field_r[var4] != null)) {
            ((w) this).field_r[var4] = new lf();
        }
        ((w) this).field_r[param1].field_k = param2;
    }

    private final void a(w param0, boolean param1, boolean param2) {
        int var4 = 0;
        lf var5 = null;
        lf var6 = null;
        int var7 = 0;
        Object var8 = null;
        lf stackIn_8_0 = null;
        lf stackIn_9_0 = null;
        lf stackIn_10_0 = null;
        lf stackIn_10_1 = null;
        lf stackOut_7_0 = null;
        lf stackOut_9_0 = null;
        lf stackOut_9_1 = null;
        lf stackOut_8_0 = null;
        lf stackOut_8_1 = null;
        L0: {
          var7 = Pixelate.field_H ? 1 : 0;
          if (param1) {
            break L0;
          } else {
            var8 = null;
            w.a(-78, 30, (ae) null, 86, (ae) null, (ae) null, (ae) null, -17, (byte) 54, -98);
            break L0;
          }
        }
        L1: {
          super.a((uc) (Object) param0, (byte) 126);
          if (param2) {
            var4 = 0;
            L2: while (true) {
              if (var4 >= 6) {
                break L1;
              } else {
                var5 = ((w) this).field_r[var4];
                if (var5 == null) {
                  param0.field_r[var4] = null;
                  var4++;
                  continue L2;
                } else {
                  L3: {
                    var6 = param0.field_r[var4];
                    stackOut_7_0 = (lf) var5;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_8_0 = stackOut_7_0;
                    if (var6 == null) {
                      param0.field_r[var4] = new lf();
                      stackOut_9_0 = (lf) (Object) stackIn_9_0;
                      stackOut_9_1 = new lf();
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      break L3;
                    } else {
                      stackOut_8_0 = (lf) (Object) stackIn_8_0;
                      stackOut_8_1 = (lf) var6;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      break L3;
                    }
                  }
                  ((lf) (Object) stackIn_10_0).a(stackIn_10_1, (byte) 89);
                  var4++;
                  continue L2;
                }
              }
            }
          } else {
            qb.a((Object[]) (Object) ((w) this).field_r, 0, (Object[]) (Object) param0.field_r, 0, 6);
            break L1;
          }
        }
    }

    final void a(int param0, tf[] param1) {
        lf[] var3 = null;
        int var4 = 0;
        lf var5 = null;
        int var6 = 0;
        lf[] var7 = null;
        var6 = Pixelate.field_H ? 1 : 0;
        var7 = ((w) this).field_r;
        var3 = var7;
        var4 = param0;
        L0: while (true) {
          if (var7.length <= var4) {
            return;
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_k = param1;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    final void a(int param0, tf param1) {
        lf[] var3 = null;
        int var4 = 0;
        lf var5_ref_lf = null;
        int var5 = 0;
        int var6 = 0;
        lf[] var7 = null;
        var6 = Pixelate.field_H ? 1 : 0;
        var7 = ((w) this).field_r;
        var3 = var7;
        var4 = 0;
        L0: while (true) {
          if (var7.length <= var4) {
            var5 = -110 / ((-69 - param0) / 40);
            return;
          } else {
            var5_ref_lf = var7[var4];
            if (var5_ref_lf != null) {
              var5_ref_lf.field_j = param1;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Unrated game";
        field_u = "Seriously offensive language";
        field_w = new wm(2, 4, 4, 0);
    }
}
