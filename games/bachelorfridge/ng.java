/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng {
    private jj[] field_g;
    private gj field_m;
    static js field_f;
    private sna field_j;
    static sna field_e;
    private kv field_k;
    private jj field_i;
    sna field_l;
    static String field_n;
    private int field_c;
    static kv field_a;
    private jj field_h;
    private int[] field_b;
    private sna field_d;
    private int[] field_o;

    public static void c(int param0) {
        field_f = null;
        field_a = null;
        field_e = null;
        if (param0 != -621) {
            field_f = null;
        }
        field_n = null;
    }

    final void b(byte param0) {
        jj var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        sfa var8 = null;
        int var9 = 0;
        ad var10 = null;
        int stackIn_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        var9 = BachelorFridge.field_y;
        var10 = ((ng) this).field_m.field_P;
        if (!((ng) this).field_m.a(var10.field_s, 2)) {
          return;
        } else {
          L0: {
            var3 = (jj) (Object) ((ng) this).field_d.field_z.b((byte) 90);
            var4 = 0;
            if (param0 > 31) {
              break L0;
            } else {
              field_n = null;
              break L0;
            }
          }
          L1: {
            L2: {
              if (var10.field_s.field_y == 40) {
                break L2;
              } else {
                if (var10.field_s.field_y == 42) {
                  break L2;
                } else {
                  if (var10.field_s.field_y == 39) {
                    break L2;
                  } else {
                    stackOut_8_0 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    break L1;
                  }
                }
              }
            }
            stackOut_9_0 = 0;
            stackIn_10_0 = stackOut_9_0;
            break L1;
          }
          var5 = stackIn_10_0;
          L3: while (true) {
            if (var3 == null) {
              L4: {
                if (~((ng) this).field_m.field_n != ~var10.field_s.field_D) {
                  ((ng) this).field_l.field_kb = ((ng) this).field_d.field_kb + 30;
                  ((ng) this).field_l.field_rb = ((ng) this).field_d.field_rb - -40;
                  ((ng) this).field_l.a(19842, true);
                  break L4;
                } else {
                  break L4;
                }
              }
              return;
            } else {
              L5: {
                var6 = -1;
                if (var3.field_zb != -1) {
                  var6 = var3.field_zb;
                  if (var3.field_zb == -1) {
                    break L5;
                  } else {
                    if (al.a(-119, var3.field_zb).field_a != 3) {
                      if (!var3.field_T) {
                        break L5;
                      } else {
                        if (var3.field_R != 1) {
                          break L5;
                        } else {
                          if (~var4 <= ~var10.field_s.field_m.length) {
                            break L5;
                          } else {
                            if (!var3.field_yb) {
                              break L5;
                            } else {
                              L6: {
                                var7 = ur.field_e[var3.field_zb].field_a;
                                if (var5 == 0) {
                                  break L6;
                                } else {
                                  L7: {
                                    if (!var10.field_l) {
                                      break L7;
                                    } else {
                                      var8 = ((ng) this).field_m.b(var10, true);
                                      ((ng) this).field_m.a(var10.field_s.field_u, (byte) 126);
                                      if (var3.field_zb != var8.field_g) {
                                        break L7;
                                      } else {
                                        return;
                                      }
                                    }
                                  }
                                  L8: {
                                    if (((ng) this).field_m.field_M != 1) {
                                      break L8;
                                    } else {
                                      if (var7 != 2) {
                                        break L8;
                                      } else {
                                        ((ng) this).field_m.a((byte) -30, var10.field_s.b(var3.field_zb, (byte) -116));
                                        uca.a(38, (byte) 108);
                                        return;
                                      }
                                    }
                                  }
                                  L9: {
                                    if (((ng) this).field_m.field_M != 2) {
                                      break L9;
                                    } else {
                                      if (var7 != 1) {
                                        break L9;
                                      } else {
                                        if (!var10.field_s.c((byte) -10, var6)) {
                                          break L9;
                                        } else {
                                          ((ng) this).field_m.b(var10.field_s.b(var3.field_zb, (byte) -122), -1);
                                          return;
                                        }
                                      }
                                    }
                                  }
                                  if (((ng) this).field_m.field_M != 2) {
                                    break L6;
                                  } else {
                                    if (var7 == 4) {
                                      ((ng) this).field_m.a(16776960, var10.field_s.b(var3.field_zb, (byte) -126));
                                      return;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                              lf.field_c = 0;
                              break L5;
                            }
                          }
                        }
                      }
                    } else {
                      break L5;
                    }
                  }
                } else {
                  break L5;
                }
              }
              L10: {
                var4++;
                if (var3.field_T) {
                  var3.field_vb = var3.field_vb + 1;
                  break L10;
                } else {
                  var3.field_vb = 0;
                  break L10;
                }
              }
              var3 = (jj) (Object) ((ng) this).field_d.field_z.c(0);
              continue L3;
            }
          }
        }
    }

    private final int a(byte param0, int[] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var7 = BachelorFridge.field_y;
        try {
          L0: {
            var3_int = 0;
            var4 = param1;
            var5 = 0;
            L1: while (true) {
              if (var4.length <= var5) {
                stackOut_6_0 = var3_int;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                L2: {
                  var6 = var4[var5];
                  if (var6 == -1) {
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("ng.G(").append(-127).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_7_0;
    }

    final static boolean a(byte param0) {
        Object var2 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -24) {
            break L0;
          } else {
            var2 = null;
            aga discarded$2 = ng.a((op) null, 101, (lu) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if (bp.e(-29919)) {
              break L2;
            } else {
              if (dm.field_f > 0) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final void b(int param0, int param1, int param2) {
        ((ng) this).field_d.field_rb = param2 - 6;
        if (param0 != -3) {
            field_e = null;
        }
        ((ng) this).field_d.field_kb = param1 - 6;
        ((ng) this).field_i.field_kb = ((ng) this).field_d.field_kb + 56;
        ((ng) this).field_i.field_rb = ((ng) this).field_d.field_rb + 96;
        ((ng) this).field_h.field_rb = ((ng) this).field_d.field_rb - -80;
        ((ng) this).field_h.field_kb = ((ng) this).field_d.field_kb - -63;
    }

    final void c(int param0, int param1, int param2) {
        ((ng) this).field_d.field_rb = param0 - 22;
        ((ng) this).field_d.field_kb = param1 + -6;
        ((ng) this).a(-106);
        if (param2 != -40) {
            ((ng) this).b((byte) 63);
        }
    }

    final void a(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        jj var8 = null;
        int var9 = 0;
        sfa var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        oha var13_ref_oha = null;
        int var14_int = 0;
        String var14 = null;
        int var15_int = 0;
        String var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        oha var24 = null;
        ad var25 = null;
        oha var26 = null;
        oha var27 = null;
        oha var28 = null;
        String var29 = null;
        String var30 = null;
        oha var31 = null;
        kv stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_44_2 = 0;
        int[] stackIn_44_3 = null;
        kv stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        int stackIn_45_2 = 0;
        int[] stackIn_45_3 = null;
        kv stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        int stackIn_46_2 = 0;
        int[] stackIn_46_3 = null;
        int stackIn_46_4 = 0;
        kv stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        int stackIn_48_2 = 0;
        int[] stackIn_48_3 = null;
        kv stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        int stackIn_49_2 = 0;
        int[] stackIn_49_3 = null;
        kv stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        int[] stackIn_50_3 = null;
        int stackIn_50_4 = 0;
        int stackIn_137_0 = 0;
        int stackIn_143_0 = 0;
        int stackIn_150_0 = 0;
        int stackIn_171_0 = 0;
        int stackIn_175_0 = 0;
        int stackIn_193_0 = 0;
        int stackIn_196_0 = 0;
        int stackIn_196_1 = 0;
        int stackIn_197_0 = 0;
        int stackIn_197_1 = 0;
        int stackIn_198_0 = 0;
        int stackIn_198_1 = 0;
        int stackIn_198_2 = 0;
        kv stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        int stackOut_47_2 = 0;
        int[] stackOut_47_3 = null;
        kv stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        int[] stackOut_49_3 = null;
        int stackOut_49_4 = 0;
        kv stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        int stackOut_48_2 = 0;
        int[] stackOut_48_3 = null;
        int stackOut_48_4 = 0;
        kv stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        int stackOut_43_2 = 0;
        int[] stackOut_43_3 = null;
        kv stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        int stackOut_45_2 = 0;
        int[] stackOut_45_3 = null;
        int stackOut_45_4 = 0;
        kv stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        int stackOut_44_2 = 0;
        int[] stackOut_44_3 = null;
        int stackOut_44_4 = 0;
        int stackOut_192_0 = 0;
        int stackOut_191_0 = 0;
        int stackOut_195_0 = 0;
        int stackOut_195_1 = 0;
        int stackOut_197_0 = 0;
        int stackOut_197_1 = 0;
        int stackOut_197_2 = 0;
        int stackOut_196_0 = 0;
        int stackOut_196_1 = 0;
        int stackOut_196_2 = 0;
        int stackOut_169_0 = 0;
        int stackOut_170_0 = 0;
        int stackOut_173_0 = 0;
        int stackOut_174_0 = 0;
        int stackOut_148_0 = 0;
        int stackOut_149_0 = 0;
        int stackOut_141_0 = 0;
        int stackOut_142_0 = 0;
        int stackOut_136_0 = 0;
        int stackOut_135_0 = 0;
        L0: {
          var23 = BachelorFridge.field_y;
          var25 = ((ng) this).field_m.field_P;
          var5 = ((ng) this).field_m.field_n;
          var6 = -8 % ((-4 - param1) / 59);
          if (~var25.field_s.field_D != ~var5) {
            ((ng) this).field_l.field_kb = ((ng) this).field_d.field_kb + 30;
            ((ng) this).field_l.field_rb = ((ng) this).field_d.field_rb - -40;
            ((ng) this).field_l.a(true, 7802);
            break L0;
          } else {
            if (((ng) this).field_c != 0) {
              break L0;
            } else {
              L1: {
                ((ng) this).field_d.a(true, 7802);
                var7 = ((ng) this).field_d.field_z.g(0);
                if (var7 != 1) {
                  if (var7 == 2) {
                    ((ng) this).field_k.e(((ng) this).field_d.field_kb + 58, ((ng) this).field_d.field_rb + 12, 96, 64, 255);
                    break L1;
                  } else {
                    if (var7 != 3) {
                      if (var7 != 4) {
                        break L1;
                      } else {
                        ((ng) this).field_k.e(((ng) this).field_d.field_kb - -34, ((ng) this).field_d.field_rb - -6, 144, 84, 255);
                        break L1;
                      }
                    } else {
                      ((ng) this).field_k.e(48 + ((ng) this).field_d.field_kb, ((ng) this).field_d.field_rb - -6, 116, 72, 255);
                      break L1;
                    }
                  }
                } else {
                  ((ng) this).field_k.e(74 + ((ng) this).field_d.field_kb, ((ng) this).field_d.field_rb + 2, 64, 64, 255);
                  break L1;
                }
              }
              L2: {
                if (var25.field_s.field_y != 0) {
                  L3: {
                    var8_int = 105;
                    var9 = 12;
                    if (var25.field_s.field_y == 31) {
                      break L3;
                    } else {
                      if (var25.field_s.g((byte) 85)) {
                        break L3;
                      } else {
                        ad.field_h.a(lga.a(true, new String[1], vla.field_p), var8_int + ((ng) this).field_d.field_kb, var9 + ((ng) this).field_d.field_rb, 2, -1);
                        var9 -= 15;
                        break L3;
                      }
                    }
                  }
                  ad.field_h.a(c.field_k[var25.field_s.field_y], ((ng) this).field_d.field_kb - -var8_int, var9 + ((ng) this).field_d.field_rb, 2, -1);
                  break L2;
                } else {
                  break L2;
                }
              }
              var8 = (jj) (Object) ((ng) this).field_d.field_z.b((byte) 90);
              var9 = 0;
              var10 = ((ng) this).field_m.b(var25, true);
              L4: while (true) {
                L5: {
                  if (var8 == null) {
                    break L5;
                  } else {
                    if (var9 >= var25.field_s.field_m.length) {
                      break L5;
                    } else {
                      var11 = var25.field_s.field_m[var9];
                      var9++;
                      if (-1 != var11) {
                        L6: {
                          var26 = al.a(116, var8.field_zb);
                          if (((ng) this).field_m.field_P.field_s.field_y == 40) {
                            break L6;
                          } else {
                            if (((ng) this).field_m.field_P.field_s.field_y == 42) {
                              break L6;
                            } else {
                              if (((ng) this).field_m.field_P.field_s.field_y != 39) {
                                if (var26.field_a == 2) {
                                  break L6;
                                } else {
                                  if (var26.field_a == 1) {
                                    if (2 != ((ng) this).field_m.field_M) {
                                      break L6;
                                    } else {
                                      boolean discarded$4 = var25.field_s.c((byte) -10, var26.field_j);
                                      break L6;
                                    }
                                  } else {
                                    L7: {
                                      if (((ng) this).field_m.field_h.a(((ng) this).field_m.field_Y, false) <= 0) {
                                        break L7;
                                      } else {
                                        if (var26.field_a != 4) {
                                          break L7;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                    boolean discarded$5 = var25.field_s.c((byte) -10, var26.field_j);
                                    break L6;
                                  }
                                }
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        L8: {
                          L9: {
                            L10: {
                              if (var10 == null) {
                                break L10;
                              } else {
                                if (var10.field_g != var8.field_zb) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            L11: {
                              if (((ng) this).field_m.field_Z == null) {
                                break L11;
                              } else {
                                if (~((ng) this).field_m.field_Z.field_g != ~var8.field_zb) {
                                  break L9;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            if (var8.field_xb > 2) {
                              L12: {
                                stackOut_47_0 = vma.field_j[var8.field_xb + -3];
                                stackOut_47_1 = var8.field_kb + (((ng) this).field_d.field_kb + -19);
                                stackOut_47_2 = -9 + ((ng) this).field_d.field_rb - -var8.field_rb;
                                stackOut_47_3 = ((ng) this).field_b;
                                stackIn_49_0 = stackOut_47_0;
                                stackIn_49_1 = stackOut_47_1;
                                stackIn_49_2 = stackOut_47_2;
                                stackIn_49_3 = stackOut_47_3;
                                stackIn_48_0 = stackOut_47_0;
                                stackIn_48_1 = stackOut_47_1;
                                stackIn_48_2 = stackOut_47_2;
                                stackIn_48_3 = stackOut_47_3;
                                if (((ng) this).field_m.field_L % 128 >= 64) {
                                  stackOut_49_0 = (kv) (Object) stackIn_49_0;
                                  stackOut_49_1 = stackIn_49_1;
                                  stackOut_49_2 = stackIn_49_2;
                                  stackOut_49_3 = (int[]) (Object) stackIn_49_3;
                                  stackOut_49_4 = 127 + -(((ng) this).field_m.field_L % 128);
                                  stackIn_50_0 = stackOut_49_0;
                                  stackIn_50_1 = stackOut_49_1;
                                  stackIn_50_2 = stackOut_49_2;
                                  stackIn_50_3 = stackOut_49_3;
                                  stackIn_50_4 = stackOut_49_4;
                                  break L12;
                                } else {
                                  stackOut_48_0 = (kv) (Object) stackIn_48_0;
                                  stackOut_48_1 = stackIn_48_1;
                                  stackOut_48_2 = stackIn_48_2;
                                  stackOut_48_3 = (int[]) (Object) stackIn_48_3;
                                  stackOut_48_4 = ((ng) this).field_m.field_L % 128;
                                  stackIn_50_0 = stackOut_48_0;
                                  stackIn_50_1 = stackOut_48_1;
                                  stackIn_50_2 = stackOut_48_2;
                                  stackIn_50_3 = stackOut_48_3;
                                  stackIn_50_4 = stackOut_48_4;
                                  break L12;
                                }
                              }
                              ((kv) (Object) stackIn_50_0).e(stackIn_50_1, stackIn_50_2, stackIn_50_3[stackIn_50_4]);
                              break L8;
                            } else {
                              L13: {
                                stackOut_43_0 = bfa.field_b[var8.field_xb];
                                stackOut_43_1 = var8.field_kb + ((ng) this).field_d.field_kb - 10;
                                stackOut_43_2 = var8.field_rb + (((ng) this).field_d.field_rb - 9);
                                stackOut_43_3 = ((ng) this).field_b;
                                stackIn_45_0 = stackOut_43_0;
                                stackIn_45_1 = stackOut_43_1;
                                stackIn_45_2 = stackOut_43_2;
                                stackIn_45_3 = stackOut_43_3;
                                stackIn_44_0 = stackOut_43_0;
                                stackIn_44_1 = stackOut_43_1;
                                stackIn_44_2 = stackOut_43_2;
                                stackIn_44_3 = stackOut_43_3;
                                if (((ng) this).field_m.field_L % 128 >= 64) {
                                  stackOut_45_0 = (kv) (Object) stackIn_45_0;
                                  stackOut_45_1 = stackIn_45_1;
                                  stackOut_45_2 = stackIn_45_2;
                                  stackOut_45_3 = (int[]) (Object) stackIn_45_3;
                                  stackOut_45_4 = -(((ng) this).field_m.field_L % 128) + 127;
                                  stackIn_46_0 = stackOut_45_0;
                                  stackIn_46_1 = stackOut_45_1;
                                  stackIn_46_2 = stackOut_45_2;
                                  stackIn_46_3 = stackOut_45_3;
                                  stackIn_46_4 = stackOut_45_4;
                                  break L13;
                                } else {
                                  stackOut_44_0 = (kv) (Object) stackIn_44_0;
                                  stackOut_44_1 = stackIn_44_1;
                                  stackOut_44_2 = stackIn_44_2;
                                  stackOut_44_3 = (int[]) (Object) stackIn_44_3;
                                  stackOut_44_4 = ((ng) this).field_m.field_L % 128;
                                  stackIn_46_0 = stackOut_44_0;
                                  stackIn_46_1 = stackOut_44_1;
                                  stackIn_46_2 = stackOut_44_2;
                                  stackIn_46_3 = stackOut_44_3;
                                  stackIn_46_4 = stackOut_44_4;
                                  break L13;
                                }
                              }
                              ((kv) (Object) stackIn_46_0).e(stackIn_46_1, stackIn_46_2, stackIn_46_3[stackIn_46_4]);
                              break L8;
                            }
                          }
                          if (var8.field_xb <= 2) {
                            bfa.field_b[var8.field_xb].e(-10 + ((ng) this).field_d.field_kb - -var8.field_kb, ((ng) this).field_d.field_rb + var8.field_rb + -9, 12889);
                            break L8;
                          } else {
                            vma.field_j[-3 + var8.field_xb].e(((ng) this).field_d.field_kb + (var8.field_kb + -19), -9 + (var8.field_rb + ((ng) this).field_d.field_rb), 12889);
                            break L8;
                          }
                        }
                        L14: {
                          if (var8.field_zb == -1) {
                            break L14;
                          } else {
                            if (al.a(-125, var8.field_zb).field_a == 3) {
                              break L14;
                            } else {
                              var8 = (jj) (Object) ((ng) this).field_d.field_z.c(0);
                              break L14;
                            }
                          }
                        }
                        continue L4;
                      } else {
                        L15: {
                          if (var8.field_zb == -1) {
                            break L15;
                          } else {
                            if (al.a(-125, var8.field_zb).field_a == 3) {
                              break L15;
                            } else {
                              var8 = (jj) (Object) ((ng) this).field_d.field_z.c(0);
                              break L15;
                            }
                          }
                        }
                        continue L4;
                      }
                    }
                  }
                }
                var8 = (jj) (Object) ((ng) this).field_d.field_z.b((byte) 90);
                L16: while (true) {
                  if (var8 == null) {
                    if (((ng) this).field_m.field_r) {
                      var8 = (jj) (Object) ((ng) this).field_d.field_z.b((byte) 90);
                      L17: while (true) {
                        if (var8 == null) {
                          L18: {
                            if (((ng) this).field_i.field_vb <= 50) {
                              break L18;
                            } else {
                              if (!((ng) this).field_i.field_T) {
                                break L18;
                              } else {
                                if (0 == var25.field_s.field_y) {
                                  break L18;
                                } else {
                                  L19: {
                                    var30 = pna.field_zb[var25.field_s.field_y].field_d;
                                    var29 = pna.field_zb[var25.field_s.field_y].field_e;
                                    var13 = mk.field_p - -4;
                                    var14_int = gd.field_m + 4;
                                    var15_int = ad.field_h.c(var29, 200) - -10;
                                    if (var15_int + var13 <= 620) {
                                      break L19;
                                    } else {
                                      var13 = var13 + (-20 + -var15_int - (var13 - 640));
                                      break L19;
                                    }
                                  }
                                  L20: {
                                    var16 = ad.field_h.a(var29, 200, 0) - -(ad.field_h.field_F << 1);
                                    if (~(var16 + var14_int) >= ~i.field_a.field_rb) {
                                      break L20;
                                    } else {
                                      var14_int = var14_int + (-var14_int + -var16 + i.field_a.field_rb);
                                      break L20;
                                    }
                                  }
                                  dg.a(13 + var13, var14_int, var15_int + 6, var16, 10, 65793, 128);
                                  ad.field_h.c(var30, var13 + 20, var14_int + 16, 0, -1);
                                  int discarded$6 = ad.field_h.a(var29, var13 - -20, 20 + var14_int, 200, 200, 0, -1, 0, 0, 0);
                                  break L18;
                                }
                              }
                            }
                          }
                          L21: {
                            if (((ng) this).field_h.field_vb <= 50) {
                              break L21;
                            } else {
                              if (!((ng) this).field_h.field_T) {
                                break L21;
                              } else {
                                if (var10 == null) {
                                  break L21;
                                } else {
                                  L22: {
                                    var31 = al.a(-128, var10.field_g);
                                    var12 = mk.field_p - -4;
                                    var13 = gd.field_m - -4;
                                    var14 = var31.a((byte) 37);
                                    var15 = var31.field_k;
                                    if (var31.field_a != 1) {
                                      stackOut_192_0 = 0;
                                      stackIn_193_0 = stackOut_192_0;
                                      break L22;
                                    } else {
                                      stackOut_191_0 = 1;
                                      stackIn_193_0 = stackOut_191_0;
                                      break L22;
                                    }
                                  }
                                  L23: {
                                    var16 = stackIn_193_0;
                                    var17 = 10 + ad.field_h.c(var15, 200);
                                    if (var17 + var12 <= 620) {
                                      break L23;
                                    } else {
                                      var12 = var12 + (-var17 + -var12 + 620);
                                      break L23;
                                    }
                                  }
                                  L24: {
                                    stackOut_195_0 = ad.field_h.a(var15, 200, 10);
                                    stackOut_195_1 = ad.field_h.field_F;
                                    stackIn_197_0 = stackOut_195_0;
                                    stackIn_197_1 = stackOut_195_1;
                                    stackIn_196_0 = stackOut_195_0;
                                    stackIn_196_1 = stackOut_195_1;
                                    if (var16 == 0) {
                                      stackOut_197_0 = stackIn_197_0;
                                      stackOut_197_1 = stackIn_197_1;
                                      stackOut_197_2 = 1;
                                      stackIn_198_0 = stackOut_197_0;
                                      stackIn_198_1 = stackOut_197_1;
                                      stackIn_198_2 = stackOut_197_2;
                                      break L24;
                                    } else {
                                      stackOut_196_0 = stackIn_196_0;
                                      stackOut_196_1 = stackIn_196_1;
                                      stackOut_196_2 = 2;
                                      stackIn_198_0 = stackOut_196_0;
                                      stackIn_198_1 = stackOut_196_1;
                                      stackIn_198_2 = stackOut_196_2;
                                      break L24;
                                    }
                                  }
                                  L25: {
                                    var18 = stackIn_198_0 + (stackIn_198_1 << stackIn_198_2);
                                    if (i.field_a.field_rb >= var13 + var18) {
                                      break L25;
                                    } else {
                                      var13 = var13 + (i.field_a.field_rb + -var13 - var18);
                                      break L25;
                                    }
                                  }
                                  dg.a(var12 - -13, var13, 6 + var17, var18, 10, 65793, 164);
                                  ad.field_h.c(var14, 20 + var12, var13 + 20, 0, -1);
                                  int discarded$7 = ad.field_h.a(var15, 20 + var12, var13 + 24, 200, 200, 0, -1, 0, 0, 10);
                                  var19 = ad.field_h.a(var15, 200, 8);
                                  if (var16 != 0) {
                                    L26: {
                                      L27: {
                                        var20 = ((t) (Object) var31).field_q;
                                        var21 = ((t) (Object) var31).field_u;
                                        var22 = 2;
                                        if (((t) (Object) var31).field_p == 1) {
                                          break L27;
                                        } else {
                                          if (((t) (Object) var31).field_p == 4) {
                                            break L27;
                                          } else {
                                            break L26;
                                          }
                                        }
                                      }
                                      var22 = 3;
                                      break L26;
                                    }
                                    L28: {
                                      if (var20 < 0) {
                                        break L28;
                                      } else {
                                        var20 = (int)((double)var20 * it.field_c[var25.field_s.field_k[var22]] / 100.0);
                                        break L28;
                                      }
                                    }
                                    ad.field_h.c("Damage " + var20, 20 + var12, var19 + 48 + var13, 0, -1);
                                    if (var21 == 0) {
                                      break L21;
                                    } else {
                                      ad.field_h.b("Status effect " + kna.field_g[var21], var12 + (var17 + 10), 44 + (var13 - -var19), 0, -1);
                                      break L0;
                                    }
                                  } else {
                                    break L0;
                                  }
                                }
                              }
                            }
                          }
                          break L0;
                        } else {
                          L29: {
                            if (!var8.field_T) {
                              break L29;
                            } else {
                              if (50 >= var8.field_vb) {
                                break L29;
                              } else {
                                L30: {
                                  L31: {
                                    var28 = al.a(117, var8.field_zb);
                                    var12 = 620;
                                    var13 = i.field_a.field_rb;
                                    var14_int = 4 + mk.field_p;
                                    var15_int = gd.field_m + 4;
                                    if (var8.field_yb) {
                                      break L31;
                                    } else {
                                      if (!var25.field_s.f(0, var8.field_zb)) {
                                        break L31;
                                      } else {
                                        stackOut_169_0 = 1;
                                        stackIn_171_0 = stackOut_169_0;
                                        break L30;
                                      }
                                    }
                                  }
                                  stackOut_170_0 = 0;
                                  stackIn_171_0 = stackOut_170_0;
                                  break L30;
                                }
                                L32: {
                                  L33: {
                                    var16 = stackIn_171_0;
                                    if (var8.field_yb) {
                                      break L33;
                                    } else {
                                      if (var25.field_s.c((byte) -10, var8.field_zb)) {
                                        break L33;
                                      } else {
                                        stackOut_173_0 = 1;
                                        stackIn_175_0 = stackOut_173_0;
                                        break L32;
                                      }
                                    }
                                  }
                                  stackOut_174_0 = 0;
                                  stackIn_175_0 = stackOut_174_0;
                                  break L32;
                                }
                                L34: {
                                  var17 = stackIn_175_0;
                                  if (!var25.field_s.a(false, var8.field_zb)) {
                                    break L34;
                                  } else {
                                    var17 = 1;
                                    var16 = 0;
                                    break L34;
                                  }
                                }
                                bi.a(var13, var17 != 0, 20, var28, var14_int, var12, var15_int, var16 != 0, var25.field_s.a(var28, -5313));
                                break L29;
                              }
                            }
                          }
                          var8 = (jj) (Object) ((ng) this).field_d.field_z.c(0);
                          continue L17;
                        }
                      }
                    } else {
                      break L0;
                    }
                  } else {
                    L35: {
                      var24 = al.a(-95, var8.field_zb);
                      var27 = var24;
                      dg.b(11 + var8.field_kb + ((ng) this).field_d.field_kb, 11 + var8.field_rb + ((ng) this).field_d.field_rb, 15, 65793);
                      if (!(var27 instanceof tv)) {
                        if (var27 instanceof hd) {
                          L36: {
                            L37: {
                              if (var10 == null) {
                                break L37;
                              } else {
                                if (var8.field_zb == var10.field_g) {
                                  break L36;
                                } else {
                                  break L37;
                                }
                              }
                            }
                            L38: {
                              if (((ng) this).field_m.field_Z == null) {
                                break L38;
                              } else {
                                if (~var8.field_zb == ~((ng) this).field_m.field_Z.field_g) {
                                  break L36;
                                } else {
                                  break L38;
                                }
                              }
                            }
                            L39: {
                              if (var8.field_yb) {
                                break L39;
                              } else {
                                if (var25.field_s.c((byte) -10, var8.field_zb)) {
                                  nia.field_l[var27.field_b].e(-5 + var8.field_kb + ((ng) this).field_d.field_kb, -5 + (var8.field_rb + ((ng) this).field_d.field_rb), 11250603);
                                  break L35;
                                } else {
                                  break L39;
                                }
                              }
                            }
                            nia.field_l[ur.field_e[var8.field_zb].field_b].e(-5 + ((ng) this).field_d.field_kb + var8.field_kb, -5 + ((ng) this).field_d.field_rb - -var8.field_rb, 14964736);
                            break L35;
                          }
                          nia.field_l[var27.field_b].e(-5 + ((ng) this).field_d.field_kb - -var8.field_kb, ((ng) this).field_d.field_rb - (-var8.field_rb + 5), 16769792);
                          break L35;
                        } else {
                          if (!(var27 instanceof t)) {
                            break L35;
                          } else {
                            L40: {
                              if (1 == ((t) (Object) var27).field_p) {
                                break L40;
                              } else {
                                if (2 != ((t) (Object) var27).field_p) {
                                  if (((t) (Object) var27).field_p != 4) {
                                    L41: {
                                      L42: {
                                        if (var10 == null) {
                                          break L42;
                                        } else {
                                          if (var10.field_g == var8.field_zb) {
                                            break L41;
                                          } else {
                                            break L42;
                                          }
                                        }
                                      }
                                      L43: {
                                        if (null == ((ng) this).field_m.field_Z) {
                                          break L43;
                                        } else {
                                          if (var8.field_zb == ((ng) this).field_m.field_Z.field_g) {
                                            break L41;
                                          } else {
                                            break L43;
                                          }
                                        }
                                      }
                                      L44: {
                                        if (var8.field_yb) {
                                          break L44;
                                        } else {
                                          if (var25.field_s.c((byte) -10, var8.field_zb)) {
                                            nia.field_l[var27.field_b].e(-5 + ((ng) this).field_d.field_kb + var8.field_kb, ((ng) this).field_d.field_rb - (-var8.field_rb + 5), 11250603);
                                            break L35;
                                          } else {
                                            break L44;
                                          }
                                        }
                                      }
                                      nia.field_l[ur.field_e[var8.field_zb].field_b].e(((ng) this).field_d.field_kb - -var8.field_kb + -5, ((ng) this).field_d.field_rb + (var8.field_rb - 5), 15204352);
                                      break L35;
                                    }
                                    nia.field_l[var27.field_b].e(-5 + (((ng) this).field_d.field_kb + var8.field_kb), ((ng) this).field_d.field_rb + var8.field_rb + -5, 16725815);
                                    break L35;
                                  } else {
                                    L45: {
                                      L46: {
                                        if (var10 == null) {
                                          break L46;
                                        } else {
                                          if (~var10.field_g == ~var8.field_zb) {
                                            break L45;
                                          } else {
                                            break L46;
                                          }
                                        }
                                      }
                                      L47: {
                                        if (((ng) this).field_m.field_Z == null) {
                                          break L47;
                                        } else {
                                          if (~var8.field_zb != ~((ng) this).field_m.field_Z.field_g) {
                                            break L47;
                                          } else {
                                            break L45;
                                          }
                                        }
                                      }
                                      L48: {
                                        if (var8.field_yb) {
                                          break L48;
                                        } else {
                                          if (!var25.field_s.c((byte) -10, var8.field_zb)) {
                                            break L48;
                                          } else {
                                            nia.field_l[var27.field_b].e(((ng) this).field_d.field_kb + (var8.field_kb + -5), ((ng) this).field_d.field_rb + (var8.field_rb - 5), 11250603);
                                            break L35;
                                          }
                                        }
                                      }
                                      nia.field_l[ur.field_e[var8.field_zb].field_b].e(var8.field_kb + (((ng) this).field_d.field_kb - 5), ((ng) this).field_d.field_rb - (-var8.field_rb + 5), 16754688);
                                      break L35;
                                    }
                                    nia.field_l[var27.field_b].e(-5 + var8.field_kb + ((ng) this).field_d.field_kb, -5 + ((ng) this).field_d.field_rb - -var8.field_rb, 16769792);
                                    break L35;
                                  }
                                } else {
                                  break L40;
                                }
                              }
                            }
                            L49: {
                              L50: {
                                if (var10 == null) {
                                  break L50;
                                } else {
                                  if (~var10.field_g == ~var8.field_zb) {
                                    break L49;
                                  } else {
                                    break L50;
                                  }
                                }
                              }
                              L51: {
                                if (((ng) this).field_m.field_Z == null) {
                                  break L51;
                                } else {
                                  if (((ng) this).field_m.field_Z.field_g != var8.field_zb) {
                                    break L51;
                                  } else {
                                    break L49;
                                  }
                                }
                              }
                              L52: {
                                if (var8.field_yb) {
                                  break L52;
                                } else {
                                  if (var25.field_s.c((byte) -10, var8.field_zb)) {
                                    nia.field_l[var27.field_b].e(-5 + (var8.field_kb + ((ng) this).field_d.field_kb), ((ng) this).field_d.field_rb + (var8.field_rb - 5), 11250603);
                                    break L35;
                                  } else {
                                    break L52;
                                  }
                                }
                              }
                              nia.field_l[ur.field_e[var8.field_zb].field_b].e(((ng) this).field_d.field_kb - (-var8.field_kb + 5), -5 + (((ng) this).field_d.field_rb + var8.field_rb), 818659);
                              break L35;
                            }
                            nia.field_l[var27.field_b].e(-5 + ((ng) this).field_d.field_kb + var8.field_kb, -5 + var8.field_rb + ((ng) this).field_d.field_rb, 4564479);
                            break L35;
                          }
                        }
                      } else {
                        L53: {
                          L54: {
                            if (var10 == null) {
                              break L54;
                            } else {
                              if (~var10.field_g == ~var8.field_zb) {
                                break L53;
                              } else {
                                break L54;
                              }
                            }
                          }
                          L55: {
                            if (((ng) this).field_m.field_Z == null) {
                              break L55;
                            } else {
                              if (~var8.field_zb == ~((ng) this).field_m.field_Z.field_g) {
                                break L53;
                              } else {
                                break L55;
                              }
                            }
                          }
                          L56: {
                            if (var8.field_yb) {
                              break L56;
                            } else {
                              if (!var25.field_s.c((byte) -10, var8.field_zb)) {
                                break L56;
                              } else {
                                nia.field_l[var24.field_b].e(((ng) this).field_d.field_kb - -var8.field_kb - 5, -5 + ((ng) this).field_d.field_rb - -var8.field_rb, 11250603);
                                break L35;
                              }
                            }
                          }
                          nia.field_l[ur.field_e[var8.field_zb].field_b].e(-5 + (((ng) this).field_d.field_kb - -var8.field_kb), ((ng) this).field_d.field_rb + var8.field_rb + -5, 51233);
                          break L35;
                        }
                        nia.field_l[var27.field_b].e(-5 + (var8.field_kb + ((ng) this).field_d.field_kb), var8.field_rb + ((ng) this).field_d.field_rb - 5, 4388192);
                        break L35;
                      }
                    }
                    L57: {
                      if (-1 == var8.field_zb) {
                        break L57;
                      } else {
                        if (al.a(102, var8.field_zb).field_a == 3) {
                          break L57;
                        } else {
                          wca.a(true, -4 + ((ng) this).field_d.field_rb - -var8.field_rb, var8.field_kb + (((ng) this).field_d.field_kb - 4), var8.field_zb, 90);
                          break L57;
                        }
                      }
                    }
                    L58: {
                      L59: {
                        var12 = 0;
                        if (((ng) this).field_m.field_P.field_s.field_y == 40) {
                          break L59;
                        } else {
                          if (((ng) this).field_m.field_P.field_s.field_y == 42) {
                            break L59;
                          } else {
                            if (((ng) this).field_m.field_P.field_s.field_y != 39) {
                              if (2 != var27.field_a) {
                                if (var27.field_a != 1) {
                                  L60: {
                                    L61: {
                                      L62: {
                                        if (((ng) this).field_m.field_h.a(((ng) this).field_m.field_Y, false) <= 0) {
                                          break L62;
                                        } else {
                                          if (var27.field_a == 4) {
                                            break L61;
                                          } else {
                                            break L62;
                                          }
                                        }
                                      }
                                      if (!var25.field_s.c((byte) -10, var27.field_j)) {
                                        break L61;
                                      } else {
                                        stackOut_148_0 = 1;
                                        stackIn_150_0 = stackOut_148_0;
                                        break L60;
                                      }
                                    }
                                    stackOut_149_0 = 0;
                                    stackIn_150_0 = stackOut_149_0;
                                    break L60;
                                  }
                                  var12 = stackIn_150_0;
                                  break L58;
                                } else {
                                  L63: {
                                    L64: {
                                      if (((ng) this).field_m.field_M != 2) {
                                        break L64;
                                      } else {
                                        if (!var25.field_s.c((byte) -10, var27.field_j)) {
                                          break L64;
                                        } else {
                                          stackOut_141_0 = 1;
                                          stackIn_143_0 = stackOut_141_0;
                                          break L63;
                                        }
                                      }
                                    }
                                    stackOut_142_0 = 0;
                                    stackIn_143_0 = stackOut_142_0;
                                    break L63;
                                  }
                                  var12 = stackIn_143_0;
                                  break L58;
                                }
                              } else {
                                L65: {
                                  if (((ng) this).field_m.field_M != 1) {
                                    stackOut_136_0 = 0;
                                    stackIn_137_0 = stackOut_136_0;
                                    break L65;
                                  } else {
                                    stackOut_135_0 = 1;
                                    stackIn_137_0 = stackOut_135_0;
                                    break L65;
                                  }
                                }
                                var12 = stackIn_137_0;
                                break L58;
                              }
                            } else {
                              break L59;
                            }
                          }
                        }
                      }
                      var12 = 0;
                      break L58;
                    }
                    L66: {
                      L67: {
                        if (!var8.field_yb) {
                          break L67;
                        } else {
                          if (var12 != 0) {
                            break L66;
                          } else {
                            break L67;
                          }
                        }
                      }
                      L68: {
                        if (var25.field_s.f(0, var8.field_zb)) {
                          var13_ref_oha = ur.field_e[var8.field_zb];
                          var14_int = var25.field_s.b(var8.field_zb, (byte) -110);
                          var15_int = -var25.field_s.field_K[var14_int] + var13_ref_oha.field_g;
                          if (var15_int != -2) {
                            ad.field_h.c(Integer.toString(var15_int), 2 + (((ng) this).field_d.field_kb - -var8.field_kb), var8.field_rb + ((ng) this).field_d.field_rb - -20, 2, -1);
                            break L68;
                          } else {
                            break L68;
                          }
                        } else {
                          break L68;
                        }
                      }
                      dg.d(((ng) this).field_d.field_kb - -var8.field_kb, ((ng) this).field_d.field_rb + var8.field_rb, (var8.field_sb >> 1) + var8.field_kb + ((ng) this).field_d.field_kb - -6, 6 + (var8.field_rb + ((ng) this).field_d.field_rb) - -(var8.field_p >> 1), 65793, 4);
                      dg.d(((ng) this).field_d.field_kb - -var8.field_kb - -1, 1 + (((ng) this).field_d.field_rb + var8.field_rb), 5 + ((var8.field_sb >> 1) + var8.field_kb + ((ng) this).field_d.field_kb), 5 + (var8.field_p >> 1) + (var8.field_rb + ((ng) this).field_d.field_rb), 16711680, 2);
                      break L66;
                    }
                    var8 = (jj) (Object) ((ng) this).field_d.field_z.c(0);
                    continue L16;
                  }
                }
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        nja.field_a = param2;
        fa.field_f = param1;
        jc.field_t = param0;
    }

    final void a(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        jj var6 = null;
        jj var7 = null;
        int var7_int = 0;
        jj[] var8 = null;
        int var8_int = 0;
        int var9 = 0;
        jj var10 = null;
        int var11 = 0;
        ad var12 = null;
        oha var13 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var11 = BachelorFridge.field_y;
          var12 = ((ng) this).field_m.field_P;
          if (2 != ((ng) this).field_m.field_M) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var3 = stackIn_3_0;
          var4 = 0;
          if (var3 == 0) {
            int discarded$1 = -3;
            var4 = this.a(var12.field_s.field_m);
            break L1;
          } else {
            var4 = this.a((byte) -127, var12.field_s.field_m);
            break L1;
          }
        }
        ((ng) this).field_g = new jj[var4];
        var5 = -1;
        var6_int = 0;
        L2: while (true) {
          if (var6_int >= var12.field_s.field_m.length) {
            L3: {
              ((ng) this).field_i.field_kb = ((ng) this).field_d.field_kb + 56;
              ((ng) this).field_i.field_rb = 96 + ((ng) this).field_d.field_rb;
              var6 = ((ng) this).field_i;
              ((ng) this).field_i.field_p = 32;
              var6.field_sb = 32;
              if (param0 <= -73) {
                break L3;
              } else {
                ng.c(-36);
                break L3;
              }
            }
            ((ng) this).field_h.field_rb = 80 + ((ng) this).field_d.field_rb;
            ((ng) this).field_h.field_kb = ((ng) this).field_d.field_kb + 63;
            var7 = ((ng) this).field_h;
            ((ng) this).field_h.field_p = 16;
            var7.field_sb = 16;
            ((ng) this).field_d.field_z = null;
            var8 = ((ng) this).field_g;
            var9 = 0;
            L4: while (true) {
              if (var9 >= var8.length) {
                return;
              } else {
                var10 = var8[var9];
                ((ng) this).field_d.a(-1, (sna) (Object) var10);
                var9++;
                continue L4;
              }
            }
          } else {
            if (var12.field_s.field_m[var6_int] != -1) {
              var7_int = var12.field_s.field_o.field_g.field_b[var12.field_s.field_m[var6_int]];
              if (3 != al.a(102, var7_int).field_a) {
                L5: {
                  if (var3 == 0) {
                    break L5;
                  } else {
                    if (al.a(124, var7_int).field_a != 2) {
                      break L5;
                    } else {
                      var6_int++;
                      continue L2;
                    }
                  }
                }
                L6: {
                  if (var3 != 0) {
                    break L6;
                  } else {
                    if (2 == al.a(-86, var7_int).field_a) {
                      break L6;
                    } else {
                      var6_int++;
                      continue L2;
                    }
                  }
                }
                var8_int = ur.field_e[var7_int].field_a;
                if (var7_int != -1) {
                  L7: {
                    var9 = 1;
                    var13 = al.a(96, var7_int);
                    if (var13.field_g != 0) {
                      if (var12.field_s.field_K[var6_int] == var13.field_g - -1) {
                        break L7;
                      } else {
                        var9 = 0;
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  }
                  var5++;
                  this.a((byte) 104, var8_int, var4, var9 != 0, var7_int, var5);
                  var6_int++;
                  continue L2;
                } else {
                  var6_int++;
                  continue L2;
                }
              } else {
                var6_int++;
                continue L2;
              }
            } else {
              var6_int++;
              continue L2;
            }
          }
        }
    }

    private final int a(int[] param0) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = BachelorFridge.field_y;
        try {
          L0: {
            var3_int = 0;
            var4 = param0;
            var5 = 0;
            L1: while (true) {
              if (var4.length <= var5) {
                stackOut_10_0 = var3_int;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                L2: {
                  var6 = var4[var5];
                  if (var6 == 0) {
                    break L2;
                  } else {
                    if (-4 == al.a(107, ((ng) this).field_m.field_P.field_s.field_o.field_g.field_b[var6]).field_a) {
                      break L2;
                    } else {
                      if (al.a(120, ((ng) this).field_m.field_P.field_s.field_o.field_g.field_b[var6]).field_a != 2) {
                        break L2;
                      } else {
                        var3_int++;
                        break L2;
                      }
                    }
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("ng.L(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + -3 + 41);
        }
        return stackIn_11_0;
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = BachelorFridge.field_y;
        if (!(((ng) this).field_m.field_P == null)) {
            for (var2 = 0; var2 < 128; var2++) {
                ((ng) this).field_o[var2] = (128 - var2) * dda.a(65793, ((ng) this).field_m.c(((ng) this).field_m.field_P.field_s.field_D, 2271));
            }
        }
        ((ng) this).field_d.a(19842, param0);
        ((ng) this).field_i.a(19842, true);
        if (!((ng) this).field_i.field_T) {
            ((ng) this).field_i.field_vb = 0;
        } else {
            ((ng) this).field_i.field_vb = ((ng) this).field_i.field_vb + 1;
        }
        ((ng) this).field_h.a(19842, true);
        if (((ng) this).field_h.field_T) {
            ((ng) this).field_h.field_vb = ((ng) this).field_h.field_vb + 1;
        } else {
            ((ng) this).field_h.field_vb = 0;
        }
    }

    final static aga a(op param0, int param1, lu param2) {
        RuntimeException var3 = null;
        aga var4 = null;
        int var5 = 0;
        int var6 = 0;
        rk var7 = null;
        aga stackIn_10_0 = null;
        aga stackIn_11_0 = null;
        aga stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        aga stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        aga stackOut_9_0 = null;
        aga stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        aga stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        aga stackOut_15_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            int discarded$2 = 255;
            var7 = gka.a(param2);
            if (var7 != null) {
              L1: {
                var4 = new aga(var7, param0, -1, -1);
                var4.field_I = param2.e((byte) 54);
                var4.field_t = param2.e((byte) 109);
                var4.field_D = param2.b(16711935);
                var4.field_u = param2.b(param1 + 16711986);
                var4.field_F = param2.b(param1 + 16711986);
                var4.field_x = param2.b(param1 ^ -16711886);
                var4.field_J = param2.b(16711935);
                var4.field_s = param2.b(16711935);
                var4.field_y = param2.b(16711935);
                var4.field_C = param2.b(16711935);
                var4.field_E = param2.b(16711935);
                if (param1 == -51) {
                  break L1;
                } else {
                  boolean discarded$3 = ng.a((byte) 43);
                  break L1;
                }
              }
              var5 = 0;
              L2: while (true) {
                if (5 <= var5) {
                  L3: {
                    var4.field_H = param2.b(16711935);
                    stackOut_9_0 = (aga) var4;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    if (param2.b(16711935) != 1) {
                      stackOut_11_0 = (aga) (Object) stackIn_11_0;
                      stackOut_11_1 = 0;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      break L3;
                    } else {
                      stackOut_10_0 = (aga) (Object) stackIn_10_0;
                      stackOut_10_1 = 1;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      break L3;
                    }
                  }
                  L4: {
                    stackIn_12_0.field_A = stackIn_12_1 != 0;
                    if (!var4.i(param1 ^ -100)) {
                      param0.field_a[var4.field_x][var4.field_J].field_l = var4;
                      var4.d(51);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  stackOut_15_0 = (aga) var4;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  var4.field_K[var5] = param2.b(true);
                  var5++;
                  continue L2;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3;
            stackOut_17_1 = new StringBuilder().append("ng.E(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
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
          L6: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44).append(param1).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
        return stackIn_16_0;
    }

    private final void a(byte param0, int param1, int param2, boolean param3, int param4, int param5) {
        double var7 = 0.0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_39_0 = 0;
        int stackIn_44_0 = 0;
        jj stackIn_49_0 = null;
        jj stackIn_50_0 = null;
        jj stackIn_51_0 = null;
        kv stackIn_51_1 = null;
        jj stackIn_52_0 = null;
        jj stackIn_53_0 = null;
        jj stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        jj stackOut_48_0 = null;
        jj stackOut_50_0 = null;
        kv stackOut_50_1 = null;
        jj stackOut_49_0 = null;
        kv stackOut_49_1 = null;
        jj stackOut_51_0 = null;
        jj stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        jj stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        L0: {
          var11 = BachelorFridge.field_y;
          ((ng) this).field_g[param5] = new jj(param4);
          ((ng) this).field_g[param5].field_sb = 32;
          ((ng) this).field_g[param5].field_p = 32;
          var7 = (double)(-(2 * param2) + 2 * param5 - -1) * 3.141592653589793 / (double)(2 * param2);
          var9 = -1;
          if (param1 == 2) {
            var9 = al.a(-49, param4).field_h;
            break L0;
          } else {
            if (param1 != 1) {
              if (param1 != 4) {
                break L0;
              } else {
                var9 = al.a(-75, param4).field_h;
                break L0;
              }
            } else {
              var9 = al.a(-60, param4).field_h;
              break L0;
            }
          }
        }
        L1: {
          sfa discarded$1 = ((ng) this).field_m.b(((ng) this).field_m.field_P, true);
          if (param2 != 4) {
            if (param2 == 3) {
              if (param5 == 0) {
                ((ng) this).field_g[param5].field_xb = 0;
                break L1;
              } else {
                if (param5 == 1) {
                  ((ng) this).field_g[param5].field_xb = 2;
                  break L1;
                } else {
                  if (2 != param5) {
                    break L1;
                  } else {
                    ((ng) this).field_g[param5].field_xb = 3;
                    break L1;
                  }
                }
              }
            } else {
              if (param2 != 2) {
                ((ng) this).field_g[param5].field_xb = 2;
                break L1;
              } else {
                if (param5 != 0) {
                  if (param5 == 1) {
                    ((ng) this).field_g[param5].field_xb = 4;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  ((ng) this).field_g[param5].field_xb = 1;
                  break L1;
                }
              }
            }
          } else {
            if (param5 == 0) {
              ((ng) this).field_g[param5].field_xb = 0;
              break L1;
            } else {
              if (param5 != 1) {
                if (param5 != 2) {
                  if (3 != param5) {
                    break L1;
                  } else {
                    ((ng) this).field_g[param5].field_xb = 3;
                    break L1;
                  }
                } else {
                  ((ng) this).field_g[param5].field_xb = 4;
                  break L1;
                }
              } else {
                ((ng) this).field_g[param5].field_xb = 1;
                break L1;
              }
            }
          }
        }
        L2: {
          L3: {
            var10 = 1;
            if (((ng) this).field_m.field_P.field_s.field_y == 40) {
              break L3;
            } else {
              if (42 == ((ng) this).field_m.field_P.field_s.field_y) {
                break L3;
              } else {
                if (((ng) this).field_m.field_P.field_s.field_y == 39) {
                  break L3;
                } else {
                  if (!param3) {
                    var10 = 0;
                    break L2;
                  } else {
                    L4: {
                      if (!((ng) this).field_m.field_P.field_s.c((byte) -10, param4)) {
                        break L4;
                      } else {
                        if (((ng) this).field_m.field_P.field_s.f(0, param4)) {
                          break L4;
                        } else {
                          if (param1 != 2) {
                            if (param1 != 1) {
                              break L2;
                            } else {
                              L5: {
                                if (((ng) this).field_m.field_M != 2) {
                                  stackOut_43_0 = 0;
                                  stackIn_44_0 = stackOut_43_0;
                                  break L5;
                                } else {
                                  stackOut_42_0 = 1;
                                  stackIn_44_0 = stackOut_42_0;
                                  break L5;
                                }
                              }
                              var10 = stackIn_44_0;
                              break L2;
                            }
                          } else {
                            L6: {
                              if (((ng) this).field_m.field_M != 1) {
                                stackOut_38_0 = 0;
                                stackIn_39_0 = stackOut_38_0;
                                break L6;
                              } else {
                                stackOut_37_0 = 1;
                                stackIn_39_0 = stackOut_37_0;
                                break L6;
                              }
                            }
                            var10 = stackIn_39_0;
                            break L2;
                          }
                        }
                      }
                    }
                    var10 = 0;
                    break L2;
                  }
                }
              }
            }
          }
          var10 = 0;
          break L2;
        }
        L7: {
          stackOut_48_0 = ((ng) this).field_g[param5];
          stackIn_50_0 = stackOut_48_0;
          stackIn_49_0 = stackOut_48_0;
          if (var10 == 0) {
            stackOut_50_0 = (jj) (Object) stackIn_50_0;
            stackOut_50_1 = hl.field_D[var9];
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            break L7;
          } else {
            stackOut_49_0 = (jj) (Object) stackIn_49_0;
            stackOut_49_1 = hh.field_b[var9];
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            break L7;
          }
        }
        L8: {
          stackIn_51_0.field_v = stackIn_51_1;
          ((ng) this).field_g[param5].field_kb = gja.field_k[param2 + -1][param5][0];
          ((ng) this).field_g[param5].field_rb = gja.field_k[-1 + param2][param5][1];
          stackOut_51_0 = ((ng) this).field_g[param5];
          stackIn_53_0 = stackOut_51_0;
          stackIn_52_0 = stackOut_51_0;
          if (var10 == 0) {
            stackOut_53_0 = (jj) (Object) stackIn_53_0;
            stackOut_53_1 = 0;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            break L8;
          } else {
            stackOut_52_0 = (jj) (Object) stackIn_52_0;
            stackOut_52_1 = 1;
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            break L8;
          }
        }
        stackIn_54_0.field_yb = stackIn_54_1 != 0;
    }

    final static boolean b() {
        int var1 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var1 = -25;
            if (null != jea.field_c) {
              break L1;
            } else {
              if (!gm.field_k) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackOut_3_0 = 1;
          stackIn_5_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_5_0 != 0;
    }

    ng(gj param0, sna param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            ((ng) this).field_m = param0;
            ((ng) this).field_c = 0;
            ((ng) this).field_j = new sna();
            ((ng) this).field_j.field_gb = 16777215;
            ((ng) this).field_d = new sna("moveselect", ((ng) this).field_j, -15, 162, 192, 170, "");
            ((ng) this).field_l = new sna("stats", param1, 0, 360, 60, 20, tv.field_n);
            ((ng) this).field_i = new jj(0);
            ((ng) this).field_h = new jj(0);
            ((ng) this).field_d.a(-1, (sna) (Object) ((ng) this).field_i);
            ((ng) this).field_o = new int[256];
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= 256) {
                ((ng) this).field_b = a.a(12889, 64, 16763049, 46335);
                ((ng) this).field_k = new kv(84, 84);
                ((ng) this).field_k.b();
                dg.a(672, 672, 672, 128, ((ng) this).field_o);
                hga.field_U.a((byte) 114);
                break L0;
              } else {
                ((ng) this).field_o[var3_int] = var3_int * 65793;
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("ng.<init>(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Use the magnifier or right click on a creature to view its stats.";
    }
}
