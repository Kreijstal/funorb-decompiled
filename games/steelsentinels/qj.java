/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    private mb field_l;
    static String[] field_d;
    private int field_t;
    static sk[] field_q;
    private int field_e;
    static int[] field_a;
    private int field_p;
    static String field_i;
    private int field_n;
    static String field_j;
    static String field_m;
    static String field_u;
    static String[] field_v;
    private int field_o;
    private int field_k;
    private int field_f;
    private int field_g;
    static String field_c;
    private int field_r;
    private int field_b;
    private int field_w;
    private int field_s;
    static int field_h;

    public static void c(int param0) {
        field_u = null;
        if (param0 != 21841) {
            return;
        }
        field_v = null;
        field_d = null;
        field_a = null;
        field_m = null;
        field_c = null;
        field_j = null;
        field_i = null;
        field_q = null;
    }

    final void b(int param0) {
        int[] discarded$18 = null;
        int[] discarded$19 = null;
        int[] dupTemp$20 = null;
        int[] dupTemp$21 = null;
        int[] dupTemp$22 = null;
        int[] dupTemp$23 = null;
        int[] dupTemp$24 = null;
        int[] dupTemp$25 = null;
        int[] dupTemp$26 = null;
        int[] dupTemp$27 = null;
        int[] dupTemp$28 = null;
        int[] dupTemp$29 = null;
        int[] dupTemp$30 = null;
        int[] dupTemp$31 = null;
        int[] dupTemp$32 = null;
        int[] dupTemp$33 = null;
        int[] dupTemp$34 = null;
        int[] dupTemp$35 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = SteelSentinels.field_G;
          if (-17 == (ei.field_q ^ -1)) {
            this.field_t = jm.field_o;
            this.field_f = -1;
            this.field_b = 0;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (17 == ei.field_q) {
            this.field_b = 1;
            this.field_t = wb.field_g;
            this.field_f = -1;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (-19 == (ei.field_q ^ -1)) {
            this.field_f = -1;
            this.field_b = 9;
            this.field_t = lc.field_g;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (ei.field_q != 19) {
            break L3;
          } else {
            this.field_f = -1;
            this.field_b = 14;
            this.field_t = qe.field_e;
            break L3;
          }
        }
        L4: {
          if (-21 != (ei.field_q ^ -1)) {
            break L4;
          } else {
            this.field_t = jh.field_d;
            this.field_b = 17;
            this.field_f = -1;
            break L4;
          }
        }
        L5: {
          if (-67 != (ei.field_q ^ -1)) {
            break L5;
          } else {
            this.field_s = this.field_b;
            break L5;
          }
        }
        L6: {
          if (-42 != (ei.field_q ^ -1)) {
            break L6;
          } else {
            if (!fc.field_e[82]) {
              break L6;
            } else {
              if (0 != (this.field_s ^ -1)) {
                var2 = 0;
                L7: while (true) {
                  if (var2 >= ka.field_G[o.a((byte) 84, this.field_n)][this.field_b].length) {
                    this.field_s = -1;
                    qa.field_J[this.field_b].d();
                    pb.b();
                    this.field_l.field_r = this.field_b;
                    this.field_l.field_J = this.field_b;
                    discarded$18 = this.field_l.f(this.field_n, param0 ^ -27248);
                    this.field_l.a(128, 64, (byte) -116, rf.field_a);
                    sb.field_bb.b((byte) 127);
                    break L6;
                  } else {
                    ka.field_G[o.a((byte) 84, this.field_n)][this.field_b][var2] = ka.field_G[o.a((byte) 84, this.field_n)][this.field_s][var2];
                    var2++;
                    continue L7;
                  }
                }
              } else {
                break L6;
              }
            }
          }
        }
        L8: {
          if (ei.field_q != 65) {
            break L8;
          } else {
            if (-1 == this.field_f) {
              break L8;
            } else {
              ka.field_G[o.a((byte) 84, this.field_n)][this.field_b][this.field_f] = this.field_o;
              qa.field_J[this.field_b].d();
              pb.b();
              this.field_l.field_J = this.field_b;
              this.field_l.field_r = this.field_b;
              discarded$19 = this.field_l.f(this.field_n, 22742);
              this.field_l.a(128, 64, (byte) -116, rf.field_a);
              sb.field_bb.b((byte) 127);
              break L8;
            }
          }
        }
        L9: {
          if (ei.field_q != 49) {
            break L9;
          } else {
            this.field_p = ja.field_i;
            break L9;
          }
        }
        L10: {
          if ((ei.field_q ^ -1) == -71) {
            this.field_p = uh.field_e;
            break L10;
          } else {
            break L10;
          }
        }
        L11: {
          if (-52 == (ei.field_q ^ -1)) {
            this.field_p = rb.field_j;
            break L11;
          } else {
            break L11;
          }
        }
        L12: {
          if ((ei.field_q ^ -1) == -42) {
            var2 = o.a((byte) 84, this.field_n);
            System.out.println("Please send the following data to TdR so he can insert it into the game!");
            System.out.println("int[][] animation = sentinelanimations[" + var2 + "];");
            var3 = 0;
            L13: while (true) {
              if ((var3 ^ -1) <= -27) {
                break L12;
              } else {
                System.out.print("animation[" + var3 + "] = new int[]{");
                var4 = 0;
                L14: while (true) {
                  if (var4 >= ka.field_G[var2][var3].length) {
                    System.out.println("};");
                    var3++;
                    continue L13;
                  } else {
                    L15: {
                      if (-1 <= (var4 ^ -1)) {
                        break L15;
                      } else {
                        System.out.print(",");
                        break L15;
                      }
                    }
                    System.out.print(ka.field_G[var2][var3][var4]);
                    var4++;
                    continue L14;
                  }
                }
              }
            }
          } else {
            break L12;
          }
        }
        L16: {
          if ((ei.field_q ^ -1) == -97) {
            L17: {
              this.field_b = this.field_b - 1;
              this.field_f = -1;
              if (this.field_t == jm.field_o) {
                this.field_b = 0;
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              if (this.field_t != wb.field_g) {
                if (this.field_t != lc.field_g) {
                  break L18;
                } else {
                  if (9 <= this.field_b) {
                    break L18;
                  } else {
                    this.field_b = 9;
                    break L18;
                  }
                }
              } else {
                if (this.field_t != lc.field_g) {
                  break L18;
                } else {
                  if (9 <= this.field_b) {
                    break L18;
                  } else {
                    this.field_b = 9;
                    break L18;
                  }
                }
              }
            }
            L19: {
              if (this.field_t != qe.field_e) {
                break L19;
              } else {
                if ((this.field_b ^ -1) > -15) {
                  this.field_b = 14;
                  break L19;
                } else {
                  break L19;
                }
              }
            }
            if (jh.field_d != this.field_t) {
              break L16;
            } else {
              if (this.field_b < 17) {
                this.field_b = this.field_b + ka.field_G[o.a((byte) 84, this.field_n)][25][7];
                break L16;
              } else {
                break L16;
              }
            }
          } else {
            break L16;
          }
        }
        L20: {
          if (-98 == (ei.field_q ^ -1)) {
            L21: {
              this.field_b = this.field_b + 1;
              this.field_f = -1;
              if (this.field_t != jm.field_o) {
                break L21;
              } else {
                this.field_b = 0;
                break L21;
              }
            }
            L22: {
              if (this.field_t != wb.field_g) {
                break L22;
              } else {
                if (this.field_b >= ka.field_G[o.a((byte) 84, this.field_n)][25][3] + 1) {
                  this.field_b = this.field_b - ka.field_G[o.a((byte) 84, this.field_n)][25][3];
                  break L22;
                } else {
                  break L22;
                }
              }
            }
            L23: {
              if (this.field_t != lc.field_g) {
                if (qe.field_e != this.field_t) {
                  break L23;
                } else {
                  if (-17 <= (this.field_b ^ -1)) {
                    break L23;
                  } else {
                    this.field_b = 16;
                    break L23;
                  }
                }
              } else {
                if (qe.field_e != this.field_t) {
                  break L23;
                } else {
                  if (-17 <= (this.field_b ^ -1)) {
                    break L23;
                  } else {
                    this.field_b = 16;
                    break L23;
                  }
                }
              }
            }
            if (this.field_t != jh.field_d) {
              break L20;
            } else {
              if (this.field_b < ka.field_G[o.a((byte) 84, this.field_n)][25][7] + 17) {
                break L20;
              } else {
                this.field_b = this.field_b - ka.field_G[o.a((byte) 84, this.field_n)][25][7];
                break L20;
              }
            }
          } else {
            break L20;
          }
        }
        L24: {
          if (26 == ei.field_q) {
            if (this.field_t != wb.field_g) {
              if (lc.field_g == this.field_t) {
                if (1 < ka.field_G[o.a((byte) 84, this.field_n)][25][4]) {
                  dupTemp$20 = ka.field_G[o.a((byte) 84, this.field_n)][25];
                  dupTemp$20[4] = dupTemp$20[4] - 1;
                  break L24;
                } else {
                  break L24;
                }
              } else {
                if (this.field_t == jh.field_d) {
                  if ((ka.field_G[o.a((byte) 84, this.field_n)][25][7] ^ -1) >= -4) {
                    break L24;
                  } else {
                    dupTemp$21 = ka.field_G[o.a((byte) 84, this.field_n)][25];
                    dupTemp$21[7] = dupTemp$21[7] - 1;
                    break L24;
                  }
                } else {
                  break L24;
                }
              }
            } else {
              if ((ka.field_G[o.a((byte) 84, this.field_n)][25][3] ^ -1) >= -4) {
                break L24;
              } else {
                dupTemp$22 = ka.field_G[o.a((byte) 84, this.field_n)][25];
                dupTemp$22[3] = dupTemp$22[3] - 1;
                break L24;
              }
            }
          } else {
            break L24;
          }
        }
        L25: {
          if (-28 == (ei.field_q ^ -1)) {
            if (this.field_t == wb.field_g) {
              if (-9 < (ka.field_G[o.a((byte) 84, this.field_n)][25][3] ^ -1)) {
                dupTemp$23 = ka.field_G[o.a((byte) 84, this.field_n)][25];
                dupTemp$23[3] = dupTemp$23[3] + 1;
                break L25;
              } else {
                break L25;
              }
            } else {
              if (this.field_t == lc.field_g) {
                if (-6 >= (ka.field_G[o.a((byte) 84, this.field_n)][25][4] ^ -1)) {
                  break L25;
                } else {
                  dupTemp$24 = ka.field_G[o.a((byte) 84, this.field_n)][25];
                  dupTemp$24[4] = dupTemp$24[4] + 1;
                  break L25;
                }
              } else {
                if (this.field_t == jh.field_d) {
                  if (ka.field_G[o.a((byte) 84, this.field_n)][25][7] >= 8) {
                    break L25;
                  } else {
                    dupTemp$25 = ka.field_G[o.a((byte) 84, this.field_n)][25];
                    dupTemp$25[7] = dupTemp$25[7] + 1;
                    break L25;
                  }
                } else {
                  break L25;
                }
              }
            }
          } else {
            break L25;
          }
        }
        L26: {
          if (param0 == -12986) {
            break L26;
          } else {
            this.b(47);
            break L26;
          }
        }
        L27: {
          if (-72 == (ei.field_q ^ -1)) {
            if (wb.field_g == this.field_t) {
              if (fc.field_e[81]) {
                if ((ka.field_G[o.a((byte) 84, this.field_n)][25][1] ^ -1) < -2) {
                  dupTemp$26 = ka.field_G[o.a((byte) 84, this.field_n)][25];
                  dupTemp$26[1] = dupTemp$26[1] - 1;
                  break L27;
                } else {
                  break L27;
                }
              } else {
                if (1 < ka.field_G[o.a((byte) 84, this.field_n)][25][0]) {
                  dupTemp$27 = ka.field_G[o.a((byte) 84, this.field_n)][25];
                  dupTemp$27[0] = dupTemp$27[0] - 1;
                  break L27;
                } else {
                  break L27;
                }
              }
            } else {
              if (this.field_t != lc.field_g) {
                if (jh.field_d == this.field_t) {
                  if (!fc.field_e[81]) {
                    if (1 < ka.field_G[o.a((byte) 84, this.field_n)][25][5]) {
                      dupTemp$28 = ka.field_G[o.a((byte) 84, this.field_n)][25];
                      dupTemp$28[5] = dupTemp$28[5] - 1;
                      break L27;
                    } else {
                      break L27;
                    }
                  } else {
                    if ((ka.field_G[o.a((byte) 84, this.field_n)][25][6] ^ -1) >= -2) {
                      break L27;
                    } else {
                      dupTemp$29 = ka.field_G[o.a((byte) 84, this.field_n)][25];
                      dupTemp$29[6] = dupTemp$29[6] - 1;
                      break L27;
                    }
                  }
                } else {
                  break L27;
                }
              } else {
                if (-2 > (ka.field_G[o.a((byte) 84, this.field_n)][25][2] ^ -1)) {
                  dupTemp$30 = ka.field_G[o.a((byte) 84, this.field_n)][25];
                  dupTemp$30[2] = dupTemp$30[2] - 1;
                  break L27;
                } else {
                  break L27;
                }
              }
            }
          } else {
            break L27;
          }
        }
        L28: {
          if (-73 == (ei.field_q ^ -1)) {
            if (this.field_t != wb.field_g) {
              if (lc.field_g == this.field_t) {
                if (ka.field_G[o.a((byte) 84, this.field_n)][25][2] < 100) {
                  dupTemp$31 = ka.field_G[o.a((byte) 84, this.field_n)][25];
                  dupTemp$31[2] = dupTemp$31[2] + 1;
                  break L28;
                } else {
                  break L28;
                }
              } else {
                if (jh.field_d != this.field_t) {
                  break L28;
                } else {
                  if (!fc.field_e[81]) {
                    if (ka.field_G[o.a((byte) 84, this.field_n)][25][5] < 256) {
                      dupTemp$32 = ka.field_G[o.a((byte) 84, this.field_n)][25];
                      dupTemp$32[5] = dupTemp$32[5] + 1;
                      break L28;
                    } else {
                      break L28;
                    }
                  } else {
                    if (-26 >= (ka.field_G[o.a((byte) 84, this.field_n)][25][6] ^ -1)) {
                      break L28;
                    } else {
                      dupTemp$33 = ka.field_G[o.a((byte) 84, this.field_n)][25];
                      dupTemp$33[6] = dupTemp$33[6] + 1;
                      break L28;
                    }
                  }
                }
              }
            } else {
              if (fc.field_e[81]) {
                if (ka.field_G[o.a((byte) 84, this.field_n)][25][1] >= 25) {
                  break L28;
                } else {
                  dupTemp$34 = ka.field_G[o.a((byte) 84, this.field_n)][25];
                  dupTemp$34[1] = dupTemp$34[1] + 1;
                  break L28;
                }
              } else {
                if ((ka.field_G[o.a((byte) 84, this.field_n)][25][0] ^ -1) > -257) {
                  dupTemp$35 = ka.field_G[o.a((byte) 84, this.field_n)][25];
                  dupTemp$35[0] = dupTemp$35[0] + 1;
                  break L28;
                } else {
                  break L28;
                }
              }
            }
          } else {
            break L28;
          }
        }
    }

    final static void a(long param0, String param1, int param2, int param3, int param4) {
        kh.field_q = param0;
        if (param3 != -29368) {
            return;
        }
        try {
            wn.field_f = param4;
            hk.field_ic = param2;
            fi.field_t = param1;
            ob.field_v = true;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "qj.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0) {
        int fieldTemp$2 = 0;
        int[] discarded$3 = null;
        int var3 = 0;
        L0: {
          var3 = SteelSentinels.field_G;
          if (this.field_t == jm.field_o) {
            this.field_l.field_Lb = false;
            this.field_l.field_U = 0;
            this.field_l.field_oc = 0;
            break L0;
          } else {
            if (wb.field_g == this.field_t) {
              this.field_l.field_oc = 0;
              this.field_l.field_Lb = false;
              this.field_l.field_Pb = 0;
              this.field_l.field_U = 1;
              if (this.field_p != ja.field_i) {
                if (this.field_p == rb.field_j) {
                  this.field_l.field_mb = 0;
                  this.field_e = 0;
                  break L0;
                } else {
                  L1: {
                    this.field_k = this.field_k + 1;
                    if ((this.field_k ^ -1) >= -201) {
                      break L1;
                    } else {
                      this.field_k = this.field_k - 400;
                      break L1;
                    }
                  }
                  this.field_e = this.field_k * (ka.field_G[o.a((byte) 84, this.field_n)][25][0] * this.field_g) / (ka.field_G[o.a((byte) 84, this.field_n)][25][1] * 10);
                  this.field_e = (511 & this.field_e) - 256;
                  break L0;
                }
              } else {
                this.field_e = 0;
                break L0;
              }
            } else {
              if (lc.field_g != this.field_t) {
                if (this.field_t != qe.field_e) {
                  if (this.field_t != jh.field_d) {
                    break L0;
                  } else {
                    this.field_l.field_Lb = false;
                    this.field_l.field_Pb = 25;
                    this.field_l.field_oc = 0;
                    this.field_l.field_U = 1;
                    if (ja.field_i == this.field_p) {
                      this.field_e = 0;
                      break L0;
                    } else {
                      if (this.field_p == rb.field_j) {
                        this.field_l.field_mb = 0;
                        this.field_e = 0;
                        break L0;
                      } else {
                        L2: {
                          this.field_k = this.field_k + 1;
                          if (this.field_k <= 200) {
                            break L2;
                          } else {
                            this.field_k = this.field_k - 400;
                            break L2;
                          }
                        }
                        this.field_e = this.field_k * (ka.field_G[o.a((byte) 84, this.field_n)][25][5] * this.field_g) / (10 * ka.field_G[o.a((byte) 84, this.field_n)][25][6]);
                        this.field_e = -256 + (this.field_e & 511);
                        break L0;
                      }
                    }
                  }
                } else {
                  this.field_l.field_Lb = true;
                  this.field_l.field_ab = this.field_l.field_ab + 1;
                  this.field_l.field_oc = 0;
                  if (-51 > (this.field_l.field_ab ^ -1)) {
                    this.field_l.field_ab = -50;
                    break L0;
                  } else {
                    break L0;
                  }
                }
              } else {
                L3: {
                  fieldTemp$2 = this.field_l.field_oc;
                  this.field_l.field_oc = this.field_l.field_oc + 1;
                  if (fieldTemp$2 >= ka.field_G[o.a((byte) 84, this.field_n)][25][2]) {
                    this.field_l.field_oc = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                this.field_l.field_Lb = false;
                break L0;
              }
            }
          }
        }
        L4: {
          this.field_l.g(-18, this.field_n);
          if ((nc.field_d ^ -1) != -2) {
            break L4;
          } else {
            if ((this.field_w ^ -1) != 0) {
              L5: {
                if (this.field_f != this.field_w) {
                  this.field_f = this.field_w;
                  this.field_o = ka.field_G[o.a((byte) 84, this.field_n)][this.field_b][this.field_w];
                  break L5;
                } else {
                  break L5;
                }
              }
              ka.field_G[o.a((byte) 84, this.field_n)][this.field_b][this.field_w] = this.field_r;
              qa.field_J[this.field_b].d();
              pb.b();
              this.field_l.field_r = this.field_b;
              this.field_l.field_J = this.field_b;
              discarded$3 = this.field_l.f(this.field_n, 22742);
              this.field_l.a(128, 64, (byte) -116, rf.field_a);
              sb.field_bb.b((byte) 127);
              break L4;
            } else {
              break L4;
            }
          }
        }
        L6: {
          if (param0 > 43) {
            break L6;
          } else {
            qj.c(117);
            break L6;
          }
        }
    }

    final void d(int param0) {
        int[][] dupTemp$15 = null;
        int[] array$16 = null;
        int discarded$17 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5_ref_int__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        String var14 = null;
        String var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        String var20 = null;
        String var21 = null;
        String var22 = null;
        String var23 = null;
        String var24 = null;
        String var25 = null;
        String var26 = null;
        String var27 = null;
        String var28 = null;
        String var29 = null;
        int[] var30 = null;
        L0: {
          var11 = SteelSentinels.field_G;
          if (null == ka.field_G[o.a((byte) 84, this.field_n)]) {
            break L0;
          } else {
            if (ka.field_G[o.a((byte) 84, this.field_n)][25] != null) {
              L1: {
                pb.a(0, 0, 640, 380, 0);
                pb.a(0, 0, 640, 396);
                var4 = this.field_w;
                this.field_w = param0;
                if (this.field_l.field_Z.length <= 0) {
                  break L1;
                } else {
                  L2: {
                    var2 = 320;
                    var3 = 32;
                    var5_ref_int__ = ka.field_G[o.a((byte) 84, this.field_n)][this.field_b];
                    if (var5_ref_int__ == null) {
                      dupTemp$15 = ka.field_G[o.a((byte) 84, this.field_n)];
                      array$16 = new int[2 + this.field_l.field_Z.length];
                      dupTemp$15[this.field_b] = array$16;
                      var5_ref_int__ = array$16;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      var6 = var5_ref_int__.length;
                      if (var5_ref_int__ == null) {
                        break L4;
                      } else {
                        if (var6 != 2 + this.field_l.field_Z.length) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var30 = new int[2 + this.field_l.field_Z.length];
                    var13 = var30;
                    var12 = var13;
                    var5_ref_int__ = var12;
                    var8 = 0;
                    L5: while (true) {
                      if (var30.length <= var8) {
                        ka.field_G[o.a((byte) 84, this.field_n)][this.field_b] = var30;
                        break L3;
                      } else {
                        if (ka.field_G[o.a((byte) 84, this.field_n)][this.field_b].length > var8) {
                          var12[var8] = ka.field_G[o.a((byte) 84, this.field_n)][this.field_b][var8];
                          var8++;
                          continue L5;
                        } else {
                          var8++;
                          continue L5;
                        }
                      }
                    }
                  }
                  var7_int = 48;
                  var8 = 0;
                  L6: while (true) {
                    if (var8 >= var6) {
                      break L1;
                    } else {
                      L7: {
                        if (this.field_l.field_Z.length > var8) {
                          L8: {
                            pb.d(var2, var3, 2 * var7_int, 16777215);
                            pb.g(var2 + -3, var3 + var7_int, 7, 16777215);
                            var9 = var7_int * var5_ref_int__[var8] / 17763 + (var7_int + var3);
                            var10 = 16777215;
                            if (var5_ref_int__[var8] != 0) {
                              break L8;
                            } else {
                              var10 = 26248;
                              break L8;
                            }
                          }
                          L9: {
                            pb.c(var2, var9, 5, var10);
                            if (nc.field_d == 0) {
                              break L9;
                            } else {
                              if (var8 != var4) {
                                break L7;
                              } else {
                                break L9;
                              }
                            }
                          }
                          if (-5 + var2 > oh.field_f) {
                            break L7;
                          } else {
                            if (5 + var2 < oh.field_f) {
                              break L7;
                            } else {
                              if (var3 > pi.field_c) {
                                break L7;
                              } else {
                                if (pi.field_c > var7_int * 2 + var3) {
                                  break L7;
                                } else {
                                  L10: {
                                    this.field_r = (pi.field_c + -var3 + -var7_int) * 17763 / var7_int;
                                    this.field_w = var8;
                                    if (fc.field_e[81]) {
                                      this.field_r = 35526 * (pi.field_c - var3 - var7_int) / var7_int;
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  }
                                  L11: {
                                    if (Math.abs(-var7_int + (-var3 + pi.field_c)) > 1) {
                                      break L11;
                                    } else {
                                      this.field_r = 0;
                                      break L11;
                                    }
                                  }
                                  L12: {
                                    if (this.field_r == 0) {
                                      var10 = 26248;
                                      break L12;
                                    } else {
                                      break L12;
                                    }
                                  }
                                  pb.c(var2, var9, 6, var10);
                                  break L7;
                                }
                              }
                            }
                          }
                        } else {
                          if (var6 + -2 != var8) {
                            if (var8 == -1 + var6) {
                              L13: {
                                pb.g(var2, var3, var7_int * 2, 16777215);
                                pb.d(var7_int + var2, var3 - 3, 7, 16746496);
                                var9 = var7_int * var5_ref_int__[var8] / 2500 + var7_int + var2;
                                pb.c(var9, var3, 5, 16746496);
                                if (nc.field_d == 0) {
                                  break L13;
                                } else {
                                  if (var8 != var4) {
                                    break L7;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              if (oh.field_f < var2) {
                                break L7;
                              } else {
                                if (var7_int * 2 + var2 < oh.field_f) {
                                  break L7;
                                } else {
                                  if (-5 + var3 > pi.field_c) {
                                    break L7;
                                  } else {
                                    if (5 + var3 >= pi.field_c) {
                                      L14: {
                                        this.field_r = 2500 * (-var7_int + oh.field_f - var2) / var7_int;
                                        this.field_w = var8;
                                        if ((Math.abs(-var2 + oh.field_f + -var7_int) ^ -1) < -2) {
                                          break L14;
                                        } else {
                                          this.field_r = 0;
                                          break L14;
                                        }
                                      }
                                      pb.c(var9, var3, 6, 16746496);
                                      break L7;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L7;
                            }
                          } else {
                            L15: {
                              pb.d(var2, var3, 2 * var7_int, 16777215);
                              pb.g(-3 + var2, var3 + var7_int, 7, 16746496);
                              var9 = var7_int * var5_ref_int__[var8] / 2500 + var3 - -var7_int;
                              pb.c(var2, var9, 5, 16746496);
                              if (nc.field_d == 0) {
                                break L15;
                              } else {
                                if (var4 != var8) {
                                  break L7;
                                } else {
                                  break L15;
                                }
                              }
                            }
                            if (oh.field_f < -5 + var2) {
                              break L7;
                            } else {
                              if (5 + var2 < oh.field_f) {
                                break L7;
                              } else {
                                if (pi.field_c < var3) {
                                  break L7;
                                } else {
                                  if (var3 - -(2 * var7_int) >= pi.field_c) {
                                    L16: {
                                      this.field_r = (pi.field_c + -var3 - var7_int) * 2500 / var7_int;
                                      this.field_w = var8;
                                      if (1 < Math.abs(-var3 + pi.field_c - var7_int)) {
                                        break L16;
                                      } else {
                                        this.field_r = 0;
                                        break L16;
                                      }
                                    }
                                    pb.c(var2, var9, 6, 16746496);
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      var2 += 16;
                      var8++;
                      continue L6;
                    }
                  }
                }
              }
              L17: {
                var2 = 160;
                var3 = 380;
                if (this.field_t != jh.field_d) {
                  pb.a(-128 + var2, var3, 257, 64, 3351057);
                  break L17;
                } else {
                  var5 = 0;
                  L18: while (true) {
                    if (var5 >= 64) {
                      break L17;
                    } else {
                      pb.d(var2 - (64 - (1 & var5)), var3 - (-64 - var5 / 2), (1 & var5) + 128 + var2, var5 / 2 + (-128 + var3), 3351057);
                      var5++;
                      continue L18;
                    }
                  }
                }
              }
              L19: {
                var5 = ka.field_G[o.a((byte) 84, this.field_n)][25][0];
                var6 = ka.field_G[o.a((byte) 84, this.field_n)][25][1];
                if (this.field_l.field_Pb <= 0) {
                  break L19;
                } else {
                  var5 = ka.field_G[o.a((byte) 84, this.field_n)][25][5];
                  var6 = ka.field_G[o.a((byte) 84, this.field_n)][25][6];
                  break L19;
                }
              }
              L20: {
                if (this.field_t == wb.field_g) {
                  pb.f(var2, -192 + var3, 192, 16777215, 64);
                  pb.f(-64 + var2, -192 + var3, 192, 16777215, 64);
                  pb.f(var2 - -64, -192 + var3, 192, 16777215, 64);
                  var7_int = ka.field_G[o.a((byte) 84, this.field_n)][25][3];
                  pb.b(var2 - this.field_g * ((this.field_b - 1) * var5) / var6, 7 + var3, 7, 16777215, 255 + -((this.field_b + -1) * 256 / var7_int));
                  pb.b(var2 - (var5 * (this.field_b + -1) * this.field_g / var6 + this.field_g * (var5 * var7_int) / (var6 * 2)), var3 - -7, 7, 16711680, 128);
                  pb.b(-(var5 * (this.field_b - var7_int + -1) * this.field_g / var6) + var2, var3 - -7, 7, 16777215, (-var7_int + this.field_b - 1) * 256 / var7_int + 255);
                  pb.b(var2 - this.field_g * var5 * (this.field_b - (var7_int + 1)) / var6 - this.field_g * (var7_int * var5) / (var6 * 2), 7 + var3, 7, 16711680, 128);
                  break L20;
                } else {
                  if (jh.field_d != this.field_t) {
                    pb.e(var2, var3 + 7, 7, 16777215);
                    break L20;
                  } else {
                    pb.f(var2, var3 - 192, 192, 16777215, 64);
                    pb.f(var2 + -64, var3 - 192, 192, 16777215, 64);
                    pb.f(var2 - -64, var3 + -192, 192, 16777215, 64);
                    var7_int = ka.field_G[o.a((byte) 84, this.field_n)][25][7];
                    var8 = this.field_g * var5 * (this.field_b - 17) / var6;
                    pb.b(-var8 + var2, var8 + 7 + var3, 7, 16777215, 255 - (this.field_b + -17) * 256 / var7_int);
                    var8 = -(this.field_g * var7_int * var5 / (var6 * 2)) + this.field_g * (this.field_b + -17) * var5 / var6;
                    pb.b(-var8 + var2, var3 + (7 + var8), 7, 16711680, 128);
                    var8 = (this.field_b + (-var7_int + -17)) * (var5 * this.field_g) / var6;
                    pb.b(var2 + -var8, 7 + var3 - -var8, 7, 16777215, (-4352 + (-var7_int + this.field_b) * 256) / var7_int + 255);
                    var8 = this.field_g * (-var7_int + this.field_b - 17) * var5 / var6 + -(this.field_g * (var5 * var7_int) / (var6 * 2));
                    pb.b(var2 - var8, 7 + var3 - -var8, 7, 16711680, 128);
                    break L20;
                  }
                }
              }
              L21: {
                qa.field_J[this.field_b].c(var2 + -128, -256 + var3, 256, 256);
                var2 += 320;
                if (this.field_t == jh.field_d) {
                  var7_int = 0;
                  L22: while (true) {
                    if ((var7_int ^ -1) <= -65) {
                      break L21;
                    } else {
                      pb.d((1 & var7_int) + (var2 + -64), 64 + (var3 + var7_int / 2), 128 + (var2 - -(1 & var7_int)), var3 + (-128 + var7_int / 2), 3351057);
                      var7_int++;
                      continue L22;
                    }
                  }
                } else {
                  pb.a(-128 + var2, var3, 257, 64, 3351057);
                  break L21;
                }
              }
              L23: {
                pb.c();
                if (this.field_t == wb.field_g) {
                  L24: {
                    L25: {
                      pb.a(var2 + -128, 130, 128 + var2, var3);
                      if (0 > this.field_w) {
                        break L25;
                      } else {
                        if (this.field_l.field_Z.length <= this.field_w) {
                          break L25;
                        } else {
                          break L24;
                        }
                      }
                    }
                    this.field_l.a(var3, this.field_e + var2, (byte) -116, rm.field_n);
                    break L24;
                  }
                  L26: {
                    if (ja.field_i == this.field_p) {
                      var7_int = ka.field_G[o.a((byte) 84, this.field_n)][25][3];
                      pb.f(var2, -192 + var3, 192, 16777215, 64);
                      pb.f(var2 - 64, -192 + var3, 192, 16777215, 64);
                      pb.f(64 + var2, var3 - 192, 192, 16777215, 64);
                      pb.a(-128 + var2, 0, 128 + var2, 480);
                      var2 = var2 - this.field_g * var5 * (-50 + this.field_l.field_mb) / (50 * var6);
                      pb.b(var2 - this.field_g * (var5 * (this.field_l.field_r + -1)) / var6, 7 + var3, 7, 16777215, -(256 * (this.field_l.field_r + -1) / var7_int) + 255);
                      pb.b(-(this.field_g * (var7_int * var5) / (var6 * 2)) + var2 - var5 * (this.field_l.field_r - 1) * this.field_g / var6, 7 + var3, 7, 16711680, 128);
                      pb.b(-((-var7_int + (this.field_l.field_r - 1)) * (var5 * this.field_g) / var6) + var2, 7 + var3, 7, 16777215, (-256 + 256 * (this.field_l.field_r + -var7_int)) / var7_int + 255);
                      pb.b(var2 - this.field_g * (-var7_int + this.field_l.field_r - 1) * var5 / var6 - this.field_g * (var5 * var7_int) / (2 * var6), 7 + var3, 7, 16711680, 128);
                      pb.c();
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                  pb.c();
                  break L23;
                } else {
                  if (this.field_t == jh.field_d) {
                    L27: {
                      L28: {
                        pb.a(-128 + var2, 130, var2 - -128, var3);
                        if (0 > this.field_w) {
                          break L28;
                        } else {
                          if (this.field_w < this.field_l.field_Z.length) {
                            break L27;
                          } else {
                            break L28;
                          }
                        }
                      }
                      this.field_l.a(var3, var2 + this.field_e, (byte) -116, rm.field_n);
                      break L27;
                    }
                    L29: {
                      if (ja.field_i == this.field_p) {
                        var7_int = ka.field_G[o.a((byte) 84, this.field_n)][25][7];
                        pb.f(var2, var3 + -192, 192, 16777215, 64);
                        pb.f(-64 + var2, var3 + -192, 192, 16777215, 64);
                        pb.f(var2 + 64, -192 + var3, 192, 16777215, 64);
                        pb.a(-128 + var2, 0, var2 + 128, 480);
                        var2 = var2 - this.field_g * ((this.field_l.field_mb - 50) * var5) / (50 * var6);
                        var3 = var3 + var5 * (this.field_l.field_mb + -50) * this.field_g / (var6 * 50);
                        var8 = (-17 + this.field_l.field_r) * (var5 * this.field_g) / var6;
                        pb.b(var2 + -var8, 7 + var3 - -var8, 7, 16777215, -((this.field_l.field_r - 17) * 256 / var7_int) + 255);
                        var8 = -(this.field_g * var5 * var7_int / (2 * var6)) + this.field_g * var5 * (this.field_l.field_r + -17) / var6;
                        pb.b(-var8 + var2, var8 + (7 + var3), 7, 16711680, 128);
                        var8 = var5 * (this.field_l.field_r + -var7_int + -17) * this.field_g / var6;
                        pb.b(-var8 + var2, var3 - -7 + var8, 7, 16777215, 255 - -(256 * (this.field_l.field_r - (var7_int + 17)) / var7_int));
                        var8 = this.field_g * var5 * (-var7_int + (this.field_l.field_r - 17)) / var6 + -(this.field_g * (var5 * var7_int) / (2 * var6));
                        pb.b(var2 - var8, var8 + (var3 + 7), 7, 16711680, 128);
                        pb.c();
                        break L29;
                      } else {
                        break L29;
                      }
                    }
                    pb.c();
                    break L23;
                  } else {
                    pb.a(-128 + var2, 130, 128 + var2, var3);
                    pb.c();
                    pb.e(var2, var3 - -7, 7, 16777215);
                    break L23;
                  }
                }
              }
              L30: {
                var14 = "";
                var7 = var14;
                var7 = var14;
                var15 = var14 + "Animation Editor<br>P - Print data to console<br>";
                var7 = var15;
                var7 = var15;
                var7 = var15;
                if (this.field_t != jm.field_o) {
                  break L30;
                } else {
                  var7 = var15 + "<col=ffffff>";
                  break L30;
                }
              }
              L31: {
                var16 = var7 + "1 - Edit idle anim</col><br>";
                var7 = var16;
                var7 = var16;
                var7 = var16;
                if (wb.field_g == this.field_t) {
                  var7 = var16 + "<col=ffffff>";
                  break L31;
                } else {
                  break L31;
                }
              }
              L32: {
                var17 = var7 + "2 - Edit walk anim</col><br>";
                var7 = var17;
                var7 = var17;
                var7 = var17;
                if (lc.field_g == this.field_t) {
                  var7 = var17 + "<col=ffffff>";
                  break L32;
                } else {
                  break L32;
                }
              }
              L33: {
                var18 = var7 + "3 - Edit jump anim</col><br>";
                var7 = var18;
                var7 = var18;
                var7 = var18;
                if (qe.field_e != this.field_t) {
                  break L33;
                } else {
                  var7 = var18 + "<col=ffffff>";
                  break L33;
                }
              }
              L34: {
                var19 = var7 + "4 - Edit air anim</col><br>";
                var7 = var19;
                if (this.field_t == jh.field_d) {
                  var7 = var19 + "<col=ffffff>";
                  break L34;
                } else {
                  break L34;
                }
              }
              L35: {
                var20 = var7 + "5 - Edit climb anim</col><br>";
                var21 = var20 + "<br>Left and Right change frame<br>Use the sliders to change angles and positions.<br>C - select a frame to copy, CTRL+P - pastes a frame<br>";
                var7 = var21;
                if (this.field_t == wb.field_g) {
                  var22 = var21 + "S - show treadmill animation<br>M - show moving animation<br>F - show still frame<br>";
                  var23 = var22 + "Speed = " + var5 + " (<lt> and <gt> to change)<br>";
                  var24 = var23 + "Frame = " + (0 + this.field_b) + " of " + ka.field_G[o.a((byte) 84, this.field_n)][25][3] + " (arrow keys to change, + and - to change max frame no)<br>";
                  var7 = var24 + "FPS = " + ka.field_G[o.a((byte) 84, this.field_n)][25][1] + " (SHIFT + <lt> and <gt> to change)<br>";
                  break L35;
                } else {
                  break L35;
                }
              }
              L36: {
                if (this.field_t != lc.field_g) {
                  break L36;
                } else {
                  var25 = var7 + "S - show treadmill animation<br>M - show moving animation<br>";
                  var26 = var25 + "Frame = " + (1 + (this.field_b - 9)) + " of " + ka.field_G[o.a((byte) 84, this.field_n)][25][4] + " (arrow keys to change, + and - to change max frame no)<br>";
                  var7 = var26 + "Jump Animation Time = " + ka.field_G[o.a((byte) 84, this.field_n)][25][2] / 50 + "." + ka.field_G[o.a((byte) 84, this.field_n)][25][2] / 5 % 10 + ka.field_G[o.a((byte) 84, this.field_n)][25][2] * 2 % 10 + " secs (<lt> and <gt> to change)<br>";
                  break L36;
                }
              }
              L37: {
                if (jh.field_d == this.field_t) {
                  var27 = var7 + "S - show treadmill animation<br>M - show moving animation<br>F - show still frame<br>";
                  var28 = var27 + "Speed = " + var5 + " (<lt> and <gt> to change)<br>";
                  var29 = var28 + "Frame = " + (1 + (this.field_b - 17)) + " of " + ka.field_G[o.a((byte) 84, this.field_n)][25][7] + " (arrow keys to change, + and - to change max frame no)<br>";
                  var7 = var29 + "FPS = " + ka.field_G[o.a((byte) 84, this.field_n)][25][6] + " (SHIFT + <lt> and <gt> to change)<br>";
                  break L37;
                } else {
                  break L37;
                }
              }
              discarded$17 = dk.field_h.a(var7, 8, 8, 624, 100, 43724, 0, 0, 0, 12);
              return;
            } else {
              break L0;
            }
          }
        }
    }

    private qj() throws Throwable {
        throw new Error();
    }

    static {
        field_a = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_i = "Loading extra data";
        field_d = new String[]{"All scores", "My scores", "Best each"};
        field_v = new String[]{"Hyper reloader", "Health plus", "Infinite energy", "Impervious", "Speed", "Quadra-plating", "Quadra-damage", "EMP weapons", "MGFN", "Rocket strike", "1-Up"};
        field_u = "ALT+<img=26> drops target lock: On";
        field_m = "Please remove <%0> from your ignore list first.";
        field_j = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_q = new sk[105];
        field_c = "ENGINEERED";
        field_h = 0;
    }
}
