/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm extends ana {
    static String[] field_C;
    static int field_A;
    private eaa field_v;
    private boolean field_w;
    private int field_D;
    private int field_E;
    private int field_x;
    private oo field_z;
    private int field_y;
    private ad field_B;

    private final void d(int param0) {
        this.field_q.a(-124, this.field_x, this.field_B, this.field_z.field_r);
        this.field_B.b(false);
        this.field_B.field_k = 0;
        this.field_B.field_o = 0;
        this.field_B.field_s.field_s = this.field_z.field_r;
        this.field_B.field_r = param0;
    }

    final static void f(int param0) {
        if (param0 != -21522) {
            vr var2 = (vr) null;
            nm.a((vr) null, (vr) null, -95, (vr) null);
        }
    }

    final static void a(vr param0, vr param1, int param2, vr param3) {
        kv var17 = null;
        ee[] var5 = null;
        ee[][] var6 = null;
        int[][] var19 = null;
        int[][] var16 = null;
        int[][] var7 = null;
        int var9 = 0;
        int var10_int = 0;
        ee[] var14 = null;
        int var12_int = 0;
        kv var10 = null;
        kv var15 = null;
        kv var18 = null;
        kv var12 = null;
        int var8 = 0;
        int var13 = BachelorFridge.field_y;
        try {
            oea.field_s = gw.a("commonui", "frame_top", param1, -107);
            jw.field_v = gw.a("commonui", "frame_bottom", param1, -84);
            gt.field_s = hca.a("commonui", param1, -59, "jagex_logo_grey");
            sl.field_k = gw.a("commonui", "button", param1, -61);
            fr.field_q = pi.a(param1, -8845, "commonui", "validation");
            oc.field_l = (po) ((Object) rc.a(param3, (byte) 113, param1, "arezzo12", "commonui"));
            jca.field_a = (po) ((Object) rc.a(param3, (byte) 113, param1, "arezzo14", "commonui"));
            qia.field_a = (po) ((Object) rc.a(param3, (byte) 113, param1, "arezzo14bold", "commonui"));
            var17 = new kv(param0.a((byte) 123, "", "button.gif"), (java.awt.Component) ((Object) dca.field_y));
            ch.a(param1, -1, "commonui", "dropdown");
            var5 = bla.a(29611, "commonui", "screen_options", param1);
            sh.field_G = new ee[4];
            sb.field_l = new ee[4];
            nea.field_Bb = new ee[4];
            var6 = new ee[][]{sb.field_l, nea.field_Bb, sh.field_G};
            var19 = new int[4][];
            var16 = var19;
            var7 = var16;
            var7[0] = var5[0].field_h;
            for (var8 = 1; var8 < var19.length; var8++) {
                var7[var8] = (int[]) ((Object) var19[0].clone());
            }
            var8 = var5[0].field_g[0];
            var19[2][var8] = 16777215;
            var19[1][var8] = 2394342;
            var19[3][var8] = 4767999;
            var9 = -29 % ((param2 - 6) / 43);
            for (var10_int = 0; 3 > var10_int; var10_int++) {
                var14 = var6[var10_int];
                ee[] var11 = var14;
                for (var12_int = 0; var12_int < var14.length; var12_int++) {
                    var14[var12_int] = hea.a(var5[var10_int], var19[var12_int], (byte) 117);
                }
            }
            var9 = var17.field_p;
            uc.d(39);
            var17.b();
            dg.i(0, 0, dg.field_i, dg.field_c);
            var10 = new kv(var9, var9);
            var10.b();
            var17.c(0, 0);
            var15 = new kv(var9, var9);
            var18 = var15;
            var18.b();
            var17.c(var9 + -var17.field_q, 0);
            var12 = new kv(-(2 * var9) + var17.field_q, var9);
            var12.b();
            var17.c(-var9, 0);
            db.b(103);
            sl.field_k = new kv[]{var10, var12, var15};
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "nm.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean c(byte param0) {
        int fieldTemp$0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        at var7;
        var6 = BachelorFridge.field_y;
        if (!this.field_m.a((byte) -106)) {
          var7 = (at) ((Object) this.field_v.b((byte) 90));
          L0: while (true) {
            if (var7 == null) {
              fieldTemp$0 = this.field_l - 1;
              this.field_l = this.field_l - 1;
              if ((fieldTemp$0 ^ -1) <= -1) {
                L1: {
                  this.field_q.field_s.a(this.field_B, 97);
                  var4 = 74 / ((param0 - 71) / 47);
                  var3 = this.field_D * this.field_x - this.field_l;
                  if (0 <= var3) {
                    break L1;
                  } else {
                    var3 = 0;
                    break L1;
                  }
                }
                L2: {
                  if (var3 % this.field_D == this.field_D >> 379666625) {
                    L3: {
                      if (this.field_w) {
                        break L3;
                      } else {
                        this.field_w = true;
                        jja.a(256, -1, 56);
                        break L3;
                      }
                    }
                    var5 = var3 / this.field_D + 1;
                    this.a(var5, 41);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                this.field_B.field_r = var3 * this.field_y / this.field_D;
                this.field_B.field_o = var3 * this.field_E / this.field_D;
                return false;
              } else {
                if (this.field_v.e(12917)) {
                  this.d(0);
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              L4: {
                if (!var7.b(21807)) {
                  break L4;
                } else {
                  var7.a(false);
                  break L4;
                }
              }
              var7 = (at) ((Object) this.field_v.c(0));
              continue L0;
            }
          }
        } else {
          return false;
        }
    }

    private final void a(int param0, int param1, int param2) {
        ad var4 = null;
        if ((param2 ^ -1) <= param0 && param2 < this.field_q.field_h.field_z && (param1 ^ -1) <= -1 && param1 < this.field_q.field_h.field_B) {
            var4 = this.field_q.a(param1, false, param2);
            if (!(var4 == null)) {
                this.field_v.a(new mg(var4), true);
            }
        }
        this.a(param2, param1, this.field_B, 0);
    }

    public static void e(int param0) {
        field_C = null;
        if (param0 != 25280) {
            field_C = (String[]) null;
        }
    }

    private final void a(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        L0: {
          L1: {
            var6 = BachelorFridge.field_y;
            var3 = this.field_B.field_s.field_x;
            var4 = this.field_B.field_s.field_J;
            var5 = -18 % ((param1 - -29) / 34);
            if ((this.field_z.field_r ^ -1) == -3) {
              break L1;
            } else {
              if (-5 == (this.field_z.field_r ^ -1)) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          L2: {
            if (2 != this.field_z.field_r) {
              var3 = var3 + param0;
              break L2;
            } else {
              var3 = var3 - param0;
              break L2;
            }
          }
          this.a(-1, var4, var3);
          this.a(-1, var4 - 1, var3);
          this.a(-1, var4 - -1, var3);
          break L0;
        }
        L3: {
          L4: {
            if ((this.field_z.field_r ^ -1) == -2) {
              break L4;
            } else {
              if (-4 != (this.field_z.field_r ^ -1)) {
                break L3;
              } else {
                break L4;
              }
            }
          }
          L5: {
            if (this.field_z.field_r == 1) {
              var4 = var4 - param0;
              break L5;
            } else {
              var4 = var4 + param0;
              break L5;
            }
          }
          this.a(-1, var4, var3);
          this.a(-1, var4, var3 - 1);
          this.a(-1, var4, 1 + var3);
          break L3;
        }
    }

    nm(gj param0, oo param1) {
        super(param0, param1);
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        this.field_w = false;
        this.field_D = 8;
        try {
          L0: {
            L1: {
              this.field_z = param1;
              this.field_B = this.field_z.field_l.a(-27449, this.field_q);
              this.field_B.b(-1, 3);
              this.field_y = 0;
              this.field_E = 0;
              if (-3 != (this.field_z.field_r ^ -1)) {
                if (1 == this.field_z.field_r) {
                  this.field_y = -65536;
                  break L1;
                } else {
                  if ((this.field_z.field_r ^ -1) != -5) {
                    if (this.field_z.field_r != 3) {
                      break L1;
                    } else {
                      this.field_y = 65536;
                      break L1;
                    }
                  } else {
                    this.field_E = 65536;
                    break L1;
                  }
                }
              } else {
                this.field_E = -65536;
                break L1;
              }
            }
            this.field_x = this.field_z.b(this.field_q.field_h, -1);
            this.field_l = this.field_l + this.field_x * this.field_D;
            this.field_v = new eaa();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("nm.<init>(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
        }
    }

    static {
        field_C = new String[]{"Meaty", "Dairy", "Sugary", "Bready", "Spooky", "Bouncy", "Fizzy", "Fishy", "Spicy", "Savoury"};
        field_A = 0;
    }
}
