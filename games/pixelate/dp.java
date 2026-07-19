/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dp extends de {
    static String field_p;
    static boolean[] field_o;

    final void c(byte param0) {
        if (param0 > -13) {
            return;
        }
        la.a(!gq.d(127) ? 0 : 12, -1, false, -25528);
    }

    dp(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final void a(int param0, boolean param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        ha var6 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var4 = param0 * 2;
          if (param0 < 128) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (param0 - 128) * 2;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (!param2) {
            break L1;
          } else {
            var6_int = var4;
            var4 = var5;
            var5 = var6_int;
            break L1;
          }
        }
        L2: {
          if (null == c.field_R) {
            c.field_R = vk.a(480, 2, (java.awt.Component) ((Object) new java.awt.Canvas()), 640);
            break L2;
          } else {
            break L2;
          }
        }
        if (!param1) {
          field_p = (String) null;
          var6 = qa.field_f;
          qa.field_f = c.field_R;
          qa.field_f.a(19692);
          this.c(0);
          qa.field_f = var6;
          qa.field_f.a(19692);
          fi.a(c.field_R.field_e, var4, var5);
          return;
        } else {
          var6 = qa.field_f;
          qa.field_f = c.field_R;
          qa.field_f.a(19692);
          this.c(0);
          qa.field_f = var6;
          qa.field_f.a(19692);
          fi.a(c.field_R.field_e, var4, var5);
          return;
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_14_0 = 0;
        int stackIn_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        L0: {
          if (-2 == (this.field_l ^ -1)) {
            gj.field_W[2].b(0, 45);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 11) {
          L1: {
            field_p = (String) null;
            var2 = 0;
            if (-2 == (this.field_l ^ -1)) {
              var2 = 120;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (2 != this.field_l) {
              break L2;
            } else {
              var2 = 80;
              break L2;
            }
          }
          L3: {
            if (-5 != (this.field_l ^ -1)) {
              break L3;
            } else {
              var2 = 50;
              break L3;
            }
          }
          L4: {
            if ((this.field_g.field_h ^ -1) < -8) {
              stackOut_24_0 = -210 + 30 * this.field_g.field_h;
              stackIn_25_0 = stackOut_24_0;
              break L4;
            } else {
              stackOut_23_0 = 0;
              stackIn_25_0 = stackOut_23_0;
              break L4;
            }
          }
          var3 = stackIn_25_0;
          this.a(var2, (byte) -128, var3);
          this.b((byte) -71);
          return;
        } else {
          L5: {
            var2 = 0;
            if (-2 == (this.field_l ^ -1)) {
              var2 = 120;
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            if (2 != this.field_l) {
              break L6;
            } else {
              var2 = 80;
              break L6;
            }
          }
          L7: {
            if (-5 != (this.field_l ^ -1)) {
              break L7;
            } else {
              var2 = 50;
              break L7;
            }
          }
          L8: {
            if ((this.field_g.field_h ^ -1) < -8) {
              stackOut_13_0 = -210 + 30 * this.field_g.field_h;
              stackIn_14_0 = stackOut_13_0;
              break L8;
            } else {
              stackOut_12_0 = 0;
              stackIn_14_0 = stackOut_12_0;
              break L8;
            }
          }
          var3 = stackIn_14_0;
          this.a(var2, (byte) -128, var3);
          this.b((byte) -71);
          return;
        }
    }

    final void a(int[] param0, byte param1) {
        int var3_int = 0;
        try {
            if (this.field_k != null) {
                var3_int = param0.length - this.field_k.length;
                this.field_d = this.field_d - this.field_i * var3_int / 2;
            }
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "dp.MA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int b(int param0, int param1) {
        int var4 = 122 % ((-13 - param0) / 37);
        int var3 = 0;
        if (!(-3 != (this.field_l ^ -1))) {
            var3 = 40;
        }
        if ((this.field_l ^ -1) == -5) {
            var3 = 70;
        }
        return super.b(118, param1) + -var3;
    }

    public static void e(int param0) {
        field_p = null;
        if (param0 != 2) {
            return;
        }
        field_o = null;
    }

    final static void a(String param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int discarded$0 = 0;
        try {
            var2_int = uf.field_d;
            var3 = bg.field_k;
            var4 = mg.field_h.field_Db.b(param0, 500);
            var5 = mg.field_h.field_Db.a(param0, 500) - -6;
            var6 = 2 + var4 * fq.field_q;
            var7 = ui.a(12, var2_int, var5, (byte) -1);
            var8 = pj.a(var6, var3, 20, (byte) 112);
            t.a(var7, var8, var5, var6, 0);
            t.d(1 + var7, 1 + var8, param1 + var5, var6 - 2, 16777088);
            discarded$0 = mg.field_h.field_Db.a(param0, 3 + var7, nc.field_d + (1 + (var8 + -mg.field_h.field_Db.field_w)), 500, 1000, 0, -1, 0, 0, fq.field_q);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "dp.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void e(byte param0) {
        super.e((byte) -101);
        if (param0 > -64) {
            this.a(125);
        }
    }

    final void c(int param0) {
        Object var2 = null;
        ii var3 = null;
        ii var4 = null;
        ii var5 = null;
        var2 = null;
        if ((this.field_l ^ -1) == -2) {
          var4 = ro.field_e;
          var2 = var4;
          if (var4 == null) {
            super.c(0);
            return;
          } else {
            L0: {
              var4.a(false, param0 + param0);
              if ((this.field_l ^ -1) != -2) {
                break L0;
              } else {
                t.a(0, 0, 640, 480);
                rh.b((byte) 121);
                break L0;
              }
            }
            return;
          }
        } else {
          if ((this.field_l ^ -1) != -3) {
            if ((this.field_l ^ -1) == -5) {
              var5 = qo.field_r;
              if (var5 == null) {
                super.c(0);
                return;
              } else {
                L1: {
                  var5.a(false, param0 + param0);
                  if ((this.field_l ^ -1) != -2) {
                    break L1;
                  } else {
                    t.a(0, 0, 640, 480);
                    rh.b((byte) 121);
                    break L1;
                  }
                }
                return;
              }
            } else {
              if (var2 == null) {
                super.c(0);
                return;
              } else {
                L2: {
                  ((ii) (var2)).a(false, param0 + param0);
                  if ((this.field_l ^ -1) != -2) {
                    break L2;
                  } else {
                    t.a(0, 0, 640, 480);
                    rh.b((byte) 121);
                    break L2;
                  }
                }
                return;
              }
            }
          } else {
            var3 = ro.field_e;
            if (var3 == null) {
              super.c(0);
              return;
            } else {
              L3: {
                var3.a(false, param0 + param0);
                if ((this.field_l ^ -1) != -2) {
                  break L3;
                } else {
                  t.a(0, 0, 640, 480);
                  rh.b((byte) 121);
                  break L3;
                }
              }
              return;
            }
          }
        }
    }

    static {
        field_p = "Enter name of player to add to list";
    }
}
