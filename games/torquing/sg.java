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
        field_b.field_k = (pj) ((Object) new rm(0, 0, 0).a(0, 0, 1, 0, 0));
    }

    final void a(int param0, int param1, int param2, int param3) {
        this.field_F[param0] = param1;
        this.field_h[param0] = param2;
        this.field_i[param0] = param3;
    }

    final void a(int param0, ti[] param1) {
        ti[] var3 = null;
        int var4 = 0;
        ti[] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        ti[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        ti[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        ti stackIn_7_2 = null;
        ti[] stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        ti[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        ti stackOut_6_2 = null;
        ti[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_5_2 = null;
        if (param1 != null) {
          var3 = new ti[param1.length];
          this.field_D = var3;
          var4 = 0;
          L0: while (true) {
            if (var4 >= param1.length) {
              return;
            } else {
              L1: {
                stackOut_4_0 = (ti[]) (var3);
                stackOut_4_1 = var4;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (param1[var4] != null) {
                  stackOut_6_0 = (ti[]) ((Object) stackIn_6_0);
                  stackOut_6_1 = stackIn_6_1;
                  stackOut_6_2 = param1[var4].c((byte) 90);
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  break L1;
                } else {
                  stackOut_5_0 = (ti[]) ((Object) stackIn_5_0);
                  stackOut_5_1 = stackIn_5_1;
                  stackOut_5_2 = null;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = (ti) ((Object) stackOut_5_2);
                  break L1;
                }
              }
              stackIn_7_0[stackIn_7_1] = stackIn_7_2;
              var4++;
              continue L0;
            }
          }
        } else {
          this.field_D[param0] = null;
          return;
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
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        ti stackIn_24_0 = null;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_46_2 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_49_2 = 0;
        int stackIn_56_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_59_0 = 0;
        short stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        short stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        ti stackOut_23_0 = null;
        Object stackOut_22_0 = null;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_40_2 = 0;
        int stackOut_43_0 = 0;
        int stackOut_43_1 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        int stackOut_45_2 = 0;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        int stackOut_44_2 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_48_2 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_47_2 = 0;
        int stackOut_55_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_57_1 = 0;
        int stackOut_56_0 = 0;
        int stackOut_56_1 = 0;
        int stackOut_58_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        L0: {
          var3 = this.field_g[param0].field_k;
          var4 = this.field_g[param0].field_q;
          if (var4.field_q != null) {
            stackOut_2_0 = var4.field_q[param1];
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = -1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (var3.field_l[param1] == -1) {
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 1;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_6_0;
          if (var3.field_z != null) {
            stackOut_8_0 = var3.field_z[param1];
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = -1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var7 = stackIn_9_0;
          var8 = var3.field_p[param1];
          var9 = var3.field_u[param1];
          var10 = var3.field_t[param1];
          field_k[0] = this.field_v[param0][var8];
          field_k[1] = this.field_v[param0][var9];
          field_k[2] = this.field_v[param0][var10];
          field_n[0] = this.field_c[param0][var8];
          field_n[1] = this.field_c[param0][var9];
          field_n[2] = this.field_c[param0][var10];
          field_d[0] = this.field_u[param0][var8];
          field_d[1] = this.field_u[param0][var9];
          field_d[2] = this.field_u[param0][var10];
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
            g.field_b[0] = this.field_v[param0][var14_int];
            g.field_b[1] = this.field_v[param0][var15];
            g.field_b[2] = this.field_v[param0][var16_int];
            g.field_c[0] = this.field_c[param0][var14_int];
            g.field_c[1] = this.field_c[param0][var15];
            g.field_c[2] = this.field_c[param0][var16_int];
            g.field_a[0] = this.field_u[param0][var14_int];
            g.field_a[1] = this.field_u[param0][var15];
            g.field_a[2] = this.field_u[param0][var16_int];
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
              if (this.field_D != null) {
                stackOut_23_0 = this.field_D[param1];
                stackIn_24_0 = stackOut_23_0;
                break L7;
              } else {
                break L8;
              }
            }
          }
          stackOut_22_0 = null;
          stackIn_24_0 = (ti) ((Object) stackOut_22_0);
          break L7;
        }
        L9: {
          var16_ref = stackIn_24_0;
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
                  this.field_D[param1] = null;
                  break L9;
                } else {
                  L12: {
                    stackOut_39_0 = var11;
                    stackOut_39_1 = 64;
                    stackIn_41_0 = stackOut_39_0;
                    stackIn_41_1 = stackOut_39_1;
                    stackIn_40_0 = stackOut_39_0;
                    stackIn_40_1 = stackOut_39_1;
                    if (var5 == -1) {
                      stackOut_41_0 = stackIn_41_0;
                      stackOut_41_1 = stackIn_41_1;
                      stackOut_41_2 = 0;
                      stackIn_42_0 = stackOut_41_0;
                      stackIn_42_1 = stackOut_41_1;
                      stackIn_42_2 = stackOut_41_2;
                      break L12;
                    } else {
                      stackOut_40_0 = stackIn_40_0;
                      stackOut_40_1 = stackIn_40_1;
                      stackOut_40_2 = 1;
                      stackIn_42_0 = stackOut_40_0;
                      stackIn_42_1 = stackOut_40_1;
                      stackIn_42_2 = stackOut_40_2;
                      break L12;
                    }
                  }
                  var11 = sg.a(stackIn_42_0, stackIn_42_1, stackIn_42_2 != 0);
                  if (var6 == 0) {
                    break L9;
                  } else {
                    L13: {
                      stackOut_43_0 = var12;
                      stackOut_43_1 = 64;
                      stackIn_45_0 = stackOut_43_0;
                      stackIn_45_1 = stackOut_43_1;
                      stackIn_44_0 = stackOut_43_0;
                      stackIn_44_1 = stackOut_43_1;
                      if (var5 == -1) {
                        stackOut_45_0 = stackIn_45_0;
                        stackOut_45_1 = stackIn_45_1;
                        stackOut_45_2 = 0;
                        stackIn_46_0 = stackOut_45_0;
                        stackIn_46_1 = stackOut_45_1;
                        stackIn_46_2 = stackOut_45_2;
                        break L13;
                      } else {
                        stackOut_44_0 = stackIn_44_0;
                        stackOut_44_1 = stackIn_44_1;
                        stackOut_44_2 = 1;
                        stackIn_46_0 = stackOut_44_0;
                        stackIn_46_1 = stackOut_44_1;
                        stackIn_46_2 = stackOut_44_2;
                        break L13;
                      }
                    }
                    L14: {
                      var12 = sg.a(stackIn_46_0, stackIn_46_1, stackIn_46_2 != 0);
                      stackOut_46_0 = var13;
                      stackOut_46_1 = 64;
                      stackIn_48_0 = stackOut_46_0;
                      stackIn_48_1 = stackOut_46_1;
                      stackIn_47_0 = stackOut_46_0;
                      stackIn_47_1 = stackOut_46_1;
                      if (var5 == -1) {
                        stackOut_48_0 = stackIn_48_0;
                        stackOut_48_1 = stackIn_48_1;
                        stackOut_48_2 = 0;
                        stackIn_49_0 = stackOut_48_0;
                        stackIn_49_1 = stackOut_48_1;
                        stackIn_49_2 = stackOut_48_2;
                        break L14;
                      } else {
                        stackOut_47_0 = stackIn_47_0;
                        stackOut_47_1 = stackIn_47_1;
                        stackOut_47_2 = 1;
                        stackIn_49_0 = stackOut_47_0;
                        stackIn_49_1 = stackOut_47_1;
                        stackIn_49_2 = stackOut_47_2;
                        break L14;
                      }
                    }
                    var13 = sg.a(stackIn_49_0, stackIn_49_1, stackIn_49_2 != 0);
                    break L9;
                  }
                }
              }
            }
            L15: {
              if (var5 != -1) {
                break L15;
              } else {
                if (var6 == 0) {
                  break L15;
                } else {
                  var5 = 0;
                  break L9;
                }
              }
            }
            L16: {
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
                      break L16;
                    } else {
                      g.a(field_k, field_n, field_d, new int[]{415, 415, 3680}, new int[]{415, 3680, 3680});
                      var5 = 0;
                      break L9;
                    }
                  }
                }
              }
              be.field_c = var16_ref.a(122, var7, var14);
              break L16;
            }
            var5 = 0;
            break L9;
          }
        }
        L18: {
          if (var5 != -1) {
            L19: {
              stackOut_55_0 = var5 << 2 | 2;
              stackIn_57_0 = stackOut_55_0;
              stackIn_56_0 = stackOut_55_0;
              if (var6 == 0) {
                stackOut_57_0 = stackIn_57_0;
                stackOut_57_1 = 1;
                stackIn_58_0 = stackOut_57_0;
                stackIn_58_1 = stackOut_57_1;
                break L19;
              } else {
                stackOut_56_0 = stackIn_56_0;
                stackOut_56_1 = 0;
                stackIn_58_0 = stackOut_56_0;
                stackIn_58_1 = stackOut_56_1;
                break L19;
              }
            }
            stackOut_58_0 = stackIn_58_0 | stackIn_58_1;
            stackIn_59_0 = stackOut_58_0;
            break L18;
          } else {
            if (var6 == 0) {
              stackOut_54_0 = 1;
              stackIn_59_0 = stackOut_54_0;
              break L18;
            } else {
              stackOut_53_0 = 0;
              stackIn_59_0 = stackOut_53_0;
              break L18;
            }
          }
        }
        var17 = stackIn_59_0;
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
                  var8 = field_a[0 + var11];
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
        pj var2 = this.field_g[0].field_k;
        int var3 = var2.field_p[param0];
        int var4 = var2.field_u[param0];
        int var5 = var2.field_t[param0];
        mp var6 = this.field_g[0].field_q;
        int[] var23 = var6.field_s[0];
        int[] var24 = var6.field_s[1];
        int[] var25 = var6.field_s[2];
        int[] var10 = new int[]{var23[var3], var23[var4], var23[var5]};
        int[] var11 = new int[]{var24[var3], var24[var4], var24[var5]};
        int[] var12 = new int[]{var25[var3], var25[var4], var25[var5]};
        int var13 = var6.field_u[param0];
        return new ti(var10, var11, var12, var13);
    }

    private final static int a(int param0, int param1, boolean param2) {
        if (param2) {
            return pj.a(param1);
        }
        return pj.a(param0, param1);
    }

    final void b(lm param0) {
        ti[] var2 = null;
        int var3 = 0;
        ti var4 = null;
        if (this.field_D == null) {
          return;
        } else {
          var2 = this.field_D;
          var3 = 0;
          L0: while (true) {
            if (var3 >= var2.length) {
              return;
            } else {
              var4 = var2[var3];
              if (var4 != null) {
                var4.a(param0, 2);
                var3++;
                continue L0;
              } else {
                var3++;
                continue L0;
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
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int[][] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        int[] var40 = null;
        int stackIn_3_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (field_f > 1) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        be.field_m = stackIn_3_0 != 0;
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
        this.field_A = 2147483647;
        this.field_j = 2147483647;
        this.field_C = -2147483648;
        var14_int = 0;
        L1: while (true) {
          if (var14_int >= this.field_g.length) {
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
            if (!this.field_x[var14_int]) {
              var15 = this.field_g[var14_int].field_k;
              var16 = var15.field_k;
              if (var16 != 0) {
                var37 = this.field_g[var14_int].field_q.field_s;
                var38 = var37[0];
                var39 = var37[1];
                var40 = var37[2];
                var21 = 0;
                L4: while (true) {
                  if (var21 < var16) {
                    var22 = this.field_F[var14_int] + var38[var21];
                    var23 = this.field_h[var14_int] + var39[var21];
                    var24 = this.field_i[var14_int] + var40[var21];
                    this.field_A = Math.min(var23, this.field_A);
                    this.field_v[var14_int][var21] = var2 + (var22 * var5 + var23 * var8 + var24 * var11 >> 16);
                    this.field_c[var14_int][var21] = var3 + (var22 * var6 + var23 * var9 + var24 * var12 >> 16);
                    var24 = var4 + (var22 * var7 + var23 * var10 + var24 * var13 >> 16);
                    this.field_u[var14_int][var21] = var24;
                    this.field_j = Math.min(var24, this.field_j);
                    this.field_C = Math.max(var24, this.field_C);
                    var21++;
                    continue L4;
                  } else {
                    var14_int++;
                    continue L1;
                  }
                }
              } else {
                var14_int++;
                continue L1;
              }
            } else {
              var14_int++;
              continue L1;
            }
          }
        }
    }

    private final static void a(int[] param0, int param1, int[] param2, int param3, int[] param4, int param5, int[] param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        int incrementValue$49 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (!ia.a(-22426, 0)) {
            stackOut_2_0 = 16711935;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 16744448;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var13 = stackIn_3_0;
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
                var16 = param1 * (param2[param7] & 255) + param3 * (param4[param7] & 255) + param5 * (param6[param7] & 255) >> 8;
                param7++;
                if (var16 == 0) {
                  param8++;
                  var15++;
                  continue L2;
                } else {
                  var17 = (var13 & 16711935) * var16;
                  var18 = (var17 & -16711936) + (var13 * var16 - var17 & 16711680) >>> 8;
                  var17 = param0[param8];
                  var19 = var18 + var17;
                  var18 = (var18 & 16711935) + (var17 & 16711935);
                  var17 = (var18 & 16777472) + (var19 - var18 & 65536);
                  incrementValue$49 = param8;
                  param8++;
                  param0[incrementValue$49] = var19 - var17 | var17 - (var17 >>> 8);
                  var15++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final void a(int param0, kh param1) {
        int[] array$5 = null;
        int[] array$6 = null;
        int[] array$7 = null;
        int[] array$8 = null;
        mp dupTemp$9 = null;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        int[] var5_array = null;
        mp var6 = null;
        mp var7 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          if (param1.field_k == null) {
            stackOut_2_0 = param1.field_l.field_f;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = param1.field_k.field_k;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var3 = stackIn_3_0;
          if (param1.field_k == null) {
            stackOut_5_0 = param1.field_l.field_g;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = param1.field_k.field_x;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var4 = stackIn_6_0;
          array$5 = new int[var3];
          this.field_v[param0] = array$5;
          array$6 = new int[var3];
          this.field_c[param0] = array$6;
          array$7 = new int[var3];
          this.field_u[param0] = array$7;
          array$8 = new int[var4];
          this.field_G[param0] = array$8;
          if (this.field_g[param0] == null) {
            var5_array = null;
            break L2;
          } else {
            var7 = this.field_g[param0].field_q;
            var7.field_r = var7.field_r - 1;
            var5_array = var7.field_t;
            break L2;
          }
        }
        L3: {
          this.field_g[param0] = param1;
          var6 = param1.field_q;
          if (var6 != null) {
            break L3;
          } else {
            dupTemp$9 = new mp();
            var6 = dupTemp$9;
            param1.field_q = dupTemp$9;
            break L3;
          }
        }
        L4: {
          var6.field_r = var6.field_r + 1;
          if (var5_array == null) {
            L5: {
              if (var6.field_s != null) {
                break L5;
              } else {
                var5_array = new int[]{0, 0, 0, 65535, 0, 0, 0, 65535, 0, 0, 0, 65535};
                break L5;
              }
            }
            if (var5_array == null) {
              break L4;
            } else {
              this.a(param1, var5_array);
              break L4;
            }
          } else {
            if (var5_array == null) {
              break L4;
            } else {
              this.a(param1, var5_array);
              break L4;
            }
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
        this.field_x[param0] = false;
        if (param0 != 0) {
          return;
        } else {
          this.field_D = null;
          return;
        }
    }

    final void d(int param0) {
        this.a(param0, field_b);
        this.field_x[param0] = true;
    }

    private final int b(int param0, int param1) {
        pj var3 = this.field_g[param0].field_k;
        int var4 = var3.field_p[param1];
        int var5 = var3.field_u[param1];
        int var6 = var3.field_t[param1];
        int var7 = this.field_u[param0][var4];
        int var8 = this.field_u[param0][var5];
        int var9 = this.field_u[param0][var6];
        return Math.max(Math.max(var7, var8), var9) - this.field_j;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (this.field_g[param0].field_k == null) {
            sg.a(this.field_g[param0], param1, param2, param3, param4, param5);
            return;
        }
    }

    final void a(lm param0) {
        pj var2 = null;
        mp var3 = null;
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
        int var26 = 0;
        int[] var45 = null;
        int[] var46 = null;
        int[] var47 = null;
        int[] var48 = null;
        int[] var49 = null;
        int[] var50 = null;
        boolean[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        boolean[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        boolean[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        boolean[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        boolean[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        boolean[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        L0: {
          var2 = this.field_g[0].field_k;
          var3 = this.field_g[0].field_q;
          var45 = var3.field_s[0];
          var47 = var3.field_s[1];
          var48 = var3.field_s[2];
          var46 = var2.field_p;
          var49 = var2.field_u;
          var50 = var2.field_t;
          var10 = var45.length;
          var11 = var46.length;
          if (this.field_D != null) {
            break L0;
          } else {
            this.field_D = new ti[var11];
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
            var26 = 0;
            var13 = var26;
            L4: while (true) {
              if (var26 >= var11) {
                return;
              } else {
                if (var2.field_l[var26] != -2) {
                  var14 = var46[var26];
                  var15 = var49[var26];
                  var16 = var50[var26];
                  var17 = var45[var14] - var45[var15];
                  var18 = var47[var14] - var47[var15];
                  var19 = var48[var14] - var48[var15];
                  var20 = var45[var16] - var45[var15];
                  var21 = var47[var16] - var47[var15];
                  var22 = var48[var16] - var48[var15];
                  var23 = var19 * var21 - var18 * var22;
                  var24 = var17 * var22 - var19 * var20;
                  var25 = var18 * var20 - var17 * var21;
                  if (var23 * -1 + var24 * -12 + var25 * 12 > 0) {
                    L5: {
                      if (param0.a()) {
                        break L5;
                      } else {
                        L6: {
                          if (var12[var14]) {
                            break L6;
                          } else {
                            if (var12[var15]) {
                              break L6;
                            } else {
                              if (!var12[var16]) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        L7: {
                          if (this.field_D[var26] != null) {
                            break L7;
                          } else {
                            this.field_D[var26] = this.b(var26);
                            break L7;
                          }
                        }
                        this.field_D[var26].a(true, param0);
                        var26++;
                        continue L4;
                      }
                    }
                    if (param0.a(var45[var14], var47[var14], var48[var14], var45[var15], var47[var15], var48[var15], var45[var16], var47[var16], var48[var16], var23, var24, var25)) {
                      L8: {
                        if (this.field_D[var26] != null) {
                          break L8;
                        } else {
                          this.field_D[var26] = this.b(var26);
                          break L8;
                        }
                      }
                      this.field_D[var26].a(true, param0);
                      var26++;
                      continue L4;
                    } else {
                      var26++;
                      continue L4;
                    }
                  } else {
                    var26++;
                    continue L4;
                  }
                } else {
                  var26++;
                  continue L4;
                }
              }
            }
          } else {
            L9: {
              stackOut_8_0 = (boolean[]) (var12);
              stackOut_8_1 = var13;
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              if (param0.a(var45[var13], var47[var13], var48[var13]) != 2) {
                stackOut_10_0 = (boolean[]) ((Object) stackIn_10_0);
                stackOut_10_1 = stackIn_10_1;
                stackOut_10_2 = 0;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                stackIn_11_2 = stackOut_10_2;
                break L9;
              } else {
                stackOut_9_0 = (boolean[]) ((Object) stackIn_9_0);
                stackOut_9_1 = stackIn_9_1;
                stackOut_9_2 = 1;
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_11_2 = stackOut_9_2;
                break L9;
              }
            }
            stackIn_11_0[stackIn_11_1] = stackIn_11_2 != 0;
            var13++;
            continue L3;
          }
        }
    }

    final ti[] a(int param0) {
        int var4 = 0;
        ti[] var2 = this.field_D;
        if (var2 == null) {
            return null;
        }
        ti[] var3 = new ti[var2.length];
        for (var4 = 0; var4 < var3.length; var4++) {
            var3[var4] = var2[var4] == null ? null : var2[var4].c((byte) 56);
        }
        return var3;
    }

    private final boolean a(int param0, pj param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
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
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        if (param1.field_l[param2] != -2) {
          var4 = param1.field_p[param2];
          var5 = param1.field_u[param2];
          var6 = param1.field_t[param2];
          if (var4 != var5) {
            L0: {
              var32 = this.field_v[param0];
              var33 = this.field_c[param0];
              var31 = this.field_u[param0];
              field_t[0] = -5000;
              field_t[1] = -5000;
              field_t[2] = -5000;
              var10 = var31[var4];
              if (var10 < 50) {
                break L0;
              } else {
                field_t[0] = be.field_g + (var32[var4] << 9) / var10;
                field_l[0] = be.field_b + (var33[var4] << 9) / var10;
                break L0;
              }
            }
            L1: {
              var11 = var31[var5];
              if (var11 < 50) {
                break L1;
              } else {
                field_t[1] = be.field_g + (var32[var5] << 9) / var11;
                field_l[1] = be.field_b + (var33[var5] << 9) / var11;
                break L1;
              }
            }
            L2: {
              var12 = var31[var6];
              if (var12 < 50) {
                break L2;
              } else {
                field_t[2] = be.field_g + (var32[var6] << 9) / var12;
                field_l[2] = be.field_b + (var33[var6] << 9) / var12;
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
                                if (this.field_D == null) {
                                  break L6;
                                } else {
                                  this.field_D[param2] = null;
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
              var13 = var32[var4];
              var14 = var32[var5];
              var15 = var32[var6];
              var16 = var33[var4];
              var17 = var33[var5];
              var18 = var33[var6];
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
                      if (this.field_D == null) {
                        return false;
                      } else {
                        this.field_D[param2] = null;
                        return false;
                      }
                    }
                  }
                }
                return true;
              }
            }
            L8: {
              if (field_t[0] == -5000) {
                break L8;
              } else {
                if (field_t[1] == -5000) {
                  break L8;
                } else {
                  if (field_t[2] == -5000) {
                    break L8;
                  } else {
                    L9: {
                      L10: {
                        if (field_t[0] >= 0) {
                          break L10;
                        } else {
                          if (field_t[1] >= 0) {
                            break L10;
                          } else {
                            if (field_t[2] < 0) {
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                      L11: {
                        if (field_t[0] <= be.field_p) {
                          break L11;
                        } else {
                          if (field_t[1] <= be.field_p) {
                            break L11;
                          } else {
                            if (field_t[2] > be.field_p) {
                              break L9;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                      L12: {
                        if (field_l[0] >= 0) {
                          break L12;
                        } else {
                          if (field_l[1] >= 0) {
                            break L12;
                          } else {
                            if (field_l[2] < 0) {
                              break L9;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                      if (field_l[0] <= be.field_f) {
                        break L8;
                      } else {
                        if (field_l[1] <= be.field_f) {
                          break L8;
                        } else {
                          if (field_l[2] <= be.field_f) {
                            break L8;
                          } else {
                            break L9;
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
            L13: {
              L14: {
                if (var4 == var6) {
                  break L14;
                } else {
                  if (this.field_u[param0][var4] >= 50) {
                    break L14;
                  } else {
                    if (this.field_u[param0][var6] >= 50) {
                      break L14;
                    } else {
                      stackOut_6_0 = 1;
                      stackIn_8_0 = stackOut_6_0;
                      break L13;
                    }
                  }
                }
              }
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L13;
            }
            return stackIn_8_0 != 0;
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
        if (var10 <= 0) {
          return;
        } else {
          if (var9 > 0) {
            var13 = param0 + param1 * ph.field_j;
            sg.a(ph.field_e, param2, param3.field_y, param4, param5.field_y, param6, param7.field_y, var8, var13, var10, var9, var11, var12);
            return;
          } else {
            return;
          }
        }
    }

    final void a(kh param0, int[] param1) {
        mp var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        if (param0.field_l != null) {
          var3 = param0.field_q;
          if (var3 == null) {
            return;
          } else {
            if (var3.field_r > 0) {
              var4 = 0;
              L0: while (true) {
                if (var4 >= 3) {
                  L1: {
                    if (var3.field_t != null) {
                      var4 = 1;
                      var5 = 3;
                      L2: while (true) {
                        if (var5 >= 12) {
                          if (var4 == 0) {
                            break L1;
                          } else {
                            return;
                          }
                        } else {
                          if (var3.field_t[var5] != param1[var5]) {
                            var4 = 0;
                            var5++;
                            continue L2;
                          } else {
                            var5++;
                            continue L2;
                          }
                        }
                      }
                    } else {
                      var3.field_t = new int[12];
                      break L1;
                    }
                  }
                  var4 = 3;
                  L3: while (true) {
                    if (var4 >= 12) {
                      L4: {
                        var4 = param0.field_l.field_f;
                        var24 = param0.field_l.field_M;
                        var25 = param0.field_l.field_B;
                        var26 = param0.field_l.field_E;
                        if (var3.field_s != null) {
                          break L4;
                        } else {
                          var3.field_s = new int[][]{new int[var4], new int[var4], new int[var4]};
                          break L4;
                        }
                      }
                      var8 = var3.field_s[0];
                      var9 = var3.field_s[1];
                      var10 = var3.field_s[2];
                      var11 = 0;
                      L5: while (true) {
                        if (var11 >= var4) {
                          var3.field_v = null;
                          return;
                        } else {
                          var12 = var24[var11];
                          var13 = var25[var11];
                          var14 = var26[var11];
                          var8[var11] = var12 * param1[3] + var13 * param1[6] + var14 * param1[9] >> 16;
                          var9[var11] = var12 * param1[4] + var13 * param1[7] + var14 * param1[10] >> 16;
                          var10[var11] = var12 * param1[5] + var13 * param1[8] + var14 * param1[11] >> 16;
                          var11++;
                          continue L5;
                        }
                      }
                    } else {
                      var3.field_t[var4] = param1[var4];
                      var4++;
                      continue L3;
                    }
                  }
                } else {
                  var5 = -1;
                  var6 = 0;
                  L6: while (true) {
                    if (var6 >= 3) {
                      if (var5 >= 0) {
                        param1[3 * var5 + var4 + 3] = 65536;
                        var4++;
                        continue L0;
                      } else {
                        var4++;
                        continue L0;
                      }
                    } else {
                      if (param1[3 * var6 + var4 + 3] != 65535) {
                        if (param1[3 * var6 + var4 + 3] != 0) {
                          var5 -= 6;
                          var6++;
                          continue L6;
                        } else {
                          var6++;
                          continue L6;
                        }
                      } else {
                        var5 = var5 + (var6 + 1);
                        var6++;
                        continue L6;
                      }
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    public static void a() {
        field_e = null;
        field_a = null;
        field_E = null;
        field_r = (short[][]) null;
        field_z = null;
        field_B = (short[][]) null;
        field_k = null;
        field_n = null;
        field_d = null;
        field_t = null;
        field_l = null;
        field_b = null;
        field_w = null;
    }

    private final void e(int param0) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
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
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        var2_int = 0;
        L0: while (true) {
          if (var2_int >= 1024) {
            var2 = this.field_g[param0].field_k;
            var3 = var2.field_x;
            var4_int = 0;
            L1: while (true) {
              if (var4_int >= var3) {
                var12 = this.field_G[param0];
                var11 = var12;
                var4 = var11;
                var5 = 0;
                var6 = 0;
                L2: while (true) {
                  if (var6 >= 1024) {
                    L3: while (true) {
                      if (var5 >= var12.length) {
                        return;
                      } else {
                        incrementValue$2 = var5;
                        var5++;
                        var4[incrementValue$2] = -1;
                        continue L3;
                      }
                    }
                  } else {
                    if (field_E[var6] != 0) {
                      var7 = 0;
                      L4: while (true) {
                        if (var7 >= 768) {
                          var7 = 0;
                          L5: while (true) {
                            if (var7 >= field_E[var6]) {
                              var7 = 0;
                              L6: while (true) {
                                if (var7 < 768) {
                                  var10 = 0;
                                  var8 = var10;
                                  L7: while (true) {
                                    if (var10 >= field_z[var7]) {
                                      var7++;
                                      continue L6;
                                    } else {
                                      incrementValue$3 = var5;
                                      var5++;
                                      var4[incrementValue$3] = field_B[var7][var10];
                                      var10++;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  var6++;
                                  continue L2;
                                }
                              }
                            } else {
                              var8 = field_r[var6][var7];
                              var9 = this.b(param0, var8);
                              field_z[var9 % 768] = field_z[var9 % 768] + 1;
                              field_B[var9 % 768][field_z[var9 % 768]] = (short)var8;
                              var7++;
                              continue L5;
                            }
                          }
                        } else {
                          field_z[var7] = 0;
                          var7++;
                          continue L4;
                        }
                      }
                    } else {
                      var6++;
                      continue L2;
                    }
                  }
                }
              } else {
                L8: {
                  if (this.a(param0, var2, var4_int)) {
                    break L8;
                  } else {
                    var5 = this.b(param0, var4_int);
                    field_E[var5 / 768] = field_E[var5 / 768] + 1;
                    field_r[var5 / 768][field_E[var5 / 768]] = (short) var4_int;
                    break L8;
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
        return this.field_m[param0] > this.field_m[param1];
    }

    private final static int[] a(short[] param0) {
        int var2 = 0;
        int[] var1 = new int[param0.length];
        for (var2 = 0; var2 < var1.length; var2++) {
            var1[var2] = param0[var2] & 65535;
        }
        return var1;
    }

    private final void a(kh param0) {
        mp var2 = null;
        int var3 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int var10 = 0;
        if (param0.field_k != null) {
            if (param0.field_k.field_k == 0) {
                return;
            }
            var2 = param0.field_q;
            if (var2 != null) {
                if (var2.field_r <= 0) {
                    return;
                }
                var3 = param0.field_k.field_k;
                var20 = param0.field_k.field_j;
                var21 = param0.field_k.field_y;
                var22 = param0.field_k.field_v;
                if (var2.field_s == null) {
                    var2.field_s = new int[][]{new int[var3], new int[var3], new int[var3]};
                }
                var7 = var2.field_s[0];
                var8 = var2.field_s[1];
                var9 = var2.field_s[2];
                for (var10 = 0; var10 < var3; var10++) {
                    var7[var10] = var20[var10];
                    var8[var10] = var21[var10];
                    var9[var10] = var22[var10];
                }
                var2.field_v = null;
                return;
            }
        }
    }

    final static void a(kh param0, int param1, int param2, int param3, int param4, int param5) {
        dd dupTemp$3 = null;
        dd dupTemp$4 = null;
        dd dupTemp$5 = null;
        rm var6 = null;
        mp var7 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        pj var15 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
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
        pj var39 = null;
        dd var43 = null;
        dd var44 = null;
        dd var45 = null;
        int[] var56 = null;
        int[] var57 = null;
        int[] var58 = null;
        int[] var59 = null;
        int[] var60 = null;
        int[] var61 = null;
        int stackIn_55_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_50_0 = 0;
        var6 = param0.field_l;
        if (var6 == null) {
          return;
        } else {
          if (var6.field_f != 0) {
            var7 = param0.field_q;
            if (var7.field_r > 0) {
              L0: {
                if (var7.field_v != null) {
                  var56 = var7.field_v;
                  if (var56[0] != param1) {
                    break L0;
                  } else {
                    if (var56[1] != param2) {
                      break L0;
                    } else {
                      if (var56[2] != param3) {
                        break L0;
                      } else {
                        if (var56[3] != param4) {
                          break L0;
                        } else {
                          if (var56[4] != param5) {
                            break L0;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  }
                } else {
                  var7.field_v = new int[5];
                  break L0;
                }
              }
              L1: {
                var57 = var7.field_v;
                var57[0] = param1;
                var57[1] = param2;
                var57[2] = param3;
                var57[3] = param4;
                var57[4] = param5;
                var58 = var7.field_t;
                var10 = param3;
                var11 = param4;
                param3 = var58[3] * var10 + var58[4] * var11 + var58[5] * param5 >> 16;
                param4 = var58[6] * var10 + var58[7] * var11 + var58[8] * param5 >> 16;
                param5 = var58[9] * var10 + var58[10] * var11 + var58[11] * param5 >> 16;
                var12 = (int)Math.sqrt((double)(param3 * param3 + param4 * param4 + param5 * param5));
                var13 = param2 * var12 >> 8;
                var14 = var6.field_o.length;
                if (param0.field_k != null) {
                  var15 = param0.field_k;
                  break L1;
                } else {
                  L2: {
                    var39 = new pj(new pj[]{}, 0);
                    var15 = var39;
                    var39.field_k = var6.field_f;
                    var39.field_x = var6.field_g;
                    var39.field_m = var6.field_k;
                    var39.field_j = var6.field_M;
                    var39.field_y = var6.field_B;
                    var39.field_v = var6.field_E;
                    var39.field_p = var6.field_o;
                    var39.field_u = var6.field_y;
                    var39.field_t = var6.field_q;
                    if (var6.field_u == null) {
                      break L2;
                    } else {
                      var39.field_h = sg.a(var6.field_u);
                      var39.field_g = sg.a(var6.field_n);
                      var39.field_i = sg.a(var6.field_x);
                      break L2;
                    }
                  }
                  var39.field_F = var6.field_D;
                  var39.field_z = var6.field_A;
                  param0.field_k = var39;
                  break L1;
                }
              }
              L3: {
                L4: {
                  if (var15.field_f == null) {
                    break L4;
                  } else {
                    if (var15.field_f.length >= var14) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                var15.field_f = new int[var14];
                var15.field_s = new int[var14];
                var15.field_l = new int[var14];
                break L3;
              }
              L5: {
                var59 = var6.field_M;
                var60 = var6.field_B;
                var61 = var6.field_E;
                var19 = var6.field_f;
                if (var6.field_l != null) {
                  break L5;
                } else {
                  var6.field_l = new dd[var19];
                  var20 = 0;
                  L6: while (true) {
                    if (var20 >= var14) {
                      break L5;
                    } else {
                      L7: {
                        if (var6.field_j == null) {
                          break L7;
                        } else {
                          if (var6.field_j[var20] == 0) {
                            break L7;
                          } else {
                            var20++;
                            continue L6;
                          }
                        }
                      }
                      var21 = var6.field_o[var20];
                      var22 = var6.field_y[var20];
                      var23 = var6.field_q[var20];
                      var24 = var59[var22] - var59[var21];
                      var25 = var60[var22] - var60[var21];
                      var26 = var61[var22] - var61[var21];
                      var27 = var59[var23] - var59[var21];
                      var28 = var60[var23] - var60[var21];
                      var29 = var61[var23] - var61[var21];
                      var30 = var25 * var29 - var28 * var26;
                      var31 = var26 * var27 - var29 * var24;
                      var32 = var24 * var28 - var27 * var25;
                      L8: while (true) {
                        L9: {
                          if (var30 > 8192) {
                            break L9;
                          } else {
                            if (var31 > 8192) {
                              break L9;
                            } else {
                              if (var32 > 8192) {
                                break L9;
                              } else {
                                if (var30 < -8192) {
                                  break L9;
                                } else {
                                  if (var31 < -8192) {
                                    break L9;
                                  } else {
                                    if (var32 >= -8192) {
                                      L10: {
                                        var33 = (int)Math.sqrt((double)(var30 * var30 + var31 * var31 + var32 * var32));
                                        if (var33 > 0) {
                                          break L10;
                                        } else {
                                          var33 = 1;
                                          break L10;
                                        }
                                      }
                                      L11: {
                                        var30 = var30 * 256 / var33;
                                        var31 = var31 * 256 / var33;
                                        var32 = var32 * 256 / var33;
                                        var34_ref_dd = var6.field_l[var21];
                                        if (var34_ref_dd != null) {
                                          break L11;
                                        } else {
                                          dupTemp$3 = new dd();
                                          var6.field_l[var21] = dupTemp$3;
                                          var34_ref_dd = dupTemp$3;
                                          break L11;
                                        }
                                      }
                                      L12: {
                                        var34_ref_dd.field_g = var34_ref_dd.field_g + var30;
                                        var34_ref_dd.field_a = var34_ref_dd.field_a + var31;
                                        var34_ref_dd.field_h = var34_ref_dd.field_h + var32;
                                        var34_ref_dd.field_f = var34_ref_dd.field_f + 1;
                                        var34_ref_dd = var6.field_l[var22];
                                        if (var34_ref_dd != null) {
                                          break L12;
                                        } else {
                                          dupTemp$4 = new dd();
                                          var6.field_l[var22] = dupTemp$4;
                                          var34_ref_dd = dupTemp$4;
                                          break L12;
                                        }
                                      }
                                      L13: {
                                        var34_ref_dd.field_g = var34_ref_dd.field_g + var30;
                                        var34_ref_dd.field_a = var34_ref_dd.field_a + var31;
                                        var34_ref_dd.field_h = var34_ref_dd.field_h + var32;
                                        var34_ref_dd.field_f = var34_ref_dd.field_f + 1;
                                        var34_ref_dd = var6.field_l[var23];
                                        if (var34_ref_dd != null) {
                                          break L13;
                                        } else {
                                          dupTemp$5 = new dd();
                                          var6.field_l[var23] = dupTemp$5;
                                          var34_ref_dd = dupTemp$5;
                                          break L13;
                                        }
                                      }
                                      var34_ref_dd.field_g = var34_ref_dd.field_g + var30;
                                      var34_ref_dd.field_a = var34_ref_dd.field_a + var31;
                                      var34_ref_dd.field_h = var34_ref_dd.field_h + var32;
                                      var34_ref_dd.field_f = var34_ref_dd.field_f + 1;
                                      var20++;
                                      continue L6;
                                    } else {
                                      break L9;
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
                        continue L8;
                      }
                    }
                  }
                }
              }
              var20 = 0;
              L14: while (true) {
                if (var20 >= var14) {
                  return;
                } else {
                  L15: {
                    var21 = var6.field_o[var20];
                    var22 = var6.field_y[var20];
                    var23 = var6.field_q[var20];
                    if (var6.field_D != null) {
                      if (var6.field_D[var20] != -1) {
                        stackOut_53_0 = 1;
                        stackIn_55_0 = stackOut_53_0;
                        break L15;
                      } else {
                        stackOut_52_0 = 0;
                        stackIn_55_0 = stackOut_52_0;
                        break L15;
                      }
                    } else {
                      stackOut_50_0 = 0;
                      stackIn_55_0 = stackOut_50_0;
                      break L15;
                    }
                  }
                  L16: {
                    var24 = stackIn_55_0;
                    if (var6.field_j == null) {
                      break L16;
                    } else {
                      if (var6.field_j[var20] != 0) {
                        if (var6.field_j[var20] != 1) {
                          var15.field_l[var20] = -2;
                          var20++;
                          continue L14;
                        } else {
                          var25 = var59[var22] - var59[var21];
                          var26 = var60[var22] - var60[var21];
                          var27 = var61[var22] - var61[var21];
                          var28 = var59[var23] - var59[var21];
                          var29 = var60[var23] - var60[var21];
                          var30 = var61[var23] - var61[var21];
                          var31 = var26 * var30 - var29 * var27;
                          var32 = var27 * var28 - var30 * var25;
                          var33 = var25 * var29 - var28 * var26;
                          L17: while (true) {
                            L18: {
                              if (var31 > 8192) {
                                break L18;
                              } else {
                                if (var32 > 8192) {
                                  break L18;
                                } else {
                                  if (var33 > 8192) {
                                    break L18;
                                  } else {
                                    if (var31 < -8192) {
                                      break L18;
                                    } else {
                                      if (var32 < -8192) {
                                        break L18;
                                      } else {
                                        if (var33 >= -8192) {
                                          L19: {
                                            var34 = (int)Math.sqrt((double)(var31 * var31 + var32 * var32 + var33 * var33));
                                            if (var34 > 0) {
                                              break L19;
                                            } else {
                                              var34 = 1;
                                              break L19;
                                            }
                                          }
                                          var31 = var31 * 256 / var34;
                                          var32 = var32 * 256 / var34;
                                          var33 = var33 * 256 / var34;
                                          var35 = param1 + (param3 * var31 + param4 * var32 + param5 * var33) / (var13 + var13 / 2);
                                          var15.field_f[var20] = sg.a((int) var6.field_m[var20], var35, var24 != 0);
                                          var15.field_l[var20] = -1;
                                          var20++;
                                          continue L14;
                                        } else {
                                          break L18;
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
                            continue L17;
                          }
                        }
                      } else {
                        break L16;
                      }
                    }
                  }
                  L20: {
                    var27 = var6.field_m[var20];
                    if (var13 == 0) {
                      break L20;
                    } else {
                      if (var6.field_l[var21].field_f != 0) {
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                  }
                  L21: {
                    var43 = var6.field_l[var21];
                    var26 = param1 + (param3 * var43.field_g + param4 * var43.field_a + param5 * var43.field_h) / (var13 * var43.field_f);
                    var15.field_f[var20] = sg.a(var27, var26, var24 != 0);
                    if (var6.field_l[var22].field_f != 0) {
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L22: {
                    var44 = var6.field_l[var22];
                    var26 = param1 + (param3 * var44.field_g + param4 * var44.field_a + param5 * var44.field_h) / (var13 * var44.field_f);
                    var15.field_s[var20] = sg.a(var27, var26, var24 != 0);
                    if (var6.field_l[var23].field_f != 0) {
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                  var45 = var6.field_l[var23];
                  var26 = param1 + (param3 * var45.field_g + param4 * var45.field_a + param5 * var45.field_h) / (var13 * var45.field_f);
                  var15.field_l[var20] = sg.a(var27, var26, var24 != 0);
                  var20++;
                  continue L14;
                }
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    private final void b() {
        int dupTemp$1 = 0;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int[] stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        int stackIn_35_0 = 0;
        int[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int[] stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        int[] stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        int stackOut_33_0 = 0;
        int stackOut_34_0 = 0;
        int[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        var1 = 0;
        L0: while (true) {
          if (var1 >= this.field_g.length) {
            L1: while (true) {
              if (this.field_m[this.field_q[0]] == -2147483648) {
                return;
              } else {
                L2: {
                  var1 = this.field_q[0];
                  var2 = this.field_G[var1][this.field_p[var1]];
                  this.c(var1, var2);
                  this.field_p[var1] = this.field_p[var1] - 1;
                  stackOut_19_0 = this.field_m;
                  stackOut_19_1 = var1;
                  stackIn_21_0 = stackOut_19_0;
                  stackIn_21_1 = stackOut_19_1;
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  if (this.field_p[var1] <= 0) {
                    stackOut_21_0 = (int[]) ((Object) stackIn_21_0);
                    stackOut_21_1 = stackIn_21_1;
                    stackOut_21_2 = -2147483648;
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    stackIn_22_2 = stackOut_21_2;
                    break L2;
                  } else {
                    dupTemp$1 = this.b(var1, this.field_G[var1][this.field_p[var1]]);
                    this.field_m[var1] = dupTemp$1;
                    stackOut_20_0 = (int[]) ((Object) stackIn_20_0);
                    stackOut_20_1 = stackIn_20_1;
                    stackOut_20_2 = dupTemp$1;
                    stackIn_22_0 = stackOut_20_0;
                    stackIn_22_1 = stackOut_20_1;
                    stackIn_22_2 = stackOut_20_2;
                    break L2;
                  }
                }
                stackIn_22_0[stackIn_22_1] = stackIn_22_2;
                var3 = 0;
                L3: while (true) {
                  var4 = 2 * var3 + 1;
                  var5 = var4 + 1;
                  if (var4 >= this.field_q.length) {
                    if (var5 >= this.field_q.length) {
                      continue L1;
                    } else {
                      if (!this.a(this.field_q[var5], var1)) {
                        continue L1;
                      } else {
                        this.field_q[var3] = this.field_q[var5];
                        this.field_q[var5] = var1;
                        var3 = var5;
                        continue L3;
                      }
                    }
                  } else {
                    if (!this.a(var1, this.field_q[var4])) {
                      L4: {
                        L5: {
                          if (var5 >= this.field_q.length) {
                            break L5;
                          } else {
                            if (!this.a(this.field_q[var5], this.field_q[var4])) {
                              break L5;
                            } else {
                              stackOut_33_0 = var5;
                              stackIn_35_0 = stackOut_33_0;
                              break L4;
                            }
                          }
                        }
                        stackOut_34_0 = var4;
                        stackIn_35_0 = stackOut_34_0;
                        break L4;
                      }
                      var6 = stackIn_35_0;
                      this.field_q[var3] = this.field_q[var6];
                      this.field_q[var6] = var1;
                      var3 = var6;
                      continue L3;
                    } else {
                      if (var5 >= this.field_q.length) {
                        continue L1;
                      } else {
                        if (!this.a(this.field_q[var5], var1)) {
                          continue L1;
                        } else {
                          this.field_q[var3] = this.field_q[var5];
                          this.field_q[var5] = var1;
                          var3 = var5;
                          continue L3;
                        }
                      }
                    }
                  }
                }
              }
            }
          } else {
            L6: {
              if (this.field_x[var1]) {
                this.field_p[var1] = -1;
                break L6;
              } else {
                this.e(var1);
                this.field_p[var1] = this.field_G[var1].length - 1;
                L7: while (true) {
                  if (this.field_p[var1] < 0) {
                    break L6;
                  } else {
                    if (this.field_G[var1][this.field_p[var1]] != -1) {
                      break L6;
                    } else {
                      this.field_p[var1] = this.field_p[var1] - 1;
                      continue L7;
                    }
                  }
                }
              }
            }
            L8: {
              stackOut_8_0 = this.field_m;
              stackOut_8_1 = var1;
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              if (this.field_p[var1] != -1) {
                stackOut_10_0 = (int[]) ((Object) stackIn_10_0);
                stackOut_10_1 = stackIn_10_1;
                stackOut_10_2 = this.b(var1, this.field_G[var1][this.field_p[var1]]);
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                stackIn_11_2 = stackOut_10_2;
                break L8;
              } else {
                stackOut_9_0 = (int[]) ((Object) stackIn_9_0);
                stackOut_9_1 = stackIn_9_1;
                stackOut_9_2 = -2147483648;
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_11_2 = stackOut_9_2;
                break L8;
              }
            }
            stackIn_11_0[stackIn_11_1] = stackIn_11_2;
            this.field_q[var1] = var1;
            var2 = var1;
            var3 = (var1 - 1) / 2;
            L9: while (true) {
              if (var2 > 0) {
                if (this.a(this.field_q[var2], this.field_q[var3])) {
                  var4 = this.field_q[var2];
                  this.field_q[var2] = this.field_q[var3];
                  this.field_q[var3] = var4;
                  var2 = var3;
                  var3 = (var3 - 1) / 2;
                  continue L9;
                } else {
                  var1++;
                  continue L0;
                }
              } else {
                var1++;
                continue L0;
              }
            }
          }
        }
    }

    sg(int param0) {
        this.field_y = param0;
        this.field_g = new kh[param0];
        this.field_F = new int[param0];
        this.field_h = new int[param0];
        this.field_i = new int[param0];
        this.field_v = new int[param0][];
        this.field_c = new int[param0][];
        this.field_u = new int[param0][];
        this.field_G = new int[param0][];
        this.field_x = new boolean[param0];
        this.field_D = null;
        this.field_p = new int[param0];
        this.field_m = new int[param0];
        this.field_q = new int[param0];
    }

    static {
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
