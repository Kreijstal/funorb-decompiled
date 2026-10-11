/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj extends hg {
    private int field_p;
    private int[] field_D;
    int field_C;
    private int field_s;
    private boolean field_n;
    private hl field_u;
    private int field_v;
    static String field_G;
    int field_E;
    private int field_j;
    static ui[] field_y;
    int field_t;
    static String field_k;
    String[] field_g;
    private boolean field_q;
    boolean field_l;
    private ed[] field_z;
    private hl field_A;
    private String[] field_x;
    private boolean field_H;
    int field_B;
    private int field_F;
    boolean field_m;
    private wc field_w;
    private int field_I;
    private String field_r;
    private String[] field_h;
    private int field_o;
    private String[] field_i;

    private final int g(int param0) {
        int var2 = 0;
        int var4 = EscapeVector.field_A;
        int var3 = this.a((byte) 67);
        if (this.field_l) {
          var2 = -(var3 / 2) + 626;
        } else {
          if (!this.field_H) {
            var2 = 632 - var3 / 2;
          } else {
            var2 = 162 - var3 / 2;
          }
        }
        if (param0 != 2) {
          tj.a(49, (byte) 53, -18);
        }
        return var2 * 12288 / 640 + 2048;
    }

    final void j(int param0) {
        int var10 = 0;
        int stackIn_5_0;
        int stackIn_5_1;
        int stackIn_5_2;
        int stackIn_5_3;
        int stackIn_6_4 = 0;
        boolean stackIn_8_5;
        int stackIn_8_6;
        boolean stackIn_9_7 = false;
        int stackIn_12_8 = 0;
        int stackIn_14_0 = 0;
        String stackIn_14_1 = null;
        int stackIn_15_2 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0;
        int stackIn_25_1;
        int stackIn_25_2;
        int stackIn_25_3;
        int stackIn_26_4 = 0;
        boolean stackIn_28_5;
        int stackIn_28_6;
        boolean stackIn_29_7 = false;
        int stackIn_32_8 = 0;
        int stackIn_34_0 = 0;
        String stackIn_34_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_38_0;
        int stackIn_38_1;
        int stackIn_38_2;
        int stackIn_38_3;
        int stackIn_39_4 = 0;
        boolean stackIn_41_5;
        int stackIn_41_6;
        boolean stackIn_42_7 = false;
        int stackIn_45_8 = 0;
        int stackIn_47_0 = 0;
        String stackIn_47_1 = null;
        int stackIn_48_2 = 0;
        int stackIn_63_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var11;
        int var12;
        String var13;
        int var14;
        int var15;
        String var16;
        String var17;
        int var8Lifetime1;
        int var8Lifetime2;
        String var13Lifetime1;
        String var13Lifetime2;
        var15 = EscapeVector.field_A;
        this.h(80);
        this.e(401);
        var2 = this.a((byte) 67);
        var3 = 43 - this.field_s;
        if (param0 < 57) {
          return;
        }
        if (!this.field_l) {
          stackIn_19_0 = (!this.field_H) ? 8 : 170;
          var4 = stackIn_19_0;
          stackIn_22_0 = (!this.field_H) ? 470 : 632;
          var5 = stackIn_22_0;
          var6 = 65;
          var7 = 415;
          if (this.field_H) {
            stackIn_38_0 = 0;
            stackIn_38_1 = 409;
            stackIn_38_2 = 382;
            stackIn_38_3 = -var2 + (-8 + var4);
            stackIn_39_4 = (this.field_w.field_h == 0) ? 8421504 : 3170352;
            stackIn_41_5 = true;
            stackIn_41_6 = -8 + var4;
            stackIn_42_7 = (var3 != 0) ? false : true;
            stackIn_45_8 = (0 != this.field_w.field_h) ? 6340704 : 16777215;
            eo.a(stackIn_38_0, stackIn_38_1, stackIn_38_2, stackIn_38_3, stackIn_39_4, stackIn_41_5, stackIn_41_6, stackIn_42_7, stackIn_45_8, var3);
            stackIn_47_0 = 405;
            stackIn_47_1 = this.field_r;
            stackIn_48_2 = (this.field_w.field_h == 0) ? 16777215 : 6340704;
            lb.a(stackIn_47_0, stackIn_47_1, stackIn_48_2, -113, var4 + (-8 - var2 / 2 - var3 * 16));
          } else {
            stackIn_25_0 = 0;
            stackIn_25_1 = 409;
            stackIn_25_2 = 382;
            stackIn_25_3 = 632 - var2;
            stackIn_26_4 = (this.field_w.field_h != 0) ? 3170352 : 8421504;
            stackIn_28_5 = true;
            stackIn_28_6 = 632;
            stackIn_29_7 = (0 != var3) ? false : true;
            stackIn_32_8 = (this.field_w.field_h == 0) ? 16777215 : 6340704;
            eo.a(stackIn_25_0, stackIn_25_1, stackIn_25_2, stackIn_25_3, stackIn_26_4, stackIn_28_5, stackIn_28_6, stackIn_29_7, stackIn_32_8, var3);
            stackIn_34_0 = 405;
            stackIn_34_1 = this.field_r;
            stackIn_35_2 = (this.field_w.field_h != 0) ? 6340704 : 16777215;
            lb.a(stackIn_34_0, stackIn_34_1, stackIn_35_2, -120, 16 * var3 + (632 - var2 / 2));
          }
        } else {
          var7 = 420;
          var6 = 60;
          var4 = 8;
          var5 = 632;
          stackIn_5_0 = 0;
          stackIn_5_1 = 475;
          stackIn_5_2 = 448;
          stackIn_5_3 = -var2 - 6 + var5;
          stackIn_6_4 = (this.field_w.field_h == 0) ? 8421504 : 3170352;
          stackIn_8_5 = true;
          stackIn_8_6 = var5 - 6;
          stackIn_9_7 = (var3 != 0) ? false : true;
          stackIn_12_8 = (this.field_w.field_h == 0) ? 16777215 : 6340704;
          eo.a(stackIn_5_0, stackIn_5_1, stackIn_5_2, stackIn_5_3, stackIn_6_4, stackIn_8_5, stackIn_8_6, stackIn_9_7, stackIn_12_8, var3);
          stackIn_14_0 = 471;
          stackIn_14_1 = this.field_r;
          stackIn_15_2 = (this.field_w.field_h != 0) ? 6340704 : 16777215;
          lb.a(stackIn_14_0, stackIn_14_1, stackIn_15_2, -122, 16 * var3 + (-6 + (var5 - var2 / 2)));
        }
        qi.a(3162160, var5 - 3, 6324320, -1, 3 + var6, -108, 3 + var4, var7 - 3, var3);
        qi.a(5275728, var5, 10551200, 1, var6, 99, var4, var7, var3);
        if (this.field_C > 0) {
          var8 = this.field_B;
          var9 = this.field_j;
          if (this.field_C <= var8) {
            var8--;
            var9 = this.field_x[var8].length();
          }
          for (var10 = 0; var8 >= var10; var10++) {
            var16 = this.field_x[var10];
            var13 = var16;
            var13Lifetime1 = var16;
            var13Lifetime2 = var16;
            if (!this.field_l) {
              stackIn_63_0 = (!this.field_H) ? 478 : 8;
              var11 = stackIn_63_0;
              var12 = 88 + var10 * 20;
            } else {
              var14 = fh.field_g.b(var16);
              var11 = (-var14 + 640) / 2;
              if (var10 == 1 &&
                614 - var2 < var11 + var14) {
                var11 = -var14 + (-12 - var2 + 626);
              }
              var12 = 445 + 20 * var10;
            }
            if (var8 == var10) {
              var17 = var16.substring(0, var9);
              var13Lifetime2 = var17;
              var13Lifetime2 = var17;
              var13Lifetime2 = var17;
              if (0 != (this.field_F & 4)) {
                var13Lifetime2 = var17 + "_";
              }
            }
            fh.field_g.a(var13Lifetime2, var11, var12, 8454016, -1);
            if (var8 == var10) {
              break;
            }
          }
        }
        if (this.field_p >= 30 &&
          this.field_v > 0) {
          var8Lifetime1 = 128;
          if (30 > this.field_v) {
            var8Lifetime1 = this.field_v * var8Lifetime1 / 30;
          }
          em.a(15, 178, 610, 62, 0, var8Lifetime1);
        }
        if (30 <= this.field_p &&
          this.field_v > 50) {
          var8Lifetime2 = 128;
          if (this.field_v < 80) {
            var8Lifetime2 = var8Lifetime2 * (-50 + this.field_v) / 30;
          }
          em.a(15, 240, 610, 62, 0, var8Lifetime2);
        }
        ll.a(244, 182, 8, this.field_v);
    }

    tj(int[] param0, ed[] param1, String[] param2, boolean param3) {
        this(param1, param2, param3);
        int var5_int = 0;
        boolean discarded$2 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          this.field_D = param0;
          this.field_h = new String[this.field_D.length];
          this.field_i = new String[this.field_D.length];
          for (var5_int = 0; var5_int < this.field_D.length; var5_int++) {
            this.field_h[var5_int] = "photos_" + gd.field_R[this.field_D[var5_int]];
            this.field_i[var5_int] = "";
            discarded$2 = this.a((byte) 124, var5_int);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("tj.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    private final int d(int param0) {
        if (param0 != 8192) {
          this.field_w = (wc) null;
        }
        if (this.field_l) {
          return 8192;
        }
        int var2 = this.field_H ? 401 : 239;
        return 12288 * var2 / 640 + 2048;
    }

    private final void k(int param0) {
        if (this.field_v == 80) {
          rk.field_e.a(bm.field_a, 100, 3072 * qm.field_c / 64, 10240);
        }
        if (this.field_v == 30) {
          rk.field_e.a(bm.field_a, 100, qm.field_c * 3072 / 64, 6144);
        }
        this.field_v = this.field_v - 1;
        if (param0 <= 102) {
          field_y = (ui[]) null;
        }
    }

    tj(String param0, String param1, ed[] param2, String[] param3, boolean param4) {
        this(param2, param3, param4);
        int var6_int = 0;
        boolean discarded$2 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          this.field_D = new int[this.field_z.length];
          this.field_h = new String[this.field_z.length];
          this.field_i = new String[this.field_z.length];
          for (var6_int = 0; this.field_D.length > var6_int; var6_int++) {
            this.field_D[var6_int] = var6_int;
            this.field_h[var6_int] = param0;
            this.field_i[var6_int] = param1 + (var6_int + 1);
            discarded$2 = this.a((byte) 126, var6_int);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("tj.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param4).append(')').toString());
        }
    }

    final static int a(int param0, byte param1, int param2) {
        if (param1 < 125) {
          return 20;
        }
        if (0 == param0) {
          return param2;
        }
        if (1 == param0) {
          return param2;
        }
        if (param0 == 2) {
          return dc.a(-7, 100, param2);
        }
        if (param0 == 3) {
          return dc.a(-25, 100, param2);
        }
        return param2;
    }

    public static void a(boolean param0) {
        field_k = null;
        field_G = null;
        if (!param0) {
          tj.a((byte) -30, -21, 96);
        }
        field_y = null;
    }

    private final void a(int param0, String param1) {
        int var4 = 0;
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = EscapeVector.field_A;
        try {
          if (param0 != 43) {
            return;
          }
          stackIn_6_0 = (!this.field_l) ? 154 : 614;
          var3_int = stackIn_6_0;
          this.field_C = fh.field_g.a(param1, new int[]{var3_int}, this.field_x);
          for (var4 = 0; this.field_C > var4; var4++) {
            if (this.field_x[var4].endsWith("<br>")) {
              this.field_x[var4] = this.field_x[var4].substring(0, -4 + this.field_x[var4].length());
            }
          }
          this.field_B = 0;
          this.field_j = 0;
          while (this.field_B < this.field_C) {
            if (0 == this.field_x[this.field_B].length()) {
              this.field_B = this.field_B + 1;
              continue;
            }
            break;
          }
          this.field_I = this.field_B;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_19_0 = runtimeException;
          stackIn_19_1 = new StringBuilder().append("tj.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final void e(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        boolean stackIn_60_1 = false;
        int var2;
        String var3;
        int var4;
        int var5;
        String var6;
        int var7;
        var7 = EscapeVector.field_A;
        this.field_w.a(this.a(-84, sf.field_c, ng.field_ob), (byte) 126, this.a(-97, dh.field_d, bj.field_y));
        if (param0 < 10) {
          return;
        }
        if (this.field_w.field_e) {
          rk.field_e.a(oa.field_w, 100, 1536 * qm.field_c / 64, this.g(2));
        }
        if (qi.field_N != 0) {
          this.i(2048);
          if (da.field_c != null) {
            da.field_c.b(true, 320);
            return;
          }
        } else {
          while (true) {
            if (pn.p(-82)) {
              this.field_w.c((byte) 6);
              if (this.field_w.field_e) {
                rk.field_e.a(oa.field_w, 100, 1536 * qm.field_c / 64, this.g(2));
              }
              if (nk.field_n != 13 &&
                nk.field_n != 84 &&
                nk.field_n != 83 &&
                82 != nk.field_n) {
                continue;
              }
              this.i(2048);
              if (null == da.field_c) {
                break;
              }
              da.field_c.b(false, 320);
              return;
            }
            if (!this.field_n &&
              this.field_v > 0 &&
              80 > this.field_v) {
              this.d((byte) -21);
            }
            if (!this.field_n &&
              43 > this.field_s) {
              if (this.field_s == 0) {
                sj.a(this.d(8192), (byte) 51);
              }
              if (23 == this.field_s) {
                rk.field_e.a(pc.field_a, 100, 3072 * qm.field_c / 64, this.g(2));
              }
              this.field_s = this.field_s + 1;
              if (this.field_s == 43 &&
                this.field_A == null) {
                this.field_A = hl.c(en.field_d, 100, qm.field_c * 768 / 64, this.g((byte) 111));
                this.field_A.h(-1);
                rk.field_e.a(this.field_A);
              }
            }
            if (this.field_n &&
              this.field_s > 0) {
              if (this.field_p > 0) {
                this.f((byte) -105);
              }
              if (!this.field_l ||
                this.field_E >= this.field_g.length) {
                if (this.field_s == 43) {
                  sj.a(this.d(8192), (byte) 51);
                }
                this.field_s = this.field_s - 1;
              }
            }
            if (this.field_n && (0 == this.field_s ||
              this.field_l &&
              this.field_E < this.field_g.length &&
              this.field_p <= 20)) {
              if (this.field_E < this.field_g.length) {
                stackIn_60_1 = !(this.field_H);
                this.field_H = stackIn_60_1;
                this.field_o = this.field_o + 1;
                this.field_n = false;
                if (!this.field_l) {
                  this.a(43, this.field_g[this.field_E]);
                  gi.a((byte) -98);
                }
              } else {
                if (ma.field_a != null) {
                  this.i(2048);
                  return;
                }
                if (this.field_v <= 0) {
                  this.i(2048);
                  return;
                }
                this.k(108);
              }
            }
            if (!this.field_n &&
              43 == this.field_s) {
              if (this.field_q) {
                this.f((byte) -111);
                if (this.field_p == 20) {
                  this.field_o = this.field_o + 1;
                  this.field_q = false;
                }
              } else {
                if (20 > this.field_p) {
                  this.f(100);
                } else {
                  if (this.field_p < 30 &&
                    this.a((byte) 125, this.field_o)) {
                    this.f(100);
                  }
                }
              }
            }
            boolean decompiledFrameRemainder0 = true;
            if (null != this.field_A) {
              this.field_F = this.field_F + 1;
              if (!this.field_n &&
                43 <= this.field_s &&
                this.field_t > 0) {
                fieldTemp$0 = this.field_t - 1;
                this.field_t = this.field_t - 1;
                if (fieldTemp$0 == 0) {
                  if (this.field_C > this.field_B) {
                    var2 = 0;
                    var3 = this.field_x[this.field_B];
                    while (this.field_j < var3.length()) {
                      if (var3.regionMatches(this.field_j, "<photo>", 0, "<photo>".length())) {
                        this.field_j = this.field_j + "<photo>".length();
                        this.field_q = true;
                        continue;
                      }
                      if (var3.regionMatches(this.field_j, "<title>", 0, "<title>".length())) {
                        this.field_j = this.field_j + "<title>".length();
                        this.d((byte) -21);
                        continue;
                      }
                      break;
                    }
                    if (this.field_j >= var3.length()) {
                      this.field_B = this.field_B + 1;
                      this.field_j = 0;
                      this.field_u.e(ie.field_q / 200, 0);
                    } else {
                      fieldTemp$1 = this.field_j;
                      this.field_j = this.field_j + 1;
                      var4 = var3.charAt(fieldTemp$1);
                      if (var4 == 60) {
                        var5 = var3.indexOf('>', this.field_j);
                        var6 = var3.substring(this.field_j, var5);
                        this.field_j = 1 + var5;
                        if (var6.equals("delay")) {
                          var2 = 1;
                          var4 = 32;
                        }
                      }
                      if (var4 == 32) {
                        this.field_u.e(ie.field_q / 200, 0);
                      } else {
                        this.field_u.a(ie.field_q / 200, 3072 * qm.field_c / 64, this.g((byte) 111));
                      }
                    }
                    this.field_t = 2;
                    if (this.field_B == this.field_C) {
                      this.field_t = 100;
                    } else {
                      if ((var2 != 0)) {
                        this.field_t = 50;
                      }
                    }
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    this.field_E = this.field_E + 1;
                    if (this.field_g.length <= this.field_E) {
                      rk.field_e.b(this.field_A);
                      this.field_A = null;
                      this.field_F = 0;
                      if (!this.field_m) {
                        this.field_r = ah.field_i;
                      } else {
                        this.a(43, (String) null);
                        this.field_n = true;
                      }
                    } else {
                      this.field_B = this.field_I;
                      this.field_j = 0;
                      this.field_t = 20;
                      this.field_n = true;
                      if (this.field_l) {
                        this.a(43, this.field_g[this.field_E]);
                      }
                    }
                  }
                }
              }
            }
            if (this.field_A != null) {
              this.field_A.a(ie.field_q / 200, 768 * qm.field_c / 64, this.g((byte) 111));
            }
            de.field_j = true;
            return;
          }
        }
    }

    private final int g(byte param0) {
        int var2;
        int var3;
        int var4;
        int var6;
        int var7;
        String var8;
        int stackIn_12_0 = 0;
        String var9;
        var3 = this.field_B;
        var4 = this.field_j;
        if (param0 != 111) {
          return -60;
        }
        if (this.field_C <= var3) {
          var3--;
          var4 = this.field_x[var3].length();
        }
        var8 = this.field_x[var3];
        if (!this.field_l) {
          stackIn_12_0 = (!this.field_H) ? 478 : 8;
          var2 = stackIn_12_0;
        } else {
          var6 = this.a((byte) 67);
          var7 = fh.field_g.b(var8);
          var2 = (640 - var7) / 2;
          if (1 == var3 &&
            626 - var6 - 12 < var7 + var2) {
            var2 = 626 - (var6 + 12 + var7);
          }
        }
        var9 = var8.substring(0, var4);
        var2 = var2 + (fh.field_g.b(var9) + fh.field_g.a('_') / 2);
        return var2 * 12288 / 640 + 2048;
    }

    private final int a(byte param0) {
        boolean discarded$0 = false;
        int var2 = 40;
        if (param0 != 67) {
          discarded$0 = this.a((byte) 12, 65);
        }
        int var3 = fh.field_g.b(ig.field_c) + 9;
        if (var2 < var3) {
          var2 = var3;
        }
        var3 = 9 + fh.field_g.b(ah.field_i);
        if (var2 < var3) {
          var2 = var3;
        }
        return var2;
    }

    private final void e(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var2 = 0;
        if (param0 != 401) {
          this.field_H = false;
        }
        if (this.field_l) {
          var3 = 320;
          var4 = 67;
          var5 = 240;
          var2 = 15;
        } else {
          var3 = this.field_H ? 401 : 239;
          var5 = 240;
          var4 = 72;
          var2 = !this.field_H ? 15 : 177;
        }
        ed var6 = this.field_z[this.field_D[this.field_o]];
        qj.a(-1276284702, this.field_F, var4, var3, var6, var5, this.field_p, var2);
    }

    private final void h(int param0) {
        int var3 = 0;
        int var4 = 0;
        int discarded$0 = 0;
        ed var2;
        int var5;
        var5 = EscapeVector.field_A;
        if (this.field_v > 0 &&
          uj.field_a != null) {
          var2 = uj.field_a;
          for (var3 = 0; var3 < 480; var3 = var3 + var2.field_z) {
            for (var4 = 0; var4 < 640; var4 = var4 + var2.field_A) {
              var2.b(var4, var3, this.field_v * 256 / 80);
            }
          }
        } else {
          em.d();
        }
        if (param0 != 80) {
          discarded$0 = this.a(-21, -68, -73);
        }
    }

    private final void f(byte param0) {
        hl var2 = null;
        hl var2Lifetime1;
        if (this.field_p == 30) {
          var2 = hl.c(vd.field_g, 100, 3072 * qm.field_c / 64, this.d(8192));
          var2.e();
          rk.field_e.a(var2);
        }
        if (param0 >= -86) {
          this.field_v = -93;
        }
        if (20 == this.field_p) {
          var2Lifetime1 = hl.c(si.field_t, 100, 3072 * qm.field_c / 64, this.d(8192));
          rk.field_e.a(var2Lifetime1);
        }
        this.field_p = this.field_p - 1;
    }

    private final boolean a(byte param0, int param1) {
        if (param0 <= 121) {
          this.i(-101);
        }
        return this.a(this.field_D[param1], 23381, this.field_i[param1], this.field_h[param1]);
    }

    private final void i(int param0) {
        if (this.field_A != null) {
          this.field_A.g(ie.field_q / 200);
        }
        this.field_u.g(ie.field_q / 200);
        vh.a((byte) -22);
        gi.a((byte) -111);
        s.field_E = true;
        bc.field_d = true;
        if (param0 != 2048) {
          tj.a(-3, (byte) -83, 42);
        }
        ik.field_p = true;
    }

    private final void d(byte param0) {
        int discarded$0 = 0;
        if (param0 != -21) {
          discarded$0 = this.a(3, 15, -89);
        }
        if (this.field_v == 0) {
          rk.field_e.a(bm.field_a, 100, qm.field_c * 3072 / 64, 6144);
        }
        if (this.field_v == 50) {
          rk.field_e.a(bm.field_a, 100, qm.field_c * 3072 / 64, 10240);
        }
        this.field_v = this.field_v + 1;
        mm.a(param0 + 25, 4);
    }

    final static void a(byte param0, java.applet.Applet param1, String param2, String param3, long param4) {
        try {
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var6 = null;
          RuntimeException var6_ref = null;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var7Lifetime1;
          String var7Lifetime2;
          String var7Lifetime3;
          String var7Lifetime4;
          try {
            try {
              var8 = param1.getParameter("cookiehost");
              var7 = var8;
              var7Lifetime1 = var8;
              if (param0 <= 59) {
                return;
              }
              var9 = param2 + "=" + param3 + "; version=1; path=/; domain=" + var8;
              var7Lifetime2 = var9;
              var7Lifetime3 = var9;
              if (param4 >= 0L) {
                var7Lifetime4 = var9 + "; Expires=" + bh.a(-100, td.b(128) + param4 * 1000L) + "; Max-Age=" + param4;
              } else {
                var7Lifetime4 = var9 + "; Discard;";
              }
              sd.a((byte) -111, param1, "document.cookie=\"" + var7Lifetime4 + "\"");
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var6_ref;
            stackIn_11_1 = new StringBuilder().append("tj.G(").append(param0).append(',');
            if (param1 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
            if (param2 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
            if (param3 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final boolean a(int param0, int param1, String param2, String param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == this.field_z[param0]) {
            this.field_z[param0] = fe.a(param3, fi.field_j, param2, true);
            if (this.field_z[param0] == null) {
              return false;
            }
            fn.a((byte) 44);
          }
          if (param1 == 23381) {
            return true;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("tj.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final void f(int param0) {
        if (this.field_p == 0) {
          rk.field_e.a(si.field_t, 100, 3072 * qm.field_c / 64, this.d(8192));
        }
        if (this.field_p == 20) {
          rk.field_e.a(vd.field_g, 100, qm.field_c * 3072 / 64, this.d(8192));
        }
        if (param0 != 100) {
          return;
        }
        this.field_p = this.field_p + 1;
    }

    final static int[] a(byte param0, int param1, int param2) {
        int var3 = fc.a(10758, param2);
        int var4 = ul.a(-127, param2);
        int var5 = fc.a(10758, param1);
        int var6 = ul.a(-126, param1);
        int var7 = (int)((long)var3 * (long)var5 >> 16);
        if (param0 != 82) {
          field_k = (String) null;
        }
        int var8 = (int)((long)var6 * (long)var3 >> 16);
        int var9 = (int)((long)var5 * (long)var4 >> 16);
        int var10 = (int)((long)var6 * (long)var4 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    private final int a(int param0, int param1, int param2) {
        int var4;
        int var5;
        var4 = this.a((byte) 67);
        var5 = -104 % ((param0 + 17) / 56);
        if (this.field_l) {
          if (param1 >= 626 - var4 &&
            param1 < 626 &&
            param2 >= 448 &&
            param2 < 475) {
            return 0;
          }
        } else {
          if (!this.field_H) {
            if (param1 >= 632 - var4 &&
              param1 < 632 &&
              382 <= param2 &&
              param2 < 409) {
              return 0;
            }
          } else {
            if (-var4 + 162 <= param1 &&
              param1 < 162 &&
              param2 >= 382 &&
              param2 < 409) {
              return 0;
            }
          }
        }
        return -1;
    }

    private tj(ed[] param0, String[] param1, boolean param2) {
        int stackIn_2_1 = 0;
        int stackIn_3_2 = 0;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        this.field_E = 0;
        this.field_C = 0;
        this.field_j = 0;
        this.field_B = 0;
        this.field_t = 40;
        stackIn_2_1 = 17;
        if (!od.field_k) {
          stackIn_3_2 = 0;
        } else {
          stackIn_3_2 = 10;
        }
        this.field_x = new String[stackIn_2_1 + stackIn_3_2];
        this.field_F = 0;
        this.field_v = 0;
        this.field_m = true;
        this.field_I = 0;
        this.field_r = ig.field_c;
        try {
          gi.a((byte) -103);
          this.field_g = param1;
          stackIn_7_1 = (param2);
          this.field_l = stackIn_7_1;
          this.field_z = param0;
          this.field_u = hl.a(ff.field_i, 100, 0);
          this.field_u.h(-1);
          rk.field_e.a(this.field_u);
          this.field_w = new wc(1);
          this.field_w.a(this.a(-77, dh.field_d, bj.field_y), true, 4767999);
          this.a(43, this.field_g[this.field_E]);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("tj.<init>(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_G = "Friends can be added in multiplayer<nbsp>games";
        field_k = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
