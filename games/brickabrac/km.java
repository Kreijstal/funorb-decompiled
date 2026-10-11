/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class km extends gf {
    int field_p;
    int field_q;
    int field_l;
    static n field_k;
    int field_j;
    re field_h;
    q[] field_m;
    static String field_n;
    static String field_o;
    static int field_i;

    void b(byte param0) {
        int var2;
        int var3;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (im.field_e <= 0) {
          pa.a(true);
        } else {
          var2 = (-50 + im.field_e) * 640 / 50;
          if (0 != hc.field_h) {
            ed.a(-640 - var2, 0);
            rp.field_s.d(-var2, 0);
          } else {
            ed.a(640 + var2, 0);
            rp.field_s.d(var2, 0);
          }
        }
        if (param0 >= -14) {
          return;
        }
        pg.d(0);
    }

    final void a(int[] param0, int param1) {
        int var3_int = 0;
        int var4 = BrickABrac.field_J ? 1 : 0;
        try {
          this.field_m = new q[param0.length];
          this.field_h = new re(this.field_m.length);
          for (var3_int = param1; param0.length > var3_int; var3_int++) {
            this.field_m[var3_int] = new q(param0[var3_int], this);
            this.field_m[var3_int].a(-97);
          }
          this.b(true);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "km.Q(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    String e(byte param0) {
        int discarded$0 = 0;
        if (param0 <= 53) {
          discarded$0 = this.a(18, (byte) 84, -33);
        }
        return ag.field_D[7];
    }

    int a(boolean param0) {
        if (!param0) {
          field_n = (String) null;
          return 0;
        }
        return 0;
    }

    private final void c(boolean param0, int param1) {
        if (this.field_h.field_j != -1 &&
          param1 != this.field_h.field_j) {
          j.a(ta.field_e[0], -106, lh.g((byte) -44) / 4);
        }
        if (!param0) {
          this.field_j = -36;
        }
    }

    final void e(int param0) {
        int dupTemp$0 = 0;
        int var4 = 0;
        String stackIn_5_0 = null;
        int var2;
        int var3;
        q var4_ref_q;
        String var5;
        int var6;
        String var7;
        q var8;
        int var3Lifetime1;
        var6 = BrickABrac.field_J ? 1 : 0;
        var2 = 0;
        for (var3 = 0; this.field_m.length > var3; var3++) {
          var4_ref_q = this.field_m[var3];
          if (var4_ref_q.field_f == 8) {
            stackIn_5_0 = this.e((byte) 108);
          } else {
            stackIn_5_0 = ag.field_D[var4_ref_q.field_f];
          }
          var7 = stackIn_5_0;
          var5 = var7;
          dupTemp$0 = nn.field_g.c(var7) + 30;
          var4_ref_q.field_j = dupTemp$0;
          var2 = var2 + dupTemp$0;
          if (var3 > 0) {
            var2 += 10;
          }
        }
        var3Lifetime1 = (640 - var2) / param0;
        for (var4 = 0; var4 < this.field_m.length; var4++) {
          var8 = this.field_m[var4];
          var8.field_c = var3Lifetime1;
          var8.field_a = this.b(var4, param0 ^ 3);
          var8.field_d = this.b((byte) 125, var4);
          var3Lifetime1 = var3Lifetime1 + (var8.field_j + 10);
        }
    }

    int a(int param0, int param1) {
        if (param0 >= -71) {
          this.b(true, 87);
        }
        return this.field_l;
    }

    km(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0);
        try {
          this.field_p = param3;
          this.field_l = param2;
          this.field_q = param4;
          if (param5 == null) {
            param5 = new int[]{};
          }
          this.field_j = param1;
          this.a(param5, 0);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "km.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    void d(int param0) {
        if (param0 > -60) {
          this.a(true, -25, 10);
        }
    }

    boolean a(char param0, int param1, int param2) {
        int var4 = 0;
        if (13 != param2) {
          var4 = this.field_h.field_j;
          this.a(-120, param2, param0);
          this.field_h.d((byte) -124);
          if (this.a(false, (byte) 126)) {
            wp.a(8, ta.field_e[0]);
          }
          this.c(true, var4);
        } else {
          this.c(-1);
        }
        if (param1 <= 98) {
          return true;
        }
        return true;
    }

    int b(int param0, int param1) {
        if (param1 != 1) {
          this.a(true, true, -57);
        }
        return this.field_q * param0 + this.field_p;
    }

    void a(int param0, int param1, char param2) {
        this.field_h.d(param0 + 119);
        if (param0 != -120) {
          this.c(true, 117);
        }
    }

    void a(boolean param0, boolean param1, int param2) {
        int var5 = 0;
        int fieldTemp$2 = 0;
        q[] var4_ref_q__;
        int var4;
        q var6;
        int var7;
        q[] var8;
        var7 = BrickABrac.field_J ? 1 : 0;
        si.field_k.e(1);
        var8 = this.field_m;
        var4_ref_q__ = var8;
        for (var5 = 0; var8.length > var5; var5++) {
          var6 = var8[var5];
          var6.b(-2217);
        }
        if (param2 > -52) {
          this.a(true, -79, -10);
        }
        var4 = this.field_h.field_j;
        dm.field_b = sa.a(de.field_x * 20, -4097);
        if (param1 &&
          !vh.field_L &&
          !ed.field_d) {
          this.field_h.a(this.a(po.field_a, (byte) -106, pq.field_k), 27479, this.a(qo.field_O, (byte) -80, tb.field_fb));
          if (this.a(true, (byte) -117)) {
            wp.a(8, ta.field_e[0]);
          }
        }
        this.c(true, var4);
        if (lp.field_rb == this &&
          im.field_e > 0) {
          fieldTemp$2 = im.field_e - 1;
          im.field_e = im.field_e - 1;
          if (fieldTemp$2 == 0) {
            hc.field_h = 1;
            c.field_g = 250;
          }
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3;
        q stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        boolean stackIn_8_2 = false;
        var3 = BrickABrac.field_J ? 1 : 0;
        for (var2 = param0; var2 < this.field_h.field_r; var2++) {
          if (this.a((byte) 99, var2)) {
            stackIn_7_0 = this.field_m[var2];
            stackIn_7_1 = 4;
            stackIn_8_2 = (this.field_h.field_j == var2);
            ((q) (Object) stackIn_7_0).a((byte) stackIn_7_1, stackIn_8_2);
          }
        }
    }

    private final boolean a(boolean param0, byte param1) {
        int var3 = 5 % ((param1 - 69) / 51);
        if (this.field_m.length != 0 &&
          0 <= this.field_h.field_j) {
          return this.a(this.field_h.field_j, param0, (byte) 123);
        }
        return false;
    }

    final static void a(java.applet.Applet param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = param0.getParameter("username");
          if (param1 > -66) {
            return;
          }
          if (var2 != null) {
            var3 = (CharSequence) ((Object) var2);
            if (0L != ah.a(false, var3)) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("km.HA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    void c(int param0) {
        ng.a(false, 97, this.a(true));
        if (param0 != -1) {
          field_n = (String) null;
        }
    }

    boolean a(int param0, boolean param1, byte param2) {
        boolean stackIn_47_0 = false;
        int stackIn_47_1 = 0;
        int stackIn_48_2 = 0;
        int stackIn_143_0 = 0;
        boolean stackIn_165_0 = false;
        int var4;
        q var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        String var12;
        var11 = BrickABrac.field_J ? 1 : 0;
        if (param2 != 123) {
          return true;
        }
        L0: {
          var4 = 0;
          var5 = this.field_m[param0];
          var6 = var5.field_f;
          var8 = var6;
          if (0 != var8) {
            if (var8 != 38 &&
              var8 != 27) {
              if (var8 == 37) {
                if (!(!this.field_h.a((byte) 113))) {
                  be.field_a = true;
                  cq.a(16727, param1, 0, new oi(na.field_L[0]));
                }
                break L0;
              }
              if (var8 == 1) {
                if (!(!this.field_h.a((byte) 113))) {
                  if (!og.h(-26090)) {
                    cb.b(true);
                  } else {
                    sl.field_z = -2;
                    dk.a(sb.field_b, true, 0, param1, 46);
                  }
                }
                break L0;
              }
              if (var8 == 2) {
                if (!(!this.field_h.a((byte) 113))) {
                  ng.a(param1, 69, -1);
                }
                break L0;
              }
              if (var8 == 7) {
                if (!(!this.field_h.a((byte) 113))) {
                  ng.a(param1, 74, 0);
                }
                break L0;
              }
              if (var8 == 24) {
                if (!(!this.field_h.a((byte) 113))) {
                  eb.field_l = true;
                  ng.a(param1, param2 ^ 61, 0);
                }
                break L0;
              }
              if (var8 == 22) {
                if (!(!this.field_h.a((byte) 113))) {
                  ng.a(param1, 67, 8);
                }
                break L0;
              }
              if (var8 == 5) {
                if (!(!this.field_h.a((byte) 113))) {
                  ng.a(param1, 126, 7);
                }
                break L0;
              }
              if (var8 == 8) {
                if (!(!this.field_h.a((byte) 113))) {
                  ng.a(param1, param2 ^ 28, this.a(true));
                }
                break L0;
              }
              if (var8 == 4) {
                if (!(!this.field_h.a((byte) 113))) {
                  ng.a(param1, 71, 6);
                }
                break L0;
              }
              if (var8 == 3) {
                if (!(!this.field_h.a((byte) 113))) {
                  ng.a(param1, 86, 5);
                }
                break L0;
              }
              if (var8 == 20) {
                var7 = 0;
                if (this.field_h.b(-103) &&
                  lh.g((byte) -44) > 0) {
                  ma.a((byte) -113, 0);
                  var7 = 1;
                }
                if (this.field_h.a(-1) &&
                  lh.g((byte) -44) < re.e((byte) 44)) {
                  ma.a((byte) 47, re.e((byte) 31));
                  var7 = 1;
                }
                if (this.field_h.g((byte) -57) &&
                  lh.g((byte) -44) > 0) {
                  k.d((byte) 116);
                  var7 = 1;
                }
                if (this.field_h.c(-98) &&
                  lh.g((byte) -44) < re.e((byte) 90)) {
                  var7 = 1;
                  th.a((byte) -63);
                }
                if (this.field_h.a(false)) {
                  var8 = -120 + var5.field_j + var5.field_c + var5.field_c + dg.field_d >> 1;
                  var9 = pq.field_k - var8;
                  var10 = var9 * re.e((byte) 51) / 120;
                  if (var10 <= 0) {
                    ma.a((byte) -114, 0);
                  } else {
                    if (var10 < re.e((byte) 81)) {
                      ma.a((byte) -127, var10);
                    } else {
                      ma.a((byte) 95, re.e((byte) 32));
                    }
                  }
                  var7 = 1;
                }
                if (((var7 != 0)) && ((!(this.field_h.a(false)) ||
                  !(de.field_x <= ea.field_d)))) {
                  wp.a(8, ta.field_e[1]);
                  ea.field_d = de.field_x + 20;
                }
                break L0;
              }
              if (var8 == 21) {
                if (this.field_h.b(param2 ^ -30)) {
                  il.a((byte) 86, 0);
                }
                if (this.field_h.a(-1)) {
                  il.a((byte) 86, 256);
                }
                if (this.field_h.g((byte) -57)) {
                  lf.f(-1);
                }
                if (this.field_h.c(param2 ^ -27)) {
                  nf.a((byte) 109);
                }
                if (!(!this.field_h.a(false))) {
                  var8 = -120 + (dg.field_d + (var5.field_c + var5.field_j) + var5.field_c) >> 1;
                  var9 = -var8 + pq.field_k;
                  var10 = 256 * var9 / 120;
                  if (var10 <= 0) {
                    il.a((byte) 86, 0);
                  } else {
                    if (var10 >= 256) {
                      il.a((byte) 86, 256);
                    } else {
                      il.a((byte) 86, var10);
                    }
                  }
                }
                break L0;
              }
              if (var8 == 6) {
                if (!(!this.field_h.a((byte) 113))) {
                  var4 = 1;
                  if (null == ua.field_d) {
                    cp.a(param1, 21543);
                  } else {
                    nc.b(82);
                  }
                }
                break L0;
              }
              if (var8 == 9) {
                if (!(!this.field_h.a((byte) 113))) {
                  pe.field_o.a((byte) 40, param1);
                  cc.field_G = true;
                }
                break L0;
              }
              if (var8 == 11) {
                if (!(!this.field_h.a((byte) 113))) {
                  pe.field_o.b(29);
                  ng.a(param1, 73, -1);
                }
                break L0;
              }
              if (var8 == 12) {
                if (!(!this.field_h.a((byte) 113))) {
                  pe.field_o.f(69);
                }
                break L0;
              }
              if (13 == var8) {
                if (!(!this.field_h.a((byte) 113))) {
                  da.f((byte) 122);
                }
                break L0;
              }
              if (var8 == 23) {
                if (!(!this.field_h.a((byte) 113))) {
                  if (this.field_a != 10) {
                    he.a(mq.field_a, true, (byte) 126);
                    sl.field_z = 2147483647;
                  } else {
                    var12 = (String) null;
                    he.a((String) null, true, (byte) 123);
                    if (ib.a(pl.field_b, -1)) {
                      sl.field_z = 9;
                    } else {
                      stackIn_143_0 = (null != fj.field_Ub) ? 5 : 0;
                      sl.field_z = stackIn_143_0;
                    }
                  }
                }
                break L0;
              }
              if (19 == var8) {
                if (!(!this.field_h.a((byte) 113))) {
                  var4 = 1;
                  nk.a(2048, uc.e((byte) -66));
                }
                break L0;
              }
              if (var8 == 32) {
                if (!(!this.field_h.a((byte) 113))) {
                  ng.a(param1, 62, 14);
                }
                break L0;
              }
              if (var8 == 33) {
                if (!(!this.field_h.a((byte) 113))) {
                  cq.a(16727, param1, pe.field_o.field_r, pe.field_o.field_w.field_b);
                }
                break L0;
              }
              if (var8 == 34) {
                if (!(!this.field_h.a((byte) 113))) {
                  var8 = 13;
                  if (gq.field_Yb == 1) {
                    var8 = 15;
                  }
                  ng.a(param1, param2 ^ 25, var8);
                  cc.field_G = true;
                }
                break L0;
              }
              switch (var8) {
                case 35:
                  if (!this.field_h.a((byte) 113)) {
                    break L0;
                  }
                  pe.field_o.a(param1, (byte) 69);
                  cc.field_G = true;
                  break L0;
                default:
                  break L0;
                case 42:
                  if (!this.field_h.a((byte) 113)) {
                    break L0;
                  }
                  var4 = 1;
                  ng.a(param1, 110, 12);
                  break L0;
                case 36:
                  if (!this.field_h.a((byte) 113)) {
                    break L0;
                  }
                  stackIn_165_0 = !(be.field_a);
                  be.field_a = stackIn_165_0;
                  r.field_A = stackIn_165_0;
                  if (r.field_A &&
                    pe.field_o != null) {
                    hd.a(true);
                  }
                  var4 = 1;
                  break L0;
              }
            }
            if (this.field_h.a((byte) 113)) {
              qj.b((byte) -126, param1);
            }
          } else {
            if (this.field_h.a((byte) 113)) {
              stackIn_47_0 = param1;
              stackIn_47_1 = param2 - 44;
              if (pg.c(72)) {
                stackIn_48_2 = 13;
              } else {
                stackIn_48_2 = 16;
              }
              ng.a(stackIn_47_0, stackIn_47_1, stackIn_48_2);
            }
          }
        }
        return var4 != 0;
    }

    final static void a(ak param0, j param1, int param2, int param3, boolean param4, int param5, int param6) {
        int var11 = 0;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        var12 = BrickABrac.field_J ? 1 : 0;
        try {
          var7_int = param3;
          var8 = param2;
          if (!param4) {
            return;
          }
          var9 = 0;
          var10 = 0;
          for (var11 = 0; var11 < 29; var11++) {
            if ((1 << var11 & param1.field_S) != 0) {
              oc.a(var8, var11, var7_int, param1, param0, (byte) 115);
              var7_int += 25;
              var9++;
              if (var9 == param5) {
                var10++;
                if (var10 == param6) {
                  return;
                }
                var9 = 0;
                var8 += 25;
                var7_int = param3;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_18_0 = var7;
          stackIn_18_1 = new StringBuilder().append("km.EA(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    boolean a(byte param0, int param1) {
        if (param0 <= 80) {
          return false;
        }
        return true;
    }

    void b(boolean param0) {
        int var2 = 0;
        q var3 = null;
        int var4 = BrickABrac.field_J ? 1 : 0;
        if (!param0) {
          this.e((byte) -7);
        }
        for (var2 = 0; var2 < this.field_m.length; var2++) {
          var3 = this.field_m[var2];
          var3.field_c = this.a(true, var2);
          var3.field_a = this.b(var2, 1);
          var3.field_j = this.a(-109, var2) - this.a(param0, var2);
          this.field_m[var2].field_d = this.b((byte) -78, var2);
        }
    }

    int a(boolean param0, int param1) {
        if (!param0) {
          this.a(109, -54, 'ￃ');
        }
        return this.field_j;
    }

    final static void a(int param0, int param1, long param2, String param3, int param4) {
        try {
          ep.field_k = param0;
          bo.field_l = true;
          wd.field_z = param4;
          gn.field_E = param2;
          ba.field_z = param3;
          if (param1 != 29295) {
            km.b(48);
          }
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "km.P(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public static void b(int param0) {
        field_o = null;
        field_n = null;
        if (param0 >= -57) {
          j var2 = (j) null;
          km.a((ak) null, (j) null, 113, 61, false, -53, 18);
        }
        field_k = null;
    }

    void a(boolean param0, int param1, int param2) {
        if (param2 <= 96) {
          this.a('F', -76, -96);
        }
        this.field_h.a(this.a(po.field_a, (byte) -106, pq.field_k), param1, param0, (byte) -127);
    }

    void d(byte param0) {
        if (param0 != 79) {
          this.b(-57, -105);
        }
    }

    int b(byte param0, int param1) {
        int var3 = 11 % ((param0 - 66) / 45);
        return 30;
    }

    final void b(boolean param0, int param1) {
        int var4 = 0;
        q var5 = null;
        int var6 = BrickABrac.field_J ? 1 : 0;
        q[] var7 = this.field_m;
        q[] var3 = var7;
        for (var4 = 0; var4 < var7.length; var4++) {
          var5 = var7[var4];
          var5.field_h = false;
        }
        this.field_m[param1].field_h = param0 ? true : false;
    }

    private final int a(int param0, byte param1, int param2) {
        int var4;
        q var5;
        int var6;
        var6 = BrickABrac.field_J ? 1 : 0;
        var4 = 0;
        if (param1 >= -77) {
          this.field_h = (re) null;
        }
        while (var4 < this.field_m.length) {
          var5 = this.field_m[var4];
          if (this.a((byte) 122, var4) &&
            var5.a(param2, param0, -79)) {
            return var4;
          }
          var4++;
        }
        return -1;
    }

    static {
        field_k = new n();
        field_o = "Names should contain a maximum of 12 characters";
        field_n = "Your request to join has been declined.";
    }
}
