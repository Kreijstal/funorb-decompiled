/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi extends vf {
    private Sprite field_Q;
    private int field_P;
    static int[][] field_R;
    private dg field_M;
    static IndexedSprite field_O;
    static rf field_S;
    private String field_N;

    final String c(byte param0) {
        if (param0 == 69) {
            return null;
        }
        return (String) null;
    }

    final static nc a(rh param0, int param1, int param2, rh param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = -107 % ((-62 - param2) / 58);
          if (mf.a(param4, param1, 116, param3)) {
            stackIn_4_0 = ni.a(param0.a(param1, -28153, param4), -108);
            decompiledRegionSelector0 = 1;
          } else {
            stackIn_2_0 = null;
            decompiledRegionSelector0 = 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = (RuntimeException) (var5);

          stackIn_7_1 = new StringBuilder().append("pi.O(");

          if (param0 == null) {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
            stackIn_8_2 = "null";
          } else {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
            stackIn_8_2 = "{...}";
          }


          stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',');

          if (param3 == null) {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "null";
          } else {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param4).append(')').toString());
        }
        if (decompiledRegionSelector0 == 0) {
          return (nc) ((Object) stackIn_2_0);
        } else {
          return stackIn_4_0;
        }
    }

    final static void c(int param0, int param1) {
        wg.field_a = param0 >> -1651040092 & 3;
        if (!(-3 <= (wg.field_a ^ -1))) {
            wg.field_a = 2;
        }
        qc.field_i = param0 >> 356020514 & 3;
        ad.field_j = 3 & param0;
        if (!(qc.field_i <= 2)) {
            qc.field_i = 2;
        }
        if (param1 != -12718) {
            pi.j(-27);
            if (ad.field_j > 2) {
                ad.field_j = 2;
                return;
            }
            return;
        }
        if (ad.field_j <= 2) {
            return;
        }
        ad.field_j = 2;
    }

    final void a(boolean param0, int param1, el param2, int param3) {
        try {
            this.field_P = this.field_P + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "pi.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final boolean a(byte param0, el param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= -30) {
            stackIn_3_0 = 0;
          } else {
            this.field_P = 97;
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = (RuntimeException) (var3);

          stackIn_6_1 = new StringBuilder().append("pi.UA(").append(param0).append(',');

          if (param1 == null) {
            stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
            stackIn_7_2 = "null";
          } else {
            stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(')').toString());
        }
        return stackIn_3_0 != 0;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        String var5;
        lh var6;
        int var14;
        cc var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        Sprite var15;
        Sprite var16;
        Sprite var17;
        Sprite var18;
        Sprite var19;
        L0: {
          var14 = Geoblox.field_C;
          var6 = this.field_M.a((byte) -105);
          if (var6 != bf.field_g) {
            if (var6 != si.field_n) {
              var5 = this.field_M.c(-21666);
              if (var5 == null) {
                var5 = this.field_N;
                break L0;
              } else {
                break L0;
              }
            }
          }
          var5 = cm.field_h;
        }
        if (!var5.equals(this.field_s)) {
          this.field_s = var5;
          this.g(-55);
        }
        super.a(param0, param1, (byte) 106, param3);
        var6 = this.field_M.a((byte) -105);
        var8 = (cc) ((Object) this.field_q);
        var9 = this.field_v + param0;
        var10 = var8.a(param1, -2, (el) (this)) + (var8.a((byte) 125, (el) (this)).b(-3111) >> -1236998751);
        var11 = 7 % ((param2 - 1) / 43);
        if (bf.field_g == var6) {
          var19 = oa.field_e[0];
          var12 = var19.field_s << -1404171775;
          var13 = var19.field_o << 603574881;
          if (this.field_Q != null) {
            if (this.field_Q.width >= var12) {
              if (this.field_Q.height < var13) {
                this.field_Q = new Sprite(var12, var13);
                Geoblox.setRasterTarget(1, this.field_Q);
                var19.rotateSmooth(112, 144, var19.field_s << -506922012, var19.field_o << -190785340, -this.field_P << 456857898, 4096);
                id.a(true);
                this.field_Q.c(-(var19.field_s >> 408076481) + var9, var10 - var19.field_o, 256);
                return;
              } else {
                Geoblox.setRasterTarget(1, this.field_Q);
                SoftwareRasterizer.c();
                var19.rotateSmooth(112, 144, var19.field_s << -506922012, var19.field_o << -190785340, -this.field_P << 456857898, 4096);
                id.a(true);
                this.field_Q.c(-(var19.field_s >> 408076481) + var9, var10 - var19.field_o, 256);
                return;
              }
            } else {
              this.field_Q = new Sprite(var12, var13);
              Geoblox.setRasterTarget(1, this.field_Q);
              var19.rotateSmooth(112, 144, var19.field_s << -506922012, var19.field_o << -190785340, -this.field_P << 456857898, 4096);
              id.a(true);
              this.field_Q.c(-(var19.field_s >> 408076481) + var9, var10 - var19.field_o, 256);
              return;
            }
          } else {
            this.field_Q = new Sprite(var12, var13);
            Geoblox.setRasterTarget(1, this.field_Q);
            var19.rotateSmooth(112, 144, var19.field_s << -506922012, var19.field_o << -190785340, -this.field_P << 456857898, 4096);
            id.a(true);
            this.field_Q.c(-(var19.field_s >> 408076481) + var9, var10 - var19.field_o, 256);
            return;
          }
        } else {
          if (var6 != si.field_n) {
            if (si.field_m != var6) {
              if (kk.field_w == var6) {
                var16 = oa.field_e[1];
                var16.c(var9, var10 - (var16.height >> 2016960417), 256);
                return;
              } else {
                return;
              }
            } else {
              var17 = oa.field_e[2];
              var17.c(var9, var10 - (var17.height >> 84361697), 256);
              return;
            }
          } else {
            var18 = oa.field_e[0];
            var15 = var18;
            var12 = var18.field_s << -1404171775;
            var13 = var18.field_o << 603574881;
            if (this.field_Q != null) {
              if (this.field_Q.width >= var12) {
                if (this.field_Q.height < var13) {
                  this.field_Q = new Sprite(var12, var13);
                  Geoblox.setRasterTarget(1, this.field_Q);
                  var18.rotateSmooth(112, 144, var18.field_s << -506922012, var18.field_o << -190785340, -this.field_P << 456857898, 4096);
                  id.a(true);
                  this.field_Q.c(-(var18.field_s >> 408076481) + var9, var10 - var18.field_o, 256);
                  return;
                } else {
                  Geoblox.setRasterTarget(1, this.field_Q);
                  SoftwareRasterizer.c();
                  var18.rotateSmooth(112, 144, var18.field_s << -506922012, var18.field_o << -190785340, -this.field_P << 456857898, 4096);
                  id.a(true);
                  this.field_Q.c(-(var18.field_s >> 408076481) + var9, var10 - var18.field_o, 256);
                  return;
                }
              } else {
                this.field_Q = new Sprite(var12, var13);
                Geoblox.setRasterTarget(1, this.field_Q);
                var18.rotateSmooth(112, 144, var18.field_s << -506922012, var18.field_o << -190785340, -this.field_P << 456857898, 4096);
                id.a(true);
                this.field_Q.c(-(var18.field_s >> 408076481) + var9, var10 - var18.field_o, 256);
                return;
              }
            } else {
              this.field_Q = new Sprite(var12, var13);
              Geoblox.setRasterTarget(1, this.field_Q);
              var18.rotateSmooth(112, 144, var18.field_s << -506922012, var18.field_o << -190785340, -this.field_P << 456857898, 4096);
              id.a(true);
              this.field_Q.c(-(var18.field_s >> 408076481) + var9, var10 - var18.field_o, 256);
              return;
            }
          }
        }
    }

    public static void j(int param0) {
        field_R = (int[][]) null;
        field_S = null;
        if (param0 != 24033) {
            field_R = (int[][]) null;
            field_O = null;
            return;
        }
        field_O = null;
    }

    final static void a(boolean param0, boolean param1) {
        if (param1) {
            return;
        }
        kd.field_e.a(0, 0, 0);
    }

    pi(dg param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, ah.a((byte) -66));
        try {
            this.field_M = param0;
            this.field_N = param1;
            this.a(param5, param4, (byte) -77, param3, param2);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "pi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
    }
}
