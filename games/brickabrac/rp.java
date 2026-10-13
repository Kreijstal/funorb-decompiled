/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rp extends km {
    static String field_r;
    static jp field_s;
    private NodeDeque field_v;
    static mh field_t;
    static int field_x;
    static jp field_w;
    static String field_z;
    static jp field_u;
    static String field_y;

    final int b(int param0, int param1) {
        int var3 = this.field_m[param0].field_f;
        if (param1 != 1) {
          field_t = (mh) null;
        }
        if (var3 == 42) {
          return super.b(7, 1);
        }
        return super.b(param0, 1);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int incrementValue$0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          if (lb.field_i > param0) {
            param2 = param2 - (-param0 + lb.field_i);
            param0 = lb.field_i;
          }
          if (param5 < lb.field_b) {
            param4 = param4 - (-param5 + lb.field_b);
            param5 = lb.field_b;
          }
          if (param0 + param2 > lb.field_f) {
            param2 = -param0 + lb.field_f;
          }
          if (lb.field_j < param4 + param5) {
            param4 = lb.field_j - param5;
          }
          var6_int = -param2 + lb.field_c;
          var7 = lb.field_c * param5 + param0;
          for (param5 = 0; param4 > param5; param5++) {
            for (param0 = -param2; param0 < 0; param0++) {
              var8 = lb.field_l[var7];
              incrementValue$0 = var7;
              var7++;
              lb.field_l[incrementValue$0] = ik.a(-16711936, ik.a(var8, 16711935) * param3) + ik.a(16711680, param3 * ik.a(65280, var8)) >>> 8;
            }
            var7 = var7 + var6_int;
          }
          if (param1 != 65280) {
            field_y = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var6), "rp.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final int a(boolean param0, int param1) {
        int var3 = this.field_m[param1].field_f;
        if (!param0) {
          field_s = (jp) null;
        }
        if (var3 != 42) {
          return super.a(true, param1);
        }
        return 19;
    }

    final void drawScreen(byte obfuscationGuard) {
        nq var4 = null;
        int var3 = BrickABrac.field_J ? 1 : 0;
        super.drawScreen((byte) -68);
        im.a(this.field_l + (-this.field_j + 30), 0, 468, 0, 6, (byte) -90, -15 + this.field_j);
        MovingBody.a((byte) -105);
        this.a(0);
        if (obfuscationGuard > -14) {
          field_s = (jp) null;
        }
        si.a(pq.field_k, (byte) -118, po.field_a, hc.field_h);
        if (!pg.c(77)) {
          var4 = (nq) (this.field_v.first(-90));
          while (var4 != null) {
            var4.a(2);
            var4 = (nq) (this.field_v.next((byte) 116));
          }
        }
    }

    final void advanceScreen(boolean updateFlag, boolean inputEnabled, int obfuscationGuard) {
        int fieldTemp$0 = 0;
        nq var6 = null;
        int var5 = BrickABrac.field_J ? 1 : 0;
        super.advanceScreen(updateFlag, inputEnabled, -95);
        if (obfuscationGuard > -52) {
          this.b((byte) 59, 93);
        }
        if (inputEnabled &&
          c.field_g > 0) {
          fieldTemp$0 = c.field_g - 1;
          c.field_g = c.field_g - 1;
          if (0 == fieldTemp$0) {
            fc.a(-59, field_s);
            pa.a(true);
            sc.b(-96);
            if (si.field_k != null) {
              pe.field_n = si.field_k.field_m;
            }
            si.field_k = rd.a(0, (byte) 19);
            hc.field_h = 2 * hi.field_w.nextBoundedInt(-37880252, 2);
            im.field_e = 50;
          }
        }
        if (!pg.c(112)) {
          var6 = (nq) (this.field_v.first(-90));
          while (var6 != null) {
            var6.c(0);
            var6 = (nq) (this.field_v.next((byte) 116));
          }
        }
    }

    final void a(int param0, int param1, char param2) {
        int var5;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (param0 != -120) {
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (pg.c(117)) {
          if (this.field_h.field_j == 9) {
            if (param1 == 99) {
              this.field_h.a(false, 0);
            } else {
              if (param1 == 96) {
                this.field_h.a(false, 0);
              } else {
                if (param1 == 97) {
                  this.field_h.a(false, 0);
                } else {
                  if (param1 == 98) {
                    this.field_h.a(false, 8);
                  }
                }
              }
            }
          } else {
            if (96 != param1 &&
              param1 != 97) {
              if (param1 == 99) {
                this.field_h.a(false, 1 + this.field_h.field_j);
              } else {
                if ((param1 == 98)) {
                  if (this.field_h.field_j <= 0) {
                    this.field_h.a(false, 9);
                  } else {
                    this.field_h.a(false, -1 + this.field_h.field_j);
                  }
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_h.a(false, 9);
            }
          }
        } else {
          super.a(-120, param1, param2);
        }

    }

    public static void c(boolean param0) {
        field_s = null;
        field_u = null;
        field_z = null;
        field_t = null;
        field_y = null;
        field_w = null;
        if (param0) {
          int[] var2 = (int[]) null;
          rp.a((byte) -63, 85, -10, 116, -76, 75, -37, -95, (int[]) null, 59);
        }
        field_r = null;
    }

    final void d(int param0) {
        if (param0 > -60) {
          rp.c(false);
        }
        if (!pg.c(102)) {
          this.a(g.field_o, 0);
        }
    }

    final int a(int param0, int param1) {
        if (param0 > -71) {
          field_u = (jp) null;
        }
        int var3 = this.field_m[param1].field_f;
        if (var3 == 42) {
          return 147;
        }
        return super.a(-106, param1);
    }

    rp() {
        super(0, 180, 460, 150, 35, hc.field_e);
        this.field_v = new NodeDeque();
        int var1 = 468;
        var1 = var1 - da.field_E[1].field_z;
        this.field_v.addLast(new nq(12, var1, da.field_E[1], rd.a(ii.field_s, new String[]{qn.field_u[1]}, (byte) 103)), (byte) 3);
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int[] param8, int param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10_ref = null;
        var16 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param0 <= 115) {
            field_y = (String) null;
          }
          while (true) {
            param6--;
            if (0 > param6) {
              return;
            }
            var17 = param8;
            var10 = var17;
            var11 = param5;
            var12 = param7;
            var13 = param9;
            var14 = param1;
            var15 = var17[var11] >> 1 & 8355711;
            var10[var11] = ik.a(255, var14 >> 17) - (-ik.a(var12 >> 1, 16711680) + (-(ik.a(33423869, var13) >> 9) - var15));
            param9 = param9 + param4;
            param1 = param1 + param2;
            param5++;
            param7 = param7 + param3;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_8_0 = var10_ref;
          stackIn_8_1 = new StringBuilder().append("rp.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param9).append(')').toString());
        }
    }

    final int b(byte param0, int param1) {
        int var4 = -61 % ((param0 - 66) / 45);
        int var3 = this.field_m[param1].field_f;
        if (42 != var3) {
          return super.b((byte) 121, param1);
        }
        return this.field_q + super.b((byte) 8, param1);
    }

    static {
        field_r = "Invite only";
        field_s = new jp(640, 480);
        field_z = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_y = "Click or press F10 to open Quick Chat";
    }
}
