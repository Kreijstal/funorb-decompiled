/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke {
    boolean field_j;
    static int field_d;
    int field_o;
    private int field_k;
    static String field_n;
    boolean field_p;
    sk field_b;
    int field_c;
    int field_i;
    boolean field_g;
    private int field_t;
    private cl field_a;
    int field_y;
    ec[] field_f;
    boolean field_r;
    boolean field_s;
    private int field_u;
    int field_l;
    int field_m;
    int field_q;
    int[] field_v;
    static int[] field_h;
    private kc field_e;
    private int field_x;
    int field_w;
    int field_z;

    final static void e(byte param0) {
        String[][] dupTemp$6 = null;
        long[][] dupTemp$7 = null;
        int[][] dupTemp$8 = null;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        RuntimeException var1 = null;
        uf var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        kc var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        kn var6_ref_kn = null;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        RuntimeException decompiledCaughtException = null;
        var26 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 48) {
                break L1;
              } else {
                field_d = 90;
                break L1;
              }
            }
            L2: {
              var1_ref = de.field_V;
              var2 = var1_ref.d((byte) -106);
              if (var2 == 0) {
                var3 = var1_ref.e(param0 + -45);
                var4 = (kc) ((Object) dg.field_e.c((byte) -104));
                L3: while (true) {
                  L4: {
                    if (var4 == null) {
                      break L4;
                    } else {
                      if (~var4.field_n != ~var3) {
                        var4 = (kc) ((Object) dg.field_e.d(true));
                        continue L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (var4 != null) {
                    L5: {
                      var5 = var1_ref.d((byte) -19);
                      if (var5 != 0) {
                        var6 = var4.field_o;
                        rc.field_c[0].field_c = false;
                        rc.field_c[0].field_i = oa.field_f;
                        var7 = var4.field_v;
                        rc.field_c[0].field_f = null;
                        var8_int = 1;
                        L6: while (true) {
                          if (var8_int >= var5) {
                            dupTemp$6 = new String[3][var6];
                            var4.field_r = dupTemp$6;
                            var8 = dupTemp$6;
                            var9 = new String[3][var6];
                            dupTemp$7 = new long[3][var6];
                            var4.field_t = dupTemp$7;
                            var10 = dupTemp$7;
                            dupTemp$8 = new int[3][var6 * var7];
                            var4.field_u = dupTemp$8;
                            var11 = dupTemp$8;
                            var12 = 0;
                            var13 = 0;
                            var14 = 0;
                            var15 = 0;
                            var16 = 0;
                            var17 = 0;
                            var18 = var1_ref.d((byte) -68);
                            if (0 < var18) {
                              var19 = 0;
                              L7: while (true) {
                                if (var19 >= var18) {
                                  break L5;
                                } else {
                                  L8: {
                                    var20 = var1_ref.d((byte) -21);
                                    var21 = rc.field_c[var20].field_i;
                                    var22 = var1_ref.f((byte) -108);
                                    var24 = var1_ref.field_n;
                                    if (var6 > var19) {
                                      var8[0][var12] = var21;
                                      var9[0][var12] = rc.field_c[var20].field_f;
                                      var10[0][var12] = var22;
                                      var25 = 0;
                                      L9: while (true) {
                                        if (var7 <= var25) {
                                          var12++;
                                          break L8;
                                        } else {
                                          incrementValue$9 = var15;
                                          var15++;
                                          var11[0][incrementValue$9] = var1_ref.i(qm.b((int) param0, 7601));
                                          var25++;
                                          continue L9;
                                        }
                                      }
                                    } else {
                                      break L8;
                                    }
                                  }
                                  L10: {
                                    if (var21 == null) {
                                      break L10;
                                    } else {
                                      if (k.a(var21, true)) {
                                        var8[1][var13] = oa.field_f;
                                        var9[1][var13] = null;
                                        var10[1][var13] = var22;
                                        var13++;
                                        var1_ref.field_n = var24;
                                        var25 = 0;
                                        L11: while (true) {
                                          if (~var25 <= ~var7) {
                                            break L10;
                                          } else {
                                            incrementValue$10 = var16;
                                            var16++;
                                            var11[1][incrementValue$10] = var1_ref.i(7553);
                                            var25++;
                                            continue L11;
                                          }
                                        }
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                  L12: {
                                    if (var14 >= var6) {
                                      break L12;
                                    } else {
                                      if (!rc.field_c[var20].field_c) {
                                        rc.field_c[var20].field_c = true;
                                        var8[2][var14] = var21;
                                        var9[2][var14] = rc.field_c[var20].field_f;
                                        var10[2][var14] = var22;
                                        var14++;
                                        var1_ref.field_n = var24;
                                        var25 = 0;
                                        L13: while (true) {
                                          if (~var7 >= ~var25) {
                                            break L12;
                                          } else {
                                            incrementValue$11 = var17;
                                            var17++;
                                            var11[2][incrementValue$11] = var1_ref.i(7553);
                                            var25++;
                                            continue L13;
                                          }
                                        }
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  var19++;
                                  continue L7;
                                }
                              }
                            } else {
                              break L5;
                            }
                          } else {
                            L14: {
                              rc.field_c[var8_int].field_i = var1_ref.c((byte) -38);
                              rc.field_c[var8_int].field_c = false;
                              if (var1_ref.d((byte) -48) != 1) {
                                rc.field_c[var8_int].field_f = null;
                                break L14;
                              } else {
                                rc.field_c[var8_int].field_f = var1_ref.c((byte) -38);
                                break L14;
                              }
                            }
                            var8_int++;
                            continue L6;
                          }
                        }
                      } else {
                        break L5;
                      }
                    }
                    var4.field_p = true;
                    var4.b((byte) 107);
                    break L2;
                  } else {
                    si.a(param0 ^ 121);
                    return;
                  }
                }
              } else {
                if (var2 == 1) {
                  var3 = var1_ref.e(3);
                  var4_long = var1_ref.f((byte) -108);
                  var6_ref_kn = (kn) ((Object) pb.field_c.c((byte) 114));
                  L15: while (true) {
                    L16: {
                      if (var6_ref_kn == null) {
                        break L16;
                      } else {
                        if (~var6_ref_kn.field_u != ~var3) {
                          var6_ref_kn = (kn) ((Object) pb.field_c.d(true));
                          continue L15;
                        } else {
                          break L16;
                        }
                      }
                    }
                    if (var6_ref_kn != null) {
                      var6_ref_kn.field_o = var4_long;
                      var6_ref_kn.b((byte) 101);
                      break L2;
                    } else {
                      si.a(103);
                      return;
                    }
                  }
                } else {
                  qb.a((Throwable) null, 16408, "HS1: " + qk.d((byte) 30));
                  si.a(122);
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1), "ke.JA(" + param0 + ')');
        }
    }

    final void g(int param0) {
        boolean discarded$1 = false;
        int var3 = 0;
        L0: {
          var3 = client.field_A ? 1 : 0;
          if (20 != this.field_o) {
            break L0;
          } else {
            h.a(-109);
            break L0;
          }
        }
        h.a((ke) (this), (byte) 95);
        L1: while (true) {
          if (!ab.c((byte) -128)) {
            L2: {
              this.field_b.a(this.a(param0 ^ 2712, bh.field_g, pm.field_f), -20563, this.a(400, he.field_S, nf.field_h));
              if (param0 == 2824) {
                break L2;
              } else {
                this.field_m = 44;
                break L2;
              }
            }
            discarded$1 = this.a(true, (byte) -33);
            return;
          } else {
            this.field_b.d(0);
            if (wh.field_c == 13) {
              nm.f(115);
              nk.field_k = false;
              kf.field_G.c(param0 + -2825, false);
              return;
            } else {
              L3: {
                L4: {
                  if (96 == wh.field_c) {
                    break L4;
                  } else {
                    if (wh.field_c == 98) {
                      break L4;
                    } else {
                      break L3;
                    }
                  }
                }
                if (0 < this.field_t) {
                  this.m(param0 ^ -8255);
                  this.field_b.a(1, (byte) -90);
                  this.field_b.field_o = false;
                  break L3;
                } else {
                  break L3;
                }
              }
              L5: {
                L6: {
                  if (wh.field_c == 97) {
                    break L6;
                  } else {
                    if (wh.field_c != 99) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                if (3 > this.field_t) {
                  this.n(87);
                  this.field_b.a(1, (byte) -66);
                  this.field_b.field_o = false;
                  break L5;
                } else {
                  break L5;
                }
              }
              if (this.a(false, (byte) -33)) {
                return;
              } else {
                continue L1;
              }
            }
          }
        }
    }

    final void f(byte param0) {
        boolean discarded$1 = false;
        int var2 = 0;
        int var4 = 0;
        var4 = client.field_A ? 1 : 0;
        h.a((ke) (this), (byte) 95);
        var2 = 74 / ((71 - param0) / 39);
        L0: while (true) {
          if (!ab.c((byte) -119)) {
            this.field_b.a(this.a(400, bh.field_g, pm.field_f), -20563, this.a(400, he.field_S, nf.field_h));
            discarded$1 = this.b(true, 1);
            return;
          } else {
            if (wh.field_c != 13) {
              L1: {
                if (ph.n(-30146)) {
                  this.field_b.a(-38);
                  break L1;
                } else {
                  L2: {
                    this.field_b.d(0);
                    if (wh.field_c != 96) {
                      break L2;
                    } else {
                      fc.field_e = (3 + fc.field_e + -1) % 3;
                      this.field_b.a(fc.field_e, (byte) -79);
                      nm.f(124);
                      this.field_b.field_o = false;
                      break L2;
                    }
                  }
                  L3: {
                    if (wh.field_c == 97) {
                      fc.field_e = (1 + fc.field_e) % 3;
                      this.field_b.a(fc.field_e, (byte) -81);
                      nm.f(117);
                      this.field_b.field_o = false;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (wh.field_c == 98) {
                      if (3 != this.field_b.field_h) {
                        this.field_b.a(3, (byte) -125);
                        break L4;
                      } else {
                        this.field_b.a(fc.field_e, (byte) -103);
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  if (99 != wh.field_c) {
                    break L1;
                  } else {
                    L5: {
                      if (this.field_b.field_h < 0) {
                        break L5;
                      } else {
                        if (this.field_b.field_h >= 3) {
                          break L5;
                        } else {
                          this.field_b.a(3, (byte) -95);
                          break L1;
                        }
                      }
                    }
                    this.field_b.a(fc.field_e, (byte) -110);
                    break L1;
                  }
                }
              }
              if (!this.b(false, 1)) {
                continue L0;
              } else {
                return;
              }
            } else {
              nm.f(-26);
              mg.field_Zb = false;
              qi.a(false, (byte) -108);
              return;
            }
          }
        }
    }

    private final int a(int param0, int param1, int param2) {
        int var5 = 0;
        ec var6 = null;
        int var7 = client.field_A ? 1 : 0;
        int var4 = 640 - (640 * this.field_o * this.field_o / param0 + (this.field_u >> 2));
        param1 = param1 - var4;
        for (var5 = 0; ~var5 > ~this.field_b.field_l; var5++) {
            var6 = this.field_f[var5];
            if (~var6.field_l >= ~param1) {
                if (~(var6.field_n + var6.field_l) < ~param1) {
                    if (var6.field_m <= param2) {
                        if (!(~param2 <= ~(var6.field_m - -var6.field_r))) {
                            return var5;
                        }
                    }
                }
            }
        }
        return -1;
    }

    private final int b(boolean param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        L0: {
          var11 = client.field_A ? 1 : 0;
          var3 = -(640 * this.field_o * this.field_o / 400) + (640 + -(this.field_u >> 2));
          var4 = -1;
          var5 = rc.a(cm.field_b, (byte) 47, this.field_v);
          var12 = rc.a(cm.field_a, (byte) 47, var5);
          var7 = -((jh.a(var12, 120) - 1) * 18) + 304;
          var8 = 80;
          if (this.field_i != 0) {
            L1: {
              var13 = eg.a(cm.field_a, this.field_v, (byte) 106);
              var7 = 304 - (jh.a(var13, 95) - 1) * 18;
              if (tf.a((byte) 103, var13)) {
                break L1;
              } else {
                var8 -= 20;
                break L1;
              }
            }
            if (af.a(0, var13, this.field_v)) {
              var8 += 20;
              break L0;
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
        var7 = var7 + var3;
        var9 = 0;
        L2: while (true) {
          if (31 <= var9) {
            L3: {
              if (this.field_k < 0) {
                break L3;
              } else {
                var4 = this.field_k;
                break L3;
              }
            }
            return var4;
          } else {
            L4: {
              if (var9 == 15) {
                L5: {
                  var7 = 34;
                  var8 += 40;
                  if (this.field_i == 0) {
                    break L5;
                  } else {
                    var10 = eg.a(this.field_v, cm.field_h, (byte) 105);
                    var7 = -(18 * jh.a(var10, 96)) + 322;
                    break L5;
                  }
                }
                var7 = var7 + var3;
                break L4;
              } else {
                break L4;
              }
            }
            L6: {
              if (0 == this.field_i) {
                break L6;
              } else {
                if (!fb.a(var9, 10040319, this.field_v)) {
                  break L6;
                } else {
                  var9++;
                  continue L2;
                }
              }
            }
            if (!rb.a(-23, var9, var5)) {
              if (param0) {
                if (~var7 >= ~he.field_S) {
                  if (he.field_S < 32 + var7) {
                    if (nf.field_h >= var8) {
                      if (~nf.field_h > ~(32 + var8)) {
                        if (var9 != this.field_k) {
                          this.field_k = var9;
                          var7 += 36;
                          var9++;
                          continue L2;
                        } else {
                          this.field_k = -1;
                          var7 += 36;
                          var9++;
                          continue L2;
                        }
                      } else {
                        var7 += 36;
                        var9++;
                        continue L2;
                      }
                    } else {
                      var7 += 36;
                      var9++;
                      continue L2;
                    }
                  } else {
                    var7 += 36;
                    var9++;
                    continue L2;
                  }
                } else {
                  var7 += 36;
                  var9++;
                  continue L2;
                }
              } else {
                if (var9 != this.field_k) {
                  L7: {
                    if (bh.field_g < var7) {
                      break L7;
                    } else {
                      if (~(32 + var7) >= ~bh.field_g) {
                        break L7;
                      } else {
                        if (~var8 < ~pm.field_f) {
                          break L7;
                        } else {
                          if (pm.field_f >= 32 + var8) {
                            break L7;
                          } else {
                            L8: {
                              if (!rb.a(-113, var9, this.field_v)) {
                                vg.field_h.b(-2 + var7, var8 - 2, 36, 36);
                                break L8;
                              } else {
                                uf.field_y[var9].a(var7 - 2, -2 + var8, 36, 36);
                                break L8;
                              }
                            }
                            var4 = var9;
                            var7 += 36;
                            var9++;
                            continue L2;
                          }
                        }
                      }
                    }
                  }
                  if (!rb.a(-28, var9, this.field_v)) {
                    vg.field_h.b(var7, var8, 32, 32);
                    var7 += 36;
                    var9++;
                    continue L2;
                  } else {
                    tl.field_w[var9].c(var7, var8);
                    var7 += 36;
                    var9++;
                    continue L2;
                  }
                } else {
                  if (rb.a(-112, var9, this.field_v)) {
                    uf.field_y[var9].a(var7 - 4, -4 + var8, 40, 40);
                    var7 += 36;
                    var9++;
                    continue L2;
                  } else {
                    vg.field_h.b(-4 + var7, var8 - 4, 40, 40);
                    var7 += 36;
                    var9++;
                    continue L2;
                  }
                }
              }
            } else {
              var9++;
              continue L2;
            }
          }
        }
    }

    final void j(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = client.field_A ? 1 : 0;
        var2 = 2147483647;
        var3 = 2147483647;
        var4 = -2147483648;
        var5 = -2147483648;
        var6 = -99 % ((-41 - param0) / 33);
        var7 = 0;
        L0: while (true) {
          if (~this.field_b.field_l >= ~var7) {
            this.field_w = -30 + var2;
            this.field_z = -20 + var3;
            this.field_y = var4 - -30 + -this.field_w;
            this.field_q = var5 - (-20 - -this.field_z);
            return;
          } else {
            L1: {
              if (var2 > this.field_f[var7].field_l) {
                var2 = this.field_f[var7].field_l;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_f[var7].field_n + this.field_f[var7].field_l > var4) {
                var4 = this.field_f[var7].field_l - -this.field_f[var7].field_n;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (~var5 <= ~(this.field_f[var7].field_r + this.field_f[var7].field_m)) {
                break L3;
              } else {
                var5 = this.field_f[var7].field_m - -this.field_f[var7].field_r;
                break L3;
              }
            }
            L4: {
              if (~this.field_f[var7].field_m > ~var3) {
                var3 = this.field_f[var7].field_m;
                break L4;
              } else {
                break L4;
              }
            }
            var7++;
            continue L0;
          }
        }
    }

    final void c(int param0) {
        this.e(16687906);
        this.b(58);
        if (param0 != 2) {
            this.k(-125);
        }
    }

    private final boolean a(boolean param0, byte param1) {
        int var3 = 0;
        L0: {
          this.h(99);
          var3 = -1;
          if (0 > this.field_b.field_h) {
            break L0;
          } else {
            var3 = this.field_f[this.field_b.field_h].field_d;
            break L0;
          }
        }
        L1: {
          if (var3 != 26) {
            break L1;
          } else {
            if (this.field_t == 3) {
              var3 = -1;
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (var3 != 25) {
            break L2;
          } else {
            if (this.field_t == 0) {
              var3 = -1;
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          L4: {
            if (var3 == 13) {
              break L4;
            } else {
              if (param0) {
                break L3;
              } else {
                break L4;
              }
            }
          }
          if (this.field_b.b((byte) 114)) {
            nk.field_k = false;
            kf.field_G.c(-1, param0);
            nm.f(123);
            return true;
          } else {
            break L3;
          }
        }
        L5: {
          if (25 != var3) {
            break L5;
          } else {
            if (!this.field_b.b((byte) 114)) {
              break L5;
            } else {
              this.m(-11063);
              break L5;
            }
          }
        }
        L6: {
          if (var3 != 26) {
            break L6;
          } else {
            if (this.field_b.b((byte) 114)) {
              this.n(-77);
              break L6;
            } else {
              return false;
            }
          }
        }
        return false;
    }

    final static void o(int param0) {
        pk.field_r = 0;
        jg.field_i = true;
    }

    final void a(ec param0, int param1) {
        int fieldTemp$0 = 0;
        try {
            if (param1 <= 98) {
                this.b(98);
            }
            fieldTemp$0 = this.field_b.field_l;
            this.field_b.field_l = this.field_b.field_l + 1;
            this.field_f[fieldTemp$0] = param0;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "ke.OA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              hk.a(param0, param1, 1 + param2, 10000536);
              hk.a(param0, param3 + param1, 1 + param2, 12105912);
              var5_int = 1;
              if (param1 - -var5_int >= hk.field_h) {
                break L1;
              } else {
                var5_int = -param1 + hk.field_h;
                break L1;
              }
            }
            L2: {
              var6 = param3;
              if (param1 + var6 > hk.field_b) {
                var6 = -param1 + hk.field_b;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param4 >= 98) {
                break L3;
              } else {
                field_n = (String) null;
                break L3;
              }
            }
            var7 = var5_int;
            L4: while (true) {
              if (~var6 >= ~var7) {
                break L0;
              } else {
                var8 = 152 - -(var7 * 48 / param3);
                var9 = var8 << 16 | var8 << 8 | var8;
                hk.field_l[(param1 - -var7) * hk.field_j + param0] = var9;
                hk.field_l[param0 + (var7 + param1) * hk.field_j + param2] = var9;
                var7++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var5), "ke.W(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = client.field_A ? 1 : 0;
        for (var3 = 0; ~var3 > ~this.field_b.field_l; var3++) {
            this.field_f[var3].field_m = this.field_f[var3].field_m + param0;
        }
        this.field_b.a(this.a(400, bh.field_g, pm.field_f), -20563, this.a(400, he.field_S, nf.field_h));
        int var5 = 0;
        var3 = var5;
        while (this.field_b.field_l > var5) {
            this.field_f[var5].field_m = this.field_f[var5].field_m - param0;
            var5++;
        }
        if (param1 <= 120) {
            this.field_i = 13;
        }
        boolean discarded$0 = this.p(-1);
    }

    private final void b(int param0) {
        int var2 = -(this.field_u >> 2) + (640 + -(640 * (this.field_o * this.field_o) / 400));
        if (param0 < 49) {
            this.field_r = false;
        }
        ck var3 = ng.field_b;
        var3.c(320 - var3.field_K / 2, -(var2 >> 2) + (50 + -(var3.field_C / 2)));
        hk.a(var2 + 4 + this.field_w, this.field_z + 4, -8 + this.field_y, -8 + this.field_q, 0, 150);
        vk.a(this.field_q, (byte) 50, a.field_n, this.field_y, this.field_z, var2 + this.field_w);
        kn.a(w.field_kb, (byte) -39, 362, ve.c(this.field_t, 26135), 16777215, 560 + var2);
        wk.a(72, this.field_t, var2);
    }

    final void h(byte param0) {
        int discarded$1 = 0;
        int var2 = 0;
        ck var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        String stackIn_21_3 = null;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        String stackOut_20_3 = null;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        String stackOut_19_3 = null;
        L0: {
          var10 = client.field_A ? 1 : 0;
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (this.field_b.field_l < 3) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          this.a(stackIn_3_1 != 0, 15764);
          var2 = 640 + (-(640 * (this.field_o * this.field_o) / 400) + -(this.field_u >> 2));
          var3 = client.field_C[this.field_i];
          if (param0 >= 23) {
            break L1;
          } else {
            this.field_z = -77;
            break L1;
          }
        }
        L2: {
          var3.c(-(var3.field_K / 2) + 320, -(var3.field_C / 2) + 40 - (var2 >> 2));
          var4 = this.b(false, (byte) -51);
          if (var4 < 0) {
            ed.a(16777215, var2 + 320, v.field_e, 200, (byte) 75, w.field_kb);
            break L2;
          } else {
            L3: {
              ed.a(16777215, 320 - -var2, qk.field_s[var4], 200, (byte) 75, w.field_kb);
              var5 = rb.a(-35, var4, this.field_v) ? 1 : 0;
              if (var5 == 0) {
                if (rb.a(-28, var4, cm.field_g)) {
                  stackOut_10_0 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  break L3;
                } else {
                  stackOut_9_0 = 0;
                  stackIn_12_0 = stackOut_9_0;
                  break L3;
                }
              } else {
                stackOut_7_0 = 0;
                stackIn_12_0 = stackOut_7_0;
                break L3;
              }
            }
            L4: {
              var6 = stackIn_12_0;
              if (var5 == 0) {
                vg.field_h.c(256 + var2, 210);
                break L4;
              } else {
                uf.field_y[var4].c(var2 + 256, 210);
                break L4;
              }
            }
            L5: {
              if (var6 == 0) {
                var7 = jh.field_c[var4];
                break L5;
              } else {
                var7 = sb.field_t;
                break L5;
              }
            }
            L6: {
              var8 = se.field_S.a(var7, 171);
              discarded$1 = ga.a(171, 0, -se.field_S.field_R + 274 + -(var8 * 8), var7, 16, 1000, 16769088, se.field_S, (byte) -124, 0, var2 + 80);
              stackOut_18_0 = 8 * var8 + 282;
              stackOut_18_1 = 256;
              stackOut_18_2 = 16777215;
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              if (var5 != 0) {
                stackOut_20_0 = stackIn_20_0;
                stackOut_20_1 = stackIn_20_1;
                stackOut_20_2 = stackIn_20_2;
                stackOut_20_3 = ne.field_b;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                stackIn_21_2 = stackOut_20_2;
                stackIn_21_3 = stackOut_20_3;
                break L6;
              } else {
                stackOut_19_0 = stackIn_19_0;
                stackOut_19_1 = stackIn_19_1;
                stackOut_19_2 = stackIn_19_2;
                stackOut_19_3 = j.field_a;
                stackIn_21_0 = stackOut_19_0;
                stackIn_21_1 = stackOut_19_1;
                stackIn_21_2 = stackOut_19_2;
                stackIn_21_3 = stackOut_19_3;
                break L6;
              }
            }
            fl.a(stackIn_21_0, stackIn_21_1, stackIn_21_2, stackIn_21_3, 80 + var2, w.field_kb);
            kn.a(se.field_S, (byte) -39, 271, jd.field_Xb, 16777215, var2 + 500);
            kn.a(se.field_S, (byte) -39, 289, me.field_B, 16777215, 500 - -var2);
            if (var6 == 0) {
              fl.a(271, 256, 16769088, Integer.toString(on.field_g[var4]), var2 + 500, se.field_S);
              var9 = 0;
              L7: while (true) {
                if (vb.field_X[var4] <= var9) {
                  break L2;
                } else {
                  rn.field_c.c(var9 * 5 + (var2 + 500), 274);
                  var9++;
                  continue L7;
                }
              }
            } else {
              fl.a(271, 256, 16769088, "???", 500 - -var2, se.field_S);
              fl.a(289, 256, 16769088, "???", var2 + 500, se.field_S);
              break L2;
            }
          }
        }
        L8: {
          if (ph.n(-30146)) {
            ed.a(16777215, var2 + 320, lf.field_d, 360, (byte) 75, se.field_S);
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          if (rb.a(-80, 5, this.field_v)) {
            ed.a(16777215, 320 - -var2, ph.field_Cb, 360, (byte) 75, se.field_S);
            break L9;
          } else {
            break L9;
          }
        }
    }

    private final boolean a(int param0, boolean param1) {
        int var3 = 0;
        L0: {
          this.h(118);
          var3 = -1;
          if (this.field_b.field_h >= 0) {
            var3 = this.field_f[this.field_b.field_h].field_d;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (var3 != 20) {
            break L1;
          } else {
            if (this.field_b.b((byte) 114)) {
              og.a(false, 6, true);
              nm.f(124);
              return true;
            } else {
              break L1;
            }
          }
        }
        L2: {
          L3: {
            if (var3 == 13) {
              break L3;
            } else {
              if (param1) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          if (this.field_b.b((byte) 114)) {
            ve.field_Hc = false;
            qi.a(param1, (byte) -111);
            nm.f(15);
            return true;
          } else {
            break L2;
          }
        }
        L4: {
          if (!param1) {
            break L4;
          } else {
            if (ig.field_Yb == 0) {
              break L4;
            } else {
              if (this.field_b.field_h == -1) {
                break L4;
              } else {
                cj.field_c = this.field_b.field_h;
                this.field_b.a(cj.field_c, (byte) -109);
                nm.f(125);
                return true;
              }
            }
          }
        }
        return false;
    }

    final void b(byte param0) {
        int var2 = 0;
        ck var3 = null;
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        String[] var7_ref_String__ = null;
        int var7 = 0;
        int[] var8_ref_int__ = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        L0: {
          var14 = client.field_A ? 1 : 0;
          var2 = -(this.field_u >> 2) + (-(640 * this.field_o * this.field_o / 400) + 640);
          this.a(false, 15764);
          var3 = ij.field_d;
          var3.c(320 + -(var3.field_K / 2), 45 - var3.field_C / 2 + -(var2 >> 2));
          if (null != this.field_e) {
            break L0;
          } else {
            if (ph.n(-30146)) {
              break L0;
            } else {
              this.field_e = am.a(3, false, 1, 0, 10);
              break L0;
            }
          }
        }
        var4 = bf.a((byte) 107, gh.field_e, fc.field_e, this.field_e);
        fl.a(105, 256, 16777215, vm.field_x, var2 + 125, w.field_kb);
        fl.a(105, 256, 16777215, a.field_x, 333 + var2, w.field_kb);
        kn.a(w.field_kb, (byte) -39, 105, sl.field_b, 16777215, 545 - -var2);
        if (param0 <= -42) {
          var5_int = 0;
          L1: while (true) {
            if (var5_int >= 10) {
              L2: {
                var5 = le.field_r;
                var6 = 1;
                if (null != this.field_e) {
                  if (this.field_e.field_p) {
                    L3: {
                      if (null != this.field_e.field_r) {
                        var7_ref_String__ = this.field_e.field_r[fc.field_e];
                        var8_ref_int__ = this.field_e.field_u[fc.field_e];
                        var9 = 0;
                        L4: while (true) {
                          if (var9 >= 10) {
                            break L3;
                          } else {
                            if (var7_ref_String__[var9] != null) {
                              L5: {
                                var5 = null;
                                var10 = 16769088;
                                var11 = var8_ref_int__[var9];
                                var12 = var11 % 8;
                                var13 = var11 / 8;
                                if (~var4 == ~var9) {
                                  var10 = 16777215;
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                              fl.a(var9 * 20 + 130, 256, var10, var7_ref_String__[var9], 125 - -var2, se.field_S);
                              kn.a(se.field_S, (byte) -39, 130 + var9 * 20, cm.a((byte) 106, kk.field_q, new String[]{Integer.toString(var12 + 1)}), var10, 350 - -var2);
                              fl.a(130 - -(var9 * 20), 256, var10, md.field_U[var12], var2 + 350, se.field_S);
                              kn.a(se.field_S, (byte) -39, 20 * var9 + 130, Integer.toString(var13), var10, 545 + var2);
                              var9++;
                              continue L4;
                            } else {
                              var9++;
                              continue L4;
                            }
                          }
                        }
                      } else {
                        var5 = dn.field_s;
                        break L3;
                      }
                    }
                    if (0 <= var4) {
                      break L2;
                    } else {
                      if (gh.field_e == null) {
                        break L2;
                      } else {
                        if (gh.field_e.field_x != 0) {
                          break L2;
                        } else {
                          fl.a(330, 256, 16777215, oa.field_f, 125 + var2, se.field_S);
                          var7 = gh.field_e.field_s[0];
                          var8 = var7 % 8;
                          var9 = var7 / 8;
                          kn.a(se.field_S, (byte) -39, 330, cm.a((byte) 81, kk.field_q, new String[]{Integer.toString(1 + var8)}), 16777215, var2 + 350);
                          fl.a(330, 256, 16777215, md.field_U[var8], 350 + var2, se.field_S);
                          kn.a(se.field_S, (byte) -39, 330, Integer.toString(var9), 16777215, var2 + 545);
                          var6 = 0;
                          break L2;
                        }
                      }
                    }
                  } else {
                    var5 = wm.field_k;
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              L6: {
                if (var5 != null) {
                  ed.a(16777215, 320 - -var2, var5, 220, (byte) 75, w.field_kb);
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (ph.n(-30146)) {
                  ed.a(16777215, 320 - -var2, lf.field_d, 330, (byte) 75, se.field_S);
                  break L7;
                } else {
                  if (var6 != 0) {
                    ed.a(16777215, var2 + 320, af.field_e, 330, (byte) 75, se.field_S);
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              return;
            } else {
              var6 = 16777215;
              kn.a(w.field_kb, (byte) -39, 130 + 20 * var5_int, 1 + var5_int + ".", var6, var2 + 115);
              var5_int++;
              continue L1;
            }
          }
        } else {
          return;
        }
    }

    final void f(int param0) {
        int var2 = 0;
        ck var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          this.a(true, param0 ^ -23361);
          var2 = -(this.field_u >> 2) + 640 + -(640 * this.field_o * this.field_o / 400);
          var3 = l.field_j;
          var3.c(320 - var3.field_K / 2, -(var2 >> 2) + (this.field_z / 2 - (-2 - -(var3.field_C / 2))));
          if (param0 == -26325) {
            break L0;
          } else {
            this.field_q = -96;
            break L0;
          }
        }
        L1: {
          if (this.field_g) {
            stackOut_4_0 = 23;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = 0;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        var4 = stackIn_5_0;
        hk.a(var2 + (4 + this.field_w), -8 + (this.field_q + this.field_z), -8 + this.field_y, var4 + 142, 0, 150);
        vk.a(var4 + 150, (byte) 50, a.field_n, this.field_y, -13 + this.field_z + this.field_q, var2 + this.field_w);
        fc.a(this.field_q + this.field_z, (byte) 5, this.field_g, var2 + 185);
        nf.a(this.field_l, var2 + 333, (byte) 74, this.field_q + this.field_z, this.field_m);
    }

    final void k(int param0) {
        boolean discarded$2 = false;
        int var3 = 0;
        L0: {
          var3 = client.field_A ? 1 : 0;
          h.a((ke) (this), (byte) 95);
          if (param0 == 128) {
            break L0;
          } else {
            this.field_v = (int[]) null;
            break L0;
          }
        }
        if (mn.field_c) {
          return;
        } else {
          L1: while (true) {
            if (!ab.c((byte) 26)) {
              this.field_b.a(this.a(400, bh.field_g, pm.field_f), -20563, this.a(param0 + 272, he.field_S, nf.field_h));
              discarded$2 = this.d(-108, true);
              return;
            } else {
              L2: {
                if (13 != wh.field_c) {
                  break L2;
                } else {
                  if (!this.field_p) {
                    break L2;
                  } else {
                    nm.f(27);
                    cd.a(true);
                    return;
                  }
                }
              }
              this.field_b.a(-127);
              if (!this.d(-109, false)) {
                continue L1;
              } else {
                return;
              }
            }
          }
        }
    }

    final void d(byte param0) {
        int var2 = 0;
        ck var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        String[] var10_ref_String__ = null;
        int var11 = 0;
        int[] var11_ref_int__ = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        L0: {
          var14 = client.field_A ? 1 : 0;
          var2 = -(this.field_u >> 2) + (-(this.field_o * (this.field_o * 640) / 400) + 640);
          this.a(false, 15764);
          var3 = ad.field_g;
          var3.c(-(var3.field_K / 2) + 320, -(var3.field_C / 2) + (45 + -(var2 >> 2)));
          if (this.field_a != null) {
            break L0;
          } else {
            if (ph.n(-30146)) {
              break L0;
            } else {
              this.field_a = ai.a(7, 10, (byte) -111, 0);
              break L0;
            }
          }
        }
        L1: {
          if (kd.field_p != 3) {
            stackOut_5_0 = 310;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 305;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var4 = stackIn_6_0;
          if (kd.field_p == 3) {
            stackOut_8_0 = 372;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 380;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var5 = stackIn_9_0;
          if (kd.field_p == 3) {
            stackOut_11_0 = 427;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = 435;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        L4: {
          var6 = stackIn_12_0;
          if (kd.field_p == 3) {
            stackOut_14_0 = 488;
            stackIn_15_0 = stackOut_14_0;
            break L4;
          } else {
            stackOut_13_0 = 490;
            stackIn_15_0 = stackOut_13_0;
            break L4;
          }
        }
        L5: {
          var7 = stackIn_15_0;
          fl.a(105, 256, 16777215, vm.field_x, 125 + var2, w.field_kb);
          kn.a(w.field_kb, (byte) -39, 105, ga.field_a, 16777215, var4 - -var2);
          if (param0 == 45) {
            break L5;
          } else {
            this.field_w = -41;
            break L5;
          }
        }
        L6: {
          kn.a(w.field_kb, (byte) -39, 105, om.field_c, 16777215, var2 + var5);
          kn.a(w.field_kb, (byte) -39, 105, hd.field_o, 16777215, var6 - -var2);
          kn.a(w.field_kb, (byte) -39, 105, vd.field_r, 16777215, var2 + var7);
          kn.a(w.field_kb, (byte) -39, 105, sh.field_h, 16777215, 545 - -var2);
          var8 = -1;
          var9 = hf.field_g;
          if (this.field_a == null) {
            break L6;
          } else {
            if (this.field_a.field_A) {
              if (this.field_a.field_x == null) {
                var9 = dn.field_s;
                break L6;
              } else {
                var10_ref_String__ = this.field_a.field_x[cj.field_c];
                var11_ref_int__ = this.field_a.field_u[cj.field_c];
                var12 = 0;
                L7: while (true) {
                  if (var12 >= 10) {
                    if (var8 >= 0) {
                      break L6;
                    } else {
                      var12 = 16777215;
                      this.a(se.field_S, var12, this.field_a.field_w, this.field_a.field_p, -5328, 330, this.field_a.field_o, oa.field_f, this.field_a.field_t, var2);
                      break L6;
                    }
                  } else {
                    if (var10_ref_String__[var12] != null) {
                      L8: {
                        var9 = null;
                        var13 = 16769088;
                        if (k.a(var10_ref_String__[var12], true)) {
                          var8 = var12;
                          var13 = 16777215;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      this.a(se.field_S, var13, var11_ref_int__[4 * var12 + 2], var11_ref_int__[4 * var12 - -3], param0 + -5373, 130 - -(20 * var12), var11_ref_int__[1 + 4 * var12], var10_ref_String__[var12], var11_ref_int__[4 * var12], var2);
                      var12++;
                      continue L7;
                    } else {
                      var12++;
                      continue L7;
                    }
                  }
                }
              }
            } else {
              var9 = wm.field_k;
              break L6;
            }
          }
        }
        var10 = 0;
        L9: while (true) {
          if (10 <= var10) {
            L10: {
              if (var9 != null) {
                ed.a(16777215, 320 + var2, var9, 220, (byte) 75, w.field_kb);
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (!ph.n(-30146)) {
                break L11;
              } else {
                ed.a(16777215, var2 + 320, lf.field_d, 330, (byte) 75, se.field_S);
                break L11;
              }
            }
            return;
          } else {
            var11 = 16777215;
            kn.a(w.field_kb, (byte) -39, 130 + var10 * 20, var10 + 1 + ".", var11, var2 + 115);
            var10++;
            continue L9;
          }
        }
    }

    private final void m(int param0) {
        if (param0 != -11063) {
            this.a(false, 73);
        }
        if (0 < this.field_t) {
            this.field_t = this.field_t - 1;
            nm.f(-65);
            ac.f((byte) -76);
        }
    }

    private final boolean b(int param0, boolean param1) {
        this.h(94);
        int var3 = param0;
        if (!(this.field_b.field_h < 0)) {
            var3 = this.field_f[this.field_b.field_h].field_d;
        }
        if (20 == var3) {
            if (!(!this.field_b.b((byte) 114))) {
                og.a(false, 4, true);
                nm.f(param0 + 37);
                return true;
            }
        }
        if (var3 == 21) {
            if (this.field_b.b((byte) 114)) {
                s.b(true);
                ba.field_c = false;
                qi.a(param1, (byte) -104);
                nm.f(param0 ^ -126);
                return true;
            }
        }
        return false;
    }

    final void a(boolean param0) {
        if (param0) {
            ke.e((byte) -98);
        }
        this.a(true, 15764);
        int var2 = -(this.field_o * this.field_o * 640 / 400) + (640 - (this.field_u >> 2));
        wk.field_l.c(320 + -(wk.field_l.field_I / 2), -(var2 >> 2) + 20);
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ec var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = client.field_A ? 1 : 0;
        var7 = -41 % ((-31 - param3) / 62);
        var6 = 0;
        var8 = 0;
        L0: while (true) {
          if (this.field_b.field_l <= var8) {
            var8 = 0;
            L1: while (true) {
              if (this.field_b.field_l <= var8) {
                return;
              } else {
                this.field_f[var8].field_n = var6;
                this.field_f[var8].field_l = param1 + -(var6 / 2);
                var8++;
                continue L1;
              }
            }
          } else {
            L2: {
              L3: {
                var9 = this.field_f[var8];
                var10 = var9.field_n;
                if (6 == var9.field_d) {
                  break L3;
                } else {
                  if (7 == var9.field_d) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              var10 += 133;
              break L2;
            }
            L4: {
              var9.field_m = var8 * param4 + param0;
              if (var6 < var10) {
                var6 = var10;
                break L4;
              } else {
                break L4;
              }
            }
            if (param2) {
              L5: {
                if (var8 <= 0) {
                  break L5;
                } else {
                  var9.field_r = var9.field_r - 3;
                  var9.field_m = var9.field_m + 3;
                  break L5;
                }
              }
              if (~var8 > ~(-1 + this.field_b.field_l)) {
                var9.field_r = var9.field_r - 3;
                var8++;
                continue L0;
              } else {
                var8++;
                continue L0;
              }
            } else {
              var8++;
              continue L0;
            }
          }
        }
    }

    final void k(byte param0) {
        this.field_u = this.field_u + this.field_c / 2;
        this.field_c = 7 * this.field_c / 8;
        this.field_c = this.field_c - this.field_u;
        if (param0 <= 107) {
            ke.a(103, -21, -87, 6, (byte) -30);
        }
    }

    final void d(int param0) {
        boolean discarded$1 = false;
        int var3 = 0;
        var3 = client.field_A ? 1 : 0;
        h.a((ke) (this), (byte) 95);
        L0: while (true) {
          if (!ab.c((byte) -18)) {
            L1: {
              if (param0 == -8622) {
                break L1;
              } else {
                this.field_w = 87;
                break L1;
              }
            }
            this.field_b.a(this.a(400, bh.field_g, pm.field_f), -20563, this.a(400, he.field_S, nf.field_h));
            discarded$1 = this.a(-14845, true);
            return;
          } else {
            if (wh.field_c != 13) {
              L2: {
                if (ph.n(-30146)) {
                  this.field_b.a(-31);
                  break L2;
                } else {
                  L3: {
                    this.field_b.d(param0 ^ -8622);
                    if (wh.field_c == 96) {
                      cj.field_c = (cj.field_c + 1) % 2;
                      this.field_b.a(cj.field_c, (byte) -91);
                      nm.f(126);
                      this.field_b.field_o = false;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (wh.field_c != 97) {
                      break L4;
                    } else {
                      cj.field_c = (cj.field_c + 1) % 2;
                      this.field_b.a(cj.field_c, (byte) -113);
                      nm.f(param0 + 8601);
                      this.field_b.field_o = false;
                      break L4;
                    }
                  }
                  L5: {
                    if (wh.field_c == 98) {
                      if (this.field_b.field_h == 2) {
                        this.field_b.a(cj.field_c, (byte) -69);
                        break L5;
                      } else {
                        this.field_b.a(2, (byte) -98);
                        break L5;
                      }
                    } else {
                      break L5;
                    }
                  }
                  if (wh.field_c == 99) {
                    L6: {
                      if (this.field_b.field_h < 0) {
                        break L6;
                      } else {
                        if (2 > this.field_b.field_h) {
                          this.field_b.a(2, (byte) -109);
                          break L2;
                        } else {
                          break L6;
                        }
                      }
                    }
                    this.field_b.a(cj.field_c, (byte) -101);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              if (this.a(-14845, false)) {
                return;
              } else {
                continue L0;
              }
            } else {
              nm.f(param0 + 8749);
              ve.field_Hc = false;
              qi.a(false, (byte) -112);
              return;
            }
          }
        }
    }

    private final void e(int param0) {
        int var5 = 0;
        int var6 = 0;
        ec var7 = null;
        String var8 = null;
        int discarded$0 = 0;
        int var9 = client.field_A ? 1 : 0;
        int var2 = -(this.field_u >> 2) + (640 + -(640 * (this.field_o * this.field_o) / 400));
        int var3 = this.field_t <= 0 ? 1 : 0;
        int var4 = 3 <= this.field_t ? this.field_b.field_l + -1 : this.field_b.field_l;
        for (var5 = var3; var5 < var4; var5++) {
            vk.a(this.field_f[var5].field_r, (byte) 50, on.field_e, this.field_f[var5].field_n, this.field_f[var5].field_m, this.field_f[var5].field_l + var2);
            var6 = 16687906;
            if (var5 == this.field_b.field_h) {
                var6 = 16777215;
            }
            var7 = this.field_f[var5];
            var8 = var7.field_o;
            discarded$0 = ga.a(var7.field_n, 1, var7.field_m, var8, 1, var7.field_r, var6, a.field_t, (byte) -125, 1, var2 + var7.field_l);
        }
    }

    private final boolean c(boolean param0, int param1) {
        int var3 = 0;
        L0: {
          this.h(118);
          var3 = -1;
          if (this.field_b.field_h < 0) {
            break L0;
          } else {
            var3 = this.field_f[this.field_b.field_h].field_d;
            break L0;
          }
        }
        L1: {
          if (20 != var3) {
            break L1;
          } else {
            if (!this.field_b.b((byte) 114)) {
              break L1;
            } else {
              og.a(false, 5, true);
              nm.f(-72);
              return true;
            }
          }
        }
        L2: {
          L3: {
            if (var3 == 19) {
              break L3;
            } else {
              if (var3 == 10) {
                break L3;
              } else {
                if (3 == var3) {
                  break L3;
                } else {
                  if (13 == var3) {
                    break L3;
                  } else {
                    if (param0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
            }
          }
          if (this.field_b.b((byte) 114)) {
            L4: {
              if (var3 != 13) {
                break L4;
              } else {
                he.field_db = false;
                break L4;
              }
            }
            L5: {
              L6: {
                lk.field_F = false;
                if (var3 == 3) {
                  break L6;
                } else {
                  if (13 == var3) {
                    break L6;
                  } else {
                    break L5;
                  }
                }
              }
              fm.field_e = false;
              mg.field_Zb = false;
              break L5;
            }
            qi.a(param0, (byte) -102);
            nm.f(115);
            return true;
          } else {
            break L2;
          }
        }
        L7: {
          if (param1 >= 119) {
            break L7;
          } else {
            this.b((byte) -109);
            break L7;
          }
        }
        return false;
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        uf var1_ref = null;
        int var2 = 0;
        tj var3_ref_tj = null;
        long var3 = 0L;
        int var3_int = 0;
        ve var3_ref_ve = null;
        ve var4_ref_ve = null;
        int var4 = 0;
        String var5 = null;
        int var5_int = 0;
        ve var5_ref = null;
        tj var5_ref2 = null;
        String var6 = null;
        tj var6_ref = null;
        ve var6_ref2 = null;
        String var7 = null;
        tj var7_ref = null;
        tj var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        tj stackIn_104_0 = null;
        tj stackIn_105_0 = null;
        tj stackIn_106_0 = null;
        int stackIn_106_1 = 0;
        int stackIn_134_0 = 0;
        tj stackIn_140_0 = null;
        tj stackIn_141_0 = null;
        tj stackIn_142_0 = null;
        int stackIn_142_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_133_0 = 0;
        int stackOut_132_0 = 0;
        tj stackOut_139_0 = null;
        tj stackOut_141_0 = null;
        int stackOut_141_1 = 0;
        tj stackOut_140_0 = null;
        int stackOut_140_1 = 0;
        tj stackOut_103_0 = null;
        tj stackOut_105_0 = null;
        int stackOut_105_1 = 0;
        tj stackOut_104_0 = null;
        int stackOut_104_1 = 0;
        var11 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var1_ref = de.field_V;
                var2 = ((wl) ((Object) var1_ref)).d((byte) -114);
                if (var2 == 0) {
                  break L2;
                } else {
                  if (var2 == 1) {
                    break L2;
                  } else {
                    if (var2 == 2) {
                      break L2;
                    } else {
                      if (var2 == 3) {
                        break L2;
                      } else {
                        if (var2 != 4) {
                          if (var2 == 5) {
                            L3: {
                              var3 = ((wl) ((Object) var1_ref)).f((byte) -108);
                              var5 = ((wl) ((Object) var1_ref)).c((byte) -38);
                              var6 = ((wl) ((Object) var1_ref)).c((byte) -38);
                              var7 = ((wl) ((Object) var1_ref)).c((byte) -38);
                              var8 = ma.a(-102, var3);
                              if (var6.equals("")) {
                                stackOut_133_0 = 0;
                                stackIn_134_0 = stackOut_133_0;
                                break L3;
                              } else {
                                stackOut_132_0 = 1;
                                stackIn_134_0 = stackOut_132_0;
                                break L3;
                              }
                            }
                            L4: {
                              var9 = stackIn_134_0;
                              if (var8 != null) {
                                if (var9 != 0) {
                                  var8.a((byte) 19, var7, var5);
                                  break L4;
                                } else {
                                  break L4;
                                }
                              } else {
                                var8 = new tj(var5, var7, var3);
                                ob.field_i.a(var8, -1, var3);
                                break L4;
                              }
                            }
                            L5: {
                              var8.field_Nb = ik.a(4) - (long)((wl) ((Object) var1_ref)).i(7553);
                              var8.field_Ub = ((wl) ((Object) var1_ref)).e(3);
                              var10 = ((wl) ((Object) var1_ref)).a(-28);
                              stackOut_139_0 = (tj) (var8);
                              stackIn_141_0 = stackOut_139_0;
                              stackIn_140_0 = stackOut_139_0;
                              if ((var10 & 1) == 0) {
                                stackOut_141_0 = (tj) ((Object) stackIn_141_0);
                                stackOut_141_1 = 0;
                                stackIn_142_0 = stackOut_141_0;
                                stackIn_142_1 = stackOut_141_1;
                                break L5;
                              } else {
                                stackOut_140_0 = (tj) ((Object) stackIn_140_0);
                                stackOut_140_1 = 1;
                                stackIn_142_0 = stackOut_140_0;
                                stackIn_142_1 = stackOut_140_1;
                                break L5;
                              }
                            }
                            stackIn_142_0.field_ec = stackIn_142_1 != 0;
                            var8.field_Xb = var10 >> 1;
                            var8.field_dc = ((wl) ((Object) var1_ref)).d((byte) -98);
                            var8.field_Sb = ((wl) ((Object) var1_ref)).d((byte) -128);
                            wk.a((byte) 112, var8);
                            break L1;
                          } else {
                            if (var2 == 6) {
                              var3 = ((wl) ((Object) var1_ref)).f((byte) -108);
                              var5_int = ((wl) ((Object) var1_ref)).d((byte) -89);
                              var6_ref = ma.a(-122, var3);
                              if (var6_ref != null) {
                                L6: {
                                  if (!var6_ref.field_fc) {
                                    break L6;
                                  } else {
                                    var6_ref.field_fc = false;
                                    cj.field_a = cj.field_a - 1;
                                    break L6;
                                  }
                                }
                                L7: {
                                  if (var5_int == 0) {
                                    var6_ref.b((byte) 114);
                                    break L7;
                                  } else {
                                    var6_ref.field_hc = var5_int;
                                    var6_ref.field_Qb = oa.field_a;
                                    break L7;
                                  }
                                }
                                var6_ref.e((byte) 95);
                                break L1;
                              } else {
                                break L1;
                              }
                            } else {
                              if (var2 == 7) {
                                var3_ref_tj = (tj) ((Object) i.field_b.c((byte) 43));
                                L8: while (true) {
                                  if (var3_ref_tj == null) {
                                    cj.field_a = 0;
                                    break L1;
                                  } else {
                                    var3_ref_tj.b((byte) 108);
                                    var3_ref_tj.e((byte) 112);
                                    var3_ref_tj = (tj) ((Object) i.field_b.d(true));
                                    continue L8;
                                  }
                                }
                              } else {
                                if (8 != var2) {
                                  if (var2 != 9) {
                                    if (var2 == 10) {
                                      var3_ref_ve = (ve) ((Object) h.field_b.c((byte) 121));
                                      L9: while (true) {
                                        if (var3_ref_ve == null) {
                                          break L1;
                                        } else {
                                          var3_ref_ve.b((byte) 115);
                                          var3_ref_ve.e((byte) 118);
                                          var3_ref_ve = (ve) ((Object) h.field_b.d(true));
                                          continue L9;
                                        }
                                      }
                                    } else {
                                      L10: {
                                        if (var2 == 11) {
                                          break L10;
                                        } else {
                                          if (12 != var2) {
                                            if (var2 != 13) {
                                              L11: {
                                                if (var2 == 14) {
                                                  break L11;
                                                } else {
                                                  if (var2 != 16) {
                                                    L12: {
                                                      if (var2 == 15) {
                                                        break L12;
                                                      } else {
                                                        if (var2 == 17) {
                                                          break L12;
                                                        } else {
                                                          if (18 == var2) {
                                                            L13: {
                                                              var3 = ((wl) ((Object) var1_ref)).f((byte) -108);
                                                              var5 = ((wl) ((Object) var1_ref)).c((byte) -38);
                                                              var6 = ((wl) ((Object) var1_ref)).c((byte) -38);
                                                              var7_ref = bj.a(var3, (byte) 63);
                                                              if (var7_ref != null) {
                                                                break L13;
                                                              } else {
                                                                var7_ref = new tj(var5, var6, var3);
                                                                hn.field_h.a(var7_ref, -1, var3);
                                                                cd.field_m.field_rc = cd.field_m.field_rc + 1;
                                                                break L13;
                                                              }
                                                            }
                                                            L14: {
                                                              var7_ref.field_Ub = ((wl) ((Object) var1_ref)).e(3);
                                                              var8_int = ((wl) ((Object) var1_ref)).a(-69);
                                                              var7_ref.field_Xb = var8_int >> 1;
                                                              stackOut_103_0 = (tj) (var7_ref);
                                                              stackIn_105_0 = stackOut_103_0;
                                                              stackIn_104_0 = stackOut_103_0;
                                                              if ((1 & var8_int) == 0) {
                                                                stackOut_105_0 = (tj) ((Object) stackIn_105_0);
                                                                stackOut_105_1 = 0;
                                                                stackIn_106_0 = stackOut_105_0;
                                                                stackIn_106_1 = stackOut_105_1;
                                                                break L14;
                                                              } else {
                                                                stackOut_104_0 = (tj) ((Object) stackIn_104_0);
                                                                stackOut_104_1 = 1;
                                                                stackIn_106_0 = stackOut_104_0;
                                                                stackIn_106_1 = stackOut_104_1;
                                                                break L14;
                                                              }
                                                            }
                                                            stackIn_106_0.field_ec = stackIn_106_1 != 0;
                                                            var7_ref.field_dc = ((wl) ((Object) var1_ref)).d((byte) -29);
                                                            var7_ref.field_Sb = ((wl) ((Object) var1_ref)).d((byte) -79);
                                                            oc.field_b.a(var7_ref, 2777);
                                                            break L1;
                                                          } else {
                                                            if (19 == var2) {
                                                              var3 = ((wl) ((Object) var1_ref)).f((byte) -108);
                                                              var5_int = ((wl) ((Object) var1_ref)).d((byte) -41);
                                                              var6_ref = bj.a(var3, (byte) 79);
                                                              if (var6_ref != null) {
                                                                L15: {
                                                                  if (var5_int == 0) {
                                                                    var6_ref.b((byte) 105);
                                                                    break L15;
                                                                  } else {
                                                                    var6_ref.field_hc = var5_int;
                                                                    var6_ref.field_Qb = oa.field_a;
                                                                    break L15;
                                                                  }
                                                                }
                                                                var6_ref.e((byte) 84);
                                                                cd.field_m.field_rc = cd.field_m.field_rc - 1;
                                                                break L1;
                                                              } else {
                                                                break L1;
                                                              }
                                                            } else {
                                                              if (20 != var2) {
                                                                if (21 == var2) {
                                                                  var3_int = ((wl) ((Object) var1_ref)).e(3);
                                                                  if (var3_int != 0) {
                                                                    km.field_C = ik.a(4) + (long)var3_int;
                                                                    break L1;
                                                                  } else {
                                                                    km.field_C = 0L;
                                                                    break L1;
                                                                  }
                                                                } else {
                                                                  if (22 != var2) {
                                                                    if (23 != var2) {
                                                                      qb.a((Throwable) null, 16408, "L1: " + qk.d((byte) 49));
                                                                      si.a(117);
                                                                      break L1;
                                                                    } else {
                                                                      uc.field_g = ((wl) ((Object) var1_ref)).f((byte) -108);
                                                                      break L1;
                                                                    }
                                                                  } else {
                                                                    de.field_R = ((wl) ((Object) var1_ref)).e(3);
                                                                    rf.field_o = ((wl) ((Object) var1_ref)).a(-104);
                                                                    break L1;
                                                                  }
                                                                }
                                                              } else {
                                                                wg.a(false, var1_ref, cd.field_m, (byte) -103);
                                                                break L1;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                    var3 = ((wl) ((Object) var1_ref)).f((byte) -108);
                                                    var5_int = ((wl) ((Object) var1_ref)).d((byte) -87);
                                                    var6_ref = ma.a(-119, var3);
                                                    if (var6_ref == null) {
                                                      break L1;
                                                    } else {
                                                      L16: {
                                                        if (var5_int == 0) {
                                                          break L16;
                                                        } else {
                                                          var6_ref.field_Qb = oa.field_a;
                                                          var6_ref.field_hc = var5_int;
                                                          break L16;
                                                        }
                                                      }
                                                      L17: {
                                                        if (var2 != 15) {
                                                          if (var6_ref.field_fc) {
                                                            cj.field_a = cj.field_a - 1;
                                                            var6_ref.field_fc = false;
                                                            break L17;
                                                          } else {
                                                            break L17;
                                                          }
                                                        } else {
                                                          var6_ref.field_bc = false;
                                                          break L17;
                                                        }
                                                      }
                                                      wk.a((byte) 34, var6_ref);
                                                      break L1;
                                                    }
                                                  } else {
                                                    break L11;
                                                  }
                                                }
                                              }
                                              var3 = ((wl) ((Object) var1_ref)).f((byte) -108);
                                              var5_ref2 = ma.a(-119, var3);
                                              if (var5_ref2 != null) {
                                                L18: {
                                                  if (14 == var2) {
                                                    var5_ref2.field_bc = true;
                                                    break L18;
                                                  } else {
                                                    if (var5_ref2.field_fc) {
                                                      break L18;
                                                    } else {
                                                      var5_ref2.field_fc = true;
                                                      cj.field_a = cj.field_a + 1;
                                                      break L18;
                                                    }
                                                  }
                                                }
                                                wk.a((byte) 57, var5_ref2);
                                                break L1;
                                              } else {
                                                break L1;
                                              }
                                            } else {
                                              var3_int = ((wl) ((Object) var1_ref)).e(3);
                                              var4 = ((wl) ((Object) var1_ref)).d((byte) -49);
                                              var5_ref = (ve) ((Object) tg.field_b.a(24710, (long)var3_int));
                                              if (var5_ref == null) {
                                                break L1;
                                              } else {
                                                L19: {
                                                  var6_ref2 = var5_ref;
                                                  var5_ref.field_Ob = false;
                                                  var6_ref2.field_Zb = false;
                                                  if (0 == var4) {
                                                    break L19;
                                                  } else {
                                                    var5_ref.field_Rb = oa.field_a;
                                                    var5_ref.field_oc = var4;
                                                    break L19;
                                                  }
                                                }
                                                pj.a(var5_ref, (byte) -50);
                                                break L1;
                                              }
                                            }
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                      var3_int = ((wl) ((Object) var1_ref)).e(3);
                                      var4_ref_ve = (ve) ((Object) tg.field_b.a(24710, (long)var3_int));
                                      if (var4_ref_ve != null) {
                                        L20: {
                                          if (var2 != 11) {
                                            var4_ref_ve.field_Ob = true;
                                            break L20;
                                          } else {
                                            var4_ref_ve.field_Zb = true;
                                            break L20;
                                          }
                                        }
                                        pj.a(var4_ref_ve, (byte) -50);
                                        break L1;
                                      } else {
                                        break L1;
                                      }
                                    }
                                  } else {
                                    var3_int = ((wl) ((Object) var1_ref)).e(3);
                                    var4 = ((wl) ((Object) var1_ref)).d((byte) -41);
                                    var5_ref = (ve) ((Object) tg.field_b.a(24710, (long)var3_int));
                                    if (var5_ref != null) {
                                      L21: {
                                        if (var4 == 0) {
                                          var5_ref.b((byte) 127);
                                          break L21;
                                        } else {
                                          var5_ref.field_Rb = oa.field_a;
                                          var5_ref.field_oc = var4;
                                          break L21;
                                        }
                                      }
                                      var5_ref.e((byte) 98);
                                      break L1;
                                    } else {
                                      break L1;
                                    }
                                  }
                                } else {
                                  L22: {
                                    var3_int = ((wl) ((Object) var1_ref)).e(3);
                                    var4_ref_ve = (ve) ((Object) tg.field_b.a(24710, (long)var3_int));
                                    if (var4_ref_ve != null) {
                                      break L22;
                                    } else {
                                      var4_ref_ve = new ve(j.field_b);
                                      tg.field_b.a(var4_ref_ve, -1, (long)var3_int);
                                      break L22;
                                    }
                                  }
                                  wg.a(true, var1_ref, var4_ref_ve, (byte) -89);
                                  pj.a(var4_ref_ve, (byte) -50);
                                  break L1;
                                }
                              }
                            }
                          }
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              var3_ref_tj = (tj) ((Object) oc.field_b.c((byte) 117));
              L23: while (true) {
                if (var3_ref_tj == null) {
                  var3_ref_tj = (tj) ((Object) ob.field_i.c(-9443));
                  L24: while (true) {
                    if (var3_ref_tj == null) {
                      L25: {
                        if (var2 != 1) {
                          break L25;
                        } else {
                          if (cd.field_m != null) {
                            ub.field_c = cd.field_m.field_Vb;
                            break L25;
                          } else {
                            break L25;
                          }
                        }
                      }
                      L26: {
                        if (4 == var2) {
                          var3_int = ((wl) ((Object) var1_ref)).e(3);
                          cd.field_m = new ve(j.field_b);
                          cd.field_m.a((long)var3_int, (byte) 111);
                          wg.a(false, var1_ref, cd.field_m, (byte) -49);
                          km.field_C = 0L;
                          break L26;
                        } else {
                          cd.field_m = null;
                          break L26;
                        }
                      }
                      L27: {
                        L28: {
                          if (2 == var2) {
                            break L28;
                          } else {
                            if (3 == var2) {
                              break L28;
                            } else {
                              g.field_N = null;
                              break L27;
                            }
                          }
                        }
                        if (g.field_N == null) {
                          g.field_N = new ve(j.field_b);
                          break L27;
                        } else {
                          break L27;
                        }
                      }
                      if (var2 == 3) {
                        fj.field_h = true;
                        var3_int = 0;
                        L29: while (true) {
                          if (kk.field_l.length <= var3_int) {
                            qa.field_x = ((wl) ((Object) var1_ref)).d((byte) -95);
                            jb.field_c = ((wl) ((Object) var1_ref)).d((byte) -128);
                            var3_int = 0;
                            L30: while (true) {
                              if (~v.field_a.length >= ~var3_int) {
                                break L1;
                              } else {
                                v.field_a[var3_int] = ((wl) ((Object) var1_ref)).g((byte) -119);
                                var3_int++;
                                continue L30;
                              }
                            }
                          } else {
                            kk.field_l[var3_int] = ((wl) ((Object) var1_ref)).g((byte) -101);
                            var3_int++;
                            continue L29;
                          }
                        }
                      } else {
                        fj.field_h = false;
                        break L1;
                      }
                    } else {
                      L31: {
                        L32: {
                          if (var3_ref_tj.field_bc) {
                            break L32;
                          } else {
                            if (!var3_ref_tj.field_fc) {
                              break L31;
                            } else {
                              break L32;
                            }
                          }
                        }
                        L33: {
                          if (var3_ref_tj.field_fc) {
                            var3_ref_tj.field_fc = false;
                            cj.field_a = cj.field_a - 1;
                            break L33;
                          } else {
                            break L33;
                          }
                        }
                        var3_ref_tj.field_bc = false;
                        wk.a((byte) 94, var3_ref_tj);
                        break L31;
                      }
                      var3_ref_tj = (tj) ((Object) ob.field_i.b(-99));
                      continue L24;
                    }
                  }
                } else {
                  var3_ref_tj.b((byte) 110);
                  var3_ref_tj.e((byte) 73);
                  var3_ref_tj = (tj) ((Object) oc.field_b.d(true));
                  continue L23;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1), "ke.EA(" + 113 + ')');
        }
    }

    final static int a(int param0, int param1) {
        return qg.field_b[param1 & 2047];
    }

    final void c(byte param0) {
        if (param0 != -75) {
            this.field_r = true;
        }
        this.a(false, 15764);
        int var2 = 640 + (-(this.field_o * this.field_o * 640 / 400) - (this.field_u >> 2));
        ed.a(16777215, var2 + 320, si.field_g, 120, (byte) 75, w.field_kb);
        ed.a(16777215, var2 + 320, gf.a(-125, this.field_s, this.field_j, this.field_r), 140, (byte) 75, w.field_kb);
        ed.a(16777215, 320 + var2, ri.a(param0 ^ -75, this.field_s, this.field_j, this.field_r), 240, (byte) 75, w.field_kb);
        ed.a(16777215, var2 + 320, kk.a(this.field_j, this.field_s, this.field_r, true), 300, (byte) 75, w.field_kb);
    }

    final void i(int param0) {
        int var2 = 0;
        ck var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String var6 = null;
        int var7 = 0;
        String[] var8_ref_String__ = null;
        int var8 = 0;
        int[] var9_ref_int__ = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        L0: {
          var15 = client.field_A ? 1 : 0;
          var2 = -(this.field_u >> 2) + (-(640 * this.field_o * this.field_o / 400) + 640);
          this.a(false, 15764);
          var3 = wh.field_f;
          var3.c(-(var3.field_K / 2) + 320, 45 + (-(var3.field_C / 2) - (var2 >> 2)));
          if (null != this.field_e) {
            break L0;
          } else {
            if (!ph.n(-30146)) {
              this.field_e = am.a(3, false, 1, 1, 10);
              break L0;
            } else {
              break L0;
            }
          }
        }
        var4 = -44 / ((63 - param0) / 44);
        var5 = bf.a((byte) 107, gh.field_e, fc.field_e, this.field_e);
        fl.a(105, 256, 16777215, vm.field_x, 125 - -var2, w.field_kb);
        kn.a(w.field_kb, (byte) -39, 105, ng.field_g, 16777215, var2 + 400);
        kn.a(w.field_kb, (byte) -39, 105, sl.field_b, 16777215, 545 + var2);
        var6_int = 0;
        L1: while (true) {
          if (var6_int >= 10) {
            L2: {
              var6 = le.field_r;
              var7 = 1;
              if (null == this.field_e) {
                break L2;
              } else {
                if (this.field_e.field_p) {
                  L3: {
                    if (null != this.field_e.field_r) {
                      var8_ref_String__ = this.field_e.field_r[fc.field_e];
                      var9_ref_int__ = this.field_e.field_u[fc.field_e];
                      var10 = 0;
                      L4: while (true) {
                        if (10 <= var10) {
                          break L3;
                        } else {
                          if (null != var8_ref_String__[var10]) {
                            L5: {
                              var6 = null;
                              var11 = 16769088;
                              var12 = var9_ref_int__[var10];
                              var13 = var12 >>> 8;
                              if (~var5 == ~var10) {
                                var11 = 16777215;
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            var14 = 1 + var12 % 256;
                            fl.a(130 + 20 * var10, 256, var11, var8_ref_String__[var10], 125 - -var2, se.field_S);
                            kn.a(se.field_S, (byte) -39, 20 * var10 + 130, Integer.toString(var14), var11, var2 + 400);
                            kn.a(se.field_S, (byte) -39, var10 * 20 + 130, Integer.toString(var13), var11, var2 + 545);
                            var10++;
                            continue L4;
                          } else {
                            var10++;
                            continue L4;
                          }
                        }
                      }
                    } else {
                      var6 = dn.field_s;
                      break L3;
                    }
                  }
                  if (var5 >= 0) {
                    break L2;
                  } else {
                    if (null == gh.field_e) {
                      break L2;
                    } else {
                      if (gh.field_e.field_x != 1) {
                        break L2;
                      } else {
                        fl.a(330, 256, 16777215, oa.field_f, var2 + 125, se.field_S);
                        var8 = gh.field_e.field_s[0];
                        var9 = var8 % 256 + 1;
                        kn.a(se.field_S, (byte) -39, 330, Integer.toString(var9), 16777215, 400 + var2);
                        var10 = var8 >>> 8;
                        var7 = 0;
                        kn.a(se.field_S, (byte) -39, 330, Integer.toString(var10), 16777215, var2 + 545);
                        break L2;
                      }
                    }
                  }
                } else {
                  var6 = wm.field_k;
                  break L2;
                }
              }
            }
            L6: {
              if (var6 != null) {
                ed.a(16777215, 320 - -var2, var6, 220, (byte) 75, w.field_kb);
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (!ph.n(-30146)) {
                if (var7 != 0) {
                  ed.a(16777215, var2 + 320, af.field_e, 330, (byte) 75, se.field_S);
                  break L7;
                } else {
                  break L7;
                }
              } else {
                ed.a(16777215, 320 + var2, lf.field_d, 330, (byte) 75, se.field_S);
                break L7;
              }
            }
            return;
          } else {
            var7 = 16777215;
            kn.a(w.field_kb, (byte) -39, 130 + var6_int * 20, 1 + var6_int + ".", var7, var2 + 115);
            var6_int++;
            continue L1;
          }
        }
    }

    final void i(byte param0) {
        if (param0 != 39) {
            return;
        }
        this.field_b.a(-115);
        boolean discarded$0 = this.p(-1);
    }

    private final void a(boolean param0, int param1) {
        int discarded$2 = 0;
        int discarded$3 = 0;
        int var3 = 0;
        int var4 = 0;
        ec var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        qc var10_ref_qc = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        qc stackIn_27_0 = null;
        int stackIn_61_0 = 0;
        int stackIn_64_0 = 0;
        qc stackOut_26_0 = null;
        qc stackOut_25_0 = null;
        int stackOut_60_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_62_0 = 0;
        L0: {
          var15 = client.field_A ? 1 : 0;
          var3 = -(this.field_u >> 2) + (640 - this.field_o * (this.field_o * 640) / 400);
          hk.a(4 + this.field_w - -var3, this.field_z - -4, this.field_y - 8, -8 + this.field_q, 0, 150);
          vk.a(this.field_q, (byte) 50, a.field_n, this.field_y, this.field_z, this.field_w + var3);
          if (param1 == 15764) {
            break L0;
          } else {
            this.field_r = false;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (~var4 <= ~this.field_b.field_l) {
            hk.d();
            return;
          } else {
            L2: {
              var5 = this.field_f[var4];
              var6 = var5.field_o;
              var7 = var5.field_m;
              var8 = var5.field_r;
              if (param0) {
                L3: {
                  var9 = var7;
                  var10 = var8;
                  if (var4 <= 0) {
                    break L3;
                  } else {
                    var7 -= 3;
                    var8 += 3;
                    break L3;
                  }
                }
                L4: {
                  if (this.field_b.field_l - 1 > var4) {
                    var8 += 3;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                hk.b(0, var9, 640, var10 + var9);
                break L2;
              } else {
                break L2;
              }
            }
            L5: {
              var9 = 16694016;
              if (~var4 != ~this.field_b.field_h) {
                vk.a(var8, (byte) 50, on.field_e, var5.field_n, var7, var3 + var5.field_l);
                break L5;
              } else {
                var9 = 16777215;
                vk.a(var8, (byte) 50, im.field_i, var5.field_n, var7, var3 + var5.field_l);
                break L5;
              }
            }
            L6: {
              if (var5.field_d == 15) {
                if ((kf.field_I.field_g.field_d & 1 << kf.field_I.field_P) != 0) {
                  var6 = e.field_a;
                  break L6;
                } else {
                  if (kf.field_I.field_g.field_d == 0) {
                    var6 = kf.field_R;
                    break L6;
                  } else {
                    var6 = pg.field_c;
                    if ((uf.field_A & 16) != 0) {
                      break L6;
                    } else {
                      var9 = 16777215;
                      break L6;
                    }
                  }
                }
              } else {
                break L6;
              }
            }
            L7: {
              if (var5.field_d != 17) {
                break L7;
              } else {
                L8: {
                  if (kf.field_I == null) {
                    stackOut_26_0 = ce.field_C;
                    stackIn_27_0 = stackOut_26_0;
                    break L8;
                  } else {
                    stackOut_25_0 = kf.field_I;
                    stackIn_27_0 = stackOut_25_0;
                    break L8;
                  }
                }
                var10_ref_qc = stackIn_27_0;
                if (var10_ref_qc.field_W) {
                  if ((var10_ref_qc.field_g.field_a & 1 << var10_ref_qc.field_P) == 0) {
                    if (var10_ref_qc.field_g.field_a == 0) {
                      if ((1 << var10_ref_qc.field_g.field_b) - 1 == (1 << var10_ref_qc.field_P | var10_ref_qc.field_yb)) {
                        var6 = di.field_E;
                        break L7;
                      } else {
                        var6 = ik.field_g;
                        break L7;
                      }
                    } else {
                      var6 = wj.field_Kb;
                      if (0 != (uf.field_A & 16)) {
                        break L7;
                      } else {
                        var9 = 16777215;
                        break L7;
                      }
                    }
                  } else {
                    var6 = rc.field_g;
                    break L7;
                  }
                } else {
                  if (0 == (1 << var10_ref_qc.field_P & var10_ref_qc.field_g.field_a)) {
                    if (var10_ref_qc.field_g.field_a == 0) {
                      if (~((1 << var10_ref_qc.field_g.field_b) + -1) != ~(var10_ref_qc.field_yb | 1 << var10_ref_qc.field_P)) {
                        var6 = ji.field_c;
                        break L7;
                      } else {
                        var6 = ig.field_Xb;
                        break L7;
                      }
                    } else {
                      L9: {
                        if ((uf.field_A & 16) == 0) {
                          var9 = 16777215;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      var6 = k.field_h;
                      break L7;
                    }
                  } else {
                    var6 = sc.field_h;
                    break L7;
                  }
                }
              }
            }
            L10: {
              L11: {
                if (var5.field_d == 6) {
                  break L11;
                } else {
                  if (var5.field_d == 7) {
                    break L11;
                  } else {
                    L12: {
                      if (var5.field_d != 22) {
                        break L12;
                      } else {
                        if (~var4 != ~fc.field_e) {
                          break L12;
                        } else {
                          var9 = 16777215;
                          break L12;
                        }
                      }
                    }
                    L13: {
                      if (var5.field_d != 23) {
                        break L13;
                      } else {
                        if (var4 != cj.field_c) {
                          break L13;
                        } else {
                          var9 = 16777215;
                          break L13;
                        }
                      }
                    }
                    discarded$2 = ga.a(var5.field_n, 1, var7, var6, 20, var8, var9, a.field_t, (byte) -128, 1, var5.field_l - -var3);
                    break L10;
                  }
                }
              }
              L14: {
                var10 = a.field_t.a(pm.field_c);
                var11 = a.field_t.a(fj.field_f);
                if (var11 > var10) {
                  var10 = var11;
                  break L14;
                } else {
                  break L14;
                }
              }
              L15: {
                var12 = (var10 + 5 + (-128 + var5.field_n)) / 2 + var5.field_l;
                hk.a(-1 + var12 + var3, var7 + 11, 130, 8, 65793);
                hk.a(1 + (var12 + var3), 13 + var7, 126, 4, var9);
                if (var5.field_d != 6) {
                  stackOut_60_0 = a.field_g * 128 / 128;
                  stackIn_61_0 = stackOut_60_0;
                  break L15;
                } else {
                  stackOut_59_0 = pb.field_d * 128 / 128;
                  stackIn_61_0 = stackOut_59_0;
                  break L15;
                }
              }
              L16: {
                var13 = stackIn_61_0;
                discarded$3 = ga.a(-5 + var12 - var5.field_l, 1, var7, var6, 20, var8, var9, a.field_t, (byte) -124, 2, var5.field_l - -var3);
                if (var5.field_d == 6) {
                  stackOut_63_0 = 1;
                  stackIn_64_0 = stackOut_63_0;
                  break L16;
                } else {
                  stackOut_62_0 = 3;
                  stackIn_64_0 = stackOut_62_0;
                  break L16;
                }
              }
              var14 = stackIn_64_0;
              tg.a(true, var14).c(var3 + (-9 + var12) - -var13, 6 + var7, 18, 18);
              break L10;
            }
            L17: {
              if (var5.field_d != 2) {
                break L17;
              } else {
                L18: {
                  if (id.field_P < 3) {
                    break L18;
                  } else {
                    if (!h.a(false)) {
                      break L17;
                    } else {
                      break L18;
                    }
                  }
                }
                hk.c(8 + (var3 + var5.field_l), var7 + 3, var5.field_n - 16, 2);
                hk.c(4 + (var3 + var5.field_l), var7 - -5, var5.field_n + -8, -10 + var8);
                hk.c(8 + (var3 + var5.field_l), -5 + (var8 + var7), -16 + var5.field_n, 2);
                break L17;
              }
            }
            var4++;
            continue L1;
          }
        }
    }

    final void c(int param0, boolean param1) {
        this.field_b.a(param1, 117, this.a(400, bh.field_g, pm.field_f));
        if (param0 != -1) {
            this.field_z = -92;
        }
    }

    final void l(byte param0) {
        boolean discarded$1 = false;
        int var2 = 0;
        int var4 = 0;
        var4 = client.field_A ? 1 : 0;
        var2 = 39 / ((47 - param0) / 51);
        h.a((ke) (this), (byte) 95);
        L0: while (true) {
          if (!ab.c((byte) -124)) {
            this.field_b.a(this.a(400, bh.field_g, pm.field_f), -20563, this.a(400, he.field_S, nf.field_h));
            discarded$1 = this.c(true, (byte) -76);
            return;
          } else {
            if (wh.field_c != 13) {
              L1: {
                if (ph.n(-30146)) {
                  this.field_b.a(-113);
                  break L1;
                } else {
                  L2: {
                    this.field_b.d(0);
                    if (wh.field_c != 96) {
                      break L2;
                    } else {
                      fc.field_e = (-1 + (3 + fc.field_e)) % 3;
                      this.field_b.a(fc.field_e, (byte) -113);
                      nm.f(4);
                      this.field_b.field_o = false;
                      break L2;
                    }
                  }
                  L3: {
                    if (wh.field_c != 97) {
                      break L3;
                    } else {
                      fc.field_e = (fc.field_e - -1) % 3;
                      this.field_b.a(fc.field_e, (byte) -75);
                      nm.f(-117);
                      this.field_b.field_o = false;
                      break L3;
                    }
                  }
                  L4: {
                    if (wh.field_c == 98) {
                      if (this.field_b.field_h >= 3) {
                        if (this.field_b.field_h == 3) {
                          this.field_b.a(fc.field_e, (byte) -113);
                          break L4;
                        } else {
                          this.field_b.a(this.field_b.field_h + -1, (byte) -110);
                          break L4;
                        }
                      } else {
                        this.field_b.a(-1 + this.field_b.field_l, (byte) -76);
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  if (wh.field_c == 99) {
                    L5: {
                      if (this.field_b.field_h < 0) {
                        break L5;
                      } else {
                        if (-1 + this.field_b.field_l == this.field_b.field_h) {
                          break L5;
                        } else {
                          if (this.field_b.field_h >= 3) {
                            this.field_b.a(this.field_b.field_h + 1, (byte) -95);
                            break L1;
                          } else {
                            this.field_b.a(3, (byte) -126);
                            break L1;
                          }
                        }
                      }
                    }
                    this.field_b.a(fc.field_e, (byte) -123);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              if (!this.c(false, (byte) -96)) {
                continue L0;
              } else {
                return;
              }
            } else {
              nm.f(-77);
              fm.field_e = false;
              qi.a(false, (byte) -107);
              return;
            }
          }
        }
    }

    final void a(int param0, byte param1) {
        int var3 = 0;
        int var4 = client.field_A ? 1 : 0;
        for (var3 = 0; this.field_b.field_l > var3; var3++) {
            this.field_f[var3].field_m = this.field_f[var3].field_m + param0;
        }
        this.a(false, 15764);
        int var5 = 0;
        var3 = var5;
        if (param1 != -54) {
            this.field_v = (int[]) null;
        }
        while (~this.field_b.field_l < ~var5) {
            this.field_f[var5].field_m = this.field_f[var5].field_m - param0;
            var5++;
        }
    }

    private final boolean c(boolean param0, byte param1) {
        int var3 = 0;
        L0: {
          this.h(123);
          var3 = -1;
          if (this.field_b.field_h >= 0) {
            var3 = this.field_f[this.field_b.field_h].field_d;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (20 != var3) {
            break L1;
          } else {
            if (!this.field_b.b((byte) 114)) {
              break L1;
            } else {
              og.a(false, 8, true);
              nm.f(-11);
              return true;
            }
          }
        }
        L2: {
          L3: {
            if (var3 == 3) {
              break L3;
            } else {
              if (var3 == 13) {
                break L3;
              } else {
                if (param0) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
          }
          if (!this.field_b.b((byte) 114)) {
            break L2;
          } else {
            L4: {
              fm.field_e = false;
              if (var3 == 13) {
                he.field_db = false;
                break L4;
              } else {
                break L4;
              }
            }
            qi.a(param0, (byte) -103);
            nm.f(11);
            return true;
          }
        }
        L5: {
          if (!param0) {
            break L5;
          } else {
            if (ig.field_Yb == 0) {
              break L5;
            } else {
              if (this.field_b.field_h == -1) {
                break L5;
              } else {
                fc.field_e = this.field_b.field_h;
                this.field_b.a(fc.field_e, (byte) -103);
                nm.f(119);
                return true;
              }
            }
          }
        }
        if (param1 <= -41) {
          return false;
        } else {
          field_h = (int[]) null;
          return false;
        }
    }

    private final void a(lm param0, int param1, int param2, int param3, int param4, int param5, int param6, String param7, int param8, int param9) {
        int var11_int = 0;
        RuntimeException var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              var11_int = param6 + (param3 - -param2);
              if (var11_int != 0) {
                param6 = (var11_int + param6 * 200) / (var11_int * 2);
                param3 = (var11_int + param3 * 200) / (2 * var11_int);
                param2 = (var11_int + 200 * param2) / (var11_int * 2);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (kd.field_p != 3) {
                stackOut_5_0 = 310;
                stackIn_6_0 = stackOut_5_0;
                break L2;
              } else {
                stackOut_4_0 = 305;
                stackIn_6_0 = stackOut_4_0;
                break L2;
              }
            }
            L3: {
              var12 = stackIn_6_0;
              if (3 != kd.field_p) {
                stackOut_8_0 = 380;
                stackIn_9_0 = stackOut_8_0;
                break L3;
              } else {
                stackOut_7_0 = 372;
                stackIn_9_0 = stackOut_7_0;
                break L3;
              }
            }
            L4: {
              var13 = stackIn_9_0;
              if (kd.field_p == 3) {
                stackOut_11_0 = 427;
                stackIn_12_0 = stackOut_11_0;
                break L4;
              } else {
                stackOut_10_0 = 435;
                stackIn_12_0 = stackOut_10_0;
                break L4;
              }
            }
            L5: {
              var14 = stackIn_12_0;
              if (3 != kd.field_p) {
                stackOut_14_0 = 490;
                stackIn_15_0 = stackOut_14_0;
                break L5;
              } else {
                stackOut_13_0 = 488;
                stackIn_15_0 = stackOut_13_0;
                break L5;
              }
            }
            L6: {
              var15 = stackIn_15_0;
              fl.a(param5, 256, param1, param7, 125 - -param9, param0);
              kn.a(param0, (byte) -39, param5, Integer.toString(param8), param1, var12 - -param9);
              kn.a(param0, (byte) -39, param5, Integer.toString(var11_int), param1, var13 - -param9);
              kn.a(param0, (byte) -39, param5, param6 + "%", param1, var14 + param9);
              kn.a(param0, (byte) -39, param5, param3 + "%", param1, param9 + var15);
              kn.a(param0, (byte) -39, param5, param2 + "%", param1, param9 + 545);
              if (param4 == -5328) {
                break L6;
              } else {
                this.field_u = 81;
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var11 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var11);
            stackOut_18_1 = new StringBuilder().append("ke.NA(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          L8: {
            stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param7 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param8 + ',' + param9 + ')');
        }
    }

    private final void n(int param0) {
        if (this.field_t < 3) {
            this.field_t = this.field_t + 1;
            nm.f(120);
            ac.f((byte) -87);
        }
        int var2 = 116 % ((param0 - 18) / 61);
    }

    private final boolean p(int param0) {
        this.h(115);
        int var2 = -1;
        if (!(0 > this.field_b.field_h)) {
            var2 = this.field_f[this.field_b.field_h].field_d;
        }
        if (17 == var2) {
            if (!(!this.field_b.b((byte) 114))) {
                kf.field_I.c(76);
                nm.f(-72);
                return true;
            }
        }
        if (var2 == 18) {
            if (this.field_b.b((byte) 114)) {
                if (fm.field_b) {
                    tg.a((byte) -46);
                }
                if (fa.field_n) {
                    ga.a(false, 0, 11);
                }
                nm.f(127);
                return true;
            }
        }
        return false;
    }

    final void j(int param0) {
        int discarded$1 = 0;
        int var2 = 0;
        int var3 = 0;
        var3 = client.field_A ? 1 : 0;
        h.a((ke) (this), (byte) 95);
        L0: while (true) {
          if (!ab.c((byte) 10)) {
            L1: {
              this.field_b.a(this.a(400, bh.field_g, pm.field_f), -20563, this.a(400, he.field_S, nf.field_h));
              var2 = this.c(true, 126) ? 1 : 0;
              if (param0 < -78) {
                break L1;
              } else {
                this.j((byte) -93);
                break L1;
              }
            }
            if (var2 == 0) {
              L2: {
                if (ig.field_Yb != 0) {
                  discarded$1 = this.b(true, (byte) -51);
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            } else {
              return;
            }
          } else {
            if (13 == wh.field_c) {
              nm.f(118);
              lk.field_F = false;
              qi.a(false, (byte) -117);
              return;
            } else {
              this.field_b.a(-36);
              if (this.c(false, 121)) {
                return;
              } else {
                continue L0;
              }
            }
          }
        }
    }

    final void g(byte param0) {
        int var3 = 0;
        var3 = client.field_A ? 1 : 0;
        h.a((ke) (this), (byte) 95);
        L0: while (true) {
          if (!ab.c((byte) -126)) {
            this.field_b.a(this.a(400, bh.field_g, pm.field_f), param0 + -20467, this.a(400, he.field_S, nf.field_h));
            if (!this.b(-1, true)) {
              L1: {
                if (param0 == -96) {
                  break L1;
                } else {
                  field_d = 58;
                  break L1;
                }
              }
              return;
            } else {
              return;
            }
          } else {
            this.field_b.a(-118);
            if (!this.b(-1, false)) {
              continue L0;
            } else {
              return;
            }
          }
        }
    }

    private final boolean d(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = client.field_A ? 1 : 0;
          this.h(111);
          var3 = -1;
          if (this.field_b.field_h < 0) {
            break L0;
          } else {
            var3 = this.field_f[this.field_b.field_h].field_d;
            break L0;
          }
        }
        L1: {
          if (var3 != 1) {
            break L1;
          } else {
            if (!this.field_b.b((byte) 114)) {
              break L1;
            } else {
              nm.f(120);
              pn.a(false, false, true);
              return true;
            }
          }
        }
        L2: {
          if (var3 != 2) {
            break L2;
          } else {
            if (!this.field_b.b((byte) 114)) {
              break L2;
            } else {
              nm.f(40);
              vk.a(param1, (byte) -73);
              return true;
            }
          }
        }
        L3: {
          if (var3 != 3) {
            break L3;
          } else {
            if (!this.field_b.b((byte) 114)) {
              break L3;
            } else {
              nm.f(-80);
              jm.a(0, param1);
              return true;
            }
          }
        }
        L4: {
          if (var3 != 4) {
            break L4;
          } else {
            if (!this.field_b.b((byte) 114)) {
              break L4;
            } else {
              nk.field_k = true;
              f.field_s = ek.a(param1, this.field_p, 640);
              nm.f(7);
              return true;
            }
          }
        }
        L5: {
          if (var3 != 5) {
            break L5;
          } else {
            if (!this.field_b.b((byte) 114)) {
              break L5;
            } else {
              kf.field_I.d((byte) -68);
              cd.a(true);
              nm.f(116);
              return true;
            }
          }
        }
        L6: {
          var4 = -97 / ((param0 - -46) / 55);
          if (var3 != 6) {
            break L6;
          } else {
            L7: {
              if (this.field_b.a(true)) {
                L8: {
                  var5 = a.field_t.a(pm.field_c);
                  var6 = a.field_t.a(fj.field_f);
                  if (~var6 < ~var5) {
                    var5 = var6;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                var7 = (var5 + -128 + (this.field_f[this.field_b.field_h].field_n - -5)) / 2 + this.field_f[this.field_b.field_h].field_l;
                var8 = bh.field_g + -var7;
                var9 = 128 * var8 / 128;
                if (var9 < 0) {
                  var9 = 0;
                  if (pb.field_d == var9) {
                    break L7;
                  } else {
                    pb.field_d = var9;
                    if (uf.field_A + -this.field_x < 5) {
                      break L7;
                    } else {
                      ik.c(106);
                      this.field_x = uf.field_A;
                      break L7;
                    }
                  }
                } else {
                  if (var9 <= 128) {
                    if (pb.field_d != var9) {
                      pb.field_d = var9;
                      if (uf.field_A + -this.field_x < 5) {
                        break L7;
                      } else {
                        ik.c(106);
                        this.field_x = uf.field_A;
                        break L7;
                      }
                    } else {
                      if (pb.field_d == var9) {
                        break L7;
                      } else {
                        pb.field_d = var9;
                        if (uf.field_A + -this.field_x < 5) {
                          break L7;
                        } else {
                          ik.c(106);
                          this.field_x = uf.field_A;
                          break L7;
                        }
                      }
                    }
                  } else {
                    if (pb.field_d != var9) {
                      pb.field_d = var9;
                      if (uf.field_A + -this.field_x < 5) {
                        break L7;
                      } else {
                        ik.c(106);
                        this.field_x = uf.field_A;
                        break L7;
                      }
                    } else {
                      if (pb.field_d == var9) {
                        break L7;
                      } else {
                        pb.field_d = var9;
                        if (uf.field_A + -this.field_x < 5) {
                          break L7;
                        } else {
                          ik.c(106);
                          this.field_x = uf.field_A;
                          break L7;
                        }
                      }
                    }
                  }
                }
              } else {
                if (this.field_b.b((byte) 114)) {
                  ik.c(93);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            L9: {
              if (this.field_b.c(114)) {
                pb.field_d = 0;
                ik.c(64);
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if (this.field_b.a((byte) -51)) {
                pb.field_d = 128;
                ik.c(111);
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (!this.field_b.b(true)) {
                break L11;
              } else {
                if (pb.field_d <= 0) {
                  break L11;
                } else {
                  pb.field_d = -16 & -1 + pb.field_d;
                  ik.c(98);
                  break L11;
                }
              }
            }
            if (!this.field_b.b(-20)) {
              break L6;
            } else {
              if (pb.field_d < 128) {
                pb.field_d = 16 + pb.field_d & -16;
                ik.c(120);
                break L6;
              } else {
                break L6;
              }
            }
          }
        }
        L12: {
          if (7 != var3) {
            break L12;
          } else {
            L13: {
              if (this.field_b.a(true)) {
                L14: {
                  var5 = a.field_t.a(pm.field_c);
                  var6 = a.field_t.a(fj.field_f);
                  if (~var6 < ~var5) {
                    var5 = var6;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                var7 = (var5 + (-128 + this.field_f[this.field_b.field_h].field_n + 5)) / 2 + this.field_f[this.field_b.field_h].field_l;
                var8 = bh.field_g - var7;
                var9 = var8 * 128 / 128;
                sa.field_x = true;
                if (var9 >= 0) {
                  if (var9 <= 128) {
                    a.field_g = var9;
                    break L13;
                  } else {
                    a.field_g = 128;
                    break L13;
                  }
                } else {
                  a.field_g = 0;
                  break L13;
                }
              } else {
                break L13;
              }
            }
            L15: {
              if (this.field_b.c(122)) {
                a.field_g = 0;
                sa.field_x = true;
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              if (this.field_b.a((byte) -51)) {
                sa.field_x = true;
                a.field_g = 128;
                break L16;
              } else {
                break L16;
              }
            }
            L17: {
              if (this.field_b.b(true)) {
                L18: {
                  a.field_g = a.field_g + -1 & -16;
                  if (a.field_g < 0) {
                    a.field_g = 0;
                    break L18;
                  } else {
                    break L18;
                  }
                }
                sa.field_x = true;
                break L17;
              } else {
                break L17;
              }
            }
            if (this.field_b.b(101)) {
              L19: {
                a.field_g = -16 & 16 + a.field_g;
                if (a.field_g <= 128) {
                  break L19;
                } else {
                  a.field_g = 128;
                  break L19;
                }
              }
              sa.field_x = true;
              break L12;
            } else {
              break L12;
            }
          }
        }
        L20: {
          if (var3 != 8) {
            break L20;
          } else {
            if (!this.field_b.b((byte) 114)) {
              break L20;
            } else {
              L21: {
                if (cl.field_v == null) {
                  jk.a(2, param1);
                  break L21;
                } else {
                  sn.a(false);
                  break L21;
                }
              }
              nm.f(119);
              return true;
            }
          }
        }
        L22: {
          if (var3 != 9) {
            break L22;
          } else {
            if (this.field_b.b((byte) 114)) {
              ve.field_Hc = true;
              ca.field_wb = oj.a(param1, 415);
              nm.f(-105);
              return true;
            } else {
              break L22;
            }
          }
        }
        L23: {
          if (var3 != 10) {
            break L23;
          } else {
            if (this.field_b.b((byte) 114)) {
              mg.field_Zb = true;
              cl.field_B = qj.a(-108, param1);
              nm.f(127);
              return true;
            } else {
              break L23;
            }
          }
        }
        L24: {
          if (19 != var3) {
            break L24;
          } else {
            if (this.field_b.b((byte) 114)) {
              fm.field_e = true;
              am.field_a = ib.a((byte) -80, param1);
              nm.f(-14);
              return true;
            } else {
              break L24;
            }
          }
        }
        L25: {
          if (11 != var3) {
            break L25;
          } else {
            if (!this.field_b.b((byte) 114)) {
              break L25;
            } else {
              lk.field_F = true;
              h.field_d = uh.a(o.field_g, param1, 0, -128);
              nm.f(114);
              return true;
            }
          }
        }
        L26: {
          if (12 != var3) {
            break L26;
          } else {
            if (this.field_b.b((byte) 114)) {
              nm.f(-38);
              sn.a(false);
              pk.a((byte) -17, se.h(25144));
              break L26;
            } else {
              break L26;
            }
          }
        }
        L27: {
          if (var3 != 13) {
            break L27;
          } else {
            if (!this.field_b.b((byte) 114)) {
              break L27;
            } else {
              nm.f(13);
              cd.a(true);
              return true;
            }
          }
        }
        L28: {
          if (var3 != 14) {
            break L28;
          } else {
            if (!this.field_b.b((byte) 114)) {
              break L28;
            } else {
              kf.field_I.c((byte) 100);
              am.field_c = false;
              kf.field_G = f.a(false, false, 0, false, kf.field_I.field_wb, 32357, false, false);
              un.a((byte) -30);
              dc.a(param1, 95);
              nm.f(126);
              return true;
            }
          }
        }
        L29: {
          if (var3 != 15) {
            break L29;
          } else {
            if (!this.field_b.b((byte) 114)) {
              break L29;
            } else {
              kf.field_I.b(-62);
              cd.a(true);
              nm.f(124);
              return true;
            }
          }
        }
        L30: {
          if (var3 != 16) {
            break L30;
          } else {
            if (!this.field_b.b((byte) 114)) {
              break L30;
            } else {
              kf.field_I.f(-49);
              cd.a(true);
              nm.f(-19);
              return true;
            }
          }
        }
        L31: {
          if (var3 != 17) {
            break L31;
          } else {
            if (!this.field_b.b((byte) 114)) {
              break L31;
            } else {
              kf.field_I.c(-89);
              cd.a(true);
              nm.f(122);
              return true;
            }
          }
        }
        L32: {
          if (var3 != 18) {
            break L32;
          } else {
            if (!this.field_b.b((byte) 114)) {
              break L32;
            } else {
              L33: {
                if (fm.field_b) {
                  tg.a((byte) -115);
                  break L33;
                } else {
                  break L33;
                }
              }
              L34: {
                if (!fa.field_n) {
                  break L34;
                } else {
                  ga.a(false, 0, 11);
                  break L34;
                }
              }
              cd.a(true);
              nm.f(-42);
              return true;
            }
          }
        }
        return false;
    }

    private final void h(int param0) {
        boolean discarded$0 = false;
        if (param0 < 93) {
            discarded$0 = this.b(68, true);
        }
        if (!(!this.field_b.field_o)) {
            fj.a(32, (byte) -89, pg.field_d);
        }
    }

    final int a(int param0) {
        if (param0 != -1) {
            this.field_q = -13;
        }
        int var2 = -(this.field_u >> 2) + 640 - 640 * this.field_o * this.field_o / 400;
        return var2;
    }

    public static void l(int param0) {
        field_n = null;
        field_h = null;
    }

    final void a(int param0, boolean param1, int param2) {
        this.field_b.a(param0, 0, this.a(400, bh.field_g, pm.field_f), param1);
        if (param2 != -129) {
            this.n(53);
        }
    }

    private final boolean b(boolean param0, int param1) {
        int var3 = 0;
        L0: {
          this.h(95);
          var3 = -1;
          if (this.field_b.field_h < 0) {
            break L0;
          } else {
            var3 = this.field_f[this.field_b.field_h].field_d;
            break L0;
          }
        }
        L1: {
          if (20 != var3) {
            break L1;
          } else {
            if (this.field_b.b((byte) 114)) {
              og.a(false, 6, true);
              return true;
            } else {
              break L1;
            }
          }
        }
        L2: {
          L3: {
            if (var3 == 13) {
              break L3;
            } else {
              if (param0) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          if (!this.field_b.b((byte) 114)) {
            break L2;
          } else {
            mg.field_Zb = false;
            qi.a(param0, (byte) -103);
            nm.f(122);
            return true;
          }
        }
        L4: {
          if (!param0) {
            break L4;
          } else {
            if (ig.field_Yb == 0) {
              break L4;
            } else {
              if (this.field_b.field_h != -1) {
                fc.field_e = this.field_b.field_h;
                this.field_b.a(fc.field_e, (byte) -112);
                nm.f(-33);
                return true;
              } else {
                return false;
              }
            }
          }
        }
        return false;
    }

    ke(int param0) {
        this.field_k = -1;
        this.field_f = new ec[param0];
        this.field_b = new sk();
    }

    static {
        field_n = "Your rating is <%0>";
        field_h = new int[8192];
    }
}
