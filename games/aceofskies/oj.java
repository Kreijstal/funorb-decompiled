/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj extends sk {
    private go[] field_h;
    private boolean field_i;
    private boolean field_f;
    static volatile int field_g;

    oj(bf param0) {
        super(param0);
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        boolean stackIn_5_1 = false;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        int[][] var27 = null;
        int[][] var28 = null;
        int[][] var29 = null;
        this.field_f = false;
        try {
          if (param0.field_Pb) {
            stackIn_5_1 = !(3 <= param0.field_h);
            this.field_i = stackIn_5_1;
            stackIn_8_0 = (!this.field_i) ? 127 : 48;
            var2_int = stackIn_8_0;
            var29 = new int[6][4096];
            var27 = new int[6][4096];
            var28 = new int[6][4096];
            var9 = 0;
            for (var14 = 0; var14 < 64; var14++) {
              for (var15 = 0; var15 < 64; var15++) {
                var11 = 2.0f * (float)var15 / 64.0f - 1.0f;
                var12 = -1.0f + (float)var14 * 2.0f / 64.0f;
                var13 = (float)(1.0 / Math.sqrt((double)(var12 * var12 + (var11 * var11 + 1.0f))));
                var11 = var11 * var13;
                var12 = var12 * var13;
                for (var16 = 0; var16 < 6; var16++) {
                  if (var16 != 0) {
                    if (var16 != 1) {
                      if (var16 != 2) {
                        if (var16 != 3) {
                          if (var16 == 4) {
                            var10 = var13;
                          } else {
                            var10 = -var13;
                          }
                        } else {
                          var10 = -var12;
                        }
                      } else {
                        var10 = var12;
                      }
                    } else {
                      var10 = var11;
                    }
                  } else {
                    var10 = -var11;
                  }
                  if (!(0.0f < var10)) {
                    var6 = 0;
                    var7 = 0;
                    var8 = 0;
                  } else {
                    var6 = (int)((double)var2_int * Math.pow((double)var10, 96.0));
                    var7 = (int)(Math.pow((double)var10, 36.0) * (double)var2_int);
                    var8 = (int)((double)var2_int * Math.pow((double)var10, 12.0));
                  }
                  var27[var16][var9] = var6 << 24;
                  var28[var16][var9] = var7 << 24;
                  var29[var16][var9] = var8 << 24;
                }
                var9++;
              }
            }
            this.field_h = new go[3];
            this.field_h[0] = this.field_b.a(64, -118, false, var27);
            this.field_h[1] = this.field_b.a(64, 80, false, var28);
            this.field_h[2] = this.field_b.a(64, -69, false, var29);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_35_0 = var2;
          stackIn_35_1 = new StringBuilder().append("oj.<init>(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    final void a(boolean param0, byte param1) {
        int var4;
        jj var5;
        ec var6;
        var4 = AceOfSkies.field_G ? 1 : 0;
        if (param1 <= 2) {
          var5 = (jj) null;
          this.a(-6, -33, (jj) null);
        }
        if (null == this.field_h) {
          this.field_b.a(ac.field_b, 0, 0);
        } else {
          if (!param0) {
            this.field_b.a(ac.field_b, 0, 0);
          } else {
            this.field_b.a(1, (byte) 78);
            this.field_b.a(rg.field_A, false);
            var6 = this.field_b.d(12343);
            var6.a(1024, 1);
            this.field_b.a(qn.field_a, (byte) -127);
            if (this.field_i) {
              this.field_b.a(lo.field_j, true, bd.field_C);
              this.field_b.a(true, 0, true, dl.field_p, false);
              this.field_b.a(ac.field_b, 0, 0);
            } else {
              this.field_b.a(bd.field_C, true, ru.field_a);
              this.field_b.a((byte) 119, 0, un.field_i);
              this.field_b.a(2, (byte) 79);
              this.field_b.a(lo.field_j, true, bd.field_C);
              this.field_b.a((byte) 120, 0, un.field_i);
              this.field_b.a(true, 1, true, un.field_i, false);
              this.field_b.a(ac.field_b, 0, 0);
              this.field_b.a(this.field_b.field_Kb, -9135);
            }
            this.field_b.a(0, (byte) 40);
            this.field_f = true;
          }
        }
    }

    final static boolean a(char param0, byte param1) {
        int var2;
        boolean stackIn_4_0 = false;
        var2 = 72 / ((param1 + 82) / 34);
        stackIn_4_0 = (param0 >= 48) && (param0 <= 57);
        return stackIn_4_0;
    }

    final void a(int param0, int param1, jj param2) {
        try {
          this.field_b.a(param2, -9135);
          this.field_b.b(param0, false);
          if (param1 <= 66) {
            this.field_h = (go[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "oj.I(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static int f(int param0) {
        int stackIn_9_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = AceOfSkies.field_G ? 1 : 0;
        try {
          var1_int = 0;
          var2 = 0;
          while (ek.a((byte) -127)) {
            pr.field_b.a(true);
            if (pr.field_b.e((byte) 115)) {
              var1_int = 1;
            }
            if (bk.field_f != 13) {
              continue;
            }
            var2 = 1;
          }
          if (param0 != 5) {
            stackIn_9_0 = 65;
            return stackIn_9_0;
          }
          pr.field_b.a(rc.b((byte) -113, ln.field_c, lq.field_a), rc.b((byte) -105, ic.field_b, cf.field_g), -24702);
          if (pr.field_b.e((byte) 83)) {
            var1_int = 1;
          }
          var3 = 0;
          if (var1_int != 0 &&
            pr.field_b.field_g >= 0) {
            var3 = rm.field_g[pr.field_b.field_g];
            if (var3 == 2 ||
              5 == var3) {
              ld.a(param0 + 14178);
            }
          } else {
            if (var2 != 0 &&
              2 != ol.field_c) {
              ld.a(14183);
            }
          }
          if (var3 == 0 &&
            ol.field_c == 2) {
            var4 = kh.a(param0 ^ -64) - rb.field_e;
            var6 = (int)((-var4 + 10999L) / 1000L);
            if (var6 <= 0) {
              nk.a((byte) -119, 5, true);
              var3 = 2;
            }
          }
          stackIn_29_0 = var3;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1), "oj.B(" + param0 + ')');
        }
    }

    final void a(boolean param0, boolean param1) {
        this.field_b.a(ru.field_a, true, bd.field_C);
        if (param0) {
          this.a(false);
        }
    }

    final static void a(String param0, java.awt.Color param1, int param2, int param3, boolean param4) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        try {
          try {
            var9 = ci.field_f.getGraphics();
            if (null == aq.field_b) {
              aq.field_b = new java.awt.Font("Helvetica", 1, 13);
            }
            if (param4) {
              var9.setColor(java.awt.Color.black);
              var9.fillRect(0, 0, td.field_b, ps.field_h);
            }
            if (param1 == null) {
              param1 = new java.awt.Color(140, 17, 17);
            }
            if (param2 != 140) {
              return;
            }
            try {
              if (null == qn.field_d) {
                qn.field_d = ci.field_f.createImage(304, 34);
              }
              var10 = qn.field_d.getGraphics();
              var10.setColor(param1);
              var10.drawRect(0, 0, 303, 33);
              var10.fillRect(2, 2, 3 * param3, 30);
              var10.setColor(java.awt.Color.black);
              var10.drawRect(1, 1, 301, 31);
              var10.fillRect(2 + 3 * param3, 2, 300 - 3 * param3, 30);
              var10.setFont(aq.field_b);
              var10.setColor(java.awt.Color.white);
              var10.drawString(param0, (304 - param0.length() * 6) / 2, 22);
              var9.drawImage(qn.field_d, td.field_b / 2 - 152, -18 + ps.field_h / 2, (java.awt.image.ImageObserver) null);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Exception) (Object) decompiledCaughtException;
              var7 = td.field_b / 2 - 152;
              var8 = ps.field_h / 2 - 18;
              var9.setColor(param1);
              var9.drawRect(var7, var8, 303, 33);
              var9.fillRect(var7 + 2, 2 + var8, param3 * 3, 30);
              var9.setColor(java.awt.Color.black);
              var9.drawRect(var7 + 1, var8 + 1, 301, 31);
              var9.fillRect(2 + (var7 + 3 * param3), var8 + 2, -(param3 * 3) + 300, 30);
              var9.setFont(aq.field_b);
              var9.setColor(java.awt.Color.white);
              var9.drawString(param0, (304 - 6 * param0.length()) / 2 + var7, 22 + var8);
            }
            if (qh.field_b != null) {
              var9.setFont(aq.field_b);
              var9.setColor(java.awt.Color.white);
              var9.drawString(qh.field_b, td.field_b / 2 - 6 * qh.field_b.length() / 2, ps.field_h / 2 - 26);
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5 = (Exception) (Object) decompiledCaughtException;
            ci.field_f.repaint();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_24_0 = var5_ref;
          stackIn_24_1 = new StringBuilder().append("oj.C(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(boolean param0) {
        int var3 = AceOfSkies.field_G ? 1 : 0;
        if (!this.field_f) {
          this.field_b.a(dl.field_p, 0, 0);
        } else {
          this.field_b.a(1, (byte) 45);
          this.field_b.a((jj) null, -9135);
          this.field_b.a(b.field_b, false);
          this.field_b.f(-21041);
          if (this.field_i) {
            this.field_b.a(ru.field_a, true, ru.field_a);
            this.field_b.a((byte) 118, 0, dl.field_p);
            this.field_b.a(dl.field_p, 0, 0);
          } else {
            this.field_b.a(ru.field_a, param0, ru.field_a);
            this.field_b.a((byte) 121, 0, dl.field_p);
            this.field_b.a(2, (byte) 26);
            this.field_b.a(ru.field_a, true, ru.field_a);
            this.field_b.a((byte) 122, 0, dl.field_p);
            this.field_b.a((byte) 121, 1, un.field_i);
            this.field_b.a(dl.field_p, 0, 0);
            this.field_b.a((jj) null, -9135);
          }
          this.field_b.a(0, (byte) 103);
          this.field_f = false;
        }
        this.field_b.a(ru.field_a, param0, ru.field_a);
    }

    final void a(int param0, int param1, int param2) {
        if (param0 != 1786747298) {
          oj.f(-93);
        }
        if (this.field_f) {
          this.field_b.a(1, (byte) 101);
          this.field_b.a(this.field_h[param1 - 1], -9135);
          this.field_b.a(0, (byte) 104);
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        java.awt.Color var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          jr.field_u = true;
          var2 = "tuhstatbut";
          var3 = "rvnadlm";
          var4 = -1L;
          jt.a(var2, var3, var4, param1, 0);
          if (param0 != 26099) {
            var6 = (java.awt.Color) null;
            oj.a((String) null, (java.awt.Color) null, -128, 49, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_5_0 = var2_ref;
          stackIn_5_1 = new StringBuilder().append("oj.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final boolean e(int param0) {
        if (param0 != 3) {
          this.a(true, (byte) -77);
        }
        return true;
    }

    static {
        field_g = 0;
    }
}
