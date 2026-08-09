/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb implements fc {
    private int field_c;
    static String field_o;
    private int field_l;
    static String[] field_k;
    private int field_j;
    private tj field_n;
    private int field_a;
    private int field_b;
    static tg[] field_m;
    private int field_h;
    private int field_i;
    static qc field_g;
    private int field_f;
    private int field_p;
    private int field_e;
    private int field_d;

    public static void a(int param0) {
        field_o = null;
        field_k = null;
        field_g = null;
        if (param0 <= 65) {
            field_o = (String) null;
        }
        field_m = null;
    }

    final static int a(boolean param0, String param1, int param2, int param3, ve param4, int param5, ve param6) {
        int stackIn_4_0 = 0;
        wi stackIn_14_0 = null;
        wi stackIn_15_0 = null;
        String stackIn_15_1 = null;
        wi stackIn_17_0 = null;
        wi stackIn_18_0 = null;
        String stackIn_18_1 = null;
        int stackIn_28_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_63_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        StringBuilder stackIn_69_1 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_72_1 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var10_ref_String = null;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        String var15 = null;
        Object var16 = null;
        CharSequence var17 = null;
        var16 = null;
        var14 = Bounce.field_N;
        try {
          L0: {
            L1: {
              var15 = param4.c((byte) -56);
              var11_ref_String = var15;
              var11_ref_String = var15;
              var8 = param6.c((byte) -106);
              var11_ref_String = var8;
              var11_ref_String = var8;
              if (dh.field_a != null) {
                break L1;
              } else {
                if (ok.a(false, 122)) {
                  break L1;
                } else {
                  stackIn_4_0 = -1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L2: {
              if (ga.field_c != pj.field_a) {
                break L2;
              } else {
                L3: {
                  lk.field_p = null;
                  hh.field_p.field_h = 0;
                  if (param1 == null) {
                    L4: {
                      lb.field_g.field_h = 0;
                      lb.field_g.b(la.field_C.nextInt(), (byte) 124);
                      lb.field_g.b(la.field_C.nextInt(), (byte) 67);
                      stackIn_14_0 = lb.field_g;

                      if (!param4.a((byte) 56)) {
                        stackIn_15_0 = (wi) ((Object) stackIn_14_0);
                        stackIn_15_1 = "";
                        break L4;
                      } else {
                        stackIn_15_0 = (wi) ((Object) stackIn_14_0);
                        stackIn_15_1 = (String) (var15);
                        break L4;
                      }
                    }
                    L5: {
                      ((wi) (Object) stackIn_15_0).a(stackIn_15_1, (byte) -67);
                      stackIn_17_0 = lb.field_g;

                      if (!param6.a((byte) 56)) {
                        stackIn_18_0 = (wi) ((Object) stackIn_17_0);
                        stackIn_18_1 = "";
                        break L5;
                      } else {
                        stackIn_18_0 = (wi) ((Object) stackIn_17_0);
                        stackIn_18_1 = (String) (var8);
                        break L5;
                      }
                    }
                    ((wi) (Object) stackIn_18_0).a(stackIn_18_1, (byte) -67);
                    hh.field_p.a(16, (byte) 94);
                    hh.field_p.field_h = hh.field_p.field_h + 1;
                    var9 = hh.field_p.field_h;
                    f.a(dh.field_b, false, hh.field_p, lb.field_g, ja.field_a);
                    hh.field_p.b(-var9 + hh.field_p.field_h, true);
                    break L3;
                  } else {
                    L6: {
                      var9 = 0;
                      lb.field_g.field_h = 0;
                      if (!param0) {
                        break L6;
                      } else {
                        var9 = var9 | 1;
                        break L6;
                      }
                    }
                    L7: {
                      lb.field_g.b(la.field_C.nextInt(), (byte) -97);
                      lb.field_g.b(la.field_C.nextInt(), (byte) -64);
                      lb.field_g.a(var15, (byte) -67);
                      lb.field_g.a(var8, (byte) -67);
                      var17 = (CharSequence) ((Object) param1);
                      lb.field_g.a(ck.a(-109, var17), (byte) -67);
                      lb.field_g.e(-750655096, param3);
                      lb.field_g.a(param5, (byte) 106);
                      lb.field_g.a(var9, (byte) 100);
                      hh.field_p.a(18, (byte) 105);
                      hh.field_p.field_h = hh.field_p.field_h + 2;
                      var10 = hh.field_p.field_h;
                      var11_ref_String = uj.a(true, vi.b(0));
                      if (var11_ref_String != null) {
                        break L7;
                      } else {
                        var11_ref_String = "";
                        break L7;
                      }
                    }
                    hh.field_p.a(-256, var11_ref_String);
                    f.a(dh.field_b, false, hh.field_p, lb.field_g, ja.field_a);
                    hh.field_p.c(-124, hh.field_p.field_h + -var10);
                    break L3;
                  }
                }
                jj.a(-1, true);
                pj.field_a = rj.field_q;
                break L2;
              }
            }
            L8: {
              if (pj.field_a == rj.field_q) {
                if (!qb.a(1, 3)) {
                  break L8;
                } else {
                  L9: {
                    var9 = jc.field_g.d((byte) -84);
                    jc.field_g.field_h = 0;
                    if (var9 < 100) {
                      break L9;
                    } else {
                      if ((var9 ^ -1) >= -106) {
                        bi.field_l = new String[-100 + var9];
                        pj.field_a = kb.field_b;
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  if ((var9 ^ -1) != -249) {
                    if (-100 != (var9 ^ -1)) {
                      pj.field_a = id.field_i;
                      pe.field_d = -1;
                      wa.field_d = var9;
                      break L8;
                    } else {
                      qb.a(jf.b(false), 3);
                      lk.field_p = new Boolean(pb.a(jc.field_g, (byte) 87));
                      jc.field_g.field_h = 0;
                      break L8;
                    }
                  } else {
                    ta.a((byte) -118, vi.b(0));
                    ib.field_o = vf.field_a;
                    kc.a((byte) 18);
                    fa.field_a = false;
                    stackIn_28_0 = var9;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              } else {
                break L8;
              }
            }
            L10: {
              var9 = 71 / ((param2 - -45) / 32);
              if (pj.field_a == kb.field_b) {
                var10 = 2;
                if (qb.a(var10, 3)) {
                  var11 = jc.field_g.a(-1640531527);
                  jc.field_g.field_h = 0;
                  if (qb.a(var11, 3)) {
                    var12 = bi.field_l.length;
                    var13 = 0;
                    L11: while (true) {
                      if (var12 <= var13) {
                        kc.a((byte) 18);
                        fa.field_a = false;
                        stackIn_43_0 = 100 + var12;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        bi.field_l[var13] = jc.field_g.a(true);
                        var13++;
                        continue L11;
                      }
                    }
                  } else {
                    break L10;
                  }
                } else {
                  break L10;
                }
              } else {
                break L10;
              }
            }
            L12: {
              if (id.field_i != pj.field_a) {
                break L12;
              } else {
                if (va.b(1)) {
                  L13: {
                    if (255 != wa.field_d) {
                      ib.field_o = jc.field_g.b(true);
                      break L13;
                    } else {
                      var10_ref_String = jc.field_g.g((byte) 57);
                      if (var10_ref_String == null) {
                        break L13;
                      } else {
                        jd.a(0, vi.b(0), var10_ref_String);
                        break L13;
                      }
                    }
                  }
                  kc.a((byte) 18);
                  fa.field_a = false;
                  stackIn_52_0 = wa.field_d;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  break L12;
                }
              }
            }
            L14: {
              if (dh.field_a == null) {
                if (!fa.field_a) {
                  var10 = td.field_b;
                  td.field_b = wa.field_b;
                  fa.field_a = true;
                  wa.field_b = var10;
                  break L14;
                } else {
                  L15: {
                    if (-30001L > (ph.a((byte) 76) ^ -1L)) {
                      ib.field_o = jh.field_t;
                      break L15;
                    } else {
                      ib.field_o = dg.field_k;
                      break L15;
                    }
                  }
                  fa.field_a = false;
                  stackIn_60_0 = 249;
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              } else {
                break L14;
              }
            }
            stackIn_63_0 = -1;
            decompiledRegionSelector0 = 5;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var7 = decompiledCaughtException;
            stackIn_66_0 = (RuntimeException) (var7);

            stackIn_66_1 = new StringBuilder().append("vb.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackIn_67_2 = "null";
              break L16;
            } else {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackIn_67_2 = "{...}";
              break L16;
            }
          }
          L17: {


            stackIn_69_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "null";
              break L17;
            } else {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "{...}";
              break L17;
            }
          }
          L18: {


            stackIn_72_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "null";
              break L18;
            } else {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "{...}";
              break L18;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_67_0), stackIn_73_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_28_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_43_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_52_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_60_0;
                } else {
                  return stackIn_63_0;
                }
              }
            }
          }
        }
    }

    public final void a(int param0, lk param1, byte param2, boolean param3, int param4) {
        lk stackIn_3_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ff var12 = null;
        try {
          L0: {
            L1: {
              if (!(param1 instanceof ff)) {
                stackIn_3_0 = null;
                break L1;
              } else {
                stackIn_3_0 = (lk) (param1);
                break L1;
              }
            }
            L2: {
              var12 = (ff) ((Object) stackIn_3_0);
              var8 = -100 / ((-60 - param2) / 56);
              if (var12 == null) {
                break L2;
              } else {
                param3 = param3 & var12.field_y;
                break L2;
              }
            }
            L3: {
              var7 = 5592405;
              na.e(param1.field_r + param4, param1.field_i + param0, param1.field_k, param1.field_m, this.field_h);
              if (!param3) {
                break L3;
              } else {
                var7 = 16777215;
                break L3;
              }
            }
            L4: {
              var9 = this.field_a + param4 - -param1.field_r;
              var10 = param0 + param1.field_i + this.field_p;
              na.d(var9, var10, this.field_d, this.field_l, 5592405);
              na.e(var9, var10, this.field_d, this.field_l, var7);
              if (var12.field_z) {
                na.a(var9, var10, this.field_d + var9, var10 - -this.field_l, 1);
                na.a(this.field_d + var9, var10, var9, var10 + this.field_l, 1);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (null != this.field_n) {
                var11 = this.field_i + this.field_a + this.field_d;
                this.field_n.a(param1.field_h, var11 + (param4 - -param1.field_r), this.field_f + param1.field_i + param0, param1.field_k - (var11 - -this.field_i), param1.field_m - (this.field_i << 1959255201), this.field_c, this.field_b, this.field_e, this.field_j, 0);
                break L5;
              } else {
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var6);

            stackIn_16_1 = new StringBuilder().append("vb.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L6;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(byte param0) {
        ih.field_V = null;
        ph.field_c = (byte[][]) null;
        cl.field_n = null;
        if (param0 != 122) {
            vb.a(75);
        }
        he.field_k = null;
        ae.field_c = null;
        qh.field_i = null;
    }

    vb(tj param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_j = 1;
        this.field_e = 1;
        try {
            this.field_n = param0;
            this.field_p = param6;
            this.field_d = param8;
            this.field_a = param5;
            this.field_c = param3;
            this.field_b = param4;
            this.field_l = param7;
            this.field_f = param2;
            this.field_i = param1;
            this.field_h = param9;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "vb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        field_o = "Connection lost - attempting to reconnect";
        field_g = new qc();
    }
}
