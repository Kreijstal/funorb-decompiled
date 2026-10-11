/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qr extends uda {
    private boolean field_e;
    static int field_g;
    private boolean field_h;
    private hdb[] field_f;

    final void a(int param0, int param1, int param2) {
        if (param2 != 5) {
          return;
        }
        if (this.field_e) {
          this.field_d.g(1, param2 ^ -112);
          this.field_d.a(this.field_f[-1 + param1], -116);
          this.field_d.g(0, -109);
        }
    }

    qr(pf param0) {
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
        this.field_e = false;
        try {
          if (param0.field_vb) {
            stackIn_5_1 = !(param0.field_L >= 3);
            this.field_h = stackIn_5_1;
            stackIn_8_0 = (!this.field_h) ? 127 : 48;
            var2_int = stackIn_8_0;
            var29 = new int[6][4096];
            var27 = new int[6][4096];
            var28 = new int[6][4096];
            var9 = 0;
            for (var14 = 0; var14 < 64; var14++) {
              for (var15 = 0; var15 < 64; var15++) {
                var12 = -1.0f + 2.0f * (float)var14 / 64.0f;
                var11 = -1.0f + 2.0f * (float)var15 / 64.0f;
                var13 = (float)(1.0 / Math.sqrt((double)(var11 * var11 + 1.0f + var12 * var12)));
                var12 = var12 * var13;
                var11 = var11 * var13;
                for (var16 = 0; var16 < 6; var16++) {
                  if (0 != var16) {
                    if (var16 != 1) {
                      if (var16 == 2) {
                        var10 = var12;
                      } else {
                        if (3 != var16) {
                          if (4 == var16) {
                            var10 = var13;
                          } else {
                            var10 = -var13;
                          }
                        } else {
                          var10 = -var12;
                        }
                      }
                    } else {
                      var10 = var11;
                    }
                  } else {
                    var10 = -var11;
                  }
                  if (!(var10 > 0.0f)) {
                    var7 = 0;
                    var8 = 0;
                    var6 = 0;
                  } else {
                    var6 = (int)(Math.pow((double)var10, 96.0) * (double)var2_int);
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
            this.field_f = new hdb[3];
            this.field_f[0] = this.field_d.a(false, -5210, var27, 64);
            this.field_f[1] = this.field_d.a(false, -5210, var28, 64);
            this.field_f[2] = this.field_d.a(false, -5210, var29, 64);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_35_0 = var2;
          stackIn_35_1 = new StringBuilder().append("qr.<init>(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    final void b(int param0, boolean param1) {
        if (param0 != 5) {
          ura var4 = (ura) null;
          this.a((byte) -108, 75, (ura) null);
        }
        this.field_d.a(et.field_c, true, asa.field_a);
    }

    final void a(int param0, boolean param1) {
        int var4;
        oj var5;
        var4 = VoidHunters.field_G;
        if (param0 != 5) {
          return;
        }
        if (null == this.field_f) {
          this.field_d.a(0, (byte) -113, tma.field_q);
        } else {
          if (!param1) {
            this.field_d.a(0, (byte) -113, tma.field_q);
          } else {
            this.field_d.g(1, -51);
            this.field_d.a((byte) -111, tea.field_d);
            var5 = this.field_d.H((byte) 8);
            var5.a((byte) -80, 1024);
            this.field_d.a(wda.field_o, true);
            if (!this.field_h) {
              this.field_d.a(asa.field_a, true, et.field_c);
              this.field_d.a(0, pja.field_l, 7);
              this.field_d.g(2, -51);
              this.field_d.a(et.field_c, true, je.field_c);
              this.field_d.a(0, pja.field_l, param0 ^ 2);
              this.field_d.a(true, param0 ^ -21120, false, pja.field_l, 1);
              this.field_d.a(0, (byte) -86, tma.field_q);
              this.field_d.a(this.field_d.field_Q, param0 - 119);
            } else {
              this.field_d.a(et.field_c, true, je.field_c);
              this.field_d.a(true, param0 - 21120, false, qcb.field_q, 0);
              this.field_d.a(0, (byte) -96, tma.field_q);
            }
            this.field_d.g(0, -100);
            this.field_e = true;
          }
        }
    }

    final void a(byte param0, int param1, ura param2) {
        if (param0 <= 42) {
          return;
        }
        try {
          this.field_d.a(param2, -113);
          this.field_d.h(-124, param1);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "qr.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0) {
        int var3;
        var3 = VoidHunters.field_G;
        if (!this.field_e) {
          this.field_d.a(0, (byte) -99, qcb.field_q);
        } else {
          this.field_d.g(1, -114);
          this.field_d.a((ura) null, -123);
          this.field_d.a((byte) -111, meb.field_d);
          this.field_d.F((byte) 108);
          if (this.field_h) {
            this.field_d.a(asa.field_a, true, asa.field_a);
            this.field_d.a(0, qcb.field_q, 7);
            this.field_d.a(0, (byte) -92, qcb.field_q);
          } else {
            this.field_d.a(asa.field_a, true, asa.field_a);
            this.field_d.a(0, qcb.field_q, 7);
            this.field_d.g(2, -90);
            this.field_d.a(asa.field_a, true, asa.field_a);
            this.field_d.a(0, qcb.field_q, param0 - 2536);
            this.field_d.a(1, pja.field_l, 7);
            this.field_d.a(0, (byte) -105, qcb.field_q);
            this.field_d.a((ura) null, -128);
          }
          this.field_d.g(0, -110);
          this.field_e = false;
        }
        if (param0 != 2543) {
          return;
        }
        this.field_d.a(asa.field_a, true, asa.field_a);
    }

    final boolean a(byte param0) {
        int var2 = -3 / ((34 - param0) / 63);
        return true;
    }

    static {
    }
}
