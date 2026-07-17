/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl {
    static int[] field_k;
    private long[] field_b;
    private int field_c;
    private byte[] field_e;
    private byte[] field_m;
    private long[] field_a;
    private long[] field_j;
    static String field_g;
    private long[] field_d;
    private long[] field_h;
    static String field_i;
    private int field_f;
    static ri field_l;

    final void b(int param0) {
        int var2 = 0;
        int var3 = ZombieDawnMulti.field_E ? 1 : 0;
        for (var2 = 0; 32 > var2; var2++) {
            ((wl) this).field_e[var2] = (byte) 0;
        }
        ((wl) this).field_c = 0;
        ((wl) this).field_m[0] = (byte) 0;
        if (param0 != 32) {
            Object var4 = null;
            ((wl) this).a((byte[]) null, 76, -115);
        }
        ((wl) this).field_f = 0;
        for (var2 = 0; var2 < 8; var2++) {
            ((wl) this).field_j[var2] = 0L;
        }
    }

    final void a(byte[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        Object var9 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              ((wl) this).field_m[((wl) this).field_c] = (byte)cr.b((int) ((wl) this).field_m[((wl) this).field_c], 128 >>> tq.b(((wl) this).field_f, 7));
              ((wl) this).field_c = ((wl) this).field_c + 1;
              if (((wl) this).field_c > 32) {
                L2: while (true) {
                  if (((wl) this).field_c >= 64) {
                    this.a(param1 + -3);
                    ((wl) this).field_c = 0;
                    break L1;
                  } else {
                    int fieldTemp$2 = ((wl) this).field_c;
                    ((wl) this).field_c = ((wl) this).field_c + 1;
                    ((wl) this).field_m[fieldTemp$2] = (byte) 0;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L3: while (true) {
              if (((wl) this).field_c >= 32) {
                L4: {
                  d.a(((wl) this).field_e, 0, ((wl) this).field_m, 32, 32);
                  this.a(-2);
                  var4_int = 0;
                  if (param1 == 1) {
                    break L4;
                  } else {
                    var9 = null;
                    wl.a(-29, (tq) null, -43, 102, (byte) 41, -126, (dm) null);
                    break L4;
                  }
                }
                var5 = param2;
                L5: while (true) {
                  if (var4_int >= 8) {
                    break L0;
                  } else {
                    var6 = ((wl) this).field_j[var4_int];
                    param0[var5] = (byte)(int)(var6 >>> 56);
                    param0[1 + var5] = (byte)(int)(var6 >>> 48);
                    param0[2 + var5] = (byte)(int)(var6 >>> 40);
                    param0[var5 + 3] = (byte)(int)(var6 >>> 32);
                    param0[4 + var5] = (byte)(int)(var6 >>> 24);
                    param0[5 + var5] = (byte)(int)(var6 >>> 16);
                    param0[6 + var5] = (byte)(int)(var6 >>> 8);
                    param0[var5 - -7] = (byte)(int)var6;
                    var5 += 8;
                    var4_int++;
                    continue L5;
                  }
                }
              } else {
                int fieldTemp$3 = ((wl) this).field_c;
                ((wl) this).field_c = ((wl) this).field_c + 1;
                ((wl) this).field_m[fieldTemp$3] = (byte) 0;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("wl.E(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var6 = ZombieDawnMulti.field_E ? 1 : 0;
          var2 = 0;
          if (param0 == -2) {
            break L0;
          } else {
            field_l = null;
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          if (var2 >= 8) {
            var2 = 0;
            L2: while (true) {
              if (8 <= var2) {
                var2 = 1;
                L3: while (true) {
                  if (var2 > 10) {
                    var2 = 0;
                    L4: while (true) {
                      if (8 <= var2) {
                        return;
                      } else {
                        ((wl) this).field_j[var2] = tq.a(((wl) this).field_j[var2], tq.a(((wl) this).field_h[var2], ((wl) this).field_b[var2]));
                        var2++;
                        continue L4;
                      }
                    }
                  } else {
                    var3 = 0;
                    L5: while (true) {
                      if (var3 >= 8) {
                        var3 = 0;
                        L6: while (true) {
                          if (var3 >= 8) {
                            ((wl) this).field_d[0] = tq.a(((wl) this).field_d[0], p.field_d[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if (var3 >= 8) {
                                var3 = 0;
                                L8: while (true) {
                                  if (var3 >= 8) {
                                    var2++;
                                    continue L3;
                                  } else {
                                    ((wl) this).field_b[var3] = ((wl) this).field_a[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                ((wl) this).field_a[var3] = ((wl) this).field_d[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L9: while (true) {
                                  if (var7 >= 8) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    ((wl) this).field_a[var3] = tq.a(((wl) this).field_a[var3], p.field_f[var7][tq.b((int)(((wl) this).field_b[tq.b(7, var3 - var7)] >>> var5), 255)]);
                                    var7++;
                                    var5 -= 8;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            ((wl) this).field_d[var3] = ((wl) this).field_a[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        ((wl) this).field_a[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if (var4 >= 8) {
                            var3++;
                            continue L5;
                          } else {
                            ((wl) this).field_a[var3] = tq.a(((wl) this).field_a[var3], p.field_f[var4][tq.b(255, (int)(((wl) this).field_d[tq.b(7, -var4 + var3)] >>> var5))]);
                            var4++;
                            var5 -= 8;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                ((wl) this).field_d[var2] = ((wl) this).field_j[var2];
                ((wl) this).field_b[var2] = tq.a(((wl) this).field_h[var2], ((wl) this).field_j[var2]);
                var2++;
                continue L2;
              }
            }
          } else {
            ((wl) this).field_h[var2] = tq.a(en.a(255L, (long)((wl) this).field_m[7 + var3]), tq.a(en.a(255L, (long)((wl) this).field_m[6 + var3]) << 8, tq.a(en.a(255L, (long)((wl) this).field_m[var3 - -5]) << 16, tq.a(tq.a(tq.a(en.a(280375465082880L, (long)((wl) this).field_m[var3 - -2] << 40), tq.a((long)((wl) this).field_m[var3] << 56, en.a((long)((wl) this).field_m[var3 - -1], 255L) << 48)), en.a((long)((wl) this).field_m[var3 - -3] << 32, 1095216660480L)), en.a((long)((wl) this).field_m[var3 + 4] << 24, 4278190080L)))));
            var2++;
            var3 += 8;
            continue L1;
          }
        }
    }

    public static void a(boolean param0) {
        field_l = null;
        field_k = null;
        field_g = null;
        field_i = null;
    }

    final void a(byte[] param0, int param1, long param2) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        long var10 = 0L;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var14 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var5_int = -58 / ((-10 - param1) / 50);
            var6 = 0;
            var7 = 8 + -((int)param2 & 7) & 7;
            var8 = 7 & ((wl) this).field_f;
            var10 = param2;
            var12 = 31;
            var13 = 0;
            L1: while (true) {
              if (var12 < 0) {
                L2: while (true) {
                  if (param2 <= 8L) {
                    L3: {
                      if (param2 > 0L) {
                        var9 = 255 & param0[var6] << var7;
                        ((wl) this).field_m[((wl) this).field_c] = (byte)cr.b((int) ((wl) this).field_m[((wl) this).field_c], var9 >>> var8);
                        break L3;
                      } else {
                        var9 = 0;
                        break L3;
                      }
                    }
                    L4: {
                      if ((long)var8 - -param2 >= 8L) {
                        L5: {
                          param2 = param2 - (long)(-var8 + 8);
                          ((wl) this).field_c = ((wl) this).field_c + 1;
                          ((wl) this).field_f = ((wl) this).field_f + (8 + -var8);
                          if (((wl) this).field_f == 512) {
                            this.a(-2);
                            ((wl) this).field_c = 0;
                            ((wl) this).field_f = 0;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        ((wl) this).field_m[((wl) this).field_c] = (byte)tq.b(255, var9 << -var8 + 8);
                        ((wl) this).field_f = ((wl) this).field_f + (int)param2;
                        break L4;
                      } else {
                        ((wl) this).field_f = (int)((long)((wl) this).field_f + param2);
                        break L4;
                      }
                    }
                    break L0;
                  } else {
                    L6: {
                      var9 = param0[var6] << var7 & 255 | (param0[1 + var6] & 255) >>> 8 + -var7;
                      if (0 > var9) {
                        break L6;
                      } else {
                        if (var9 < 256) {
                          L7: {
                            ((wl) this).field_m[((wl) this).field_c] = (byte)cr.b((int) ((wl) this).field_m[((wl) this).field_c], var9 >>> var8);
                            ((wl) this).field_c = ((wl) this).field_c + 1;
                            ((wl) this).field_f = ((wl) this).field_f + (-var8 + 8);
                            if (512 == ((wl) this).field_f) {
                              this.a(-2);
                              ((wl) this).field_f = 0;
                              ((wl) this).field_c = 0;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          ((wl) this).field_m[((wl) this).field_c] = (byte)tq.b(var9 << 8 + -var8, 255);
                          param2 = param2 - 8L;
                          ((wl) this).field_f = ((wl) this).field_f + var8;
                          var6++;
                          continue L2;
                        } else {
                          break L6;
                        }
                      }
                    }
                    throw new RuntimeException("LOGIC ERROR");
                  }
                }
              } else {
                var13 = var13 + ((255 & ((wl) this).field_e[var12]) + (255 & (int)var10));
                ((wl) this).field_e[var12] = (byte)var13;
                var10 = var10 >>> 8;
                var13 = var13 >>> 8;
                var12--;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var5;
            stackOut_23_1 = new StringBuilder().append("wl.D(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        String var4_ref_String = null;
        int var5 = 0;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        Object var13 = null;
        Object var14 = null;
        Object var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        String var20 = null;
        Object var21 = null;
        CharSequence var22 = null;
        L0: {
          var21 = null;
          var11 = ZombieDawnMulti.field_E ? 1 : 0;
          var3 = 1;
          if (sp.field_h) {
            break L0;
          } else {
            if (lj.field_v == null) {
              var3 = 0;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (va.field_a != 0) {
            break L1;
          } else {
            if (ej.field_n != null) {
              var3 = 0;
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (va.field_a != 2) {
            break L2;
          } else {
            if (!tl.d((byte) -20)) {
              var3 = 0;
              break L2;
            } else {
              break L2;
            }
          }
        }
        if (sj.field_p != 84) {
          if (sj.field_p == 85) {
            L3: {
              if (var3 == 0) {
                break L3;
              } else {
                if (rm.field_a.length() <= 0) {
                  break L3;
                } else {
                  StringBuilder discarded$3 = lf.a(' ', rm.field_a.length() - 1, 0, rm.field_a);
                  break L3;
                }
              }
            }
            return true;
          } else {
            var4 = pn.field_d;
            if (og.a((char) var4, (byte) 123)) {
              L4: {
                if (var3 == 0) {
                  break L4;
                } else {
                  if (80 > rm.field_a.length()) {
                    L5: {
                      StringBuilder discarded$4 = rm.field_a.append(var4);
                      var5 = 485;
                      var17 = ta.field_lb;
                      var7 = var17;
                      var7 = var17;
                      var16 = nh.a(2, var17);
                      var7 = var16;
                      var7 = var16;
                      var19 = var16;
                      var7 = var19;
                      var7 = var19;
                      if (va.field_a != 2) {
                        L6: {
                          var7 = "";
                          if (va.field_a == 0) {
                            L7: {
                              if (null != mh.field_c) {
                                break L7;
                              } else {
                                if (!sn.field_Hb) {
                                  break L7;
                                } else {
                                  var7 = "[" + ne.field_vb + "] ";
                                  break L7;
                                }
                              }
                            }
                            if (mh.field_c != null) {
                              L8: {
                                if (!wa.field_k) {
                                  break L8;
                                } else {
                                  if (bp.field_t != null) {
                                    var7 = "[" + bp.field_t + "] ";
                                    break L6;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              var7 = "[" + vl.a(ae.field_g, new String[1], 2) + "] ";
                              break L6;
                            } else {
                              break L6;
                            }
                          } else {
                            break L6;
                          }
                        }
                        var20 = var7 + var19 + ": ";
                        var5 = var5 - w.field_A.a(var20);
                        break L5;
                      } else {
                        var22 = (CharSequence) (Object) qf.field_g;
                        var18 = vl.a(v.field_c, new String[1], 2);
                        var7 = var18;
                        var7 = var18;
                        var8 = vl.a(lc.field_n, new String[1], 2);
                        var7 = var8;
                        var7 = var8;
                        var9 = w.field_A.a(var18);
                        var10 = w.field_A.a(var8);
                        if (~var10 > ~var9) {
                          var5 = var5 - var9;
                          break L5;
                        } else {
                          var5 = var5 - var10;
                          break L5;
                        }
                      }
                    }
                    if (~w.field_A.a(rm.field_a.toString()) >= ~var5) {
                      break L4;
                    } else {
                      StringBuilder discarded$5 = lf.a(' ', -1 + rm.field_a.length(), 0, rm.field_a);
                      break L4;
                    }
                  } else {
                    return true;
                  }
                }
              }
              return true;
            } else {
              L9: {
                if (param1 >= 30) {
                  break L9;
                } else {
                  field_i = null;
                  break L9;
                }
              }
              return false;
            }
          }
        } else {
          L10: {
            if (var3 != 0) {
              L11: {
                if (rm.field_a.length() > 0) {
                  var4_ref_String = rm.field_a.toString();
                  if (!so.a(-115, var4_ref_String)) {
                    L12: {
                      var5 = va.field_a;
                      if (var5 != 0) {
                        break L12;
                      } else {
                        if (mh.field_c == null) {
                          break L12;
                        } else {
                          var5 = 1;
                          break L12;
                        }
                      }
                    }
                    L13: {
                      if (ga.a(var5, true) == 2) {
                        kp.a(var5, param2, 1, true);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    kb.a(-1, qf.field_g, param0, var4_ref_String, va.field_a, 29602);
                    break L11;
                  } else {
                    var13 = null;
                    var12 = null;
                    vm.a((String) null, 0, (String) null, iq.field_d, 2, 0);
                    var15 = null;
                    var14 = null;
                    vm.a((String) null, 0, (String) null, o.field_l, 2, 0);
                    break L11;
                  }
                } else {
                  break L11;
                }
              }
              pf.a(64);
              break L10;
            } else {
              if (0 == va.field_a) {
                break L10;
              } else {
                pf.a(48);
                break L10;
              }
            }
          }
          return true;
        }
    }

    final static void a(int param0, tq param1, int param2, int param3, byte param4, int param5, dm param6) {
        jb var13 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        try {
            ve.a(param6.field_ec, 196, param6.field_Lb, param1, param6.field_Jb, (cj) (Object) param6, -1, (int[]) null, -1);
            pk.field_b.a(true, (byte) -102);
            pk.field_b.a(0, (int[]) null, (byte) 13);
            pk.field_b.c(param4 ^ -42);
            if (param4 != 81) {
                boolean discarded$0 = wl.a(-56, -95, -27);
            }
            var13 = pk.field_b;
            var8 = param5;
            var9 = param0;
            var10 = param3;
            var11 = param2;
            var13.field_j.b(4542, var8, var11, var9, var10);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "wl.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + (param6 != null ? "{...}" : "null") + 41);
        }
    }

    wl() {
        ((wl) this).field_b = new long[8];
        ((wl) this).field_m = new byte[64];
        ((wl) this).field_j = new long[8];
        ((wl) this).field_d = new long[8];
        ((wl) this).field_e = new byte[32];
        ((wl) this).field_a = new long[8];
        ((wl) this).field_f = 0;
        ((wl) this).field_h = new long[8];
        ((wl) this).field_c = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Powerups with this modifier can be used on enemy zombies, but can only be applied to a few - experiment with it...";
        field_i = "End of Free Game";
    }
}
