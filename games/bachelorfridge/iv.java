/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iv extends pp {
    private int field_l;
    boolean field_j;
    private int field_k;
    static String field_i;

    final void a(aga param0, op param1, int param2) {
        try {
            if (param2 != 12) {
                ((iv) this).field_l = -27;
            }
            ((iv) this).a((byte) -27, param0, param1, 0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "iv.C(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final void a(lu param0, byte param1) {
        int var3_int = 0;
        try {
            super.a(param0, (byte) -28);
            er.a(((iv) this).field_h, 107, param0);
            var3_int = 32767 & ((iv) this).field_f;
            if (!(!((iv) this).field_j)) {
                var3_int = var3_int | 32768;
            }
            param0.b(var3_int, -111);
            var3_int = var3_int | ((iv) this).field_l << 5 & 224;
            param0.d(var3_int, 0);
            param0.d(((iv) this).field_k, 0);
            int var4 = -49 / ((param1 - 34) / 58);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "iv.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final at a(ad param0, gj param1, boolean param2, int param3) {
        RuntimeException var5 = null;
        aga var6 = null;
        aga var7 = null;
        Object var8 = null;
        Object var9 = null;
        op var10 = null;
        op var11 = null;
        Object stackIn_48_0 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_47_0 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        try {
          L0: {
            L1: {
              var10 = param1.field_h;
              var11 = var10;
              var6 = param0.field_s;
              var7 = ((iv) this).field_h.a(120, var11);
              if (!param2) {
                break L1;
              } else {
                var9 = null;
                at discarded$2 = this.a(-99, (byte) -20, (ad) null, -42, (gj) null);
                break L1;
              }
            }
            L2: {
              var8 = null;
              if (var7.a(13, (byte) -91)) {
                boolean discarded$3 = var6.a(5, var7, (byte) 2);
                break L2;
              } else {
                break L2;
              }
            }
            if (!var7.a(((iv) this).field_f, var6, (byte) 2)) {
              L3: {
                if (((iv) this).field_k == 23) {
                  break L3;
                } else {
                  if (((iv) this).field_k == 15) {
                    break L3;
                  } else {
                    if (((iv) this).field_k == 21) {
                      break L3;
                    } else {
                      if (((iv) this).field_k == 22) {
                        break L3;
                      } else {
                        if (45 == ((iv) this).field_k) {
                          break L3;
                        } else {
                          if (((iv) this).field_k == 46) {
                            break L3;
                          } else {
                            if (((iv) this).field_k == 48) {
                              break L3;
                            } else {
                              if (((iv) this).field_k == 49) {
                                break L3;
                              } else {
                                if (50 == ((iv) this).field_k) {
                                  break L3;
                                } else {
                                  if (((iv) this).field_k != 0) {
                                    var7.b((byte) 116, ((iv) this).field_k);
                                    var7.d(15);
                                    var11.field_T.field_t[var6.field_D] = sr.a(var10.field_T.field_t[var6.field_D], 1L << aj.a((byte) -20, ((iv) this).field_k));
                                    break L3;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              L4: {
                if (var7.a(32, (byte) -117)) {
                  break L4;
                } else {
                  L5: {
                    if (((iv) this).field_k == 15) {
                      var8 = (Object) (Object) this.a(1, (byte) -13, param0, param3, param1);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (((iv) this).field_k == 45) {
                      var8 = (Object) (Object) this.a(2, (byte) -13, param0, param3, param1);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (((iv) this).field_k != 46) {
                      break L7;
                    } else {
                      var8 = (Object) (Object) this.a(3, (byte) -13, param0, param3, param1);
                      break L7;
                    }
                  }
                  if (23 != ((iv) this).field_k) {
                    break L4;
                  } else {
                    var8 = (Object) (Object) this.a(-1, (byte) -13, param0, param3, param1);
                    break L4;
                  }
                }
              }
              L8: {
                if (((iv) this).field_k == 48) {
                  param1.a(param0, ((iv) this).field_h.a(-27449, param1), false);
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (((iv) this).field_k == 49) {
                  var11.a(1, var6, 15, param3, -113);
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (((iv) this).field_k != 50) {
                  break L10;
                } else {
                  var11.a(1, var6, 14, param3, -74);
                  break L10;
                }
              }
              L11: {
                if (((iv) this).field_k != 21) {
                  break L11;
                } else {
                  var7.field_C = var7.field_C << 1;
                  break L11;
                }
              }
              L12: {
                if (39 == ((iv) this).field_k) {
                  var7.field_H = 50;
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (((iv) this).field_k == 22) {
                  var7.field_C = var7.field_C * 3;
                  break L13;
                } else {
                  break L13;
                }
              }
              stackOut_47_0 = var8;
              stackIn_48_0 = stackOut_47_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var5 = decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) var5;
            stackOut_49_1 = new StringBuilder().append("iv.G(");
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param0 == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L14;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L14;
            }
          }
          L15: {
            stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
            stackOut_52_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_52_2).append(44);
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param1 == null) {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L15;
            } else {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L15;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_55_0, stackIn_55_2 + 44 + param2 + 44 + param3 + 41);
        }
        return (at) (Object) stackIn_48_0;
    }

    final static int a(int param0, int param1, int param2, hh param3, String param4, boolean param5, hh param6) {
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        int stackIn_7_0 = 0;
        lu stackIn_12_0 = null;
        lu stackIn_13_0 = null;
        lu stackIn_14_0 = null;
        String stackIn_14_1 = null;
        lu stackIn_15_0 = null;
        lu stackIn_16_0 = null;
        lu stackIn_17_0 = null;
        String stackIn_17_1 = null;
        int stackIn_32_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_64_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        lu stackOut_11_0 = null;
        lu stackOut_13_0 = null;
        String stackOut_13_1 = null;
        lu stackOut_12_0 = null;
        String stackOut_12_1 = null;
        lu stackOut_14_0 = null;
        lu stackOut_16_0 = null;
        String stackOut_16_1 = null;
        lu stackOut_15_0 = null;
        String stackOut_15_1 = null;
        int stackOut_31_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_63_0 = 0;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        var13 = BachelorFridge.field_y;
        try {
          L0: {
            var14 = param3.a(-1);
            var8 = param6.a(-1);
            L1: {
              if (null == dma.field_b) {
                if (ge.a(-29510, false)) {
                  break L1;
                } else {
                  stackOut_6_0 = -1;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (eia.field_a == rga.field_c) {
                L3: {
                  vg.field_l = null;
                  sja.field_fb.field_g = 0;
                  if (param4 != null) {
                    L4: {
                      var9 = 0;
                      dm.field_g.field_g = 0;
                      if (!param5) {
                        break L4;
                      } else {
                        var9 = var9 | 1;
                        break L4;
                      }
                    }
                    L5: {
                      dm.field_g.e(ia.field_k.nextInt(), -1615464796);
                      dm.field_g.e(ia.field_k.nextInt(), -1615464796);
                      dm.field_g.a(var14, 70);
                      dm.field_g.a(var8, 104);
                      var15 = (CharSequence) (Object) param4;
                      dm.field_g.a(qfa.a(20, var15), 117);
                      dm.field_g.b(param1, -119);
                      dm.field_g.d(param2, 0);
                      dm.field_g.d(var9, 0);
                      sja.field_fb.d(18, 0);
                      sja.field_fb.field_g = sja.field_fb.field_g + 2;
                      var10 = sja.field_fb.field_g;
                      var11_ref_String = pi.a(11713, nia.d(-31768));
                      if (var11_ref_String == null) {
                        var11_ref_String = "";
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    sja.field_fb.a((byte) -50, var11_ref_String);
                    wd.a(sm.field_q, (byte) -67, (lu) (Object) sja.field_fb, dm.field_g, tg.field_p);
                    sja.field_fb.a((byte) -88, sja.field_fb.field_g - var10);
                    break L3;
                  } else {
                    L6: {
                      dm.field_g.field_g = 0;
                      dm.field_g.e(ia.field_k.nextInt(), -1615464796);
                      dm.field_g.e(ia.field_k.nextInt(), -1615464796);
                      stackOut_11_0 = dm.field_g;
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_12_0 = stackOut_11_0;
                      if (param3.a(true)) {
                        stackOut_13_0 = (lu) (Object) stackIn_13_0;
                        stackOut_13_1 = (String) var14;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        break L6;
                      } else {
                        stackOut_12_0 = (lu) (Object) stackIn_12_0;
                        stackOut_12_1 = "";
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        break L6;
                      }
                    }
                    L7: {
                      ((lu) (Object) stackIn_14_0).a(stackIn_14_1, 90);
                      stackOut_14_0 = dm.field_g;
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_15_0 = stackOut_14_0;
                      if (param6.a(true)) {
                        stackOut_16_0 = (lu) (Object) stackIn_16_0;
                        stackOut_16_1 = (String) var8;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        break L7;
                      } else {
                        stackOut_15_0 = (lu) (Object) stackIn_15_0;
                        stackOut_15_1 = "";
                        stackIn_17_0 = stackOut_15_0;
                        stackIn_17_1 = stackOut_15_1;
                        break L7;
                      }
                    }
                    ((lu) (Object) stackIn_17_0).a(stackIn_17_1, 74);
                    sja.field_fb.d(16, 0);
                    sja.field_fb.field_g = sja.field_fb.field_g + 1;
                    var9 = sja.field_fb.field_g;
                    wd.a(sm.field_q, (byte) -89, (lu) (Object) sja.field_fb, dm.field_g, tg.field_p);
                    sja.field_fb.b((byte) -97, sja.field_fb.field_g + -var9);
                    break L3;
                  }
                }
                hna.a(-1, 116);
                eia.field_a = dc.field_k;
                break L2;
              } else {
                break L2;
              }
            }
            L8: {
              if (eia.field_a != dc.field_k) {
                break L8;
              } else {
                if (!ii.b(1, 0)) {
                  break L8;
                } else {
                  L9: {
                    var9 = ig.field_m.b(16711935);
                    ig.field_m.field_g = 0;
                    if (var9 < 100) {
                      break L9;
                    } else {
                      if (var9 > 105) {
                        break L9;
                      } else {
                        eia.field_a = qm.field_g;
                        vd.field_B = new String[var9 - 100];
                        break L8;
                      }
                    }
                  }
                  if (var9 != 248) {
                    if (var9 == 99) {
                      int discarded$3 = -125;
                      boolean discarded$4 = ii.b(md.d(), 0);
                      vg.field_l = new Boolean(qla.a((byte) 112, (lu) (Object) ig.field_m));
                      ig.field_m.field_g = 0;
                      break L8;
                    } else {
                      eia.field_a = mba.field_b;
                      ri.field_a = var9;
                      dw.field_f = -1;
                      break L8;
                    }
                  } else {
                    ud.a(nia.d(-31768), (byte) 87);
                    vt.field_m = oja.field_e;
                    vc.a((byte) -77);
                    se.field_x = false;
                    stackOut_31_0 = var9;
                    stackIn_32_0 = stackOut_31_0;
                    return stackIn_32_0;
                  }
                }
              }
            }
            L10: {
              if (eia.field_a == qm.field_g) {
                var9 = 2;
                if (!ii.b(var9, 0)) {
                  break L10;
                } else {
                  var10 = ig.field_m.e((byte) 118);
                  ig.field_m.field_g = 0;
                  if (!ii.b(var10, 0)) {
                    break L10;
                  } else {
                    var11 = vd.field_B.length;
                    var12 = 0;
                    L11: while (true) {
                      if (~var12 <= ~var11) {
                        vc.a((byte) -91);
                        se.field_x = false;
                        stackOut_43_0 = var11 + 100;
                        stackIn_44_0 = stackOut_43_0;
                        return stackIn_44_0;
                      } else {
                        vd.field_B[var12] = ig.field_m.i(0);
                        var12++;
                        continue L11;
                      }
                    }
                  }
                }
              } else {
                break L10;
              }
            }
            L12: {
              if (mba.field_b != eia.field_a) {
                break L12;
              } else {
                if (u.d((byte) -67)) {
                  L13: {
                    if (ri.field_a != 255) {
                      vt.field_m = ig.field_m.g(125);
                      break L13;
                    } else {
                      var9_ref_String = ig.field_m.g((byte) 56);
                      if (var9_ref_String != null) {
                        int discarded$5 = 3;
                        hp.a(nia.d(-31768), var9_ref_String);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                  vc.a((byte) -121);
                  se.field_x = false;
                  stackOut_53_0 = ri.field_a;
                  stackIn_54_0 = stackOut_53_0;
                  return stackIn_54_0;
                } else {
                  break L12;
                }
              }
            }
            L14: {
              if (dma.field_b != null) {
                break L14;
              } else {
                if (se.field_x) {
                  L15: {
                    if (ag.e(-9109) <= 30000L) {
                      vt.field_m = qd.field_n;
                      break L15;
                    } else {
                      vt.field_m = nca.field_b;
                      break L15;
                    }
                  }
                  se.field_x = false;
                  stackOut_61_0 = 249;
                  stackIn_62_0 = stackOut_61_0;
                  return stackIn_62_0;
                } else {
                  var9 = kn.field_h;
                  kn.field_h = oja.field_c;
                  se.field_x = true;
                  oja.field_c = var9;
                  break L14;
                }
              }
            }
            stackOut_63_0 = -1;
            stackIn_64_0 = stackOut_63_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var7 = decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) var7;
            stackOut_65_1 = new StringBuilder().append("iv.E(").append(-15).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_67_0 = stackOut_65_0;
            stackIn_67_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param3 == null) {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L16;
            } else {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "{...}";
              stackIn_68_0 = stackOut_66_0;
              stackIn_68_1 = stackOut_66_1;
              stackIn_68_2 = stackOut_66_2;
              break L16;
            }
          }
          L17: {
            stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
            stackOut_68_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(44);
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param4 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L17;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L17;
            }
          }
          L18: {
            stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(44).append(param5).append(44);
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param6 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L18;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L18;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_74_0, stackIn_74_2 + 41);
        }
        return stackIn_64_0;
    }

    public static void a() {
        field_i = null;
    }

    final void a(byte param0, aga param1, op param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        aga var8 = null;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        String stackIn_94_2 = null;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        String stackIn_97_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_91_0 = null;
        StringBuilder stackOut_91_1 = null;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        String stackOut_93_2 = null;
        RuntimeException stackOut_92_0 = null;
        StringBuilder stackOut_92_1 = null;
        String stackOut_92_2 = null;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        String stackOut_96_2 = null;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        String stackOut_95_2 = null;
        var7 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var8 = ((iv) this).field_h.a(91, param2);
              if (!var8.a(13, (byte) -69)) {
                break L1;
              } else {
                boolean discarded$3 = param1.a(5, var8, (byte) 2);
                break L1;
              }
            }
            if (var8.a(((iv) this).field_f, param1, (byte) 2)) {
              return;
            } else {
              L2: {
                if (((iv) this).field_k == 23) {
                  break L2;
                } else {
                  if (((iv) this).field_k == 15) {
                    break L2;
                  } else {
                    if (((iv) this).field_k == 21) {
                      break L2;
                    } else {
                      if (22 == ((iv) this).field_k) {
                        break L2;
                      } else {
                        if (((iv) this).field_k == 45) {
                          break L2;
                        } else {
                          if (((iv) this).field_k == 46) {
                            break L2;
                          } else {
                            if (((iv) this).field_k == 48) {
                              break L2;
                            } else {
                              if (49 == ((iv) this).field_k) {
                                break L2;
                              } else {
                                if (((iv) this).field_k == 50) {
                                  break L2;
                                } else {
                                  if (((iv) this).field_k == 0) {
                                    break L2;
                                  } else {
                                    L3: {
                                      if (((iv) this).field_k == 2) {
                                        param2.field_T.field_p[param1.field_D] = param2.field_T.field_p[param1.field_D] + 1;
                                        break L3;
                                      } else {
                                        break L3;
                                      }
                                    }
                                    L4: {
                                      L5: {
                                        if (((iv) this).field_k == 3) {
                                          break L5;
                                        } else {
                                          if (13 == ((iv) this).field_k) {
                                            break L5;
                                          } else {
                                            if (((iv) this).field_k == 14) {
                                              break L5;
                                            } else {
                                              if (((iv) this).field_k == 16) {
                                                break L5;
                                              } else {
                                                if (17 == ((iv) this).field_k) {
                                                  break L5;
                                                } else {
                                                  if (((iv) this).field_k == 18) {
                                                    break L5;
                                                  } else {
                                                    if (((iv) this).field_k == 19) {
                                                      break L5;
                                                    } else {
                                                      if (((iv) this).field_k == 32) {
                                                        break L5;
                                                      } else {
                                                        if (((iv) this).field_k == 33) {
                                                          break L5;
                                                        } else {
                                                          break L4;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      param2.field_T.field_I[param1.field_D] = param2.field_T.field_I[param1.field_D] + 1;
                                      break L4;
                                    }
                                    L6: {
                                      L7: {
                                        if (((iv) this).field_k == 1) {
                                          break L7;
                                        } else {
                                          if (((iv) this).field_k == 4) {
                                            break L7;
                                          } else {
                                            if (5 == ((iv) this).field_k) {
                                              break L7;
                                            } else {
                                              if (((iv) this).field_k == 6) {
                                                break L7;
                                              } else {
                                                if (((iv) this).field_k == 7) {
                                                  break L7;
                                                } else {
                                                  if (8 == ((iv) this).field_k) {
                                                    break L7;
                                                  } else {
                                                    if (9 == ((iv) this).field_k) {
                                                      break L7;
                                                    } else {
                                                      if (((iv) this).field_k == 10) {
                                                        break L7;
                                                      } else {
                                                        if (11 == ((iv) this).field_k) {
                                                          break L7;
                                                        } else {
                                                          if (12 == ((iv) this).field_k) {
                                                            break L7;
                                                          } else {
                                                            if (28 == ((iv) this).field_k) {
                                                              break L7;
                                                            } else {
                                                              if (29 == ((iv) this).field_k) {
                                                                break L7;
                                                              } else {
                                                                if (((iv) this).field_k == 30) {
                                                                  break L7;
                                                                } else {
                                                                  if (((iv) this).field_k == 34) {
                                                                    break L7;
                                                                  } else {
                                                                    if (((iv) this).field_k == 36) {
                                                                      break L7;
                                                                    } else {
                                                                      if (((iv) this).field_k == 37) {
                                                                        break L7;
                                                                      } else {
                                                                        if (((iv) this).field_k == 38) {
                                                                          break L7;
                                                                        } else {
                                                                          if (((iv) this).field_k == 39) {
                                                                            break L7;
                                                                          } else {
                                                                            if (((iv) this).field_k == 40) {
                                                                              break L7;
                                                                            } else {
                                                                              if (((iv) this).field_k == 41) {
                                                                                break L7;
                                                                              } else {
                                                                                if (((iv) this).field_k == 51) {
                                                                                  break L7;
                                                                                } else {
                                                                                  if (((iv) this).field_k == 52) {
                                                                                    break L7;
                                                                                  } else {
                                                                                    if (53 != ((iv) this).field_k) {
                                                                                      break L6;
                                                                                    } else {
                                                                                      break L7;
                                                                                    }
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      param2.field_T.field_D[param1.field_D] = param2.field_T.field_D[param1.field_D] + 1;
                                      break L6;
                                    }
                                    var8.b((byte) 115, ((iv) this).field_k);
                                    var8.d(67);
                                    param2.field_T.field_t[param1.field_D] = sr.a(param2.field_T.field_t[param1.field_D], 1L << aj.a((byte) -20, ((iv) this).field_k));
                                    break L2;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              L8: {
                if (var8.field_y == 32) {
                  break L8;
                } else {
                  L9: {
                    if (15 != ((iv) this).field_k) {
                      break L9;
                    } else {
                      if (!param2.a(param3, var8, 1, param1, -1)) {
                        var8.b((byte) 116, 8);
                        break L9;
                      } else {
                        param2.field_T.field_c[param1.field_D] = param2.field_T.field_c[param1.field_D] + 1;
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (((iv) this).field_k != 45) {
                      break L10;
                    } else {
                      if (param2.a(param3, var8, 2, param1, -1)) {
                        param2.field_T.field_c[param1.field_D] = param2.field_T.field_c[param1.field_D] + 1;
                        break L10;
                      } else {
                        var8.b((byte) 112, 8);
                        break L10;
                      }
                    }
                  }
                  L11: {
                    if (((iv) this).field_k == 46) {
                      if (!param2.a(param3, var8, 3, param1, -1)) {
                        var8.b((byte) 122, 8);
                        break L11;
                      } else {
                        param2.field_T.field_c[param1.field_D] = param2.field_T.field_c[param1.field_D] + 1;
                        break L11;
                      }
                    } else {
                      break L11;
                    }
                  }
                  if (((iv) this).field_k == 23) {
                    boolean discarded$4 = param2.a(param3, var8, -1, param1, -1);
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
              L12: {
                if (((iv) this).field_k != 48) {
                  break L12;
                } else {
                  boolean discarded$5 = param2.a(var8, param1, 4);
                  break L12;
                }
              }
              L13: {
                if (((iv) this).field_k == 49) {
                  param2.a(1, param1, 15, param3, -92);
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                if (((iv) this).field_k == 50) {
                  param2.a(1, param1, 14, param3, -82);
                  break L14;
                } else {
                  break L14;
                }
              }
              L15: {
                if (((iv) this).field_k == 21) {
                  var8.field_C = var8.field_C << 1;
                  break L15;
                } else {
                  break L15;
                }
              }
              L16: {
                if (((iv) this).field_k == 22) {
                  var8.field_C = var8.field_C * 3;
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                var6 = 79 / ((param0 - 21) / 42);
                if (((iv) this).field_k == 39) {
                  var8.field_H = 50;
                  break L17;
                } else {
                  break L17;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var5 = decompiledCaughtException;
            stackOut_91_0 = (RuntimeException) var5;
            stackOut_91_1 = new StringBuilder().append("iv.B(").append(param0).append(44);
            stackIn_93_0 = stackOut_91_0;
            stackIn_93_1 = stackOut_91_1;
            stackIn_92_0 = stackOut_91_0;
            stackIn_92_1 = stackOut_91_1;
            if (param1 == null) {
              stackOut_93_0 = (RuntimeException) (Object) stackIn_93_0;
              stackOut_93_1 = (StringBuilder) (Object) stackIn_93_1;
              stackOut_93_2 = "null";
              stackIn_94_0 = stackOut_93_0;
              stackIn_94_1 = stackOut_93_1;
              stackIn_94_2 = stackOut_93_2;
              break L18;
            } else {
              stackOut_92_0 = (RuntimeException) (Object) stackIn_92_0;
              stackOut_92_1 = (StringBuilder) (Object) stackIn_92_1;
              stackOut_92_2 = "{...}";
              stackIn_94_0 = stackOut_92_0;
              stackIn_94_1 = stackOut_92_1;
              stackIn_94_2 = stackOut_92_2;
              break L18;
            }
          }
          L19: {
            stackOut_94_0 = (RuntimeException) (Object) stackIn_94_0;
            stackOut_94_1 = ((StringBuilder) (Object) stackIn_94_1).append(stackIn_94_2).append(44);
            stackIn_96_0 = stackOut_94_0;
            stackIn_96_1 = stackOut_94_1;
            stackIn_95_0 = stackOut_94_0;
            stackIn_95_1 = stackOut_94_1;
            if (param2 == null) {
              stackOut_96_0 = (RuntimeException) (Object) stackIn_96_0;
              stackOut_96_1 = (StringBuilder) (Object) stackIn_96_1;
              stackOut_96_2 = "null";
              stackIn_97_0 = stackOut_96_0;
              stackIn_97_1 = stackOut_96_1;
              stackIn_97_2 = stackOut_96_2;
              break L19;
            } else {
              stackOut_95_0 = (RuntimeException) (Object) stackIn_95_0;
              stackOut_95_1 = (StringBuilder) (Object) stackIn_95_1;
              stackOut_95_2 = "{...}";
              stackIn_97_0 = stackOut_95_0;
              stackIn_97_1 = stackOut_95_1;
              stackIn_97_2 = stackOut_95_2;
              break L19;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_97_0, stackIn_97_2 + 44 + param3 + 41);
        }
    }

    iv(nq param0, boolean param1, int param2, int param3, int param4) {
        try {
            ((iv) this).field_h = param0;
            ((iv) this).field_l = param2;
            ((iv) this).field_j = param1 ? true : false;
            ((iv) this).field_k = param4;
            ((iv) this).field_f = param3;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "iv.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static void b(boolean param0) {
        if (param0) {
            iv.b(true);
        }
        int var1 = saa.field_b * saa.field_b;
        int var2 = -(eb.field_t * eb.field_t) + var1;
        int var3 = fs.field_f - -((pda.field_p - fs.field_f) * var2 / var1);
        i.field_a.a(120, 31407, 640, ce.field_t, var3);
        int discarded$0 = 640;
        int discarded$1 = 0;
        taa.a(5, gba.field_Bb, 91, -24 + pda.field_p, lm.field_d);
    }

    private final at a(int param0, byte param1, ad param2, int param3, gj param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        Object var8 = null;
        aga var9 = null;
        Object stackIn_6_0 = null;
        rka stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        rka stackOut_7_0 = null;
        Object stackOut_5_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              var9 = ((iv) this).field_h.a(param1 ^ -90, param4.field_h);
              if (param1 == -13) {
                break L1;
              } else {
                var8 = null;
                ((iv) this).a((aga) null, (op) null, 127);
                break L1;
              }
            }
            L2: {
              var7 = param4.field_h.b(var9, 126, param3, param0);
              if (var7 >= param0) {
                break L2;
              } else {
                param4.a(-16007, ((iv) this).field_h.a(-27449, param4), 8);
                break L2;
              }
            }
            if (var7 > 0) {
              stackOut_7_0 = new rka(param4, ((iv) this).field_h, new nq(param2.field_s), param3, var7);
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_5_0 = null;
              stackIn_6_0 = stackOut_5_0;
              return (at) (Object) stackIn_6_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var6;
            stackOut_9_1 = new StringBuilder().append("iv.K(").append(param0).append(44).append(param1).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44).append(param3).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return (at) (Object) stackIn_8_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "You must have an account to enter the arena.";
    }
}
