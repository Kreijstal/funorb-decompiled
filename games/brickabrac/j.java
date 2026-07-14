/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class j extends nm {
    vl field_eb;
    int field_F;
    int[] field_vb;
    static String[][] field_jb;
    int field_db;
    int field_bb;
    int field_j;
    vl field_nb;
    int field_rb;
    int field_ob;
    int field_I;
    int field_q;
    private ao field_Y;
    vo field_yb;
    vl field_K;
    vl field_gb;
    vl field_x;
    int field_A;
    vl field_pb;
    vl field_C;
    ao field_kb;
    int field_N;
    kq field_ab;
    int field_X;
    int field_hb;
    vl[] field_z;
    vl field_v;
    int field_qb;
    int field_u;
    private int field_W;
    int field_m;
    int field_ub;
    int field_Q;
    int field_L;
    int field_P;
    byte[] field_o;
    int field_Z;
    private int field_sb;
    int field_G;
    private Random field_B;
    int field_mb;
    private fo field_s;
    private int field_T;
    int field_wb;
    int field_J;
    boolean field_tb;
    int field_p;
    int field_H;
    int field_k;
    int field_i;
    private on[] field_O;
    lj field_D;
    int field_S;
    int field_r;
    int field_E;
    String field_lb;
    int[] field_cb;
    int field_ib;
    int field_U;
    lj field_w;
    int field_R;
    int field_y;
    int field_t;
    int field_n;
    int field_l;
    int field_M;
    String field_fb;
    int[] field_xb;
    int field_V;
    int field_zb;

    final void a(vl param0, int param1, vl[] param2) {
        int var4 = 0;
        int var5 = 0;
        Object var7 = null;
        on var7_ref = null;
        int var8 = 0;
        vl var9 = null;
        vl var10 = null;
        vl var10_ref = null;
        var7 = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        ((j) this).field_S = 0;
        ((j) this).field_z = param2;
        ((j) this).field_L = 0;
        ((j) this).field_v = param0;
        if (((j) this).field_z != null) {
          L0: {
            if (((j) this).field_v == null) {
              break L0;
            } else {
              cg.a(((j) this).field_z, (byte) 35, ((j) this).field_v, true);
              break L0;
            }
          }
          if (param1 == 9) {
            var4 = 0;
            var5 = 0;
            L1: while (true) {
              if (var5 >= ((j) this).field_z.length) {
                ((j) this).field_O = new on[var4];
                var4 = 0;
                var5 = 0;
                L2: while (true) {
                  if (((j) this).field_z.length <= var5) {
                    return;
                  } else {
                    var10_ref = ((j) this).field_z[var5];
                    var7_ref = (on) (Object) var10_ref.d(-37);
                    L3: while (true) {
                      if (var7_ref == null) {
                        var5++;
                        continue L2;
                      } else {
                        L4: {
                          if ((var7_ref.field_i ^ -1) == -29) {
                            var4++;
                            var7_ref.field_H = var4;
                            ((j) this).field_O[var7_ref.field_H] = (on) (Object) param2;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var7_ref = (on) (Object) var10_ref.a((byte) 116);
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var9 = ((j) this).field_z[var5];
                var10 = var9;
                var10 = var9;
                var7_ref = (on) (Object) var9.d(-94);
                L5: while (true) {
                  if (var7_ref == null) {
                    var5++;
                    continue L1;
                  } else {
                    L6: {
                      L7: {
                        if (-2 == var7_ref.field_i) {
                          break L7;
                        } else {
                          if (-26 == var7_ref.field_i) {
                            break L7;
                          } else {
                            if (-29 != (var7_ref.field_i ^ -1)) {
                              L8: {
                                if ((var7_ref.field_N & 2) == 0) {
                                  break L8;
                                } else {
                                  ((j) this).field_S = ((j) this).field_S | 1 << var7_ref.field_i;
                                  break L8;
                                }
                              }
                              L9: {
                                if (var7_ref.field_i != 0) {
                                  break L9;
                                } else {
                                  if (2 == var7_ref.field_R) {
                                    break L6;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              ((j) this).field_L = ((j) this).field_L + 1;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      if (var7_ref.field_i != 28) {
                        break L6;
                      } else {
                        var4++;
                        break L6;
                      }
                    }
                    var7_ref = (on) (Object) var9.a((byte) 116);
                    continue L5;
                  }
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private final lj g(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        vn var5 = null;
        int var6 = 0;
        L0: {
          var6 = BrickABrac.field_J ? 1 : 0;
          var2 = this.a(3, 96, 25);
          if (var2 == -1) {
            break L0;
          } else {
            if (var2 > ((j) this).field_yb.field_w) {
              return new lj(3);
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (((j) this).field_yb.field_w <= 0) {
            break L1;
          } else {
            if ((((j) this).field_yb.field_w ^ -1) <= -26) {
              break L1;
            } else {
              if (var2 == -1) {
                return new lj(3, false);
              } else {
                break L1;
              }
            }
          }
        }
        if (this.a(9, 96, 25) != -1) {
          return new lj(9);
        } else {
          L2: {
            var3 = this.a(15, 117, 25);
            if (0 != (var3 ^ -1)) {
              var4 = 0;
              var5 = (vn) (Object) ((j) this).field_K.d(-98);
              L3: while (true) {
                if (var5 == null) {
                  var5 = (vn) (Object) ((j) this).field_gb.d(-95);
                  L4: while (true) {
                    if (var5 == null) {
                      if (var4 != 0) {
                        return new lj(15);
                      } else {
                        break L2;
                      }
                    } else {
                      L5: {
                        if (var5.field_J >= var3) {
                          break L5;
                        } else {
                          var4 = 1;
                          break L5;
                        }
                      }
                      var5 = (vn) (Object) ((j) this).field_gb.a((byte) 116);
                      continue L4;
                    }
                  }
                } else {
                  L6: {
                    if (var3 <= var5.field_J) {
                      break L6;
                    } else {
                      var4 = 1;
                      break L6;
                    }
                  }
                  var5 = (vn) (Object) ((j) this).field_K.a((byte) 116);
                  continue L3;
                }
              }
            } else {
              break L2;
            }
          }
          if ((this.a(6, 117, 25) ^ -1) != 0) {
            return new lj(6);
          } else {
            if (this.a(16, 74, 25) == 0) {
              if (0 == this.a(7, 123, 25)) {
                L7: {
                  if (param0 < -81) {
                    break L7;
                  } else {
                    ((j) this).field_E = 12;
                    break L7;
                  }
                }
                if (0 != (this.a(11, 33, 25) ^ -1)) {
                  return new lj(11);
                } else {
                  if ((this.a(8, 84, 25) ^ -1) != 0) {
                    return new lj(8);
                  } else {
                    if (this.a(13, 102, 25) != -1) {
                      return new lj(13);
                    } else {
                      return null;
                    }
                  }
                }
              } else {
                return new lj(7);
              }
            } else {
              return new lj(16);
            }
          }
        }
    }

    final int a(boolean param0, StringBuilder param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        vn var5_ref_vn = null;
        ge var5_ref_ge = null;
        il var5_ref_il = null;
        cl var6_ref_cl = null;
        int var6 = 0;
        int var7_int = 0;
        on var7 = null;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0;
        int stackOut_1_0;
        L0: {
          var9 = BrickABrac.field_J ? 1 : 0;
          if (param1 == null) {
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
          if (var3 != 0) {
            StringBuilder discarded$25 = param1.append("Checksum breakdown for a player.\n");
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var4 = 455818059;
          if (var3 == 0) {
            break L2;
          } else {
            StringBuilder discarded$26 = param1.append("State info: " + ((j) this).field_Z + " " + ((j) this).field_P + "\n");
            break L2;
          }
        }
        L3: {
          var4 = var4 ^ ((j) this).field_Z * 83 + 255 << -1972998571;
          var4 = var4 ^ 238 + ((j) this).field_P * 73 << -1246323700;
          if (var3 == 0) {
            break L3;
          } else {
            StringBuilder discarded$27 = param1.append("1. " + Integer.toString(var4, 16) + "\n");
            break L3;
          }
        }
        L4: {
          if (var3 != 0) {
            StringBuilder discarded$28 = param1.append("Score, Level, Lives: " + ((j) this).field_ob + " " + ((j) this).field_qb + " " + ((j) this).field_rb + "\n");
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          var4 = var4 ^ 65535 + ((j) this).field_ob * 29;
          var4 = var4 ^ 15601376 + 67 * ((j) this).field_qb << 1720376611;
          var4 = var4 ^ ((j) this).field_rb * 61 - -961453 << -1594017462;
          if (var3 != 0) {
            StringBuilder discarded$29 = param1.append("2. " + Integer.toString(var4, 16) + "\n");
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (var3 == 0) {
            break L6;
          } else {
            StringBuilder discarded$30 = param1.append("Hit brick info: " + ((j) this).field_L + " " + ((j) this).field_m + " " + ((j) this).field_Q + "\n");
            break L6;
          }
        }
        L7: {
          var4 = var4 ^ ((j) this).field_L * 11 + (((j) this).field_m * 17 - -14334957);
          var4 = var4 ^ 13287405 + ((j) this).field_Q * 103 << 2047684102;
          if (var3 != 0) {
            StringBuilder discarded$31 = param1.append("3. " + Integer.toString(var4, 16) + "\n");
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          if (var3 == 0) {
            break L8;
          } else {
            StringBuilder discarded$32 = param1.append("PRNG: " + ((j) this).field_sb + " " + ((j) this).field_W + "\n");
            break L8;
          }
        }
        L9: {
          var4 = var4 ^ 5457 + 31 * ((j) this).field_sb << 609072933;
          var4 = var4 ^ 43 * ((j) this).field_W + 818 << -2007008087;
          if (var3 != 0) {
            StringBuilder discarded$33 = param1.append("4. " + Integer.toString(var4, 16) + "\n");
            break L9;
          } else {
            break L9;
          }
        }
        L10: {
          var4 = var4 ^ 7 * ((j) this).field_mb - -61453 << 249639496;
          var4 = var4 ^ 19 * ((j) this).field_T + 17 << -1892627087;
          var4 = var4 ^ 12648430 + ((j) this).field_ub * 17 << -622846397;
          if (param0) {
            break L10;
          } else {
            ((j) this).field_Q = -85;
            break L10;
          }
        }
        L11: {
          if (var3 != 0) {
            StringBuilder discarded$34 = param1.append("5. " + Integer.toString(var4, 16) + "\n");
            break L11;
          } else {
            break L11;
          }
        }
        L12: {
          if (var3 == 0) {
            break L12;
          } else {
            StringBuilder discarded$35 = param1.append("Keys and time: " + ((j) this).field_db + " " + ((j) this).field_F + "\n");
            break L12;
          }
        }
        L13: {
          var4 = var4 ^ 21879 + ((j) this).field_F * 23 << -730441396;
          if (var3 == 0) {
            break L13;
          } else {
            StringBuilder discarded$36 = param1.append("6. " + Integer.toString(var4, 16) + "\n");
            break L13;
          }
        }
        L14: {
          if (((j) this).field_v == null) {
            break L14;
          } else {
            var5 = 7;
            var6_ref_cl = (cl) (Object) ((j) this).field_v.d(-104);
            L15: while (true) {
              if (var6_ref_cl == null) {
                break L14;
              } else {
                var5 = 6 + var5 * 3 + 5 & 31;
                var7_int = var6_ref_cl.a(108, param1);
                var4 = var4 ^ (var7_int << var5 | var5 >>> -var5 + 32);
                var6_ref_cl = (cl) (Object) ((j) this).field_v.a((byte) 116);
                continue L15;
              }
            }
          }
        }
        L16: {
          if (var3 == 0) {
            break L16;
          } else {
            StringBuilder discarded$37 = param1.append("7. Paths: " + Integer.toString(var4, 16) + "\n");
            break L16;
          }
        }
        L17: {
          if (((j) this).field_z != null) {
            var5 = 0;
            var6 = 0;
            L18: while (true) {
              if (((j) this).field_z.length <= var6) {
                break L17;
              } else {
                var5 = 31 & 5 + 7 * var6;
                var7 = (on) (Object) ((j) this).field_z[var6].d(-94);
                L19: while (true) {
                  if (var7 == null) {
                    var6++;
                    continue L18;
                  } else {
                    L20: {
                      if ((1 & var7.field_N) == 0) {
                        var8 = var7.a(108, param1);
                        var4 = var4 ^ (var8 << var5 | var8 >>> 32 - var5);
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                    var7 = (on) (Object) ((j) this).field_z[var6].a((byte) 116);
                    continue L19;
                  }
                }
              }
            }
          } else {
            break L17;
          }
        }
        L21: {
          if (var3 != 0) {
            StringBuilder discarded$38 = param1.append("8. " + Integer.toString(var4, 16) + "\n");
            break L21;
          } else {
            break L21;
          }
        }
        L22: {
          if (var3 == 0) {
            break L22;
          } else {
            StringBuilder discarded$39 = param1.append("Ball info:\n");
            break L22;
          }
        }
        L23: {
          if (var3 == 0) {
            break L23;
          } else {
            StringBuilder discarded$40 = param1.append("Balls queued up: " + ((j) this).field_K.e(120) + "\n");
            break L23;
          }
        }
        var5_ref_vn = (vn) (Object) ((j) this).field_K.d(-13);
        L24: while (true) {
          if (var5_ref_vn == null) {
            L25: {
              if (var3 != 0) {
                StringBuilder discarded$41 = param1.append("Balls in play: " + ((j) this).field_gb.e(119) + "\n");
                break L25;
              } else {
                break L25;
              }
            }
            var5_ref_vn = (vn) (Object) ((j) this).field_gb.d(-75);
            L26: while (true) {
              if (var5_ref_vn == null) {
                L27: {
                  if (var3 != 0) {
                    StringBuilder discarded$42 = param1.append("9. " + Integer.toString(var4, 16) + "\n");
                    break L27;
                  } else {
                    break L27;
                  }
                }
                var5_ref_ge = (ge) (Object) ((j) this).field_pb.d(-61);
                L28: while (true) {
                  if (var5_ref_ge == null) {
                    L29: {
                      if (var3 == 0) {
                        break L29;
                      } else {
                        StringBuilder discarded$43 = param1.append("10. " + Integer.toString(var4, 16) + "\n");
                        break L29;
                      }
                    }
                    L30: {
                      var4 = var4 ^ ((j) this).field_yb.a(93, param1);
                      if (var3 != 0) {
                        StringBuilder discarded$44 = param1.append("11. " + Integer.toString(var4, 16) + "\n");
                        break L30;
                      } else {
                        break L30;
                      }
                    }
                    L31: {
                      if (var3 != 0) {
                        StringBuilder discarded$45 = param1.append("Bubble info " + ((j) this).field_C.e(124) + "\n");
                        StringBuilder discarded$46 = param1.append(((j) this).field_R + " " + ((j) this).field_k + "\n");
                        break L31;
                      } else {
                        break L31;
                      }
                    }
                    var5_ref_il = (il) (Object) ((j) this).field_C.d(-90);
                    L32: while (true) {
                      if (var5_ref_il == null) {
                        L33: {
                          if (var3 == 0) {
                            break L33;
                          } else {
                            StringBuilder discarded$47 = param1.append("12. " + Integer.toString(var4, 16) + "\n");
                            break L33;
                          }
                        }
                        var5 = 3;
                        L34: while (true) {
                          if (var5 >= 29) {
                            L35: {
                              if (var3 != 0) {
                                StringBuilder discarded$48 = param1.append("13. " + Integer.toString(var4, 16) + "\n");
                                break L35;
                              } else {
                                break L35;
                              }
                            }
                            L36: {
                              var4 = var4 ^ 17 + 3 * ((j) this).field_n << -1099461181;
                              if (var3 == 0) {
                                break L36;
                              } else {
                                StringBuilder discarded$49 = param1.append("14. " + Integer.toString(var4, 16) + "\n");
                                break L36;
                              }
                            }
                            return var4;
                          } else {
                            var6 = ((j) this).field_o[var5] % to.field_f[var5];
                            var6 = (15 & var6) << 2057953316 | var6 >> -1477522716;
                            var4 = var4 ^ var6 * 3 - -26386 << (15 & var5);
                            var5++;
                            continue L34;
                          }
                        }
                      } else {
                        var4 = var4 ^ var5_ref_il.a(114, param1);
                        var5_ref_il = (il) (Object) ((j) this).field_C.a((byte) 116);
                        continue L32;
                      }
                    }
                  } else {
                    var4 = var4 ^ var5_ref_ge.a(114, param1);
                    var5_ref_ge = (ge) (Object) ((j) this).field_pb.a((byte) 116);
                    continue L28;
                  }
                }
              } else {
                var4 = var4 ^ var5_ref_vn.a(82, param1);
                var5_ref_vn = (vn) (Object) ((j) this).field_gb.a((byte) 116);
                continue L26;
              }
            }
          } else {
            var4 = var4 ^ var5_ref_vn.a(94, param1);
            var5_ref_vn = (vn) (Object) ((j) this).field_K.a((byte) 116);
            continue L24;
          }
        }
    }

    public static void d(int param0) {
        field_jb = null;
        if (param0 != -2947) {
            field_jb = null;
        }
    }

    final void a(String[] param0, byte param1) {
        ((j) this).field_lb = param0[aa.a(param0.length, ((j) this).field_B, true)];
        if (param1 != 75) {
            ((j) this).field_hb = -123;
        }
    }

    private final int a(int param0, int param1, int param2) {
        int var4 = 0;
        ge var5 = null;
        int var6 = BrickABrac.field_J ? 1 : 0;
        if (param1 <= 8) {
            return -87;
        }
        param2 = ((j) this).field_F - -param2;
        for (var4 = ((j) this).field_X; var4 <= ((j) this).field_kb.field_n; var4++) {
            var5 = (ge) ((j) this).field_kb.a(var4, 111);
            if (!(param2 >= var5.field_y)) {
                return -1;
            }
            if (var5.field_i == param0) {
                return var5.field_y + -((j) this).field_F;
            }
        }
        return -1;
    }

    final void a(boolean param0, wq param1, int param2) {
        int var4 = 0;
        int var5_int = 0;
        vl[] var5 = null;
        int var6_int = 0;
        vl var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ge var11 = null;
        int var12 = 0;
        on var13 = null;
        cl var14 = null;
        vn var15 = null;
        vn var16 = null;
        int stackIn_29_0 = 0;
        int stackOut_28_0;
        int stackOut_27_0;
        var12 = BrickABrac.field_J ? 1 : 0;
        ((j) this).field_Z = param1.l(255);
        ((j) this).field_P = param1.i(65280);
        ((j) this).field_F = param1.e(255);
        ((j) this).field_Y.field_n = -1 + ((j) this).field_F / 5;
        ((j) this).field_ob = param1.e((byte) -34);
        ((j) this).field_qb = param1.l(255);
        ((j) this).field_rb = param1.l(255);
        ((j) this).field_m = param1.i(65280);
        ((j) this).field_Q = param1.i(65280);
        ((j) this).field_p = param1.i(65280);
        ((j) this).field_W = 0;
        var4 = 0;
        var5_int = param1.e(255);
        L0: while (true) {
          if (var4 >= var5_int) {
            ((j) this).field_n = param1.i(65280);
            var4 = ((j) this).field_n % 16;
            var5 = new vl[3];
            var6_int = 0;
            L1: while (true) {
              if (var6_int >= var5.length) {
                var6 = new vl();
                var7 = param1.i(65280);
                var8 = 0;
                L2: while (true) {
                  if (var8 >= var7) {
                    ((j) this).a(var6, 9, var5);
                    ((j) this).field_K.c((byte) -79);
                    ((j) this).field_gb.c((byte) -118);
                    var8 = param1.l(255);
                    var9 = 0;
                    L3: while (true) {
                      if (var8 <= var9) {
                        var8 = param1.l(255);
                        var9 = 0;
                        L4: while (true) {
                          if (var8 <= var9) {
                            ((j) this).field_pb.c((byte) -63);
                            var9 = param1.l(255);
                            var10 = 0;
                            L5: while (true) {
                              if (var9 <= var10) {
                                ((j) this).field_yb.a(100, param1);
                                ((j) this).field_C.c((byte) -83);
                                ((j) this).field_k = param1.e(255);
                                ((j) this).field_R = param1.e(255);
                                ((j) this).f(1000);
                                if (!param0) {
                                  var10 = 3;
                                  L6: while (true) {
                                    if ((var10 ^ -1) <= -30) {
                                      L7: {
                                        ((j) this).field_r = param1.i(65280);
                                        ((j) this).field_M = param1.i(65280);
                                        ((j) this).field_p = param1.e(255);
                                        ((j) this).field_G = ((j) this).field_p + ((j) this).field_ub << 121598920;
                                        if (1 == param2) {
                                          stackOut_28_0 = 15;
                                          stackIn_29_0 = stackOut_28_0;
                                          break L7;
                                        } else {
                                          stackOut_27_0 = 9;
                                          stackIn_29_0 = stackOut_27_0;
                                          break L7;
                                        }
                                      }
                                      kj.a(stackIn_29_0, ((j) this).field_z[2], 16);
                                      return;
                                    } else {
                                      ((j) this).field_o[var10] = (byte)param1.l(255);
                                      var10++;
                                      continue L6;
                                    }
                                  }
                                } else {
                                  return;
                                }
                              } else {
                                var11 = new ge();
                                var11.a(97, param1);
                                ((j) this).field_pb.a((nm) (Object) var11, (byte) 3);
                                var10++;
                                continue L5;
                              }
                            }
                          } else {
                            var16 = new vn();
                            var16.a(107, param1);
                            ((j) this).field_gb.a((nm) (Object) var16, (byte) 3);
                            var9++;
                            continue L4;
                          }
                        }
                      } else {
                        var15 = new vn();
                        var15.a(110, param1);
                        ((j) this).field_K.a((nm) (Object) var15, (byte) 3);
                        var9++;
                        continue L3;
                      }
                    }
                  } else {
                    var14 = new cl();
                    var14.a(114, param1);
                    var6.a((nm) (Object) var14, (byte) 3);
                    var8++;
                    continue L2;
                  }
                }
              } else {
                var5[var6_int] = new vl();
                var7 = param1.i(65280);
                var8 = 0;
                L8: while (true) {
                  if (var7 <= var8) {
                    var6_int++;
                    continue L1;
                  } else {
                    var13 = new on();
                    var13.a(92, param1);
                    var13.field_m = var13.field_m - (var4 * 1 << 84978984);
                    var5[var6_int].a((nm) (Object) var13, (byte) 3);
                    var8++;
                    continue L8;
                  }
                }
              }
            }
          } else {
            int discarded$1 = ((j) this).e(118);
            var4++;
            continue L0;
          }
        }
    }

    final void b(int param0, int param1) {
        if (param0 != 16387) {
            Object var4 = null;
            ((j) this).a(-103, (vo) null, -75);
        }
        ((j) this).a(param1, true, 50);
    }

    final void f(int param0) {
        fo var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        il var11 = null;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = BrickABrac.field_J ? 1 : 0;
          if (((j) this).field_k < 0) {
            break L0;
          } else {
            if (((j) this).field_k <= 564) {
              L1: {
                if (param0 == 1000) {
                  break L1;
                } else {
                  ((j) this).field_ib = 95;
                  break L1;
                }
              }
              var2 = new fo(new int[1]);
              var3 = (-68 + ((j) this).field_mb) / 8;
              var4 = 60;
              var5 = 0;
              L2: while (true) {
                if (var5 >= 8) {
                  return;
                } else {
                  var6 = 0;
                  L3: while (true) {
                    if (-9 >= (var6 ^ -1)) {
                      var5++;
                      continue L2;
                    } else {
                      var7 = var3 * var5 + 34 - -var2.a(-37880252, var3) << 1449943656;
                      var8 = 480 - (-(var4 * var6) + -var2.a(-37880252, var4)) << -1469234520;
                      var9 = -768;
                      var10 = 5120 + var2.a(param0 ^ -37880404, 2);
                      var11 = new il(var7, var8, 0, var9, var10, 0);
                      var11.field_E = var2.a(param0 ^ -37880404, 4096);
                      var11.field_w = var2.a(-37880252, 100) + 300;
                      var11.field_y = 8000 - -var2.a(-37880252, 1000);
                      ((j) this).field_C.a((nm) (Object) var11, (byte) 3);
                      var12 = 0;
                      L4: while (true) {
                        if (((j) this).field_k <= var12) {
                          var6++;
                          continue L3;
                        } else {
                          var11.d(-2081170685);
                          var12++;
                          continue L4;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    final static void a(oe param0, int param1, int param2) {
        l discarded$5 = hm.a(0, param0, param2);
        if (param1 > -29) {
            Object var4 = null;
            j.a((oe) null, -15, 82);
        }
    }

    private final void a(byte param0, boolean param1, int param2) {
        if (param1) {
            ((j) this).field_t = 0;
            ((j) this).field_m = 0;
        }
        ((j) this).field_yb.f(param0 ^ 85);
        ((j) this).field_K.c((byte) -82);
        ((j) this).field_K.a((nm) (Object) new vn(((j) this).field_yb, param2, 1536), (byte) 3);
        ((j) this).field_pb.c((byte) -92);
        ((j) this).field_gb.c((byte) -88);
        if (param0 != 85) {
            ((j) this).field_j = 84;
        }
    }

    final void a(int param0, boolean param1) {
        if (param0 != 26496) {
            return;
        }
        this.a((byte) 85, param1, ((j) this).a(2048, (byte) 62) + -1024);
    }

    final void a(byte param0) {
        ((j) this).field_Z = 3;
        ((j) this).field_P = 0;
        if (param0 != 22) {
            ((j) this).field_ab = null;
        }
    }

    final void c(int param0) {
        if (param0 != -101) {
            return;
        }
        if (((j) this).field_w != null) {
            ((j) this).field_w.field_m = ((j) this).field_w.field_m + 1;
            // if_icmple L38
        } else {
            ((j) this).field_w = ((j) this).field_D;
            ((j) this).field_D = null;
        }
        if (((j) this).field_D != null) {
            ((j) this).field_D.field_m = ((j) this).field_D.field_m + 1;
        } else {
            ((j) this).field_D = this.g(-99);
        }
    }

    final int e(int param0) {
        int var2 = -93 / ((param0 - 76) / 39);
        ((j) this).field_W = ((j) this).field_W + 1;
        return ((j) this).field_s.b(115);
    }

    final void a(int param0) {
        int var2 = 0;
        on var3 = null;
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = BrickABrac.field_J ? 1 : 0;
          if (param0 == -27) {
            break L0;
          } else {
            var5 = null;
            int discarded$1 = ((j) this).a(true, (StringBuilder) null);
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (((j) this).field_z.length <= var2) {
            return;
          } else {
            var3 = (on) (Object) ((j) this).field_z[var2].d(-81);
            L2: while (true) {
              if (var3 == null) {
                var2++;
                continue L1;
              } else {
                L3: {
                  L4: {
                    if (-27 != (var3.field_i ^ -1)) {
                      break L4;
                    } else {
                      if ((var3.field_R ^ -1) == -27) {
                        var3.field_R = 27;
                        var3.field_l = 0;
                        var3.field_B = 10;
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (26 != var3.field_i) {
                      break L5;
                    } else {
                      if (var3.field_R == 27) {
                        var3.field_R = 26;
                        var3.field_i = 27;
                        var3.field_l = -var3.field_l + 15;
                        var3.field_B = 10;
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (var3.field_i != 26) {
                      break L6;
                    } else {
                      if (var3.field_R < 0) {
                        var3.field_B = 10;
                        var3.field_R = 27;
                        var3.field_l = 0;
                        break L3;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (var3.field_i != 27) {
                      break L7;
                    } else {
                      if (var3.field_R == -27) {
                        var3.field_i = 26;
                        var3.field_l = 15 - var3.field_l;
                        var3.field_B = 10;
                        var3.field_R = 27;
                        break L3;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if (27 != var3.field_i) {
                      break L8;
                    } else {
                      if (-28 != var3.field_R) {
                        break L8;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                  if (-28 != (var3.field_i ^ -1)) {
                    break L3;
                  } else {
                    if ((var3.field_R ^ -1) > -1) {
                      var3.field_R = 26;
                      var3.field_B = 10;
                      var3.field_l = 0;
                      break L3;
                    } else {
                      var3 = (on) (Object) ((j) this).field_z[var2].a((byte) 116);
                      continue L2;
                    }
                  }
                }
                var3 = (on) (Object) ((j) this).field_z[var2].a((byte) 116);
                continue L2;
              }
            }
          }
        }
    }

    final int a(int param0, byte param1) {
        ((j) this).field_W = ((j) this).field_W + 1;
        if (param1 != 62) {
            ((j) this).field_J = 79;
        }
        return ((j) this).field_s.a(-37880252, param0);
    }

    final void a(int param0, boolean param1, int param2) {
        ((j) this).field_ib = param2;
        ((j) this).field_y = param0;
        if (!param1) {
            ((j) this).c(27);
        }
    }

    final void a(byte param0, on param1, vn param2) {
        int var4 = ((j) this).a(-1 + ((j) this).field_O.length, (byte) 62);
        if (!(param1.field_H > var4)) {
            var4++;
        }
        on var5 = ((j) this).field_O[var4];
        param2.field_j = var5.field_u / 2 + var5.field_j + -param2.field_u;
        if (param0 != -63) {
            ((j) this).field_i = -27;
        }
        param2.field_m = -(2 * param2.field_u) + var5.field_m;
        int var6 = ((j) this).a(65536, (byte) 62);
        int var7 = dm.a(var6, -1, 33554432) + dm.a(-var6 + 65536, -1, 67108864);
        var7 = var7 >> 16;
        if ((param2.field_k ^ -1) > -1) {
            var7 = -var7;
        }
        param2.a(6546, var7);
    }

    final void a(int param0, on param1, int param2) {
        ((j) this).a(param0, false, param1.field_j + param1.field_u / 2, param1.field_s / param2 + param1.field_m);
    }

    final void a(int param0, vo param1, int param2) {
        ((j) this).a(param0, false, param1.field_j + param1.field_u / param2, -12800 + param1.field_m);
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        int var6 = 0;
        int var5 = 0;
        if (100 < ((j) this).a(200, (byte) 62)) {
            var5 = param0;
            ep.field_i = ep.field_i + var5;
        } else {
            var5 = param0;
            var6 = ((j) this).a(50, (byte) 62);
            ep.field_i = ep.field_i - var6 * var5;
            fp.field_z = fp.field_z + (1 + var6) * var5;
        }
        if (param1) {
            ((j) this).field_l = 1;
        }
        ((j) this).field_ob = ((j) this).field_ob + param0;
        ((j) this).field_nb.a((nm) (Object) new ul(param0, param2, param3), (byte) 3);
    }

    final boolean a(int param0, int param1) {
        if (-1 > (to.field_f[param1] ^ -1)) {
            ((j) this).field_o[param1] = (byte)(((j) this).field_o[param1] + 1);
            ((j) this).field_o[param1] = (byte)((byte)(((j) this).field_o[param1] + 1) % to.field_f[param1]);
        }
        if (param0 != 26) {
            ((j) this).b(-111, 112);
        }
        return ((j) this).field_o[param1] == 0 ? true : false;
    }

    j(int param0, int param1, int param2, int param3, int param4) {
        L0: {
          ((j) this).field_vb = new int[5];
          ((j) this).field_db = 0;
          ((j) this).field_eb = new vl();
          ((j) this).field_rb = 4;
          ((j) this).field_ob = 0;
          ((j) this).field_nb = new vl();
          ((j) this).field_K = new vl();
          ((j) this).field_gb = new vl();
          ((j) this).field_x = new vl();
          ((j) this).field_pb = new vl();
          ((j) this).field_C = new vl();
          ((j) this).field_kb = new ao(500);
          ((j) this).field_ab = new kq();
          ((j) this).field_G = -1;
          ((j) this).field_o = new byte[29];
          ((j) this).field_B = new Random();
          ((j) this).field_M = -1;
          ((j) this).field_k = -1;
          ((j) this).field_wb = 466;
          ((j) this).field_mb = param0;
          ((j) this).field_ub = param1;
          ((j) this).field_G = param1 << 73884200;
          ((j) this).field_T = ((j) this).field_mb / 2;
          ((j) this).field_yb = new vo(((j) this).field_T << -1708150168, 0, 0, ((j) this).field_mb << -895045592);
          ((j) this).field_sb = param3;
          ((j) this).field_Z = 0;
          ((j) this).field_s = new fo(new int[1]);
          ((j) this).field_cb = new int[29];
          ((j) this).field_xb = new int[29];
          ((j) this).field_Y = new ao(500);
          ((j) this).b(16387, 0);
          ((j) this).field_H = param4;
          if (ah.field_w != null) {
            break L0;
          } else {
            ah.field_w = new int[2][3];
            ah.field_w[0][2] = aq.field_e;
            ah.field_w[0][0] = ac.field_f;
            ah.field_w[0][1] = fq.field_b;
            ah.field_w[1][2] = td.field_u;
            ah.field_w[1][1] = ce.field_d;
            ah.field_w[1][0] = jl.field_b;
            break L0;
          }
        }
        ((j) this).field_bb = ah.field_w[param2][0];
        ((j) this).field_j = ah.field_w[param2][1];
        ((j) this).field_I = ah.field_w[param2][2];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_jb = new String[][]{new String[4]};
    }
}
