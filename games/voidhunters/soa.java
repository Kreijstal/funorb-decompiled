/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class soa extends llb {
    llb field_xb;
    llb field_wb;
    pjb field_vb;

    final static int[][] a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7, float param8) {
        int var11 = 0;
        int var12 = VoidHunters.field_G;
        int[][] var15 = new int[256][64];
        int[][] var14 = var15;
        int[][] var13 = var14;
        int[][] var9 = var13;
        rw var10 = new rw();
        var10.field_s = false;
        var10.field_k = (int)(param8 * 4096.0f);
        var10.field_o = 4;
        var10.field_j = 4;
        var10.field_r = 3;
        var10.c((byte) -105);
        hr.a(256, 64, -108);
        for (var11 = 0; var11 < 256; var11++) {
            var10.a(1, var11, var15[var11]);
        }
        return var9;
    }

    private final void a(int param0, int param1, int param2) {
        ((soa) this).field_xb.field_G = ((soa) this).field_G;
        ((soa) this).field_wb.field_L = 0;
        ((soa) this).field_xb.field_hb = -param0 + (((soa) this).field_hb + -param2);
        ((soa) this).field_wb.field_hb = -param2 + ((soa) this).field_hb + -param0;
        ((soa) this).field_vb.a(-param0 + ((soa) this).field_hb, ((soa) this).field_wb.field_G, 0, -((soa) this).field_wb.field_K, ((soa) this).field_xb.field_G, ((soa) this).field_G, param0, -1);
    }

    final boolean a(byte param0, int param1, int param2, boolean param3, boolean param4, int param5) {
        if (param0 != 38) {
            ((soa) this).field_vb = null;
        }
        int discarded$0 = -120;
        return this.a(param3, param4, ((soa) this).field_xb.field_G, param2, param1, param5);
    }

    final static void a(boolean param0, int param1, boolean param2, int param3) {
        RuntimeException var4 = null;
        llb var5 = null;
        llb var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        Object var9 = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        String var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        llb var15 = null;
        String var16 = null;
        llb var17 = null;
        int stackIn_11_0 = 0;
        String stackIn_25_0 = null;
        llb stackIn_35_0 = null;
        llb stackIn_36_0 = null;
        llb stackIn_37_0 = null;
        String stackIn_37_1 = null;
        llb stackIn_38_0 = null;
        llb stackIn_39_0 = null;
        llb stackIn_40_0 = null;
        String stackIn_40_1 = null;
        llb stackIn_66_0 = null;
        llb stackIn_67_0 = null;
        llb stackIn_68_0 = null;
        llb stackIn_69_0 = null;
        llb stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        llb stackIn_71_0 = null;
        llb stackIn_72_0 = null;
        llb stackIn_73_0 = null;
        llb stackIn_74_0 = null;
        llb stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        llb stackIn_78_0 = null;
        llb stackIn_79_0 = null;
        llb stackIn_80_0 = null;
        llb stackIn_81_0 = null;
        llb stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        llb stackOut_34_0 = null;
        llb stackOut_36_0 = null;
        String stackOut_36_1 = null;
        llb stackOut_35_0 = null;
        String stackOut_35_1 = null;
        llb stackOut_37_0 = null;
        llb stackOut_39_0 = null;
        String stackOut_39_1 = null;
        llb stackOut_38_0 = null;
        String stackOut_38_1 = null;
        String stackOut_24_0 = null;
        String stackOut_23_0 = null;
        llb stackOut_65_0 = null;
        llb stackOut_66_0 = null;
        llb stackOut_67_0 = null;
        llb stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        llb stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        llb stackOut_70_0 = null;
        llb stackOut_71_0 = null;
        llb stackOut_72_0 = null;
        llb stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        llb stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        llb stackOut_77_0 = null;
        llb stackOut_78_0 = null;
        llb stackOut_79_0 = null;
        llb stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        llb stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        var12 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              lkb.a(nf.field_a, (byte) -101);
              if (null != ohb.field_o) {
                L2: {
                  L3: {
                    var15 = vw.field_a;
                    var17 = var15;
                    vw.field_a.field_G = 0;
                    var17.field_hb = 0;
                    var5 = qsa.field_b;
                    qsa.field_b.field_G = 0;
                    var5.field_hb = 0;
                    qi.field_p.field_G = 0;
                    var6 = qi.field_p;
                    var6.field_hb = 0;
                    rob.field_q.field_R = hgb.field_p.toUpperCase();
                    var7 = (2 + vva.field_r.field_hb) / 2;
                    qi.field_p.a(0, 6, var7 + -2, vva.field_r.field_G - 40, 40);
                    qsa.field_b.a(var7, -120, vva.field_r.field_hb - var7, -40 + vva.field_r.field_G, 40);
                    if (ieb.field_o.length != 1) {
                      break L3;
                    } else {
                      if (ieb.field_o[0] != 2) {
                        break L3;
                      } else {
                        var8 = 0;
                        break L2;
                      }
                    }
                  }
                  var8 = 0;
                  var9_int = 0;
                  var10 = 0;
                  L4: while (true) {
                    L5: {
                      if (~ieb.field_o.length >= ~var10) {
                        break L5;
                      } else {
                        L6: {
                          if ((ce.field_o[var10 / 8] & 1 << (var10 & 7)) == 0) {
                            stackOut_10_0 = 0;
                            stackIn_11_0 = stackOut_10_0;
                            break L6;
                          } else {
                            stackOut_9_0 = 1;
                            stackIn_11_0 = stackOut_9_0;
                            break L6;
                          }
                        }
                        L7: {
                          var11_int = stackIn_11_0;
                          if (var11_int != 0) {
                            var9_int++;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        L8: {
                          if (var11_int == 0) {
                            break L8;
                          } else {
                            if (ieb.field_o[var10] == 2) {
                              break L8;
                            } else {
                              var8 = 1;
                              break L5;
                            }
                          }
                        }
                        var10++;
                        continue L4;
                      }
                    }
                    if (0 == var9_int) {
                      var8 = 1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                qsa.field_b.field_y = true;
                if (!ii.field_h) {
                  L9: {
                    stackOut_34_0 = qsa.field_b;
                    stackIn_36_0 = stackOut_34_0;
                    stackIn_35_0 = stackOut_34_0;
                    if (var8 != 0) {
                      stackOut_36_0 = (llb) (Object) stackIn_36_0;
                      stackOut_36_1 = tsb.field_p;
                      stackIn_37_0 = stackOut_36_0;
                      stackIn_37_1 = stackOut_36_1;
                      break L9;
                    } else {
                      stackOut_35_0 = (llb) (Object) stackIn_35_0;
                      stackOut_35_1 = spb.field_a;
                      stackIn_37_0 = stackOut_35_0;
                      stackIn_37_1 = stackOut_35_1;
                      break L9;
                    }
                  }
                  L10: {
                    stackIn_37_0.field_R = ((String) (Object) stackIn_37_1).toUpperCase();
                    stackOut_37_0 = wo.field_p;
                    stackIn_39_0 = stackOut_37_0;
                    stackIn_38_0 = stackOut_37_0;
                    if (var8 != 0) {
                      stackOut_39_0 = (llb) (Object) stackIn_39_0;
                      stackOut_39_1 = qpa.field_b;
                      stackIn_40_0 = stackOut_39_0;
                      stackIn_40_1 = stackOut_39_1;
                      break L10;
                    } else {
                      stackOut_38_0 = (llb) (Object) stackIn_38_0;
                      stackOut_38_1 = aaa.field_a;
                      stackIn_40_0 = stackOut_38_0;
                      stackIn_40_1 = stackOut_38_1;
                      break L10;
                    }
                  }
                  L11: {
                    stackIn_40_0.field_R = isa.a(stackIn_40_1, new String[1], 76);
                    hrb.field_b = true;
                    nt.field_q.field_y = true;
                    qi.field_p.field_R = nva.field_D;
                    if (ncb.field_a != null) {
                      L12: {
                        if (null == tib.field_i) {
                          mia.field_a = new boolean[ocb.field_l];
                          tib.field_i = new byte[ocb.field_l];
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      nr.field_p = false;
                      hrb.field_b = false;
                      var13 = 0;
                      var9_int = var13;
                      L13: while (true) {
                        if (ocb.field_l <= var13) {
                          bea.a(ocb.field_l, -1, ohb.field_o, -1, 115, true, 0, -1);
                          if (go.field_p < 2) {
                            break L11;
                          } else {
                            if (si.field_o[12]) {
                              hrb.field_b = true;
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                        } else {
                          mia.field_a[var13] = false;
                          var13++;
                          continue L13;
                        }
                      }
                    } else {
                      break L11;
                    }
                  }
                  if (hrb.field_b) {
                    break L1;
                  } else {
                    qsa.field_b.field_y = false;
                    if (qsa.field_b.field_Q) {
                      L14: {
                        var9 = null;
                        if (!nr.field_p) {
                          break L14;
                        } else {
                          var9 = (Object) (Object) ("<col=A00000>" + uda.field_a + "</col>");
                          var11 = var9;
                          var9 = var11;
                          var11 = var9;
                          var9 = var11;
                          break L14;
                        }
                      }
                      var10 = 0;
                      L15: while (true) {
                        if (~ocb.field_l >= ~var10) {
                          lob.field_a = "<col=A00000>" + fq.field_q + "<br>" + haa.field_p + var9;
                          break L1;
                        } else {
                          L16: {
                            if (!mia.field_a[var10]) {
                              break L16;
                            } else {
                              var11_ref = "<col=A00000>" + hva.field_c[var10] + "</col>";
                              var9 = (Object) (Object) var11_ref;
                              var9 = (Object) (Object) var11_ref;
                              if (var9 != null) {
                                var9 = (Object) (Object) (var9 + ", " + var11_ref);
                                break L16;
                              } else {
                                var9 = (Object) (Object) var11_ref;
                                break L16;
                              }
                            }
                          }
                          var10++;
                          continue L15;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                } else {
                  L17: {
                    wo.field_p.field_R = hqb.field_j;
                    nt.field_q.field_y = false;
                    if (var8 == 0) {
                      stackOut_24_0 = cn.field_b;
                      stackIn_25_0 = stackOut_24_0;
                      break L17;
                    } else {
                      stackOut_23_0 = osb.field_a;
                      stackIn_25_0 = stackOut_23_0;
                      break L17;
                    }
                  }
                  L18: {
                    var16 = stackIn_25_0;
                    var9 = (Object) (Object) var16;
                    var9 = (Object) (Object) var16;
                    var9 = (Object) (Object) var16;
                    var10 = qi.field_p.field_eb.b(var16) + 3 * qi.field_p.field_eb.a('.');
                    qi.field_p.field_F = 0;
                    if ((ls.field_o & 48) != 16) {
                      break L18;
                    } else {
                      var9 = (Object) (Object) (var16 + ".");
                      break L18;
                    }
                  }
                  L19: {
                    qi.field_p.field_w = (-var10 + qi.field_p.field_hb) / 2;
                    if (32 == (48 & ls.field_o)) {
                      var9 = (Object) (Object) (var9 + "..");
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  L20: {
                    if ((48 & ls.field_o) == 48) {
                      var9 = (Object) (Object) (var9 + "...");
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  qi.field_p.field_R = (String) var9;
                  qsa.field_b.field_R = fqb.field_p.toUpperCase();
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L21: {
              L22: {
                stackOut_65_0 = rga.field_g;
                stackIn_69_0 = stackOut_65_0;
                stackIn_66_0 = stackOut_65_0;
                if (!param0) {
                  break L22;
                } else {
                  stackOut_66_0 = (llb) (Object) stackIn_66_0;
                  stackIn_69_0 = stackOut_66_0;
                  stackIn_67_0 = stackOut_66_0;
                  if (param2) {
                    break L22;
                  } else {
                    stackOut_67_0 = (llb) (Object) stackIn_67_0;
                    stackIn_69_0 = stackOut_67_0;
                    stackIn_68_0 = stackOut_67_0;
                    if (wo.field_o) {
                      break L22;
                    } else {
                      stackOut_68_0 = (llb) (Object) stackIn_68_0;
                      stackOut_68_1 = 1;
                      stackIn_70_0 = stackOut_68_0;
                      stackIn_70_1 = stackOut_68_1;
                      break L21;
                    }
                  }
                }
              }
              stackOut_69_0 = (llb) (Object) stackIn_69_0;
              stackOut_69_1 = 0;
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              break L21;
            }
            L23: {
              L24: {
                ((llb) (Object) stackIn_70_0).a(stackIn_70_1 != 0, 1332);
                stackOut_70_0 = vva.field_r;
                stackIn_74_0 = stackOut_70_0;
                stackIn_71_0 = stackOut_70_0;
                if (!param0) {
                  break L24;
                } else {
                  stackOut_71_0 = (llb) (Object) stackIn_71_0;
                  stackIn_74_0 = stackOut_71_0;
                  stackIn_72_0 = stackOut_71_0;
                  if (param2) {
                    break L24;
                  } else {
                    stackOut_72_0 = (llb) (Object) stackIn_72_0;
                    stackIn_74_0 = stackOut_72_0;
                    stackIn_73_0 = stackOut_72_0;
                    if (wo.field_o) {
                      break L24;
                    } else {
                      stackOut_73_0 = (llb) (Object) stackIn_73_0;
                      stackOut_73_1 = 1;
                      stackIn_75_0 = stackOut_73_0;
                      stackIn_75_1 = stackOut_73_1;
                      break L23;
                    }
                  }
                }
              }
              stackOut_74_0 = (llb) (Object) stackIn_74_0;
              stackOut_74_1 = 0;
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              break L23;
            }
            ((llb) (Object) stackIn_75_0).a(stackIn_75_1 != 0, 1332);
            L25: {
              L26: {
                stackOut_77_0 = jfb.field_o;
                stackIn_81_0 = stackOut_77_0;
                stackIn_78_0 = stackOut_77_0;
                if (!param0) {
                  break L26;
                } else {
                  stackOut_78_0 = (llb) (Object) stackIn_78_0;
                  stackIn_81_0 = stackOut_78_0;
                  stackIn_79_0 = stackOut_78_0;
                  if (param2) {
                    break L26;
                  } else {
                    stackOut_79_0 = (llb) (Object) stackIn_79_0;
                    stackIn_81_0 = stackOut_79_0;
                    stackIn_80_0 = stackOut_79_0;
                    if (!wo.field_o) {
                      break L26;
                    } else {
                      stackOut_80_0 = (llb) (Object) stackIn_80_0;
                      stackOut_80_1 = 1;
                      stackIn_82_0 = stackOut_80_0;
                      stackIn_82_1 = stackOut_80_1;
                      break L25;
                    }
                  }
                }
              }
              stackOut_81_0 = (llb) (Object) stackIn_81_0;
              stackOut_81_1 = 0;
              stackIn_82_0 = stackOut_81_0;
              stackIn_82_1 = stackOut_81_1;
              break L25;
            }
            L27: {
              ((llb) (Object) stackIn_82_0).a(stackIn_82_1 != 0, 1332);
              hra.field_o.field_a.i(10000);
              if (ohb.field_o == null) {
                break L27;
              } else {
                L28: {
                  if (nt.field_q.field_o != 0) {
                    ts.a(false, param3);
                    break L28;
                  } else {
                    break L28;
                  }
                }
                L29: {
                  if (qsa.field_b.field_o == 0) {
                    break L29;
                  } else {
                    if (ii.field_h) {
                      stb.a(38, param3);
                      break L29;
                    } else {
                      mjb.a((byte) 108, param3);
                      break L29;
                    }
                  }
                }
                asb.a(param3, ohb.field_o, true, (byte) -67);
                break L27;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var4, "soa.C(" + param0 + 44 + -99 + 44 + param2 + 44 + param3 + 41);
        }
    }

    soa(long param0, llb param1, llb param2, pjb param3) {
        super(param0, (llb) null);
        try {
            ((soa) this).field_xb = new llb(0L, param2);
            ((soa) this).field_vb = new pjb(0L, param3);
            ((soa) this).b(-561, ((soa) this).field_xb);
            ((soa) this).b(-561, (llb) (Object) ((soa) this).field_vb);
            ((soa) this).field_wb = param1;
            ((soa) this).field_xb.b(-561, param1);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "soa.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((soa) this).field_hb = param0;
        ((soa) this).field_K = param4;
        ((soa) this).field_G = param3;
        ((soa) this).field_L = param5;
        this.a(param6, 87, param1);
        if (param2 != -1) {
            ((soa) this).field_vb = null;
        }
    }

    private final void a(int param0, int param1, boolean param2, int param3, int param4) {
        L0: {
          if (((soa) this).field_vb.h(0)) {
            ((soa) this).field_wb.field_db = ((soa) this).field_wb.field_db + param3;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (!((soa) this).field_vb.j(-6)) {
            break L1;
          } else {
            ((soa) this).field_wb.field_db = ((soa) this).field_wb.field_db - param3;
            break L1;
          }
        }
        L2: {
          if (((soa) this).field_vb.i(20)) {
            ((soa) this).field_wb.field_db = ((soa) this).field_wb.field_db + param0;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (!((soa) this).field_vb.b(true)) {
            break L3;
          } else {
            ((soa) this).field_wb.field_db = ((soa) this).field_wb.field_db - param0;
            break L3;
          }
        }
        L4: {
          if (((soa) this).field_O) {
            ((soa) this).field_wb.field_db = ((soa) this).field_wb.field_db - param4;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (!param2) {
            L6: {
              if (((soa) this).field_wb.field_G + (((soa) this).field_wb.field_E - ((soa) this).field_xb.field_G) < -(((soa) this).field_wb.field_K - -((soa) this).field_wb.field_db)) {
                ((soa) this).field_wb.field_db = -((soa) this).field_wb.field_K + -(((soa) this).field_wb.field_E + (((soa) this).field_wb.field_G - ((soa) this).field_xb.field_G));
                break L6;
              } else {
                break L6;
              }
            }
            if (-(((soa) this).field_wb.field_K + ((soa) this).field_wb.field_db) >= 0) {
              break L5;
            } else {
              ((soa) this).field_wb.field_db = -((soa) this).field_wb.field_K;
              break L5;
            }
          } else {
            L7: {
              if (-(((soa) this).field_wb.field_K - -((soa) this).field_wb.field_db) >= 0) {
                break L7;
              } else {
                ((soa) this).field_wb.field_db = -((soa) this).field_wb.field_K;
                break L7;
              }
            }
            if (-((soa) this).field_xb.field_G + (((soa) this).field_wb.field_E + ((soa) this).field_wb.field_G) >= -(((soa) this).field_wb.field_K - -((soa) this).field_wb.field_db)) {
              break L5;
            } else {
              ((soa) this).field_wb.field_db = -(-((soa) this).field_xb.field_G + ((soa) this).field_wb.field_E + ((soa) this).field_wb.field_G) - ((soa) this).field_wb.field_K;
              break L5;
            }
          }
        }
        L8: {
          if (param1 == 48) {
            break L8;
          } else {
            ((soa) this).field_xb = null;
            break L8;
          }
        }
        L9: {
          if (((soa) this).field_vb.a(true)) {
            ((soa) this).field_wb.field_K = -((soa) this).field_vb.a(((soa) this).field_wb.field_G, ((soa) this).field_xb.field_G, (byte) -123, param2);
            ((soa) this).field_wb.field_db = 0;
            break L9;
          } else {
            break L9;
          }
        }
        ((soa) this).field_vb.a(((soa) this).field_wb.field_G, -((soa) this).field_wb.field_K, (byte) -126, ((soa) this).field_xb.field_G);
    }

    private final boolean a(boolean param0, boolean param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (!param0) {
            if (((soa) this).field_O) {
              if (!param1) {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_5_0 = 0;
                stackIn_8_0 = stackOut_5_0;
                break L0;
              }
            } else {
              stackOut_3_0 = 0;
              stackIn_8_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 1;
            stackIn_8_0 = stackOut_1_0;
            break L0;
          }
        }
        var8 = stackIn_8_0;
        ((soa) this).field_wb.a(param4, -91, ((soa) this).field_xb.field_G, var8 != 0);
        this.a(param2, 48, false, param5, param3);
        return var8 != 0;
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        if (param3 != 0) {
            ((soa) this).field_wb = null;
        }
        this.a(((soa) this).field_xb.field_G, param3 + 48, param1, param2, param0);
    }

    static {
    }
}
