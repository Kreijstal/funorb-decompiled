/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf {
    int field_f;
    static int field_n;
    db field_p;
    db field_k;
    int field_a;
    static String field_s;
    db field_o;
    private boolean field_m;
    int field_l;
    wl field_d;
    int field_h;
    int field_q;
    private int field_c;
    db field_b;
    db field_i;
    static ed field_e;
    int field_j;
    int field_r;
    static hh field_g;

    final static void a(mf param0, mf param1, byte param2) {
        try {
            ck.field_x = param0;
            pc.field_e = param1;
            if (param2 != -96) {
                uf.a(-27);
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "uf.K(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static boolean c(int param0) {
        if (param0 < 2) {
            return false;
        }
        return dg.field_o == ui.field_b ? true : false;
    }

    private final void a(int param0, int param1, int param2, String param3) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              var5_int = this.field_j + this.field_f;
              var6 = this.field_l - -this.field_r;
              var7 = this.field_q;
              if (0 != (var7 ^ -1)) {
                break L1;
              } else {
                var7 = this.field_d.field_x + this.field_d.field_r;
                break L1;
              }
            }
            L2: {
              L3: {
                var8 = em.field_l >> 1175915906;
                var9 = this.field_d.b(param3);
                var10 = this.field_d.field_x + this.field_d.field_r;
                var11 = 1;
                if (var8 < var9) {
                  break L3;
                } else {
                  if ((param3.indexOf("<br>") ^ -1) == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (var8 >= var9) {
                  var12 = var8;
                  break L4;
                } else {
                  var13 = var9 / var8;
                  var12 = var8 + (var9 % var8 + var13 - 1) / var13 * 2;
                  break L4;
                }
              }
              L5: {
                if (null == co.field_c) {
                  co.field_c = new String[16];
                  break L5;
                } else {
                  break L5;
                }
              }
              var11 = this.field_d.a(param3, new int[]{var12}, co.field_c);
              var9 = 0;
              var10 = var10 + (-1 + var11) * var7;
              var13 = 0;
              L6: while (true) {
                if (var11 <= var13) {
                  break L2;
                } else {
                  L7: {
                    var14 = this.field_d.b(co.field_c[var13]);
                    if (var9 < var14) {
                      var9 = var14;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  var13++;
                  continue L6;
                }
              }
            }
            L8: {
              var12 = param0;
              if (var9 + var12 - -var5_int > em.field_l) {
                var12 = em.field_l + -var9 - var5_int;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              var13 = 32 + (-this.field_d.field_N + param2);
              if (var6 + (var13 - -var10) <= em.field_d) {
                break L9;
              } else {
                var13 = -var10 + (param2 + -var6);
                break L9;
              }
            }
            em.b(var12, var13, var9 - -var5_int, var6 + var10, this.field_h);
            em.a(1 + var12, var13 + 1, -2 + (var9 + var5_int), -2 + var6 + var10, this.field_a);
            if (param1 > 2) {
              this.field_d.a(param3, var12 - -this.field_f, this.field_l + var13, var9, var10, this.field_c, -1, 0, 0, var7);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var5);

            stackIn_31_1 = new StringBuilder().append("uf.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L10;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L10;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static String a(int param0) {
        mf var2;
        if (dn.field_q != dg.field_o) {
          if (param0 != 30519) {
            var2 = (mf) null;
            uf.a((mf) null, (mf) null, (byte) 91);
            return bm.field_g;
          } else {
            return bm.field_g;
          }
        } else {
          return mf.field_b;
        }
    }

    final static void a(byte param0, String param1, boolean param2) {
        if (param0 <= 42) {
            return;
        }
        try {
            ha.field_a = param2;
            ei.field_i = true;
            be.field_b = new pn(bo.field_F, dl.field_b, param1, eb.field_H, ha.field_a);
            bo.field_F.b(be.field_b, 77);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "uf.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param2 != -29666) {
          uf.a(15);
          em.d(param3, param4, param0, param1, param5);
          return;
        } else {
          em.d(param3, param4, param0, param1, param5);
          return;
        }
    }

    final void a(int param0, wl param1) {
        k var17 = null;
        he var4 = null;
        ed[] var5 = null;
        uh var16 = null;
        uh var18 = null;
        int var7_int = 0;
        he var6 = null;
        he var7 = null;
        sc discarded$0 = null;
        ve discarded$1 = null;
        he var8 = null;
        ed[] var9 = null;
        ed[] var10 = null;
        ed dupTemp$2 = null;
        he var11 = null;
        he var12 = null;
        ed var13 = null;
        he var14 = null;
        he var19 = null;
        int var15 = EscapeVector.field_A;
        try {
            var17 = new k(param1, 2, 2, 2236962, 1, 1, 1, param1.field_x + param1.field_r + 2);
            this.field_i = (db) ((Object) var17);
            var17.field_h = 16777215;
            var4 = new he();
            if (param0 != -31476) {
                field_n = 115;
            }
            var17.a(var4, 77);
            this.field_c = 15658734;
            this.field_r = 3;
            this.field_a = 5592405;
            this.field_j = 3;
            this.field_l = 3;
            this.field_h = 15658734;
            this.field_q = -1;
            this.field_f = 3;
            var4.field_i = 11711154;
            var4.field_g = 15658734;
            this.field_d = param1;
            var4.a(0, (byte) -53).a(15658734, -22572).a(2, ph.a(8947848, 1, 10066329, 7829367));
            var4.a(1, (byte) -53).a(2, ph.a(11184810, 1, 10066329, 13421772));
            var4.a(3, (byte) -53).a(2, ph.a(8947848, 1, 7829367, 10066329)).c(101, 1).a(1, (byte) 102);
            var5 = new ed[9];
            var16 = new uh(32, 32);
            var18 = var16;
            for (var7_int = 0; var18.field_B.length > var7_int; var7_int++) {
                var16.field_B[var7_int] = 1077952576;
            }
            var5[4] = (ed) ((Object) var18);
            var4.a(4, (byte) -53).a(param0 ^ 31367, true).a(2, var5);
            var4.a(5, (byte) -53).a(2, vd.a(65793, 0, 0, 0, 1317)).a(param0 + 31367, true).a(-1, -22572);
            this.field_o = (db) ((Object) var4);
            var6 = new he(var4, true);
            var6.field_m = 0;
            var7 = new he(var4, true);
            var7.field_m = 0;
            var7.a(jj.a(8947848, 46), param0 + 31482);
            var7.a(1, (byte) -53).a(2, jj.a(11184810, 51)).a(2236962, -22572);
            this.field_k = (db) ((Object) new hn(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
            discarded$0 = new sc(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
            discarded$1 = new ve(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
            var8 = new he();
            var17.a(var8, 111);
            var8.a(0, (byte) -53).a(2, ph.a(15658734, 1, 7829367, 10066329)).a(1118481, -22572).b(-93, -1);
            var8.a(4, (byte) -53).a(-121, true).a(param0 + 31478, var5);
            this.field_p = (db) ((Object) var8);
            var9 = new ed[9];
            var10 = new ed[9];
            var9[4] = new ed(2, 1);
            var10[4] = new ed(1, 2);
            dupTemp$2 = var9[4];
            dupTemp$2.field_B = new int[]{6710886, 7829367};
            var10[4].field_B = new int[]{6710886, 7829367};
            var11 = new he();
            var12 = new he();
            var11.a(var9, 0, (byte) -117);
            var12.a(var10, 0, (byte) -117);
            var13 = new ed(7, 4);
            var13.field_B = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
            var14 = new he(var4, true);
            var14.a(var13.b(), (byte) 74);
            var13.a();
            var14 = new he(var4, true);
            var14.a(var13.b(), (byte) 118);
            var13.a();
            var14 = new he(var4, true);
            var14.a(var13.b(), (byte) 78);
            var13.a();
            var19 = new he(var4, true);
            var19.a(var13, (byte) 87);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "uf.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param1 != 1) {
            return;
        }
        em.a(param6, param3, param4, param0, param5, param2);
    }

    final void a(byte param0, String param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.field_m) {
                this.a(param1, param3, param2, 16777215);
                break L1;
              } else {
                this.a(param2, 29, param3, param1);
                break L1;
              }
            }
            if (param0 < -29) {
              break L0;
            } else {
              this.a(-88, -91, 122, 46, 47, -59, -12);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("uf.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(String param0, int param1, int param2, int param3) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          L0: {
            L1: {
              var5_int = this.field_d.b(param0);
              var6 = this.field_d.field_x + this.field_d.field_N;
              var7 = param2;
              if (em.field_l >= 6 + var7 + var5_int) {
                break L1;
              } else {
                var7 = -6 + -var5_int + em.field_l;
                break L1;
              }
            }
            if (param3 == 16777215) {
              L2: {
                var8 = param1 + (-this.field_d.field_N + 32);
                if (em.field_d < var6 + (var8 - -6)) {
                  var8 = em.field_d + -var6 + -6;
                  break L2;
                } else {
                  break L2;
                }
              }
              em.b(var7, var8, var5_int + 6, var6 - -6, this.field_c);
              em.a(1 + var7, 1 + var8, 4 + var5_int, 4 + var6, this.field_a);
              this.field_d.a(param0, 3 + var7, var8 - -3 - -this.field_d.field_N, this.field_c, -1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("uf.C(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void b(int param0) {
        mf var2;
        if (param0 != -27204) {
          var2 = (mf) null;
          uf.a((mf) null, (mf) null, (byte) 55);
          field_g = null;
          field_e = null;
          field_s = null;
          return;
        } else {
          field_g = null;
          field_e = null;
          field_s = null;
          return;
        }
    }

    public uf() {
        this.field_m = true;
    }

    static {
        field_s = "Quit";
    }
}
