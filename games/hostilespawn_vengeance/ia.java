/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia {
    static int[] field_i;
    static int field_h;
    static String field_k;
    private int[] field_c;
    static bd field_e;
    private boolean field_f;
    static bd[] field_l;
    private int field_a;
    private int field_g;
    private int field_j;
    private int[] field_d;
    private boolean[] field_b;

    final static boolean b(int param0) {
        if (param0 != 32674) {
            field_k = null;
        }
        return ti.field_b == ki.field_f ? true : false;
    }

    final boolean a(int param0, int param1, int param2) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param1 == -28) {
            break L0;
          } else {
            field_k = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (param2 != ((ia) this).field_g) {
              break L2;
            } else {
              if (param0 != ((ia) this).field_a) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final void d(int param0) {
        kf.a(((ia) this).field_c, 0, kh.field_ib, 0, kh.field_ib.length);
        kf.a(((ia) this).field_d, 0, kh.field_U, 0, kh.field_U.length);
        kf.a(((ia) this).field_b, 0, kh.field_Q, 0, kh.field_Q.length);
        if (param0 != 64) {
            field_k = null;
        }
        wa.field_p = ((ia) this).field_j;
        vj.field_s = 0;
        uf.field_h = ((ia) this).field_f;
        n.field_s = 0;
        eh.field_g = ba.a((byte) 113);
        w.field_r = 0;
    }

    final static String a(String param0, int param1) {
        int var5 = 0;
        int var6 = HostileSpawn.field_I ? 1 : 0;
        int var2 = param0.length();
        char[] var3 = new char[var2];
        int var4 = -98 % ((param1 - 85) / 38);
        for (var5 = 0; var2 > var5; var5++) {
            var3[-var5 + -1 + var2] = param0.charAt(var5);
        }
        return new String(var3);
    }

    final static void a(p param0, int[] param1, int param2) {
        double var3 = 0.0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        oj var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        Object var15 = null;
        int stackIn_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        L0: {
          var14 = HostileSpawn.field_I ? 1 : 0;
          var3 = (double)(-param0.field_e + 100) / 15.0;
          var5 = 5;
          var3 = var3 / (double)var5;
          if (param2 == -14808) {
            break L0;
          } else {
            var15 = null;
            ia.a((p) null, (int[]) null, 42);
            break L0;
          }
        }
        var6 = 0;
        L1: while (true) {
          L2: {
            if (var6 >= var5) {
              break L2;
            } else {
              L3: {
                param0.field_l.b(var3, param0.field_c, 98);
                param0.a(8573);
                var7 = param0.field_j.b(param2 ^ 14804);
                if (param1[var7] == 2) {
                  L4: {
                    L5: {
                      param0.field_l.b(-var3, param0.field_c, 126);
                      param0.a(8573);
                      if (param1[-ln.field_a.field_d + var7] == 2) {
                        break L5;
                      } else {
                        if (64.0 > param0.field_c) {
                          break L5;
                        } else {
                          if (192.0 >= param0.field_c) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    L6: {
                      if ((param1[ln.field_a.field_d + var7] ^ -1) == -3) {
                        break L6;
                      } else {
                        L7: {
                          if (64.0 > param0.field_c) {
                            break L7;
                          } else {
                            if (param0.field_c <= 192.0) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        param0.field_e = (int)(-((double)(-param0.field_e + 100) / 1.5) + 100.0);
                        param0.field_c = -param0.field_c + 128.0;
                        if (0 == 0) {
                          break L3;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L8: {
                      if (param1[-1 + var7] == 2) {
                        break L8;
                      } else {
                        if (128.0 > param0.field_c) {
                          break L8;
                        } else {
                          param0.field_c = -param0.field_c + 256.0;
                          param0.field_e = (int)(-((double)(100 - param0.field_e) / 1.5) + 100.0);
                          if (0 == 0) {
                            break L3;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                    if (-3 == (param1[var7 + 1] ^ -1)) {
                      break L3;
                    } else {
                      if (128.0 > param0.field_c) {
                        param0.field_e = (int)(100.0 - (double)(100 - param0.field_e) / 1.5);
                        param0.field_c = 256.0 - param0.field_c;
                        if (0 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  param0.field_c = -param0.field_c + 128.0;
                  param0.field_e = (int)(-((double)(-param0.field_e + 100) / 1.5) + 100.0);
                  break L3;
                } else {
                  break L3;
                }
              }
              var6++;
              if (0 == 0) {
                continue L1;
              } else {
                break L2;
              }
            }
          }
          param0.field_e = param0.field_e + 2;
          var6 = param0.field_j.field_e;
          var7 = param0.field_j.field_g;
          var8 = 0;
          L9: while (true) {
            L10: {
              if (var8 >= rc.field_e) {
                break L10;
              } else {
                L11: {
                  var9 = re.field_n[var8];
                  if (var9.field_I >= -1) {
                    stackOut_30_0 = 0;
                    stackIn_31_0 = stackOut_30_0;
                    break L11;
                  } else {
                    stackOut_29_0 = 1;
                    stackIn_31_0 = stackOut_29_0;
                    break L11;
                  }
                }
                L12: {
                  var10 = stackIn_31_0;
                  var11 = var9.field_I;
                  if (-1 != var9.field_i) {
                    break L12;
                  } else {
                    var11 = eh.field_g;
                    break L12;
                  }
                }
                L13: {
                  var12 = var9.field_j.field_e - var6;
                  var13 = var9.field_j.field_g - var7;
                  if (var12 >= 0) {
                    break L13;
                  } else {
                    var12 = -var12;
                    break L13;
                  }
                }
                L14: {
                  if (var13 < 0) {
                    var13 = -var13;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (2 <= var12) {
                    break L15;
                  } else {
                    if (var13 >= 2) {
                      break L15;
                    } else {
                      param0.field_e = param0.field_e + 20;
                      var11--;
                      if (0 < var11) {
                        break L15;
                      } else {
                        if (var9.field_i != 0) {
                          if (var10 == 0) {
                            break L15;
                          } else {
                            if (!var9.field_b) {
                              break L15;
                            } else {
                              if ((var9.field_i ^ -1) == -28) {
                                break L15;
                              } else {
                                al.field_U[2] = al.field_U[2] + 1;
                                if ((al.field_U[2] + 1 ^ -1) != -31) {
                                  break L15;
                                } else {
                                  ti.a(248, (byte) 43, 7);
                                  break L15;
                                }
                              }
                            }
                          }
                        } else {
                          break L15;
                        }
                      }
                    }
                  }
                }
                L16: {
                  L17: {
                    if (var9.field_i != 0) {
                      break L17;
                    } else {
                      if (param0.field_i == 35) {
                        break L16;
                      } else {
                        if (param0.field_e < 40) {
                          if (var11 >= eh.field_g) {
                            break L16;
                          } else {
                            ci.a(-var11 + eh.field_g, 125);
                            if (0 == 0) {
                              break L16;
                            } else {
                              break L17;
                            }
                          }
                        } else {
                          break L16;
                        }
                      }
                    }
                  }
                  if (!var9.a(31, -108)) {
                    break L16;
                  } else {
                    var9.field_I = var11;
                    break L16;
                  }
                }
                var8++;
                if (0 == 0) {
                  continue L9;
                } else {
                  break L10;
                }
              }
            }
            L18: {
              if (param0.field_e < 100) {
                break L18;
              } else {
                param0.field_i = -1;
                break L18;
              }
            }
            return;
          }
        }
    }

    final void c(int param0) {
        ((ia) this).field_a = bm.field_c;
        ((ia) this).field_g = rl.field_c;
        kf.a(kh.field_ib, 0, ((ia) this).field_c, 0, kh.field_ib.length);
        kf.a(kh.field_U, 0, ((ia) this).field_d, 0, kh.field_U.length);
        if (param0 != -32238) {
          return;
        } else {
          kf.a(kh.field_Q, 0, ((ia) this).field_b, 0, kh.field_Q.length);
          ((ia) this).field_f = uf.field_h;
          ((ia) this).field_j = wa.field_p;
          return;
        }
    }

    public static void a(byte param0) {
        field_k = null;
        field_i = null;
        int var1 = -105 / ((param0 - 39) / 35);
        field_l = null;
        field_e = null;
    }

    final void a(int param0) {
        ((ia) this).field_g = -1;
        if (param0 != 0) {
            Object var3 = null;
            String discarded$0 = ia.a((String) null, 69);
        }
    }

    ia() {
        ((ia) this).field_c = new int[kh.field_ib.length];
        ((ia) this).field_d = new int[kh.field_U.length];
        ((ia) this).field_b = new boolean[kh.field_Q.length];
        ((ia) this).field_g = -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new bd[222];
        field_k = "Switch level set";
        field_i = new int[4];
    }
}
