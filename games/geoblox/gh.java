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
        ((gh) this).field_Y = false;
        ((gh) this).field_H = true;
        if (param0 != 7000) {
            ((gh) this).field_R = true;
        }
        ((gh) this).field_f = false;
        ((gh) this).field_C = false;
    }

    private final void g() {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        var7 = Geoblox.field_C;
        if (0 != ((gh) this).field_t) {
          return;
        } else {
          L0: {
            var8 = uk.a(((gh) this).field_p, 24146);
            var3 = fi.field_d.field_o - fi.field_d.field_q + 2;
            var4 = 460;
            var5 = 30 + fi.field_d.b(var8, var4) * var3;
            var6 = 300;
            if (((gh) this).field_p != 0) {
              if (((gh) this).field_p == 3) {
                var6 = 270;
                break L0;
              } else {
                if (1 == ((gh) this).field_p) {
                  var6 = 280;
                  break L0;
                } else {
                  break L0;
                }
              }
            } else {
              var6 = 232;
              break L0;
            }
          }
          L1: {
            ma.a(var6, 70, 10 + var5, (byte) -92, 500, ll.field_h);
            int discarded$1 = fi.field_d.a(var8, 95, 15 + var6, var4, 300, 1, -1, 0, 0, var3);
            if (((gh) this).field_p != 5) {
              L2: {
                ma.a(440, 240, 36, (byte) -92, 160, eb.field_g);
                if (250 >= qa.field_a) {
                  break L2;
                } else {
                  if (qa.field_a >= 389) {
                    break L2;
                  } else {
                    if (ue.field_e <= 440) {
                      break L2;
                    } else {
                      if (476 <= ue.field_e) {
                        break L2;
                      } else {
                        dd.field_G.field_K[0][wf.field_p] = 15488514;
                        break L2;
                      }
                    }
                  }
                }
              }
              dd.field_G.b(mi.field_y, 320, 468, 0, -1);
              dd.field_G.field_K[0][wf.field_p] = 16689938;
              break L1;
            } else {
              L3: {
                if (qa.field_a <= 100) {
                  break L3;
                } else {
                  if (qa.field_a >= 340) {
                    break L3;
                  } else {
                    if (ue.field_e <= 440) {
                      break L3;
                    } else {
                      if (ue.field_e >= 476) {
                        break L3;
                      } else {
                        dd.field_G.field_K[0][wf.field_p] = 15488514;
                        break L3;
                      }
                    }
                  }
                }
              }
              L4: {
                ma.a(440, 100, 36, (byte) -92, 240, eb.field_g);
                dd.field_G.b(cf.field_j, 220, 468, 0, -1);
                dd.field_G.field_K[0][wf.field_p] = 16689938;
                ma.a(440, 380, 36, (byte) -92, 160, eb.field_g);
                if (380 >= qa.field_a) {
                  break L4;
                } else {
                  if (540 <= qa.field_a) {
                    break L4;
                  } else {
                    if (ue.field_e <= 440) {
                      break L4;
                    } else {
                      if (476 > ue.field_e) {
                        dd.field_G.field_K[0][wf.field_p] = 15488514;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              dd.field_G.b(nk.field_g, var4, 468, 0, -1);
              dd.field_G.field_K[0][wf.field_p] = 16689938;
              break L1;
            }
          }
          return;
        }
    }

    final static boolean a(String param0) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var4 = Geoblox.field_C;
        try {
          try {
            if (d.field_b.startsWith("win")) {
              L0: {
                if (param0.startsWith("http://")) {
                  break L0;
                } else {
                  if (param0.startsWith("https://")) {
                    break L0;
                  } else {
                    return false;
                  }
                }
              }
              var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
              var3 = 0;
              L1: while (true) {
                if (param0.length() <= var3) {
                  Process discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                  stackOut_18_0 = 1;
                  stackIn_19_0 = stackOut_18_0;
                  return stackIn_19_0 != 0;
                } else {
                  if (var2.indexOf((int) param0.charAt(var3)) != -1) {
                    var3++;
                    continue L1;
                  } else {
                    stackOut_15_0 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    return stackIn_16_0 != 0;
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            stackOut_20_0 = 0;
            stackIn_21_0 = stackOut_20_0;
            return stackIn_21_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L2: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2_ref2;
            stackOut_22_1 = new StringBuilder().append("gh.U(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L2;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + false + ')');
        }
    }

    final void a(byte param0) {
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
        int var7 = 0;
        Object var8_ref = null;
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
        tf var17 = null;
        tf var18 = null;
        int stackIn_39_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_38_0 = 0;
        var8_ref = null;
        var14 = Geoblox.field_C;
        if (!ll.field_g[c.field_ab]) {
          L0: {
            var3 = c.field_ab;
            if (var3 != 4) {
              if (var3 != 6) {
                if (var3 != 5) {
                  if (var3 == 0) {
                    var2_ref_String = "jewels";
                    break L0;
                  } else {
                    if (3 != var3) {
                      if (var3 == 2) {
                        var2_ref_String = "sweets";
                        break L0;
                      } else {
                        var2_ref_String = "";
                        break L0;
                      }
                    } else {
                      var2_ref_String = "germs";
                      break L0;
                    }
                  }
                } else {
                  var2_ref_String = "sports";
                  break L0;
                }
              } else {
                var2_ref_String = "space";
                break L0;
              }
            } else {
              var2_ref_String = "baking";
              break L0;
            }
          }
          int discarded$9 = 1;
          var3_ref_String = gf.a(ff.field_l, ll.field_f, var2_ref_String, wi.field_F);
          var4 = 30 + dd.field_G.a(var3_ref_String);
          ma.a(215, 320 - var4 / 2, 50, (byte) -92, var4, ll.field_h);
          dd.field_G.b(var3_ref_String, 320, 250, 0, -1);
          return;
        } else {
          L1: {
            L2: {
              if (!ih.a(0)) {
                break L2;
              } else {
                if (!((gh) this).field_H) {
                  break L2;
                } else {
                  if (!((gh) this).field_i) {
                    break L2;
                  } else {
                    stackOut_36_0 = 1;
                    stackIn_39_0 = stackOut_36_0;
                    break L1;
                  }
                }
              }
            }
            stackOut_38_0 = 0;
            stackIn_39_0 = stackOut_38_0;
            break L1;
          }
          L3: {
            var2 = stackIn_39_0;
            if (var2 != 0) {
              break L3;
            } else {
              if (((gh) this).field_F) {
                L4: {
                  oc.field_d.e();
                  vb.c();
                  if (!((gh) this).field_V) {
                    int discarded$10 = 7838;
                    dc.a();
                    break L4;
                  } else {
                    break L4;
                  }
                }
                k.a(10, 90, 460, -27085, 460);
                ((gh) this).field_F = false;
                break L3;
              } else {
                oc.field_d.e();
                if (!((gh) this).field_V) {
                  gj.f((byte) -63);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
          }
          L5: {
            sh.field_y.a(255);
            mf.field_a.b(0, 0);
            var3 = 4;
            var4 = 4;
            if (param0 < -28) {
              break L5;
            } else {
              ((gh) this).a(-63);
              break L5;
            }
          }
          L6: {
            if (((gh) this).field_L) {
              if (((gh) this).field_D > 266) {
                var3 = 220;
                var4 = 170;
                break L6;
              } else {
                var5_float = (float)((gh) this).field_D / 266.0f;
                var6_float = -var5_float + 1.0f;
                var7_float = var6_float * var6_float;
                var3 = (int)(0.5f + (70.0f * (2.0f * var5_float * var6_float) + 10.0f * var7_float + 220.0f * (var5_float * var5_float)));
                var4 = (int)(170.0f * (var5_float * var5_float) + (var7_float * 10.0f + 140.0f * (var5_float * 2.0f * var6_float)) + 0.5f);
                break L6;
              }
            } else {
              break L6;
            }
          }
          L7: {
            if (!((gh) this).field_Y) {
              L8: {
                lj.field_d.b(var3, var4);
                if (0 != ((gh) this).field_bb) {
                  break L8;
                } else {
                  if (!ih.a(0)) {
                    g.field_i.b(468, 410);
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              vh.field_G.b(446, 410);
              break L7;
            } else {
              L9: {
                var5 = 176 - ((gh) this).field_v / 2;
                if (10 > var5) {
                  var5 = 10;
                  break L9;
                } else {
                  break L9;
                }
              }
              var6 = -fi.field_d.field_q + fi.field_d.field_o;
              var7 = fi.field_d.c(v.field_n, 640) + 40;
              var8 = fi.field_d.b(v.field_n, 640) * var6 - -10;
              ma.a(var5, -(var7 / 2) + 320, 20 + var8, (byte) -92, var7, ll.field_h);
              fi.field_d.b(v.field_n, 320, var5 + 28, 1, -1);
              fi.field_d.b(v.field_n, 319, 28 + var5, 1, -1);
              break L7;
            }
          }
          L10: {
            if (((gh) this).field_Y) {
              break L10;
            } else {
              L11: {
                if (!ih.a(0)) {
                  break L11;
                } else {
                  if (var2 == 0) {
                    break L10;
                  } else {
                    if (0 == ((gh) this).field_bb) {
                      break L11;
                    } else {
                      if (((gh) this).field_bb != 1) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                }
              }
              this.e(-46);
              break L10;
            }
          }
          L12: {
            if (!((gh) this).field_V) {
              h.c(-1);
              break L12;
            } else {
              break L12;
            }
          }
          L13: {
            if (((gh) this).field_V) {
              break L13;
            } else {
              if (var2 == 0) {
                oc.field_d.b(0, 0);
                break L13;
              } else {
                break L13;
              }
            }
          }
          L14: {
            int discarded$11 = 18;
            ij.h();
            if (!((gh) this).field_V) {
              ni.f(484842465);
              break L14;
            } else {
              break L14;
            }
          }
          L15: {
            jf.field_a.e();
            vb.c();
            ec.field_c.b(ec.field_c.field_s << 3, ec.field_c.field_o << 3, jf.field_a.field_s << 3, jf.field_a.field_o << 3, (int)(65535.0 * ((double)(-((gh) this).field_J) / 6.283185307179586)), 4096);
            sh.field_y.a(255);
            w.a(jf.field_a, -(jf.field_a.field_s >> 1) + 320, -(jf.field_a.field_o >> 1) + 240);
            if (!((gh) this).field_V) {
              int discarded$12 = 4740;
              uh.d();
              break L15;
            } else {
              break L15;
            }
          }
          L16: {
            if (!((gh) this).field_s) {
              break L16;
            } else {
              af.field_a.e();
              vb.a(0, 0, vb.field_f, vb.field_b, 1118481);
              var5 = 16777215;
              vb.f(160, 120, 115, 16711680);
              var6 = 20;
              var15 = wd.field_e;
              var8_ref_ja = (ja) (Object) var15.a(false);
              L17: while (true) {
                if (var8_ref_ja == null) {
                  var16 = ji.field_r;
                  var8_ref_ja = (ja) (Object) var16.g(0);
                  L18: while (true) {
                    if (null == var8_ref_ja) {
                      var17 = a.field_d;
                      var8_ref_ja = (ja) (Object) var17.g(0);
                      L19: while (true) {
                        if (var8_ref_ja == null) {
                          var18 = bh.field_c;
                          var8_ref_ja = (ja) (Object) var18.g(0);
                          L20: while (true) {
                            if (var8_ref_ja == null) {
                              L21: {
                                if (!((gh) this).field_Y) {
                                  L22: {
                                    lj.field_d.a(var3 / 2, var4 / 2, lj.field_d.field_s / 2, lj.field_d.field_o / 2, var5);
                                    if (((gh) this).field_bb != 0) {
                                      break L22;
                                    } else {
                                      if (ih.a(0)) {
                                        break L22;
                                      } else {
                                        g.field_i.a(234, 205, g.field_i.field_s / 2, g.field_i.field_o / 2, var5);
                                        break L21;
                                      }
                                    }
                                  }
                                  vh.field_G.a(223, 205, vh.field_G.field_s / 2, vh.field_G.field_o / 2, var5);
                                  break L21;
                                } else {
                                  L23: {
                                    var8 = -(((gh) this).field_v / 2) + 176;
                                    if (var8 >= 10) {
                                      break L23;
                                    } else {
                                      var8 = 10;
                                      break L23;
                                    }
                                  }
                                  var9 = fi.field_d.field_o + -fi.field_d.field_q;
                                  var10 = fi.field_d.c(v.field_n, 640) + 40;
                                  var11 = fi.field_d.b(v.field_n, 640) * var9 - -10;
                                  vb.a((320 - var10 / 2) / 2, var8 / 2, var10 / 2, (20 + var11) / 2, var5);
                                  break L21;
                                }
                              }
                              vb.d(160, 120, 21, 16777215);
                              vb.e(2, 2, 0, 0, vb.field_f, vb.field_b);
                              sh.field_y.a(255);
                              ek.a(vb.field_b, true, af.field_a, 0, vb.field_f, 0);
                              break L16;
                            } else {
                              vb.d((int)(var8_ref_ja.field_o / 2.0f), (int)(var8_ref_ja.field_v / 2.0f), var6, var5);
                              var8_ref_ja = (ja) (Object) var18.d(1);
                              continue L20;
                            }
                          }
                        } else {
                          vb.d((int)(var8_ref_ja.field_o / 2.0f), (int)(var8_ref_ja.field_v / 2.0f), var6, var5);
                          var8_ref_ja = (ja) (Object) var17.d(1);
                          continue L19;
                        }
                      }
                    } else {
                      var9_float = -320.0f + var8_ref_ja.field_o;
                      var10_float = -240.0f + var8_ref_ja.field_v;
                      var11 = (int)(Math.cos((double)el.field_o.field_J) * (double)var9_float - Math.sin((double)el.field_o.field_J) * (double)var10_float + 320.0);
                      var12 = (int)(240.0 + ((double)var9_float * Math.sin((double)el.field_o.field_J) + (double)var10_float * Math.cos((double)el.field_o.field_J)));
                      vb.d(var11 / 2, var12 / 2, var6, var5);
                      var8_ref_ja = (ja) (Object) var16.d(1);
                      continue L18;
                    }
                  }
                } else {
                  L24: {
                    var9_float = -320.0f + var8_ref_ja.field_o;
                    var10_float = -240.0f + var8_ref_ja.field_v;
                    var11 = (int)(320.0 + (Math.cos((double)el.field_o.field_J) * (double)var9_float - Math.sin((double)el.field_o.field_J) * (double)var10_float));
                    var12 = (int)(240.0 + ((double)var9_float * Math.sin((double)el.field_o.field_J) + (double)var10_float * Math.cos((double)el.field_o.field_J)));
                    var13 = 255 - var8_ref_ja.field_r * 255 / var8_ref_ja.field_p;
                    if (11 > var13) {
                      var13 = 11;
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  L25: {
                    if (var13 > 255) {
                      var13 = 255;
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  vb.d(var11 / 2, var12 / 2, var6, var13 << 8 | var13 << 16 | var13);
                  var8_ref_ja = (ja) (Object) var15.b(0);
                  continue L17;
                }
              }
            }
          }
          L26: {
            if (((gh) this).field_Y) {
              int discarded$13 = 2;
              this.g();
              break L26;
            } else {
              L27: {
                if (((gh) this).field_a > 0) {
                  lj.field_d.b(-(lj.field_d.field_s >> 1) + 320, 60 + -(lj.field_d.field_o >> 1) + 240);
                  dd.field_G.b(wl.field_b, 320, 310, 0, -1);
                  break L27;
                } else {
                  break L27;
                }
              }
              L28: {
                eg.field_q[((gh) this).field_l].b(((gh) this).field_T, 4);
                if (640 <= ((gh) this).field_T) {
                  break L28;
                } else {
                  if (0 < ((gh) this).field_A) {
                    dd.field_G.a(wj.a(ic.field_a, new String[1], (byte) -79), ((gh) this).field_T + 20, 34, 0, -1);
                    break L28;
                  } else {
                    break L28;
                  }
                }
              }
              L29: {
                if (((gh) this).field_h) {
                  dd.field_G.a(wj.a(sh.field_z, new String[1], (byte) -26), 400, 50, 0, -1);
                  dd.field_G.a(wj.a(qg.field_e, new String[1], (byte) -71), 400, 80, 0, -1);
                  break L29;
                } else {
                  break L29;
                }
              }
              L30: {
                int discarded$14 = -117;
                bd.a();
                int discarded$15 = 64;
                this.c();
                if (((gh) this).field_L) {
                  lj.field_d.b(var3, var4);
                  if (((gh) this).field_D >= 266) {
                    kh.field_h[6].b(0, 20);
                    kh.field_h[6].c(0, 20, (int)(Math.cos((double)(-266 + ((gh) this).field_D) / 40.0) * -64.0 + 64.0));
                    break L30;
                  } else {
                    kh.field_h[6].b(0, (((gh) this).field_D >> 1) + -113);
                    break L30;
                  }
                } else {
                  break L30;
                }
              }
              L31: {
                dd.field_G.a(wj.a(pa.field_a, new String[1], (byte) -53), 15 + var3, 30 + var4, 0, -1);
                if (!ih.a(0)) {
                  break L31;
                } else {
                  L32: {
                    if (0 == ((gh) this).field_bb) {
                      break L32;
                    } else {
                      if (((gh) this).field_bb != 1) {
                        int discarded$16 = 0;
                        this.a();
                        break L31;
                      } else {
                        break L32;
                      }
                    }
                  }
                  if (var2 != 0) {
                    var5 = 35 + (6 * ((gh) this).field_D + -480);
                    sh.field_y.a(255);
                    vb.e(0, var5, 640, 480);
                    oc.field_d.b(0, 0);
                    vb.e(0, 0, 640, 480);
                    qj.field_c.b(0, -480 + 6 * ((gh) this).field_D);
                    break L31;
                  } else {
                    break L31;
                  }
                }
              }
              int discarded$17 = -1;
              vc.c();
              break L26;
            }
          }
          return;
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4_int = 0;
        ja var4 = null;
        int var5 = 0;
        Object stackIn_219_0 = null;
        Object stackIn_220_0 = null;
        Object stackIn_222_0 = null;
        Object stackIn_223_0 = null;
        Object stackIn_225_0 = null;
        Object stackIn_227_0 = null;
        Object stackIn_228_0 = null;
        int stackIn_228_1 = 0;
        Object stackIn_275_0 = null;
        Object stackIn_277_0 = null;
        Object stackIn_278_0 = null;
        int stackIn_278_1 = 0;
        Object stackIn_326_0 = null;
        Object stackIn_328_0 = null;
        Object stackIn_330_0 = null;
        Object stackIn_331_0 = null;
        int stackIn_331_1 = 0;
        Object stackIn_356_0 = null;
        Object stackIn_358_0 = null;
        Object stackIn_359_0 = null;
        int stackIn_359_1 = 0;
        Object stackIn_376_0 = null;
        Object stackIn_378_0 = null;
        Object stackIn_379_0 = null;
        int stackIn_379_1 = 0;
        Object stackIn_382_0 = null;
        Object stackIn_384_0 = null;
        Object stackIn_386_0 = null;
        Object stackIn_387_0 = null;
        int stackIn_387_1 = 0;
        Object stackIn_423_0 = null;
        Object stackIn_425_0 = null;
        Object stackIn_426_0 = null;
        int stackIn_426_1 = 0;
        Object stackOut_218_0 = null;
        Object stackOut_219_0 = null;
        Object stackOut_220_0 = null;
        Object stackOut_222_0 = null;
        Object stackOut_223_0 = null;
        Object stackOut_225_0 = null;
        int stackOut_225_1 = 0;
        Object stackOut_227_0 = null;
        int stackOut_227_1 = 0;
        Object stackOut_274_0 = null;
        Object stackOut_277_0 = null;
        int stackOut_277_1 = 0;
        Object stackOut_275_0 = null;
        int stackOut_275_1 = 0;
        Object stackOut_325_0 = null;
        Object stackOut_330_0 = null;
        int stackOut_330_1 = 0;
        Object stackOut_326_0 = null;
        Object stackOut_328_0 = null;
        int stackOut_328_1 = 0;
        Object stackOut_355_0 = null;
        Object stackOut_358_0 = null;
        int stackOut_358_1 = 0;
        Object stackOut_356_0 = null;
        int stackOut_356_1 = 0;
        Object stackOut_375_0 = null;
        Object stackOut_378_0 = null;
        int stackOut_378_1 = 0;
        Object stackOut_376_0 = null;
        int stackOut_376_1 = 0;
        Object stackOut_381_0 = null;
        Object stackOut_386_0 = null;
        int stackOut_386_1 = 0;
        Object stackOut_382_0 = null;
        Object stackOut_384_0 = null;
        int stackOut_384_1 = 0;
        Object stackOut_422_0 = null;
        Object stackOut_425_0 = null;
        int stackOut_425_1 = 0;
        Object stackOut_423_0 = null;
        int stackOut_423_1 = 0;
        L0: {
          var5 = Geoblox.field_C;
          lh.a(param0 ^ 1578896222);
          int fieldTemp$12 = ((gh) this).field_v;
          ((gh) this).field_v = ((gh) this).field_v + 1;
          if ((fieldTemp$12 & 15) != 0) {
            break L0;
          } else {
            ((gh) this).field_l = ((gh) this).field_l + ((gh) this).field_k;
            if (7 == ((gh) this).field_l) {
              ((gh) this).field_k = -1;
              break L0;
            } else {
              if (((gh) this).field_l == 0) {
                ((gh) this).field_k = 1;
                break L0;
              } else {
                break L0;
              }
            }
          }
        }
        L1: {
          if (0 == (((gh) this).field_v & 1)) {
            L2: {
              if (-1 != ((gh) this).field_y) {
                break L2;
              } else {
                if (463 < ((gh) this).field_T) {
                  ((gh) this).field_T = ((gh) this).field_T - 1;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (((gh) this).field_y != 1) {
                break L3;
              } else {
                if (((gh) this).field_T < 640) {
                  ((gh) this).field_T = ((gh) this).field_T + 1;
                  break L1;
                } else {
                  break L3;
                }
              }
            }
            if (((gh) this).field_T != 463) {
              break L1;
            } else {
              if (gf.field_f == 0) {
                ((gh) this).field_y = 1;
                el.field_o.c(false);
                break L1;
              } else {
                break L1;
              }
            }
          } else {
            break L1;
          }
        }
        L4: {
          if (((gh) this).field_x) {
            L5: {
              if (((gh) this).field_D != 0) {
                break L5;
              } else {
                fi.a(param0 ^ -1578896191, pi.field_S);
                break L5;
              }
            }
            L6: {
              if (!pf.field_D) {
                break L6;
              } else {
                if (!od.a(-3)) {
                  break L6;
                } else {
                  if (((gh) this).field_D > 1000) {
                    int discarded$13 = 28809;
                    this.d();
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
            }
            fc.a(19);
            cf.d((byte) 24);
            int discarded$14 = 600;
            f.o();
            ((gh) this).field_D = ((gh) this).field_D + 1;
            ((gh) this).field_F = true;
            break L4;
          } else {
            L7: {
              L8: {
                L9: {
                  if (!ih.a(0)) {
                    break L9;
                  } else {
                    if (!((gh) this).field_n) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
                if (((gh) this).field_f) {
                  break L7;
                } else {
                  break L8;
                }
              }
              if (!((gh) this).b(true)) {
                break L7;
              } else {
                L10: {
                  if (0 == ((gh) this).field_bb) {
                    break L10;
                  } else {
                    if (((gh) this).field_bb != 5) {
                      int discarded$15 = 10;
                      this.f();
                      break L4;
                    } else {
                      break L10;
                    }
                  }
                }
                if (((gh) this).field_H) {
                  int discarded$16 = -80;
                  this.b();
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            if (!ll.field_g[c.field_ab]) {
              return;
            } else {
              L11: {
                if (((gh) this).field_E) {
                  var3 = 96;
                  var2 = 97;
                  break L11;
                } else {
                  var2 = 96;
                  var3 = 97;
                  break L11;
                }
              }
              L12: {
                if (kj.field_o[var2]) {
                  L13: {
                    ((gh) this).field_J = ((gh) this).field_J - rc.field_h;
                    int discarded$17 = 38;
                    me.a();
                    var4_int = (ki.field_d + kd.field_c + qa.field_a + he.field_d) % 8;
                    if (var4_int != 0) {
                      if (var4_int != 1) {
                        if (var4_int == 2) {
                          gb.field_g = gb.field_g + 1;
                          oa.field_a = oa.field_a - kb.field_d;
                          break L13;
                        } else {
                          if (3 != var4_int) {
                            if (4 != var4_int) {
                              if (var4_int != 5) {
                                if (var4_int != 6) {
                                  if (var4_int != 7) {
                                    break L13;
                                  } else {
                                    kb.field_d = kb.field_d - 1;
                                    ml.field_r = ml.field_r - gb.field_g;
                                    break L13;
                                  }
                                } else {
                                  ml.field_r = ml.field_r - kb.field_d;
                                  gb.field_g = gb.field_g - 1;
                                  break L13;
                                }
                              } else {
                                kb.field_d = kb.field_d + 1;
                                ml.field_r = ml.field_r + gb.field_g;
                                break L13;
                              }
                            } else {
                              ml.field_r = ml.field_r + kb.field_d;
                              gb.field_g = gb.field_g + 1;
                              break L13;
                            }
                          } else {
                            oa.field_a = oa.field_a - gb.field_g;
                            kb.field_d = kb.field_d + 1;
                            break L13;
                          }
                        }
                      } else {
                        oa.field_a = oa.field_a + gb.field_g;
                        kb.field_d = kb.field_d - 1;
                        break L13;
                      }
                    } else {
                      oa.field_a = oa.field_a + kb.field_d;
                      gb.field_g = gb.field_g - 1;
                      break L13;
                    }
                  }
                  L14: {
                    var4_int = (kd.field_c + he.field_d + qa.field_a - -ki.field_d) % 5;
                    if (0 != var4_int) {
                      if (var4_int == 1) {
                        el.field_g = el.field_g + sc.field_f;
                        lb.field_b = lb.field_b + 1;
                        break L14;
                      } else {
                        if (var4_int == 2) {
                          lb.field_b = lb.field_b - 1;
                          el.field_g = el.field_g - sc.field_f;
                          break L14;
                        } else {
                          if (3 != var4_int) {
                            if (var4_int != 4) {
                              break L14;
                            } else {
                              sc.field_f = sc.field_f - 1;
                              el.field_g = el.field_g - lb.field_b;
                              break L14;
                            }
                          } else {
                            sc.field_f = sc.field_f + 1;
                            el.field_g = el.field_g + lb.field_b;
                            break L14;
                          }
                        }
                      }
                    } else {
                      dc.field_a = dc.field_a | lb.field_b + el.field_g << 17;
                      break L14;
                    }
                  }
                  if (((gh) this).field_p != 0) {
                    break L12;
                  } else {
                    ((gh) this).field_U = ((gh) this).field_U + 1;
                    break L12;
                  }
                } else {
                  break L12;
                }
              }
              L15: {
                if (!kj.field_o[var3]) {
                  break L15;
                } else {
                  L16: {
                    ((gh) this).field_J = ((gh) this).field_J + rc.field_h;
                    wd.a((byte) 74);
                    if (((gh) this).field_p != 0) {
                      break L16;
                    } else {
                      ((gh) this).field_U = ((gh) this).field_U + 1;
                      break L16;
                    }
                  }
                  L17: {
                    var4_int = (he.field_d + (qa.field_a - -kd.field_c) + ki.field_d) % 8;
                    if (var4_int == 0) {
                      gb.field_g = gb.field_g - 1;
                      oa.field_a = oa.field_a + kb.field_d;
                      break L17;
                    } else {
                      if (1 == var4_int) {
                        oa.field_a = oa.field_a + gb.field_g;
                        kb.field_d = kb.field_d - 1;
                        break L17;
                      } else {
                        if (var4_int == 2) {
                          gb.field_g = gb.field_g + 1;
                          oa.field_a = oa.field_a - kb.field_d;
                          break L17;
                        } else {
                          if (var4_int != 3) {
                            if (4 != var4_int) {
                              if (5 != var4_int) {
                                if (var4_int != 6) {
                                  if (var4_int == 7) {
                                    kb.field_d = kb.field_d - 1;
                                    ml.field_r = ml.field_r - gb.field_g;
                                    break L17;
                                  } else {
                                    break L17;
                                  }
                                } else {
                                  ml.field_r = ml.field_r - kb.field_d;
                                  gb.field_g = gb.field_g - 1;
                                  break L17;
                                }
                              } else {
                                kb.field_d = kb.field_d + 1;
                                ml.field_r = ml.field_r + gb.field_g;
                                break L17;
                              }
                            } else {
                              gb.field_g = gb.field_g + 1;
                              ml.field_r = ml.field_r + kb.field_d;
                              break L17;
                            }
                          } else {
                            kb.field_d = kb.field_d + 1;
                            oa.field_a = oa.field_a - gb.field_g;
                            break L17;
                          }
                        }
                      }
                    }
                  }
                  var4_int = (kd.field_c + qa.field_a - -he.field_d + ki.field_d) % 5;
                  if (var4_int == 0) {
                    dc.field_a = dc.field_a | el.field_g + lb.field_b << 17;
                    break L15;
                  } else {
                    if (1 == var4_int) {
                      lb.field_b = lb.field_b + 1;
                      el.field_g = el.field_g + sc.field_f;
                      break L15;
                    } else {
                      if (2 == var4_int) {
                        lb.field_b = lb.field_b - 1;
                        el.field_g = el.field_g - sc.field_f;
                        break L15;
                      } else {
                        if (var4_int != 3) {
                          if (4 == var4_int) {
                            el.field_g = el.field_g - lb.field_b;
                            sc.field_f = sc.field_f - 1;
                            break L15;
                          } else {
                            break L15;
                          }
                        } else {
                          sc.field_f = sc.field_f + 1;
                          el.field_g = el.field_g + lb.field_b;
                          break L15;
                        }
                      }
                    }
                  }
                }
              }
              L18: {
                if (!kj.field_o[99]) {
                  break L18;
                } else {
                  if (((gh) this).field_C) {
                    break L18;
                  } else {
                    var4 = (ja) (Object) ji.field_r.g(0);
                    L19: while (true) {
                      if (null == var4) {
                        break L18;
                      } else {
                        if (!var4.field_B) {
                          var4.field_v = var4.field_v + 4.0f * var4.field_F;
                          var4.field_o = var4.field_o + 4.0f * var4.field_w;
                          break L18;
                        } else {
                          var4 = (ja) (Object) ji.field_r.d(1);
                          continue L19;
                        }
                      }
                    }
                  }
                }
              }
              L20: {
                if (kj.field_o[var3]) {
                  break L20;
                } else {
                  if (kj.field_o[var2]) {
                    break L20;
                  } else {
                    int discarded$18 = -106;
                    jj.b();
                    break L20;
                  }
                }
              }
              L21: {
                ((gh) this).field_a = ((gh) this).field_a - 1;
                if (((gh) this).field_a != 0) {
                  break L21;
                } else {
                  ld.a(310, 320, 123, 100 + 100 * ji.field_h);
                  break L21;
                }
              }
              L22: {
                L23: {
                  stackOut_218_0 = this;
                  stackIn_227_0 = stackOut_218_0;
                  stackIn_219_0 = stackOut_218_0;
                  if (fa.field_a) {
                    break L23;
                  } else {
                    stackOut_219_0 = this;
                    stackIn_227_0 = stackOut_219_0;
                    stackIn_220_0 = stackOut_219_0;
                    if (!a.field_d.c(13519)) {
                      break L23;
                    } else {
                      stackOut_220_0 = this;
                      stackIn_222_0 = stackOut_220_0;
                      stackOut_222_0 = this;
                      stackIn_227_0 = stackOut_222_0;
                      stackIn_223_0 = stackOut_222_0;
                      if (0 >= ul.field_b) {
                        break L23;
                      } else {
                        stackOut_223_0 = this;
                        stackIn_225_0 = stackOut_223_0;
                        stackOut_225_0 = this;
                        stackOut_225_1 = 1;
                        stackIn_228_0 = stackOut_225_0;
                        stackIn_228_1 = stackOut_225_1;
                        break L22;
                      }
                    }
                  }
                }
                stackOut_227_0 = this;
                stackOut_227_1 = 0;
                stackIn_228_0 = stackOut_227_0;
                stackIn_228_1 = stackOut_227_1;
                break L22;
              }
              L24: {
                L25: {
                  ((gh) this).field_b = stackIn_228_1 != 0;
                  if (!((gh) this).field_b) {
                    break L25;
                  } else {
                    if (!((gh) this).field_B) {
                      break L25;
                    } else {
                      ((gh) this).field_B = false;
                      ((gh) this).field_a = 300;
                      ((gh) this).field_b = false;
                      ra.a(le.field_a ^ 255, -88, le.field_a);
                      break L24;
                    }
                  }
                }
                ((gh) this).field_B = false;
                break L24;
              }
              L26: {
                ((gh) this).field_Z = ab.field_f;
                int discarded$19 = -15;
                ef.b();
                kc.b(param0 + 1578896101);
                if (ab.field_f) {
                  int discarded$20 = -2;
                  ul.b();
                  break L26;
                } else {
                  break L26;
                }
              }
              L27: {
                ((gh) this).field_n = ec.b(-18913);
                if (((gh) this).field_Z) {
                  boolean discarded$21 = sk.a(param0 ^ 1578896190);
                  break L27;
                } else {
                  break L27;
                }
              }
              cf.d((byte) 27);
              int discarded$22 = 600;
              f.o();
              if (((gh) this).field_Y) {
                this.b(109);
                break L4;
              } else {
                break L4;
              }
            }
          }
        }
        L28: {
          if (param0 == -1578896191) {
            break L28;
          } else {
            ((gh) this).field_X = null;
            break L28;
          }
        }
        L29: while (true) {
          if (!hh.a(111)) {
            L30: {
              if (bi.field_g == 0) {
                break L30;
              } else {
                L31: {
                  if (!((gh) this).field_j) {
                    break L31;
                  } else {
                    if (oc.field_f < 2) {
                      break L31;
                    } else {
                      nb.a(-28195, mc.field_a, ((gh) this).field_G, he.field_d, ((gh) this).field_r, ((gh) this).field_Q);
                      break L31;
                    }
                  }
                }
                L32: {
                  if (!((gh) this).field_Y) {
                    break L32;
                  } else {
                    if (((gh) this).field_t != 0) {
                      break L32;
                    } else {
                      if (((gh) this).field_p == 5) {
                        L33: {
                          if (mc.field_a <= 100) {
                            break L33;
                          } else {
                            if (340 <= mc.field_a) {
                              break L33;
                            } else {
                              if (he.field_d <= 440) {
                                break L33;
                              } else {
                                if (476 > he.field_d) {
                                  this.c(param0 ^ -1578897511);
                                  ((gh) this).field_p = 0;
                                  ((gh) this).field_Y = true;
                                  ((gh) this).field_C = true;
                                  break L33;
                                } else {
                                  break L33;
                                }
                              }
                            }
                          }
                        }
                        if (mc.field_a <= 380) {
                          break L32;
                        } else {
                          if (540 <= mc.field_a) {
                            break L32;
                          } else {
                            if (he.field_d <= 440) {
                              break L32;
                            } else {
                              if (he.field_d < 476) {
                                ((gh) this).field_C = false;
                                ((gh) this).field_t = 1;
                                break L32;
                              } else {
                                break L30;
                              }
                            }
                          }
                        }
                      } else {
                        ((gh) this).field_C = false;
                        ((gh) this).field_t = 1;
                        if (((gh) this).field_p != 0) {
                          if (((gh) this).field_p != 1) {
                            if (((gh) this).field_p == 2) {
                              ((gh) this).field_U = dk.field_b;
                              break L30;
                            } else {
                              break L30;
                            }
                          } else {
                            ((gh) this).field_U = dd.field_D;
                            break L30;
                          }
                        } else {
                          ((gh) this).field_U = 0;
                          break L30;
                        }
                      }
                    }
                  }
                }
                break L30;
              }
            }
            return;
          } else {
            L34: {
              if (te.field_a > 0) {
                L35: {
                  pk.field_r = pk.field_r.substring(1) + te.field_a;
                  if (pk.field_r.equalsIgnoreCase("fog")) {
                    L36: {
                      stackOut_274_0 = this;
                      stackIn_277_0 = stackOut_274_0;
                      stackIn_275_0 = stackOut_274_0;
                      if (((gh) this).field_s) {
                        stackOut_277_0 = this;
                        stackOut_277_1 = 0;
                        stackIn_278_0 = stackOut_277_0;
                        stackIn_278_1 = stackOut_277_1;
                        break L36;
                      } else {
                        stackOut_275_0 = this;
                        stackOut_275_1 = 1;
                        stackIn_278_0 = stackOut_275_0;
                        stackIn_278_1 = stackOut_275_1;
                        break L36;
                      }
                    }
                    ((gh) this).field_s = stackIn_278_1 != 0;
                    break L35;
                  } else {
                    break L35;
                  }
                }
                if (oc.field_f < 2) {
                  break L34;
                } else {
                  if (!pk.field_r.equalsIgnoreCase("brk")) {
                    break L34;
                  } else {
                    ((gh) this).field_I.h((byte) 41);
                    break L34;
                  }
                }
              } else {
                break L34;
              }
            }
            if (ki.field_d != 13) {
              L37: {
                if (ki.field_d == 83) {
                  if (!((gh) this).field_Y) {
                    break L37;
                  } else {
                    this.c(7000);
                    break L37;
                  }
                } else {
                  break L37;
                }
              }
              L38: {
                if (ki.field_d != 84) {
                  break L38;
                } else {
                  if (((gh) this).field_t == 0) {
                    ((gh) this).field_t = 1;
                    ((gh) this).field_C = false;
                    if (((gh) this).field_p == 0) {
                      ((gh) this).field_U = 0;
                      break L38;
                    } else {
                      if (((gh) this).field_p == 1) {
                        ((gh) this).field_U = dd.field_D;
                        break L38;
                      } else {
                        if (((gh) this).field_p == 2) {
                          ((gh) this).field_U = dk.field_b;
                          break L38;
                        } else {
                          break L38;
                        }
                      }
                    }
                  } else {
                    break L38;
                  }
                }
              }
              L39: {
                if (ki.field_d != 85) {
                  break L39;
                } else {
                  if (5 != ((gh) this).field_p) {
                    break L39;
                  } else {
                    if (((gh) this).field_t == 0) {
                      this.c(param0 ^ -1578897511);
                      ((gh) this).field_Y = true;
                      ((gh) this).field_p = 0;
                      ((gh) this).field_C = true;
                      break L39;
                    } else {
                      break L39;
                    }
                  }
                }
              }
              L40: {
                if (jg.field_g != ki.field_d) {
                  break L40;
                } else {
                  L41: {
                    stackOut_325_0 = this;
                    stackIn_330_0 = stackOut_325_0;
                    stackIn_326_0 = stackOut_325_0;
                    if (((gh) this).field_E) {
                      stackOut_330_0 = this;
                      stackOut_330_1 = 0;
                      stackIn_331_0 = stackOut_330_0;
                      stackIn_331_1 = stackOut_330_1;
                      break L41;
                    } else {
                      stackOut_326_0 = this;
                      stackIn_328_0 = stackOut_326_0;
                      stackOut_328_0 = this;
                      stackOut_328_1 = 1;
                      stackIn_331_0 = stackOut_328_0;
                      stackIn_331_1 = stackOut_328_1;
                      break L41;
                    }
                  }
                  ((gh) this).field_E = stackIn_331_1 != 0;
                  jc.a(7, false);
                  break L40;
                }
              }
              if (2 > oc.field_f) {
                continue L29;
              } else {
                L42: {
                  if (ki.field_d != 48) {
                    break L42;
                  } else {
                    ((gh) this).field_r = ((gh) this).field_r - 1;
                    if (((gh) this).field_r < 0) {
                      ((gh) this).field_r = 6;
                      break L42;
                    } else {
                      break L42;
                    }
                  }
                }
                L43: {
                  if (ki.field_d == 49) {
                    ((gh) this).field_r = ((gh) this).field_r + 1;
                    if (((gh) this).field_r != 7) {
                      break L43;
                    } else {
                      ((gh) this).field_r = 0;
                      break L43;
                    }
                  } else {
                    break L43;
                  }
                }
                L44: {
                  if (ki.field_d != 64) {
                    break L44;
                  } else {
                    ((gh) this).field_G = ((gh) this).field_G - 1;
                    if (((gh) this).field_G >= 0) {
                      break L44;
                    } else {
                      ((gh) this).field_G = 6;
                      break L44;
                    }
                  }
                }
                L45: {
                  if (32 == ki.field_d) {
                    L46: {
                      stackOut_355_0 = this;
                      stackIn_358_0 = stackOut_355_0;
                      stackIn_356_0 = stackOut_355_0;
                      if (((gh) this).field_Q) {
                        stackOut_358_0 = this;
                        stackOut_358_1 = 0;
                        stackIn_359_0 = stackOut_358_0;
                        stackIn_359_1 = stackOut_358_1;
                        break L46;
                      } else {
                        stackOut_356_0 = this;
                        stackOut_356_1 = 1;
                        stackIn_359_0 = stackOut_356_0;
                        stackIn_359_1 = stackOut_356_1;
                        break L46;
                      }
                    }
                    ((gh) this).field_Q = stackIn_359_1 != 0;
                    break L45;
                  } else {
                    break L45;
                  }
                }
                L47: {
                  if (ki.field_d != 65) {
                    break L47;
                  } else {
                    ((gh) this).field_G = ((gh) this).field_G + 1;
                    if (((gh) this).field_G == 7) {
                      ((gh) this).field_G = 0;
                      break L47;
                    } else {
                      break L47;
                    }
                  }
                }
                L48: {
                  if (ki.field_d == 16) {
                    ((gh) this).field_d = true;
                    break L48;
                  } else {
                    break L48;
                  }
                }
                L49: {
                  if (68 != ki.field_d) {
                    break L49;
                  } else {
                    ((gh) this).field_bb = 1;
                    ((gh) this).field_K = true;
                    break L49;
                  }
                }
                L50: {
                  if (ki.field_d == 1) {
                    L51: {
                      ((gh) this).field_K = true;
                      stackOut_375_0 = this;
                      stackIn_378_0 = stackOut_375_0;
                      stackIn_376_0 = stackOut_375_0;
                      if (((gh) this).field_j) {
                        stackOut_378_0 = this;
                        stackOut_378_1 = 0;
                        stackIn_379_0 = stackOut_378_0;
                        stackIn_379_1 = stackOut_378_1;
                        break L51;
                      } else {
                        stackOut_376_0 = this;
                        stackOut_376_1 = 1;
                        stackIn_379_0 = stackOut_376_0;
                        stackIn_379_1 = stackOut_376_1;
                        break L51;
                      }
                    }
                    ((gh) this).field_j = stackIn_379_1 != 0;
                    break L50;
                  } else {
                    break L50;
                  }
                }
                L52: {
                  if (2 != ki.field_d) {
                    break L52;
                  } else {
                    L53: {
                      stackOut_381_0 = this;
                      stackIn_386_0 = stackOut_381_0;
                      stackIn_382_0 = stackOut_381_0;
                      if (((gh) this).field_N) {
                        stackOut_386_0 = this;
                        stackOut_386_1 = 0;
                        stackIn_387_0 = stackOut_386_0;
                        stackIn_387_1 = stackOut_386_1;
                        break L53;
                      } else {
                        stackOut_382_0 = this;
                        stackIn_384_0 = stackOut_382_0;
                        stackOut_384_0 = this;
                        stackOut_384_1 = 1;
                        stackIn_387_0 = stackOut_384_0;
                        stackIn_387_1 = stackOut_384_1;
                        break L53;
                      }
                    }
                    ((gh) this).field_N = stackIn_387_1 != 0;
                    ((gh) this).field_K = true;
                    break L52;
                  }
                }
                L54: {
                  if (ki.field_d != 3) {
                    break L54;
                  } else {
                    ag.field_k = 7;
                    f.field_qb = 7;
                    break L54;
                  }
                }
                L55: {
                  if (ki.field_d == 4) {
                    hd.f(2);
                    ((gh) this).field_K = true;
                    break L55;
                  } else {
                    break L55;
                  }
                }
                L56: {
                  if (ki.field_d != 5) {
                    break L56;
                  } else {
                    c.field_ab = 1;
                    hf.a(param0 ^ 1578896207, c.field_ab);
                    cd.a((byte) 110);
                    break L56;
                  }
                }
                L57: {
                  if (ki.field_d != 6) {
                    break L57;
                  } else {
                    c.field_ab = 0;
                    hf.a(-126, c.field_ab);
                    cd.a((byte) 126);
                    break L57;
                  }
                }
                L58: {
                  if (7 == ki.field_d) {
                    c.field_ab = 6;
                    hf.a(-99, c.field_ab);
                    cd.a((byte) 113);
                    break L58;
                  } else {
                    break L58;
                  }
                }
                L59: {
                  if (ki.field_d == 8) {
                    c.field_ab = 5;
                    hf.a(-124, c.field_ab);
                    cd.a((byte) 115);
                    break L59;
                  } else {
                    break L59;
                  }
                }
                L60: {
                  if (ki.field_d != 9) {
                    break L60;
                  } else {
                    c.field_ab = 3;
                    hf.a(-98, c.field_ab);
                    cd.a((byte) 122);
                    break L60;
                  }
                }
                L61: {
                  if (10 != ki.field_d) {
                    break L61;
                  } else {
                    c.field_ab = 4;
                    hf.a(param0 ^ 1578896198, c.field_ab);
                    cd.a((byte) 101);
                    break L61;
                  }
                }
                L62: {
                  if (ki.field_d == 11) {
                    c.field_ab = 2;
                    hf.a(-118, c.field_ab);
                    cd.a((byte) 82);
                    break L62;
                  } else {
                    break L62;
                  }
                }
                L63: {
                  if (ki.field_d == 12) {
                    L64: {
                      stackOut_422_0 = this;
                      stackIn_425_0 = stackOut_422_0;
                      stackIn_423_0 = stackOut_422_0;
                      if (((gh) this).field_V) {
                        stackOut_425_0 = this;
                        stackOut_425_1 = 0;
                        stackIn_426_0 = stackOut_425_0;
                        stackIn_426_1 = stackOut_425_1;
                        break L64;
                      } else {
                        stackOut_423_0 = this;
                        stackOut_423_1 = 1;
                        stackIn_426_0 = stackOut_423_0;
                        stackIn_426_1 = stackOut_423_1;
                        break L64;
                      }
                    }
                    ((gh) this).field_V = stackIn_426_1 != 0;
                    break L63;
                  } else {
                    break L63;
                  }
                }
                L65: {
                  if (36 != ki.field_d) {
                    break L65;
                  } else {
                    c.field_ab = c.field_ab + 1;
                    c.field_ab = c.field_ab % 7;
                    cd.a((byte) 108);
                    break L65;
                  }
                }
                if (ki.field_d == 39) {
                  ((gh) this).field_h = true;
                  continue L29;
                } else {
                  continue L29;
                }
              }
            } else {
              if (((gh) this).field_x) {
                int discarded$23 = 28809;
                this.d();
                return;
              } else {
                ai.field_p = 1;
                return;
              }
            }
          }
        }
    }

    final void a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        var6 = Geoblox.field_C;
        if (!((gh) this).field_Y) {
          L0: {
            ((gh) this).field_o = ((gh) this).field_o + param1;
            if (((gh) this).field_o <= 9999999) {
              var8 = (CharSequence) (Object) Integer.toString(((gh) this).field_o);
              StringBuilder discarded$2 = td.a(var8, ((gh) this).field_X, 0, 69);
              break L0;
            } else {
              var7 = (CharSequence) (Object) Integer.toString(9999999);
              StringBuilder discarded$3 = td.a(var7, ((gh) this).field_X, 0, 47);
              break L0;
            }
          }
          L1: {
            var3 = param1;
            if (param0 == 127) {
              break L1;
            } else {
              this.e(-17);
              break L1;
            }
          }
          L2: {
            var4 = kd.field_c % 3;
            if (var4 == 0) {
              oa.field_a = oa.field_a + var3;
              break L2;
            } else {
              if (var4 != 1) {
                var5 = var3 / 3;
                oa.field_a = oa.field_a + var5;
                ml.field_r = ml.field_r - (var3 - var5);
                break L2;
              } else {
                ml.field_r = ml.field_r - var3;
                break L2;
              }
            }
          }
          L3: {
            if (!da.a(0, -117)) {
              break L3;
            } else {
              if (((gh) this).field_o < 7000) {
                break L3;
              } else {
                ra.a(239, -120, 16);
                break L3;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void i() {
        field_m = null;
        field_z = null;
    }

    final void d(byte param0) {
        L0: {
          if (param0 == 116) {
            break L0;
          } else {
            ((gh) this).field_o = -46;
            break L0;
          }
        }
        L1: {
          if (((gh) this).field_Y) {
            ((gh) this).field_p = 5;
            ((gh) this).field_t = 0;
            ((gh) this).field_C = true;
            break L1;
          } else {
            ((gh) this).field_x = true;
            ((gh) this).field_L = true;
            ((gh) this).c(false);
            ((gh) this).a((byte) 127, wa.a(-25866));
            ((gh) this).e((byte) -70);
            break L1;
          }
        }
    }

    final boolean b(boolean param0) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        if (param0) {
          L0: {
            L1: {
              if (((gh) this).field_H) {
                break L1;
              } else {
                if (0 == ((gh) this).field_bb) {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_6_0 = 1;
            stackIn_9_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_9_0 != 0;
        } else {
          return true;
        }
    }

    private final void b(int param0) {
        int var3 = 0;
        L0: {
          var3 = Geoblox.field_C;
          if (((gh) this).field_t != 2) {
            if (1 != ((gh) this).field_t) {
              break L0;
            } else {
              L1: {
                L2: {
                  if (((gh) this).field_p == 3) {
                    break L2;
                  } else {
                    if (((gh) this).field_p != 5) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                this.c(7000);
                break L1;
              }
              L3: {
                if (!((gh) this).field_d) {
                  break L3;
                } else {
                  ((gh) this).field_d = false;
                  ((gh) this).field_t = 2;
                  break L3;
                }
              }
              L4: {
                if (((gh) this).field_p != 0) {
                  break L4;
                } else {
                  if (((gh) this).field_U <= 450) {
                    break L4;
                  } else {
                    ((gh) this).field_t = 2;
                    break L0;
                  }
                }
              }
              L5: {
                if (((gh) this).field_p != 1) {
                  break L5;
                } else {
                  if (0 < dd.field_D + -((gh) this).field_U) {
                    ((gh) this).field_t = 2;
                    break L0;
                  } else {
                    break L5;
                  }
                }
              }
              if (((gh) this).field_p != 2) {
                break L0;
              } else {
                if (dk.field_b + -((gh) this).field_U <= 0) {
                  break L0;
                } else {
                  ((gh) this).field_t = 2;
                  break L0;
                }
              }
            }
          } else {
            ((gh) this).field_p = ((gh) this).field_p + 1;
            ((gh) this).field_C = true;
            ((gh) this).field_t = 0;
            break L0;
          }
        }
    }

    private final void b() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Geoblox.field_C;
          if (((gh) this).field_D == 0) {
            L1: {
              if (((gh) this).field_f) {
                int discarded$4 = 867;
                this.j();
                break L1;
              } else {
                int discarded$5 = 122;
                this.h();
                break L1;
              }
            }
            ((gh) this).field_i = true;
            sf.a(sh.field_y.field_d, 0, oc.field_d.field_v, 0, sh.field_y.field_d.length);
            le.a((byte) -39);
            bk.field_a.e();
            vb.c();
            i.field_a.a(((gh) this).field_w + 320, ((gh) this).field_u + 240, 16777215);
            sh.field_y.a(255);
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          int fieldTemp$6 = ((gh) this).field_D + 1;
          ((gh) this).field_D = ((gh) this).field_D + 1;
          if (160 != fieldTemp$6) {
            break L2;
          } else {
            L3: {
              if (!((gh) this).field_f) {
                break L3;
              } else {
                var2 = 0;
                var3 = 0;
                L4: while (true) {
                  L5: {
                    if (7 <= var3) {
                      break L5;
                    } else {
                      if (~c.field_ab == ~ee.field_B[var3]) {
                        if (0 >= var3) {
                          var2 = ee.field_B[6];
                          break L5;
                        } else {
                          var2 = ee.field_B[var3 + -1];
                          break L5;
                        }
                      } else {
                        var3++;
                        continue L4;
                      }
                    }
                  }
                  var3 = var2;
                  if (4 != var3) {
                    if (var3 != 1) {
                      if (var3 != 3) {
                        if (var3 != 0) {
                          if (var3 == 6) {
                            ra.a(255 ^ vi.field_E, -115, vi.field_E);
                            break L3;
                          } else {
                            if (5 != var3) {
                              if (2 != var3) {
                                ra.a(hj.field_b ^ 255, -95, hj.field_b);
                                break L3;
                              } else {
                                ra.a(255 ^ jg.field_a, -121, jg.field_a);
                                break L3;
                              }
                            } else {
                              ra.a(255 ^ jj.field_g, -92, jj.field_g);
                              break L3;
                            }
                          }
                        } else {
                          ra.a(255 ^ kf.field_d, -71, kf.field_d);
                          break L3;
                        }
                      } else {
                        ra.a(255 ^ ac.field_u, -50, ac.field_u);
                        break L3;
                      }
                    } else {
                      ra.a(255 ^ hj.field_b, -84, hj.field_b);
                      break L3;
                    }
                  } else {
                    ra.a(fa.field_f ^ 255, -61, fa.field_f);
                    break L3;
                  }
                }
              }
            }
            ((gh) this).field_B = false;
            ((gh) this).field_F = true;
            ((gh) this).field_i = false;
            ((gh) this).field_f = true;
            ((gh) this).field_H = false;
            ((gh) this).field_D = 0;
            if (ji.field_h > 0) {
              int discarded$7 = 10;
              qe.b();
              ld.b(false);
              break L2;
            } else {
              break L2;
            }
          }
        }
    }

    private final void a() {
        int var2 = 0;
        int var4 = 0;
        String var5 = null;
        String var6 = null;
        var4 = Geoblox.field_C;
        L0: {
          if (2 != ((gh) this).field_bb) {
            var2 = -((gh) this).field_D + 920;
            if (((gh) this).field_bb != 3) {
              k.field_a.d(-(k.field_a.field_s >> 1) + 320, 240 - (k.field_a.field_o >> 1), ((gh) this).field_S);
              lj.field_d.b(-(lj.field_d.field_s >> 1) + 320, 300 + -(lj.field_d.field_o >> 1));
              var6 = Integer.toString(((gh) this).field_q);
              dd.field_G.b(var6, 320, 312, 0, -1);
              if (!((gh) this).field_R) {
                break L0;
              } else {
                dd.field_G.b(ld.field_a, 320, 352, 0, -1);
                break L0;
              }
            } else {
              pk.field_k.b(-(var2 >> 1) + 320, 240 - (var2 >> 1), var2, var2, 150);
              lj.field_d.b(-(lj.field_d.field_s >> 1) + 320, -(lj.field_d.field_o >> 1) + 300);
              var5 = Integer.toString(((gh) this).field_q);
              dd.field_G.b(var5, 320, 312, 0, -1);
              if (!((gh) this).field_R) {
                break L0;
              } else {
                dd.field_G.b(ld.field_a, 320, 352, 0, -1);
                break L0;
              }
            }
          } else {
            pk.field_k.b(320 + -(((gh) this).field_D >> 1), 240 + -(((gh) this).field_D >> 1), ((gh) this).field_D, ((gh) this).field_D, 150);
            lj.field_d.b(((gh) this).field_ab, -(lj.field_d.field_o >> 1) + 300);
            dd.field_G.a(sg.field_f, 15 + ((gh) this).field_ab, 312, 0, -1);
            break L0;
          }
        }
        int discarded$1 = dd.field_G.a(kd.field_d, 426, 404, 200, 100, 0, -1, 2, 0, 30);
    }

    private final void f() {
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
        L0: {
          var11 = Geoblox.field_C;
          if (0 == ((gh) this).field_D) {
            gf.field_f = 0;
            if (!sk.a(-1)) {
              L1: {
                ((gh) this).field_q = ((gh) this).field_q + 179;
                ((gh) this).field_R = a.field_d.c(13519);
                ((gh) this).field_S = 150;
                int discarded$3 = -128;
                var12 = i.a();
                if (null != var12) {
                  vf.field_L.e();
                  vb.c();
                  var12.field_J.a(var12.field_J.field_s << 3, var12.field_J.field_o << 3, vf.field_L.field_s << 3, vf.field_L.field_o << 3, (int)(65535.0 * ((double)var12.field_u / 6.283185307179586)), 4096);
                  sh.field_y.a(255);
                  var3 = 0;
                  var4 = (int)(var12.field_o + 0.5f) + (-(vf.field_L.field_r >> 1) + -320);
                  var5 = -240 + ((int)(var12.field_v + 0.5f) + -(vf.field_L.field_m >> 1));
                  var6 = 0;
                  L2: while (true) {
                    if (var6 >= vf.field_L.field_r) {
                      ((gh) this).field_c = (int)(0.5 + Math.sqrt((double)var3));
                      break L1;
                    } else {
                      var7 = 0;
                      L3: while (true) {
                        if (vf.field_L.field_m <= var7) {
                          var6++;
                          continue L2;
                        } else {
                          L4: {
                            if (0 == vf.field_L.field_v[vf.field_L.field_r * var7 + var6]) {
                              break L4;
                            } else {
                              var8 = var4 + var6;
                              var9 = var7 + var5;
                              var10 = var8 * var8 - -(var9 * var9);
                              if (var10 <= var3) {
                                break L4;
                              } else {
                                var3 = var10;
                                break L4;
                              }
                            }
                          }
                          var7++;
                          continue L3;
                        }
                      }
                    }
                  }
                } else {
                  ((gh) this).field_c = 29;
                  break L1;
                }
              }
              ((gh) this).field_W = 920 + (-(2 * ((gh) this).field_c) - 59);
              ra.a(0, qf.field_bb);
              break L0;
            } else {
              ((gh) this).field_y = 0;
              return;
            }
          } else {
            break L0;
          }
        }
        L5: {
          int fieldTemp$4 = ((gh) this).field_D + 1;
          ((gh) this).field_D = ((gh) this).field_D + 1;
          if (fieldTemp$4 == 150 + ((gh) this).field_W) {
            L6: {
              ((gh) this).field_H = true;
              ((gh) this).field_D = 0;
              ((gh) this).field_bb = 5;
              if (!((gh) this).field_R) {
                break L6;
              } else {
                ld.a(350, 320, 66, 2000);
                ra.a(eb.field_i ^ 255, -91, eb.field_i);
                ((gh) this).field_B = false;
                break L6;
              }
            }
            ld.a(310, 320, 90, ((gh) this).field_q);
            break L5;
          } else {
            L7: {
              if (460 <= ((gh) this).field_D) {
                if (~(460 + -((gh) this).field_D + 460) <= ~(((gh) this).field_c * 2)) {
                  ((gh) this).field_bb = 3;
                  break L7;
                } else {
                  ((gh) this).field_bb = 4;
                  break L7;
                }
              } else {
                ((gh) this).field_bb = 2;
                break L7;
              }
            }
            if (3 != ((gh) this).field_bb) {
              if (((gh) this).field_bb == 2) {
                L8: {
                  L9: {
                    if (((gh) this).field_M == null) {
                      break L9;
                    } else {
                      if (((gh) this).field_M.l()) {
                        break L9;
                      } else {
                        break L8;
                      }
                    }
                  }
                  var2 = ((gh) this).field_D * 100 / 460;
                  ((gh) this).field_M = kl.a(fl.field_c[28], 2 * var2 - -200, 45);
                  ja.a(false, ((gh) this).field_M);
                  break L8;
                }
                if (((gh) this).field_ab <= 320 + -(lj.field_d.field_s >> 1)) {
                  break L5;
                } else {
                  ((gh) this).field_ab = ((gh) this).field_ab - 1;
                  break L5;
                }
              } else {
                L10: {
                  if (((gh) this).field_S != 150) {
                    break L10;
                  } else {
                    td.a(-348, fl.field_c[28]);
                    break L10;
                  }
                }
                ((gh) this).field_S = ((gh) this).field_S - 1;
                break L5;
              }
            } else {
              ((gh) this).field_q = ((gh) this).field_q + 7;
              break L5;
            }
          }
        }
        cf.d((byte) 33);
        int discarded$5 = 600;
        f.o();
    }

    final void e(byte param0) {
        if (param0 != -70) {
            return;
        }
        if (0 < ((gh) this).field_o) {
            if (!((gh) this).field_K) {
                if (!fh.c(-102)) {
                    ai discarded$0 = qf.a(oa.field_a, 22, kb.field_d, 25134, new int[1], ml.field_r, 65513, 3, gb.field_g);
                }
            }
        }
        ca.field_f = null;
    }

    final void a(int param0, int param1) {
        int var3 = 0;
        CharSequence var4 = null;
        CharSequence var5 = null;
        if (((gh) this).field_Y) {
          return;
        } else {
          L0: {
            ((gh) this).field_A = ((gh) this).field_A + param0;
            if (((gh) this).field_A <= 99999) {
              var5 = (CharSequence) (Object) Integer.toString(((gh) this).field_A);
              StringBuilder discarded$9 = td.a(var5, ((gh) this).field_g, 0, 73);
              break L0;
            } else {
              var4 = (CharSequence) (Object) Integer.toString(99999);
              StringBuilder discarded$10 = td.a(var4, ((gh) this).field_g, 0, 26);
              break L0;
            }
          }
          var3 = -83 % ((-19 - param1) / 54);
          return;
        }
    }

    private final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Geoblox.field_C;
        if (!((gh) this).field_f) {
          return;
        } else {
          L0: {
            if (((gh) this).field_bb == 0) {
              var2 = -ul.field_b + fa.field_b;
              dd.field_G.field_K[0][wf.field_p] = 15488514;
              dd.field_G.c(w.field_e, 621, 441, 0, -1);
              dd.field_G.field_K[0][wf.field_p] = 16689938;
              dd.field_G.c(od.field_b, 621, 468, 0, -1);
              if (var2 > 10) {
                if (var2 > 99999) {
                  dd.field_G.c(Integer.toString(99999), 515, 468, 0, -1);
                  break L0;
                } else {
                  dd.field_G.c(Integer.toString(var2), 515, 468, 0, -1);
                  break L0;
                }
              } else {
                dd.field_G.field_K[0][wf.field_p] = mk.field_k[var2 % 5];
                dd.field_G.c(Integer.toString(var2), 515, 468, 0, -1);
                dd.field_G.field_K[0][wf.field_p] = 16689938;
                break L0;
              }
            } else {
              int discarded$1 = dd.field_G.a(tj.field_a, 426, 404, 200, 100, 0, -1, 2, 0, 30);
              break L0;
            }
          }
          L1: {
            if (param0 < -39) {
              break L1;
            } else {
              ((gh) this).field_q = 7;
              break L1;
            }
          }
          return;
        }
    }

    private final void d() {
        int var3 = 0;
        var3 = Geoblox.field_C;
        L0: {
          if (fh.c(-93)) {
            L1: {
              if (((gh) this).field_o > 0) {
                break L1;
              } else {
                if (((gh) this).field_e <= 0) {
                  ai.field_p = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            ai.field_p = 4;
            break L0;
          } else {
            if (((gh) this).field_e > 0) {
              ai.field_p = 6;
              break L0;
            } else {
              if (((gh) this).field_o <= 0) {
                ai.field_p = 0;
                break L0;
              } else {
                ai.field_p = 2;
                break L0;
              }
            }
          }
        }
        fi.a(0, ll.field_d);
    }

    private final void h() {
        ((gh) this).field_o = 0;
        ((gh) this).field_A = 0;
        sc.field_f = 3382;
        el.field_g = 8801;
        ml.field_r = 1385;
        dc.field_a = 0;
        oa.field_a = 4703;
        gb.field_g = 5997;
        kb.field_d = 275;
        lb.field_b = 935;
        ((gh) this).a((byte) 127, 0);
        ((gh) this).a(0, -96);
        gf.field_f = 1;
        ((gh) this).field_y = 1;
        ((gh) this).field_T = 640;
        int discarded$0 = -93;
        td.a();
    }

    private final void c() {
    }

    private final void j() {
        ((gh) this).field_bb = 0;
        ((gh) this).field_ab = 640;
        ((gh) this).field_q = 0;
        ((gh) this).field_c = 0;
        if (ji.field_h >= 41) {
            ra.a(255 ^ pk.field_m, -103, pk.field_m);
        }
        int var2 = uh.b(16);
        c.field_ab = var2;
        cd.a((byte) 116);
        hf.a(-121, var2);
    }

    final void c(boolean param0) {
        if (((gh) this).field_A == 0) {
            return;
        }
        if (param0) {
            ((gh) this).field_K = true;
        }
        ld.a(34, 20 + (((gh) this).field_T - -60), 79, ((gh) this).field_A);
        td.a(-348, fl.field_c[32]);
        ((gh) this).field_A = 0;
    }

    gh(Geoblox param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        ((gh) this).field_R = false;
        ((gh) this).field_T = 640;
        ((gh) this).field_a = 0;
        ((gh) this).field_K = false;
        ((gh) this).field_C = false;
        ((gh) this).field_Q = false;
        ((gh) this).field_k = 1;
        ((gh) this).field_y = 0;
        ((gh) this).field_N = false;
        ((gh) this).field_b = false;
        ((gh) this).field_o = 0;
        ((gh) this).field_x = false;
        ((gh) this).field_j = false;
        ((gh) this).field_d = false;
        ((gh) this).field_q = 0;
        ((gh) this).field_f = true;
        ((gh) this).field_p = 0;
        ((gh) this).field_t = 0;
        ((gh) this).field_B = false;
        ((gh) this).field_h = false;
        ((gh) this).field_i = false;
        ((gh) this).field_X = new StringBuilder(5);
        ((gh) this).field_A = 0;
        ((gh) this).field_g = new StringBuilder(5);
        ((gh) this).field_L = false;
        ((gh) this).field_D = 0;
        ((gh) this).field_F = false;
        ((gh) this).field_H = false;
        ((gh) this).field_ab = 640;
        ((gh) this).field_S = 150;
        ((gh) this).field_W = 0;
        ((gh) this).field_c = 0;
        ((gh) this).field_bb = 0;
        try {
          L0: {
            L1: {
              ((gh) this).field_I = param0;
              ug.field_c = 0;
              pb.field_t.c((byte) -126);
              ((gh) this).field_A = 0;
              ((gh) this).field_w = -(i.field_a.field_r >> 1);
              ((gh) this).field_Y = param1;
              ((gh) this).field_C = param1;
              ((gh) this).field_o = 0;
              ((gh) this).field_u = -(i.field_a.field_m >> 1);
              ((gh) this).field_J = 0.0f;
              bk.field_a.e();
              vb.c();
              i.field_a.a(320 + ((gh) this).field_w, ((gh) this).field_u + 240, 16777215);
              oc.field_d.e();
              vb.c();
              sh.field_y.a(255);
              ((gh) this).field_H = false;
              ((gh) this).field_D = 0;
              ((gh) this).field_F = true;
              ((gh) this).field_bb = 0;
              ((gh) this).field_x = false;
              ((gh) this).a((byte) 127, 0);
              if (!da.a(0, 111)) {
                break L1;
              } else {
                uf.field_h[0] = 14788623;
                uf.field_h[1] = 15439657;
                break L1;
              }
            }
            L2: {
              int discarded$2 = -93;
              td.a();
              int discarded$3 = 0;
              ja.h();
              c.field_ab = ee.field_B[0];
              cd.a((byte) 104);
              ((gh) this).field_j = false;
              ((gh) this).field_K = false;
              ((gh) this).field_N = false;
              ((gh) this).field_L = false;
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
            ((gh) this).field_e = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("gh.<init>(");
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = 0;
    }
}
