/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh {
    float field_J;
    boolean field_B;
    boolean field_Y;
    private StringBuilder field_X;
    int field_w;
    int field_u;
    private boolean field_R;
    private boolean field_Q;
    boolean field_C;
    private boolean field_j;
    int field_T;
    boolean field_N;
    private int field_a;
    int field_q;
    static volatile int field_P;
    private boolean field_V;
    private int field_r;
    boolean field_K;
    int field_v;
    private int field_U;
    int field_o;
    private boolean field_s;
    private int field_k;
    boolean field_x;
    private boolean field_d;
    private boolean field_f;
    int field_y;
    private int field_G;
    private boolean field_b;
    private int field_t;
    static int[] field_m;
    private Geoblox field_I;
    private int field_p;
    static String field_z;
    private boolean field_h;
    private boolean field_i;
    private int field_l;
    private int field_A;
    private StringBuilder field_g;
    private int field_W;
    private int field_ab;
    boolean field_H;
    private int field_D;
    private boolean field_E;
    private boolean field_n;
    private boolean field_L;
    boolean field_F;
    private kl field_M;
    int field_e;
    private int field_S;
    private boolean field_Z;
    private int field_c;
    int field_bb;

    private final void c(int param0) {
        this.field_Y = false;
        this.field_H = true;
        if (param0 != 7000) {
            this.field_R = true;
        }
        this.field_f = false;
        this.field_C = false;
    }

    private final void g(int param0) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        String var8;
        var7 = Geoblox.field_C;
        if (0 != this.field_t) {
          return;
        } else {
          L0: {
            L1: {
              var8 = uk.a(this.field_p, 24146);
              var3 = fi.field_d.field_o - fi.field_d.field_q + param0;
              var4 = 460;
              var5 = 30 + fi.field_d.b(var8, var4) * var3;
              var6 = 300;
              if ((this.field_p ^ -1) != -1) {
                break L1;
              } else {
                var6 = 232;
                if (var7 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (this.field_p == 3) {
                break L2;
              } else {
                if (1 == this.field_p) {
                  var6 = 280;
                  if (var7 == 0) {
                    break L0;
                  } else {
                    break L2;
                  }
                } else {
                  break L0;
                }
              }
            }
            var6 = 270;
            break L0;
          }
          L3: {
            L4: {
              ma.a(var6, 70, 10 + var5, (byte) -92, 500, ll.field_h);
              fi.field_d.a(var8, 95, 15 + var6, var4, 300, 1, -1, 0, 0, var3);
              if (-6 != (this.field_p ^ -1)) {
                break L4;
              } else {
                L5: {
                  if (-101 <= (qa.field_a ^ -1)) {
                    break L5;
                  } else {
                    if (-341 >= (qa.field_a ^ -1)) {
                      break L5;
                    } else {
                      if (-441 <= (ue.field_e ^ -1)) {
                        break L5;
                      } else {
                        if (ue.field_e >= 476) {
                          break L5;
                        } else {
                          dd.field_G.field_K[0][wf.field_p] = 15488514;
                          break L5;
                        }
                      }
                    }
                  }
                }
                L6: {
                  ma.a(440, 100, 36, (byte) -92, 240, eb.field_g);
                  dd.field_G.b(cf.field_j, 220, 468, 0, -1);
                  dd.field_G.field_K[0][wf.field_p] = 16689938;
                  ma.a(440, 380, 36, (byte) -92, 160, eb.field_g);
                  if (380 >= qa.field_a) {
                    break L6;
                  } else {
                    if (540 <= qa.field_a) {
                      break L6;
                    } else {
                      if (ue.field_e <= 440) {
                        break L6;
                      } else {
                        if (476 > ue.field_e) {
                          dd.field_G.field_K[0][wf.field_p] = 15488514;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                }
                dd.field_G.b(nk.field_g, var4, 468, 0, -1);
                dd.field_G.field_K[0][wf.field_p] = 16689938;
                if (var7 == 0) {
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            L7: {
              ma.a(440, 240, 36, (byte) -92, 160, eb.field_g);
              if (250 >= qa.field_a) {
                break L7;
              } else {
                if (-390 >= (qa.field_a ^ -1)) {
                  break L7;
                } else {
                  if ((ue.field_e ^ -1) >= -441) {
                    break L7;
                  } else {
                    if (476 <= ue.field_e) {
                      break L7;
                    } else {
                      dd.field_G.field_K[0][wf.field_p] = 15488514;
                      break L7;
                    }
                  }
                }
              }
            }
            dd.field_G.b(mi.field_y, 320, 468, 0, -1);
            dd.field_G.field_K[0][wf.field_p] = 16689938;
            break L3;
          }
          return;
        }
    }

    final static boolean a(String param0, boolean param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Geoblox.field_C;
        try {
          L0: {
            try {
              L1: {
                if (d.field_b.startsWith("win")) {
                  if (!param1) {
                    L2: {
                      if (param0.startsWith("http://")) {
                        break L2;
                      } else {
                        if (param0.startsWith("https://")) {
                          break L2;
                        } else {
                          return false;
                        }
                      }
                    }
                    var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                    var3 = 0;
                    L3: while (true) {
                      L4: {
                        L5: {
                          if (param0.length() <= var3) {
                            break L5;
                          } else {
                            stackIn_20_0 = var2.indexOf((int) param0.charAt(var3));

                            if (var4 != 0) {
                              break L4;
                            } else {
                              if (stackIn_20_0 != -1) {
                                var3++;
                                if (var4 == 0) {
                                  continue L3;
                                } else {
                                  break L5;
                                }
                              } else {
                                stackIn_17_0 = 0;
                                decompiledRegionSelector0 = 3;
                                break L1;
                              }
                            }
                          }
                        }
                        Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                        stackIn_20_0 = 1;
                        break L4;
                      }
                      decompiledRegionSelector0 = 2;
                      break L1;
                    }
                  } else {
                    stackIn_6_0 = 1;
                    decompiledRegionSelector0 = 1;
                    break L1;
                  }
                } else {
                  stackIn_3_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              stackIn_22_0 = 0;
              return stackIn_22_0 != 0;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                decompiledRegionSelector1 = 1;
                break L0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  decompiledRegionSelector1 = 2;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L6: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var2_ref2);

            stackIn_25_1 = new StringBuilder().append("gh.U(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L6;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L6;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return stackIn_20_0 != 0;
            } else {
              return stackIn_17_0 != 0;
            }
          }
        }
    }

    final void a(byte param0) {
        int stackIn_49_0 = 0;
        int stackIn_124_0 = 0;
        int stackIn_124_1 = 0;
        int stackIn_168_0 = 0;
        int stackIn_168_1 = 0;
        int statePc = 0;
        String var2_ref_String = null;
        int var2 = 0;
        int var3 = 0;
        String var3_ref_String = null;
        int var4 = 0;
        float var5_float = 0.0f;
        int var5 = 0;
        float var6_float = 0.0f;
        int var6 = 0;
        float var7_float = 0.0f;
        int var7_int = 0;
        tf var7 = null;
        int var8 = 0;
        ja var8_ref_ja = null;
        float var9_float = 0.0f;
        int var9 = 0;
        float var10_float = 0.0f;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        tf var15 = null;
        tf var16 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = Geoblox.field_C;
                    if (!ll.field_g[c.field_ab]) {
                        statePc = 3;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var3 = c.field_ab;
                    if ((var3 ^ -1) != -5) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var14 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (-7 != (var3 ^ -1)) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (var14 == 0) {
                        statePc = 32;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (var3 != 5) {
                        statePc = 19;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (var14 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (-1 == (var3 ^ -1)) {
                        statePc = 34;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (3 != var3) {
                        statePc = 28;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (var14 == 0) {
                        statePc = 35;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (-3 == (var3 ^ -1)) {
                        statePc = 36;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var2_ref_String = "baking";
                    if (var14 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var2_ref_String = "space";
                    if (var14 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var2_ref_String = "sports";
                    if (var14 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var2_ref_String = "jewels";
                    if (var14 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var2_ref_String = "germs";
                    if (var14 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var2_ref_String = "sweets";
                    if (var14 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var2_ref_String = "";
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    var3_ref_String = gf.a(ff.field_l, ll.field_f, var2_ref_String, wi.field_F, true);
                    var4 = 30 + dd.field_G.a(var3_ref_String);
                    ma.a(215, 320 - var4 / 2, 50, (byte) -92, var4, ll.field_h);
                    dd.field_G.b(var3_ref_String, 320, 250, 0, -1);
                    return;
                }
                case 39: {
                    if (!ih.a(0)) {
                        statePc = 48;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (!this.field_H) {
                        statePc = 48;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (!this.field_i) {
                        statePc = 48;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    stackIn_49_0 = 1;
                    statePc = 49;
                    continue stateLoop;
                }
                case 48: {
                    stackIn_49_0 = 0;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    var2 = stackIn_49_0;
                    if (var2 != 0) {
                        statePc = 62;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    if (this.field_F) {
                        statePc = 57;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    oc.field_d.e();
                    if (!this.field_V) {
                        statePc = 56;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 56: {
                    gj.f((byte) -63);
                    if (var14 == 0) {
                        statePc = 62;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    oc.field_d.e();
                    vb.c();
                    if (!this.field_V) {
                        statePc = 60;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 60: {
                    dc.a(7838);
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    k.a(10, 90, 460, -27085, 460);
                    this.field_F = false;
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    sh.field_y.a(255);
                    mf.field_a.b(0, 0);
                    var3 = 4;
                    var4 = 4;
                    if (param0 < -28) {
                        statePc = 65;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    this.a(-63);
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    if (this.field_L) {
                        statePc = 68;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if (this.field_D > 266) {
                        statePc = 70;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    var5_float = (float)this.field_D / 266.0f;
                    var6_float = -var5_float + 1.0f;
                    var7_float = var6_float * var6_float;
                    var3 = (int)(0.5f + (70.0f * (2.0f * var5_float * var6_float) + 10.0f * var7_float + 220.0f * (var5_float * var5_float)));
                    var4 = (int)(170.0f * (var5_float * var5_float) + (var7_float * 10.0f + 140.0f * (var5_float * 2.0f * var6_float)) + 0.5f);
                    if (var14 == 0) {
                        statePc = 71;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    var3 = 220;
                    var4 = 170;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    if (!this.field_Y) {
                        statePc = 77;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    var5 = 176 - this.field_v / 2;
                    if (10 > var5) {
                        statePc = 75;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 75: {
                    var5 = 10;
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    var6 = -fi.field_d.field_q + fi.field_d.field_o;
                    var7_int = fi.field_d.c(v.field_n, 640) + 40;
                    var8 = fi.field_d.b(v.field_n, 640) * var6 - -10;
                    ma.a(var5, -(var7_int / 2) + 320, 20 + var8, (byte) -92, var7_int, ll.field_h);
                    fi.field_d.b(v.field_n, 320, var5 + 28, 1, -1);
                    fi.field_d.b(v.field_n, 319, 28 + var5, 1, -1);
                    if (var14 == 0) {
                        statePc = 88;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    lj.field_d.b(var3, var4);
                    if (0 != this.field_bb) {
                        statePc = 83;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    if (!ih.a(0)) {
                        statePc = 86;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    vh.field_G.b(446, 410);
                    if (var14 == 0) {
                        statePc = 88;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    g.field_i.b(468, 410);
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    if (this.field_Y) {
                        statePc = 103;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    if (!ih.a(0)) {
                        statePc = 101;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if (var2 == 0) {
                        statePc = 103;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    if (0 == this.field_bb) {
                        statePc = 101;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    if (-2 != (this.field_bb ^ -1)) {
                        statePc = 103;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    this.e(-46);
                    statePc = 103;
                    continue stateLoop;
                }
                case 103: {
                    if (!this.field_V) {
                        statePc = 106;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 106: {
                    h.c(-1);
                    statePc = 107;
                    continue stateLoop;
                }
                case 107: {
                    if (this.field_V) {
                        statePc = 112;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    if (var2 == 0) {
                        statePc = 111;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 111: {
                    oc.field_d.b(0, 0);
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    ij.h((byte) 18);
                    if (!this.field_V) {
                        statePc = 115;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 115: {
                    ni.f(484842465);
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    jf.field_a.e();
                    vb.c();
                    ec.field_c.b(ec.field_c.field_s << 1679206499, ec.field_c.field_o << 919227299, jf.field_a.field_s << -122785245, jf.field_a.field_o << 1137750627, (int)(65535.0 * ((double)(-this.field_J) / 6.283185307179586)), 4096);
                    sh.field_y.a(255);
                    w.a(jf.field_a, -(jf.field_a.field_s >> -199505663) + 320, -(jf.field_a.field_o >> -1092517823) + 240);
                    if (!this.field_V) {
                        statePc = 119;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 119: {
                    uh.d(4740);
                    statePc = 120;
                    continue stateLoop;
                }
                case 120: {
                    if (!this.field_s) {
                        statePc = 169;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    af.field_a.e();
                    vb.a(0, 0, vb.field_f, vb.field_b, 1118481);
                    var5 = 16777215;
                    vb.f(160, 120, 115, 16711680);
                    var6 = 20;
                    var15 = wd.field_e;
                    var8_ref_ja = (ja) ((Object) var15.a(false));
                    statePc = 122;
                    continue stateLoop;
                }
                case 122: {
                    if (var8_ref_ja == null) {
                        statePc = 133;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    var9_float = -320.0f + var8_ref_ja.field_o;
                    var10_float = -240.0f + var8_ref_ja.field_v;
                    var11 = (int)(320.0 + (Math.cos((double)el.field_o.field_J) * (double)var9_float - Math.sin((double)el.field_o.field_J) * (double)var10_float));
                    var12 = (int)(240.0 + ((double)var9_float * Math.sin((double)el.field_o.field_J) + (double)var10_float * Math.cos((double)el.field_o.field_J)));
                    var13 = 255 - var8_ref_ja.field_r * 255 / var8_ref_ja.field_p;
                    stackIn_168_0 = 11;
                    stackIn_124_0 = stackIn_168_0;
                    stackIn_168_1 = var13;
                    stackIn_124_1 = stackIn_168_1;
                    if (var14 != 0) {
                        statePc = 168;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    if (stackIn_124_0 > stackIn_124_1) {
                        statePc = 127;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 127: {
                    var13 = 11;
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    if (-256 > (var13 ^ -1)) {
                        statePc = 131;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 131: {
                    var13 = 255;
                    statePc = 132;
                    continue stateLoop;
                }
                case 132: {
                    vb.d(var11 / 2, var12 / 2, var6, var13 << 269082696 | var13 << -327781456 | var13);
                    var8_ref_ja = (ja) ((Object) var15.b(0));
                    if (var14 == 0) {
                        statePc = 122;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    var16 = ji.field_r;
                    var7 = var16;
                    var8_ref_ja = (ja) ((Object) var16.g(0));
                    statePc = 134;
                    continue stateLoop;
                }
                case 134: {
                    if (null == var8_ref_ja) {
                        statePc = 139;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    var9_float = -320.0f + var8_ref_ja.field_o;
                    var10_float = -240.0f + var8_ref_ja.field_v;
                    var11 = (int)(Math.cos((double)el.field_o.field_J) * (double)var9_float - Math.sin((double)el.field_o.field_J) * (double)var10_float + 320.0);
                    var12 = (int)(240.0 + ((double)var9_float * Math.sin((double)el.field_o.field_J) + (double)var10_float * Math.cos((double)el.field_o.field_J)));
                    vb.d(var11 / 2, var12 / 2, var6, var5);
                    var8_ref_ja = (ja) ((Object) var16.d(1));
                    if (var14 != 0) {
                        statePc = 140;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    if (var14 == 0) {
                        statePc = 134;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    var7 = a.field_d;
                    statePc = 140;
                    continue stateLoop;
                }
                case 140: {
                    var8_ref_ja = (ja) ((Object) var7.g(0));
                    statePc = 141;
                    continue stateLoop;
                }
                case 141: {
                    if (var8_ref_ja == null) {
                        statePc = 146;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    vb.d((int)(var8_ref_ja.field_o / 2.0f), (int)(var8_ref_ja.field_v / 2.0f), var6, var5);
                    var8_ref_ja = (ja) ((Object) var7.d(1));
                    if (var14 != 0) {
                        statePc = 147;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    if (var14 == 0) {
                        statePc = 141;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    var7 = bh.field_c;
                    statePc = 147;
                    continue stateLoop;
                }
                case 147: {
                    var8_ref_ja = (ja) ((Object) var7.g(0));
                    statePc = 148;
                    continue stateLoop;
                }
                case 148: {
                    if (var8_ref_ja == null) {
                        statePc = 153;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    vb.d((int)(var8_ref_ja.field_o / 2.0f), (int)(var8_ref_ja.field_v / 2.0f), var6, var5);
                    var8_ref_ja = (ja) ((Object) var7.d(1));
                    if (var14 != 0) {
                        statePc = 158;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    if (var14 == 0) {
                        statePc = 148;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    if (!this.field_Y) {
                        statePc = 157;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    var8 = -(this.field_v / 2) + 176;
                    if ((var8 ^ -1) <= -11) {
                        statePc = 156;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    var8 = 10;
                    statePc = 156;
                    continue stateLoop;
                }
                case 156: {
                    var9 = fi.field_d.field_o + -fi.field_d.field_q;
                    var10 = fi.field_d.c(v.field_n, 640) + 40;
                    var11 = fi.field_d.b(v.field_n, 640) * var9 - -10;
                    vb.a((320 - var10 / 2) / 2, var8 / 2, var10 / 2, (20 + var11) / 2, var5);
                    statePc = 167;
                    continue stateLoop;
                }
                case 157: {
                    lj.field_d.a(var3 / 2, var4 / 2, lj.field_d.field_s / 2, lj.field_d.field_o / 2, var5);
                    statePc = 158;
                    continue stateLoop;
                }
                case 158: {
                    if (this.field_bb != 0) {
                        statePc = 165;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    if (ih.a(0)) {
                        statePc = 165;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    g.field_i.a(234, 205, g.field_i.field_s / 2, g.field_i.field_o / 2, var5);
                    if (var14 == 0) {
                        statePc = 167;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    vh.field_G.a(223, 205, vh.field_G.field_s / 2, vh.field_G.field_o / 2, var5);
                    statePc = 167;
                    continue stateLoop;
                }
                case 167: {
                    vb.d(160, 120, 21, 16777215);
                    vb.e(2, 2, 0, 0, vb.field_f, vb.field_b);
                    sh.field_y.a(255);
                    stackIn_168_0 = vb.field_b;
                    stackIn_168_1 = 1;
                    statePc = 168;
                    continue stateLoop;
                }
                case 168: {
                    ek.a(stackIn_168_0, stackIn_168_1 != 0, af.field_a, 0, vb.field_f, 0);
                    statePc = 169;
                    continue stateLoop;
                }
                case 169: {
                    if (this.field_Y) {
                        statePc = 206;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    if ((this.field_a ^ -1) < -1) {
                        statePc = 173;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 173: {
                    lj.field_d.b(-(lj.field_d.field_s >> -1133369407) + 320, 60 + -(lj.field_d.field_o >> -2072717343) + 240);
                    dd.field_G.b(wl.field_b, 320, 310, 0, -1);
                    statePc = 174;
                    continue stateLoop;
                }
                case 174: {
                    eg.field_q[this.field_l].b(this.field_T, 4);
                    if (640 <= this.field_T) {
                        statePc = 179;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    if (0 < this.field_A) {
                        statePc = 178;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 178: {
                    dd.field_G.a(wj.a(ic.field_a, new String[]{this.field_g.toString()}, (byte) -79), this.field_T + 20, 34, 0, -1);
                    statePc = 179;
                    continue stateLoop;
                }
                case 179: {
                    if (this.field_h) {
                        statePc = 182;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 182: {
                    dd.field_G.a(wj.a(sh.field_z, new String[]{Integer.toString(ec.field_b)}, (byte) -26), 400, 50, 0, -1);
                    dd.field_G.a(wj.a(qg.field_e, new String[]{Integer.toString(ji.field_h)}, (byte) -71), 400, 80, 0, -1);
                    statePc = 183;
                    continue stateLoop;
                }
                case 183: {
                    bd.a(-117);
                    this.c((byte) 64);
                    if (this.field_L) {
                        statePc = 186;
                    } else {
                        statePc = 192;
                    }
                    continue stateLoop;
                }
                case 186: {
                    lj.field_d.b(var3, var4);
                    if (this.field_D >= 266) {
                        statePc = 190;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 187: {
                    kh.field_h[6].b(0, (this.field_D >> 1707498369) + -113);
                    if (var14 == 0) {
                        statePc = 192;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    kh.field_h[6].b(0, 20);
                    kh.field_h[6].c(0, 20, (int)(Math.cos((double)(-266 + this.field_D) / 40.0) * -64.0 + 64.0));
                    statePc = 192;
                    continue stateLoop;
                }
                case 192: {
                    dd.field_G.a(wj.a(pa.field_a, new String[]{this.field_X.toString()}, (byte) -53), 15 + var3, 30 + var4, 0, -1);
                    if (!ih.a(0)) {
                        statePc = 205;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    if (0 == this.field_bb) {
                        statePc = 199;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    if (this.field_bb != 1) {
                        statePc = 203;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 199: {
                    if (var2 != 0) {
                        statePc = 202;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 202: {
                    var5 = 35 + (6 * this.field_D + -480);
                    sh.field_y.a(255);
                    vb.e(0, var5, 640, 480);
                    oc.field_d.b(0, 0);
                    vb.e(0, 0, 640, 480);
                    qj.field_c.b(0, -480 + 6 * this.field_D);
                    if (var14 == 0) {
                        statePc = 205;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 203: {
                    this.a(false);
                    statePc = 205;
                    continue stateLoop;
                }
                case 205: {
                    vc.c(-1);
                    if (var14 == 0) {
                        statePc = 208;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 206: {
                    this.g(2);
                    statePc = 208;
                    continue stateLoop;
                }
                case 208: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0) {
        int fieldTemp$0 = 0;
        boolean stackIn_227_0 = false;
        boolean stackIn_233_0 = false;
        Object stackIn_243_0 = null;
        Object stackIn_244_0 = null;
        Object stackIn_246_0 = null;
        Object stackIn_247_0 = null;
        Object stackIn_249_0 = null;
        Object stackIn_251_0 = null;
        Object stackIn_252_0 = null;
        int stackIn_252_1 = 0;
        Object stackIn_301_0 = null;
        Object stackIn_303_0 = null;
        Object stackIn_304_0 = null;
        int stackIn_304_1 = 0;
        Object stackIn_354_0 = null;
        Object stackIn_356_0 = null;
        Object stackIn_358_0 = null;
        Object stackIn_359_0 = null;
        int stackIn_359_1 = 0;
        int stackIn_362_0 = 0;
        int stackIn_362_1 = 0;
        Object stackIn_385_0 = null;
        Object stackIn_387_0 = null;
        Object stackIn_388_0 = null;
        int stackIn_388_1 = 0;
        Object stackIn_405_0 = null;
        Object stackIn_407_0 = null;
        Object stackIn_408_0 = null;
        int stackIn_408_1 = 0;
        Object stackIn_411_0 = null;
        Object stackIn_413_0 = null;
        Object stackIn_415_0 = null;
        Object stackIn_416_0 = null;
        int stackIn_416_1 = 0;
        Object stackIn_452_0 = null;
        Object stackIn_454_0 = null;
        Object stackIn_455_0 = null;
        int stackIn_455_1 = 0;
        int stackIn_464_0 = 0;
        int stackIn_464_1 = 0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4_int = 0;
        ja var4 = null;
        int var5 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = Geoblox.field_C;
                    lh.a(param0 ^ 1578896222);
                    fieldTemp$0 = this.field_v;
                    this.field_v = this.field_v + 1;
                    if ((fieldTemp$0 & 15) != 0) {
                        statePc = 10;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.field_l = this.field_l + this.field_k;
                    if (7 == this.field_l) {
                        statePc = 8;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (-1 == (this.field_l ^ -1)) {
                        statePc = 7;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 7: {
                    this.field_k = 1;
                    if (var5 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    this.field_k = -1;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (0 == (this.field_v & 1)) {
                        statePc = 13;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (-1 != this.field_y) {
                        statePc = 17;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (463 < this.field_T) {
                        statePc = 33;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if ((this.field_y ^ -1) != -2) {
                        statePc = 23;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (this.field_T < 640) {
                        statePc = 30;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (-464 != (this.field_T ^ -1)) {
                        statePc = 35;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (-1 == (gf.field_f ^ -1)) {
                        statePc = 29;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 29: {
                    this.field_y = 1;
                    el.field_o.c(false);
                    if (var5 == 0) {
                        statePc = 35;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    this.field_T = this.field_T + 1;
                    if (var5 == 0) {
                        statePc = 35;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    this.field_T = this.field_T - 1;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (this.field_x) {
                        statePc = 274;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (!ih.a(0)) {
                        statePc = 42;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (!this.field_n) {
                        statePc = 45;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (this.field_f) {
                        statePc = 61;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if (!this.b(true)) {
                        statePc = 61;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (0 == this.field_bb) {
                        statePc = 54;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    if (-6 != (this.field_bb ^ -1)) {
                        statePc = 58;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (this.field_H) {
                        statePc = 57;
                    } else {
                        statePc = 288;
                    }
                    continue stateLoop;
                }
                case 57: {
                    this.b((byte) -80);
                    if (var5 == 0) {
                        statePc = 288;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    this.f(10);
                    if (var5 == 0) {
                        statePc = 288;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (!ll.field_g[c.field_ab]) {
                        statePc = 64;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 64: {
                    return;
                }
                case 65: {
                    if (this.field_E) {
                        statePc = 67;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    var2 = 96;
                    var3 = 97;
                    if (var5 == 0) {
                        statePc = 68;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    var3 = 96;
                    var2 = 97;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    if (kj.field_o[var2]) {
                        statePc = 71;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 71: {
                    this.field_J = this.field_J - rc.field_h;
                    me.a((byte) 38);
                    var4_int = (ki.field_d + kd.field_c + qa.field_a + he.field_d) % 8;
                    if (var4_int != 0) {
                        statePc = 75;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    oa.field_a = oa.field_a + kb.field_d;
                    gb.field_g = gb.field_g - 1;
                    if (var5 == 0) {
                        statePc = 116;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    if (-2 != (var4_int ^ -1)) {
                        statePc = 81;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    oa.field_a = oa.field_a + gb.field_g;
                    kb.field_d = kb.field_d - 1;
                    if (var5 == 0) {
                        statePc = 116;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    if ((var4_int ^ -1) == -3) {
                        statePc = 114;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    if (3 != var4_int) {
                        statePc = 90;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    oa.field_a = oa.field_a - gb.field_g;
                    kb.field_d = kb.field_d + 1;
                    if (var5 == 0) {
                        statePc = 116;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    if (4 != var4_int) {
                        statePc = 96;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    ml.field_r = ml.field_r + kb.field_d;
                    gb.field_g = gb.field_g + 1;
                    if (var5 == 0) {
                        statePc = 116;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    if ((var4_int ^ -1) != -6) {
                        statePc = 102;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    kb.field_d = kb.field_d + 1;
                    ml.field_r = ml.field_r + gb.field_g;
                    if (var5 == 0) {
                        statePc = 116;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    if (-7 != (var4_int ^ -1)) {
                        statePc = 108;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    ml.field_r = ml.field_r - kb.field_d;
                    gb.field_g = gb.field_g - 1;
                    if (var5 == 0) {
                        statePc = 116;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    if ((var4_int ^ -1) != -8) {
                        statePc = 116;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    kb.field_d = kb.field_d - 1;
                    ml.field_r = ml.field_r - gb.field_g;
                    if (var5 == 0) {
                        statePc = 116;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    gb.field_g = gb.field_g + 1;
                    oa.field_a = oa.field_a - kb.field_d;
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    var4_int = (kd.field_c + he.field_d + qa.field_a - -ki.field_d) % 5;
                    if (0 != var4_int) {
                        statePc = 120;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    dc.field_a = dc.field_a | lb.field_b + el.field_g << -751962927;
                    if (var5 == 0) {
                        statePc = 143;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    if ((var4_int ^ -1) == -2) {
                        statePc = 141;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    if (-3 == (var4_int ^ -1)) {
                        statePc = 138;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    if (3 != var4_int) {
                        statePc = 132;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    sc.field_f = sc.field_f + 1;
                    el.field_g = el.field_g + lb.field_b;
                    if (var5 == 0) {
                        statePc = 143;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    if ((var4_int ^ -1) != -5) {
                        statePc = 143;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    sc.field_f = sc.field_f - 1;
                    el.field_g = el.field_g - lb.field_b;
                    if (var5 == 0) {
                        statePc = 143;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    lb.field_b = lb.field_b - 1;
                    el.field_g = el.field_g - sc.field_f;
                    if (var5 == 0) {
                        statePc = 143;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    el.field_g = el.field_g + sc.field_f;
                    lb.field_b = lb.field_b + 1;
                    statePc = 143;
                    continue stateLoop;
                }
                case 143: {
                    if ((this.field_p ^ -1) != -1) {
                        statePc = 146;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    this.field_U = this.field_U + 1;
                    statePc = 146;
                    continue stateLoop;
                }
                case 146: {
                    if (!kj.field_o[var3]) {
                        statePc = 220;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    this.field_J = this.field_J + rc.field_h;
                    wd.a((byte) 74);
                    if ((this.field_p ^ -1) != -1) {
                        statePc = 152;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    this.field_U = this.field_U + 1;
                    statePc = 152;
                    continue stateLoop;
                }
                case 152: {
                    var4_int = (he.field_d + (qa.field_a - -kd.field_c) + ki.field_d) % 8;
                    if ((var4_int ^ -1) == -1) {
                        statePc = 193;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    if (1 == var4_int) {
                        statePc = 190;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 156: {
                    if ((var4_int ^ -1) == -3) {
                        statePc = 187;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    if (var4_int != 3) {
                        statePc = 165;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    kb.field_d = kb.field_d + 1;
                    oa.field_a = oa.field_a - gb.field_g;
                    if (var5 == 0) {
                        statePc = 195;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    if (4 != var4_int) {
                        statePc = 171;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    gb.field_g = gb.field_g + 1;
                    ml.field_r = ml.field_r + kb.field_d;
                    if (var5 == 0) {
                        statePc = 195;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    if (5 != var4_int) {
                        statePc = 177;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    kb.field_d = kb.field_d + 1;
                    ml.field_r = ml.field_r + gb.field_g;
                    if (var5 == 0) {
                        statePc = 195;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    if (var4_int != 6) {
                        statePc = 183;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    ml.field_r = ml.field_r - kb.field_d;
                    gb.field_g = gb.field_g - 1;
                    if (var5 == 0) {
                        statePc = 195;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    if (var4_int == 7) {
                        statePc = 186;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 186: {
                    kb.field_d = kb.field_d - 1;
                    ml.field_r = ml.field_r - gb.field_g;
                    if (var5 == 0) {
                        statePc = 195;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 187: {
                    gb.field_g = gb.field_g + 1;
                    oa.field_a = oa.field_a - kb.field_d;
                    if (var5 == 0) {
                        statePc = 195;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    oa.field_a = oa.field_a + gb.field_g;
                    kb.field_d = kb.field_d - 1;
                    if (var5 == 0) {
                        statePc = 195;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    gb.field_g = gb.field_g - 1;
                    oa.field_a = oa.field_a + kb.field_d;
                    statePc = 195;
                    continue stateLoop;
                }
                case 195: {
                    var4_int = (kd.field_c + qa.field_a - -he.field_d + ki.field_d) % 5;
                    if (-1 == (var4_int ^ -1)) {
                        statePc = 218;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    if (1 == var4_int) {
                        statePc = 215;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 199: {
                    if (2 == var4_int) {
                        statePc = 212;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    if (var4_int != 3) {
                        statePc = 208;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    sc.field_f = sc.field_f + 1;
                    el.field_g = el.field_g + lb.field_b;
                    if (var5 == 0) {
                        statePc = 220;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    if (4 == var4_int) {
                        statePc = 211;
                    } else {
                        statePc = 220;
                    }
                    continue stateLoop;
                }
                case 211: {
                    el.field_g = el.field_g - lb.field_b;
                    sc.field_f = sc.field_f - 1;
                    if (var5 == 0) {
                        statePc = 220;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 212: {
                    lb.field_b = lb.field_b - 1;
                    el.field_g = el.field_g - sc.field_f;
                    if (var5 == 0) {
                        statePc = 220;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 215: {
                    lb.field_b = lb.field_b + 1;
                    el.field_g = el.field_g + sc.field_f;
                    if (var5 == 0) {
                        statePc = 220;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 218: {
                    dc.field_a = dc.field_a | el.field_g + lb.field_b << -982889103;
                    statePc = 220;
                    continue stateLoop;
                }
                case 220: {
                    if (!kj.field_o[99]) {
                        statePc = 232;
                    } else {
                        statePc = 221;
                    }
                    continue stateLoop;
                }
                case 221: {
                    if (this.field_C) {
                        statePc = 232;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 224: {
                    var4 = (ja) ((Object) ji.field_r.g(0));
                    statePc = 225;
                    continue stateLoop;
                }
                case 225: {
                    if (null == var4) {
                        statePc = 232;
                    } else {
                        statePc = 226;
                    }
                    continue stateLoop;
                }
                case 226: {
                    stackIn_233_0 = var4.field_B;
                    stackIn_227_0 = stackIn_233_0;
                    if (var5 != 0) {
                        statePc = 233;
                    } else {
                        statePc = 227;
                    }
                    continue stateLoop;
                }
                case 227: {
                    if (!stackIn_227_0) {
                        statePc = 230;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 230: {
                    var4.field_v = var4.field_v + 4.0f * var4.field_F;
                    var4.field_o = var4.field_o + 4.0f * var4.field_w;
                    if (var5 == 0) {
                        statePc = 232;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 231: {
                    var4 = (ja) ((Object) ji.field_r.d(1));
                    if (var5 == 0) {
                        statePc = 225;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 232: {
                    stackIn_233_0 = kj.field_o[var3];
                    statePc = 233;
                    continue stateLoop;
                }
                case 233: {
                    if (stackIn_233_0) {
                        statePc = 239;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 234: {
                    if (kj.field_o[var2]) {
                        statePc = 239;
                    } else {
                        statePc = 237;
                    }
                    continue stateLoop;
                }
                case 237: {
                    jj.b(-106);
                    statePc = 239;
                    continue stateLoop;
                }
                case 239: {
                    this.field_a = this.field_a - 1;
                    if ((this.field_a ^ -1) != -1) {
                        statePc = 242;
                    } else {
                        statePc = 240;
                    }
                    continue stateLoop;
                }
                case 240: {
                    ld.a(310, 320, 123, 100 + 100 * ji.field_h);
                    statePc = 242;
                    continue stateLoop;
                }
                case 242: {
                    stackIn_251_0 = this;
                    stackIn_243_0 = stackIn_251_0;
                    if (fa.field_a) {
                        statePc = 251;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 243: {
                    stackIn_251_0 = this;
                    stackIn_244_0 = stackIn_251_0;
                    if (!a.field_d.c(13519)) {
                        statePc = 251;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 244: {
                    stackIn_246_0 = this;
                    statePc = 246;
                    continue stateLoop;
                }
                case 246: {
                    stackIn_251_0 = this;
                    stackIn_247_0 = stackIn_251_0;
                    if (0 >= ul.field_b) {
                        statePc = 251;
                    } else {
                        statePc = 247;
                    }
                    continue stateLoop;
                }
                case 247: {
                    stackIn_249_0 = this;
                    statePc = 249;
                    continue stateLoop;
                }
                case 249: {
                    stackIn_252_0 = this;
                    stackIn_252_1 = 1;
                    statePc = 252;
                    continue stateLoop;
                }
                case 251: {
                    stackIn_252_0 = this;
                    stackIn_252_1 = 0;
                    statePc = 252;
                    continue stateLoop;
                }
                case 252: {
                    ((gh) (this)).field_b = stackIn_252_1 != 0;
                    if (!this.field_b) {
                        statePc = 259;
                    } else {
                        statePc = 253;
                    }
                    continue stateLoop;
                }
                case 253: {
                    if (!this.field_B) {
                        statePc = 259;
                    } else {
                        statePc = 256;
                    }
                    continue stateLoop;
                }
                case 256: {
                    this.field_B = false;
                    this.field_a = 300;
                    this.field_b = false;
                    ra.a(le.field_a ^ 255, -88, le.field_a);
                    if (var5 == 0) {
                        statePc = 261;
                    } else {
                        statePc = 259;
                    }
                    continue stateLoop;
                }
                case 259: {
                    this.field_B = false;
                    statePc = 261;
                    continue stateLoop;
                }
                case 261: {
                    this.field_Z = ab.field_f;
                    ef.b((byte) -15);
                    kc.b(param0 + 1578896101);
                    if (ab.field_f) {
                        statePc = 264;
                    } else {
                        statePc = 265;
                    }
                    continue stateLoop;
                }
                case 264: {
                    ul.b(-2);
                    statePc = 265;
                    continue stateLoop;
                }
                case 265: {
                    this.field_n = ec.b(-18913);
                    if (this.field_Z) {
                        statePc = 268;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 268: {
                    sk.a(param0 ^ 1578896190);
                    statePc = 269;
                    continue stateLoop;
                }
                case 269: {
                    cf.d((byte) 27);
                    f.o(600);
                    if (this.field_Y) {
                        statePc = 272;
                    } else {
                        statePc = 273;
                    }
                    continue stateLoop;
                }
                case 272: {
                    this.b(109);
                    statePc = 273;
                    continue stateLoop;
                }
                case 273: {
                    if (var5 == 0) {
                        statePc = 288;
                    } else {
                        statePc = 274;
                    }
                    continue stateLoop;
                }
                case 274: {
                    if (-1 != (this.field_D ^ -1)) {
                        statePc = 279;
                    } else {
                        statePc = 277;
                    }
                    continue stateLoop;
                }
                case 277: {
                    fi.a(param0 ^ -1578896191, pi.field_S);
                    statePc = 279;
                    continue stateLoop;
                }
                case 279: {
                    if (!pf.field_D) {
                        statePc = 287;
                    } else {
                        statePc = 280;
                    }
                    continue stateLoop;
                }
                case 280: {
                    if (!od.a(-3)) {
                        statePc = 287;
                    } else {
                        statePc = 283;
                    }
                    continue stateLoop;
                }
                case 283: {
                    if (this.field_D > 1000) {
                        statePc = 286;
                    } else {
                        statePc = 287;
                    }
                    continue stateLoop;
                }
                case 286: {
                    this.d(28809);
                    statePc = 287;
                    continue stateLoop;
                }
                case 287: {
                    fc.a(19);
                    cf.d((byte) 24);
                    f.o(600);
                    this.field_D = this.field_D + 1;
                    this.field_F = true;
                    statePc = 288;
                    continue stateLoop;
                }
                case 288: {
                    if (param0 == -1578896191) {
                        statePc = 293;
                    } else {
                        statePc = 289;
                    }
                    continue stateLoop;
                }
                case 289: {
                    this.field_X = (StringBuilder) null;
                    statePc = 293;
                    continue stateLoop;
                }
                case 293: {
                    if (!hh.a(111)) {
                        statePc = 463;
                    } else {
                        statePc = 294;
                    }
                    continue stateLoop;
                }
                case 294: {
                    if (te.field_a > 0) {
                        statePc = 297;
                    } else {
                        statePc = 311;
                    }
                    continue stateLoop;
                }
                case 297: {
                    pk.field_r = pk.field_r.substring(1) + te.field_a;
                    if (pk.field_r.equalsIgnoreCase("fog")) {
                        statePc = 300;
                    } else {
                        statePc = 305;
                    }
                    continue stateLoop;
                }
                case 300: {
                    stackIn_303_0 = this;
                    stackIn_301_0 = stackIn_303_0;
                    if (this.field_s) {
                        statePc = 303;
                    } else {
                        statePc = 301;
                    }
                    continue stateLoop;
                }
                case 301: {
                    stackIn_304_0 = this;
                    stackIn_304_1 = 1;
                    statePc = 304;
                    continue stateLoop;
                }
                case 303: {
                    stackIn_304_0 = this;
                    stackIn_304_1 = 0;
                    statePc = 304;
                    continue stateLoop;
                }
                case 304: {
                    ((gh) (this)).field_s = stackIn_304_1 != 0;
                    statePc = 305;
                    continue stateLoop;
                }
                case 305: {
                    if (oc.field_f < 2) {
                        statePc = 311;
                    } else {
                        statePc = 306;
                    }
                    continue stateLoop;
                }
                case 306: {
                    if (!pk.field_r.equalsIgnoreCase("brk")) {
                        statePc = 311;
                    } else {
                        statePc = 309;
                    }
                    continue stateLoop;
                }
                case 309: {
                    this.field_I.h((byte) 41);
                    statePc = 311;
                    continue stateLoop;
                }
                case 311: {
                    if ((ki.field_d ^ -1) != -14) {
                        statePc = 321;
                    } else {
                        statePc = 312;
                    }
                    continue stateLoop;
                }
                case 312: {
                    if (this.field_x) {
                        statePc = 318;
                    } else {
                        statePc = 315;
                    }
                    continue stateLoop;
                }
                case 315: {
                    ai.field_p = 1;
                    if (var5 == 0) {
                        statePc = 523;
                    } else {
                        statePc = 318;
                    }
                    continue stateLoop;
                }
                case 318: {
                    this.d(28809);
                    statePc = 320;
                    continue stateLoop;
                }
                case 320: {
                    return;
                }
                case 321: {
                    if (-84 == (ki.field_d ^ -1)) {
                        statePc = 324;
                    } else {
                        statePc = 327;
                    }
                    continue stateLoop;
                }
                case 324: {
                    if (!this.field_Y) {
                        statePc = 327;
                    } else {
                        statePc = 325;
                    }
                    continue stateLoop;
                }
                case 325: {
                    this.c(7000);
                    statePc = 327;
                    continue stateLoop;
                }
                case 327: {
                    if (ki.field_d != 84) {
                        statePc = 344;
                    } else {
                        statePc = 328;
                    }
                    continue stateLoop;
                }
                case 328: {
                    if (this.field_t == 0) {
                        statePc = 331;
                    } else {
                        statePc = 344;
                    }
                    continue stateLoop;
                }
                case 331: {
                    this.field_t = 1;
                    this.field_C = false;
                    if (-1 == (this.field_p ^ -1)) {
                        statePc = 342;
                    } else {
                        statePc = 332;
                    }
                    continue stateLoop;
                }
                case 332: {
                    if ((this.field_p ^ -1) == -2) {
                        statePc = 339;
                    } else {
                        statePc = 335;
                    }
                    continue stateLoop;
                }
                case 335: {
                    if (-3 == (this.field_p ^ -1)) {
                        statePc = 338;
                    } else {
                        statePc = 344;
                    }
                    continue stateLoop;
                }
                case 338: {
                    this.field_U = dk.field_b;
                    if (var5 == 0) {
                        statePc = 344;
                    } else {
                        statePc = 339;
                    }
                    continue stateLoop;
                }
                case 339: {
                    this.field_U = dd.field_D;
                    if (var5 == 0) {
                        statePc = 344;
                    } else {
                        statePc = 342;
                    }
                    continue stateLoop;
                }
                case 342: {
                    this.field_U = 0;
                    statePc = 344;
                    continue stateLoop;
                }
                case 344: {
                    if ((ki.field_d ^ -1) != -86) {
                        statePc = 352;
                    } else {
                        statePc = 345;
                    }
                    continue stateLoop;
                }
                case 345: {
                    if (5 != this.field_p) {
                        statePc = 352;
                    } else {
                        statePc = 348;
                    }
                    continue stateLoop;
                }
                case 348: {
                    if (-1 == (this.field_t ^ -1)) {
                        statePc = 351;
                    } else {
                        statePc = 352;
                    }
                    continue stateLoop;
                }
                case 351: {
                    this.c(param0 ^ -1578897511);
                    this.field_Y = true;
                    this.field_p = 0;
                    this.field_C = true;
                    statePc = 352;
                    continue stateLoop;
                }
                case 352: {
                    if (jg.field_g != ki.field_d) {
                        statePc = 360;
                    } else {
                        statePc = 353;
                    }
                    continue stateLoop;
                }
                case 353: {
                    stackIn_358_0 = this;
                    stackIn_354_0 = stackIn_358_0;
                    if (this.field_E) {
                        statePc = 358;
                    } else {
                        statePc = 354;
                    }
                    continue stateLoop;
                }
                case 354: {
                    stackIn_356_0 = this;
                    statePc = 356;
                    continue stateLoop;
                }
                case 356: {
                    stackIn_359_0 = this;
                    stackIn_359_1 = 1;
                    statePc = 359;
                    continue stateLoop;
                }
                case 358: {
                    stackIn_359_0 = this;
                    stackIn_359_1 = 0;
                    statePc = 359;
                    continue stateLoop;
                }
                case 359: {
                    ((gh) (this)).field_E = stackIn_359_1 != 0;
                    jc.a(7, false);
                    statePc = 360;
                    continue stateLoop;
                }
                case 360: {
                    if (2 > oc.field_f) {
                        statePc = 293;
                    } else {
                        statePc = 361;
                    }
                    continue stateLoop;
                }
                case 361: {
                    stackIn_464_0 = ki.field_d;
                    stackIn_362_0 = stackIn_464_0;
                    stackIn_464_1 = 48;
                    stackIn_362_1 = stackIn_464_1;
                    if (var5 != 0) {
                        statePc = 464;
                    } else {
                        statePc = 362;
                    }
                    continue stateLoop;
                }
                case 362: {
                    if (stackIn_362_0 != stackIn_362_1) {
                        statePc = 369;
                    } else {
                        statePc = 365;
                    }
                    continue stateLoop;
                }
                case 365: {
                    this.field_r = this.field_r - 1;
                    if ((this.field_r ^ -1) > -1) {
                        statePc = 368;
                    } else {
                        statePc = 369;
                    }
                    continue stateLoop;
                }
                case 368: {
                    this.field_r = 6;
                    statePc = 369;
                    continue stateLoop;
                }
                case 369: {
                    if (-50 == (ki.field_d ^ -1)) {
                        statePc = 372;
                    } else {
                        statePc = 375;
                    }
                    continue stateLoop;
                }
                case 372: {
                    this.field_r = this.field_r + 1;
                    if (this.field_r != 7) {
                        statePc = 375;
                    } else {
                        statePc = 373;
                    }
                    continue stateLoop;
                }
                case 373: {
                    this.field_r = 0;
                    statePc = 375;
                    continue stateLoop;
                }
                case 375: {
                    if (-65 != (ki.field_d ^ -1)) {
                        statePc = 381;
                    } else {
                        statePc = 376;
                    }
                    continue stateLoop;
                }
                case 376: {
                    this.field_G = this.field_G - 1;
                    if (-1 >= (this.field_G ^ -1)) {
                        statePc = 381;
                    } else {
                        statePc = 379;
                    }
                    continue stateLoop;
                }
                case 379: {
                    this.field_G = 6;
                    statePc = 381;
                    continue stateLoop;
                }
                case 381: {
                    if (32 == ki.field_d) {
                        statePc = 384;
                    } else {
                        statePc = 389;
                    }
                    continue stateLoop;
                }
                case 384: {
                    stackIn_387_0 = this;
                    stackIn_385_0 = stackIn_387_0;
                    if (this.field_Q) {
                        statePc = 387;
                    } else {
                        statePc = 385;
                    }
                    continue stateLoop;
                }
                case 385: {
                    stackIn_388_0 = this;
                    stackIn_388_1 = 1;
                    statePc = 388;
                    continue stateLoop;
                }
                case 387: {
                    stackIn_388_0 = this;
                    stackIn_388_1 = 0;
                    statePc = 388;
                    continue stateLoop;
                }
                case 388: {
                    ((gh) (this)).field_Q = stackIn_388_1 != 0;
                    statePc = 389;
                    continue stateLoop;
                }
                case 389: {
                    if (ki.field_d != 65) {
                        statePc = 394;
                    } else {
                        statePc = 390;
                    }
                    continue stateLoop;
                }
                case 390: {
                    this.field_G = this.field_G + 1;
                    if ((this.field_G ^ -1) == -8) {
                        statePc = 393;
                    } else {
                        statePc = 394;
                    }
                    continue stateLoop;
                }
                case 393: {
                    this.field_G = 0;
                    statePc = 394;
                    continue stateLoop;
                }
                case 394: {
                    if ((ki.field_d ^ -1) == -17) {
                        statePc = 397;
                    } else {
                        statePc = 398;
                    }
                    continue stateLoop;
                }
                case 397: {
                    this.field_d = true;
                    statePc = 398;
                    continue stateLoop;
                }
                case 398: {
                    if (68 != ki.field_d) {
                        statePc = 401;
                    } else {
                        statePc = 399;
                    }
                    continue stateLoop;
                }
                case 399: {
                    this.field_bb = 1;
                    this.field_K = true;
                    statePc = 401;
                    continue stateLoop;
                }
                case 401: {
                    if (ki.field_d == 1) {
                        statePc = 404;
                    } else {
                        statePc = 409;
                    }
                    continue stateLoop;
                }
                case 404: {
                    this.field_K = true;
                    stackIn_407_0 = this;
                    stackIn_405_0 = stackIn_407_0;
                    if (this.field_j) {
                        statePc = 407;
                    } else {
                        statePc = 405;
                    }
                    continue stateLoop;
                }
                case 405: {
                    stackIn_408_0 = this;
                    stackIn_408_1 = 1;
                    statePc = 408;
                    continue stateLoop;
                }
                case 407: {
                    stackIn_408_0 = this;
                    stackIn_408_1 = 0;
                    statePc = 408;
                    continue stateLoop;
                }
                case 408: {
                    ((gh) (this)).field_j = stackIn_408_1 != 0;
                    statePc = 409;
                    continue stateLoop;
                }
                case 409: {
                    if (2 != ki.field_d) {
                        statePc = 417;
                    } else {
                        statePc = 410;
                    }
                    continue stateLoop;
                }
                case 410: {
                    stackIn_415_0 = this;
                    stackIn_411_0 = stackIn_415_0;
                    if (this.field_N) {
                        statePc = 415;
                    } else {
                        statePc = 411;
                    }
                    continue stateLoop;
                }
                case 411: {
                    stackIn_413_0 = this;
                    statePc = 413;
                    continue stateLoop;
                }
                case 413: {
                    stackIn_416_0 = this;
                    stackIn_416_1 = 1;
                    statePc = 416;
                    continue stateLoop;
                }
                case 415: {
                    stackIn_416_0 = this;
                    stackIn_416_1 = 0;
                    statePc = 416;
                    continue stateLoop;
                }
                case 416: {
                    ((gh) (this)).field_N = stackIn_416_1 != 0;
                    this.field_K = true;
                    statePc = 417;
                    continue stateLoop;
                }
                case 417: {
                    if ((ki.field_d ^ -1) != -4) {
                        statePc = 420;
                    } else {
                        statePc = 418;
                    }
                    continue stateLoop;
                }
                case 418: {
                    ag.field_k = 7;
                    f.field_qb = 7;
                    statePc = 420;
                    continue stateLoop;
                }
                case 420: {
                    if ((ki.field_d ^ -1) == -5) {
                        statePc = 423;
                    } else {
                        statePc = 424;
                    }
                    continue stateLoop;
                }
                case 423: {
                    hd.f(2);
                    this.field_K = true;
                    statePc = 424;
                    continue stateLoop;
                }
                case 424: {
                    if ((ki.field_d ^ -1) != -6) {
                        statePc = 427;
                    } else {
                        statePc = 425;
                    }
                    continue stateLoop;
                }
                case 425: {
                    c.field_ab = 1;
                    hf.a(param0 ^ 1578896207, c.field_ab);
                    cd.a((byte) 110);
                    statePc = 427;
                    continue stateLoop;
                }
                case 427: {
                    if ((ki.field_d ^ -1) != -7) {
                        statePc = 430;
                    } else {
                        statePc = 428;
                    }
                    continue stateLoop;
                }
                case 428: {
                    c.field_ab = 0;
                    hf.a(-126, c.field_ab);
                    cd.a((byte) 126);
                    statePc = 430;
                    continue stateLoop;
                }
                case 430: {
                    if (7 == ki.field_d) {
                        statePc = 433;
                    } else {
                        statePc = 434;
                    }
                    continue stateLoop;
                }
                case 433: {
                    c.field_ab = 6;
                    hf.a(-99, c.field_ab);
                    cd.a((byte) 113);
                    statePc = 434;
                    continue stateLoop;
                }
                case 434: {
                    if (ki.field_d == 8) {
                        statePc = 437;
                    } else {
                        statePc = 438;
                    }
                    continue stateLoop;
                }
                case 437: {
                    c.field_ab = 5;
                    hf.a(-124, c.field_ab);
                    cd.a((byte) 115);
                    statePc = 438;
                    continue stateLoop;
                }
                case 438: {
                    if (-10 != (ki.field_d ^ -1)) {
                        statePc = 441;
                    } else {
                        statePc = 439;
                    }
                    continue stateLoop;
                }
                case 439: {
                    c.field_ab = 3;
                    hf.a(-98, c.field_ab);
                    cd.a((byte) 122);
                    statePc = 441;
                    continue stateLoop;
                }
                case 441: {
                    if (10 != ki.field_d) {
                        statePc = 444;
                    } else {
                        statePc = 442;
                    }
                    continue stateLoop;
                }
                case 442: {
                    c.field_ab = 4;
                    hf.a(param0 ^ 1578896198, c.field_ab);
                    cd.a((byte) 101);
                    statePc = 444;
                    continue stateLoop;
                }
                case 444: {
                    if ((ki.field_d ^ -1) == -12) {
                        statePc = 447;
                    } else {
                        statePc = 448;
                    }
                    continue stateLoop;
                }
                case 447: {
                    c.field_ab = 2;
                    hf.a(-118, c.field_ab);
                    cd.a((byte) 82);
                    statePc = 448;
                    continue stateLoop;
                }
                case 448: {
                    if (ki.field_d == 12) {
                        statePc = 451;
                    } else {
                        statePc = 456;
                    }
                    continue stateLoop;
                }
                case 451: {
                    stackIn_454_0 = this;
                    stackIn_452_0 = stackIn_454_0;
                    if (this.field_V) {
                        statePc = 454;
                    } else {
                        statePc = 452;
                    }
                    continue stateLoop;
                }
                case 452: {
                    stackIn_455_0 = this;
                    stackIn_455_1 = 1;
                    statePc = 455;
                    continue stateLoop;
                }
                case 454: {
                    stackIn_455_0 = this;
                    stackIn_455_1 = 0;
                    statePc = 455;
                    continue stateLoop;
                }
                case 455: {
                    ((gh) (this)).field_V = stackIn_455_1 != 0;
                    statePc = 456;
                    continue stateLoop;
                }
                case 456: {
                    if (36 != ki.field_d) {
                        statePc = 459;
                    } else {
                        statePc = 457;
                    }
                    continue stateLoop;
                }
                case 457: {
                    c.field_ab = c.field_ab + 1;
                    c.field_ab = c.field_ab % 7;
                    cd.a((byte) 108);
                    statePc = 459;
                    continue stateLoop;
                }
                case 459: {
                    if ((ki.field_d ^ -1) == -40) {
                        statePc = 462;
                    } else {
                        statePc = 293;
                    }
                    continue stateLoop;
                }
                case 462: {
                    this.field_h = true;
                    if (var5 == 0) {
                        statePc = 293;
                    } else {
                        statePc = 463;
                    }
                    continue stateLoop;
                }
                case 463: {
                    stackIn_464_0 = bi.field_g ^ -1;
                    stackIn_464_1 = -1;
                    statePc = 464;
                    continue stateLoop;
                }
                case 464: {
                    if (stackIn_464_0 == stackIn_464_1) {
                        statePc = 522;
                    } else {
                        statePc = 465;
                    }
                    continue stateLoop;
                }
                case 465: {
                    if (!this.field_j) {
                        statePc = 473;
                    } else {
                        statePc = 468;
                    }
                    continue stateLoop;
                }
                case 468: {
                    if ((oc.field_f ^ -1) > -3) {
                        statePc = 473;
                    } else {
                        statePc = 471;
                    }
                    continue stateLoop;
                }
                case 471: {
                    nb.a(-28195, mc.field_a, this.field_G, he.field_d, this.field_r, this.field_Q);
                    statePc = 473;
                    continue stateLoop;
                }
                case 473: {
                    if (!this.field_Y) {
                        statePc = 522;
                    } else {
                        statePc = 474;
                    }
                    continue stateLoop;
                }
                case 474: {
                    if ((this.field_t ^ -1) != -1) {
                        statePc = 522;
                    } else {
                        statePc = 477;
                    }
                    continue stateLoop;
                }
                case 477: {
                    if (-6 == (this.field_p ^ -1)) {
                        statePc = 496;
                    } else {
                        statePc = 480;
                    }
                    continue stateLoop;
                }
                case 480: {
                    this.field_C = false;
                    this.field_t = 1;
                    if (this.field_p != 0) {
                        statePc = 486;
                    } else {
                        statePc = 483;
                    }
                    continue stateLoop;
                }
                case 483: {
                    this.field_U = 0;
                    if (var5 == 0) {
                        statePc = 522;
                    } else {
                        statePc = 486;
                    }
                    continue stateLoop;
                }
                case 486: {
                    if ((this.field_p ^ -1) != -2) {
                        statePc = 492;
                    } else {
                        statePc = 489;
                    }
                    continue stateLoop;
                }
                case 489: {
                    this.field_U = dd.field_D;
                    if (var5 == 0) {
                        statePc = 522;
                    } else {
                        statePc = 492;
                    }
                    continue stateLoop;
                }
                case 492: {
                    if ((this.field_p ^ -1) == -3) {
                        statePc = 495;
                    } else {
                        statePc = 522;
                    }
                    continue stateLoop;
                }
                case 495: {
                    this.field_U = dk.field_b;
                    if (var5 == 0) {
                        statePc = 522;
                    } else {
                        statePc = 496;
                    }
                    continue stateLoop;
                }
                case 496: {
                    if (-101 <= (mc.field_a ^ -1)) {
                        statePc = 509;
                    } else {
                        statePc = 499;
                    }
                    continue stateLoop;
                }
                case 499: {
                    if (340 <= mc.field_a) {
                        statePc = 509;
                    } else {
                        statePc = 502;
                    }
                    continue stateLoop;
                }
                case 502: {
                    if (-441 <= (he.field_d ^ -1)) {
                        statePc = 509;
                    } else {
                        statePc = 505;
                    }
                    continue stateLoop;
                }
                case 505: {
                    if (476 > he.field_d) {
                        statePc = 508;
                    } else {
                        statePc = 509;
                    }
                    continue stateLoop;
                }
                case 508: {
                    this.c(param0 ^ -1578897511);
                    this.field_p = 0;
                    this.field_Y = true;
                    this.field_C = true;
                    statePc = 509;
                    continue stateLoop;
                }
                case 509: {
                    if (mc.field_a <= 380) {
                        statePc = 522;
                    } else {
                        statePc = 510;
                    }
                    continue stateLoop;
                }
                case 510: {
                    if (540 <= mc.field_a) {
                        statePc = 522;
                    } else {
                        statePc = 513;
                    }
                    continue stateLoop;
                }
                case 513: {
                    if (he.field_d <= 440) {
                        statePc = 522;
                    } else {
                        statePc = 516;
                    }
                    continue stateLoop;
                }
                case 516: {
                    if ((he.field_d ^ -1) > -477) {
                        statePc = 519;
                    } else {
                        statePc = 522;
                    }
                    continue stateLoop;
                }
                case 519: {
                    this.field_C = false;
                    this.field_t = 1;
                    statePc = 522;
                    continue stateLoop;
                }
                case 522: {
                    return;
                }
                case 523: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        CharSequence var7;
        CharSequence var8;
        var6 = Geoblox.field_C;
        if (!this.field_Y) {
          L0: {
            L1: {
              this.field_o = this.field_o + param1;
              if ((this.field_o ^ -1) >= -10000000) {
                break L1;
              } else {
                var7 = (CharSequence) ((Object) Integer.toString(9999999));
                td.a(var7, this.field_X, 0, 47);
                if (var6 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var8 = (CharSequence) ((Object) Integer.toString(this.field_o));
            td.a(var8, this.field_X, 0, 69);
            break L0;
          }
          L2: {
            var3 = param1;
            if (param0 == 127) {
              break L2;
            } else {
              this.e(-17);
              break L2;
            }
          }
          L3: {
            L4: {
              var4 = kd.field_c % 3;
              if ((var4 ^ -1) == -1) {
                break L4;
              } else {
                L5: {
                  if (var4 != 1) {
                    break L5;
                  } else {
                    ml.field_r = ml.field_r - var3;
                    if (var6 == 0) {
                      break L3;
                    } else {
                      break L5;
                    }
                  }
                }
                var5 = var3 / 3;
                oa.field_a = oa.field_a + var5;
                ml.field_r = ml.field_r - (var3 - var5);
                if (var6 == 0) {
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            oa.field_a = oa.field_a + var3;
            break L3;
          }
          L6: {
            if (!da.a(0, -117)) {
              break L6;
            } else {
              if (this.field_o < 7000) {
                break L6;
              } else {
                ra.a(239, -120, 16);
                break L6;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void i(int param0) {
        L0: {
          field_m = null;
          field_z = null;
          if (param0 == -17199) {
            break L0;
          } else {
            field_P = 53;
            break L0;
          }
        }
    }

    final void d(byte param0) {
        L0: {
          if (param0 == 116) {
            break L0;
          } else {
            this.field_o = -46;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_Y) {
              break L2;
            } else {
              this.field_x = true;
              this.field_L = true;
              this.c(false);
              this.a((byte) 127, wa.a(-25866));
              this.e((byte) -70);
              if (Geoblox.field_C == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          this.field_p = 5;
          this.field_t = 0;
          this.field_C = true;
          break L1;
        }
    }

    final boolean b(boolean param0) {
        int stackIn_9_0 = 0;
        if (param0) {
          L0: {
            L1: {
              if (this.field_H) {
                break L1;
              } else {
                if (0 == this.field_bb) {
                  stackIn_9_0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackIn_9_0 = 1;
            break L0;
          }
          return stackIn_9_0 != 0;
        } else {
          return true;
        }
    }

    private final void b(int param0) {
        int var3;
        L0: {
          L1: {
            var3 = Geoblox.field_C;
            if (-3 != (this.field_t ^ -1)) {
              break L1;
            } else {
              this.field_p = this.field_p + 1;
              this.field_C = true;
              this.field_t = 0;
              if (var3 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          if (1 != this.field_t) {
            break L0;
          } else {
            L2: {
              L3: {
                if ((this.field_p ^ -1) == -4) {
                  break L3;
                } else {
                  if (this.field_p != 5) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              this.c(7000);
              break L2;
            }
            L4: {
              if (!this.field_d) {
                break L4;
              } else {
                this.field_d = false;
                this.field_t = 2;
                break L4;
              }
            }
            L5: {
              if (-1 != (this.field_p ^ -1)) {
                break L5;
              } else {
                if (-451 <= (this.field_U ^ -1)) {
                  break L5;
                } else {
                  this.field_t = 2;
                  if (var3 == 0) {
                    break L0;
                  } else {
                    break L5;
                  }
                }
              }
            }
            L6: {
              L7: {
                if (this.field_p != 1) {
                  break L7;
                } else {
                  if (0 < dd.field_D + -this.field_U) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              if (this.field_p != 2) {
                break L0;
              } else {
                if ((dk.field_b + -this.field_U ^ -1) >= -1) {
                  break L0;
                } else {
                  this.field_t = 2;
                  if (var3 == 0) {
                    break L0;
                  } else {
                    break L6;
                  }
                }
              }
            }
            this.field_t = 2;
            break L0;
          }
        }
        L8: {
          if (param0 >= 59) {
            break L8;
          } else {
            this.field_N = true;
            break L8;
          }
        }
    }

    private final void b(byte param0) {
        int fieldTemp$0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Geoblox.field_C;
                    if (-1 == (this.field_D ^ -1)) {
                        statePc = 3;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (this.field_f) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    this.h(122);
                    if (var4 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    this.j(867);
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    this.field_i = true;
                    sf.a(sh.field_y.field_d, 0, oc.field_d.field_v, 0, sh.field_y.field_d.length);
                    le.a((byte) -39);
                    bk.field_a.e();
                    vb.c();
                    i.field_a.a(this.field_w + 320, this.field_u + 240, 16777215);
                    sh.field_y.a(255);
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    fieldTemp$0 = this.field_D + 1;
                    this.field_D = this.field_D + 1;
                    if (160 != fieldTemp$0) {
                        statePc = 91;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (!this.field_f) {
                        statePc = 87;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var2 = 0;
                    var3 = 0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (7 <= var3) {
                        statePc = 26;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_27_0 = c.field_ab ^ -1;
                    stackIn_17_0 = stackIn_27_0;
                    stackIn_27_1 = ee.field_B[var3] ^ -1;
                    stackIn_17_1 = stackIn_27_1;
                    if (var4 != 0) {
                        statePc = 27;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (stackIn_17_0 == stackIn_17_1) {
                        statePc = 20;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (0 >= var3) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var2 = ee.field_B[var3 + -1];
                    if (var4 == 0) {
                        statePc = 26;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var2 = ee.field_B[6];
                    if (var4 == 0) {
                        statePc = 26;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var3++;
                    if (var4 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var3 = var2;
                    stackIn_27_0 = 4;
                    stackIn_27_1 = var3;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (stackIn_27_0 != stackIn_27_1) {
                        statePc = 31;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (var4 == 0) {
                        statePc = 64;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if (-2 != (var3 ^ -1)) {
                        statePc = 37;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (var4 == 0) {
                        statePc = 67;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (-4 != (var3 ^ -1)) {
                        statePc = 43;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (var4 == 0) {
                        statePc = 70;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (-1 != (var3 ^ -1)) {
                        statePc = 49;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (var4 == 0) {
                        statePc = 73;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (-7 == (var3 ^ -1)) {
                        statePc = 76;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if (5 != var3) {
                        statePc = 58;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (var4 == 0) {
                        statePc = 79;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    if (2 != var3) {
                        statePc = 85;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (var4 == 0) {
                        statePc = 82;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    ra.a(fa.field_f ^ 255, -61, fa.field_f);
                    if (var4 == 0) {
                        statePc = 87;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    ra.a(255 ^ hj.field_b, -84, hj.field_b);
                    if (var4 == 0) {
                        statePc = 87;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    ra.a(255 ^ ac.field_u, -50, ac.field_u);
                    if (var4 == 0) {
                        statePc = 87;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    ra.a(255 ^ kf.field_d, -71, kf.field_d);
                    if (var4 == 0) {
                        statePc = 87;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    ra.a(255 ^ vi.field_E, -115, vi.field_E);
                    if (var4 == 0) {
                        statePc = 87;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    ra.a(255 ^ jj.field_g, -92, jj.field_g);
                    if (var4 == 0) {
                        statePc = 87;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    ra.a(255 ^ jg.field_a, -121, jg.field_a);
                    if (var4 == 0) {
                        statePc = 87;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    ra.a(hj.field_b ^ 255, -95, hj.field_b);
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    this.field_B = false;
                    this.field_F = true;
                    this.field_i = false;
                    this.field_f = true;
                    this.field_H = false;
                    this.field_D = 0;
                    if (-1 > (ji.field_h ^ -1)) {
                        statePc = 90;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 90: {
                    qe.b(10);
                    ld.b(false);
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    if (param0 <= -76) {
                        statePc = 94;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    this.field_h = true;
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(boolean param0) {
        int var2;
        int var4;
        String var5;
        String var6;
        L0: {
          var4 = Geoblox.field_C;
          if (!param0) {
            break L0;
          } else {
            this.a((byte) 71, 49);
            break L0;
          }
        }
        L1: {
          L2: {
            if (2 != this.field_bb) {
              break L2;
            } else {
              pk.field_k.b(320 + -(this.field_D >> 883830849), 240 + -(this.field_D >> -1807064447), this.field_D, this.field_D, 150);
              lj.field_d.b(this.field_ab, -(lj.field_d.field_o >> -129235807) + 240 - -60);
              dd.field_G.a(sg.field_f, 15 + this.field_ab, 312, 0, -1);
              if (var4 == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          L3: {
            var2 = -this.field_D + 460 + 460;
            if (this.field_bb != 3) {
              break L3;
            } else {
              L4: {
                pk.field_k.b(-(var2 >> 1946680609) + 320, 240 - (var2 >> -835172863), var2, var2, 150);
                lj.field_d.b(-(lj.field_d.field_s >> -1714325343) + 320, -(lj.field_d.field_o >> -174520511) + 240 + 60);
                var5 = Integer.toString(this.field_q);
                dd.field_G.b(var5, 320, 312, 0, -1);
                if (!this.field_R) {
                  break L4;
                } else {
                  dd.field_G.b(ld.field_a, 320, 352, 0, -1);
                  break L4;
                }
              }
              if (var4 == 0) {
                break L1;
              } else {
                break L3;
              }
            }
          }
          k.field_a.d(-(k.field_a.field_s >> 2015782145) + 320, 240 - (k.field_a.field_o >> 738361857), this.field_S - 150 + 150);
          lj.field_d.b(-(lj.field_d.field_s >> 1731342273) + 320, 300 + -(lj.field_d.field_o >> -1256391423));
          var6 = Integer.toString(this.field_q);
          dd.field_G.b(var6, 320, 312, 0, -1);
          if (!this.field_R) {
            break L1;
          } else {
            dd.field_G.b(ld.field_a, 320, 352, 0, -1);
            break L1;
          }
        }
        dd.field_G.a(kd.field_d, 426, 404, 200, 100, 0, -1, 2, 0, 30);
    }

    private final void f(int param0) {
        int fieldTemp$0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_23_0 = 0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ja var12 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = Geoblox.field_C;
                    if (0 == this.field_D) {
                        statePc = 3;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 3: {
                    gf.field_f = 0;
                    if (!sk.a(param0 + -11)) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    this.field_y = 0;
                    return;
                }
                case 5: {
                    this.field_q = this.field_q + 179;
                    this.field_R = a.field_d.c(13519);
                    this.field_S = 150;
                    var12 = i.a((byte) -128);
                    if (null != var12) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    this.field_c = 29;
                    if (var11 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    vf.field_L.e();
                    vb.c();
                    var12.field_J.a(var12.field_J.field_s << -907967581, var12.field_J.field_o << -2077405885, vf.field_L.field_s << -1078669405, vf.field_L.field_o << -1697489437, (int)(65535.0 * ((double)var12.field_u / 6.283185307179586)), 4096);
                    sh.field_y.a(255);
                    var3 = 0;
                    var4 = (int)(var12.field_o + 0.5f) + (-(vf.field_L.field_r >> 585464481) + -320);
                    var5 = -240 + ((int)(var12.field_v + 0.5f) + -(vf.field_L.field_m >> -846006463));
                    var6 = 0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    stackIn_11_0 = var6;
                    stackIn_11_1 = vf.field_L.field_r;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (stackIn_11_0 >= stackIn_11_1) {
                        statePc = 21;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_23_0 = 0;
                    stackIn_13_0 = stackIn_23_0;
                    if (var11 != 0) {
                        statePc = 23;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var7 = stackIn_13_0;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (vf.field_L.field_m <= var7) {
                        statePc = 20;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    stackIn_11_0 = 0;
                    stackIn_16_0 = stackIn_11_0;
                    stackIn_11_1 = vf.field_L.field_v[vf.field_L.field_r * var7 + var6];
                    stackIn_16_1 = stackIn_11_1;
                    if (var11 != 0) {
                        statePc = 11;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (stackIn_16_0 == stackIn_16_1) {
                        statePc = 19;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var8 = var4 + var6;
                    var9 = var7 + var5;
                    var10 = var8 * var8 - -(var9 * var9);
                    if (var10 <= var3) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var3 = var10;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    var7++;
                    if (var11 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var6++;
                    if (var11 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    this.field_c = (int)(0.5 + Math.sqrt((double)var3));
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    this.field_W = 920 + (-(2 * this.field_c) - 58 - 1);
                    stackIn_23_0 = param0 ^ 10;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    ra.a(stackIn_23_0, qf.field_bb);
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    fieldTemp$0 = this.field_D + 1;
                    this.field_D = this.field_D + 1;
                    if (fieldTemp$0 == 150 + this.field_W) {
                        statePc = 63;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (460 <= this.field_D) {
                        statePc = 31;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    this.field_bb = 2;
                    if (var11 == 0) {
                        statePc = 39;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if ((460 + -this.field_D + 460 ^ -1) <= (this.field_c * 2 ^ -1)) {
                        statePc = 37;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    this.field_bb = 4;
                    if (var11 == 0) {
                        statePc = 39;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    this.field_bb = 3;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (3 != this.field_bb) {
                        statePc = 43;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    this.field_q = this.field_q + 7;
                    if (var11 == 0) {
                        statePc = 69;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (-3 == (this.field_bb ^ -1)) {
                        statePc = 52;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if ((this.field_S ^ -1) != -151) {
                        statePc = 51;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    td.a(-348, fl.field_c[28]);
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    this.field_S = this.field_S - 1;
                    if (var11 == 0) {
                        statePc = 69;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if (this.field_M == null) {
                        statePc = 58;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (this.field_M.l()) {
                        statePc = 58;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 58: {
                    var2 = this.field_D * 100 / 460;
                    this.field_M = kl.a(fl.field_c[28], 2 * var2 - -200, 45);
                    ja.a(false, this.field_M);
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    if (this.field_ab <= 320 + -(lj.field_d.field_s >> -1578896191)) {
                        statePc = 69;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    this.field_ab = this.field_ab - 1;
                    if (var11 == 0) {
                        statePc = 69;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    this.field_H = true;
                    this.field_D = 0;
                    this.field_bb = 5;
                    if (!this.field_R) {
                        statePc = 68;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    ld.a(350, 320, 66, 2000);
                    ra.a(eb.field_i ^ 255, param0 + -101, eb.field_i);
                    this.field_B = false;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    ld.a(310, 320, 90, this.field_q);
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    cf.d((byte) 33);
                    f.o(600);
                    if (param0 == 10) {
                        statePc = 72;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    gh.i(-70);
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void e(byte param0) {
        if (param0 != -70) {
            return;
        }
        if (0 < this.field_o && !this.field_K) {
            if (!fh.c(-102)) {
                qf.a(oa.field_a, 22, kb.field_d, 25134, new int[]{this.field_o}, ml.field_r, 65513, 3, gb.field_g);
            }
        }
        ca.field_f = null;
    }

    final void a(int param0, int param1) {
        int var3;
        CharSequence var4;
        CharSequence var5;
        if (this.field_Y) {
          return;
        } else {
          L0: {
            L1: {
              this.field_A = this.field_A + param0;
              if (-100000 <= (this.field_A ^ -1)) {
                break L1;
              } else {
                var4 = (CharSequence) ((Object) Integer.toString(99999));
                td.a(var4, this.field_g, 0, 26);
                if (Geoblox.field_C == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var5 = (CharSequence) ((Object) Integer.toString(this.field_A));
            td.a(var5, this.field_g, 0, 73);
            break L0;
          }
          var3 = -83 % ((-19 - param1) / 54);
          return;
        }
    }

    private final void e(int param0) {
        int var2;
        int var3;
        var3 = Geoblox.field_C;
        if (!this.field_f) {
          return;
        } else {
          L0: {
            L1: {
              if (-1 == (this.field_bb ^ -1)) {
                break L1;
              } else {
                dd.field_G.a(tj.field_a, 426, 404, 200, 100, 0, -1, 2, 0, 30);
                if (var3 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              var2 = -ul.field_b + fa.field_b;
              dd.field_G.field_K[0][wf.field_p] = 15488514;
              dd.field_G.c(w.field_e, 621, 441, 0, -1);
              dd.field_G.field_K[0][wf.field_p] = 16689938;
              dd.field_G.c(od.field_b, 621, 468, 0, -1);
              if ((var2 ^ -1) < -11) {
                break L2;
              } else {
                dd.field_G.field_K[0][wf.field_p] = mk.field_k[var2 % 5];
                dd.field_G.c(Integer.toString(var2), 515, 468, 0, -1);
                dd.field_G.field_K[0][wf.field_p] = 16689938;
                if (var3 == 0) {
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (var2 > 99999) {
                break L3;
              } else {
                dd.field_G.c(Integer.toString(var2), 515, 468, 0, -1);
                if (var3 == 0) {
                  break L0;
                } else {
                  break L3;
                }
              }
            }
            dd.field_G.c(Integer.toString(99999), 515, 468, 0, -1);
            break L0;
          }
          L4: {
            if (param0 < -39) {
              break L4;
            } else {
              this.field_q = 7;
              break L4;
            }
          }
          return;
        }
    }

    private final void d(int param0) {
        int var3;
        L0: {
          var3 = Geoblox.field_C;
          if (param0 == 28809) {
            break L0;
          } else {
            this.field_j = true;
            break L0;
          }
        }
        L1: {
          L2: {
            if (fh.c(-93)) {
              break L2;
            } else {
              L3: {
                if (this.field_e > 0) {
                  break L3;
                } else {
                  L4: {
                    if (this.field_o <= 0) {
                      break L4;
                    } else {
                      ai.field_p = 2;
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  ai.field_p = 0;
                  if (var3 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              ai.field_p = 6;
              if (var3 == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          L5: {
            L6: {
              if (this.field_o > 0) {
                break L6;
              } else {
                if ((this.field_e ^ -1) >= -1) {
                  break L5;
                } else {
                  break L6;
                }
              }
            }
            ai.field_p = 4;
            if (var3 == 0) {
              break L1;
            } else {
              break L5;
            }
          }
          ai.field_p = 0;
          break L1;
        }
        fi.a(0, ll.field_d);
    }

    private final void h(int param0) {
        L0: {
          this.field_o = 0;
          this.field_A = 0;
          sc.field_f = 3382;
          el.field_g = 8801;
          ml.field_r = 1385;
          dc.field_a = 0;
          oa.field_a = 4703;
          gb.field_g = 5997;
          kb.field_d = 275;
          lb.field_b = 935;
          this.a((byte) 127, 0);
          this.a(0, -96);
          gf.field_f = 1;
          this.field_y = 1;
          this.field_T = 640;
          td.a((byte) -93);
          if (param0 >= 104) {
            break L0;
          } else {
            gh.i(-111);
            break L0;
          }
        }
    }

    private final void c(byte param0) {
        L0: {
          if (param0 > 40) {
            break L0;
          } else {
            gh.i(100);
            break L0;
          }
        }
    }

    private final void j(int param0) {
        this.field_bb = 0;
        this.field_ab = 640;
        this.field_q = 0;
        this.field_c = 0;
        if (param0 != 867) {
            this.g(20);
        }
        if (ji.field_h >= 41) {
            ra.a(255 ^ pk.field_m, -103, pk.field_m);
        }
        int var2 = uh.b(16);
        c.field_ab = var2;
        cd.a((byte) 116);
        hf.a(param0 ^ -796, var2);
    }

    final void c(boolean param0) {
        if ((this.field_A ^ -1) == -1) {
            return;
        }
        if (param0) {
            this.field_K = true;
        }
        ld.a(34, 20 + (this.field_T - -60), 79, this.field_A);
        td.a(-348, fl.field_c[32]);
        this.field_A = 0;
    }

    gh(Geoblox param0, boolean param1) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        this.field_R = false;
        this.field_T = 640;
        this.field_a = 0;
        this.field_K = false;
        this.field_C = false;
        this.field_Q = false;
        this.field_k = 1;
        this.field_y = 0;
        this.field_N = false;
        this.field_b = false;
        this.field_o = 0;
        this.field_x = false;
        this.field_j = false;
        this.field_d = false;
        this.field_q = 0;
        this.field_f = true;
        this.field_p = 0;
        this.field_t = 0;
        this.field_B = false;
        this.field_h = false;
        this.field_i = false;
        this.field_X = new StringBuilder(5);
        this.field_A = 0;
        this.field_g = new StringBuilder(5);
        this.field_L = false;
        this.field_D = 0;
        this.field_F = false;
        this.field_H = false;
        this.field_ab = 640;
        this.field_S = 150;
        this.field_W = 0;
        this.field_c = 0;
        this.field_bb = 0;
        try {
          L0: {
            L1: {
              this.field_I = param0;
              ug.field_c = 0;
              pb.field_t.c((byte) -126);
              this.field_A = 0;
              this.field_w = -(i.field_a.field_r >> -724246015);
              this.field_Y = param1;
              this.field_C = param1;
              this.field_o = 0;
              this.field_u = -(i.field_a.field_m >> 30070753);
              this.field_J = 0.0f;
              bk.field_a.e();
              vb.c();
              i.field_a.a(320 + this.field_w, this.field_u + 240, 16777215);
              oc.field_d.e();
              vb.c();
              sh.field_y.a(255);
              this.field_H = false;
              this.field_D = 0;
              this.field_F = true;
              this.field_bb = 0;
              this.field_x = false;
              this.a((byte) 127, 0);
              if (!da.a(0, 111)) {
                break L1;
              } else {
                uf.field_h[0] = 14788623;
                uf.field_h[1] = 15439657;
                break L1;
              }
            }
            L2: {
              td.a((byte) -93);
              ja.h(0);
              c.field_ab = ee.field_B[0];
              cd.a((byte) 104);
              this.field_j = false;
              this.field_K = false;
              this.field_N = false;
              this.field_L = false;
              hf.a(-116, 1);
              if (jf.field_a == null) {
                jf.field_a = new dm(ec.field_c.field_r, ec.field_c.field_m);
                break L2;
              } else {
                break L2;
              }
            }
            oa.field_a = 4703;
            kb.field_d = 275;
            lb.field_b = 935;
            dc.field_a = 0;
            ml.field_r = 1385;
            el.field_g = 8801;
            sc.field_f = 3382;
            gb.field_g = 5997;
            this.field_e = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("gh.<init>(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    static {
        field_P = 0;
    }
}
