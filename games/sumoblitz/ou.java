/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ou extends na {
    static String field_g;
    private boolean field_e;
    private String field_f;

    ou(dh param0) {
        super(param0);
        ((ou) this).field_e = false;
    }

    final void e(int param0) {
        ((ou) this).field_f = null;
        if (param0 != -1) {
            ou.a(false, -24, (byte) -79);
        }
    }

    final static void d(byte param0) {
        if (!vs.b((byte) 9)) {
            if (!nt.field_r) {
                if (!(nq.field_g != null)) {
                    nq.field_g = ew.a((byte) -92, 4);
                }
                if (!(!nq.field_g.field_o)) {
                    kh.field_e = kh.field_e | nq.field_g.field_k;
                    wj.field_e = wj.field_e & ~nq.field_g.field_k;
                    nt.field_r = true;
                    nq.field_g = null;
                }
            }
        }
        if (null == ah.field_g) {
            boolean discarded$0 = ki.b(6);
        }
    }

    final static void a(int param0, int param1) {
        if (param0 < 107) {
            ou.a(-41, -16);
        }
        pl var2 = as.field_v;
        var2.g(param1, 8);
        var2.b((byte) 116, 1);
        var2.b((byte) 107, 2);
    }

    final String a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        an var4 = null;
        CharSequence var5 = null;
        String stackIn_4_0 = null;
        Object stackIn_11_0 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        String stackOut_15_0 = null;
        String stackOut_3_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              var5 = (CharSequence) (Object) param1;
              var3 = ti.a(false, var5);
              if (param0 == 0) {
                break L1;
              } else {
                ou.c((byte) 14);
                break L1;
              }
            }
            if (var3 == null) {
              L2: {
                if (!param1.equals((Object) (Object) ((ou) this).field_f)) {
                  var4 = im.a((byte) -109, param1);
                  if (var4 != null) {
                    if (var4.field_g == null) {
                      ((ou) this).field_e = var4.field_b;
                      ((ou) this).field_f = param1;
                      break L2;
                    } else {
                      stackOut_10_0 = null;
                      stackIn_11_0 = stackOut_10_0;
                      return (String) (Object) stackIn_11_0;
                    }
                  } else {
                    return null;
                  }
                } else {
                  break L2;
                }
              }
              if (!((ou) this).field_e) {
                stackOut_15_0 = au.field_e;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                return ck.field_b;
              }
            } else {
              stackOut_3_0 = (String) var3;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3_ref;
            stackOut_17_1 = new StringBuilder().append("ou.B(").append(param0).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
        return stackIn_16_0;
    }

    final gf a(byte param0, String param1) {
        an var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        gf stackIn_3_0 = null;
        gf stackIn_11_0 = null;
        gf stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        gf stackOut_2_0 = null;
        gf stackOut_10_0 = null;
        gf stackOut_15_0 = null;
        gf stackOut_14_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            var4 = (CharSequence) (Object) param1;
            if (!gr.a(var4, (byte) 53)) {
              stackOut_2_0 = qr.field_e;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (param0 == 26) {
                  break L1;
                } else {
                  ((ou) this).e(-22);
                  break L1;
                }
              }
              L2: {
                if (param1.equals((Object) (Object) ((ou) this).field_f)) {
                  break L2;
                } else {
                  L3: {
                    var3 = im.a((byte) -71, param1);
                    if (var3 == null) {
                      break L3;
                    } else {
                      if (var3.field_g == null) {
                        ((ou) this).field_e = var3.field_b;
                        ((ou) this).field_f = param1;
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackOut_10_0 = kt.field_a;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              }
              L4: {
                if (!((ou) this).field_e) {
                  stackOut_15_0 = qr.field_e;
                  stackIn_16_0 = stackOut_15_0;
                  break L4;
                } else {
                  stackOut_14_0 = qe.field_a;
                  stackIn_16_0 = stackOut_14_0;
                  break L4;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3_ref;
            stackOut_17_1 = new StringBuilder().append("ou.E(").append(param0).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
        return stackIn_16_0;
    }

    public static void c(byte param0) {
        int var1 = 119 % ((-43 - param0) / 63);
        field_g = null;
    }

    final static void a(boolean param0, int param1, byte param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String[] var11 = null;
        String[] var12 = null;
        String var13 = null;
        String var14 = null;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        String[] stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        String[] stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        String[] stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        String stackIn_41_2 = null;
        String[] stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        String[] stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        String[] stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        String stackIn_47_2 = null;
        int stackIn_87_0 = 0;
        String stackIn_87_1 = null;
        int stackIn_88_0 = 0;
        String stackIn_88_1 = null;
        int stackIn_89_0 = 0;
        String stackIn_89_1 = null;
        int stackIn_89_2 = 0;
        int stackIn_104_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_106_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        String[] stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        String[] stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        String stackOut_46_2 = null;
        String[] stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        String stackOut_45_2 = null;
        String[] stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        String[] stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        String stackOut_40_2 = null;
        String[] stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        String stackOut_39_2 = null;
        int stackOut_103_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_105_1 = 0;
        int stackOut_104_0 = 0;
        int stackOut_104_1 = 0;
        int stackOut_86_0 = 0;
        String stackOut_86_1 = null;
        int stackOut_88_0 = 0;
        String stackOut_88_1 = null;
        int stackOut_88_2 = 0;
        int stackOut_87_0 = 0;
        String stackOut_87_1 = null;
        int stackOut_87_2 = 0;
        L0: {
          var10 = Sumoblitz.field_L ? 1 : 0;
          sr.field_d = true;
          cl.field_s = param1;
          if (0 == cl.field_s) {
            var3_int = wo.a(mb.field_c, qq.field_R, hn.field_j, false, ms.field_c);
            var4 = 3 - -var3_int;
            bf.field_c = new String[var4];
            eb.field_a = new int[var4];
            var5 = 0;
            L1: while (true) {
              if (var4 <= var5) {
                jo.field_b = new int[2];
                var5 = 0;
                L2: while (true) {
                  if (var5 >= var3_int) {
                    bf.field_c[-3 + var4] = "";
                    bf.field_c[-2 + var4] = pp.field_f;
                    eb.field_a[-2 + var4] = 0;
                    jo.field_b[0] = 4;
                    bf.field_c[-1 + var4] = jh.field_I;
                    eb.field_a[-1 + var4] = 1;
                    jo.field_b[1] = 5;
                    break L0;
                  } else {
                    bf.field_c[var5] = mb.field_c[var5];
                    var5++;
                    continue L2;
                  }
                }
              } else {
                eb.field_a[var5] = -1;
                var5++;
                continue L1;
              }
            }
          } else {
            if (cl.field_s != 1) {
              if (cl.field_s != 2) {
                if (cl.field_s == 3) {
                  L3: {
                    if (!lt.field_m.field_f) {
                      var3_int = wo.a(mb.field_c, qq.field_R, hn.field_j, false, fr.field_lb);
                      break L3;
                    } else {
                      var3_int = wo.a(mb.field_c, qq.field_R, hn.field_j, false, ni.field_f);
                      break L3;
                    }
                  }
                  var4 = var3_int + 2;
                  eb.field_a = new int[var4];
                  bf.field_c = new String[var4];
                  var5 = 0;
                  L4: while (true) {
                    if (var4 <= var5) {
                      jo.field_b = new int[1];
                      var5 = 0;
                      L5: while (true) {
                        if (var3_int <= var5) {
                          bf.field_c[-2 + var4] = "";
                          bf.field_c[-1 + var4] = jh.field_I;
                          eb.field_a[-1 + var4] = 0;
                          jo.field_b[0] = 5;
                          break L0;
                        } else {
                          bf.field_c[var5] = mb.field_c[var5];
                          var5++;
                          continue L5;
                        }
                      }
                    } else {
                      eb.field_a[var5] = -1;
                      var5++;
                      continue L4;
                    }
                  }
                } else {
                  if (4 != cl.field_s) {
                    if (cl.field_s != 5) {
                      throw new IllegalArgumentException();
                    } else {
                      var3_int = wo.a(mb.field_c, qq.field_R, hn.field_j, false, ua.field_i);
                      var4 = 3 - -var3_int;
                      eb.field_a = new int[var4];
                      bf.field_c = new String[var4];
                      var5 = 0;
                      L6: while (true) {
                        if (var4 <= var5) {
                          jo.field_b = new int[2];
                          var5 = 0;
                          L7: while (true) {
                            if (var5 >= var3_int) {
                              bf.field_c[-3 + var4] = "";
                              bf.field_c[var4 - 2] = kq.field_Q;
                              eb.field_a[-2 + var4] = 0;
                              jo.field_b[0] = 3;
                              bf.field_c[var4 + -1] = jh.field_I;
                              eb.field_a[var4 - 1] = 1;
                              jo.field_b[1] = 5;
                              break L0;
                            } else {
                              bf.field_c[var5] = mb.field_c[var5];
                              var5++;
                              continue L7;
                            }
                          }
                        } else {
                          eb.field_a[var5] = -1;
                          var5++;
                          continue L6;
                        }
                      }
                    }
                  } else {
                    var3_int = wo.a(mb.field_c, qq.field_R, hn.field_j, false, sr.field_c);
                    var4 = var3_int + 2;
                    bf.field_c = new String[var4];
                    eb.field_a = new int[var4];
                    var5 = 0;
                    L8: while (true) {
                      if (var5 >= var4) {
                        jo.field_b = new int[1];
                        var5 = 0;
                        L9: while (true) {
                          if (var3_int <= var5) {
                            bf.field_c[-2 + var4] = "";
                            bf.field_c[var4 - 1] = jh.field_I;
                            eb.field_a[var4 - 1] = 0;
                            jo.field_b[0] = 5;
                            break L0;
                          } else {
                            bf.field_c[var5] = mb.field_c[var5];
                            var5++;
                            continue L9;
                          }
                        }
                      } else {
                        eb.field_a[var5] = -1;
                        var5++;
                        continue L8;
                      }
                    }
                  }
                }
              } else {
                var3_int = wo.a(mb.field_c, qq.field_R, hn.field_j, false, ic.a(qo.field_c, new String[1], (byte) -128));
                var4 = -1;
                var5 = 0;
                L10: while (true) {
                  L11: {
                    if (var3_int <= var5) {
                      break L11;
                    } else {
                      if ("<%0>".equals((Object) (Object) mb.field_c[var5])) {
                        var4 = var5;
                        break L11;
                      } else {
                        var5++;
                        continue L10;
                      }
                    }
                  }
                  if (var4 == -1) {
                    throw new IllegalStateException();
                  } else {
                    no.field_b = new String[var4];
                    la.a((Object[]) (Object) mb.field_c, 0, (Object[]) (Object) no.field_b, 0, var4);
                    uw.field_c = new String[-1 + -var4 + var3_int];
                    la.a((Object[]) (Object) mb.field_c, var4 + 1, (Object[]) (Object) uw.field_c, 0, -var4 + (var3_int - 1));
                    var4 = -1;
                    var3_int = wo.a(mb.field_c, qq.field_R, hn.field_j, false, ic.a(lq.field_a, new String[1], (byte) -128));
                    var5 = 0;
                    L12: while (true) {
                      L13: {
                        if (var5 >= var3_int) {
                          break L13;
                        } else {
                          if (!"<%0>".equals((Object) (Object) mb.field_c[var5])) {
                            var5++;
                            continue L12;
                          } else {
                            var4 = var5;
                            break L13;
                          }
                        }
                      }
                      if (var4 == -1) {
                        throw new IllegalStateException();
                      } else {
                        L14: {
                          hf.field_F = new String[var4];
                          la.a((Object[]) (Object) mb.field_c, 0, (Object[]) (Object) hf.field_F, 0, var4);
                          uw.field_b = new String[-1 + (-var4 + var3_int)];
                          la.a((Object[]) (Object) mb.field_c, var4 - -1, (Object[]) (Object) uw.field_b, 0, -1 + -var4 + var3_int);
                          if (no.field_b.length >= hf.field_F.length) {
                            stackOut_29_0 = no.field_b.length;
                            stackIn_30_0 = stackOut_29_0;
                            break L14;
                          } else {
                            stackOut_28_0 = hf.field_F.length;
                            stackIn_30_0 = stackOut_28_0;
                            break L14;
                          }
                        }
                        L15: {
                          var5 = stackIn_30_0;
                          if (uw.field_b.length <= uw.field_c.length) {
                            stackOut_32_0 = uw.field_c.length;
                            stackIn_33_0 = stackOut_32_0;
                            break L15;
                          } else {
                            stackOut_31_0 = uw.field_b.length;
                            stackIn_33_0 = stackOut_31_0;
                            break L15;
                          }
                        }
                        var6 = stackIn_33_0;
                        var7 = var6 + 7 + var5;
                        bf.field_c = new String[var7];
                        eb.field_a = new int[var7];
                        var8 = 0;
                        L16: while (true) {
                          if (var8 >= var7) {
                            jo.field_b = new int[2];
                            bf.field_c[0] = fd.field_i;
                            bf.field_c[1] = km.field_m;
                            eb.field_a[1] = 0;
                            jo.field_b[1] = 2;
                            jo.field_b[0] = 5;
                            eb.field_a[3] = 1;
                            bf.field_c[5] = "";
                            bf.field_c[3] = up.field_b;
                            bf.field_c[2] = ws.field_a;
                            bf.field_c[4] = oh.field_b;
                            var8 = 0;
                            L17: while (true) {
                              if (var8 >= var5) {
                                bf.field_c[6 - -var5] = null;
                                eb.field_a[var5 + 6] = -2;
                                var8 = 0;
                                L18: while (true) {
                                  if (var6 <= var8) {
                                    iv.field_f = wq.a(-17);
                                    break L0;
                                  } else {
                                    L19: {
                                      stackOut_44_0 = bf.field_c;
                                      stackOut_44_1 = var5 + (7 + var8);
                                      stackIn_46_0 = stackOut_44_0;
                                      stackIn_46_1 = stackOut_44_1;
                                      stackIn_45_0 = stackOut_44_0;
                                      stackIn_45_1 = stackOut_44_1;
                                      if (uw.field_b.length <= var8) {
                                        stackOut_46_0 = (String[]) (Object) stackIn_46_0;
                                        stackOut_46_1 = stackIn_46_1;
                                        stackOut_46_2 = "";
                                        stackIn_47_0 = stackOut_46_0;
                                        stackIn_47_1 = stackOut_46_1;
                                        stackIn_47_2 = stackOut_46_2;
                                        break L19;
                                      } else {
                                        stackOut_45_0 = (String[]) (Object) stackIn_45_0;
                                        stackOut_45_1 = stackIn_45_1;
                                        stackOut_45_2 = uw.field_b[var8];
                                        stackIn_47_0 = stackOut_45_0;
                                        stackIn_47_1 = stackOut_45_1;
                                        stackIn_47_2 = stackOut_45_2;
                                        break L19;
                                      }
                                    }
                                    stackIn_47_0[stackIn_47_1] = stackIn_47_2;
                                    var8++;
                                    continue L18;
                                  }
                                }
                              } else {
                                L20: {
                                  stackOut_38_0 = bf.field_c;
                                  stackOut_38_1 = var8 + 6;
                                  stackIn_40_0 = stackOut_38_0;
                                  stackIn_40_1 = stackOut_38_1;
                                  stackIn_39_0 = stackOut_38_0;
                                  stackIn_39_1 = stackOut_38_1;
                                  if (hf.field_F.length + (var8 - var5) < 0) {
                                    stackOut_40_0 = (String[]) (Object) stackIn_40_0;
                                    stackOut_40_1 = stackIn_40_1;
                                    stackOut_40_2 = "";
                                    stackIn_41_0 = stackOut_40_0;
                                    stackIn_41_1 = stackOut_40_1;
                                    stackIn_41_2 = stackOut_40_2;
                                    break L20;
                                  } else {
                                    stackOut_39_0 = (String[]) (Object) stackIn_39_0;
                                    stackOut_39_1 = stackIn_39_1;
                                    stackOut_39_2 = hf.field_F[var8 - -hf.field_F.length + -var5];
                                    stackIn_41_0 = stackOut_39_0;
                                    stackIn_41_1 = stackOut_39_1;
                                    stackIn_41_2 = stackOut_39_2;
                                    break L20;
                                  }
                                }
                                stackIn_41_0[stackIn_41_1] = stackIn_41_2;
                                var8++;
                                continue L17;
                              }
                            }
                          } else {
                            eb.field_a[var8] = -1;
                            var8++;
                            continue L16;
                          }
                        }
                      }
                    }
                  }
                }
              }
            } else {
              var3_int = wo.a(mb.field_c, qq.field_R, hn.field_j, false, ms.field_c);
              var4 = var3_int + 2;
              eb.field_a = new int[var4];
              bf.field_c = new String[var4];
              var5 = 0;
              L21: while (true) {
                if (var4 <= var5) {
                  jo.field_b = new int[1];
                  var5 = 0;
                  L22: while (true) {
                    if (var5 >= var3_int) {
                      bf.field_c[-2 + var4] = "";
                      bf.field_c[-1 + var4] = jh.field_I;
                      eb.field_a[var4 + -1] = 0;
                      jo.field_b[0] = 5;
                      break L0;
                    } else {
                      bf.field_c[var5] = mb.field_c[var5];
                      var5++;
                      continue L22;
                    }
                  }
                } else {
                  eb.field_a[var5] = -1;
                  var5++;
                  continue L21;
                }
              }
            }
          }
        }
        nj.field_a.field_e = jo.field_b.length;
        var3_int = 0;
        var4 = 0;
        L23: while (true) {
          if (var4 >= bf.field_c.length) {
            L24: {
              if (cl.field_s == 2) {
                var11 = no.field_b;
                var5 = 0;
                L25: while (true) {
                  if (var11.length <= var5) {
                    var12 = uw.field_c;
                    var5 = 0;
                    L26: while (true) {
                      if (var12.length <= var5) {
                        break L24;
                      } else {
                        L27: {
                          var14 = var12[var5];
                          var7 = gt.a((byte) -120, var14, false);
                          if (var7 <= var3_int) {
                            break L27;
                          } else {
                            break L27;
                          }
                        }
                        var5++;
                        continue L26;
                      }
                    }
                  } else {
                    L28: {
                      var13 = var11[var5];
                      var7 = gt.a((byte) -42, var13, false);
                      if (var7 <= var3_int) {
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    var5++;
                    continue L25;
                  }
                }
              } else {
                break L24;
              }
            }
            hu.field_b = -(var3_int >> 1) + oj.field_a;
            dj.field_n = var3_int + oj.field_a - (var3_int >> 1);
            rf.field_d = nj.field_a.field_e * (ag.field_b + qc.field_a << 1);
            var4 = 0;
            L29: while (true) {
              if (var4 >= bf.field_c.length) {
                hh.field_f = -(rf.field_d >> 1) + nv.field_b;
                var4 = -96 % ((param2 - 48) / 57);
                ib.field_g = new int[bf.field_c.length][];
                var5 = 0;
                var6 = hh.field_f;
                L30: while (true) {
                  if (bf.field_c.length <= var5) {
                    L31: {
                      if (cl.field_s == 2) {
                        nj.field_a.a(param0, 84, -1, -1);
                        break L31;
                      } else {
                        nj.field_a.a(param0, -27, wg.b(pi.field_e, 1882601153, ko.field_p), 0);
                        break L31;
                      }
                    }
                    return;
                  } else {
                    L32: {
                      var7 = eb.field_a[var5];
                      if (var7 < 0) {
                        var6 = var6 + fn.field_t;
                        break L32;
                      } else {
                        var8 = gt.a((byte) -116, bf.field_c[var5], true);
                        var9 = -(var8 >> 1) + oj.field_a;
                        var6 = var6 + qc.field_a;
                        ib.field_g[var5] = new int[4];
                        ib.field_g[var5][0] = var9 - dw.field_b;
                        ib.field_g[var5][1] = var6;
                        ib.field_g[var5][2] = (dw.field_b << 1) + var8;
                        var6 = var6 + (qc.field_a + (ag.field_b << 1) - -ga.field_h);
                        ib.field_g[var5][3] = (ag.field_b << 1) + ga.field_h;
                        break L32;
                      }
                    }
                    var5++;
                    continue L30;
                  }
                }
              } else {
                L33: {
                  stackOut_103_0 = rf.field_d;
                  stackIn_105_0 = stackOut_103_0;
                  stackIn_104_0 = stackOut_103_0;
                  if (0 <= eb.field_a[var4]) {
                    stackOut_105_0 = stackIn_105_0;
                    stackOut_105_1 = ga.field_h;
                    stackIn_106_0 = stackOut_105_0;
                    stackIn_106_1 = stackOut_105_1;
                    break L33;
                  } else {
                    stackOut_104_0 = stackIn_104_0;
                    stackOut_104_1 = fn.field_t;
                    stackIn_106_0 = stackOut_104_0;
                    stackIn_106_1 = stackOut_104_1;
                    break L33;
                  }
                }
                rf.field_d = stackIn_106_0 + stackIn_106_1;
                var4++;
                continue L29;
              }
            }
          } else {
            L34: {
              stackOut_86_0 = -27;
              stackOut_86_1 = bf.field_c[var4];
              stackIn_88_0 = stackOut_86_0;
              stackIn_88_1 = stackOut_86_1;
              stackIn_87_0 = stackOut_86_0;
              stackIn_87_1 = stackOut_86_1;
              if (eb.field_a[var4] < 0) {
                stackOut_88_0 = stackIn_88_0;
                stackOut_88_1 = (String) (Object) stackIn_88_1;
                stackOut_88_2 = 0;
                stackIn_89_0 = stackOut_88_0;
                stackIn_89_1 = stackOut_88_1;
                stackIn_89_2 = stackOut_88_2;
                break L34;
              } else {
                stackOut_87_0 = stackIn_87_0;
                stackOut_87_1 = (String) (Object) stackIn_87_1;
                stackOut_87_2 = 1;
                stackIn_89_0 = stackOut_87_0;
                stackIn_89_1 = stackOut_87_1;
                stackIn_89_2 = stackOut_87_2;
                break L34;
              }
            }
            L35: {
              var5 = gt.a((byte) stackIn_89_0, stackIn_89_1, stackIn_89_2 != 0);
              if (var5 <= var3_int) {
                break L35;
              } else {
                break L35;
              }
            }
            var4++;
            continue L23;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "save";
    }
}
