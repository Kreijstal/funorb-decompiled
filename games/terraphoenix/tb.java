/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb extends uj {
    static String field_x;
    static String field_i;
    private il field_q;
    private int field_f;
    private rf field_h;
    private int field_A;
    private km field_j;
    private byte[] field_y;
    static String field_l;
    private int field_p;
    static double field_u;
    private wh field_s;
    private byte[] field_n;
    private ua field_m;
    private h field_r;
    private ua field_t;
    private boolean field_o;
    private int field_z;
    private boolean field_w;
    private jj field_v;
    private jj field_k;
    private boolean field_B;
    private long field_g;

    final byte[] a(int param0, int param1) {
        if (param1 >= -62) {
          return (byte[]) null;
        }
        rf var3 = this.a(0, param0, (byte) -97);
        if (var3 == null) {
          return null;
        }
        byte[] var4 = var3.b(true);
        var3.b((byte) 12);
        return var4;
    }

    final static void a(int param0, int param1, int param2) {
        nd.field_r = param0;
        ma.field_E = param2;
        if (param1 != 21361) {
          field_u = 0.05953700668806378;
        }
    }

    final static String a(int param0, String param1, java.applet.Applet param2) {
        try {
          int var6 = 0;
          String var3 = null;
          String[] var4 = null;
          int var5 = 0;
          int var7 = 0;
          int var8 = 0;
          String stackIn_7_0 = null;
          Object stackIn_12_0 = null;
          RuntimeException stackIn_15_0 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3_ref = null;
          RuntimeException var3_ref2 = null;
          var8 = Terraphoenix.field_V;
          try {
            try {
              var3 = (String) (cd.a((byte) -128, "getcookies", param2));
              var4 = nc.a(14352, var3, ';');
              var5 = 47 % ((param0 + 47) / 32);
              for (var6 = 0; var6 < var4.length; var6++) {
                var7 = var4[var6].indexOf('=');
                if (var7 >= 0 &&
                  var4[var6].substring(0, var7).trim().equals(param1)) {
                  stackIn_7_0 = var4[var6].substring(1 + var7).trim();
                  return stackIn_7_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = decompiledCaughtException;
            }
            stackIn_12_0 = null;
            return (String) (stackIn_12_0);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_15_0 = var3_ref2;
            stackIn_15_1 = new StringBuilder().append("tb.G(").append(param0).append(',');
            if (param1 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
            if (param2 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw qk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(String param0, gd param1, gd param2, boolean param3, int param4, byte param5, int param6) {
        int var12 = 0;
        int stackIn_8_0 = 0;
        dh stackIn_21_0 = null;
        String stackIn_22_1 = null;
        dh stackIn_24_0 = null;
        String stackIn_25_1 = null;
        int stackIn_36_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_70_0 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        int var10Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        var13 = Terraphoenix.field_V;
        try {
          if (param5 != 96) {
            field_u = 0.5936452060822851;
          }
          var14 = param2.a(119);
          var8 = param1.a(param5 ^ 25);
          if (null == ig.field_e &&
            !le.a(false, (byte) 109)) {
            stackIn_8_0 = -1;
            return stackIn_8_0;
          }
          if (va.field_e == mh.field_a) {
            ge.field_d = null;
            di.field_l.field_k = 0;
            if (param0 == null) {
              nc.field_c.field_k = 0;
              nc.field_c.e(j.field_H.nextInt(), param5 + 8863);
              nc.field_c.e(j.field_H.nextInt(), 8959);
              stackIn_21_0 = nc.field_c;
              if (!param2.c(1)) {
                stackIn_22_1 = "";
              } else {
                stackIn_22_1 = var14;
              }
              ((dh) (Object) stackIn_21_0).b(stackIn_22_1, -86);
              stackIn_24_0 = nc.field_c;
              if (param1.c(param5 ^ 97)) {
                stackIn_25_1 = var8;
              } else {
                stackIn_25_1 = "";
              }
              ((dh) (Object) stackIn_24_0).b(stackIn_25_1, -105);
              di.field_l.i(16, 59);
              di.field_l.field_k = di.field_l.field_k + 1;
              var9 = di.field_l.field_k;
              ea.a(ga.field_o, nc.field_c, 0, dj.field_c, di.field_l);
              di.field_l.j(di.field_l.field_k - var9, param5 - 215);
            } else {
              var9 = 0;
              if (param3) {
                var9 = var9 | 1;
              }
              nc.field_c.field_k = 0;
              nc.field_c.e(j.field_H.nextInt(), 8959);
              nc.field_c.e(j.field_H.nextInt(), param5 + 8863);
              nc.field_c.b(var14, -33);
              nc.field_c.b(var8, -101);
              var15 = (CharSequence) ((Object) param0);
              nc.field_c.b(nh.a(-31621, var15), -34);
              nc.field_c.h(-1564407352, param4);
              nc.field_c.i(param6, -115);
              nc.field_c.i(var9, -90);
              di.field_l.i(18, param5 ^ 21);
              di.field_l.field_k = di.field_l.field_k + 2;
              var10 = di.field_l.field_k;
              var11_ref_String = kf.a(param5 ^ -120, dg.a(false));
              if (var11_ref_String == null) {
                var11_ref_String = "";
              }
              di.field_l.a(var11_ref_String, 2295);
              ea.a(ga.field_o, nc.field_c, param5 - 96, dj.field_c, di.field_l);
              di.field_l.g(-var10 + di.field_l.field_k, -20125);
            }
            bc.a(-1, param5 - 96);
            mh.field_a = ha.field_n;
          }
          if (mh.field_a == ha.field_n &&
            vc.a(param5 - 213, 1)) {
            var9Lifetime1 = mk.field_j.a(-16384);
            mk.field_j.field_k = 0;
            if (var9Lifetime1 >= 100 &&
              var9Lifetime1 <= 105) {
              te.field_a = new String[-100 + var9Lifetime1];
              mh.field_a = tc.field_f;
            } else {
              if (var9Lifetime1 == 248) {
                ke.a(dg.a(false), (byte) 95);
                bh.field_d = kj.field_e;
                gb.g(-17464);
                vj.field_Q = false;
                stackIn_36_0 = var9Lifetime1;
                return stackIn_36_0;
              }
              if (var9Lifetime1 != 99) {
                mh.field_a = tf.field_d;
                qh.field_d = -1;
                qk.field_b = var9Lifetime1;
              } else {
                vc.a(-111, dc.b((byte) 30));
                ge.field_d = new Boolean(cb.a(mk.field_j, 102));
                mk.field_j.field_k = 0;
              }
            }
          }
          if (mh.field_a == tc.field_f) {
            var9Lifetime2 = 2;
            if (vc.a(-99, var9Lifetime2)) {
              var10Lifetime1 = mk.field_j.i(-25578);
              mk.field_j.field_k = 0;
              if (vc.a(param5 ^ -32, var10Lifetime1)) {
                var11 = te.field_a.length;
                for (var12 = 0; var12 < var11; var12++) {
                  te.field_a[var12] = mk.field_j.c((byte) 46);
                }
                gb.g(-17464);
                vj.field_Q = false;
                stackIn_51_0 = 100 + var11;
                return stackIn_51_0;
              }
            }
          }
          if (tf.field_d == mh.field_a &&
            cm.b((byte) -98)) {
            if (qk.field_b != 255) {
              bh.field_d = mk.field_j.e(-1);
            } else {
              var9_ref_String = mk.field_j.j(-1915115064);
              if (var9_ref_String != null) {
                hk.a(var9_ref_String, (byte) 3, dg.a(false));
              }
            }
            gb.g(param5 ^ -17496);
            vj.field_Q = false;
            stackIn_60_0 = qk.field_b;
            return stackIn_60_0;
          }
          if (ig.field_e == null) {
            if (vj.field_Q) {
              if (30000L < ce.b(1)) {
                bh.field_d = qk.field_f;
              } else {
                bh.field_d = cl.field_I;
              }
              vj.field_Q = false;
              stackIn_68_0 = 249;
              return stackIn_68_0;
            }
            var9Lifetime3 = sb.field_i;
            sb.field_i = pg.field_f;
            pg.field_f = var9Lifetime3;
            vj.field_Q = true;
          }
          stackIn_70_0 = -1;
          return stackIn_70_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_73_0 = var7;
          stackIn_73_1 = new StringBuilder().append("tb.K(");
          if (param0 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          stackIn_76_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',');
          if (param1 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          stackIn_79_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',');
          if (param2 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_x = null;
        if (param0 != -18440) {
          return;
        }
        field_i = null;
        field_l = null;
    }

    final void e(byte param0) {
        rf discarded$3 = null;
        rf discarded$2 = null;
        rf discarded$1 = null;
        rf discarded$0 = null;
        int var2_int;
        rf var2;
        uf var3;
        int var4;
        int var5;
        uf var6;
        uf var7;
        int var2_intLifetime1;
        int var4Lifetime1;
        uf var3Lifetime1;
        var5 = Terraphoenix.field_V;
        if (param0 != -51) {
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_k != null) {
          if (this.a((byte) 105) == null) {
            return;
          }
          if (this.field_w) {
            var2_int = 1;
            var3 = this.field_k.d(9272);
            while (var3 != null) {
              var4 = (int)var3.field_g;
              if (0 == this.field_n[var4]) {
                discarded$3 = this.a(1, var4, (byte) -97);
              }
              if (this.field_n[var4] == 0) {
                var2_int = 0;
              } else {
                var3.b((byte) 12);
              }
              var3 = this.field_k.e((byte) -119);
            }
            while (this.field_z < this.field_j.field_d.length) {
              if (0 == this.field_j.field_d[this.field_z]) {
                this.field_z = this.field_z + 1;
                continue;
              }
              if (this.field_s.field_b < 250) {
                if (0 == this.field_n[this.field_z]) {
                  discarded$2 = this.a(1, this.field_z, (byte) -97);
                }
                if (0 == this.field_n[this.field_z]) {
                  var6 = new uf();
                  var6.field_g = (long)this.field_z;
                  var2_int = 0;
                  this.field_k.a(var6, -16611);
                }
                this.field_z = this.field_z + 1;
                continue;
              }
              var2_int = 0;
              break;
            }
            if ((var2_int != 0)) {
              this.field_z = 0;
              this.field_w = false;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_o) {
              var2_intLifetime1 = 1;
              var3Lifetime1 = this.field_k.d(9272);
              while (var3Lifetime1 != null) {
                var4Lifetime1 = (int)var3Lifetime1.field_g;
                if (this.field_n[var4Lifetime1] != 1) {
                  discarded$1 = this.a(2, var4Lifetime1, (byte) -97);
                }
                if (this.field_n[var4Lifetime1] == 1) {
                  var3Lifetime1.b((byte) 12);
                } else {
                  var2_intLifetime1 = 0;
                }
                var3Lifetime1 = this.field_k.e((byte) -119);
              }
              L3: while (true) {
                if (this.field_z < this.field_j.field_d.length) {
                  if (this.field_j.field_d[this.field_z] != 0) {
                    if (this.field_r.b(true)) {
                      var2_intLifetime1 = 0;
                      break L3;
                    }
                    if (this.field_n[this.field_z] != 1) {
                      discarded$0 = this.a(2, this.field_z, (byte) -97);
                    }
                    if (1 != this.field_n[this.field_z]) {
                      var7 = new uf();
                      var7.field_g = (long)this.field_z;
                      this.field_k.a(var7, -16611);
                      var2_intLifetime1 = 0;
                    }
                  }
                  this.field_z = this.field_z + 1;
                  continue;
                }
                break;
              }
              if ((var2_intLifetime1 != 0)) {
                this.field_z = 0;
                this.field_o = false;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_k = null;
            }
          }
        }
        if (this.field_B &&
          ll.a(1000) >= this.field_g) {
          var2 = (rf) (this.field_q.a((byte) 117));
          while (var2 != null) {
            if (!var2.field_A) {
              if (var2.field_C) {
                if (!var2.field_x) {
                  throw new RuntimeException();
                }
                var2.b((byte) 12);
              } else {
                var2.field_C = true;
              }
            }
            var2 = (rf) (this.field_q.a(true));
          }
          this.field_g = ll.a(1000) + 1000L;
        }
    }

    final void c(byte param0) {
        if (param0 != 2) {
          this.field_m = (ua) null;
        }
        if (null == this.field_m) {
          return;
        }
        this.field_o = true;
        if (null == this.field_k) {
          this.field_k = new jj();
        }
    }

    private final rf a(int param0, int param1, byte param2) {
        Object stackIn_60_0 = null;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        byte[] var5 = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Exception var6_ref = null;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        rf var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        var10 = Terraphoenix.field_V;
        var12 = (rf) (this.field_q.a((byte) 46, (long)param1));
        var4 = var12;
        if (var12 != null &&
          0 == param0 &&
          !var12.field_x &&
          var12.field_A) {
          var12.b((byte) 12);
          var4 = null;
        }
        if (param2 != -97) {
          tb.a(97);
        }
        if (var4 == null) {
          if (0 == param0) {
            if (this.field_m != null &&
              this.field_n[param1] != -1) {
              var4 = this.field_s.a(this.field_m, param1, 2);
            } else {
              if (this.field_r.d(-21)) {
                return null;
              }
              var4 = this.field_r.a(param1, true, this.field_f, (byte) 110, (byte) 2);
            }
          } else {
            if (1 == param0) {
              if (this.field_m == null) {
                throw new RuntimeException();
              }
              var4 = this.field_s.a(41, param1, this.field_m);
            } else {
              if (param0 != 2) {
                throw new RuntimeException();
              }
              if (this.field_m == null) {
                throw new RuntimeException();
              }
              if (this.field_n[param1] != -1) {
                throw new RuntimeException();
              }
              if (this.field_r.b(true)) {
                return null;
              }
              var4 = this.field_r.a(param1, false, this.field_f, (byte) 115, (byte) 2);
            }
          }
          this.field_q.a((uf) (var4), (long)param1, (byte) -71);
        }
        if (((rf) (var4)).field_A) {
          return null;
        }
        var18 = ((rf) (var4)).b(true);
        var13 = var18;
        var5 = var13;
        if (var4 instanceof ma) {
          try {
            if (var5 != null &&
              var18.length > 2) {
              qc.field_d.reset();
              qc.field_d.update(var5, 0, -2 + var18.length);
              var6_int = (int)qc.field_d.getValue();
              if (var6_int != this.field_j.field_h[param1]) {
                throw new RuntimeException();
              }
              if (null != this.field_j.field_p &&
                null != this.field_j.field_p[param1]) {
                var27 = this.field_j.field_p[param1];
                var28 = tg.a(var5, var18.length - 2, 0, 8);
                for (var9 = 0; var9 < 64; var9++) {
                  if (~var27[var9] != ~var28[var9]) {
                    throw new RuntimeException();
                  }
                }
              }
              var7 = (255 & var5[-1 + var18.length]) + ((255 & var5[var18.length - 2]) << 8);
              if (var7 != (65535 & this.field_j.field_o[param1])) {
                throw new RuntimeException();
              }
              if (this.field_n[param1] != 1) {
                if (0 != this.field_n[param1]) {
                }
                this.field_n[param1] = (byte) 1;
              }
              if (!((rf) (var4)).field_x) {
                ((rf) (var4)).b((byte) 12);
              }
              stackIn_60_0 = var4;
              return (rf) (stackIn_60_0);
            }
            throw new RuntimeException();
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            this.field_n[param1] = (byte)-1;
            ((rf) (var4)).b((byte) 12);
            if (((rf) (var4)).field_x &&
              !this.field_r.d(-21)) {
              var4 = this.field_r.a(param1, true, this.field_f, (byte) 91, (byte) 2);
              this.field_q.a((uf) (var4), (long)param1, (byte) -101);
            }
            return null;
          }
        }
        try {
          if (var5 != null &&
            var18.length > 2) {
            qc.field_d.reset();
            qc.field_d.update(var5, 0, -2 + var18.length);
            var6_int = (int)qc.field_d.getValue();
            if (this.field_j.field_h[param1] != var6_int) {
              throw new RuntimeException();
            }
            if (null != this.field_j.field_p &&
              this.field_j.field_p[param1] != null) {
              var30 = this.field_j.field_p[param1];
              var29 = tg.a(var5, var18.length - 2, 0, 8);
              var11 = 0;
              var9 = var11;
              while (var11 < 64) {
                if (var29[var11] != var30[var11]) {
                  throw new RuntimeException();
                }
                var11++;
              }
            }
            this.field_r.field_i = 0;
            this.field_r.field_l = 0;
          } else {
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (RuntimeException) (Object) decompiledCaughtException;
          this.field_r.b(-12948);
          ((rf) (var4)).b((byte) 12);
          if (!((rf) (var4)).field_x) {
            return null;
          }
          if (this.field_r.d(-21)) {
            return null;
          }
          var4 = this.field_r.a(param1, true, this.field_f, (byte) 77, (byte) 2);
          this.field_q.a((uf) (var4), (long)param1, (byte) -100);
          return null;
        }
        var5[var18.length - 2] = (byte)(this.field_j.field_o[param1] >>> 8);
        var5[var18.length - 1] = (byte)this.field_j.field_o[param1];
        if (null != this.field_m) {
          this.field_s.a(var18, param1, param2 ^ -4723, this.field_m);
          if (this.field_n[param1] != 1) {
            this.field_n[param1] = (byte) 1;
          }
        }
        if (!((rf) (var4)).field_x) {
          ((rf) (var4)).b((byte) 12);
        }
        return (rf) (var4);
    }

    final int b(int param0, int param1) {
        rf var3 = (rf) (this.field_q.a((byte) 46, (long)param1));
        if (param0 != 0) {
          return -22;
        }
        if (var3 == null) {
          return 0;
        }
        return var3.c(0);
    }

    final km a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = Terraphoenix.field_V;
        if (this.field_j != null) {
          return this.field_j;
        }
        if (this.field_h == null) {
          if (this.field_r.d(-21)) {
            return null;
          }
          this.field_h = (rf) ((Object) this.field_r.a(this.field_f, true, 255, (byte) 105, (byte) 0));
        }
        if (this.field_h.field_A) {
          return null;
        }
        var7 = this.field_h.b(true);
        var6 = var7;
        var5 = var6;
        var2 = var5;
        if (this.field_h instanceof ma) {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_j = new km(var7, this.field_A, this.field_y);
            if (this.field_j.field_t != this.field_p) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = decompiledCaughtException;
            this.field_j = null;
            if (this.field_r.d(-21)) {
              this.field_h = null;
            } else {
              this.field_h = (rf) ((Object) this.field_r.a(this.field_f, true, 255, (byte) 61, (byte) 0));
            }
            return null;
          }
        } else {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_j = new km(var7, this.field_A, this.field_y);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = decompiledCaughtException;
            this.field_r.b(-12948);
            this.field_j = null;
            if (this.field_r.d(-21)) {
              this.field_h = null;
            } else {
              this.field_h = (rf) ((Object) this.field_r.a(this.field_f, true, 255, (byte) 93, (byte) 0));
            }
            return null;
          }
          if (null != this.field_t) {
            this.field_s.a(var7, this.field_f, 4626, this.field_t);
          }
        }
        if (param0 < 50) {
          this.field_z = 32;
        }
        if (null != this.field_m) {
          this.field_n = new byte[this.field_j.field_j];
        }
        this.field_h = null;
        return this.field_j;
    }

    final void d(byte param0) {
        rf discarded$0 = null;
        rf discarded$1 = null;
        uf var2;
        int var3;
        int var4;
        java.applet.Applet var5;
        var4 = Terraphoenix.field_V;
        if (null == this.field_k) {
          return;
        }
        if (null == this.a((byte) 127)) {
          return;
        }
        if (param0 != -21) {
          var5 = (java.applet.Applet) null;
          tb.a(-41, (String) null, (java.applet.Applet) null);
        }
        var2 = this.field_v.d(9272);
        while (var2 != null) {
          var3 = (int)var2.field_g;
          if (var3 >= 0 &&
            var3 < this.field_j.field_j &&
            this.field_j.field_d[var3] != 0) {
            if (this.field_n[var3] == 0) {
              discarded$0 = this.a(1, var3, (byte) -97);
            }
            if (this.field_n[var3] == -1) {
              discarded$1 = this.a(2, var3, (byte) -97);
            }
            if (this.field_n[var3] == 1) {
              var2.b((byte) 12);
            }
            var2 = this.field_v.e((byte) -119);
            continue;
          }
          var2.b((byte) 12);
          var2 = this.field_v.e((byte) -119);
        }
    }

    tb(int param0, ua param1, ua param2, h param3, wh param4, int param5, byte[] param6, int param7, boolean param8) {
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        this.field_q = new il(16);
        this.field_z = 0;
        this.field_v = new jj();
        this.field_g = 0L;
        try {
          this.field_m = param1;
          this.field_f = param0;
          if (this.field_m != null) {
            this.field_w = true;
            this.field_k = new jj();
          } else {
            this.field_w = false;
          }
          stackIn_7_1 = (param8);
          this.field_B = stackIn_7_1;
          this.field_s = param4;
          this.field_A = param5;
          this.field_r = param3;
          this.field_y = param6;
          this.field_p = param7;
          this.field_t = param2;
          if (this.field_t != null) {
            this.field_h = (rf) ((Object) this.field_s.a(this.field_t, this.field_f, 2));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = var10;
          stackIn_12_1 = new StringBuilder().append("tb.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_l = "Suggested names: ";
        field_u = 0.0;
        field_i = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_x = "Zombie";
    }
}
