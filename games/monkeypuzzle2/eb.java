/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb extends ua implements sh, ql {
    private t field_z;
    static String field_E;
    cm field_H;
    static pj field_C;
    private qc field_G;
    static cc field_A;
    private t field_D;

    public final void a(int param0, int param1, int param2, int param3, t param4) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param3 != 7) {
            return;
          }
          if (this.field_z == param4) {
            je.a(53);
          } else {
            if (param4 == this.field_D) {
              this.b(true);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("eb.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final boolean l(int param0) {
        if (!this.a(0, this.field_G)) {
          return false;
        }
        if (param0 > -34) {
          return false;
        }
        return true;
    }

    private final boolean a(int param0, ag param1) {
        kf var3 = null;
        RuntimeException var3_ref = null;
        na var4 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param1.a(param0 + 7);
          if (var3 == null) {
            return true;
          }
          if (param0 != 0) {
            return false;
          }
          var4 = var3.b(false);
          stackIn_10_0 = (wj.field_i == var4);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("eb.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void a(we param0, int param1, int param2, byte param3) {
        try {
          super.a(param0, param1, param2, (byte) -15);
          if (param3 > -13) {
            we var6 = (we) null;
            this.a((we) null, -102, 77, (byte) -19);
          }
          this.field_D.field_w = this.l(-110);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "eb.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void a(String param0, int param1) {
        qc var3 = null;
        String var4 = null;
        try {
          var3 = this.field_G;
          if (param1 > -50) {
            eb.m(-107);
          }
          var4 = param0;
          ((rj) ((Object) var3)).a(false, -5905, var4);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "eb.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void b(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          ge.a(param0, param4, param3 + 1, 10000536);
          ge.a(param0, param4 + param2, param3 + 1, 12105912);
          if (param1 != 0) {
            field_E = (String) null;
          }
          var5_int = 1;
          if (param4 + var5_int < ge.field_f) {
            var5_int = -param4 + ge.field_f;
          }
          var6 = param2;
          if (var6 + param4 > ge.field_k) {
            var6 = ge.field_k - param4;
          }
          for (var7 = var5_int; var7 < var6; var7++) {
            var8 = 152 + 48 * var7 / param2;
            var9 = var8 | (var8 << 16 | var8 << 8);
            ge.field_i[ge.field_h * (param4 + var7) + param0] = var9;
            ge.field_i[(param4 + var7) * ge.field_h - (-param0 - param3)] = var9;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var5), "eb.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void d(byte param0) {
        int var2 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException decompiledCaughtException = null;
        ki var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var1 = (ki) (ok.field_a.a((byte) -117));
          if (param0 != -93) {
            field_A = (cc) null;
          }
          while (var1 != null) {
            stackIn_5_0 = var1.field_F;
            stackIn_5_1 = 1;
            if (stackIn_5_0 > stackIn_5_1) {
              var1.field_t = hd.field_u;
              for (var2 = 0; var2 < var1.field_m; var2++) {
                var3 = var1.field_o[var2].field_l;
                if (var1.field_l != var3) {
                  stackIn_14_0 = (var1.field_p == var3) ? 1 : 0;
                } else {
                  stackIn_14_0 = 1;
                }
                var4 = stackIn_14_0;
                if (var4 != 0) {
                  for (var5 = var2 + 1; var1.field_m > var5; var5++) {
                    var6 = var1.field_o[var5].field_l;
                    if (~var6 != ~var1.field_l) {
                      stackIn_24_0 = (var6 == var1.field_p) ? 1 : 0;
                    } else {
                      stackIn_24_0 = 1;
                    }
                    var7 = stackIn_24_0;
                    if (var4 != 0) {
                      stackIn_30_0 = (var7 != 0) ? 1 : 0;
                    } else {
                      stackIn_30_0 = 0;
                    }
                    var8 = stackIn_30_0;
                    if (var8 != 0) {
                      var1.field_o[var2].field_t = hd.field_u;
                      var1.field_o[var5].field_t = hd.field_u;
                    }
                  }
                }
              }
            }
            var1 = (ki) (ok.field_a.d((byte) 63));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1_ref), "eb.S(" + param0 + ')');
        }
    }

    public eb() {
        super(0, 0, 496, 0, (ml) null);
        this.field_G = new qc("", (of) null, 12);
        a var1 = new a(pf.field_c, 0, 0, 0, 0, 16777215, -1, 3, 0, t.field_z.field_C, -1, 2147483647, true);
        we var2 = new we(vh.field_K, var1, (of) null);
        this.field_D = new t(wi.field_a, (of) null);
        this.field_z = new t(af.field_b, (of) null);
        this.field_G.field_m = oa.field_E;
        this.field_G.a(new hh(this.field_G), true);
        this.field_D.field_w = false;
        this.field_D.field_h = (ml) ((Object) new hd());
        this.field_z.field_h = (ml) ((Object) new lc());
        this.field_G.field_h = (ml) ((Object) new mg(10000536));
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(50, 13361, 20, 270, var3);
        var3 += 50;
        this.b((byte) -26, var2);
        var3 = var3 + (this.a(wj.field_l, this.field_G, var3, ke.field_e, 35, 170) + 5);
        this.field_D.a(40, 13361, 496 - var5 >> 1, var5, var3);
        this.field_z.a(40, 13361, var4 + 3, 60, 15 + var3);
        this.field_z.field_o = (of) (this);
        this.field_D.field_o = (of) (this);
        this.b((byte) -102, this.field_D);
        this.b((byte) -27, this.field_z);
        this.field_H = new cm((sh) (this));
        this.field_H.a(150, 13361, 60 + (this.field_G.field_l + this.field_G.field_r), -60 + (-this.field_G.field_l + this.field_l) - this.field_G.field_r, 20);
        this.b((byte) -56, this.field_H);
        this.a(var4 + (55 + var3), 13361, 0, 496, 0);
    }

    final static void m(int param0) {
        int var13_int = 0;
        int stackIn_55_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_76_0 = 0;
        RuntimeException decompiledCaughtException = null;
        ki var1 = null;
        int var1_int = 0;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        ki var4 = null;
        int var5_int = 0;
        il var5 = null;
        dl var6 = null;
        dl var7 = null;
        int var8 = 0;
        int var9 = 0;
        ki var10 = null;
        Object var11 = null;
        int var11_int = 0;
        ki var11_ref = null;
        int var12 = 0;
        ki var13 = null;
        ki var14 = null;
        ki var15 = null;
        int var16 = 0;
        Object var17 = null;
        ki var17_ref = null;
        ki var18 = null;
        ki var11_refLifetime1;
        ki var13Lifetime1;
        ki var14Lifetime1;
        ki var15Lifetime1;
        ki var14Lifetime2;
        ki var14Lifetime1Lifetime1;
        int var5_intLifetime1;
        int var5_intLifetime2;
        int var12Lifetime1;
        int var12Lifetime1Lifetime1;
        var17 = null;
        var11 = null;
        var16 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var1 = (ki) (hd.field_u.a((byte) -117));
          while (var1 != null) {
            if (var1.field_t == ok.field_a) {
              var1.c((byte) -94);
              var1.field_D = 0.0f;
              var1.field_v = 0.0f;
              var1.c(-19822);
              var1.a(7847);
              ok.field_a.a(-8212, var1);
            } else {
              if (ri.field_b == var1.field_t) {
                var1.c(-19822);
                var1.a(7847);
                ri.field_b.a(-8212, var1);
              }
            }
            var1.field_t = null;
            var1 = (ki) (hd.field_u.d((byte) 63));
          }
          var1_int = 0;
          var2 = 0;
          if (param0 <= 55) {
            return;
          }
          var3 = 0;
          var4 = (ki) (ok.field_a.a((byte) -117));
          while (null != var4) {
            if (var4.field_t != null) {
              boolean decompiledFrameCompleted8 = true;
              boolean decompiledFrameCompleted7 = true;
              var4.c(-19822);
              var4.a(7847);
              var4.g(120);
              if (var4.field_t == hd.field_u) {
                var1_int = 1;
                if (!var4.field_A) {
                  var3++;
                  var4.field_A = true;
                }
                if (var4.field_w == 0) {
                  var2 = 1;
                }
                if (5 == var4.field_w) {
                  for (var5_int = 0; var4.field_m > var5_int; var5_int++) {
                    if (var4.field_o[var5_int].field_w == 4) {
                      var4.field_o[var5_int].field_t = hd.field_u;
                      lc.field_f = true;
                      if (!var4.field_o[var5_int].field_A) {
                        var4.field_o[var5_int].field_A = true;
                        var3++;
                      }
                    }
                  }
                }
                if (var4.field_w == 4) {
                  for (var5_intLifetime1 = 0; var5_intLifetime1 < var4.field_m; var5_intLifetime1++) {
                    if (1 == var4.field_o[var5_intLifetime1].field_w ||
                      6 == var4.field_o[var5_intLifetime1].field_w) {
                      var4.field_o[var5_intLifetime1].field_t = hd.field_u;
                      lc.field_f = true;
                      if (!var4.field_o[var5_intLifetime1].field_A) {
                        var4.field_o[var5_intLifetime1].field_A = true;
                        var3++;
                      }
                    }
                  }
                }
                var5_intLifetime2 = 0;
                while (true) {
                  if (var5_intLifetime2 >= var4.field_m) {
                    for (var5_intLifetime2 = 0; var4.field_m > var5_intLifetime2; var5_intLifetime2++) {
                      var4.field_o[var5_intLifetime2].a(true, var4);
                    }
                    var5 = (il) (rf.field_a.a((byte) -117));
                    while (var5 != null) {
                      if (var5.field_j == var4 ||
                        var4 == var5.field_i) {
                        var5.c(-19822);
                        aj.field_b.a(-8212, var5);
                      }
                      var5 = (il) (rf.field_a.d((byte) 63));
                    }
                    var4.field_E = true;
                    var4.field_m = 0;
                    hd.field_u.a(-8212, var4);
                    var4.field_v = -1.0f + (float)(2.0 * Math.random());
                    if (0.009999999776482582f > Math.abs(var4.field_v)) {
                      var4.field_v = -1.0f;
                    }
                    var4.field_D = 10.0f;
                    if (var4.field_w != 0) {
                      ua.i(83);
                      decompiledFrameCompleted8 = false;
                      break;
                    }
                    var4.field_n = 1;
                    gb.field_o = gb.field_o - 1;
                    ob.b((byte) -19);
                    decompiledFrameCompleted7 = false;
                    break;
                  }
                  var6 = new dl();
                  var7 = new dl();
                  var6.a(-106, var4.field_o[var5_intLifetime2]);
                  var8 = 1;
                  var9 = 1;
                  while (true) {
                    var17_ref = (ki) (var6.a((byte) -120));
                    if (var17_ref != null) {
                      if (var17_ref.field_q <= var4.field_q) {
                        stackIn_55_0 = (var17_ref.field_w != 4) ? 1 : 0;
                      } else {
                        stackIn_55_0 = 0;
                      }
                      var11_int = stackIn_55_0;
                      if (var17_ref.field_w == 0 &&
                        hd.field_u != var17_ref.field_t) {
                        stackIn_67_0 = 1;
                      } else {
                        if (var17_ref.field_w != 5) {
                          if (4 == var17_ref.field_w) {
                            stackIn_67_0 = (var4.field_w != 5) ? 1 : 0;
                          } else {
                            stackIn_67_0 = 0;
                          }
                        } else {
                          stackIn_67_0 = 1;
                        }
                      }
                      var12 = stackIn_67_0;
                      if (var11_int == 0 &&
                        var12 == 0) {
                        if (1 != var17_ref.field_w &&
                          var17_ref.field_w == 6) {
                        }
                        var7.a(-122, var17_ref);
                        for (var13_int = 0; var13_int < var17_ref.field_m; var13_int++) {
                          boolean decompiledFrameCompleted6 = true;
                          boolean decompiledFrameCompleted5 = true;
                          var18 = var17_ref.field_o[var13_int];
                          if (hd.field_u != var18.field_t) {
                            var15 = (ki) (var7.a(true));
                            while (var15 != null) {
                              if (var18 == var15) {
                                decompiledFrameCompleted6 = false;
                                break;
                              }
                              var15 = (ki) (var7.c((byte) -75));
                            }
                            if (decompiledFrameCompleted6) {
                              var15Lifetime1 = (ki) (var6.a(true));
                              while (var15Lifetime1 != null) {
                                if (var18 == var15Lifetime1) {
                                  decompiledFrameCompleted5 = false;
                                  break;
                                }
                                var15Lifetime1 = (ki) (var6.c((byte) -75));
                              }
                              if (decompiledFrameCompleted5) {
                                var6.a(-122, var18);
                              }
                            }
                          }
                        }
                        continue;
                      }
                      var8 = 0;
                      if (var9 != 0) {
                        stackIn_76_0 = (var12 != 0) ? 0 : 1;
                      } else {
                        stackIn_76_0 = 0;
                      }
                      var9 = stackIn_76_0;
                    }
                    break;
                  }
                  boolean decompiledFrameRemainder0 = true;
                  L40: {
                    boolean decompiledFrameCompleted4 = true;
                    if (var8 != 0) {
                      var10 = (ki) (var7.a((byte) -120));
                      while (var10 != null) {
                        if (!var10.field_A) {
                          var3++;
                          var10.field_A = true;
                        }
                        var10.field_t = hd.field_u;
                        var10 = (ki) (var7.a((byte) -120));
                      }
                      decompiledFrameRemainder0 = (var9 != 0);
                      if (decompiledFrameRemainder0) {
                        var7.c(32);
                        var6.a(-124, var4.field_o[var5_intLifetime2]);
                        var10 = var4.field_o[var5_intLifetime2];
                        while (true) {
                          var11_ref = (ki) (var6.a((byte) -120));
                          if (var11_ref == null) {
                            decompiledFrameCompleted4 = false;
                            break;
                          }
                          var7.a(-119, var11_ref);
                          if (var10.field_q > var11_ref.field_q) {
                            var10 = var11_ref;
                          }
                          var12Lifetime1 = 0;
                          while (var12Lifetime1 < var11_ref.field_m) {
                            boolean decompiledFrameCompleted3 = true;
                            boolean decompiledFrameCompleted2 = true;
                            var13 = var11_ref.field_o[var12Lifetime1];
                            if (null == var13) {
                              gl.a(var11_ref.field_o, var12Lifetime1 + 1, var11_ref.field_o, var12Lifetime1, -var12Lifetime1 + var11_ref.field_m);
                              var12Lifetime1--;
                              var11_ref.field_m = var11_ref.field_m - 1;
                            } else {
                              if (hd.field_u != var13.field_t) {
                                var14 = (ki) (var7.a(true));
                                while (var14 != null) {
                                  if (var14 == var13) {
                                    decompiledFrameCompleted3 = false;
                                    break;
                                  }
                                  var14 = (ki) (var7.c((byte) -75));
                                }
                                if (decompiledFrameCompleted3) {
                                  var14Lifetime2 = (ki) (var6.a(true));
                                  while (var14Lifetime2 != null) {
                                    if (var13 == var14Lifetime2) {
                                      decompiledFrameCompleted2 = false;
                                      break;
                                    }
                                    var14Lifetime2 = (ki) (var6.c((byte) -75));
                                  }
                                  if (decompiledFrameCompleted2) {
                                    var6.a(-107, var13);
                                  }
                                }
                              }
                            }
                            var12Lifetime1++;
                          }
                        }
                      }
                    }
                    if (((decompiledFrameRemainder0) && (decompiledFrameCompleted4)) &&
                      (decompiledFrameRemainder0 = (var9 != 0))) {
                      var7.c(32);
                      var6.a(-124, var4.field_o[var5_intLifetime2]);
                      var10 = var4.field_o[var5_intLifetime2];
                      while (true) {
                        var11_refLifetime1 = (ki) (var6.a((byte) -120));
                        if (var11_refLifetime1 == null) {
                          break;
                        }
                        var7.a(-119, var11_refLifetime1);
                        if (var10.field_q > var11_refLifetime1.field_q) {
                          var10 = var11_refLifetime1;
                        }
                        var12Lifetime1Lifetime1 = 0;
                        if (var12Lifetime1Lifetime1 >= var11_refLifetime1.field_m) {
                          continue;
                        }
                        var13Lifetime1 = var11_refLifetime1.field_o[var12Lifetime1Lifetime1];
                        if (null == var13Lifetime1) {
                          while (true) {
                            gl.a(var11_refLifetime1.field_o, var12Lifetime1Lifetime1 + 1, var11_refLifetime1.field_o, var12Lifetime1Lifetime1, -var12Lifetime1Lifetime1 + var11_refLifetime1.field_m);
                            var12Lifetime1Lifetime1--;
                            var11_refLifetime1.field_m = var11_refLifetime1.field_m - 1;
                            L52: while (true) {
                              var12Lifetime1Lifetime1++;
                              while (var12Lifetime1Lifetime1 >= var11_refLifetime1.field_m) {
                                var11_refLifetime1 = (ki) (var6.a((byte) -120));
                                if (var11_refLifetime1 == null) {
                                  break L40;
                                }
                                var7.a(-119, var11_refLifetime1);
                                if (var10.field_q > var11_refLifetime1.field_q) {
                                  var10 = var11_refLifetime1;
                                }
                                var12Lifetime1Lifetime1 = 0;
                              }
                              var13Lifetime1 = var11_refLifetime1.field_o[var12Lifetime1Lifetime1];
                              if (null == var13Lifetime1) {
                                break;
                              }
                              if (hd.field_u == var13Lifetime1.field_t) {
                                continue;
                              }
                              var14Lifetime1 = (ki) (var7.a(true));
                              while (var14Lifetime1 != null) {
                                if (var14Lifetime1 == var13Lifetime1) {
                                  continue L52;
                                }
                                var14Lifetime1 = (ki) (var7.c((byte) -75));
                              }
                              var14Lifetime1 = (ki) (var6.a(true));
                              while (var14Lifetime1 != null) {
                                if (var13Lifetime1 == var14Lifetime1) {
                                  continue L52;
                                }
                                var14Lifetime1 = (ki) (var6.c((byte) -75));
                              }
                              var6.a(-107, var13Lifetime1);
                            }
                          }
                        }
                        while (true) {
                          boolean decompiledFrameCompleted1 = true;
                          boolean decompiledFrameCompleted0 = true;
                          if (hd.field_u != var13Lifetime1.field_t) {
                            var14Lifetime1Lifetime1 = (ki) (var7.a(true));
                            while (var14Lifetime1Lifetime1 != null) {
                              if (var14Lifetime1Lifetime1 == var13Lifetime1) {
                                decompiledFrameCompleted1 = false;
                                break;
                              }
                              var14Lifetime1Lifetime1 = (ki) (var7.c((byte) -75));
                            }
                            if (decompiledFrameCompleted1) {
                              var14Lifetime1Lifetime1 = (ki) (var6.a(true));
                              while (var14Lifetime1Lifetime1 != null) {
                                if (var13Lifetime1 == var14Lifetime1Lifetime1) {
                                  decompiledFrameCompleted0 = false;
                                  break;
                                }
                                var14Lifetime1Lifetime1 = (ki) (var6.c((byte) -75));
                              }
                              if (decompiledFrameCompleted0) {
                                var6.a(-107, var13Lifetime1);
                              }
                            }
                          }
                          while (true) {
                            var12Lifetime1Lifetime1++;
                            while (var12Lifetime1Lifetime1 >= var11_refLifetime1.field_m) {
                              var11_refLifetime1 = (ki) (var6.a((byte) -120));
                              if (var11_refLifetime1 == null) {
                                break L40;
                              }
                              var7.a(-119, var11_refLifetime1);
                              if (var10.field_q > var11_refLifetime1.field_q) {
                                var10 = var11_refLifetime1;
                              }
                              var12Lifetime1Lifetime1 = 0;
                            }
                            var13Lifetime1 = var11_refLifetime1.field_o[var12Lifetime1Lifetime1];
                            if (null != var13Lifetime1) {
                              break;
                            }
                            gl.a(var11_refLifetime1.field_o, var12Lifetime1Lifetime1 + 1, var11_refLifetime1.field_o, var12Lifetime1Lifetime1, -var12Lifetime1Lifetime1 + var11_refLifetime1.field_m);
                            var12Lifetime1Lifetime1--;
                            var11_refLifetime1.field_m = var11_refLifetime1.field_m - 1;
                          }
                        }
                      }
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    var10.field_x = true;
                  }
                  var5_intLifetime2++;
                }
              }
              if ((decompiledFrameCompleted8) &&
                (decompiledFrameCompleted7) &&
                (ri.field_b == var4.field_t)) {
                ri.field_b.a(-8212, var4);
              }
              var4.field_t = null;
            }
            var4 = (ki) (ok.field_a.d((byte) 63));
          }
          if (var1_int == 0) {
            if (ub.field_a) {
              dc.field_e = 0;
            }
          } else {
            ke.field_c = var3;
            if (var2 == 0) {
              dc.field_e = 0;
              ek.field_b = ek.field_b + 1;
              if (var3 >= 30) {
                e.a(253, (byte) 40, 2);
              }
            } else {
              dc.field_e = dc.field_e + 1;
              ek.field_b = 0;
              if (var3 > 10) {
                e.a(248, (byte) 40, 7);
              }
              if (15 < var3) {
                e.a(247, (byte) 40, 8);
              }
              if (var3 > 20) {
                e.a(246, (byte) 40, 9);
              }
            }
            if (4 <= dc.field_e) {
              e.a(252, (byte) 40, 3);
            }
            if (dc.field_e >= 5) {
              e.a(251, (byte) 40, 4);
            }
            if (dc.field_e >= 6) {
              e.a(250, (byte) 40, 5);
            }
            if (ek.field_b >= 50) {
              e.a(249, (byte) 40, 6);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1_ref), "eb.G(" + param0 + ')');
        }
    }

    private final void b(boolean param0) {
        if (!this.l(-60)) {
          return;
        }
        sg.a(this.field_G.field_s, (byte) -120);
        if (!param0) {
          field_A = (cc) null;
        }
    }

    public static void k(int param0) {
        field_A = null;
        field_C = null;
        field_E = null;
        if (param0 > -42) {
          field_C = (pj) null;
        }
    }

    private final int a(String param0, we param1, int param2, String param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != 35) {
            this.field_D = (t) null;
          }
          stackIn_3_0 = this.a(param1, param0, 35, param5, 120, param3, param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("eb.K(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final int a(we param0, String param1, int param2, int param3, int param4, String param5, int param6) {
        RuntimeException var8 = null;
        vg var9 = null;
        mh var10 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var10 = new mh(20, param6, param4 + param3, 25, param0, false, 120, 3, t.field_z, 16777215, param5);
          this.b((byte) -111, var10);
          var9 = new vg(((ag) ((Object) param0)).a(param4 ^ 88), param1, 126, var10.field_p + param6, 25 + param3, param2);
          var9.field_o = (of) (this);
          this.b((byte) -95, var9);
          stackIn_1_0 = var9.field_p + var10.field_p;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_4_0 = var8;
          stackIn_4_1 = new StringBuilder().append("eb.U(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param6).append(')').toString());
        }
    }

    final boolean a(we param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, 110)) {
            return true;
          }
          if (param2 == 98) {
            stackIn_7_0 = this.a((byte) 85, param0);
            return stackIn_7_0;
          }
          if (param2 == 99) {
            stackIn_11_0 = this.b(param0, false);
            return stackIn_11_0;
          }
          var5_int = -120 % ((37 - param3) / 50);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("eb.V(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(int param0) {
        ((hh) (this.field_G.a(-125))).f((byte) -88);
        if (param0 != 200) {
          eb.m(63);
        }
    }

    static {
        field_E = "This password contains repeated characters, and would be easy to guess";
        field_C = new pj();
    }
}
