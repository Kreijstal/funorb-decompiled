/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re {
    private int field_i;
    static int[] field_c;
    private int field_b;
    private int field_e;
    static String field_h;
    private int field_g;
    private int field_a;
    private Main field_d;
    private lh field_f;

    final void a(byte param0) {
        int var2;
        int var3;
        var3 = Main.field_T;
        this.field_b = this.field_b + 1;
        if (param0 > -101) {
          this.field_i = -116;
        }
        if (this.field_i == 2 &&
          this.field_b >= 150) {
          this.a(false, (byte) 122, true, 0);
        }
        while (true) {
          if (!ge.b((byte) -114)) {
            this.field_f.a(this.a((byte) -22, ij.field_e, eg.field_b), (byte) 115, this.a((byte) -22, jc.field_N, ag.field_a));
            if (this.field_f.field_k != -1) {
              this.a(true, (byte) 122, this.field_f.c(-1), this.field_f.field_k);
            }
            if (dl.field_h != 0) {
              this.field_a = ag.field_a;
              this.field_e = jc.field_N;
            }
            return;
          }
          if (tb.field_d != 13) {
            if (fh.field_G[this.field_i].length == 1 &&
              tb.field_d == 84) {
              this.a(false, (byte) 122, true, 0);
              continue;
            }
            this.a(true);
            if (this.field_f.field_k == -1) {
              continue;
            }
            this.a(false, (byte) 121, this.field_f.c(-1), this.field_f.field_k);
            continue;
          }
          if (this.field_i == 1) {
            this.a(false, (byte) 119, true, 0);
            continue;
          }
          var2 = 0;
          while (var2 < fh.field_G[this.field_i].length) {
            if (fh.field_G[this.field_i][var2] == 17) {
              this.a(false, (byte) 119, true, var2);
              break;
            }
            var2++;
          }
        }
    }

    private final int b(int param0, byte param1) {
        if (this.field_i == 2) {
          return 480;
        }
        if (param1 != 17) {
          re.a(3);
        }
        return ia.field_c[fh.field_G[this.field_i][param0]].field_o;
    }

    final static void a(int param0, int param1, int param2, byte param3, kc param4) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        kc var11 = null;
        int var8Lifetime1;
        int var8Lifetime2;
        try {
          param1 = param1 + param4.field_q;
          param2 = param2 + param4.field_n;
          var5_int = 0;
          var6 = param4.field_o;
          var7 = param4.field_p;
          if (vj.field_h > param2) {
            var8 = -param2 + vj.field_h;
            param2 = vj.field_h;
            var6 = var6 - var8;
            var5_int = var5_int + var7 * var8;
          }
          if (param1 < vj.field_f) {
            var8Lifetime1 = vj.field_f - param1;
            param1 = vj.field_f;
            var5_int = var5_int + var8Lifetime1;
            var7 = var7 - var8Lifetime1;
          }
          if (vj.field_b < var6 + param2) {
            var6 = vj.field_b - param2;
          }
          if (param1 + var7 > vj.field_a) {
            var7 = vj.field_a - param1;
          }
          var8Lifetime2 = param2 * vj.field_l + param1;
          var9 = param4.field_p - var7;
          if (param3 < 46) {
            var11 = (kc) null;
            re.a(-101, 85, 79, (byte) -16, (kc) null);
          }
          var10 = vj.field_l - var7;
          if (var7 > 0 &&
            var6 > 0) {
            hf.a(var9, var6, param0, 0, param4.field_r, var5_int, var8Lifetime2, var10, var7, vj.field_j, 125);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("re.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    private final void d(int param0) {
        String var2;
        uh var3;
        int var4;
        String[][] var5;
        int[][] var6;
        int var7;
        int var8;
        int var9;
        int var10;
        Object var11;
        String var11_ref;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int[][] var17;
        String var18;
        int[][] var19;
        int[][] var19Lifetime1;
        var16 = Main.field_T;
        if (dl.d(0)) {
          var2 = j.field_F + "<br><br>" + ag.field_g;
        } else {
          if (null == this.field_d.field_cb) {
            this.field_d.field_cb = il.a(8, 3, 25404, fb.field_c[this.field_d.field_C], 1);
          }
          var3 = this.field_d.field_cb;
          if (!var3.field_o) {
            var2 = tj.field_H;
          } else {
            L2: {
              var4 = this.field_d.field_D;
              var5 = var3.field_m;
              var19 = var3.field_q;
              var17 = var19;
              var6 = var17;
              if (var5 == null) {
                var2 = t.field_f;
              } else {
                if (0 <= var4 &&
                  var4 < var5.length) {
                  if ((null == var5[var4])) {
                    var2 = t.field_f;
                  }
                  break L2;
                }
                var2 = t.field_f;
              }
            }
            L4: {
              if (var6 != null) {
                var19Lifetime1 = var17;
                if (var4 >= 0 &&
                  var4 < var19Lifetime1.length) {
                  if (null == var19Lifetime1[var4]) {
                    var2 = t.field_f;
                  } else {
                    var2 = j.field_F;
                    var7 = wh.a(var3, var4, -122, this.field_d.field_P);
                    var8 = 115;
                    var9 = eb.field_c.field_J[0][2];
                    eb.field_c.field_J[0][2] = 16777215;
                    var10 = 0;
                    L7: while (true) {
                      if (8 >= var10) {
                        L8: {
                          var11 = null;
                          if (var10 == 8) {
                            if (var7 != -1) {
                              break L7;
                            }
                            var11_ref = ri.field_c;
                            var13 = ai.field_m;
                            var7 = var10;
                            if (var13 == 0) {
                              break L7;
                            }
                            var14 = dg.field_J;
                          } else {
                            if (var5[var4].length <= var10) {
                              var8 = var8 + (qa.field_b.field_x + qa.field_b.field_s);
                              break L8;
                            }
                            if (var10 >= var19Lifetime1[var4].length) {
                              var8 = var8 + (qa.field_b.field_s + qa.field_b.field_x);
                              break L8;
                            }
                            var11_ref = var5[var4][var10];
                            if (var11_ref == null) {
                              var8 = var8 + (qa.field_b.field_s + qa.field_b.field_x);
                              break L8;
                            }
                            var14 = 255 & var19Lifetime1[var4][var10];
                            var13 = var19Lifetime1[var4][var10] >> 8;
                          }
                          if (var10 != var7) {
                            var12 = 1884;
                          } else {
                            var12 = 1782271;
                          }
                          eb.field_c.field_J[0][1] = var12;
                          if (8 != var10) {
                            eb.field_c.c(var10 + 1 + ". ", 231, var8, 0, -1);
                          }
                          if (var11_ref != null) {
                            var15 = qa.field_b.a('W') * 12;
                            var18 = ee.a(qa.field_b, var11_ref, var15);
                            eb.field_c.b(var18, 231, var8, 0, -1);
                          }
                          eb.field_c.c(Integer.toString(var13), 560, var8, 0, -1);
                          var2 = "";
                          eb.field_c.c(Integer.toString(var14), 479, var8, 0, -1);
                          var8 = var8 + (qa.field_b.field_s + qa.field_b.field_x);
                        }
                        var10++;
                        continue;
                      }
                      break;
                    }
                    eb.field_c.field_J[0][2] = var9;
                  }
                  break L4;
                }
                var2 = t.field_f;
              } else {
                var2 = t.field_f;
              }
            }
            eb.field_c.field_J[0][1] = 6697779;
            eb.field_c.field_J[0][2] = 16777215;
            eb.field_c.a(ij.field_d, 211, 106 + 9 * (qa.field_b.field_s + qa.field_b.field_x), 389, 8 * qa.field_b.field_s, 0, -1, 1, 0, qa.field_b.field_s + qa.field_b.field_x);
            eb.field_c.field_J[0][2] = 1;
          }
        }
        eb.field_c.field_J[0][2] = 16777215;
        eb.field_c.field_J[0][1] = 6697779;
        if (param0 < 82) {
          this.a(-8, -35, -46);
        }
        eb.field_c.a(var2, 211, 166, 389, qa.field_b.field_s * 8, 0, -1, 1, 1, qa.field_b.field_s + qa.field_b.field_x);
        eb.field_c.field_J[0][2] = 1;
    }

    private final int a(byte param0, int param1, int param2) {
        int discarded$1 = 0;
        int var4 = 0;
        int var5;
        kc var6;
        int var7;
        var7 = Main.field_T;
        if (param0 != -22) {
          discarded$1 = this.a((byte) 37, -63, 74);
        }
        for (var4 = 0; fh.field_G[this.field_i].length > var4; var4++) {
          var5 = this.b(var4, 9996);
          var6 = ia.field_c[fh.field_G[this.field_i][var4]];
          if (this.a(var4, (byte) -33) + var6.field_q <= param2 &&
            param2 < this.a(param0 - 24111, var4) &&
            param1 >= var5 &&
            this.b(var4, (byte) 17) + var5 > param1) {
            return var4;
          }
        }
        return -1;
    }

    final static String a(String param0, String[] param1, byte param2) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        int stackIn_19_0 = 0;
        String stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var5Lifetime1;
        int var8Lifetime1;
        var11 = Main.field_T;
        try {
          var3_int = param0.length();
          if (param2 != -50) {
            field_h = (String) null;
          }
          var4 = var3_int;
          var5 = 0;
          while (true) {
            var6_int = param0.indexOf("<%", var5);
            if (0 <= var6_int) {
              for (var5 = 2 + var6_int; var3_int > var5; var5++) {
                if (Main.a(-49, param0.charAt(var5))) {
                  continue;
                }
                break;
              }
              var7_ref_String = param0.substring(var6_int + 2, var5);
              if (!pg.a(false, (CharSequence) ((Object) var7_ref_String))) {
                continue;
              }
              if (var3_int <= var5) {
                continue;
              }
              if (param0.charAt(var5) != 62) {
                continue;
              }
              var5++;
              var8 = ie.a(false, (CharSequence) ((Object) var7_ref_String));
              var4 = var4 + (param1[var8].length() + var6_int - var5);
              continue;
            }
            break;
          }
          var6 = new StringBuilder(var4);
          var7 = 0;
          var5Lifetime1 = 0;
          while (true) {
            var8Lifetime1 = param0.indexOf("<%", var5Lifetime1);
            if (var8Lifetime1 < 0) {
              discarded$2 = var6.append(param0.substring(var7));
              stackIn_28_0 = var6.toString();
              return stackIn_28_0;
            }
            stackIn_19_0 = 2 + var8Lifetime1;
            for (var5Lifetime1 = stackIn_19_0; var3_int > var5Lifetime1; var5Lifetime1++) {
              if (Main.a(-49, param0.charAt(var5Lifetime1))) {
                continue;
              }
              break;
            }
            var9 = param0.substring(2 + var8Lifetime1, var5Lifetime1);
            if (!pg.a(false, (CharSequence) ((Object) var9))) {
              continue;
            }
            if (var3_int <= var5Lifetime1) {
              continue;
            }
            if (62 != param0.charAt(var5Lifetime1)) {
              continue;
            }
            var5Lifetime1++;
            var10 = ie.a(false, (CharSequence) ((Object) var9));
            discarded$0 = var6.append(param0.substring(var7, var8Lifetime1));
            var7 = var5Lifetime1;
            discarded$1 = var6.append(param1[var10]);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("re.R(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param2).append(')').toString());
        }
    }

    private final int b(int param0, int param1) {
        int var3;
        int var4;
        var4 = Main.field_T;
        if (this.field_i == 2) {
          return 0;
        }
        if (param1 != 9996) {
          this.field_e = 42;
        }
        if (this.field_i != 5) {
          if (this.field_i != 10) {
            var3 = kb.field_b[this.field_i] * param0 + cj.field_l[this.field_i];
          } else {
            var3 = cj.field_l[this.field_i];
          }
        } else {
          if (dl.d(0)) {
            var3 = cj.field_l[this.field_i];
          } else {
            if (param0 >= 3) {
              var3 = cj.field_l[this.field_i] + kb.field_b[this.field_i];
            } else {
              var3 = cj.field_l[this.field_i];
            }
          }
        }
        if (h.field_E[this.field_i]) {
          var3 += 33;
        }
        return var3;
    }

    private final int a(int param0, int param1) {
        if (2 == this.field_i) {
          return 640;
        }
        if (param0 != -24133) {
          field_c = (int[]) null;
        }
        kc var3 = ia.field_c[fh.field_G[this.field_i][param1]];
        return this.a(param1, (byte) 119) + var3.field_q + var3.field_p;
    }

    final static void c(int param0) {
        gh.field_g = false;
        tf.field_p = null;
        gl.field_G = null;
        if (param0 != 3) {
          return;
        }
        da.field_c = null;
        ia.field_d = null;
    }

    public static void a(int param0) {
        field_h = null;
        if (param0 != -4) {
          return;
        }
        field_c = null;
    }

    private final void a(boolean param0) {
        int var3;
        var3 = Main.field_T;
        if (!param0) {
          return;
        }
        if (this.field_i == 5 &&
          !dl.d(0)) {
          if (this.field_f.a((byte) -63)) {
            this.field_f.g(107);
          } else {
            if (tb.field_d == 96) {
              if (this.field_f.field_k > 0) {
                if (this.field_f.field_k != 3) {
                  this.field_f.a(31973, -1 + this.field_f.field_k);
                }
              } else {
                this.field_f.a(31973, 2);
              }
              if (this.field_f.field_k >= 0 &&
                this.field_f.field_k <= 2) {
                this.field_d.field_D = this.field_f.field_k;
              }
            }
            if (tb.field_d == 97) {
              if (this.field_f.field_k < 2) {
                this.field_f.a(31973, 1 + this.field_f.field_k);
              } else {
                if (2 == this.field_f.field_k) {
                  this.field_f.a(31973, 0);
                }
              }
              if (this.field_f.field_k >= 0 &&
                2 >= this.field_f.field_k) {
                this.field_d.field_D = this.field_f.field_k;
              }
            }
            if (tb.field_d == 99) {
              if (this.field_f.field_k >= 0 &&
                2 >= this.field_f.field_k) {
                this.field_f.a(31973, 3);
              } else {
                this.field_f.a(31973, this.field_d.field_D);
              }
              if (0 <= this.field_f.field_k &&
                this.field_f.field_k <= 2) {
                this.field_d.field_D = this.field_f.field_k;
              }
            }
            if (tb.field_d == 98) {
              if (this.field_f.field_k == 3) {
                this.field_f.a(31973, this.field_d.field_D);
              } else {
                this.field_f.a(31973, 3);
              }
              if (this.field_f.field_k >= 0 &&
                this.field_f.field_k <= 2) {
                this.field_d.field_D = this.field_f.field_k;
              }
            }
            this.field_f.g(107);
          }
        } else if (this.field_i != 5 &&
          this.field_i != 10) {
          this.field_f.b((byte) 76);
        } else {
          this.field_f.c((byte) 111);
        }
    }

    final void a(int param0, boolean param1) {
        if (param0 != -31102) {
          this.field_g = -20;
        }
        int var3 = 0;
        if (0 == this.field_i &&
          -1 != this.field_f.field_k) {
          var3 = this.field_f.field_k;
        }
        if (this.field_i == 1 &&
          -1 != this.field_f.field_k &&
          dj.field_a != -1) {
          var3 = this.field_f.field_k;
        }
        this.field_f.a(param0 + 31007, this.a((byte) -22, ij.field_e, eg.field_b), var3, param1);
        this.field_b = 0;
        this.field_g = -1;
    }

    private final void a(boolean param0, byte param1, boolean param2, int param3) {
        Throwable decompiledCaughtException = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var8_ref_Object = null;
        int var9 = 0;
        int var12 = 0;
        var12 = Main.field_T;
        if (param1 < 115) {
          field_h = (String) null;
        }
        var5 = fh.field_G[this.field_i][param3];
        if (param2 &&
          var5 != 3 &&
          4 != var5) {
          rc.a((byte) 111, 15);
        }
        L2: {
          var8 = var5;
          if (var8 != 0) {
            if (7 != var8) {
              if (var8 != 10) {
                L3: {
                  if (var8 == 5) {
                    if (param2) {
                      this.field_d.a(11246, 3, 6, param0);
                    }
                  } else {
                    if (var8 == 6) {
                      if ((param2)) {
                        this.field_d.a(11246, 5, 8, param0);
                      }
                      break L2;
                    }
                    if (21 == var8) {
                      if (param2) {
                        this.field_d.a(11246, 5, 7, param0);
                      }
                    } else {
                      if (var8 != 8) {
                        if (var8 != 15 &&
                          17 != var8) {
                          if (11 == var8) {
                            if ((param2)) {
                              this.field_d.a(11246, 0, 6, param0);
                            }
                          } else {
                            if (var8 == 12) {
                              if ((param2)) {
                                if (null != gj.field_a) {
                                  ga.a(true);
                                }
                                pb.a((byte) -124, mk.g(-119));
                              }
                            } else {
                              if (var8 == 9) {
                                if (!param2) {
                                  break L3;
                                }
                                this.field_d.a(11246, 4, 6, param0);
                              } else {
                                if (var8 != 13 &&
                                  var8 != 16) {
                                  if (var8 == 1) {
                                    if (this.field_f.e(14354)) {
                                      this.field_d.field_cb = null;
                                      this.field_d.field_P = null;
                                      this.field_d.field_C = (1 + this.field_d.field_C) % 2;
                                    }
                                    if (!this.field_f.b(2)) {
                                      break L3;
                                    }
                                    if (this.field_d.field_C == 0) {
                                      this.field_d.field_C = 2;
                                    }
                                    this.field_d.field_cb = null;
                                    this.field_d.field_P = null;
                                    this.field_d.field_C = this.field_d.field_C - 1;
                                  } else {
                                    if (3 == var8) {
                                      var6 = mf.field_i;
                                      if (this.field_f.e(14354)) {
                                        g.a(-114);
                                      }
                                      if (this.field_f.b(2)) {
                                        id.a((byte) 100);
                                      }
                                      if (this.field_f.d((byte) 68)) {
                                        wf.a(0, -124);
                                      }
                                      if (this.field_f.d(-12819)) {
                                        wf.a(80, -122);
                                      }
                                      if (this.field_f.a((byte) -127)) {
                                        var8 = eg.field_b - this.a(param3, (byte) 97) - t.field_i;
                                        if (var8 > 0) {
                                          if (var8 >= 80) {
                                            var9 = 80;
                                          } else {
                                            var9 = var8;
                                          }
                                        } else {
                                          var9 = 0;
                                        }
                                        wf.a(var9, -28);
                                      }
                                      if (mf.field_i == var6) {
                                        var8_ref_Object = bg.field_tb;
                                        synchronized (var8_ref_Object) {
                                          lh.field_d.e(0);
                                        }
                                      } else {
                                        var8_ref_Object = bg.field_tb;
                                        synchronized (var8_ref_Object) {
                                          lh.field_d.e(-1);
                                          if (!lh.field_d.b(66)) {
                                            lh.field_d.h(0);
                                            lh.field_d.g(96);
                                            gh.a(lh.field_d, (byte) -67);
                                          }
                                        }
                                      }
                                    } else {
                                      if (var8 != 4) {
                                        switch (var8) {
                                          case 18:
                                            if (!param2) {
                                              break L3;
                                            }
                                            this.field_d.field_D = 0;
                                            break L2;
                                          case 19:
                                            if (!param2) {
                                              break L3;
                                            }
                                            this.field_d.field_D = 1;
                                            break L2;
                                          case 20:
                                            if (!param2) {
                                              break L2;
                                            }
                                            this.field_d.field_D = 2;
                                            break L2;
                                          default:
                                            break L2;
                                          case 14:
                                            if (!param2) {
                                              break L3;
                                            }
                                            nb.field_e = 0;
                                            db.field_m = 0;
                                            ij.field_h.c(29026);
                                            this.field_d.a(11246, 0, 5, param0);
                                            break L2;
                                        }
                                      }
                                      var7 = fe.field_a;
                                      if (this.field_f.e(14354)) {
                                        if (var7 >= 70) {
                                          var7 = 80;
                                        } else {
                                          var7 += 10;
                                        }
                                      }
                                      if (this.field_f.b(2)) {
                                        if (var7 > 10) {
                                          var7 -= 10;
                                        } else {
                                          var7 = 0;
                                        }
                                      }
                                      if (this.field_f.d((byte) 68)) {
                                        var7 = 0;
                                      }
                                      if (this.field_f.d(-12819)) {
                                        var7 = 80;
                                      }
                                      if (this.field_f.a((byte) -54)) {
                                        var8 = eg.field_b - (this.a(param3, (byte) 69) + t.field_i);
                                        if (var8 > 0) {
                                          var7 = (var8 < 80) ? var8 : 80;
                                        } else {
                                          var7 = 0;
                                        }
                                      }
                                      if (fe.field_a == var7) {
                                        break L3;
                                      }
                                      ag.a(var7, 0);
                                    }
                                  }
                                } else {
                                  if ((param2)) {
                                    if (!dl.d(0)) {
                                      return;
                                    }
                                    if (this.field_i != 4 &&
                                      this.field_i != 5) {
                                      if (this.field_i != 9) {
                                        break L3;
                                      }
                                      this.field_d.a(this.field_i, param0, 10, -112);
                                    } else {
                                      this.field_d.a(this.field_i, param0, this.field_i, -123);
                                    }
                                  }
                                }
                              }
                            }
                          }
                          break L2;
                        }
                        if (param2) {
                          if (this.field_i != 6) {
                            if (10 == this.field_i) {
                              this.field_d.a(11246, 0, 5, param0);
                            } else {
                              if (this.field_i == 5) {
                                this.field_d.a(11246, 0, 5, param0);
                              } else {
                                if (h.field_E[this.field_i]) {
                                  this.field_d.a(11246, this.field_i, 4, param0);
                                } else {
                                  this.field_d.a(11246, rk.field_X, 6, param0);
                                }
                              }
                            }
                            break L2;
                          }
                          if (dl.d(0)) {
                            if (nb.field_e <= 0 &&
                              ai.field_m <= 0) {
                              this.field_d.a(11246, 0, 5, param0);
                            } else {
                              this.field_d.a(11246, 9, 7, param0);
                            }
                            break L2;
                          }
                          if (nb.field_e > 0) {
                            this.field_d.a(11246, 10, 7, param0);
                          } else {
                            if (ai.field_m == 0) {
                              this.field_d.a(11246, 0, 5, param0);
                            } else {
                              this.field_d.a(11246, 5, 7, param0);
                            }
                          }
                        }
                      } else {
                        if (param2) {
                          if (gj.field_a != null) {
                            ga.a(true);
                          } else {
                            var8 = param0 ? 1 : 0;
                            mb.a(qa.field_b.field_s * 3 >> 1, 18, g.field_C, var8 != 0, 9414, 240, tc.field_a, 6, 320, 2, 18, qa.field_b);
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                if (param2) {
                  this.field_d.c(76, 0);
                  if (!dl.d(0)) {
                    if (0 >= nb.field_e) {
                      if (ai.field_m == 0) {
                        this.field_d.a(11246, 0, 6, param0);
                      } else {
                        this.field_d.a(11246, 5, 8, param0);
                      }
                    } else {
                      this.field_d.a(11246, 10, 8, param0);
                    }
                  } else {
                    if (nb.field_e <= 0 &&
                      ai.field_m <= 0) {
                      this.field_d.a(11246, 0, 6, param0);
                    } else {
                      this.field_d.a(11246, 9, 8, param0);
                    }
                  }
                }
              }
            } else {
              if (param2) {
                this.field_d.c(126, 1);
                rk.a(false, lc.field_a[1], false);
                this.field_d.a(11246, 1, 1, param0);
              }
            }
          } else {
            if (param2) {
              this.field_d.l(0);
              this.field_d.a(11246, 0, 1, param0);
            }
          }
        }
    }

    private final void a(int param0, int param1, boolean param2, int param3, int param4) {
        int stackIn_3_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_1 = 0;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        kc var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        var19 = Main.field_T;
        var7 = 62 % ((param4 + 48) / 48);
        var6 = this.b(param1, 9996) + param3;
        var8 = this.a(param1, (byte) 125);
        param1 = fh.field_G[this.field_i][param1];
        stackIn_3_0 = (param2) ? 4086842 : 4405028;
        var9 = stackIn_3_0;
        var10 = 0;
        if (param2) {
          if (k.field_c != 0 &&
            this.field_f.field_h) {
            var10 = 1;
          } else {
            var10 = 2;
          }
        }
        if (18 <= param1 &&
          param1 <= 20 &&
          this.field_d.field_D + 0 == -18 + param1) {
          var9 = 3684698;
          var10 = 1;
        }
        var11 = ia.field_c[this.a((byte) -121, param1) + param1];
        ae.a(var11, var8, var6, var9, 32, param0);
        if (var10 != 0) {
          var12 = var11.field_p;
          var13 = var11.field_o;
          var14 = var11.field_q + var8;
          if (var10 == 1) {
            var18 = 7619584;
            var17 = 12217600;
            var15 = 3548426;
            sd.a(38, var11.field_o, var9, param0, var11.field_p, var8, (byte) -111, 0, 32, var6);
            var16 = 5059597;
          } else {
            var17 = 3548426;
            var16 = 7619584;
            sd.a(38, var11.field_o, var9, param0, var11.field_p, var8, (byte) -122, 16777215, 32, var6);
            var15 = 12217600;
            var18 = 5059597;
          }
          if (var11.field_p == ia.field_c[0].field_p) {
            ae.a(var14, var6, var12, var15, 32, param0);
            ae.a(var14, var6 + 1, var12, var15, 32, param0);
            ae.b(var14, 2 + var6, var13 - 2, var15, 32, param0);
            ae.b(1 + var14, 2 + var6, -2 + var13, var15, 32, param0);
            ae.a(2 + var14, -2 + var6 + var13, var12 - 2, var17, 32, param0);
            ae.a(2 + var14, var13 + var6 - 1, var12 - 2, var17, 32, param0);
            ae.b(-1 + var14 + var12, var6 + 2, -2 + var13, var17, 32, param0);
            ae.b(var14 + (var12 - 2), var6 + 2, -2 + var13, var17, 32, param0);
            ae.a(2 + var14, 2 + var6, var12 - 4, var16, 32, param0);
            ae.a(var14 + 2, 3 + var6, -4 + var12, var16, 32, param0);
            ae.b(2 + var14, var6 + 4, -6 + var13, var16, 32, param0);
            ae.b(3 + var14, var6 + 4, -6 + var13, var16, 32, param0);
            ae.a(4 + var14, var6 - (-var13 + 4), -6 + var12, var18, 32, param0);
            ae.a(4 + var14, -3 + var6 + var13, -6 + var12, var18, 32, param0);
            ae.b(-4 + (var14 + var12), 4 + var6, -8 + var13, var18, 32, param0);
            ae.b(-3 + var14 + var12, var6 + 4, -8 + var13, var18, 32, param0);
          } else {
            ae.a(var14, var6, var12, var15, 32, param0);
            ae.b(var14, var6 + 1, -1 + var13, var15, 32, param0);
            ae.a(1 + var14, var6 + var13 - 1, var12 - 1, var17, 32, param0);
            ae.b(var14 + var12 - 1, var6 + 1, var13 - 1, var17, 32, param0);
            ae.a(var14 + 1, 1 + var6, var12 - 2, var16, 32, param0);
            ae.b(1 + var14, 2 + var6, -3 + var13, var16, 32, param0);
            ae.a(var14 + 2, -2 + (var6 + var13), -3 + var12, var18, 32, param0);
            ae.b(-2 + (var12 + var14), var6 + 2, -4 + var13, var18, 32, param0);
          }
        }
        if (param1 == 4 ||
          param1 == 3) {
          if (param1 == 4) {
            stackIn_27_0 = fe.field_a;
          } else {
            stackIn_27_0 = mf.field_i;
          }
          var12Lifetime1 = stackIn_27_0;
          for (var13Lifetime1 = -3; 3 >= var13Lifetime1; var13Lifetime1++) {
            for (var14Lifetime1 = -3; var14Lifetime1 <= 3; var14Lifetime1++) {
              if (0 > var14Lifetime1) {
                stackIn_34_0 = -var14Lifetime1;
              } else {
                stackIn_34_0 = var14Lifetime1;
              }
              if (0 <= var13Lifetime1) {
                stackIn_37_1 = var13Lifetime1;
              } else {
                stackIn_37_1 = -var13Lifetime1;
              }
              if (stackIn_34_0 + stackIn_37_1 <= 4) {
                ae.a(var13Lifetime1 + var8 + t.field_i, var14Lifetime1 + (16 + var6), 80, 16777215, 32, param0);
                ae.a(t.field_i + var8 + var13Lifetime1, 1 + var6 + (16 + var14Lifetime1), 80, 16777215, 32, param0);
                ae.a(-1 + var8 + t.field_i + (var12Lifetime1 + var13Lifetime1), var14Lifetime1 + 16 + (var6 - 6), 3, 14, 16777215, 32, param0);
              }
            }
          }
          ae.a(t.field_i + var8, var6 + 16, 80, var9, 32, param0);
          ae.a(t.field_i + var8, var6 + 17, 80, var9, 32, param0);
          ae.a(var12Lifetime1 + (-1 + var8) + t.field_i, -6 + (16 + var6), 3, 14, var9, 32, param0);
        }
        if (this.field_i == 0) {
          ae.a(cg.field_i, 9 + var8, 11 + var6, 32, param0);
          ae.a(cg.field_i, var8 + 187, 10 + var6, 32, param0);
        }
    }

    private final int a(byte param0, int param1) {
        int discarded$0 = 0;
        if (param0 > -119) {
          discarded$0 = this.a(-32, (byte) -114);
        }
        int var3 = param1;
        if (1 != var3) {
          return 0;
        }
        return this.field_d.field_C;
    }

    final void b(int param0) {
        int var3 = 0;
        int var2 = 0;
        int var2Lifetime1;
        if (9 == this.field_i) {
          var2 = 200;
          var3 = qa.field_b.field_x + qa.field_b.field_q;
          var2 = var2 + (var3 * qa.field_b.b(d.field_e, 389) + 6);
          var2 = var2 + (qa.field_b.b(dh.$cfr$intArgs$a$feb7e63b59d8(0 != nb.field_e ? true : false, -94, false, ai.field_m != 0 ? true : false), 389) * var3 + 6);
          cj.field_l[this.field_i] = var2 - 33;
          kb.field_b[this.field_i] = this.b(0, (byte) 17) + 12 + qa.field_b.b(mk.a(110, ai.field_m != 0 ? true : false, 0 != nb.field_e ? true : false, false), 389) * var3;
        }
        var2Lifetime1 = -26 / ((param0 - 2) / 51);
    }

    final void a(int param0, int param1, int param2) {
        int var16 = 0;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        Object stackIn_15_0;
        boolean stackIn_15_3;
        int stackIn_57_0 = 0;
        oh stackIn_62_0 = null;
        String stackIn_63_1 = null;
        int stackIn_72_0;
        int stackIn_72_1;
        int stackIn_72_2;
        oh stackIn_72_3;
        boolean stackIn_73_4 = false;
        int stackIn_75_5;
        boolean stackIn_75_6;
        boolean stackIn_76_7 = false;
        int stackIn_78_0;
        int stackIn_78_1;
        oh stackIn_78_2;
        int stackIn_78_3;
        boolean stackIn_79_4 = false;
        boolean stackIn_82_5 = false;
        oh stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        boolean stackIn_84_2 = false;
        boolean stackIn_85_3 = false;
        boolean stackIn_88_4;
        int stackIn_92_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_133_0 = 0;
        int stackIn_135_0 = 0;
        int stackIn_136_1 = 0;
        int stackIn_176_0 = 0;
        int stackIn_178_0 = 0;
        int stackIn_179_1 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int[] var8_ref_int__;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var17;
        int[] var19;
        int[] var22;
        int[][] var26;
        int[] var27;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var13Lifetime2;
        int var14Lifetime1;
        int var14Lifetime2;
        int var4Lifetime1Lifetime1;
        int var7Lifetime2;
        int var9Lifetime2;
        int var8Lifetime1Lifetime1;
        int var8Lifetime1Lifetime2;
        int var8Lifetime1Lifetime3;
        int var9Lifetime1Lifetime1;
        int var10Lifetime1Lifetime1;
        int var11Lifetime1Lifetime1;
        int var10Lifetime1Lifetime2;
        var17 = Main.field_T;
        if (h.field_E[this.field_i]) {
          if (cd.field_h != -1 &&
            cd.field_h != 1) {
            f.field_a.b(0, 0);
          } else {
            this.field_d.b(this.field_b, 2);
          }
          td.field_c[-5 + this.field_i].b(198, 33);
        } else {
          ae.a(d.field_u[this.field_i], 0, param2, 32, param0);
        }
        if (param1 != 0) {
          return;
        }
        if (this.field_i != 2) {
          for (var4 = 0; this.field_f.field_i > var4; var4++) {
            stackIn_14_1 = param0;
            stackIn_14_2 = var4;
            if (this.field_f.field_k != var4) {
              stackIn_15_0 = this;
              stackIn_15_3 = false;
            } else {
              stackIn_15_0 = this;
              stackIn_15_3 = true;
            }
            this.a(stackIn_14_1, stackIn_14_2, stackIn_15_3, param2, param1 - 102);
          }
        }
        L6: {
          if (this.field_i != 5) {
            if (this.field_i != 3) {
              if (4 == this.field_i) {
                var4Lifetime1 = -1;
                var5 = param2 + 121;
                var26 = g.field_y;
                for (var7 = 0; var7 < var26.length; var7++) {
                  var22 = var26[var7];
                  var19 = var22;
                  var8_ref_int__ = var19;
                  var9 = 251 + (320 - 40 * var22.length) / 2;
                  var27 = var8_ref_int__;
                  for (var11 = 0; var27.length > var11; var11++) {
                    var12 = var27[var11];
                    if ((db.field_m & 1 << var12) == 0) {
                      vb.field_k.a(var9, var5);
                    } else {
                      qk.field_a[var12].a(var9, var5);
                    }
                    if (eg.field_b >= var9 &&
                      eg.field_b <= 32 + var9 &&
                      var5 <= ij.field_e &&
                      var5 + 32 >= ij.field_e) {
                      db.field_o.c(-5 + var9, var5 - 5, 0);
                      var4Lifetime1 = var12;
                    }
                    if (this.field_a >= var9 &&
                      var9 + 32 >= this.field_a &&
                      var5 <= this.field_e &&
                      32 + var5 >= this.field_e) {
                      if (this.field_g != var12) {
                        this.field_g = var12;
                      } else {
                        this.field_g = -1;
                      }
                      this.field_a = -1;
                    }
                    if (var12 == this.field_g) {
                      db.field_o.c(var9 - 5, var5 - 5, 16711680);
                    }
                    var9 += 40;
                  }
                  var5 += 40;
                }
                if (this.field_g != -1) {
                  var4Lifetime1 = this.field_g;
                }
                if (var4Lifetime1 != -1) {
                  var6 = qa.field_b.field_s + qa.field_b.field_x;
                  var7Lifetime2 = 226 + param2;
                  qa.field_b.b(ge.field_b[var4Lifetime1], 388, var7Lifetime2, 0, -1);
                  stackIn_57_0 = ((1 << var4Lifetime1 & db.field_m) == 0) ? 0 : 1;
                  var8 = stackIn_57_0;
                  if (var8 == 0) {
                    vb.field_k.d(248, var7Lifetime2 - qa.field_b.field_s);
                  } else {
                    qk.field_a[var4Lifetime1].d(248, var7Lifetime2 - qa.field_b.field_s);
                  }
                  var7Lifetime2 = var7Lifetime2 + var6;
                  stackIn_62_0 = qa.field_b;
                  if (var8 == 0) {
                    stackIn_63_1 = vd.field_n;
                  } else {
                    stackIn_63_1 = pk.field_b;
                  }
                  ((oh) (Object) stackIn_62_0).b(stackIn_63_1, 388, var7Lifetime2, 16711680, -1);
                  var7Lifetime2 = var7Lifetime2 + (5 + var6);
                  var7Lifetime2 = var7Lifetime2 + var6 * qa.field_b.a(lk.field_u[var4Lifetime1], 388, var7Lifetime2 - qa.field_b.field_s, 179, 480, 0, -1, 0, 0, var6);
                  qa.field_b.b(eg.field_a + 100 * eb.field_i[var4Lifetime1], 388, var7Lifetime2, 0, -1);
                  var7Lifetime2 = var7Lifetime2 + var6;
                  var9Lifetime2 = 388;
                  qa.field_b.b(nl.field_a, var9Lifetime2, var7Lifetime2, 0, -1);
                  var9Lifetime2 = var9Lifetime2 + qa.field_b.a(nl.field_a);
                  for (var10 = 0; eb.field_i[var4Lifetime1] > var10; var10++) {
                    sk.field_c.d(var9Lifetime2, -qa.field_b.field_s + var7Lifetime2);
                    var9Lifetime2 = var9Lifetime2 + sk.field_c.field_l / 3;
                  }
                } else {
                  qa.field_b.a(id.field_d, 407, param2 + 226, 0, -1);
                  if (dl.d(0)) {
                    qa.field_b.a(ag.field_g, 248, param2 + (2 * (qa.field_b.field_x + qa.field_b.field_s) + 226), 319, 1024, 0, -1, 1, 0, qa.field_b.field_x + qa.field_b.field_s);
                    break L6;
                  }
                }
                break L6;
              }
              if (this.field_i != 8 &&
                10 != this.field_i) {
                if (9 == this.field_i) {
                  var4Lifetime1Lifetime1 = 200;
                  var5Lifetime1 = qa.field_b.field_q + qa.field_b.field_x;
                  var4Lifetime1Lifetime1 = var4Lifetime1Lifetime1 + (6 + var5Lifetime1 * qa.field_b.a(d.field_e, 211, var4Lifetime1Lifetime1, 389, 1000, 0, -1, 1, 0, var5Lifetime1));
                  stackIn_72_0 = var4Lifetime1Lifetime1;
                  stackIn_72_1 = 6;
                  stackIn_72_2 = var5Lifetime1;
                  stackIn_72_3 = qa.field_b;
                  stackIn_73_4 = (nb.field_e != 0);
                  stackIn_75_5 = -122;
                  stackIn_75_6 = false;
                  stackIn_76_7 = (ai.field_m != 0);
                  var4Lifetime1Lifetime1 = stackIn_72_0 + (stackIn_72_1 + stackIn_72_2 * ((oh) (Object) stackIn_72_3).a(dh.$cfr$intArgs$a$feb7e63b59d8(stackIn_73_4, stackIn_75_5, stackIn_75_6, stackIn_76_7), 211, var4Lifetime1Lifetime1, 389, 1000, 0, -1, 1, 0, var5Lifetime1));
                  var4Lifetime1Lifetime1 = var4Lifetime1Lifetime1 + (this.b(0, (byte) 17) + 6);
                  stackIn_78_0 = var4Lifetime1Lifetime1;
                  stackIn_78_1 = var5Lifetime1;
                  stackIn_78_2 = qa.field_b;
                  stackIn_78_3 = 116;
                  stackIn_79_4 = (0 != ai.field_m);
                  stackIn_82_5 = (0 != nb.field_e);
                  var4Lifetime1Lifetime1 = stackIn_78_0 + (stackIn_78_1 * ((oh) (Object) stackIn_78_2).a(mk.a(stackIn_78_3, stackIn_79_4, stackIn_82_5, false), 211, var4Lifetime1Lifetime1, 389, 1000, 0, -1, 1, 0, var5Lifetime1) + 6);
                  var4Lifetime1Lifetime1 = var4Lifetime1Lifetime1 + (6 + this.b(1, (byte) 17));
                  stackIn_84_0 = qa.field_b;
                  stackIn_84_1 = 43;
                  stackIn_84_2 = false;
                  stackIn_85_3 = (nb.field_e != 0);
                  stackIn_88_4 = (ai.field_m != 0);
                  ((oh) (Object) stackIn_84_0).a(af.a(stackIn_84_1, stackIn_84_2, stackIn_85_3, stackIn_88_4), 211, var4Lifetime1Lifetime1, 389, 1000, 0, -1, 1, 0, var5Lifetime1);
                }
              } else {
                if (this.field_i == 8) {
                  stackIn_92_0 = ue.field_d;
                } else {
                  stackIn_92_0 = nb.field_e;
                }
                var4Lifetime1Lifetime1 = stackIn_92_0;
                stackIn_95_0 = (rd.a(var4Lifetime1Lifetime1, 1266438832) <= 11) ? 0 : 1;
                var5Lifetime1 = stackIn_95_0;
                var6Lifetime1 = 40;
                var7Lifetime1 = rd.a(var4Lifetime1Lifetime1, param1 + 1266438832);
                if (1 < var7Lifetime1) {
                  var8Lifetime1 = -1;
                  var9Lifetime1 = 0;
                  for (var10Lifetime1 = 0; var10Lifetime1 < qk.field_a.length; var10Lifetime1++) {
                    if ((var4Lifetime1Lifetime1 & 1 << var10Lifetime1) != 0 &&
                      var5Lifetime1 != 0) {
                      if (var10Lifetime1 >= 5) {
                        if (var10Lifetime1 < 8) {
                          stackIn_111_0 = 1;
                        } else {
                          stackIn_111_0 = (var10Lifetime1 < 12) ? 2 : 3;
                        }
                      } else {
                        stackIn_111_0 = 0;
                      }
                      var11Lifetime1 = stackIn_111_0;
                      if (var8Lifetime1 != var11Lifetime1) {
                        var9Lifetime1++;
                      }
                      var8Lifetime1 = var11Lifetime1;
                    }
                  }
                  if (var7Lifetime1 > var9Lifetime1) {
                    var10Lifetime1Lifetime2 = (40 - (var9Lifetime1 * 40 - 368)) / (var7Lifetime1 - var9Lifetime1);
                    if (var6Lifetime1 > var10Lifetime1Lifetime2) {
                      var6Lifetime1 = var10Lifetime1Lifetime2;
                    }
                  }
                }
                var8Lifetime1Lifetime1 = 170;
                var9Lifetime1Lifetime1 = 168;
                var10Lifetime1Lifetime1 = -1;
                var11Lifetime1Lifetime1 = -1;
                var12Lifetime1 = -1;
                for (var13 = 0; var13 < qk.field_a.length; var13++) {
                  if (0 != (var4Lifetime1Lifetime1 & 1 << var13)) {
                    if (var5Lifetime1 != 0) {
                      if (var13 >= 5) {
                        if (var13 < 8) {
                          stackIn_133_0 = 1;
                        } else {
                          stackIn_133_0 = (var13 >= 12) ? 3 : 2;
                        }
                      } else {
                        stackIn_133_0 = 0;
                      }
                      var14 = stackIn_133_0;
                      stackIn_135_0 = var8Lifetime1Lifetime1;
                      if (var11Lifetime1Lifetime1 != var14) {
                        stackIn_136_1 = 40;
                      } else {
                        stackIn_136_1 = 20;
                      }
                      var8Lifetime1Lifetime1 = stackIn_135_0 + stackIn_136_1;
                      var11Lifetime1Lifetime1 = var14;
                    } else {
                      var8Lifetime1Lifetime1 = var8Lifetime1Lifetime1 + var6Lifetime1;
                    }
                    if (this.field_a >= var8Lifetime1Lifetime1 &&
                      this.field_a <= var8Lifetime1Lifetime1 + 32 &&
                      var9Lifetime1Lifetime1 <= this.field_e &&
                      var9Lifetime1Lifetime1 + 32 >= this.field_e) {
                      var12Lifetime1 = var13;
                    }
                    if (eg.field_b >= var8Lifetime1Lifetime1 &&
                      eg.field_b <= 32 + var8Lifetime1Lifetime1 &&
                      var9Lifetime1Lifetime1 <= ij.field_e &&
                      ij.field_e <= var9Lifetime1Lifetime1 + 32) {
                      var10Lifetime1Lifetime1 = var13;
                    }
                  }
                }
                if (var12Lifetime1 != -1) {
                  if (var12Lifetime1 == this.field_g) {
                    this.field_g = -1;
                  } else {
                    this.field_g = var12Lifetime1;
                  }
                }
                this.field_a = -1;
                var8Lifetime1Lifetime2 = 170;
                for (var13Lifetime1 = 0; qk.field_a.length > var13Lifetime1; var13Lifetime1++) {
                  if ((1 << var13Lifetime1 & var4Lifetime1Lifetime1) != 0) {
                    if (var5Lifetime1 != 0) {
                      if (var13Lifetime1 >= 5) {
                        if (var13Lifetime1 >= 8) {
                          stackIn_176_0 = (var13Lifetime1 >= 12) ? 3 : 2;
                        } else {
                          stackIn_176_0 = 1;
                        }
                      } else {
                        stackIn_176_0 = 0;
                      }
                      var14Lifetime1 = stackIn_176_0;
                      stackIn_178_0 = var8Lifetime1Lifetime2;
                      if (var14Lifetime1 == var11Lifetime1Lifetime1) {
                        stackIn_179_1 = var6Lifetime1;
                      } else {
                        stackIn_179_1 = 40;
                      }
                      var8Lifetime1Lifetime2 = stackIn_178_0 + stackIn_179_1;
                      var11Lifetime1Lifetime1 = var14Lifetime1;
                    } else {
                      var8Lifetime1Lifetime2 = var8Lifetime1Lifetime2 + var6Lifetime1;
                    }
                    qk.field_a[var13Lifetime1].a(var8Lifetime1Lifetime2, var9Lifetime1Lifetime1);
                    if (this.field_g == var13Lifetime1) {
                      db.field_o.c(-5 + var8Lifetime1Lifetime2, -5 + var9Lifetime1Lifetime1, 16711680);
                    } else {
                      if (var13Lifetime1 == var10Lifetime1Lifetime1) {
                        db.field_o.c(-5 + var8Lifetime1Lifetime2, -5 + var9Lifetime1Lifetime1, 0);
                      }
                    }
                  }
                }
                if (this.field_g != -1) {
                  var10Lifetime1Lifetime1 = this.field_g;
                }
                if (var10Lifetime1Lifetime1 < 0) {
                  qa.field_b.a(id.field_d, 208, 237, td.field_c[this.field_i - 5].field_p - 20, 1024, 0, -1, 1, 0, qa.field_b.field_x + qa.field_b.field_s);
                } else {
                  var13Lifetime2 = qa.field_b.field_s + qa.field_b.field_x;
                  var14Lifetime2 = 239;
                  var15 = 363;
                  qa.field_b.b(ge.field_b[var10Lifetime1Lifetime1], var15, var14Lifetime2, 0, -1);
                  qk.field_a[var10Lifetime1Lifetime1].d(223, -qa.field_b.field_s + var14Lifetime2);
                  var14Lifetime2 = var14Lifetime2 + var13Lifetime2;
                  qa.field_b.b(pk.field_b, var15, var14Lifetime2, 16711680, -1);
                  var14Lifetime2 = var14Lifetime2 + (5 + var13Lifetime2);
                  var14Lifetime2 = var14Lifetime2 + qa.field_b.a(lk.field_u[var10Lifetime1Lifetime1], var15, -qa.field_b.field_s + var14Lifetime2, -var15 + 588, 480, 0, -1, 0, 0, var13Lifetime2) * var13Lifetime2;
                  qa.field_b.b(eg.field_a + 100 * eb.field_i[var10Lifetime1Lifetime1], var15, var14Lifetime2, 0, -1);
                  var8Lifetime1Lifetime3 = var15;
                  var14Lifetime2 = var14Lifetime2 + var13Lifetime2;
                  qa.field_b.b(nl.field_a, var8Lifetime1Lifetime3, var14Lifetime2, 0, -1);
                  var8Lifetime1Lifetime3 = var8Lifetime1Lifetime3 + qa.field_b.a(nl.field_a);
                  for (var16 = 0; var16 < eb.field_i[var10Lifetime1Lifetime1]; var16++) {
                    sk.field_c.d(var8Lifetime1Lifetime3, -qa.field_b.field_s + var14Lifetime2);
                    var8Lifetime1Lifetime3 = var8Lifetime1Lifetime3 + sk.field_c.field_l / 3;
                  }
                }
              }
            } else {
              qa.field_b.a(rc.field_n, 176, param2 + 140, 292, 222, 2753797, -1, 1, 3, 20);
            }
          } else {
            this.d(104);
          }
        }
    }

    private final int a(int param0, byte param1) {
        int var3;
        int var4;
        int var5;
        var5 = Main.field_T;
        if (this.field_i == 2) {
          return 0;
        }
        var4 = -7 % ((param1 - 31) / 37);
        if (this.field_i != 5) {
          if (this.field_i == 10) {
            var3 = param0 * 172 + nk.field_a[this.field_i];
          } else {
            var3 = nk.field_a[this.field_i];
          }
        } else {
          if (!dl.d(0)) {
            if (3 > param0) {
              var3 = nk.field_a[this.field_i] + (-1 + param0) * 136;
            } else {
              var3 = nk.field_a[this.field_i];
            }
          } else {
            var3 = 136 * param0 + (-136 + (68 + nk.field_a[this.field_i]));
          }
        }
        if (h.field_E[this.field_i]) {
          var3 += 198;
        }
        return var3;
    }

    re(Main param0, int param1) {
        this.field_g = -1;
        this.field_a = -1;
        try {
          this.field_d = param0;
          this.field_i = param1;
          this.field_f = new lh(fh.field_G[param1].length);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "re.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(boolean param0, int param1, CharSequence param2) {
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        kc var9 = null;
        var8 = Main.field_T;
        try {
          if (param2 == null) {
            return false;
          }
          var3_int = param2.length();
          if (var3_int >= 1 &&
            var3_int <= 12) {
            var4 = ff.a((byte) 116, param2);
            if (var4 == null) {
              return false;
            }
            if (var4.length() < 1) {
              return false;
            }
            if (!tg.a((byte) -63, var4.charAt(0)) &&
              !tg.a((byte) -63, var4.charAt(var4.length() - 1))) {
              var5 = 0;
              var6 = 0;
              if (param1 > -91) {
                var9 = (kc) null;
                re.a(-38, -4, -9, (byte) -72, (kc) null);
              }
              while (var6 < param2.length()) {
                var7 = param2.charAt(var6);
                if (tg.a((byte) -63, (char) var7)) {
                  var5++;
                } else {
                  var5 = 0;
                }
                if (var5 >= 2 &&
                  !param0) {
                  return false;
                }
                var6++;
              }
              if (var5 <= 0) {
                return true;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_38_0 = var3;
          stackIn_38_1 = new StringBuilder().append("re.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    static {
        field_h = "Enter the name you'd prefer. This is the name displayed to other players.";
    }
}
