/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg {
    private int field_C;
    private int[][] field_u;
    private static int[] field_l;
    private static int[] field_z;
    static int field_f;
    private ti[] field_D;
    private static int[] field_d;
    private static int[] field_t;
    static t[] field_e;
    private int[] field_F;
    int field_y;
    private int[][] field_v;
    private int[][] field_c;
    private static short[][] field_r;
    static int field_s;
    private static short[][] field_B;
    static int field_o;
    private int[] field_p;
    private static int[] field_k;
    private static int[] field_E;
    private static kh field_b;
    private int[] field_m;
    private int field_j;
    private boolean[] field_x;
    private int field_A;
    kh[] field_g;
    private int[][] field_G;
    private static boolean[] field_w;
    private int[] field_i;
    private int[] field_h;
    private static int[] field_n;
    private int[] field_q;
    static t[] field_a;

    final static void c() {
        field_b = new kh();
        field_b.field_k = (pj) (Object) new rm(0, 0, 0).a(0, 0, 1, 0, 0);
    }

    final void a(int param0, int param1, int param2, int param3) {
        ((sg) this).field_F[param0] = param1;
        ((sg) this).field_h[param0] = param2;
        ((sg) this).field_i[param0] = param3;
    }

    final void a(int param0, ti[] param1) {
        ti[] var3 = null;
        int var4 = 0;
        ti[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        ti[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        ti[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        ti[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        ti stackIn_11_2 = null;
        ti[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        ti[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        ti stackOut_10_2 = null;
        ti[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        ti[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_8_2 = null;
        L0: {
          if (param1 != null) {
            var3 = new ti[param1.length];
            ((sg) this).field_D = var3;
            var4 = 0;
            L1: while (true) {
              if (var4 >= param1.length) {
                break L0;
              } else {
                L2: {
                  stackOut_5_0 = (ti[]) var3;
                  stackOut_5_1 = var4;
                  stackIn_10_0 = stackOut_5_0;
                  stackIn_10_1 = stackOut_5_1;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  if (param1[var4] != null) {
                    stackOut_10_0 = (ti[]) (Object) stackIn_10_0;
                    stackOut_10_1 = stackIn_10_1;
                    stackOut_10_2 = param1[var4].c((byte) 90);
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    stackIn_11_2 = stackOut_10_2;
                    break L2;
                  } else {
                    stackOut_6_0 = (ti[]) (Object) stackIn_6_0;
                    stackOut_6_1 = stackIn_6_1;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    stackOut_8_0 = (ti[]) (Object) stackIn_8_0;
                    stackOut_8_1 = stackIn_8_1;
                    stackOut_8_2 = null;
                    stackIn_11_0 = stackOut_8_0;
                    stackIn_11_1 = stackOut_8_1;
                    stackIn_11_2 = (ti) (Object) stackOut_8_2;
                    break L2;
                  }
                }
                stackIn_11_0[stackIn_11_1] = stackIn_11_2;
                var4++;
                continue L1;
              }
            }
          } else {
            ((sg) this).field_D[param0] = null;
            break L0;
          }
        }
    }

    private final void c(int param0, int param1) {
        pj var3 = null;
        mp var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ec var14 = null;
        int var14_int = 0;
        int var15 = 0;
        int var16_int = 0;
        Object var16 = null;
        ti var16_ref = null;
        int var17 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        ti stackIn_35_0 = null;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        int stackIn_67_2 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_73_0 = 0;
        int stackIn_73_1 = 0;
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        int stackIn_74_2 = 0;
        int stackIn_75_0 = 0;
        int stackIn_75_1 = 0;
        int stackIn_77_0 = 0;
        int stackIn_77_1 = 0;
        int stackIn_78_0 = 0;
        int stackIn_78_1 = 0;
        int stackIn_78_2 = 0;
        int stackIn_88_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_91_1 = 0;
        int stackIn_92_0 = 0;
        short stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        short stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        ti stackOut_34_0 = null;
        Object stackOut_32_0 = null;
        int stackOut_61_0 = 0;
        int stackOut_61_1 = 0;
        int stackOut_66_0 = 0;
        int stackOut_66_1 = 0;
        int stackOut_66_2 = 0;
        int stackOut_62_0 = 0;
        int stackOut_62_1 = 0;
        int stackOut_64_0 = 0;
        int stackOut_64_1 = 0;
        int stackOut_64_2 = 0;
        int stackOut_68_0 = 0;
        int stackOut_68_1 = 0;
        int stackOut_73_0 = 0;
        int stackOut_73_1 = 0;
        int stackOut_73_2 = 0;
        int stackOut_69_0 = 0;
        int stackOut_69_1 = 0;
        int stackOut_71_0 = 0;
        int stackOut_71_1 = 0;
        int stackOut_71_2 = 0;
        int stackOut_74_0 = 0;
        int stackOut_74_1 = 0;
        int stackOut_77_0 = 0;
        int stackOut_77_1 = 0;
        int stackOut_77_2 = 0;
        int stackOut_75_0 = 0;
        int stackOut_75_1 = 0;
        int stackOut_75_2 = 0;
        int stackOut_87_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_90_1 = 0;
        int stackOut_88_0 = 0;
        int stackOut_88_1 = 0;
        int stackOut_91_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_84_0 = 0;
        L0: {
          var3 = ((sg) this).field_g[param0].field_k;
          var4 = ((sg) this).field_g[param0].field_q;
          if (var4.field_q != null) {
            stackOut_3_0 = var4.field_q[param1];
            stackIn_4_0 = stackOut_3_0;
            break L0;
          } else {
            stackOut_1_0 = -1;
            stackIn_4_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_4_0;
          if (var3.field_l[param1] == -1) {
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            break L1;
          } else {
            stackOut_5_0 = 1;
            stackIn_8_0 = stackOut_5_0;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_8_0;
          if (var3.field_z != null) {
            stackOut_11_0 = var3.field_z[param1];
            stackIn_12_0 = stackOut_11_0;
            break L2;
          } else {
            stackOut_9_0 = -1;
            stackIn_12_0 = stackOut_9_0;
            break L2;
          }
        }
        L3: {
          var7 = stackIn_12_0;
          var8 = var3.field_p[param1];
          var9 = var3.field_u[param1];
          var10 = var3.field_t[param1];
          field_k[0] = ((sg) this).field_v[param0][var8];
          field_k[1] = ((sg) this).field_v[param0][var9];
          field_k[2] = ((sg) this).field_v[param0][var10];
          field_n[0] = ((sg) this).field_c[param0][var8];
          field_n[1] = ((sg) this).field_c[param0][var9];
          field_n[2] = ((sg) this).field_c[param0][var10];
          field_d[0] = ((sg) this).field_u[param0][var8];
          field_d[1] = ((sg) this).field_u[param0][var9];
          field_d[2] = ((sg) this).field_u[param0][var10];
          if (var8 != var9) {
            break L3;
          } else {
            if (var8 != var10) {
              break L3;
            } else {
              this.c(var7);
              return;
            }
          }
        }
        L4: {
          var11 = var3.field_f[param1];
          var12 = var3.field_s[param1];
          var13 = var3.field_l[param1];
          if (var5 == -1) {
            break L4;
          } else {
            var14_int = var3.field_h[var5];
            var15 = var3.field_g[var5];
            var16_int = var3.field_i[var5];
            g.field_b[0] = ((sg) this).field_v[param0][var14_int];
            g.field_b[1] = ((sg) this).field_v[param0][var15];
            g.field_b[2] = ((sg) this).field_v[param0][var16_int];
            g.field_c[0] = ((sg) this).field_c[param0][var14_int];
            g.field_c[1] = ((sg) this).field_c[param0][var15];
            g.field_c[2] = ((sg) this).field_c[param0][var16_int];
            g.field_a[0] = ((sg) this).field_u[param0][var14_int];
            g.field_a[1] = ((sg) this).field_u[param0][var15];
            g.field_a[2] = ((sg) this).field_u[param0][var16_int];
            break L4;
          }
        }
        L5: {
          L6: {
            var14 = be.field_c;
            var15 = 0;
            if (field_f <= 0) {
              break L6;
            } else {
              if (var7 != -1) {
                break L5;
              } else {
                break L6;
              }
            }
          }
          if (var5 == -1) {
            break L5;
          } else {
            var16_int = var14.b(var7);
            var11 = be.a(var16_int, var11);
            var12 = be.a(var16_int, var12);
            var13 = be.a(var16_int, var13);
            var5 = -1;
            var15 = 1;
            break L5;
          }
        }
        L7: {
          L8: {
            if (param0 != 0) {
              break L8;
            } else {
              if (((sg) this).field_D != null) {
                stackOut_34_0 = ((sg) this).field_D[param1];
                stackIn_35_0 = stackOut_34_0;
                break L7;
              } else {
                break L8;
              }
            }
          }
          stackOut_32_0 = null;
          stackIn_35_0 = (ti) (Object) stackOut_32_0;
          break L7;
        }
        L9: {
          var16_ref = stackIn_35_0;
          if (var16_ref == null) {
            break L9;
          } else {
            L10: {
              var17 = var16_ref.a((byte) 91);
              if (var17 == 1) {
                break L10;
              } else {
                L11: {
                  if (var17 != 2) {
                    break L11;
                  } else {
                    if (var5 == -1) {
                      break L11;
                    } else {
                      break L10;
                    }
                  }
                }
                if (var17 != 2) {
                  ((sg) this).field_D[param1] = null;
                  break L9;
                } else {
                  L12: {
                    stackOut_61_0 = var11;
                    stackOut_61_1 = 64;
                    stackIn_66_0 = stackOut_61_0;
                    stackIn_66_1 = stackOut_61_1;
                    stackIn_62_0 = stackOut_61_0;
                    stackIn_62_1 = stackOut_61_1;
                    if (var5 == -1) {
                      stackOut_66_0 = stackIn_66_0;
                      stackOut_66_1 = stackIn_66_1;
                      stackOut_66_2 = 0;
                      stackIn_67_0 = stackOut_66_0;
                      stackIn_67_1 = stackOut_66_1;
                      stackIn_67_2 = stackOut_66_2;
                      break L12;
                    } else {
                      stackOut_62_0 = stackIn_62_0;
                      stackOut_62_1 = stackIn_62_1;
                      stackIn_64_0 = stackOut_62_0;
                      stackIn_64_1 = stackOut_62_1;
                      stackOut_64_0 = stackIn_64_0;
                      stackOut_64_1 = stackIn_64_1;
                      stackOut_64_2 = 1;
                      stackIn_67_0 = stackOut_64_0;
                      stackIn_67_1 = stackOut_64_1;
                      stackIn_67_2 = stackOut_64_2;
                      break L12;
                    }
                  }
                  var11 = sg.a(stackIn_67_0, stackIn_67_1, stackIn_67_2 != 0);
                  if (var6 == 0) {
                    break L9;
                  } else {
                    L13: {
                      stackOut_68_0 = var12;
                      stackOut_68_1 = 64;
                      stackIn_73_0 = stackOut_68_0;
                      stackIn_73_1 = stackOut_68_1;
                      stackIn_69_0 = stackOut_68_0;
                      stackIn_69_1 = stackOut_68_1;
                      if (var5 == -1) {
                        stackOut_73_0 = stackIn_73_0;
                        stackOut_73_1 = stackIn_73_1;
                        stackOut_73_2 = 0;
                        stackIn_74_0 = stackOut_73_0;
                        stackIn_74_1 = stackOut_73_1;
                        stackIn_74_2 = stackOut_73_2;
                        break L13;
                      } else {
                        stackOut_69_0 = stackIn_69_0;
                        stackOut_69_1 = stackIn_69_1;
                        stackIn_71_0 = stackOut_69_0;
                        stackIn_71_1 = stackOut_69_1;
                        stackOut_71_0 = stackIn_71_0;
                        stackOut_71_1 = stackIn_71_1;
                        stackOut_71_2 = 1;
                        stackIn_74_0 = stackOut_71_0;
                        stackIn_74_1 = stackOut_71_1;
                        stackIn_74_2 = stackOut_71_2;
                        break L13;
                      }
                    }
                    L14: {
                      var12 = sg.a(stackIn_74_0, stackIn_74_1, stackIn_74_2 != 0);
                      stackOut_74_0 = var13;
                      stackOut_74_1 = 64;
                      stackIn_77_0 = stackOut_74_0;
                      stackIn_77_1 = stackOut_74_1;
                      stackIn_75_0 = stackOut_74_0;
                      stackIn_75_1 = stackOut_74_1;
                      if (var5 == -1) {
                        stackOut_77_0 = stackIn_77_0;
                        stackOut_77_1 = stackIn_77_1;
                        stackOut_77_2 = 0;
                        stackIn_78_0 = stackOut_77_0;
                        stackIn_78_1 = stackOut_77_1;
                        stackIn_78_2 = stackOut_77_2;
                        break L14;
                      } else {
                        stackOut_75_0 = stackIn_75_0;
                        stackOut_75_1 = stackIn_75_1;
                        stackOut_75_2 = 1;
                        stackIn_78_0 = stackOut_75_0;
                        stackIn_78_1 = stackOut_75_1;
                        stackIn_78_2 = stackOut_75_2;
                        break L14;
                      }
                    }
                    var13 = sg.a(stackIn_78_0, stackIn_78_1, stackIn_78_2 != 0);
                    break L9;
                  }
                }
              }
            }
            L15: {
              L16: {
                if (var5 != -1) {
                  break L16;
                } else {
                  if (var6 == 0) {
                    break L16;
                  } else {
                    break L15;
                  }
                }
              }
              L17: {
                if (var5 != -1) {
                  break L17;
                } else {
                  if (var6 != 0) {
                    break L17;
                  } else {
                    be.field_c = var16_ref.a(var11, -114);
                    var11 = 128;
                    if (var15 != 0) {
                      break L15;
                    } else {
                      g.a(field_k, field_n, field_d, new int[3], new int[3]);
                      break L15;
                    }
                  }
                }
              }
              be.field_c = var16_ref.a(122, var7, var14);
              break L15;
            }
            var5 = 0;
            break L9;
          }
        }
        L18: {
          if (var5 != -1) {
            L19: {
              stackOut_87_0 = var5 << 2 | 2;
              stackIn_90_0 = stackOut_87_0;
              stackIn_88_0 = stackOut_87_0;
              if (var6 == 0) {
                stackOut_90_0 = stackIn_90_0;
                stackOut_90_1 = 1;
                stackIn_91_0 = stackOut_90_0;
                stackIn_91_1 = stackOut_90_1;
                break L19;
              } else {
                stackOut_88_0 = stackIn_88_0;
                stackOut_88_1 = 0;
                stackIn_91_0 = stackOut_88_0;
                stackIn_91_1 = stackOut_88_1;
                break L19;
              }
            }
            stackOut_91_0 = stackIn_91_0 | stackIn_91_1;
            stackIn_92_0 = stackOut_91_0;
            break L18;
          } else {
            if (var6 == 0) {
              stackOut_86_0 = 1;
              stackIn_92_0 = stackOut_86_0;
              break L18;
            } else {
              stackOut_84_0 = 0;
              stackIn_92_0 = stackOut_84_0;
              break L18;
            }
          }
        }
        var17 = stackIn_92_0;
        nf.a(var17, var7, field_k, field_n, field_d, var11, var12, var13);
        be.field_c = var14;
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        t var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        t var8 = null;
        t var9 = null;
        t var10 = null;
        int var11 = 0;
        int var12 = 0;
        var2 = field_d[0];
        if (var2 >= 50) {
          var3 = be.field_g + (field_k[0] << 9) / var2;
          var4 = be.field_b + (field_n[0] << 9) / var2;
          if (param0 != -32768) {
            var5 = field_e[param0];
            var5.d(var3 - (var5.field_w >> 1), var4 - (var5.field_u >> 1));
            return;
          } else {
            if (ie.field_b != null) {
              L0: {
                var5_int = ie.field_b.field_P.field_f[3];
                var6 = ie.field_b.field_P.field_f[4];
                var7 = ie.field_b.field_P.field_f[5];
                var11 = field_o >> 1 & 7;
                if (var5_int < 0) {
                  var8 = field_a[24 + var11];
                  var5_int = -var5_int;
                  break L0;
                } else {
                  var8 = field_a[var11];
                  break L0;
                }
              }
              L1: {
                if (var6 < 0) {
                  var9 = field_a[32 + var11];
                  var6 = -var6;
                  break L1;
                } else {
                  var9 = field_a[8 + var11];
                  break L1;
                }
              }
              L2: {
                if (var7 < 0) {
                  var10 = field_a[40 + var11];
                  var7 = -var7;
                  break L2;
                } else {
                  var10 = field_a[16 + var11];
                  break L2;
                }
              }
              L3: {
                var12 = var5_int + var6 + var7;
                var5_int = (var5_int << 8) / var12;
                var6 = (var6 << 8) / var12;
                var7 = 256 - var5_int - var6;
                if (var7 >= 0) {
                  break L3;
                } else {
                  System.err.println(var5_int + "\t" + var6 + "\t" + var7);
                  break L3;
                }
              }
              sg.a(var3 - (var8.field_w >> 1), var4 - (var8.field_u >> 1), var5_int, var8, var6, var9, var7, var10);
              return;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    private final ti b(int param0) {
        pj var2 = ((sg) this).field_g[0].field_k;
        int var3 = var2.field_p[param0];
        int var4 = var2.field_u[param0];
        int var5 = var2.field_t[param0];
        mp var6 = ((sg) this).field_g[0].field_q;
        int[] var7 = var6.field_s[0];
        int[] var8 = var6.field_s[1];
        int[] var9 = var6.field_s[2];
        int[] var10 = new int[]{var7[var3], var7[var4], var7[var5]};
        int[] var11 = new int[]{var8[var3], var8[var4], var8[var5]};
        int[] var12 = new int[]{var9[var3], var9[var4], var9[var5]};
        int var13 = var6.field_u[param0];
        return new ti(var10, var11, var12, var13);
    }

    private final static int a(int param0, int param1, boolean param2) {
        if (!param2) {
          return pj.a(param0, param1);
        } else {
          return pj.a(param1);
        }
    }

    final void b(lm param0) {
        ti[] var2 = null;
        int var3 = 0;
        ti var4 = null;
        L0: {
          if (((sg) this).field_D == null) {
            break L0;
          } else {
            var2 = ((sg) this).field_D;
            var3 = 0;
            L1: while (true) {
              if (var3 >= var2.length) {
                break L0;
              } else {
                L2: {
                  var4 = var2[var3];
                  if (var4 == null) {
                    break L2;
                  } else {
                    var4.a(param0, 2);
                    break L2;
                  }
                }
                var3++;
                continue L1;
              }
            }
          }
        }
    }

    final void a(int[] param0) {
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
        int var12 = 0;
        int var13 = 0;
        RuntimeException var14 = null;
        int var14_int = 0;
        int var15_int = 0;
        pj var15 = null;
        int var16 = 0;
        int[][] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (field_f > 1) {
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_4_0 = stackOut_1_0;
            break L0;
          }
        }
        be.field_m = stackIn_4_0 != 0;
        var5 = param0[3];
        var6 = param0[6];
        var7 = param0[9];
        var8 = param0[4];
        var9 = param0[7];
        var10 = param0[10];
        var11 = param0[5];
        var12 = param0[8];
        var13 = param0[11];
        var14_int = -param0[0];
        var15_int = -param0[1];
        var16 = -param0[2];
        var2 = var14_int * var5 + var15_int * var8 + var16 * var11 >> 16;
        var3 = var14_int * var6 + var15_int * var9 + var16 * var12 >> 16;
        var4 = var14_int * var7 + var15_int * var10 + var16 * var13 >> 16;
        ((sg) this).field_A = 2147483647;
        ((sg) this).field_j = 2147483647;
        ((sg) this).field_C = -2147483648;
        var14_int = 0;
        L1: while (true) {
          if (var14_int >= ((sg) this).field_g.length) {
            try {
              L2: {
                this.b();
                break L2;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var14 = decompiledCaughtException;
                break L3;
              }
            }
            return;
          } else {
            L4: {
              if (!((sg) this).field_x[var14_int]) {
                var15 = ((sg) this).field_g[var14_int].field_k;
                var16 = var15.field_k;
                if (var16 != 0) {
                  var17 = ((sg) this).field_g[var14_int].field_q.field_s;
                  var18 = var17[0];
                  var19 = var17[1];
                  var20 = var17[2];
                  var21 = 0;
                  L5: while (true) {
                    if (var21 >= var16) {
                      break L4;
                    } else {
                      var22 = ((sg) this).field_F[var14_int] + var18[var21];
                      var23 = ((sg) this).field_h[var14_int] + var19[var21];
                      var24 = ((sg) this).field_i[var14_int] + var20[var21];
                      ((sg) this).field_A = Math.min(var23, ((sg) this).field_A);
                      ((sg) this).field_v[var14_int][var21] = var2 + (var22 * var5 + var23 * var8 + var24 * var11 >> 16);
                      ((sg) this).field_c[var14_int][var21] = var3 + (var22 * var6 + var23 * var9 + var24 * var12 >> 16);
                      var24 = var4 + (var22 * var7 + var23 * var10 + var24 * var13 >> 16);
                      ((sg) this).field_u[var14_int][var21] = var24;
                      ((sg) this).field_j = Math.min(var24, ((sg) this).field_j);
                      ((sg) this).field_C = Math.max(var24, ((sg) this).field_C);
                      var21++;
                      continue L5;
                    }
                  }
                } else {
                  break L4;
                }
              } else {
                break L4;
              }
            }
            var14_int++;
            continue L1;
          }
        }
    }

    private final static void a(int[] param0, int param1, int[] param2, int param3, int[] param4, int param5, int[] param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (!ia.a(-22426, 0)) {
            stackOut_3_0 = 16711935;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          } else {
            stackOut_1_0 = 16744448;
            stackIn_4_0 = stackOut_1_0;
            break L0;
          }
        }
        var13 = stackIn_4_0;
        var14 = -param10;
        L1: while (true) {
          if (var14 >= 0) {
            return;
          } else {
            var15 = -param9;
            L2: while (true) {
              if (var15 >= 0) {
                param8 = param8 + param11;
                param7 = param7 + param12;
                var14++;
                continue L1;
              } else {
                L3: {
                  var16 = param1 * (param2[param7] & 255) + param3 * (param4[param7] & 255) + param5 * (param6[param7] & 255) >> 8;
                  param7++;
                  if (var16 == 0) {
                    param8++;
                    break L3;
                  } else {
                    var17 = (var13 & 16711935) * var16;
                    var18 = (var17 & -16711936) + (var13 * var16 - var17 & 16711680) >>> 8;
                    var17 = param0[param8];
                    var19 = var18 + var17;
                    var18 = (var18 & 16711935) + (var17 & 16711935);
                    var17 = (var18 & 16777472) + (var19 - var18 & 65536);
                    int incrementValue$2 = param8;
                    param8++;
                    param0[incrementValue$2] = var19 - var17 | var17 - (var17 >>> 8);
                    break L3;
                  }
                }
                var15++;
                continue L2;
              }
            }
          }
        }
    }

    final void a(int param0, kh param1) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        int[] var5_array = null;
        mp var6 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param1.field_k == null) {
            stackOut_3_0 = param1.field_l.field_f;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          } else {
            stackOut_1_0 = param1.field_k.field_k;
            stackIn_4_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var3 = stackIn_4_0;
          if (param1.field_k == null) {
            stackOut_7_0 = param1.field_l.field_g;
            stackIn_8_0 = stackOut_7_0;
            break L1;
          } else {
            stackOut_5_0 = param1.field_k.field_x;
            stackIn_8_0 = stackOut_5_0;
            break L1;
          }
        }
        L2: {
          var4 = stackIn_8_0;
          ((sg) this).field_v[param0] = new int[var3];
          ((sg) this).field_c[param0] = new int[var3];
          ((sg) this).field_u[param0] = new int[var3];
          ((sg) this).field_G[param0] = new int[var4];
          if (((sg) this).field_g[param0] == null) {
            var5_array = null;
            break L2;
          } else {
            var6 = ((sg) this).field_g[param0].field_q;
            var6.field_r = var6.field_r - 1;
            var5_array = var6.field_t;
            break L2;
          }
        }
        L3: {
          ((sg) this).field_g[param0] = param1;
          var6 = param1.field_q;
          if (var6 != null) {
            break L3;
          } else {
            mp dupTemp$1 = new mp();
            var6 = dupTemp$1;
            param1.field_q = dupTemp$1;
            break L3;
          }
        }
        L4: {
          var6.field_r = var6.field_r + 1;
          if (var5_array != null) {
            break L4;
          } else {
            if (var6.field_s != null) {
              break L4;
            } else {
              var5_array = new int[]{0, 0, 0, 65535, 0, 0, 0, 65535, 0, 0, 0, 65535};
              break L4;
            }
          }
        }
        L5: {
          if (var5_array == null) {
            break L5;
          } else {
            ((sg) this).a(param1, var5_array);
            break L5;
          }
        }
        L6: {
          if (param1.field_l != null) {
            break L6;
          } else {
            if (var6.field_t != null) {
              break L6;
            } else {
              var6.field_t = new int[]{0, 0, 0, 65535, 0, 0, 0, 65535, 0, 0, 0, 65535};
              this.a(param1);
              break L6;
            }
          }
        }
        L7: {
          ((sg) this).field_x[param0] = false;
          if (param0 != 0) {
            break L7;
          } else {
            ((sg) this).field_D = null;
            break L7;
          }
        }
    }

    final void d(int param0) {
        ((sg) this).a(param0, field_b);
        ((sg) this).field_x[param0] = true;
    }

    private final int b(int param0, int param1) {
        pj var3 = ((sg) this).field_g[param0].field_k;
        int var4 = var3.field_p[param1];
        int var5 = var3.field_u[param1];
        int var6 = var3.field_t[param1];
        int var7 = ((sg) this).field_u[param0][var4];
        int var8 = ((sg) this).field_u[param0][var5];
        int var9 = ((sg) this).field_u[param0][var6];
        return Math.max(Math.max(var7, var8), var9) - ((sg) this).field_j;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        L0: {
          if (((sg) this).field_g[param0].field_k != null) {
            break L0;
          } else {
            sg.a(((sg) this).field_g[param0], param1, param2, param3, param4, param5);
            break L0;
          }
        }
    }

    final void a(lm param0) {
        pj var2 = null;
        mp var3 = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        boolean[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        boolean[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        boolean[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        boolean[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        boolean[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        boolean[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        boolean[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        boolean[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        boolean[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        L0: {
          var2 = ((sg) this).field_g[0].field_k;
          var3 = ((sg) this).field_g[0].field_q;
          var4 = var3.field_s[0];
          var5 = var3.field_s[1];
          var6 = var3.field_s[2];
          var7 = var2.field_p;
          var8 = var2.field_u;
          var9 = var2.field_t;
          var10 = var4.length;
          var11 = var7.length;
          if (((sg) this).field_D != null) {
            break L0;
          } else {
            ((sg) this).field_D = new ti[var11];
            break L0;
          }
        }
        L1: {
          L2: {
            if (field_w == null) {
              break L2;
            } else {
              if (field_w.length >= var10) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          field_w = new boolean[var10];
          break L1;
        }
        var12 = field_w;
        var13 = 0;
        L3: while (true) {
          if (var13 >= var10) {
            var13 = 0;
            L4: while (true) {
              if (var13 >= var11) {
                return;
              } else {
                L5: {
                  if (var2.field_l[var13] != -2) {
                    var14 = var7[var13];
                    var15 = var8[var13];
                    var16 = var9[var13];
                    var17 = var4[var14] - var4[var15];
                    var18 = var5[var14] - var5[var15];
                    var19 = var6[var14] - var6[var15];
                    var20 = var4[var16] - var4[var15];
                    var21 = var5[var16] - var5[var15];
                    var22 = var6[var16] - var6[var15];
                    var23 = var19 * var21 - var18 * var22;
                    var24 = var17 * var22 - var19 * var20;
                    var25 = var18 * var20 - var17 * var21;
                    if (var23 * -1 + var24 * -12 + var25 * 12 > 0) {
                      L6: {
                        if (param0.a()) {
                          break L6;
                        } else {
                          L7: {
                            if (var12[var14]) {
                              break L7;
                            } else {
                              if (var12[var15]) {
                                break L7;
                              } else {
                                if (!var12[var16]) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          L8: {
                            if (((sg) this).field_D[var13] != null) {
                              break L8;
                            } else {
                              ((sg) this).field_D[var13] = this.b(var13);
                              break L8;
                            }
                          }
                          ((sg) this).field_D[var13].a(true, param0);
                          break L5;
                        }
                      }
                      if (!param0.a(var4[var14], var5[var14], var6[var14], var4[var15], var5[var15], var6[var15], var4[var16], var5[var16], var6[var16], var23, var24, var25)) {
                        break L5;
                      } else {
                        L9: {
                          if (((sg) this).field_D[var13] != null) {
                            break L9;
                          } else {
                            ((sg) this).field_D[var13] = this.b(var13);
                            break L9;
                          }
                        }
                        ((sg) this).field_D[var13].a(true, param0);
                        break L5;
                      }
                    } else {
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                var13++;
                continue L4;
              }
            }
          } else {
            L10: {
              stackOut_11_0 = (boolean[]) var12;
              stackOut_11_1 = var13;
              stackIn_16_0 = stackOut_11_0;
              stackIn_16_1 = stackOut_11_1;
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              if (param0.a(var4[var13], var5[var13], var6[var13]) != 2) {
                stackOut_16_0 = (boolean[]) (Object) stackIn_16_0;
                stackOut_16_1 = stackIn_16_1;
                stackOut_16_2 = 0;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                stackIn_17_2 = stackOut_16_2;
                break L10;
              } else {
                stackOut_12_0 = (boolean[]) (Object) stackIn_12_0;
                stackOut_12_1 = stackIn_12_1;
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackOut_14_0 = (boolean[]) (Object) stackIn_14_0;
                stackOut_14_1 = stackIn_14_1;
                stackOut_14_2 = 1;
                stackIn_17_0 = stackOut_14_0;
                stackIn_17_1 = stackOut_14_1;
                stackIn_17_2 = stackOut_14_2;
                break L10;
              }
            }
            stackIn_17_0[stackIn_17_1] = stackIn_17_2 != 0;
            var13++;
            continue L3;
          }
        }
    }

    final ti[] a(int param0) {
        ti[] var2 = null;
        ti[] var3 = null;
        int var4 = 0;
        ti[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        ti[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        ti[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        ti[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        ti stackIn_11_2 = null;
        ti[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        ti[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        ti stackOut_10_2 = null;
        ti[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        ti[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_8_2 = null;
        var2 = ((sg) this).field_D;
        if (var2 != null) {
          var3 = new ti[var2.length];
          var4 = 0;
          L0: while (true) {
            if (var4 >= var3.length) {
              return var3;
            } else {
              L1: {
                stackOut_5_0 = (ti[]) var3;
                stackOut_5_1 = var4;
                stackIn_10_0 = stackOut_5_0;
                stackIn_10_1 = stackOut_5_1;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                if (var2[var4] != null) {
                  stackOut_10_0 = (ti[]) (Object) stackIn_10_0;
                  stackOut_10_1 = stackIn_10_1;
                  stackOut_10_2 = var2[var4].c((byte) 56);
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  break L1;
                } else {
                  stackOut_6_0 = (ti[]) (Object) stackIn_6_0;
                  stackOut_6_1 = stackIn_6_1;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  stackOut_8_0 = (ti[]) (Object) stackIn_8_0;
                  stackOut_8_1 = stackIn_8_1;
                  stackOut_8_2 = null;
                  stackIn_11_0 = stackOut_8_0;
                  stackIn_11_1 = stackOut_8_1;
                  stackIn_11_2 = (ti) (Object) stackOut_8_2;
                  break L1;
                }
              }
              stackIn_11_0[stackIn_11_1] = stackIn_11_2;
              var4++;
              continue L0;
            }
          }
        } else {
          return null;
        }
    }

    private final boolean a(int param0, pj param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int stackIn_16_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        if (param1.field_l[param2] != -2) {
          var4 = param1.field_p[param2];
          var5 = param1.field_u[param2];
          var6 = param1.field_t[param2];
          if (var4 != var5) {
            L0: {
              var7 = ((sg) this).field_v[param0];
              var8 = ((sg) this).field_c[param0];
              var9 = ((sg) this).field_u[param0];
              field_t[0] = -5000;
              field_t[1] = -5000;
              field_t[2] = -5000;
              var10 = var9[var4];
              if (var10 < 50) {
                break L0;
              } else {
                field_t[0] = be.field_g + (var7[var4] << 9) / var10;
                field_l[0] = be.field_b + (var8[var4] << 9) / var10;
                break L0;
              }
            }
            L1: {
              var11 = var9[var5];
              if (var11 < 50) {
                break L1;
              } else {
                field_t[1] = be.field_g + (var7[var5] << 9) / var11;
                field_l[1] = be.field_b + (var8[var5] << 9) / var11;
                break L1;
              }
            }
            L2: {
              var12 = var9[var6];
              if (var12 < 50) {
                break L2;
              } else {
                field_t[2] = be.field_g + (var7[var6] << 9) / var12;
                field_l[2] = be.field_b + (var8[var6] << 9) / var12;
                break L2;
              }
            }
            L3: {
              L4: {
                if (field_t[0] == -5000) {
                  break L4;
                } else {
                  if (field_t[1] == -5000) {
                    break L4;
                  } else {
                    if (field_t[2] != -5000) {
                      if ((field_t[0] - field_t[1]) * (field_l[2] - field_l[1]) - (field_l[0] - field_l[1]) * (field_t[2] - field_t[1]) > 0) {
                        break L3;
                      } else {
                        L5: {
                          if (field_s != 12) {
                            break L5;
                          } else {
                            if (param0 != 0) {
                              break L5;
                            } else {
                              L6: {
                                if (((sg) this).field_D == null) {
                                  break L6;
                                } else {
                                  ((sg) this).field_D[param2] = null;
                                  break L6;
                                }
                              }
                              return false;
                            }
                          }
                        }
                        return true;
                      }
                    } else {
                      break L4;
                    }
                  }
                }
              }
              var13 = var7[var4];
              var14 = var7[var5];
              var15 = var7[var6];
              var16 = var8[var4];
              var17 = var8[var5];
              var18 = var8[var6];
              var13 = var13 - var14;
              var15 = var15 - var14;
              var16 = var16 - var17;
              var18 = var18 - var17;
              var10 = var10 - var11;
              var12 = var12 - var11;
              var19 = var16 * var12 - var10 * var18;
              var20 = var10 * var15 - var13 * var12;
              var21 = var13 * var18 - var16 * var15;
              if (var14 * var19 + var17 * var20 + var11 * var21 > 0) {
                break L3;
              } else {
                L7: {
                  if (field_s != 12) {
                    break L7;
                  } else {
                    if (param0 != 0) {
                      break L7;
                    } else {
                      L8: {
                        if (((sg) this).field_D == null) {
                          break L8;
                        } else {
                          ((sg) this).field_D[param2] = null;
                          break L8;
                        }
                      }
                      return false;
                    }
                  }
                }
                return true;
              }
            }
            L9: {
              if (field_t[0] == -5000) {
                break L9;
              } else {
                if (field_t[1] == -5000) {
                  break L9;
                } else {
                  if (field_t[2] == -5000) {
                    break L9;
                  } else {
                    L10: {
                      L11: {
                        if (field_t[0] >= 0) {
                          break L11;
                        } else {
                          if (field_t[1] >= 0) {
                            break L11;
                          } else {
                            if (field_t[2] < 0) {
                              break L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                      L12: {
                        if (field_t[0] <= be.field_p) {
                          break L12;
                        } else {
                          if (field_t[1] <= be.field_p) {
                            break L12;
                          } else {
                            if (field_t[2] > be.field_p) {
                              break L10;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                      L13: {
                        if (field_l[0] >= 0) {
                          break L13;
                        } else {
                          if (field_l[1] >= 0) {
                            break L13;
                          } else {
                            if (field_l[2] < 0) {
                              break L10;
                            } else {
                              break L13;
                            }
                          }
                        }
                      }
                      if (field_l[0] <= be.field_f) {
                        break L9;
                      } else {
                        if (field_l[1] <= be.field_f) {
                          break L9;
                        } else {
                          if (field_l[2] <= be.field_f) {
                            break L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    return true;
                  }
                }
              }
            }
            return false;
          } else {
            L14: {
              L15: {
                if (var4 == var6) {
                  break L15;
                } else {
                  if (((sg) this).field_u[param0][var4] >= 50) {
                    break L15;
                  } else {
                    if (((sg) this).field_u[param0][var6] >= 50) {
                      break L15;
                    } else {
                      stackOut_13_0 = 1;
                      stackIn_16_0 = stackOut_13_0;
                      break L14;
                    }
                  }
                }
              }
              stackOut_15_0 = 0;
              stackIn_16_0 = stackOut_15_0;
              break L14;
            }
            return stackIn_16_0 != 0;
          }
        } else {
          return true;
        }
    }

    private final static void a(int param0, int param1, int param2, t param3, int param4, t param5, int param6, t param7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var8 = 0;
          var9 = param3.field_t;
          var10 = param3.field_s;
          var11 = ph.field_j - var10;
          var12 = 0;
          if (param1 >= ph.field_c) {
            break L0;
          } else {
            var13 = ph.field_c - param1;
            var9 = var9 - var13;
            param1 = ph.field_c;
            var8 = var8 + var13 * var10;
            break L0;
          }
        }
        L1: {
          if (param1 + var9 <= ph.field_h) {
            break L1;
          } else {
            var9 = var9 - (param1 + var9 - ph.field_h);
            break L1;
          }
        }
        L2: {
          if (param0 >= ph.field_k) {
            break L2;
          } else {
            var13 = ph.field_k - param0;
            var10 = var10 - var13;
            param0 = ph.field_k;
            var8 = var8 + var13;
            var12 = var12 + var13;
            var11 = var11 + var13;
            break L2;
          }
        }
        L3: {
          if (param0 + var10 <= ph.field_a) {
            break L3;
          } else {
            var13 = param0 + var10 - ph.field_a;
            var10 = var10 - var13;
            var12 = var12 + var13;
            var11 = var11 + var13;
            break L3;
          }
        }
        L4: {
          if (var10 <= 0) {
            break L4;
          } else {
            if (var9 > 0) {
              var13 = param0 + param1 * ph.field_j;
              sg.a(ph.field_e, param2, param3.field_y, param4, param5.field_y, param6, param7.field_y, var8, var13, var10, var9, var11, var12);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    final void a(kh param0, int[] param1) {
        mp var3 = null;
        int var4 = 0;
        int var5_int = 0;
        int[] var5 = null;
        int var6_int = 0;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (param0.field_l != null) {
          L0: {
            var3 = param0.field_q;
            if (var3 == null) {
              break L0;
            } else {
              if (var3.field_r > 0) {
                var4 = 0;
                L1: while (true) {
                  if (var4 >= 3) {
                    L2: {
                      if (var3.field_t != null) {
                        var4 = 1;
                        var5_int = 3;
                        L3: while (true) {
                          if (var5_int >= 12) {
                            if (var4 == 0) {
                              break L2;
                            } else {
                              return;
                            }
                          } else {
                            L4: {
                              if (var3.field_t[var5_int] == param1[var5_int]) {
                                break L4;
                              } else {
                                var4 = 0;
                                break L4;
                              }
                            }
                            var5_int++;
                            continue L3;
                          }
                        }
                      } else {
                        var3.field_t = new int[12];
                        break L2;
                      }
                    }
                    var4 = 3;
                    L5: while (true) {
                      if (var4 >= 12) {
                        L6: {
                          var4 = param0.field_l.field_f;
                          var5 = param0.field_l.field_M;
                          var6 = param0.field_l.field_B;
                          var7 = param0.field_l.field_E;
                          if (var3.field_s != null) {
                            break L6;
                          } else {
                            var3.field_s = new int[][]{new int[var4], new int[var4], new int[var4]};
                            break L6;
                          }
                        }
                        var8 = var3.field_s[0];
                        var9 = var3.field_s[1];
                        var10 = var3.field_s[2];
                        var11 = 0;
                        L7: while (true) {
                          if (var11 >= var4) {
                            var3.field_v = null;
                            return;
                          } else {
                            var12 = var5[var11];
                            var13 = var6[var11];
                            var14 = var7[var11];
                            var8[var11] = var12 * param1[3] + var13 * param1[6] + var14 * param1[9] >> 16;
                            var9[var11] = var12 * param1[4] + var13 * param1[7] + var14 * param1[10] >> 16;
                            var10[var11] = var12 * param1[5] + var13 * param1[8] + var14 * param1[11] >> 16;
                            var11++;
                            continue L7;
                          }
                        }
                      } else {
                        var3.field_t[var4] = param1[var4];
                        var4++;
                        continue L5;
                      }
                    }
                  } else {
                    var5_int = -1;
                    var6_int = 0;
                    L8: while (true) {
                      if (var6_int >= 3) {
                        L9: {
                          if (var5_int < 0) {
                            break L9;
                          } else {
                            param1[3 * var5_int + var4 + 3] = 65536;
                            break L9;
                          }
                        }
                        var4++;
                        continue L1;
                      } else {
                        L10: {
                          if (param1[3 * var6_int + var4 + 3] != 65535) {
                            if (param1[3 * var6_int + var4 + 3] == 0) {
                              break L10;
                            } else {
                              var5_int -= 6;
                              break L10;
                            }
                          } else {
                            var5_int = var5_int + (var6_int + 1);
                            break L10;
                          }
                        }
                        var6_int++;
                        continue L8;
                      }
                    }
                  }
                }
              } else {
                break L0;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void a() {
        field_e = null;
        field_a = null;
        field_E = null;
        field_r = null;
        field_z = null;
        field_B = null;
        field_k = null;
        field_n = null;
        field_d = null;
        field_t = null;
        field_l = null;
        field_b = null;
        field_w = null;
    }

    private final void e(int param0) {
        int var2_int = 0;
        pj var2 = null;
        int var3 = 0;
        int var4_int = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var2_int = 0;
        L0: while (true) {
          if (var2_int >= 1024) {
            var2 = ((sg) this).field_g[param0].field_k;
            var3 = var2.field_x;
            var4_int = 0;
            L1: while (true) {
              if (var4_int >= var3) {
                var4 = ((sg) this).field_G[param0];
                var5 = 0;
                var6 = 0;
                L2: while (true) {
                  if (var6 >= 1024) {
                    L3: while (true) {
                      if (var5 >= var4.length) {
                        return;
                      } else {
                        int incrementValue$2 = var5;
                        var5++;
                        var4[incrementValue$2] = -1;
                        continue L3;
                      }
                    }
                  } else {
                    L4: {
                      if (field_E[var6] != 0) {
                        var7 = 0;
                        L5: while (true) {
                          if (var7 >= 768) {
                            var7 = 0;
                            L6: while (true) {
                              if (var7 >= field_E[var6]) {
                                var7 = 0;
                                L7: while (true) {
                                  if (var7 >= 768) {
                                    break L4;
                                  } else {
                                    var8 = 0;
                                    L8: while (true) {
                                      if (var8 >= field_z[var7]) {
                                        var7++;
                                        continue L7;
                                      } else {
                                        int incrementValue$3 = var5;
                                        var5++;
                                        var4[incrementValue$3] = field_B[var7][var8];
                                        var8++;
                                        continue L8;
                                      }
                                    }
                                  }
                                }
                              } else {
                                var8 = field_r[var6][var7];
                                var9 = this.b(param0, var8);
                                field_z[var9 % 768] = field_z[var9 % 768] + 1;
                                field_B[var9 % 768][field_z[var9 % 768]] = (short) var8;
                                var7++;
                                continue L6;
                              }
                            }
                          } else {
                            field_z[var7] = 0;
                            var7++;
                            continue L5;
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                    var6++;
                    continue L2;
                  }
                }
              } else {
                L9: {
                  if (this.a(param0, var2, var4_int)) {
                    break L9;
                  } else {
                    var5 = this.b(param0, var4_int);
                    field_E[var5 / 768] = field_E[var5 / 768] + 1;
                    field_r[var5 / 768][field_E[var5 / 768]] = (short) var4_int;
                    break L9;
                  }
                }
                var4_int = (short)(var4_int + 1);
                continue L1;
              }
            }
          } else {
            field_E[var2_int] = 0;
            var2_int++;
            continue L0;
          }
        }
    }

    private final boolean a(int param0, int param1) {
        return ((sg) this).field_m[param0] > ((sg) this).field_m[param1];
    }

    private final static int[] a(short[] param0) {
        int[] var1 = null;
        int var2 = 0;
        var1 = new int[param0.length];
        var2 = 0;
        L0: while (true) {
          if (var2 >= var1.length) {
            return var1;
          } else {
            var1[var2] = param0[var2] & 65535;
            var2++;
            continue L0;
          }
        }
    }

    private final void a(kh param0) {
        mp var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int var10 = 0;
        L0: {
          if (param0.field_k == null) {
            break L0;
          } else {
            if (param0.field_k.field_k != 0) {
              L1: {
                var2 = param0.field_q;
                if (var2 == null) {
                  break L1;
                } else {
                  if (var2.field_r > 0) {
                    L2: {
                      var3 = param0.field_k.field_k;
                      var4 = param0.field_k.field_j;
                      var5 = param0.field_k.field_y;
                      var6 = param0.field_k.field_v;
                      if (var2.field_s != null) {
                        break L2;
                      } else {
                        var2.field_s = new int[][]{new int[var3], new int[var3], new int[var3]};
                        break L2;
                      }
                    }
                    var7 = var2.field_s[0];
                    var8 = var2.field_s[1];
                    var9 = var2.field_s[2];
                    var10 = 0;
                    L3: while (true) {
                      if (var10 >= var3) {
                        var2.field_v = null;
                        return;
                      } else {
                        var7[var10] = var4[var10];
                        var8[var10] = var5[var10];
                        var9[var10] = var6[var10];
                        var10++;
                        continue L3;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
              return;
            } else {
              break L0;
            }
          }
        }
    }

    final static void a(kh param0, int param1, int param2, int param3, int param4, int param5) {
        rm var6 = null;
        mp var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        pj var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        dd var25_ref_dd = null;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        dd var34_ref_dd = null;
        int var34 = 0;
        int var35 = 0;
        int stackIn_85_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_84_0 = 0;
        L0: {
          var6 = param0.field_l;
          if (var6 == null) {
            break L0;
          } else {
            if (var6.field_f != 0) {
              var7 = param0.field_q;
              if (var7.field_r > 0) {
                L1: {
                  if (var7.field_v != null) {
                    var8 = var7.field_v;
                    if (var8[0] != param1) {
                      break L1;
                    } else {
                      if (var8[1] != param2) {
                        break L1;
                      } else {
                        if (var8[2] != param3) {
                          break L1;
                        } else {
                          if (var8[3] != param4) {
                            break L1;
                          } else {
                            if (var8[4] != param5) {
                              break L1;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    var7.field_v = new int[5];
                    break L1;
                  }
                }
                L2: {
                  var8 = var7.field_v;
                  var8[0] = param1;
                  var8[1] = param2;
                  var8[2] = param3;
                  var8[3] = param4;
                  var8[4] = param5;
                  var9 = var7.field_t;
                  var10 = param3;
                  var11 = param4;
                  param3 = var9[3] * var10 + var9[4] * var11 + var9[5] * param5 >> 16;
                  param4 = var9[6] * var10 + var9[7] * var11 + var9[8] * param5 >> 16;
                  param5 = var9[9] * var10 + var9[10] * var11 + var9[11] * param5 >> 16;
                  var12 = (int)Math.sqrt((double)(param3 * param3 + param4 * param4 + param5 * param5));
                  var13 = param2 * var12 >> 8;
                  var14 = var6.field_o.length;
                  if (param0.field_k != null) {
                    var15 = param0.field_k;
                    break L2;
                  } else {
                    L3: {
                      var15 = new pj(new pj[0], 0);
                      var15.field_k = var6.field_f;
                      var15.field_x = var6.field_g;
                      var15.field_m = var6.field_k;
                      var15.field_j = var6.field_M;
                      var15.field_y = var6.field_B;
                      var15.field_v = var6.field_E;
                      var15.field_p = var6.field_o;
                      var15.field_u = var6.field_y;
                      var15.field_t = var6.field_q;
                      if (var6.field_u == null) {
                        break L3;
                      } else {
                        var15.field_h = sg.a(var6.field_u);
                        var15.field_g = sg.a(var6.field_n);
                        var15.field_i = sg.a(var6.field_x);
                        break L3;
                      }
                    }
                    var15.field_F = var6.field_D;
                    var15.field_z = var6.field_A;
                    param0.field_k = var15;
                    break L2;
                  }
                }
                L4: {
                  L5: {
                    if (var15.field_f == null) {
                      break L5;
                    } else {
                      if (var15.field_f.length >= var14) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var15.field_f = new int[var14];
                  var15.field_s = new int[var14];
                  var15.field_l = new int[var14];
                  break L4;
                }
                L6: {
                  var16 = var6.field_M;
                  var17 = var6.field_B;
                  var18 = var6.field_E;
                  var19 = var6.field_f;
                  if (var6.field_l != null) {
                    break L6;
                  } else {
                    var6.field_l = new dd[var19];
                    var20 = 0;
                    L7: while (true) {
                      if (var20 >= var14) {
                        break L6;
                      } else {
                        L8: {
                          L9: {
                            if (var6.field_j == null) {
                              break L9;
                            } else {
                              if (var6.field_j[var20] != 0) {
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                          var21 = var6.field_o[var20];
                          var22 = var6.field_y[var20];
                          var23 = var6.field_q[var20];
                          var24 = var16[var22] - var16[var21];
                          var25 = var17[var22] - var17[var21];
                          var26 = var18[var22] - var18[var21];
                          var27 = var16[var23] - var16[var21];
                          var28 = var17[var23] - var17[var21];
                          var29 = var18[var23] - var18[var21];
                          var30 = var25 * var29 - var28 * var26;
                          var31 = var26 * var27 - var29 * var24;
                          var32 = var24 * var28 - var27 * var25;
                          L10: while (true) {
                            L11: {
                              if (var30 > 8192) {
                                break L11;
                              } else {
                                if (var31 > 8192) {
                                  break L11;
                                } else {
                                  if (var32 > 8192) {
                                    break L11;
                                  } else {
                                    if (var30 < -8192) {
                                      break L11;
                                    } else {
                                      if (var31 < -8192) {
                                        break L11;
                                      } else {
                                        if (var32 >= -8192) {
                                          L12: {
                                            var33 = (int)Math.sqrt((double)(var30 * var30 + var31 * var31 + var32 * var32));
                                            if (var33 > 0) {
                                              break L12;
                                            } else {
                                              var33 = 1;
                                              break L12;
                                            }
                                          }
                                          L13: {
                                            var30 = var30 * 256 / var33;
                                            var31 = var31 * 256 / var33;
                                            var32 = var32 * 256 / var33;
                                            var34_ref_dd = var6.field_l[var21];
                                            if (var34_ref_dd != null) {
                                              break L13;
                                            } else {
                                              dd dupTemp$3 = new dd();
                                              var6.field_l[var21] = dupTemp$3;
                                              var34_ref_dd = dupTemp$3;
                                              break L13;
                                            }
                                          }
                                          L14: {
                                            var34_ref_dd.field_g = var34_ref_dd.field_g + var30;
                                            var34_ref_dd.field_a = var34_ref_dd.field_a + var31;
                                            var34_ref_dd.field_h = var34_ref_dd.field_h + var32;
                                            var34_ref_dd.field_f = var34_ref_dd.field_f + 1;
                                            var34_ref_dd = var6.field_l[var22];
                                            if (var34_ref_dd != null) {
                                              break L14;
                                            } else {
                                              dd dupTemp$4 = new dd();
                                              var6.field_l[var22] = dupTemp$4;
                                              var34_ref_dd = dupTemp$4;
                                              break L14;
                                            }
                                          }
                                          L15: {
                                            var34_ref_dd.field_g = var34_ref_dd.field_g + var30;
                                            var34_ref_dd.field_a = var34_ref_dd.field_a + var31;
                                            var34_ref_dd.field_h = var34_ref_dd.field_h + var32;
                                            var34_ref_dd.field_f = var34_ref_dd.field_f + 1;
                                            var34_ref_dd = var6.field_l[var23];
                                            if (var34_ref_dd != null) {
                                              break L15;
                                            } else {
                                              dd dupTemp$5 = new dd();
                                              var6.field_l[var23] = dupTemp$5;
                                              var34_ref_dd = dupTemp$5;
                                              break L15;
                                            }
                                          }
                                          var34_ref_dd.field_g = var34_ref_dd.field_g + var30;
                                          var34_ref_dd.field_a = var34_ref_dd.field_a + var31;
                                          var34_ref_dd.field_h = var34_ref_dd.field_h + var32;
                                          var34_ref_dd.field_f = var34_ref_dd.field_f + 1;
                                          break L8;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var30 = var30 >> 1;
                            var31 = var31 >> 1;
                            var32 = var32 >> 1;
                            continue L10;
                          }
                        }
                        var20++;
                        continue L7;
                      }
                    }
                  }
                }
                var20 = 0;
                L16: while (true) {
                  if (var20 >= var14) {
                    return;
                  } else {
                    L17: {
                      L18: {
                        var21 = var6.field_o[var20];
                        var22 = var6.field_y[var20];
                        var23 = var6.field_q[var20];
                        if (var6.field_D == null) {
                          break L18;
                        } else {
                          if (var6.field_D[var20] == -1) {
                            break L18;
                          } else {
                            stackOut_82_0 = 1;
                            stackIn_85_0 = stackOut_82_0;
                            break L17;
                          }
                        }
                      }
                      stackOut_84_0 = 0;
                      stackIn_85_0 = stackOut_84_0;
                      break L17;
                    }
                    L19: {
                      L20: {
                        var24 = stackIn_85_0;
                        if (var6.field_j == null) {
                          break L20;
                        } else {
                          if (var6.field_j[var20] != 0) {
                            if (var6.field_j[var20] != 1) {
                              var15.field_l[var20] = -2;
                              break L19;
                            } else {
                              var25 = var16[var22] - var16[var21];
                              var26 = var17[var22] - var17[var21];
                              var27 = var18[var22] - var18[var21];
                              var28 = var16[var23] - var16[var21];
                              var29 = var17[var23] - var17[var21];
                              var30 = var18[var23] - var18[var21];
                              var31 = var26 * var30 - var29 * var27;
                              var32 = var27 * var28 - var30 * var25;
                              var33 = var25 * var29 - var28 * var26;
                              L21: while (true) {
                                L22: {
                                  if (var31 > 8192) {
                                    break L22;
                                  } else {
                                    if (var32 > 8192) {
                                      break L22;
                                    } else {
                                      if (var33 > 8192) {
                                        break L22;
                                      } else {
                                        if (var31 < -8192) {
                                          break L22;
                                        } else {
                                          if (var32 < -8192) {
                                            break L22;
                                          } else {
                                            if (var33 >= -8192) {
                                              L23: {
                                                var34 = (int)Math.sqrt((double)(var31 * var31 + var32 * var32 + var33 * var33));
                                                if (var34 > 0) {
                                                  break L23;
                                                } else {
                                                  var34 = 1;
                                                  break L23;
                                                }
                                              }
                                              var31 = var31 * 256 / var34;
                                              var32 = var32 * 256 / var34;
                                              var33 = var33 * 256 / var34;
                                              var35 = param1 + (param3 * var31 + param4 * var32 + param5 * var33) / (var13 + var13 / 2);
                                              var15.field_f[var20] = sg.a((int) var6.field_m[var20], var35, var24 != 0);
                                              var15.field_l[var20] = -1;
                                              break L19;
                                            } else {
                                              break L22;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                var31 = var31 >> 1;
                                var32 = var32 >> 1;
                                var33 = var33 >> 1;
                                continue L21;
                              }
                            }
                          } else {
                            break L20;
                          }
                        }
                      }
                      L24: {
                        var27 = var6.field_m[var20];
                        if (var13 == 0) {
                          break L24;
                        } else {
                          if (var6.field_l[var21].field_f != 0) {
                            break L24;
                          } else {
                            break L24;
                          }
                        }
                      }
                      L25: {
                        var25_ref_dd = var6.field_l[var21];
                        var26 = param1 + (param3 * var25_ref_dd.field_g + param4 * var25_ref_dd.field_a + param5 * var25_ref_dd.field_h) / (var13 * var25_ref_dd.field_f);
                        var15.field_f[var20] = sg.a(var27, var26, var24 != 0);
                        if (var6.field_l[var22].field_f != 0) {
                          break L25;
                        } else {
                          break L25;
                        }
                      }
                      L26: {
                        var25_ref_dd = var6.field_l[var22];
                        var26 = param1 + (param3 * var25_ref_dd.field_g + param4 * var25_ref_dd.field_a + param5 * var25_ref_dd.field_h) / (var13 * var25_ref_dd.field_f);
                        var15.field_s[var20] = sg.a(var27, var26, var24 != 0);
                        if (var6.field_l[var23].field_f != 0) {
                          break L26;
                        } else {
                          break L26;
                        }
                      }
                      var25_ref_dd = var6.field_l[var23];
                      var26 = param1 + (param3 * var25_ref_dd.field_g + param4 * var25_ref_dd.field_a + param5 * var25_ref_dd.field_h) / (var13 * var25_ref_dd.field_f);
                      var15.field_l[var20] = sg.a(var27, var26, var24 != 0);
                      break L19;
                    }
                    var20++;
                    continue L16;
                  }
                }
              } else {
                return;
              }
            } else {
              break L0;
            }
          }
        }
    }

    private final void b() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int[] stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int[] stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int[] stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int stackIn_30_2 = 0;
        int stackIn_49_0 = 0;
        int[] stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int[] stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int stackOut_29_2 = 0;
        int[] stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        int stackOut_46_0 = 0;
        int stackOut_48_0 = 0;
        int[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        var1 = 0;
        L0: while (true) {
          if (var1 >= ((sg) this).field_g.length) {
            L1: while (true) {
              if (((sg) this).field_m[((sg) this).field_q[0]] == -2147483648) {
                return;
              } else {
                L2: {
                  var1 = ((sg) this).field_q[0];
                  var2 = ((sg) this).field_G[var1][((sg) this).field_p[var1]];
                  this.c(var1, var2);
                  ((sg) this).field_p[var1] = ((sg) this).field_p[var1] - 1;
                  stackOut_26_0 = ((sg) this).field_m;
                  stackOut_26_1 = var1;
                  stackIn_29_0 = stackOut_26_0;
                  stackIn_29_1 = stackOut_26_1;
                  stackIn_27_0 = stackOut_26_0;
                  stackIn_27_1 = stackOut_26_1;
                  if (((sg) this).field_p[var1] <= 0) {
                    stackOut_29_0 = (int[]) (Object) stackIn_29_0;
                    stackOut_29_1 = stackIn_29_1;
                    stackOut_29_2 = -2147483648;
                    stackIn_30_0 = stackOut_29_0;
                    stackIn_30_1 = stackOut_29_1;
                    stackIn_30_2 = stackOut_29_2;
                    break L2;
                  } else {
                    int dupTemp$1 = this.b(var1, ((sg) this).field_G[var1][((sg) this).field_p[var1]]);
                    ((sg) this).field_m[var1] = dupTemp$1;
                    stackOut_27_0 = (int[]) (Object) stackIn_27_0;
                    stackOut_27_1 = stackIn_27_1;
                    stackOut_27_2 = dupTemp$1;
                    stackIn_30_0 = stackOut_27_0;
                    stackIn_30_1 = stackOut_27_1;
                    stackIn_30_2 = stackOut_27_2;
                    break L2;
                  }
                }
                stackIn_30_0[stackIn_30_1] = stackIn_30_2;
                var3 = 0;
                L3: while (true) {
                  L4: {
                    L5: {
                      var4 = 2 * var3 + 1;
                      var5 = var4 + 1;
                      if (var4 >= ((sg) this).field_q.length) {
                        break L5;
                      } else {
                        if (!this.a(var1, ((sg) this).field_q[var4])) {
                          L6: {
                            L7: {
                              if (var5 >= ((sg) this).field_q.length) {
                                break L7;
                              } else {
                                if (!this.a(((sg) this).field_q[var5], ((sg) this).field_q[var4])) {
                                  break L7;
                                } else {
                                  stackOut_46_0 = var5;
                                  stackIn_49_0 = stackOut_46_0;
                                  break L6;
                                }
                              }
                            }
                            stackOut_48_0 = var4;
                            stackIn_49_0 = stackOut_48_0;
                            break L6;
                          }
                          var6 = stackIn_49_0;
                          ((sg) this).field_q[var3] = ((sg) this).field_q[var6];
                          ((sg) this).field_q[var6] = var1;
                          var3 = var6;
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L8: {
                      if (var5 >= ((sg) this).field_q.length) {
                        break L8;
                      } else {
                        if (!this.a(((sg) this).field_q[var5], var1)) {
                          break L8;
                        } else {
                          ((sg) this).field_q[var3] = ((sg) this).field_q[var5];
                          ((sg) this).field_q[var5] = var1;
                          var3 = var5;
                          break L4;
                        }
                      }
                    }
                    continue L1;
                  }
                  continue L3;
                }
              }
            }
          } else {
            L9: {
              if (((sg) this).field_x[var1]) {
                ((sg) this).field_p[var1] = -1;
                break L9;
              } else {
                this.e(var1);
                ((sg) this).field_p[var1] = ((sg) this).field_G[var1].length - 1;
                L10: while (true) {
                  if (((sg) this).field_p[var1] < 0) {
                    break L9;
                  } else {
                    if (((sg) this).field_G[var1][((sg) this).field_p[var1]] != -1) {
                      break L9;
                    } else {
                      ((sg) this).field_p[var1] = ((sg) this).field_p[var1] - 1;
                      continue L10;
                    }
                  }
                }
              }
            }
            L11: {
              stackOut_14_0 = ((sg) this).field_m;
              stackOut_14_1 = var1;
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              if (((sg) this).field_p[var1] != -1) {
                stackOut_17_0 = (int[]) (Object) stackIn_17_0;
                stackOut_17_1 = stackIn_17_1;
                stackOut_17_2 = this.b(var1, ((sg) this).field_G[var1][((sg) this).field_p[var1]]);
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                stackIn_18_2 = stackOut_17_2;
                break L11;
              } else {
                stackOut_15_0 = (int[]) (Object) stackIn_15_0;
                stackOut_15_1 = stackIn_15_1;
                stackOut_15_2 = -2147483648;
                stackIn_18_0 = stackOut_15_0;
                stackIn_18_1 = stackOut_15_1;
                stackIn_18_2 = stackOut_15_2;
                break L11;
              }
            }
            stackIn_18_0[stackIn_18_1] = stackIn_18_2;
            ((sg) this).field_q[var1] = var1;
            var2 = var1;
            var3 = (var1 - 1) / 2;
            L12: while (true) {
              L13: {
                if (var2 <= 0) {
                  break L13;
                } else {
                  if (!this.a(((sg) this).field_q[var2], ((sg) this).field_q[var3])) {
                    break L13;
                  } else {
                    var4 = ((sg) this).field_q[var2];
                    ((sg) this).field_q[var2] = ((sg) this).field_q[var3];
                    ((sg) this).field_q[var3] = var4;
                    var2 = var3;
                    var3 = (var3 - 1) / 2;
                    continue L12;
                  }
                }
              }
              var1++;
              continue L0;
            }
          }
        }
    }

    sg(int param0) {
        ((sg) this).field_y = param0;
        ((sg) this).field_g = new kh[param0];
        ((sg) this).field_F = new int[param0];
        ((sg) this).field_h = new int[param0];
        ((sg) this).field_i = new int[param0];
        ((sg) this).field_v = new int[param0][];
        ((sg) this).field_c = new int[param0][];
        ((sg) this).field_u = new int[param0][];
        ((sg) this).field_G = new int[param0][];
        ((sg) this).field_x = new boolean[param0];
        ((sg) this).field_D = null;
        ((sg) this).field_p = new int[param0];
        ((sg) this).field_m = new int[param0];
        ((sg) this).field_q = new int[param0];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new int[3];
        field_f = 1;
        field_r = new short[1024][4096];
        field_E = new int[1024];
        field_B = new short[768][1024];
        field_d = new int[3];
        field_z = new int[768];
        field_k = new int[3];
        field_t = new int[3];
        field_n = new int[3];
    }
}
