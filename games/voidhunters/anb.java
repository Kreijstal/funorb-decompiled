/*
 * Decompiled by CFR-JS 0.4.0.
 */
class anb extends ara implements ntb, utb {
    private int field_m;
    private int field_i;
    int[] field_q;
    int field_s;
    int field_n;
    private int field_r;
    int field_l;
    int field_p;
    private int field_j;
    int field_o;
    ml field_k;
    int field_t;

    public void a(tv param0, int param1) {
        int var4 = 0;
        anb var5 = null;
        L0: {
          super.a(param0, -85);
          var5 = (anb) (Object) param0;
          if (var5.field_k == null) {
            break L0;
          } else {
            if (var5.field_k != null) {
              var5.field_k.a((tv) (Object) var5.field_k, -80);
              break L0;
            } else {
              break L0;
            }
          }
        }
        var4 = 0;
        ml discarded$1 = var5.field_k;
        L1: {
          if (var5.field_k == null) {
            break L1;
          } else {
            if (!var5.field_k.a((byte) -118, (tv) (Object) var5.field_k)) {
              break L1;
            } else {
              System.out.println("Component chassis has changed. before=" + var5.field_k + ", now=" + var5.field_k);
              var4 = 1;
              break L1;
            }
          }
        }
        L2: {
          if (var5.field_r != var5.field_r) {
            var4 = 1;
            System.out.println("int angle has changed. before=" + var5.field_r + ", now=" + var5.field_r);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (var5.field_n == var5.field_n) {
            break L3;
          } else {
            System.out.println("int angularvelocity has changed. before=" + var5.field_n + ", now=" + var5.field_n);
            var4 = 1;
            break L3;
          }
        }
        L4: {
          if (var5.field_i != var5.field_i) {
            var4 = 1;
            System.out.println("int centreofmassx has changed. before=" + var5.field_i + ", now=" + var5.field_i);
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (var5.field_j == var5.field_j) {
            break L5;
          } else {
            var4 = 1;
            System.out.println("int centreofmassy has changed. before=" + var5.field_j + ", now=" + var5.field_j);
            break L5;
          }
        }
        L6: {
          if (var5.field_s == var5.field_s) {
            break L6;
          } else {
            System.out.println("int mass has changed. before=" + var5.field_s + ", now=" + var5.field_s);
            var4 = 1;
            break L6;
          }
        }
        L7: {
          if (var5.field_m != var5.field_m) {
            System.out.println("int momentofinertia has changed. before=" + var5.field_m + ", now=" + var5.field_m);
            var4 = 1;
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          if (ikb.a(var5.field_q, var5.field_q, false)) {
            var4 = 1;
            System.out.println("int[] boundingbox has changed. ");
            break L8;
          } else {
            break L8;
          }
        }
        if (param1 <= -19) {
          L9: {
            if (var5.field_l != var5.field_l) {
              var4 = 1;
              System.out.println("int id has changed. before=" + var5.field_l + ", now=" + var5.field_l);
              break L9;
            } else {
              break L9;
            }
          }
          L10: {
            if (var4 == 0) {
              break L10;
            } else {
              System.out.println("This instance of Body has changed, where id=" + var5.field_l);
              break L10;
            }
          }
          return;
        } else {
          return;
        }
    }

    final int j(int param0) {
        if (param0 != 995401160) {
            int discarded$0 = ((anb) this).f(85);
        }
        int var2 = ((anb) this).field_r >> 995401160;
        return (int)((long)((anb) this).field_i * (long)fc.a(var2, (byte) -62) - (long)((anb) this).field_j * (long)eu.a(var2, 124) >> -1849121456);
    }

    final void a(boolean param0, boolean param1, pe param2) {
        ((anb) this).field_d = ((anb) this).field_d + ((anb) this).field_f;
        if (!param1) {
            ((anb) this).e((byte) 36);
        }
        ((anb) this).field_r = ((anb) this).field_r + ((anb) this).field_n;
        ((anb) this).field_e = ((anb) this).field_e + ((anb) this).field_h;
        ((anb) this).field_n = nu.field_q * ((anb) this).field_n / gbb.field_o;
        ((anb) this).field_h = ((anb) this).field_h * ibb.field_a / fna.field_o;
        ((anb) this).field_f = ibb.field_a * ((anb) this).field_f / fna.field_o;
        if (param0) {
            param2.field_u.a(((anb) this).field_q, (byte) -105);
        }
        this.c(16);
        int var4 = ((anb) this).field_d - ((anb) this).j(995401160);
        int var5 = ((anb) this).field_e - ((anb) this).i((byte) 5);
        ((anb) this).field_k.a(this instanceof sg, var4, var5, ((anb) this).field_r >> 1122868168, 0, ((anb) this).field_q);
        if (param0) {
            param2.field_u.a(1, ((anb) this).d(82), ((anb) this).field_l, ((anb) this).field_q);
        }
        ((anb) this).d((byte) 124);
    }

    final int i(byte param0) {
        if (param0 != 5) {
            return -127;
        }
        int var2 = ((anb) this).field_r >> -854677784;
        return (int)((long)((anb) this).field_i * (long)eu.a(var2, param0 + 105) + (long)((anb) this).field_j * (long)fc.a(var2, (byte) -68) >> -1704247920);
    }

    public void a(faa param0, int param1) {
        L0: {
          super.a(param0, false);
          if (!kv.a(false, param0)) {
            ((anb) this).field_k = null;
            break L0;
          } else {
            if (null == ((anb) this).field_k) {
              ((anb) this).field_k = new ml();
              ((anb) this).field_k.a(param0, 32);
              break L0;
            } else {
              ((anb) this).field_k.a(param0, 32);
              break L0;
            }
          }
        }
        ((anb) this).field_r = uwa.a(24, param0, (byte) 20);
        ((anb) this).field_n = uwa.a(24, param0, (byte) 20);
        ((anb) this).field_i = param0.i(0, 32);
        ((anb) this).field_j = param0.i(param1 + -32, 32);
        ((anb) this).field_s = param0.i(0, param1);
        ((anb) this).field_m = param0.i(0, 32);
        ((anb) this).field_q = wkb.a((byte) 37, ((anb) this).field_q, param0, 8);
        ((anb) this).field_l = param0.i(0, 16);
    }

    private final void a(int[] param0, int[] param1, int[] param2, int param3, int[] param4, int param5, ml[] param6) {
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var12 = VoidHunters.field_G;
        if (param3 != 3) {
            ((anb) this).field_k = null;
        }
        for (var8 = 0; param6.length > var8; var8++) {
            var9 = ar.a(param4[var8], (byte) 111, param1[var8]);
            int var10 = (param2[var8] >= 0 ? 1 : 0) ^ (-1 >= param5 ? 1 : 0);
            var11 = param2[var8];
            if (-1 > param2[var8]) {
                // ifne L110
            }
            if (0 < param2[var8]) {
                var11 = -var11;
            }
            param0[var8] = var11 / Math.max(var9, 1);
        }
    }

    final int g(byte param0) {
        int var2 = 124 % ((param0 - 62) / 55);
        return ((anb) this).field_e;
    }

    final int g(int param0) {
        if (param0 >= -36) {
            int discarded$0 = ((anb) this).g(-59);
        }
        int var2 = Math.abs(-((anb) this).field_d + ((anb) this).field_q[0]);
        int var3 = Math.abs(-((anb) this).field_d + ((anb) this).field_q[1]);
        int var4 = Math.abs(((anb) this).field_q[2] - ((anb) this).field_e);
        int var5 = Math.abs(((anb) this).field_q[3] - ((anb) this).field_e);
        return Math.max(var2, Math.max(var3, Math.max(var4, var5)));
    }

    final void b(int param0, int param1) {
        int var3 = 0;
        if (param0 != 24) {
            Object var4 = null;
            ((anb) this).a((lta) null, -28, (pe) null, -49);
        }
        if (((anb) this).field_t == 0) {
            // ifeq L94
        }
        ((anb) this).field_f = ((anb) this).field_f + ((anb) this).field_t / param1;
        ((anb) this).field_h = ((anb) this).field_h + ((anb) this).field_o / param1;
        ((anb) this).d((byte) 91);
        ((anb) this).field_t = 0;
        ((anb) this).field_o = 0;
        if (!(((anb) this).field_p == 0)) {
            var3 = ((anb) this).field_p / Math.max(((anb) this).field_m >> wf.field_e, 1);
            ((anb) this).field_n = ((anb) this).field_n + var3;
            ((anb) this).d((byte) 40);
            ((anb) this).field_p = 0;
        }
    }

    final void i(int param0) {
        this.c(16);
        int var2 = ((anb) this).field_d - ((anb) this).j(995401160);
        int var3 = ((anb) this).field_e - ((anb) this).i((byte) 5);
        ((anb) this).field_k.a(this instanceof sg, var2, var3, ((anb) this).field_r >> 466612424, param0, ((anb) this).field_q);
    }

    final int e(int param0) {
        if (param0 != 0) {
            ((anb) this).field_o = -108;
        }
        return ((anb) this).field_r >> 2115494024;
    }

    int d(int param0) {
        if (param0 <= 42) {
            ((anb) this).field_p = -29;
        }
        return -1;
    }

    void e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var2 = ((anb) this).j(995401160);
          var3 = ((anb) this).i((byte) 5);
          ((anb) this).field_k.a(0, true, 0, false, (byte) 88, 0, (int[]) null);
          if (param0 == 119) {
            break L0;
          } else {
            ((anb) this).field_k = null;
            break L0;
          }
        }
        ((anb) this).field_s = ((anb) this).field_k.e((byte) -86);
        var4 = new int[]{0, 0, 0};
        ((anb) this).field_k.a((byte) 114, var4);
        var5 = Math.max(1, var4[2] >> 722286692);
        ((anb) this).field_j = var4[1] / var5;
        ((anb) this).field_i = var4[0] / var5;
        ((anb) this).field_m = ((anb) this).field_k.a(-921054591, ((anb) this).field_i, ((anb) this).field_j);
        var6 = ((anb) this).j(995401160);
        var7 = ((anb) this).i((byte) 5);
        var8 = var6 + -var2;
        ((anb) this).field_d = ((anb) this).field_d + var8;
        var9 = var7 + -var3;
        ((anb) this).field_e = ((anb) this).field_e + var9;
        ((anb) this).field_k.a(((anb) this).field_r >> -1339401400, false, ((anb) this).field_e - var7, this instanceof sg, (byte) 106, ((anb) this).field_d - var6, (int[]) null);
        ((anb) this).d((byte) 38);
    }

    final boolean h(int param0) {
        if (param0 >= -112) {
            return false;
        }
        return ((anb) this).field_k.k((byte) 84);
    }

    public void b(faa param0, int param1) {
        super.b(param0, -111);
        if (!(vq.a(param0, -94, ((anb) this).field_k == null ? true : false))) {
            ((anb) this).field_k.b(param0, -115);
        }
        param0.a(-632, ((anb) this).field_r, 24);
        param0.a(-632, ((anb) this).field_n, 24);
        param0.a(-632, ((anb) this).field_l, 16);
        if (param1 > -109) {
            this.c(-33);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = fc.a(param1, (byte) -69) * param3 >> -232363192;
        int var7 = param3 * eu.a(param1, 42) >> 1948934248;
        ((anb) this).a(var7, param2, param0, (byte) -118, var6);
        if (param4 != 1948934248) {
            ((anb) this).field_l = 82;
        }
    }

    final int a(int param0, int param1, int param2) {
        int var4 = -57 / ((param0 - -56) / 55);
        return ((anb) this).field_k.a(param2, false, 0, param1, 21750, 0);
    }

    public void a(faa param0, boolean param1) {
        L0: {
          super.a(param0, false);
          if (!kv.a(param1, param0)) {
            ((anb) this).field_k = null;
            break L0;
          } else {
            if (null == ((anb) this).field_k) {
              ((anb) this).field_k = new ml();
              ((anb) this).field_k.a(param0, false);
              break L0;
            } else {
              ((anb) this).field_k.a(param0, false);
              break L0;
            }
          }
        }
        ((anb) this).field_r = uwa.a(24, param0, (byte) 20);
        ((anb) this).field_n = uwa.a(24, param0, (byte) 20);
        ((anb) this).field_l = param0.i(0, 16);
        this.h((byte) 63);
    }

    final void a(int param0, boolean param1, pe param2) {
        ((anb) this).field_k.a(param1, param2, (anb) this, (byte) -89);
        if (param0 >= -46) {
            ((anb) this).field_t = 42;
        }
    }

    final void a(lta param0, int param1, pe param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (!rna.a(((anb) this).field_q, param0.field_f, 36)) {
          return;
        } else {
          L0: {
            ((anb) this).field_k.a((byte) 125, param0, this instanceof sg, param2, param1);
            if (pqa.a(2, 11284)) {
              var5 = ((anb) this).j(995401160);
              var6 = ((anb) this).i((byte) 5);
              var7 = param0.a(((anb) this).field_d, (byte) 125);
              var8 = param0.b(true, ((anb) this).field_e);
              ena.a(var8, param0.field_a * 1024.0f, -81, var7, 16711680);
              var9 = param0.a(-var5 + ((anb) this).field_d, (byte) 122);
              var10 = param0.b(true, -var6 + ((anb) this).field_e);
              kq.a(1024.0f * param0.field_a, (byte) 90, var10, 16777215, var9);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (pqa.a(param3, param3 ^ 11268)) {
              var5 = param0.a(((anb) this).field_q[0], (byte) 121);
              var6 = param0.a(((anb) this).field_q[1], (byte) 112);
              var7 = param0.b(true, ((anb) this).field_q[2]);
              var8 = param0.b(true, ((anb) this).field_q[3]);
              uv.a(param3 + 105, var5, -var7 + var8, var7, 16711935, -var5 + var6);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void a(int param0, int param1) {
        ((anb) this).field_r = param0 << -1662309464;
        if (param1 > -13) {
            ((anb) this).field_i = -127;
        }
    }

    final int c(byte param0) {
        if (param0 > -111) {
            return 58;
        }
        return ((anb) this).field_f;
    }

    final void a(int param0, pe param1) {
        int var3 = -85 % ((26 - param0) / 35);
        boolean discarded$0 = ((anb) this).field_k.a(0, param1, (anb) this);
    }

    final int b(boolean param0) {
        if (!param0) {
            return -2;
        }
        return ((anb) this).field_k.a(0, ((anb) this).field_e, -125, ((anb) this).field_d);
    }

    final int f(int param0) {
        if (param0 != 0) {
            ((anb) this).field_l = -93;
        }
        return ((anb) this).field_h;
    }

    final boolean k(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 == 995401160) {
            break L0;
          } else {
            ((anb) this).field_t = -99;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((anb) this).field_f != 0) {
              break L2;
            } else {
              if (((anb) this).field_h != 0) {
                break L2;
              } else {
                if (((anb) this).field_n == 0) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          stackOut_6_0 = 1;
          stackIn_8_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    public void a(faa param0, byte param1) {
        super.b(param0, -113);
        if (vq.a(param0, 54, ((anb) this).field_k != null ? true : false)) {
            ((anb) this).field_k.a(param0, (byte) -113);
        }
        param0.a(-632, ((anb) this).field_r, 24);
        if (param1 > -91) {
            return;
        }
        param0.a(-632, ((anb) this).field_n, 24);
        param0.a(-632, ((anb) this).field_i, 32);
        param0.a(-632, ((anb) this).field_j, 32);
        param0.a(-632, ((anb) this).field_s, 32);
        param0.a(-632, ((anb) this).field_m, 32);
        pgb.a(8, null != ((anb) this).field_q ? ((anb) this).field_q.length : 0, 84, param0, ((anb) this).field_q);
        param0.a(-632, ((anb) this).field_l, 16);
    }

    private final void h(byte param0) {
        if (this instanceof nbb) {
            ((anb) this).field_k.c(0, ((anb) this).field_k.i((byte) -112).field_b, param0 + -7, ((anb) this).field_k.i((byte) -112).field_i);
        } else {
            ((anb) this).field_k.c(0, 0, 56, 0);
        }
        int var2 = ((anb) this).field_d;
        int var3 = ((anb) this).field_e;
        ((anb) this).e((byte) 119);
        ((anb) this).field_d = var2;
        if (param0 != 63) {
            return;
        }
        ((anb) this).field_e = var3;
        this.c(16);
        ((anb) this).field_k.a(this instanceof sg, ((anb) this).field_d + -((anb) this).j(995401160), ((anb) this).field_e + -((anb) this).i((byte) 5), ((anb) this).field_r >> 42830632, param0 + -63, ((anb) this).field_q);
    }

    final void a(int param0, int param1, byte param2) {
        int var4 = 5 / ((param2 - -11) / 38);
        ((anb) this).field_d = param0;
        ((anb) this).field_e = param1;
    }

    final boolean c(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          if (param2 >= 8) {
            break L0;
          } else {
            boolean discarded$2 = ((anb) this).c(101, -72, -14, 88, 79);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((anb) this).field_q == null) {
              break L2;
            } else {
              L3: {
                if (((anb) this).field_q[0] < param4) {
                  break L3;
                } else {
                  if (((anb) this).field_q[1] > param1) {
                    break L3;
                  } else {
                    if (((anb) this).field_q[2] < param3) {
                      break L3;
                    } else {
                      if (((anb) this).field_q[3] <= param0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              stackOut_8_0 = 1;
              stackIn_10_0 = stackOut_8_0;
              break L1;
            }
          }
          stackOut_9_0 = 0;
          stackIn_10_0 = stackOut_9_0;
          break L1;
        }
        return stackIn_10_0 != 0;
    }

    void d(byte param0) {
        int var2 = -43 % ((param0 - -4) / 38);
    }

    final int c(boolean param0) {
        if (param0) {
            Object var3 = null;
            ((anb) this).a((pe) null, 115, false, 79, -113);
        }
        return ((anb) this).field_l;
    }

    void a(int param0, int param1, pe param2, int param3, int param4) {
        if (param1 >= 0) {
            ((anb) this).field_k.a(param1, param3, param2, (byte) -73, param4, (anb) this);
        }
        if (param0 > -36) {
            Object var7 = null;
            ((anb) this).a(-66, -62, (pe) null, 87, -25);
        }
    }

    final void a(pe param0, int param1, boolean param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        ml[] var7_ref_ml__ = null;
        int var8_int = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12_int = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18_int = 0;
        boolean[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        Object var27 = null;
        ml var27_ref = null;
        Object var28 = null;
        ml var28_ref = null;
        Object var29 = null;
        ml var29_ref = null;
        Object var30 = null;
        ml var30_ref = null;
        Object var31 = null;
        ml var31_ref = null;
        Object var32 = null;
        ml var32_ref = null;
        ml var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        ml var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[] var47 = null;
        int[] var48 = null;
        int[] var49 = null;
        int[] var50 = null;
        int[] var53 = null;
        int[] var54 = null;
        int[] var55 = null;
        int[] var56 = null;
        int[] var57 = null;
        int[] var58 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var27 = null;
          var28 = null;
          var29 = null;
          var30 = null;
          var31 = null;
          var32 = null;
          var26 = VoidHunters.field_G;
          if ((gra.field_o ^ -1) == -2) {
            if (((anb) this).field_k.i((byte) -112).field_s) {
              stackOut_4_0 = 1;
              stackIn_6_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_6_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 0;
            stackIn_6_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var6 = stackIn_6_0;
          if (!param2) {
            break L1;
          } else {
            this.h((byte) -95);
            break L1;
          }
        }
        L2: {
          if (var6 != 0) {
            var27_ref = new ml(13);
            var27_ref.a((byte) -127, 1);
            var8_int = 4096;
            var9 = -(var8_int * fc.a(((anb) this).field_k.field_b, (byte) -76)) >> 1044496560;
            var10 = -(eu.a(((anb) this).field_k.field_b, 40) * var8_int) >> -812756880;
            var27_ref.a(false, ((anb) this).field_k.field_r - -var9, ((anb) this).field_k.field_n - -var10, ((anb) this).field_k.field_b, 0, (int[]) null);
            av.field_a[0] = var27_ref;
            var28_ref = new ml(13);
            var28_ref.a((byte) 114, 2);
            var8_int = 4096;
            var9 = fc.a(((anb) this).field_k.field_b, (byte) 100) * var8_int >> 1361593744;
            var10 = var8_int * eu.a(((anb) this).field_k.field_b, 122) >> -4331856;
            var11 = ((anb) this).field_k.field_b - -4096;
            var28_ref.a(false, ((anb) this).field_k.field_r + var9, ((anb) this).field_k.field_n - -var10, var11, 0, (int[]) null);
            av.field_a[1] = var28_ref;
            var29_ref = new ml(13);
            var29_ref.a((byte) 113, 36);
            var8_int = 8192;
            var9 = rrb.a(22433, 256 + ((anb) this).field_k.field_b);
            var10 = var8_int * fc.a(var9, (byte) -112) >> -643373104;
            var11 = var8_int * eu.a(var9, 85) >> 519064240;
            var12_int = rrb.a(22433, -2048 + ((anb) this).field_k.field_b);
            var29_ref.a(false, var10 + ((anb) this).field_k.field_r, var11 + ((anb) this).field_k.field_n, var12_int, 0, (int[]) null);
            av.field_a[2] = var29_ref;
            var30_ref = new ml(13);
            var30_ref.a((byte) 120, 72);
            var8_int = 8192;
            var9 = rrb.a(22433, ((anb) this).field_k.field_b - 256);
            var10 = var8_int * fc.a(var9, (byte) -102) >> 964732400;
            var11 = var8_int * eu.a(var9, 87) >> 1982078480;
            var12_int = rrb.a(22433, 2048 + ((anb) this).field_k.field_b);
            var30_ref.a(false, var10 + ((anb) this).field_k.field_r, var11 + ((anb) this).field_k.field_n, var12_int, 0, (int[]) null);
            av.field_a[3] = var30_ref;
            var31_ref = new ml(13);
            var31_ref.a((byte) -23, 68);
            var8_int = 8192;
            var9 = rrb.a(22433, ((anb) this).field_k.field_b - 3840);
            var10 = fc.a(var9, (byte) -91) * var8_int >> -1732334160;
            var11 = var8_int * eu.a(var9, 122) >> 1693975536;
            var12_int = rrb.a(22433, ((anb) this).field_k.field_b + 2048);
            var31_ref.a(false, var10 + ((anb) this).field_k.field_r, var11 + ((anb) this).field_k.field_n, var12_int, 0, (int[]) null);
            av.field_a[4] = var31_ref;
            var32_ref = new ml(13);
            var32_ref.a((byte) 12, 40);
            var8_int = 8192;
            var9 = rrb.a(22433, 4096 + ((anb) this).field_k.field_b - 256);
            var10 = var8_int * fc.a(var9, (byte) 46) >> -1788839248;
            var11 = var8_int * eu.a(var9, 85) >> -2045811824;
            var12_int = rrb.a(22433, ((anb) this).field_k.field_b + -2048);
            var32_ref.a(false, var10 + ((anb) this).field_k.field_r, ((anb) this).field_k.field_n - -var11, var12_int, 0, (int[]) null);
            av.field_a[5] = var32_ref;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          L4: {
            if (1 != wqa.field_b) {
              break L4;
            } else {
              if ((99 & param1) == 0) {
                break L4;
              } else {
                if ((param1 & 111) != (99 & param1)) {
                  break L4;
                } else {
                  L5: {
                    var7_ref_ml__ = ((anb) this).field_k.a(0, (ml[]) null, param1);
                    if (var6 == 0) {
                      break L5;
                    } else {
                      var8_int = 0;
                      L6: while (true) {
                        if (var8_int >= av.field_a.length) {
                          break L5;
                        } else {
                          var7_ref_ml__ = (ml[]) (Object) ija.a((Object) (Object) av.field_a[var8_int], (Object[]) (Object) var7_ref_ml__, 0, ii.field_d);
                          var8_int++;
                          continue L6;
                        }
                      }
                    }
                  }
                  if (var7_ref_ml__ != null) {
                    var53 = new int[var7_ref_ml__.length];
                    var47 = var53;
                    var41 = var47;
                    var34 = var41;
                    var8 = var34;
                    var9 = ((anb) this).field_t;
                    var10 = ((anb) this).field_o;
                    var11 = ((anb) this).field_p;
                    var55 = new int[var7_ref_ml__.length];
                    var49 = var55;
                    var43 = var49;
                    var36 = var43;
                    var12 = var36;
                    var56 = new int[var7_ref_ml__.length];
                    var50 = var56;
                    var44 = var50;
                    var37 = var44;
                    var13 = var37;
                    var54 = new int[var7_ref_ml__.length];
                    var48 = var54;
                    var42 = var48;
                    var35 = var42;
                    var14 = var35;
                    var15 = 0;
                    var16 = 0;
                    L7: while (true) {
                      if (var7_ref_ml__.length <= var16) {
                        L8: {
                          ((anb) this).field_o = var10;
                          ((anb) this).field_p = var11;
                          ((anb) this).field_t = var9;
                          var16 = var15 / Math.max(((anb) this).field_m >> wf.field_e, 1);
                          if (-1 == (var15 ^ -1)) {
                            break L8;
                          } else {
                            if (Math.abs(var16) <= us.field_f) {
                              break L8;
                            } else {
                              var57 = new int[var7_ref_ml__.length];
                              var18 = new boolean[var7_ref_ml__.length];
                              this.a(var57, var56, var54, 3, var55, var15, var7_ref_ml__);
                              var58 = new int[var7_ref_ml__.length];
                              var20 = 0;
                              L9: while (true) {
                                if (var58.length <= var20) {
                                  var20 = 0;
                                  L10: while (true) {
                                    if (var58.length <= var20) {
                                      break L8;
                                    } else {
                                      var21 = var58[var20];
                                      if (0 <= var57[var21]) {
                                        var22 = var54[var21];
                                        var23 = Math.abs(var15);
                                        var24 = Math.abs(var22) >> -2050916888;
                                        var25 = var23 / Math.max(var24, 1);
                                        if (-257 < (var25 ^ -1)) {
                                          if ((var53[var21] ^ -1) < -1) {
                                            var8[var21] = -var25 + 256;
                                            break L8;
                                          } else {
                                            var53[var21] = var25;
                                            break L8;
                                          }
                                        } else {
                                          L11: {
                                            if (var53[var21] > 0) {
                                              var53[var21] = 0;
                                              break L11;
                                            } else {
                                              var53[var21] = 256;
                                              break L11;
                                            }
                                          }
                                          var15 = var15 + var22;
                                          var25 = 256;
                                          var20++;
                                          continue L10;
                                        }
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                } else {
                                  var21 = -2147483648;
                                  var22 = -1;
                                  var23 = 0;
                                  L12: while (true) {
                                    if (var23 >= var57.length) {
                                      if (var22 != -1) {
                                        var58[var20] = var22;
                                        var18[var22] = true;
                                        var20++;
                                        continue L9;
                                      } else {
                                        var20++;
                                        continue L9;
                                      }
                                    } else {
                                      if (!var18[var23]) {
                                        if (var57[var23] > var21) {
                                          var22 = var23;
                                          var21 = var57[var23];
                                          var23++;
                                          continue L12;
                                        } else {
                                          var23++;
                                          continue L12;
                                        }
                                      } else {
                                        var23++;
                                        continue L12;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        var17 = 0;
                        L13: while (true) {
                          if (var17 >= var7_ref_ml__.length) {
                            param1 = param1 & -112;
                            break L4;
                          } else {
                            var40 = var7_ref_ml__[var17];
                            if (-1 > (var53[var17] ^ -1)) {
                              var40.a((anb) this, param4, param0, param3, 55, var53[var17]);
                              var17++;
                              continue L13;
                            } else {
                              var17++;
                              continue L13;
                            }
                          }
                        }
                      } else {
                        var33 = var7_ref_ml__[var16];
                        var18_int = var33.field_e;
                        var19 = ((anb) this).field_t;
                        var20 = ((anb) this).field_o;
                        var21 = ((anb) this).field_p;
                        var22 = var33.field_a.a(var33.field_j, false);
                        ((anb) this).a(var33.field_n, var33.field_b, var33.field_r, var22, 1948934248);
                        var12[var16] = ((anb) this).field_t + -var19;
                        var13[var16] = -var20 + ((anb) this).field_o;
                        var14[var16] = ((anb) this).field_p + -var21;
                        if ((param1 & var18_int) != 0) {
                          var53[var16] = 256;
                          var15 = var15 + var54[var16];
                          var12[var16] = -var55[var16];
                          var13[var16] = -var56[var16];
                          var14[var16] = -var54[var16];
                          var16++;
                          continue L7;
                        } else {
                          var16++;
                          continue L7;
                        }
                      }
                    }
                  } else {
                    param1 = param1 & -112;
                    if (var6 != 0) {
                      var7 = 0;
                      L14: while (true) {
                        if (var7 >= av.field_a.length) {
                          break L3;
                        } else {
                          av.field_a[var7].a(param4, 7834, (anb) this, param3, param1, param0);
                          var7++;
                          continue L14;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                }
              }
            }
          }
          if (var6 != 0) {
            var7 = 0;
            L15: while (true) {
              if (var7 >= av.field_a.length) {
                break L3;
              } else {
                av.field_a[var7].a(param4, 7834, (anb) this, param3, param1, param0);
                var7++;
                continue L15;
              }
            }
          } else {
            break L3;
          }
        }
        ((anb) this).field_k.a(param4, 7834, (anb) this, param3, param1, param0);
    }

    final int e(boolean param0) {
        if (param0) {
            ((anb) this).field_r = 99;
        }
        return ((anb) this).field_s;
    }

    void a(pe param0, boolean param1, byte param2, boolean param3) {
        int var5 = 0;
        Object var6 = null;
        int stackIn_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        L0: {
          if (param1) {
            stackOut_16_0 = 1;
            stackIn_18_0 = stackOut_16_0;
            break L0;
          } else {
            if (0 == ((anb) this).field_f) {
              if (((anb) this).field_h == -1) {
                if (0 == ((anb) this).field_n) {
                  if (-1 == ((anb) this).field_q[0]) {
                    if (-1 == ((anb) this).field_q[1]) {
                      if (-1 == ((anb) this).field_q[2]) {
                        if (0 == ((anb) this).field_q[3]) {
                          stackOut_15_0 = 1;
                          stackIn_18_0 = stackOut_15_0;
                          break L0;
                        } else {
                          stackOut_14_0 = 0;
                          stackIn_18_0 = stackOut_14_0;
                          break L0;
                        }
                      } else {
                        stackOut_12_0 = 0;
                        stackIn_18_0 = stackOut_12_0;
                        break L0;
                      }
                    } else {
                      stackOut_10_0 = 0;
                      stackIn_18_0 = stackOut_10_0;
                      break L0;
                    }
                  } else {
                    stackOut_8_0 = 0;
                    stackIn_18_0 = stackOut_8_0;
                    break L0;
                  }
                } else {
                  stackOut_6_0 = 1;
                  stackIn_18_0 = stackOut_6_0;
                  break L0;
                }
              } else {
                stackOut_4_0 = 1;
                stackIn_18_0 = stackOut_4_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_18_0 = stackOut_2_0;
              break L0;
            }
          }
        }
        L1: {
          var5 = stackIn_18_0;
          if (var5 != 0) {
            ((anb) this).a(param3, true, param0);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (!(this instanceof sg)) {
            break L2;
          } else {
            ((anb) this).field_k.a(true, (byte) -124, param0, (anb) this);
            break L2;
          }
        }
        L3: {
          if (param2 == 67) {
            break L3;
          } else {
            var6 = null;
            ((anb) this).a(93, false, (pe) null);
            break L3;
          }
        }
    }

    final int d(boolean param0) {
        if (param0) {
            ((anb) this).e((byte) 22);
        }
        return ((anb) this).field_d;
    }

    final void a(tpb param0, tj param1, byte param2) {
        ((anb) this).field_k.a(param1, param0, 0);
        if (param2 < 24) {
            ((anb) this).field_r = 116;
        }
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        if (null != ((anb) this).field_q) {
          L0: {
            if (param1 == 2147483647) {
              break L0;
            } else {
              int[] discarded$1 = ((anb) this).f((byte) 36);
              break L0;
            }
          }
          L1: {
            var6 = 0;
            if (((anb) this).field_q[0] < param3) {
              L2: {
                var6 = 1;
                if (0 > ((anb) this).field_f) {
                  ((anb) this).field_f = -((anb) this).field_f;
                  break L2;
                } else {
                  break L2;
                }
              }
              ((anb) this).field_d = ((anb) this).field_d + (-((anb) this).field_q[0] + param3);
              break L1;
            } else {
              break L1;
            }
          }
          L3: {
            if (param4 >= ((anb) this).field_q[1]) {
              break L3;
            } else {
              L4: {
                if ((((anb) this).field_f ^ -1) >= -1) {
                  break L4;
                } else {
                  ((anb) this).field_f = -((anb) this).field_f;
                  break L4;
                }
              }
              var6 = 1;
              ((anb) this).field_d = ((anb) this).field_d + (param4 - ((anb) this).field_q[1]);
              break L3;
            }
          }
          L5: {
            if (((anb) this).field_q[2] >= param0) {
              break L5;
            } else {
              L6: {
                if (-1 < (((anb) this).field_h ^ -1)) {
                  ((anb) this).field_h = -((anb) this).field_h;
                  break L6;
                } else {
                  break L6;
                }
              }
              var6 = 1;
              ((anb) this).field_e = ((anb) this).field_e + (-((anb) this).field_q[2] + param0);
              break L5;
            }
          }
          L7: {
            if (((anb) this).field_q[3] > param2) {
              L8: {
                ((anb) this).field_e = ((anb) this).field_e + (param2 + -((anb) this).field_q[3]);
                if (((anb) this).field_h <= 0) {
                  break L8;
                } else {
                  ((anb) this).field_h = -((anb) this).field_h;
                  break L8;
                }
              }
              var6 = 1;
              break L7;
            } else {
              break L7;
            }
          }
          return var6 != 0;
        } else {
          return false;
        }
    }

    final int[] f(byte param0) {
        if (param0 >= -21) {
            return null;
        }
        return ((anb) this).field_q;
    }

    public boolean a(byte param0, tv param1) {
        anb var3 = null;
        int var4 = 0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          L1: {
            var4 = -16 / ((param0 - 22) / 59);
            var3 = (anb) (Object) param1;
            if (super.a((byte) 104, param1)) {
              break L1;
            } else {
              ml discarded$2 = var3.field_k;
              L2: {
                if (var3.field_k == null) {
                  break L2;
                } else {
                  if (var3.field_k.a((byte) 126, (tv) (Object) var3.field_k)) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (var3.field_r != var3.field_r) {
                break L1;
              } else {
                if (var3.field_n != var3.field_n) {
                  break L1;
                } else {
                  if (var3.field_l == var3.field_l) {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_10_0 = 1;
          stackIn_12_0 = stackOut_10_0;
          break L0;
        }
        return stackIn_12_0 != 0;
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        long var8 = 0L;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        L0: {
          ((anb) this).field_t = ((anb) this).field_t + param4;
          ((anb) this).field_o = ((anb) this).field_o + param0;
          var6 = -((anb) this).field_d + param1;
          var7 = -((anb) this).field_e + param2;
          if (param3 <= -112) {
            break L0;
          } else {
            ((anb) this).field_s = 65;
            break L0;
          }
        }
        L1: {
          var8 = (long)(-var7 >> ge.field_c);
          var10 = (long)(var6 >> ge.field_c);
          var12 = var8 * (long)param4 - -((long)param0 * var10);
          var14 = ((anb) this).field_p;
          ((anb) this).field_p = (int)((long)((anb) this).field_p + (var12 >> tua.field_a));
          if (var12 <= 0L) {
            if (var12 >= 0L) {
              break L1;
            } else {
              if (var14 < ((anb) this).field_p) {
                ((anb) this).field_p = -2147483648;
                break L1;
              } else {
                if (var12 >= 0L) {
                  break L1;
                } else {
                  if (var14 >= ((anb) this).field_p) {
                    break L1;
                  } else {
                    ((anb) this).field_p = -2147483648;
                    break L1;
                  }
                }
              }
            }
          } else {
            if (var12 >= 0L) {
              break L1;
            } else {
              if (var14 >= ((anb) this).field_p) {
                break L1;
              } else {
                ((anb) this).field_p = -2147483648;
                break L1;
              }
            }
          }
        }
        ((anb) this).d((byte) 111);
        cqb.a(param1, param2, param2 - param0, -param4 + param1, (byte) -54);
    }

    final void a(sfa param0, tj param1, int param2) {
        ((anb) this).field_k.a(param1, param0, -1);
        if (param2 != -4414) {
            Object var5 = null;
            ((anb) this).a(97, false, (pe) null);
        }
    }

    public final String toString() {
        return ": Mass=" + ((anb) this).field_s + ", MOI=" + ((anb) this).field_m + ",xpos=" + ((anb) this).field_d + ",ypos=" + ((anb) this).field_e + ", angle=" + ((anb) this).field_r + ",avel=" + ((anb) this).field_n;
    }

    public void b(byte param0, tv param1) {
        super.b((byte) 105, param1);
        anb var4 = (anb) (Object) param1;
        if (null != var4.field_k) {
            if (null == var4.field_k) {
                var4.field_k = new ml();
            }
            var4.field_k.b((byte) 110, (tv) (Object) var4.field_k);
        } else {
            var4.field_k = null;
        }
        var4.field_n = var4.field_n;
        var4.field_m = var4.field_m;
        var4.field_r = var4.field_r;
        var4.field_s = var4.field_s;
        var4.field_i = var4.field_i;
        var4.field_j = var4.field_j;
        if (param0 < 54) {
            ((anb) this).field_l = 79;
        }
        var4.field_q = dob.a(var4.field_q, (byte) -85, var4.field_q);
        var4.field_l = var4.field_l;
    }

    anb() {
        ((anb) this).field_q = new int[4];
    }

    private final void c(int param0) {
        ((anb) this).field_q[3] = -2147483648;
        ((anb) this).field_q[2] = 2147483647;
        ((anb) this).field_q[1] = -2147483648;
        if (param0 != 16) {
            ((anb) this).field_s = 17;
        }
        ((anb) this).field_q[0] = 2147483647;
    }

    static {
    }
}
